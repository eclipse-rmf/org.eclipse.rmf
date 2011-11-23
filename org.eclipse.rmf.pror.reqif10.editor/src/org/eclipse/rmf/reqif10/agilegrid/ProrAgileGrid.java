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
import org.eclipse.swt.widgets.Composite;

/**
 * We override the default implementation to slightly change the behavior when
 * opening the context menu.
 * 
 * @author jastram
 * 
 */
public class ProrAgileGrid extends AgileGrid {

	public ProrAgileGrid(Composite parent, int style) {
		super(parent, style);

		// By default, the selection doesn't change if we right-click an
		// unselected cell. But that's what we want.
		// TODO This doesn't work, and therefore enableing this code is deceiving.
//		addMenuDetectListener(new MenuDetectListener() {
//
//			@Override
//			public void menuDetected(MenuDetectEvent e) {
//				Point pos = toControl(e.x, e.y);
//				Cell clickedCell = getCell(pos.x, pos.y);
//				if (!isCellSelected(clickedCell.row, clickedCell.column)) {
//					selectCells(new Cell[] { clickedCell });
//				}
//			}
//		});
	}

}
