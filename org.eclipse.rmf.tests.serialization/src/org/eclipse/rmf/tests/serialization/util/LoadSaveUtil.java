/**
 * Copyright (c) 2013 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   itemis AG - initial API and implementation
 */
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
