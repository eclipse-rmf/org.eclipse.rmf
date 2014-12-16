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

import org.eclipse.rmf.reqif10.AttributeValueInteger;
import org.eclipse.rmf.reqif10.DatatypeDefinitionInteger;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecObject;
import org.junit.Test;

public class IntegerFilterDefaultsTest extends IntegerFilterTest {

	@Test
	public void testOnEmptyAttribute() throws Exception {
		// Do nothing, since this test will fall back on default values 
	}
	
	/**
	 * Sets the value as the defaultValue.
	 * No value is set on the specObject
	 * All test from super class should then pass using the default value of the attribute 
	 */
	@Override
	public void createFixture(Object value) {
		BigInteger theValue = (BigInteger) value;
		
		attributeDefinition = ReqIF10Factory.eINSTANCE.createAttributeDefinitionInteger();
		attributeDefinition.setIdentifier("AD_ID0");
		DatatypeDefinitionInteger definition = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionInteger();
		definition.setIdentifier("DD_ID0");
		
		attributeDefinition.setType(definition);
		AttributeValueInteger attributeValue = ReqIF10Factory.eINSTANCE.createAttributeValueInteger();
		attributeValue.setDefinition(attributeDefinition);
		attributeValue.setTheValue(theValue);
		attributeDefinition.setDefaultValue(attributeValue);
		
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		createSpecObjectType(specObject, attributeDefinition);
		
		setFixture(specObject);
	}

	@Override
	public void testIsSet() throws Exception {
		// super would fail because of the changed fixture
	}

	@Override
	public void testIsNotSet() throws Exception {
		// super would fail because of the changed fixture
	}
	
}
