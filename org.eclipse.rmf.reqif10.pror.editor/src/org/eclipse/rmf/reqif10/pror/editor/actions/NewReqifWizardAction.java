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
package org.eclipse.rmf.reqif10.pror.editor.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.rmf.reqif10.pror.editor.presentation.Reqif10ModelWizard;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

public class NewReqifWizardAction implements IWorkbenchWindowActionDelegate,
		IViewActionDelegate {

	private IWorkbenchWindow window;
	private ISelection selection;

	public void dispose() {
	}

	public void init(IWorkbenchWindow window) {
		this.window = window;
	}

	public void run(IAction action) {
		Reqif10ModelWizard wizard = new Reqif10ModelWizard();

		wizard.init(
				window.getWorkbench(),
				(IStructuredSelection) (selection instanceof IStructuredSelection ? selection
						: new StructuredSelection()));

		WizardDialog dialog = new WizardDialog(window.getShell(), wizard);
		dialog.create();
		dialog.open();
	}

	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;

	}

	public void init(IViewPart view) {
		window = view.getViewSite().getWorkbenchWindow();
	}

}
