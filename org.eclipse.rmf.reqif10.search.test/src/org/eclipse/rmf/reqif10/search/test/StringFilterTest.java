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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.pror.testframework.AbstractItemProviderTest;
import org.eclipse.rmf.reqif10.search.filter.IFilter;
import org.eclipse.rmf.reqif10.search.filter.IFilter.Operator;
import org.eclipse.rmf.reqif10.search.filter.StringFilter;
import org.eclipse.rmf.reqif10.search.filter.StringFilter.InternalAttribute;
import org.eclipse.rmf.reqif10.search.testdata.TestData;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringFilterTest extends AbstractItemProviderTest{

	SpecObject specObject;
	AttributeDefinitionString attributeDefinition; 

	@Rule public ExpectedException thrown= ExpectedException.none();
	
	@Before
	public void init(){
		attributeDefinition = createAttributeDefinitionString("AD_STRING_ID");
		specObject = createSpecObjectWithString("SO_ID", "abcDEF", attributeDefinition);
	}
	
	
	
	@Test
	public void testEquals() throws Exception {
		StringFilter stringFilter = new StringFilter(IFilter.Operator.EQUALS, "abcDEF",  attributeDefinition, true);
		assertTrue(stringFilter.match(specObject));
		
		stringFilter = new StringFilter(IFilter.Operator.EQUALS, "abcDEF",  attributeDefinition, false);
		assertTrue(stringFilter.match(specObject));
		
		stringFilter = new StringFilter(IFilter.Operator.EQUALS, "abcdef",  attributeDefinition, true);
		assertFalse(stringFilter.match(specObject));
		
		stringFilter = new StringFilter(IFilter.Operator.EQUALS, "abcdef",  attributeDefinition, false);
		assertTrue(stringFilter.match(specObject));
		
		stringFilter = new StringFilter(IFilter.Operator.EQUALS, "abc",  attributeDefinition, false);
		assertFalse(stringFilter.match(specObject));
		
		stringFilter = new StringFilter(IFilter.Operator.EQUALS, "abc",  attributeDefinition, true);
		assertFalse(stringFilter.match(specObject));
	}
	
	@Test
	public void testNotEquals() throws Exception {
		StringFilter stringFilter = new StringFilter(IFilter.Operator.NOT_EQUALS, "X",  attributeDefinition, true);
		assertTrue(stringFilter.match(specObject));
		
		stringFilter = new StringFilter(IFilter.Operator.NOT_EQUALS, "abcdef",  attributeDefinition, true);
		assertTrue(stringFilter.match(specObject));
		
		stringFilter = new StringFilter(IFilter.Operator.NOT_EQUALS, "abcdef",  attributeDefinition, false);
		assertFalse(stringFilter.match(specObject));
		
		stringFilter = new StringFilter(IFilter.Operator.NOT_EQUALS, "abcDEF",  attributeDefinition, true);
		assertFalse(stringFilter.match(specObject));
	}
	
	
	@Test
	public void testContains() throws Exception {
		fail("Not yet implemented");
	}
	
	
	@Test
	public void testNotContains() throws Exception {
		fail("Not yet implemented");
	}
	
	@Test
	public void testRegExp() throws Exception {
		fail("Not yet implemented");
	}
	
	@Test
	public void testInternalFeatures() throws Exception {
		fail("Not yet implemented");
	}
	
	
	@Test
	public void testEmptyAttribute() throws Exception {
		SpecObject specObject = createSpecObject("SO_ID");
		StringFilter stringFilter = new StringFilter(IFilter.Operator.EQUALS, "abcdef",  attributeDefinition, false);
		assertFalse(stringFilter.match(specObject));
		
		// A missing AD should be treated as an empty value
		stringFilter = new StringFilter(IFilter.Operator.EQUALS, "",  attributeDefinition, false);
		assertTrue(stringFilter.match(specObject));
	}
	
	
	@Test
	public void testExceptionsAttributeDefinition() throws Exception {
		thrown.expect(IllegalArgumentException.class);
		new StringFilter(IFilter.Operator.EQUALS, "abcdef",  (AttributeDefinitionString) null, false);
	}
	
	@Test
	public void testExceptionsInternalAttribute() throws Exception {
		thrown.expect(IllegalArgumentException.class);
		new StringFilter(IFilter.Operator.EQUALS, "abcdef",  (InternalAttribute) null, false);
	}
	
	@Test
	public void testExceptionsUnsupportedOperation() throws Exception {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage(Operator.BEFORE.toString());
		new StringFilter(IFilter.Operator.BEFORE, "abcdef",  attributeDefinition, false);
	}
	
	
	@Test
	public void testHowtoLoadAReqif() throws Exception {
		ReqIF reqIF = reqifFromFile("test.reqif");
		Specification specification = reqIF.getCoreContent().getSpecifications().get(0);
		SpecObject object = specification.getChildren().get(0).getObject();
		EList<AttributeDefinition> specAttributes = reqIF.getCoreContent().getSpecTypes().get(0).getSpecAttributes();
		AttributeDefinitionString attributeDefinition = (AttributeDefinitionString) specAttributes.get(0);
		
		StringFilter stringFilter = new StringFilter(IFilter.Operator.EQUALS, "ABC",  attributeDefinition, true);
		assertTrue(stringFilter.match(object));
	}

	
	AttributeDefinitionString createAttributeDefinitionString(String id){
		AttributeDefinitionString ad = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		ad.setIdentifier(id);
		return ad;
	}
	
	DatatypeDefinitionString createDatatypeDefinitionString(String id){
		DatatypeDefinitionString dd = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionString();
		dd.setIdentifier(id);
		return dd;
	}
	
	AttributeValueString createAttributeValueString(String theValue){
		AttributeValueString av = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		av.setTheValue(theValue);
		return av;
	}
	
	SpecObject createSpecObject(String id){
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.setIdentifier(id);
		return specObject;
	}
	
	SpecObject createSpecObjectWithString(String id, String stringValue, AttributeDefinitionString attributeDefinition){
		DatatypeDefinitionString definitionString = createDatatypeDefinitionString("DD_STRING_ID");
		attributeDefinition.setType(definitionString);
		AttributeValueString attributeValue = createAttributeValueString(stringValue);
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
