/*******************************************************************************
 * Copyright (c) 2014 Formal Mind GmbH, University of Duesseldorf and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Michael Jastram - initial API and implementation
 *******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor.presentation;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.ReqIF10Package;

public class SetLastChangeCommand extends SetCommand {

	public SetLastChangeCommand(EditingDomain domain, EObject owner,
			XMLGregorianCalendar value) {
		
		


		
		super(domain, owner, ReqIF10Package.eINSTANCE.getIdentifiable_LastChange(), value);
	}


}
