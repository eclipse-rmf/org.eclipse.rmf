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

import org.eclipse.rmf.reqif10.AttributeDefinitionBoolean;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.junit.After;
import org.junit.Before;

/**
 * A test case for the model object '<em><b>Attribute Definition Boolean</b></em>'.
 */
public class AttributeDefinitionBooleanTest extends AttributeDefinitionSimpleTest {

	/**
	 * Returns the fixture for this Attribute Definition Boolean test case.
	 */
	protected AttributeDefinitionBoolean getFixture() {
		return (AttributeDefinitionBoolean)fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUpAttributeDefinitionBooleanTest() throws Exception {
		setFixture(ReqIF10Factory.eINSTANCE.createAttributeDefinitionBoolean());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDownAttributeDefinitionBooleanTest() throws Exception {
		setFixture(null);
	}

} //AttributeDefinitionBooleanTest
