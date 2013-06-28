/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 *     Said Salem - Refactoring of ProrRow
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor.agilegrid;

import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecRelation;

/**
 * Represents the row of a table. A row holds either a SpecHierarchy or a
 * SpecRelation.
 * 
 * @author salem
 * 
 */
public abstract class ProrRow {
	private int level;
	private int row;

	/**
	 * @ requires level >= 0 @ @ requires row >= 0 @
	 */
	private ProrRow(int row, int level) {
		this.row = row;
		this.level = level;
	}

	abstract public SpecElementWithAttributes getSpecElement();

	@Override
	public String toString() {
		return "Row " + row + " Level " + level + " : " + getSpecElement();
	}

	public int getLevel() {
		return level;
	}

	public int getRow() {
		return row;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public void setRow(int row) {
		this.row = row;
	}

	/**
	 * Factory method, element have to be an instance of SpecHierarchy or
	 * SpecRelation
	 */
	public static ProrRow createProrRow(Object element, int row, int level) {
		if (row < 0 || level < 0)
			throw new IndexOutOfBoundsException("row : " + row + " and level: "
					+ level + " have to be >= 0");
		if (element instanceof SpecRelation)
			return (new ProrRowSpecRelation((SpecRelation) element, row, level));
		else if (element instanceof SpecHierarchy)
			return (new ProrRowSpecHierarchy((SpecHierarchy) element, row,
					level));
		else if (element == null)
			throw new NullPointerException();
		else
			throw new IllegalArgumentException(
					element
							+ " have to be a SpecHierarchy object or a SpecRelation object ");
	}

	public static class ProrRowSpecHierarchy extends ProrRow {

		SpecHierarchy element;

		boolean showSpecRelation;

		private ProrRowSpecHierarchy(SpecHierarchy element, int row, int level,
				boolean showSpecRelation) {
			super(row, level);
			this.element = element;
			this.showSpecRelation = showSpecRelation;
		}

		private ProrRowSpecHierarchy(SpecHierarchy element, int row, int level) {
			this(element, row, level, false);
		}

		public SpecHierarchy getSpecHierarchy() {
			return element;
		}

		@Override
		public SpecElementWithAttributes getSpecElement() {
			return element.getObject();
		}
		
		public boolean isShowSpecRelation() {
			return showSpecRelation;
		}

		public void setShowSpecRelation(boolean showSpecRelation) {
			this.showSpecRelation = showSpecRelation;
		}

	}

	public static class ProrRowSpecRelation extends ProrRow {
		SpecRelation element;

		private ProrRowSpecRelation(SpecRelation element, int row, int level) {
			super(row, level);
			this.element = element;
		}

		@Override
		public SpecElementWithAttributes getSpecElement() {
			return element;
		}
	}

}