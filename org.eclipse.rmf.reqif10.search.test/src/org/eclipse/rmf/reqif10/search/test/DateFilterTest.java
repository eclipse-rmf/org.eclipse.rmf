/*******************************************************************************
 * Copyright (c) 2014 Formal Mind GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ingo Weigelt - initial API and implementation
 *     Michael Jastram - adding SUPPORTED_OPERATIONS
 ******************************************************************************/
package org.eclipse.rmf.reqif10.search.test;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionDate;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValueDate;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.DatatypeDefinitionDate;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.pror.testframework.AbstractItemProviderTest;
import org.eclipse.rmf.reqif10.search.filter.DateFilter;
import org.eclipse.rmf.reqif10.search.filter.IFilter;
import org.eclipse.rmf.reqif10.search.filter.IFilter.Operator;
import org.eclipse.rmf.reqif10.search.filter.StringFilter;
import org.eclipse.rmf.reqif10.search.filter.StringFilter.InternalAttribute;
import org.eclipse.rmf.reqif10.search.testdata.TestData;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DateFilterTest extends AbstractItemProviderTest{

	SpecObject specObject;
	AttributeDefinitionDate attributeDefinition; 

	@Rule public ExpectedException thrown= ExpectedException.none();
	
	@Before
	public void init(){
		attributeDefinition = createAttributeDefinitionDate("AD_DATE_ID");
		GregorianCalendar calendar = new GregorianCalendar(2014, 12, 03);
		specObject = createSpecObjectWithDate("SO_ID", calendar, attributeDefinition);
		specObject.setLastChange(new GregorianCalendar(2014, 12, 03));
	}
	
	
	
	@Test
	public void testIs() throws Exception {
		DateFilter filter;
			
		filter = new DateFilter(IFilter.Operator.IS, new GregorianCalendar(2014, 12, 03), null,  attributeDefinition);
		assertTrue(filter.match(specObject));
		
		filter = new DateFilter(IFilter.Operator.IS, new GregorianCalendar(2014, 12, 04), null,  attributeDefinition);
		assertFalse(filter.match(specObject));

		filter = new DateFilter(IFilter.Operator.IS, new GregorianCalendar(2014,12,03,0,0,0), null,  attributeDefinition);
		assertTrue(filter.match(specObject));
		
		//// Same for internal Attribute
		filter = new DateFilter(IFilter.Operator.IS, new GregorianCalendar(2014, 12, 03), null,  DateFilter.InternalAttribute.LAST_CHANGE);
		assertTrue(filter.match(specObject));
		
		filter = new DateFilter(IFilter.Operator.IS, new GregorianCalendar(2014, 12, 04), null,  DateFilter.InternalAttribute.LAST_CHANGE);
		assertFalse(filter.match(specObject));

		filter = new DateFilter(IFilter.Operator.IS, new GregorianCalendar(2014,12,03,0,0,0), null,  DateFilter.InternalAttribute.LAST_CHANGE);
		assertTrue(filter.match(specObject));		
		
	}
	
	@Test
	public void testNotEquals() throws Exception {
		DateFilter filter;
		
		filter = new DateFilter(IFilter.Operator.IS_NOT, new GregorianCalendar(2014, 12, 04), null,  attributeDefinition);
		assertTrue(filter.match(specObject));

		filter = new DateFilter(IFilter.Operator.IS_NOT, new GregorianCalendar(2014, 12, 03), null,  attributeDefinition);
		assertFalse(filter.match(specObject));
		
		//// Same for internal Attribute
		filter = new DateFilter(IFilter.Operator.IS_NOT, new GregorianCalendar(2014, 12, 04), null,  DateFilter.InternalAttribute.LAST_CHANGE);
		assertTrue(filter.match(specObject));

		filter = new DateFilter(IFilter.Operator.IS_NOT, new GregorianCalendar(2014, 12, 03), null,  DateFilter.InternalAttribute.LAST_CHANGE);
		assertFalse(filter.match(specObject));
	}
	

	@Test
	public void testBetween() throws Exception {
		DateFilter filter;
		
		filter = new DateFilter(IFilter.Operator.BETWEEN, new GregorianCalendar(2014, 12, 01), new GregorianCalendar(2014, 12, 04), attributeDefinition);
		assertTrue(filter.match(specObject));

		filter = new DateFilter(IFilter.Operator.BETWEEN, new GregorianCalendar(2014, 12, 03), new GregorianCalendar(2014, 12, 03), attributeDefinition);
		assertTrue(filter.match(specObject));
		
		filter = new DateFilter(IFilter.Operator.BETWEEN, new GregorianCalendar(2014, 01, 01), new GregorianCalendar(2014, 12, 01), attributeDefinition);
		assertFalse(filter.match(specObject));
		
		//// Same for internal Attribute
		filter = new DateFilter(IFilter.Operator.BETWEEN, new GregorianCalendar(2014, 12, 01), new GregorianCalendar(2014, 12, 04), DateFilter.InternalAttribute.LAST_CHANGE);
		assertTrue(filter.match(specObject));

		filter = new DateFilter(IFilter.Operator.BETWEEN, new GregorianCalendar(2014, 12, 03), new GregorianCalendar(2014, 12, 03), DateFilter.InternalAttribute.LAST_CHANGE);
		assertTrue(filter.match(specObject));
		
		filter = new DateFilter(IFilter.Operator.BETWEEN, new GregorianCalendar(2014, 01, 01), new GregorianCalendar(2014, 12, 01), DateFilter.InternalAttribute.LAST_CHANGE);
		assertFalse(filter.match(specObject));
	}
	
	@Test
	public void testBefore() throws Exception {
		DateFilter filter;
		
		filter = new DateFilter(IFilter.Operator.BEFORE, new GregorianCalendar(2015, 1, 1), new GregorianCalendar(2014, 12, 04), attributeDefinition);
		assertTrue(filter.match(specObject));

		filter = new DateFilter(IFilter.Operator.BEFORE, new GregorianCalendar(2014, 12, 3), null, attributeDefinition);
		assertFalse(filter.match(specObject));
		
		filter = new DateFilter(IFilter.Operator.BEFORE, new GregorianCalendar(2014, 1, 1), null, attributeDefinition);
		assertFalse(filter.match(specObject));
		
		//// Same for internal Attribute
		filter = new DateFilter(IFilter.Operator.BEFORE, new GregorianCalendar(2015, 1, 1), new GregorianCalendar(2014, 12, 04), DateFilter.InternalAttribute.LAST_CHANGE);
		assertTrue(filter.match(specObject));

		filter = new DateFilter(IFilter.Operator.BEFORE, new GregorianCalendar(2014, 12, 3), null, DateFilter.InternalAttribute.LAST_CHANGE);
		assertFalse(filter.match(specObject));
		
		filter = new DateFilter(IFilter.Operator.BEFORE, new GregorianCalendar(2014, 1, 1), null, DateFilter.InternalAttribute.LAST_CHANGE);
		assertFalse(filter.match(specObject));
	}
	
	@Test
	public void testAfter() throws Exception {
		DateFilter filter;
		
		filter = new DateFilter(IFilter.Operator.AFTER, new GregorianCalendar(2000, 1, 1), null, attributeDefinition);
		assertTrue(filter.match(specObject));

		filter = new DateFilter(IFilter.Operator.AFTER, new GregorianCalendar(3000, 1, 1), null, attributeDefinition);
		assertFalse(filter.match(specObject));
		
		filter = new DateFilter(IFilter.Operator.AFTER, new GregorianCalendar(2014, 12, 03), null, attributeDefinition);
		assertFalse(filter.match(specObject));
		
		//// Same for internal Attribute
		filter = new DateFilter(IFilter.Operator.AFTER, new GregorianCalendar(2000, 1, 1), null, DateFilter.InternalAttribute.LAST_CHANGE);
		assertTrue(filter.match(specObject));

		filter = new DateFilter(IFilter.Operator.AFTER, new GregorianCalendar(3000, 1, 1), null, DateFilter.InternalAttribute.LAST_CHANGE);
		assertFalse(filter.match(specObject));
		
		filter = new DateFilter(IFilter.Operator.AFTER, new GregorianCalendar(2014, 12, 03), null, DateFilter.InternalAttribute.LAST_CHANGE);
		assertFalse(filter.match(specObject));
	}
	

	
	
	@Test
	public void testEmptyAttribute() throws Exception {
		fail("Not yet implemented");
	}
	
	
	@Test
	public void testExceptionsAttributeDefinition() throws Exception {
		thrown.expect(IllegalArgumentException.class);
		fail("Not yet implemented");
	}
	
	@Test
	public void testExceptionsInternalAttribute() throws Exception {
		thrown.expect(IllegalArgumentException.class);
		fail("Not yet implemented");
	}
	
	@Test
	public void testExceptionsUnsupportedOperation() throws Exception {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage(Operator.BEFORE.toString());
		fail("Not yet implemented");
	}
	
	


	
	AttributeDefinitionDate createAttributeDefinitionDate(String id){
		AttributeDefinitionDate ad = ReqIF10Factory.eINSTANCE.createAttributeDefinitionDate();
		ad.setIdentifier(id);
		return ad;
	}
	
	DatatypeDefinitionDate createDatatypeDefinitionDate(String id){
		DatatypeDefinitionDate dd = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionDate();
		dd.setIdentifier(id);
		return dd;
	}
	
	AttributeValueDate createAttributeValueDate(GregorianCalendar theValue){
		AttributeValueDate av = ReqIF10Factory.eINSTANCE.createAttributeValueDate();
		av.setTheValue(theValue);
		return av;
	}
	
	SpecObject createSpecObject(String id){
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.setIdentifier(id);
		return specObject;
	}
	
	SpecObject createSpecObjectWithDate(String id, GregorianCalendar value, AttributeDefinitionDate attributeDefinition){
		DatatypeDefinitionDate definitionDate = createDatatypeDefinitionDate("DD_DATE_ID");
		attributeDefinition.setType(definitionDate);
		AttributeValueDate attributeValue = createAttributeValueDate(value);
		attributeValue.setDefinition(attributeDefinition);
		SpecObject specObject = createSpecObject(id);
		specObject.getValues().add(attributeValue);
		return specObject;
	}

	public ReqIF reqifFromFile(String fileName) throws Exception{
		URI uri = TestData.getURI(fileName);
		final Resource resource = editingDomain.getResourceSet().getResource(uri, true);
		final ReqIF reqif = (ReqIF) resource.getContents().get(0);
		if (reqif == null){
			throw new NullPointerException();
		}
		return reqif;
	}
	
}
