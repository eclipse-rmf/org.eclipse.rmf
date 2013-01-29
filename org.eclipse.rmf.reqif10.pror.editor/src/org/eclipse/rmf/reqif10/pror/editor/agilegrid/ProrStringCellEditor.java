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
package org.eclipse.rmf.reqif10.pror.editor.agilegrid;

import java.math.BigInteger;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.ICellEditorValidator;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;

public class ProrStringCellEditor extends ProrCellEditor {

	private BigInteger maxLength;
	
	public ProrStringCellEditor(AgileGrid agileGrid,
			EditingDomain editingDomain, SpecElementWithAttributes parent,
			Object affectedObject) {
		super(agileGrid, editingDomain, parent, affectedObject);
		this.setValidator(new ICellEditorValidator() {
			public String isValid(Object value) {
				if (!(value instanceof String)) {
					return null;
				}
				// TODO conversion from BigInteger to int is dangerous!
				if (((String) value).length() > maxLength.intValue()) {
					return "Maximum length of " + maxLength + " exceeded";
				}
				return null;
			}
		});
	}

	@Override
	protected Object doGetValue() {
		ProrUtil.setTheValue(attributeValue, text.getText(), parent,
				affectedObject,
				editingDomain);
		return attributeValue;
	}

	public void setMaxLength(BigInteger maxLength) {
		this.maxLength = maxLength;
	}

}
