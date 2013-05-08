/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.pror.editor.presentation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.CreateChildAction;
import org.eclipse.emf.edit.ui.action.CreateSiblingAction;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.SubContributionItem;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.SpecRelationType;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.editor.agilegrid.AgileCellEditorActionHandler;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;

/**
 * This is the action bar contributor for the Reqif10 model editor.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class Reqif10ActionBarContributor
	extends EditingDomainActionBarContributor
	implements ISelectionChangedListener {
	/**
	 * This keeps track of the active editor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IEditorPart activeEditorPart;

	/**
	 * This keeps track of the current selection provider.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISelectionProvider selectionProvider;

	private AgileCellEditorActionHandler agileCellEditorActionHandler;
	

	/**
	 * List of all SpecObjects (directly or indirectly via SpecHierarchy) in the
	 * current selection.
	 */
	private List<SpecObject> linkSelection = new ArrayList<SpecObject>();
	
	/**
	 * SpecObjects for which linking has been initiated.
	 */
	private List<SpecObject> linkSource = new ArrayList<SpecObject>();

	/**
	 * This action opens the Properties view.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IAction showPropertiesViewAction =
		new Action(Reqif10EditorPlugin.INSTANCE.getString("_UI_ShowPropertiesView_menu_item")) {
			@Override
			public void run() {
				try {
					getPage().showView("org.eclipse.ui.views.PropertySheet");
				}
				catch (PartInitException exception) {
					Reqif10EditorPlugin.INSTANCE.log(exception);
				}
			}
		};

	/**
	 * This action refreshes the viewer of the current editor if the editor
	 * implements {@link org.eclipse.emf.common.ui.viewer.IViewerProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IAction refreshViewerAction =
		new Action(Reqif10EditorPlugin.INSTANCE.getString("_UI_RefreshViewer_menu_item")) {
			@Override
			public boolean isEnabled() {
				return activeEditorPart instanceof IViewerProvider;
			}

			@Override
			public void run() {
				if (activeEditorPart instanceof IViewerProvider) {
					Viewer viewer = ((IViewerProvider)activeEditorPart).getViewer();
					if (viewer != null) {
						viewer.refresh();
					}
				}
			}
		};

	/**
	 * This will contain one {@link org.eclipse.emf.edit.ui.action.CreateChildAction} corresponding to each descriptor
	 * generated for the current selection by the item provider.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<IAction> createChildActions;

	/**
	 * This is the menu manager into which menu contribution items should be added for CreateChild actions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IMenuManager createChildMenuManager;

	/**
	 * This will contain one {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} corresponding to each descriptor
	 * generated for the current selection by the item provider.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<IAction> createSiblingActions;

	/**
	 * This is the menu manager into which menu contribution items should be
	 * added for CreateSibling actions. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected IMenuManager createSiblingMenuManager;

	/**
	 * This creates an instance of the contributor. <!-- begin-user-doc -->
	 * Assignments were out-commented to remove them from the menuManager
	 * (IMenuManager) <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Reqif10ActionBarContributor() {
		super(ADDITIONS_LAST_STYLE);
	}

	@Override
	public void init(IActionBars actionBars) {

		super.init(actionBars);

		agileCellEditorActionHandler = new AgileCellEditorActionHandler(
				actionBars);

		agileCellEditorActionHandler.setDeleteAction(deleteAction);
		// actionBars.setGlobalActionHandler(ActionFactory.DELETE.getId(),
		// deleteAction);

		agileCellEditorActionHandler.setCutAction(cutAction);
		// actionBars.setGlobalActionHandler(ActionFactory.CUT.getId(),
		// cutAction);

		agileCellEditorActionHandler.setCopyAction(copyAction);
		// actionBars.setGlobalActionHandler(ActionFactory.COPY.getId(),
		// copyAction);

		agileCellEditorActionHandler.setPasteAction(pasteAction);
		// actionBars.setGlobalActionHandler(ActionFactory.PASTE.getId(),
		// pasteAction);

		agileCellEditorActionHandler.setUndoAction(undoAction);
		// actionBars.setGlobalActionHandler(ActionFactory.UNDO.getId(),
		// undoAction);

		agileCellEditorActionHandler.setRedoAction(redoAction);
		// actionBars.setGlobalActionHandler(ActionFactory.REDO.getId(),
		// redoAction);

	}
	
	/**
	 * This adds Separators for editor additions to the tool bar.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void contributeToToolBar(IToolBarManager toolBarManager) {
		toolBarManager.add(new Separator("reqif10-settings"));
		toolBarManager.add(new Separator("reqif10-additions"));
	}

	/**
	 * This adds to the menu bar a menu and some separators for editor additions,
	 * as well as the sub-menus for object creation items.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void contributeToMenu(IMenuManager menuManager) {
		super.contributeToMenu(menuManager);

		IMenuManager submenuManager = new MenuManager(Reqif10EditorPlugin.INSTANCE.getString("_UI_Reqif10Editor_menu"), "org.eclipse.rmf.reqif10MenuID");
		menuManager.insertAfter("additions", submenuManager);
		submenuManager.add(new Separator("settings"));
		submenuManager.add(new Separator("actions"));
		submenuManager.add(new Separator("additions"));
		submenuManager.add(new Separator("additions-end"));

		// Prepare for CreateChild item addition or removal.
		//
		createChildMenuManager = new MenuManager(Reqif10EditorPlugin.INSTANCE.getString("_UI_CreateChild_menu_item"));
		submenuManager.insertBefore("additions", createChildMenuManager);

		// Prepare for CreateSibling item addition or removal.
		//
		createSiblingMenuManager = new MenuManager(Reqif10EditorPlugin.INSTANCE.getString("_UI_CreateSibling_menu_item"));
		submenuManager.insertBefore("additions", createSiblingMenuManager);

		// Force an update because Eclipse hides empty menus now.
		//
		submenuManager.addMenuListener
			(new IMenuListener() {
				 public void menuAboutToShow(IMenuManager menuManager) {
					 menuManager.updateAll(true);
				 }
			 });

		addGlobalActions(submenuManager);
	}

	/**
	 * When the active editor changes, this remembers the change and registers with it as a selection provider.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActiveEditor(IEditorPart part) {
		super.setActiveEditor(part);
		activeEditorPart = part;

		// Switch to the new selection provider.
		//
		if (selectionProvider != null) {
			selectionProvider.removeSelectionChangedListener(this);
		}
		if (part == null) {
			selectionProvider = null;
		}
		else {
			selectionProvider = part.getSite().getSelectionProvider();
			selectionProvider.addSelectionChangedListener(this);

			// Fake a selection changed event to update the menus.
			//
			if (selectionProvider.getSelection() != null) {
				selectionChanged(new SelectionChangedEvent(selectionProvider, selectionProvider.getSelection()));
			}
		}
	}

	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionChangedListener},
	 * handling {@link org.eclipse.jface.viewers.SelectionChangedEvent}s by querying for the children and siblings
	 * that can be added to the selected object and updating the menus accordingly.
	 * <!-- begin-user-doc -->
	 * Added selection management for the linking process
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void selectionChanged(SelectionChangedEvent event) {
		// Remove any menu items for old selection.
		//
		if (createChildMenuManager != null) {
			depopulateManager(createChildMenuManager, createChildActions);
		}
		if (createSiblingMenuManager != null) {
			depopulateManager(createSiblingMenuManager, createSiblingActions);
		}

		// Query the new selection for appropriate new child/sibling descriptors
		//
		Collection<?> newChildDescriptors = null;
		Collection<?> newSiblingDescriptors = null;

		ISelection selection = event.getSelection();
		if (selection instanceof IStructuredSelection && ((IStructuredSelection)selection).size() == 1) {
			Object object = ((IStructuredSelection)selection).getFirstElement();

			EditingDomain domain = ((IEditingDomainProvider)activeEditorPart).getEditingDomain();

			newChildDescriptors = domain.getNewChildDescriptors(object, null);
			newSiblingDescriptors = domain.getNewChildDescriptors(null, object);
		}

		// Generate actions for selection; populate and redraw the menus.
		//
		createChildActions = generateCreateChildActions(newChildDescriptors, selection);
		createSiblingActions = generateCreateSiblingActions(newSiblingDescriptors, selection);

		if (createChildMenuManager != null) {
			populateManager(createChildMenuManager, createChildActions, null);
			createChildMenuManager.update(true);
		}
		if (createSiblingMenuManager != null) {
			populateManager(createSiblingMenuManager, createSiblingActions, null);
			createSiblingMenuManager.update(true);
		}
		
		// Stores the selection that is needed for link management.
		saveLinkingSelection(selection);
	}

	/**
	 * Updates linkSelection by extracting all directly or indirectly contained
	 * {@link SpecObject}s.
	 */
	private void saveLinkingSelection(ISelection selection) {
		linkSelection.clear();
		if (selection instanceof IStructuredSelection) {
			Iterator<?> iterator = ((IStructuredSelection)selection).iterator();
			while (iterator.hasNext()) {
				Object obj = iterator.next();
				if (obj instanceof SpecObject) linkSelection.add((SpecObject) obj);
				if (obj instanceof SpecHierarchy) {
					SpecObject specObject = ((SpecHierarchy)obj).getObject();
					if (obj != null) linkSelection.add(specObject);
				}
			}
		}
	}

	/**
	 * This generates a {@link org.eclipse.emf.edit.ui.action.CreateChildAction} for each object in <code>descriptors</code>,
	 * and returns the collection of these actions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<IAction> generateCreateChildActions(Collection<?> descriptors, ISelection selection) {
		Collection<IAction> actions = new ArrayList<IAction>();
		if (descriptors != null) {
			for (Object descriptor : descriptors) {
				actions.add(new CreateChildAction(activeEditorPart, selection, descriptor));
			}
		}
		return actions;
	}

	/**
	 * This generates a {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} for each object in <code>descriptors</code>,
	 * and returns the collection of these actions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<IAction> generateCreateSiblingActions(Collection<?> descriptors, ISelection selection) {
		Collection<IAction> actions = new ArrayList<IAction>();
		if (descriptors != null) {
			for (Object descriptor : descriptors) {
				actions.add(new CreateSiblingAction(activeEditorPart, selection, descriptor));
			}
		}
		return actions;
	}

	/**
	 * This populates the specified <code>manager</code> with {@link org.eclipse.jface.action.ActionContributionItem}s
	 * based on the {@link org.eclipse.jface.action.IAction}s contained in the <code>actions</code> collection,
	 * by inserting them before the specified contribution item <code>contributionID</code>.
	 * If <code>contributionID</code> is <code>null</code>, they are simply added.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void populateManager(IContributionManager manager, Collection<? extends IAction> actions, String contributionID) {
		if (actions != null) {
			for (IAction action : actions) {
				if (contributionID != null) {
					manager.insertBefore(contributionID, action);
				}
				else {
					manager.add(action);
				}
			}
		}
	}
		
	/**
	 * This removes from the specified <code>manager</code> all {@link org.eclipse.jface.action.ActionContributionItem}s
	 * based on the {@link org.eclipse.jface.action.IAction}s contained in the <code>actions</code> collection.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void depopulateManager(IContributionManager manager, Collection<? extends IAction> actions) {
		if (actions != null) {
			IContributionItem[] items = manager.getItems();
			for (int i = 0; i < items.length; i++) {
				// Look into SubContributionItems
				//
				IContributionItem contributionItem = items[i];
				while (contributionItem instanceof SubContributionItem) {
					contributionItem = ((SubContributionItem)contributionItem).getInnerItem();
				}

				// Delete the ActionContributionItems with matching action.
				//
				if (contributionItem instanceof ActionContributionItem) {
					IAction action = ((ActionContributionItem)contributionItem).getAction();
					if (actions.contains(action)) {
						manager.remove(contributionItem);
					}
				}
			}
		}
	}

	/**
	 * This populates the pop-up menu before it appears.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void menuAboutToShow(IMenuManager menuManager) {
		super.menuAboutToShow(menuManager);
		MenuManager submenuManager = null;

		submenuManager = new MenuManager(Reqif10EditorPlugin.INSTANCE.getString("_UI_CreateChild_menu_item"));
		populateManager(submenuManager, createChildActions, null);
		menuManager.insertBefore("edit", submenuManager);

		submenuManager = new MenuManager(Reqif10EditorPlugin.INSTANCE.getString("_UI_CreateSibling_menu_item"));
		populateManager(submenuManager, createSiblingActions, null);
		menuManager.insertBefore("edit", submenuManager);
		
		// New Code for Link Management
		buildLinkMenuEntries(menuManager);

}

	/**
	 * Extends the context menu for link management. It is only active if the
	 * current selection contains at least one {@link SpecObject} or one
	 * {@link SpecHierarchy}.<p>
	 * 
	 * There is always an action "Initiate Linking" which saves the current selection as a starting point.<p>
	 * 
	 * If a selection has been initiated, there are two additional entries "link to" and "link from" that complete the link
	 * process with the previously initiated selection.
	 * 
	 * @param menuManager
	 */
	private void buildLinkMenuEntries(IMenuManager menuManager) {
		if (linkSelection.isEmpty()) return;
		
		MenuManager submenuManager;
		menuManager.insertAfter("edit", new Separator());

		ImageDescriptor toIcon = ExtendedImageRegistry.INSTANCE.getImageDescriptor(Reqif10EditorPlugin.INSTANCE.getImage(
				"full/obj16/SpecRelationTo.png"));
		ImageDescriptor fromIcon = ExtendedImageRegistry.INSTANCE.getImageDescriptor(Reqif10EditorPlugin.INSTANCE.getImage(
				"full/obj16/SpecRelationFrom.png"));

		if (!linkSource.isEmpty()) {
			submenuManager = new MenuManager(
					Reqif10EditorPlugin.INSTANCE
							.getString("_Action_Complete_Linking_From", new String[] { linkSource.size() + "" }),
					fromIcon, "_Action_Complete_Linking_From");
			populateLinkMenu(submenuManager, linkSelection, linkSource);
			menuManager.insertAfter("edit", submenuManager);

			submenuManager = new MenuManager(
					Reqif10EditorPlugin.INSTANCE
							.getString("_Action_Complete_Linking_To", new String[] { linkSource.size() + "" }),
					toIcon, "_Action_Complete_Linking_To");
			populateLinkMenu(submenuManager, linkSource, linkSelection);
			menuManager.insertAfter("edit", submenuManager);
		}
		IAction action = new Action(
				Reqif10EditorPlugin.INSTANCE
						.getString("_Action_Initiate_Linking", new String[] { linkSelection.size() + "" })) {
			@Override
			public void run() {
				linkSource.clear();
				linkSource.addAll(linkSelection);
			}
		};
		menuManager.insertAfter("edit", action);
	}
		
	private void populateLinkMenu(IContributionManager manager, List<SpecObject> source, List<SpecObject> target) {
		final EditingDomain domain = ((IEditingDomainProvider)activeEditorPart).getEditingDomain();
		ReqIFContent coreContent = ReqIF10Util.getReqIF(linkSource.get(0)).getCoreContent();
		
		manager.add(createLinkCommand(source, target, domain,
				coreContent, null));
		
		for (SpecType type : coreContent.getSpecTypes()) {
			if (type instanceof SpecRelationType) {
				manager.add(createLinkCommand(source, target, domain,
						coreContent, (SpecRelationType) type));
			}
		}
	}

	/**
	 * Builds a command that creates the links between source and target, using type.
	 */
	private IAction createLinkCommand(List<SpecObject> source,
			List<SpecObject> target, final EditingDomain domain,
			ReqIFContent coreContent, SpecRelationType type) {
		String label;
		if (type == null) {
			label = Reqif10EditorPlugin.INSTANCE
					.getString("_Action_SpecRelation_Untyped");
		} else {
			String typeName = type.getLongName();
			if (typeName == null)
				typeName = type.getIdentifier();
			label = Reqif10EditorPlugin.INSTANCE
					.getString("_Action_SpecRelation_Typed", new String[] { typeName });
		}
		final CompoundCommand cmd = new CompoundCommand(label);
		for (SpecObject sourceObject : source) {
			for (SpecObject targetObject : target) {
				SpecRelation specRelation = ReqIF10Factory.eINSTANCE.createSpecRelation();
				specRelation.setSource(sourceObject);
				specRelation.setTarget(targetObject);
				specRelation.setType(type);
				cmd.append(AddCommand.create(domain, coreContent,
						ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_RELATIONS,
						specRelation));
			}
		}
		return new Action(label) {
			@Override
			public void run() {
				domain.getCommandStack().execute(cmd);
			}
		};
	}


	/**
	 * This inserts global actions before the "additions-end" separator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void addGlobalActions(IMenuManager menuManager) {
		menuManager.insertAfter("additions-end", new Separator("ui-actions"));
		menuManager.insertAfter("ui-actions", showPropertiesViewAction);

		refreshViewerAction.setEnabled(refreshViewerAction.isEnabled());		
		menuManager.insertAfter("ui-actions", refreshViewerAction);

		super.addGlobalActions(menuManager);
	}

	/**
	 * This ensures that a delete action will clean up all references to deleted objects.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean removeAllReferencesOnDelete() {
		return true;
	}

	public AgileCellEditorActionHandler getAgileCellEditorActionHandler() {
		return agileCellEditorActionHandler;
	}
	
}
