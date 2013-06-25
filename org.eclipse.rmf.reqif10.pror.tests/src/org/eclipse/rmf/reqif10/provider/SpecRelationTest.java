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

import static org.junit.Assert.assertTrue;

import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import junit.framework.Assert;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.pror.provider.VirtualSpecRelationsItemProvider;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A test case for the model object '<em><b>Spec Relation</b></em>'.
 */
public class SpecRelationTest extends SpecElementWithAttributesTest {
	
	/**
	 * Returns the fixture for this Spec Relation test case.
	 */
	@Override
	protected SpecRelation getFixture() {
		return (SpecRelation)fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUpSpecRelationTest() throws Exception {
		setFixture(ReqIF10Factory.eINSTANCE.createSpecRelation());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDownSpecRelationTest() throws Exception {
		setFixture(null);
	}

	@Override
	protected void addFixtureToReqIf(ReqIF reqif) {
		setViaCommand(reqif.getCoreContent(), ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_RELATIONS, getFixture());
	}
	
	@Override
	protected Set<String> getStandardPropertyNames() {
		Set<String> set = new HashSet<String>(Arrays.asList(STANDARD_PROPERTIES));
		set.add("Source");
		set.add("Target");
		return set;
	}
	
	@Override
	protected void setFixtureType(SpecElementWithAttributes specElement,
			SpecType specType) {
		setViaCommand(specElement, ReqIF10Package.Literals.SPEC_RELATION__TYPE, specType);
	}

	@Test
	public void testParentIsVirtual() throws URISyntaxException {
		ReqIF reqif = getTestReqif("simple.reqif");
		// Required for generating the Virtual Element lazily.
		getItemProvider(reqif.getCoreContent()).getChildren(reqif.getCoreContent());

		setViaCommand(reqif.getCoreContent(), ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_RELATIONS, getFixture());
		ItemProviderAdapter ip = ProrUtil.getItemProvider(adapterFactory, getFixture());
		assertTrue(ip.getParent(getFixture()) instanceof VirtualSpecRelationsItemProvider);
	}

	@Override
	protected SpecType getSpecTypeInstance() {
		return ReqIF10Factory.eINSTANCE.createSpecRelationType();
	}
	
	/**
	 * Make sure that the lastChanged attribute is set after creating the
	 * object.
	 * 
	 * @throws URISyntaxException
	 */
	@Test
	public void testSetLastChangeAfterCreation() throws URISyntaxException {
		ReqIF reqif = getTestReqif("simple.reqif");
		Identifiable id = getFixture();
		setViaCommand(reqif.getCoreContent(),
				ReqIF10Package.eINSTANCE.getReqIFContent_SpecRelations(), id);
		Assert.assertNotNull(id.getLastChange());
	}
	
	@Override
	protected EStructuralFeature getParentFeature() {
		return ReqIF10Package.eINSTANCE.getReqIFContent_SpecRelations();
	}

} //SpecRelationTest
