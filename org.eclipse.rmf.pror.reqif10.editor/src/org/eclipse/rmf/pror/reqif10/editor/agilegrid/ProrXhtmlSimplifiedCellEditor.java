/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Lukas Ladenberger - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.pror.reqif10.editor.agilegrid;

import java.util.Collection;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.editors.TextCellEditor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.CopyCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.XhtmlContent;
import org.eclipse.rmf.reqif10.impl.AttributeValueXHTMLImpl;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDivType;
import org.eclipse.swt.SWT;

/**
 * @author Lukas Ladenberger
 */
public class ProrXhtmlSimplifiedCellEditor extends TextCellEditor {
	
	private final EditingDomain editingDomain;
	private AttributeValueXHTML attributeValue;

	public ProrXhtmlSimplifiedCellEditor(AgileGrid agileGrid,
			EditingDomain editingDomain, Identifiable affectedObject) {
		super(agileGrid, SWT.WRAP);
		this.editingDomain = editingDomain;
	}

	@Override
	protected Object doGetValue() {

		XhtmlContent origTheValue = attributeValue.getTheValue();
		XhtmlDivType div = ProrXhtmlSimplifiedHelper.stringToSimplifiedXhtml(text
				.getText());
		
		// Copy the original value
		Command create = CopyCommand.create(editingDomain, origTheValue);
		create.execute();
		Collection<?> result = create.getResult();
		XhtmlContent xhtmlContentCopy = (XhtmlContent) result.toArray()[0];
		xhtmlContentCopy.setDiv(div);

		// Command for setting new simplified version
		Command setTheValueCmd = SetCommand.create(editingDomain,
				attributeValue,
				ReqIF10Package.Literals.ATTRIBUTE_VALUE_XHTML__THE_VALUE,
				xhtmlContentCopy);

		// Comand for setting original value
		Command setTheOriginalValueCmd = SetCommand.create(editingDomain,
						attributeValue,
						ReqIF10Package.Literals.ATTRIBUTE_VALUE_XHTML__THE_ORIGINAL_VALUE,
						origTheValue);

		// Comand for setting simplified flag
		Command setSimplifiedCmd = SetCommand.create(editingDomain,
						attributeValue,
						ReqIF10Package.Literals.ATTRIBUTE_VALUE_XHTML__SIMPLIFIED,
						true);

		CompoundCommand compoundCommand = new CompoundCommand();
		compoundCommand.append(setSimplifiedCmd);
		compoundCommand.append(setTheValueCmd);
		compoundCommand.append(setTheOriginalValueCmd);
		editingDomain.getCommandStack().execute(compoundCommand);

		return attributeValue;

	}

	@Override
	protected void doSetValue(Object value) {
		this.attributeValue = null;
		if (value instanceof AttributeValue) {
			attributeValue = (AttributeValueXHTML) value;
			AttributeValueXHTMLImpl attributeValueXHTMLImpl = (AttributeValueXHTMLImpl) value;
			XhtmlContent xhtmlContent = attributeValueXHTMLImpl.getTheValue();
			value = ProrXhtmlSimplifiedHelper
					.xhtmlToSimplifiedString(xhtmlContent);
		}
		super.doSetValue(value);
	}

}
