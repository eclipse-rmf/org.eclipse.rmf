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
import org.agilemore.agilegrid.editors.CheckboxCellEditor;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.AttributeValueBoolean;
import org.eclipse.rmf.reqif10.ReqIF10Package;

/**
 * Modified {@link CheckboxCellEditor} that takes a String (rather than a
 * Boolean) as an argument. The mapping is as follows (according to RIF):
 * <p>
 * 
 * TRUE: "1", "true"<br>
 * FALSE: "0", "false"
 * 
 * @author jastram
 * 
 */
public class ProrCheckboxCellEditor extends CheckboxCellEditor {

	private EditingDomain domain;

	public ProrCheckboxCellEditor(AgileGrid agileGrid, EditingDomain domain) {
		super(agileGrid);
		this.domain = domain;
	}

	@Override
	protected void doSetValue(Object value) {
		if (!(value instanceof AttributeValueBoolean)) {
			return;
		}
		AttributeValueBoolean av = (AttributeValueBoolean) value;
		domain.getCommandStack()
				.execute(
						SetCommand
								.create(domain,
										av,
										ReqIF10Package.Literals.ATTRIBUTE_VALUE_BOOLEAN__THE_VALUE,
										Boolean.TRUE.equals(av.isTheValue()) ? Boolean.FALSE
												: Boolean.TRUE));
	}

	@Override
	protected Object doGetValue() {
		if (super.doGetValue().equals(Boolean.TRUE)) {
			return "true";
		} else {
			return "false";
		}
	}
}
