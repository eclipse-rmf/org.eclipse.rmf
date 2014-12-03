package org.eclipse.rmf.reqif10.search.filter.ui;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.pror.filter.ReqifFilter;
import org.eclipse.rmf.reqif10.search.ui.UsageSearchResult;
import org.eclipse.search.ui.ISearchQuery;
import org.eclipse.search.ui.ISearchResult;

public class FilterSearchQuery implements ISearchQuery {
	private ReqifFilter filter;
	private ReqIF reqif;
	private UsageSearchResult usageSearchResult;

	public FilterSearchQuery(ReqIF reqif, ReqifFilter filter) {
		this.filter = filter;
		this.reqif = reqif;
	}

	@Override
	public IStatus run(IProgressMonitor monitor)
			throws OperationCanceledException {
		doRun(monitor);
		// TODO better status
		return Status.OK_STATUS;
	}

	@Override
	public ISearchResult getSearchResult() {
		return usageSearchResult;
	}

	@Override
	public String getLabel() {
		return "My Search Label";
	}

	@Override
	public boolean canRunInBackground() {
		return false;
	}

	@Override
	public boolean canRerun() {
		return false;
	}
	
	private void doRun(IProgressMonitor monitor) {
		monitor.beginTask("Searching...", IProgressMonitor.UNKNOWN);
		usageSearchResult = new UsageSearchResult(this);
		Map<Resource, Collection<EObject>> result = find(monitor);
		usageSearchResult.getSearchEntries().clear();
		usageSearchResult.getSearchEntries().putAll(result);
		monitor.done();
	}

	private Map<Resource, Collection<EObject>> find(IProgressMonitor monitor) {
		Map<Resource, Collection<EObject>> result = new HashMap<Resource, Collection<EObject>>();
		TreeIterator<Object> iterator = EcoreUtil.getAllContents(reqif, true);
		while (iterator.hasNext()) {
			Object obj = iterator.next();
			if (! (obj instanceof SpecElementWithAttributes)) continue;
			SpecElementWithAttributes specElement = (SpecElementWithAttributes)obj;
			if (filter.match(specElement)) {
				
				// First, find the resource
				Collection<EObject> collection = result.get(reqif.eResource());
				if (collection == null) {
					collection = new HashSet<EObject>();
					result.put(reqif.eResource(), collection);
				}
				collection.add(specElement);
			}
			
		}
		return result;
	}


}
