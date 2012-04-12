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
package org.eclipse.rmf.reqif10.tests.uc001.tc1000;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Map;

import junit.framework.Assert;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueBoolean;
import org.eclipse.rmf.reqif10.AttributeValueDate;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueInteger;
import org.eclipse.rmf.reqif10.AttributeValueReal;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.tests.util.AbstractTestCase;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("nls")
public class TC1000SimpleContentTests extends AbstractTestCase {
	static final String TEST_CASE_ID = "TC1000";
	static final String REFERENCE_DATA_FILENAME = getWorkingFileName(getReferenceDataFileName(TEST_CASE_ID, false));
	static final String EXPORT_DATA_FILENAME = getWorkingFileName(getFirstExportFileName(TEST_CASE_ID, false));
	static ReqIF originalReqIF = null;
	static ReqIF loadedReqIF = null;

	@BeforeClass
	public static void setupOnce() throws Exception {
		AbstractTestCase.setupOnce();
		originalReqIF = new TC1000SimpleContentModelBuilder().getReqIF();
		saveReqIFFile(originalReqIF, REFERENCE_DATA_FILENAME);
		loadedReqIF = loadReqIFFile(REFERENCE_DATA_FILENAME);
	}

	@Test
	public void testSchemaCompliance() throws Exception {
		validateAgainstSchema(REFERENCE_DATA_FILENAME);
	}

	@Test
	public void testReqIFNotNull() {
		assertNotNull("The loaded ReqIF model shall not be Null", loadedReqIF);
	}

