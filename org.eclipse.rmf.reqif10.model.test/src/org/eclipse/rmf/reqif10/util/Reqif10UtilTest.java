/*******************************************************************************
 * Copyright (c) 2011 itemis GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nirmal Sasidharan - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.util;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.rmf.pror.reqif10.testdata.TestData;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeDefinitionXhtml;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueBoolean;
import org.eclipse.rmf.reqif10.AttributeValueDate;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueInteger;
import org.eclipse.rmf.reqif10.AttributeValueReal;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.AttributeValueXhtml;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.ReqIf;
import org.eclipse.rmf.reqif10.Reqif10Factory;
import org.eclipse.rmf.reqif10.Reqif10Package;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.datatypes.DatatypesFactory;
import org.eclipse.rmf.reqif10.datatypes.XhtmlContent;
import org.junit.Test;

public class Reqif10UtilTest {

	@Test
	public void testGetTheValueBoolean() {
		testGetTheValue(Reqif10Factory.eINSTANCE.createAttributeValueBoolean(),
				Boolean.TRUE, new AttributeValueSetter() {
					@Override
					public void setTheValue(AttributeValue av, Object value) {
						((AttributeValueBoolean) av)
								.setTheValue((Boolean) value);
					}
				});
	}

	@Test
	public void testGetTheValueDate() throws DatatypeConfigurationException {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(new Date());
		XMLGregorianCalendar xmlCal = DatatypeFactory.newInstance()
				.newXMLGregorianCalendar(cal);
		testGetTheValue(Reqif10Factory.eINSTANCE.createAttributeValueDate(),
				xmlCal, new AttributeValueSetter() {
					@Override
					public void setTheValue(AttributeValue av, Object value) {
						((AttributeValueDate) av)
								.setTheValue((XMLGregorianCalendar) value);
					}
				});
	}

	@Test
	public void testGetTheValueInteger() {
		testGetTheValue(Reqif10Factory.eINSTANCE.createAttributeValueInteger(),
				BigInteger.valueOf(10), new AttributeValueSetter() {
					@Override
					public void setTheValue(AttributeValue av, Object value) {
						((AttributeValueInteger) av)
								.setTheValue((BigInteger) value);
					}
				});
	}

	@Test
	public void testGetTheValueReal() {
		testGetTheValue(Reqif10Factory.eINSTANCE.createAttributeValueReal(),
				Double.valueOf(10.5), new AttributeValueSetter() {
					@Override
					public void setTheValue(AttributeValue av, Object value) {
						((AttributeValueReal) av).setTheValue((Double) value);
					}
				});
	}

	@Test
	public void testGetTheValueString() {
		testGetTheValue(Reqif10Factory.eINSTANCE.createAttributeValueString(),
				"Hello, World", new AttributeValueSetter() {
					@Override
					public void setTheValue(AttributeValue av, Object value) {
						((AttributeValueString) av).setTheValue((String) value);
					}
				});
	}

	@Test
	public void testGetTheValueXhtml() {
		XhtmlContent content = DatatypesFactory.eINSTANCE.createXhtmlContent();
		testGetTheValue(Reqif10Factory.eINSTANCE.createAttributeValueXhtml(),
				content, new AttributeValueSetter() {
					@Override
					public void setTheValue(AttributeValue av, Object value) {
						((AttributeValueXhtml) av)
								.setTheValue((XhtmlContent) value);
					}
				});
	}

	@Test
	@SuppressWarnings("unchecked")
	public void testGetTheValueEnumeration() {
		EnumValue value = Reqif10Factory.eINSTANCE.createEnumValue();
		AttributeValueEnumeration av = Reqif10Factory.eINSTANCE
				.createAttributeValueEnumeration();
		assertEquals(0,
				((Collection<? extends EnumValue>) Reqif10Util.getTheValue(av))
						.size());

		av.getValues().add(value);
		assertEquals(1,
				((Collection<? extends EnumValue>) Reqif10Util.getTheValue(av))
						.size());

		av.getValues().clear();
		assertEquals(0,
				((Collection<? extends EnumValue>) Reqif10Util.getTheValue(av))
						.size());
	}

	/**
	 * Tests
	 * {@link Reqif10Util#getAttributeValue(org.eclipse.rmf.reqif10.SpecElementWithAttributes, AttributeDefinition)}
	 * for (almost) all types of AttributeDefinition.<p>
	 * 
	 * TODO {@link AttributeDefinitionXhtml} is currently missing.
	 */
	@Test
	public void testGetAttributeValue() throws Exception {
		ReqIf reqif = TestData.getTestReqif("alltypes.reqif");
		SpecObject specObject = reqif.getCoreContent().getSpecObjects().get(0);

		EList<AttributeDefinition> attrs = specObject.getType()
				.getSpecAttributes();
		assertEquals(6, attrs.size());
		for (AttributeDefinition ad : attrs) {
			AttributeValue value = Reqif10Util
					.getAttributeValue(specObject, ad);
			assertNotNull("Null Value for: " + ad, value);

			// We make sure the type of ad and value match by comparing part of the class name
			// e.g. AttributeValueDateImpl vs AttributeDefinitionDateImpl
			String adName = ad.getClass().getSimpleName();
			String valueName = value.getClass().getSimpleName();
			assertEquals(valueName.substring(14), adName.substring(19));
		}
	}

	@Test
	public void testGetAttributeValueForLabel() throws URISyntaxException {
		ReqIf reqif = TestData.getTestReqif("testGetAttributeValueForLabel.reqif");
		SpecObject specObject = reqif.getCoreContent().getSpecObjects().get(0);

		assertEquals(specObject.getValues().get(1), Reqif10Util.getAttributeValueForLabel(specObject, "ad1"));
		assertEquals(null, Reqif10Util.getAttributeValueForLabel(specObject, "ad2"));
		assertEquals(null, Reqif10Util.getAttributeValueForLabel(specObject, "ad2"));
	}

	@Test
	public void testtGetAttributeDefinition() {
		AttributeValueString av = Reqif10Factory.eINSTANCE.createAttributeValueString();
		assertNull(Reqif10Util.getAttributeDefinition(av));
		AttributeDefinitionString ad = Reqif10Factory.eINSTANCE.createAttributeDefinitionString();
		av.setDefinition(ad);
		assertSame(ad, Reqif10Util.getAttributeDefinition(av));
	}

	@Test
	public void testtGetDatatypeDefinition1() {
		AttributeDefinitionString ad = Reqif10Factory.eINSTANCE.createAttributeDefinitionString();
		assertNull(Reqif10Util.getDatatypeDefinition(ad));
		DatatypeDefinitionString dd = Reqif10Factory.eINSTANCE.createDatatypeDefinitionString();
		ad.setType(dd);
		assertSame(dd, Reqif10Util.getDatatypeDefinition(ad));
	}

	@Test
	public void testtGetDatatypeDefinition2() {
		AttributeValueString av = Reqif10Factory.eINSTANCE.createAttributeValueString();
		assertNull(Reqif10Util.getDatatypeDefinition(av));
		AttributeDefinitionString ad = Reqif10Factory.eINSTANCE.createAttributeDefinitionString();
		av.setDefinition(ad);
		assertNull(Reqif10Util.getDatatypeDefinition(av));		
		DatatypeDefinitionString dd = Reqif10Factory.eINSTANCE.createDatatypeDefinitionString();
		ad.setType(dd);
		assertSame(dd, Reqif10Util.getDatatypeDefinition(av));
	}

	@Test
	public void testGetSpecType() {
		SpecObject specObject = Reqif10Factory.eINSTANCE.createSpecObject();
		assertNull(Reqif10Util.getSpecType(specObject));
		SpecObjectType type = Reqif10Factory.eINSTANCE.createSpecObjectType();
		specObject.setType(type);
		assertSame(type, Reqif10Util.getSpecType(specObject));
	}


	/**
	 * We are lazy and test only one case and the null case.
	 */
	@Test
	public void testGetTheValueFeature() {
		assertSame(Reqif10Package.Literals.ATTRIBUTE_VALUE_BOOLEAN__THE_VALUE,
				Reqif10Util.getTheValueFeature(Reqif10Factory.eINSTANCE
						.createAttributeValueBoolean()));

		try {
			Reqif10Util.getTheValueFeature(null);
			fail("Should have thrown IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			// Expected
		}
	}

	//////////////////////////////////////////////////////////////////////////////////
	// Private Helper Methods and Interfaces
	//////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * Performs three tests on {@link Reqif10Util#getTheValue(AttributeValue)}.
	 */
	private void testGetTheValue(AttributeValue av, Object value,
			AttributeValueSetter setter) {
		assertNull(Reqif10Util.getTheValue(av));
		setter.setTheValue(av, value);
		assertSame(value, Reqif10Util.getTheValue(av));
		setter.setTheValue(av, null);
		assertNull(Reqif10Util.getTheValue(av));
	}

	/**
	 * We use this interface for testing the testGetTheValue* tests, as differnt
	 * types use different code for setting. While {@link Reqif10Util} has a
	 * method to set generically, we don't want to use it, as we could
	 * potentially mask bugs.
	 */
	interface AttributeValueSetter {
		public void setTheValue(AttributeValue av, Object value);
	}

}
