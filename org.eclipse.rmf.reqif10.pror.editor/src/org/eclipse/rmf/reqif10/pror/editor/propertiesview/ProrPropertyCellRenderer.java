/*******************************************************************************
 * Copyright (c) 2011, 2013 Formal Mind GmbH and University of Dusseldorf.
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
import org.agilemore.agilegrid.DefaultLayoutAdvisor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.editor.agilegrid.AbstractProrCellRenderer;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.IProrCellRenderer;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.PresentationEditorInterface;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.PresentationServiceManager;
import org.eclipse.rmf.reqif10.pror.editor.propertiesview.ProrPropertyContentProvider.Descriptor;
import org.eclipse.rmf.reqif10.pror.editor.propertiesview.ProrPropertyContentProvider.PropertyRow;
import org.eclipse.rmf.reqif10.pror.util.ConfigurationUtil;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;

/**
 * A cell renderer that should only be used for the ProR Property View.
 * 
 * @author Lukas Ladenberger
 * @author Michael Jastram
 */
public class ProrPropertyCellRenderer extends AbstractProrCellRenderer {

	public ProrPropertyCellRenderer(AgileGrid agileGrid,
			AdapterFactory adapterFactory) {
		super(agileGrid, adapterFactory);
	}
	
	@Override
	protected void doDrawCellContent(GC gc, Rectangle rect, int row, int col) {
		AttributeValue av = null;
		if (agileGrid.getContentProvider() instanceof ProrPropertyContentProvider){
		
			ProrPropertyContentProvider contentProvider = (ProrPropertyContentProvider) agileGrid
					.getContentProvider();
			PropertyRow propertyRow = contentProvider.getRowContent(row, col);
			if (!(propertyRow instanceof Descriptor))
				return;
	
			Descriptor descriptor = (Descriptor) propertyRow;
			av = descriptor.getAttributeValue(); // May be null
		}
		
		
		// Get the default row height
		int initRowHeight = ((DefaultLayoutAdvisor) agileGrid
				.getLayoutAdvisor()).getInitialRowHeight(row);
		int newRowHeight = initRowHeight;

		if (av != null) {

			IProrCellRenderer renderer = null;
			// Try to get cell renderer from presentation
			ProrPresentationConfiguration config = ConfigurationUtil
					.getPresentationConfiguration(av);
			if (config != null) {
				ItemProviderAdapter ip = ProrUtil.getItemProvider(
						adapterFactory, config);
				if (ip instanceof PresentationEditorInterface) {
					renderer = ((PresentationEditorInterface) ip)
							.getCellRenderer(av);
				}
			}

			// See whether there is a default renderer
			if (renderer == null) {
				renderer = PresentationServiceManager.getDefaultCellRenderer(
						av, adapterFactory);
			}

			// Check if the have a renderer from presentation extension
			// point
			if (renderer != null) {
				newRowHeight = renderer.doDrawCellContent(gc, rect, av);
			} else { // Else use the default draw cell method
				newRowHeight = doDrawCellContentDefault(gc, rect, av);
			}
		}

		// Prevent Scrolling becoming impossible by truncating large cells vertically.
		int tableSize = agileGrid.getSize().y;
		if (newRowHeight > (tableSize * .5)) {
			newRowHeight = (int) (tableSize * .5);
			Color oldForeground = gc.getForeground();
			Color oldBackground = gc.getBackground();
			
			gc.setBackground(COLOR_BACKGROUND);
			gc.setForeground(COLOR_LINE_LIGHTGRAY);
			gc.fillRectangle(rect.x, rect.y + newRowHeight + 4 - 20, rect.width, 20);
			gc.setForeground(COLOR_RED);
			gc.drawLine(rect.x, rect.y + newRowHeight + 4 - 20, rect.x + rect.width, rect.y + newRowHeight + 4 - 20);
			gc.drawText("Truncated", rect.x + 5, rect.y + newRowHeight - 15);
			gc.setForeground(oldForeground);
			gc.setBackground(oldBackground);
		}

		// Set the correct row height
		if (newRowHeight < 18) // The row height should be at least 18
			newRowHeight = initRowHeight;
		agileGrid.getLayoutAdvisor().setRowHeight(row, newRowHeight + 2);
	}
}
