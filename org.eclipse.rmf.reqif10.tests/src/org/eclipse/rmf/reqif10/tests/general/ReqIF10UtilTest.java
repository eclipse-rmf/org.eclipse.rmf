package org.eclipse.rmf.reqif10.tests.general;

import static org.junit.Assert.assertEquals;

import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.junit.Test;

public class ReqIF10UtilTest {

	/**
	 * Tests {@link ReqIF10Util#getTheValue(AttributeValue)}
	 */
	@Test
	public void testGetTheValueBoolean() {
		AttributeValue av = ReqIF10Factory.eINSTANCE.createAttributeValueBoolean();
		assertEquals(false, ReqIF10Util.getTheValue(av));
	}

	/**
	 * Tests {@link ReqIF10Util#getTheValue(AttributeValue)}
	 */
	@Test
	public void testGetTheValueString() {
		AttributeValue av = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		assertEquals(null, ReqIF10Util.getTheValue(av));
	}

	/**
	 * Tests {@link ReqIF10Util#getTheValue(AttributeValue)}
	 */
	@Test
	public void testGetTheValue() {
		AttributeValue av = ReqIF10Factory.eINSTANCE.createAttributeValueDate();
		assertEquals(null, ReqIF10Util.getTheValue(av));
	}

	/**
	 * Tests {@link ReqIF10Util#getTheValue(AttributeValue)}
	 */
	@Test
	public void testGetTheValueInteger() {
		AttributeValue av = ReqIF10Factory.eINSTANCE.createAttributeValueInteger();
		assertEquals(null, ReqIF10Util.getTheValue(av));
	}

	/**
	 * Tests {@link ReqIF10Util#getTheValue(AttributeValue)}
	 */
	@Test
	public void testGetTheValueReal() {
		AttributeValue av = ReqIF10Factory.eINSTANCE.createAttributeValueReal();
		assertEquals(0d, ReqIF10Util.getTheValue(av));
	}

	/**
	 * Tests {@link ReqIF10Util#getTheValue(AttributeValue)}
	 */
	@Test
	public void testGetTheValueXHTML() {
		AttributeValue av = ReqIF10Factory.eINSTANCE.createAttributeValueXHTML();
		assertEquals(null, ReqIF10Util.getTheValue(av));
	}
}
