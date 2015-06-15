package org.eclipse.rmf.reqif10.ide.editor;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.State;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.rmf.internal.reqif10.ide.ui.Activator;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.configuration.provider.ConfigurationItemProviderAdapterFactory;
import org.eclipse.rmf.reqif10.pror.editor.agilegrid.ProrAgileGridViewer;
import org.eclipse.rmf.reqif10.pror.provider.ReqIF10ItemProviderAdapterFactory;
import org.eclipse.rmf.reqif10.xhtml.provider.XhtmlItemProviderAdapterFactory;
import org.eclipse.sphinx.emf.editors.forms.BasicTransactionalFormEditor;
import org.eclipse.sphinx.emf.editors.forms.pages.GenericContentsTreePage;
import org.eclipse.sphinx.emf.editors.forms.sections.IFormSection;
import org.eclipse.sphinx.emf.ui.util.ExtendedURIEditorInput;
import org.eclipse.sphinx.emf.util.EcorePlatformUtil;
import org.eclipse.sphinx.emf.util.EcoreResourceUtil;
import org.eclipse.sphinx.platform.util.PlatformLogUtil;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.handlers.RegistryToggleState;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

public class ReqIFSpecificationEditor extends BasicTransactionalFormEditor {
	
	boolean showSpecRelations = false;

	
	@Override
	protected AdapterFactory getCustomAdapterFactory() {
		return org.eclipse.rmf.reqif10.ide.providers.ReqIF10ItemProviderAdapterFactory.INSTANCE;
	}
	
	private Reqif10ActionBarContributor reqifActionBarContributor;

	
	public ReqIFSpecificationEditor() {
		super();
	}
	
	@Override
	public void init(IEditorSite site, IEditorInput editorInput) {
		// TODO Auto-generated method stub
		IEditorInput cleanedEditorInput = null;
		if (editorInput instanceof ExtendedURIEditorInput) {
			EObject eObject = EcorePlatformUtil.getEObject(((ExtendedURIEditorInput)editorInput).getURI());
			Specification specification = ReqIF10Util.getOwningSpecification(eObject);
			if (specification != null) {
				cleanedEditorInput = new ExtendedURIEditorInput(EcoreResourceUtil.getURI(specification));
			}
		}
		
		if (cleanedEditorInput !=null) {
			super.init(site, cleanedEditorInput);
		} else {
			super.init(site, editorInput);
		}
		
		reqifActionBarContributor = (Reqif10ActionBarContributor)site.getActionBarContributor();
		
		System.out.println("My Editor initialized");
	}
	
	
	/**
	 * This is the method used by the framework to install your own pages.
	 * <p>
	 * This implementation add a single {@link GenericContentsTreePage page} that displays the editor input object and
	 * its contents in a tree viewer.
	 * </p>
	 */
	@Override
	protected void addPages() {
		try {
			addPage(new ReqIFSpecificationPage(this,this.getTitle()));
		} catch (PartInitException ex) {
			PlatformLogUtil.logAsError(Activator.getPlugin(), ex);
		}
	}
	
	
	/**
	 * Forward requests to show or hide SpecRelations.
	 */
	public void setShowSpecRelations(boolean checked) {
		showSpecRelations = checked;
		
		System.out.println("setShowSpecRelations to " + showSpecRelations);
		
		// find the section that shows the ReqIF specification
		for (Object page : pages) {
			if (page instanceof ReqIFSpecificationPage) {
				ReqIFSpecificationPage specificationPage = (ReqIFSpecificationPage)page;
				for (IFormSection section : specificationPage.getSections()) {
					if (section instanceof ReqIFSpecificationSection) {
						ReqIFSpecificationSection specificationSection = (ReqIFSpecificationSection)section;
						specificationSection.setShowSpecRelations(checked);
					}
				}
			}
			
		}
	}
	
	
	@Override
	protected void handleActivate() {
		ICommandService service = (ICommandService) PlatformUI.getWorkbench().getService(ICommandService.class);
		Command command = service.getCommand("org.eclipse.rmf.reqif10.ide.ui.commands.toggleSpecRelations");
		State state = command.getState(RegistryToggleState.STATE_ID);
		
		boolean buttonState = (Boolean)state.getValue();	
			if (buttonState != showSpecRelations) {				
			    state.setValue(new Boolean(showSpecRelations));
			} 
	
	}
	
	
	public boolean getShowSpecRelations() {
		return showSpecRelations;
	}
	
	
	@Override
	protected void setInput(IEditorInput input) {
		// TODO Auto-generated method stub
		super.setInput(input);
	}
	
	@Override
	protected void updateEditorInput(URI newURI) {
		// TODO Auto-generated method stub
		super.updateEditorInput(newURI);
	}
}
