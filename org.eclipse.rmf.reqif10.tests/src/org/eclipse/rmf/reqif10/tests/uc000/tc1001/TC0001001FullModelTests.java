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
package org.eclipse.rmf.reqif10.tests.uc000.tc1001;

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
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionBoolean;
import org.eclipse.rmf.reqif10.AttributeDefinitionDate;
import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeDefinitionInteger;
import org.eclipse.rmf.reqif10.AttributeDefinitionReal;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueBoolean;
import org.eclipse.rmf.reqif10.AttributeValueDate;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueInteger;
import org.eclipse.rmf.reqif10.AttributeValueReal;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean;
import org.eclipse.rmf.reqif10.DatatypeDefinitionDate;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.DatatypeDefinitionInteger;
import org.eclipse.rmf.reqif10.DatatypeDefinitionReal;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.tests.util.AbstractTestCase;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("nls")
public class TC0001001FullModelTests extends AbstractTestCase {
	static final String TEST_CASE_ID = "TC0001001";
	static final String REFERENCE_DATA_FILENAME = getWorkingFileName(getReferenceDataFileName(TEST_CASE_ID, false));
	static final String EXPORT_DATA_FILENAME = getWorkingFileName(getFirstExportFileName(TEST_CASE_ID, false));
	static ReqIF originalReqIF = null;
	static ReqIF loadedReqIF = null;

	@BeforeClass
	public static void setupOnce() throws Exception {
		AbstractTestCase.setupOnce();
		originalReqIF = new TC0001001FullModelModelBuilder().getReqIF();
		saveReqIFFile(originalReqIF, REFERENCE_DATA_FILENAME);
		loadedReqIF = loadReqIFFile(REFERENCE_DATA_FILENAME);
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
		assertTrue(loadedReqIF.isSetLang());
		assertTrue(loadedReqIF.isSetTheHeader());
		assertTrue(loadedReqIF.isSetToolExtensions());

		assertNotNull(loadedReqIF.getCoreContent());
		assertEquals(originalReqIF.getLang(), loadedReqIF.getLang());
		assertNotNull(loadedReqIF.getTheHeader());
		assertEquals(originalReqIF.getToolExtensions().size(), loadedReqIF.getToolExtensions().size());
	}

	@Test
	public void testReqIFHeader() {
		assertTrue(loadedReqIF.getTheHeader().isSetComment());
		assertTrue(loadedReqIF.getTheHeader().isSetCreationTime());
		assertTrue(loadedReqIF.getTheHeader().isSetIdentifier());
		assertTrue(loadedReqIF.getTheHeader().isSetRepositoryId());
		assertTrue(loadedReqIF.getTheHeader().isSetReqIFToolId());
		assertTrue(loadedReqIF.getTheHeader().isSetReqIFVersion());
		assertTrue(loadedReqIF.getTheHeader().isSetSourceToolId());
		assertTrue(loadedReqIF.getTheHeader().isSetTitle());

		assertEquals(originalReqIF.getTheHeader().getComment(), loadedReqIF.getTheHeader().getComment());
		assertEquals(originalReqIF.getTheHeader().getCreationTime().toGregorianCalendar(), loadedReqIF.getTheHeader().getCreationTime()
				.toGregorianCalendar());
		assertEquals(originalReqIF.getTheHeader().getIdentifier(), loadedReqIF.getTheHeader().getIdentifier());
		assertEquals(originalReqIF.getTheHeader().getRepositoryId(), loadedReqIF.getTheHeader().getRepositoryId());
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
		assertTrue(loadedReqIF.getCoreContent().isSetSpecTypes());
		assertTrue(loadedReqIF.getCoreContent().isSetSpecRelationGroups());
		assertTrue(loadedReqIF.getCoreContent().isSetSpecRelations());

		assertEquals(originalReqIF.getCoreContent().getDatatypes().size(), loadedReqIF.getCoreContent().getDatatypes().size());
		assertEquals(originalReqIF.getCoreContent().getSpecifications().size(), loadedReqIF.getCoreContent().getSpecifications().size());
		assertEquals(originalReqIF.getCoreContent().getSpecObjects().size(), loadedReqIF.getCoreContent().getSpecObjects().size());
		assertEquals(originalReqIF.getCoreContent().getSpecTypes().size(), loadedReqIF.getCoreContent().getSpecTypes().size());
		assertEquals(originalReqIF.getCoreContent().getSpecRelationGroups().size(), loadedReqIF.getCoreContent().getSpecRelationGroups().size());
		assertEquals(originalReqIF.getCoreContent().getSpecRelations().size(), loadedReqIF.getCoreContent().getSpecRelations().size());
	}

