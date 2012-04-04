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
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import junit.framework.Assert;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.tests.util.AbstractTestCase;
import org.eclipse.rmf.reqif10.tests.util.TC1000ModelBuilder;
import org.eclipse.rmf.serialization.ReqIFResourceFactoryImpl;
import org.eclipse.rmf.serialization.ReqIFResourceSetImpl;
import org.junit.BeforeClass;
import org.junit.Test;

public class TC1000SimpleContentTests extends AbstractTestCase {
	static ReqIF originalReqIF = null;
	static ReqIF loadedReqIF = null;
	
	
	
	@BeforeClass
	public static void setupOnce() throws Exception {

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"ReqIF", new ReqIFResourceFactoryImpl());
		ResourceSet rifResourceSet = new ReqIFResourceSetImpl();

		rifResourceSet.getResourceFactoryRegistry()
				.getProtocolToFactoryMap()
				.put(ReqIF10Package.eNS_URI, ReqIF10Package.eINSTANCE);
		originalReqIF = new TC1000ModelBuilder().getReqIF();
		saveReqIFFile(originalReqIF, WORKING_DIRECTORY + IPath.SEPARATOR + "TC1000.ReqIF");
		loadedReqIF = loadReqIFFile(WORKING_DIRECTORY + IPath.SEPARATOR + "TC1000.ReqIF");

	}
	
	private static final String WORKING_DIRECTORY = "work";

	@Test
	public void testSchemaCompliance() throws Exception {
		validateAgainstSchema(WORKING_DIRECTORY + IPath.SEPARATOR + "TC1000.reqif");
	}

	
	@Test
	public void testReqIFNotNull() {
		assertNotNull("The loaded ReqIF model shall not be Null", loadedReqIF);
	} 
	
	
	@Test
	public void testResave() throws IOException {
		try {
			saveReqIFFile(loadedReqIF, WORKING_DIRECTORY + IPath.SEPARATOR + "TC1000_2.ReqIF");
		} catch (IOException ioe) {
			Assert.assertFalse("We shall be able to save without exception. However the following exception occurred: " + ioe.toString(), true);
		}
	}
	
	@Test
	public void testReqIF() {
		assertTrue(loadedReqIF.isSetCoreContent());
		assertFalse(loadedReqIF.isSetLang());
		assertTrue(loadedReqIF.isSetTheHeader());
		assertFalse(loadedReqIF.isSetToolExtensions());		
	}
	
	@Test
	public void testReqIFHeader() {
		assertFalse(loadedReqIF.getTheHeader().isSetComment());
		assertTrue(loadedReqIF.getTheHeader().isSetCreationTime());
		assertTrue(loadedReqIF.getTheHeader().isSetIdentifier());
		assertFalse(loadedReqIF.getTheHeader().isSetRepositoryId());
		assertTrue(loadedReqIF.getTheHeader().isSetReqIFToolId());
		assertTrue(loadedReqIF.getTheHeader().isSetReqIFVersion());
		assertTrue(loadedReqIF.getTheHeader().isSetSourceToolId());
		assertTrue(loadedReqIF.getTheHeader().isSetTitle());

		
		assertEquals(originalReqIF.getTheHeader().getCreationTime().toGregorianCalendar(), loadedReqIF.getTheHeader().getCreationTime().toGregorianCalendar());
		assertEquals(originalReqIF.getTheHeader().getIdentifier(), loadedReqIF.getTheHeader().getIdentifier());
		assertEquals(originalReqIF.getTheHeader().getReqIFToolId(), loadedReqIF.getTheHeader().getReqIFToolId());
		assertEquals(originalReqIF.getTheHeader().getReqIFVersion(), loadedReqIF.getTheHeader().getReqIFVersion());
		assertEquals(originalReqIF.getTheHeader().getSourceToolId(), loadedReqIF.getTheHeader().getSourceToolId());
		assertEquals(originalReqIF.getTheHeader().getTitle(), loadedReqIF.getTheHeader().getTitle());
	}
	
	@Test
	public void testReqIFContent() {
		assertTrue(loadedReqIF.getCoreContent().isSetDatatypes());
		assertTrue(loadedReqIF.getCoreContent().isSetSpecifications());
		assertTrue(loadedReqIF.getCoreContent().isSetSpecObjects());
		assertFalse(loadedReqIF.getCoreContent().isSetSpecRelationGroups());
		assertFalse(loadedReqIF.getCoreContent().isSetSpecRelations());
		assertTrue(loadedReqIF.getCoreContent().isSetSpecTypes());
	}
	
	@Test
	public void testSpecObjectType() {
		
		// get the specObject Type
		ReqIFContent ReqIFContent = loadedReqIF.getCoreContent();
		assertTrue(ReqIFContent.isSetSpecTypes());
		assertEquals(2 , ReqIFContent.getSpecTypes().size());
		
		SpecObjectType specObjectType = null;
		for (SpecType specType : ReqIFContent.getSpecTypes()) {
			if (specType instanceof SpecObjectType ) {
				specObjectType = (SpecObjectType)specType;
				break;
			}
		}
		
		assertNotNull("SpecObjectType must be available", specObjectType);
		
		// check the specObjectType
		assertFalse(specObjectType.isSetDesc());
		assertTrue(specObjectType.isSetIdentifier());
		assertTrue(specObjectType.isSetLastChange());
		assertTrue(specObjectType.isSetLongName());
		assertTrue(specObjectType.isSetSpecAttributes());
		// TODO: test the values
	}
	
	@Test
	public void testSpecObject() {
		
		// get the specObject Type
		ReqIFContent ReqIFContent = loadedReqIF.getCoreContent();
		assertTrue(ReqIFContent.isSetSpecObjects());
		assertEquals(1 , ReqIFContent.getSpecObjects().size());
		
		SpecObject specObject = ReqIFContent.getSpecObjects().get(0);

		
		// check the specObject
		assertFalse(specObject.isSetDesc());
		assertTrue(specObject.isSetIdentifier());
		assertTrue(specObject.isSetLastChange());
		assertFalse(specObject.isSetLongName());
		assertTrue(specObject.isSetValues());
		assertTrue(specObject.isSetType());
		
		// check the reference to SpecObjectType
		SpecObjectType expectedSpecObjectType = null;
		for (SpecType specType : ReqIFContent.getSpecTypes()) {
			if (specType instanceof SpecObjectType ) {
				expectedSpecObjectType = (SpecObjectType)specType;
				break;
			}
		}
		
		SpecObjectType specObjectType = specObject.getType();
		assertNotNull(specObjectType);
		assertFalse(specObjectType.eIsProxy());
		assertEquals(expectedSpecObjectType, specObjectType);
		
	}

}
