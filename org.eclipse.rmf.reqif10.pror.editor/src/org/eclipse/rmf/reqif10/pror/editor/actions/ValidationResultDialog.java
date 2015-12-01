package org.eclipse.rmf.reqif10.pror.editor.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

public class ValidationResultDialog extends TitleAreaDialog {

	private ListViewer list;
	private IStatus result;
	private TreeViewer targetViewer;

	public ValidationResultDialog(Shell parentShell) {
		super((Shell)null);
		setHelpAvailable(false);
	}


	@Override
	public void create() {
		super.create();
		setTitle("Validation Results");
		if (result.isOK()){
			setMessage(result.getMessage(), IMessageProvider.INFORMATION );
		}else{
			String message = result.getMessage();
			if (result.isMultiStatus() && getStatus().length>1){
				message += System.lineSeparator() + " Click a message below to select the affected element.";
			}
			setMessage(message,  IMessageProvider.ERROR);
		}
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
	    GridLayout layout = new GridLayout(1, false);
	    container.setLayout(layout);

		list = new ListViewer(container, SWT.SINGLE | SWT.V_SCROLL );
		list.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		list.setContentProvider(new IStructuredContentProvider() {
			
			public void inputChanged(Viewer viewer, Object oldInput,
					Object newInput) {
			}

			public void dispose() {
			}

			public Object[] getElements(Object inputElement) {
				return getStatus();
				
			}
		});
		
		list.setLabelProvider(new LabelProvider() {

			@Override
			public String getText(Object element) {
				if (element instanceof IStatus) {
					IStatus status = (IStatus) element;
					return status.getMessage();
				}
				return null;
			}
		});
		
		list.setInput(result);
		list.setSelection(StructuredSelection.EMPTY);
		
		list.addSelectionChangedListener(new ISelectionChangedListener() {
			
			public void selectionChanged(SelectionChangedEvent event) {
				if (targetViewer == null){
					return;
				}
				if (list.getSelection() instanceof StructuredSelection) {
					StructuredSelection selection = (StructuredSelection) list.getSelection();
					Object element = selection.getFirstElement();
					if (element instanceof ConstraintStatus) {
						EObject target = ((ConstraintStatus) element).getTarget();
						targetViewer.setSelection(new StructuredSelection(target));
					}
				}
			}
		});

		return container;
	}

	// overriding this methods allows you to set the
	// title of the custom dialog
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Validation Result");
	}
	
	
	// return all status that are not OK
	private Object[] getStatus() {
		if (!result.isMultiStatus()){
			return new IStatus[]{result};
		}
		
		List<IStatus> list = new ArrayList<IStatus>(result.getChildren().length);
		for (IStatus childStatus : result.getChildren()) {
			if (!childStatus.isOK()){
				list.add(childStatus);
			}
		}
		
		if (list.isEmpty()){
			list.add(result);
		}
		
		return list.toArray();
	}

	public void setResults(IStatus status) {
		this.result = status;
	}

	public void setTargetViewer(TreeViewer viewer) {
		this.targetViewer = viewer;
	}

	protected Button createButton(Composite parent, int id, String label,
			boolean defaultButton) {
		if (id == IDialogConstants.CANCEL_ID){
			return null;
		}
		return super.createButton(parent, id, label, defaultButton);
		
	}
}
