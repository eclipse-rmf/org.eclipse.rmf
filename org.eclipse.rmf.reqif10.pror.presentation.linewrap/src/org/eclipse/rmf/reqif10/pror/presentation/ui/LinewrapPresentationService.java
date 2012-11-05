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
package org.eclipse.rmf.reqif10.pror.presentation.ui;

import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.edit.presentation.service.PresentationInterface;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.AbstractPresentationService;
import org.eclipse.rmf.reqif10.pror.presentation.linewrap.LinewrapFactory;

/**
 * A very basic Presentation that handles {@link DatatypeDefinitionString}s and
 * wraps them in the Labels and Editors.
 * 
 * @author jastram
 * 
 */
public class LinewrapPresentationService extends AbstractPresentationService implements PresentationInterface {

	public LinewrapPresentationService() {
	}

	@Override
	public ProrPresentationConfiguration getConfigurationInstance() {
		return LinewrapFactory.eINSTANCE.createLinewrapConfiguration();
	}

}
