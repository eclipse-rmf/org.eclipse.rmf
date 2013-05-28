package org.eclipse.rmf.rif12.model.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FilenameFilter;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.rmf.rif12.ExchangeFile.RIF;
import org.junit.Test;

@SuppressWarnings("nls")
public class ReferenceDataTests extends Rif12ResourceTestBase {

	final String INPUT_DIR = "testdata/reference";
	final String WORK_DIR = "work/reference";

	class ReqIFFileNameFilter implements FilenameFilter {
		public boolean accept(File dir, String name) {
			return name.endsWith("rif");
		}
	}

	
	@Test
	public void testAllFilesInInputFolder() {
		File folder = new File(INPUT_DIR);
		if (folder.exists() && folder.isDirectory()) {
			for (String fileName : folder.list(new ReqIFFileNameFilter())) {
				
				try {	
					
					String inputFileName = INPUT_DIR + IPath.SEPARATOR + fileName;
					String workFileName = WORK_DIR + IPath.SEPARATOR + fileName;
							
					System.out.println("Reading file: " + fileName);
					Resource rifResource = loadRif(inputFileName);
					
					System.out.println("Checking model");
					assertNotNull(rifResource);
					assertEquals(1,rifResource.getContents().size());
					EObject rootEObject = rifResource.getContents().get(0);
					assertTrue(rootEObject instanceof RIF);
					
					System.out.println("Saving model to file " + workFileName);
					saveRif(rootEObject, workFileName);
					
					System.out.println("Comparing input and output files");
					compareModels(inputFileName, workFileName);
				} catch (Exception e) {
					e.printStackTrace();
					assertFalse(true);
				}
			}
		}
	}

}
