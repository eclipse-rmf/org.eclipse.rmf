/*******************************************************************************
 * Copyright (c) 2011, 2012 Formal Mind GmbH and University of Dusseldorf.
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
import org.agilemore.agilegrid.ILayoutAdvisor;
import org.agilemore.agilegrid.SWTResourceManager;
import org.agilemore.agilegrid.renderers.HeaderCellRenderer;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.UnifiedColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;

public class ProrCellRendererProvider extends DefaultCellRendererProvider {

	private final ProrCellRenderer prorCellRenderer;
	private final ICellRenderer headRenderer;
	private final ProrLinkCellRenderer prorLinkCellRenderer;

	public ProrCellRendererProvider(AgileGrid agileGrid, AdapterFactory adapterFactory, EditingDomain editingDomain) {
		super(agileGrid);
		prorCellRenderer = new ProrCellRenderer(agileGrid, adapterFactory, editingDomain);
		headRenderer = new ProrHeaderCellRenderer(agileGrid);
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
		return headRenderer;
	}
	
	@Override
	public ICellRenderer getTopHeadRenderer(int row) {
		return headRenderer;
	}
}

/**
 * A Renderer that strips off the "ReqIF." from standard attributes and
 * changes the label color.
 */
class ProrHeaderCellRenderer extends HeaderCellRenderer {

	public static Color COLOR_REQIF_ATTRIBUTE = SWTResourceManager
			.getColor(SWT.COLOR_BLUE);

	public static Color COLOR_UNIFIED = SWTResourceManager
			.getColor(SWT.COLOR_DARK_CYAN);

	public ProrHeaderCellRenderer(AgileGrid agileGrid) {
		super(agileGrid, ICellRenderer.STYLE_FLAT
				| ICellRenderer.INDICATION_SELECTION_ROW);
		setAlignment(ICellRenderer.ALIGN_HORIZONTAL_LEFT
		| ICellRenderer.ALIGN_VERTICAL_CENTER);
	}
	
	/**
	 * Taken from {@link HeaderCellRenderer#doDrawCellContent}, but with
	 * special handling of labels starting with "ReqIF."
	 */
	@Override
	protected void doDrawCellContent(GC gc, Rectangle rect, int row, int col) {
		ProrAgileGridContentProvider contentProvider = (ProrAgileGridContentProvider) agileGrid
				.getContentProvider();

		if (row >= 0) {
			ProrRow prorRow = contentProvider.getProrRow(row);
			if (!prorRow.isVisible()) {
				return;
			}
		}
		
		// draw text and image in the given area.
		String label = "";
		ILayoutAdvisor layoutAdvisor = agileGrid.getLayoutAdvisor();
		if (row == -1 && col >= 0 && col < layoutAdvisor.getColumnCount()) {
			label = layoutAdvisor.getTopHeaderLabel(col);
		} else if (col == -1 && row >= 0 && row < layoutAdvisor.getRowCount()) {
			label = layoutAdvisor.getLeftHeaderLabel(row);
		} else if (row == -1 && col == -1) {
			label = "";
		}

		// Handling the unified Column, if present.
		ProrSpecViewConfiguration specView = contentProvider.specViewConfig;
		if (col >= 0 && col < specView.getColumns().size()
				&& specView.getColumns().get(col) instanceof UnifiedColumn) {
			gc.setForeground(COLOR_UNIFIED);
		}

		// Handling of ReqIF. Attributes
		else if (label.startsWith("ReqIF.")) {
			label = label.substring(6);
			gc.setForeground(COLOR_REQIF_ATTRIBUTE);
		}

		int alignment = getAlignment();
		drawTextImage(gc, label, alignment, null, alignment, rect.x + 3,
				rect.y + 2, rect.width - 6, rect.height - 4);

		drawSortIndicator(gc, rect, row, col, label);
	}
	
	
	
}