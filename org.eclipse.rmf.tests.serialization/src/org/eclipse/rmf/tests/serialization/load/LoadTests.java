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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.rmf.serialization.RMFResourceFactoryImpl;
import org.eclipse.rmf.tests.serialization.model.nodes.Node;
import org.eclipse.rmf.tests.serialization.model.nodes.NodesPackage;
import org.eclipse.rmf.tests.serialization.util.AbstractTestCase;
import org.junit.Before;
import org.junit.Test;

// Junit 3.8 test 
@SuppressWarnings("nls")
public class LoadTests extends AbstractTestCase {
	static final String INPUT_PATH = "org.eclipse.rmf.tests.serialization.load/";

	@Override
	@Before
	public void setUp() throws Exception {
		super.setUp();
		EPackage.Registry.INSTANCE.put(NodesPackage.eNS_URI, NodesPackage.eINSTANCE);
	}

	@Test
	public void testFeatureSerialization1001_Single() {
		String inputFileName = INPUT_PATH + "FeatureSerialization1001_Single.xml";
		try {
			EObject modelRoot = loadInputFile(inputFileName, new RMFResourceFactoryImpl(), null);
			validateModelSingle(modelRoot, NodesPackage.eINSTANCE.getNode_FeatureWithSerialization1001_Single());
		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testFeatureSerialization0100_Multi() {
		String inputFileName = INPUT_PATH + "FeatureSerialization0100_Multi.xml";
		try {
			EObject modelRoot = loadInputFile(inputFileName, new RMFResourceFactoryImpl(), null);
			validateModelMulti(modelRoot, NodesPackage.eINSTANCE.getNode_FeatureWithSerialization0100_Multi());
		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testFeatureSerialization0101_Multi() {
		String inputFileName = INPUT_PATH + "FeatureSerialization0101_Multi.xml";
		try {
			EObject modelRoot = loadInputFile(inputFileName, new RMFResourceFactoryImpl(), null);
			validateModelMulti(modelRoot, NodesPackage.eINSTANCE.getNode_FeatureWithSerialization0101_Multi());
		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testFeatureSerialization1001_Multi() {
		String inputFileName = INPUT_PATH + "FeatureSerialization1001_Multi.xml";
		try {
			EObject modelRoot = loadInputFile(inputFileName, new RMFResourceFactoryImpl(), null);
			validateModelMulti(modelRoot, NodesPackage.eINSTANCE.getNode_FeatureWithSerialization1001_Multi());
		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}
	}

	@SuppressWarnings("unchecked")
	protected void validateModelMulti(EObject modelRoot, EStructuralFeature feature) {
		assert feature.isMany();
		// check root node
		assertNotNull(modelRoot);
		assertSame(NodesPackage.eINSTANCE.getNode(), modelRoot.eClass());
		Node node = (Node) modelRoot;

		// check intermediate nodes
		EList<Object> intermediateNodes = (EList<Object>) node.eGet(feature);
		assertSame(2, intermediateNodes.size());

		Object intermediateNodeObject1 = intermediateNodes.get(0);
		assertTrue(intermediateNodeObject1 instanceof Node);
		Node intermediateNode1 = (Node) intermediateNodeObject1;
		assertEquals("intermediateNode1", intermediateNode1.getName());

		Object intermediateNodeObject2 = intermediateNodes.get(1);
		assertTrue(intermediateNodeObject2 instanceof Node);
		Node intermediateNode2 = (Node) intermediateNodeObject2;
		assertEquals("intermediateNode2", intermediateNode2.getName());

		// check leaf nodes
		EList<Object> leafNodes1 = (EList<Object>) intermediateNode1.eGet(feature);
		assertSame(2, leafNodes1.size());

		Object leafNodeObject11 = leafNodes1.get(0);
		assertTrue(leafNodeObject11 instanceof Node);
		Node leafNode11 = (Node) leafNodeObject11;
		assertEquals("leafNode11", leafNode11.getName());
		EList<Object> leafNodes11 = (EList<Object>) leafNode11.eGet(feature);
		assertSame(0, leafNodes11.size());

		Object leafNodeObject12 = leafNodes1.get(1);
		assertTrue(leafNodeObject12 instanceof Node);
		Node leafNode12 = (Node) leafNodeObject12;
		assertEquals("leafNode12", leafNode12.getName());
		EList<Object> leafNodes12 = (EList<Object>) leafNode12.eGet(feature);
		assertSame(0, leafNodes12.size());

		// check leaf nodes
		EList<Object> leafNodes2 = (EList<Object>) intermediateNode2.eGet(feature);
		assertSame(2, leafNodes2.size());

		Object leafNodeObject21 = leafNodes2.get(0);
		assertTrue(leafNodeObject21 instanceof Node);
		Node leafNode21 = (Node) leafNodeObject21;
		assertEquals("leafNode21", leafNode21.getName());
		EList<Object> leafNodes21 = (EList<Object>) leafNode21.eGet(feature);
		assertSame(0, leafNodes21.size());

		Object leafNodeObject22 = leafNodes2.get(1);
		assertTrue(leafNodeObject22 instanceof Node);
		Node leafNode22 = (Node) leafNodeObject22;
		assertEquals("leafNode22", leafNode22.getName());
		EList<Object> leafNodes22 = (EList<Object>) leafNode22.eGet(feature);
		assertSame(0, leafNodes22.size());

	}

	protected void validateModelSingle(EObject modelRoot, EStructuralFeature feature) {
		// check root node
		assertNotNull(modelRoot);
		assertSame(NodesPackage.eINSTANCE.getNode(), modelRoot.eClass());
		Node node = (Node) modelRoot;

		// check intermediate node
		Object intermediateNodeObject1 = node.eGet(feature);
		assertNotNull(intermediateNodeObject1);
		assertTrue(intermediateNodeObject1 instanceof Node);
		Node intermediateNode1 = (Node) intermediateNodeObject1;
		assertEquals("intermediateNode1", intermediateNode1.getName());

		// check leaf node
		Object leafNodeObject11 = intermediateNode1.eGet(feature);
		assertNotNull(leafNodeObject11);
		assertTrue(leafNodeObject11 instanceof Node);
		Node leafNode11 = (Node) leafNodeObject11;
		assertEquals("leafNode11", leafNode11.getName());
	}

}
