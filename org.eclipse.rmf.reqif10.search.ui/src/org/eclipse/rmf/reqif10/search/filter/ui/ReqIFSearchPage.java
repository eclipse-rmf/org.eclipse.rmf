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

import org.eclipse.jface.dialogs.DialogPage;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.pror.editor.presentation.Reqif10Editor;
import org.eclipse.rmf.reqif10.pror.editor.presentation.SpecificationEditor;
import org.eclipse.rmf.reqif10.search.filter.IFilter;
import org.eclipse.rmf.reqif10.search.filter.SimpleCompoundFilter;
import org.eclipse.rmf.reqif10.search.ui.ReqIFSearchUIPlugin;
import org.eclipse.search.ui.ISearchPage;
import org.eclipse.search.ui.ISearchPageContainer;
import org.eclipse.search.ui.ISearchQuery;
import org.eclipse.search.ui.NewSearchUI;
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


	@Override
	public void createControl(Composite parent) {
		// Setup the Layout
		parent.setLayout(new GridLayout());
		setControl(parent);

		// Forbit use without a ReqIF.
		reqif = findRelevantReqif();
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
	}
	
	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		// Required, so that the correct help is shown.
		if (true) pane.setFocus();
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
		if (wrapperFilter == null) return;
		
		or.setSelection(wrapperFilter.isOrFilter());
		and.setSelection(! wrapperFilter.isOrFilter());

		for (IFilter filter : wrapperFilter.getFilters()) {
			FilterPanel filterPanel = new FilterPanel(pane, reqif, filter);
			filterPanel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
					false));
		}
		pane.pack();
	}

	/**
	 * Looks for an active ReqIF editor.
	 * @return the active ReqIF or null if none found.
	 */
	private ReqIF findRelevantReqif() {
		IEditorPart editor = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (editor instanceof Reqif10Editor) {
			return ((Reqif10Editor) editor).getReqif();
		}
		if (editor instanceof SpecificationEditor) {
			return ((SpecificationEditor) editor).getReqifEditor().getReqif();
		}
		return null;
	}

	@SuppressWarnings("restriction")
	@Override
	public boolean performAction() {
		SimpleCompoundFilter filter = getFilter();

		// Only search if we have filters.
		if (filter == null || filter.getFilters().size() == 0) return false;

		// Stores the current query as last query.
		lastSearches.put(reqif, filter);
		ISearchQuery query = new FilterSearchQuery(reqif, filter);

		// Actual search, as taken from org.eclipse.rmf.reqif10.search.ui.page
		org.eclipse.search2.internal.ui.SearchView searchView = null;
		try {
			searchView = (org.eclipse.search2.internal.ui.SearchView) PlatformUI
					.getWorkbench().getActiveWorkbenchWindow().getActivePage()
					.showView(NewSearchUI.SEARCH_VIEW_ID);
		} catch (final PartInitException e) {
			ReqIFSearchUIPlugin.INSTANCE.log(e);
		}

		NewSearchUI.runQueryInForeground(new ProgressMonitorDialog(getShell()),
				query);
		if (searchView != null) {
			searchView.showSearchResult(query.getSearchResult());
		}
		return true;
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
		if (pane == null) return null;
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
	
}
