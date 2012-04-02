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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.junit.After;
import org.junit.Before;

/**
 * A test case for the model object '<em><b>Attribute Value Enumeration</b></em>'.
 */
public class AttributeValueEnumerationTest extends AttributeValueTest {

	/**
	 * Returns the fixture for this Attribute Value Enumeration test case.
	 */
	@Override
	protected AttributeValueEnumeration getFixture() {
		return (AttributeValueEnumeration)fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUpAttributeValueEnumerationTest() throws Exception {
		setFixture(ReqIF10Factory.eINSTANCE.createAttributeValueEnumeration());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDownAttributeValueEnumerationTest() throws Exception {
		setFixture(null);
	}

	@Override
	public Object getValueObject() {
		BasicEList<EnumValue> values = new BasicEList<EnumValue>();
		values.add(ReqIF10Factory.eINSTANCE.createEnumValue());
		return values;
	}

} //AttributeValueEnumerationTest
