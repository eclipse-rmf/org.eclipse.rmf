/*******************************************************************************
 * Copyright (c) 2011 itemis GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nirmal Sasidharan - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.pror.reqif10.testdata;

import java.net.URISyntaxException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.rmf.reqif10.ReqIf;

/**
 * 
 * This class only exists to provide easy access to the RIF files in this folder.
 * 
 * @author jastram
 *
 */
public class TestData {
	
	private TestData() {
		throw new RuntimeException("Not intended for instantiation");
	}
	
	/**
	 * Retrieves the URI for the given test file.  The test file must not have any path elements and reside in the package, e.g.<p>
	 * 
	 * <pre>
	 * URI resourceURI = TestData.getURI("simple.reqif");
	 * </pre>
	 * @param filename a path-less filename.
	 * 
	 * @return the RUI for the file.
	 * 
	 * @throws URISyntaxException
	 */
	public static URI getURI(String filename) throws URISyntaxException {
		return URI.createURI(TestData.class.getResource(filename).toURI().toString());
	}
	
	/**
	 * Builds a RIF model from a file that is stored in the testdata package.
	 * 
	 * @param filename
	 *            without path
	 * @return a {@link ReqIf} object
	 * @throws URISyntaxException
	 */
	public static ReqIf getTestReqif(String filename) throws URISyntaxException {
		URI resourceURI = TestData.getURI(filename);
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(resourceURI, true);
		ReqIf rif = (ReqIf) resource.getContents().get(0);
		return rif;
	}

}
