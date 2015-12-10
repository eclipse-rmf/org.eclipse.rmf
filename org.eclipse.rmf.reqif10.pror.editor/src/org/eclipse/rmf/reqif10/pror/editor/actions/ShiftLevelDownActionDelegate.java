/*******************************************************************************
 * Copyright (c) 2011, 2012 Formal Mind GmbH and University of Dusseldorf.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor.actions;

import java.util.Iterator;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.pror.editor.ISpecificationEditor;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

/**
 * 
 * Action for adding test objects to the current SpecHierarchy.
 * 
 * @author jastram
 * 
 */
public class ShiftLevelDownActionDelegate implements IEditorActionDelegate,
		IWorkbenchWindowActionDelegate {

	private IStructuredSelection selection;
	private IEditorPart editor;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {

		if (!(editor instanceof ISpecificationEditor))
			return;
		ISpecificationEditor specificationEditor = (ISpecificationEditor) editor;
		EditingDomain editingDomain = specificationEditor.getEditingDomain();
		
		for (@SuppressWarnings("rawtypes")
		Iterator it = selection.iterator(); it.hasNext(); ) {
			Object next = it.next();
			if (next instanceof SpecHierarchy) {
				SpecHierarchy specHierarchy = (SpecHierarchy) next;
				//if (specHierarchy.getObject() == null){
				//	break;
				//}
				CompoundCommand cmd = new ShiftLevelCommand("Shifting Down " );
				Command shiftCommand = createShiftCommand(specHierarchy, editingDomain);
				if (shiftCommand != null){
					cmd.append(shiftCommand);
					editingDomain.getCommandStack().execute(cmd);
				}
			}
		}
		
		
	}
	
	
	private Command createShiftCommand(SpecHierarchy specHierarchy, EditingDomain editingDomain){
		ShiftLevelCommand cmd = new ShiftLevelCommand("Shifting Down ");
		EObject eContainer = specHierarchy.eContainer();
		if (eContainer instanceof SpecHierarchy) {
			
			SpecHierarchy parent = (SpecHierarchy) eContainer;
			int indexOf = parent.getChildren().indexOf(specHierarchy);
			if (indexOf < 1)
				return null;
			final SpecHierarchy previous = parent.getChildren().get(indexOf - 1);

			// we have to add an explicit remove command to make the shift undoable
			cmd.append(RemoveCommand.create(editingDomain, parent,
					ReqIF10Package.Literals.SPEC_HIERARCHY__CHILDREN,
					specHierarchy)
			);

			cmd.append(AddCommand 
					.create(editingDomain, previous,
							ReqIF10Package.Literals.SPEC_HIERARCHY__CHILDREN,
							specHierarchy));
			
		} else if (eContainer instanceof Specification) {
			Specification parent = (Specification) eContainer;
			int indexOf = parent.getChildren().indexOf(specHierarchy);
			if (indexOf < 1)
				return null;
			SpecHierarchy previous = parent.getChildren().get(indexOf - 1);
			
			// we have to add an explicit remove command to make the shift undoable
			cmd.append(RemoveCommand.create(editingDomain, parent,
					ReqIF10Package.Literals.SPECIFICATION__CHILDREN,
					specHierarchy)
			);
			
			cmd.append(AddCommand 
					.create(editingDomain, previous,
							ReqIF10Package.Literals.SPEC_HIERARCHY__CHILDREN,
							specHierarchy));
			
		}
		return cmd;
	}
	
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action
	 * .IAction, org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			this.selection = (IStructuredSelection) selection;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchWindowActionDelegate#dispose()
	 */
	public void dispose() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchWindowActionDelegate#init(org.eclipse.ui.
	 * IWorkbenchWindow)
	 */
	public void init(IWorkbenchWindow window) {
//		this.window = window;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IEditorActionDelegate#setActiveEditor(org.eclipse.jface
	 * .action.IAction, org.eclipse.ui.IEditorPart)
	 */
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		this.editor = targetEditor;
	}
	
}


