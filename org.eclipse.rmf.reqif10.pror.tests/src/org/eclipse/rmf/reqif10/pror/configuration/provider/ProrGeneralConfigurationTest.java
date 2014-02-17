/*******************************************************************************
 * Copyright (c) 2012, 2014 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.pror.configuration.provider;

import static org.junit.Assert.assertEquals;

import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.common.util.ReqIFToolExtensionUtil;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationFactory;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage;
import org.eclipse.rmf.reqif10.pror.configuration.LabelConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrGeneralConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension;
import org.eclipse.rmf.reqif10.pror.testframework.AbstractItemProviderTest;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A test case for the model object '<em><b>Pror General Configuration</b></em>'.
 */
public class ProrGeneralConfigurationTest extends AbstractItemProviderTest {

	/**
	 * The fixture for this Pror General Configuration test case.
	 */
	protected ProrGeneralConfiguration fixture = null;

	/**
	 * Sets the fixture for this Pror General Configuration test case.
	 */
	protected void setFixture(ProrGeneralConfiguration fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Pror General Configuration test case.
	 */
	protected ProrGeneralConfiguration getFixture() {
		return fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		setFixture(ConfigurationFactory.eINSTANCE.createProrGeneralConfiguration());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Test whether changing a label is propagated to the {@link SpecObject}s.
	 */
	@Test
	public void testNotifySpecObjects() throws Exception {
				
		ReqIF reqif = getTestReqif("simple.reqif");
		ProrToolExtension toolExtension = ConfigurationFactory.eINSTANCE
				.createProrToolExtension();
		toolExtension.setGeneralConfiguration(fixture);
		ReqIFToolExtensionUtil.addToolExtension(reqif, toolExtension);

		// We listen to the SpecObject, as it should be notified if the labels change.
		SpecObject specObject = reqif.getCoreContent().getSpecObjects().get(0);
		ItemProviderAdapter ip = ProrUtil.getItemProvider(adapterFactory, specObject);
		ip.addListener(listener);
		assertEquals(0, notifications.size());
		
		LabelConfiguration labelConfiguration = ConfigurationFactory.eINSTANCE.createLabelConfiguration();
		labelConfiguration.getDefaultLabel().add("Foo");

		// Add the labelConfiguration
		setViaCommand(
				fixture,
				ConfigurationPackage.Literals.PROR_GENERAL_CONFIGURATION__LABEL_CONFIGURATION,
				labelConfiguration);
		assertEquals(1, notifications.size());

		// Change the labelConfiguration
		setViaCommand(
				labelConfiguration,
				ConfigurationPackage.Literals.LABEL_CONFIGURATION__DEFAULT_LABEL,
				"Bar");
		assertEquals(2, notifications.size());
}

	/**
	 * ReqIF
	 * +-ToolExtensions
	 *   +-ProrToolExtension
	 *     +-ProRGeneralConfiguration
	 * @throws Exception
	 */
	@Test
	public void testNotifyOnChange() throws Exception {
		ReqIF reqif = getTestReqif("simple.reqif");
		ProrToolExtension toolExtension = ConfigurationFactory.eINSTANCE
				.createProrToolExtension();
		toolExtension.setGeneralConfiguration(fixture);
		ReqIFToolExtensionUtil.addToolExtension(reqif, toolExtension);
		ProrUtil.getItemProvider(adapterFactory, fixture).addListener(listener);
		assertEquals(0, notifications.size());
		
		LabelConfiguration labelConfiguration = ConfigurationFactory.eINSTANCE
				.createLabelConfiguration();
		fixture.setLabelConfiguration(labelConfiguration);
		assertEquals(1, notifications.size());

	}

} //ProrGeneralConfigurationTest
