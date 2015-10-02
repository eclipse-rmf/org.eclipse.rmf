package org.eclipse.rmf.tests.reqif10.constraints;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.serialization.ReqIF10ResourceFactoryImpl;
import org.eclipse.sphinx.emf.serialization.XMLPersistenceMappingResourceImpl;
import org.eclipse.sphinx.emf.serialization.XMLPersistenceMappingResourceSetImpl;
import org.junit.BeforeClass;
import org.junit.Test;

public class AV16_XhtmlValueTest extends AbstractConstraintTest {

	private static XMLPersistenceMappingResourceSetImpl resourceSet;

	@Override
	protected String getConstraintID() {
		return "org.eclipse.rmf.reqif10.constraints.AV1.6";
	}

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

	@Test
	public void testInvalid() throws Exception {
		ReqIF reqif = loadReqif(URI.createFileURI("testdata/xhtml2.reqif"));
		IStatus status = validator.validate(reqif);
		assertEquals(IStatus.ERROR, status.getSeverity());
		assertEquals(406, status.getCode());
	}

	@Test
	public void testValid() throws Exception {
		ReqIF reqif = loadReqif(URI.createFileURI("testdata/xhtml1.reqif"));
		IStatus status = validator.validate(reqif);
		assertEquals(IStatus.OK, status.getSeverity());
	}

}
