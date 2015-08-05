package org.eclipse.rmf.reqif10.ide.providers;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.rmf.reqif10.provider.SpecObjectItemProvider;

public class ExtendedSpecObjectItemProvider extends SpecObjectItemProvider {

	public ExtendedSpecObjectItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getParent(Object object) {
		Object parent = super.getParent(object);
		return adapterFactory.adapt(parent,
				TransientSpecObjectsItemProvider.class);
	}
	
	@Override
	public String getText(Object object) {
		String postfix = "";
		if (object instanceof EObject) {
			EObject eObject = (EObject)object;
			if (eObject.eIsProxy()) {
				postfix = " <proxy uri: " + ((InternalEObject)eObject).eProxyURI() + ">";
			}
		}
		return super.getText(object) + postfix;
	}

}
