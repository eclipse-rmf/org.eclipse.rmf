package org.eclipse.rmf.tests.serialization.save;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import javax.xml.xpath.XPathConstants;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.rmf.tests.serialization.model.nodes.Node;
import org.eclipse.rmf.tests.serialization.model.nodes.NodesFactory;
import org.eclipse.rmf.tests.serialization.model.nodes.NodesPackage;
import org.junit.Test;
import org.w3c.dom.NodeList;

@SuppressWarnings("nls")
public class ForeignNameSpaceContainedSaveTests extends AbstractSaveTestCase {

	@Test
	public void testEReference_WithTypeEObject_Contained0100Many_KnownNamespace_XMLResource() {
		try {
			String fileName = BASEDIR + "eReference_WithTypeEObject_Contained0100Many_KnownNamespace_XMLResource.xml";
			Node rootNode = createNodeModelWithForeignSubmodel_ContainedxxxxMany(NodesPackage.eINSTANCE
					.getNode_EReference_WithTypeEObject_Contained0100Many());
			Map<String, Object> options = new HashMap<String, Object>();
			options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
			saveWorkingFile(fileName, rootNode, new XMLResourceFactoryImpl(), options);
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testEReference_WithTypeEObject_Contained0100Many_KnownNamespace() {
		try {
			String fileName = BASEDIR + "eReference_WithTypeEObject_Contained0100Many_KnownNamespace.xml";
			Node rootNode = createNodeModelWithForeignSubmodel_ContainedxxxxMany(NodesPackage.eINSTANCE
					.getNode_EReference_WithTypeEObject_Contained0100Many());
			org.w3c.dom.Node root = getXMLRootNode(fileName, rootNode);

			// check for empty element on toplevel
			assertSame(0, ((NodeList) xpath.evaluate("/nodes:NODE[not(node())]", root, XPathConstants.NODESET)).getLength());

			// check for empty element on feature level
			assertSame(2, ((NodeList) xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0100-MULTI", root,
					XPathConstants.NODESET)).getLength());

			assertSame(2, ((NodeList) xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0100-MULTI[1]/eClassifiers",
					root, XPathConstants.NODESET)).getLength());
			assertEquals("EClass11", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0100-MULTI[1]/eClassifiers[1]/@name", root, XPathConstants.STRING));
			assertEquals("EClass12", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0100-MULTI[1]/eClassifiers[2]/@name", root, XPathConstants.STRING));

			assertSame(2, ((NodeList) xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0100-MULTI[2]/eClassifiers",
					root, XPathConstants.NODESET)).getLength());
			assertEquals("EClass21", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0100-MULTI[2]/eClassifiers[1]/@name", root, XPathConstants.STRING));
			assertEquals("EClass22", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0100-MULTI[2]/eClassifiers[2]/@name", root, XPathConstants.STRING));

		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testEReference_WithTypeEObject_Contained0001Many_KnownNamespace() {
		try {
			String fileName = BASEDIR + "eReference_WithTypeEObject_Contained0001Many_KnownNamespace.xml";
			Node rootNode = createNodeModelWithForeignSubmodel_ContainedxxxxMany(NodesPackage.eINSTANCE
					.getNode_EReference_WithTypeEObject_Contained0001Many());
			org.w3c.dom.Node root = getXMLRootNode(fileName, rootNode);

			// check for empty element on toplevel
			assertSame(0, ((NodeList) xpath.evaluate("/nodes:NODE[not(node())]", root, XPathConstants.NODESET)).getLength());

			// check for empty element on feature level
			assertSame(2, ((NodeList) xpath.evaluate("/nodes:NODE/ecore:EPackage", root, XPathConstants.NODESET)).getLength());

			assertSame(2, ((NodeList) xpath.evaluate("/nodes:NODE/ecore:EPackage[1]/eClassifiers", root, XPathConstants.NODESET)).getLength());
			assertEquals("EClass11", xpath.evaluate("/nodes:NODE/ecore:EPackage/eClassifiers[1]/@name", root, XPathConstants.STRING));
			assertEquals("EClass12", xpath.evaluate("/nodes:NODE/ecore:EPackage[1]/eClassifiers[2]/@name", root, XPathConstants.STRING));

			assertSame(2, ((NodeList) xpath.evaluate("/nodes:NODE/ecore:EPackage[2]/eClassifiers", root, XPathConstants.NODESET)).getLength());
			assertEquals("EClass21", xpath.evaluate("/nodes:NODE/ecore:EPackage[2]/eClassifiers[1]/@name", root, XPathConstants.STRING));
			assertEquals("EClass22", xpath.evaluate("/nodes:NODE/ecore:EPackage[2]/eClassifiers[2]/@name", root, XPathConstants.STRING));

		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testEReference_WithTypeEObject_Contained0100Many_UnknownNamespace() {
		try {
			String fileName = BASEDIR + "eReference_WithTypeEObject_Contained0100Many_UnknownNamespace.xml";
			Node rootNode = createNodeModelWithUnknownSubmodel_ContainedxxxxMany(NodesPackage.eINSTANCE
					.getNode_EReference_WithTypeEObject_Contained0100Many());
			org.w3c.dom.Node root = getXMLRootNode(fileName, rootNode);
		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}
	}

	/*
	 * @Test public void testEReference_WithTypeEObject_Contained0001Many_UnknownNamespace() { try { String fileName =
	 * BASEDIR + "eReference_WithTypeEObject_Contained0001Many_UnknownNamespace.xml"; Node rootNode =
	 * createNodeModelWithUnknownSubmodel_ContainedxxxxMany(NodesPackage.eINSTANCE
	 * .getNode_EReference_WithTypeEObject_Contained0001Many()); org.w3c.dom.Node root = getXMLRootNode(fileName,
	 * rootNode); } catch (Exception ex) { ex.printStackTrace(); assertTrue(ex.getMessage(), false); } }
	 */

	@SuppressWarnings("unchecked")
	protected Node createNodeModelWithForeignSubmodel_ContainedxxxxMany(EStructuralFeature feature) {
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

		EReference eReference11 = EcoreFactory.eINSTANCE.createEReference();
		eReference11.setName("myEClass22");
		eReference11.setEType(eClass22);
		eClass11.getEStructuralFeatures().add(eReference11);

		ePackage1.getEClassifiers().add(eClass11);
		ePackage1.getEClassifiers().add(eClass12);
		ePackage2.getEClassifiers().add(eClass21);
		ePackage2.getEClassifiers().add(eClass22);

		((EList<Object>) rootNode.eGet(feature)).add(ePackage1);
		((EList<Object>) rootNode.eGet(feature)).add(ePackage2);

		return rootNode;
	}

	@SuppressWarnings("unchecked")
	protected Node createNodeModelWithUnknownSubmodel_ContainedxxxxMany(EStructuralFeature feature) {
		assert null != feature;
		assert feature.isMany();
		Node rootNode = NodesFactory.eINSTANCE.createNode();

		String NAMESPACE_URI = "myAnyNamespaceURI";
		String NAMESPACE_PREFIX = "myPrefix";
		BasicExtendedMetaData extendedMetaData = new BasicExtendedMetaData();
		EStructuralFeature rootNodeFeature = extendedMetaData.demandFeature(NAMESPACE_URI, "rootNode", true);
		EClass documentRootClass = rootNodeFeature.getEContainingClass();
		EObject documentRoot = EcoreUtil.create(documentRootClass);
		EMap xmlnsPrefixMap = (EMap) documentRoot.eGet(extendedMetaData.getXMLNSPrefixMapFeature(documentRootClass));
		xmlnsPrefixMap.put(NAMESPACE_PREFIX, NAMESPACE_URI);

		AnyType rootTreeNode = XMLTypeFactory.eINSTANCE.createAnyType();
		documentRoot.eSet(rootNodeFeature, rootTreeNode);

		EStructuralFeature labelAttribute = extendedMetaData.demandFeature(null, "label", false);
		rootTreeNode.eSet(labelAttribute, "root");

		EStructuralFeature subNodeFeature = extendedMetaData.demandFeature(null, "subNode", true);
		subNodeFeature.setUpperBound(1);
		AnyType subNode = XMLTypeFactory.eINSTANCE.createAnyType();
		rootTreeNode.eSet(subNodeFeature, subNode);

		((EList<Object>) rootNode.eGet(feature)).add(documentRoot);

		return rootNode;
	}
}
