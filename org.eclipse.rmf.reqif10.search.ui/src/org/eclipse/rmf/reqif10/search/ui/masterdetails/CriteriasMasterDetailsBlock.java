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
package org.eclipse.rmf.reqif10.search.ui.masterdetails;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EventObject;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.action.CopyAction;
import org.eclipse.emf.edit.ui.action.CreateChildAction;
import org.eclipse.emf.edit.ui.action.CutAction;
import org.eclipse.emf.edit.ui.action.DeleteAction;
import org.eclipse.emf.edit.ui.action.PasteAction;
import org.eclipse.emf.edit.ui.action.RedoAction;
import org.eclipse.emf.edit.ui.action.StaticSelectionCommandAction;
import org.eclipse.emf.edit.ui.action.UndoAction;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.rmf.reqif10.search.criteria.Criteria;
import org.eclipse.rmf.reqif10.search.criteria.CriteriaFactory;
import org.eclipse.rmf.reqif10.search.criteria.Criterias;
import org.eclipse.rmf.reqif10.search.criteria.Operator;
import org.eclipse.rmf.reqif10.search.criteria.impl.CriteriaImpl;
import org.eclipse.rmf.reqif10.search.criteria.provider.CriteriaItemProviderAdapterFactory;
import org.eclipse.rmf.reqif10.search.ui.ReqIFSearchUIPlugin;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.DetailsPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.MasterDetailsBlock;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

/**
 * @author Hussein MHANNA
 * 
 */
public class CriteriasMasterDetailsBlock extends MasterDetailsBlock {

	/**
	 * The horizontal orientation icon
	 */
	protected static final String HORIZONTAL_ORIENTATION_ICON_PATH = "full/obj16/Horizontal_Orientation.gif";

	/**
	 * The vertical orientation icon
	 */
	protected static final String VERTICAL_ORIENTATION_ICON_PATH = "full/obj16/Vertical_Orientation.gif";

	/**
	 * The horizontal orientation action label
	 */
	protected static final String HORIZONTAL_ORIENTATION_ACTION_LABEL = getString("_UI_HorizontalOrientation_label");

	/**
	 * The vertical orientation action label
	 */
	protected static final String VERTICAL_ORIENTATION_ACTION_LABEL = getString("_UI_VerticalOrientation_label");

	/**
	 * The managed form
	 */
	protected IManagedForm managedForm;
	/**
	 * The tree viewer
	 */
	private TreeViewer treeViewer;
	/**
	 * The temporary resource
	 */
	private Resource resource;
	/**
	 * The adapter factory
	 */
	private ComposedAdapterFactory adapterFactory;
	/**
	 * The editing domain
	 */
	private EditingDomain editingDomain;
	/**
	 * The search criteria separator
	 */
	private String REQIF_SEARCH_CRITERIA = "REQIF_SEARCH_CRITERIA";
	/**
	 * The criteria separator
	 */
	private String CRITERIA_SEPARATOR = "CRITERIA";
	/**
	 * The criterias separator
	 */
	private String CRITERIAS_SEPARATOR = "CRITERIAS";
	/**
	 * The criterias instance
	 */
	private Criterias criterias;

	/**
	 * The constructor
	 */
	public CriteriasMasterDetailsBlock() {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void createContent(final IManagedForm managedForm) {
		super.createContent(managedForm);
		managedForm.getForm().addDisposeListener(new DisposeListener() {

			@Override
			public void widgetDisposed(final DisposeEvent e) {
				managedForm.getForm().getDisplay().asyncExec(new Runnable() {

					@Override
					public void run() {
						CriteriasMasterDetailsBlock.this.dispose();
					}
				});
			}
		});
	}

	/**
	 * Create the {@link AdapterFactory}
	 * 
	 */
	private void createAdapterFactory() {
		adapterFactory = new ComposedAdapterFactory();
		adapterFactory
				.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new CriteriaItemProviderAdapterFactory());
	}

