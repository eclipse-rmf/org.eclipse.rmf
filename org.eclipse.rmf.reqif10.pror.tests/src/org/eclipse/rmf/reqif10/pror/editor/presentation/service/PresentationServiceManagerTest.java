package org.eclipse.rmf.reqif10.pror.editor.presentation.service;

import java.util.Map;

import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.impl.ProrPresentationConfigurationImpl;
import org.eclipse.rmf.reqif10.pror.edit.presentation.service.PresentationInterface;
import org.eclipse.rmf.reqif10.pror.presentation.headline.HeadlineConfiguration;
import org.eclipse.rmf.reqif10.pror.presentation.headline.HeadlineFactory;
import org.eclipse.rmf.reqif10.pror.presentation.headline.ui.HeadlinePresentationService;
import org.eclipse.rmf.reqif10.pror.presentation.id.IdConfiguration;
import org.eclipse.rmf.reqif10.pror.presentation.id.IdFactory;
import org.eclipse.rmf.reqif10.pror.presentation.linewrap.LinewrapConfiguration;
import org.eclipse.rmf.reqif10.pror.presentation.linewrap.LinewrapFactory;
import org.eclipse.rmf.reqif10.pror.presentation.ui.IdPresentationService;
import org.eclipse.rmf.reqif10.pror.presentation.ui.LinewrapPresentationService;
import org.junit.Assert;
import org.junit.Test;

public class PresentationServiceManagerTest {

	/**
	 * Asserts that the map contains three elements (currently ID, Headline and
	 * Linewrap Presentations).
	 */
	@Test
	public void testGetPresentationServiceMapContent() {
		Map<Class<? extends ProrPresentationConfiguration>, PresentationInterface> map = PresentationServiceManager
				.getPresentationInterfaceMap();
		Assert.assertEquals(3, map.size());
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testPresentationMapNotModifyable() {
		PresentationServiceManager.getPresentationInterfaceMap().clear();
	}

	@Test
	public void testHeadlinePresentationService() {
		HeadlineConfiguration config = HeadlineFactory.eINSTANCE
				.createHeadlineConfiguration();
		PresentationInterface service = PresentationServiceManager
				.getPresentationService(config);
		Assert.assertTrue(service instanceof HeadlinePresentationService);
	}

	@Test
	public void testIdPresentationService() {
		IdConfiguration config = IdFactory.eINSTANCE.createIdConfiguration();
		PresentationInterface service = PresentationServiceManager
				.getPresentationService(config);
		Assert.assertTrue(service instanceof IdPresentationService);
	}

	@Test
	public void testLinewrapPresentationService() {
		LinewrapConfiguration config = LinewrapFactory.eINSTANCE
				.createLinewrapConfiguration();
		PresentationInterface service = PresentationServiceManager
				.getPresentationService(config);
		Assert.assertTrue(service instanceof LinewrapPresentationService);
	}

	@Test
	public void testMissingPresentationService() {
		ProrPresentationConfiguration config = new ProrPresentationConfigurationImpl() {
			public void registerReqIF() {
			}

			public void unregisterReqIF() {
			}
		};

		PresentationInterface service = PresentationServiceManager
				.getPresentationService(config);
		Assert.assertNull(service);
	}
}
