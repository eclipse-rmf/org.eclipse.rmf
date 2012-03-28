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
package org.eclipse.rmf.pror.reqif10.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import java.net.URISyntaxException;
import java.util.List;

import org.eclipse.rmf.pror.reqif10.configuration.Column;
import org.eclipse.rmf.pror.reqif10.configuration.ConfigFactory;
import org.eclipse.rmf.pror.reqif10.configuration.ConfigPackage;
import org.eclipse.rmf.pror.reqif10.configuration.ProrGeneralConfiguration;
import org.eclipse.rmf.pror.reqif10.configuration.ProrToolExtension;
import org.eclipse.rmf.pror.reqif10.testframework.AbstractItemProviderTest;
import org.eclipse.rmf.reqif10.ReqIf;
import org.eclipse.rmf.reqif10.ReqIfToolExtension;
import org.eclipse.rmf.reqif10.Reqif10Factory;
import org.eclipse.rmf.reqif10.Reqif10Package;
import org.eclipse.rmf.reqif10.Specification;
import org.junit.Test;

public class ConfigUtilTest extends AbstractItemProviderTest {
	
	@Test
	public void testGetProrToolExtensionNothingThere() throws URISyntaxException {
		ReqIf reqif = getTestReqif("simple.reqif");
		assertEquals(0, reqif.getToolExtensions().size());
		assertNotNull(ConfigurationUtil.getProrToolExtension(reqif, editingDomain));
	}

	@Test
	public void testGetProrToolExtensionAlreadyThere() throws URISyntaxException {
		ReqIf reqif = getTestReqif("simple.reqif");
		ProrToolExtension extension = ConfigFactory.eINSTANCE.createProrToolExtension();
		setViaCommand(reqif, Reqif10Package.Literals.REQ_IF__TOOL_EXTENSIONS, extension );
		assertEquals(1, reqif.getToolExtensions().size());
		
		ProrToolExtension retrieved = ConfigurationUtil.getProrToolExtension(reqif, editingDomain);
		assertEquals(1, reqif.getToolExtensions().size());
		assertSame(extension, retrieved);
	}

	@Test
	public void testGetProrToolExtensionAnotherOneThere() throws URISyntaxException {
		ReqIf reqif = getTestReqif("simple.reqif");
		ReqIfToolExtension extension = Reqif10Factory.eINSTANCE.createReqIfToolExtension();
		setViaCommand(reqif, Reqif10Package.Literals.REQ_IF__TOOL_EXTENSIONS,
				extension);
		assertEquals(1, reqif.getToolExtensions().size());
		
		assertNotNull(ConfigurationUtil.getProrToolExtension(reqif, editingDomain));
	}
	
	@Test
	public void testGetDefaultLabelsNothingThere() throws URISyntaxException {
		ReqIf reqif = getTestReqif("simple.reqif");
		List<String> labels = ConfigurationUtil.getDefaultLabels(reqif);
		assertEquals(0, labels.size());
	}

	@Test
	public void testGetDefaultLabelsOnlyGeneralConfigThere() throws URISyntaxException {
		ReqIf reqif = getTestReqif("simple.reqif");
		ReqIfToolExtension extension = Reqif10Factory.eINSTANCE.createReqIfToolExtension();
		setViaCommand(reqif, Reqif10Package.Literals.REQ_IF__TOOL_EXTENSIONS,
				extension);
		ProrGeneralConfiguration generalConfig = ConfigFactory.eINSTANCE.createProrGeneralConfiguration();
		setViaCommand(extension, ConfigPackage.Literals.PROR_TOOL_EXTENSION__GENERAL_CONFIGURATION, generalConfig);
		
		assertNull(generalConfig.getLabelConfiguration());
		List<String> labels = ConfigurationUtil.getDefaultLabels(reqif);
		assertEquals(0, labels.size());
	}

	@Test
	public void testGetLeftHeaderColumn() throws URISyntaxException {
		ReqIf reqif = getTestReqif("simple.reqif");
		Specification specification = reqif.getCoreContent()
				.getSpecifications().get(0);
		Column leftHeaderColumn = ConfigurationUtil.getLeftHeaderColumn(specification, editingDomain);
		assertNotNull(leftHeaderColumn);
	}

}
