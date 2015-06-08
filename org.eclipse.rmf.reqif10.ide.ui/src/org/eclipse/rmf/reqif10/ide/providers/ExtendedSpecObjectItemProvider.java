package org.eclipse.rmf.reqif10.ide.providers;

import org.eclipse.emf.common.notify.AdapterFactory;
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

}
