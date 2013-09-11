package org.eclipse.rmf.tests.serialization.model.nodes.serialization;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.rmf.serialization.XMLPersistenceMappingResourceFactoryImpl;

public class NodesResourceFactoryImpl extends XMLPersistenceMappingResourceFactoryImpl {
	@Override
	public Resource createResource(URI uri) {
		return new NodesResourceImpl(uri);
	}
}
