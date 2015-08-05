package org.eclipse.rmf.reqif10.ide.editor;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sphinx.emf.ui.util.ExtendedURIEditorInput;
import org.eclipse.sphinx.emf.util.EcorePlatformUtil;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorMatchingStrategy;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.PartInitException;

public class ReqIFSpecificationEditorMatchingStrategy implements
		IEditorMatchingStrategy {

	public ReqIFSpecificationEditorMatchingStrategy() {
		super();
	}

	@Override
	public boolean matches(IEditorReference editorRef, IEditorInput input) {
		Object currentEditorInput;
		try {
			currentEditorInput = editorRef.getEditorInput();
			if (currentEditorInput != null && input != null && input instanceof ExtendedURIEditorInput) {
				ExtendedURIEditorInput extCurrent = (ExtendedURIEditorInput)currentEditorInput;
				ExtendedURIEditorInput extInput = (ExtendedURIEditorInput)input;
				EObject eObjectCurrent = EcorePlatformUtil.loadEObject(extCurrent.getURI());
				EObject eObjectInput = EcorePlatformUtil.loadEObject(extInput.getURI());
			
				return isContained(eObjectCurrent, eObjectInput);
			}
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	protected boolean isContained(EObject specification, EObject specHierarchy) {
		if (specification != null && specHierarchy != null) {
				EObject container = specHierarchy;
				while (container != null) {
					if (specification.equals(container)) {
						return true;
					} else {
						container = container.eContainer();
					}
				}
			
		}
		return false;
	}

}
