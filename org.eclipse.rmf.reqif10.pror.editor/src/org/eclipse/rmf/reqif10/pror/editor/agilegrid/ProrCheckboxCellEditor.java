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
import org.agilemore.agilegrid.CellEditor;
import org.agilemore.agilegrid.EditorActivationEvent;
import org.agilemore.agilegrid.editors.CheckboxCellEditor;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.AttributeValueBoolean;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Control;

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
public class ProrCheckboxCellEditor extends CellEditor {

	private EditingDomain domain;
	private AttributeValueBoolean attributeValue;
	private SpecElementWithAttributes parent;

	public ProrCheckboxCellEditor(AgileGrid agileGrid, EditingDomain domain,
			SpecElementWithAttributes parent) {
		super(agileGrid, SWT.NONE);
		this.domain = domain;
		this.parent = parent;
	}

	/**
	 * Returns null, as no control is necessary.
	 */
	protected Control createControl(AgileGrid agileGrid) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.agilemore.agilegrid.CellEditor#activate(org.agilemore.agilegrid.
	 * EditorActivationEvent)
	 */
	public void activate(EditorActivationEvent activationEvent) {
		doSetValue(attributeValue);
		this.fireApplyEditorValue();
	}

	@Override
	protected void doSetValue(Object value) {
		if (!(value instanceof AttributeValueBoolean)) {
			return;
		}

		AttributeValueBoolean av = (AttributeValueBoolean) value;
		CompoundCommand cmd = new CompoundCommand();
		if (av.eContainer() == null) {
			cmd.append(AddCommand
					.create(domain,
							parent,
							ReqIF10Package.Literals.SPEC_ELEMENT_WITH_ATTRIBUTES__VALUES,
							av));

		}
		cmd.append(SetCommand.create(domain, av,
				ReqIF10Package.Literals.ATTRIBUTE_VALUE_BOOLEAN__THE_VALUE,
				Boolean.TRUE.equals(av.isTheValue()) ? Boolean.FALSE
						: Boolean.TRUE));
		domain.getCommandStack().execute(cmd);
	}

	/**
	 * As we have no control, this value is irrelevant.
	 */
	@Override
	protected Object doGetValue() {
		return "Error in ProrCheckboxCellEditor if you see this message!";
	}
}
