package org.eclipse.rmf.reqif10.ide.providers;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.provider.ReqIFItemProvider;

public class ExtendedReqIF10ItemProvider extends ReqIFItemProvider {

	public ExtendedReqIF10ItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	

	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		super.getChildrenFeatures(object);
		childrenFeatures.remove(ReqIF10Package.Literals.REQ_IF__TOOL_EXTENSIONS);
		childrenFeatures.remove(ReqIF10Package.Literals.REQ_IF__CORE_CONTENT);
		return childrenFeatures;
	}

}
