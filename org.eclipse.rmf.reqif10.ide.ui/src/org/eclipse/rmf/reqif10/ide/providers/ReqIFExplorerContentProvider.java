package org.eclipse.rmf.reqif10.ide.providers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.rmf.internal.reqif10.ide.ui.Activator;
import org.eclipse.sphinx.emf.explorer.BasicExplorerContentProvider;
import org.eclipse.sphinx.platform.util.PlatformLogUtil;

public class ReqIFExplorerContentProvider extends BasicExplorerContentProvider {

	@Override
	protected AdapterFactory getCustomAdapterFactory() {
		return new ExtendedReqIF10ItemProviderAdapterFactory();
	}
	
	@Override
	public Object[] getChildren(Object parentElement) {
		Object[] children = null;

		try {
			// Is parent element a workspace resource?
			if (parentElement instanceof IResource) {
				// Get model root behind workspace resource (might not be loaded yet according to loading policy)
				@SuppressWarnings("deprecation")
				Object modelRoot = getModelRoot((IResource) parentElement);
				if (modelRoot != null) {
					// Get model content root for model root
					@SuppressWarnings("deprecation")
					Object modelContentRoot = getModelContentRoot(modelRoot);

					// Get model content provider of model content root
					AdapterFactoryContentProvider contentProvider = getModelContentProvider(modelContentRoot);
					if (contentProvider != null) {
						// Set model content root as model content provider input
						contentProvider.inputChanged(viewer, null, modelContentRoot);

						// Retrieve children of model content root
						children = contentProvider.getChildren(modelContentRoot);
					}
				}
			}

			// Assume that parent element is an EObject
			else if (parentElement instanceof EObject) {
				// Retrieve children of specified parent element
				AdapterFactoryContentProvider contentProvider = getModelContentProvider(parentElement);
				Object[] parentChildren = null;
				if (contentProvider != null) {
					parentChildren = contentProvider.getChildren(parentElement);
				}
				children = addTypeChildren((EObject) parentElement, parentChildren);
			} else if (parentElement instanceof ChildWrapper) {
				children = getChildren(((ChildWrapper) parentElement).getObject());
			}
		} catch (Exception ex) {
			PlatformLogUtil.logAsError(Activator.getPlugin(), ex);
		}
		return children != null ? children : new Object[0];
	}

	private Object[] addTypeChildren(EObject parentElement, Object[] children) {
		ArrayList<Object> childrenList = new ArrayList<Object>();
		if (children != null) {
			childrenList.addAll(Arrays.asList(children));
		}
		for (EStructuralFeature reference : getReferencesToShow(parentElement)) {
			EObject dereferenced = (EObject) parentElement.eGet(reference);
			AdapterFactoryContentProvider contentProvider = getModelContentProvider(dereferenced);
			if (contentProvider != null) {
				Object[] typeChildren = contentProvider.getChildren(dereferenced);
				if (typeChildren.length > 0) {
					for (Object o : typeChildren) {
						childrenList.add(new ChildWrapper((EObject) o));
					}
				}

			}
		}
		return childrenList.toArray();
	}

	private List<EStructuralFeature> getReferencesToShow(EObject parentElement) {
		List<EStructuralFeature> result = new ArrayList<EStructuralFeature>();
		for (EStructuralFeature feature : parentElement.eClass().getEAllStructuralFeatures()) {
			if (feature instanceof EReference) {
				EStructuralFeature nameFeature = feature.eClass().getEStructuralFeature("name"); //$NON-NLS-1$
				if (nameFeature == null) {
					continue;
				}
				String name = (String) feature.eGet(nameFeature);
				if (name.equals("type")) { //$NON-NLS-1$
					result.add(feature);
				}
			}
		}
		return result;
	}
	
}
