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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.rmf.reqif10.RelationGroup;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.pror.provider.VirtualSpecRelationGroupItemProvider;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A test case for the model object '<em><b>Relation Group</b></em>'.
 */
public class RelationGroupTest extends IdentifiableTest {

	private ReqIF reqif;
	
	@Before
	public void setupReqif() throws URISyntaxException {
		reqif = getTestReqif("simple.reqif");
	}
	
	/**
	 * Returns the fixture for this Relation Group test case.
	 */
	@Override
	protected RelationGroup getFixture() {
		return (RelationGroup)fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUpRelationGroupTest() throws Exception {
		setFixture(ReqIF10Factory.eINSTANCE.createRelationGroup());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDownRelationGroupTest() throws Exception {
		setFixture(null);
	}
	
	@Test
	public void testParentIsVirtual() throws URISyntaxException {
		ReqIF reqif = getTestReqif("simple.reqif");
		// Required for generating the Virtual Element lazily.
		getItemProvider(reqif.getCoreContent()).getChildren(reqif.getCoreContent());

		setViaCommand(reqif.getCoreContent(), ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_RELATION_GROUPS, getFixture());
		ItemProviderAdapter ip = ProrUtil.getItemProvider(adapterFactory, getFixture());
		assertTrue(ip.getParent(getFixture()) instanceof VirtualSpecRelationGroupItemProvider);
	}

	@Override
	protected EStructuralFeature getParentFeature() {
		return ReqIF10Package.eINSTANCE.getReqIFContent_SpecRelationGroups();
	}

	@Override
	protected EObject getParent() {
		return reqif.getCoreContent();
	}

} //RelationGroupTest
