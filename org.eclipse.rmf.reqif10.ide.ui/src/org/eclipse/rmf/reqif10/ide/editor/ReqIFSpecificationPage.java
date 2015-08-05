package org.eclipse.rmf.reqif10.ide.editor;

import org.eclipse.sphinx.emf.editors.forms.layouts.LayoutFactory;
import org.eclipse.sphinx.emf.editors.forms.pages.AbstractFormPage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;

public class ReqIFSpecificationPage extends AbstractFormPage {
	
	ReqIFSpecificationSection reqifSpecificationSection;

	public ReqIFSpecificationPage(FormEditor editor, String title) {
		super(editor, title);
		// TODO Auto-generated constructor stub
	}

	public ReqIFSpecificationPage(FormEditor editor, String id, String title) {
		super(editor, id, title);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doCreateFormContent(IManagedForm managedForm) {
		// Create single columned page layout
		Composite body = managedForm.getForm().getBody();
		body.setLayout(LayoutFactory.createFormBodyGridLayout(false, 1));
		
		// Create model contents tree section
		reqifSpecificationSection = new ReqIFSpecificationSection(this, pageInput);
		reqifSpecificationSection.createContent(managedForm, body);
		addSection(reqifSpecificationSection);
		
	}
	
	

	

	
}
