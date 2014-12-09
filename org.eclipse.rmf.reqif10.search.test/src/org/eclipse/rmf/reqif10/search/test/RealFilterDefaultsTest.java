package org.eclipse.rmf.reqif10.search.test;

import org.eclipse.rmf.reqif10.AttributeValueReal;
import org.eclipse.rmf.reqif10.DatatypeDefinitionReal;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.junit.Test;

public class RealFilterDefaultsTest extends RealFilterTest {

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
		
		attributeDefinition.setDefaultValue(attributeValue);
		
		SpecObjectType specObjectType = ReqIF10Factory.eINSTANCE.createSpecObjectType();
		specObjectType.getSpecAttributes().add(attributeDefinition);
		
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		
		setFixture(specObject);
	}

}
