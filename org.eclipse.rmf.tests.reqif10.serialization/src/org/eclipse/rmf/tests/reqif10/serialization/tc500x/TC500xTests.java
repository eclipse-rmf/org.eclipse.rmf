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
public class TC500xTests extends AbstractTestCase {
	static final String FILENAME_TC500xS = getWorkingFileName("TC500x_S.reqif");
	static ReqIF originalTC500xS = null;
	static ReqIF loadedTC500xS = null;

	static final String FILENAME_TC500xT = getWorkingFileName("TC500x_T.reqif");
	static ReqIF originalTC500xT = null;
	static ReqIF loadedTC500xT = null;

	@BeforeClass
	public static void setupOnce() throws Exception {
		AbstractTestCase.setupOnce();
		originalTC500xS = new TC500xS().getReqIF();
		saveReqIFFile(originalTC500xS, FILENAME_TC500xS);
		loadedTC500xS = loadReqIFFile(FILENAME_TC500xS);

		originalTC500xT = new TC500xT().getReqIF();
		saveReqIFFile(originalTC500xT, FILENAME_TC500xT);
		loadedTC500xT = loadReqIFFile(FILENAME_TC500xT);
	}

	@Test
	public void testSchemaCompliance() throws Exception {
		validateAgainstSchema(FILENAME_TC500xS);
		validateAgainstSchema(FILENAME_TC500xT);
	}

	@Test
	public void testReqIFNotNull() {
		assertNotNull("The loaded ReqIF model shall not be Null", loadedTC500xS);
		assertNotNull("The loaded ReqIF model shall not be Null", loadedTC500xT);
	}

	@Test
	public void testNoProxiesSource() throws IOException {
		EcoreUtil.resolveAll(loadedTC500xS);
		Map<EObject, Collection<Setting>> map = EcoreUtil.ProxyCrossReferencer.find(loadedTC500xS);
		assertEquals(0, map.size());
	}

	@Test
	public void testCountProxiesTarget() throws IOException {
		EcoreUtil.resolveAll(loadedTC500xT);
		Map<EObject, Collection<Setting>> map = EcoreUtil.ProxyCrossReferencer.find(loadedTC500xT);
		assertEquals(2, map.size());
	}

	@Test
	public void testNoXMLAnyTypeSource() {
		Iterator<EObject> iterator = EcoreUtil.getAllContents(loadedTC500xS, true);
		while (iterator.hasNext()) {
			EObject eObject = iterator.next();
			assertFalse(eObject instanceof AnyType);
		}
	}

	@Test
	public void testNoXMLAnyTypeTarget() {
		Iterator<EObject> iterator = EcoreUtil.getAllContents(loadedTC500xT, true);
		while (iterator.hasNext()) {
			EObject eObject = iterator.next();
			assertFalse(eObject instanceof AnyType);
		}
	}
}
