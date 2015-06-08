/*******************************************************************************
 * Copyright (c) 2011, 2012 Formal Mind GmbH, University of Dusseldorf, itemis and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 *     itemis - translated action to command
 ******************************************************************************/
package org.eclipse.rmf.reqif10.ide.commands.toolbar.handler;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.sphinx.emf.util.WorkspaceEditingDomainUtil;
import org.eclipse.ui.handlers.HandlerUtil;

public class ShiftLevelUpHandler extends AbstractHandler {

	/**
	 * TODO: The related command should only be activated in case the selection
	 * is a valid spec hierarchy
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection sel = HandlerUtil.getCurrentSelection(event);

		if (sel instanceof StructuredSelection) {
			StructuredSelection selection = (StructuredSelection) sel;

			// check preconditions
			if (selection.size() != 1)
				return null;
			if (!(selection.getFirstElement() instanceof SpecHierarchy))
				return null;
			SpecHierarchy specHierarchy = (SpecHierarchy) selection
					.getFirstElement();
			if (specHierarchy.getObject() == null)
				return null;

			EObject eContainer = specHierarchy.eContainer();
			TransactionalEditingDomain ed = WorkspaceEditingDomainUtil
					.getEditingDomain(specHierarchy);

			if (!(eContainer instanceof SpecHierarchy))
				return null;

			SpecHierarchy parent = (SpecHierarchy) eContainer;

			int indexOf = parent.getChildren().indexOf(specHierarchy);

			List<SpecHierarchy> followers = parent.getChildren().subList(
					indexOf + 1, parent.getChildren().size());
			CompoundCommand cmd = new CompoundCommand("Shifting Up ");

			for (SpecHierarchy follower : followers) {
				cmd.append(AddCommand.create(ed, specHierarchy,
						ReqIF10Package.Literals.SPEC_HIERARCHY__CHILDREN,
						follower));
			}

			EObject grandparent = parent.eContainer();
			int pIndexOf = 0;
			if (grandparent instanceof SpecHierarchy) {
				pIndexOf = ((SpecHierarchy) grandparent).getChildren().indexOf(
						parent);
				cmd.append(AddCommand.create(ed, grandparent,
						ReqIF10Package.Literals.SPEC_HIERARCHY__CHILDREN,
						specHierarchy, pIndexOf + 1));
			} else if (grandparent instanceof Specification) {
				pIndexOf = ((Specification) grandparent).getChildren().indexOf(
						parent);
				cmd.append(AddCommand.create(ed, grandparent,
						ReqIF10Package.Literals.SPECIFICATION__CHILDREN,
						specHierarchy, pIndexOf + 1));
			}

			ed.getCommandStack().execute(cmd);

		}

		return null;
	}
}
