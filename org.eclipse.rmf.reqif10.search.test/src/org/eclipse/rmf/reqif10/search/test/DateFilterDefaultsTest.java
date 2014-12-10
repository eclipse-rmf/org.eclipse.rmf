package org.eclipse.rmf.reqif10.search.test;

import java.util.GregorianCalendar;

import org.eclipse.rmf.reqif10.AttributeValueDate;
import org.eclipse.rmf.reqif10.DatatypeDefinitionDate;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.junit.Test;

public class DateFilterDefaultsTest extends DateFilterTest {

	@Test
	public void testOnEmptyAttribute() {
		// Do nothing, since this test will fall back on default values 
	}
	
	
	
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
		attributeDefinition.setDefaultValue(attributeValue);	
		
		SpecObjectType specObjectType = ReqIF10Factory.eINSTANCE.createSpecObjectType();
		specObjectType.getSpecAttributes().add(attributeDefinition);
		
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		//specObject.getValues().add(attributeValue);
		specObject.setLastChange(new GregorianCalendar(2014, 12, 03));
		
		setFixture(specObject);
	}

}
