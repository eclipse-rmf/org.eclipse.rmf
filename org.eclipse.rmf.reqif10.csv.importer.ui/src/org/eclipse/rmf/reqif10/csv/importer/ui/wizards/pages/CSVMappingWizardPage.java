/*******************************************************************************
 * Copyright (c) 2014 Hussein Mhanna
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Hussein Mhanna - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.csv.importer.ui.wizards.pages;

import java.util.EventObject;
import java.util.List;

import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.rmf.reqif10.csv.importer.mapping.MappingFactory;
import org.eclipse.rmf.reqif10.csv.importer.mapping.MappingItem;
import org.eclipse.rmf.reqif10.csv.importer.mapping.MappingLibrary;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

/**
 * 
 * @author Etienne MHANNA
 *
 */
public class CSVMappingWizardPage extends WizardPage {

	private LeftMappingPart leftMappingPart;
	private RightMappingPart rightMappingPart;
	private MappingLibrary mappingLibrary;

	/**
	 * Create the wizard.
	 */
	public CSVMappingWizardPage() {
		super("Mapping Wizard Page");
		setTitle("Mapping Wizard Page");
		setDescription("Mapping Wizard Page");
	}

	/**
	 * Create contents of the wizard.
	 * 
	 * @param parent
	 */
	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL, GridData.FILL,
				true, true));
		composite.setLayout(new FillLayout());

		SashForm sashForm = new SashForm(composite, SWT.NONE);
		mappingLibrary = MappingFactory.eINSTANCE.createMappingLibrary();
		leftMappingPart = new LeftMappingPart(sashForm, mappingLibrary);
		Composite rightMappingPartContainer = new Composite(sashForm, SWT.NONE);
		rightMappingPartContainer.setLayout(new FillLayout());
		rightMappingPart = new RightMappingPart(rightMappingPartContainer,
				leftMappingPart.getEditingDomain());
		rightMappingPart.setVisible(false);
		leftMappingPart
				.addSelectionChangedListener(new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						boolean visible = false;
						IStructuredSelection selection = (IStructuredSelection) event
								.getSelection();
						if (selection.getFirstElement() instanceof MappingItem) {
							rightMappingPart.selectionChanged(event
									.getSelection());
							visible = true;
						}
						rightMappingPart.setVisible(visible);
					}
				});
		leftMappingPart.getEditingDomain().getCommandStack()
				.addCommandStackListener(new CommandStackListener() {

					@Override
					public void commandStackChanged(EventObject event) {
						validatePage();
					}
				});
		sashForm.setWeights(new int[] { 45, 55 });
		validatePage();
		setControl(composite);
	}

	/**
	 * Update the status of the page, if it is complete or not.
	 */
	protected boolean validatePage() {
		setPageComplete(false);
		boolean valid = true;
		EList<MappingItem> items = mappingLibrary.getItems();
		if (items.isEmpty()) {
			setErrorMessage("At least one mapping item must be exist");
			valid = false;
		}
		for (MappingItem mappingItem : items) {
			String errorMessage = "";
			if (mappingItem.getColumnId().isEmpty()) {
				errorMessage = "A mapping item have an empty column id";
			} else if (containsDuplicateColumnId(mappingItem.getColumnId(),
					items)) {
				errorMessage = "Several mapping item have a column id as "
						+ mappingItem.getColumnId();
			} else if (mappingItem.getAttributeName().isEmpty()) {
				errorMessage = "A mapping item have an empty attribute name";
			} else if (containsDuplicateAttributeName(
					mappingItem.getAttributeName(), items)) {
				errorMessage = "Several mapping item have a attribute name as "
						+ mappingItem.getAttributeName();
			}
			if (false == errorMessage.isEmpty()) {
				setErrorMessage(errorMessage);
				valid = false;
			}
		}
		if (valid) {
			setPageComplete(true);
			setMessage(null);
			setErrorMessage(null);
		}

		return valid;
	}

	private boolean containsDuplicateColumnId(String columnId,
			EList<MappingItem> items) {
		int count = 0;
		for (MappingItem item : items) {
			if (columnId.equals(item.getColumnId())) {
				if (count == 1) {
					return true;
				}
				count++;
			}
		}
		return false;
	}

	private boolean containsDuplicateAttributeName(String name,
			EList<MappingItem> items) {
		int count = 0;
		for (MappingItem item : items) {
			if (name.equals(item.getAttributeName())) {
				if (count == 1) {
					return true;
				}
				count++;
			}
		}
		return false;
	}

	public void setColumnMappingInput(List<String> columnIDS) {
		rightMappingPart.setColumnMappingInput(columnIDS);
	}

	public MappingLibrary getMappingLibrary() {
		return mappingLibrary;
	}
}
