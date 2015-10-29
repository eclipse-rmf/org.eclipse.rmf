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
public class C61_AttributeValueXHTMLNoClassAttribute extends AbstractFileBasedTest {

	@Override
	protected String getConstraintID() {
		return "org.eclipse.rmf.reqif10.constraints.C6.1";
	}

	@Test
	public void testInvalid() throws Exception {
		ReqIF reqif = loadReqif(URI.createPlatformPluginURI(PLUGIN_ID + "/testdata/xhtml_with_class.reqif", false)); //$NON-NLS-1$
		IStatus status = validator.validate(reqif);
		assertEquals(IStatus.ERROR, status.getSeverity());
		assertEquals(406, status.getCode());
	}

	@Test
	public void testValid() throws Exception {
		ReqIF reqif = loadReqif(URI.createPlatformPluginURI(PLUGIN_ID + "/testdata/xhtml1.reqif", false)); //$NON-NLS-1$
		IStatus status = validator.validate(reqif);
		System.out.println(status.getMessage());
		assertEquals(IStatus.OK, status.getSeverity());
	}

}
