package org.eclipse.rmf.reqif10.search.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionDate;
import org.eclipse.rmf.reqif10.AttributeDefinitionInteger;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.testframework.AbstractItemProviderTest;
import org.eclipse.rmf.reqif10.search.filter.DateFilter;
import org.eclipse.rmf.reqif10.search.filter.IFilter;
import org.eclipse.rmf.reqif10.search.filter.IFilter.Operator;
import org.eclipse.rmf.reqif10.search.filter.NumberFilter;
import org.eclipse.rmf.reqif10.search.filter.SimpleCompoundFilter;
import org.eclipse.rmf.reqif10.search.filter.StringFilter;
import org.eclipse.rmf.reqif10.search.testdata.TestData;
import org.junit.Test;

public class SimpleCompoundFilterTest extends AbstractItemProviderTest {

	
	@Test
	public void testName() throws Exception {
		URI uri = TestData.getURI("testMultipleAttributes.reqif");
		final Resource resource = editingDomain.getResourceSet().getResource(uri, true);
		final ReqIF reqif = (ReqIF) resource.getContents().get(0);
		SpecObject so = reqif.getCoreContent().getSpecObjects().get(0);
		
		
		AttributeDefinitionString adString = null;
		AttributeDefinitionDate adDate = null;
		AttributeDefinitionInteger adInteger = null;
		for (AttributeValue attributeValue : so.getValues()) {
			AttributeDefinition attributeDefinition = ReqIF10Util.getAttributeDefinition(attributeValue);
			System.out.println(attributeDefinition.getClass());
			if (attributeDefinition instanceof AttributeDefinitionString) {
				adString = (AttributeDefinitionString) attributeDefinition;
			}
			if (attributeDefinition instanceof AttributeDefinitionInteger) {
				adInteger = (AttributeDefinitionInteger) attributeDefinition;
			}
			if (attributeDefinition instanceof AttributeDefinitionDate) {
				adDate = (AttributeDefinitionDate) attributeDefinition;
			}
		}
		
		
		LinkedList<IFilter> filters = new LinkedList<IFilter>();
		filters.add(new DateFilter(Operator.AFTER, new GregorianCalendar(2014, 1, 1), null, adDate)); // matches
		filters.add(new NumberFilter(Operator.GREATER, new BigInteger("100"), null, adInteger)); // does not match
		filters.add(new StringFilter(Operator.CONTAINS, "c", adString, false)); // matches
			
		
		SimpleCompoundFilter orFilter = new SimpleCompoundFilter(filters, true);
		for (SpecObject specObject : reqif.getCoreContent().getSpecObjects()) {
			assertTrue(orFilter.match(specObject));
		}
		
		
		SimpleCompoundFilter andFilter = new SimpleCompoundFilter(filters, false);
		for (SpecObject specObject : reqif.getCoreContent().getSpecObjects()) {
			assertFalse(andFilter.match(specObject));
		}

	}
	
}
