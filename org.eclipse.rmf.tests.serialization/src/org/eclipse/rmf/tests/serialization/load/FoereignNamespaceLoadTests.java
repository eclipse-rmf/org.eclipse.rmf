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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.rmf.serialization.XMLPersistenceMappingResourceFactoryImpl;
import org.eclipse.rmf.tests.serialization.model.nodes.Node;
import org.eclipse.rmf.tests.serialization.model.nodes.NodesPackage;
import org.eclipse.rmf.tests.serialization.util.AbstractTestCase;
import org.junit.Before;
import org.junit.Test;

// Junit 3.8 test 
@SuppressWarnings("nls")
public class FoereignNamespaceLoadTests extends AbstractTestCase {

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

	@Test
	public void testEReference_Contained0100_Many_RegisteredPackage() {
		String inputFileName = INPUT_PATH + "EReference_WithTypeEObject_Contained0100Many_KnownNamespace.xml";
		try {
			EObject modelRoot = loadInputFile(inputFileName, new XMLPersistenceMappingResourceFactoryImpl(), null);
			validateEPackageModelMany(modelRoot, NodesPackage.eINSTANCE.getNode_EReference_WithTypeEObject_Contained0100Many());
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testEReference_Contained0100_Many_UnknownPackage() {
		String inputFileName = INPUT_PATH + "EReference_WithTypeEObject_Contained0100Many_UnknownNamespace.xml";
		try {
			EObject modelRoot = loadInputFile(inputFileName, new XMLPersistenceMappingResourceFactoryImpl(), null);
			validateUnknownModelMany(modelRoot, NodesPackage.eINSTANCE.getNode_EReference_WithTypeEObject_Contained0100Many());
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
		assertSame(NodesPackage.eINSTANCE.getNode(), modelRoot.eClass());
		Node node = (Node) modelRoot;

		// check intermediate nodes
		EList<Object> packages = (EList<Object>) node.eGet(topFeature);
		assertSame(2, packages.size());

		Object packageObject1 = packages.get(0);
		assertTrue(packageObject1 instanceof AnyType);
		AnyType package1 = (AnyType) packageObject1;
		EClass ePackageClass1 = package1.eClass();
		assertEquals("EPackage", ePackageClass1.getName());
		assertSame(3, ePackageClass1.getFeatureCount());
		assertSame(1, package1.getAnyAttribute().size());
		assertSame(2, package1.getAny().size());
		assertEquals("EPackage1", package1.getAnyAttribute().getValue(0));
		assertEquals("eClassifiers", package1.getAny().get(0).getEStructuralFeature().getName());
		assertEquals("EClass11", ((AnyType) package1.getAny().get(0).getValue()).getAnyAttribute().getValue(0));
		assertEquals("EClass12", ((AnyType) package1.getAny().get(1).getValue()).getAnyAttribute().getValue(0));

		Object packageObject2 = packages.get(1);
		assertTrue(packageObject2 instanceof AnyType);
		AnyType package2 = (AnyType) packageObject2;
		EClass ePackageClass2 = package2.eClass();
		assertEquals("EPackage", ePackageClass2.getName());
		assertSame(3, ePackageClass2.getFeatureCount());
		assertSame(1, package2.getAnyAttribute().size());
		assertSame(2, package2.getAny().size());
		assertEquals("EPackage2", package2.getAnyAttribute().getValue(0));
		assertEquals("eClassifiers", package2.getAny().get(0).getEStructuralFeature().getName());
		assertEquals("EClass21", ((AnyType) package2.getAny().get(0).getValue()).getAnyAttribute().getValue(0));
		assertEquals("EClass22", ((AnyType) package2.getAny().get(1).getValue()).getAnyAttribute().getValue(0));

	}

}
