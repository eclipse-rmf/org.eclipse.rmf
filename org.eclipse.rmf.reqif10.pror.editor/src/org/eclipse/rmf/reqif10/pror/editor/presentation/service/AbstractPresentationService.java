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
package org.eclipse.rmf.reqif10.pror.editor.presentation.service;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.edit.presentation.service.PresentationInterface;

/**
 * This abstract class is provided to make life for Presentation creators
 * easier. Just subclass it and modify where you see fit.
 * 
 * @author jastram
 * 
 */
public abstract class AbstractPresentationService extends AdapterImpl implements PresentationInterface {

	private Class<? extends ProrPresentationConfiguration> configInterface;
	
	public Class<? extends ProrPresentationConfiguration> getConfigurationInterface() {
		if (configInterface == null) {
			configInterface = getConfigurationInstance().getClass();
		}
		return configInterface;
	}

	/* Override, as indicated by the interface's Javadoc */
	public abstract ProrPresentationConfiguration getConfigurationInstance();

}
