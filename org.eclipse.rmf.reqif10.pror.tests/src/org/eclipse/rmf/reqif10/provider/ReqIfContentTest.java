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
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.pror.testframework.AbstractItemProviderTest;
import org.junit.After;
import org.junit.Before;

/**
 * A test case for the model object '<em><b>Req If Content</b></em>'.
 */
public class ReqIfContentTest extends AbstractItemProviderTest {

	/**
	 * The fixture for this Req If Content test case.
	 */
	protected ReqIFContent fixture = null;

	/**
	 * Sets the fixture for this Req If Content test case.
	 */
	protected void setFixture(ReqIFContent fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Req If Content test case.
	 */
	protected ReqIFContent getFixture() {
		return fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUpReqIfContentTest() throws Exception {
		setFixture(ReqIF10Factory.eINSTANCE.createReqIFContent());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDownReqIfContentTest() throws Exception {
		setFixture(null);
	}
	
} //ReqIfContentTest
