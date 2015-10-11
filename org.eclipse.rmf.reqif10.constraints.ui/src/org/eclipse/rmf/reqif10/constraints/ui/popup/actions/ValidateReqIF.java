package org.eclipse.rmf.reqif10.constraints.ui.popup.actions;

import java.util.List;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.rmf.internal.reqif10.constraints.ReqIFDiagnostician;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIFHeader;
import org.eclipse.rmf.reqif10.constraints.validator.Issue;
import org.eclipse.rmf.reqif10.constraints.validator.ReqIFValidator;
import org.eclipse.rmf.reqif10.serialization.ReqIF10LocationStore;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class ValidateReqIF implements IObjectActionDelegate {

	private Shell shell;
	private ISelection selection;
	private IResource resource;
	
	private final static String markerType = "org.eclipse.rmf.reqif10.constraints.ui.reqIFValidation";
	
	
	/**
	 * Constructor for Action1.
	 */
	public ValidateReqIF() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		ReqIF reqif = loadReqif();
		String filename = getFilenameFromCurrentSelection();
		try{
			validateReqIF(reqif);

			MessageDialog.openInformation(
				shell,
				"ReqIF Validation",
				filename + " has been validated. Please check the Problems View for created Error Markers." );
			
		}catch(CoreException e){
			MessageDialog.openError(
					shell,
					"ReqIF Validation",
					"An error occured while validating " + filename + ": " + e.getMessage() );
		}
	}
	
	
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection; 
	}

	
	/**
	 * Get the Filename from current selection
	 * @return
	 */
	private String getFilenameFromCurrentSelection(){
		if (selection instanceof StructuredSelection && ((StructuredSelection) selection).getFirstElement() instanceof org.eclipse.core.resources.IResource) {
			IResource file = (org.eclipse.core.resources.IResource) ((StructuredSelection) selection).getFirstElement();
			return file.getName();
		}else{
			return selection.toString();
		}
	}
	
	
	/**
	 * load reqIF file from current selection
	 * @return
	 */
	private ReqIF loadReqif(){
		if (selection instanceof StructuredSelection) {
			StructuredSelection structuredSelection = (StructuredSelection) selection;

			if (structuredSelection.getFirstElement() instanceof IResource){
				IResource file = (IResource) structuredSelection.getFirstElement();
				resource = file; 
				
				ResourceSet resourceSet = new ResourceSetImpl();
				Resource resource = resourceSet.getResource(URI.createFileURI(file.getLocation().toString()), true);
				ReqIF reqif = (ReqIF) resource.getContents().get(0);
				return reqif;
			}
		}
		return null;
	}
	
	
	private void validateReqIF(ReqIF reqif) throws CoreException {
	
			ReqIFValidator reqIFValidator = new ReqIFValidator();
						
			List<Issue> validate = reqIFValidator.validate(reqif);
			
			resource.deleteMarkers(markerType, true, IResource.DEPTH_ZERO);
			
			for (Issue issue : validate) {
				System.out.println(issue);
				createMarker(issue);
			}
	}
			
	protected void createMarker(Issue issue) throws CoreException{
		if (resource != null && resource.exists()){
			
			IMarker marker = resource.createMarker(markerType);
			
			switch (issue.getSeverity()){
				case ERROR:
					marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
					break;
				case WARNING:
					marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
					break;
				default:
					marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);	
			}
			
			marker.setAttribute(IMarker.MESSAGE, issue.getMessage() );
			
			marker.setAttribute(IMarker.LINE_NUMBER, issue.getLine() );
			
			marker.setAttribute(IMarker.LOCATION, issue.getLocation() );
		}
	}
	
}



