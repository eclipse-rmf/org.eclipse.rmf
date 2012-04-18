/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Lukas Ladenberger - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.pror.reqif10.editor.agilegrid;

import java.io.File;

import org.agilemore.agilegrid.AbstractContentProvider;
import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.Cell;
import org.agilemore.agilegrid.renderers.TextCellRenderer;
import org.eclipse.rmf.pror.reqif10.editor.presentation.Reqif10EditorPlugin;
import org.eclipse.rmf.pror.reqif10.editor.presentation.service.IProrCellRenderer;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.XhtmlContent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

/**
 * @author Lukas Ladenberger
 */
public class ProrXhtmlCellRenderer extends TextCellRenderer implements
		IProrCellRenderer {

	private Shell tip;
	private AbstractContentProvider contentProvider;

	public ProrXhtmlCellRenderer(AgileGrid agileGrid,
			AbstractContentProvider contentProvider) {
		super(agileGrid);
		this.contentProvider = contentProvider;
		initToolTipListener();
	}

	private final static Image IMG_WARN_FALSE = PlatformUI.getWorkbench()
			.getSharedImages().getImage(ISharedImages.IMG_OBJS_INFO_TSK);

	private final static Image IMG_WARN_TRUE = PlatformUI.getWorkbench()
			.getSharedImages().getImage(ISharedImages.IMG_OBJS_WARN_TSK);

	public int doDrawCellContent(GC gc, Rectangle rect, Object v) {
		if (v instanceof AttributeValueXHTML) {
			AttributeValueXHTML atrValXhtml = (AttributeValueXHTML) v;
			XhtmlContent xhtmlContent = atrValXhtml.getTheValue();
			String stringValue = ProrXhtmlSimplifiedHelper
					.xhtmlToSimplifiedString(xhtmlContent);
			String wrappedText = wrapText(gc, stringValue, rect.width);
			drawTextImage(gc, wrappedText, alignment, null, alignment,
					rect.x + 3, rect.y + 2, rect.width - 6, rect.height - 4);
			Image icon = IMG_WARN_FALSE;
			if (atrValXhtml.isSimplified())
				icon = IMG_WARN_TRUE;
			gc.drawImage(icon, rect.x + rect.width - 20, rect.y + 5);
			return gc.textExtent(wrappedText).y;
		}
		return 0;
	}

	public String doDrawHtmlContent(Object value, File folder) {
		return null;
	}

	/**
	 * This method initializes the tool tip listener for keywords. TODO:
	 * Messages should be more generic!
	 */
	private void initToolTipListener() {

		Listener l = new Listener() {
			public void handleEvent(Event e) {
				switch (e.type) {
				case SWT.Dispose:
				case SWT.KeyDown:
				case SWT.MouseMove: {
					if (tip == null)
						break;
					tip.dispose();
					tip = null;
					break;
				}
				case SWT.MouseHover: {
					Point mousePointer = new Point(e.x, e.y);
					Cell cell = agileGrid.getCell(mousePointer.x,
							mousePointer.y);
					Rectangle cellRect = agileGrid.getCellRect(cell.row,
							cell.column);
					Rectangle rectNew = new Rectangle(cellRect.width
							+ cellRect.x - 25, cellRect.y, 25, 25);
					if (rectNew.contains(mousePointer)) {
						if (tip != null && !tip.isDisposed())
							tip.dispose();

						Point displayPointer = agileGrid
								.toDisplay(mousePointer);

						Object contentAt = contentProvider.getContentAt(
								cell.row, cell.column);
						if (contentAt instanceof AttributeValueXHTML) {

							AttributeValueXHTML atrXhtml = (AttributeValueXHTML) contentAt;

							String msg = "_UI_Reqif10XhtmlIsSimplifiedFalse";

							if (atrXhtml.isSimplified())
								msg = "_UI_Reqif10XhtmlIsSimplifiedTrue";

							tip = showTooltip(Display.getDefault()
									.getActiveShell(), displayPointer.x + 10,
									displayPointer.y + 10,
									Reqif10EditorPlugin.INSTANCE.getString(msg));

						}

					}

				}
				}
			}
		};

		agileGrid.addListener(SWT.Dispose, l);
		agileGrid.addListener(SWT.KeyDown, l);
		agileGrid.addListener(SWT.MouseMove, l);
		agileGrid.addListener(SWT.MouseHover, l);

	}

	/**
	 * This method creates and returns a new shell displaying a tooltip.
	 */
	private Shell showTooltip(Shell parent, int x, int y, String msg) {
		Shell tooltip = new Shell(parent, SWT.TOOL | SWT.ON_TOP);
		tooltip.setLayout(new GridLayout());

		tooltip.setBackground(tooltip.getDisplay().getSystemColor(
				SWT.COLOR_INFO_BACKGROUND));
		tooltip.setBackgroundMode(SWT.INHERIT_FORCE);

		Label lbContent = new Label(tooltip, SWT.NONE);
		lbContent.setText(msg);

		Point lbContentSize = lbContent.computeSize(SWT.DEFAULT, SWT.DEFAULT);

		int width = lbContentSize.x + 10;
		int height = lbContentSize.y + 10;

		tooltip.setBounds(x, y, width, height);
		tooltip.setVisible(true);
		return tooltip;
	}

}
