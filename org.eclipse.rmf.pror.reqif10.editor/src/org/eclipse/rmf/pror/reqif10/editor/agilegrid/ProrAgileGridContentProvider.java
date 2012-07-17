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
package org.eclipse.rmf.pror.reqif10.editor.agilegrid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.agilemore.agilegrid.AbstractContentProvider;
import org.agilemore.agilegrid.IContentProvider;
import org.eclipse.rmf.pror.reqif10.configuration.ProrSpecViewConfiguration;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

/**
 */
public class ProrAgileGridContentProvider extends AbstractContentProvider {

	private final Specification root;
	private final ProrSpecViewConfiguration specViewConfig;

	private boolean showSpecRelations;

	public ProrAgileGridContentProvider(Specification specHierarchyRoot,
			ProrSpecViewConfiguration specViewConfig) {
		this.root = specHierarchyRoot;
		this.specViewConfig = specViewConfig;
	}

	/**
	 * Returns the {@link AttributeValue} for the given column for the element
	 * associated with the row. May return null.
	 */
	@Override
	public Object doGetContentAt(int row, int col) throws IndexOutOfBoundsException {
		if (row >= getRowCount())
			throw new IndexOutOfBoundsException("Row does not exist: " + row);
		SpecElementWithAttributes element = getProrRow(row)
				.getSpecElement();

		if (col == specViewConfig.getColumns().size()) {
			// For the Link column, we return the linked element.
			return element instanceof SpecElementWithAttributes ? element
					: null;
		} else {
			// For everything else, we return the AttributeValue.
			return getValueForColumn(element, col);
		}
	}

	/**
	 * Changes the Value through the editing domain if it has changed.
	 * <p>
	 * 
	 * We don't need to change anything here, as changing the
	 * {@link AttributeValue} automagically updates the model.
	 */
	@Override
	public void doSetContentAt(int row, int col, Object newValue) {
	}

	/**
	 * Whether to show {@link SpecRelation}s as part of the Content.
	 * 
	 * @param status
	 */
	public void setShowSpecRelations(boolean status) {
		this.showSpecRelations = status;
	}

	/**
	 * Whether to show {@link SpecRelation}s as part of the Content.
	 */
	public boolean getShowSpecRelations() {
		return this.showSpecRelations;
	}

	/**
	 * Finds the Object for the given row, which may be a SpecHierarchy or
	 * SpecRelation. It basically traverses the tree structure of the root,
	 * counting the steps.
	 * <p>
	 * 
	 * TODO Serious potential for performance tuning.
	 */
	ProrRow getProrRow(int row) {
		return recurseSpecHierarchyForRow(0, row, 0, root.getChildren());
	}

	/**
	 * Recurses over the given children.
	 * 
	 * @param current
	 *            The current counter
	 * 
	 * @param children
	 *            The {@link SpecHierarchy}s to traverse
	 * 
	 * @return The {@link SpecHierarchy} where row == current, or null if not
	 *         found.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private ProrRow recurseSpecHierarchyForRow(int current, int row, int depth,
			List elements) {
		for (Object element : elements) {
			if (current == row) {
				return new ProrRow(element, row, depth);
			}
			current++;
			if (element instanceof SpecHierarchy) {
				List children = new ArrayList();
				children.addAll(getSpecRelationsFor((SpecHierarchy) element));
				children.addAll(((SpecHierarchy) element).getChildren());
				ProrRow result = recurseSpecHierarchyForRow(current, row,
						depth + 1,
						children);
				if (result.element != null) {
					return result;
				}
				current = result.row;
			}
		}
		return new ProrRow(null, current, depth);
	}

	/**
	 * Returns the actual {@link AttributeValue} for the given Column and the
	 * given {@link SpecElementWithUserDefinedAttributes}
	 */
	AttributeValue getValueForColumn(
			SpecElementWithAttributes element, int col) {
		// Knock-out criteria
		if (element == null)
			return null;
		if (col >= specViewConfig.getColumns().size())
			return null;

		String label = specViewConfig.getColumns().get(col).getLabel();

		return ReqIF10Util.getAttributeValueForLabel(element, label);
	}

	/**
	 * Returns the SpecRelations that use the given SpecObject (via the given
	 * SpecHierarchy) as a source. This method checks {@link #showSpecRelations}
	 * and returns immediately if it is false.
	 */
	private List<SpecRelation> getSpecRelationsFor(SpecHierarchy specHierarchy) {
		// System.out.println("showSpecRelations: " + showSpecRelations + " - "
		// + this);
		if (!showSpecRelations || specHierarchy.getObject() == null) {
			return Collections.emptyList();
		}
		SpecObject source = specHierarchy.getObject();
		ReqIF rif = ReqIF10Util.getReqIF(source);
		List<SpecRelation> list = new ArrayList<SpecRelation>();
		for (SpecRelation relation : rif.getCoreContent().getSpecRelations()) {
			if (source.equals(relation.getSource())) {
				list.add(relation);
			}
		}
		return list;
	}

	/**
	 * Represents the row of a table. A row holds either a SpecHierarchy or a
	 * SpecRelation.
	 */
	class ProrRow {
		final Object element;
		final int level;
		final int row;

		/**
		 * @ requires level >= 0 @
		 * @ requires row >= 0 @
		 */
		public ProrRow(Object element, int row, int level) {
			this.element = element;
			this.row = row;
			this.level = level;
		}

		public SpecElementWithAttributes getSpecElement() {
			if (element instanceof SpecRelation)
				return (SpecRelation) element;
			return ((SpecHierarchy) element).getObject();
		}

		public SpecHierarchy getSpecHierarchy() {
			return element instanceof SpecHierarchy ? (SpecHierarchy) element
					: null;
		}

		@Override
		public String toString() {
			return "Row " + row + " Level " + level + ": " + element;
		}
	}

	void updateElement(SpecElementWithAttributes element) {
		recurseUpdateElement(0, element, root.getChildren());
	}

	/**
	 * Recurses over all SpecHierarchies and updates wherever it finds the given
	 * specObject. As a specObject can appear multiple time, we have to cover
	 * the whole tree.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private int recurseUpdateElement(int row,
			SpecElementWithAttributes element, List list) {
		for (Object entry : list) {
			List children = new ArrayList();
			boolean refresh = false;
			if (element instanceof SpecRelation && element.equals(entry)) {
				refresh = true;
			} else if (entry instanceof SpecHierarchy) {
				SpecHierarchy specHierarchy = (SpecHierarchy) entry;
				children.addAll(specHierarchy.getChildren());
				if (showSpecRelations) {
					children.addAll(getSpecRelationsFor(specHierarchy));
				}

				if (element.equals(specHierarchy.getObject())) {
					refresh = true;
				}
			}
			// Workaround: provide null for "old value" to force a recognition of
			// the change.
			if (refresh) {
				firePropertyChange(IContentProvider.Content, row, 0, null,
						entry);
			}
			row++;
			row = recurseUpdateElement(row, element, children);
		}
		return row;
	}

	public int getRowCount() {
		HashSet<SpecHierarchy> set = new HashSet<SpecHierarchy>(
				root.getChildren());
		int count = 0;
		while (!set.isEmpty()) {
			SpecHierarchy specHierarchy = set.iterator().next();
			count++;
			set.remove(specHierarchy);
			set.addAll(specHierarchy.getChildren());
			if (showSpecRelations) {
				count += getSpecRelationsFor(specHierarchy).size();
			}
		}
		return count;
	}

}
