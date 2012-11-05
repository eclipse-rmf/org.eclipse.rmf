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
import org.agilemore.agilegrid.DefaultCellRendererProvider;
import org.agilemore.agilegrid.ICellRenderer;
import org.agilemore.agilegrid.renderers.HeaderCellRenderer;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;

public class ProrCellRendererProvider extends DefaultCellRendererProvider {

	private final ProrCellRenderer prorCellRenderer;
	private final ICellRenderer leftHeadRenderer;
	private final ProrLinkCellRenderer prorLinkCellRenderer;

	public ProrCellRendererProvider(AgileGrid agileGrid, AdapterFactory adapterFactory, EditingDomain editingDomain) {
		super(agileGrid);
		prorCellRenderer = new ProrCellRenderer(agileGrid, adapterFactory, editingDomain);
		leftHeadRenderer = new HeaderCellRenderer(agileGrid,
				ICellRenderer.STYLE_FLAT
						| ICellRenderer.INDICATION_SELECTION_ROW);
		leftHeadRenderer.setAlignment(ICellRenderer.ALIGN_HORIZONTAL_LEFT
				| ICellRenderer.ALIGN_VERTICAL_CENTER);

		prorLinkCellRenderer = new ProrLinkCellRenderer(agileGrid,
				adapterFactory);
	}

	@Override
	public ICellRenderer getCellRenderer(int row, int col) {
		if (col == agileGrid.getLayoutAdvisor().getColumnCount() - 1) {
			return prorLinkCellRenderer;
		} else {
			return prorCellRenderer;
		}
	}

	@Override
	public ICellRenderer getLeftHeadRenderer(int row) {
		return leftHeadRenderer;
	}
}
