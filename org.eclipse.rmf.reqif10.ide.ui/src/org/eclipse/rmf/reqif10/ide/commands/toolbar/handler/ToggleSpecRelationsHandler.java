/*******************************************************************************
 * Copyright (c) 2011, 2012 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.ide.commands.toolbar.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.State;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.rmf.reqif10.ide.editor.ReqIFSpecificationEditor;
import org.eclipse.rmf.reqif10.ide.editor.ReqIFSpecificationSection;
import org.eclipse.rmf.reqif10.pror.editor.ISpecificationEditor;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.EditorPart;


public class ToggleSpecRelationsHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Command command = event.getCommand();
		Boolean oldValue = HandlerUtil.toggleCommandState(command);
				
		IEditorPart editor = HandlerUtil.getActiveEditor(event);
		if (editor instanceof ReqIFSpecificationEditor) {
			((ReqIFSpecificationEditor)editor).setShowSpecRelations(! oldValue );
		}
		
		return null;
	}

}
