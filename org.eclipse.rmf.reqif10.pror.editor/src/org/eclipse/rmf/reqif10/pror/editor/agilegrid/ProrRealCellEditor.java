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

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.ICellEditorValidator;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;

public class ProrRealCellEditor extends ProrCellEditor {

	private double min = Double.MIN_VALUE;
	private double max = Double.MAX_VALUE;

	public ProrRealCellEditor(AgileGrid agileGrid, EditingDomain editingDomain,
			SpecElementWithAttributes parent,
			Object affectedObject) {
		super(agileGrid, editingDomain, parent, affectedObject);
		this.setValidator(new ICellEditorValidator() {
			public String isValid(Object value) {
				if (!(value instanceof String)) {
					return null;
				}
				try {
					double num = Double.parseDouble(value.toString());
					if (num < min || num > max) {
						return "Value must be in [" + min + ".." + max + "]";
					}
				} catch (NumberFormatException e) {
					return e.getLocalizedMessage();
				}
				return null;
			}
		});
	}

	@Override
	protected Object doGetValue() {
		try {
			Double value = new Double(text.getText());
			ProrUtil.setTheValue(attributeValue, value, parent, affectedObject,
					editingDomain);
		} catch (NumberFormatException e) {
			// No action necessary, we simply restore the old value.
		}		
		return attributeValue;
	}

	public void setRange(Double min, Double max) {
		this.min = min != null ? min : Double.MIN_VALUE;
		this.max = max != null ? max : Double.MAX_VALUE;
	}

}
