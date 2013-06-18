package org.eclipse.rmf.tests.serialization.util;

import java.util.Map;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.rmf.tests.serialization.internal.Activator;

@SuppressWarnings("nls")
public abstract class AbstractTestCase extends org.eclipse.sphinx.testutils.AbstractTestCase {

	@Override
	protected Plugin getTestPlugin() {
		return new Activator.Implementation();
	}

	/**
	 * required to overwrite this, since the Sphinx AbstractTestCase doesn't properly handle plain java tests
	 */
	@Override
	protected EObject loadInputFile(String inputFileName, ResourceFactoryImpl resourceFactory, Map<?, ?> options) throws Exception {
		URI emfURI = URI.createURI("resources/input/" + inputFileName, true);
		XMLResource resource = (XMLResource) resourceFactory.createResource(emfURI);
		resource.load(options);

		ResourceSet resourceSet = createDefaultResourceSet();
		resourceSet.getResources().add(resource);

		assertHasNoLoadProblems(resource);

		return resource.getContents().get(0);
	}

}
