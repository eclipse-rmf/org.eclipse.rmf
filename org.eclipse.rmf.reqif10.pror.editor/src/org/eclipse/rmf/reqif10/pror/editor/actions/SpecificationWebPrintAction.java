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

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.window.Window;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.pror.editor.preferences.PreferenceConstants;
import org.eclipse.rmf.reqif10.pror.editor.presentation.Reqif10EditorPlugin;
import org.eclipse.rmf.reqif10.pror.editor.presentation.ReqifSpecificationEditorInput;
import org.eclipse.rmf.reqif10.pror.editor.util.HTMLPrinter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.program.Program;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PlatformUI;

/**
 * @author jastram
 * 
 */
public class SpecificationWebPrintAction extends Action {

	private EditingDomain editingDomain;
	private AdapterFactory adapterFactory;

	/**
	 */
	public SpecificationWebPrintAction(
			EditingDomain editingDomain, AdapterFactory adapterFactory) {
		this.editingDomain = editingDomain;
		this.adapterFactory = adapterFactory;
	}

	@Override
	public void run() {
		// Find the active editor
		IEditorInput input = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor().getEditorInput();
		if (! (input instanceof ReqifSpecificationEditorInput)) {
			return;
		}
		
		Specification spec = ((ReqifSpecificationEditorInput)input).getSpec();
		
		
		boolean exportOutgoingLinks;
		boolean exportIncomingLinks;
		
		boolean askUser = Reqif10EditorPlugin.getPlugin().getPreferenceStore().getBoolean(PreferenceConstants.P_WEB_EXPORT_ALWAYS_ASK_FOR_SPEC_RELATIONS);
		if (askUser){
			HTMLExportDialog dialog = new HTMLExportDialog(spec);
			if (dialog.open() != Window.OK){
				return;
			}
			exportOutgoingLinks = dialog.isExportOutgoingSpecRelations();
			exportIncomingLinks = dialog.isExportIncomingSpecRelations();
		}else{
			// we get the configuration directly from the preference store
			exportOutgoingLinks = Reqif10EditorPlugin.getPlugin().getPreferenceStore()
					.getBoolean(PreferenceConstants.P_WEB_EXPORT_INLUDE_OUTGOING_SPEC_RELATIONS);
			
			exportIncomingLinks = Reqif10EditorPlugin.getPlugin().getPreferenceStore()
					.getBoolean(PreferenceConstants.P_WEB_EXPORT_INLUDE_INCOMING_SPEC_RELATIONS);
		}
		
		
		
		try {
			HTMLPrinter htmlPrinter = new HTMLPrinter(spec, editingDomain, adapterFactory);
			
			htmlPrinter.setExportOutgoingSpecRelations(exportOutgoingLinks);
			htmlPrinter.setExportIncomingSpecRelations(exportIncomingLinks);
			
			File htmlSpec = htmlPrinter.print();
			Program.launch(htmlSpec.getAbsolutePath());
			MessageDialog.openInformation(
					Display.getCurrent().getActiveShell(), "Output produced",
					"Switch to your web browser to see the output.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	
	class HTMLExportDialog extends TitleAreaDialog{
		
		private Specification spec;
		private Button exportOutgoingSpecRelationsButton;
		private Button exportIncomingSpecRelationsButton;
		private boolean exportOutgoingSpecRelations;
		

		private boolean exportIncomingSpecRelations;
		private boolean askForSpecRelations;
		private Button rememberSettingButton;

		
		public HTMLExportDialog(Specification spec) {
			super(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
			this.spec = spec;
			
			exportOutgoingSpecRelations = Reqif10EditorPlugin.getPlugin().getPreferenceStore()
					.getBoolean(PreferenceConstants.P_WEB_EXPORT_INLUDE_OUTGOING_SPEC_RELATIONS);
			
			exportIncomingSpecRelations = Reqif10EditorPlugin.getPlugin().getPreferenceStore()
					.getBoolean(PreferenceConstants.P_WEB_EXPORT_INLUDE_INCOMING_SPEC_RELATIONS);
			
			askForSpecRelations = Reqif10EditorPlugin.getPlugin().getPreferenceStore()
					.getBoolean(PreferenceConstants.P_WEB_EXPORT_ALWAYS_ASK_FOR_SPEC_RELATIONS);
		}
		
		
		@Override
		public void create() {
			super.create();
			setTitle("Print Specification");
	        //setMessage("e", IMessageProvider.INFORMATION);
	        
		}
		
		@Override
		protected Control createDialogArea(Composite parent) {
			Composite dialogArea = (Composite) super.createDialogArea(parent);
			Composite container = new Composite(dialogArea, SWT.NONE);
	        container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
	        GridLayout layout = new GridLayout(2, false);
	        container.setLayout(layout);
			
	        exportOutgoingSpecRelationsButton = new Button(container, SWT.CHECK);
	        exportOutgoingSpecRelationsButton.setSelection(exportOutgoingSpecRelations);
	        new Label(container, SWT.NONE).setText("Print outgoing Links");        
	        
	        exportIncomingSpecRelationsButton = new Button(container, SWT.CHECK);
	        exportIncomingSpecRelationsButton.setSelection(exportIncomingSpecRelations);
	        new Label(container, SWT.NONE).setText("Print incoming Links");
	        
	        new Label(container, SWT.NONE).setText("");
	        new Label(container, SWT.NONE).setText("");
	        
	        rememberSettingButton = new Button(container, SWT.CHECK);
	        new Label(container, SWT.NONE).setText("Don't ask me again.");
	        new Label(container, SWT.NONE).setText("");
	        new Label(container, SWT.NONE).setText("(Settings can be changed through ReqIF Settings.)");

	        
			return dialogArea;
		}
		
		
		@Override
		protected void okPressed() {
			this.exportOutgoingSpecRelations = exportOutgoingSpecRelationsButton.getSelection();
			this.exportIncomingSpecRelations = exportIncomingSpecRelationsButton.getSelection();
			
			//update preferences:
			IPreferenceStore store = Reqif10EditorPlugin.getPlugin().getPreferenceStore();
			if (rememberSettingButton.getSelection()){
				store.setValue(PreferenceConstants.P_WEB_EXPORT_ALWAYS_ASK_FOR_SPEC_RELATIONS, false);
			}
			store.setValue(PreferenceConstants.P_WEB_EXPORT_INLUDE_OUTGOING_SPEC_RELATIONS, exportOutgoingSpecRelations);
			store.setValue(PreferenceConstants.P_WEB_EXPORT_INLUDE_INCOMING_SPEC_RELATIONS, exportIncomingSpecRelations);
			
			super.okPressed();
		}
		
		
		public boolean isExportOutgoingSpecRelations() {
			return exportOutgoingSpecRelations;
		}


		public boolean isExportIncomingSpecRelations() {
			return exportIncomingSpecRelations;
		}

		
	}
}
