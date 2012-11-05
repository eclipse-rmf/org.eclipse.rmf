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
import org.agilemore.agilegrid.editors.TextCellEditor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.rmf.reqif10.pror.editor.propertiesview.ProrPropertyCellEditorProvider.EDataTypeValueHandler;
import org.eclipse.rmf.reqif10.pror.editor.util.ProrEditorUtil;
import org.eclipse.swt.events.ModifyEvent;

public class EDataTypeAgileCellEditor extends TextCellEditor {

	protected EDataType eDataType;

	protected EDataTypeValueHandler valueHandler;

	private EditingDomain editingDomain;

	private Object affectedObject;

	private IItemPropertyDescriptor itemPropertyDescriptor;

	public EDataTypeAgileCellEditor(AgileGrid agileGrid,
			EditingDomain editingDomain,
			IItemPropertyDescriptor itemPropertyDescriptor, Object object,
			final EDataType eDataType) {
		super(agileGrid);
		this.eDataType = eDataType;
		valueHandler = new EDataTypeValueHandler(eDataType);
		this.itemPropertyDescriptor = itemPropertyDescriptor;
		this.editingDomain = editingDomain;
		this.affectedObject = object;
		setValidator(valueHandler);
	}

	@Override
	public Object doGetValue() {

		Object val = valueHandler.toValue((String) super.doGetValue());

		Command setCmd = SetCommand.create(editingDomain, affectedObject,
				itemPropertyDescriptor.getFeature(affectedObject), val);
		Command affectedObjectCommand = ProrEditorUtil
				.getAffectedObjectCommand(affectedObject, setCmd);
		editingDomain.getCommandStack().execute(affectedObjectCommand);

		return val;

	}

	@Override
	public void doSetValue(Object value) {
		value = valueHandler.toString(value);
		super.doSetValue(value);
	}

	// CellEditor.setValue() calls isCorrect() to validate the value that is
	// about to be set. We are doing conversion
	// between the value and a corresponding string, and we would usually like
	// to validate the string. Because
	// setValue() is final, we cannot do that conversion there, so we need to
	// record what we're trying to validate and
	// work around the problem in isCorrect().
	//
	protected boolean validateAsValue = true;

	@Override
	protected void editOccured(ModifyEvent e) {
		validateAsValue = false;
		super.editOccured(e);
		validateAsValue = true;
	}

	@Override
	protected boolean isCorrect(Object value) {
		if (validateAsValue) {
			value = valueHandler.toString(value);
		}
		return super.isCorrect(value);
	}

}
