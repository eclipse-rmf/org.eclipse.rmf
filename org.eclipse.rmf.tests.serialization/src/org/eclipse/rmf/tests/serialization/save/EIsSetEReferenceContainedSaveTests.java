package org.eclipse.rmf.tests.serialization.save;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import javax.xml.xpath.XPathConstants;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.rmf.tests.serialization.model.nodes.Node;
import org.eclipse.rmf.tests.serialization.model.nodes.NodesFactory;
import org.eclipse.rmf.tests.serialization.model.nodes.NodesPackage;
import org.junit.Test;
import org.w3c.dom.NodeList;

@SuppressWarnings("nls")
public class EIsSetEReferenceContainedSaveTests extends AbstractSaveTestCase {

	@Test
	public void testEIsSet_EReference_Contained1001Many() {
		try {
			String fileName = BASEDIR + "EIsSet_EReference_Contained1001Many.xml";
			Node rootNode = createNodeModel_Containedxxxx(NodesPackage.eINSTANCE.getNode_EReference_Contained1001Many());
			org.w3c.dom.Node root = getXMLRootNode(fileName, rootNode);

			// check for empty element on toplevel
			assertSame(0, ((NodeList) xpath.evaluate("/nodes:NODE[not(node())]", root, XPathConstants.NODESET)).getLength());

			// check for empty element on feature level
			assertSame(1, ((NodeList) xpath.evaluate("/nodes:NODE/nodes:FEATURE-WITH-SERIALIZATION-1001-MULTIS[not(node())]", root,
					XPathConstants.NODESET)).getLength());

		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}
	}

	@Test
	public void testEIsSet_EReference_Contained0101Single() {
		try {
			String fileName = BASEDIR + "EIsSet_EReference_Contained0101Single.xml";
			Node rootNode = createNodeModel_Containedxxxx(NodesPackage.eINSTANCE.getNode_EReference_Contained0101Single());
			org.w3c.dom.Node root = getXMLRootNode(fileName, rootNode);

			// check for empty element on feature level
			assertSame(1,
					((NodeList) xpath.evaluate("/nodes:NODE/nodes:EREFERENCE-CONTAINED-0101-SINGLE[not(node())]", root, XPathConstants.NODESET))
							.getLength());

		} catch (Exception ex) {
			ex.printStackTrace();
			assertTrue(ex.getMessage(), false);
		}
	}

	@SuppressWarnings("unchecked")
	protected Node createNodeModel_Containedxxxx(EStructuralFeature eReference) {
		Node rootNode = NodesFactory.eINSTANCE.createNode();
		rootNode.setName("root");

		if (eReference.isMany()) {
			EList<EObject> nodes = (EList<EObject>) rootNode.eGet(eReference);
			nodes.clear();
		} else {
			rootNode.eSet(eReference, null);
		}

		return rootNode;
	}
}
