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
package org.eclipse.rmf.pror.reqif10.editor.propertiesview;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.DefaultLayoutAdvisor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.rmf.pror.reqif10.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.pror.reqif10.editor.agilegrid.AbstractProrCellRenderer;
import org.eclipse.rmf.pror.reqif10.editor.presentation.service.IProrCellRenderer;
import org.eclipse.rmf.pror.reqif10.editor.presentation.service.PresentationEditorManager;
import org.eclipse.rmf.pror.reqif10.editor.presentation.service.PresentationService;
import org.eclipse.rmf.pror.reqif10.util.ConfigurationUtil;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;

public class ProrPropertyCellRenderer extends AbstractProrCellRenderer {

	private ProrPropertyContentProvider contentProvider;
	private EditingDomain editingDomain;

	// private final ProrXhtmlCellRenderer xhtmlCellRenderer;
	
	public ProrPropertyCellRenderer(AgileGrid agileGrid, AdapterFactory adapterFactory, EditingDomain editingDomain) {
		super(agileGrid, adapterFactory);
		this.contentProvider = (ProrPropertyContentProvider) agileGrid.getContentProvider();
		this.editingDomain = editingDomain;
		// this.xhtmlCellRenderer = new ProrXhtmlCellRenderer(agileGrid,
		// this.contentProvider);
	}
	
	@Override
	protected void doDrawCellContent(GC gc, Rectangle rect, int row, int col) {

		// TODO: Check agile grid problem with third column
		// We render only the second column (attribute value)
		if (col == 1) {

			AttributeValue atrVal = this.contentProvider
					.getReqIfAttributeValue(row);

			// Get the default row height
			int initRowHeight = ((DefaultLayoutAdvisor) agileGrid
					.getLayoutAdvisor()).getInitialRowHeight(row);
			int newRowHeight = initRowHeight;

			if (atrVal != null) {

				IProrCellRenderer renderer = null;
				// Try to get cell renderer from presentation extension
				// point
				ProrPresentationConfiguration config = ConfigurationUtil
						.getPresentationConfig(atrVal, editingDomain);
				if (config != null) {
					PresentationService service = PresentationEditorManager
							.getPresentationService(config);
					if (service != null)
						renderer = service.getCellRenderer(atrVal);
				}

				// Check if the have a renderer from presentation extension
				// point
				if (renderer != null) { // If yes, use the draw method from
										// the
										// renderer
					newRowHeight = renderer.doDrawCellContent(gc, rect,
							this.contentProvider.getReqIfAttributeValue(row));
				} else { // Else use the default draw cell method
					newRowHeight = doDrawCellContentDefault(gc, rect,
							this.contentProvider.getReqIfAttributeValue(row));
				}

			} else { // We have a EMF property

				// Get the corresponding image from label item label provider
				IItemLabelProvider labelProvider = this.contentProvider
						.getItemLabelProvider(row);

				Image img = ExtendedImageRegistry.getInstance().getImage(
						labelProvider.getImage(this.contentProvider
								.getItemPropertyValue(row)));

				// Get the content at row and col
				Object content = agileGrid.getContentAt(row, col);

				// Draw content with image
				drawTextImage(gc, content.toString(), getAlignment(), img,
						alignment, rect.x + 3, rect.y + 2, rect.width - 6,
						rect.height - 4);

			}

			// Set the correct row height
			if (newRowHeight < 18) // The row height should be at least 18
				newRowHeight = initRowHeight;
			agileGrid.getLayoutAdvisor().setRowHeight(row, newRowHeight + 2);

		}

	}
	
}
