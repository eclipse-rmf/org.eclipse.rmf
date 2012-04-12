/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.provider;

import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.junit.After;
import org.junit.Before;

/**
 * A test case for the model object '<em><b>Datatype Definition String</b></em>'.
 */
public class DatatypeDefinitionStringTest extends DatatypeDefinitionSimpleTest {

	/**
	 * Returns the fixture for this Datatype Definition String test case.
	 */
	@Override
	protected DatatypeDefinitionString getFixture() {
		return (DatatypeDefinitionString)fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUpDatatypeDefinitionStringTest() throws Exception {
		setFixture(ReqIF10Factory.eINSTANCE.createDatatypeDefinitionString());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDownDatatypeDefinitionStringTest() throws Exception {
		setFixture(null);
	}

} //DatatypeDefinitionStringTest