	@Test
	public void testReqIFToolExtensions() {
		assertTrue(loadedReqIF.isSetToolExtensions());
	}

	@Test
	public void testSpecObjectType() {

		// get the loaded specObject Type
		ReqIFContent loadedReqIFContent = loadedReqIF.getCoreContent();
		assertTrue(loadedReqIFContent.isSetSpecTypes());

		SpecObjectType loadedSpecObjectType = null;
		for (SpecType specType : loadedReqIFContent.getSpecTypes()) {
			if (specType instanceof SpecObjectType) {
				loadedSpecObjectType = (SpecObjectType) specType;
				break;
			}
		}

		assertNotNull("SpecObjectType must be available", loadedSpecObjectType);

		// get the original specObject Type
		ReqIFContent originalReqIFContent = loadedReqIF.getCoreContent();

		SpecObjectType originalSpecObjectType = null;
		for (SpecType specType : originalReqIFContent.getSpecTypes()) {
			if (specType instanceof SpecObjectType) {
				originalSpecObjectType = (SpecObjectType) specType;
				break;
			}
		}

		// check the specObjectType
		assertTrue(loadedSpecObjectType.isSetDesc());
		assertTrue(loadedSpecObjectType.isSetIdentifier());
		assertTrue(loadedSpecObjectType.isSetLastChange());
		assertTrue(loadedSpecObjectType.isSetLongName());
		assertTrue(loadedSpecObjectType.isSetSpecAttributes());

		assertEquals(originalSpecObjectType.getDesc(), loadedSpecObjectType.getDesc());
		assertEquals(originalSpecObjectType.getIdentifier(), loadedSpecObjectType.getIdentifier());
		assertEquals(originalSpecObjectType.getLastChange(), loadedSpecObjectType.getLastChange());
		assertEquals(originalSpecObjectType.getLongName(), loadedSpecObjectType.getLongName());
		assertEquals(originalSpecObjectType.getSpecAttributes().size(), loadedSpecObjectType.getSpecAttributes().size());
	}

	@Test
	public void testSpecObject() {

		// get the loaded specObject Type
		ReqIFContent loadedReqIFContent = loadedReqIF.getCoreContent();
		SpecObject loadedSpecObject = loadedReqIFContent.getSpecObjects().get(0);

		// get the original specObject Type
		ReqIFContent originalReqIFContent = originalReqIF.getCoreContent();
		SpecObject originalSpecObject = originalReqIFContent.getSpecObjects().get(0);

		// check the specObject
		assertTrue(loadedSpecObject.isSetDesc());
		assertTrue(loadedSpecObject.isSetIdentifier());
		assertTrue(loadedSpecObject.isSetLastChange());
		assertTrue(loadedSpecObject.isSetLongName());
		assertTrue(loadedSpecObject.isSetValues());
		assertTrue(loadedSpecObject.isSetType());

		assertEquals(originalSpecObject.getDesc(), loadedSpecObject.getDesc());
		assertEquals(originalSpecObject.getIdentifier(), loadedSpecObject.getIdentifier());
		assertEquals(originalSpecObject.getLastChange(), loadedSpecObject.getLastChange());
		assertEquals(originalSpecObject.getLongName(), loadedSpecObject.getLongName());

		// check the reference to SpecObjectType
		SpecObjectType loadedExpectedSpecObjectType = null;
		for (SpecType specType : loadedReqIFContent.getSpecTypes()) {
			if (specType instanceof SpecObjectType) {
				loadedExpectedSpecObjectType = (SpecObjectType) specType;
				break;
			}
		}

		assertEquals(6, loadedSpecObject.getValues().size());

		SpecObjectType specObjectType = loadedSpecObject.getType();
		assertNotNull(specObjectType);
		assertFalse(specObjectType.eIsProxy());
		assertEquals(loadedExpectedSpecObjectType, specObjectType);

	}

	@Test
	public void testAttributeValueBoolean() {
		AttributeValue attributeValue = loadedReqIF.getCoreContent().getSpecObjects().get(0).getValues().get(0);
		assertTrue(attributeValue instanceof AttributeValueBoolean);
		AttributeValueBoolean attributeValueBoolean = (AttributeValueBoolean) attributeValue;
		assertTrue(attributeValueBoolean.isSetTheValue());
		assertTrue(attributeValueBoolean.isTheValue());
	}

	@Test
	public void testAttributeValueInteger() {
		AttributeValue attributeValue = loadedReqIF.getCoreContent().getSpecObjects().get(0).getValues().get(1);
		assertTrue(attributeValue instanceof AttributeValueInteger);
		AttributeValueInteger attributeValueInteger = (AttributeValueInteger) attributeValue;
		assertTrue(attributeValueInteger.isSetTheValue());
		assertEquals(new BigInteger("5000"), attributeValueInteger.getTheValue());
	}

