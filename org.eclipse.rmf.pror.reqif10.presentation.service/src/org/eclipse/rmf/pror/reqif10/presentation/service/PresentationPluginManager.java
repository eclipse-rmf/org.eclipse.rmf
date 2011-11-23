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
package org.eclipse.rmf.pror.reqif10.presentation.service;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.rmf.pror.reqif10.configuration.ProrPresentationConfiguration;

/**
 * This class manages installed Presentations (and is therefore independent of
 * open ReqIF Files).
 */
public class PresentationPluginManager {

	public static final String PRESENTATION_EXTENSION_POINT_NAME = "org.eclipse.rmf.pror.reqif10.presentation.service.presentation";

	private static Map<Class<? extends ProrPresentationConfiguration>, PresentationService> presentationServiceRegistry;

	// // There is one entry per Plugin
	// private static Set<PresentationData> presentationTypeRegistry;

	/**
	 * Returns the cached {@link PresentationService} representing all installed
	 * Presentation Extensions.
	 * 
	 * @return A set of {@link PresentationService}s.
	 */
	public static Map<Class<? extends ProrPresentationConfiguration>, PresentationService> getPresentationServiceMap() {
		if (presentationServiceRegistry != null)
			return presentationServiceRegistry;

		presentationServiceRegistry = new HashMap<Class<? extends ProrPresentationConfiguration>, PresentationService>();

		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint extensionPoint = registry
				.getExtensionPoint(PRESENTATION_EXTENSION_POINT_NAME);
		IExtension[] extensions = extensionPoint.getExtensions();
		for (IExtension extension : extensions) {
			IConfigurationElement[] configElements = extension
					.getConfigurationElements();
			for (IConfigurationElement configElement : configElements) {
				try {
					PresentationService service = (PresentationService) configElement
							.createExecutableExtension("service");
					presentationServiceRegistry.put(service
							.getConfigurationInterface(), service);
				} catch (CoreException e) {
					e.printStackTrace();
					// TODO Error Logging
				}
			}
		}
		return presentationServiceRegistry;
	}

	public static PresentationService getPresentationService(
			ProrPresentationConfiguration configuration) {
		for (Class<? extends ProrPresentationConfiguration> clazz : getPresentationServiceMap()
				.keySet()) {
			if (clazz.isInstance(configuration)) {
				return getPresentationServiceMap().get(clazz);
			}
		}
		return null;
	}
}
