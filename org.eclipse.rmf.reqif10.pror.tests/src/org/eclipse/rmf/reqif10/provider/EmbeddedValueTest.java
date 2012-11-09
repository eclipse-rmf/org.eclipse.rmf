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

import org.eclipse.rmf.reqif10.EmbeddedValue;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.pror.testframework.AbstractItemProviderTest;
import org.junit.After;
import org.junit.Before;

/**
 * A test case for the model object '<em><b>Embedded Value</b></em>'.
 */
public class EmbeddedValueTest extends AbstractItemProviderTest {

	/**
	 * The fixture for this Embedded Value test case.
	 */
	protected EmbeddedValue fixture = null;

	/**
	 * Sets the fixture for this Embedded Value test case.
	 */
	protected void setFixture(EmbeddedValue fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Embedded Value test case.
	 */
	protected EmbeddedValue getFixture() {
		return fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUpEmbeddedValueTest() throws Exception {
		setFixture(ReqIF10Factory.eINSTANCE.createEmbeddedValue());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDownEmbeddedValueTest() throws Exception {
		setFixture(null);
	}

} //EmbeddedValueTest
