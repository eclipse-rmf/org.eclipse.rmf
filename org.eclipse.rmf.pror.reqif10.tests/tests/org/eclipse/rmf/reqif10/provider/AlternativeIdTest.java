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

import org.eclipse.rmf.pror.reqif10.testframework.AbstractItemProviderTest;
import org.eclipse.rmf.reqif10.AlternativeId;
import org.eclipse.rmf.reqif10.Reqif10Factory;

/**
 * A test case for the model object '<em><b>Alternative Id</b></em>'.
 */
public class AlternativeIdTest extends AbstractItemProviderTest {

	/**
	 * The fixture for this Alternative Id test case.
	 */
	protected AlternativeId fixture = null;

	/**
	 * Sets the fixture for this Alternative Id test case.
	 */
	protected void setFixture(AlternativeId fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Alternative Id test case.
	 */
	protected AlternativeId getFixture() {
		return fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUpAlternativeIdTest() throws Exception {
		setFixture(Reqif10Factory.eINSTANCE.createAlternativeId());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDownAlternativeIdTest() throws Exception {
		setFixture(null);
	}

} //AlternativeIdTest
