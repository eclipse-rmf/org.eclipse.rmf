package org.eclipse.rmf.reqif10.ide.providers;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.rmf.reqif10.provider.SpecRelationItemProvider;
import org.eclipse.rmf.reqif10.provider.SpecRelationTypeItemProvider;

public class ExtendedSpecRelationItemProvider extends SpecRelationItemProvider {

	public ExtendedSpecRelationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	
	@Override
	public Object getParent(Object object) { 
	  Object parent = super.getParent(object);
	  return adapterFactory.adapt(parent, TransientSpecRelationsItemProvider.class); 
	}

}
