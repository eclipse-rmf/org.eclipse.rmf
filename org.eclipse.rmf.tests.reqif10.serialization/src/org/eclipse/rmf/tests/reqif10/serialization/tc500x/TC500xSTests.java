/*******************************************************************************
 * Copyright (c) 2011, 2013 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Said Salem - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.tests.reqif10.serialization.tc500x;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.tests.reqif10.serialization.util.AbstractTestCase;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("nls")
public class TC500xSTests extends AbstractTestCase {
	static final String TEST_CASE_ID = "TC500x_S";
	static final String REFERENCE_DATA_FILENAME = getWorkingFileName(TEST_CASE_ID + ".reqif");
	static ReqIF originalReqIF = null;
	static ReqIF loadedReqIF = null;

	@BeforeClass
	public static void setupOnce() throws Exception {
		AbstractTestCase.setupOnce();
		originalReqIF = new TC500xS().getReqIF();
		saveReqIFFile(originalReqIF, REFERENCE_DATA_FILENAME);
		loadedReqIF = loadReqIFFile(REFERENCE_DATA_FILENAME);
	}

	@Test
	public void testSchemaCompliance() throws Exception {
		validateAgainstSchema(REFERENCE_DATA_FILENAME);
	}

	@Test
	public void testReqIFNotNull() {
		assertNotNull("The loaded ReqIF model shall not be Null", loadedReqIF);
	}

	@Test
	public void testNoProxies() throws IOException {
		EcoreUtil.resolveAll(loadedReqIF);
		Map<EObject, Collection<Setting>> map = EcoreUtil.ProxyCrossReferencer.find(loadedReqIF);
		assertEquals(0, map.size());
	}

	@Test
	public void testNoXMLAnyType() {
		Iterator<EObject> iterator = EcoreUtil.getAllContents(loadedReqIF, true);
		while (iterator.hasNext()) {
			EObject eObject = iterator.next();
			assertFalse(eObject instanceof AnyType);
		}
	}
}
