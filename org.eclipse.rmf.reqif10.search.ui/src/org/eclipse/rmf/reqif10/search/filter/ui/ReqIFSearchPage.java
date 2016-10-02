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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.DialogPage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.pror.editor.IReqifEditor;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.eclipse.rmf.reqif10.search.filter.FilterContext;
import org.eclipse.rmf.reqif10.search.filter.ReqIFFullFilter;
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
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.osgi.service.prefs.BackingStoreException;

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
		createNamedFilterPane(parent);

		// Restore previous filters.
		SimpleCompoundFilter filter = lastSearches.get(reqif);
		if (filter != null) restoreFilter(filter);

		// The plugin help-id is broken.
		PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, "org.eclipse.rmf.reqif10.search.ui.reqifSearchHelp");

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
		label.setLayoutData(new GridData(GridData.CENTER, SWT.CENTER, true, true));
	}

	private Composite createToolbar(Composite parent) {
		Composite toolbar = new Composite(parent, SWT.NONE);
		toolbar.setLayout(new GridLayout(4, false));
		toolbar.setLayoutData(new GridData(GridData.FILL, SWT.CENTER, true, false));
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
				clearFilter();
			}
		});
	}

	/**
	 * Removes the current filters.
	 */
	private void clearFilter() {
		for (Control control : pane.getChildren()) {
			control.dispose();
		}
		pane.pack();		
	}

	private void createAddButton(Composite toolbar) {
		Button add = new Button(toolbar, SWT.PUSH);
		add.setText("Add new");
		add.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, true, false));
		add.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FilterPanel filterPanel = new FilterPanel(pane, reqif);
				filterPanel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
				pane.pack();
			}
		});
	}

	private Composite createPane(Composite parent) {
		ScrolledComposite sc = new ScrolledComposite(parent, SWT.V_SCROLL | SWT.NONE);
		sc.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
		sc.setBackground(parent.getBackground());
		Composite pane = new Composite(sc, SWT.NONE);
		pane.setLayout(new GridLayout());
		sc.setContent(pane);
		sc.setExpandHorizontal(true);
		return pane;
	}

	/**
	 * Create the GUI elements for saving and loading Filters.
	 */
	private Composite createNamedFilterPane(final Composite parent) {
		final Composite row = new Composite(parent, SWT.NONE);
		row.setLayout(new GridLayout(5, false));
		row.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, false));
		Label label = new Label(row, SWT.NONE);
		label.setText("Named Filter: ");
		final Combo filterList = new Combo(row, SWT.DROP_DOWN | SWT.FILL);
		filterList.setLayoutData(new GridData(GridData.FILL, GridData.CENTER, true, false));
		populateFilterList(filterList);

		// Save-Button
		final Button save = new Button(row, SWT.PUSH);
		save.setText("Update");
		save.setEnabled(false);
		save.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				saveNamedFilter(filterList);
			}
		});

		// Load-Button
		final Button load = new Button(row, SWT.PUSH);
		load.setText("Load");
		load.setEnabled(false);
		load.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				loadNamedFilter(filterList);
			}
		});

		// Delete-Button
		final Button delete = new Button(row, SWT.PUSH);
		delete.setText("Delete");
		delete.setEnabled(false);
		delete.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				deleteNamedFilter(filterList);
			}
		});

		row.pack();

		// This listener enables and disables the buttons, depending on the control's content.
		filterList.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				String content = filterList.getText().trim();

				// Always grey out with 0 length
				if (content.length() == 0) {
					save.setEnabled(false);
					load.setEnabled(false);
					delete.setEnabled(false);
					return;
				}
				if (Arrays.asList(filterList.getItems()).contains(content)) {
					save.setEnabled(true);
					load.setEnabled(true);
					delete.setEnabled(true);
					save.setText("Update");
					return;
				} else {
					save.setEnabled(true);
					load.setEnabled(false);
					delete.setEnabled(false);
					save.setText("Save");
				}
			}
		});
		return row;
	}

	/**
	 * Populates the Filter List with values from the Project's preference store
	 * @param filterList
	 */
	private void populateFilterList(Combo filterList) {
		filterList.removeAll();
		try {
			ProjectScope projectScope = new ProjectScope(ProrUtil.getProjectFromModel(reqif));
			IEclipsePreferences node = projectScope.getNode("namedFilter");
			for (String key : node.keys()) {
				filterList.add(key);
			}
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * Triggered by the "Delete Named Filter" Button.
	 */
	private void deleteNamedFilter(Combo filterList) {
		try {
			String filterName = filterList.getText().trim();
			ProjectScope projectScope = new ProjectScope(ProrUtil.getProjectFromModel(reqif));
			IEclipsePreferences node = projectScope.getNode("namedFilter");
			node.remove(filterName);
			node.flush();
			populateFilterList(filterList);
			filterList.clearSelection();
		} catch (BackingStoreException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Triggered by the "Save Named Filter" Button.
	 */
	private void saveNamedFilter(Combo filterList) {
		String filterName = filterList.getText().trim();
		try {
			ProjectScope projectScope = new ProjectScope(ProrUtil.getProjectFromModel(reqif));
			IEclipsePreferences node = projectScope.getNode("namedFilter");
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(getFilter());
			oos.close();
			baos.close();
			node.putByteArray(filterName, baos.toByteArray());
			node.flush();
			populateFilterList(filterList);
			filterList.setText(filterName);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	/**
	 * Triggered by the "Load Named Filter" Button.
	 */
	private void loadNamedFilter(Combo filterList) {
		String filterName = filterList.getText();
		ProjectScope projectScope = new ProjectScope(ProrUtil.getProjectFromModel(reqif));
		IEclipsePreferences node = projectScope.getNode("namedFilter");
		byte[] serializedFilter = node.getByteArray(filterName, new byte[] {});
		if (serializedFilter.length == 0) {		
			MessageDialog.openInformation(getShell(), "No Filter found",
					"A filter with the name '" + filterName + " ' does not exist in this project.");
			return;
		}
		try {
			FilterContext.REQIF = reqif;
			ByteArrayInputStream bais = new ByteArrayInputStream(serializedFilter);
			ObjectInputStream ois = new ObjectInputStream(bais);
			Object obj = ois.readObject();
			SimpleCompoundFilter filter = (SimpleCompoundFilter) obj;
			restoreFilter(filter);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			FilterContext.REQIF = null;
		}
	}

	/**
	 * Restores a Filter, after clearing the panel.
	 */
	private void restoreFilter(SimpleCompoundFilter wrapperFilter) {
		clearFilter();

		or.setSelection(wrapperFilter.isOrFilter());
		and.setSelection(!wrapperFilter.isOrFilter());

		for (ReqIFFullFilter filter : wrapperFilter.getFilters()) {
			FilterPanel filterPanel = new FilterPanel(pane, reqif, filter);
			filterPanel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		}
		pane.pack();
	}

	/**
	 * Looks for an active ReqIF editor.
	 * 
	 * @return the active ReqIF or null if none found.
	 */
	private IReqifEditor getReqifEditor() {
		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (editor instanceof IReqifEditor) {
			return (IReqifEditor) editor;
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

		NewSearchUI.runQueryInForeground(new ProgressMonitorDialog(getShell()), query);
		getSearchView().showSearchResult(query.getSearchResult());
		return true;
	}

	// Actual search, as taken from org.eclipse.rmf.reqif10.search.ui.page
	private SearchView getSearchView() {
		SearchView searchView = null;
		try {
			searchView = (org.eclipse.search2.internal.ui.SearchView) PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage().showView(NewSearchUI.SEARCH_VIEW_ID);
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
		ArrayList<ReqIFFullFilter> filters = new ArrayList<ReqIFFullFilter>();
		for (Control control : pane.getChildren()) {
			if (control instanceof FilterPanel) {
				ReqIFFullFilter filter = ((FilterPanel) control).getFilter();
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
		if (listener != null)
			return;

		listener = new IPartListener2() {
			@Override
			public void partClosed(IWorkbenchPartReference partRef) {
				IWorkbenchPart part = partRef.getPart(false);
				if (!(part instanceof IReqifEditor)) {
					return;
				}

				ReqIF closingReqif = ((IReqifEditor) part).getReqif();

				ISearchResult searchResult = getSearchView().getCurrentSearchResult();
				if (searchResult instanceof UsageSearchResult) {
					Set<Resource> keys = ((UsageSearchResult) searchResult).getSearchEntries().keySet();
					for (Resource resource : keys) {
						if (resource.getURI().equals(closingReqif.eResource().getURI())) {
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
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().addPartListener(listener);

	}

}
