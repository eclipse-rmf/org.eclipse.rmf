/*******************************************************************************
 * Copyright (c) 2011, 2013 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 *     Ingo Weigelt - support for incoming Links
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor.agilegrid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.agilemore.agilegrid.AbstractContentProvider;
import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.IContentProvider;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.configuration.Column;
import org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.UnifiedColumn;
import org.eclipse.rmf.reqif10.pror.editor.agilegrid.ProrRow.ProrRowSpecHierarchy;
import org.eclipse.rmf.reqif10.pror.editor.agilegrid.ProrRow.ProrRowSpecRelation;
import org.eclipse.rmf.reqif10.pror.filter.ReqifFilter;

/**
 * This ContentProvider manages a {@link Specification}, to be displayed in an
 * {@link AgileGrid}.
 */
public class ProrAgileGridContentProvider extends AbstractContentProvider {

	private final Specification root;
	final ProrSpecViewConfiguration specViewConfig;
	private ArrayList<ProrRow> cache = null;
	private Map<Object, ProrRow> rowMap = new HashMap<Object, ProrRow>();

	private boolean showSpecRelations;
	private ReqifFilter filter;

	public ProrAgileGridContentProvider(Specification specification,
			ProrSpecViewConfiguration specViewConfig) {
		this.root = specification;
		this.specViewConfig = specViewConfig;

		// TODO We want to be more nuanced.
		specification.eAdapters().add(new EContentAdapter() {
			@Override
			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);
				if (notification.getEventType() == Notification.ADD
						|| notification.getEventType() == Notification.ADD_MANY
						|| notification.getEventType() == Notification.MOVE
						|| notification.getEventType() == Notification.REMOVE
						|| notification.getEventType() == Notification.REMOVE_MANY
						|| notification.getEventType() == Notification.SET
						|| notification.getEventType() == Notification.UNSET) {
					flushCache();
				}
			}
		});
	}

	/**
	 * Sets a filter. The null argument resets filtering.
	 */
	public void setFilter(ReqifFilter filter) {
		if (filter != this.filter) {
			this.filter = filter;
			flushCache();
		}
	}

	/**
	 * Returns the {@link AttributeValue} for the given column for the element
	 * associated with the row. May return null.
	 */
	@Override
	public Object doGetContentAt(int row, int col)
			throws IndexOutOfBoundsException {
		if (row >= getCache().size()) {
			throw new IndexOutOfBoundsException("Row does not exist: " + row);
		}

		ProrRow prorRow = getCache().get(row);
		if (!prorRow.isVisible()) {
			return null;
		}

		SpecElementWithAttributes element = prorRow.getSpecElement();

		if (col == specViewConfig.getColumns().size()) {
			if (prorRow instanceof ProrRowSpecRelation){
				return ((ProrRowSpecRelation) prorRow).getWrappedSpecRelation();
			}
			if (element instanceof SpecElementWithAttributes ){
				return element;
			}
			return null;
			
//			// For the Link column, we return the linked element.
		} else if (col <= specViewConfig.getColumns().size()) {
			// we return the AttributeValue.
			return getValueForColumn(element, row, col);
		} else {
			throw new IndexOutOfBoundsException("Column does not exist: " + col);
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
		for (ProrRow row : getCache()) {
			if (row instanceof ProrRowSpecHierarchy)
				((ProrRowSpecHierarchy) row).setShowSpecRelation(status);
		}
		flushCache();
	}

	/**
	 * Whether to show {@link SpecRelation}s as part of the Content.
	 */
	public boolean getShowSpecRelations() {
		return this.showSpecRelations;
	}

	/**
	 * Finds the Object for the given row, which may be a SpecHierarchy or
	 * SpecRelation.
	 */
	public ProrRow getProrRow(int row) {
		if (row >= 0) {
			return getCache().get(row);
		}
		return null;
	}

	public void flushCache() {
		cache = null;
	}

	/**
	 * Uses a Job to provider feedback to the user.
	 * 
	 * @return
	 */
	private ArrayList<ProrRow> getCache() {
		if (cache == null) {
			ArrayList<ProrRow> tmpCache = new ArrayList<ProrRow>();
			recurseSpecHierarchyForRow(0, 0, root.getChildren(), tmpCache);
			cache = tmpCache;
		}
		return cache;
	}

	private ProrRow getProrRowForSpecElement(Object e, int row, int level) {
		ProrRow prorRow = rowMap.get(e);
		if (prorRow == null) {
			prorRow = ProrRow.createProrRow(e, row, level);
			rowMap.put(e, prorRow);
		} else {
			prorRow.setRow(row);
			prorRow.setLevel(level);
			
			if (prorRow instanceof ProrRowSpecRelation && e instanceof WrappedSpecRelation){
				ProrRowSpecRelation sRRow = (ProrRowSpecRelation) prorRow;
				WrappedSpecRelation relation = (WrappedSpecRelation) e;
				if (relation.isSource() != sRRow.isSource()){
					throw new IllegalArgumentException();
				}
			}
			
		}
		return prorRow;
	}

	/**
	 * 
	 * @param current
	 *            The current counter
	 * @param elements
	 *            The {@link SpecHierarchy}s to traverse, Can be SpecHierarchies
	 *            or SpecRelations
	 * @param tmpCache
	 * @return either the {@link ProrRow} with the given row, or the new current
	 *         row
	 */
	private int recurseSpecHierarchyForRow(int current, int depth,
			List<SpecHierarchy> elements, ArrayList<ProrRow> tmpCache) {
		for (SpecHierarchy element : elements) {
			ProrRowSpecHierarchy prorRowSH = (ProrRowSpecHierarchy) getProrRowForSpecElement(
					element, current, depth);
			if (filter != null && !filter.match(element.getObject())) {
				prorRowSH.setVisible(false);
			} else {
				prorRowSH.setVisible(true);
			}
			tmpCache.add(current, prorRowSH);
			if (prorRowSH.isShowSpecRelation()) {
				for (WrappedSpecRelation wrappedSpecRelation : getSpecRelationsFor(element)) {
					//SpecRelation specRelation = specRelationRow.getSpecRelation();
					++current;
					ProrRowSpecRelation prorRowSR = (ProrRowSpecRelation) getProrRowForSpecElement(
							wrappedSpecRelation, current, depth + 1);
					tmpCache.add(current, prorRowSR);
				}
			}
			int result = recurseSpecHierarchyForRow(++current, depth + 1,
					element.getChildren(), tmpCache);
			current = result;
		}
		return current;
	}

	/**
	 * Returns the actual {@link AttributeValue} for the given Column and the
	 * given {@link SpecElementWithUserDefinedAttributes}
	 */
	AttributeValue getValueForColumn(SpecElementWithAttributes element,
			int row, int col) {
		// Knock-out criteria
		if (element == null)
			return null;
		if (col >= specViewConfig.getColumns().size())
			return null;

		// Handle the Unified Column
		Column column = specViewConfig.getColumns().get(col);
		if (column instanceof UnifiedColumn) {
			return handleUnifiedColumn(element);
		}

		String label = column.getLabel();

		return ReqIF10Util.getAttributeValueForLabel(element, label);
	}

	/**
	 * The unified column combines ReqIF.ChapterName and ReqIF.Text. It exists as a
	 * convenience for users of classical DOORS, which shows those two attributes
	 * in the same column.
	 */
	private AttributeValue handleUnifiedColumn(SpecElementWithAttributes element) {
		AttributeValue chapterName = ReqIF10Util.getAttributeValueForLabel(element,
				"ReqIF.ChapterName");		
		AttributeValue text = ReqIF10Util.getAttributeValueForLabel(element, "ReqIF.Text");

		// Handle just text.
		if (chapterName == null || ReqIF10Util.getTheValue(chapterName) == null) {
			return text;
		}
		if (text == null || ReqIF10Util.getTheValue(text) == null) {
			return text;
		}
		
		// combine create warning
		AttributeValueString warning = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		warning.setTheValue("WARNING: Unified column cannot render, as both ReqIF.Text and"
				+ " ReqIF.ChapterName are set. You can (1) delete one of those values, or"
				+ " (2) don't use the Unified Column, but two separate columns.");
		return warning;
		
	}

	/**
	 * Returns the SpecRelations that use the given SpecObject (via the given
	 * SpecHierarchy) as a source. This method checks {@link #showSpecRelations}
	 * and returns immediately if it is false.
	 */
	protected List<WrappedSpecRelation> getSpecRelationsFor(SpecHierarchy specHierarchy) {
		if (specHierarchy.getObject() == null)
			return Collections.emptyList();
		SpecObject source = specHierarchy.getObject();
		ReqIF reqif = ReqIF10Util.getReqIF(source);
		// Can happen if source is detached from the reqif model (e.g. just
		// being deleted)
		if (reqif == null)
			return Collections.emptyList();
		List<WrappedSpecRelation> list = new ArrayList<WrappedSpecRelation>();
		for (SpecRelation relation : reqif.getCoreContent().getSpecRelations()) {
			if (source.equals(relation.getSource())) {
				WrappedSpecRelation specRelationRow = new WrappedSpecRelation(relation,
						true);
				list.add(specRelationRow);
			} else if (source.equals(relation.getTarget())) {
				WrappedSpecRelation specRelationRow = new WrappedSpecRelation(relation,
						false);
				list.add(specRelationRow);
			}
		}
		return list;
	}
	


	public void updateElement(SpecElementWithAttributes element) {
		recurseUpdateElement(0, element, root.getChildren());
		flushCache();
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

				ProrRow prorRow = rowMap.get(specHierarchy);
				if (prorRow != null && prorRow instanceof ProrRowSpecHierarchy) {
					if (((ProrRowSpecHierarchy) prorRow).isShowSpecRelation())
						children.addAll(getSpecRelationsFor(specHierarchy));
				}

				if (element.equals(specHierarchy.getObject())) {
					refresh = true;
				}
			}
			// Workaround: provide null for "old value" to force a recognition
			// of
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
		return getCache().size();
	}	
	
	public Map<Object, ProrRow> getRowMap() {
		return rowMap;
	}
}
