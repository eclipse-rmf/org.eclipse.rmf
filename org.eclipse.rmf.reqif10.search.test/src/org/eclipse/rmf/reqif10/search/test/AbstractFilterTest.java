/*******************************************************************************
 * Copyright (c) 2014 Formal Mind GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ingo Weigelt - initial API and implementation
 ******************************************************************************/



package org.eclipse.rmf.reqif10.search.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.pror.testframework.AbstractItemProviderTest;
import org.eclipse.rmf.reqif10.search.filter.AbstractAttributeFilter;
import org.eclipse.rmf.reqif10.search.filter.IFilter;
import org.eclipse.rmf.reqif10.search.filter.IFilter.Operator;
import org.junit.Test;

public abstract class AbstractFilterTest extends AbstractItemProviderTest {

	static Map<Operator, Integer> operatorCounts = new HashMap<Operator, Integer>();

	/**
	 * The fixture for this Identifiable test case.
	 */
	protected SpecElementWithAttributes fixture = null;

	/**
	 * Sets the fixture for this Identifiable test case.
	 */
	protected void setFixture(SpecElementWithAttributes fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Identifiable test case.
	 */
	protected SpecElementWithAttributes getFixture() {
		return fixture;
	}
	
	
	/**
	 * runs the filters matcher against the fixture
	 * @param filter
	 * @param expected
	 */
	public void doMatch(IFilter filter, boolean expected){
		Integer c = operatorCounts.get(filter.getOperator());
		c = (c == null ? 1 : ++c);
		operatorCounts.put(filter.getOperator(), c);
		
		//System.out.println("runnging Filter:");
		System.out.println(filter.toString());
		
		if (filter instanceof AbstractAttributeFilter) {
			AbstractAttributeFilter new_name = (AbstractAttributeFilter) filter;
			//System.out.println(new_name.getFilterValue1AsString());
			
		}
		//System.out.println(filter.getFilterValue1());
		
		assertEquals(expected, filter.match(getFixture()));
	}
	
	
	@Test
	public void testExceptionsUnsupportedOperation() throws Exception {
		if (getSupportedOperators() == null)
			fail("getSupportedOperators returned null");
		
		for (Operator operator : Operator.values()) {
			if (getSupportedOperators().contains(operator)){
				continue;
			}
			
			Exception exception = null;
			try{
				createFilterInstance(operator);
			}catch (Exception e){
				exception = e;
			}
			assertTrue(operator.toString() + " should not be supported", exception != null);
			assertTrue(exception instanceof IllegalArgumentException);
			assertTrue(exception.getMessage().contains(operator.toString()));
		}
	}

	public abstract Set<Operator> getSupportedOperators();

	public abstract IFilter createFilterInstance(Operator operator);
	
		
	@Test
	public void testOnEmptyAttribute() throws Exception {
		getFixture().getValues().clear();
		doEmptyTest();
	}
	
	@Test
	public void testOnNullValue() throws Exception {
		createFixture(null);
		doEmptyTest();
	}

	/**
	 * this test defines a filters behavior if a match is run against an empty value
	 * 
	 * it will be called two times: 
	 *  on a specObject in which the attribute is not set at all
	 *  on a specObject in which the attribute is set, but theValue is null
	 * 
	 * @throws Exception
	 */
	public abstract void doEmptyTest() throws Exception;
	
	
	public abstract void createFixture(Object object);
	
	
	/**
	 * create a specObjectType, adds the give attributeDefinition and sets it as the type of the specObject
	 * 
	 * @param specObject
	 */
	protected void createSpecObjectType(SpecObject specObject, AttributeDefinition attributeDefinition){
		SpecObjectType specObjectType = ReqIF10Factory.eINSTANCE.createSpecObjectType();
		specObjectType.getSpecAttributes().add(attributeDefinition);
		specObject.setType(specObjectType);
		
	}
}
