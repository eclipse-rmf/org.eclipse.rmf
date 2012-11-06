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
import org.eclipse.rmf.reqif10.ReqIFHeader;
import org.eclipse.rmf.reqif10.pror.testframework.AbstractItemProviderTest;
import org.junit.After;
import org.junit.Before;

/**
 * A test case for the model object '<em><b>Req If Header</b></em>'.
 */
public class ReqIfHeaderTest extends AbstractItemProviderTest {

	/**
	 * The fixture for this Req If Header test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReqIFHeader fixture = null;

	/**
	 * Sets the fixture for this Req If Header test case.
	 */
	protected void setFixture(ReqIFHeader fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Req If Header test case.
	 */
	protected ReqIFHeader getFixture() {
		return fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	protected void setUpReqIfHeaderTest() throws Exception {
		setFixture(ReqIF10Factory.eINSTANCE.createReqIFHeader());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	protected void tearDownReqIfHeaderTest() throws Exception {
		setFixture(null);
	}

} //ReqIfHeaderTest
