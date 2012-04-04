/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.reqif10.tests.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import junit.framework.Assert;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.XhtmlContent;
import org.eclipse.rmf.reqif10.tests.util.AbstractTestCase;
import org.eclipse.rmf.reqif10.tests.util.TC3000ModelBuilder;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDivType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type;
import org.eclipse.rmf.serialization.ReqIFResourceFactoryImpl;
import org.eclipse.rmf.serialization.ReqIFResourceSetImpl;
import org.junit.BeforeClass;
import org.junit.Test;

public class TC3000FormatedContentTests extends AbstractTestCase {
	static ReqIF originalReqIF = null;
	static ReqIF loadedReqIF = null;
	
	
	@BeforeClass
	public static void setupOnce() throws Exception {
		// TODO: check if we actually need the following code
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"ReqIF", new ReqIFResourceFactoryImpl());
		ResourceSet rifResourceSet = new ReqIFResourceSetImpl();

		rifResourceSet.getResourceFactoryRegistry()
				.getProtocolToFactoryMap()
				.put(ReqIF10Package.eNS_URI, ReqIF10Package.eINSTANCE);
		// ___
		originalReqIF = new TC3000ModelBuilder().getReqIF();
		saveReqIFFile(originalReqIF, WORKING_DIRECTORY + IPath.SEPARATOR + "TC3000.reqif");
		loadedReqIF = loadReqIFFile(WORKING_DIRECTORY + IPath.SEPARATOR + "TC3000.reqif");

	}
	
	private static final String WORKING_DIRECTORY = "work";

	
	@Test
	public void testSchemaCompliance() throws Exception {
		validateAgainstSchema(WORKING_DIRECTORY + IPath.SEPARATOR + "TC3000.reqif");
	}
	
	
	
	
	@Test
	public void testResave() throws IOException {
		try {
			saveReqIFFile(loadedReqIF, WORKING_DIRECTORY + IPath.SEPARATOR + "TC3000_2.reqif");
		} catch (IOException ioe) {
			Assert.assertFalse("We shall be able to save without exception. However the following exception occurred: " + ioe.toString(), true);
		}
	}
	
		
	@Test
	public void testSpecObject() {
		
		// get the specObject Type
		ReqIFContent ReqIFContent = loadedReqIF.getCoreContent();
	
		SpecObject specObject = ReqIFContent.getSpecObjects().get(0);
		assertNotNull(specObject);
		
		AttributeValue attributeValue = specObject.getValues().get(0);
		assertTrue(attributeValue instanceof AttributeValueXHTML);
		
		AttributeValueXHTML attributeValueXHTML = (AttributeValueXHTML)attributeValue;
		XhtmlContent xhtmlContent = attributeValueXHTML.getTheValue();
		assertNotNull(xhtmlContent);
		
		XhtmlDivType div = xhtmlContent.getDiv();
		assertNotNull(div);
		
		assertEquals(1, div.getH1().size());
		XhtmlH1Type h1 = div.getH1().get(0);
		assertNotNull(h1);
		
	}
}
