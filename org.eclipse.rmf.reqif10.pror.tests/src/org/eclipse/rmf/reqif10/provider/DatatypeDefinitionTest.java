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

import junit.framework.Assert;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.pror.provider.VirtualDatatypeDefinitionItemProvider;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.junit.Before;
import org.junit.Test;

/**
 * A test case for the model object '<em><b>Datatype Definition</b></em>'.
 */
public abstract class DatatypeDefinitionTest extends IdentifiableTest {

	private ReqIF reqif;
	
	/**
	 * Returns the fixture for this Datatype Definition test case.
	 */
	@Override
	protected DatatypeDefinition getFixture() {
		return (DatatypeDefinition)fixture;
	}
	
	@Before
	public void setupReqif() throws URISyntaxException {
		reqif = getTestReqif("simple.reqif");
	}
	
	@Test
	public void testParentIsVirtual() throws URISyntaxException {
		ReqIF reqif = getTestReqif("simple.reqif");
		// Required for generating the Virtual Element lazily.
		getItemProvider(reqif.getCoreContent()).getChildren(reqif.getCoreContent());
		
		setViaCommand(reqif.getCoreContent(), ReqIF10Package.Literals.REQ_IF_CONTENT__DATATYPES, getFixture());
		ItemProviderAdapter ip = ProrUtil.getItemProvider(adapterFactory, getFixture());
		assertTrue(ip.getParent(getFixture()) instanceof VirtualDatatypeDefinitionItemProvider);
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
				ReqIF10Package.eINSTANCE.getReqIFContent_Datatypes(), id);
		Assert.assertNotNull(id.getLastChange());
	}

	@Override
	protected EStructuralFeature getParentFeature() {
		return ReqIF10Package.eINSTANCE.getReqIFContent_Datatypes();
	}

	@Override
	protected EObject getParent() {
		return reqif.getCoreContent();
	}
	
} //DatatypeDefinitionTest
