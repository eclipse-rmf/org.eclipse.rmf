package org.eclipse.rmf.pror.reqif10.edit.presentation.service;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.rmf.pror.reqif10.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.pror.reqif10.util.ConfigurationUtil;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

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

	public static String getCustomLabel(AttributeValue value) {
		// See whether we have a custom label renderer
		DatatypeDefinition dd = ReqIF10Util.getDatatypeDefinition(value);
		ProrPresentationConfiguration presentationConfiguration = ConfigurationUtil
				.getConfiguration(dd);
		if (presentationConfiguration != null) {
			PresentationEditService service = PresentationEditManager
					.getPresentationEditService(presentationConfiguration);
			if (service != null) {
				String customLabel = service.getLabel(value);
				if (customLabel != null) {
					return customLabel;
				}
			}
		}
		return null;
	}

}
