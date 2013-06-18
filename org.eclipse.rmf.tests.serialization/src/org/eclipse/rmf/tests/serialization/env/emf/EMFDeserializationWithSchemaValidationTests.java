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
package org.eclipse.rmf.tests.serialization.env.emf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.XMLConstants;

import org.apache.xerces.impl.Constants;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DocumentRoot;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.util.MyreqifResourceFactoryImpl;
import org.junit.Test;

@SuppressWarnings("nls")
public class EMFDeserializationWithSchemaValidationTests {
	public static final String DATA_BASEDIR = "resources/input/org.eclipse.rmf.tests.serialization.env/data/"; //$NON-NLS-1$
	public static final String MODEL_BASEDIR = "resources/model/"; //$NON-NLS-1$

	@Test
	public void testSchemaValidationOnLoadWithValidFile() throws IOException {
		String fileName = DATA_BASEDIR + "simple.xml"; //$NON-NLS-1$

		// prepare resource set
		ResourceSet resourceSet = new ResourceSetImpl();
		EPackage.Registry.INSTANCE.put(XMLTypePackage.eNS_URI, XMLTypePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(XMLNamespacePackage.eNS_URI, XMLNamespacePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(MyreqifPackage.eNS_URI, MyreqifPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new MyreqifResourceFactoryImpl()); //$NON-NLS-1$

		// load data
		URI emfURI = URI.createURI(fileName, true);
		Resource resource = resourceSet.createResource(emfURI);
		HashMap<String, Object> options = new HashMap<String, Object>();
		enableSchemaValidationAndNewMethods(options);

		try {
			resource.load(options);
		} catch (IOException ioe) {
			assertTrue(ioe.getMessage(), false);
		}

		// validate data
		assertEquals(0, resource.getErrors().size());
	}

	@Test
	public void testSchemaValidationOnLoadWithInvalidFile() {
		String fileName = DATA_BASEDIR + "bare.xml"; //$NON-NLS-1$

		// prepare resource set
		ResourceSet resourceSet = new ResourceSetImpl();
		EPackage.Registry.INSTANCE.put(XMLTypePackage.eNS_URI, XMLTypePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(XMLNamespacePackage.eNS_URI, XMLNamespacePackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(MyreqifPackage.eNS_URI, MyreqifPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new MyreqifResourceFactoryImpl()); //$NON-NLS-1$

		// load data
		URI emfURI = URI.createURI(fileName, true);
		Resource resource = resourceSet.createResource(emfURI);
		HashMap<String, Object> options = new HashMap<String, Object>();
		enableSchemaValidationAndNewMethods(options);

		try {
			resource.load(options);
		} catch (IOException ioe) {
			assertTrue(ioe.getMessage(), ioe.getMessage().contains("cvc-complex-type.2.4.a:"));
		}

		// validate data
		assertEquals(1, resource.getErrors().size());
		assertTrue(resource.getContents().get(0) instanceof DocumentRoot);
	}

	private void enableSchemaValidationAndNewMethods(Map<String, Object> options) {
		// Retrieve application-defined XMLReader features (see http://xerces.apache.org/xerces2-j/features.html for
		// available features and their details)
		Map<String, Boolean> parserFeatures = new HashMap<String, Boolean>();

		// Retrieve application-defined XMLReader properties (see http://xerces.apache.org/xerces2-j/properties.html
		// for available properties and their details)
		Map<String, Object> parserProperties = new HashMap<String, Object>();

		// Perform namespace processing (prefixes will be stripped off element and attribute names and replaced with the
		// corresponding namespace URIs) but do not report attributes used for namespace declarations, and do not report
		// original prefixed names
		parserFeatures.put(Constants.SAX_FEATURE_PREFIX + Constants.NAMESPACES_FEATURE, true);
		parserFeatures.put(Constants.SAX_FEATURE_PREFIX + Constants.NAMESPACE_PREFIXES_FEATURE, false);

		parserFeatures.put(Constants.SAX_FEATURE_PREFIX + Constants.VALIDATION_FEATURE, true);
		parserFeatures.put(Constants.XERCES_FEATURE_PREFIX + Constants.SCHEMA_VALIDATION_FEATURE, true);
		parserProperties.put(Constants.JAXP_PROPERTY_PREFIX + Constants.SCHEMA_LANGUAGE, XMLConstants.W3C_XML_SCHEMA_NS_URI);
		parserProperties.put(Constants.XERCES_PROPERTY_PREFIX + Constants.SCHEMA_LOCATION, MyreqifPackage.eNS_URI + " ../../../model/myreqif.xsd");

		options.put(XMLResource.OPTION_PARSER_FEATURES, parserFeatures);
		options.put(XMLResource.OPTION_PARSER_PROPERTIES, parserProperties);
		options.put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.FALSE);
	}
}
