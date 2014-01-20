/*******************************************************************************
 * Copyright (c) 2014 Formal Mind GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.presentation.linewrap.provider;

import java.util.Set;

import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;

/**
 * Class to allow package-private access to the Linewrap stuff, for testing.
 *  
 * @author jastram
 */
public final class LinewrapPackageAccess {

	public static Set<ProrPresentationConfiguration> getRegisteredConfigurations(
			LinewrapConfigurationItemProvider ip) {
		return ip.registeredConfigs;
	}
	
}
