package org.eclipse.rmf.reqif10.tests.uc001.tc1250;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.tests.uc001.tc1250.testdata.TC1250Testdata;
import org.eclipse.rmf.reqif10.tests.util.AbstractTestCase;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("nls")
public class TC1250ExternalFilesTest extends AbstractTestCase {
	static final String TEST_CASE_ID = "TC1250";
	static final String REFERENCE_DATA_FILENAME1 = getWorkingFileName(getReferenceDataFileName(TEST_CASE_ID, false));
	static final String REFERENCE_DATA_ARCHIVE_FILENAME = getWorkingFileName(getReferenceDataFileName(TEST_CASE_ID, true));

	static ReqIF originalReqIF = null;
	static List<ReqIF> originalReqIFs = null;

	@BeforeClass
	public static void setupOnce() throws Exception {
		AbstractTestCase.setupOnce();

		// create the models
		TC1250ExternalFilesBuilder modelBuilder = new TC1250ExternalFilesBuilder();
		originalReqIF = modelBuilder.getReqIF();
		originalReqIFs = new ArrayList<ReqIF>();
		originalReqIFs.add(originalReqIF);
		String[] fileNames = { "excel.png", "excel.xls", "excel.xlsx", "word.png", "word.doc", "word.docx", "powerpoint.png", "powerpoint.ppt",
				"powerpoint.pptx", "rmf-logo-300.png" };

		// // save as reqifz
		saveReqIFsToZip(originalReqIFs, REFERENCE_DATA_ARCHIVE_FILENAME);
		//
		// // add the required files to the zip
		saveFilesToZip(REFERENCE_DATA_ARCHIVE_FILENAME, originalReqIF, fileNames);
	}

	@Test
	public void testSchemaCompliance1() throws Exception {
		validateAgainstSchema(REFERENCE_DATA_FILENAME1);
	}

	/**
	 * Based on {@link AbstractTestCase#saveReqIFsToZip(List, String)}
	 */
	private static void saveFilesToZip(String zipFileName, ReqIF reqif, String[] fileNames) throws IOException {

		int lastDotIndex = zipFileName.lastIndexOf(".");
		String entryName = zipFileName;
		if (0 < lastDotIndex) {
			entryName = zipFileName.substring(0, lastDotIndex);
		}
		int lastSlashIndex = entryName.lastIndexOf("/");
		if (0 < lastSlashIndex) {
			entryName = entryName.substring(lastSlashIndex + 1);
		}

		FileOutputStream fileOutputStream = new FileOutputStream(zipFileName);
		ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(fileOutputStream));

		// Save the ReqIF
		Resource resource = reqif.eResource();
		ZipEntry zipEntry = new ZipEntry(TEST_CASE_ID + ".reqif");
		zipOutputStream.putNextEntry(zipEntry);
		resource.save(zipOutputStream, null);

		// Save the files
		for (String fileName : fileNames) {
			InputStream is = TC1250Testdata.getInputStream(fileName);
			zipEntry = new ZipEntry("files/" + fileName);

			zipOutputStream.putNextEntry(zipEntry);

			// Not very efficient, but not an issue for testing.
			int b;
			while ((b = is.read()) >= 0) {
				zipOutputStream.write(b);
			}
		}

		zipOutputStream.close();
	}

}
