/*******************************************************************************
 * Copyright (c) 2014 Hussein Mhanna
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Hussein Mhanna - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.search.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.search.ui.ISearchQuery;
import org.eclipse.search.ui.ISearchResult;
import org.eclipse.search.ui.ISearchResultListener;

/**
 * @author Hussein MHANNA
 */
public class UsageSearchResult implements ISearchResult {

	private final ISearchQuery query;

	private final Map<Resource, Collection<EObject>> searchEntries;

	private final Collection<ISearchResultListener> searchResultListeners = new ArrayList<ISearchResultListener>();

	public UsageSearchResult(final ISearchQuery query) {
		this.query = query;
		this.searchEntries = new HashMap<Resource, Collection<EObject>>();
	}

	/**
	 * do nothing
	 * 
	 */
	@Override
	public void addListener(final ISearchResultListener l) {
		searchResultListeners.add(l);
	}

	/**
	 * do nothing
	 */
	@Override
	public void removeListener(final ISearchResultListener l) {
		searchResultListeners.remove(l);
	}

	/**
	 * Return the label for this search result
	 * 
	 * @return The label for this search result
	 */
	@Override
	public String getLabel() {
		StringBuilder builder = new StringBuilder("Search in file(s) ");

		// add a maximum of 3 filenames
		int count = 0;
		for (Resource resource : searchEntries.keySet()) {
			builder.append(resource.getURI().lastSegment());
			if (++count > 2) {
				builder.append("..., ");
				break;
			} else {
				builder.append(", ");
			}
		}

		Collection<Collection<EObject>> entries = searchEntries.values();
		int total = 0;
		for (Collection<EObject> entry : entries) {
			total += entry.size();
		}

		builder.append("result: ").append(total).append(" matches");
		return builder.toString();
	}

	/**
	 * Return <code>null</code>
	 * 
	 * @return <code>null</code>
	 */
	@Override
	public String getTooltip() {
		return null;
	}

	/**
	 * Return <code>null</code>
	 * 
	 * @return <code>null</code>
	 */
	@Override
	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	/**
	 * Returns the query that produced this search result
	 * 
	 * @return the query producing this result
	 */
	@Override
	public ISearchQuery getQuery() {
		return query;
	}

	/**
	 * Return the collection of search entries
	 * 
	 * @return The collection of search entries
	 */
	public Map<Resource, Collection<EObject>> getSearchEntries() {
		return searchEntries;
	}
}
