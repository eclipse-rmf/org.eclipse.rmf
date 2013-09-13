package org.eclipse.rmf.tests.serialization.save;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import javax.xml.xpath.XPathConstants;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.rmf.serialization.XMLPersistenceMappingResource;
import org.eclipse.rmf.tests.serialization.model.extnodes.ExtNodesFactory;
import org.eclipse.rmf.tests.serialization.model.extnodes.ExtNodesPackage;
import org.eclipse.rmf.tests.serialization.model.extnodes.ExtendedNode;
import org.eclipse.rmf.tests.serialization.model.extnodes.Extension;
import org.eclipse.rmf.tests.serialization.model.nodes.Node;
import org.eclipse.rmf.tests.serialization.model.nodes.NodesFactory;
import org.eclipse.rmf.tests.serialization.model.nodes.NodesPackage;
import org.junit.Test;
import org.w3c.dom.NodeList;

@SuppressWarnings("nls")
public class CustomNamespacePrefixSaveTests extends AbstractSaveTestCase {

	@Test
	public void testEReference_WithTypeEObject_Contained0100Many_KnownNamespace_CustomPrefix() {
		try {
			String fileName = BASEDIR + "eReference_WithTypeEObject_Contained0100Many_KnownNamespace_CustomPrefix.xml";
			Node rootNode = createNodeModelWithForeignSubmodel_ContainedxxxxMany(NodesPackage.eINSTANCE
					.getNode_EReference_WithTypeEObject_Contained0100Many());
			org.w3c.dom.Node root = getXMLRootNode(fileName, rootNode, getSaveOptions());

			// check for empty element on toplevel
			assertSame(0, ((NodeList) xpath.evaluate("/nodes:NODE[not(node())]", root, XPathConstants.NODESET)).getLength());

			// check for empty element on feature level
			assertSame(2, ((NodeList) xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0100-MULTI", root,
					XPathConstants.NODESET)).getLength());

			assertSame(2,
					((NodeList) xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0100-MULTI[1]/extnodes:extensions",
							root, XPathConstants.NODESET)).getLength());
			assertEquals("ExtNode11", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0100-MULTI[1]/extnodes:extensions[1]/@name", root,
					XPathConstants.STRING));
			assertEquals("ExtNode12", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0100-MULTI[1]/extnodes:extensions[2]/@name", root,
					XPathConstants.STRING));

			assertSame(2,
					((NodeList) xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0100-MULTI[2]/extnodes:extensions",
							root, XPathConstants.NODESET)).getLength());
			assertEquals("ExtNode21", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0100-MULTI[2]/extnodes:extensions[1]/@name", root,
					XPathConstants.STRING));
			assertEquals("ExtNode22", xpath.evaluate(
					"/nodes:NODE/nodes:FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0100-MULTI[2]/extnodes:extensions[2]/@name", root,
					XPathConstants.STRING));

		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testEReference_WithTypeEObject_Contained0001Many_KnownNamespace_CustomPrefix() {
		try {
			String fileName = BASEDIR + "eReference_WithTypeEObject_Contained0001Many_KnownNamespace_CustomPrefix.xml";
			Node rootNode = createNodeModelWithForeignSubmodel_ContainedxxxxMany(NodesPackage.eINSTANCE
					.getNode_EReference_WithTypeEObject_Contained0001Many());
			org.w3c.dom.Node root = getXMLRootNode(fileName, rootNode, getSaveOptions());

			// check for empty element on toplevel
			assertSame(0, ((NodeList) xpath.evaluate("/nodes:NODE[not(node())]", root, XPathConstants.NODESET)).getLength());

			// check for empty element on feature level
			assertSame(2, ((NodeList) xpath.evaluate("/nodes:NODE/extnodes:Extension", root, XPathConstants.NODESET)).getLength());

			assertSame(2,
					((NodeList) xpath.evaluate("/nodes:NODE/extnodes:Extension[1]/extnodes:extensions", root, XPathConstants.NODESET)).getLength());
			assertEquals("ExtNode11", xpath.evaluate("/nodes:NODE/extnodes:Extension[1]/extnodes:extensions[1]/@name", root, XPathConstants.STRING));
			assertEquals("ExtNode12", xpath.evaluate("/nodes:NODE/extnodes:Extension[1]/extnodes:extensions[2]/@name", root, XPathConstants.STRING));

			assertSame(2,
					((NodeList) xpath.evaluate("/nodes:NODE/extnodes:Extension[2]/extnodes:extensions", root, XPathConstants.NODESET)).getLength());
			assertEquals("ExtNode21", xpath.evaluate("/nodes:NODE/extnodes:Extension[2]/extnodes:extensions[1]/@name", root, XPathConstants.STRING));
			assertEquals("ExtNode22", xpath.evaluate("/nodes:NODE/extnodes:Extension[2]/extnodes:extensions[2]/@name", root, XPathConstants.STRING));

		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}
	}

	@SuppressWarnings("unchecked")
	protected Node createNodeModelWithForeignSubmodel_ContainedxxxxMany(EStructuralFeature feature) {
		assert null != feature;
		assert feature.isMany();
		Node rootNode = NodesFactory.eINSTANCE.createNode();

		Extension extension1 = ExtNodesFactory.eINSTANCE.createExtension();
		ExtendedNode extNode11 = ExtNodesFactory.eINSTANCE.createExtendedNode();
		extNode11.setName("ExtNode11");
		ExtendedNode extNode12 = ExtNodesFactory.eINSTANCE.createExtendedNode();
		extNode12.setName("ExtNode12");
		extension1.getExtensions().add(extNode11);
		extension1.getExtensions().add(extNode12);

		Extension extension2 = ExtNodesFactory.eINSTANCE.createExtension();
		ExtendedNode extNode21 = ExtNodesFactory.eINSTANCE.createExtendedNode();
		extNode21.setName("ExtNode21");
		ExtendedNode extNode22 = ExtNodesFactory.eINSTANCE.createExtendedNode();
		extNode22.setName("ExtNode22");
		extension2.getExtensions().add(extNode21);
		extension2.getExtensions().add(extNode22);

		((EList<Object>) rootNode.eGet(feature)).add(extension1);
		((EList<Object>) rootNode.eGet(feature)).add(extension2);

		return rootNode;
	}

	private Map<Object, Object> getSaveOptions() {
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLPersistenceMappingResource.OPTION_NAMEPSACE_TO_PREFIX_MAP, getNamespaceToPrefixMap());
		return options;
	}

	private Map<String, String> getNamespaceToPrefixMap() {
		Map<String, String> namespaceToPrefixMap = new HashMap<String, String>();
		namespaceToPrefixMap.put(NodesPackage.eNS_URI, "");
		namespaceToPrefixMap.put(ExtNodesPackage.eNS_URI, "e");
		namespaceToPrefixMap.put("uri", "prefix");
		return namespaceToPrefixMap;
	}
}
