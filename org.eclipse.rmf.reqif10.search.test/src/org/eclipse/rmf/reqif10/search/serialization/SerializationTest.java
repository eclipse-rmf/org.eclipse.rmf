/**
 * 
 */
package org.eclipse.rmf.reqif10.search.serialization;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;

import org.eclipse.rmf.reqif10.AttributeDefinitionBoolean;
import org.eclipse.rmf.reqif10.AttributeDefinitionDate;
import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeDefinitionInteger;
import org.eclipse.rmf.reqif10.AttributeDefinitionReal;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeDefinitionXHTML;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.search.filter.AbstractTextFilter;
import org.eclipse.rmf.reqif10.search.filter.BoolFilter;
import org.eclipse.rmf.reqif10.search.filter.DateFilter;
import org.eclipse.rmf.reqif10.search.filter.EnumFilter;
import org.eclipse.rmf.reqif10.search.filter.FilterContext;
import org.eclipse.rmf.reqif10.search.filter.NumberFilter;
import org.eclipse.rmf.reqif10.search.filter.ReqIFFullFilter;
import org.eclipse.rmf.reqif10.search.filter.SimpleCompoundFilter;
import org.eclipse.rmf.reqif10.search.filter.StringFilter;
import org.eclipse.rmf.reqif10.search.filter.XhtmlFilter;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests the serialization, which is required for the named filters.
 * 
 * @author jastram
 */
public class SerializationTest {
	
	private AttributeDefinitionString adString;
	private AttributeDefinitionBoolean adBool;
	private AttributeDefinitionEnumeration adEnum;
	private EnumValue enumValue;
	private AttributeDefinitionInteger adInt;
	private AttributeDefinitionXHTML adXhtml;
	private AttributeDefinitionDate adDate;
	private AttributeDefinitionReal adReal;

