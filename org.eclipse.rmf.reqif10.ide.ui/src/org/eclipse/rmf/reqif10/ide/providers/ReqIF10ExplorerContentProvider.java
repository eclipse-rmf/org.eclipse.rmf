package org.eclipse.rmf.reqif10.ide.providers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.sphinx.emf.explorer.BasicExplorerContentProvider;
import org.eclipse.sphinx.emf.util.EcorePlatformUtil;
import org.eclipse.sphinx.emf.util.EcoreResourceUtil;

public class ReqIF10ExplorerContentProvider extends BasicExplorerContentProvider {

	@Override
	protected AdapterFactory getCustomAdapterFactory() {
		return ReqIF10ItemProviderAdapterFactory.INSTANCE;
	}
	
	@Override
	public Object[] getChildren(Object parentElement) {
		List<Object> roots = new ArrayList<Object>();
		roots.addAll(Arrays.asList(super.getChildren(parentElement)));
		return roots.toArray();
	}
	
	@Override
	public Object[] getElements(Object inputElement) {
		List<Object> roots = new ArrayList<Object>();
		roots.addAll(Arrays.asList(super.getElements(inputElement)));
		return roots.toArray();
	}
	
	//@Override
	protected List<Object> getModelContentRoots_(Resource modelResource) {
		List<Object> roots = new ArrayList<Object>();

		if (modelResource != null) {
		for (EObject eObject : modelResource.getContents()) {
			if (eObject instanceof ReqIF) {
				ReqIF reqIF = (ReqIF)eObject;
				roots.add(reqIF);
				/*
				 ReqIFContent reqIFContent = reqIF.getCoreContent();
				
				if (reqIFContent != null) {
					roots.add(reqIFContent);
				}
				 */
			}
		}
		}
		
		if (roots.isEmpty()) {
			return super.getModelContentRoots(modelResource);
		} else {
			return roots;
		}
	}
	
}
