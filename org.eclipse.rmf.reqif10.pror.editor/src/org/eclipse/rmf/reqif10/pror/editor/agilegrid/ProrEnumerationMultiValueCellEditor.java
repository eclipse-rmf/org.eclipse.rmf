/*******************************************************************************
 * Copyright (c) 2011, 2013 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor.agilegrid;

import java.util.ArrayList;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.editors.PopupCellEditor;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

public class ProrEnumerationMultiValueCellEditor extends PopupCellEditor {

	private ArrayList<EnumValue> itemList = new ArrayList<EnumValue>();
	private final DatatypeDefinitionEnumeration dde;

	/**
	 * The current contents.
	 */
	private AttributeValueEnumeration attributeValue;
	private final EditingDomain editingDomain;
	private Object parent;
	private Object affectedObject;

	public ProrEnumerationMultiValueCellEditor(AgileGrid agileGrid,
			DatatypeDefinitionEnumeration dde,
			Object parent, Object affectedObject, EditingDomain editingDomain,
			AdapterFactory adapterFactory) {
		super(agileGrid);
		this.dde = dde;
		this.editingDomain = editingDomain;
		this.parent = parent;
		this.affectedObject = affectedObject;
	}

	@Override
	protected Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.BORDER_SOLID);
		GridLayout layout = new GridLayout();
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		layout.horizontalSpacing = 0;
		layout.verticalSpacing = 5;
		composite.setLayout(layout);
		Table table = new Table(composite, SWT.CHECK);
		GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		gd.heightHint = 150;
		table.setLayoutData(gd);
		table.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (e.detail == SWT.CHECK && e.item instanceof TableItem) {
					TableItem item = (TableItem) e.item;
					if (item.getChecked()) {
						itemList.add((EnumValue) item.getData());
					} else {
						itemList.remove((EnumValue) item.getData());
					}
				}
			}
		});

		for (EnumValue enumValue : dde.getSpecifiedValues()) {
			TableItem tableItem = new TableItem(table, SWT.NONE);
			String enumId = enumValue.getLongName() == null ? enumValue.getIdentifier() : enumValue.getLongName();
			tableItem.setText(enumId);
			tableItem.setData(enumValue);
			if (attributeValue.getValues().contains(enumValue)) {
				tableItem.setChecked(true);
				itemList.add(enumValue);
			}
		}

		Composite buttonPanel = new Composite(composite, SWT.NONE);
		buttonPanel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		buttonPanel.setLayout(new FillLayout(SWT.HORIZONTAL));
		Button cancel = new Button(buttonPanel, SWT.PUSH);
		cancel.setImage(PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_TOOL_DELETE));
		cancel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				fireCancelEditor();
			}
		});
		
		Button ok = new Button(buttonPanel, SWT.PUSH);
		ok.setImage(PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_ETOOL_SAVE_EDIT));
		ok.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				fireApplyEditorValue();
			}
		});
		return composite;
	}

	@Override
	protected Object doGetValue() {
		if (itemList == null) {
			return super.doGetValue();
		}

		CompoundCommand cmd = new CompoundCommand("Set Enumeration") {
			public java.util.Collection<?> getAffectedObjects() {
				ArrayList<? super Object> list = new ArrayList<Object>();
				list.add(affectedObject);
				return list;
			};
		};

		if (attributeValue.eContainer() == null) {
			cmd.append(AddCommand
					.create(editingDomain,
							parent,
							ReqIF10Package.Literals.SPEC_ELEMENT_WITH_ATTRIBUTES__VALUES,
							attributeValue));
		}

		cmd.append(SetCommand
				.create(editingDomain,
						attributeValue,
						ReqIF10Package.Literals.ATTRIBUTE_VALUE_ENUMERATION__VALUES,
						itemList));

		editingDomain.getCommandStack().execute(cmd);
		return attributeValue;
	}

	@Override
	protected void doSetValue(Object value) {
		if (value instanceof AttributeValueEnumeration) {
			this.attributeValue = (AttributeValueEnumeration) value;
		}
		super.doSetValue(value);
	}

	@Override
	protected void fireCancelEditor() {
		itemList = null;
		super.fireCancelEditor();
	}
	/**
	 * This method is overridden to add a read-and-dispatch loop after opening
	 * the popup. Otherwise, the panel will disappear immediately on Linux.
	 */
	@Override
	protected void openPopupBox(Control parent) {
		super.openPopupBox(parent);

		// Workaround to prevent shell from closing right after opening on Linux.
		Display display = Display.getCurrent();
		Shell shell = display.getActiveShell();
		shell.pack();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

}
