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

import org.eclipse.rmf.reqif10.AttributeDefinitionBoolean;
import org.eclipse.rmf.reqif10.AttributeValueBoolean;
import org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.search.filter.BoolFilter;
import org.eclipse.rmf.reqif10.search.filter.IFilter.Operator;
import org.junit.Before;
import org.junit.Test;

public class BoolFilterTest extends AbstractFilterTest {

	AttributeDefinitionBoolean attributeDefinition;

	@Before
	public void setUp(){
		createFixture(true);
	}
	

	@Test
	public void testIsTrue() throws Exception {
		BoolFilter filter;
		filter = new BoolFilter(Operator.IS, true, attributeDefinition);
		doMatch(filter, true);
		
		filter = new BoolFilter(Operator.IS, false, attributeDefinition);
		doMatch(filter, false);
	}
	
	@Test
	public void testIsFalse() throws Exception {
		createFixture(false);
		
		BoolFilter filter;
		filter = new BoolFilter(Operator.IS, true, attributeDefinition);
		doMatch(filter, false);
		
		filter = new BoolFilter(Operator.IS, false, attributeDefinition);
		doMatch(filter, true);
	}
	

	@Test
	public void testIsSet() throws Exception {
		BoolFilter filter;
		filter = new BoolFilter(Operator.IS_SET, true, attributeDefinition);
		doMatch(filter, true);
		
		AttributeDefinitionBoolean nonExistingAttributeDefinition = ReqIF10Factory.eINSTANCE.createAttributeDefinitionBoolean();
		nonExistingAttributeDefinition.setIdentifier("AD_ID0");
		
		filter = new BoolFilter(Operator.IS, false, nonExistingAttributeDefinition);
		doMatch(filter, false);
	}
	
	
	@Test
	public void testIsNotSet() throws Exception {
		BoolFilter filter;
		filter = new BoolFilter(Operator.IS_NOT_SET, true, attributeDefinition);
		doMatch(filter, false);
		
		AttributeDefinitionBoolean nonExistingAttributeDefinition = ReqIF10Factory.eINSTANCE.createAttributeDefinitionBoolean();
		nonExistingAttributeDefinition.setIdentifier("AD_ID1");
		
		filter = new BoolFilter(Operator.IS_NOT_SET, false, nonExistingAttributeDefinition);
		doMatch(filter, false);
	}	
	
	
	/* 
	 * A match on a specObject that does not contain this attribute should always return false
	 */
	public void doEmptyTest() throws Exception {
		
		BoolFilter filter = new BoolFilter(Operator.IS, true, attributeDefinition);
		doMatch(filter, false);
		
		filter = new BoolFilter(Operator.IS, false, attributeDefinition);
		doMatch(filter, false);
	}	
	
	
		
	public void createFixture(Object value){
		if ((value != null) && ! (value instanceof Boolean)) {
			throw new IllegalArgumentException();	
		}
		
		attributeDefinition = ReqIF10Factory.eINSTANCE.createAttributeDefinitionBoolean();
		attributeDefinition.setIdentifier("AD_ID0");
		DatatypeDefinitionBoolean definition = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionBoolean();
		definition.setIdentifier("DD_ID0");
		attributeDefinition.setType(definition);
		AttributeValueBoolean attributeValue = ReqIF10Factory.eINSTANCE.createAttributeValueBoolean();
		attributeValue.setDefinition(attributeDefinition);
		if (value == null){
			//attributeValue.setTheValue(false);
			// we do nothing here to simulate a non set value
			// attributeValue.isSetTheValue() will return false
		}else{
			attributeValue.setTheValue((Boolean) value);
		}
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.getValues().add(attributeValue);
		
		createSpecObjectType(specObject, attributeDefinition);
		
		setFixture(specObject);
	}


	@Override
	public BoolFilter createFilterInstance(Operator operator) {
		return new BoolFilter(operator, true, attributeDefinition); 
	}


	@Override
	public Set<Operator> getSupportedOperators() {
		return BoolFilter.SUPPORTED_OPERATORS;
	}



	
	
	
	



	

}