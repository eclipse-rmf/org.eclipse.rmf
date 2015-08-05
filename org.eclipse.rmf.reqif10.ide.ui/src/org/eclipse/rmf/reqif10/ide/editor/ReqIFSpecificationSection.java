package org.eclipse.rmf.reqif10.ide.editor;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.rmf.internal.reqif10.ide.ui.Activator;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.ide.providers.ReqIF10ItemProviderAdapterFactory;
import org.eclipse.rmf.reqif10.pror.configuration.provider.ConfigurationItemProviderAdapterFactory;
import org.eclipse.rmf.reqif10.pror.editor.agilegrid.ProrAgileGridViewer;
import org.eclipse.rmf.reqif10.xhtml.provider.XhtmlItemProviderAdapterFactory;
import org.eclipse.sphinx.emf.editors.forms.BasicTransactionalFormEditor;
import org.eclipse.sphinx.emf.editors.forms.pages.AbstractFormPage;
import org.eclipse.sphinx.emf.editors.forms.sections.AbstractViewerFormSection;
import org.eclipse.sphinx.platform.util.PlatformLogUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;


public class ReqIFSpecificationSection extends AbstractViewerFormSection implements IMenuListener {

	private ProrAgileGridViewer prorAgileGridViewer;
	Reqif10ActionBarContributor reqifActionBarContributor;
	ComposedAdapterFactory adapterFactory;

	public ReqIFSpecificationSection(AbstractFormPage formPage,
			Object sectionInput, int style) {
		super(formPage, sectionInput, style);
	}

	public ReqIFSpecificationSection(AbstractFormPage formPage,
			Object sectionInput) {
		super(formPage, sectionInput);
	}

	Specification getOwningSpecification(EObject eObject) {
		EObject container = eObject;
		while (container != null) {
			if (container instanceof Specification) {
				return (Specification)container;
			} else {
				container = container.eContainer();
			}
		}
		return null;
	}
	

	@Override
	protected void createSectionClientContent(IManagedForm managedForm,
			SectionPart sectionPart, Composite sectionClient) {
		if (sectionInput instanceof EObject) {
			EObject eObject = (EObject)sectionInput;
			Specification specification  = getOwningSpecification(eObject);


			if (specification != null) {
				
				//sectionClient.setLayoutData(new GridData(GridData.FILL_BOTH));
				// seems to be optional
				GridData data = new GridData(GridData.FILL_BOTH) ;
				data.verticalIndent = 0;
				data.horizontalIndent = 0;
				data.verticalSpan =0;
				data.horizontalSpan=0;
				sectionClient.setLayoutData(data);


				reqifActionBarContributor = (Reqif10ActionBarContributor) getFormPage()
						.getTransactionalFormEditor().getActionBarContributor();

				prorAgileGridViewer = new ProrAgileGridViewer(sectionClient,
						getCustomAdapterFactory(), getEditingDomain(),
						reqifActionBarContributor.getAgileCellEditorActionHandler());

				prorAgileGridViewer.getControl().setLayoutData(
						new GridData(GridData.FILL_BOTH));
				prorAgileGridViewer.setInput(specification);
				// setsetSelectionProvider(prorAgileGridViewer);
				
				
				
				setViewer(prorAgileGridViewer);
				
				if (false == specification.getChildren().isEmpty()) {
					getViewer().setSelection(new StructuredSelection(
							specification.getChildren().get(0)));
				}
				
			} else {
				PlatformLogUtil.logAsError(Activator.getPlugin(),
						"not supported input type of Specification editor");
			}
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
			GridData data = new GridData(GridData.FILL_BOTH) ;
			/*
			data.verticalIndent = 0;
			data.horizontalIndent = 0;
			data.horizontalSpan = 0;
			data.verticalSpan = 0;
			*/
			
			section.setLayoutData(data);
		} else if (parent.getLayout() instanceof TableWrapLayout) {
			section.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB,
					TableWrapData.FILL_GRAB));
		}
		section.marginWidth = 0;
		section.marginHeight = 0;
		
		Device device = Display.getCurrent ();
		Color red = device.getSystemColor(SWT.COLOR_WHITE);
		section.setBackground(red);

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
		BasicTransactionalFormEditor editor = (BasicTransactionalFormEditor)getFormPage().getEditor();
		return editor.getEditingDomain();
	}


	@Override
	public void menuAboutToShow(IMenuManager manager) {
		((IMenuListener) getFormPage().getTransactionalFormEditor().getEditorSite().getActionBarContributor())
		.menuAboutToShow(manager);
	}

	public void setShowSpecRelations(boolean checked) {

		ISelection sel = getViewer().getSelection();

		prorAgileGridViewer.setShowSpecRelations(checked);

		// Set the correct selection after showing/hiding SpecRelations
		if (sel instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) sel;
			Object firstElement = selection.getFirstElement();
			// If a SpecRelation was selected, select after hiding the
			// SpecRealtions the first SpecHierarchy of the Specification
			if (firstElement instanceof SpecRelation) {
				selection = new StructuredSelection(((Specification)sectionInput).getChildren()
						.get(0));
			}
			prorAgileGridViewer.setSelection(selection);
		}

	}

	
	
	@Override
	protected AdapterFactory getCustomAdapterFactory() {
		if (adapterFactory == null) {
			adapterFactory = new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
			adapterFactory
			.addAdapterFactory(new ResourceItemProviderAdapterFactory());
			adapterFactory
			.addAdapterFactory(ReqIF10ItemProviderAdapterFactory.INSTANCE);
			adapterFactory
			.addAdapterFactory(new XhtmlItemProviderAdapterFactory());
			adapterFactory
			.addAdapterFactory(new ConfigurationItemProviderAdapterFactory());
			adapterFactory
			.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
		}
		return adapterFactory;
	}
	
	
	@Override
	protected void createViewerContextMenu() {
		super.createViewerContextMenu();
		MenuManager contextMenu = new MenuManager("#PopUp");
		
		contextMenu.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(this);
		
		Control control = getViewer().getControl();

		Menu menu = contextMenu.createContextMenu(control);
		control.setMenu(menu);
		
		getFormPage().getSite().registerContextMenu(contextMenu,
				new UnwrappingSelectionProvider(getViewer()));
	}


}
