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

import java.math.BigInteger;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Set;

import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.EmbeddedValue;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.search.filter.EnumFilter;
import org.eclipse.rmf.reqif10.search.filter.IFilter;
import org.eclipse.rmf.reqif10.search.filter.IFilter.Operator;
import org.junit.Before;
import org.junit.Test;

public class EnumFilterTest extends AbstractFilterTest{

	AttributeDefinitionEnumeration attributeDefinition;
	private LinkedList<EnumValue> specifiedValues;
	
	@Before
	public void setUp(){
		specifiedValues = new LinkedList<EnumValue>();
		specifiedValues.add(createEnumValue(1));
		specifiedValues.add(createEnumValue(2));
		specifiedValues.add(createEnumValue(3));
		
		createFixture(specifiedValues);
	}
	
	
	@Test
	public void testEquals() throws Exception {
		EnumFilter filter;
		LinkedList<EnumValue> testValues = new LinkedList<EnumValue>();
		testValues.addAll(specifiedValues);
		
		createFixture(testValues);
		filter = new EnumFilter(Operator.EQUALS, specifiedValues, attributeDefinition);
		doMatch(filter, true);
		
		testValues.clear();
		testValues.add(specifiedValues.get(2));
		testValues.add(specifiedValues.get(0));
		testValues.add(specifiedValues.get(1));
		createFixture(testValues);
		filter = new EnumFilter(Operator.EQUALS, specifiedValues, attributeDefinition);
		doMatch(filter, true);
		
		testValues.removeFirst();
		createFixture(testValues);
		filter = new EnumFilter(Operator.EQUALS, specifiedValues, attributeDefinition);
		doMatch(filter, false);
		
		createFixture(specifiedValues);
		filter = new EnumFilter(Operator.EQUALS, testValues, attributeDefinition);
		doMatch(filter, false);
		
		testValues.clear();
		testValues.addAll(specifiedValues);
		testValues.addAll(specifiedValues);
		createFixture(specifiedValues);
		filter = new EnumFilter(Operator.EQUALS, testValues, attributeDefinition);
		doMatch(filter, true);
	}
	
	@Test
	public void testNotEquals() throws Exception {
		EnumFilter filter;
		LinkedList<EnumValue> testValues = new LinkedList<EnumValue>();
		testValues.addAll(specifiedValues);
		
		createFixture(testValues);
		filter = new EnumFilter(Operator.NOT_EQUALS, specifiedValues, attributeDefinition);
		doMatch(filter, false);
		
		testValues.removeFirst();
		createFixture(testValues);
		filter = new EnumFilter(Operator.NOT_EQUALS, specifiedValues, attributeDefinition);
		doMatch(filter, true);
		
		createFixture(specifiedValues);
		filter = new EnumFilter(Operator.NOT_EQUALS, testValues, attributeDefinition);
		doMatch(filter, true);
	}
	
	
	@Test
	public void testContainsAll() throws Exception {
		EnumFilter filter;
				
		createFixture(specifiedValues);
		filter = new EnumFilter(Operator.CONTAINS_ALL, specifiedValues, attributeDefinition);
		doMatch(filter, true);
		
		createFixture(specifiedValues);
		LinkedList<EnumValue> testValues = new LinkedList<EnumValue>();
		testValues.add(specifiedValues.get(0));
		filter = new EnumFilter(Operator.CONTAINS_ALL, specifiedValues, attributeDefinition);
		doMatch(filter, true);
		
		testValues.add(specifiedValues.get(2));
		filter = new EnumFilter(Operator.CONTAINS_ALL, specifiedValues, attributeDefinition);
		doMatch(filter, true);
		
		testValues.add(specifiedValues.get(1));
		filter = new EnumFilter(Operator.CONTAINS_ALL, specifiedValues, attributeDefinition);
		doMatch(filter, true);
		
		testValues.clear();
		testValues.add(specifiedValues.getFirst());
		createFixture(testValues);
		filter = new EnumFilter(Operator.CONTAINS_ALL, specifiedValues, attributeDefinition);
		doMatch(filter, false);
	}
	
