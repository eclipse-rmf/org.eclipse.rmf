/*******************************************************************************
 * Copyright (c) 2014 Formal Mind GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ingo Weigelt - initial API and implementation
 *     Michael Jastram - adding SUPPORTED_OPERATIONS
 ******************************************************************************/
package org.eclipse.rmf.reqif10.search.test;

import java.util.GregorianCalendar;
import java.util.Set;

import org.eclipse.rmf.reqif10.AttributeDefinitionDate;
import org.eclipse.rmf.reqif10.AttributeValueDate;
import org.eclipse.rmf.reqif10.DatatypeDefinitionDate;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.search.filter.DateFilter;
import org.eclipse.rmf.reqif10.search.filter.DateFilter.InternalAttribute;
import org.eclipse.rmf.reqif10.search.filter.IFilter;
import org.eclipse.rmf.reqif10.search.filter.IFilter.Operator;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DateFilterTest extends AbstractFilterTest{

	SpecObject specObject;
	AttributeDefinitionDate attributeDefinition; 

	@Rule public ExpectedException thrown= ExpectedException.none();
	
	@Override	
	public void createFixture(Object value){
		GregorianCalendar theValue = (GregorianCalendar) value;
		
		attributeDefinition = ReqIF10Factory.eINSTANCE.createAttributeDefinitionDate();
		attributeDefinition.setIdentifier("AD_ID0");
		DatatypeDefinitionDate definition = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionDate();
		definition.setIdentifier("DD_ID0");
		attributeDefinition.setType(definition);
		AttributeValueDate attributeValue = ReqIF10Factory.eINSTANCE.createAttributeValueDate();
		attributeValue.setDefinition(attributeDefinition);
		attributeValue.setTheValue(theValue);
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.getValues().add(attributeValue);
		specObject.setLastChange(new GregorianCalendar(2014, 12, 03));
		
		setFixture(specObject);
	}	
	
	
	@Before
	public void setUp(){
		createFixture(new GregorianCalendar(2014, 12, 03));
	}
	
	
	@Test
	public void testIs() throws Exception {
		DateFilter filter;
			
		filter = new DateFilter(IFilter.Operator.IS, new GregorianCalendar(2014, 12, 03), null,  attributeDefinition);
		doMatch(filter, true);
		
		filter = new DateFilter(IFilter.Operator.IS, new GregorianCalendar(2014, 12, 04), null,  attributeDefinition);
		doMatch(filter, false);

		filter = new DateFilter(IFilter.Operator.IS, new GregorianCalendar(2014,12,03,0,0,0), null,  attributeDefinition);
		doMatch(filter, true);		
	}
	
	
	@Test
	public void testIsOnInternal() throws Exception {
		DateFilter filter;
		
		filter = new DateFilter(IFilter.Operator.IS, new GregorianCalendar(2014, 12, 03), null,  DateFilter.InternalAttribute.LAST_CHANGE);
		doMatch(filter, true);
		
		filter = new DateFilter(IFilter.Operator.IS, new GregorianCalendar(2014, 12, 04), null,  DateFilter.InternalAttribute.LAST_CHANGE);
		doMatch(filter, false);

		filter = new DateFilter(IFilter.Operator.IS, new GregorianCalendar(2014,12,03,0,0,0), null,  DateFilter.InternalAttribute.LAST_CHANGE);
		doMatch(filter, true);
	}
	
	
	@Test
	public void testIsNot() throws Exception {
		DateFilter filter;
		
		filter = new DateFilter(IFilter.Operator.IS_NOT, new GregorianCalendar(2014, 12, 04), null,  attributeDefinition);
		doMatch(filter, true);

		filter = new DateFilter(IFilter.Operator.IS_NOT, new GregorianCalendar(2014, 12, 03), null,  attributeDefinition);
		doMatch(filter, false);
	}
	
	
	@Test
	public void testIsNotOnInternal() throws Exception {
		DateFilter filter;
		
		filter = new DateFilter(IFilter.Operator.IS_NOT, new GregorianCalendar(2014, 12, 04), null,  DateFilter.InternalAttribute.LAST_CHANGE);
		doMatch(filter, true);

		filter = new DateFilter(IFilter.Operator.IS_NOT, new GregorianCalendar(2014, 12, 03), null,  DateFilter.InternalAttribute.LAST_CHANGE);
		doMatch(filter, false);
	}
	

	@Test
	public void testBetween() throws Exception {
		DateFilter filter;
		
		filter = new DateFilter(IFilter.Operator.BETWEEN, new GregorianCalendar(2014, 12, 01), new GregorianCalendar(2014, 12, 04), attributeDefinition);
		doMatch(filter, true);

		filter = new DateFilter(IFilter.Operator.BETWEEN, new GregorianCalendar(2014, 12, 03), new GregorianCalendar(2014, 12, 03), attributeDefinition);
		doMatch(filter, true);
		
		filter = new DateFilter(IFilter.Operator.BETWEEN, new GregorianCalendar(2014, 01, 01), new GregorianCalendar(2014, 12, 01), attributeDefinition);
		doMatch(filter, false);
	}
		
	@Test
	public void testBetweenOnInternal() throws Exception {
		DateFilter filter;
		
		filter = new DateFilter(IFilter.Operator.BETWEEN, new GregorianCalendar(2014, 12, 01), new GregorianCalendar(2014, 12, 04), DateFilter.InternalAttribute.LAST_CHANGE);
		doMatch(filter, true);

		filter = new DateFilter(IFilter.Operator.BETWEEN, new GregorianCalendar(2014, 12, 03), new GregorianCalendar(2014, 12, 03), DateFilter.InternalAttribute.LAST_CHANGE);
		doMatch(filter, true);
		
		filter = new DateFilter(IFilter.Operator.BETWEEN, new GregorianCalendar(2014, 01, 01), new GregorianCalendar(2014, 12, 01), DateFilter.InternalAttribute.LAST_CHANGE);
		doMatch(filter, false);
	}
	
	@Test
	public void testBefore() throws Exception {
		DateFilter filter;
		
		filter = new DateFilter(IFilter.Operator.BEFORE, new GregorianCalendar(2015, 1, 1), new GregorianCalendar(2014, 12, 04), attributeDefinition);
		doMatch(filter, true);

		filter = new DateFilter(IFilter.Operator.BEFORE, new GregorianCalendar(2014, 12, 3), null, attributeDefinition);
		doMatch(filter, false);
		
		filter = new DateFilter(IFilter.Operator.BEFORE, new GregorianCalendar(2014, 1, 1), null, attributeDefinition);
		doMatch(filter, false);
	}
	
	@Test
	public void testBeforeOnInternal(){
		DateFilter filter;
		filter = new DateFilter(IFilter.Operator.BEFORE, new GregorianCalendar(2015, 1, 1), new GregorianCalendar(2014, 12, 04), DateFilter.InternalAttribute.LAST_CHANGE);
		doMatch(filter, true);

		filter = new DateFilter(IFilter.Operator.BEFORE, new GregorianCalendar(2014, 12, 3), null, DateFilter.InternalAttribute.LAST_CHANGE);
		doMatch(filter, false);
		
		filter = new DateFilter(IFilter.Operator.BEFORE, new GregorianCalendar(2014, 1, 1), null, DateFilter.InternalAttribute.LAST_CHANGE);
		doMatch(filter, false);
	}
	
	@Test
	public void testAfter() throws Exception {
		DateFilter filter;
		
		filter = new DateFilter(IFilter.Operator.AFTER, new GregorianCalendar(2000, 1, 1), null, attributeDefinition);
		doMatch(filter, true);

		filter = new DateFilter(IFilter.Operator.AFTER, new GregorianCalendar(3000, 1, 1), null, attributeDefinition);
		doMatch(filter, false);
		
		filter = new DateFilter(IFilter.Operator.AFTER, new GregorianCalendar(2014, 12, 03), null, attributeDefinition);
		doMatch(filter, false);
	}
	
	@Test
	public void testAfterOnInternal() throws Exception {
		DateFilter filter;
		
		filter = new DateFilter(IFilter.Operator.AFTER, new GregorianCalendar(2000, 1, 1), null, DateFilter.InternalAttribute.LAST_CHANGE);
		doMatch(filter, true);

		filter = new DateFilter(IFilter.Operator.AFTER, new GregorianCalendar(3000, 1, 1), null, DateFilter.InternalAttribute.LAST_CHANGE);
		doMatch(filter, false);
		
		filter = new DateFilter(IFilter.Operator.AFTER, new GregorianCalendar(2014, 12, 03), null, DateFilter.InternalAttribute.LAST_CHANGE);
		doMatch(filter, false);
	}
	
	
	
	@Test
	public void testOnEmptyAttribute() {
		getFixture().getValues().clear();
		doEmptyTest();
	}
	
	
	@Test
	public void testOnNullValue() {
		AttributeValueDate attributeValue = (AttributeValueDate) getFixture().getValues().get(0);
		attributeValue.setTheValue(null);
		doEmptyTest();
	}
	
	
	public void doEmptyTest(){
		DateFilter filter;
		
		filter = new DateFilter(IFilter.Operator.IS, new GregorianCalendar(2014, 1, 1), null, attributeDefinition);
		doMatch(filter, false);
		
		filter = new DateFilter(IFilter.Operator.IS_NOT, new GregorianCalendar(2014, 1, 1), null, attributeDefinition);
		doMatch(filter, true);
		
		filter = new DateFilter(IFilter.Operator.BETWEEN, new GregorianCalendar(2014, 1, 1), null, attributeDefinition);
		doMatch(filter, false);
		
		filter = new DateFilter(IFilter.Operator.BEFORE, new GregorianCalendar(2014, 1, 1), null, attributeDefinition);
		doMatch(filter, false);
		
		filter = new DateFilter(IFilter.Operator.AFTER, new GregorianCalendar(2014, 1, 1), null, attributeDefinition);
		doMatch(filter, false);
	}
	
	@Test
	public void testExceptionsAttributeDefinition() throws Exception {
		thrown.expect(IllegalArgumentException.class);
		new DateFilter(IFilter.Operator.BEFORE, new GregorianCalendar(2014, 1, 1), null, (AttributeDefinitionDate) null);
	}
	
	@Test
	public void testExceptionsInternalAttribute() throws Exception {
		thrown.expect(IllegalArgumentException.class);
		new DateFilter(IFilter.Operator.BEFORE, new GregorianCalendar(2014, 1, 1), null, (InternalAttribute) null);
	}
	
	@Override
	public DateFilter createFilterInstance(Operator operator) {
		return new DateFilter(operator, new GregorianCalendar(2014, 1, 1), null, attributeDefinition);
	}

	@Override
	public Set<Operator> getSupportedOperators() {
		return DateFilter.SUPPORTED_OPERATORS;
	}
	
}
