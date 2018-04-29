/*******************************************************************************
 * Copyright (c) 2011, 2012 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Lukas Ladenberger - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.rmf.reqif10.pror.editor.presentation.Reqif10EditorPlugin;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * @author Ingo Weigelt
 */
public class ProRSpecificationWebPrintPreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	public void init(IWorkbench workbench) {
		// Set preference store
		setPreferenceStore(Reqif10EditorPlugin.getPlugin().getPreferenceStore());
		setDescription("ReqIF Print / Web Export Settings");
	}

	@Override
	protected void createFieldEditors() {
		addField(new BooleanFieldEditor(
				PreferenceConstants.P_WEB_EXPORT_INLUDE_OUTGOING_SPEC_RELATIONS,
				"Print outgoing links.",
				getFieldEditorParent()));

		addField(new BooleanFieldEditor(PreferenceConstants.P_WEB_EXPORT_INLUDE_INCOMING_SPEC_RELATIONS,
				"Print incoming Links.", getFieldEditorParent()));

		addField(new BooleanFieldEditor(
				PreferenceConstants.P_WEB_EXPORT_ALWAYS_ASK_FOR_SPEC_RELATIONS,
				"Always ask which if links should be printed.",
				getFieldEditorParent()));
	}
	
	
	
}
