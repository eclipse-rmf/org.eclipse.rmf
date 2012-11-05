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
package org.eclipse.rmf.reqif10.pror.util;

import static org.junit.Assert.*;

import java.net.URISyntaxException;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.common.util.ReqIFToolExtensionUtil;
import org.eclipse.rmf.reqif10.pror.configuration.Column;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationFactory;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage;
import org.eclipse.rmf.reqif10.pror.configuration.ProrGeneralConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfigurations;
import org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension;
import org.eclipse.rmf.reqif10.pror.testframework.AbstractItemProviderTest;
import org.eclipse.rmf.reqif10.pror.util.ConfigurationUtil;
import org.junit.Test;

public class ConfigurationUtilTest extends AbstractItemProviderTest {
	
	@Test
	public void testGetProrToolExtensionNothingThere() throws URISyntaxException {
		ReqIF reqif = getTestReqif("simple.reqif");
		assertEquals(0, reqif.getToolExtensions().size());
		assertNotNull(ConfigurationUtil.createProrToolExtension(reqif, editingDomain));
		assertEquals(1, reqif.getToolExtensions().size());
	}

	@Test
	public void testGetProrToolExtensionAlreadyThere() throws URISyntaxException {
		ReqIF reqif = getTestReqif("simple.reqif");
		ProrToolExtension extension = ConfigurationFactory.eINSTANCE.createProrToolExtension();
		commandStack.execute(ReqIFToolExtensionUtil.getAddToolExtensionCommand(reqif, extension));
		assertEquals(1, reqif.getToolExtensions().size());
		
		ProrToolExtension retrieved = ConfigurationUtil.createProrToolExtension(reqif, editingDomain);
		assertEquals(1, reqif.getToolExtensions().size());
		assertSame(extension, retrieved);
	}

	@Test
	public void testGetProrToolExtensionAnotherOneThere() throws URISyntaxException {
		ReqIF reqif = getTestReqif("simple.reqif");
		EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
		commandStack.execute(ReqIFToolExtensionUtil.getAddToolExtensionCommand(reqif, ePackage));
		assertEquals(1, reqif.getToolExtensions().size());
		
		assertNotNull(ConfigurationUtil.createProrToolExtension(reqif, editingDomain));
		assertEquals(2, reqif.getToolExtensions().size());
	}
	
	@Test
	public void testGetDefaultLabelsNothingThere() throws URISyntaxException {
		ReqIF reqif = getTestReqif("simple.reqif");
		List<String> labels = ConfigurationUtil.getDefaultLabels(reqif);
		assertEquals(0, labels.size());
	}

	@Test
	public void testGetDefaultLabelsOnlyGeneralConfigThere() throws URISyntaxException {
		ReqIF reqif = getTestReqif("simple.reqif");
		ProrToolExtension extension = ConfigurationFactory.eINSTANCE.createProrToolExtension();
		commandStack.execute(ReqIFToolExtensionUtil.getAddToolExtensionCommand(reqif, extension));
		ProrGeneralConfiguration generalConfig = ConfigurationFactory.eINSTANCE.createProrGeneralConfiguration();
		setViaCommand(extension, ConfigurationPackage.Literals.PROR_TOOL_EXTENSION__GENERAL_CONFIGURATION, generalConfig);
		
		assertNull(generalConfig.getLabelConfiguration());
		List<String> labels = ConfigurationUtil.getDefaultLabels(reqif);
		assertEquals(0, labels.size());
	}

	@Test
	public void testGetLeftHeaderColumn() throws URISyntaxException {
		ReqIF reqif = getTestReqif("simple.reqif");
		Specification specification = reqif.getCoreContent()
				.getSpecifications().get(0);
		Column leftHeaderColumn = ConfigurationUtil.getLeftHeaderColumn(specification, editingDomain);
		assertNotNull(leftHeaderColumn);
	}

	/**
	 * Adds stepwise the hierarchy until there actually is a
	 * {@link ProrPresentationConfigurations} element. At no point must be there
	 * an exception.
	 */
	@Test
	public void testGetPresentationConfigurations() {
		ReqIF reqif = ReqIF10Factory.eINSTANCE.createReqIF();
		assertNull(ConfigurationUtil.getPresentationConfigurations(reqif));

		ProrToolExtension toolExtension = ConfigurationFactory.eINSTANCE
				.createProrToolExtension();
		reqif.getToolExtensions().add(toolExtension);
		setViaCommand(reqif, ReqIF10Package.Literals.REQ_IF__TOOL_EXTENSIONS,
				toolExtension);
		assertNull(ConfigurationUtil.getPresentationConfigurations(reqif));

		ProrPresentationConfigurations configurations = ConfigurationFactory.eINSTANCE
				.createProrPresentationConfigurations();
		toolExtension.setPresentationConfigurations(configurations);
		assertNotNull(ConfigurationUtil.getPresentationConfigurations(reqif));
	}

}
