package org.eclipse.rmf.reqif10.ide.editor;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.rmf.internal.reqif10.ide.ui.Activator;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.pror.configuration.provider.ConfigurationItemProviderAdapterFactory;
import org.eclipse.rmf.reqif10.pror.editor.agilegrid.ProrAgileGridViewer;
import org.eclipse.rmf.reqif10.pror.provider.ReqIF10ItemProviderAdapterFactory;
import org.eclipse.rmf.reqif10.xhtml.provider.XhtmlItemProviderAdapterFactory;
import org.eclipse.sphinx.emf.editors.forms.pages.AbstractFormPage;
import org.eclipse.sphinx.emf.editors.forms.sections.AbstractFormSection;
import org.eclipse.sphinx.emf.editors.forms.sections.AbstractViewerFormSection;
import org.eclipse.sphinx.emf.metamodel.MetaModelDescriptorRegistry;
import org.eclipse.sphinx.emf.ui.util.EcoreUIUtil;
import org.eclipse.sphinx.emf.util.EcorePlatformUtil;
import org.eclipse.sphinx.emf.util.EcoreResourceUtil;
import org.eclipse.sphinx.emf.util.WorkspaceEditingDomainUtil;
import org.eclipse.sphinx.emf.workspace.domain.WorkspaceEditingDomainManager;
import org.eclipse.sphinx.platform.util.PlatformLogUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.ui.ide.FileStoreEditorInput;

public class ReqIFSpecificationSection extends AbstractViewerFormSection implements IMenuListener {

	private ProrAgileGridViewer prorAgileGridViewer;
	protected ComposedAdapterFactory adapterFactory;
	Reqif10ActionBarContributor reqifActionBarContributor;

	public ReqIFSpecificationSection(AbstractFormPage formPage,
			Object sectionInput, int style) {
		super(formPage, sectionInput, style);
		// TODO Auto-generated constructor stub
	}

	public ReqIFSpecificationSection(AbstractFormPage formPage,
			Object sectionInput) {
		super(formPage, sectionInput);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void createSectionClientContent(IManagedForm managedForm,
			SectionPart sectionPart, Composite sectionClient) {

		if (sectionInput instanceof Specification) {
			Specification specification = (Specification) sectionInput;
			adapterFactory = new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

			adapterFactory
					.addAdapterFactory(new ResourceItemProviderAdapterFactory());
			adapterFactory
					.addAdapterFactory(new ReqIF10ItemProviderAdapterFactory());
			adapterFactory
					.addAdapterFactory(new XhtmlItemProviderAdapterFactory());
			adapterFactory
					.addAdapterFactory(new ConfigurationItemProviderAdapterFactory());
			adapterFactory
					.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

			reqifActionBarContributor = (Reqif10ActionBarContributor) getFormPage()
					.getTransactionalFormEditor().getActionBarContributor();

			sectionClient.setLayoutData(new GridData(GridData.FILL_BOTH));

			prorAgileGridViewer = new ProrAgileGridViewer(sectionClient,
					adapterFactory, getEditingDomain(),
					reqifActionBarContributor.getAgileCellEditorActionHandler());

			prorAgileGridViewer.getControl().setLayoutData(
					new GridData(GridData.FILL_BOTH));
			prorAgileGridViewer.setInput(specification);
			// setsetSelectionProvider(prorAgileGridViewer);
			if (false == specification.getChildren().isEmpty()) {
				prorAgileGridViewer.setSelection(new StructuredSelection(
						specification.getChildren().get(0)));
			}
			setViewer(prorAgileGridViewer);
			buildContextMenu();
		} else {
			PlatformLogUtil.logAsError(Activator.getPlugin(),
					"not supported input type of Specification editor");
		}
	}

	@Override
	public void createContent(IManagedForm managedForm, Composite parent) {
		Assert.isNotNull(managedForm);
		Assert.isNotNull(parent);

		// Create section part
		FormToolkit toolkit = managedForm.getToolkit();
		SectionPart sectionPart = createSectionPart(parent, toolkit);

		// Initialize section
		section = sectionPart.getSection();
		if (title != null) {
			section.setText(title);
		}
		if (description != null) {
			section.setDescription(description);
		}
		if (parent.getLayout() instanceof GridLayout) {
			section.setLayoutData(new GridData(GridData.FILL_BOTH));
		} else if (parent.getLayout() instanceof TableWrapLayout) {
			section.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB,
					TableWrapData.FILL_GRAB));
		}
		section.marginWidth = 0;
		section.marginHeight = 0;

		// Create and set section client
		Composite client = createSectionClient(managedForm, sectionPart);
		addFocusListener(client);
		section.setClient(client);

		// Add section part to form
		managedForm.addPart(sectionPart);
	}

	@Override
	protected int getNumberOfColumns() {
		// TODO Auto-generated method stub
		return 1;
	}

	/**
	 * This returns the editing domain as required by the
	 * {@link IEditingDomainProvider} interface. This is important for
	 * implementing the static methods of {@link AdapterFactoryEditingDomain}
	 * and for supporting {@link org.eclipse.emf.edit.ui.action.CommandAction}.
	 */
	public EditingDomain getEditingDomain() {
		URI uri = EcoreUIUtil.getURIFromEditorInput(this.getFormPage()
				.getEditorInput());
		return getEditingDomain(uri);
	}

	protected TransactionalEditingDomain getEditingDomain(final URI uri) {
		TransactionalEditingDomain editingDomain = WorkspaceEditingDomainUtil
				.getEditingDomain(uri);
		if (editingDomain == null
				&& sectionInput instanceof FileStoreEditorInput) {
			// If the file has been deleted
			if (((FileStoreEditorInput) sectionInput).exists()) {
				String modelNamespace = EcoreResourceUtil.readModelNamespace(
						null, EcoreUIUtil.getURIFromEditorInput(getFormPage()
								.getEditorInput()));
				editingDomain = WorkspaceEditingDomainManager.INSTANCE
						.getEditingDomainMapping().getEditingDomain(
								null,
								MetaModelDescriptorRegistry.INSTANCE
										.getDescriptor(java.net.URI
												.create(modelNamespace)));
			}
		}
		return editingDomain;

	}

	/**
	 * Delegate populating the context menu to EMF.
	 */
	private MenuManager buildContextMenu() {
		MenuManager contextMenu = new MenuManager("#PopUp");
		contextMenu.add(new Separator("additions"));
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(this);

		Menu menu = contextMenu.createContextMenu(prorAgileGridViewer
				.getControl());
		prorAgileGridViewer.getControl().setMenu(menu);
		
		getFormPage().getSite().registerContextMenu(contextMenu,
				 new UnwrappingSelectionProvider(prorAgileGridViewer));


		return contextMenu;
	}

	@Override
	public void menuAboutToShow(IMenuManager manager) {
			((IMenuListener) getFormPage().getTransactionalFormEditor().getEditorSite().getActionBarContributor())
					.menuAboutToShow(manager);
	}

}
