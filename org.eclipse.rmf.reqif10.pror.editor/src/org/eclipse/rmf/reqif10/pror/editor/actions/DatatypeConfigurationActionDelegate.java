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

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIFToolExtension;
import org.eclipse.rmf.reqif10.pror.editor.presentation.Reqif10Editor;
import org.eclipse.rmf.reqif10.pror.editor.presentation.SpecificationEditor;
import org.eclipse.rmf.reqif10.pror.provider.VirtualSpecObjectItemProvider;
import org.eclipse.rmf.reqif10.pror.provider.VirtualSpecRelationGroupItemProvider;
import org.eclipse.rmf.reqif10.pror.provider.VirtualSpecRelationsItemProvider;
import org.eclipse.rmf.reqif10.pror.provider.VirtualSpecificationsItemProvider;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;

public class DatatypeConfigurationActionDelegate implements
		IEditorActionDelegate {

	private Reqif10Editor editor;

	/**
	 * Retrieves the {@link EditingDomain} from the Editor if present.
	 */
	public void setActiveEditor(IAction action, IEditorPart editor) {
		if (editor instanceof Reqif10Editor) {
			this.editor = (Reqif10Editor) editor;
		} else if (editor instanceof SpecificationEditor) {
			this.editor = ((SpecificationEditor) editor).getReqifEditor();
		} else {
			this.editor = null;
		}
	}

	/**
	 * Opens the {@link ReqIFToolExtension} for the current
	 * {@link EditingDomain}.
	 */
	public void run(IAction action) {
		if (editor == null)
			return;
		ReqIF reqif = (ReqIF) editor.getEditingDomain().getResourceSet()
				.getResources().get(0).getContents().get(0);

		SubtreeDialog dialog = new SubtreeDialog(editor, reqif.getCoreContent(),
				"Datatype Configuration",
				"org.eclipse.rmf.reqif10.pror.editor.datatypeConfiguration");
		dialog.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement,
					Object element) {
				return !(element instanceof VirtualSpecificationsItemProvider
						|| element instanceof VirtualSpecObjectItemProvider
						|| element instanceof VirtualSpecRelationsItemProvider
						|| element instanceof VirtualSpecRelationGroupItemProvider);
			}
		});
		dialog.open();
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// No action required.
	}

}
