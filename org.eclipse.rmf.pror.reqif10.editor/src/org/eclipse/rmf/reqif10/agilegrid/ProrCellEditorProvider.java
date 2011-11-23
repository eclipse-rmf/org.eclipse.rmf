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

import org.agilemore.agilegrid.AgileGrid;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.AttributeValue;

public class ProrCellEditorProvider extends AbstractProrCellEditorProvider {

	private final ProrAgileGridContentProvider contentProvider;
	
	public ProrCellEditorProvider(AgileGrid agileGrid,
			EditingDomain editingDomain, AdapterFactory adapterFactory) {
		super(agileGrid, adapterFactory, editingDomain);
		contentProvider = (ProrAgileGridContentProvider) agileGrid
				.getContentProvider();
	}

	@Override
	protected AttributeValue getAttributeValue(int row, int col) {
		return contentProvider.getValueForColumn(contentProvider.getProrRow(row).getSpecElement(), col);
	}

}
