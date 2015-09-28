package org.eclipse.rmf.reqif10.headlessvalidator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.service.IBatchValidator;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.rmf.reqif10.ReqIF;



/**
 * Load a ReqIF from a file and run the EMF-Validation on the reqif
 * 
 * The Validation results are dumped to stdout
 */
public class Application implements IApplication {

	/* (non-Javadoc)
	 * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.IApplicationContext)
	 */
	public Object start(IApplicationContext context) throws Exception {
		List<String> files = new LinkedList<String>();
		
		final Map args = context.getArguments();  
		final String[] appArgs = (String[]) args.get("application.args"); 
		for (final String arg : appArgs) {  
			   files.add(arg);
		}
		
		if (appArgs.length == 0){
			System.err.println("ERROR: missing reqif file");
			return IApplication.EXIT_OK;
		}
		
		if (appArgs.length > 1){
			System.err.println("ERROR: validating more than one reqif is not supported yet");
			return IApplication.EXIT_OK;
		}

		
		
		try{
			String filename = files.get(0);
					
			IBatchValidator validator = ModelValidationService.getInstance().newValidator(EvaluationMode.BATCH);
			validator.setReportSuccesses(false);
			
			ReqIF reqif = loadReqif(filename);
			
			System.out.println("Validating reqif " + filename + " ...");
			
			IStatus results = validator.validate(reqif);
			IStatus[] children = results.getChildren();
			for (IStatus iStatus : children) {
				System.out.println(iStatus);
			}
			
			return IApplication.EXIT_OK;
		}catch (FileNotFoundException e){
			System.err.println("ERROR File not found:" + e.getMessage());
			return IApplication.EXIT_OK;
		}
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.equinox.app.IApplication#stop()
	 */
	public void stop() {
	}
	
	
	/**
	 * load reqIF file from current selection
	 * @return the ReqIF object
	 * @throws FileNotFoundException 
	 */
	private ReqIF loadReqif(String filename) throws FileNotFoundException{
		if (!(new File(filename)).exists()){
			throw new FileNotFoundException(filename);
		}
		
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(URI.createFileURI(filename), true);
		ReqIF reqif = (ReqIF) resource.getContents().get(0);
		return reqif;
	}
}
