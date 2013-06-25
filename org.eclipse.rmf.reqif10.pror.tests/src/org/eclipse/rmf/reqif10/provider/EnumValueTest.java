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

import junit.framework.Assert;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.rmf.reqif10.EmbeddedValue;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A test case for the model object '<em><b>Enum Value</b></em>'.
 */
public class EnumValueTest extends IdentifiableTest {

	/**
	 * Returns the fixture for this Enum Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EnumValue getFixture() {
		return (EnumValue)fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUpEnumValueTest() throws Exception {
		setFixture(ReqIF10Factory.eINSTANCE.createEnumValue());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDownEnumValueTest() throws Exception {
		setFixture(null);
	}
	
	@Test
	public void testEmbeddedValueChangePropagation() {
		EmbeddedValue value = ReqIF10Factory.eINSTANCE.createEmbeddedValue();
		setViaCommand(getFixture(), ReqIF10Package.Literals.ENUM_VALUE__PROPERTIES, value);
		ProrUtil.getItemProvider(adapterFactory, getFixture()).addListener(listener);
		setViaCommand(value, ReqIF10Package.Literals.EMBEDDED_VALUE__KEY, new BigInteger("1"));
		Assert.assertEquals(1, notifications.size());
		setViaCommand(value, ReqIF10Package.Literals.EMBEDDED_VALUE__OTHER_CONTENT, "Other Content");
		Assert.assertEquals(2, notifications.size());
	}

	@Override
	protected EStructuralFeature getParentFeature() {
		return ReqIF10Package.eINSTANCE
				.getDatatypeDefinitionEnumeration_SpecifiedValues();
	}

	@Override
	protected EObject getParent() {
		return ReqIF10Factory.eINSTANCE.createDatatypeDefinitionEnumeration();
	}

} //EnumValueTest
