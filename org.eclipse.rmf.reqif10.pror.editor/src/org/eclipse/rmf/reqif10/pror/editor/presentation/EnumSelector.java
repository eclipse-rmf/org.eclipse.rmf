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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

/**
 * This -Control represents a GUI element that allows the selection of {@link EnumValue}s.
 * It offers a save and cancel button, and is designed to be shown in a {@link Shell}.
 * 
 * It is written so that it can be used by AgileGrid (see {@link ProrEnumerationMultiValueCellEditor}
 * or stand-alone (e.g. in a search interface).
 * 
 * @author jastram
 */
public class EnumSelector extends Composite {
	
	private ArrayList<EnumValue> itemList = new ArrayList<EnumValue>();
	private int status = SWT.OK;
	private Collection<EnumValue> originalSelection;
	

	public EnumSelector(List<EnumValue> items,
			Collection<EnumValue> selection, Composite parent, int style) {
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
			String enumId = enumValue.getLongName() == null ? enumValue.getIdentifier() : enumValue.getLongName();
			tableItem.setText(enumId);
			tableItem.setData(enumValue);
			if (selection.contains(enumValue)) {
				tableItem.setChecked(true);
				itemList.add(enumValue);
			}
		}

		Composite buttonPanel = new Composite(this, SWT.NONE);
		buttonPanel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		buttonPanel.setLayout(new FillLayout(SWT.HORIZONTAL));
		Button cancel = new Button(buttonPanel, SWT.PUSH);
		cancel.setImage(PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_TOOL_DELETE));
		cancel.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				status = SWT.CANCEL;
				Display.getCurrent().getActiveShell().close();
			}
		});
		
		Button ok = new Button(buttonPanel, SWT.PUSH);
		ok.setImage(PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_ETOOL_SAVE_EDIT));
		ok.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				status = SWT.OK;
				Display.getCurrent().getActiveShell().close();
			}
		});
	}
	
	public int showEnumSelector(Shell shell) {
		shell.pack();

		while (!shell.isDisposed()) {
			if (!Display.getCurrent().readAndDispatch()) {
				Display.getCurrent().sleep();
			}
		}
		
		return status;
	}
	
	public Collection<EnumValue> getItems() {
		return status == SWT.OK ? itemList : originalSelection;
	}
	
}