	@Test
	public void testAttributeValueString() {
		AttributeValue attributeValue = loadedReqIF.getCoreContent().getSpecObjects().get(0).getValues().get(2);
		assertTrue(attributeValue instanceof AttributeValueString);
		AttributeValueString attributeValueString = (AttributeValueString) attributeValue;
		assertTrue(attributeValueString.isSetTheValue());
		assertEquals("Plain", attributeValueString.getTheValue());
	}

	@Test
	public void testAttributeValueReal() {
		AttributeValue attributeValue = loadedReqIF.getCoreContent().getSpecObjects().get(0).getValues().get(3);
		assertTrue(attributeValue instanceof AttributeValueReal);
		AttributeValueReal attributeValueReal = (AttributeValueReal) attributeValue;
		assertTrue(attributeValueReal.isSetTheValue());
		assertTrue(new Double(1234.5).equals(attributeValueReal.getTheValue()));
	}

	@Test
	public void testAttributeValueDate() {
		AttributeValue attributeValue = loadedReqIF.getCoreContent().getSpecObjects().get(0).getValues().get(4);
		assertTrue(attributeValue instanceof AttributeValueDate);
		AttributeValueDate attributeValueDate = (AttributeValueDate) attributeValue;
		assertTrue(attributeValueDate.isSetTheValue());
		assertEquals(EcoreUtil.createFromString(XMLTypePackage.eINSTANCE.getDateTime(), "2002-05-30T09:30:10+06:00"),
				attributeValueDate.getTheValue());

	}

	@Test
	public void testAttributeValueEnumeration() {
		AttributeValue attributeValue = loadedReqIF.getCoreContent().getSpecObjects().get(0).getValues().get(5);
		assertTrue(attributeValue instanceof AttributeValueEnumeration);
		AttributeValueEnumeration attributeValueEnumerationMultiValue = (AttributeValueEnumeration) attributeValue;
		assertTrue(attributeValueEnumerationMultiValue.isSetValues());
		assertEquals(3, attributeValueEnumerationMultiValue.getValues().size());
		assertEquals("TC0001001 Yellow", attributeValueEnumerationMultiValue.getValues().get(0).getLongName());
		assertEquals("TC0001001 Red", attributeValueEnumerationMultiValue.getValues().get(1).getLongName());
		assertEquals("TC0001001 Green", attributeValueEnumerationMultiValue.getValues().get(2).getLongName());
	}

	@Test
	public void testAttributeDefinitionBoolean() {
		SpecType loadedSpecType = loadedReqIF.getCoreContent().getSpecTypes().get(0);
		assertTrue(loadedSpecType instanceof SpecObjectType);
		SpecObjectType loadedSpecObjectType = (SpecObjectType) loadedSpecType;

		AttributeDefinition loadedAttributeDefinition = loadedSpecObjectType.getSpecAttributes().get(0);
		assertTrue(loadedAttributeDefinition instanceof AttributeDefinitionBoolean);
		AttributeDefinitionBoolean loadedAttributeDefinitionBoolean = (AttributeDefinitionBoolean) loadedAttributeDefinition;

		AttributeDefinitionBoolean originalAttributeDefinitionBoolean = (AttributeDefinitionBoolean) originalReqIF.getCoreContent().getSpecTypes()
				.get(0).getSpecAttributes().get(0);

		assertTrue(loadedAttributeDefinitionBoolean.isSetAlternativeID());
		assertTrue(loadedAttributeDefinitionBoolean.isSetDefaultValue());
		assertTrue(loadedAttributeDefinitionBoolean.isSetDesc());
		assertTrue(loadedAttributeDefinitionBoolean.isSetEditable());
		assertTrue(loadedAttributeDefinitionBoolean.isSetIdentifier());
		assertTrue(loadedAttributeDefinitionBoolean.isSetLastChange());
		assertTrue(loadedAttributeDefinitionBoolean.isSetLongName());
		assertTrue(loadedAttributeDefinitionBoolean.isSetType());

		assertNotNull(loadedAttributeDefinitionBoolean.getAlternativeID());
		assertNotNull(loadedAttributeDefinitionBoolean.getDefaultValue());
		assertEquals(originalAttributeDefinitionBoolean.getDesc(), loadedAttributeDefinitionBoolean.getDesc());
		assertEquals(originalAttributeDefinitionBoolean.isEditable(), loadedAttributeDefinitionBoolean.isEditable());
		assertEquals(originalAttributeDefinitionBoolean.getIdentifier(), loadedAttributeDefinitionBoolean.getIdentifier());
		assertEquals(originalAttributeDefinitionBoolean.getLastChange(), loadedAttributeDefinitionBoolean.getLastChange());
		assertEquals(originalAttributeDefinitionBoolean.getLongName(), loadedAttributeDefinitionBoolean.getLongName());
	}

