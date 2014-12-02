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
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.rmf.reqif10.pror.configuration.provider.ConfigurationItemProviderAdapterFactory;
import org.eclipse.rmf.reqif10.pror.editor.propertiesview.ProrPropertySheetPage;
import org.eclipse.rmf.reqif10.pror.provider.ReqIF10ItemProviderAdapterFactory;
import org.eclipse.rmf.reqif10.pror.provider.ReqIFContentItemProvider;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.eclipse.rmf.reqif10.xhtml.provider.XhtmlItemProviderAdapterFactory;
import org.eclipse.search.ui.ISearchResult;
import org.eclipse.search.ui.ISearchResultPage;
import org.eclipse.search.ui.ISearchResultViewPart;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.part.Page;
import org.eclipse.ui.views.properties.IPropertySheetPage;

public class ReqIFSearchResultPage extends Page implements ISearchResultPage,
		IAdaptable {

	/**
	 * The usage search result
	 */
	private UsageSearchResult searchResult;

	/**
	 * The id of this result page
	 */
	private String id;

	private TreeViewer treeViewer;
	private AdapterFactoryLabelProvider labelProvider;
	private AdapterFactoryContentProvider contentProvider;
	private Set<Object> objectsFound = new HashSet<Object>();
	private ComposedAdapterFactory adapterFactory;
	/**
	 * This is the property sheet page.
	 */
	protected ProrPropertySheetPage propertySheetPage;

	private ComposedAdapterFactory createAdapterFactory() {
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory();
		adapterFactory
				.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new ReqIF10ItemProviderAdapterFactory() {
					@Override
					public Adapter createReqIFContentAdapter() {
						return new ReqIFContentItemProvider(this);
					}
				});
		adapterFactory.addAdapterFactory(new XhtmlItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new ConfigurationItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
		return adapterFactory;
	}

	@Override
	public void createControl(final Composite parent) {
		treeViewer = new TreeViewer(parent);
		adapterFactory = createAdapterFactory();
		labelProvider = new AdapterFactoryLabelProvider(adapterFactory) {
			@Override
			public String getText(Object object) {
				if (object instanceof EObject) {
					ProrUtil.getItemProvider(adapterFactory, object).getText(
							object);
				}
				return super.getText(object);
			}
		};
		treeViewer.setLabelProvider(labelProvider);
		contentProvider = new AdapterFactoryContentProvider(adapterFactory) {
			@Override
			public Object[] getElements(Object object) {
				if (object instanceof Collection<?>) {
					return ((Collection<?>) object).toArray();
				}
				return super.getElements(object);
			}
		};
		treeViewer.setContentProvider(contentProvider);
		ViewerFilter viewerFilter = new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement,
					Object element) {
				if (objectsFound.contains(element)) {
					return true;
				}
				return false;
			}
		};
		treeViewer.addFilter(viewerFilter);
		getSite().setSelectionProvider(treeViewer);
	}

	@Override
	public Object getUIState() {
		return treeViewer.getSelection();
	}

	@Override
	public void setInput(final ISearchResult searchResult, final Object uiState) {
		if (searchResult instanceof UsageSearchResult) {
			this.searchResult = (UsageSearchResult) searchResult;

			Set<Object> objects = new HashSet<Object>();
			Map<Resource, Collection<EObject>> resultMap = this.searchResult
					.getSearchEntries();
			for (Entry<Resource, Collection<EObject>> entry : resultMap
					.entrySet()) {
				if (false == entry.getValue().isEmpty()) {
					objects.addAll(entry.getValue());
				}
			}

			objectsFound.clear();
			objectsFound.addAll(objects);
			Set<Resource> inputSet = new HashSet<Resource>();
			for (Object object : objects) {
				Object temp = contentProvider.getParent(object);
				while (temp != null) {
					if (temp instanceof Resource) {
						inputSet.add((Resource) temp);
					}
					objectsFound.add(temp);
					temp = contentProvider.getParent(temp);
				}

			}
			treeViewer.setInput(inputSet);
			treeViewer.expandAll();
		} else {
			treeViewer.setInput(null);
		}
	}

	@Override
	public void setViewPart(final ISearchResultViewPart part) {
		// do nothing
	}

	/**
	 * Do nothing
	 * 
	 * @param memento
	 *            : A memento to restore the page state from or
	 *            <code>null</code> if no previous state was saved
	 */
	@Override
	public void restoreState(final IMemento memento) {
		// do nothing
	}

	/**
	 * Do nothing
	 * 
	 * @param memento
	 *            : A memento to restore the page state from or
	 *            <code>null</code> if no previous state was saved
	 */
	@Override
	public void saveState(final IMemento memento) {
		// do nothing
	}

	/**
	 * Sets the id for this page.
	 * 
	 * @param id
	 *            the id for this page
	 */
	@Override
	public void setID(final String id) {
		this.id = id;
	}

	/**
	 * Returns the id set via <code>setID</code>.
	 * 
	 * @return the id of this page
	 */
	@Override
	public String getID() {
		return id;
	}

	/**
	 * Return the label of the result
	 * 
	 * @return The label of the {@link ISearchResult}
	 */
	@Override
	public String getLabel() {
		return searchResult == null ? "" : searchResult.getLabel();
	}

	/**
	 * Returns the SWT control for this page
	 * 
	 * @return {@link TableViewer#getControl()}
	 */
	@Override
	public Control getControl() {
		return treeViewer.getControl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setFocus() {
		treeViewer.getControl().setFocus();
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class key) {
		if (key.equals(IPropertySheetPage.class)) {
			return getPropertySheetPage();
		}
		return null;
	}

	private ProrPropertySheetPage getPropertySheetPage() {
		if (propertySheetPage == null) {
			propertySheetPage = new ProrPropertySheetPage(null, adapterFactory);
		}

		return propertySheetPage;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void dispose() {
		if (adapterFactory != null) {
			adapterFactory.dispose();
		}
		if (contentProvider != null) {
			contentProvider.dispose();
		}
		if (labelProvider != null) {
			labelProvider.dispose();
		}
		objectsFound.clear();
		super.dispose();
	}

}
