package org.eclipse.rmf.reqif10.constraints.ui.popup.actions;

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
		validateReqIF(reqif);
		
		String filename = getFilenameFromCurrentSelection();
		
 		MessageDialog.openInformation(
			shell,
			"ReqIF Validation",
			filename + " has been validated. Please check the Problems View for created Error Markers." );
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
	
	
	private void validateReqIF(ReqIF reqif) {
		try {
	
			IBatchValidator validator = ModelValidationService.getInstance().newValidator(EvaluationMode.BATCH);
			validator.setReportSuccesses(false);
			IStatus results = validator.validate(reqif);
			
			// let EMF-Validation create markers
			// this does not set line numbers...
			//MarkerUtil.createMarkers(results);
			
			
			// create markers manually, so we are able to set the location
			// maybe we can do this by overriding MarkerUtil's Adjust method ?		
			IStatus[] children = results.getChildren();

			if (children.length == 0){
				// If there is only one result, children is empty and instead
				// the results itself is the Status we need
				children = new IStatus[1];
				children[0] = results;
			}
			
			resource.deleteMarkers(markerType, true, IResource.DEPTH_ZERO);
			
			for (IStatus childStatus : children) {
				IMarker marker = resource.createMarker(markerType);
				
				//marker.setAttribute(IMarker.TRANSIENT, false);
				
				switch (childStatus.getSeverity()) {
					case IStatus.ERROR:
						marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
						break;
					case IStatus.INFO:
						marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);
						break;
					default:
						marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
						break;
				}
												
				marker.setAttribute(IMarker.MESSAGE, childStatus.getMessage());
								
				if (childStatus instanceof ConstraintStatus){
					
					EObject target = ((ConstraintStatus) childStatus).getTarget();
					Resource targetResource = target.eResource();
					
					String location = ((ConstraintStatus) childStatus).getTarget().toString();
					
//					if ( target instanceof Identifiable && targetResource instanceof XMLResource){
//						Identifiable identifiable = (Identifiable) target;
//						Integer lineNumber = ReqIF10LocationStore.getInstance().getPosition((XMLResource) targetResource, identifiable.getIdentifier());
//						marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
//						
//						location = "line " + lineNumber + ": " + location;
//					}
					
					Integer lineNumber = getLineNumber(target, targetResource);
					if (lineNumber != null){
						marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
						location = "line " + lineNumber + ": " + location;
					}
					
					marker.setAttribute(IMarker.LOCATION, location);
					
				}
			}
			
			
			
			// --- Use Diagnostician	
			//Diagnostic diagnostic = Diagnostician.INSTANCE.validate(reqif);
			Diagnostic diagnostic = ReqIFDiagnostician.INSTANCE.validate(reqif);
			
			//MarkerHelper markerHelper = new MarkerHelper();
			//markerHelper.createMarkers(diagnostic);
			
			for (Diagnostic childDiagnostic : diagnostic.getChildren()){
				createMarkers(resource, childDiagnostic, diagnostic);
			}
		      
		    
			
//			try {
//				
//				ValidationResult result = new ValidationResult();
//				
//				LinkedList<Issue> issues = new LinkedList<Issue>();
//				
//				for (Diagnostic childDiagnostic : diagnostic.getChildren()){
//					Issue issue = new Issue();
//					issue.setLine(-1);
//					
//					issue.setMessage(childDiagnostic.getMessage());
//					issue.setLocation(diagnostic.getData().get(0).toString());
//					issues.add(issue);
//				}
//				
//				result.setIssues(issues);
//				
//				JAXBContext jaxbContext = JAXBContext.newInstance( ValidationResult.class );
//				Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//				jaxbMarshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true );
//				
//				jaxbMarshaller.marshal( result, System.out );
//				
//				
//			} catch (JAXBException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			
			
		
			
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	private Integer getLineNumber(EObject element, Resource targetResource){
		if (! (targetResource instanceof XMLResource)){
			return -1;
		}
		
		Identifiable identifiable = null ;
		
		if ( element instanceof Identifiable ){
			identifiable = (Identifiable) element;
		}else{
			if (element instanceof AttributeValue) {
				AttributeValue attributeValue = (AttributeValue) element;
				EObject eContainer = attributeValue.eContainer();
				if (eContainer instanceof Identifiable){
					// If this is not a specObject, something is soo wrong here 
					identifiable = (Identifiable) eContainer;
				}
			}
		}
		
		if (identifiable != null){
			return ReqIF10LocationStore.getInstance().getPosition(
					(XMLResource) targetResource, identifiable.getIdentifier());
		}
		
		return null;
	}
	
	
	
	protected void createMarkers(IResource resource, Diagnostic diagnostic, Diagnostic parentDiagnostic) throws CoreException
	  {
	    if (resource != null && resource.exists())
	    {
//	      IMarker marker = resource.createMarker(MarkerUtil.VALIDATION_MARKER_TYPE);
	      IMarker marker = resource.createMarker(markerType);
	      
	      //if (diagnostic.getCode())
	      
	      int severity = diagnostic.getSeverity();
	      if (severity < Diagnostic.WARNING)
	      {
	        marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);
	      }
	      else if (severity < Diagnostic.ERROR)
	      {
	        marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
	      }
	      else
	      {
	        marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
	      }
	          
	      String message = diagnostic.getMessage();
	      if (message != null)
	      {
	        marker.setAttribute(IMarker.MESSAGE, "[D] " + message );
	      }
	      
	      Integer lineNumber = null;
	      if (diagnostic.getData().size()>0){
	    	  Object object = diagnostic.getData().get(0);
	    	  if (object instanceof Identifiable) {
				Identifiable element = (Identifiable) object;
				lineNumber = ReqIF10LocationStore.getInstance().getPosition((XMLResource) element.eResource(), element.getIdentifier());
				marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);			
			}else if(object instanceof ReqIFHeader){
				ReqIFHeader element = (ReqIFHeader) object;
				lineNumber = ReqIF10LocationStore.getInstance().getPosition((XMLResource) element.eResource(), element.getIdentifier());
				marker.setAttribute(IMarker.LINE_NUMBER, lineNumber);
			}
	      }
	      
	      String location = "";
	      if (lineNumber != null){
	    	  location = "line: " + lineNumber + " ";
	      }
	      marker.setAttribute(IMarker.LOCATION, location + diagnostic.getData().get(0));
	      
	      
	      
	      
	      
	    }
	  }
	
	
}