	@Test
	public void testAttributeDefinitionInteger() {
		SpecType loadedSpecType = loadedReqIF.getCoreContent().getSpecTypes().get(0);
		assertTrue(loadedSpecType instanceof SpecObjectType);
		SpecObjectType loadedSpecObjectType = (SpecObjectType) loadedSpecType;

		AttributeDefinition loadedAttributeDefinition = loadedSpecObjectType.getSpecAttributes().get(1);
		assertTrue(loadedAttributeDefinition instanceof AttributeDefinitionInteger);
		AttributeDefinitionInteger loadedAttributeDefinitionInteger = (AttributeDefinitionInteger) loadedAttributeDefinition;

		AttributeDefinitionInteger originalAttributeDefinitionInteger = (AttributeDefinitionInteger) originalReqIF.getCoreContent().getSpecTypes()
				.get(0).getSpecAttributes().get(1);

		assertTrue(loadedAttributeDefinitionInteger.isSetAlternativeID());
		assertTrue(loadedAttributeDefinitionInteger.isSetDefaultValue());
		assertTrue(loadedAttributeDefinitionInteger.isSetDesc());
		assertTrue(loadedAttributeDefinitionInteger.isSetEditable());
		assertTrue(loadedAttributeDefinitionInteger.isSetIdentifier());
		assertTrue(loadedAttributeDefinitionInteger.isSetLastChange());
		assertTrue(loadedAttributeDefinitionInteger.isSetLongName());
		assertTrue(loadedAttributeDefinitionInteger.isSetType());

		assertNotNull(loadedAttributeDefinitionInteger.getAlternativeID());
		assertNotNull(loadedAttributeDefinitionInteger.getDefaultValue());
		assertEquals(originalAttributeDefinitionInteger.getDesc(), loadedAttributeDefinitionInteger.getDesc());
		assertEquals(originalAttributeDefinitionInteger.isEditable(), loadedAttributeDefinitionInteger.isEditable());
		assertEquals(originalAttributeDefinitionInteger.getIdentifier(), loadedAttributeDefinitionInteger.getIdentifier());
		assertEquals(originalAttributeDefinitionInteger.getLastChange(), loadedAttributeDefinitionInteger.getLastChange());
		assertEquals(originalAttributeDefinitionInteger.getLongName(), loadedAttributeDefinitionInteger.getLongName());
	}

	@Test
	public void testAttributeDefinitionString() {
		SpecType loadedSpecType = loadedReqIF.getCoreContent().getSpecTypes().get(0);
		assertTrue(loadedSpecType instanceof SpecObjectType);
		SpecObjectType loadedSpecObjectType = (SpecObjectType) loadedSpecType;

		AttributeDefinition loadedAttributeDefinition = loadedSpecObjectType.getSpecAttributes().get(2);
		assertTrue(loadedAttributeDefinition instanceof AttributeDefinitionString);
		AttributeDefinitionString loadedAttributeDefinitionString = (AttributeDefinitionString) loadedAttributeDefinition;

		AttributeDefinitionString originalAttributeDefinitionString = (AttributeDefinitionString) originalReqIF.getCoreContent().getSpecTypes()
				.get(0).getSpecAttributes().get(2);

		assertTrue(loadedAttributeDefinitionString.isSetAlternativeID());
		assertTrue(loadedAttributeDefinitionString.isSetDefaultValue());
		assertTrue(loadedAttributeDefinitionString.isSetDesc());
		assertTrue(loadedAttributeDefinitionString.isSetEditable());
		assertTrue(loadedAttributeDefinitionString.isSetIdentifier());
		assertTrue(loadedAttributeDefinitionString.isSetLastChange());
		assertTrue(loadedAttributeDefinitionString.isSetLongName());
		assertTrue(loadedAttributeDefinitionString.isSetType());

		assertNotNull(loadedAttributeDefinitionString.getAlternativeID());
		assertNotNull(loadedAttributeDefinitionString.getDefaultValue());
		assertEquals(originalAttributeDefinitionString.getDesc(), loadedAttributeDefinitionString.getDesc());
		assertEquals(originalAttributeDefinitionString.isEditable(), loadedAttributeDefinitionString.isEditable());
		assertEquals(originalAttributeDefinitionString.getIdentifier(), loadedAttributeDefinitionString.getIdentifier());
		assertEquals(originalAttributeDefinitionString.getLastChange(), loadedAttributeDefinitionString.getLastChange());
		assertEquals(originalAttributeDefinitionString.getLongName(), loadedAttributeDefinitionString.getLongName());
	}

