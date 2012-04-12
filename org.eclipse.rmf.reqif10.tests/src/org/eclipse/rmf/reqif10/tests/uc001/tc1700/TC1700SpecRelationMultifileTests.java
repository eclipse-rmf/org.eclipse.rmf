package org.eclipse.rmf.reqif10.tests.uc001.tc1700;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import junit.framework.Assert;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.tests.util.AbstractTestCase;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("nls")
public class TC1700SpecRelationMultifileTests extends AbstractTestCase {
	static final String TEST_CASE_ID = "TC1700";
	static final String REFERENCE_DATA_FILENAME1 = getWorkingFileName(getReferenceDataFileName(TEST_CASE_ID + "1", false));
	static final String REFERENCE_DATA_FILENAME2 = getWorkingFileName(getReferenceDataFileName(TEST_CASE_ID + "2", false));
	static final String REFERENCE_DATA_ARCHIVE_FILENAME = getWorkingFileName(getReferenceDataFileName(TEST_CASE_ID, true));

	static final String EXPORT_DATA_FILENAME1 = getWorkingFileName(getFirstExportFileName(TEST_CASE_ID + "1", false));
	static final String EXPORT_DATA_FILENAME2 = getWorkingFileName(getFirstExportFileName(TEST_CASE_ID + "2", false));
	static final String EXPORT_DATA_ARCHIVE_FILENAME = getWorkingFileName(getFirstExportFileName(TEST_CASE_ID, true));

	static ReqIF originalReqIF1 = null;
	static ReqIF originalReqIF2 = null;
	static List<ReqIF> originalReqIFs = null;
	static ReqIF loadedReqIF1 = null;
	static ReqIF loadedReqIF2 = null;
	static List<ReqIF> loadedReqIFs = null;

	@BeforeClass
	public static void setupOnce() throws Exception {
		AbstractTestCase.setupOnce();

		// create the models
		TC1700SpecRelationMultifile1ModelBuilder modelBuilder = new TC1700SpecRelationMultifile1ModelBuilder();
		originalReqIF1 = modelBuilder.getReqIF();
		originalReqIF2 = new TC1700SpecRelationMultifile2ModelBuilder(modelBuilder).getReqIF();
		originalReqIFs = new ArrayList<ReqIF>();
		originalReqIFs.add(originalReqIF1);
		originalReqIFs.add(originalReqIF2);

		// save as reqifz
		saveReqIFsToZip(originalReqIFs, REFERENCE_DATA_ARCHIVE_FILENAME);
		loadedReqIFs = loadReqIFFromZip(REFERENCE_DATA_ARCHIVE_FILENAME);

		// save as separate reqif files
		saveReqIFFile(originalReqIF1, REFERENCE_DATA_FILENAME1);
		saveReqIFFile(originalReqIF2, REFERENCE_DATA_FILENAME2);
		loadedReqIF1 = loadReqIFFile(REFERENCE_DATA_FILENAME1);
		loadedReqIF2 = loadReqIFFile(REFERENCE_DATA_FILENAME1);
	}

	@Test
	public void testSchemaCompliance1() throws Exception {
		validateAgainstSchema(REFERENCE_DATA_FILENAME1);
	}

	@Test
	public void testSchemaCompliance2() throws Exception {
		validateAgainstSchema(REFERENCE_DATA_FILENAME2);
	}

	@Test
	public void testResave() throws IOException {
		try {
			saveReqIFsToZip(loadedReqIFs, EXPORT_DATA_ARCHIVE_FILENAME);
		} catch (IOException ioe) {
			Assert.assertFalse("We shall be able to save without exception. However the following exception occurred: " + ioe.toString(), true);
		}
	}

	@Test
	public void testNoProxies() throws IOException {
		ResourceSet resourceSet = loadedReqIFs.get(0).eResource().getResourceSet();
		EcoreUtil.resolveAll(resourceSet);
		Map<EObject, Collection<Setting>> map = EcoreUtil.ProxyCrossReferencer.find(loadedReqIFs);
		assertEquals(0, map.size());
	}

}
