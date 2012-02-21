package org.eclipse.rmf.pror.reqif10.edit.presentation.service;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.rmf.pror.reqif10.configuration.ProrPresentationConfiguration;

public class PresentationEditManager {

	private static Map<Class<? extends ProrPresentationConfiguration>, PresentationEditService> presentationEditServiceRegistry;

	/**
	 * Returns the cached {@link PresentationService} representing all installed
	 * Presentation Extensions.
	 * 
	 * @return A set of {@link PresentationService}s.
	 * 
	 *         FIXME: the map may not yet be populated
	 */
	public static Map<Class<? extends ProrPresentationConfiguration>, PresentationEditService> getPresentationEditServiceMap() {
		if (presentationEditServiceRegistry == null)
			presentationEditServiceRegistry = new HashMap<Class<? extends ProrPresentationConfiguration>, PresentationEditService>();
		return presentationEditServiceRegistry;
	}

	/**
	 * 
	 * This method is meant for exclusive use by the PresentationEditorManager
	 * (editor plugin). Do not use otherwise!
	 * 
	 * @param configurationInterface
	 * @param service
	 */
	public static void addService(
			Class<? extends ProrPresentationConfiguration> configurationInterface,
			PresentationEditService service) {
		getPresentationEditServiceMap().put(configurationInterface, service);
	}

	public static PresentationEditService getPresentationEditService(
			ProrPresentationConfiguration configuration) {
		for (Class<? extends ProrPresentationConfiguration> clazz : getPresentationEditServiceMap()
				.keySet()) {
			if (clazz.isInstance(configuration)) {
				return getPresentationEditServiceMap().get(clazz);
			}
		}
		return null;
	}

}
