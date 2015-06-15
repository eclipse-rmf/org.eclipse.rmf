package org.eclipse.rmf.reqif10.ide.providers;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.pror.util.ConfigurationUtil;
import org.eclipse.rmf.reqif10.provider.SpecHierarchyItemProvider;

public class ExtendedSpecHierarchyItemProvider extends
		SpecHierarchyItemProvider {

	public ExtendedSpecHierarchyItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	
	@Override
	public String getText(Object object) {
		SpecObject specObject = ((SpecHierarchy) object).getObject();
		if (specObject != null) {
			return ConfigurationUtil.getSpecElementLabel(specObject,
					adapterFactory);
		}
		return super.getText(object);
	}
	
	@Override
	public Object getImage(Object object) {
		if (((SpecHierarchy) object).getObject() == null) {
			return overlayImage(
					object,
					getResourceLocator().getImage(
							"full/obj16/SpecHierarchy.gif"));
		}
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/SpecObject.gif"));
	}
}
