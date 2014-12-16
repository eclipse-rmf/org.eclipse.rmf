package org.eclipse.rmf.reqif10.search.test;

import java.util.Collection;

import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecObject;
import org.junit.Test;

public class EnumFilterDefaultsTest extends EnumFilterTest {


	@Test
	public void testOnEmptyAttribute() {
		// Do nothing, since this test will fall back on default values 
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
