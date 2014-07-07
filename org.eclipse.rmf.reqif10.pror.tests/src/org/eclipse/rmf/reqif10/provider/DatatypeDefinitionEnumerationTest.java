/*******************************************************************************
 * Copyright (c) 2011, 2012 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.provider;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A test case for the model object '<em><b>Datatype Definition Enumeration</b></em>'.
 */
public class DatatypeDefinitionEnumerationTest extends DatatypeDefinitionTest {

	/**
	 * Returns the fixture for this Datatype Definition Enumeration test case.
	 */
	@Override
	protected DatatypeDefinitionEnumeration getFixture() {
		return (DatatypeDefinitionEnumeration)fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUpDatatypeDefinitionEnumerationTest() throws Exception {
		setFixture(ReqIF10Factory.eINSTANCE.createDatatypeDefinitionEnumeration());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDownDatatypeDefinitionEnumerationTest() throws Exception {
		setFixture(null);
	}
	
	@Test
	public void testEnsureValueHasEmbeddedValue() throws Exception {
		EnumValue value = ReqIF10Factory.eINSTANCE.createEnumValue();
		assertNull(value.getProperties());
		this.setViaCommand(fixture, ReqIF10Package.Literals.DATATYPE_DEFINITION_ENUMERATION__SPECIFIED_VALUES, value);
		assertNotNull(value.getProperties());
	}



} //DatatypeDefinitionEnumerationTest
