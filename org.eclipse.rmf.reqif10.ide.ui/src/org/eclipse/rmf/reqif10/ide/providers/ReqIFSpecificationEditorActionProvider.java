package org.eclipse.rmf.reqif10.ide.providers;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.sphinx.emf.ui.actions.BasicOpenInEditorAction;
import org.eclipse.sphinx.emf.ui.actions.providers.BasicEditorActionProvider;
import org.eclipse.sphinx.platform.ui.util.SelectionUtil;

public class ReqIFSpecificationEditorActionProvider extends
		BasicEditorActionProvider {

	public ReqIFSpecificationEditorActionProvider() {
		super();
	}

	@Override
	public void doInit() {
		openInEditorAction = new BasicOpenInEditorAction();

		if (selectionProvider != null) {
			selectionProvider.addSelectionChangedListener(openInEditorAction);

			ISelection selection = selectionProvider.getSelection();
			IStructuredSelection structuredSelection = SelectionUtil.getStructuredSelection(selection);
			openInEditorAction.updateSelection(structuredSelection);
		}

		if (viewer instanceof StructuredViewer) {
			((StructuredViewer) viewer).addDoubleClickListener(doubleClickListener);
		}
	}
	
}
