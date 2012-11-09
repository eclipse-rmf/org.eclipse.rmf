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
package org.eclipse.rmf.reqif10.pror.util;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.CommandActionDelegate;

/**
 * Mixin of {@link CompoundCommand} and {@link CommandActionDelegate}. Without
 * the later, EMF wouldn't show labels on Child- and Sibling-creation Actions.
 * 
 * @author jastram
 * 
 */
public class CompoundCommandActionDelegate extends CompoundCommand implements
		CommandActionDelegate {
	
	public CompoundCommandActionDelegate() {
	}

	public CompoundCommandActionDelegate(int resultIndex) {
		super(resultIndex);
	}

	public Object getImage() {
		return null;
	}

	public String getText() {
		return getLabel();
	}

	public String getToolTipText() {
		return getDescription();
	}

}
