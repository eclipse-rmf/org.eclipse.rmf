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
package org.eclipse.rmf.tests.serialization.save;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.rmf.serialization.RMFResourceFactoryImpl;
import org.eclipse.rmf.tests.serialization.internal.Activator;
import org.eclipse.rmf.tests.serialization.model.nodes.Node;
import org.eclipse.rmf.tests.serialization.model.nodes.NodesFactory;
import org.eclipse.rmf.tests.serialization.model.nodes.NodesPackage;
import org.eclipse.sphinx.testutils.AbstractTestCase;
import org.junit.Test;

// caution: Sphinx Abstract Test Case is JUnit 3.8
@SuppressWarnings("nls")
public class RMFSaveTests extends AbstractTestCase {
	final String BASEDIR = "org.eclipse.rmf.tests.serialization.save/";

	@Test
	public void testFeatureSerialization0100() {
		String fileName = BASEDIR + "FeatureSerialization0100.xml";

		Node rootNode = createNodeModel(NodesPackage.eINSTANCE.getNode_FeatureWithSerialization0100_Multi());
		try {
			saveWorkingFile(fileName, rootNode, new RMFResourceFactoryImpl(), null);
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}

		try {
			String modelAsString = loadWorkingFileAsString(fileName);
		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testFeatureSerialization0101() {
		String fileName = BASEDIR + "FeatureSerialization0101.xml";

		Node rootNode = createNodeModel(NodesPackage.eINSTANCE.getNode_FeatureWithSerialization0101_Multi());
		try {
			saveWorkingFile(fileName, rootNode, new RMFResourceFactoryImpl(), null);
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}

		try {
			String modelAsString = loadWorkingFileAsString(fileName);
		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testFeatureSerialization1001() {
		String fileName = BASEDIR + "FeatureSerialization1001.xml";

		Node rootNode = createNodeModel(NodesPackage.eINSTANCE.getNode_FeatureWithSerialization1001_Multi());
		try {
			saveWorkingFile(fileName, rootNode, new RMFResourceFactoryImpl(), null);
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}

		try {
			String modelAsString = loadWorkingFileAsString(fileName);
		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testFeatureWithTypeEObjectAndSerialization0100_Multi() {
		String fileName = BASEDIR + "FeatureWithTypeEObjectAndSerialization0100_Multi.xml";

		Node rootNode = createNodeModelWithForeignSubmodel(NodesPackage.eINSTANCE.getNode_FeatureWithTypeEObjectAndSerialization0100_Multi());
		try {
			saveWorkingFile(fileName, rootNode, new RMFResourceFactoryImpl(), null);
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}

		try {
			String modelAsString = loadWorkingFileAsString(fileName);
		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}
	}

	@SuppressWarnings("unchecked")
	protected Node createNodeModel(EStructuralFeature feature) {
		assert null != feature;
		assert feature.isMany();
		Node rootNode = NodesFactory.eINSTANCE.createNode();

		Node intermediateNode1 = NodesFactory.eINSTANCE.createNode();
		intermediateNode1.setName("intermediateNode1");

		Node intermediateNode2 = NodesFactory.eINSTANCE.createNode();
		intermediateNode2.setName("intermediateNode2");

		Node leafNode11 = NodesFactory.eINSTANCE.createNode();
		leafNode11.setName("leafNode11");

		Node leafNode12 = NodesFactory.eINSTANCE.createNode();
		leafNode12.setName("leafNode12");

		Node leafNode21 = NodesFactory.eINSTANCE.createNode();
		leafNode21.setName("leafNode21");

		Node leafNode22 = NodesFactory.eINSTANCE.createNode();
		leafNode22.setName("leafNode22");

		((EList<Object>) intermediateNode1.eGet(feature)).add(leafNode11);
		((EList<Object>) intermediateNode1.eGet(feature)).add(leafNode12);
		((EList<Object>) intermediateNode2.eGet(feature)).add(leafNode21);
		((EList<Object>) intermediateNode2.eGet(feature)).add(leafNode22);

		((EList<Object>) rootNode.eGet(feature)).add(intermediateNode1);
		((EList<Object>) rootNode.eGet(feature)).add(intermediateNode2);

		return rootNode;
	}

	@SuppressWarnings("unchecked")
	protected Node createNodeModelWithForeignSubmodel(EStructuralFeature feature) {
		assert null != feature;
		assert feature.isMany();
		Node rootNode = NodesFactory.eINSTANCE.createNode();

		EPackage ePackage1 = EcoreFactory.eINSTANCE.createEPackage();
		ePackage1.setName("EPackage1");

		EPackage ePackage2 = EcoreFactory.eINSTANCE.createEPackage();
		ePackage2.setName("EPackage2");

		EClass eClass11 = EcoreFactory.eINSTANCE.createEClass();
		eClass11.setName("EClass11");

		EClass eClass12 = EcoreFactory.eINSTANCE.createEClass();
		eClass12.setName("EClass12");

		EClass eClass21 = EcoreFactory.eINSTANCE.createEClass();
		eClass21.setName("EClass21");

		EClass eClass22 = EcoreFactory.eINSTANCE.createEClass();
		eClass22.setName("EClass22");

		ePackage1.getEClassifiers().add(eClass11);
		ePackage1.getEClassifiers().add(eClass12);
		ePackage2.getEClassifiers().add(eClass21);
		ePackage2.getEClassifiers().add(eClass22);

		((EList<Object>) rootNode.eGet(feature)).add(ePackage1);
		((EList<Object>) rootNode.eGet(feature)).add(ePackage2);

		return rootNode;
	}

	@Override
	protected Plugin getTestPlugin() {
		return new Activator.Implementation();
	}

}
