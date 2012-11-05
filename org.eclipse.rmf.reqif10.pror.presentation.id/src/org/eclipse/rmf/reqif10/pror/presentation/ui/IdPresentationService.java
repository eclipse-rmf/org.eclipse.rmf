/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 *     Kay Münch       - vertical alignment of the spec objects id
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.presentation.ui;

import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.AbstractPresentationService;
import org.eclipse.rmf.reqif10.pror.presentation.id.IdFactory;
import org.eclipse.rmf.reqif10.pror.presentation.id.impl.IdConfigurationImpl;

/**
 * A presentation to automatically assign human-readable IDs of the form
 * Label-###, where ### is numeric. The ID is stored in an
 * {@link AttributeValueString}.
 * <p>
 * The "hooking" takes place via {@link IdConfigurationImpl#registerReqIF()},
 * which calls methods in this class.
 * <p>
 * 
 * TODOS:
 * <ul>
 * <li>Allow renaming of prefix
 * <li>Prevent duplicates
 * </ul>
 * 
 * @author jastram
 */
public class IdPresentationService extends AbstractPresentationService {

	public IdPresentationService() {
	}

	@Override
	public ProrPresentationConfiguration getConfigurationInstance() {
		return IdFactory.eINSTANCE.createIdConfiguration();
	}
}
