package org.eclipse.rmf.reqif10.ide.providers;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.rmf.reqif10.provider.DatatypeDefinitionBooleanItemProvider;
import org.eclipse.rmf.reqif10.provider.DatatypeDefinitionEnumerationItemProvider;

public class ExtendedDatatypeDefinitionEnumerationItemProvider extends
		DatatypeDefinitionEnumerationItemProvider {

	public ExtendedDatatypeDefinitionEnumerationItemProvider(
			AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public Object getParent(Object object) { 
	  Object parent = super.getParent(object);
	  return adapterFactory.adapt(parent, TransientDataTypesItemProvider.class); 
	}
}
