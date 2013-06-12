package org.eclipse.rmf.tests.serialization.util;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class LoadSaveUtil {
	public static Resource loadResource(String fileName, ResourceFactoryImpl factory) throws IOException {
		URI emfURI = URI.createURI(fileName, true);
		Resource resource = factory.createResource(emfURI);
		resource.load(null);

		return resource;
	}

	public static void saveAsXMI(Resource inputResource, String fileName, ResourceFactoryImpl factory) throws IOException {
		URI emfURI = URI.createURI(fileName, true);
		Resource resource = factory.createResource(emfURI);
		resource.getContents().addAll(inputResource.getContents());
		resource.save(null);
	}

}
