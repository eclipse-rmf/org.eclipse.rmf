package org.eclipse.rmf.reqif10.ide.providers;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationFactory;
import org.eclipse.rmf.reqif10.provider.ReqIFToolExtensionItemProvider;
import org.eclipse.rmf.reqif10.provider.SpecRelationTypeItemProvider;

public class ExtendedReqIFToolExtensionItemProvider extends ReqIFToolExtensionItemProvider {

	public ExtendedReqIFToolExtensionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	
	@Override
	public Object getParent(Object object) { 
	  Object parent = super.getParent(object);
	  return adapterFactory.adapt(parent, TransientToolExtensionsItemProvider.class); 
	}
	
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) { 
		  newChildDescriptors.add(createChildParameter(ReqIF10Package.Literals.REQ_IF_TOOL_EXTENSION__EXTENSIONS,ConfigurationFactory.eINSTANCE.createProrToolExtension()));
	} 
	
}
