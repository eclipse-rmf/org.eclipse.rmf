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

import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A test case for the model object '<em><b>Spec Hierarchy</b></em>'.
 */
public class SpecHierarchyTest extends IdentifiableTest {

	private ReqIF reqif;
	
	@Before
	public void setupReqif() throws URISyntaxException {
		reqif = getTestReqif("simple.reqif");
	}
	
	/**
	 * Returns the fixture for this Spec Hierarchy test case.
	 */
	@Override
	protected SpecHierarchy getFixture() {
		return (SpecHierarchy)fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUpSpecHierarchyTest() throws Exception {
		setFixture(ReqIF10Factory.eINSTANCE.createSpecHierarchy());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDownSpecHierarchyTest() throws Exception {
		setFixture(null);
	}
	
	/**
	 * We test that the properties for the SpecObject appear on the SpecHierarchy.
	 */
	@Test
	public void testPropertiesOfSpecElementWithAttribute() throws URISyntaxException {
		ReqIF reqif = getTestReqif("simple.reqif");
		setViaCommand(reqif.getCoreContent().getSpecifications().get(0), ReqIF10Package.Literals.SPECIFICATION__CHILDREN, getFixture());
		SpecObject specObject = reqif.getCoreContent().getSpecObjects().get(0);
		getFixture().setObject(specObject);
		ItemProviderAdapter ip = getItemProvider(getFixture());

		Set<String> expected = new HashSet<String>();
		for (IItemPropertyDescriptor prop: ip.getPropertyDescriptors(getFixture())) {
			expected.add(prop.getCategory(getFixture()) + "-" + prop.getDisplayName(getFixture()));			
		}
		
		AttributeDefinitionString ad = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		adapterFactory.adapt(ad, IItemLabelProvider.class);
		adapterFactory.adapt(specObject.getType(), IItemLabelProvider.class);
		adapterFactory.adapt(specObject, IItemLabelProvider.class);
		adapterFactory.adapt(getFixture(), IItemLabelProvider.class);

		ad.setLongName("New");
		setViaCommand(specObject.getType(), ReqIF10Package.Literals.SPEC_TYPE__SPEC_ATTRIBUTES, ad);
		
		assertEquals(expected.size() + 1, ip.getPropertyDescriptors(getFixture()).size());
		
		// Set of actuals
		Set<String> actual = new HashSet<String>();
		for (IItemPropertyDescriptor prop: ip.getPropertyDescriptors(getFixture())) {
			actual.add(prop.getCategory(getFixture()) + "-" + prop.getDisplayName(getFixture()));			
		}

		// Set of expected
		expected.add("Example SpecType-New");
		assertEquals(expected, actual);
	}

	@Override
	protected EStructuralFeature getParentFeature() {
		return ReqIF10Package.eINSTANCE.getSpecification_Children();
	}

	@Override
	protected EObject getParent() {
		return reqif.getCoreContent().getSpecifications().get(0);
	}

	/**
	 * Make sure that the lastChanged attribute is set after moving the
	 * {@link SpecHierarchy}.
	 * 
	 * @throws URISyntaxException
	 */
	@Test
	public void testSetLastChangeAfterMoving() {
		// FIXME: Implement me!!!
	}
	
} //SpecHierarchyTest
