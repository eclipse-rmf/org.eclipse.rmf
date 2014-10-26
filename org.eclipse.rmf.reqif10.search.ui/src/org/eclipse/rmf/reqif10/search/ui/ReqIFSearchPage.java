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

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.dialogs.DialogPage;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.rmf.reqif10.pror.editor.presentation.Reqif10Editor;
import org.eclipse.rmf.reqif10.search.criteria.Criteria;
import org.eclipse.rmf.reqif10.search.edit.util.ReqIFEditSearcher;
import org.eclipse.rmf.reqif10.search.ui.masterdetails.CriteriasMasterDetailsBlock;
import org.eclipse.search.ui.IReplacePage;
import org.eclipse.search.ui.ISearchPage;
import org.eclipse.search.ui.ISearchPageContainer;
import org.eclipse.search.ui.ISearchQuery;
import org.eclipse.search.ui.NewSearchUI;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.ManagedForm;

public class ReqIFSearchPage extends DialogPage implements ISearchPage,
		IReplacePage {
	private static final String REQIF_EXTENSION = "reqif";
	private ISearchPageContainer container;
	private CriteriasMasterDetailsBlock masterDetailsBlock;

	public ReqIFSearchPage() {
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL, GridData.FILL,
				true, true));
		composite.setLayout(new FillLayout());
		IManagedForm managedForm = new ManagedForm(composite);
		masterDetailsBlock = new CriteriasMasterDetailsBlock();
		masterDetailsBlock.createContent(managedForm);
		container.setPerformActionEnabled(true);
		setControl(parent);
	}

	private List<IResource> getResources() {
		IResource[] resources = new IResource[0];
		switch (container.getSelectedScope()) {
		case ISearchPageContainer.SELECTION_SCOPE:
			Object[] objects = ((IStructuredSelection) (container
					.getSelection())).toArray();
			Set<IResource> resList = new HashSet<IResource>(objects.length);
			for (Object object : objects) {
				if (object instanceof IResource) {
					resList.add((IResource) object);
				} else if (object instanceof EObject) {
					EObject eObject = (EObject) object;
					Resource eResource = eObject.eResource();
					if (eResource != null) {
						URI eUri = eResource.getURI();
						if (eUri.isPlatformResource()) {
							String platformString = eUri.toPlatformString(true);
							IResource resource = ResourcesPlugin.getWorkspace()
									.getRoot().findMember(platformString);
							resList.add(resource);
						}
					}
				}
			}
			resources = resList.toArray(new IResource[0]);
			break;
		case ISearchPageContainer.WORKSPACE_SCOPE:
			resources = ResourcesPlugin.getWorkspace().getRoot().getProjects();
			break;
		case ISearchPageContainer.WORKING_SET_SCOPE:
			resources = convertToResources(container.getSelectedWorkingSets());
			break;
		}
		return getReqIFResources(resources);
	}

	private List<IResource> getReqIFResources(IResource[] resources) {
		List<IResource> reqIFResources = new ArrayList<IResource>();
		for (IResource resource : resources) {
			if (resource instanceof IFile
					&& resource.getFileExtension() != null
					&& resource.getFileExtension().equals(REQIF_EXTENSION)) {
				reqIFResources.add(resource);
			} else if (resource instanceof IContainer) {
				try {
					reqIFResources
							.addAll(getReqIFResources(((IContainer) resource)
									.members()));
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
		return reqIFResources;
	}

	private static IResource[] convertToResources(IWorkingSet[] workingSets) {
		List<IResource> res = new ArrayList<IResource>();
		for (int i = 0; i < workingSets.length; i++) {
			IWorkingSet workingSet = workingSets[i];
			if (workingSet.isAggregateWorkingSet() && workingSet.isEmpty()) {
				return new IResource[] { ResourcesPlugin.getWorkspace()
						.getRoot() };
			}
			IAdaptable[] elements = workingSet.getElements();
			for (int k = 0; k < elements.length; k++) {
				IResource curr = (IResource) elements[k]
						.getAdapter(IResource.class);
				if (curr != null) {
					res.add(curr);
				}
			}
		}
		return (IResource[]) res.toArray(new IResource[res.size()]);
	}

	final void updateOKStatus() {
		container.setPerformActionEnabled(true);
	}

	public Map<URI, EditingDomain> getEditorsURIMap() {
		final Map<URI, EditingDomain> uriMap = new HashMap<URI, EditingDomain>();

		PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
			@Override
			public void run() {
				IEditorReference[] editorReferences = PlatformUI.getWorkbench()
						.getActiveWorkbenchWindow().getActivePage()
						.getEditorReferences();
				for (IEditorReference editorReference : editorReferences) {
					IEditorPart editorPart = editorReference.getEditor(false);
					if (editorPart instanceof Reqif10Editor) {
						try {
							uriMap.put(EditUIUtil.getURI(editorReference
									.getEditorInput()),
									((IEditingDomainProvider) editorPart)
											.getEditingDomain());
						} catch (PartInitException e) {
							e.printStackTrace();
						}
					}
				}
			}
		});
		return uriMap;
	}

	public List<Resource> getEMFResources(Map<URI, EditingDomain> uriMap) {
		ResourceSet resourceSet = new ResourceSetImpl();
		List<IResource> resources = getResources();
		List<Resource> emfResources = new ArrayList<Resource>();
		for (IResource resource : resources) {
			URI uri = URI.createPlatformResourceURI(resource.getFullPath()
					.toOSString(), true);
			EditingDomain editingDomain = uriMap.get(uri);
			if (editingDomain != null) {
				emfResources.addAll(editingDomain.getResourceSet()
						.getResources());
			} else {
				Resource emfResource = resourceSet.getResource(uri, true);
				if (emfResource != null) {
					emfResources.add(emfResource);
				}
			}
		}
		return emfResources;
	}

	@Override
	public boolean performReplace() {
		IRunnableWithProgress runnable = new IRunnableWithProgress() {

			@Override
			public void run(final IProgressMonitor monitor)
					throws InvocationTargetException, InterruptedException {
				monitor.beginTask("Start Searching ...",
						IProgressMonitor.UNKNOWN);
				final Map<URI, EditingDomain> uriMap = getEditorsURIMap();
				final List<Resource> resources = getEMFResources(uriMap);
				ExtendedReqIFEdit reqIFEditSearcher = new ExtendedReqIFEdit(
						uriMap);
				reqIFEditSearcher.search(monitor, resources,
						masterDetailsBlock.getCriterias(), true);
			}
		};
		try {
			new ProgressMonitorDialog(getShell()).run(true, true, runnable);
		} catch (InvocationTargetException e) {
			ReqIFSearchUIPlugin.getPlugin().log(e);
		} catch (InterruptedException e) {
			ReqIFSearchUIPlugin.getPlugin().log(e);
		}
		return true;
	}

	@SuppressWarnings("restriction")
	@Override
	public boolean performAction() {
		ISearchQuery query = newQuery();
		// Note : In the javadoc its explaned that we need to only call
		// NewSearchUI.runQueryInForeground but due to a bug this doesn't work
		// so I had to do the code below.
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

	private ISearchQuery newQuery() {
		return new ReqIFSearchQuery(this,
				masterDetailsBlock.getCriterias());
	}

	@Override
	public void setContainer(ISearchPageContainer container) {
		this.container = container;
	}

	protected class ExtendedReqIFEdit extends ReqIFEditSearcher {
		private final Map<URI, EditingDomain> uriMap;

		public ExtendedReqIFEdit(Map<URI, EditingDomain> uriMap) {
			this.uriMap = uriMap;
		}

		@Override
		protected Collection<EObject> search(IProgressMonitor monitor,
				Resource resource, Collection<Criteria> criterias,
				boolean replace) {
			final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
			saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED,
					Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
			Collection<EObject> result = super.search(monitor, resource,
					criterias, replace);
			if (false == uriMap.containsKey(resource.getURI())) {
				try {
					resource.save(saveOptions);
				} catch (IOException e) {
					ReqIFSearchUIPlugin.getPlugin().log(e);
				}
			}
			return result;
		}

		public void executeCommand(final EditingDomain editingDomain,
				final Command command) {
			PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {

				@Override
				public void run() {
					ExtendedReqIFEdit.super.executeCommand(editingDomain,
							command);
				}
			});
		}

	}
}
