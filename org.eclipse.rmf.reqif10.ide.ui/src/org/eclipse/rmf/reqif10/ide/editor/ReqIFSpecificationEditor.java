package org.eclipse.rmf.reqif10.ide.editor;

import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.rmf.internal.reqif10.ide.ui.Activator;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.pror.configuration.provider.ConfigurationItemProviderAdapterFactory;
import org.eclipse.rmf.reqif10.pror.editor.agilegrid.ProrAgileGridViewer;
import org.eclipse.rmf.reqif10.pror.provider.ReqIF10ItemProviderAdapterFactory;
import org.eclipse.rmf.reqif10.xhtml.provider.XhtmlItemProviderAdapterFactory;
import org.eclipse.sphinx.emf.editors.forms.BasicTransactionalFormEditor;
import org.eclipse.sphinx.emf.editors.forms.pages.GenericContentsTreePage;
import org.eclipse.sphinx.emf.editors.forms.sections.IFormSection;
import org.eclipse.sphinx.platform.util.PlatformLogUtil;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;

public class ReqIFSpecificationEditor extends BasicTransactionalFormEditor {

	
	private Reqif10ActionBarContributor reqifActionBarContributor;


	
	public ReqIFSpecificationEditor() {
		super();
	}
	
	@Override
	public void init(IEditorSite site, IEditorInput editorInput) {
		// TODO Auto-generated method stub
		super.init(site, editorInput);
		
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


	

	
	

}
