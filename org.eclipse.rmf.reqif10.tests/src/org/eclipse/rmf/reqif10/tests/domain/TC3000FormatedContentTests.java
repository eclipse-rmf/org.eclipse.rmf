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
import org.eclipse.rmf.reqif10.tests.TC3000ModelBuilder;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDivType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type;
import org.eclipse.rmf.serialization.ReqIFResourceFactoryImpl;
import org.eclipse.rmf.serialization.ReqIFResourceSetImpl;
import org.junit.BeforeClass;
import org.junit.Test;

public class TC3000FormatedContentTests {
	static ReqIF originalReqIF = null;
	static ReqIF loadedReqIF = null;
	
	static Resource loadedReqIFResource = null;
	
	
	@BeforeClass
	public static void setupOnce() throws Exception {

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"ReqIF", new ReqIFResourceFactoryImpl());
		ResourceSet rifResourceSet = new ReqIFResourceSetImpl();

		rifResourceSet.getResourceFactoryRegistry()
				.getProtocolToFactoryMap()
				.put(ReqIF10Package.eNS_URI, ReqIF10Package.eINSTANCE);
		originalReqIF = new TC3000ModelBuilder().getReqIF();
		saveReqIFFile(originalReqIF, "TC3000.ReqIF");
		loadedReqIF = loadReqIFFile("TC3000.ReqIF");

	}
	
	private static final String WORKING_DIRECTORY = "work";

	
	@Test
	public void testSchemaCompliance() throws Exception {
		validateAgainstSchema("TC3000.ReqIF");
	}
	
	
	
	
	@Test
	public void testResave() throws IOException {
		try {
			saveReqIFFile(loadedReqIF, "TC3000_2.ReqIF");
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
	
	
	

	
	
/**
 * 
	public void testSchema() throws Throwable {
		validateSchema(WORKING_DIRECTORY + IPath.SEPARATOR + "TC1000.ReqIF");
	}
	*/
	public static void saveReqIFFile(ReqIF ReqIF, String fileName) throws IOException {
		URI emfURI = createEMFURI(fileName);
		ReqIFResourceFactoryImpl resourceFactory = new ReqIFResourceFactoryImpl();
		ReqIFResourceSetImpl resourceSet = new ReqIFResourceSetImpl(); 
		Resource resource = resourceFactory.createResource(emfURI); 
		resourceSet.getResources().add(resource);
		resource.getContents().add(ReqIF);
		resource.save(null);
		resourceSet = null;
	}
	
	public static ReqIF loadReqIFFile(String fileName) throws IOException {
		
		URI emfURI = createEMFURI(fileName);
		ReqIFResourceFactoryImpl resourceFactory = new ReqIFResourceFactoryImpl();
		XMLResource resource = (XMLResource) resourceFactory.createResource(emfURI);

		resource.load(null);
		loadedReqIFResource = resource;
		
		ReqIFResourceSetImpl resourceSet = new ReqIFResourceSetImpl(); 
		resourceSet.getResources().add(resource);

        EList<EObject> rootObjects = resource.getContents();
        System.out.println(rootObjects);
        if (rootObjects.isEmpty()) {
        	return null;
        } else {
        	return (ReqIF)rootObjects.get(0);
        }
	}
	
	private static URI createEMFURI(String fileName) {
		return URI.createURI(WORKING_DIRECTORY + IPath.SEPARATOR + fileName, true);
	}
	
	
	private void validateAgainstSchema(String filename) throws Exception {
		
		StreamSource[] schemaDocuments = new StreamSource[]{new StreamSource("schema/ReqIF.xsd")};
		//StreamSource[] schemaDocuments = new StreamSource[]{new StreamSource("http://www.omg.org/spec/ReqIF/20110401/ReqIF.xsd")};
		Source instanceDocument = new StreamSource(WORKING_DIRECTORY + IPath.SEPARATOR + filename);

		SchemaFactory sf = SchemaFactory.newInstance(
		    "http://www.w3.org/2001/XMLSchema");
		Schema s = sf.newSchema(schemaDocuments);
		Validator v = s.newValidator();
		v.validate(instanceDocument);
	}
	


}
