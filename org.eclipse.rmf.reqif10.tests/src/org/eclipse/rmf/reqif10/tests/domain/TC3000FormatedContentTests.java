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

import java.io.IOException;

import junit.framework.Assert;

import org.eclipse.core.runtime.IPath;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.tests.util.AbstractTestCase;
import org.eclipse.rmf.reqif10.tests.util.TC3000ModelBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("nls")
public class TC3000FormatedContentTests extends AbstractTestCase {
	static ReqIF originalReqIF = null;
	static ReqIF loadedReqIF = null;

	@BeforeClass
	public static void setupOnce() throws Exception {
		AbstractTestCase.setupOnce();
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

}
