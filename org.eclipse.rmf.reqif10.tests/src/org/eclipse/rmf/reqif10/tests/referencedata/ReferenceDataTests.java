package org.eclipse.rmf.reqif10.tests.referencedata;

import static org.junit.Assert.assertFalse;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.runtime.IPath;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.tests.util.AbstractTestCase;
import org.junit.Test;
 
public class ReferenceDataTests extends AbstractTestCase {
	
	final String INPUT_DIR = "input";
	final String WORK_DIR = "work";
	
	@Test
	public void testAllFilesInInputFolder() {
		File folder = new File(INPUT_DIR);
		if (folder.exists() && folder.isDirectory()) {
			for (String fileName :folder.list()) {
				System.out.println("Reading file: " + fileName);
				try {
//					System.out.println("validating input file");
//					validateAgainstSchema(INPUT_DIR + IPath.SEPARATOR + fileName);
					System.out.println("reading input file");
					ReqIF reqIF = loadReqIFFile(INPUT_DIR + IPath.SEPARATOR + fileName);
					System.out.println("writing file");
					saveReqIFFile(reqIF, WORK_DIR + IPath.SEPARATOR + fileName);
//					System.out.println("validating written file");
//					validateAgainstSchema(WORK_DIR + IPath.SEPARATOR + fileName);
				} catch (Exception e) {
					e.printStackTrace();
					assertFalse(true);
				}
			}
		}	
	}

}
