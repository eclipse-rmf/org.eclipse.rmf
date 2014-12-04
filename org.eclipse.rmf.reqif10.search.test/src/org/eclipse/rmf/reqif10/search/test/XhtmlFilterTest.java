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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeDefinitionXHTML;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.DatatypeDefinitionXHTML;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.XhtmlContent;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.common.util.ReqIF10XhtmlUtil;
import org.eclipse.rmf.reqif10.pror.testframework.AbstractItemProviderTest;
import org.eclipse.rmf.reqif10.search.filter.IFilter;
import org.eclipse.rmf.reqif10.search.filter.StringFilter;
import org.eclipse.rmf.reqif10.search.filter.XhtmlFilter;
import org.eclipse.rmf.reqif10.search.testdata.TestData;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class XhtmlFilterTest extends AbstractItemProviderTest{

	SpecObject specObject;
	AttributeDefinitionXHTML attributeDefinition; 

	@Rule public ExpectedException thrown= ExpectedException.none();
	
	@Before
	public void init(){
		attributeDefinition = createAttributeDefinitionXHTML("AD_XHTML_ID");
		specObject = createSpecObjectWithXHTML("SO_ID", "<xhtml><div>hello</div><div>world</div></xhtml>", attributeDefinition);
	}
	
	
	@Test
	public void testContains() throws Exception {
		XhtmlFilter xhtmlFilter;
		try{
			
			xhtmlFilter = new XhtmlFilter(IFilter.Operator.CONTAINS, "hello",  attributeDefinition, true);
			assertTrue(xhtmlFilter.match(specObject));
			
			fail("Not yet implemented");	
			
		}catch (Exception e) {
			e.printStackTrace();
			fail("An exception was thrown");
		}
	}

	@Test
	public void testRegExp() throws Exception {
		XhtmlFilter xhtmlFilter;
	
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.REGEXP, "<div>hel+o",  attributeDefinition, true);
		assertTrue(xhtmlFilter.match(specObject));
	}

	@Test
	public void testRegExpPlain() throws Exception {
		//TODO
		
		URI uri = TestData.getURI("simplexhtml.reqif");
		final Resource resource = editingDomain.getResourceSet().getResource(uri, true);
		final ReqIF reqif = (ReqIF) resource.getContents().get(0);
		SpecObject so = reqif.getCoreContent().getSpecObjects().get(0);
		AttributeValue attributeValue = so.getValues().get(1);
		AttributeDefinitionXHTML definition = (AttributeDefinitionXHTML) ReqIF10Util.getAttributeDefinition(attributeValue);
		if (attributeValue instanceof AttributeValueXHTML) {
			AttributeValueXHTML value = (AttributeValueXHTML) attributeValue;
			value.getTheValue().getXhtmlSource();
			
			XhtmlContent xhtmlContent = value.getTheValue();
			String string = ReqIF10XhtmlUtil.getXhtmlString(xhtmlContent);
			System.out.println(string);
		}
		
		XhtmlFilter xhtmlFilter;
		
		
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.REGEXP_PLAIN, "hello",  definition, true);
		assertTrue(xhtmlFilter.match(so));
		
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.REGEXP_PLAIN, "hello\\s* world",  definition, true);
		assertTrue(xhtmlFilter.match(so));
		
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.REGEXP, "hello.*world",  definition, true);
		assertTrue(xhtmlFilter.match(so));
		
		fail("Not yet implemented");
	}	
	
	
	@Test
	public void testNotContains() throws Exception {
		fail("Not yet implemented");
	}
	

	
	@Test
	public void testInternalFeatures() throws Exception {
		fail("Not yet implemented");
	}
	
	
	@Test
	public void testEmptyAttribute() throws Exception {
		fail("Not yet implemented");
	}
	
	
	@Test
	public void testExceptionsAttributeDefinition() throws Exception {
		thrown.expect(IllegalArgumentException.class);
		new StringFilter(IFilter.Operator.EQUALS, "abcdef",  (AttributeDefinitionString) null, false);
	}
	
	@Test
	public void testExceptionsInternalAttribute() throws Exception {
		fail("Not yet implemented");
	}
	
	@Test
	public void testExceptionsUnsupportedOperation() throws Exception {
		fail("Not yet implemented");
	}
	
	@Test
	public void testExceptionsUnsupportedOperation2() throws Exception {
		fail("Not yet implemented");
	}
	
	

	
	AttributeDefinitionXHTML createAttributeDefinitionXHTML(String id){
		AttributeDefinitionXHTML ad = ReqIF10Factory.eINSTANCE.createAttributeDefinitionXHTML();
		ad.setIdentifier(id);
		return ad;
	}
	
	DatatypeDefinitionXHTML createDatatypeDefinitionXHTML(String id){
		DatatypeDefinitionXHTML dd = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionXHTML();
		dd.setIdentifier(id);
		return dd;
	}
	
	AttributeValueXHTML createAttributeValueXHTML(String xhtmlsource){
		AttributeValueXHTML av = ReqIF10Factory.eINSTANCE.createAttributeValueXHTML();
		XhtmlContent xhtmlContent = ReqIF10Factory.eINSTANCE.createXhtmlContent();
		xhtmlContent.setXhtmlSource(xhtmlsource);
		av.setTheValue(xhtmlContent);
		return av;
	}
	
	SpecObject createSpecObject(String id){
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.setIdentifier(id);
		return specObject;
	}
	
	SpecObject createSpecObjectWithXHTML(String id, String stringValue, AttributeDefinitionXHTML attributeDefinition){
		DatatypeDefinitionXHTML definitionString = createDatatypeDefinitionXHTML("DD_STRING_ID");
		attributeDefinition.setType(definitionString);
		AttributeValueXHTML attributeValue = createAttributeValueXHTML(stringValue);
		attributeValue.setDefinition(attributeDefinition);
		SpecObject specObject = createSpecObject(id);
		specObject.getValues().add(attributeValue);
		return specObject;
	}

		
}
