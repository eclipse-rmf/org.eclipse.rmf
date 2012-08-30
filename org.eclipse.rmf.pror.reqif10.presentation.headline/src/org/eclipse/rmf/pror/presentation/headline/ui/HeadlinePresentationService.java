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
package org.eclipse.rmf.pror.presentation.headline.ui;

import org.eclipse.rmf.pror.presentation.headline.HeadlineFactory;
import org.eclipse.rmf.pror.reqif10.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.pror.reqif10.editor.presentation.service.AbstractPresentationService;

public class HeadlinePresentationService extends AbstractPresentationService {


	@Override
	public ProrPresentationConfiguration getConfigurationInstance() {
		return HeadlineFactory.eINSTANCE.createHeadlineConfiguration();
	}

}
