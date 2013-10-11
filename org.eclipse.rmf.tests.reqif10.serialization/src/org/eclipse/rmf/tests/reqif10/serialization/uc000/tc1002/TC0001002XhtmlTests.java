package org.eclipse.rmf.tests.reqif10.serialization.uc000.tc1002;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import junit.framework.Assert;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.rmf.reqif10.AttributeDefinitionBoolean;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.ReqIFHeader;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.XhtmlContent;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDivType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPType;
import org.eclipse.rmf.tests.reqif10.serialization.util.AbstractTestCase;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("nls")
public class TC0001002XhtmlTests extends AbstractTestCase {
	static final String TEST_CASE_ID = "TC0001002";
	static final String REFERENCE_DATA_FILENAME = getWorkingFileName(getReferenceDataFileName(TEST_CASE_ID, false));
	static final String EXPORT_DATA_FILENAME = getWorkingFileName(getFirstExportFileName(TEST_CASE_ID, false));
	static ReqIF originalReqIF = null;
	static ReqIF loadedReqIF = null;

	@BeforeClass
	public static void setupOnce() throws Exception {
		AbstractTestCase.setupOnce();
		originalReqIF = new TC0001002XhtmlModelBuilder().getReqIF();
		saveReqIFFile(originalReqIF, REFERENCE_DATA_FILENAME);
		loadedReqIF = loadReqIFFile(REFERENCE_DATA_FILENAME);
	}

	@Test
	public void test0001XhtmlContentAvailable() {
		ReqIF reqIF = loadedReqIF;
		assertSame(1, loadedReqIF.getCoreContent().getSpecObjects().size());
		SpecObject specObject = loadedReqIF.getCoreContent().getSpecObjects().get(0);
		
		assertSame(1,specObject.getValues().size());
		AttributeValue value = specObject.getValues().get(0);
		
		assertTrue(value instanceof AttributeValueXHTML);
		AttributeValueXHTML valueXHTML = (AttributeValueXHTML)value;
		
		XhtmlContent xhtmlContent = valueXHTML.getTheValue();
		assertNotNull(xhtmlContent);
		
		EObject xhtmlObject = xhtmlContent.getXhtml();
		assertNotNull(xhtmlObject);
		assertTrue(xhtmlObject instanceof XhtmlDivType);
		
		XhtmlDivType div = (XhtmlDivType)xhtmlObject;
		FeatureMap featureMap = div.getMixed();
		assertSame(3,featureMap.size());
		
		Entry entry = featureMap.get(0);
		assertTrue(FeatureMapUtil.isText(entry));
		String text = (String)entry.getValue();
		assertEquals("text before h1", text);
	}
	
	@Test
	public void testResave() throws IOException {
		try {
			saveReqIFFile(EcoreUtil.copy(loadedReqIF), EXPORT_DATA_FILENAME);
		} catch (IOException ioe) {
			Assert.assertFalse("We shall be able to save without exception. However the following exception occurred: " + ioe.toString(), true);
		}
	}

}
