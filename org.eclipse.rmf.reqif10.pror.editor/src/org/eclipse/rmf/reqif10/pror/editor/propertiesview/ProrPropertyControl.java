/*******************************************************************************
 * Copyright (c) 2011, 2013 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 *     Lukas Ladenberger - ProR GUI     
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor.propertiesview;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.Cell;
import org.agilemore.agilegrid.SWTX;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.editor.propertiesview.ProrPropertyContentProvider.Descriptor;
import org.eclipse.rmf.reqif10.pror.editor.propertiesview.ProrPropertyContentProvider.PropertyRow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MenuAdapter;
import org.eclipse.swt.events.MenuEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;

/**
 * This control wraps an actual AgileGrid that displays the properties of the
 * current selection. It is instantiated twice, once for all and once for those
 * properties relevant to users (via showAllProps).
 * 
 * @author Lukas Ladenberger
 * @author Michael Jastram
 * 
 */
public class ProrPropertyControl extends AgileGrid implements
		PropertyChangeListener {

	protected ProrPropertyContentProvider contentProvider;

	private Object object;

	private AttributeValue removeValue;

	private AdapterFactory adapterFactory;

	public ProrPropertyControl(Composite parent, AdapterFactory adapterFactory,
			boolean showAllProps) {
		super(parent, SWT.V_SCROLL | SWT.H_SCROLL | SWTX.FILL_WITH_LASTCOL
				| SWT.MULTI | SWT.DOUBLE_BUFFERED);
		this.adapterFactory = adapterFactory;
		setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
		this.contentProvider = new ProrPropertyContentProvider(adapterFactory,
				showAllProps);
		super.setContentProvider(this.contentProvider);
		setCellRendererProvider(new ProrPropertyCellRendererProvider(this,
				adapterFactory, contentProvider));
		setLayoutAdvisor(new ProrPropertyLayoutAdvisor(this));
		setCellEditorProvider(new ProrPropertyCellEditorProvider(this,
				adapterFactory,  this.contentProvider));
		setRowResizeCursor(new Cursor(this.getDisplay(), SWT.CURSOR_ARROW));

		// listen to property changes in content
		// Fix of 378041
		contentProvider.addPropertyChangeListener(this);

		configurePopupMenu(parent);
	}
	
	public void setContentProvider(ProrPropertyContentProvider prorPropertyContentProvider){
		this.contentProvider = prorPropertyContentProvider;
		super.setContentProvider(this.contentProvider);
		setCellRendererProvider(new ProrPropertyCellRendererProvider(this,
				adapterFactory, contentProvider));
		setLayoutAdvisor(new ProrPropertyLayoutAdvisor(this));
		setCellEditorProvider(new ProrPropertyCellEditorProvider(this,
				adapterFactory,  this.contentProvider));
		// listen to property changes in content
		// Fix of 378041
		contentProvider.addPropertyChangeListener(this);
	}
	
	
	
	

	/**
	 * Sets up a context menu that allows the value to be removed from
	 * {@link SpecElementWithAttributes}.
	 * 
	 * @param parent
	 */
	private void configurePopupMenu(Composite parent) {

		// Required to set the selection properly, before a context menu pops
		// up.
		addMouseListener(new MouseAdapter() {
			public void mouseDown(MouseEvent e) {
				Cell[] cells = new Cell[] { getCell(e.x, e.y) };
				ProrPropertyControl.this.clearSelection();
				ProrPropertyControl.this.selectCells(cells);
			}
		});

		// The actual menu.
		Menu menu = new Menu(parent);
		final MenuItem item = new MenuItem(menu, SWT.NONE);
		item.setText("Remove Value");
		item.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent e) {
				removeValue();
			}
		});

		// Prepares the menu, before it is shown.
		menu.addMenuListener(new MenuAdapter() {
			public void menuShown(MenuEvent e) {
				item.setEnabled(false);
				removeValue = null;
				Cell[] selection = ProrPropertyControl.this.getCellSelection();
				if (selection.length == 1) {
					PropertyRow row = contentProvider
							.getRowContent(selection[0].row);
					if (row instanceof Descriptor) {
						Descriptor descriptor = (Descriptor) row;
						if (descriptor.isRMFSpecific()) {
							AttributeValue av = descriptor.getAttributeValue();
							if (av != null && av.eContainer() != null) {
								removeValue = av;
								item.setEnabled(true);
							}
						}
					}
				}
			}
		});
		setMenu(menu);
	}

	private void removeValue() {
		EditingDomain editingDomain = AdapterFactoryEditingDomain
				.getEditingDomainFor(removeValue);
		if (editingDomain != null) {
			Command cmd = null;
			if (removeValue.eContainer() instanceof SpecElementWithAttributes) {
				cmd = RemoveCommand
						.create(editingDomain,
								removeValue.eContainer(),
								ReqIF10Package.Literals.SPEC_ELEMENT_WITH_ATTRIBUTES__VALUES,
								removeValue);
			} else if (removeValue.eContainer() instanceof AttributeDefinition) {
				AttributeDefinition ad = (AttributeDefinition) removeValue
						.eContainer();

				cmd = SetCommand.create(editingDomain, ad,
						ReqIF10Util.getDefaultValueFeature(ad), null);
				System.out.println(cmd.canExecute());
			}

			if (cmd != null) {
				editingDomain.getCommandStack().execute(cmd);
				redrawCells(ProrPropertyControl.this.getCellSelection());
			} else {
				System.err.println("Don't know parent: "
						+ removeValue.eContainer());
			}
		}
	}

	public void setSelection(ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection sel = (IStructuredSelection) selection;
			if (sel.size() == 1) {
				Object obj = sel.getFirstElement();
				contentProvider.setContent(obj);
				object = obj;
				redraw();
				return;
			}
		}
		contentProvider.setContent(null);
		redraw();
	}

	// Fix of 378041
	// listen to property changes in content
	// reload Content and redraw on change event
	public void propertyChange(PropertyChangeEvent event) {
		if (isDisposed()) return;
		
		if (event.getPropertyName().equals("")) {
			contentProvider.setContent(object);
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					redraw();
				}
			});
		}
	}

	

}
