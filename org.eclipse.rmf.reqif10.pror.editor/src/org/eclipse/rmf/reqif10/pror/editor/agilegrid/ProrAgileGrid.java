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
import org.agilemore.agilegrid.Cell;
import org.agilemore.agilegrid.CellNavigationStrategy;
import org.agilemore.agilegrid.EditorActivationEvent;
import org.agilemore.agilegrid.ICellNavigationStrategy;
import org.agilemore.agilegrid.ILayoutAdvisor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MenuDetectEvent;
import org.eclipse.swt.events.MenuDetectListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;

/**
 * We override the default implementation to slightly change the behavior when
 * opening the context menu.
 * 
 * @author jastram
 * 
 */
public class ProrAgileGrid extends AgileGrid {

	public static final int DND_DROP_AS_SIBLING = 0;
	public static final int DND_DROP_AS_CHILD = 1;

	protected Cell dndHoverCell;
	protected int dndHoverDropMode;
	

	public ProrAgileGrid(Composite parent, int style) {
		super(parent, style);
		setCellNavigationStrategy(cyclingCellNavigationStrategy);
		
		// By default, the selection doesn't change if we right-click an
		// unselected cell. But that's what we want.
		
		addMenuDetectListener(new MenuDetectListener() {

			public void menuDetected(MenuDetectEvent e) {
				Point pos = toControl(e.x, e.y);
				Cell clickedCell = getCell(pos.x, pos.y);
				if (!isCellSelected(clickedCell.row, clickedCell.column)){
					clearSelection();
					focusCell(clickedCell, true);
				}else{
					focusCell(clickedCell, false);
				}
			}
		});
	}

	/**
	 * Returns the upper y-coordinate of a row. 
	 * Returns a negative value id the row does not exist or is invisible  
	 * @param row
	 * @return
	 */
	public int getYForRow(int row) {
		if (row < 0 || row > topRow + getRowsVisible() - 1) {
			return Integer.MIN_VALUE;
		}
		
		ILayoutAdvisor layoutAdvisor = getLayoutAdvisor();
		int fixedRowCount = layoutAdvisor.getFixedRowCount();

		if (row < fixedRowCount){
			return Integer.MIN_VALUE;
		}
		

		int y = getLinePixels();
		
		if (layoutAdvisor.isTopHeaderVisible()) {
			y += layoutAdvisor.getTopHeaderHeight();
			y += getLinePixels();
		}
		
		for (int i = 0; i < fixedRowCount; i++) {
			if (row == i) {
				return y;
			}
			y += layoutAdvisor.getRowHeight(i);
			y += getLinePixels();
		}
		
		for (int i = topRow; i <= topRow + getRowsVisible() - 1; i++) {
			if (row == i) {
				return y;
			}
			y += layoutAdvisor.getRowHeight(i);
			y += getLinePixels();
		}		
		

		return Integer.MIN_VALUE;
	}
	
	@Override
	public void triggerEditorActivationEvent(
			EditorActivationEvent editorActivationEvent, Object hint) {
		if (editorActivationEvent.eventType == EditorActivationEvent.KEY_PRESSED
				&& editorActivationEvent.keyCode == SWT.DEL) {
			/*
			 * This is a workaround for Bug 374183 - Deleting multiple
			 * SpecElements in Specification editor via DEL key does not work No
			 * need to activate an Editor since the rows are deleted. Activating
			 * the editor would reset the selection to one single cell
			 */
			return;
		}
		super.triggerEditorActivationEvent(editorActivationEvent, hint);
	}
	
	protected ICellNavigationStrategy cyclingCellNavigationStrategy = new CellNavigationStrategy() {
		@Override
		public Cell findSelectedCell(AgileGrid agileGrid, Cell currentCell,
				Event event) {
			if(event.type != SWT.KeyDown || event.keyCode != SWT.TAB)
				return super.findSelectedCell(agileGrid, currentCell, event);
			
			Cell findSelectedCell = super.findSelectedCell(agileGrid, currentCell, event);
			System.out.println(findSelectedCell);
			if(findSelectedCell == null || findSelectedCell == currentCell) {
				int direction = (event.stateMask & SWT.SHIFT) != 0 ? AgileGrid.LEFT :
						 AgileGrid.RIGHT;
						findSelectedCell = getCyclingNeighbor(currentCell, direction, true);
							
			}
			return findSelectedCell;
		}
	};
	
	public Cell getCyclingNeighbor(Cell cell, int directionMask, boolean sameLevel) {
		Cell neighborCell = null;
		if	((directionMask & RIGHT) == RIGHT	&& cell.column == getLayoutAdvisor().getColumnCount() - 1) {
			neighborCell = getLayoutAdvisor().mergeInto(cell.row+1, 0);
		}
		if	((directionMask & LEFT) == LEFT	&& cell.column == 0 && cell.row > 0) {
			neighborCell = getLayoutAdvisor().mergeInto(cell.row-1, getLayoutAdvisor().getColumnCount()-1);
		}
		return neighborCell != null ?  neighborCell : cell;
	};
	
}