	@Test
	public void testAttributeDefinitionReal() {
		SpecType loadedSpecType = loadedReqIF.getCoreContent().getSpecTypes().get(0);
		assertTrue(loadedSpecType instanceof SpecObjectType);
		SpecObjectType loadedSpecObjectType = (SpecObjectType) loadedSpecType;

		AttributeDefinition loadedAttributeDefinition = loadedSpecObjectType.getSpecAttributes().get(3);
		assertTrue(loadedAttributeDefinition instanceof AttributeDefinitionReal);
		AttributeDefinitionReal loadedAttributeDefinitionReal = (AttributeDefinitionReal) loadedAttributeDefinition;

		AttributeDefinitionReal originalAttributeDefinitionReal = (AttributeDefinitionReal) originalReqIF.getCoreContent().getSpecTypes().get(0)
				.getSpecAttributes().get(3);

		assertTrue(loadedAttributeDefinitionReal.isSetAlternativeID());
		assertTrue(loadedAttributeDefinitionReal.isSetDefaultValue());
		assertTrue(loadedAttributeDefinitionReal.isSetDesc());
		assertTrue(loadedAttributeDefinitionReal.isSetEditable());
		assertTrue(loadedAttributeDefinitionReal.isSetIdentifier());
		assertTrue(loadedAttributeDefinitionReal.isSetLastChange());
		assertTrue(loadedAttributeDefinitionReal.isSetLongName());
		assertTrue(loadedAttributeDefinitionReal.isSetType());

		assertNotNull(loadedAttributeDefinitionReal.getAlternativeID());
		assertNotNull(loadedAttributeDefinitionReal.getDefaultValue());
		assertEquals(originalAttributeDefinitionReal.getDesc(), loadedAttributeDefinitionReal.getDesc());
		assertEquals(originalAttributeDefinitionReal.isEditable(), loadedAttributeDefinitionReal.isEditable());
		assertEquals(originalAttributeDefinitionReal.getIdentifier(), loadedAttributeDefinitionReal.getIdentifier());
		assertEquals(originalAttributeDefinitionReal.getLastChange(), loadedAttributeDefinitionReal.getLastChange());
		assertEquals(originalAttributeDefinitionReal.getLongName(), loadedAttributeDefinitionReal.getLongName());
	}

	@Test
	public void testAttributeDefinitionDate() {
		SpecType loadedSpecType = loadedReqIF.getCoreContent().getSpecTypes().get(0);
		assertTrue(loadedSpecType instanceof SpecObjectType);
		SpecObjectType loadedSpecObjectType = (SpecObjectType) loadedSpecType;

		AttributeDefinition loadedAttributeDefinition = loadedSpecObjectType.getSpecAttributes().get(4);
		assertTrue(loadedAttributeDefinition instanceof AttributeDefinitionDate);
		AttributeDefinitionDate loadedAttributeDefinitionDate = (AttributeDefinitionDate) loadedAttributeDefinition;

		AttributeDefinitionDate originalAttributeDefinitionDate = (AttributeDefinitionDate) originalReqIF.getCoreContent().getSpecTypes().get(0)
				.getSpecAttributes().get(4);

		assertTrue(loadedAttributeDefinitionDate.isSetAlternativeID());
		assertTrue(loadedAttributeDefinitionDate.isSetDefaultValue());
		assertTrue(loadedAttributeDefinitionDate.isSetDesc());
		assertTrue(loadedAttributeDefinitionDate.isSetEditable());
		assertTrue(loadedAttributeDefinitionDate.isSetIdentifier());
		assertTrue(loadedAttributeDefinitionDate.isSetLastChange());
		assertTrue(loadedAttributeDefinitionDate.isSetLongName());
		assertTrue(loadedAttributeDefinitionDate.isSetType());

		assertNotNull(loadedAttributeDefinitionDate.getAlternativeID());
		assertNotNull(loadedAttributeDefinitionDate.getDefaultValue());
		assertEquals(originalAttributeDefinitionDate.getDesc(), loadedAttributeDefinitionDate.getDesc());
		assertEquals(originalAttributeDefinitionDate.isEditable(), loadedAttributeDefinitionDate.isEditable());
		assertEquals(originalAttributeDefinitionDate.getIdentifier(), loadedAttributeDefinitionDate.getIdentifier());
		assertEquals(originalAttributeDefinitionDate.getLastChange(), loadedAttributeDefinitionDate.getLastChange());
		assertEquals(originalAttributeDefinitionDate.getLongName(), loadedAttributeDefinitionDate.getLongName());
	}

