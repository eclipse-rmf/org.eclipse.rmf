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
import org.eclipse.rmf.reqif10.SpecRelationType;
import org.junit.After;
import org.junit.Before;

/**
 * A test case for the model object '<em><b>Spec Relation Type</b></em>'.
 */
public class SpecRelationTypeTest extends SpecTypeTest {

	/**
	 * Returns the fixture for this Spec Relation Type test case.
	 */
	@Override
	protected SpecRelationType getFixture() {
		return (SpecRelationType)fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		setFixture(ReqIF10Factory.eINSTANCE.createSpecRelationType());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDown() throws Exception {
		setFixture(null);
	}

} //SpecRelationTypeTest
