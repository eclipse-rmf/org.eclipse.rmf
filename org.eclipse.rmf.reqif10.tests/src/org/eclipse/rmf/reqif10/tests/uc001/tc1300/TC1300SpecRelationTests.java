package org.eclipse.rmf.reqif10.tests.uc001.tc1300;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import junit.framework.Assert;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.tests.util.AbstractTestCase;
import org.eclipse.rmf.reqif10.tests.util.CommonSystemAttributes;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("nls")
public class TC1300SpecRelationTests extends AbstractTestCase implements CommonSystemAttributes {
	static final String TEST_CASE_ID = "TC1300";
	static final String REFERENCE_DATA_FILENAME = getWorkingFileName(getReferenceDataFileName(TEST_CASE_ID, false));
	static final String EXPORT_DATA_FILENAME = getWorkingFileName(getFirstExportFileName(TEST_CASE_ID, false));
	static ReqIF originalReqIF = null;
	static ReqIF loadedReqIF = null;

	@BeforeClass
	public static void setupOnce() throws Exception {
		AbstractTestCase.setupOnce();
		originalReqIF = new TC1300SpecRelationModelBuilder().getReqIF();
		saveReqIFFile(originalReqIF, REFERENCE_DATA_FILENAME);
		loadedReqIF = loadReqIFFile(REFERENCE_DATA_FILENAME);
	}

	@Test
	public void testSchemaCompliance() throws Exception {
		validateAgainstSchema(REFERENCE_DATA_FILENAME);
	}

	@Test
	public void testResave() throws IOException {
		try {
			saveReqIFFile(loadedReqIF, EXPORT_DATA_FILENAME);
		} catch (IOException ioe) {
			Assert.assertFalse("We shall be able to save without exception. However the following exception occurred: " + ioe.toString(), true);
		}
	}

	@Test
	public void testNoProxies() throws IOException {
		EcoreUtil.resolveAll(loadedReqIF);
		Map<EObject, Collection<Setting>> map = EcoreUtil.ProxyCrossReferencer.find(loadedReqIF);
		assertEquals(0, map.size());
	}

	@Test
	public void testSpecRelationHasName() throws IOException {
		SpecRelation specRelation = loadedReqIF.getCoreContent().getSpecRelations().get(0);
		assertNotNull(specRelation.getType());
		assertEquals(1, specRelation.getValues().size());
		AttributeValueXHTML value = (AttributeValueXHTML) specRelation.getValues().get(0);
		assertEquals(REQIF_NAME, value.getDefinition().getLongName());
	}
}
