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

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.domain.EditingDomain;


public class TimestampedCommandStack extends BasicCommandStack {

	protected EditingDomain editingDomain;

	@Override
	public void execute(Command command) {
		
		CompoundCommand compoundCommand = new TimestampedCompoundCommand(editingDomain, command);
		super.execute(compoundCommand);
	}

	public void setEditingDomain(EditingDomain editingDomain) {
		this.editingDomain = editingDomain;
		
	}
}
