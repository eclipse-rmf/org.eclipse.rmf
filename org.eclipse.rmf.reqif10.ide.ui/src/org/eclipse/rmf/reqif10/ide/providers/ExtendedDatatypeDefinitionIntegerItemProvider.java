package org.eclipse.rmf.reqif10.ide.providers;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.rmf.reqif10.provider.DatatypeDefinitionIntegerItemProvider;

public class ExtendedDatatypeDefinitionIntegerItemProvider extends
		DatatypeDefinitionIntegerItemProvider {

	public ExtendedDatatypeDefinitionIntegerItemProvider(
			AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getParent(Object object) { 
	  Object parent = super.getParent(object);
	  return adapterFactory.adapt(parent, TransientTypesItemProvider.class); 
	}
}
