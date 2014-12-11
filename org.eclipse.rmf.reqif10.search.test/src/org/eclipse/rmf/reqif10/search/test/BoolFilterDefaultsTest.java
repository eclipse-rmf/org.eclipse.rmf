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

import org.eclipse.rmf.reqif10.AttributeValueBoolean;
import org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.junit.Test;

public class BoolFilterDefaultsTest extends BoolFilterTest {

	
	@Test
	public void testOnEmptyAttribute() throws Exception {
		// Do nothing, since this test will fall back on default values 
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
		attributeDefinition.setDefaultValue(attributeValue);
		
		SpecObjectType specObjectType = ReqIF10Factory.eINSTANCE.createSpecObjectType();
		specObjectType.getSpecAttributes().add(attributeDefinition);
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.setType(specObjectType);
		
		setFixture(specObject);
	}

}
