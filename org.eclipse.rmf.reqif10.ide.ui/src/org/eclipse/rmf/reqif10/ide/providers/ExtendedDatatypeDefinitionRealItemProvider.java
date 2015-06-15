package org.eclipse.rmf.reqif10.ide.providers;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.rmf.reqif10.provider.DatatypeDefinitionBooleanItemProvider;
import org.eclipse.rmf.reqif10.provider.DatatypeDefinitionIntegerItemProvider;
import org.eclipse.rmf.reqif10.provider.DatatypeDefinitionRealItemProvider;
import org.eclipse.rmf.reqif10.provider.DatatypeDefinitionStringItemProvider;

public class ExtendedDatatypeDefinitionRealItemProvider extends
		DatatypeDefinitionRealItemProvider {

	public ExtendedDatatypeDefinitionRealItemProvider(
			AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getParent(Object object) { 
	  Object parent = super.getParent(object);
	  return adapterFactory.adapt(parent, TransientTypesItemProvider.class); 
	}
}
