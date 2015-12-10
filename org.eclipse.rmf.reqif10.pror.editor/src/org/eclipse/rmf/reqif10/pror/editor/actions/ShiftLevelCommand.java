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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.jface.viewers.IStructuredSelection;

public class ShiftLevelCommand extends CompoundCommand{
	
	@SuppressWarnings("rawtypes")
	private Collection selectedHierarchies = new ArrayList(0);

	public ShiftLevelCommand(String label) {
		super(label);
	}
	
	@Override
	public boolean canUndo() {
		return super.canUndo();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void setSelection(IStructuredSelection selection) {
		selectedHierarchies = new ArrayList(selection.size());
		for (Iterator it = selection.iterator(); it.hasNext();){
			selectedHierarchies.add(it.next());
		}
	}

	@SuppressWarnings("rawtypes")
	public Collection getSelectedObjects() {
		return selectedHierarchies;
	}
	
}