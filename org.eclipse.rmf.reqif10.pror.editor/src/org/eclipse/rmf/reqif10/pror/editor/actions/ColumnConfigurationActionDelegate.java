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

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIFToolExtension;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.pror.configuration.Column;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationFactory;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage;
import org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension;
import org.eclipse.rmf.reqif10.pror.editor.presentation.ReqifSpecificationEditorInput;
import org.eclipse.rmf.reqif10.pror.editor.presentation.SpecificationEditor;
import org.eclipse.rmf.reqif10.pror.util.ConfigurationUtil;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class ColumnConfigurationActionDelegate implements IEditorActionDelegate {

	private SpecificationEditor editor;

	/**
	 * Retrieves the {@link EditingDomain} from the Editor if present.
	 */
	public void setActiveEditor(IAction action, IEditorPart editor) {
		if (editor instanceof SpecificationEditor) {
			this.editor = (SpecificationEditor) editor;
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

		Object input = editor.getEditorInput();

		if (input instanceof ReqifSpecificationEditorInput) {
			Specification spec = ((ReqifSpecificationEditorInput) input)
					.getSpec();
			ProrToolExtension toolConfig = ConfigurationUtil
					.createProrToolExtension(reqif, editor.getEditingDomain());
			EList<ProrSpecViewConfiguration> configs = toolConfig
					.getSpecViewConfigurations();
			for (final ProrSpecViewConfiguration config : configs) {
				if (spec.equals(config.getSpecification())) {
					launchColumnDialog(config);
					return;
				}
			}
			// We didn't find a configuration yet - create one.
			ProrSpecViewConfiguration config = ConfigurationFactory.eINSTANCE
					.createProrSpecViewConfiguration();
			config.setSpecification(spec);
			toolConfig.getSpecViewConfigurations().add(config);
			launchColumnDialog(config);
		}
	}

	private void launchColumnDialog(final ProrSpecViewConfiguration config) {
		SubtreeDialog dialog = new SubtreeDialog(editor.getReqifEditor(),
				config, "Configure columns for "
						+ ConfigurationUtil.getSpecElementLabel(
								config.getSpecification(),
								editor.getAdapterFactory()),
				"org.eclipse.rmf.reqif10.pror.editor.columnConfiguration");
		dialog.setActions(new IAction[] { buildAddColumnAction(config) }, false);
		dialog.open();
		return;
	}

	/**
	 * Creates a new Column. If no Columns are present, this is the only way to
	 * add Columns.
	 */
	private IAction buildAddColumnAction(final ProrSpecViewConfiguration config) {
		IAction addColumnAction = new Action("Add Column") {
			@Override
			public void run() {
				// This is a compound command: We resize all existing columns to
				// squeeze in the new one
				CompoundCommand compoundCmd = new CompoundCommand("Add Column");
				int shrink = 0;
				if (config.getColumns().size() > 0)
					shrink = 100 / config.getColumns().size();

				for (Column column : config.getColumns()) {
					int newWidth = column.getWidth() - shrink;
					// Make sure Columns are at least 20 pixel, so they don't
					// disappear
					if (newWidth < 20)
						newWidth = 100;
					Command command = SetCommand.create(editor
							.getEditingDomain(), column,
							ConfigurationPackage.Literals.COLUMN__WIDTH, newWidth);
					compoundCmd.append(command);
				}

				Command command = AddCommand
						.create(
								editor.getEditingDomain(),
								config,
								ConfigurationPackage.Literals.PROR_SPEC_VIEW_CONFIGURATION__COLUMNS,
								ConfigurationFactory.eINSTANCE.createColumn());
				compoundCmd.append(command);
				editor.getEditingDomain().getCommandStack()
						.execute(compoundCmd);

			}
		};

		ImageDescriptor imgDescriptor = AbstractUIPlugin
				.imageDescriptorFromPlugin("org.eclipse.rmf.reqif10.pror.editor.editor",
						"icons/full/obj16/AddColumn.png");
		addColumnAction.setImageDescriptor(imgDescriptor);
		return addColumnAction;
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// No action required.
	}

}
