/*******************************************************************************
 * Copyright (c) 2012 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.pror.editor.presentation;

import java.io.File;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;

/**
 * This class is triggered by an extension points and checks whether an argument
 * is a .reqif (or .reqifz) file. The idea is that this will ultimately allow
 * launching a reqif file by double-clicking it.
 * <p>
 * 
 * TODO .reqifz is currently not supported yet.
 * 
 * @author jastram
 */
public class OpenFilesOnStartup implements IStartup {

	public void earlyStartup() {
		final IWorkbench workbench = PlatformUI.getWorkbench();
		workbench.getDisplay().asyncExec(new Runnable() {
			public void run() {
				IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
				if (window != null) {
					processCommandLine(window);
				}
			}
		});
	}

	private void processCommandLine(IWorkbenchWindow window) {
		String[] args = Platform.getCommandLineArgs();
		for (String arg : args) {
			if (arg.toLowerCase().endsWith(".reqif")) {
				try {
					
					// First, get the absolute path of the file.
					File file = new File(arg);
					if (!file.isAbsolute()) {
						file = new File(System.getProperty("user.dir"), arg);
					}
					if (!file.exists()) {
						System.out.println("Skipping file, does not exist: "
								+ file);
					}
					System.out.println("Trying to open: " + file);

					IFileStore store = EFS.getLocalFileSystem().getStore(
							new Path(file.getAbsolutePath()));

					IDE.openEditorOnFileStore(window.getActivePage(), store);
					
				} catch (PartInitException exception) {
					MessageDialog.openError(window.getShell(),
							Reqif10EditorPlugin.INSTANCE
									.getString("_UI_OpenEditorError_label"),
							exception.getMessage());
				}

			} else if (arg.toLowerCase().endsWith(".reqifz")) {
				System.out
						.println("Not yet supported on command line: .reqifz");
			}
		}
	}

}
