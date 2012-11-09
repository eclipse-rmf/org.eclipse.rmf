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
package org.eclipse.rmf.reqif10.pror.edit.presentation.service;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;

public class PresentationManager {

	private static Map<Class<? extends ProrPresentationConfiguration>, PresentationInterface> presentationEditServiceRegistry;

	/**
	 * Returns the cached {@link PresentationService} representing all installed
	 * Presentation Extensions.
	 * 
	 * @return A set of {@link PresentationService}s.
	 */
	private static Map<Class<? extends ProrPresentationConfiguration>, PresentationInterface> getPresentationEditServiceMap() {
		if (presentationEditServiceRegistry == null)
			presentationEditServiceRegistry = new HashMap<Class<? extends ProrPresentationConfiguration>, PresentationInterface>();
		return presentationEditServiceRegistry;
	}

	/**
	 * This method is meant for exclusive use by the PresentationEditorManager
	 * (editor plugin). Do not use otherwise!
	 * 
	 * @param configurationInterface
	 * @param service
	 */
	public static void addService(
			Class<? extends ProrPresentationConfiguration> configurationInterface,
			PresentationInterface service) {
		getPresentationEditServiceMap().put(configurationInterface, service);
	}

	public static PresentationInterface getPresentationEditService(
			ProrPresentationConfiguration configuration) {
		for (Class<? extends ProrPresentationConfiguration> clazz : getPresentationEditServiceMap()
				.keySet()) {
			if (clazz.isInstance(configuration)) {
				return getPresentationEditServiceMap().get(clazz);
			}
		}
		return null;
	}

	public static Collection<PresentationInterface> getPresentationServices() {
		return Collections.unmodifiableCollection((presentationEditServiceRegistry
						.values()));
	}

}
