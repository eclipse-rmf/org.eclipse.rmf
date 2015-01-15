/*******************************************************************************
 * Copyright (c) 2014 Formal Mind GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.search.filter.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.DialogPage;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.pror.editor.IReqifEditor;
import org.eclipse.rmf.reqif10.pror.editor.presentation.SpecificationEditor;
import org.eclipse.rmf.reqif10.search.filter.IFilter;
import org.eclipse.rmf.reqif10.search.filter.SimpleCompoundFilter;
import org.eclipse.rmf.reqif10.search.ui.ReqIFSearchUIPlugin;
import org.eclipse.rmf.reqif10.search.ui.UsageSearchResult;
import org.eclipse.search.ui.ISearchPage;
import org.eclipse.search.ui.ISearchPageContainer;
import org.eclipse.search.ui.ISearchQuery;
import org.eclipse.search.ui.ISearchResult;
import org.eclipse.search.ui.NewSearchUI;
import org.eclipse.search2.internal.ui.SearchView;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

/**
 * The actual search page, which allows the creation of filter criteria. These
 * are realized as {@link FilterPanel}s.
 * 
 * Each {@link FilterPanel} consists of {@link FilterControl}s.
 * 
 * @author jastram
 */
@SuppressWarnings("restriction")
public class ReqIFSearchPage extends DialogPage implements ISearchPage {

	/**
	 * Stores the last search during a session.
	 */
	private static Map<ReqIF, SimpleCompoundFilter> lastSearches = new HashMap<ReqIF, SimpleCompoundFilter>();

	/** Must only contains {@link FilterPanel}s! */
	private Composite pane;

	private Button and;
	private Button or;

	/** A search always relates to a {@link ReqIF}. */
	private ReqIF reqif;

	private static IPartListener2 listener;

	@Override
	public void createControl(Composite parent) {
		// Setup the Layout
		parent.setLayout(new GridLayout());
		setControl(parent);

		// Forbit use without a ReqIF.
		reqif = getReqifEditor() != null ? getReqifEditor().getReqif() : null;
		if (reqif == null) {
			createNoSearchMessage(parent);
			return;
		}

		// Buildt the GUI
		Composite toolbar = createToolbar(parent);
		createAndButton(toolbar);
		createOrButton(toolbar);
		createAddButton(toolbar);
		createClearButton(toolbar);
		pane = createPane(parent);

		// Restore previous filters.
		restoreFilter();

		// The plugin help-id is broken.
		PlatformUI
				.getWorkbench()
				.getHelpSystem()
				.setHelp(parent,
						"org.eclipse.rmf.reqif10.search.ui.reqifSearchHelp");

		attachPartListener();
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		// Required, so that the correct help is shown.
		if (true)
			pane.setFocus();
	}

	private void createNoSearchMessage(Composite parent) {
		Label label = new Label(parent, SWT.NONE);
		label.setText("Please activate a ReqIF Editor before starting search.");
		label.setLayoutData(new GridData(GridData.CENTER, SWT.CENTER, true,
				true));
	}

	private Composite createToolbar(Composite parent) {
		Composite toolbar = new Composite(parent, SWT.NONE);
		toolbar.setLayout(new GridLayout(4, false));
		toolbar.setLayoutData(new GridData(GridData.FILL, SWT.CENTER, true,
				false));
		return toolbar;
	}

	private void createAndButton(Composite toolbar) {
		and = new Button(toolbar, SWT.RADIO);
		and.setText("Match all");
		and.setSelection(true);
	}

	private void createOrButton(Composite toolbar) {
		or = new Button(toolbar, SWT.RADIO);
		or.setText("Match any");
	}