	@Test
	public void testContainsAny() throws Exception {
		EnumFilter filter;
		
		createFixture(specifiedValues);
		filter = new EnumFilter(Operator.CONTAINS_ANY, specifiedValues, attributeDefinition);
		doMatch(filter, true);
		
		LinkedList<EnumValue> testValues = new LinkedList<EnumValue>();
		testValues.add(specifiedValues.get(1));
		createFixture(testValues);
		filter = new EnumFilter(Operator.CONTAINS_ANY, specifiedValues, attributeDefinition);
		doMatch(filter, true);
		
		LinkedList<EnumValue> testValues2 = new LinkedList<EnumValue>();
		testValues2.add(specifiedValues.get(0));
		createFixture(testValues);
		filter = new EnumFilter(Operator.CONTAINS_ANY, testValues2, attributeDefinition);
		doMatch(filter, false);
	}
	

	@Override
	public void doEmptyTest() throws Exception {
		EnumFilter filter;
		LinkedList<EnumValue> emptyList = new LinkedList<EnumValue>();
		
		filter = new EnumFilter(Operator.EQUALS, specifiedValues, attributeDefinition);
		doMatch(filter, false);
		filter = new EnumFilter(Operator.EQUALS, emptyList, attributeDefinition);
		doMatch(filter, true);
		
		filter = new EnumFilter(Operator.NOT_EQUALS, specifiedValues, attributeDefinition);
		doMatch(filter, true);
		filter = new EnumFilter(Operator.NOT_EQUALS, emptyList, attributeDefinition);
		doMatch(filter, false);
		
		filter = new EnumFilter(Operator.CONTAINS_ALL, specifiedValues, attributeDefinition);
		doMatch(filter, false);
		filter = new EnumFilter(Operator.CONTAINS_ALL, emptyList, attributeDefinition);
		doMatch(filter, true);
		
		filter = new EnumFilter(Operator.CONTAINS_ANY, specifiedValues, attributeDefinition);
		doMatch(filter, false);
		filter = new EnumFilter(Operator.CONTAINS_ANY, emptyList, attributeDefinition);
		doMatch(filter, true);
		
	}
	
		
	@Override
	public Set<Operator> getSupportedOperators() {
		return EnumFilter.SUPPORTED_OPERATORS;
	}

	@Override
	public IFilter createFilterInstance(Operator operator) {
		return new EnumFilter(operator, specifiedValues, attributeDefinition);
	}


	@SuppressWarnings("unchecked")
	@Override
	public void createFixture(Object values) {
		if (specifiedValues == null){
			throw new NullPointerException();
		}
		
		Collection<EnumValue> enumValues = null;
		if (values instanceof Collection<?>) {
			enumValues = (Collection<EnumValue>) values;
		}else if (values != null){
			throw new IllegalArgumentException();
		}
		
		
		attributeDefinition = ReqIF10Factory.eINSTANCE.createAttributeDefinitionEnumeration();
		attributeDefinition.setIdentifier("AD_ID0");
		DatatypeDefinitionEnumeration definition = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionEnumeration();
		definition.setIdentifier("DD_ID0");
		definition.getSpecifiedValues().addAll(specifiedValues);
		attributeDefinition.setType(definition);
		
		AttributeValueEnumeration attributeValue = ReqIF10Factory.eINSTANCE.createAttributeValueEnumeration();
		attributeValue.setDefinition(attributeDefinition);
		if (enumValues != null){
			attributeValue.getValues().addAll(enumValues);
		}
		
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.getValues().add(attributeValue);
		
		setFixture(specObject);
	}

	/*
	 * Constructs an enumValue
	 * 
	 * The id and embeddedValue is derived from the number parameter, hence only numbers should be given 
	 */
	private EnumValue createEnumValue(Integer number){
		EnumValue enumValue = ReqIF10Factory.eINSTANCE.createEnumValue();
		enumValue.setIdentifier("ENUMVALUE_" + number);
		EmbeddedValue embeddedValue = ReqIF10Factory.eINSTANCE.createEmbeddedValue();
		embeddedValue.setKey(new BigInteger(number.toString()));
		embeddedValue.setOtherContent(number.toString());
		enumValue.setProperties(embeddedValue);
		
		return enumValue;
	}

}
