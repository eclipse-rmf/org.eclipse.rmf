package org.eclipse.rmf.reqif10.ide.providers;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.provider.ReqIFItemProvider;

public class ExtendedReqIFItemProvider extends ReqIFItemProvider {

	public ExtendedReqIFItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		Collection<? extends EStructuralFeature> features = super.getChildrenFeatures(object);
		features.remove(ReqIF10Package.eINSTANCE.getReqIF_ToolExtensions());
		return features;
	}
	
	

}
