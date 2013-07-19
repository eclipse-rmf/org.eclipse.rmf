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

import java.io.StringReader;
import java.util.Iterator;

import javax.xml.XMLConstants;
import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.rmf.serialization.XMLPersistenceMappingResourceFactoryImpl;
import org.eclipse.rmf.tests.serialization.internal.Activator;
import org.eclipse.rmf.tests.serialization.model.nodes.Node;
import org.eclipse.rmf.tests.serialization.model.nodes.NodesFactory;
import org.eclipse.rmf.tests.serialization.model.nodes.NodesPackage;
import org.eclipse.sphinx.testutils.AbstractTestCase;
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.InputSource;

// caution: Sphinx Abstract Test Case is JUnit 3.8
@SuppressWarnings("nls")
public class RMFSaveTests extends AbstractTestCase {
	final String BASEDIR = "org.eclipse.rmf.tests.serialization.save/";
	XPath xpath;

	public class MyNamespaceContext implements NamespaceContext {
		public String getNamespaceURI(String prefix) {
			if (prefix.equals("nodes")) {
				return "http://www.eclipse.org/rmf/serialization/model/nodes.ecore";
			} else if (prefix.equals("xsi")) {
				return "http://www.w3.org/2001/XMLSchema-instance";
			} else {
				return XMLConstants.NULL_NS_URI;
			}
		}

		public String getPrefix(String namespace) {
			if (namespace.equals("http://www.eclipse.org/rmf/serialization/model/nodes.ecore")) {
				return "nodes";
			} else if (namespace.equals("http://www.w3.org/2001/XMLSchema-instance")) {
				return "xsi";
			} else {
				return null;
			}
		}

		public Iterator<String> getPrefixes(String namespace) {
			return null;
		}
	}

	@Override
	@Before
	public void setUp() throws Exception {
		super.setUp();
		XPathFactory factory = XPathFactory.newInstance();
		xpath = factory.newXPath();
		xpath.setNamespaceContext(new MyNamespaceContext());
	}