	@Test
	public void testNoProxies() throws IOException {
		EcoreUtil.resolveAll(loadedReqIF);
		Map<EObject, Collection<Setting>> map = EcoreUtil.ProxyCrossReferencer.find(loadedReqIF);
		assertEquals(0, map.size());
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
	public void testReqIF() {
		assertTrue(loadedReqIF.isSetCoreContent());
		assertFalse(loadedReqIF.isSetLang());
		assertTrue(loadedReqIF.isSetTheHeader());
		assertFalse(loadedReqIF.isSetToolExtensions());
	}

	@Test
	public void testReqIFHeader() {
		assertFalse(loadedReqIF.getTheHeader().isSetComment());
		assertTrue(loadedReqIF.getTheHeader().isSetCreationTime());
		assertTrue(loadedReqIF.getTheHeader().isSetIdentifier());
		assertFalse(loadedReqIF.getTheHeader().isSetRepositoryId());
		assertTrue(loadedReqIF.getTheHeader().isSetReqIFToolId());
		assertTrue(loadedReqIF.getTheHeader().isSetReqIFVersion());
		assertTrue(loadedReqIF.getTheHeader().isSetSourceToolId());
		assertTrue(loadedReqIF.getTheHeader().isSetTitle());

		assertEquals(originalReqIF.getTheHeader().getCreationTime().toGregorianCalendar(), loadedReqIF.getTheHeader().getCreationTime()
				.toGregorianCalendar());
		assertEquals(originalReqIF.getTheHeader().getIdentifier(), loadedReqIF.getTheHeader().getIdentifier());
		assertEquals(originalReqIF.getTheHeader().getReqIFToolId(), loadedReqIF.getTheHeader().getReqIFToolId());
		assertEquals(originalReqIF.getTheHeader().getReqIFVersion(), loadedReqIF.getTheHeader().getReqIFVersion());
		assertEquals(originalReqIF.getTheHeader().getSourceToolId(), loadedReqIF.getTheHeader().getSourceToolId());
		assertEquals(originalReqIF.getTheHeader().getTitle(), loadedReqIF.getTheHeader().getTitle());
	}

	@Test
	public void testReqIFContent() {
		assertTrue(loadedReqIF.getCoreContent().isSetDatatypes());
		assertTrue(loadedReqIF.getCoreContent().isSetSpecifications());
		assertTrue(loadedReqIF.getCoreContent().isSetSpecObjects());
		assertFalse(loadedReqIF.getCoreContent().isSetSpecRelationGroups());
		assertFalse(loadedReqIF.getCoreContent().isSetSpecRelations());
		assertTrue(loadedReqIF.getCoreContent().isSetSpecTypes());
	}

	@Test
	public void testSpecObjectType() {

		// get the specObject Type
		ReqIFContent ReqIFContent = loadedReqIF.getCoreContent();
		assertTrue(ReqIFContent.isSetSpecTypes());
		assertEquals(2, ReqIFContent.getSpecTypes().size());

		SpecObjectType specObjectType = null;
		for (SpecType specType : ReqIFContent.getSpecTypes()) {
			if (specType instanceof SpecObjectType) {
				specObjectType = (SpecObjectType) specType;
				break;
			}
		}

		assertNotNull("SpecObjectType must be available", specObjectType);

		// check the specObjectType
		assertFalse(specObjectType.isSetDesc());
		assertTrue(specObjectType.isSetIdentifier());
		assertTrue(specObjectType.isSetLastChange());
		assertTrue(specObjectType.isSetLongName());
		assertTrue(specObjectType.isSetSpecAttributes());
		// TODO: test the values
	}

	@Test
	public void testSpecObject() {

		// get the specObject Type
		ReqIFContent reqIFContent = loadedReqIF.getCoreContent();
		assertTrue(reqIFContent.isSetSpecObjects());
		assertEquals(1, reqIFContent.getSpecObjects().size());

		SpecObject specObject = reqIFContent.getSpecObjects().get(0);

		// check the specObject
		assertFalse(specObject.isSetDesc());
		assertTrue(specObject.isSetIdentifier());
		assertTrue(specObject.isSetLastChange());
		assertFalse(specObject.isSetLongName());
		assertTrue(specObject.isSetValues());
		assertTrue(specObject.isSetType());

		// check the reference to SpecObjectType
		SpecObjectType expectedSpecObjectType = null;
		for (SpecType specType : reqIFContent.getSpecTypes()) {
			if (specType instanceof SpecObjectType) {
				expectedSpecObjectType = (SpecObjectType) specType;
				break;
			}
		}

		SpecObjectType specObjectType = specObject.getType();
		assertNotNull(specObjectType);
		assertFalse(specObjectType.eIsProxy());
		assertEquals(expectedSpecObjectType, specObjectType);

		assertEquals(8, specObject.getValues().size());
	}

	@Test
	public void testAttributeValueBooleanTc1000t() {
		AttributeValue attributeValue = loadedReqIF.getCoreContent().getSpecObjects().get(0).getValues().get(0);
		assertTrue(attributeValue instanceof AttributeValueBoolean);
		AttributeValueBoolean attributeValueBooleanTc1000t = (AttributeValueBoolean) attributeValue;
		assertTrue(attributeValueBooleanTc1000t.isSetTheValue());
		assertTrue(attributeValueBooleanTc1000t.isTheValue());
	}

	@Test
	public void testAttributeValueBooleanTc1000f() {
		AttributeValue attributeValue = loadedReqIF.getCoreContent().getSpecObjects().get(0).getValues().get(1);
		assertTrue(attributeValue instanceof AttributeValueBoolean);
		AttributeValueBoolean attributeValueBooleanTc1000f = (AttributeValueBoolean) attributeValue;
		assertTrue(attributeValueBooleanTc1000f.isSetTheValue());
		assertFalse(attributeValueBooleanTc1000f.isTheValue());
	}

	@Test
	public void testAttributeValueInteger() {
		AttributeValue attributeValue = loadedReqIF.getCoreContent().getSpecObjects().get(0).getValues().get(2);
		assertTrue(attributeValue instanceof AttributeValueInteger);
		AttributeValueInteger attributeValueInteger = (AttributeValueInteger) attributeValue;
		assertTrue(attributeValueInteger.isSetTheValue());
		assertEquals(new BigInteger("5000"), attributeValueInteger.getTheValue());
	}

	@Test
	public void testAttributeValueString() {
		AttributeValue attributeValue = loadedReqIF.getCoreContent().getSpecObjects().get(0).getValues().get(3);
		assertTrue(attributeValue instanceof AttributeValueString);
		AttributeValueString attributeValueString = (AttributeValueString) attributeValue;
		assertTrue(attributeValueString.isSetTheValue());
		assertEquals("Plain", attributeValueString.getTheValue());
	}

	@Test
	public void testAttributeValueReal() {
		AttributeValue attributeValue = loadedReqIF.getCoreContent().getSpecObjects().get(0).getValues().get(4);
		assertTrue(attributeValue instanceof AttributeValueReal);
		AttributeValueReal attributeValueReal = (AttributeValueReal) attributeValue;
		assertTrue(attributeValueReal.isSetTheValue());
		assertTrue(new Double(1234.5).equals(attributeValueReal.getTheValue()));
	}

	@Test
	public void testAttributeValueDate() {
		AttributeValue attributeValue = loadedReqIF.getCoreContent().getSpecObjects().get(0).getValues().get(5);
		assertTrue(attributeValue instanceof AttributeValueDate);
		AttributeValueDate attributeValueDate = (AttributeValueDate) attributeValue;
		assertTrue(attributeValueDate.isSetTheValue());
		assertEquals(EcoreUtil.createFromString(XMLTypePackage.eINSTANCE.getDateTime(), "2002-05-30T09:30:10+06:00"),
				attributeValueDate.getTheValue());

	}

	@Test
	public void testAttributeValueEnumeration() {
		AttributeValue attributeValue = loadedReqIF.getCoreContent().getSpecObjects().get(0).getValues().get(6);
		assertTrue(attributeValue instanceof AttributeValueEnumeration);
		AttributeValueEnumeration attributeValueEnumeration = (AttributeValueEnumeration) attributeValue;
		assertTrue(attributeValueEnumeration.isSetValues());
		assertEquals(1, attributeValueEnumeration.getValues().size());
		assertEquals("TC1000 Yellow", attributeValueEnumeration.getValues().get(0).getLongName());
	}

	@Test
	public void testAttributeValueEnumerationMultiValue() {
		AttributeValue attributeValue = loadedReqIF.getCoreContent().getSpecObjects().get(0).getValues().get(7);
		assertTrue(attributeValue instanceof AttributeValueEnumeration);
		AttributeValueEnumeration attributeValueEnumerationMultiValue = (AttributeValueEnumeration) attributeValue;
		assertTrue(attributeValueEnumerationMultiValue.isSetValues());
		assertEquals(3, attributeValueEnumerationMultiValue.getValues().size());
		assertEquals("TC1000 Yellow", attributeValueEnumerationMultiValue.getValues().get(0).getLongName());
		assertEquals("TC1000 Red", attributeValueEnumerationMultiValue.getValues().get(1).getLongName());
		assertEquals("TC1000 Green", attributeValueEnumerationMultiValue.getValues().get(2).getLongName());

	}
}
