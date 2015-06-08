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


public class ShiftLevelDownHandler extends AbstractHandler {


	// private IWorkbenchWindow window;



	/**
	 * TODO: The related command should only be activated in case the selection is a valid spec hierarchy
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
			TransactionalEditingDomain ed = WorkspaceEditingDomainUtil.getEditingDomain(specHierarchy);
			
			if (eContainer instanceof SpecHierarchy) {

				SpecHierarchy parent = (SpecHierarchy) eContainer;
				int indexOf = parent.getChildren().indexOf(specHierarchy);
				if (indexOf < 1)
					return null;
				SpecHierarchy previous = parent.getChildren().get(indexOf - 1);
				
				CompoundCommand cmd = new CompoundCommand("Shifting Down ");
				cmd.append(AddCommand 
						.create(ed, previous,
								ReqIF10Package.Literals.SPEC_HIERARCHY__CHILDREN,
								specHierarchy));
				ed.getCommandStack().execute(cmd);
			} else if (eContainer instanceof Specification) {
				Specification parent = (Specification) eContainer;
				int indexOf = parent.getChildren().indexOf(specHierarchy);
				if (indexOf < 1)
					return null;
				SpecHierarchy previous = parent.getChildren().get(indexOf - 1);
				System.out.println(previous);

				CompoundCommand cmd = new CompoundCommand("Shifting Down ");
				cmd.append(AddCommand 
						.create(ed, previous,
								ReqIF10Package.Literals.SPEC_HIERARCHY__CHILDREN,
								specHierarchy));


				ed.getCommandStack().execute(cmd);
			}

		}

		return null;
	}



}
