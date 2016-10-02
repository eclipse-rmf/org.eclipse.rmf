package org.eclipse.rmf.reqif10.search.test;

import java.util.GregorianCalendar;
import java.util.Set;

import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.search.filter.ReqIFFullFilter;
import org.eclipse.rmf.reqif10.search.filter.ReqIFFullFilter.Operator;
import org.eclipse.rmf.reqif10.search.filter.StringFilter;
import org.junit.Test;

public class AttributeTest extends AbstractFilterTest{

	private AttributeDefinitionString attributeDefinition;

	
	@Test
	public void testIsSet() throws Exception {
		StringFilter filter;
		
		// The attribute is defined and a value is set
		createFixture("test", true);
		filter = new StringFilter(ReqIFFullFilter.Operator.IS_SET, "", attributeDefinition, false);
		doMatch(filter, true);
		
		// The attribute is defined and the value is null
		createFixture(null, true);
		filter = new StringFilter(ReqIFFullFilter.Operator.IS_SET, "", attributeDefinition, false);
		doMatch(filter, false);
		
		// The attribute is not defined
		createFixture(null, false);
		filter = new StringFilter(ReqIFFullFilter.Operator.IS_SET, "", attributeDefinition, false);
		doMatch(filter, false);
	}
	
	@Test
	public void testIsNotSet() throws Exception {
		/* is not set: return true only if the attribute exisits, but is not set (irrespective of default value).
		 */
		StringFilter filter;
		
		// The attribute is defined and a value is set
		createFixture("test", true);
		filter = new StringFilter(ReqIFFullFilter.Operator.IS_NOT_SET, "", attributeDefinition, false);
		doMatch(filter, false);
		
		// The attribute is defined and the value is null
		createFixture(null, true);
		filter = new StringFilter(ReqIFFullFilter.Operator.IS_NOT_SET, "", attributeDefinition, false);
		doMatch(filter, true);

		// The attribute is not defined
		createFixture(null, false);
		filter = new StringFilter(ReqIFFullFilter.Operator.IS_NOT_SET, "", attributeDefinition, false);
		doMatch(filter, false);
		
	}
	
	
	public void createFixture(Object value, boolean withAttribute) {
		String theValue = (String) value;
		
		attributeDefinition = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		attributeDefinition.setIdentifier("AD_ID0");
		DatatypeDefinitionString definition = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionString();
		definition.setIdentifier("DD_ID0");
		attributeDefinition.setType(definition);
		
		AttributeValueString attributeValue = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValue.setDefinition(attributeDefinition);
		if (value != null){
			attributeValue.setTheValue(theValue);
		}
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.getValues().add(attributeValue);
		specObject.setLastChange(new GregorianCalendar(2014, 12, 03));
		specObject.setIdentifier("THE_SPECOBJECT_ID");
		specObject.setDesc("THE_SPECOBJECT_DESC");
		specObject.setLongName("THE_SPECOBJECT_LONG_NAME");
		
		SpecObjectType specObjectType = ReqIF10Factory.eINSTANCE.createSpecObjectType();
		if (withAttribute){
			specObjectType.getSpecAttributes().add(attributeDefinition);
		}
		specObject.setType(specObjectType);
		
		setFixture(specObject);
	}
	
	@Override
	public void createFixture(Object value) {
		createFixture(value, true);
	}

	@Override
	public Set<Operator> getSupportedOperators() {
		return StringFilter.SUPPORTED_OPERATORS;
	}

	@Override
	public ReqIFFullFilter createFilterInstance(Operator operator) {
		return new StringFilter(operator, "", attributeDefinition, true);
	}

	@Override
	public void doEmptyTest() throws Exception {
		// Do nothing
	}
	
	@Override
	public void testOnEmptyAttribute() throws Exception {
		// Do nothing
	}

}
