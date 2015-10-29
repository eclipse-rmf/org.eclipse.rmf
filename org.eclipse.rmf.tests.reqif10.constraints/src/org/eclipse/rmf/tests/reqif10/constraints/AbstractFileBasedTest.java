package org.eclipse.rmf.tests.reqif10.constraints;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.serialization.ReqIF10ResourceFactoryImpl;
import org.eclipse.sphinx.emf.serialization.XMLPersistenceMappingResourceImpl;
import org.eclipse.sphinx.emf.serialization.XMLPersistenceMappingResourceSetImpl;
import org.junit.BeforeClass;

public abstract class AbstractFileBasedTest extends AbstractConstraintTest {

	private static XMLPersistenceMappingResourceSetImpl resourceSet;

	@BeforeClass
	public static void setupOnce() throws Exception {
		resourceSet = new XMLPersistenceMappingResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("reqif", new ReqIF10ResourceFactoryImpl());
	}

	protected ReqIF loadReqif(URI uri) throws IOException {
		XMLPersistenceMappingResourceImpl resource = (XMLPersistenceMappingResourceImpl) resourceSet.createResource(uri);
		resource.load(null);
		EList<EObject> rootObjects = resource.getContents();
		if (!rootObjects.isEmpty()) {
			return (ReqIF) rootObjects.get(0);
		}
		return null;
	}

}
