/*******************************************************************************
 * Copyright (c) 2014 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Mark Broerkens (itemis AG) - initial API and implementation
 *******************************************************************************/
package org.eclipse.rmf.tests.serialization.save;

import static org.junit.Assert.assertEquals;

import java.io.StringReader;
import java.util.Iterator;
import java.util.Map;

import javax.xml.XMLConstants;
import javax.xml.namespace.NamespaceContext;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.eclipse.rmf.serialization.XMLPersistenceMappingResourceFactoryImpl;
import org.eclipse.rmf.tests.serialization.model.nodes.Node;
import org.eclipse.rmf.tests.serialization.util.AbstractTestCase;
import org.junit.Before;
import org.xml.sax.InputSource;

@SuppressWarnings("nls")
public abstract class AbstractSaveTestCase extends AbstractTestCase {
	final String BASEDIR = "org.eclipse.rmf.tests.serialization.save/";
	XPath xpath;

	public class MyNamespaceContext implements NamespaceContext {
		public String getNamespaceURI(String prefix) {
			if (prefix.equals("nodes")) {
				return "http://www.eclipse.org/rmf/serialization/model/nodes.ecore";
			} else if (prefix.equals("xsi")) {
				return "http://www.w3.org/2001/XMLSchema-instance";
			} else if (prefix.equals("ecore")) {
				return "http://www.eclipse.org/emf/2002/Ecore";
			} else if (prefix.equals("extnodes")) {
				return "http://www.eclipse.org/rmf/serialization/model/extnodes.ecore";
			} else {
				return XMLConstants.NULL_NS_URI;
			}
		}

		public String getPrefix(String namespace) {
			if (namespace.equals("http://www.eclipse.org/rmf/serialization/model/nodes.ecore")) {
				return "nodes";
			} else if (namespace.equals("http://www.w3.org/2001/XMLSchema-instance")) {
				return "xsi";
			} else if (namespace.equals("http://www.eclipse.org/emf/2002/Ecore")) {
				return "ecore";
			} else if (namespace.equals("http://www.eclipse.org/rmf/serialization/model/extnodes.ecore")) {
				return "extnodes";
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
		XPathFactory factory = XPathFactory.newInstance();
		xpath = factory.newXPath();
		xpath.setNamespaceContext(new MyNamespaceContext());
	}

	protected org.w3c.dom.Node getXMLRootNode(String fileName, Node rootNode) throws Exception, XPathExpressionException {
		return getXMLRootNode(fileName, rootNode, null);
	}

	protected org.w3c.dom.Node getXMLRootNode(String fileName, Node rootNode, Map<Object, Object> options) throws Exception, XPathExpressionException {
		saveWorkingFile(fileName, rootNode, new XMLPersistenceMappingResourceFactoryImpl(), options);
		String modelAsString = loadWorkingFileAsString(fileName);
		InputSource source = new InputSource(new StringReader(modelAsString));
		org.w3c.dom.NodeList rootNodes = (org.w3c.dom.NodeList) xpath.evaluate("/nodes:NODE", source, XPathConstants.NODESET);
		assertEquals(1, rootNodes.getLength());
		org.w3c.dom.Node root = rootNodes.item(0);
		return root;
	}

}
