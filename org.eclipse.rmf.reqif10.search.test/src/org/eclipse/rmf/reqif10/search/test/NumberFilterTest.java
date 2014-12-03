package org.eclipse.rmf.reqif10.search.test;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.eclipse.rmf.reqif10.AttributeDefinitionInteger;
import org.eclipse.rmf.reqif10.AttributeDefinitionReal;
import org.eclipse.rmf.reqif10.AttributeValueInteger;
import org.eclipse.rmf.reqif10.AttributeValueReal;
import org.eclipse.rmf.reqif10.DatatypeDefinitionInteger;
import org.eclipse.rmf.reqif10.DatatypeDefinitionReal;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.pror.testframework.AbstractItemProviderTest;
import org.eclipse.rmf.reqif10.search.filter.IFilter.Operator;
import org.eclipse.rmf.reqif10.search.filter.NumberFilter;
import org.junit.Test;

public class NumberFilterTest extends AbstractItemProviderTest {

	
	private AttributeDefinitionInteger attributeDefinitionInt;
	private AttributeDefinitionReal attributeDefinitionReal;

	@Test
	public void testInteger() throws Exception {
		attributeDefinitionInt = createAttributeDefinitionInteger("AD_INT_ID");
		SpecObject specObject = createSpecObjectWithInt("X", new BigInteger("1"), attributeDefinitionInt);
		
		NumberFilter numberFilter = new NumberFilter(Operator.EQUALS, BigInteger.ONE, null, attributeDefinitionInt);
		assertTrue(numberFilter.match(specObject));
		
		numberFilter = new NumberFilter(Operator.EQUALS, BigInteger.TEN, null, attributeDefinitionInt);
		assertFalse(numberFilter.match(specObject));
		
		numberFilter = new NumberFilter(Operator.SMALLER, BigInteger.TEN, null, attributeDefinitionInt);
		assertTrue(numberFilter.match(specObject));
		
		numberFilter = new NumberFilter(Operator.GREATER, BigInteger.ZERO, null, attributeDefinitionInt);
		assertTrue(numberFilter.match(specObject));
		
		numberFilter = new NumberFilter(Operator.BETWEEN, BigInteger.ZERO, BigInteger.TEN, attributeDefinitionInt);
		assertTrue(numberFilter.match(specObject));
		
		numberFilter = new NumberFilter(Operator.NOT_EQUALS, BigInteger.ZERO, BigInteger.TEN, attributeDefinitionInt);
		assertTrue(numberFilter.match(specObject));		
	}
	
	
	@Test
	public void testReal() throws Exception {
		attributeDefinitionReal = createAttributeDefinitionReal("AD_REAL_ID");
		SpecObject specObject = createSpecObjectWithReal("R1", new Double("1.0"), attributeDefinitionReal);
		
		NumberFilter numberFilter = new NumberFilter(Operator.EQUALS, new Double("1.0"), null, attributeDefinitionReal);
		assertTrue(numberFilter.match(specObject));
		
	}
	
	
	
	AttributeDefinitionInteger createAttributeDefinitionInteger(String id) {
		AttributeDefinitionInteger ad = ReqIF10Factory.eINSTANCE
				.createAttributeDefinitionInteger();
		ad.setIdentifier(id);
		return ad;
	}
	
	AttributeDefinitionReal createAttributeDefinitionReal(String id) {
		AttributeDefinitionReal ad = ReqIF10Factory.eINSTANCE
				.createAttributeDefinitionReal();
		ad.setIdentifier(id);
		return ad;
	}

	DatatypeDefinitionInteger createDatatypeDefinitionInteger(String id) {
		DatatypeDefinitionInteger dd = ReqIF10Factory.eINSTANCE
				.createDatatypeDefinitionInteger();
		dd.setIdentifier(id);
		return dd;
	}
	
	DatatypeDefinitionReal createDatatypeDefinitionReal(String id) {
		DatatypeDefinitionReal dd = ReqIF10Factory.eINSTANCE
				.createDatatypeDefinitionReal();
		dd.setIdentifier(id);
		return dd;
	}

	AttributeValueInteger createAttributeValueInteger(BigInteger theValue) {
		AttributeValueInteger av = ReqIF10Factory.eINSTANCE
				.createAttributeValueInteger();
		av.setTheValue(theValue);
		return av;
	}

	AttributeValueReal createAttributeValueReal(Double theValue) {
		AttributeValueReal av = ReqIF10Factory.eINSTANCE
				.createAttributeValueReal();
		av.setTheValue(theValue);
		return av;
	}
	
	
	SpecObject createSpecObject(String id) {
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.setIdentifier(id);
		return specObject;
	}

	SpecObject createSpecObjectWithInt(String id, BigInteger value,
			AttributeDefinitionInteger attributeDefinition) {
		DatatypeDefinitionInteger definition = createDatatypeDefinitionInteger("DD_INT_ID");
		attributeDefinition.setType(definition);
		AttributeValueInteger attributeValue = createAttributeValueInteger(value);
		attributeValue.setDefinition(attributeDefinition);
		SpecObject specObject = createSpecObject(id);
		specObject.getValues().add(attributeValue);
		return specObject;
	}
	
	SpecObject createSpecObjectWithReal(String id, Double value,
			AttributeDefinitionReal attributeDefinition) {
		DatatypeDefinitionReal definition = createDatatypeDefinitionReal("DD_REAL_ID");
		attributeDefinition.setType(definition);
		AttributeValueReal attributeValue = createAttributeValueReal(value);
		attributeValue.setDefinition(attributeDefinition);
		SpecObject specObject = createSpecObject(id);
		specObject.getValues().add(attributeValue);
		return specObject;
	}

}