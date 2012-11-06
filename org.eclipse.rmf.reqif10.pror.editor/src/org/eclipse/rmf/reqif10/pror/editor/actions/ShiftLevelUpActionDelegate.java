/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
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

import java.util.List;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.pror.editor.presentation.SpecificationEditor;
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
public class ShiftLevelUpActionDelegate implements IEditorActionDelegate,
		IWorkbenchWindowActionDelegate {

	private IStructuredSelection selection;
	private IEditorPart editor;

	// private IWorkbenchWindow window;

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
	 */
	public void run(IAction action) {
	System.out.println(selection);
//		if (selection.size() != 1)
//			return; 
//		
		System.out.println(selection.getFirstElement());
		if (!(selection.getFirstElement() instanceof SpecHierarchy))
			return;
		SpecHierarchy specHierarchy = (SpecHierarchy) selection
				.getFirstElement();
		if (specHierarchy.getObject() == null)
			return;
		// SpecType type = specHierarchy.getObject().getType();
	
		if (!(editor instanceof SpecificationEditor))
			return;
		SpecificationEditor specificationEditor = (SpecificationEditor) editor;

		// Shell shell = window != null ? window.getShell() : editor.getSite()
		// .getShell();
	
		EObject eContainer = specHierarchy.eContainer();
		System.out.println(eContainer);
		if(!(eContainer instanceof SpecHierarchy))
			return;
		
		SpecHierarchy parent = (SpecHierarchy) eContainer;
	
		int indexOf = parent.getChildren().indexOf(specHierarchy);
	
		List<SpecHierarchy> followers = parent.getChildren().subList(indexOf+1, parent.getChildren().size());
		CompoundCommand cmd = new CompoundCommand("Shifting Up " );
		EditingDomain ed = specificationEditor.getEditingDomain();
		
		for(SpecHierarchy follower: followers) {
			//		cmd.append(RemoveCommand.create(ed, parent, ReqIF10Package.Literals.SPEC_HIERARCHY__CHILDREN, follower));
		cmd.append(AddCommand.create(ed, specHierarchy, ReqIF10Package.Literals.SPEC_HIERARCHY__CHILDREN, follower));
		}
		
		EObject grandparent =  parent.eContainer();
		int pIndexOf = 0;
		if(grandparent instanceof SpecHierarchy) {
			pIndexOf= ((SpecHierarchy)grandparent).getChildren().indexOf(parent);
			cmd.append(AddCommand 
					.create(ed, grandparent,
							ReqIF10Package.Literals.SPEC_HIERARCHY__CHILDREN,
							specHierarchy,pIndexOf+1));
		}else if (grandparent instanceof Specification) {
			pIndexOf= ((Specification)grandparent).getChildren().indexOf(parent);
			cmd.append(AddCommand 
					.create(ed, grandparent,
							ReqIF10Package.Literals.SPECIFICATION__CHILDREN,
							specHierarchy,pIndexOf+1));
		}
		System.out.println("--->"+pIndexOf);

		

		ed.getCommandStack().execute(cmd);

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			this.selection = (IStructuredSelection) selection;
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWindowActionDelegate#dispose()
	 */
	public void dispose() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchWindowActionDelegate#init(org.eclipse.ui.IWorkbenchWindow)
	 */
	public void init(IWorkbenchWindow window) {
		// this.window = window;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IEditorActionDelegate#setActiveEditor(org.eclipse.jface.action.IAction, org.eclipse.ui.IEditorPart)
	 */
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		this.editor = targetEditor;
	}

	
}
