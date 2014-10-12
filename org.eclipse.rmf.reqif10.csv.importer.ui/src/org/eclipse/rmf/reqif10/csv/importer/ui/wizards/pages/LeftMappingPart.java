package org.eclipse.rmf.reqif10.csv.importer.ui.wizards.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EventObject;
import java.util.List;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.rmf.reqif10.csv.importer.mapping.provider.MappingItemProviderAdapterFactory;
import org.eclipse.rmf.reqif10.csv.importer.ui.CSVImporterUIPlugin;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

public class LeftMappingPart extends Composite {
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

	private EObject input;

	public LeftMappingPart(Composite parent, EObject input) {
		super(parent, SWT.NONE);
		setLayout(new FillLayout());
		this.input = input;
		createControls();
	}

	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	private void createControls() {

		createAdapterFactory();
		createEditingDomain();
		resource = editingDomain.getResourceSet().createResource(
				URI.createURI("TEMP"));
		resource.getContents().add(input);

		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));

		createTreeViewer(composite);
		treeViewer.setInput(resource);
		treeViewer.expandAll();

		new TreeViewerActionProvider(treeViewer);

	}

	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		treeViewer.addSelectionChangedListener(listener);
	}

	public void removeSelectionChangedListener(
			ISelectionChangedListener listener) {
		treeViewer.removeSelectionChangedListener(listener);
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
				.addAdapterFactory(new MappingItemProviderAdapterFactory());
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
			if (false == isDisposed()) {
				getDisplay().asyncExec(runnable);
			}
		}
	}

	private void createTreeViewer(Composite parent) {
		treeViewer = new TreeViewer(parent);
		treeViewer.getTree().setLayoutData(
				new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(
				adapterFactory));
		treeViewer.setContentProvider(new AdapterFactoryContentProvider(
				adapterFactory));
	}

	/**
	 * This looks up a string in plugin.properties, making a substitution.
	 * 
	 * @param key
	 *            the key of the string.
	 * @return a string resource associated with the key.
	 */
	protected static String getString(final String key) {
		return CSVImporterUIPlugin.INSTANCE.getString(key);
	}

	/**
	 * Called to dispose the widgets
	 */
	@Override
	public void dispose() {
		// saveInput();
		try {
			resource.delete(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		adapterFactory.dispose();
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

	public void setColumnMappingInput(List<String> columnMappingInput) {
	}

}
