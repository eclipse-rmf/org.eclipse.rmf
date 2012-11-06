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

import org.eclipse.rmf.reqif10.AttributeDefinitionInteger;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.junit.After;
import org.junit.Before;

/**
 * A test case for the model object '<em><b>Attribute Definition Integer</b></em>'.
 */
public class AttributeDefinitionIntegerTest extends AttributeDefinitionSimpleTest {

	/**
	 * Returns the fixture for this Attribute Definition Integer test case.
	 */
	@Override
	protected AttributeDefinitionInteger getFixture() {
		return (AttributeDefinitionInteger)fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUpAttributeDefinitionIntegerTest() throws Exception {
		setFixture(ReqIF10Factory.eINSTANCE.createAttributeDefinitionInteger());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDownAttributeDefinitionIntegerTest() throws Exception {
		setFixture(null);
	}

} //AttributeDefinitionIntegerTest
