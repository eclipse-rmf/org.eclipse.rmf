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
package org.eclipse.rmf.reqif10.pror.editor.propertiesview;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.editors.DialogCellEditor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class ExtendedAgileDialogCellEditor extends DialogCellEditor {

	private EditingDomain editingDomain;

	private Object affectedObject;

	private boolean dialogOpen = false;

	private IItemPropertyDescriptor itemPropertyDescriptor;

	private ILabelProvider labelProvider;

	public ExtendedAgileDialogCellEditor(AgileGrid agileGrid,
			EditingDomain editingDomain,
			IItemPropertyDescriptor itemPropertyDescriptor, Object object) {
		super(agileGrid);
		this.editingDomain = editingDomain;
		this.itemPropertyDescriptor = itemPropertyDescriptor;
		this.affectedObject = object;
		labelProvider = ProrPropertyCellEditorProvider.getLabelProvider(
				this.itemPropertyDescriptor, this.affectedObject);
	}

	@Override
	protected void doSetValue(Object value) {
		super.doSetValue(value);
	}

	@Override
	protected Object doGetValue() {

		Object val = super.doGetValue();

		if (dialogOpen) {
			Command setCmd = SetCommand.create(editingDomain, affectedObject,
					itemPropertyDescriptor.getFeature(affectedObject), val);
			editingDomain.getCommandStack().execute(setCmd);
		}

		return val;

	}

	@Override
	protected Object openDialogBox(Control cellEditorWindow) {
		dialogOpen = true;
		return null;
	}

	@Override
	protected void updateContents(Object object) {
		if (getDefaultLabel() != null && labelProvider != null) {
			getDefaultLabel().setText(labelProvider.getText(object));
		}
	}

	@Override
	protected Button createButton(Composite parent) {
		Button result = new Button(parent, SWT.DOWN);
		result.setText("..."); //$NON-NLS-1$
		return result;
	}

}
