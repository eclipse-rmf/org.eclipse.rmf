package org.eclipse.rmf.reqif10.model.test;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.rmf.reqif10.ReqIf;
import org.eclipse.rmf.reqif10.model.test.modelbuilder.TC9000ModelBuilder;
import org.eclipse.rmf.reqif10.resource.ReqIf1ResourceImpl;
import org.junit.Test;

public class TC9000SimpleContentPerformanceTest extends ReqIfResourceTestBase {
	
	private static final String WORKING_DIRECTORY = "work";
	
	@Test
	public void testSpecObject() throws Exception {
		
		for (int i=1; i<40000 ; i=i*2) {
			String fileName = "TC9000_SimpleContent_PerformanceTests_SpecObjects_" + i + ".reqif";
			ReqIf reqif = new TC9000ModelBuilder(TC9000ModelBuilder.getLastChangeDate(), "ID_" + fileName, fileName, i).getReqIf();
			saveReqifFile(reqif, fileName);
			doTest(WORKING_DIRECTORY + IPath.SEPARATOR + fileName);
		}

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
	
	
	public static void saveReqifFile(ReqIf reqif, String fileName) throws IOException {
		URI emfURI = createEMFURI(fileName);
		Resource resource = new ReqIf1ResourceImpl(emfURI); 	
		resource.getContents().add(reqif);
		resource.save(null);
	}
	
	private static URI createEMFURI(String fileName) {
		return URI.createURI(WORKING_DIRECTORY + IPath.SEPARATOR + fileName, true);
	}

}
