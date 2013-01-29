/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 *     Lukas Ladenberger - ProR GUI     
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor.propertiesview;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.Cell;
import org.agilemore.agilegrid.DefaultLayoutAdvisor;
import org.eclipse.rmf.reqif10.pror.editor.presentation.Reqif10EditorPlugin;
import org.eclipse.rmf.reqif10.pror.editor.propertiesview.ProrPropertyContentProvider.Category;

public class ProrPropertyLayoutAdvisor extends DefaultLayoutAdvisor {

	private ProrPropertyContentProvider contentProvider;

	public ProrPropertyLayoutAdvisor(AgileGrid agileGrid) {
		super(agileGrid);
		this.contentProvider = (ProrPropertyContentProvider) agileGrid
				.getContentProvider();
	}

	@Override
	public boolean isLeftHeaderVisible() {
		return false;
	}
	
	@Override
	public int getColumnCount() {
		return 2; // We have only two columns: Attribute name and the
					// corresponding value
	}

	@Override
	public int getInitialColumnWidth(int col) {
		switch (col) {
		case 0:
			return 150;
		case 1:
			return agileGrid.getSize().x - 180;
		default:
			return 100;
		}
	}

	@Override
	public Cell mergeInto(int row, int col) {
		if (col == 1 && row >= 0) {
			Object obj = ((ProrPropertyContentProvider) this.agileGrid
					.getContentProvider()).getRowContent(row);
			if (obj instanceof Category) { // Category
				return new Cell(agileGrid, row, 0);
			}
		}
		return super.mergeInto(row, col);
	}

	@Override
	public String getTopHeaderLabel(int col) {
		switch (col) {
		case 0:
			return Reqif10EditorPlugin.INSTANCE
					.getString("_UI_PROPERTIES_VIEW_COLUMN_PROPERTY");
		case 1:
			return Reqif10EditorPlugin.INSTANCE
					.getString("_UI_PROPERTIES_VIEW_COLUMN_VALUE");
		default:
			return "Column " + (col + 1);
		}
	}
	
	@Override
	public int getRowCount() {
		return this.contentProvider.getRowCount();
	}

}
