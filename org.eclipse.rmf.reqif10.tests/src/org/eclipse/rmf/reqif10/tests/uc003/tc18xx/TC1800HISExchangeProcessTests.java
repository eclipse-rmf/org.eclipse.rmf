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
package org.eclipse.rmf.reqif10.tests.uc003.tc18xx;

import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.tests.util.AbstractTestCase;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("nls")
public class TC1800HISExchangeProcessTests extends AbstractTestCase {
	static final String TC1800_FILENAME = getWorkingFileName(getReferenceDataFileName("TC1800", false));
	static final String TC1801_FILENAME = getWorkingFileName(getReferenceDataFileName("TC1801", false));
	static final String TC1802_FILENAME = getWorkingFileName(getReferenceDataFileName("TC1802", false));
	static final String TC1803_FILENAME = getWorkingFileName(getReferenceDataFileName("TC1803", false));

	static ReqIF tc1800ReqIF = null;
	static ReqIF tc1801ReqIF = null;

	static ReqIF loadedReqIF = null;

	@BeforeClass
	public static void setupOnce() throws Exception {
		AbstractTestCase.setupOnce();
		// ___
		tc1800ReqIF = new TC1800HISExchangeProcessModelBuilder().getReqIF();
		saveReqIFFile(tc1800ReqIF, TC1800_FILENAME);

		tc1801ReqIF = new TC1801HISExchangeProcessModelBuilder(loadReqIFFile(TC1800_FILENAME)).getReqIF();
		saveReqIFFile(tc1801ReqIF, TC1801_FILENAME);

	}

	@Test
	public void testSchemaCompliance() throws Exception {
		validateAgainstSchema(TC1800_FILENAME);
		validateAgainstSchema(TC1801_FILENAME);
	}

}
