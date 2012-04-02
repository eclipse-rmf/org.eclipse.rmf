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

import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.junit.After;
import org.junit.Before;

/**
 * A test case for the model object '<em><b>Spec Object Type</b></em>'.
 */
public class SpecObjectTypeTest extends SpecTypeTest {

	/**
	 * Returns the fixture for this Spec Object Type test case.
	 */
	@Override
	protected SpecObjectType getFixture() {
		return (SpecObjectType)fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUpSpecObjectTypeTest() throws Exception {
		setFixture(ReqIF10Factory.eINSTANCE.createSpecObjectType());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDownSpecObjectTypeTest() throws Exception {
		setFixture(null);
	}

} //SpecObjectTypeTest
