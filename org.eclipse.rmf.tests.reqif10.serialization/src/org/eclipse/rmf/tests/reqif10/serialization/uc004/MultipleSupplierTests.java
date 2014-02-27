/**
 * Copyright (c) 2014 Formal Mind GmbH.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 * 
 */
package org.eclipse.rmf.tests.reqif10.serialization.uc004;

import java.util.Map;
import java.util.TreeMap;

import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.tests.reqif10.serialization.util.AbstractTestCase;
import org.eclipse.rmf.tests.reqif10.serialization.util.CommonSystemAttributes;
import org.junit.BeforeClass;
import org.junit.Test;

public class MultipleSupplierTests extends AbstractTestCase implements CommonSystemAttributes {

	@BeforeClass
	public static void setupOnce() throws Exception {
		AbstractTestCase.setupOnce();

		Map<ReqifTool, ReqIF> reqifs = new TreeMap<ReqifTool, ReqIF>();
		for (ReqifTool tool : ReqifTool.values()) {
			String filename = getWorkingFileName("Supplier_Import_" //$NON-NLS-1$ 
					+ tool + ".reqif"); //$NON-NLS-1$
			System.out.println(filename);
			ReqIF reqif = new MultipleSupplierModelBuilder(tool).getReqIF();
			reqifs.put(tool, reqif);
			saveReqIFFile(reqif, filename);
		}
	}

	@Test
	public void validate() throws Exception {

	}
}
