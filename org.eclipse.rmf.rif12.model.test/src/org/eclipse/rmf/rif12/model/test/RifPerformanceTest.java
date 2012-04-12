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
package org.eclipse.rmf.rif12.model.test;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;

import org.junit.Test;

public class RifPerformanceTest extends Rif12ResourceTestBase{

	@Test
	public void testSpecObject() {

		ArrayList<String> filenames = new ArrayList<String>();
		
		filenames.add("testdata/performance/largefile_01mb.rif");
		filenames.add("testdata/performance/largefile_02mb.rif");
		filenames.add("testdata/performance/largefile_04mb.rif");
		filenames.add("testdata/performance/largefile_08mb.rif");
		filenames.add("testdata/performance/largefile_16mb.rif");
		filenames.add("testdata/performance/largefile_32mb.rif");
		
		filenames.add("testdata/performance/largefile_01mb.rif-xmi");
		filenames.add("testdata/performance/largefile_02mb.rif-xmi");
		filenames.add("testdata/performance/largefile_04mb.rif-xmi");
		filenames.add("testdata/performance/largefile_08mb.rif-xmi");
		filenames.add("testdata/performance/largefile_16mb.rif-xmi");
		filenames.add("testdata/performance/largefile_32mb.rif-xmi");
		
		for (String filename : filenames)
			doTest(filename);

	}
	
	private void doTest(String filename) {

		System.out.println("Loading '" + filename + "'...");
		long totaltime = 0;

		for (int i = 0; i < 3; i++) {
			long start = System.currentTimeMillis();
			loadRif(filename);
			long end = System.currentTimeMillis();
			totaltime += end - start;
		}

		double size = (new File(filename).length()) / 1024;
		double avgtime = totaltime / 3;
		double timeperkb = new BigDecimal(avgtime / size).setScale(3,
				BigDecimal.ROUND_UP).doubleValue();
		
		System.out.println("Avg. time taken for '" + filename + "' with size "
				+ size + "KB: " + avgtime/1000 + "s");
		System.out.println("Time per KB: " + timeperkb + "ms");
	}

}
