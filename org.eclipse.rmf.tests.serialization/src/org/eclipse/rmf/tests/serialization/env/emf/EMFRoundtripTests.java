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

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.xerces.impl.Constants;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DocumentRoot;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.util.MyreqifResourceFactoryImpl;
import org.eclipse.rmf.tests.serialization.internal.Activator;
import org.eclipse.rmf.tests.serialization.util.AbstractTestCase;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("nls")
public class EMFRoundtripTests extends AbstractTestCase {
	public static final String DATA_BASEDIR = "org.eclipse.rmf.tests.serialization.env/data/";
	public static final String WORKING_BASEDIR = "org.eclipse.rmf.tests.serialization.env.emf/";

	private static HashMap<String, Object> backupRegistry = new HashMap<String, Object>();

	@BeforeClass
	public static void setupOnce() {
		backupRegistry = new HashMap<String, Object>();
		backupRegistry.putAll(EPackage.Registry.INSTANCE);
	}

	@Override
	@Before
	public void setUp() throws Exception {
		super.setUp();
		EPackage.Registry.INSTANCE.clear();
	}

	@AfterClass
	public static void tearDownOnce() {
		EPackage.Registry.INSTANCE.clear();
		EPackage.Registry.INSTANCE.putAll(backupRegistry);
	}

	@Test
	public void testRoundtrip() throws IOException {
		String inputFileName = DATA_BASEDIR + "bare_toolExtensions_AnyTypeAndEcoreType.xml";
		String workingFileName = WORKING_BASEDIR + "bare_toolExtensions_AnyTypeAndEcoreType.xml";

		// prepare resource set
		EPackage.Registry.INSTANCE.put(XMLTypePackage.eNS_URI, XMLTypePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(XMLNamespacePackage.eNS_URI, XMLNamespacePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(MyreqifPackage.eNS_URI, MyreqifPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);

		try {
			// load data
			HashMap<String, Object> options = new HashMap<String, Object>();
			enableNewMethods(options);

			EObject root = loadInputFile(inputFileName, new MyreqifResourceFactoryImpl(), options);
			assertTrue(root instanceof DocumentRoot);
			saveWorkingFile(workingFileName, root, new MyreqifResourceFactoryImpl(), options);
			assertTrue(true);
			String savedContents = loadWorkingFileAsString(workingFileName);
			assertTrue(savedContents.contains("<REQ-IF"));
		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}

	}

	protected void enableNewMethods(Map<String, Object> options) {
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

		options.put(XMLResource.OPTION_PARSER_FEATURES, parserFeatures);
		options.put(XMLResource.OPTION_PARSER_PROPERTIES, parserProperties);
		options.put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.FALSE);

	}

	@Override
	protected Plugin getTestPlugin() {
		return new Activator.Implementation();
	}

}
