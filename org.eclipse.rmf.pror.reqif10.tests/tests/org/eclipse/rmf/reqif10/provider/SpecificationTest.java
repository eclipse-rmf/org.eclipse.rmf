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
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.rmf.pror.reqif10.provider.VirtualSpecificationsItemProvider;
import org.eclipse.rmf.pror.reqif10.util.ProrUtil;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.SpecificationType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A test case for the model object '<em><b>Spec Hierarchy Root</b></em>'.
 */
public class SpecificationTest extends SpecElementWithAttributesTest {

	/**
	 * Returns the fixture for this Spec Hierarchy Root test case.
	 */
	@Override
	protected Specification getFixture() {
		return (Specification)fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUpSpecificationTest() throws Exception {
		setFixture(ReqIF10Factory.eINSTANCE.createSpecification());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDownSpecificationTest() throws Exception {
		setFixture(null);
	}

	@Override
	protected void addFixtureToReqIf(ReqIF rif) {
		setViaCommand(rif.getCoreContent(), ReqIF10Package.Literals.REQ_IF_CONTENT__SPECIFICATIONS, getFixture());
	}
	
	@Override
	protected Set<String> getStandardPropertyNames() {
		return new HashSet<String>(Arrays.asList(STANDARD_PROPERTIES));
	}

	@Override
	protected void setSpecTypeWithAttributeOnFixture(ReqIF reqif,
			AttributeDefinition ad) {
		SpecificationType type = ReqIF10Factory.eINSTANCE.createSpecificationType();
		setViaCommand(type, ReqIF10Package.Literals.SPEC_TYPE__SPEC_ATTRIBUTES, ad);
		setViaCommand(reqif.getCoreContent(), ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_TYPES, type);
		setViaCommand(getFixture(), ReqIF10Package.Literals.SPECIFICATION__TYPE, type);
	}

	@Override
	protected void setFixtureType(SpecElementWithAttributes specElement,
			SpecType specType) {
		setViaCommand(specElement, ReqIF10Package.Literals.SPECIFICATION__TYPE, specType);
	}
	
	@Test
	public void testParentIsVirtual() throws URISyntaxException {
		ReqIF reqif = getTestReqif("simple.reqif");
		// Required for generating the Virtual Element lazily.
		getItemProvider(reqif.getCoreContent()).getChildren(reqif.getCoreContent());

		setViaCommand(reqif.getCoreContent(), ReqIF10Package.Literals.REQ_IF_CONTENT__SPECIFICATIONS, getFixture());
		ItemProviderAdapter ip = ProrUtil.getItemProvider(adapterFactory, getFixture());
		assertTrue(ip.getParent(getFixture()) instanceof VirtualSpecificationsItemProvider);
	}
	
	/**
	 * This test is a little fragile, as we make assumptions about the order of commands.
	 */
	@Test
	public void testCreateChildSpecObject() throws URISyntaxException {
		ReqIF reqif = getTestReqif("simple.reqif");
		setViaCommand(reqif.getCoreContent(), ReqIF10Package.Literals.REQ_IF_CONTENT__SPECIFICATIONS, getFixture());
		ItemProviderAdapter ip = ProrUtil.getItemProvider(adapterFactory, getFixture());
		List<?> cds = (List<?>) ip.getNewChildDescriptors(getFixture(), editingDomain, null);

		// Relies on Command order
		Object specObjectChildDescriptor = cds.get(2);
		
		Command cmd = ip.createCommand(getFixture(), editingDomain,
				CreateChildCommand.class, new CommandParameter(getFixture(),
						ReqIF10Package.Literals.SPECIFICATION__CHILDREN,
						specObjectChildDescriptor));

		int specObjectCount = reqif.getCoreContent().getSpecObjects().size();
		commandStack.execute(cmd);
		assertEquals(1, getFixture().getChildren().size());
		assertEquals(1, cmd.getAffectedObjects().size());
		assertEquals(getFixture().getChildren().get(0), cmd.getAffectedObjects().iterator().next());
		assertEquals(specObjectCount + 1, reqif.getCoreContent().getSpecObjects().size());
	}


} //SpecificationTest