	@Test
	public void testAttributeDefinitionEnumeration() {
		SpecType loadedSpecType = loadedReqIF.getCoreContent().getSpecTypes().get(0);
		assertTrue(loadedSpecType instanceof SpecObjectType);
		SpecObjectType loadedSpecObjectType = (SpecObjectType) loadedSpecType;

		AttributeDefinition loadedAttributeDefinition = loadedSpecObjectType.getSpecAttributes().get(5);
		assertTrue(loadedAttributeDefinition instanceof AttributeDefinitionEnumeration);
		AttributeDefinitionEnumeration loadedAttributeDefinitionEnumeration = (AttributeDefinitionEnumeration) loadedAttributeDefinition;

		AttributeDefinitionEnumeration originalAttributeDefinitionEnumeration = (AttributeDefinitionEnumeration) originalReqIF.getCoreContent()
				.getSpecTypes().get(0).getSpecAttributes().get(5);

		assertTrue(loadedAttributeDefinitionEnumeration.isSetAlternativeID());
		assertTrue(loadedAttributeDefinitionEnumeration.isSetDefaultValue());
		assertTrue(loadedAttributeDefinitionEnumeration.isSetDesc());
		assertTrue(loadedAttributeDefinitionEnumeration.isSetEditable());
		assertTrue(loadedAttributeDefinitionEnumeration.isSetIdentifier());
		assertTrue(loadedAttributeDefinitionEnumeration.isSetLastChange());
		assertTrue(loadedAttributeDefinitionEnumeration.isSetLongName());
		assertTrue(loadedAttributeDefinitionEnumeration.isSetMultiValued());
		assertTrue(loadedAttributeDefinitionEnumeration.isSetType());

		assertNotNull(loadedAttributeDefinitionEnumeration.getAlternativeID());
		assertNotNull(loadedAttributeDefinitionEnumeration.getDefaultValue());
		assertEquals(originalAttributeDefinitionEnumeration.getDesc(), loadedAttributeDefinitionEnumeration.getDesc());
		assertEquals(originalAttributeDefinitionEnumeration.isEditable(), loadedAttributeDefinitionEnumeration.isEditable());
		assertEquals(originalAttributeDefinitionEnumeration.getIdentifier(), loadedAttributeDefinitionEnumeration.getIdentifier());
		assertEquals(originalAttributeDefinitionEnumeration.getLastChange(), loadedAttributeDefinitionEnumeration.getLastChange());
		assertEquals(originalAttributeDefinitionEnumeration.getLongName(), loadedAttributeDefinitionEnumeration.getLongName());
		assertEquals(originalAttributeDefinitionEnumeration.isMultiValued(), loadedAttributeDefinitionEnumeration.isMultiValued());
	}

	@Test
	public void testDatatypeBoolean() {
		DatatypeDefinition loadedDatatypeDefinition = loadedReqIF.getCoreContent().getDatatypes().get(0);
		assertTrue(loadedDatatypeDefinition instanceof DatatypeDefinitionBoolean);
		DatatypeDefinitionBoolean loadedDatatypeDefinitionBoolean = (DatatypeDefinitionBoolean) loadedDatatypeDefinition;

		DatatypeDefinitionBoolean originalDatatypeDefinitionBoolean = (DatatypeDefinitionBoolean) originalReqIF.getCoreContent().getDatatypes()
				.get(0);

		assertTrue(loadedDatatypeDefinitionBoolean.isSetAlternativeID());
		assertTrue(loadedDatatypeDefinitionBoolean.isSetDesc());
		assertTrue(loadedDatatypeDefinitionBoolean.isSetIdentifier());
		assertTrue(loadedDatatypeDefinitionBoolean.isSetLastChange());
		assertTrue(loadedDatatypeDefinitionBoolean.isSetLongName());

		assertNotNull(loadedDatatypeDefinitionBoolean.getAlternativeID());
		assertEquals(originalDatatypeDefinitionBoolean.getDesc(), loadedDatatypeDefinitionBoolean.getDesc());
		assertEquals(originalDatatypeDefinitionBoolean.getIdentifier(), loadedDatatypeDefinitionBoolean.getIdentifier());
		assertEquals(originalDatatypeDefinitionBoolean.getLastChange(), loadedDatatypeDefinitionBoolean.getLastChange());
		assertEquals(originalDatatypeDefinitionBoolean.getLongName(), loadedDatatypeDefinitionBoolean.getLongName());
	}

