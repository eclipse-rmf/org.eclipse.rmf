package org.eclipse.rmf.reqif10.ide;

import org.eclipse.rmf.internal.reqif10.ide.ui.Activator;
import org.eclipse.sphinx.emf.ui.actions.BasicOpenInEditorAction;
import org.eclipse.sphinx.emf.ui.util.EcoreUIUtil;
import org.eclipse.sphinx.platform.util.PlatformLogUtil;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

public class ReqIFOpenInEditorAction extends BasicOpenInEditorAction {

	public ReqIFOpenInEditorAction() {
		super();
	}
	
	@Override
	public void run() {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		if (page != null) {
			//getStructuredSelection();
			for (String editorId : editorIdToEditorInputObjectsMap.keySet()) {
				for (Object object : editorIdToEditorInputObjectsMap.get(editorId)) {
					try {
						// Create editor input pointing at selected object
						IEditorInput editorInput = EcoreUIUtil.createURIEditorInput(object);
						if (editorInput != null) {
							page.openEditor(editorInput, editorId);
						}
					} catch (Exception ex) {
						PlatformLogUtil.logAsError(Activator.getPlugin(), ex);
					}
				}
			}
		}
	}

}
