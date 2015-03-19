package org.eclipse.rmf.reqif10.search.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Set;

import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.search.filter.AbstractTextFilter;
import org.eclipse.rmf.reqif10.search.filter.AbstractTextFilter.InternalAttribute;
import org.eclipse.rmf.reqif10.search.filter.IFilter;
import org.eclipse.rmf.reqif10.search.filter.IFilter.Operator;
import org.eclipse.rmf.reqif10.search.filter.StringFilter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class StringFilterInternalTest extends AbstractFilterTest {

	@Parameters
	public static Collection<Object[]> data() {
				
		/*
		 * AbstractTextFilter.InternalAttribute.DESC => THE_SPECOBJECT_DESC
		 * AbstractTextFilter.InternalAttribute.IDENTIFIER  => THE_SPECOBJECT_ID
		 * AbstractTextFilter.InternalAttribute.LONG_NAME => THE_SPECOBJECT_LONG_NAME
		 *
		 * Operator, FilterValue, Attribute, expectedResult
		 * 
		 */
		
		
		HashMap<InternalAttribute, String> values = new HashMap<AbstractTextFilter.InternalAttribute, String>();
		values.put(AbstractTextFilter.InternalAttribute.DESC, "THE_SPECOBJECT_DESC");
		values.put(AbstractTextFilter.InternalAttribute.IDENTIFIER, "THE_SPECOBJECT_ID");
		values.put(AbstractTextFilter.InternalAttribute.LONG_NAME, "THE_SPECOBJECT_LONG_NAME");
		
		
		ArrayList<Object[]> testData = new ArrayList<Object[]>();
		 
		for (AbstractTextFilter.InternalAttribute attribute : values.keySet()) {
			// match the value on the value
			testData.add(new Object[] { 
					IFilter.Operator.EQUALS, values.get(attribute), attribute, true,
					true });
			testData.add(new Object[] { 
					IFilter.Operator.NOT_EQUALS, values.get(attribute), attribute, true,
					false });
			
			// match the value on the value.toLowerCase and caseInSensitive
			testData.add(new Object[] { 
					IFilter.Operator.EQUALS, values.get(attribute).toLowerCase(), attribute, false,
					true });
			testData.add(new Object[] { 
					IFilter.Operator.NOT_EQUALS, values.get(attribute).toLowerCase(), attribute, false,
					false });
			
			// match the value on the value.toLowerCase and caseSensitive
			testData.add(new Object[] { 
					IFilter.Operator.EQUALS, values.get(attribute).toLowerCase(), attribute, true,
					false });
			testData.add(new Object[] { 
					IFilter.Operator.NOT_EQUALS, values.get(attribute).toLowerCase(), attribute, true,
					true });
			
			
			testData.add(new Object[] { 
					IFilter.Operator.CONTAINS, "THE_", attribute, true,
					true });
			testData.add(new Object[] { 
					IFilter.Operator.CONTAINS, "THE_", attribute, false,
					true });
			testData.add(new Object[] { 
					IFilter.Operator.CONTAINS, "the_", attribute, true,
					false });
			
			
			testData.add(new Object[] { 
					IFilter.Operator.NOT_CONTAINS, "E", attribute, true,
					false });
			testData.add(new Object[] { 
					IFilter.Operator.NOT_CONTAINS, "e", attribute, false,
					false });
			testData.add(new Object[] { 
					IFilter.Operator.NOT_CONTAINS, "XXX", attribute, true,
					true });
			
			testData.add(new Object[] { 
					IFilter.Operator.REGEXP, ".*E.*", attribute, true,
					true });
			testData.add(new Object[] { 
					IFilter.Operator.REGEXP, ".*e.*", attribute, false,
					true });
			testData.add(new Object[] { 
					IFilter.Operator.REGEXP, ".*e.*", attribute, true,
					false });
			
		}
		
		
		return testData;

	}
	
	Operator operator;
	String filterValue;
	AbstractTextFilter.InternalAttribute attribute;
	boolean caseSensitive;
	boolean expectedResult;
	
	
	
	public StringFilterInternalTest(Operator operator, String filterValue, AbstractTextFilter.InternalAttribute attribute, Boolean caseSensitive, Boolean expectedResult) {
		this.operator = operator;
		this.filterValue = filterValue;
		this.attribute = attribute;
		this.expectedResult = expectedResult;
		this.caseSensitive = caseSensitive;
	}

	
	@Test
	public void testFilter() throws Exception {
		System.out.println("running " +  this.operator + " " + this.filterValue + " on " + attribute + "expecting " + expectedResult);
		
		StringFilter filter = new StringFilter(operator, filterValue, attribute, caseSensitive);
		doMatch(filter, expectedResult);
	}

	
	
	@Before
	public void setUp(){
		createFixture("abcDEF");
	}
	
	@Override
	public void createFixture(Object value) {
		String theValue = (String) value;
		
		AttributeDefinitionString attributeDefinition = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		attributeDefinition.setIdentifier("AD_ID0");
		DatatypeDefinitionString definition = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionString();
		definition.setIdentifier("DD_ID0");
		attributeDefinition.setType(definition);
		AttributeValueString attributeValue = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValue.setDefinition(attributeDefinition);
		attributeValue.setTheValue(theValue);
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.getValues().add(attributeValue);
		specObject.setLastChange(new GregorianCalendar(2014, 12, 03));
		specObject.setIdentifier("THE_SPECOBJECT_ID");
		specObject.setDesc("THE_SPECOBJECT_DESC");
		specObject.setLongName("THE_SPECOBJECT_LONG_NAME");
		
		createSpecObjectType(specObject, attributeDefinition);
		
		setFixture(specObject);
	}
	
	
	

	@Override
	public Set<Operator> getSupportedOperators() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public IFilter createFilterInstance(Operator operator) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void doEmptyTest() throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public void testExceptionsUnsupportedOperation() throws Exception {
		
	}

}
