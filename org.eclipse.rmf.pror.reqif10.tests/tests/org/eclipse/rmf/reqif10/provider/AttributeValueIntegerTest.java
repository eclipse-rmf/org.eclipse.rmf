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

import java.math.BigInteger;

import org.eclipse.rmf.reqif10.AttributeValueInteger;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.junit.After;
import org.junit.Before;

/**
 * A test case for the model object '<em><b>Attribute Value Integer</b></em>'.
 */
public class AttributeValueIntegerTest extends AttributeValueSimpleTest {

	/**
	 * Returns the fixture for this Attribute Value Integer test case.
	 */
	@Override
	protected AttributeValueInteger getFixture() {
		return (AttributeValueInteger)fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUpAttributeValueIntegerTest() throws Exception {
		setFixture(ReqIF10Factory.eINSTANCE.createAttributeValueInteger());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDownAttributeValueIntegerTest() throws Exception {
		setFixture(null);
	}

	@Override
	public Object getValueObject() {
		return new BigInteger("1");
	}

} //AttributeValueIntegerTest
