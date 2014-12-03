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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.rmf.reqif10.AttributeDefinitionBoolean;
import org.eclipse.rmf.reqif10.AttributeValueBoolean;
import org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.pror.testframework.AbstractItemProviderTest;
import org.eclipse.rmf.reqif10.search.filter.BoolFilter;
import org.eclipse.rmf.reqif10.search.filter.IFilter.Operator;
import org.junit.Test;

public class BoolFilterTest extends AbstractItemProviderTest {

	
	private AttributeDefinitionBoolean attributeDefinitionBool;

	@Test
	public void testBoolean() throws Exception {
		attributeDefinitionBool = createAttributeDefinitionBoolean("AD_Bool_ID");
		SpecObject specObject = createSpecObjectWithBool("X", true, attributeDefinitionBool);
		
		BoolFilter boolFilter = new BoolFilter(Operator.IS, true, attributeDefinitionBool);
		assertTrue(boolFilter.match(specObject));
		
		boolFilter = new BoolFilter(Operator.IS, false, attributeDefinitionBool);
		assertFalse(boolFilter.match(specObject));
		
		specObject = createSpecObjectWithBool("X", false, attributeDefinitionBool);
		boolFilter = new BoolFilter(Operator.IS, false, attributeDefinitionBool);
		assertTrue(boolFilter.match(specObject));
	}
	
	/* A match on a specObject that does not contain this attribute should always return false
	 * 
	 */
	@Test
	public void testEmpty() throws Exception {
		attributeDefinitionBool = createAttributeDefinitionBoolean("AD_Bool_ID");
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		
		BoolFilter boolFilter = new BoolFilter(Operator.IS, false, attributeDefinitionBool);
		assertFalse(boolFilter.match(specObject));
		
		boolFilter = new BoolFilter(Operator.IS, true, attributeDefinitionBool);
		assertFalse(boolFilter.match(specObject));
	}

	
	
	AttributeDefinitionBoolean createAttributeDefinitionBoolean(String id) {
		AttributeDefinitionBoolean ad = ReqIF10Factory.eINSTANCE
				.createAttributeDefinitionBoolean();
		ad.setIdentifier(id);
		return ad;
	}
	
	
	DatatypeDefinitionBoolean createDatatypeDefinitionBoolean(String id) {
		DatatypeDefinitionBoolean dd = ReqIF10Factory.eINSTANCE
				.createDatatypeDefinitionBoolean();
		dd.setIdentifier(id);
		return dd;
	}
	

	AttributeValueBoolean createAttributeValueBoolean(Boolean theValue) {
		AttributeValueBoolean av = ReqIF10Factory.eINSTANCE
				.createAttributeValueBoolean();
		av.setTheValue(theValue);
		return av;
	}

		
	SpecObject createSpecObject(String id) {
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.setIdentifier(id);
		return specObject;
	}

	SpecObject createSpecObjectWithBool(String id, Boolean value,
			AttributeDefinitionBoolean attributeDefinition) {
		DatatypeDefinitionBoolean definition = createDatatypeDefinitionBoolean("DD_INT_ID");
		attributeDefinition.setType(definition);
		AttributeValueBoolean attributeValue = createAttributeValueBoolean(value);
		attributeValue.setDefinition(attributeDefinition);
		SpecObject specObject = createSpecObject(id);
		specObject.getValues().add(attributeValue);
		return specObject;
	}
	
	

}