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
import org.agilemore.agilegrid.CellEditor;
import org.agilemore.agilegrid.DefaultCellEditorProvider;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean;
import org.eclipse.rmf.reqif10.DatatypeDefinitionDate;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.DatatypeDefinitionInteger;
import org.eclipse.rmf.reqif10.DatatypeDefinitionReal;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.DatatypeDefinitionXHTML;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

/**
 * Foundation for AgileGrid Cell Editors for ProR. Used in the Specification
 * Editor and the Property View.
 * 
 * @author jastram
 */
public abstract class AbstractProrCellEditorProvider extends
		DefaultCellEditorProvider {

	protected final EditingDomain editingDomain;
	protected final AdapterFactory adapterFactory;

	public AbstractProrCellEditorProvider(AgileGrid agileGrid,
			AdapterFactory adapterFactory, EditingDomain editingDomain) {
		super(agileGrid);
		this.editingDomain = editingDomain;
		this.adapterFactory = adapterFactory;
	}

	// TODO Not pretty, not readable
	/**
	 * This methods returns the default cell editor for an attribute value. Note
	 * that it does not set the value!
	 * 
	 * @param value
	 * @param affectedObject
	 * @return the default cell editor for the attribute value
	 */
	protected CellEditor getDefaultCellEditor(AttributeValue value,
			Object parent,
			Object affectedObject) {
		DatatypeDefinition dd = ReqIF10Util.getDatatypeDefinition(value);
		if (dd == null) {
			MessageDialog
					.openInformation(null, "No DatatypeDefinition set",
							"This attribute cannot be edited, as no Datatype Definition has been set.");
			return null;
		}

		// Parent may be SpecHierarchy or SpecElement, but we need SpecElement.
		SpecElementWithAttributes specElement = parent instanceof SpecHierarchy ? ((SpecHierarchy) parent)
				.getObject() : ((SpecElementWithAttributes) parent);
		if (dd instanceof DatatypeDefinitionBoolean) {
			return new ProrCheckboxCellEditor(agileGrid, editingDomain,
					specElement);
		} else if (dd instanceof DatatypeDefinitionDate) {
			return new ProrDateCellEditor(agileGrid, editingDomain,
					(SpecElementWithAttributes) specElement,
					affectedObject);
		} else if (dd instanceof DatatypeDefinitionInteger) {
			DatatypeDefinitionInteger ddi = (DatatypeDefinitionInteger) dd;
			ProrIntegerCellEditor integerCellEditor = new ProrIntegerCellEditor(
					agileGrid, (SpecElementWithAttributes) specElement,
					editingDomain, affectedObject);
			integerCellEditor.setRange(ddi.getMin(), ddi.getMax());
			return integerCellEditor;
		} else if (dd instanceof DatatypeDefinitionReal) {
			DatatypeDefinitionReal ddr = (DatatypeDefinitionReal) dd;
			ProrRealCellEditor realCellEditor = new ProrRealCellEditor(
					agileGrid, editingDomain,
					(SpecElementWithAttributes) specElement, affectedObject);
			realCellEditor.setRange(ddr.getMin(), ddr.getMax());
			return realCellEditor;
		} else if (dd instanceof DatatypeDefinitionString) {
			DatatypeDefinitionString dds = (DatatypeDefinitionString) dd;
			ProrStringCellEditor stringCellEditor = new ProrStringCellEditor(
					agileGrid, editingDomain,
					(SpecElementWithAttributes) specElement, affectedObject);
			stringCellEditor.setMaxLength(dds.getMaxLength() != null ? dds
					.getMaxLength() : new BigInteger(Integer.MAX_VALUE + ""));
			return stringCellEditor;
		} else if (dd instanceof DatatypeDefinitionEnumeration) {
			DatatypeDefinitionEnumeration dde = (DatatypeDefinitionEnumeration) dd;
			Boolean multiValued = ((AttributeDefinitionEnumeration) ReqIF10Util
					.getAttributeDefinition(value)).isMultiValued();
			if (multiValued == null || multiValued.booleanValue() == false) {
				return new ProrEnumerationSingleValueCellEditor(agileGrid, dde,
						specElement,
						editingDomain, adapterFactory);
			} else {
				return new ProrEnumerationMultiValueCellEditor(agileGrid, dde,
						specElement,
						editingDomain, adapterFactory);
			}
		} else if (dd instanceof DatatypeDefinitionXHTML) {
			ProrXhtmlSimplifiedCellEditor stringCellEditor = new ProrXhtmlSimplifiedCellEditor(
					agileGrid, editingDomain, specElement, affectedObject);
			return stringCellEditor;
		}
		throw new IllegalArgumentException("No editor for: " + value);
	}

	/**
	 * 
	 * This method returns the attribute value of the cell. The method is
	 * abstract since we have two different cell editor provider. The one of the
	 * specification editor and the one of the properties view.
	 * 
	 * @param row
	 * @param col
	 * @return the attribute value of the cell
	 */
	protected abstract AttributeValue getAttributeValue(int row, int col);

	/**
	 * 
	 * This method returns the specification element of the cell. The method is
	 * abstract since we have two different cell editor provider. The one of the
	 * specification editor and the one of the properties view.
	 * 
	 * @param row
	 * @param col
	 * @return the attribute value of the cell
	 */
	protected abstract Object getAffectedElement(int row, int col);

}
