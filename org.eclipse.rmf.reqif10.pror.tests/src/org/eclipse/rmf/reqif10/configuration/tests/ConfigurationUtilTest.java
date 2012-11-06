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
package org.eclipse.rmf.reqif10.configuration.tests;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap.ValueListIterator;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIFToolExtension;
import org.eclipse.rmf.reqif10.impl.ReqIFToolExtensionImpl;
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
	 * 
	 * @return
	 */
	private ReqIFToolExtension buildMockToolExtension() {
		ReqIFToolExtension mockToolExtension = mock(ReqIFToolExtensionImpl.class);
		FeatureMap featureMap = mock(FeatureMap.class);
		@SuppressWarnings("unchecked")
		ValueListIterator<Object> valueListIterator = mock(ValueListIterator.class);
		when(featureMap.valueListIterator()).thenReturn(valueListIterator);
		when(mockToolExtension.getAny()).thenReturn(featureMap);
		return mockToolExtension;
	}

}
