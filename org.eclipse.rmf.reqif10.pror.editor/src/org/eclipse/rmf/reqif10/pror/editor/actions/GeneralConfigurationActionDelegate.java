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

import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.rmf.reqif10.ReqIFToolExtension;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationFactory;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage;
import org.eclipse.rmf.reqif10.pror.configuration.LabelConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrGeneralConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension;
import org.eclipse.rmf.reqif10.pror.editor.presentation.Reqif10Editor;
import org.eclipse.rmf.reqif10.pror.editor.presentation.SpecificationEditor;
import org.eclipse.rmf.reqif10.pror.util.ConfigurationUtil;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;

public class GeneralConfigurationActionDelegate implements
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
		ProrToolExtension uiToolExtension = ConfigurationUtil
				.createProrToolExtension(editor.getReqif(),
						editor.getEditingDomain());
		ProrGeneralConfiguration generalConfig = createGeneralConfiguration(uiToolExtension);
		createLabelConfiguration(generalConfig);
		SubtreeDialog dialog = new SubtreeDialog(editor, generalConfig,
				"General Configuration",
				"org.eclipse.rmf.reqif10.pror.editor.generalConfiguration");
		dialog.open();
	}

	/**
	 * Creates the {@link LabelConfiguration}, if necessary.
	 */
	private void createLabelConfiguration(ProrGeneralConfiguration generalConfig) {
		if (generalConfig.getLabelConfiguration() != null) {
			return;
		}

		LabelConfiguration labelConfig = ConfigurationFactory.eINSTANCE
				.createLabelConfiguration();
		editor.getEditingDomain()
				.getCommandStack()
				.execute(
						SetCommand.create(
								editor.getEditingDomain(),
								generalConfig,
								ConfigurationPackage.Literals.PROR_GENERAL_CONFIGURATION__LABEL_CONFIGURATION,
								labelConfig));
	}

	/**
	 * Creates the general configuration, if necessary.
	 * 
	 * @param uiToolExtension
	 */
	private ProrGeneralConfiguration createGeneralConfiguration(
			ProrToolExtension uiToolExtension) {
		if (uiToolExtension.getGeneralConfiguration() != null) {
			return uiToolExtension.getGeneralConfiguration();
		}

		// Does not exist yet - create.
		ProrGeneralConfiguration generalConfig = ConfigurationFactory.eINSTANCE
				.createProrGeneralConfiguration();
		editor.getEditingDomain()
				.getCommandStack()
				.execute(
						SetCommand.create(
								editor.getEditingDomain(),
								uiToolExtension,
								ConfigurationPackage.PROR_TOOL_EXTENSION__GENERAL_CONFIGURATION,
								generalConfig));
		return generalConfig;
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// No action required.
	}

}
