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
package org.eclipse.rmf.reqif10.agilegrid;

import java.math.BigInteger;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.CellEditor;
import org.agilemore.agilegrid.DefaultCellEditorProvider;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.rmf.pror.reqif10.presentation.service.PresentationManager;
import org.eclipse.rmf.pror.reqif10.presentation.service.PresentationService;
import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean;
import org.eclipse.rmf.reqif10.DatatypeDefinitionDate;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.DatatypeDefinitionInteger;
import org.eclipse.rmf.reqif10.DatatypeDefinitionReal;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.util.Reqif10Util;

public abstract class AbstractProrCellEditorProvider extends
		DefaultCellEditorProvider {

	private final EditingDomain editingDomain;
	private AdapterFactory adapterFactory;

	public AbstractProrCellEditorProvider(AgileGrid agileGrid,
			AdapterFactory adapterFactory, EditingDomain editingDomain) {
		super(agileGrid);
		this.editingDomain = editingDomain;
		this.adapterFactory = adapterFactory;
	}

	// TODO Not pretty, not readable
	protected CellEditor getDefaultCellEditor(AttributeValue value) {
		DatatypeDefinition dd = Reqif10Util.getDatatypeDefinition(value);
		if (dd == null) {
			MessageDialog
					.openInformation(null, "No DatatypeDefinition set",
							"This attribute cannot be edited, as no Datatype Definition has been set.");
			return null;
		}

		if (dd instanceof DatatypeDefinitionBoolean) {
			return new ProrCheckboxCellEditor(agileGrid, editingDomain);
		} else if (dd instanceof DatatypeDefinitionDate) {
			return new ProrDateCellEditor(agileGrid, editingDomain);
		} else if (dd instanceof DatatypeDefinitionInteger) {
			DatatypeDefinitionInteger ddi = (DatatypeDefinitionInteger) dd;
			ProrIntegerCellEditor integerCellEditor = new ProrIntegerCellEditor(
					agileGrid, editingDomain);
			integerCellEditor.setRange(ddi.getMin(), ddi.getMax());
			return integerCellEditor;
		} else if (dd instanceof DatatypeDefinitionReal) {
			DatatypeDefinitionReal ddr = (DatatypeDefinitionReal) dd;
			ProrRealCellEditor realCellEditor = new ProrRealCellEditor(
					agileGrid, editingDomain);
			realCellEditor.setRange(ddr.getMin() != null ? ddr.getMin()
					: -Double.MAX_VALUE, ddr.getMax() != null ? ddr.getMax()
					: Double.MAX_VALUE);
			return realCellEditor;
		} else if (dd instanceof DatatypeDefinitionString) {
			DatatypeDefinitionString dds = (DatatypeDefinitionString) dd;
			ProrStringCellEditor stringCellEditor = new ProrStringCellEditor(
					agileGrid, editingDomain);
			stringCellEditor.setMaxLength(dds.getMaxLength() != null ? dds
					.getMaxLength() : new BigInteger(Integer.MAX_VALUE + ""));
			return stringCellEditor;
		} else if (dd instanceof DatatypeDefinitionEnumeration) {
			DatatypeDefinitionEnumeration dde = (DatatypeDefinitionEnumeration) dd;
			Boolean multiValued = ((AttributeDefinitionEnumeration) Reqif10Util
					.getAttributeDefinition(value)).getMultiValued();
			if (multiValued == null || multiValued.booleanValue() == false) {
				return new ProrEnumerationSingleValueCellEditor(agileGrid, dde,
						editingDomain, adapterFactory);
			} else {
				return new ProrEnumerationMultiValueCellEditor(agileGrid, dde,
						editingDomain, adapterFactory);
			}
//		} else if (dd instanceof DatatypeDefinitionXhtml) {
//			ProrXHTMLCellEditor integerCellEditor = new ProrXHTMLCellEditor(
//					agileGrid, editingDomain);
//			return integerCellEditor;

		}
		throw new IllegalArgumentException("No editor for: " + value);
	}

	protected abstract AttributeValue getAttributeValue(int row, int col);

	@Override
	public boolean canEdit(int row, int col) {
		AttributeValue attrValue = getAttributeValue(row, col);
		if (attrValue == null) {
			return false;
		}
		PresentationService service = PresentationManager
				.getPresentationService(attrValue, editingDomain);
		return service == null ? true : service.canEdit();
	}

	@Override
	public CellEditor getCellEditor(int row, int col) {
		return getCellEditor(row, col, null);
	}

	@Override
	public CellEditor getCellEditor(int row, int col, Object hint) {
		AttributeValue attrValue = getAttributeValue(row, col);
		PresentationService service = PresentationManager
				.getPresentationService(attrValue, editingDomain);
		if (service != null) {
			CellEditor cellEditor = service.getCellEditor(agileGrid,
					editingDomain, attrValue);
			if (cellEditor != null) {
				return cellEditor;
			}
		}
		return getDefaultCellEditor(attrValue);
	}

}