	private byte[] serializeObject(Object obj) throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(obj);
		oos.close();
		baos.close();
		return baos.toByteArray();		
	}

	private Object deserialize(byte[] bytes) throws Exception {
		ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
		ObjectInputStream ois = new ObjectInputStream(bais);		
		Object obj = ois.readObject();
		ois.close();
		bais.close();
		return obj;
	}
	
	@Before
	public void setupMockReqIF() {		
		ReqIF reqif = ReqIF10Factory.eINSTANCE.createReqIF();
		ReqIFContent content = ReqIF10Factory.eINSTANCE.createReqIFContent();
		reqif.setCoreContent(content);
		SpecType specType = ReqIF10Factory.eINSTANCE.createSpecObjectType();
		content.getSpecTypes().add(specType);

		adString = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		adString.setIdentifier("ads");
		specType.getSpecAttributes().add(adString);

		adXhtml = ReqIF10Factory.eINSTANCE.createAttributeDefinitionXHTML();
		adXhtml.setIdentifier("adx");
		specType.getSpecAttributes().add(adXhtml);

		adBool = ReqIF10Factory.eINSTANCE.createAttributeDefinitionBoolean();
		adBool.setIdentifier("adb");
		specType.getSpecAttributes().add(adBool);

		adInt = ReqIF10Factory.eINSTANCE.createAttributeDefinitionInteger();
		adInt.setIdentifier("adi");
		specType.getSpecAttributes().add(adInt);

		adReal = ReqIF10Factory.eINSTANCE.createAttributeDefinitionReal();
		adReal.setIdentifier("adr");
		specType.getSpecAttributes().add(adReal);

		adDate = ReqIF10Factory.eINSTANCE.createAttributeDefinitionDate();
		adDate.setIdentifier("add");
		specType.getSpecAttributes().add(adDate);

		adEnum = ReqIF10Factory.eINSTANCE.createAttributeDefinitionEnumeration();
		adEnum.setIdentifier("ade");
		DatatypeDefinitionEnumeration ddEnum = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionEnumeration();
		adEnum.setType(ddEnum);
		enumValue = ReqIF10Factory.eINSTANCE.createEnumValue();
		enumValue.setIdentifier("enumValue");
		ddEnum.getSpecifiedValues().add(enumValue);
		specType.getSpecAttributes().add(adEnum);		

		FilterContext.REQIF = reqif;
}

	/**
	 * Tests the String Filter persistence with an Internal Attribute
	 */
	@Test
	public void testStringFilterInternal() throws Exception {
		StringFilter sf1 = new StringFilter(ReqIFFullFilter.Operator.CONTAINS, "test", AbstractTextFilter.InternalAttribute.DESC,
				true);
		Object obj = deserialize(serializeObject(sf1));
		assertTrue(obj instanceof StringFilter);
		StringFilter sf2 = (StringFilter)obj;
		assertEquals(sf1.getFilterValue1(), sf2.getFilterValue1());
		assertEquals(sf1.isCaseSensitive(), sf2.isCaseSensitive());
		assertEquals(sf1.getOperator(), sf2.getOperator());
		assertEquals(sf1.getAttribute(), sf2.getAttribute());
	}

	@Test
	public void testStringFilter() throws Exception {
		StringFilter sf1 = new StringFilter(ReqIFFullFilter.Operator.CONTAINS, "test", adString,
				true);
		Object obj = deserialize(serializeObject(sf1));
		assertTrue(obj instanceof StringFilter);
		StringFilter sf2 = (StringFilter)obj;
		assertEquals(sf1.getFilterValue1(), sf2.getFilterValue1());
		assertEquals(sf1.isCaseSensitive(), sf2.isCaseSensitive());
		assertEquals(sf1.getOperator(), sf2.getOperator());
		assertEquals(sf1.getAttribute(), sf2.getAttribute());
	}

	@Test
	public void testXhtmlFilter() throws Exception {
		XhtmlFilter xf1 = new XhtmlFilter(ReqIFFullFilter.Operator.CONTAINS, "test", adXhtml,
				true);
		Object obj = deserialize(serializeObject(xf1));
		assertTrue(obj instanceof XhtmlFilter);
		XhtmlFilter xf2 = (XhtmlFilter)obj;
		assertEquals(xf1.getFilterValue1(), xf2.getFilterValue1());
		assertEquals(xf1.isCaseSensitive(), xf2.isCaseSensitive());
		assertEquals(xf1.getOperator(), xf2.getOperator());
		assertEquals(xf1.getAttribute(), xf2.getAttribute());
	}

	@Test
	public void testSimpleCompoundFilter() throws Exception {
		SimpleCompoundFilter cf1 = new SimpleCompoundFilter(new ArrayList<ReqIFFullFilter>(), true);
		Object obj = deserialize(serializeObject(cf1));
		assertTrue(obj instanceof SimpleCompoundFilter);
		SimpleCompoundFilter cf2 = (SimpleCompoundFilter) obj;
		assertEquals(cf1.isOrFilter(), cf2.isOrFilter());
	}

	@Test
	public void testBooleanFilter() throws Exception {
		BoolFilter sf1 = new BoolFilter(ReqIFFullFilter.Operator.IS, Boolean.TRUE, adBool);
		Object obj = deserialize(serializeObject(sf1));
		assertTrue(obj instanceof BoolFilter);
		BoolFilter sf2 = (BoolFilter)obj;
		assertEquals(sf1.getFilterValue1(), sf2.getFilterValue1());
		assertEquals(sf1.getOperator(), sf2.getOperator());
		assertEquals(sf1.getAttribute(), sf2.getAttribute());
	}
	
	@Test
	public void testEnumFilter() throws Exception {
		Collection<EnumValue> values = new HashSet<EnumValue>();
		values.add(enumValue);
		EnumFilter ef1 = new EnumFilter(ReqIFFullFilter.Operator.CONTAINS_ANY, values, adEnum);
		Object obj = deserialize(serializeObject(ef1));
		assertTrue(obj instanceof EnumFilter);
		EnumFilter ef2 = (EnumFilter) obj;
		assertEquals(ef1.getAttribute(), ef2.getAttribute());
		assertEquals(ef1.getOperator(), ef2.getOperator());
		assertEquals(ef1.getFilterValue1(), ef2.getFilterValue1());
	}
	
	@Test
	public void testIntegerFilter() throws Exception {
		NumberFilter nf1 = new NumberFilter(ReqIFFullFilter.Operator.BETWEEN, new BigInteger("1"), 
				new BigInteger("2"), adInt);
		Object obj = deserialize(serializeObject(nf1));
		assertTrue(obj instanceof NumberFilter);
		NumberFilter nf2 = (NumberFilter)obj;
		assertEquals(nf1.getFilterValue1(), nf2.getFilterValue1());
		assertEquals(nf1.getFilterValue2(), nf2.getFilterValue2());
		assertEquals(nf1.getOperator(), nf2.getOperator());
		assertEquals(nf1.getAttribute(), nf2.getAttribute());
	}

	@Test
	public void testDoubleFilter() throws Exception {
		NumberFilter nf1 = new NumberFilter(ReqIFFullFilter.Operator.BETWEEN, new Double(10.5), 
				new Double("20.5"), adReal);
		Object obj = deserialize(serializeObject(nf1));
		assertTrue(obj instanceof NumberFilter);
		NumberFilter nf2 = (NumberFilter)obj;
		assertEquals(nf1.getFilterValue1(), nf2.getFilterValue1());
		assertEquals(nf1.getFilterValue2(), nf2.getFilterValue2());
		assertEquals(nf1.getOperator(), nf2.getOperator());
		assertEquals(nf1.getAttribute(), nf2.getAttribute());
	}

	@Test
	public void testDateFilter() throws Exception {
		GregorianCalendar date1 = (GregorianCalendar) GregorianCalendar.getInstance();
		date1.setTime(new Date(123456789));
		GregorianCalendar date2 = (GregorianCalendar) GregorianCalendar.getInstance();
		date2.setTime(new Date(234567890));
		assertNotEquals(date1, date2);

		DateFilter nf1 = new DateFilter(ReqIFFullFilter.Operator.BETWEEN, date1, 
				date2, adDate);

		Object obj = deserialize(serializeObject(nf1));
		assertTrue(obj instanceof DateFilter);
		DateFilter nf2 = (DateFilter)obj;
		assertEquals(nf1.getFilterValue1(), nf2.getFilterValue1());
		assertEquals(nf1.getFilterValue2(), nf2.getFilterValue2());
		assertEquals(nf1.getOperator(), nf2.getOperator());
		assertEquals(nf1.getAttribute(), nf2.getAttribute());
	}

	@Test
	public void testDateInternalFilter() throws Exception {
		GregorianCalendar date1 = (GregorianCalendar) GregorianCalendar.getInstance();
		date1.setTime(new Date(123456789));
		GregorianCalendar date2 = (GregorianCalendar) GregorianCalendar.getInstance();
		date2.setTime(new Date(234567890));
		assertNotEquals(date1, date2);

		DateFilter nf1 = new DateFilter(ReqIFFullFilter.Operator.BETWEEN, date1, 
				date2, DateFilter.InternalAttribute.LAST_CHANGE);

		Object obj = deserialize(serializeObject(nf1));
		assertTrue(obj instanceof DateFilter);
		DateFilter nf2 = (DateFilter)obj;
		assertEquals(nf1.getFilterValue1(), nf2.getFilterValue1());
		assertEquals(nf1.getFilterValue2(), nf2.getFilterValue2());
		assertEquals(nf1.getOperator(), nf2.getOperator());
		assertEquals(nf1.getAttribute(), nf2.getAttribute());
	}
}