	@Test
	public void testDatatypeInteger() {
		DatatypeDefinition loadedDatatypeDefinition = loadedReqIF.getCoreContent().getDatatypes().get(1);
		assertTrue(loadedDatatypeDefinition instanceof DatatypeDefinitionInteger);
		DatatypeDefinitionInteger loadedDatatypeDefinitionInteger = (DatatypeDefinitionInteger) loadedDatatypeDefinition;

		DatatypeDefinitionInteger originalDatatypeDefinitionInteger = (DatatypeDefinitionInteger) originalReqIF.getCoreContent().getDatatypes()
				.get(1);

		assertTrue(loadedDatatypeDefinitionInteger.isSetAlternativeID());
		assertTrue(loadedDatatypeDefinitionInteger.isSetDesc());
		assertTrue(loadedDatatypeDefinitionInteger.isSetIdentifier());
		assertTrue(loadedDatatypeDefinitionInteger.isSetLastChange());
		assertTrue(loadedDatatypeDefinitionInteger.isSetLongName());
		assertTrue(loadedDatatypeDefinitionInteger.isSetMax());
		assertTrue(loadedDatatypeDefinitionInteger.isSetMin());

		assertNotNull(loadedDatatypeDefinitionInteger.getAlternativeID());
		assertEquals(originalDatatypeDefinitionInteger.getDesc(), loadedDatatypeDefinitionInteger.getDesc());
		assertEquals(originalDatatypeDefinitionInteger.getIdentifier(), loadedDatatypeDefinitionInteger.getIdentifier());
		assertEquals(originalDatatypeDefinitionInteger.getLastChange(), loadedDatatypeDefinitionInteger.getLastChange());
		assertEquals(originalDatatypeDefinitionInteger.getLongName(), loadedDatatypeDefinitionInteger.getLongName());
		assertEquals(originalDatatypeDefinitionInteger.getMax(), loadedDatatypeDefinitionInteger.getMax());
		assertEquals(originalDatatypeDefinitionInteger.getMin(), loadedDatatypeDefinitionInteger.getMin());
	}

	@Test
	public void testDatatypeString() {
		DatatypeDefinition loadedDatatypeDefinition = loadedReqIF.getCoreContent().getDatatypes().get(2);
		assertTrue(loadedDatatypeDefinition instanceof DatatypeDefinitionString);
		DatatypeDefinitionString loadedDatatypeDefinitionString = (DatatypeDefinitionString) loadedDatatypeDefinition;

		DatatypeDefinitionString originalDatatypeDefinitionString = (DatatypeDefinitionString) originalReqIF.getCoreContent().getDatatypes().get(2);

		assertTrue(loadedDatatypeDefinitionString.isSetAlternativeID());
		assertTrue(loadedDatatypeDefinitionString.isSetDesc());
		assertTrue(loadedDatatypeDefinitionString.isSetIdentifier());
		assertTrue(loadedDatatypeDefinitionString.isSetLastChange());
		assertTrue(loadedDatatypeDefinitionString.isSetLongName());
		assertTrue(loadedDatatypeDefinitionString.isSetMaxLength());

		assertNotNull(loadedDatatypeDefinitionString.getAlternativeID());
		assertEquals(originalDatatypeDefinitionString.getDesc(), loadedDatatypeDefinitionString.getDesc());
		assertEquals(originalDatatypeDefinitionString.getIdentifier(), loadedDatatypeDefinitionString.getIdentifier());
		assertEquals(originalDatatypeDefinitionString.getLastChange(), loadedDatatypeDefinitionString.getLastChange());
		assertEquals(originalDatatypeDefinitionString.getLongName(), loadedDatatypeDefinitionString.getLongName());
		assertEquals(originalDatatypeDefinitionString.getMaxLength(), loadedDatatypeDefinitionString.getMaxLength());
	}

