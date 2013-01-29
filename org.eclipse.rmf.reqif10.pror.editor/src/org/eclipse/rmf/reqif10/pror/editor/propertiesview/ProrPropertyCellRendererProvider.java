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
import org.agilemore.agilegrid.DefaultCellRendererProvider;
import org.agilemore.agilegrid.ICellRenderer;
import org.agilemore.agilegrid.SWTResourceManager;
import org.agilemore.agilegrid.renderers.TextCellRenderer;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.rmf.reqif10.pror.editor.propertiesview.ProrPropertyContentProvider.Category;
import org.eclipse.rmf.reqif10.pror.editor.propertiesview.ProrPropertyContentProvider.Descriptor;
import org.eclipse.rmf.reqif10.pror.editor.propertiesview.ProrPropertyContentProvider.PropertyRow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;

/**
 * Serves the correct {@link ICellRenderer} for the Properties View. There are
 * fundamentally three cases:
 * <ul>
 * <li>Category - A renderer that spans two cells and is bold with gray
 * background
 * <li>Label - Standard Text
 * <li>Value - Delegates to the proper ProR renderer if it is a ProR Property,
 * otherwise {@link SimpleTextCellRenderer}.
 * <ul>
 */
public class ProrPropertyCellRendererProvider extends DefaultCellRendererProvider {

	// The default cell renderer for attribute/value rows
	private final ProrPropertyCellRenderer attributeCellRenderer;
	
	// The cell renderer for category rows
	private final TextCellRenderer categoryCellRenderer;

	// Plain renderer to show text
	private final SimpleTextCellRenderer defaultAttributeRenderer;

	private ProrPropertyContentProvider contentProvider;

	public ProrPropertyCellRendererProvider(AgileGrid agileGrid,
			AdapterFactory adapterFactory,
			ProrPropertyContentProvider contentProvider) {
		super(agileGrid);
		this.contentProvider = contentProvider;
		this.attributeCellRenderer = new ProrPropertyCellRenderer(agileGrid,
				adapterFactory);
		this.categoryCellRenderer = new TextCellRenderer(agileGrid, SWT.BOLD);
		this.categoryCellRenderer.setDefaultBackground(SWTResourceManager
				.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		this.defaultAttributeRenderer = new SimpleTextCellRenderer(agileGrid);
	}

	@Override
	public ICellRenderer getCellRenderer(int row, int col) {
		PropertyRow propertyRow = (PropertyRow) contentProvider
				.getRowContent(row);

		if (propertyRow instanceof Category) {
			return this.categoryCellRenderer;
		} else if (propertyRow instanceof Descriptor) {
			Descriptor descriptor = (Descriptor) propertyRow;
			if (col == 0) {
				return super.getCellRenderer(row, col);
			} else if (descriptor.isRMFSpecific()) {
				return attributeCellRenderer;
			} else {
				return defaultAttributeRenderer;
			}
		} else {
			throw new IllegalArgumentException("Unexpected: " + propertyRow);
		}
	}
	
	/**
	 * A simple TextCellRenderer that is used if no other renderer is available.
	 * It only renders if the content is a {@link Descriptor}.
	 */
	private class SimpleTextCellRenderer extends TextCellRenderer {

		public SimpleTextCellRenderer(AgileGrid agileGrid) {
			super(agileGrid);
		}

		@Override
		protected void doDrawCellContent(GC gc,
				org.eclipse.swt.graphics.Rectangle rect, int row, int col) {

			PropertyRow propertyRow = (PropertyRow) contentProvider
					.getRowContent(row);
			if (!(propertyRow instanceof Descriptor))
				return;

			IItemPropertyDescriptor propertyDescriptor = ((Descriptor) propertyRow)
					.getItemPropertyDescriptor();
			Object propertyValue = propertyDescriptor
					.getPropertyValue(contentProvider.getElement());
			IItemLabelProvider labelProvider = propertyDescriptor
					.getLabelProvider(propertyValue);
			Image image = ExtendedImageRegistry.getInstance().getImage(
					labelProvider.getImage(propertyValue));

			drawTextImage(gc, " " + propertyRow.toString(), alignment, image,
					alignment, rect.x + 2, rect.y + 1, rect.width - 1,
					rect.height - 1);
		}
	}
}