	@Test
	public void testFeatureContainmentReferenceSerialization0000() {
		String fileName = BASEDIR + "FeatureContainmentReferenceSerialization0000.xml";

		Node rootNode = createNodeModel(NodesPackage.eINSTANCE.getNode_EReference_Contained0000Many(),
				NodesPackage.eINSTANCE.getNode_EReference_Contained0100Many());
		try {
			saveWorkingFile(fileName, rootNode, new XMLPersistenceMappingResourceFactoryImpl(), null);
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}

		try {
			String modelAsString = loadWorkingFileAsString(fileName);
			InputSource source = new InputSource(new StringReader(modelAsString));
			org.w3c.dom.NodeList rootNodes = (org.w3c.dom.NodeList) xpath.evaluate("/nodes:NODE", source, XPathConstants.NODESET);
			assertEquals(1, rootNodes.getLength());
			org.w3c.dom.Node root = rootNodes.item(0);

			assertEquals("leafNode11",
					xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode12",
					xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode21",
					xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[3]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode22",
					xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[4]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode31",
					xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[5]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode32",
					xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[6]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode41",
					xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[7]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode42",
					xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[8]/@name", root, XPathConstants.STRING));

		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testFeatureContainmentReferenceSerialization0001() {
		String fileName = BASEDIR + "FeatureContainmentReferenceSerialization0001.xml";

		Node rootNode = createNodeModel(NodesPackage.eINSTANCE.getNode_EReference_Contained0001Many(),
				NodesPackage.eINSTANCE.getNode_EReference_Contained0100Many());
		try {
			saveWorkingFile(fileName, rootNode, new XMLPersistenceMappingResourceFactoryImpl(), null);
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}

		try {
			String modelAsString = loadWorkingFileAsString(fileName);
			InputSource source = new InputSource(new StringReader(modelAsString));
			org.w3c.dom.NodeList rootNodes = (org.w3c.dom.NodeList) xpath.evaluate("/nodes:NODE", source, XPathConstants.NODESET);
			assertEquals(1, rootNodes.getLength());
			org.w3c.dom.Node root = rootNodes.item(0);
			assertEquals("intermediateNode1", xpath.evaluate("/nodes:NODE/nodes:NODE[1]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode11",
					xpath.evaluate("/nodes:NODE/nodes:NODE[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode12",
					xpath.evaluate("/nodes:NODE/nodes:NODE[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name", root, XPathConstants.STRING));

			assertEquals("intermediateNode2", xpath.evaluate("/nodes:NODE/nodes:NODE[2]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode21",
					xpath.evaluate("/nodes:NODE/nodes:NODE[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode22",
					xpath.evaluate("/nodes:NODE/nodes:NODE[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name", root, XPathConstants.STRING));

			assertEquals("intermediateSubNode3", xpath.evaluate("/nodes:NODE/nodes:SUB-NODE[1]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode31",
					xpath.evaluate("/nodes:NODE/nodes:SUB-NODE[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode32",
					xpath.evaluate("/nodes:NODE/nodes:SUB-NODE[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name", root, XPathConstants.STRING));

			assertEquals("intermediateSubNode4", xpath.evaluate("/nodes:NODE/nodes:SUB-NODE[2]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode41",
					xpath.evaluate("/nodes:NODE/nodes:SUB-NODE[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode42",
					xpath.evaluate("/nodes:NODE/nodes:SUB-NODE[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name", root, XPathConstants.STRING));

		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testFeatureContainmentReferenceSerialization0010() {
		String fileName = BASEDIR + "FeatureContainmentReferenceSerialization0010.xml";

		Node rootNode = createNodeModel(NodesPackage.eINSTANCE.getNode_EReference_Contained0010Many(),
				NodesPackage.eINSTANCE.getNode_EReference_Contained0100Many());
		try {
			saveWorkingFile(fileName, rootNode, new XMLPersistenceMappingResourceFactoryImpl(), null);
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}

		try {
			String modelAsString = loadWorkingFileAsString(fileName);
			InputSource source = new InputSource(new StringReader(modelAsString));
			org.w3c.dom.NodeList rootNodes = (org.w3c.dom.NodeList) xpath.evaluate("/nodes:NODE", source, XPathConstants.NODESET);
			assertEquals(1, rootNodes.getLength());
			org.w3c.dom.Node root = rootNodes.item(0);
			assertEquals("leafNode11",
					xpath.evaluate("/nodes:NODE/nodes:NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode12",
					xpath.evaluate("/nodes:NODE/nodes:NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode21",
					xpath.evaluate("/nodes:NODE/nodes:NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[3]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode22",
					xpath.evaluate("/nodes:NODE/nodes:NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[4]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode31", xpath.evaluate("/nodes:NODE/nodes:SUB-NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name", root,
					XPathConstants.STRING));
			assertEquals("leafNode32", xpath.evaluate("/nodes:NODE/nodes:SUB-NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name", root,
					XPathConstants.STRING));
			assertEquals("leafNode41", xpath.evaluate("/nodes:NODE/nodes:SUB-NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[3]/@name", root,
					XPathConstants.STRING));
			assertEquals("leafNode42", xpath.evaluate("/nodes:NODE/nodes:SUB-NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[4]/@name", root,
					XPathConstants.STRING));

		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testFeatureContainmentReferenceSerialization0011() {
		String fileName = BASEDIR + "FeatureContainmentReferenceSerialization0011.xml";

		Node rootNode = createNodeModel(NodesPackage.eINSTANCE.getNode_EReference_Contained0011Many(),
				NodesPackage.eINSTANCE.getNode_EReference_Contained0100Many());
		try {
			saveWorkingFile(fileName, rootNode, new XMLPersistenceMappingResourceFactoryImpl(), null);
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}

		try {
			String modelAsString = loadWorkingFileAsString(fileName);
			InputSource source = new InputSource(new StringReader(modelAsString));
			org.w3c.dom.NodeList rootNodes = (org.w3c.dom.NodeList) xpath.evaluate("/nodes:NODE", source, XPathConstants.NODESET);
			assertEquals(1, rootNodes.getLength());
			org.w3c.dom.Node root = rootNodes.item(0);
			assertEquals("intermediateNode1", xpath.evaluate("/nodes:NODE/nodes:NODES[1]/nodes:NODE[1]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode11", xpath.evaluate(
					"/nodes:NODE/nodes:NODES[1]/nodes:NODE[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode12", xpath.evaluate(
					"/nodes:NODE/nodes:NODES[1]/nodes:NODE[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name", root, XPathConstants.STRING));

			assertEquals("intermediateNode2", xpath.evaluate("/nodes:NODE/nodes:NODES[1]/nodes:NODE[2]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode21", xpath.evaluate(
					"/nodes:NODE/nodes:NODES[1]/nodes:NODE[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode22", xpath.evaluate(
					"/nodes:NODE/nodes:NODES[1]/nodes:NODE[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name", root, XPathConstants.STRING));

			assertEquals("intermediateSubNode3",
					xpath.evaluate("/nodes:NODE/nodes:SUB-NODES[1]/nodes:SUB-NODE[1]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode31", xpath.evaluate(
					"/nodes:NODE/nodes:SUB-NODES[1]/nodes:SUB-NODE[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name", root,
					XPathConstants.STRING));
			assertEquals("leafNode32", xpath.evaluate(
					"/nodes:NODE/nodes:SUB-NODES[1]/nodes:SUB-NODE[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name", root,
					XPathConstants.STRING));

			assertEquals("intermediateSubNode4",
					xpath.evaluate("/nodes:NODE/nodes:SUB-NODES[1]/nodes:SUB-NODE[2]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode41", xpath.evaluate(
					"/nodes:NODE/nodes:SUB-NODES[1]/nodes:SUB-NODE[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name", root,
					XPathConstants.STRING));
			assertEquals("leafNode42", xpath.evaluate(
					"/nodes:NODE/nodes:SUB-NODES[1]/nodes:SUB-NODE[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name", root,
					XPathConstants.STRING));

		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testFeatureContainmentReferenceSerialization0100() {
		String fileName = BASEDIR + "FeatureContainmentReferenceSerialization0100.xml";

		Node rootNode = createNodeModel(NodesPackage.eINSTANCE.getNode_EReference_Contained0100Many(),
				NodesPackage.eINSTANCE.getNode_EReference_Contained0100Many());
		try {
			saveWorkingFile(fileName, rootNode, new XMLPersistenceMappingResourceFactoryImpl(), null);
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}

		try {
			String modelAsString = loadWorkingFileAsString(fileName);
			InputSource source = new InputSource(new StringReader(modelAsString));
			org.w3c.dom.NodeList rootNodes = (org.w3c.dom.NodeList) xpath.evaluate("/nodes:NODE", source, XPathConstants.NODESET);
			assertEquals(1, rootNodes.getLength());
			org.w3c.dom.Node root = rootNodes.item(0);

			assertEquals("intermediateNode1",
					xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode11", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name", root,
					XPathConstants.STRING));
			assertEquals("leafNode12", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name", root,
					XPathConstants.STRING));

			assertEquals("intermediateNode2",
					xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode21", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name", root,
					XPathConstants.STRING));
			assertEquals("leafNode22", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name", root,
					XPathConstants.STRING));

			assertEquals("intermediateSubNode3",
					xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[3]/@name", root, XPathConstants.STRING));
			assertEquals("nodes:SUB-NODE",
					xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[3]/@xsi:type", root, XPathConstants.STRING));
			assertEquals("leafNode31", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[3]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name", root,
					XPathConstants.STRING));
			assertEquals("leafNode32", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[3]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name", root,
					XPathConstants.STRING));

			assertEquals("intermediateSubNode4",
					xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[4]/@name", root, XPathConstants.STRING));
			assertEquals("nodes:SUB-NODE",
					xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[4]/@xsi:type", root, XPathConstants.STRING));
			assertEquals("leafNode41", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[4]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name", root,
					XPathConstants.STRING));
			assertEquals("leafNode42", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[4]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name", root,
					XPathConstants.STRING));

		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testFeatureContainmentReferenceSerialization0101() {
		String fileName = BASEDIR + "FeatureContainmentReferenceSerialization0101.xml";

		Node rootNode = createNodeModel(NodesPackage.eINSTANCE.getNode_EReference_Contained0101Many(),
				NodesPackage.eINSTANCE.getNode_EReference_Contained0100Many());
		try {
			saveWorkingFile(fileName, rootNode, new XMLPersistenceMappingResourceFactoryImpl(), null);
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}

		try {
			String modelAsString = loadWorkingFileAsString(fileName);
			InputSource source = new InputSource(new StringReader(modelAsString));
			org.w3c.dom.NodeList rootNodes = (org.w3c.dom.NodeList) xpath.evaluate("/nodes:NODE", source, XPathConstants.NODESET);
			assertEquals(1, rootNodes.getLength());
			org.w3c.dom.Node root = rootNodes.item(0);
			assertEquals("intermediateNode1",
					xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0101-MULTI[1]/nodes:NODE/@name", root, XPathConstants.STRING));
			assertEquals("leafNode11", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0101-MULTI[1]/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
					root, XPathConstants.STRING));
			assertEquals("leafNode12", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0101-MULTI[1]/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
					root, XPathConstants.STRING));

			assertEquals("intermediateNode2",
					xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0101-MULTI[2]/nodes:NODE/@name", root, XPathConstants.STRING));
			assertEquals("leafNode21", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0101-MULTI[2]/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
					root, XPathConstants.STRING));
			assertEquals("leafNode22", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0101-MULTI[2]/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
					root, XPathConstants.STRING));

			assertEquals("intermediateSubNode3",
					xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0101-MULTI[3]/nodes:SUB-NODE/@name", root, XPathConstants.STRING));
			assertEquals("leafNode31", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0101-MULTI[3]/nodes:SUB-NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
					root, XPathConstants.STRING));
			assertEquals("leafNode32", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0101-MULTI[3]/nodes:SUB-NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
					root, XPathConstants.STRING));

			assertEquals("intermediateSubNode4",
					xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0101-MULTI[4]/nodes:SUB-NODE/@name", root, XPathConstants.STRING));
			assertEquals("leafNode41", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0101-MULTI[4]/nodes:SUB-NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
					root, XPathConstants.STRING));
			assertEquals("leafNode42", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0101-MULTI[4]/nodes:SUB-NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
					root, XPathConstants.STRING));

		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testFeatureContainmentReferenceSerialization0110() {
		String fileName = BASEDIR + "FeatureContainmentReferenceSerialization0110.xml";

		Node rootNode = createNodeModel(NodesPackage.eINSTANCE.getNode_EReference_Contained0110Many(),
				NodesPackage.eINSTANCE.getNode_EReference_Contained0100Many());
		try {
			saveWorkingFile(fileName, rootNode, new XMLPersistenceMappingResourceFactoryImpl(), null);
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}

		try {
			String modelAsString = loadWorkingFileAsString(fileName);
			InputSource source = new InputSource(new StringReader(modelAsString));
			org.w3c.dom.NodeList rootNodes = (org.w3c.dom.NodeList) xpath.evaluate("/nodes:NODE", source, XPathConstants.NODESET);
			assertEquals(1, rootNodes.getLength());
			org.w3c.dom.Node root = rootNodes.item(0);
			assertEquals("leafNode11", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0110-MULTI[1]/nodes:NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
					root, XPathConstants.STRING));
			assertEquals("leafNode12", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0110-MULTI[1]/nodes:NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
					root, XPathConstants.STRING));
			assertEquals("leafNode21", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0110-MULTI[1]/nodes:NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[3]/@name",
					root, XPathConstants.STRING));
			assertEquals("leafNode22", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0110-MULTI[1]/nodes:NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[4]/@name",
					root, XPathConstants.STRING));
			assertEquals(
					"leafNode31",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0110-MULTI[1]/nodes:SUB-NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode32",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0110-MULTI[1]/nodes:SUB-NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode41",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0110-MULTI[1]/nodes:SUB-NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[3]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode42",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0110-MULTI[1]/nodes:SUB-NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[4]/@name",
							root, XPathConstants.STRING));

		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testFeatureContainmentReferenceSerialization0111() {
		String fileName = BASEDIR + "FeatureContainmentReferenceSerialization0111.xml";

		Node rootNode = createNodeModel(NodesPackage.eINSTANCE.getNode_EReference_Contained0111Many(),
				NodesPackage.eINSTANCE.getNode_EReference_Contained0100Many());
		try {
			saveWorkingFile(fileName, rootNode, new XMLPersistenceMappingResourceFactoryImpl(), null);
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}

		try {
			String modelAsString = loadWorkingFileAsString(fileName);
			InputSource source = new InputSource(new StringReader(modelAsString));
			org.w3c.dom.NodeList rootNodes = (org.w3c.dom.NodeList) xpath.evaluate("/nodes:NODE", source, XPathConstants.NODESET);
			assertEquals(1, rootNodes.getLength());
			org.w3c.dom.Node root = rootNodes.item(0);
			assertEquals("intermediateNode1", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0111-MULTI[1]/nodes:NODES[1]/nodes:NODE[1]/@name", root, XPathConstants.STRING));

			assertEquals(
					"leafNode11",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0111-MULTI[1]/nodes:NODES[1]/nodes:NODE[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode12",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0111-MULTI[1]/nodes:NODES[1]/nodes:NODE[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));
			assertEquals("intermediateNode2", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0111-MULTI[1]/nodes:NODES[1]/nodes:NODE[2]/@name", root, XPathConstants.STRING));

			assertEquals(
					"leafNode21",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0111-MULTI[1]/nodes:NODES[1]/nodes:NODE[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode22",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0111-MULTI[1]/nodes:NODES[1]/nodes:NODE[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));

			assertEquals("intermediateSubNode3", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0111-MULTI[1]/nodes:SUB-NODES[1]/nodes:SUB-NODE[1]/@name", root,
					XPathConstants.STRING));

			assertEquals(
					"leafNode31",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0111-MULTI[1]/nodes:SUB-NODES[1]/nodes:SUB-NODE[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode32",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0111-MULTI[1]/nodes:SUB-NODES[1]/nodes:SUB-NODE[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));
			assertEquals("intermediateSubNode4", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0111-MULTI[1]/nodes:SUB-NODES[1]/nodes:SUB-NODE[2]/@name", root,
					XPathConstants.STRING));

			assertEquals(
					"leafNode41",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0111-MULTI[1]/nodes:SUB-NODES[1]/nodes:SUB-NODE[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode42",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0111-MULTI[1]/nodes:SUB-NODES[1]/nodes:SUB-NODE[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));

		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testFeatureContainmentReferenceSerialization1001() {
		String fileName = BASEDIR + "FeatureContainmentReferenceSerialization1001.xml";

		Node rootNode = createNodeModel(NodesPackage.eINSTANCE.getNode_EReference_Contained1001Many(),
				NodesPackage.eINSTANCE.getNode_EReference_Contained0100Many());
		try {
			saveWorkingFile(fileName, rootNode, new XMLPersistenceMappingResourceFactoryImpl(), null);
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}

		try {
			String modelAsString = loadWorkingFileAsString(fileName);
			InputSource source = new InputSource(new StringReader(modelAsString));
			org.w3c.dom.NodeList rootNodes = (org.w3c.dom.NodeList) xpath.evaluate("/nodes:NODE", source, XPathConstants.NODESET);
			assertEquals(1, rootNodes.getLength());
			org.w3c.dom.Node root = rootNodes.item(0);
			assertEquals("intermediateNode1",
					xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1001-MULTIS[1]/nodes:NODE[1]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode11", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1001-MULTIS[1]/nodes:NODE[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
					root, XPathConstants.STRING));
			assertEquals("leafNode12", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1001-MULTIS[1]/nodes:NODE[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
					root, XPathConstants.STRING));

			assertEquals("intermediateNode2",
					xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1001-MULTIS[1]/nodes:NODE[2]/@name", root, XPathConstants.STRING));
			assertEquals("leafNode21", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1001-MULTIS[1]/nodes:NODE[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
					root, XPathConstants.STRING));
			assertEquals("leafNode22", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1001-MULTIS[1]/nodes:NODE[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
					root, XPathConstants.STRING));

			assertEquals("intermediateSubNode3", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1001-MULTIS[1]/nodes:SUB-NODE[1]/@name", root, XPathConstants.STRING));
			assertEquals(
					"leafNode31",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1001-MULTIS[1]/nodes:SUB-NODE[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode32",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1001-MULTIS[1]/nodes:SUB-NODE[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));

			assertEquals("intermediateSubNode4", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1001-MULTIS[1]/nodes:SUB-NODE[2]/@name", root, XPathConstants.STRING));
			assertEquals(
					"leafNode41",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1001-MULTIS[1]/nodes:SUB-NODE[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode42",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1001-MULTIS[1]/nodes:SUB-NODE[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));

		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testFeatureContainmentReferenceSerialization1010() {
		String fileName = BASEDIR + "FeatureContainmentReferenceSerialization1010.xml";

		Node rootNode = createNodeModel(NodesPackage.eINSTANCE.getNode_EReference_Contained1010Many(),
				NodesPackage.eINSTANCE.getNode_EReference_Contained0100Many());
		try {
			saveWorkingFile(fileName, rootNode, new XMLPersistenceMappingResourceFactoryImpl(), null);
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}

		try {
			String modelAsString = loadWorkingFileAsString(fileName);
			InputSource source = new InputSource(new StringReader(modelAsString));
			org.w3c.dom.NodeList rootNodes = (org.w3c.dom.NodeList) xpath.evaluate("/nodes:NODE", source, XPathConstants.NODESET);
			assertEquals(1, rootNodes.getLength());
			org.w3c.dom.Node root = rootNodes.item(0);
			assertEquals(
					"leafNode11",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1010-MULTIS[1]/nodes:NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode12",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1010-MULTIS[1]/nodes:NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode21",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1010-MULTIS[1]/nodes:NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[3]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode22",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1010-MULTIS[1]/nodes:NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[4]/@name",
							root, XPathConstants.STRING));

			assertEquals(
					"leafNode31",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1010-MULTIS[1]/nodes:SUB-NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode32",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1010-MULTIS[1]/nodes:SUB-NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode41",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1010-MULTIS[1]/nodes:SUB-NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[3]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode42",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1010-MULTIS[1]/nodes:SUB-NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[4]/@name",
							root, XPathConstants.STRING));

		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testFeatureContainmentReferenceSerialization1011() {
		String fileName = BASEDIR + "FeatureContainmentReferenceSerialization1011.xml";

		Node rootNode = createNodeModel(NodesPackage.eINSTANCE.getNode_EReference_Contained1011Many(),
				NodesPackage.eINSTANCE.getNode_EReference_Contained0100Many());
		try {
			saveWorkingFile(fileName, rootNode, new XMLPersistenceMappingResourceFactoryImpl(), null);
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}

		try {
			String modelAsString = loadWorkingFileAsString(fileName);
			InputSource source = new InputSource(new StringReader(modelAsString));
			org.w3c.dom.NodeList rootNodes = (org.w3c.dom.NodeList) xpath.evaluate("/nodes:NODE", source, XPathConstants.NODESET);
			assertEquals(1, rootNodes.getLength());
			org.w3c.dom.Node root = rootNodes.item(0);
			assertEquals("intermediateNode1", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1011-MULTIS[1]/nodes:NODES[1]/nodes:NODE[1]/@name", root, XPathConstants.STRING));
			assertEquals(
					"leafNode11",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1011-MULTIS[1]/nodes:NODES[1]/nodes:NODE[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode12",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1011-MULTIS[1]/nodes:NODES[1]/nodes:NODE[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));

			assertEquals("intermediateNode2", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1011-MULTIS[1]/nodes:NODES[1]/nodes:NODE[2]/@name", root, XPathConstants.STRING));
			assertEquals(
					"leafNode21",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1011-MULTIS[1]/nodes:NODES[1]/nodes:NODE[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode22",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1011-MULTIS[1]/nodes:NODES[1]/nodes:NODE[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));

			assertEquals("intermediateSubNode3", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1011-MULTIS[1]/nodes:SUB-NODES[1]/nodes:SUB-NODE[1]/@name", root,
					XPathConstants.STRING));
			assertEquals(
					"leafNode31",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1011-MULTIS[1]/nodes:SUB-NODES[1]/nodes:SUB-NODE[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode32",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1011-MULTIS[1]/nodes:SUB-NODES[1]/nodes:SUB-NODE[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));

			assertEquals("intermediateSubNode4", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1011-MULTIS[1]/nodes:SUB-NODES[1]/nodes:SUB-NODE[2]/@name", root,
					XPathConstants.STRING));
			assertEquals(
					"leafNode41",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1011-MULTIS[1]/nodes:SUB-NODES[1]/nodes:SUB-NODE[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode42",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1011-MULTIS[1]/nodes:SUB-NODES[1]/nodes:SUB-NODE[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));

		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testFeatureContainmentReferenceSerialization1100() {
		String fileName = BASEDIR + "FeatureContainmentReferenceSerialization1100.xml";

		Node rootNode = createNodeModel(NodesPackage.eINSTANCE.getNode_EReference_Contained1100Many(),
				NodesPackage.eINSTANCE.getNode_EReference_Contained0100Many());
		try {
			saveWorkingFile(fileName, rootNode, new XMLPersistenceMappingResourceFactoryImpl(), null);
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}

		try {
			String modelAsString = loadWorkingFileAsString(fileName);
			InputSource source = new InputSource(new StringReader(modelAsString));
			org.w3c.dom.NodeList rootNodes = (org.w3c.dom.NodeList) xpath.evaluate("/nodes:NODE", source, XPathConstants.NODESET);
			assertEquals(1, rootNodes.getLength());
			org.w3c.dom.Node root = rootNodes.item(0);

			assertEquals("intermediateNode1", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTI[1]/@name", root,
					XPathConstants.STRING));
			assertEquals(
					"leafNode11",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTI[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode12",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTI[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));

			assertEquals("intermediateNode2", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTI[2]/@name", root,
					XPathConstants.STRING));
			assertEquals(
					"leafNode21",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTI[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode22",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTI[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));

			assertEquals("intermediateSubNode3", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTI[3]/@name", root,
					XPathConstants.STRING));
			assertEquals("nodes:SUB-NODE", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTI[3]/@xsi:type", root,
					XPathConstants.STRING));
			assertEquals(
					"leafNode31",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTI[3]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode32",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTI[3]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));

			assertEquals("intermediateSubNode4", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTI[4]/@name", root,
					XPathConstants.STRING));
			assertEquals("nodes:SUB-NODE", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTI[4]/@xsi:type", root,
					XPathConstants.STRING));

			assertEquals(
					"leafNode41",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTI[4]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode42",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1100-MULTI[4]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));

		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testFeatureContainmentReferenceSerialization1101() {
		String fileName = BASEDIR + "FeatureContainmentReferenceSerialization1101.xml";

		Node rootNode = createNodeModel(NodesPackage.eINSTANCE.getNode_EReference_Contained1101Many(),
				NodesPackage.eINSTANCE.getNode_EReference_Contained0100Many());
		try {
			saveWorkingFile(fileName, rootNode, new XMLPersistenceMappingResourceFactoryImpl(), null);
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}

		try {
			String modelAsString = loadWorkingFileAsString(fileName);
			InputSource source = new InputSource(new StringReader(modelAsString));
			org.w3c.dom.NodeList rootNodes = (org.w3c.dom.NodeList) xpath.evaluate("/nodes:NODE", source, XPathConstants.NODESET);
			assertEquals(1, rootNodes.getLength());
			org.w3c.dom.Node root = rootNodes.item(0);
			assertEquals("intermediateNode1", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1101-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1101-MULTI[1]/nodes:NODE/@name",
					root, XPathConstants.STRING));
			assertEquals(
					"leafNode11",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1101-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1101-MULTI[1]/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode12",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1101-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1101-MULTI[1]/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));

			assertEquals("intermediateNode2", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1101-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1101-MULTI[2]/nodes:NODE/@name",
					root, XPathConstants.STRING));
			assertEquals(
					"leafNode21",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1101-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1101-MULTI[2]/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode22",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1101-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1101-MULTI[2]/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));

			assertEquals(
					"intermediateSubNode3",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1101-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1101-MULTI[3]/nodes:SUB-NODE/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode31",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1101-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1101-MULTI[3]/nodes:SUB-NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode32",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1101-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1101-MULTI[3]/nodes:SUB-NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));

			assertEquals(
					"intermediateSubNode4",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1101-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1101-MULTI[4]/nodes:SUB-NODE/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode41",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1101-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1101-MULTI[4]/nodes:SUB-NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode42",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1101-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1101-MULTI[4]/nodes:SUB-NODE/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));

		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testFeatureContainmentReferenceSerialization1110() {
		String fileName = BASEDIR + "FeatureContainmentReferenceSerialization1110.xml";

		Node rootNode = createNodeModel(NodesPackage.eINSTANCE.getNode_EReference_Contained1110Many(),
				NodesPackage.eINSTANCE.getNode_EReference_Contained0100Many());
		try {
			saveWorkingFile(fileName, rootNode, new XMLPersistenceMappingResourceFactoryImpl(), null);
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}

		try {
			String modelAsString = loadWorkingFileAsString(fileName);
			InputSource source = new InputSource(new StringReader(modelAsString));
			org.w3c.dom.NodeList rootNodes = (org.w3c.dom.NodeList) xpath.evaluate("/nodes:NODE", source, XPathConstants.NODESET);
			assertEquals(1, rootNodes.getLength());
			org.w3c.dom.Node root = rootNodes.item(0);
			assertEquals(
					"leafNode11",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1110-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1110-MULTI[1]/nodes:NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode12",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1110-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1110-MULTI[1]/nodes:NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode21",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1110-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1110-MULTI[1]/nodes:NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[3]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode22",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1110-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1110-MULTI[1]/nodes:NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[4]/@name",
							root, XPathConstants.STRING));

			assertEquals(
					"leafNode31",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1110-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1110-MULTI[1]/nodes:SUB-NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode32",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1110-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1110-MULTI[1]/nodes:SUB-NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode41",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1110-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1110-MULTI[1]/nodes:SUB-NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[3]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode42",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1110-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1110-MULTI[1]/nodes:SUB-NODES[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[4]/@name",
							root, XPathConstants.STRING));

		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testFeatureContainmentReferenceSerialization1111() {
		String fileName = BASEDIR + "FeatureContainmentReferenceSerialization1111.xml";

		Node rootNode = createNodeModel(NodesPackage.eINSTANCE.getNode_EReference_Contained1111Many(),
				NodesPackage.eINSTANCE.getNode_EReference_Contained0100Many());
		try {
			saveWorkingFile(fileName, rootNode, new XMLPersistenceMappingResourceFactoryImpl(), null);
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}

		try {
			String modelAsString = loadWorkingFileAsString(fileName);
			InputSource source = new InputSource(new StringReader(modelAsString));
			org.w3c.dom.NodeList rootNodes = (org.w3c.dom.NodeList) xpath.evaluate("/nodes:NODE", source, XPathConstants.NODESET);
			assertEquals(1, rootNodes.getLength());
			org.w3c.dom.Node root = rootNodes.item(0);
			assertEquals(
					"intermediateNode1",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1111-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1111-MULTI[1]/nodes:NODES[1]/nodes:NODE[1]/@name",
							root, XPathConstants.STRING));

			assertEquals(
					"leafNode11",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1111-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1111-MULTI[1]/nodes:NODES[1]/nodes:NODE[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode12",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1111-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1111-MULTI[1]/nodes:NODES[1]/nodes:NODE[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"intermediateNode2",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1111-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1111-MULTI[1]/nodes:NODES[1]/nodes:NODE[2]/@name",
							root, XPathConstants.STRING));

			assertEquals(
					"leafNode21",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1111-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1111-MULTI[1]/nodes:NODES[1]/nodes:NODE[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode22",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1111-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1111-MULTI[1]/nodes:NODES[1]/nodes:NODE[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));

			assertEquals(
					"intermediateSubNode3",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1111-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1111-MULTI[1]/nodes:SUB-NODES[1]/nodes:SUB-NODE[1]/@name",
							root, XPathConstants.STRING));

			assertEquals(
					"leafNode31",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1111-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1111-MULTI[1]/nodes:SUB-NODES[1]/nodes:SUB-NODE[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode32",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1111-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1111-MULTI[1]/nodes:SUB-NODES[1]/nodes:SUB-NODE[1]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"intermediateSubNode4",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1111-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1111-MULTI[1]/nodes:SUB-NODES[1]/nodes:SUB-NODE[2]/@name",
							root, XPathConstants.STRING));

			assertEquals(
					"leafNode41",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1111-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1111-MULTI[1]/nodes:SUB-NODES[1]/nodes:SUB-NODE[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[1]/@name",
							root, XPathConstants.STRING));
			assertEquals(
					"leafNode42",
					xpath.evaluate(
							"/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1111-MULTIS[1]/nodes:FEATURE-WITH-SERIALIZATION-1111-MULTI[1]/nodes:SUB-NODES[1]/nodes:SUB-NODE[2]/nodes:FEATURE-WITH-SERIALIZATION-0100-MULTI[2]/@name",
							root, XPathConstants.STRING));

		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testFeatureContainmentReferenceWithTypeEObjectAndSerialization0100Many() {
		String fileName = BASEDIR + "FeatureContainmentReferenceWithTypeEObjectAndSerialization0100Many.xml";

		Node rootNode = createNodeModelWithForeignSubmodel(NodesPackage.eINSTANCE.getNode_EReference_WithTypeEObject_Contained0100Many());
		try {
			saveWorkingFile(fileName, rootNode, new XMLPersistenceMappingResourceFactoryImpl(), null);
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}

		try {
			String modelAsString = loadWorkingFileAsString(fileName);
			InputSource source = new InputSource(new StringReader(modelAsString));
			org.w3c.dom.NodeList rootNodes = (org.w3c.dom.NodeList) xpath.evaluate("/nodes:NODE", source, XPathConstants.NODESET);
			assertEquals(1, rootNodes.getLength());
			org.w3c.dom.Node root = rootNodes.item(0);

			assertEquals("EPackage1",
					xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0100-MULTI[1]/@name", root, XPathConstants.STRING));
			assertEquals("EClass11", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0100-MULTI[1]/eClassifiers[1]/@name", root, XPathConstants.STRING));
			assertEquals("EClass12", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0100-MULTI[1]/eClassifiers[2]/@name", root, XPathConstants.STRING));

			assertEquals("EPackage2",
					xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0100-MULTI[2]/@name", root, XPathConstants.STRING));
			assertEquals("EClass21", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0100-MULTI[2]/eClassifiers[1]/@name", root, XPathConstants.STRING));
			assertEquals("EClass22", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0100-MULTI[2]/eClassifiers[2]/@name", root, XPathConstants.STRING));

		} catch (Exception ex) {
			assertTrue(ex.getMessage(), false);
		}
	}

	@SuppressWarnings("unchecked")
	protected Node createNodeModel(EStructuralFeature topLevelfeature, EStructuralFeature subfeature) {
		assert null != subfeature;
		assert subfeature.isMany();
		Node rootNode = NodesFactory.eINSTANCE.createNode();

		Node intermediateNode1 = NodesFactory.eINSTANCE.createNode();
		intermediateNode1.setName("intermediateNode1");

		Node intermediateNode2 = NodesFactory.eINSTANCE.createNode();
		intermediateNode2.setName("intermediateNode2");

		Node intermediateSubNode3 = NodesFactory.eINSTANCE.createSubNode();
		intermediateSubNode3.setName("intermediateSubNode3");

		Node intermediateSubNode4 = NodesFactory.eINSTANCE.createSubNode();
		intermediateSubNode4.setName("intermediateSubNode4");

		Node leafNode11 = NodesFactory.eINSTANCE.createNode();
		leafNode11.setName("leafNode11");

		Node leafNode12 = NodesFactory.eINSTANCE.createNode();
		leafNode12.setName("leafNode12");

		Node leafNode21 = NodesFactory.eINSTANCE.createNode();
		leafNode21.setName("leafNode21");

		Node leafNode22 = NodesFactory.eINSTANCE.createNode();
		leafNode22.setName("leafNode22");

		Node leafNode31 = NodesFactory.eINSTANCE.createNode();
		leafNode31.setName("leafNode31");

		Node leafNode32 = NodesFactory.eINSTANCE.createNode();
		leafNode32.setName("leafNode32");

		Node leafNode41 = NodesFactory.eINSTANCE.createNode();
		leafNode41.setName("leafNode41");

		Node leafNode42 = NodesFactory.eINSTANCE.createNode();
		leafNode42.setName("leafNode42");

		((EList<Object>) intermediateNode1.eGet(subfeature)).add(leafNode11);
		((EList<Object>) intermediateNode1.eGet(subfeature)).add(leafNode12);
		((EList<Object>) intermediateNode2.eGet(subfeature)).add(leafNode21);
		((EList<Object>) intermediateNode2.eGet(subfeature)).add(leafNode22);
		((EList<Object>) intermediateSubNode3.eGet(subfeature)).add(leafNode31);
		((EList<Object>) intermediateSubNode3.eGet(subfeature)).add(leafNode32);
		((EList<Object>) intermediateSubNode4.eGet(subfeature)).add(leafNode41);
		((EList<Object>) intermediateSubNode4.eGet(subfeature)).add(leafNode42);

		((EList<Object>) rootNode.eGet(topLevelfeature)).add(intermediateNode1);
		((EList<Object>) rootNode.eGet(topLevelfeature)).add(intermediateNode2);
		((EList<Object>) rootNode.eGet(topLevelfeature)).add(intermediateSubNode3);
		((EList<Object>) rootNode.eGet(topLevelfeature)).add(intermediateSubNode4);

		return rootNode;
	}

	protected Node createNodeModel(EStructuralFeature feature) {
		return createNodeModel(feature, feature);
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

	protected void validateOutput(String xpathExpression, String output, String expectedResult, QName resultType) throws XPathExpressionException {
		Object result = xpath.evaluate(xpathExpression, new InputSource(new StringReader(output)), resultType);
		assertEquals(expectedResult, result);

	}

}
