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

import static org.eclipse.rmf.reqif10.csv.importer.mapping.MappingPackage.Literals.MAPPING_ITEM__ATTRIBUTE_NAME;
import static org.eclipse.rmf.reqif10.csv.importer.mapping.MappingPackage.Literals.MAPPING_ITEM__COLUMN_ID;
import static org.eclipse.rmf.reqif10.csv.importer.mapping.MappingPackage.Literals.MAPPING_ITEM__DATA_TYPE;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.fieldassist.ControlDecorationSupport;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.rmf.reqif10.csv.importer.mapping.DataType;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class RightMappingPart extends Composite {

	/**
	 * The input object
	 */
	private Object input;

	/**
	 * The column mapping combo viewer
	 */
	private ComboViewer columnMappingComboViewer;

	/**
	 * The attribute name text widget
	 */
	private Text attributeNameTextWidget;

	/**
	 * The data type combo viewer
	 */
	private ComboViewer dataTypeComboViewer;

	/**
	 * The writable value
	 */
	private WritableValue writableValue = new WritableValue();

	/**
	 * The editing domain
	 */
	private EditingDomain editingDomain;

	/**
	 * The data binding context
	 */
	private DataBindingContext bindingContext;

	private List<String> columnMappingInput = new ArrayList<String>();

	public RightMappingPart(Composite parent, EditingDomain editingDomain) {
		super(parent, SWT.NONE);
		this.editingDomain = editingDomain;
		setLayout(new FillLayout());
		createControls();
	}

	/**
	 * {@inheritDoc} Update the selection and call {@link #update(Object)}
	 */
	public void selectionChanged(final ISelection selection) {
		final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
		if (structuredSelection.size() == 1) {
			input = structuredSelection.getFirstElement();
		}
		writableValue.setValue(input);
	}

	protected void initDataBindings() {
		bindingContext = new DataBindingContext();
		Binding columnMappingComboViewerBinding = bindComboViewer(
				columnMappingComboViewer, MAPPING_ITEM__COLUMN_ID);
		ControlDecorationSupport.create(columnMappingComboViewerBinding,
				SWT.TOP | SWT.LEFT);

		Binding attributeNameTextWidgetBinding = bindTextWidget(
				attributeNameTextWidget, MAPPING_ITEM__ATTRIBUTE_NAME);
		ControlDecorationSupport.create(attributeNameTextWidgetBinding, SWT.TOP
				| SWT.LEFT);
		Binding dataTypeComboViewerBinding = bindComboViewer(
				dataTypeComboViewer, MAPPING_ITEM__DATA_TYPE);
		ControlDecorationSupport.create(dataTypeComboViewerBinding, SWT.TOP
				| SWT.LEFT);
	}

	private Binding bindTextWidget(Text textWidget, EStructuralFeature feature) {
		IObservableValue target = WidgetProperties.text(SWT.Modify).observe(
				textWidget);
		IObservableValue model = EMFEditObservables.observeDetailValue(
				Realm.getDefault(), editingDomain, writableValue, feature);
		return bindingContext.bindValue(target, model, null, null);
	}

	private Binding bindComboViewer(ComboViewer comboViewer,
			EStructuralFeature feature) {
		//
		IObservableValue target = ViewersObservables
				.observeSingleSelection(comboViewer);
		IObservableValue model = EMFEditObservables.observeDetailValue(
				Realm.getDefault(), editingDomain, writableValue, feature);
		return bindingContext.bindValue(target, model, null, null);
	}

	private void createControls() {
		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));

		createColumnMappingComboViewer(composite);

		createAttributeNameTextWidget(composite);

		createDataTypeComboViewer(composite);

		initDataBindings();
	}

	private void createColumnMappingComboViewer(Composite composite) {
		columnMappingComboViewer = createComboViewer("Column Mapping: ",
				composite, columnMappingInput);
	}

	protected void setColumnMappingInput(List<String> columnMappingInput) {
		this.columnMappingInput.clear();
		this.columnMappingInput.add("");
		this.columnMappingInput.addAll(columnMappingInput);
		if (columnMappingComboViewer != null) {
			columnMappingComboViewer.refresh();
		}
	}

	private void createAttributeNameTextWidget(Composite composite) {
		attributeNameTextWidget = createText("Attribute Name:", composite);
	}

	private void createDataTypeComboViewer(Composite composite) {
		dataTypeComboViewer = createComboViewer("Data Type: ", composite,
				DataType.values());
	}

	private Label createLabel(Composite parent, String labelText) {
		Label label = new Label(parent, SWT.NONE);
		label.setText(labelText);
		return label;
	}

	private Text createText(String labelText, Composite composite) {
		createLabel(composite, labelText);
		Text text = new Text(composite, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		return text;
	}

	private ComboViewer createComboViewer(String labelText, Composite parent,
			Object input) {
		createLabel(parent, labelText);
		ComboViewer comboViewer = new ComboViewer(parent, SWT.READ_ONLY);
		Combo combo = comboViewer.getCombo();
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1,
				1));
		comboViewer.setLabelProvider(new LabelProvider());
		comboViewer.setContentProvider(new ArrayContentProvider());
		comboViewer.setInput(input);
		return comboViewer;
	}

}
