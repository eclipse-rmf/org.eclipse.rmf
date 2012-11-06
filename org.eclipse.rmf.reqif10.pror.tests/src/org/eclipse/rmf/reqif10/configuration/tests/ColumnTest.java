/*******************************************************************************
 * Copyright (c) 2012 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.configuration.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.rmf.reqif10.pror.configuration.Column;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationFactory;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage;
import org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration;
import org.eclipse.rmf.reqif10.pror.testframework.AbstractItemProviderTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A test case for the model object '<em><b>Column</b></em>'.
 */
public class ColumnTest extends AbstractItemProviderTest {

	/**
	 * The fixture for this Column test case.
	 */
	protected Column fixture = null;

	/**
	 * Sets the fixture for this Column test case.
	 */
	protected void setFixture(Column fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Column test case.
	 */
	protected Column getFixture() {
		return fixture;
	}

	/**
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		setFixture(ConfigurationFactory.eINSTANCE.createColumn());
	}

	/**
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDown() throws Exception {
		setFixture(null);
	}
	
	@Test
	public void testLabelNotification() throws Exception {
		ProrSpecViewConfiguration specViewConfig = ConfigurationFactory.eINSTANCE
				.createProrSpecViewConfiguration();
		specViewConfig.getColumns().add(fixture);
		ItemProviderAdapter itemProvider = getItemProvider(specViewConfig);
		itemProvider.addListener(listener);
		setViaCommand(fixture, ConfigurationPackage.Literals.COLUMN__LABEL, "new label");
		assertEquals(1, notifications.size());
		assertTrue(notifications.get(0) instanceof ViewerNotification);
		assertTrue(((ViewerNotification)notifications.get(0)).isLabelUpdate());
	}
	
} //ColumnTest
