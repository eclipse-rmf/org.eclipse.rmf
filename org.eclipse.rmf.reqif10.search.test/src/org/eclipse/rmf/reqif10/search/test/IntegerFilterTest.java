package org.eclipse.rmf.reqif10.search.test;

import java.math.BigInteger;
import java.util.Set;

import org.eclipse.rmf.reqif10.AttributeDefinitionInteger;
import org.eclipse.rmf.reqif10.AttributeValueInteger;
import org.eclipse.rmf.reqif10.DatatypeDefinitionInteger;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.search.filter.IFilter;
import org.eclipse.rmf.reqif10.search.filter.IFilter.Operator;
import org.eclipse.rmf.reqif10.search.filter.NumberFilter;
import org.junit.Before;
import org.junit.Test;

public class IntegerFilterTest extends AbstractFilterTest {

	
	private AttributeDefinitionInteger attributeDefinition;

	
	
	@Before
	public void setUp(){
		createFixture(new BigInteger("1"));
	}
	
	
	@Test
	public void testIs() throws Exception {
		NumberFilter filter;
		
		filter = new NumberFilter(Operator.IS, BigInteger.ONE, null, attributeDefinition);
		doMatch(filter, true);
		
		filter = new NumberFilter(Operator.IS, BigInteger.ZERO, null, attributeDefinition);
		doMatch(filter, false);
	}
	
	@Test
	public void testIsNot() throws Exception {
		NumberFilter filter;
		
		filter = new NumberFilter(Operator.IS_NOT, new BigInteger("0"), null, attributeDefinition);
		doMatch(filter, true);
		
		filter = new NumberFilter(Operator.IS_NOT, BigInteger.ONE, null, attributeDefinition);
		doMatch(filter, false);
	}
	
	@Test
	public void testBetween() throws Exception {
		NumberFilter filter;
		
		filter = new NumberFilter(Operator.BETWEEN, new BigInteger("0"), new BigInteger("2"), attributeDefinition);
		doMatch(filter, true);
		
		filter = new NumberFilter(Operator.BETWEEN, new BigInteger("0"), new BigInteger("1"), attributeDefinition);
		doMatch(filter, true);
		
		filter = new NumberFilter(Operator.BETWEEN, new BigInteger("1"), new BigInteger("2"), attributeDefinition);
		doMatch(filter, true);
		
		filter = new NumberFilter(Operator.BETWEEN, new BigInteger("2"), new BigInteger("3"), attributeDefinition);
		doMatch(filter, false);
		
		filter = new NumberFilter(Operator.BETWEEN, new BigInteger("3"), new BigInteger("0"), attributeDefinition);
		doMatch(filter, false);
	}
	
	@Test
	public void testGreater() throws Exception {
		NumberFilter filter;
		
		filter = new NumberFilter(Operator.GREATER, new BigInteger("0"), null, attributeDefinition);
		doMatch(filter, true);
		
		filter = new NumberFilter(Operator.GREATER, new BigInteger("1"), null, attributeDefinition);
		doMatch(filter, true);
		
		filter = new NumberFilter(Operator.GREATER, new BigInteger("2"), null, attributeDefinition);
		doMatch(filter, false);
		
		filter = new NumberFilter(Operator.GREATER, new BigInteger("0"), new BigInteger("2"), attributeDefinition);
		doMatch(filter, true);
	}
	
	
	@Test
	public void testSmaller() throws Exception {
		NumberFilter filter;
		
		filter = new NumberFilter(Operator.SMALLER, new BigInteger("2"), null, attributeDefinition);
		doMatch(filter, true);
		
		filter = new NumberFilter(Operator.SMALLER, new BigInteger("1"), null, attributeDefinition);
		doMatch(filter, true);
		
		filter = new NumberFilter(Operator.SMALLER, new BigInteger("0"), null, attributeDefinition);
		doMatch(filter, false);
		
		filter = new NumberFilter(Operator.SMALLER, new BigInteger("0"), new BigInteger("2"), attributeDefinition);
		doMatch(filter, false);
	}
	
	
	
	@Override
	public IFilter createFilterInstance(Operator operator) {
		return new NumberFilter(operator, BigInteger.ZERO, null, attributeDefinition);
	}
	


	@Override
	public void doEmptyTest() throws Exception {
		NumberFilter filter;
		
		filter = new NumberFilter(Operator.IS, new BigInteger("0"), null, attributeDefinition);
		doMatch(filter, false);
		
		filter = new NumberFilter(Operator.IS_NOT, new BigInteger("10"), null, attributeDefinition);
		doMatch(filter, true);
		
		filter = new NumberFilter(Operator.BETWEEN, new BigInteger("0"), new BigInteger("10"), attributeDefinition);
		doMatch(filter, false);
		
		filter = new NumberFilter(Operator.GREATER, new BigInteger("0"), null, attributeDefinition);
		doMatch(filter, false);
		
		filter = new NumberFilter(Operator.SMALLER, new BigInteger("0"), null, attributeDefinition);
		doMatch(filter, false);
	}


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
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.getValues().add(attributeValue);
		
		setFixture(specObject);
	}


	@Override
	public Set<Operator> getSupportedOperators() {
		return NumberFilter.SUPPORTED_OPERATORS;
	}

}