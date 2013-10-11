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
package org.eclipse.rmf.tests.serialization.robustness;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.FeatureNotFoundException;
import org.eclipse.rmf.serialization.XMLPersistenceMappingResourceFactoryImpl;
import org.eclipse.rmf.tests.serialization.model.nodes.Node;
import org.eclipse.rmf.tests.serialization.model.nodes.NodesPackage;
import org.eclipse.rmf.tests.serialization.util.AbstractTestCase;
import org.eclipse.rmf.tests.serialization.util.LoadSaveUtil;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("nls")
public class LoadPatternAttribute0100RobustnessTests extends AbstractTestCase {

	static final String INPUT_PATH = "org.eclipse.rmf.tests.serialization.robustness/";

	@Override
	@Before
	public void setUp() throws Exception {
		super.setUp();
		EPackage.Registry.INSTANCE.put(NodesPackage.eNS_URI, NodesPackage.eINSTANCE);
	}

	@Test
	public void testEAttribute_Attribute0100_Single_NestedElements() {
		String inputFileName = INPUT_PATH + "EAttribute_Attribute0100Single_NestedElements.xml";
		try {
			Resource resource = LoadSaveUtil.loadResource("resources/input/" + inputFileName, new XMLPersistenceMappingResourceFactoryImpl(), null);
			assertSame(1, resource.getErrors().size());
			assertTrue(resource.getErrors().get(0) instanceof FeatureNotFoundException);
			validateEAttributeSingle(resource, NodesPackage.eINSTANCE.getNode_EAttribute_Attribute0100Single(),
					NodesPackage.eINSTANCE.getNode_EAttribute_Attribute1100Single());
		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testEAttribute_Attribute0100_Many_NestedElements() {
		String inputFileName = INPUT_PATH + "EAttribute_Attribute0100Many_NestedElements.xml";
		try {
			Resource resource = LoadSaveUtil.loadResource("resources/input/" + inputFileName, new XMLPersistenceMappingResourceFactoryImpl(), null);
			assertSame(1, resource.getErrors().size());
			assertTrue(resource.getErrors().get(0) instanceof FeatureNotFoundException);
			validateEAttributeSingle(resource, NodesPackage.eINSTANCE.getNode_EAttribute_Attribute0100Many(),
					NodesPackage.eINSTANCE.getNode_EAttribute_Attribute1100Many());
		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}
	}

	protected void validateEAttributeSingle(Resource resource, EStructuralFeature badFeature, EStructuralFeature goodFeature) {
		assertNotNull(resource);
		assertSame(1, resource.getContents().size());
		EObject object = resource.getContents().get(0);
		assertSame(NodesPackage.eINSTANCE.getNode(), object.eClass());
		Node node = (Node) object;

		assertFalse(node.eIsSet(badFeature));
		assertTrue(node.eIsSet(goodFeature));
		if (goodFeature.isMany()) {
			assertEquals("value2", ((EList) node.eGet(goodFeature)).get(0));
		} else {
			assertEquals("value2", node.eGet(goodFeature));
		}
	}
}
