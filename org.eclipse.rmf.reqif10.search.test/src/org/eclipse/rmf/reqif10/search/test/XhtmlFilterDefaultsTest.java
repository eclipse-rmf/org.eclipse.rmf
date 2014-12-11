/*******************************************************************************
 * Copyright (c) 2014 Formal Mind GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ingo Weigelt - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.search.test;

import static org.junit.Assert.fail;

import java.net.URISyntaxException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.rmf.reqif10.AttributeDefinitionXHTML;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.search.testdata.TestData;
import org.junit.Test;

public class XhtmlFilterDefaultsTest extends XhtmlFilterTest {

	@Test
	public void testOnEmptyAttribute() throws Exception {
		// Do nothing, since this test will fall back on default values 
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
			URI uri = TestData.getURI("xhtml_with_defaultValues.reqif");
			//URI uri = TestData.getURI("simplexhtml.reqif");
			final Resource resource = editingDomain.getResourceSet().getResource(uri, true);
			final ReqIF reqif = (ReqIF) resource.getContents().get(0);
			specObject = reqif.getCoreContent().getSpecObjects().get(0);
			
			attributeDefinition = (AttributeDefinitionXHTML) reqif.getCoreContent().getSpecTypes().get(0).getSpecAttributes().get(1);
			
			if (value == null){
				attributeDefinition.getDefaultValue().setTheValue(null);
			}
			
			setFixture(specObject);
		} catch (URISyntaxException e) {
			e.printStackTrace();
			fail("Could not load testdata");
		}
	}

}
