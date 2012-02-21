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
package org.eclipse.rmf.rif12.resource.extensions;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.rmf.rif12.ExchangeFile.RIFToolExtension;


public class RifToolExtensionConfiguration {

	public static final RifToolExtensionConfiguration INSTANCE = new RifToolExtensionConfiguration();

	/* extension point string literals */
	private static final String RIFTOOLEXTENSION_CONFIGURATION_EXTENSION_POINT = "org.eclipse.rmf.rif12.resource.riftoolextension";
	private static final String RIFTOOLEXTENSION = "riftoolextension";
	private static final String CLASS = "class";

	private RIFToolExtension rifToolExtension;

	protected RifToolExtensionConfiguration() {

	}

	public RIFToolExtension getRifToolExtension() {

		if (rifToolExtension == null) {

			IConfigurationElement[] extensions = Platform
					.getExtensionRegistry().getConfigurationElementsFor(
							RIFTOOLEXTENSION_CONFIGURATION_EXTENSION_POINT);

			for (int i = 0; i < extensions.length; i++) {

				RIFToolExtension toolExtension = null;

				if ((RIFTOOLEXTENSION).equals(extensions[i].getName())) {

					String toolExtensionClass = extensions[i]
							.getAttribute(CLASS);

					if (toolExtensionClass != null) {

						toolExtension = getRifToolExtensionInstance(
								extensions[i], toolExtensionClass);
						return toolExtension;

					}
				}
			}

			rifToolExtension = new RifToolExtensionAnyImpl();
		}

		return rifToolExtension;

	}

	protected RIFToolExtension getRifToolExtensionInstance(
			IConfigurationElement element, String definitionClass) {

		RIFToolExtension toolExtension = null;

		try {

			toolExtension = (RIFToolExtension) element
					.createExecutableExtension(CLASS);
		} catch (org.eclipse.core.runtime.CoreException e) {

		}

		return toolExtension;

	}

	//To set ToolExtensions without using extension points
	public void setRifToolExtension(RIFToolExtension rifToolExtension) {
		this.rifToolExtension = rifToolExtension;
	}
}
