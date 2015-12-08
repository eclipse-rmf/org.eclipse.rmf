/*******************************************************************************
 * Copyright (c) 2015 Formal Mind GmbH.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ingo Weigelt - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.pror.editor.actions;

import org.eclipse.emf.common.command.CompoundCommand;

public class ShiftLevelCommand extends CompoundCommand{
	
	public ShiftLevelCommand(String label) {
		super(label);
	}
	
}