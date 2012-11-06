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

package org.eclipse.rmf.reqif10.configuration.tests;

import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationFactory;
import org.eclipse.rmf.reqif10.pror.configuration.LabelConfiguration;
import org.eclipse.rmf.reqif10.pror.testframework.AbstractItemProviderTest;
import org.junit.After;
import org.junit.Before;

/**
 * A test case for the model object '<em><b>Label Configuration</b></em>'.
 */
public class LabelConfigurationTest extends AbstractItemProviderTest {

	/**
	 * The fixture for this Label Configuration test case.
	 */
	protected LabelConfiguration fixture = null;

	/**
	 * Sets the fixture for this Label Configuration test case.
	 */
	protected void setFixture(LabelConfiguration fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Label Configuration test case.
	 */
	protected LabelConfiguration getFixture() {
		return fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	protected void setUp() throws Exception {
		setFixture(ConfigurationFactory.eINSTANCE.createLabelConfiguration());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //LabelConfigurationTest