	/**
	 * Create the {@link EditingDomain}
	 */
	private void createEditingDomain() {
		CommandStack commandStack = new BasicCommandStack();
		commandStack.addCommandStackListener(new CommandStackListener() {

			@Override
			public void commandStackChanged(EventObject event) {
				handleCommandStackChanged(((CommandStack) event.getSource())
						.getMostRecentCommand());
			}
		});
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory,
				commandStack);
	}

	/**
	 * Called when the command stack is changed
	 * 
	 * @param mostRecentCommand
	 *            : The most recent command
	 */
	protected void handleCommandStackChanged(final Command mostRecentCommand) {
		// Try to select the affected objects.
		//
		if (mostRecentCommand != null) {
			setSelectionToViewer(mostRecentCommand.getAffectedObjects());
		}
	}

	/**
	 * This sets the selection into whichever viewer is active.
	 * 
	 * @param selections
	 *            : The selection elements
	 * 
	 */
	protected void setSelectionToViewer(final Collection<?> selections) {
		if ((selections != null) && !selections.isEmpty()) {
			final Object[] selectionsArray = selections.toArray();
			final Runnable runnable = new Runnable() {

				@Override
				public void run() {
					// Select the objects if the input of the viewer is not
					// null, otherwise select them when the
					// input will be set.
					if (treeViewer != null) {
						treeViewer.setSelection(new StructuredSelection(
								selectionsArray), true);
					}
				}
			};
			if (false == managedForm.getForm().isDisposed()) {
				managedForm.getForm().getDisplay().asyncExec(runnable);
			}
		}
	}

	private void createTreeViewer(Composite parent) {
		Tree tree = getToolkit().createTree(parent, SWT.BORDER);
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		treeViewer = new TreeViewer(tree);
		treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(
				adapterFactory));
		treeViewer.setContentProvider(new AdapterFactoryContentProvider(
				adapterFactory));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void createMasterPart(final IManagedForm managedForm,
			final Composite parent) {
		this.managedForm = managedForm;
		createAdapterFactory();
		createEditingDomain();

		FormToolkit toolkit = getToolkit();
		Section criteriasSection = toolkit.createSection(parent,
				ExpandableComposite.EXPANDED | ExpandableComposite.TITLE_BAR);
		criteriasSection.setText("Criterias");
		final SectionPart sectionPart = new SectionPart(criteriasSection);

		Composite composite = toolkit.createComposite(criteriasSection,
				SWT.NONE);
		criteriasSection.setClient(composite);
		composite.setLayout(new GridLayout(1, false));

		createTreeViewer(composite);
		loadInput();
		treeViewer.setInput(resource);
		treeViewer.expandAll();

		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				managedForm.fireSelectionChanged(sectionPart,
						treeViewer.getSelection());
			}
		});
		new TreeViewerActionProvider(treeViewer);
	}

	private void loadInput() {
		resource = editingDomain.getResourceSet().createResource(
				URI.createURI("TEMP"));
		criterias = CriteriaFactory.eINSTANCE.createCriterias();
		resource.getContents().add(criterias);
		String input = ReqIFSearchUIPlugin.getPlugin().getDialogSettings()
				.get(REQIF_SEARCH_CRITERIA);
		if (input != null && false == input.trim().isEmpty()) {
			String[] criteriasString = null;
			if (input.contains(CRITERIAS_SEPARATOR)) {
				criteriasString = input.split(CRITERIAS_SEPARATOR);
			} else {
				criteriasString = new String[] { input };
			}
			for (String criteriaString : criteriasString) {
				String[] criteriaDetails = criteriaString
						.split(CRITERIA_SEPARATOR);
				Criteria criteria = CriteriaFactory.eINSTANCE.createCriteria();
				criteria.setFeatureName(criteriaDetails[0]);
				criteria.setSerachedText(criteriaDetails[1]);
				criteria.setOperator(Operator.get(criteriaDetails[2]));
				criteria.setReplacementText(criteriaDetails[3]);
				criteria.setSensitiveCase(Boolean.valueOf(criteriaDetails[4]));
				criterias.getCriterias().add(criteria);
			}
		} else {
			criterias.getCriterias().add(
					CriteriaFactory.eINSTANCE.createCriteria());
		}
	}

	private void saveInput() {
		StringBuilder criteriaStringBuilder = new StringBuilder();
		Criterias criterias = (Criterias) resource.getContents().get(0);
		EList<Criteria> criteriasList = criterias.getCriterias();
		for (int i = 0; i < criteriasList.size(); i++) {
			Criteria criteria = criteriasList.get(i);
			criteriaStringBuilder.append(criteria.getFeatureName())
					.append(CRITERIA_SEPARATOR)
					.append(criteria.getSerachedText())
					.append(CRITERIA_SEPARATOR).append(criteria.getOperator())
					.append(CRITERIA_SEPARATOR)
					.append(criteria.getReplacementText())
					.append(CRITERIA_SEPARATOR)
					.append(criteria.isSensitiveCase());
			if (i != criteriasList.size() - 1) {
				criteriaStringBuilder.append(CRITERIAS_SEPARATOR);
			}
		}
		ReqIFSearchUIPlugin.getPlugin().getDialogSettings()
				.put(REQIF_SEARCH_CRITERIA, criteriaStringBuilder.toString());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void registerPages(DetailsPart detailsPart) {
		CriteriaDetailsPage criteriaDetailsPage = new CriteriaDetailsPage(
				editingDomain);
		detailsPart.registerPage(CriteriaImpl.class, criteriaDetailsPage);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void createToolBarActions(final IManagedForm managedForm) {
		final ScrolledForm form = managedForm.getForm();
		form.getToolBarManager().add(
				createHorizontalOrientationAction(managedForm));
		form.getToolBarManager().add(
				createVerticalOrientationAction(managedForm));
	}

	/**
	 * Create and return the horizontal orientation action
	 * 
	 * @param managedForm
	 *            : Tha {@link IManagedForm}
	 * @return The created action
	 */
	protected IAction createHorizontalOrientationAction(
			final IManagedForm managedForm) {
		final ImageDescriptor imageDescriptor = ExtendedImageRegistry.INSTANCE
				.getImageDescriptor(ReqIFSearchUIPlugin.INSTANCE
						.getImage(HORIZONTAL_ORIENTATION_ICON_PATH));
		final Action horizontalOrientationAction = new Action(
				HORIZONTAL_ORIENTATION_ACTION_LABEL, IAction.AS_RADIO_BUTTON) {

			@Override
			public void run() {
				CriteriasMasterDetailsBlock.this.sashForm
						.setOrientation(SWT.HORIZONTAL);
				managedForm.getForm().reflow(true);
			}
		};
		horizontalOrientationAction.setChecked(false);
		horizontalOrientationAction
				.setToolTipText(HORIZONTAL_ORIENTATION_ACTION_LABEL);
		horizontalOrientationAction.setImageDescriptor(imageDescriptor);
		return horizontalOrientationAction;
	}

	/**
	 * Create and return the vertical orientation action
	 * 
	 * @param managedForm
	 *            : The {@link IManagedForm}
	 * @return The created action
	 */
	protected IAction createVerticalOrientationAction(
			final IManagedForm managedForm) {
		final ImageDescriptor imageDescriptor = ExtendedImageRegistry.INSTANCE
				.getImageDescriptor(ReqIFSearchUIPlugin.INSTANCE
						.getImage(VERTICAL_ORIENTATION_ICON_PATH));
		final Action verticalOrientationAction = new Action(
				VERTICAL_ORIENTATION_ACTION_LABEL, IAction.AS_RADIO_BUTTON) {

			@Override
			public void run() {
				CriteriasMasterDetailsBlock.this.sashForm
						.setOrientation(SWT.VERTICAL);
				managedForm.getForm().reflow(true);
			}
		};
		verticalOrientationAction.setChecked(false);
		verticalOrientationAction
				.setToolTipText(VERTICAL_ORIENTATION_ACTION_LABEL);
		verticalOrientationAction.setImageDescriptor(imageDescriptor);
		return verticalOrientationAction;
	}

	/**
	 * Return the toolkit
	 * 
	 * @return The form toolkit
	 */
	protected FormToolkit getToolkit() {
		return managedForm.getToolkit();
	}

	/**
	 * Return the actions to be added in the tool bar
	 * 
	 * @return The actions to be added in the tool bar
	 */
	protected Collection<IAction> getToolbarActions(
			final IManagedForm managedForm) {
		return Collections.emptyList();
	}

	/**
	 * This looks up a string in plugin.properties, making a substitution.
	 * 
	 * @param key
	 *            the key of the string.
	 * @return a string resource associated with the key.
	 */
	protected static String getString(final String key) {
		return ReqIFSearchUIPlugin.INSTANCE.getString(key);
	}

	/**
	 * Called to dispose the widgets
	 */
	protected void dispose() {
		saveInput();
		try {
			resource.delete(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		adapterFactory.dispose();
	}

	public Collection<Criteria> getCriterias() {
		return criterias.getCriterias();
	}

	/**
	 * An extended {@link IMenuListener} that manage undo, redo, cut, copy and
	 * paste action.
	 * 
	 * @author Hussein MHANNA
	 * 
	 */
	protected class TreeViewerActionProvider implements IMenuListener {
		/**
		 * This will contain one
		 * {@link org.eclipse.emf.edit.ui.action.CreateChildAction}
		 * corresponding to each descriptor generated for the current selection
		 * by the item provider.
		 */
		protected Collection<StaticSelectionCommandAction> createChildActions;

		/**
		 * This is the action used to implement delete.
		 */
		private DeleteAction deleteAction;

		/**
		 * This is the action used to implement undo.
		 */
		private UndoAction undoAction;

		/**
		 * This is the action used to implement redo.
		 */
		private RedoAction redoAction;
		/**
		 * This is the action used to implement cut.
		 */
		private CutAction cutAction;
		/**
		 * This is the action used to implement copy.
		 */
		private CopyAction copyAction;
		/**
		 * This is the action used to implement paste.
		 */
		private PasteAction pasteAction;

		/**
		 * The tree viewer
		 */
		private final TreeViewer viewer;

		/**
		 * The selection changed listener
		 */
		private final ISelectionChangedListener selectionChangedListener;

		/**
		 * The constructor
		 * 
		 * @param viewer
		 *            : The viewer on wich the actions will be added
		 */
		public TreeViewerActionProvider(final TreeViewer viewer) {
			this.viewer = viewer;
			initializeActions();
			selectionChangedListener = new ISelectionChangedListener() {

				@Override
				public void selectionChanged(final SelectionChangedEvent event) {
					TreeViewerActionProvider.this
							.selectionChanged((IStructuredSelection) event
									.getSelection());
				}
			};
			this.viewer.addSelectionChangedListener(selectionChangedListener);
			this.viewer.getTree().addDisposeListener(new DisposeListener() {

				@Override
				public void widgetDisposed(final DisposeEvent e) {
					TreeViewerActionProvider.this.viewer
							.removeSelectionChangedListener(selectionChangedListener);
				}
			});
			final MenuManager manager = new MenuManager();
			final Menu menu = manager.createContextMenu(viewer.getControl());
			manager.addMenuListener(this);
			manager.setRemoveAllWhenShown(true);
			viewer.getControl().setMenu(menu);
		}

		/**
		 * Initialize the actions
		 */
		private void initializeActions() {
			final ISharedImages sharedImages = PlatformUI.getWorkbench()
					.getSharedImages();

			deleteAction = createDeleteAction();
			deleteAction.setImageDescriptor(sharedImages
					.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));

			undoAction = createUndoAction();
			undoAction.setImageDescriptor(sharedImages
					.getImageDescriptor(ISharedImages.IMG_TOOL_UNDO));

			redoAction = createRedoAction();
			redoAction.setImageDescriptor(sharedImages
					.getImageDescriptor(ISharedImages.IMG_TOOL_REDO));

			cutAction = createCutAction();
			cutAction.setImageDescriptor(sharedImages
					.getImageDescriptor(ISharedImages.IMG_TOOL_CUT));

			copyAction = createCopyAction();
			copyAction.setImageDescriptor(sharedImages
					.getImageDescriptor(ISharedImages.IMG_TOOL_COPY));

			pasteAction = createPasteAction();
			pasteAction.setImageDescriptor(sharedImages
					.getImageDescriptor(ISharedImages.IMG_TOOL_PASTE));

		}

		/**
		 * Create a delete action.
		 * 
		 * @return the action used to implement delete.
		 * 
		 * @see #deleteAction
		 */
		protected DeleteAction createDeleteAction() {
			return new DeleteAction(editingDomain, true);
		}

		/**
		 * Create an undo action.
		 * 
		 * @return the action used to implement undo.
		 * 
		 * @see #undoAction
		 */
		protected UndoAction createUndoAction() {
			return new UndoAction(editingDomain);
		}

		/**
		 * Create a redo action.
		 * 
		 * @return the action used to implement redo.
		 * 
		 * @see #redoAction
		 */
		protected RedoAction createRedoAction() {
			return new RedoAction(editingDomain);
		}

		/**
		 * Create a cut action.
		 * 
		 * @return the action used to implement cut.
		 * 
		 * @see #cutAction
		 */
		protected CutAction createCutAction() {
			return new CutAction(editingDomain);
		}

		/**
		 * Create a copy action.
		 * 
		 * @return the action used to implement copy.
		 * 
		 * @see #copyAction
		 */
		protected CopyAction createCopyAction() {
			return new CopyAction(editingDomain);
		}

		/**
		 * Create a paste action.
		 * 
		 * @return the action used to implement paste.
		 * 
		 * @see #pasteAction
		 */
		protected PasteAction createPasteAction() {
			return new PasteAction(editingDomain);
		}

		/**
		 * This implements {@link org.eclipse.jface.action.IMenuListener} to
		 * help fill the context menus with contributions from the Edit menu.
		 * 
		 * @param menuManager
		 *            The menu manager.
		 */
		@Override
		public void menuAboutToShow(final IMenuManager menuManager) {
			MenuManager submenuManager = null;

			submenuManager = new MenuManager("New");
			populateManager(submenuManager, createChildActions, null);
			menuManager.add(submenuManager);

			menuManager.add(new Separator());
			menuManager.add(new ActionContributionItem(undoAction));
			menuManager.add(new ActionContributionItem(redoAction));
			menuManager.add(new Separator());
			menuManager.add(new ActionContributionItem(cutAction));
			menuManager.add(new ActionContributionItem(copyAction));
			menuManager.add(new ActionContributionItem(pasteAction));
			menuManager.add(new Separator());
			menuManager.add(new ActionContributionItem(deleteAction));
		}

		/**
		 * Called when the selection is changed in the tree viewer.
		 * 
		 * @param selection
		 *            The selection of {@link SelectionChangedEvent}.
		 */
		private void selectionChanged(final IStructuredSelection selection) {
			deleteAction.selectionChanged(selection);
			undoAction.update();
			redoAction.update();
			cutAction.selectionChanged(selection);
			copyAction.selectionChanged(selection);
			pasteAction.selectionChanged(selection);
			// Query the new selection for appropriate new child/descriptors
			//
			Collection<?> newChildDescriptors = null;

			if (selection.size() == 1) {
				final Object object = selection.getFirstElement();

				newChildDescriptors = editingDomain.getNewChildDescriptors(
						object, null);
			}

			// Generate actions for selection; populate and redraw the menus.
			//
			createChildActions = generateCreateChildActions(
					newChildDescriptors, selection);

		}

		protected Collection<StaticSelectionCommandAction> generateCreateChildActions(
				final Collection<?> descriptors, final ISelection selection) {
			final Collection<StaticSelectionCommandAction> actions = new ArrayList<StaticSelectionCommandAction>();
			if (descriptors != null) {
				for (final Object descriptor : descriptors) {
					actions.add(createCreateChildAction(selection, descriptor));
				}
			}
			return actions;
		}

		protected CreateChildAction createCreateChildAction(
				final ISelection selection, final Object descriptor) {
			return new CreateChildAction(editingDomain, selection, descriptor);
		}
	}

	/**
	 * This populates the specified <code>manager</code> with
	 * {@link org.eclipse.jface.action.ActionContributionItem}s based on the
	 * {@link org.eclipse.jface.action.IAction}s contained in the
	 * <code>actions</code> collection, by inserting them before the specified
	 * contribution item <code>contributionID</code>. If <code>ID</code> is
	 * <code>null</code>, they are simply added.
	 */
	protected void populateManager(final IContributionManager manager,
			final Collection<? extends IAction> actions,
			final String contributionID) {
		if (actions != null) {
			for (final IAction action : actions) {
				if (contributionID != null) {
					manager.insertBefore(contributionID, action);
				} else {
					manager.add(action);
				}
			}
		}
	}
}
