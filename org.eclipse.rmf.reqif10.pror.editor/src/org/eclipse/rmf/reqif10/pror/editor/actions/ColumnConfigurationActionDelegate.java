/*******************************************************************************
 * Copyright (c) 2011, 2013 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor.actions;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicEList;
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
import org.eclipse.rmf.reqif10.pror.configuration.UnifiedColumn;
import org.eclipse.rmf.reqif10.pror.editor.ISpecificationEditor;
import org.eclipse.rmf.reqif10.pror.editor.presentation.ReqifSpecificationEditorInput;
import org.eclipse.rmf.reqif10.pror.util.ConfigurationUtil;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class ColumnConfigurationActionDelegate implements IEditorActionDelegate {

	private ISpecificationEditor editor;

	/**
	 * Retrieves the {@link EditingDomain} from the Editor if present.
	 */
	public void setActiveEditor(IAction action, IEditorPart editor) {
		if (editor instanceof ISpecificationEditor) {
			this.editor = (ISpecificationEditor) editor;
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
		SubtreeDialog dialog = new SubtreeDialog(editor,
				config, "Configure columns for "
						+ ConfigurationUtil.getSpecElementLabel(
								config.getSpecification(),
								editor.getAdapterFactory()),
				"org.eclipse.rmf.reqif10.pror.editor.columnConfiguration");
		dialog.setActions(new IAction[] { buildAddColumnAction(config), buildUnifiedColumnAction(config), buildRebuildColumnsAction(config) }, false);
		dialog.open();
		return;
	}

	/**
	 * The Unified Column shows Reqif.Text and Reqif.Title in the same column
	 */
	private IAction buildUnifiedColumnAction(final ProrSpecViewConfiguration config) {
		final IAction toggleUnifiedColumnAction = new Action("Unified Column") {
			
			@Override
			public void run() {
				if (! containsUnifiedColumn(config)) {
					UnifiedColumn column = ConfigurationFactory.eINSTANCE.createUnifiedColumn();
					column.setLabel("Main");
					Command cmd = AddCommand
							.create(editor.getEditingDomain(),
									config,
									ConfigurationPackage.Literals.PROR_SPEC_VIEW_CONFIGURATION__COLUMNS,
									column);
					editor.getEditingDomain().getCommandStack().execute(cmd);
				}
			}
		};
		config.eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				super.notifyChanged(msg);
				toggleUnifiedColumnAction.setEnabled(! containsUnifiedColumn(config));
			}
		});
		toggleUnifiedColumnAction.setEnabled(! containsUnifiedColumn(config));
		return toggleUnifiedColumnAction;
	}

	/**
	 * @return true if the given config already contains a {@link UnifiedColumn}.
	 */
	private boolean containsUnifiedColumn(ProrSpecViewConfiguration config) {
		for (Column column : config.getColumns()) {
			if (column instanceof UnifiedColumn) return true;
		}
		return false;
	}
	
	
	/**
	 * Removes all Columns and adds new ones by analysing the SpecObjectTypes referenced by the Specification 
	 */
	private IAction buildRebuildColumnsAction(final ProrSpecViewConfiguration config) {
		IAction addColumnAction = new Action("Auto add Columns") {
			@Override
			public void run() {
				
				EList<Column> AutoColumns = ConfigurationUtil
						.createColumns(config.getSpecification());
				
				// we need a fresh Object for the undo to work properly
				EList<Column> existingColumns = new BasicEList<Column>(); 
				existingColumns.addAll(config.getColumns());
				
				for (Column column : AutoColumns) {
					boolean columnExisted = false;
					for (Column existingColumn : existingColumns) {
						if (column.getLabel().equals(existingColumn.getLabel())){
							columnExisted = true;
							break;
						}
					}
					if (!columnExisted){
						existingColumns.add(column);
					}
				}
				
				Command command = SetCommand
						.create(editor.getEditingDomain(),
								config,
								ConfigurationPackage.Literals.PROR_SPEC_VIEW_CONFIGURATION__COLUMNS,
								existingColumns);
				editor.getEditingDomain().getCommandStack().execute(command);

			}
		};

		ImageDescriptor imgDescriptor = AbstractUIPlugin
				.imageDescriptorFromPlugin("org.eclipse.rmf.reqif10.pror.editor.editor",
						"icons/full/obj16/AddColumn.png");
		addColumnAction.setImageDescriptor(imgDescriptor);
		return addColumnAction;
	}
	
	
	/**
	 * Creates a new Column. If no Columns are present, this is the only way to
	 * add Columns.
	 */
	private IAction buildAddColumnAction(final ProrSpecViewConfiguration config) {
		IAction addColumnAction = new Action("Add Column") {
			@Override
			public void run() {
				final Column newColumn = ConfigurationFactory.eINSTANCE.createColumn();

				// This is a compound command: We resize all existing columns to
				// squeeze in the new one
				CompoundCommand compoundCmd = new CompoundCommand("Add Column") {
					@Override
					public Collection<?> getAffectedObjects() {
						HashSet<? super Object> affectedObjects = new HashSet<Object>();
						affectedObjects.add(newColumn);
						return affectedObjects;
					}
				};
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
								newColumn );
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
