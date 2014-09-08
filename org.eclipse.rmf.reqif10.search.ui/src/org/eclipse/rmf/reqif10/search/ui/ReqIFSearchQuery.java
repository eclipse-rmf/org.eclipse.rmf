package org.eclipse.rmf.reqif10.search.ui;

import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.EditingDomain;
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
	private ResourceSet resourceSet;
	private Collection<Criteria> criterias;
	private EditingDomain editingDomain;

	/**
	 * @param operator
	 * @param iSelection
	 */
	public ReqIFSearchQuery(EditingDomain editingDomain,
			Collection<Criteria> criterias) {
		StringBuilder searchedTextBuilder = new StringBuilder();
		for (Criteria criteria : criterias) {
			searchedTextBuilder.append(criteria.getSerachedText())
					.append(" - ");
		}
		this.editingDomain = editingDomain;
		this.searchedText = searchedTextBuilder.toString();
		this.resourceSet = editingDomain.getResourceSet();
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
		Collection<EObject> result = ReqIFEditSearcher.find(resourceSet,
				criterias);
		usageSearchResult.getSearchEntries().addAll(result);
		monitor.done();
	}

	public UsageSearchResult getUsageSearchResult() {
		return usageSearchResult;
	}

	@Override
	public String getLabel() {
		return searchedText;
	}

	@Override
	public boolean canRerun() {
		return true;
	}

	@Override
	public boolean canRunInBackground() {
		return true;
	}

	@Override
	public ISearchResult getSearchResult() {
		return usageSearchResult;
	}

	public ResourceSet getResourceSet() {
		return resourceSet;
	}

	public EditingDomain getEditingDomain() {
		return editingDomain;
	}
}
