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

import java.util.Set;

import org.eclipse.rmf.reqif10.AttributeDefinitionInteger;
import org.eclipse.rmf.reqif10.AttributeDefinitionReal;
import org.eclipse.rmf.reqif10.AttributeValueReal;
import org.eclipse.rmf.reqif10.DatatypeDefinitionReal;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.search.filter.IFilter;
import org.eclipse.rmf.reqif10.search.filter.IFilter.Operator;
import org.eclipse.rmf.reqif10.search.filter.NumberFilter;
import org.junit.Before;
import org.junit.Test;

public class RealFilterTest extends AbstractFilterTest {

	
	AttributeDefinitionReal attributeDefinition;

	
	
	@Before
	public void setUp(){
		createFixture(new Double("1"));
	}
	
	
	@Test
	public void testIs() throws Exception {
		NumberFilter filter;
		
		filter = new NumberFilter(Operator.IS, new Double("1"), null, attributeDefinition);
		doMatch(filter, true);
		
		filter = new NumberFilter(Operator.IS, new Double("0"), null, attributeDefinition);
		doMatch(filter, false);
	}
	
	@Test
	public void testIsNot() throws Exception {
		NumberFilter filter;
		
		filter = new NumberFilter(Operator.IS_NOT, new Double("0"), null, attributeDefinition);
		doMatch(filter, true);
		
		filter = new NumberFilter(Operator.IS_NOT, new Double("1"), null, attributeDefinition);
		doMatch(filter, false);
	}
	
	@Test
	public void testBetween() throws Exception {
		NumberFilter filter;
		
		filter = new NumberFilter(Operator.BETWEEN, new Double("0"), new Double("2"), attributeDefinition);
		doMatch(filter, true);
		
		filter = new NumberFilter(Operator.BETWEEN, new Double("0"), new Double("1"), attributeDefinition);
		doMatch(filter, true);
		
		filter = new NumberFilter(Operator.BETWEEN, new Double("1"), new Double("2"), attributeDefinition);
		doMatch(filter, true);
		
		filter = new NumberFilter(Operator.BETWEEN, new Double("2"), new Double("3"), attributeDefinition);
		doMatch(filter, false);
		
		filter = new NumberFilter(Operator.BETWEEN, new Double("3"), new Double("0"), attributeDefinition);
		doMatch(filter, false);
	}
	
	@Test
	public void testGreater() throws Exception {
		NumberFilter filter;
		
		filter = new NumberFilter(Operator.GREATER, new Double("0"), null, attributeDefinition);
		doMatch(filter, true);
		
		filter = new NumberFilter(Operator.GREATER, new Double("1"), null, attributeDefinition);
		doMatch(filter, true);
		
		filter = new NumberFilter(Operator.GREATER, new Double("2"), null, attributeDefinition);
		doMatch(filter, false);
		
		filter = new NumberFilter(Operator.GREATER, new Double("0"), new Double("2"), attributeDefinition);
		doMatch(filter, true);
	}
	
	
	@Test
	public void testSmaller() throws Exception {
		NumberFilter filter;
		
		filter = new NumberFilter(Operator.SMALLER, new Double("2"), null, attributeDefinition);
		doMatch(filter, true);
		
		filter = new NumberFilter(Operator.SMALLER, new Double("1"), null, attributeDefinition);
		doMatch(filter, true);
		
		filter = new NumberFilter(Operator.SMALLER, new Double("0"), null, attributeDefinition);
		doMatch(filter, false);
		
		filter = new NumberFilter(Operator.SMALLER, new Double("0"), new Double("2"), attributeDefinition);
		doMatch(filter, false);
	}
	
	
	@Test
	public void testIsSet() throws Exception {
		NumberFilter filter;
		
		filter = new NumberFilter(Operator.IS_SET, new Double("2"), null, attributeDefinition);
		doMatch(filter, true);
		
		AttributeDefinitionReal attributeDefinition2 = ReqIF10Factory.eINSTANCE.createAttributeDefinitionReal();
		attributeDefinition2.setIdentifier("AD_ID1");
		
		filter = new NumberFilter(Operator.IS_SET, new Double("2"), null, attributeDefinition2);
		doMatch(filter, false);
	}
	
	
	@Test
	public void testIsNotSet() throws Exception {
		NumberFilter filter;
		
		filter = new NumberFilter(Operator.IS_NOT_SET, new Double("2"), null, attributeDefinition);
		doMatch(filter, false);
		
		AttributeDefinitionInteger attributeDefinition2 = ReqIF10Factory.eINSTANCE.createAttributeDefinitionInteger();
		attributeDefinition2.setIdentifier("AD_ID1");
		
		filter = new NumberFilter(Operator.IS_NOT_SET, new Double("2"), null, attributeDefinition2);
		doMatch(filter, true);
	}	
	
	
	
	@Override
	public IFilter createFilterInstance(Operator operator) {
		return new NumberFilter(operator, new Double(0), null, attributeDefinition);
	}
	


	@Override
	public void doEmptyTest() throws Exception {
		NumberFilter filter;
		
		filter = new NumberFilter(Operator.IS, new Double("0"), null, attributeDefinition);
		doMatch(filter, false);
		
		filter = new NumberFilter(Operator.IS_NOT, new Double("10"), null, attributeDefinition);
		doMatch(filter, true);
		
		filter = new NumberFilter(Operator.BETWEEN, new Double("0"), new Double("10"), attributeDefinition);
		doMatch(filter, false);
		
		filter = new NumberFilter(Operator.GREATER, new Double("0"), null, attributeDefinition);
		doMatch(filter, false);
		
		filter = new NumberFilter(Operator.SMALLER, new Double("0"), null, attributeDefinition);
		doMatch(filter, false);
	}


	@Override
	public void createFixture(Object value) {
		Double theValue = (Double) value;
		
		attributeDefinition = ReqIF10Factory.eINSTANCE.createAttributeDefinitionReal();
		attributeDefinition.setIdentifier("AD_ID0");
		DatatypeDefinitionReal definition = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionReal();
		definition.setIdentifier("DD_ID0");
		attributeDefinition.setType(definition);
		AttributeValueReal attributeValue = ReqIF10Factory.eINSTANCE.createAttributeValueReal();
		attributeValue.setDefinition(attributeDefinition);
		
		if (theValue != null){
			attributeValue.setTheValue(theValue);
		}
		
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.getValues().add(attributeValue);
		
		createSpecObjectType(specObject, attributeDefinition);
		
		setFixture(specObject);
	}


	@Override
	public Set<Operator> getSupportedOperators() {
		return NumberFilter.SUPPORTED_OPERATORS;
	}

}