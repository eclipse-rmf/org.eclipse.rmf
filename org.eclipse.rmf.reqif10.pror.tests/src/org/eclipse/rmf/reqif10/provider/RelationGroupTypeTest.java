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

import org.eclipse.rmf.reqif10.RelationGroupType;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.junit.After;
import org.junit.Before;

/**
 * A test case for the model object '<em><b>Relation Group Type</b></em>'.
 */
public class RelationGroupTypeTest extends SpecTypeTest {

	/**
	 * Returns the fixture for this Relation Group Type test case.
	 */
	@Override
	protected RelationGroupType getFixture() {
		return (RelationGroupType)fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUpRelationGroupTypeTest() throws Exception {
		setFixture(ReqIF10Factory.eINSTANCE.createRelationGroupType());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDownRelationGroupTypeTest() throws Exception {
		setFixture(null);
	}

} //RelationGroupTypeTest
