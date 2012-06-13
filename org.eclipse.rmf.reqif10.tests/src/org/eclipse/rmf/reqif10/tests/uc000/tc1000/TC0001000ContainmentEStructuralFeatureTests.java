package org.eclipse.rmf.reqif10.tests.uc000.tc1000;

import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.tests.util.AbstractTestCase;
import org.junit.BeforeClass;
import org.junit.Test;

public class TC0001000ContainmentEStructuralFeatureTests extends AbstractTestCase {
	static final String TEST_CASE_ID = "TC0001000";
	static final String REFERENCE_DATA_FILENAME = getWorkingFileName(getReferenceDataFileName(TEST_CASE_ID, false));
	static final String EXPORT_DATA_FILENAME = getWorkingFileName(getFirstExportFileName(TEST_CASE_ID, false));
	static ReqIF originalReqIF = null;
	static ReqIF loadedReqIF = null;

	@BeforeClass
	public static void setupOnce() throws Exception {
		AbstractTestCase.setupOnce();
		originalReqIF = new TC0001000ContainmentEStructuralFeatureModelBuilder().getReqIF();
		saveReqIFFile(originalReqIF, REFERENCE_DATA_FILENAME);
		loadedReqIF = loadReqIFFile(REFERENCE_DATA_FILENAME);
	}

	@Test
	public void test0004SingleReferenceSetNull() {
		// assertTrue(loadedReqIF.isSetTheHeader());
		// assertNull(loadedReqIF.getTheHeader());
	}

	@Test
	public void test0008ManyReferenceSetEmpty() {
		// assertTrue(loadedReqIF.isSetToolExtensions());
		// assertTrue(loadedReqIF.getToolExtensions().isEmpty());
	}
}
