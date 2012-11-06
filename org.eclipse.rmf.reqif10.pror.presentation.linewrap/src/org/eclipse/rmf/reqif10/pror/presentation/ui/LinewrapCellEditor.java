/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.presentation.ui;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.editors.TextCellEditor;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.TraverseEvent;

public class LinewrapCellEditor extends TextCellEditor {

	private final EditingDomain editingDomain;
	private AttributeValueString attributeValue;
	private Object affectedObject;

	public LinewrapCellEditor(AgileGrid agileGrid, EditingDomain editingDomain, Object affectedObject) {
		super(agileGrid, SWT.WRAP);
		this.editingDomain = editingDomain;
		this.affectedObject = affectedObject;
	}

	/**
	 * We override this to do nothing. While in the Cell Editor, we want the
	 * arrow keys to work normally, and upon reaching the end of the text we do
	 * not want to stop editing.
	 */
	@Override
	protected void onTraverse(TraverseEvent e) {
	}

	@Override
	protected Object doGetValue() {
		String newText = (String) super.doGetValue();

		// Only submit a change if something has changed.
		if (newText.equals(attributeValue.getTheValue())) {
			return attributeValue;
		}

		ProrUtil.setTheValue(attributeValue, text.getText(), affectedObject,
				editingDomain);

		return attributeValue;
	}

	@Override
	protected void doSetValue(Object value) {
		attributeValue = (AttributeValueString) value;
		super.doSetValue(attributeValue.getTheValue());
	}
}
