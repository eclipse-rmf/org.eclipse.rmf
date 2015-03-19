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

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.rmf.reqif10.search.criteria.Criteria;
import org.eclipse.rmf.reqif10.search.edit.util.ReqIFEditSearcher;
import org.eclipse.search.ui.ISearchQuery;
import org.eclipse.search.ui.ISearchResult;

/**
 * @author Hussein MHANNA
 * 
 */
public class ReqIFSearchQuery implements ISearchQuery {

	private String searchedText;
	/**
	 * The usage search result
	 */
	private UsageSearchResult usageSearchResult;
	private Collection<Resource> resources;
	private Collection<Criteria> criterias;

	private final ReqIFSearchPage page;

	/**
	 * @param operator
	 * @param iSelection
	 */
	public ReqIFSearchQuery(ReqIFSearchPage page, Collection<Criteria> criterias) {
		this.page = page;
		this.criterias = criterias;
	}

	/**
	 * Initialize the usage search entry collection. This will create the
	 * collection of the {@link SearchEntry} if it isn't created and this will
	 * call the clear method on the collection otherwise
	 */
	protected void initializeUsageSearchEntries() {
		if (usageSearchResult == null) {
			usageSearchResult = new UsageSearchResult(this);
		} else {
			usageSearchResult.getSearchEntries().clear();
		}
	}

	@Override
	public IStatus run(IProgressMonitor monitor)
			throws OperationCanceledException {
		initializeUsageSearchEntries();
		doRun(monitor);
		return Status.OK_STATUS;
	}

	private void doRun(IProgressMonitor monitor) {
		monitor.beginTask("Searching...", IProgressMonitor.UNKNOWN);
		StringBuilder searchedTextBuilder = new StringBuilder();
		for (Criteria criteria : criterias) {
			searchedTextBuilder.append(criteria.getSerachedText())
					.append(" - ");
		}
		this.searchedText = searchedTextBuilder.toString();
		this.resources = page.getEMFResources(page.getEditorsURIMap());
		Map<Resource, Collection<EObject>> result = ReqIFEditSearcher.find(
				monitor, resources, criterias, false);
		usageSearchResult.getSearchEntries().clear();
		usageSearchResult.getSearchEntries().putAll(result);
		monitor.done();
	}

	@Override
	public String getLabel() {
		return searchedText;
	}

	@Override
	public boolean canRerun() {
		return false;
	}

	@Override
	public boolean canRunInBackground() {
		return false;
	}

	@Override
	public ISearchResult getSearchResult() {
		return usageSearchResult;
	}
}
