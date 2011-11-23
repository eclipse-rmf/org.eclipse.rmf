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

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.ReqIf;
import org.eclipse.rmf.reqif10.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.util.ConfigurationUtil;

/**
 * This class manages Presentations for open ReqIF Files.
 */
public class PresentationManager {

	public static final String PRESENTATION_EXTENSION_POINT_NAME = "org.eclipse.rmf.pror.reqif10.editor.presentation";

	/**
	 * Upon opening a ReqIF File, this method notifies each
	 * {@link PresentationService}.
	 * 
	 * TODO We call this when the Editor is opened, but there must be a better
	 * way to do it (register a notifier somewhere...)
	 */
	public static void notifiyOpenReqif(ReqIf reqif) {

		for (PresentationService service : PresentationPluginManager
				.getPresentationServiceMap().values()) {
			service.openReqif(reqif);
		}

	}



	public static PresentationService getPresentationService(
			AttributeValue value, EditingDomain editingDomain) {
		PresentationService service = null;
		ProrPresentationConfiguration config = ConfigurationUtil
				.getPresentationConfig(value, editingDomain);
		if (config != null) {
			service = PresentationPluginManager.getPresentationService(config);
		}
		return service;

	}

}
