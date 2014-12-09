package org.eclipse.rmf.reqif10.search.test;

import java.io.IOException;
import java.util.GregorianCalendar;

import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.junit.Test;

public class StringFilterDefaultValueTest extends StringFilterTest {

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
		String theValue = (String) value;
		
		attributeDefinition = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		attributeDefinition.setIdentifier("AD_ID0");
		DatatypeDefinitionString definition = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionString();
		definition.setIdentifier("DD_ID0");
		attributeDefinition.setType(definition);
		
		AttributeValueString attributeValue = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValue.setDefinition(attributeDefinition);
		attributeValue.setTheValue(theValue);
		attributeDefinition.setDefaultValue(attributeValue);

		SpecObjectType specObjectType = ReqIF10Factory.eINSTANCE.createSpecObjectType();
		specObjectType.getSpecAttributes().add(attributeDefinition);
		
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.setType(specObjectType);
		specObject.setLastChange(new GregorianCalendar(2014, 12, 03));
		specObject.setIdentifier("THE_SPECOBJECT_ID");
		specObject.setDesc("THE_SPECOBJECT_DESC");
		specObject.setLongName("THE_SPECOBJECT_LONG_NAME");
		
		try {
			dumpEObjectToConsole(attributeDefinition);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		setFixture(specObject);

	}
	
	
}
