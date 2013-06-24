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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.net.URISyntaxException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * A test case for the model object '<em><b>Attribute Definition</b></em>'.
 */
public abstract class AttributeDefinitionTest extends IdentifiableTest {

	private ReqIF reqif;
	private SpecType specType;

	/**
	 * Returns the fixture for this Attribute Definition test case.
	 */
	@Override
	protected AttributeDefinition getFixture() {
		return (AttributeDefinition)fixture;
	}
	
	@Before public void setupAttributeDefinitionTest() throws URISyntaxException {
		reqif = getTestReqif("simple.reqif");
		specType = reqif.getCoreContent().getSpecTypes().get(0);
	}

	@After public void tearDownAttributeDefinitionTest() {
		reqif = null;
		specType = null;
	}

	/**
	 * When we add an AttributeDefinition, the SpecType must be notified.
	 */
	@Test public void testSpecTypeNotificationOnAdd() {
		ItemProviderAdapter ip = ProrUtil.getItemProvider(adapterFactory, specType);
		ip.addListener(listener);
		specType.getSpecAttributes().add(getFixture());
		Assert.assertEquals(1, notifications.size());
	}
	
	/**
	 * When the AttributeDefinition changes, the Type must be informed.
	 * @throws URISyntaxException 
	 */
	@Test
	public void testSpecTypeNotificationOnNameChange() throws URISyntaxException {
		ReqIF reqif = getTestReqif("simple.reqif");
		SpecType type = reqif.getCoreContent().getSpecTypes().get(0);
		type.getSpecAttributes().add(getFixture());
		getItemProvider(type).addListener(listener);
		
		setViaCommand(getFixture(), ReqIF10Package.Literals.IDENTIFIABLE__LONG_NAME, "New Name");
		assertEquals("New Name", getFixture().getLongName());
		assertEquals(1, notifications.size());
		
		// Make sure the type matches.
		assertTrue(notifications.get(0).getNotifier() instanceof SpecType);
	}
	
	/**
	 * If a value of AttributeDefinition changes, then the SpecType should be notified
	 */
	@Test
	public void testAttributeDefinitionChanges() {
		SpecObjectType specType = ReqIF10Factory.eINSTANCE.createSpecObjectType();
		specType.getSpecAttributes().add(getFixture());
		ItemProviderAdapter ip = getItemProvider(specType);
		ip.addListener(listener);
		setViaCommand(getFixture(), ReqIF10Package.Literals.IDENTIFIABLE__LONG_NAME, "New Name");
		assertEquals(1, notifications.size());
	}
	
	@Override
	protected EStructuralFeature getParentFeature() {
		return ReqIF10Package.eINSTANCE.getSpecType_SpecAttributes();
	}

	@Override
	protected EObject getParent() {
		return ReqIF10Factory.eINSTANCE.createSpecObjectType();
	}

} //AttributeDefinitionTest
