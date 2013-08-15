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
package org.eclipse.rmf.reqif10.tests.uc001;

import java.io.File;
import java.math.BigDecimal;

import org.eclipse.core.runtime.IPath;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.tests.util.AbstractTestCase;
import org.eclipse.rmf.reqif10.tests.util.TC9000ModelBuilder;
import org.junit.Test;

@SuppressWarnings("nls")
public class TC9000SimpleContentPerformanceTest extends AbstractTestCase {
	private static final String WORKING_DIRECTORY = "work";

	@Test
	public void testSpecObject() throws Exception {

		for (int i = 1; i < 10000; i = i * 2) {
			String fileName = "TC9000_SimpleContent_PerformanceTests_SpecObjects_" + i + ".reqif";
			ReqIF reqif = new TC9000ModelBuilder(null, "ID_" + fileName, fileName, i).getReqIF();

			saveReqIFFile(reqif, WORKING_DIRECTORY + IPath.SEPARATOR + fileName);
			doTest(fileName);
		}

	}

	private void doTest(String filename) throws Exception {

		System.out.println("Loading '" + filename + "'...");
		long totaltime = 0;

		for (int i = 0; i < 3; i++) {
			long start = System.currentTimeMillis();
			loadReqIFFile(WORKING_DIRECTORY + IPath.SEPARATOR + filename);
			long end = System.currentTimeMillis();
			totaltime += end - start;
		}

		double size = new File(WORKING_DIRECTORY + IPath.SEPARATOR + filename).length() / 1024;
		double avgtime = totaltime / 3;
		double timeperkb = new BigDecimal(avgtime / size).setScale(3, BigDecimal.ROUND_UP).doubleValue();

		System.out.println("Avg. time taken for '" + filename + "' with size " + size + "KB: " + avgtime / 1000 + "s");
		System.out.println("Time per KB: " + timeperkb + "ms");
	}

}
