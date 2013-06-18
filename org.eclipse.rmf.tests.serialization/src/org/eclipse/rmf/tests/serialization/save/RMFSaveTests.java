package org.eclipse.rmf.tests.serialization.save;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.rmf.serialization.RMFResourceFactoryImpl;
import org.eclipse.rmf.tests.serialization.internal.Activator;
import org.eclipse.rmf.tests.serialization.model.nodes.Node;
import org.eclipse.rmf.tests.serialization.model.nodes.NodesFactory;
import org.eclipse.sphinx.testutils.AbstractTestCase;
import org.junit.Test;

// caution: Sphinx Abstract Test Case is JUnit 3.8
@SuppressWarnings("nls")
public class RMFSaveTests extends AbstractTestCase {
	final String BASEDIR = "org.eclipse.rmf.tests.serialization.save";

	@Test
	public void testFeatureSerialization1001() {
		String fileName = "FeatureSerialization1001.xml";
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

		intermediateNode1.getFeatureWithSerialization1001_Multi().add(leafNode11);
		intermediateNode1.getFeatureWithSerialization1001_Multi().add(leafNode12);
		intermediateNode2.getFeatureWithSerialization1001_Multi().add(leafNode21);
		intermediateNode2.getFeatureWithSerialization1001_Multi().add(leafNode22);

		rootNode.getFeatureWithSerialization1001_Multi().add(intermediateNode1);
		rootNode.getFeatureWithSerialization1001_Multi().add(intermediateNode2);

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

	@Override
	protected Plugin getTestPlugin() {
		return new Activator.Implementation();
	}

}
