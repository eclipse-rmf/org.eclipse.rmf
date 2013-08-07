package org.eclipse.rmf.reqif10.tests.general;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.junit.Test;

public class ReqIF10UtilTest {

	protected static void assetValueIsNull(AttributeValue av) {
		testGetTheValue(av, null);
	}

	protected static void testGetTheValue(AttributeValue av, Object theValue) {
		assertEquals(theValue, ReqIF10Util.getTheValue(av));
	}

	protected static void testSetTheValue(AttributeValue av, Object theValue) {
		ReqIF10Util.setTheValue(av, theValue);
		assertEquals(theValue, ReqIF10Util.getTheValue(av));
	}

	/**
	 * Tests {@link ReqIF10Util#getTheValue(AttributeValue)}
	 */
	@Test
	public void testGetTheValueBoolean() {
		testGetTheValue(ReqIF10Factory.eINSTANCE.createAttributeValueBoolean(), false);
	}

	/**
	 * Tests {@link ReqIF10Util#setTheValue(AttributeValue)}
	 */
	@Test
	public void testSetTheValueBoolean() {
		testSetTheValue(ReqIF10Factory.eINSTANCE.createAttributeValueBoolean(), true);
	}

	/**
	 * Tests {@link ReqIF10Util#getTheValue(AttributeValue)}
	 */
	@Test
	public void testGetTheValueString() {
		assetValueIsNull(ReqIF10Factory.eINSTANCE.createAttributeValueString());
	}

	/**
	 * Tests {@link ReqIF10Util#setTheValue(AttributeValue)}
	 */
	@Test
	public void testSetTheValueString() {
		testSetTheValue(ReqIF10Factory.eINSTANCE.createAttributeValueString(), "test"); //$NON-NLS-1$
	}

	/**
	 * Tests {@link ReqIF10Util#getTheValue(AttributeValue)}
	 */
	@Test
	public void testGetTheValueDate() {
		assetValueIsNull(ReqIF10Factory.eINSTANCE.createAttributeValueDate());
	}

	/**
	 * Tests {@link ReqIF10Util#setTheValue(AttributeValue)}
	 * @throws DatatypeConfigurationException 
	 */
	@Test
	public void testSetTheValueDate() throws DatatypeConfigurationException {
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		testSetTheValue(ReqIF10Factory.eINSTANCE.createAttributeValueDate(), date);
	}

	/**
	 * Tests {@link ReqIF10Util#getTheValue(AttributeValue)}
	 */
	@Test
	public void testGetTheValueInteger() {
		assetValueIsNull(ReqIF10Factory.eINSTANCE.createAttributeValueInteger());
	}

	/**
	 * Tests {@link ReqIF10Util#setTheValue(AttributeValue)}
	 */
	@Test
	public void testSetTheValueInteger() {
		testSetTheValue(ReqIF10Factory.eINSTANCE.createAttributeValueInteger(), BigInteger.valueOf(12345));
	}

	/**
	 * Tests {@link ReqIF10Util#getTheValue(AttributeValue)}
	 */
	@Test
	public void testGetTheValueReal() {
		testGetTheValue(ReqIF10Factory.eINSTANCE.createAttributeValueReal(), 0d);
	}

	/**
	 * Tests {@link ReqIF10Util#setTheValue(AttributeValue)}
	 */
	@Test
	public void testSetTheValueReal() {
		testSetTheValue(ReqIF10Factory.eINSTANCE.createAttributeValueReal(), 123.45d);
	}

	/**
	 * Tests {@link ReqIF10Util#getTheValue(AttributeValue)}
	 */
	@Test
	public void testGetTheValueXHTML() {
		assetValueIsNull(ReqIF10Factory.eINSTANCE.createAttributeValueXHTML());
	}

	/**
	 * Tests {@link ReqIF10Util#setTheValue(AttributeValue)}
	 */
	@Test
	public void testSetTheValueXHTML() {
		testSetTheValue(ReqIF10Factory.eINSTANCE.createAttributeValueXHTML(), ReqIF10Factory.eINSTANCE.createXhtmlContent());
	}

	/**
	 * Tests {@link ReqIF10Util#getTheValue(AttributeValue)}
	 */
	@Test
	public void testGetTheValueEnumeration() {
		AttributeValue av = ReqIF10Factory.eINSTANCE.createAttributeValueEnumeration();
		assertTrue(((EList<?>) ReqIF10Util.getTheValue(av)).isEmpty());
	}

	/**
	 * Tests {@link ReqIF10Util#setTheValue(AttributeValue)}
	 */
	@Test
	public void testSetTheValueEnumeration() {
		AttributeValue av = ReqIF10Factory.eINSTANCE.createAttributeValueEnumeration();
		@SuppressWarnings("unchecked")
		EList<EnumValue> values = (EList<EnumValue>) ReqIF10Util.getTheValue(av);
		values.add(ReqIF10Factory.eINSTANCE.createEnumValue());
		assertEquals(values, ReqIF10Util.getTheValue(av));
	}
}
