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

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * 
 * @author Hussein MHANNA
 * 
 */
public class CSVImportWizardPage extends WizardPage {

	/**
	 * The reqif file extension
	 */
	private static final String REQIF_EXTENSION = "reqif";
	/**
	 * The reqif file extension
	 */
	private static final String CSV_EXTENSION = "csv";

	/**
     * 
     */
	private static final String[] CSV_SEPARATOR_ARRAY = new String[] { ",",
			";", ":", ".", "\t", "|", "^" };

	/**
	 * The selected path to the file
	 */
	private String selectedFilePath = "";

	/**
	 * The csv separator
	 */
	private String separator = CSV_SEPARATOR_ARRAY[0];

	/**
	 * Indicate if the csv contains a header
	 */
	private boolean containsHeader;

	/**
	 * The selected path to the file
	 */
	private IFile selectedDestinationFile;

	/**
	 * The constructor
	 */
	public CSVImportWizardPage() {
		super("Import requirements from CSV");
		setTitle("Import requirements from CSV");
		setDescription("Requirements CSV File Import Wizard");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void createControl(final Composite parent) {
		final Composite mainComposite = new Composite(parent, SWT.NONE);
		mainComposite.setLayoutData(new GridData(GridData.FILL, GridData.FILL,
				true, true));
		final GridLayout gridLayout = new GridLayout();
		mainComposite.setLayout(gridLayout);

		createFileSelectionGroup(mainComposite);

		createConfigurationGroup(mainComposite);

		createReqIFFileSelectionComposite(mainComposite);
		validatePage();
		setControl(mainComposite);
	}

	/**
	 * Create the file selection group.
	 * 
	 * @param parent
	 *            : The parent composite
	 */
	protected Group createFileSelectionGroup(final Composite parent) {
		final Group group = createGroup(parent, "File Selection");
		createLabel(group, "File :");
		final Text text = createText(group);

		text.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				selectedFilePath = text.getText();
				validatePage();
			}
		});

		final Button button = createButton(group, "Browse");
		button.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				final String filePath = browseForFile();
				if ((filePath != null) && !filePath.isEmpty()) {
					text.setText(filePath);
				}
			}
		});
		return group;
	}

	/**
	 * Create the configuration group.
	 * 
	 * @param parent
	 *            : The parent composite
	 */
	protected Group createConfigurationGroup(final Composite parent) {
		final Group group = createGroup(parent, "Configuration");
		createLabel(group, "Separator character");
		ComboViewer comboViewer = new ComboViewer(group);
		comboViewer.setContentProvider(new ArrayContentProvider());
		comboViewer.setLabelProvider(new LabelProvider());
		comboViewer.setInput(CSV_SEPARATOR_ARRAY);
		comboViewer.setSelection(new StructuredSelection(separator));
		comboViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						separator = ((IStructuredSelection) event
								.getSelection()).getFirstElement().toString();
					}
				});
		comboViewer.getCombo().setLayoutData(
				new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		final Button headerButton = new Button(group, SWT.CHECK);
		headerButton.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false,
				3, 1));
		headerButton.setText("The csv file contains a header");
		headerButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				super.widgetSelected(e);
				containsHeader = headerButton.getSelection();
			}
		});
		return group;
	}

	/**
	 * Create the file destination selection group.
	 * 
	 * @param parent
	 *            : The parent composite
	 */
	protected Group createFileDestinationSelectionGroup(final Composite parent) {
		final Group group = createGroup(parent, "ReqIF File destination");
		group.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		createReqIFFileSelectionComposite(group);
		return group;
	}

	/**
	 * Create a {@link Group}
	 * 
	 * @param parent
	 *            : The parent composite
	 * @param groupText
	 *            : The group text
	 * @return The created {@link Group}
	 */
	private Group createGroup(final Composite parent, String groupText) {
		Group group = new Group(parent, SWT.NONE);
		group.setText(groupText);
		group.setLayout(new GridLayout(3, false));
		group.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		return group;

	}

	/**
	 * Create a {@link Label}
	 * 
	 * @param parent
	 *            : The parent composite
	 * @param labelText
	 *            : The label text
	 * @return The created {@link Label}
	 */
	protected Label createLabel(final Composite parent, String labelText) {
		final Label label = new Label(parent, SWT.NONE);
		label.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false,
				1, 1));
		label.setText(labelText);
		return label;
	}

	/**
	 * Create a {@link Text}
	 * 
	 * @param parent
	 *            : The parent composite
	 * @return The created {@link Text}
	 */
	protected Text createText(final Composite parent) {
		Text text = new Text(parent, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		return text;
	}

	/**
	 * Create a button with the text "Browse..."
	 * 
	 * @param parent
	 *            : The parent composite
	 * @param buttonText
	 *            : The button text
	 * @return The created button
	 */
	protected Button createButton(final Composite parent, String buttonText) {
		final Button button = new Button(parent, SWT.NONE);
		button.setText(buttonText);
		return button;
	}

	/**
	 * Create the file selection composite
	 * 
	 * @param parent
	 *            : The parent composite
	 */
	protected void createReqIFFileSelectionComposite(Composite parent) {
		Group group = createGroup(parent, "Destination ReqIF File");
		group.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true,
				true));
		TreeViewer treeViewer = new TreeViewer(group);
		treeViewer.getTree().setLayoutData(
				new GridData(GridData.FILL, GridData.FILL, true, true));
		treeViewer.setContentProvider(new BaseWorkbenchContentProvider());
		treeViewer.setLabelProvider(new WorkbenchLabelProvider());
		ViewerFilter reqifFilter = new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement,
					Object element) {
				if (element instanceof IFile) {
					return isReqIFFile((IFile) element);
				}
				return true;
			}
		};
		treeViewer.setFilters(new ViewerFilter[] { reqifFilter });
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IFile file = null;
				IStructuredSelection selection = (IStructuredSelection) event
						.getSelection();
				if (false == selection.isEmpty()) {
					Object object = selection.getFirstElement();
					if (object instanceof IFile && isReqIFFile((IFile) object)) {
						file = (IFile) object;
					}
				}
				selectedDestinationFile = file;
				validatePage();
			}
		});
		treeViewer.setInput(ResourcesPlugin.getWorkspace().getRoot());
	}

	/**
	 * Return whether a file is an reqif file
	 * 
	 * @param file
	 *            : The file
	 * @return <code>true</code> if the file extsntion is
	 *         {@link #REQIF_EXTENSION} and <code>false</code> otherwise
	 */
	protected boolean isReqIFFile(IFile file) {
		return file.getFileExtension().equals(REQIF_EXTENSION);
	}

	/**
	 * Browse for a file
	 * 
	 * @return The selected path if any and an empty
	 */
	protected String browseForFile() {
		final FileDialog dialog = createFileDialog();
		final String path = dialog.open();
		return path == null ? "" : path;
	}

	/**
	 * Create and return {@link FileDialog}
	 * 
	 * @return The created {@link FileDialog}
	 */
	protected FileDialog createFileDialog() {
		final FileDialog dialog = new FileDialog(getShell(), SWT.OPEN);
		dialog.setFilterExtensions(new String[] { "*." + CSV_EXTENSION });
		return dialog;
	}

	/**
	 * Update the status of the page, if it is complete or not.
	 */
	protected boolean validatePage() {

		boolean valid = true;

		if (selectedFilePath.isEmpty()) {
			setFieldEmptyErrorMessage();
			valid = false;
		} else if (false == checkFileExtension(selectedFilePath)) {
			setExtensionErrorMessage();
			valid = false;
		} else if (false == isFileExist(selectedFilePath)) {
			setNoFileErrorMessage(selectedFilePath);
			valid = false;
		} else if (selectedDestinationFile == null) {
			setSelectedReqIFDestinationFileEmptyErrorMessage();
			valid = false;
		}
		if (valid) {
			setPageComplete(true);
			setMessage(null);
			setErrorMessage(null);
		}

		return valid;
	}

	/**
	 * Check if the extension file is compatible.
	 * 
	 * @param path
	 *            : The path
	 * @return <code>true</code> if the file extension is compatible and
	 *         <code>false</code> otherwise
	 */
	protected boolean checkFileExtension(final String path) {
		return path.endsWith("."+CSV_EXTENSION);
	}

	/**
	 * Check if the given file path is valid.
	 * 
	 * @param filePath
	 *            : The path
	 * @return <code>true</code> if the path is valid (exist on the disk) and
	 *         <code>false</code> otherwise
	 */
	protected boolean isFileExist(final String filePath) {
		return new File(filePath).exists();
	}

	/**
	 * Set the error message indicating that the text field is empty
	 */
	protected void setFieldEmptyErrorMessage() {
		setMessage(null);
		setErrorMessage(" Please select a csv file to import");
		setPageComplete(false);
	}

	/**
	 * Set the error message indicating that the file must end with .csv
	 */
	protected void setExtensionErrorMessage() {
		setMessage(null);
		setErrorMessage("The file name must end with .csv");
		setPageComplete(false);
	}

	/**
	 * Set the error message indicating that the file doesn't exist
	 * 
	 * @param fileName
	 *            : The file name
	 */
	protected void setNoFileErrorMessage(final String fileName) {
		setMessage(null);
		setErrorMessage("The file " + fileName + "doesn't exists");
		setPageComplete(false);
	}

	/**
	 * Set the error message indicating that not selected reqif destination file
	 * selected
	 */
	protected void setSelectedReqIFDestinationFileEmptyErrorMessage() {
		setMessage(null);
		setErrorMessage(" Please select the destination ReqIF file (*.reqif)");
		setPageComplete(false);
	}

	/**
	 * Get the selected file path.
	 * 
	 * @return the selected file path
	 */
	public String getSelectedFilePath() {
		return selectedFilePath;
	}

	/**
	 * Return the separator
	 * 
	 * @return The separator
	 */
	public char getSeparator() {
		return separator.charAt(0);
	}

	/**
	 * Return the selected destination file
	 * 
	 * @return The selected destination file
	 */

	public IFile getSelectedDestinationFile() {
		return selectedDestinationFile;
	}

	/**
	 * Return whether the csv file contains a header
	 * 
	 * @return <code>true</code> if the csv file contains a header and
	 *         <code>false</code> otherwise
	 */
	public boolean isContainsHeader() {
		return containsHeader;
	}
}
