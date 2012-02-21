/*******************************************************************************
 * Copyright (c) 2011 itemis GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nirmal Sasidharan - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.resource.extensions;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

import org.eclipse.rmf.reqif10.ReqIfToolExtension;

public class ReqIfToolExtensionConfiguration {

	public static final ReqIfToolExtensionConfiguration INSTANCE = new ReqIfToolExtensionConfiguration();

	/* extension point string literals */
	private static final String RIFTOOLEXTENSION_CONFIGURATION_EXTENSION_POINT = "org.eclipse.rmf.reqif10.resource.reqiftoolextension";
	private static final String RIFTOOLEXTENSION = "reqiftoolextension";
	private static final String CLASS = "class";

	private ReqIfToolExtension reqifToolExtension;

	protected ReqIfToolExtensionConfiguration() {

	}

	public ReqIfToolExtension getRifToolExtension() {

		if (reqifToolExtension == null) {

			IConfigurationElement[] extensions = Platform
					.getExtensionRegistry().getConfigurationElementsFor(
							RIFTOOLEXTENSION_CONFIGURATION_EXTENSION_POINT);

			for (int i = 0; i < extensions.length; i++) {

				ReqIfToolExtension toolExtension = null;

				if ((RIFTOOLEXTENSION).equals(extensions[i].getName())) {

					String toolExtensionClass = extensions[i]
							.getAttribute(CLASS);

					if (toolExtensionClass != null) {

						toolExtension = getReqIfToolExtensionInstance(
								extensions[i], toolExtensionClass);
						return toolExtension;

					}
				}
			}

			reqifToolExtension = new ReqIfToolExtensionAnyImpl();
		}

		return reqifToolExtension;

	}

	protected ReqIfToolExtension getReqIfToolExtensionInstance(
			IConfigurationElement element, String definitionClass) {

		ReqIfToolExtension toolExtension = null;

		try {

			toolExtension = (ReqIfToolExtension) element
					.createExecutableExtension(CLASS);
		} catch (org.eclipse.core.runtime.CoreException e) {
			e.printStackTrace();
		}

		return toolExtension;

	}

	//To set ToolExtensions without using extension points
	public void setReqIfToolExtension(ReqIfToolExtension reqifToolExtension) {
		this.reqifToolExtension = reqifToolExtension;
	}
}