	private void createClearButton(Composite toolbar) {
		Button clear = new Button(toolbar, SWT.PUSH);
		clear.setText("Clear");
		clear.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
		clear.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				for (Control control : pane.getChildren()) {
					control.dispose();
				}
				pane.pack();
			}
		});
	}

	private void createAddButton(Composite toolbar) {
		Button add = new Button(toolbar, SWT.PUSH);
		add.setText("Add new");
		add.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, true, false));
		add.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FilterPanel filterPanel = new FilterPanel(pane, reqif);
				filterPanel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
						true, false));
				pane.pack();
			}
		});
	}

	private Composite createPane(Composite parent) {
		ScrolledComposite sc = new ScrolledComposite(parent, SWT.V_SCROLL
				| SWT.NONE);
		sc.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
		sc.setBackground(parent.getBackground());
		Composite pane = new Composite(sc, SWT.NONE);
		pane.setLayout(new GridLayout());
		sc.setContent(pane);
		sc.setExpandHorizontal(true);
		return pane;
	}

	private void restoreFilter() {
		SimpleCompoundFilter wrapperFilter = lastSearches.get(reqif);
		if (wrapperFilter == null)
			return;

		or.setSelection(wrapperFilter.isOrFilter());
		and.setSelection(!wrapperFilter.isOrFilter());

		for (IFilter filter : wrapperFilter.getFilters()) {
			FilterPanel filterPanel = new FilterPanel(pane, reqif, filter);
			filterPanel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
					false));
		}
		pane.pack();
	}

	/**
	 * Looks for an active ReqIF editor.
	 * 
	 * @return the active ReqIF or null if none found.
	 */
	private IReqifEditor getReqifEditor() {
		IEditorPart editor = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (editor instanceof IReqifEditor) {
			return (IReqifEditor) editor;
		}
		if (editor instanceof SpecificationEditor) {
			return ((SpecificationEditor) editor).getReqifEditor();
		}
		return null;
	}

	@Override
	public boolean performAction() {
		SimpleCompoundFilter filter = getFilter();

		// Only search if we have filters.
		if (filter == null || filter.getFilters().size() == 0)
			return false;

		// Stores the current query as last query.
		lastSearches.put(reqif, filter);
		ISearchQuery query = new FilterSearchQuery(reqif, filter);

		NewSearchUI.runQueryInForeground(new ProgressMonitorDialog(getShell()),
				query);
		getSearchView().showSearchResult(query.getSearchResult());
		return true;
	}

	// Actual search, as taken from org.eclipse.rmf.reqif10.search.ui.page
	private SearchView getSearchView() {
		SearchView searchView = null;
		try {
			searchView = (org.eclipse.search2.internal.ui.SearchView) PlatformUI
					.getWorkbench().getActiveWorkbenchWindow().getActivePage()
					.showView(NewSearchUI.SEARCH_VIEW_ID);
		} catch (final PartInitException e) {
			ReqIFSearchUIPlugin.INSTANCE.log(e);
		}
		return searchView;
	}

	/**
	 * Saving the last search upon closing.
	 */
	@Override
	public void dispose() {
		if (getFilter() != null) {
			lastSearches.put(reqif, getFilter());
		}
		super.dispose();
	}

	/**
	 * Retrieves the filters from the pane in a {@link SimpleCompoundFilter}.
	 */
	private SimpleCompoundFilter getFilter() {
		if (pane == null)
			return null;
		ArrayList<IFilter> filters = new ArrayList<IFilter>();
		for (Control control : pane.getChildren()) {
			if (control instanceof FilterPanel) {
				IFilter filter = ((FilterPanel) control).getFilter();
				if (filter != null)
					filters.add(filter);
			}
		}

		return new SimpleCompoundFilter(filters, or.getSelection());
	}

	@Override
	public void setContainer(ISearchPageContainer container) {
	}

	/**
	 * We attach a part listener to close related searches in the Search view.
	 * There is only one (static) PartListener, which is created lazily.
	 */
	private void attachPartListener() {
		// Don't do anything if it already exists.
		if (listener != null) return;

		listener = new IPartListener2() {
			@Override
			public void partClosed(IWorkbenchPartReference partRef) {
				IWorkbenchPart part = partRef.getPart(false);
				if (!(part instanceof IReqifEditor)) {
					return;
				}

				ReqIF closingReqif = ((IReqifEditor) part).getReqif();

				ISearchResult searchResult = getSearchView()
						.getCurrentSearchResult();
				if (searchResult instanceof UsageSearchResult) {
					Set<Resource> keys = ((UsageSearchResult) searchResult)
							.getSearchEntries().keySet();
					for (Resource resource : keys) {
						if (resource.getURI().equals(
								closingReqif.eResource().getURI())) {
							getSearchView().showEmptySearchPage(partRef.getId());
							return;
						}
					}
				}
			}

			@Override
			public void partVisible(IWorkbenchPartReference partRef) {
			}

			@Override
			public void partOpened(IWorkbenchPartReference partRef) {
			}

			@Override
			public void partInputChanged(IWorkbenchPartReference partRef) {
			}

			@Override
			public void partHidden(IWorkbenchPartReference partRef) {
			}

			@Override
			public void partDeactivated(IWorkbenchPartReference partRef) {
			}

			@Override
			public void partBroughtToTop(IWorkbenchPartReference partRef) {
			}

			@Override
			public void partActivated(IWorkbenchPartReference partRef) {
			}
		};

		System.out.println("Attaching listener.");
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.addPartListener(listener);

	}

}
