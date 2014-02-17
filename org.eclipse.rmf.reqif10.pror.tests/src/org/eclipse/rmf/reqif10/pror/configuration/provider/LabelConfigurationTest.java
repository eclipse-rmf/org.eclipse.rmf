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
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationFactory;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage;
import org.eclipse.rmf.reqif10.pror.configuration.LabelConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrGeneralConfiguration;
import org.eclipse.rmf.reqif10.pror.testframework.AbstractItemProviderTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A test case for the model object '<em><b>Label Configuration</b></em>'.
 */
public class LabelConfigurationTest extends AbstractItemProviderTest {

	/**
	 * The fixture for this Label Configuration test case.
	 */
	protected LabelConfiguration fixture = null;

	/**
	 * Sets the fixture for this Label Configuration test case.
	 */
	protected void setFixture(LabelConfiguration fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Label Configuration test case.
	 */
	protected LabelConfiguration getFixture() {
		return fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		setFixture(ConfigurationFactory.eINSTANCE.createLabelConfiguration());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDown() throws Exception {
		setFixture(null);
	}
	
	@Test
	public void testLabelConfigurationNotification() throws Exception {
		ProrGeneralConfiguration config = ConfigurationFactory.eINSTANCE
				.createProrGeneralConfiguration();
		config.setLabelConfiguration(fixture);
		ItemProviderAdapter itemProvider = getItemProvider(config);
		itemProvider.addListener(listener);
		setViaCommand(
				fixture,
				ConfigurationPackage.Literals.LABEL_CONFIGURATION__DEFAULT_LABEL,
				"new label");
		assertEquals(1, notifications.size());
		assertTrue(notifications.get(0) instanceof ViewerNotification);
	}

} //LabelConfigurationTest
