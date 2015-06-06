/*******************************************************************************
 * Copyright (c) 2014.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Hussein MHANNA - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.cheatsheets.handlers;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.rmf.cheatsheets.CheatSheetsPlugin;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

// TODO: Auto-generated Javadoc
/**
 * The Class AbstractOpenWizardHandler.
 */
public abstract class AbstractOpenWizardHandler extends Action {

	/**
	 * Gets the selection.
	 *
	 * @return the selection
	 */
	private IStructuredSelection getSelection() {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		if (window != null) {
			ISelection selection = window.getSelectionService().getSelection();
			if (selection instanceof IStructuredSelection) {
				return (IStructuredSelection) selection;
			}
		}
		return StructuredSelection.EMPTY;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
				.getShell();
		try {
			INewWizard wizard = createWizard();
			wizard.init(PlatformUI.getWorkbench(), getSelection());
			WizardDialog dialog = new WizardDialog(shell, wizard);
			dialog.create();
			dialog.open();
		} catch (CoreException e) {
			CheatSheetsPlugin.INSTANCE.log(e);
		}
	}

	/**
	 * Creates the wizard.
	 *
	 * @return the i new wizard
	 * @throws CoreException the core exception
	 */
	protected abstract INewWizard createWizard() throws CoreException;
}
