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
package org.eclipse.rmf.tests.serialization.load;

import java.util.HashMap;
import java.util.Map;

import org.apache.xerces.impl.Constants;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.xmi.XMLOptions;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLOptionsImpl;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.rmf.serialization.XMLPersistenceMappingResourceFactoryImpl;
import org.eclipse.rmf.tests.serialization.model.nodes.Node;
import org.eclipse.rmf.tests.serialization.model.nodes.NodesPackage;
import org.eclipse.rmf.tests.serialization.util.AbstractTestCase;
import org.junit.Before;
import org.junit.Test;

// Junit 3.8 test 
@SuppressWarnings("nls")
public class FoereignNamespaceLoadTests_DEACTIVATED extends AbstractTestCase {

	static final String INPUT_PATH = "org.eclipse.rmf.tests.serialization.load/";

	@Override
	@Before
	public void setUp() throws Exception {
		super.setUp();
		EPackage.Registry.INSTANCE.put(NodesPackage.eNS_URI, NodesPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
	}

	@Test
	public void testEReference_Contained0001_Many_RegisteredPackage() {
		String inputFileName = INPUT_PATH + "EReference_WithTypeEObject_Contained0001Many_KnownNamespace.xml";
		try {
			EObject modelRoot = loadInputFile(inputFileName, new XMLPersistenceMappingResourceFactoryImpl(), null);
			validateEPackageModelMany(modelRoot, NodesPackage.eINSTANCE.getNode_EReference_WithTypeEObject_Contained0001Many());
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testEReference_Contained0100_Many_RegisteredPackage_XMLResource() {
		String inputFileName = INPUT_PATH + "EReference_WithTypeEObject_Contained0100Many_KnownNamespace.xml";
		try {
			Map<String, Object> options = new HashMap<String, Object>();
			options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
			EObject modelRoot = loadInputFile(inputFileName, new XMIResourceFactoryImpl(), options);
			validateEPackageModelMany(modelRoot, NodesPackage.eINSTANCE.getNode_EReference_WithTypeEObject_Contained0001Many());
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testEReference_Contained0100_Many_UnknownPackage_XMLResource() {
		String inputFileName = INPUT_PATH + "EReference_WithTypeEObject_Contained0100Many_UnknownNamespace.xml";
		try {
			Map<String, Object> options = new HashMap<String, Object>();
			options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
			options.put(XMLResource.OPTION_RECORD_ANY_TYPE_NAMESPACE_DECLARATIONS, Boolean.TRUE);
			Map<String, Boolean> parserFeatures = new HashMap<String, Boolean>();
			// Perform namespace processing (prefixes will be stripped off element and attribute names and replaced with
			// the
			// corresponding namespace URIs) but do not report attributes used for namespace declarations, and do not
			// report
			// original prefixed names
			parserFeatures.put(Constants.SAX_FEATURE_PREFIX + Constants.NAMESPACES_FEATURE, true);
			parserFeatures.put(Constants.SAX_FEATURE_PREFIX + Constants.NAMESPACE_PREFIXES_FEATURE, false);
			options.put(XMLResource.OPTION_PARSER_FEATURES, parserFeatures);
			XMLOptions xmlOptions = new XMLOptionsImpl();
			xmlOptions.setProcessAnyXML(true);
			options.put(XMLResource.OPTION_XML_OPTIONS, xmlOptions);
			options.put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.FALSE);

			EObject modelRoot = loadInputFile(inputFileName, new XMIResourceFactoryImpl(), options);
			validateUnknownModelMany(modelRoot, NodesPackage.eINSTANCE.getNode_EReference_WithTypeEObject_Contained0001Many());
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testEReference_Contained0001_Many_UnknownPackage() {
		String inputFileName = INPUT_PATH + "EReference_WithTypeEObject_Contained0001Many_UnknownNamespace.xml";
		try {
			EObject modelRoot = loadInputFile(inputFileName, new XMLPersistenceMappingResourceFactoryImpl(), null);
			validateUnknownModelMany(modelRoot, NodesPackage.eINSTANCE.getNode_EReference_WithTypeEObject_Contained0001Many());
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}
	}

	@SuppressWarnings("unchecked")
	protected void validateEPackageModelMany(EObject modelRoot, EStructuralFeature topFeature) {
		assert topFeature.isMany();
		// check root node
		assertNotNull(modelRoot);
		assertSame(NodesPackage.eINSTANCE.getNode(), modelRoot.eClass());
		Node node = (Node) modelRoot;

		// check intermediate nodes
		EList<Object> packages = (EList<Object>) node.eGet(topFeature);
		assertSame(2, packages.size());

		Object packageObject1 = packages.get(0);
		assertTrue(packageObject1 instanceof EPackage);
		EPackage package1 = (EPackage) packageObject1;
		assertSame(2, package1.getEClassifiers().size());

		Object packageObject2 = packages.get(0);
		assertTrue(packageObject2 instanceof EPackage);
		EPackage package2 = (EPackage) packageObject2;
		assertSame(2, package2.getEClassifiers().size());
	}

	@SuppressWarnings("unchecked")
	protected void validateUnknownModelMany(EObject modelRoot, EStructuralFeature topFeature) {
		assert topFeature.isMany();
		// check root node
		assertNotNull(modelRoot);
		assertTrue(modelRoot instanceof AnyType);
		AnyType rootObject = (AnyType) modelRoot;
		assertEquals("NODE", rootObject.eClass().getName());

	}

}
