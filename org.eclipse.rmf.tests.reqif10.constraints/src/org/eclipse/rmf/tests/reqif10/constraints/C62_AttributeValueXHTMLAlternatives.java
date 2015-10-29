/**
 * Copyright (c) 2014 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 *
 */
package org.eclipse.rmf.tests.reqif10.constraints;

import static org.junit.Assert.assertEquals;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.rmf.reqif10.ReqIF;
import org.junit.Test;

@SuppressWarnings("nls")
public class C62_AttributeValueXHTMLAlternatives extends AbstractFileBasedTest {

	@Override
	protected String getConstraintID() {
		return "org.eclipse.rmf.reqif10.constraints.C6.2";
	}

	@Test
	public void testInvalidMissingAlternative() throws Exception {
		ReqIF reqif = loadReqif(URI.createPlatformPluginURI(PLUGIN_ID + "/testdata/xhtml_with_NonImageObject_missingAlternative.reqif", false)); //$NON-NLS-1$
		IStatus status = validator.validate(reqif);
		System.out.println(status.getMessage());
		assertEquals(IStatus.ERROR, status.getSeverity());
		assertEquals(406, status.getCode());
	}

	@Test
	public void testInvalidMissingText() throws Exception {
		ReqIF reqif = loadReqif(URI.createPlatformPluginURI(PLUGIN_ID + "/testdata/xhtml_with_NonImageObject_missingText.reqif", false)); //$NON-NLS-1$
		IStatus status = validator.validate(reqif);
		assertEquals(IStatus.ERROR, status.getSeverity());
		assertEquals(406, status.getCode());
	}

	@Test
	public void testInvalidMissingTextMissingObject() throws Exception {
		ReqIF reqif = loadReqif(URI.createPlatformPluginURI(PLUGIN_ID + "/testdata/xhtml_with_NonImageObject_invalid.reqif", false)); //$NON-NLS-1$
		IStatus status = validator.validate(reqif);
		assertEquals(IStatus.ERROR, status.getSeverity());
		assertEquals(406, status.getCode());
	}

	@Test
	public void testValid() throws Exception {
		ReqIF reqif = loadReqif(URI.createPlatformPluginURI(PLUGIN_ID + "/testdata/xhtml_with_NonImageObject_valid.reqif", false)); //$NON-NLS-1$
		IStatus status = validator.validate(reqif);
		System.out.println(status.getMessage());
		assertEquals(IStatus.OK, status.getSeverity());
	}

}
