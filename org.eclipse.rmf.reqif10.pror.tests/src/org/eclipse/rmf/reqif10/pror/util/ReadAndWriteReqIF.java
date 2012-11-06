/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.util;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.pror.testframework.AbstractItemProviderTest;
import org.junit.Test;

/**
 * Some basic testing of reading and writing ReqIF
 * @author jastram
 *
 */
public class ReadAndWriteReqIF extends AbstractItemProviderTest {

	/**
	 * Reads a valid ReqIF, extends it with a SpecHierarchy, writes it and reads it again.
	 * This test it meant to duplicate the bug where references are written via XMI persistence.
	 * 
	 * @throws URISyntaxException
	 * @throws IOException
	 */
	@Test
	public void testReadWriteRead() throws URISyntaxException, IOException {

		// Read...
		ReqIF reqif = getTestReqif("simple.reqif");

		// ... add specHierarchy...
		SpecHierarchy specHierarchy = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy.setObject(reqif.getCoreContent().getSpecObjects().get(0));
		reqif.getCoreContent().getSpecifications().get(0).getChildren().add(specHierarchy);

		// ... write... 
		URI uri = URI.createFileURI(File.createTempFile("testReadWriteRead-", ".reqif")
				.getAbsolutePath());
		System.out.println("Test file: " + uri);
		Resource resource = editingDomain.getResourceSet().getResources().get(0);
		resource.setURI(uri);
		resource.save(new HashMap<Object,Object>());
		
		// Reset the AdapterFactory - otherwise, cached content is used.
		setupAbstractItemProviderTest();

		// ... and read again.
		resource = editingDomain.getResourceSet().getResource(
				uri, true);
		reqif = (ReqIF) resource.getContents().get(0);
		assertEquals(2, reqif.getCoreContent().getSpecifications().get(0).getChildren().size());
	}
	
	/**
	 * This Test confirms https://bugs.eclipse.org/bugs/show_bug.cgi?id=376579
	 * @throws Exception
	 */
	@Test
	public void testAddElementReferencedTo() throws Exception {
		ReqIF reqif = getTestReqif("simple.reqif");
		
		// New SpecObject
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.setDesc("Some content");
		reqif.getCoreContent().getSpecObjects().add(specObject);
		
		// New SpecHierarchy
		SpecHierarchy specHierarchy = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy.setObject(specObject);
		reqif.getCoreContent().getSpecifications().get(0).getChildren().add(specHierarchy);
		
		// ... write... 
		URI uri = URI.createFileURI(File.createTempFile("testAddElementReferencedTo-", ".reqif")
				.getAbsolutePath());
		System.out.println("Test file: " + uri);
		Resource resource = editingDomain.getResourceSet().getResources().get(0);
		resource.setURI(uri);
		resource.save(new HashMap<Object,Object>());
		
		// Reset the AdapterFactory - otherwise, cached content is used.
		setupAbstractItemProviderTest();
		
		// ... and read again.
		resource = editingDomain.getResourceSet().getResource(
				uri, true);
		reqif = (ReqIF) resource.getContents().get(0);
		SpecHierarchy sh = reqif.getCoreContent().getSpecifications().get(0).getChildren().get(1);
		SpecObject so = reqif.getCoreContent().getSpecObjects().get(1);
		assertEquals(so, sh.getObject());
	}
}
