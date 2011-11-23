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
package org.eclipse.rmf.pror.reqif10.editor.propertiesview;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.DefaultCellRendererProvider;
import org.agilemore.agilegrid.ICellRenderer;
import org.agilemore.agilegrid.SWTResourceManager;
import org.agilemore.agilegrid.renderers.TextCellRenderer;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.swt.SWT;

public class ProrPropertyCellRendererProvider extends DefaultCellRendererProvider {

	// The default cell renderer for attribute/value rows
	private final ProrPropertyCellRenderer attributeCellRenderer;
	
	// The cell renderer for category rows
	private final TextCellRenderer categoryCellRenderer;

	public ProrPropertyCellRendererProvider(AgileGrid agileGrid, AdapterFactory adapterFactory, EditingDomain editingDomain) {
		super(agileGrid);
		this.attributeCellRenderer = new ProrPropertyCellRenderer(agileGrid, adapterFactory, editingDomain);
		this.categoryCellRenderer = new TextCellRenderer(agileGrid, SWT.BOLD);
		this.categoryCellRenderer.setDefaultBackground(SWTResourceManager
				.getColor(SWT.COLOR_WIDGET_BACKGROUND));
	}

	@Override
	public ICellRenderer getCellRenderer(int row, int col) {

		Object obj = ((ProrPropertyContentProvider) agileGrid
				.getContentProvider()).getRowContent(row);

		// If we have a category at this row, return the category cell renderer
		if (col == 0 && obj instanceof String) {
			return this.categoryCellRenderer;
			// else if we have an item property descriptor at this row, return
			// the corresponding default cell renderer for attribute/value rows
		} else if (col == 1 && obj instanceof IItemPropertyDescriptor) {
			return this.attributeCellRenderer;
			// else return the default agile grid cell renderer
		} else {
			return super.getCellRenderer(row, col);
		}

	}
	
}
