package org.eclipse.rmf.reqif10.search.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.rmf.reqif10.AttributeDefinitionBoolean;
import org.eclipse.rmf.reqif10.AttributeValueBoolean;
import org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.search.filter.BoolFilter;
import org.eclipse.rmf.reqif10.search.filter.ReqIFFullFilter;
import org.eclipse.rmf.reqif10.search.filter.ReqIFFullFilter.Operator;
import org.eclipse.rmf.reqif10.search.filter.SimpleCompoundFilter;
import org.junit.Before;
import org.junit.Test;

public class CompoundFilterTest extends AbstractFilterTest {

	private AttributeDefinitionBoolean attributeDefinition1;
	private AttributeDefinitionBoolean attributeDefinition2;
	private AttributeDefinitionBoolean attributeDefinition3;
	private BoolFilter filterTrue1;
	private BoolFilter filterTrue2;
	private BoolFilter filterFalse1;
	private List<ReqIFFullFilter> filters;

	@Before
	public void setUp() {
		createFixture(true);
		
		filterTrue1 = new BoolFilter(ReqIFFullFilter.Operator.IS, true, attributeDefinition1);
		filterTrue2 = new BoolFilter(ReqIFFullFilter.Operator.IS, true, attributeDefinition2);
		filterFalse1 = new BoolFilter(ReqIFFullFilter.Operator.IS, true, attributeDefinition3);
		
		filters = new ArrayList<ReqIFFullFilter>();
		filters.add(filterTrue1);
		filters.add(filterTrue2);
		filters.add(filterFalse1);
	}
	
	
	@Test
	public void testOr() throws Exception {
		SimpleCompoundFilter filter = new SimpleCompoundFilter(filters, true);
		doMatch(filter, true);
	}
	
	
	@Test
	public void testAnd() throws Exception {
		SimpleCompoundFilter filter = new SimpleCompoundFilter(filters, false);
		doMatch(filter, true);
	}
	
	@Test
	public void testAnd2() throws Exception {
		filters.clear();
		filters.add(filterTrue1);
		filters.add(filterTrue2);
		
		SimpleCompoundFilter filter = new SimpleCompoundFilter(filters, false);
		doMatch(filter, true);
	}
	
	@Override
	public void createFixture(Object value) {
		if ((value != null) && !(value instanceof Boolean)) {
			throw new IllegalArgumentException();
		}

		
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		attributeDefinition1 = createBooleanAttribute(specObject, true);
		attributeDefinition2 = createBooleanAttribute(specObject, true);
		attributeDefinition3 = createBooleanAttribute(specObject, false);

		createSpecObjectType(specObject, attributeDefinition1);

		setFixture(specObject);
	}
	
	
	
	/* creates a new datatypeDefinition, attributeDefinition and attributeValue and adds it to the element
	 * 
	 * returns the newly created AttributeDefinition
	 */
	private AttributeDefinitionBoolean createBooleanAttribute(SpecElementWithAttributes element, Boolean value){
		AttributeDefinitionBoolean attributeDefinition = ReqIF10Factory.eINSTANCE.createAttributeDefinitionBoolean();
		attributeDefinition.setIdentifier("AD_ID0");
		DatatypeDefinitionBoolean definition = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionBoolean();
		definition.setIdentifier("DD_ID0");
		attributeDefinition.setType(definition);
		AttributeValueBoolean attributeValue = ReqIF10Factory.eINSTANCE.createAttributeValueBoolean();
		attributeValue.setDefinition(attributeDefinition);
		attributeValue.setTheValue((Boolean) value);
		
		element.getValues().add(attributeValue);
		
		return attributeDefinition;
	}
	

	@Override
	public Set<Operator> getSupportedOperators() {
		return null;
	}

	@Override
	public ReqIFFullFilter createFilterInstance(Operator operator) {
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
