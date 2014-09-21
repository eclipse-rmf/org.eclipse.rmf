package org.eclipse.rmf.reqif10.search.ui.dialogs;

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
import org.eclipse.rmf.reqif10.search.criteria.Criteria;
import org.eclipse.rmf.reqif10.search.criteria.CriteriaPackage.Literals;
import org.eclipse.rmf.reqif10.search.criteria.Operator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

/**
 * 
 * @author Hussein MHANNA
 * 
 */
public class CriteriaDetailsPage implements IDetailsPage {

	/**
	 * The managed form
	 */
	private IManagedForm managedForm;

	/**
	 * The input object
	 */
	private Object input;
	/**
	 * The feature text widget
	 */
	private Text featureTextWidget;
	/**
	 * The operator combo viewer
	 */
	private ComboViewer operatorComboViewer;
	/**
	 * The searched text widget
	 */
	private Text searchedTextWidget;
	/**
	 * The replacement text widget
	 */
	private Text replacementTextWidget;
	/**
	 * The case sensitive check button
	 */
	private Button caseSensitiveButton;
	/**
	 * The writable value
	 */
	private WritableValue writableValue = new WritableValue();
	/**
	 * The editing domain
	 */
	private EditingDomain editingDomain;
	/**
	 * The form toolkit
	 */
	private FormToolkit toolkit;
	/**
	 * The data binding context
	 */
	private DataBindingContext bindingContext;

	/**
	 * The constructor
	 * 
	 * @param editingDomain
	 *            : The editing domain
	 */
	public CriteriaDetailsPage(EditingDomain editingDomain) {
		this.editingDomain = editingDomain;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void initialize(final IManagedForm form) {
		managedForm = form;
	}

	/**
	 * Return the {@link FormToolkit} of the managed form
	 * 
	 * @return The {@link FormToolkit} of the managed form
	 */
	protected FormToolkit getFormToolkit() {
		return managedForm.getToolkit();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void dispose() {
		managedForm.getToolkit().dispose();
	}

	/**
	 * Set the focus to the form of the {@link IManagedForm}
	 */
	@Override
	public void setFocus() {
		managedForm.getForm().setFocus();

	}

	/**
	 * {@inheritDoc} This method return <code>false</code>
	 */
	@Override
	public boolean isDirty() {
		return false;
	}

	/**
	 * {@inheritDoc} This method do nothing
	 */
	@Override
	public void commit(final boolean onSave) {
	}

	/**
	 * {@inheritDoc} This method return <code>false</code>
	 */
	@Override
	public boolean setFormInput(final Object input) {
		return false;
	}

	/**
	 * {@inheritDoc} This method return <code>false</code>
	 */
	@Override
	public boolean isStale() {
		return false;
	}

	/**
	 * {@inheritDoc} This method do nothing
	 */
	@Override
	public void refresh() {
	}

	/**
	 * {@inheritDoc} Update the selection and call {@link #update(Object)}
	 */
	@Override
	public void selectionChanged(final IFormPart part,
			final ISelection selection) {
		final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
		if (structuredSelection.size() == 1) {
			input = (Criteria) structuredSelection.getFirstElement();
		}
		writableValue.setValue(input);
	}

	protected void initDataBindings() {
		bindingContext = new DataBindingContext();
		Binding featureComboViewerBinding = bindTextWidget(featureTextWidget,
				Literals.CRITERIA__FEATURE_NAME);
		ControlDecorationSupport.create(featureComboViewerBinding, SWT.TOP
				| SWT.LEFT);
		Binding operatorComboViewerBinding = bindComboViewer(
				operatorComboViewer, Literals.CRITERIA__OPERATOR);
		ControlDecorationSupport.create(operatorComboViewerBinding, SWT.TOP
				| SWT.LEFT);
		Binding searchedTextBinding = bindTextWidget(searchedTextWidget,
				Literals.CRITERIA__SERACHED_TEXT);
		ControlDecorationSupport
				.create(searchedTextBinding, SWT.TOP | SWT.LEFT);

		Binding replacementTextBinding = bindTextWidget(replacementTextWidget,
				Literals.CRITERIA__REPLACEMENT_TEXT);
		ControlDecorationSupport.create(replacementTextBinding, SWT.TOP
				| SWT.LEFT);
		bindButton(caseSensitiveButton, Literals.CRITERIA__SENSITIVE_CASE);
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

	private Binding bindButton(Button button, EStructuralFeature feature) {
		//
		IObservableValue target = WidgetProperties.selection().observe(button);
		IObservableValue model = EMFEditObservables.observeDetailValue(
				Realm.getDefault(), editingDomain, writableValue, feature);
		return bindingContext.bindValue(target, model, null, null);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void createContents(final Composite parent) {
		toolkit = managedForm.getToolkit();
		parent.setLayout(new FillLayout());
		//
		Section section = toolkit.createSection(parent,
				ExpandableComposite.EXPANDED | ExpandableComposite.TITLE_BAR);
		section.setText("Criteria Details");
		//
		Composite composite = toolkit.createComposite(section, SWT.NONE);
		section.setClient(composite);
		composite.setLayout(new GridLayout(2, false));

		createFeatureText(composite);

		createOperatorComboViewer(composite);

		createSearchedText(composite);

		createReplacementText(composite);

		createSensitiveButton(composite);
		initDataBindings();
	}

	private void createSensitiveButton(Composite composite) {
		createLabel(composite, "Case Sensitive");
		caseSensitiveButton = toolkit.createButton(composite, "", SWT.CHECK);
		caseSensitiveButton.setLayoutData(new GridData(SWT.BEGINNING,
				SWT.CENTER, false, false, 1, 1));
	}

	private void createReplacementText(Composite composite) {
		replacementTextWidget = createText("Replacement", composite);
	}

	private void createSearchedText(Composite composite) {
		searchedTextWidget = createText("Searched Text", composite);
	}

	private Text createText(String labelText, Composite composite) {
		createLabel(composite, labelText);
		Text text = toolkit.createText(composite, "", SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		return text;
	}

	private void createOperatorComboViewer(Composite composite) {
		operatorComboViewer = createComboViewer("Operator", composite,
				Operator.values());
	}

	private void createFeatureText(Composite composite) {
		featureTextWidget = createText("Feature", composite);
	}

	private Label createLabel(Composite parent, String labelText) {
		return toolkit.createLabel(parent, labelText);
	}

	private ComboViewer createComboViewer(String labelText, Composite parent,
			Object input) {
		createLabel(parent, labelText);
		ComboViewer comboViewer = new ComboViewer(parent, SWT.READ_ONLY);
		Combo combo = comboViewer.getCombo();
		combo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1,
				1));
		toolkit.paintBordersFor(combo);
		comboViewer.setLabelProvider(new LabelProvider());
		comboViewer.setContentProvider(new ArrayContentProvider());
		comboViewer.setInput(input);
		return comboViewer;
	}
}
