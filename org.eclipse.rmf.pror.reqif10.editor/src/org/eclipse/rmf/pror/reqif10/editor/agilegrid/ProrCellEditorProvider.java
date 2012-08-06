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
package org.eclipse.rmf.pror.reqif10.editor.agilegrid;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.CellEditor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.pror.reqif10.editor.presentation.service.PresentationEditorManager;
import org.eclipse.rmf.pror.reqif10.editor.presentation.service.PresentationService;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.Identifiable;

public class ProrCellEditorProvider extends AbstractProrCellEditorProvider {

	private final ProrAgileGridContentProvider contentProvider;
	private final AgileCellEditorActionHandler agileCellEditorActionHandler;
	
	public ProrCellEditorProvider(AgileGrid agileGrid,
			EditingDomain editingDomain, AdapterFactory adapterFactory, AgileCellEditorActionHandler agileCellEditorActionHandler) {
		super(agileGrid, adapterFactory, editingDomain);
		this.contentProvider = (ProrAgileGridContentProvider) agileGrid
				.getContentProvider();
		this.agileCellEditorActionHandler = agileCellEditorActionHandler;
	}

	@Override
	protected AttributeValue getAttributeValue(int row, int col) {
		return contentProvider.getValueForColumn(contentProvider.getProrRow(row).getSpecElement(), col);
	}

	@Override
	public Identifiable getAffectedElement(int row, int col) {
		ProrAgileGridContentProvider provider = (ProrAgileGridContentProvider) getAgileGrid()
				.getContentProvider();
		return (Identifiable) provider.getProrRow(row).getSpecElement();
	}

	@Override
	public CellEditor getCellEditor(int row, int col, Object hint) {
		
		CellEditor cellEditor = null;		
		AttributeValue attrValue = getAttributeValue(row, col);
		
		cellEditor = getDefaultCellEditor(attrValue, getAffectedElement(row, col));
		
		PresentationService service = PresentationEditorManager
				.getPresentationService(attrValue, editingDomain);
		if (service != null) {
			CellEditor serviceCellEditor = service.getCellEditor(agileGrid,editingDomain, attrValue, getAffectedElement(row, col));
			cellEditor = serviceCellEditor == null ? cellEditor : serviceCellEditor;
		}
	
		if (cellEditor != null)
			agileCellEditorActionHandler.setActiveCellEditor(cellEditor);
		
		return cellEditor;
		
	}

	@Override
	public boolean canEdit(int row, int col) {
		AttributeValue attrValue = getAttributeValue(row, col);
		if (attrValue == null) {
			return false;
		}
		PresentationService service = PresentationEditorManager
				.getPresentationService(attrValue, editingDomain);
		return service == null ? true : service.canEdit();
	}

}
