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
package org.eclipse.rmf.tests.serialization.reqif10.uc001.tc3000;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import junit.framework.Assert;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIFToolExtension;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.tests.serialization.reqif10.model.toolextension.Extension;
import org.eclipse.rmf.tests.serialization.reqif10.model.toolextension.SpecObjectExtension;
import org.eclipse.rmf.tests.serialization.reqif10.util.AbstractTestCase;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("nls")
public class TC3000ToolExtensionsTests extends AbstractTestCase {
	static final String TEST_CASE_ID = "TC3000";
	static final String REFERENCE_DATA_FILENAME = getWorkingFileName(getReferenceDataFileName(TEST_CASE_ID, false));
	static final String EXPORT_DATA_FILENAME = getWorkingFileName(getFirstExportFileName(TEST_CASE_ID, false));
	static ReqIF originalReqIF = null;
	static ReqIF loadedReqIF = null;

	@BeforeClass
	public static void setupOnce() throws Exception {
		AbstractTestCase.setupOnce();
		originalReqIF = new TC3000ToolExtensionsModelBuilder().getReqIF();
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
	public void testResave() throws IOException {
		try {
			saveReqIFFile(EcoreUtil.copy(loadedReqIF), EXPORT_DATA_FILENAME);
		} catch (IOException ioe) {
			Assert.assertFalse("We shall be able to save without exception. However the following exception occurred: " + ioe.toString(), true);
		}
	}

	@Test
	public void testNoXMLAnyType() {
		Iterator<EObject> iterator = EcoreUtil.getAllContents(loadedReqIF, true);
		while (iterator.hasNext()) {
			EObject eObject = iterator.next();
			assertFalse(eObject instanceof AnyType);
		}
	}

	@Test
	public void testExtension() {
		assertSame(1, loadedReqIF.getToolExtensions().size());
		ReqIFToolExtension reqIFToolExtension = loadedReqIF.getToolExtensions().get(0);
		
		assertSame(1, reqIFToolExtension.getExtensions().size());
		assertTrue(reqIFToolExtension.getExtensions().get(0) instanceof Extension);
		Extension extension = (Extension)reqIFToolExtension.getExtensions().get(0);
		
		assertSame(2, extension.getSpecObjectExtensions().size());
		SpecObjectExtension specObjectExtension1 = extension.getSpecObjectExtensions().get(0);
		SpecObjectExtension specObjectExtension2 = extension.getSpecObjectExtensions().get(1);
		
		SpecObject specObject = loadedReqIF.getCoreContent().getSpecObjects().get(0);
		assertEquals("This is an extended description of a SpecObject", specObjectExtension1.getExtendedDesc());
		assertSame(specObject, specObjectExtension1.getExtendedSpecObject());
		
		assertEquals("This is another extended description of a SpecObject", specObjectExtension2.getExtendedDesc());
		assertSame(specObject, specObjectExtension2.getExtendedSpecObject());
	}

}
