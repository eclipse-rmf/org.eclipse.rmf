/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
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
 * @author Lukas Ladenberger
 */
public class ProRPreferencePage extends FieldEditorPreferencePage implements
		IWorkbenchPreferencePage {

	public void init(IWorkbench workbench) {
		// Set preference store
		setPreferenceStore(Reqif10EditorPlugin.getPlugin().getPreferenceStore());
		setDescription(Reqif10EditorPlugin.INSTANCE
				.getString("_UI_PreferencesIsSimplified"));
	}

	@Override
	protected void createFieldEditors() {
		addField(new BooleanFieldEditor(
				PreferenceConstants.P_STOP_IS_SIMPLIFIED_WARNING,
				"Stop warning when setting isSimplified = true for all ReqIF models.",
				getFieldEditorParent()));
	}

}
