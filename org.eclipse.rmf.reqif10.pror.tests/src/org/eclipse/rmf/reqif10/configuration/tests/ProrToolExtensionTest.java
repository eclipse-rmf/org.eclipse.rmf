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
import org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension;
import org.eclipse.rmf.reqif10.pror.testframework.AbstractItemProviderTest;
import org.junit.After;
import org.junit.Before;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Pror Tool Extension</b></em>'.
 * <!-- end-user-doc -->
 */
public class ProrToolExtensionTest extends AbstractItemProviderTest {

	/**
	 * The fixture for this Pror Tool Extension test case.
	 */
	protected ProrToolExtension fixture = null;

	/**
	 * Sets the fixture for this Alternative Id test case.
	 */
	protected void setFixture(ProrToolExtension fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Pror Tool Extension test case.
	 */
	protected ProrToolExtension getFixture() {
		return (ProrToolExtension)fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	protected void setUp() throws Exception {
		setFixture(ConfigurationFactory.eINSTANCE.createProrToolExtension());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ProrToolExtensionTest
