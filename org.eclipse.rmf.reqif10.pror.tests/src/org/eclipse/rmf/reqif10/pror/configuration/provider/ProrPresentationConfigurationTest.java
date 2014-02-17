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

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationFactory;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfigurations;
import org.eclipse.rmf.reqif10.pror.testframework.AbstractItemProviderTest;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.junit.Test;

/**
 * A test case for the model object '<em><b>Pror Presentation Configuration</b></em>'.
 */
public abstract class ProrPresentationConfigurationTest extends AbstractItemProviderTest {

	/**
	 * The fixture for this Pror Presentation Configuration test case.
	 */
	protected ProrPresentationConfiguration fixture = null;

	/**
	 * Sets the fixture for this Pror Presentation Configuration test case.
	 */
	protected void setFixture(ProrPresentationConfiguration fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Pror Presentation Configuration test case.
	 */
	protected ProrPresentationConfiguration getFixture() {
		return fixture;
	}

	
	/**
	 * Must create a new {@link AdapterFactory} for the Presentation to be tested, e.g.
	 * <pre>
	 * return new LinewrapItemProviderAdapterFactory();
	 * </pre>
	 */
	abstract AdapterFactory createAdapterFactory();	

	@Test
	public void testTypeNotifications() {
		adapterFactory
				.addAdapterFactory(createAdapterFactory());
		ProrPresentationConfigurations configs = ConfigurationFactory.eINSTANCE
				.createProrPresentationConfigurations();
		ProrPresentationConfigurationsItemProvider ip = (ProrPresentationConfigurationsItemProvider) ProrUtil
				.getItemProvider(adapterFactory, configs);
		ip.setEditingDomain(editingDomain);
		setViaCommand(
				configs,
				ConfigurationPackage.Literals.PROR_PRESENTATION_CONFIGURATIONS__PRESENTATION_CONFIGURATIONS,
				fixture);
		assertEquals(fixture, configs.getPresentationConfigurations().get(0));

		this.getItemProvider(fixture).addListener(listener);
		DatatypeDefinition dd = ReqIF10Factory.eINSTANCE
				.createDatatypeDefinitionString();
		setViaCommand(
				fixture,
				ConfigurationPackage.Literals.PROR_PRESENTATION_CONFIGURATION__DATATYPE,
				dd);
		assertEquals(dd, fixture.getDatatype());
		assertEquals(1, this.notifications.size());
	}

} //ProrPresentationConfigurationTest
