package org.eclipse.rmf.pror.reqif10.editor.presentation.service;

import java.util.Map;

import org.eclipse.rmf.pror.presentation.headline.HeadlineConfiguration;
import org.eclipse.rmf.pror.presentation.headline.HeadlineFactory;
import org.eclipse.rmf.pror.presentation.headline.ui.HeadlinePresentationService;
import org.eclipse.rmf.pror.presentation.linewrap.LinewrapConfiguration;
import org.eclipse.rmf.pror.presentation.linewrap.LinewrapFactory;
import org.eclipse.rmf.pror.presentation.ui.LinewrapPresentationService;
import org.eclipse.rmf.pror.reqif10.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.pror.reqif10.configuration.impl.ProrPresentationConfigurationImpl;
import org.eclipse.rmf.pror.reqif10.presentation.id.IdConfiguration;
import org.eclipse.rmf.pror.reqif10.presentation.id.IdFactory;
import org.eclipse.rmf.pror.reqif10.presentation.ui.IDPresentationService;
import org.junit.Assert;
import org.junit.Test;

public class PresentationServiceManagerTest {

	/**
	 * Asserts that the map contains three elements (currently ID, Headline and
	 * Linewrap Presentations).
	 */
	@Test
	public void testGetPresentationServiceMapContent() {
		Map<Class<? extends ProrPresentationConfiguration>, PresentationService> map = PresentationServiceManager
				.getPresentationServiceMap();
		Assert.assertEquals(3, map.size());
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testPresentationMapNotModifyable() {
		PresentationServiceManager.getPresentationServiceMap().clear();
	}

	@Test
	public void testHeadlinePresentationService() {
		HeadlineConfiguration config = HeadlineFactory.eINSTANCE
				.createHeadlineConfiguration();
		PresentationService service = PresentationServiceManager
				.getPresentationService(config);
		Assert.assertTrue(service instanceof HeadlinePresentationService);
	}

	@Test
	public void testIdPresentationService() {
		IdConfiguration config = IdFactory.eINSTANCE.createIdConfiguration();
		PresentationService service = PresentationServiceManager
				.getPresentationService(config);
		Assert.assertTrue(service instanceof IDPresentationService);
	}

	@Test
	public void testLinewrapPresentationService() {
		LinewrapConfiguration config = LinewrapFactory.eINSTANCE
				.createLinewrapConfiguration();
		PresentationService service = PresentationServiceManager
				.getPresentationService(config);
		Assert.assertTrue(service instanceof LinewrapPresentationService);
	}

	@Test
	public void testMissingPresentationService() {
		ProrPresentationConfiguration config = new ProrPresentationConfigurationImpl() {
		};

		PresentationService service = PresentationServiceManager
				.getPresentationService(config);
		Assert.assertNull(service);
	}
}
