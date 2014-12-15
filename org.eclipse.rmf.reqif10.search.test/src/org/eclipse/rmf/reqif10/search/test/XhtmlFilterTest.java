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

import static org.junit.Assert.fail;

import java.net.URISyntaxException;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeDefinitionXHTML;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.search.filter.IFilter;
import org.eclipse.rmf.reqif10.search.filter.IFilter.Operator;
import org.eclipse.rmf.reqif10.search.filter.StringFilter;
import org.eclipse.rmf.reqif10.search.filter.XhtmlFilter;
import org.eclipse.rmf.reqif10.search.testdata.TestData;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class XhtmlFilterTest extends AbstractFilterTest{

	SpecObject specObject;
	AttributeDefinitionXHTML attributeDefinition; 

	@Rule public ExpectedException thrown= ExpectedException.none();
	
	@Before
	public void seUp(){
		createFixture("");
	}
		
	
	@Test
	public void testContains() throws Exception {
		XhtmlFilter xhtmlFilter;
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.CONTAINS, "hello",  attributeDefinition, true);
		doMatch(xhtmlFilter, true);
		
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.CONTAINS, "HELLO",  attributeDefinition, false);
		doMatch(xhtmlFilter, true);
		
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.CONTAINS, "HELLO",  attributeDefinition, true);
		doMatch(xhtmlFilter, false);
		
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.CONTAINS, "<xhtml:p",  attributeDefinition, false);
		doMatch(xhtmlFilter, true);
	}
	
	
	@Test
	public void testNotContains() throws Exception {
		XhtmlFilter xhtmlFilter;
		
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.NOT_CONTAINS, "hello",  attributeDefinition, true);
		doMatch(xhtmlFilter, false);
		
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.NOT_CONTAINS, "HELLO",  attributeDefinition, true);
		doMatch(xhtmlFilter, true);
		
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.NOT_CONTAINS, "NOTHING",  attributeDefinition, true);
		doMatch(xhtmlFilter, true);
	}
	

	
	@Test
	public void testRegExp() throws Exception {
		XhtmlFilter xhtmlFilter;
		
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.REGEXP, "<xhtml:p.*>hel+o",  attributeDefinition, true);
		doMatch(xhtmlFilter, true);
		
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.REGEXP, "NOTHING",  attributeDefinition, true);
		doMatch(xhtmlFilter, false);
	}

	@Test
	public void testRegExpPlain() throws Exception {
		XhtmlFilter xhtmlFilter;
		
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.REGEXP_PLAIN, "hello",  attributeDefinition, true);
		doMatch(xhtmlFilter, true);
		
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.REGEXP_PLAIN, "hello\\s* world",  attributeDefinition, true);
		doMatch(xhtmlFilter, true);
		
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.REGEXP_PLAIN, "hello.*world",  attributeDefinition, true);
		doMatch(xhtmlFilter, true);
	}	
	
	@Test
	public void testIsSet() throws Exception {
		XhtmlFilter xhtmlFilter;
		
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.IS_SET, "hello",  attributeDefinition, true);
		doMatch(xhtmlFilter, true);
		
		AttributeDefinitionXHTML attributeDefinition2 = ReqIF10Factory.eINSTANCE.createAttributeDefinitionXHTML();
		attributeDefinition2.setIdentifier("AD_ID1");
		
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.IS_SET, "hello",  attributeDefinition2, true);
		doMatch(xhtmlFilter, false);
	}
	
	@Test
	public void testIsNotSet() throws Exception {
		XhtmlFilter xhtmlFilter;
		
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.IS_NOT_SET, "hello",  attributeDefinition, true);
		doMatch(xhtmlFilter, false);
		
		AttributeDefinitionXHTML attributeDefinition2 = ReqIF10Factory.eINSTANCE.createAttributeDefinitionXHTML();
		attributeDefinition2.setIdentifier("AD_ID1");
		
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.IS_NOT_SET, "hello",  attributeDefinition2, true);
		doMatch(xhtmlFilter, true);
	}


	@Test
	public void testExceptionsAttributeDefinition() throws Exception {
		thrown.expect(IllegalArgumentException.class);
		new StringFilter(IFilter.Operator.EQUALS, "abcdef",  (AttributeDefinitionString) null, false);
	}
	
	
	@Override
	public Set<Operator> getSupportedOperators() {
		return XhtmlFilter.SUPPORTED_OPERATORS;
	}


	@Override
	public IFilter createFilterInstance(Operator operator) {
		return new XhtmlFilter(operator, "", attributeDefinition, true);
	}


	@Override
	public void doEmptyTest() throws Exception {
		XhtmlFilter xhtmlFilter;
		
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.CONTAINS, "hello",  attributeDefinition, true);
		doMatch(xhtmlFilter, false);
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.CONTAINS, "HELLO",  attributeDefinition, false);
		doMatch(xhtmlFilter, false);
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.CONTAINS, "HELLO",  attributeDefinition, true);
		doMatch(xhtmlFilter, false);
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.CONTAINS, "<xhtml:p",  attributeDefinition, false);
		doMatch(xhtmlFilter, false);
		
		
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.NOT_CONTAINS, "hello",  attributeDefinition, true);
		doMatch(xhtmlFilter, true);
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.NOT_CONTAINS, "HELLO",  attributeDefinition, false);
		doMatch(xhtmlFilter, true);
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.NOT_CONTAINS, "NOTHING",  attributeDefinition, true);
		doMatch(xhtmlFilter, true);
		
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.REGEXP, "<xhtml:p.*>hel+o",  attributeDefinition, true);
		doMatch(xhtmlFilter, false);
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.REGEXP, "x*",  attributeDefinition, true);
		doMatch(xhtmlFilter, true);
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.REGEXP, "",  attributeDefinition, true);
		doMatch(xhtmlFilter, true);
		
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.REGEXP_PLAIN, "h",  attributeDefinition, true);
		doMatch(xhtmlFilter, false);
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.REGEXP_PLAIN, "x*",  attributeDefinition, true);
		doMatch(xhtmlFilter, true);
		xhtmlFilter = new XhtmlFilter(IFilter.Operator.REGEXP_PLAIN, "",  attributeDefinition, true);
		doMatch(xhtmlFilter, true);
	}

	/*
	 * The Value in this reqif is:
	 * <xhtml:div><xhtml:p style="text-align: left">hello</xhtml:p><xhtml:p style=" text-align: left">world</xhtml:p></xhtml:div>
	 * 
	 * (non-Javadoc)
	 * @see org.eclipse.rmf.reqif10.search.test.AbstractFilterTest#createFixture(java.lang.Object)
	 */
	@Override
	public void createFixture(Object value) {
		try {
			URI uri = TestData.getURI("simplexhtml.reqif");
			final Resource resource = editingDomain.getResourceSet().getResource(uri, true);
			final ReqIF reqif = (ReqIF) resource.getContents().get(0);
			specObject = reqif.getCoreContent().getSpecObjects().get(0);
			AttributeValueXHTML attributeValue = (AttributeValueXHTML) specObject.getValues().get(1);
			
			if (value == null){
				attributeValue.setTheValue(null);
			}
			
			attributeDefinition = (AttributeDefinitionXHTML) ReqIF10Util.getAttributeDefinition(attributeValue);
			
			createSpecObjectType(specObject, attributeDefinition);
			
			setFixture(specObject);
		} catch (URISyntaxException e) {
			e.printStackTrace();
			fail("Could not load testdata");
		}
	}

		
}
