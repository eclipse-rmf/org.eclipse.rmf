/*******************************************************************************
 * Copyright (c) 2012 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.pror.presentation.id.tests;

import org.eclipse.rmf.reqif10.configuration.tests.ProrPresentationConfigurationTest;
import org.eclipse.rmf.reqif10.pror.presentation.id.IdConfiguration;
import org.eclipse.rmf.reqif10.pror.presentation.id.IdFactory;
import org.junit.After;
import org.junit.Before;

/**
 * A test case for the model object '<em><b>Id Configuration</b></em>'.
 */
public class IdConfigurationTest extends ProrPresentationConfigurationTest {

	/**
	 * Sets the fixture for this Configuration test case.
	 */
	protected void setFixture(IdConfiguration fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Configuration test case.
	 */
	protected IdConfiguration getFixture() {
		return (IdConfiguration) fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		setFixture(IdFactory.eINSTANCE.createIdConfiguration());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDown() throws Exception {
		setFixture(null);
	}

} //IdConfigurationTest
