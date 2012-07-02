/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 *     Lukas Ladenberger - ProR GUI
 ******************************************************************************/
package org.eclipse.rmf.pror.reqif10.editor.propertiesview;

import java.util.List;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.editors.ComboBoxCellEditor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.ui.celleditor.ExtendedComboBoxCellEditor;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.rmf.pror.reqif10.editor.util.ProrEditorUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;

public class ExtendedAgileComboBoxCellEditor extends ComboBoxCellEditor {

	protected List<?> originalList;

	protected List<?> list;

	protected boolean sorted;

	private EditingDomain editingDomain;

	private Object affectedObject;

	private IItemPropertyDescriptor itemPropertyDescriptor;

	public ExtendedAgileComboBoxCellEditor(AgileGrid agileGrid,
			EditingDomain editingDomain, List<?> list,
			IItemPropertyDescriptor itemPropertyDescriptor, Object object,
			boolean sorted) {
		super(agileGrid, ExtendedComboBoxCellEditor.createItems(list,
				ProrPropertyCellEditorProvider.getLabelProvider(
						itemPropertyDescriptor, object),
				sorted), SWT.NONE);
		this.itemPropertyDescriptor = itemPropertyDescriptor;
		this.editingDomain = editingDomain;
		this.affectedObject = object;
		this.list = list;
		this.sorted = sorted;
	}

	@Override
	protected Object doGetValue() {

		// Get the index into the list via this call to super.
		//
		int index = ((CCombo) getControl()).getSelectionIndex();

		Object val = index < list.size() && index >= 0 ? list
				.get(((CCombo) getControl()).getSelectionIndex()) : null;

		Command setCmd = SetCommand.create(editingDomain, affectedObject,
				itemPropertyDescriptor.getFeature(affectedObject), val);
		Command affectedObjectCommand = ProrEditorUtil
				.getAffectedObjectCommand(affectedObject, setCmd);
		editingDomain.getCommandStack().execute(affectedObjectCommand);

		return val;

	}

	@Override
	protected void doSetValue(Object value) {
		if (value == null)
			return;
		super.doSetValue(itemPropertyDescriptor.getLabelProvider(value)
				.getText(value));
	}

}
