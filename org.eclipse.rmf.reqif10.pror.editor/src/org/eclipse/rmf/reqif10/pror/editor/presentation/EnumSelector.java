/*******************************************************************************
 * Copyright (c) 2014 Formal Mind GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor.presentation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.pror.editor.agilegrid.ProrEnumerationMultiValueCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.ShellAdapter;
import org.eclipse.swt.events.ShellEvent;
import org.eclipse.swt.graphics.Rectangle;
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

/**
 * This -Control represents a GUI element that allows the selection of
 * {@link EnumValue}s. It offers a save and cancel button, and is designed to be
 * shown in a {@link Shell}.
 * 
 * It is written so that it can be used by AgileGrid (see
 * {@link ProrEnumerationMultiValueCellEditor} or stand-alone (e.g. in a search
 * interface).
 * 
 * IMPORTANT: AgileGrid provides a proper shell, to be used with
 * {@link #showEnumSelector(Shell)}. Outside AgileGrid, a Shell must be
 * constructed BEFORE instantiating the control. You can use the static method
 * {@link #createShell(Shell)} for this purpose.
 * 
 * @author jastram
 */
public class EnumSelector extends Composite {

	private ArrayList<EnumValue> itemList = new ArrayList<EnumValue>();
	private int status = SWT.OK;
	private Collection<EnumValue> originalSelection;

	/**
	 * Createes the Control.
	 */
	public EnumSelector(List<EnumValue> items, Collection<EnumValue> selection,
			Composite parent, int style) {
		super(parent, style);
		originalSelection = selection;

		GridLayout layout = new GridLayout();
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		layout.horizontalSpacing = 0;
		layout.verticalSpacing = 5;
		setLayout(layout);
		Table table = new Table(this, SWT.CHECK);
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

		for (EnumValue enumValue : items) {
			TableItem tableItem = new TableItem(table, SWT.NONE);
			String enumId = enumValue.getLongName() == null ? enumValue
					.getIdentifier() : enumValue.getLongName();
			tableItem.setText(enumId);
			tableItem.setData(enumValue);
			if (selection.contains(enumValue)) {
				tableItem.setChecked(true);
				itemList.add(enumValue);
			}
		}

		Composite buttonPanel = new Composite(this, SWT.NONE);
		buttonPanel
				.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		buttonPanel.setLayout(new FillLayout(SWT.HORIZONTAL));
		Button cancel = new Button(buttonPanel, SWT.PUSH);
		cancel.setImage(PlatformUI.getWorkbench().getSharedImages()
				.getImage(ISharedImages.IMG_TOOL_DELETE));
		cancel.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				status = SWT.CANCEL;
				Display.getCurrent().getActiveShell().close();
			}
		});

		Button ok = new Button(buttonPanel, SWT.PUSH);
		ok.setImage(PlatformUI.getWorkbench().getSharedImages()
				.getImage(ISharedImages.IMG_ETOOL_SAVE_EDIT));
		ok.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				status = SWT.OK;
				Display.getCurrent().getActiveShell().close();
			}
		});
	}

	/**
	 * Opens the control. Make sure to get the shell via
	 * {@link #createShell(Control)}, unless you use this via AgileGrid.
	 */
	public int showEnumSelector(Shell shell) {
		shell.pack();

		while (!shell.isDisposed()) {
			if (!Display.getCurrent().readAndDispatch()) {
				Display.getCurrent().sleep();
			}
		}

		return status;
	}

	/**
	 * Returns the selected items. If the user cancelled, the original,
	 * unmodified selection will be returned.
	 */
	public Collection<EnumValue> getItems() {
		return status == SWT.OK ? itemList : originalSelection;
	}

	/**
	 * Creates a shell that: is positioned below the parent; can be closed via
	 * ESC; is closed if the user clicks outside, or if the shell loses focus.
	 * 
	 * Unless the user cancels explicitly (button), the new values will be
	 * accepted.
	 */
	public static Shell createShell(Control parent) {
		final Shell shell = new Shell(parent.getShell(), SWT.RESIZE
				| SWT.ON_TOP);
		shell.setBackground(parent.getBackground());
		shell.setLayout(new FillLayout());
		shell.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.character == SWT.ESC) { // Escape
					shell.close();
				}
			}
		});

		shell.addShellListener(new ShellAdapter() {
			@Override
			public void shellDeactivated(ShellEvent e) {
				shell.close();
			}
		});

		Display display = parent.getDisplay();

		Rectangle clientRect = display.map(parent, null, new Rectangle(0, 0, 0,
				0));
		shell.setBounds(clientRect.x, clientRect.y + parent.getBounds().height,
				0, 0);
		shell.open();
		shell.layout();
		return shell;
	}

}