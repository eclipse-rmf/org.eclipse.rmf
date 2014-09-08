package org.eclipse.rmf.reqif10.search.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.search.ui.ISearchQuery;
import org.eclipse.search.ui.ISearchResult;
import org.eclipse.search.ui.ISearchResultListener;

/**
 * @author Hussein MHANNA
 * 
 */
public class UsageSearchResult implements ISearchResult {

	private final ReqIFSearchQuery query;

	private final Set<Object> searchEntries;

	private final Collection<ISearchResultListener> searchResultListeners = new ArrayList<ISearchResultListener>();

	public UsageSearchResult(final ReqIFSearchQuery query) {
		this.query = query;
		this.searchEntries = new HashSet<Object>();
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
		String resourceName = getResourceSet().getResources().get(0).getURI()
				.lastSegment();
		StringBuilder stringBuilder = new StringBuilder("Search in file '")
				.append(resourceName).append("' - result : ")
				.append(searchEntries.size()).append(" occurences");
		return stringBuilder.toString();
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
	public Set<Object> getSearchEntries() {
		return searchEntries;
	}

	public void addSearchEntry(String string) {
		searchEntries.add(string);
	}

	public ResourceSet getResourceSet() {
		return query.getResourceSet();
	}
}
