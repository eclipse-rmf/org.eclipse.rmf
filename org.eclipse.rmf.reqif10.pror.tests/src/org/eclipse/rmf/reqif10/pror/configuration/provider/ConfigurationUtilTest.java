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
package org.eclipse.rmf.reqif10.pror.configuration.provider;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIFToolExtension;
import org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension;
import org.eclipse.rmf.reqif10.pror.testframework.AbstractItemProviderTest;
import org.eclipse.rmf.reqif10.pror.util.ConfigurationUtil;
import org.junit.Test;

public class ConfigurationUtilTest extends AbstractItemProviderTest {

	@Test
	public void testCreateProrToolExtension() {
		ReqIF reqif = ReqIF10Factory.eINSTANCE.createReqIF();

		ProrToolExtension toolExtension = ConfigurationUtil
				.createProrToolExtension(reqif, editingDomain);
		assertNotNull(toolExtension);

		assertEquals(toolExtension,
				ConfigurationUtil.createProrToolExtension(reqif, editingDomain));
	}

	@Test
	public void testGetProrToolExtension() {
		ReqIF reqif = ReqIF10Factory.eINSTANCE.createReqIF();
		assertNull(ConfigurationUtil.getProrToolExtension(reqif));
		ProrToolExtension toolExtension = ConfigurationUtil
				.createProrToolExtension(reqif, editingDomain);
		assertEquals(toolExtension,
				ConfigurationUtil.getProrToolExtension(reqif));
	}

	@Test
	public void testGetProrToolExtensionWithForeignExtension() {
		ReqIF reqif = ReqIF10Factory.eINSTANCE.createReqIF();

		ReqIFToolExtension mockToolExtension = buildMockToolExtension();

		reqif.getToolExtensions().add(mockToolExtension);
		assertNull(ConfigurationUtil.getProrToolExtension(reqif));
		ProrToolExtension toolExtension = ConfigurationUtil
				.createProrToolExtension(reqif, editingDomain);
		assertEquals(toolExtension,
				ConfigurationUtil.getProrToolExtension(reqif));
	}

	/**
	 * Mocks a {@link ProrToolExtension}. (mj) I am not too happy about this
	 * rather fragilie mocking.
	 * (mbr) replaced by simplified integration of tool extensions. Hope, that makes the mock more stable
	 * @return
	 */
	private ReqIFToolExtension buildMockToolExtension() {
		ReqIFToolExtension mockToolExtension = ReqIF10Factory.eINSTANCE.createReqIFToolExtension();
		EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
		ePackage.setName("myExtension");
		mockToolExtension.getExtensions().add(ePackage);
		return mockToolExtension;
	}

}
