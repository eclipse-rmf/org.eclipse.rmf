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

import org.eclipse.rmf.reqif10.AccessControlledElement;
import org.junit.After;

/**
 * A test case for the model object '<em><b>Access Policy</b></em>'.
 */
public abstract class AccessControlledElementTest extends IdentifiableTest {

	/**
	 * Returns the fixture for this Access Policy test case.
	 */
	@Override
	protected AccessControlledElement getFixture() {
		return (AccessControlledElement)fixture;
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDownAccessControlledElementTest() throws Exception {
		setFixture(null);
	}

} //AccessControlledElementTest