	@Test
	public void testDatatypeReal() {
		DatatypeDefinition loadedDatatypeDefinition = loadedReqIF.getCoreContent().getDatatypes().get(3);
		assertTrue(loadedDatatypeDefinition instanceof DatatypeDefinitionReal);
		DatatypeDefinitionReal loadedDatatypeDefinitionReal = (DatatypeDefinitionReal) loadedDatatypeDefinition;

		DatatypeDefinitionReal originalDatatypeDefinitionReal = (DatatypeDefinitionReal) originalReqIF.getCoreContent().getDatatypes().get(3);

		assertTrue(loadedDatatypeDefinitionReal.isSetAlternativeID());
		assertTrue(loadedDatatypeDefinitionReal.isSetDesc());
		assertTrue(loadedDatatypeDefinitionReal.isSetIdentifier());
		assertTrue(loadedDatatypeDefinitionReal.isSetLastChange());
		assertTrue(loadedDatatypeDefinitionReal.isSetLongName());
		assertTrue(loadedDatatypeDefinitionReal.isSetAccuracy());
		assertTrue(loadedDatatypeDefinitionReal.isSetMax());
		assertTrue(loadedDatatypeDefinitionReal.isSetMin());

		assertNotNull(loadedDatatypeDefinitionReal.getAlternativeID());
		assertEquals(originalDatatypeDefinitionReal.getDesc(), loadedDatatypeDefinitionReal.getDesc());
		assertEquals(originalDatatypeDefinitionReal.getIdentifier(), loadedDatatypeDefinitionReal.getIdentifier());
		assertEquals(originalDatatypeDefinitionReal.getLastChange(), loadedDatatypeDefinitionReal.getLastChange());
		assertEquals(originalDatatypeDefinitionReal.getLongName(), loadedDatatypeDefinitionReal.getLongName());
		assertEquals(originalDatatypeDefinitionReal.getAccuracy(), loadedDatatypeDefinitionReal.getAccuracy());
		assertEquals(Double.valueOf(originalDatatypeDefinitionReal.getMax()), Double.valueOf(loadedDatatypeDefinitionReal.getMax()));
		assertEquals(Double.valueOf(originalDatatypeDefinitionReal.getMin()), Double.valueOf(loadedDatatypeDefinitionReal.getMin()));
	}

	@Test
	public void testDatatypeDate() {
		DatatypeDefinition loadedDatatypeDefinition = loadedReqIF.getCoreContent().getDatatypes().get(4);
		assertTrue(loadedDatatypeDefinition instanceof DatatypeDefinitionDate);
		DatatypeDefinitionDate loadedDatatypeDefinitionDate = (DatatypeDefinitionDate) loadedDatatypeDefinition;

		DatatypeDefinitionDate originalDatatypeDefinitionDate = (DatatypeDefinitionDate) originalReqIF.getCoreContent().getDatatypes().get(4);

		assertTrue(loadedDatatypeDefinitionDate.isSetAlternativeID());
		assertTrue(loadedDatatypeDefinitionDate.isSetDesc());
		assertTrue(loadedDatatypeDefinitionDate.isSetIdentifier());
		assertTrue(loadedDatatypeDefinitionDate.isSetLastChange());
		assertTrue(loadedDatatypeDefinitionDate.isSetLongName());

		assertNotNull(loadedDatatypeDefinitionDate.getAlternativeID());
		assertEquals(originalDatatypeDefinitionDate.getDesc(), loadedDatatypeDefinitionDate.getDesc());
		assertEquals(originalDatatypeDefinitionDate.getIdentifier(), loadedDatatypeDefinitionDate.getIdentifier());
		assertEquals(originalDatatypeDefinitionDate.getLastChange(), loadedDatatypeDefinitionDate.getLastChange());
		assertEquals(originalDatatypeDefinitionDate.getLongName(), loadedDatatypeDefinitionDate.getLongName());
	}

	@Test
	public void testDatatypeEnumeration() {
		DatatypeDefinition loadedDatatypeDefinition = loadedReqIF.getCoreContent().getDatatypes().get(5);
		assertTrue(loadedDatatypeDefinition instanceof DatatypeDefinitionEnumeration);
		DatatypeDefinitionEnumeration loadedDatatypeDefinitionEnumeration = (DatatypeDefinitionEnumeration) loadedDatatypeDefinition;

		DatatypeDefinitionEnumeration originalDatatypeDefinitionEnumeration = (DatatypeDefinitionEnumeration) originalReqIF.getCoreContent()
				.getDatatypes().get(5);

		assertTrue(loadedDatatypeDefinitionEnumeration.isSetAlternativeID());
		assertTrue(loadedDatatypeDefinitionEnumeration.isSetDesc());
		assertTrue(loadedDatatypeDefinitionEnumeration.isSetIdentifier());
		assertTrue(loadedDatatypeDefinitionEnumeration.isSetLastChange());
		assertTrue(loadedDatatypeDefinitionEnumeration.isSetLongName());

		assertNotNull(loadedDatatypeDefinitionEnumeration.getAlternativeID());
		assertEquals(originalDatatypeDefinitionEnumeration.getDesc(), loadedDatatypeDefinitionEnumeration.getDesc());
		assertEquals(originalDatatypeDefinitionEnumeration.getIdentifier(), loadedDatatypeDefinitionEnumeration.getIdentifier());
		assertEquals(originalDatatypeDefinitionEnumeration.getLastChange(), loadedDatatypeDefinitionEnumeration.getLastChange());
		assertEquals(originalDatatypeDefinitionEnumeration.getLongName(), loadedDatatypeDefinitionEnumeration.getLongName());
	}

}
