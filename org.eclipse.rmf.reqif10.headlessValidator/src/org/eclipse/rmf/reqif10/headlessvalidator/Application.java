package org.eclipse.rmf.reqif10.headlessvalidator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.constraints.validator.Issue;
import org.eclipse.rmf.reqif10.constraints.validator.ReqIFValidator;
import org.eclipse.rmf.reqif10.serialization.ReqIF10ResourceFactoryImpl;
import org.eclipse.sphinx.emf.serialization.XMLPersistenceMappingResourceImpl;
import org.eclipse.sphinx.emf.serialization.XMLPersistenceMappingResourceSetImpl;



/**
 * Load a ReqIF from a file and run the EMF-Validation on the reqif
 * 
 * The Validation results are dumped to stdout
 */
public class Application implements IApplication {

	
	XMLPersistenceMappingResourceSetImpl resourceSet;
	private List<ReqIF> reqifs;
	private List<String> files;
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.IApplicationContext)
	 */
	public Object start(IApplicationContext context) throws Exception {
		files = new LinkedList<String>();
		
		final Map args = context.getArguments();  
		final String[] appArgs = (String[]) args.get("application.args"); 
		for (final String arg : appArgs) {  
			   files.add(arg);
		}
		
		if (files.size() == 0){
			System.err.println("ERROR: missing reqif file");
			return IApplication.EXIT_OK;
		}
		
		try{
			run();
		}catch (FileNotFoundException e){
			System.err.println("ERROR: File not found " + e.getMessage());
			return IApplication.EXIT_OK;
		}catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}catch (RuntimeException e){
			System.err.println("ERROR: " + e.getMessage());
		}
		
		
		return IApplication.EXIT_OK;
		
	}
	
	
	public List<Issue> run() throws IOException{
		
		resourceSet = new XMLPersistenceMappingResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("reqif", new ReqIF10ResourceFactoryImpl());
		reqifs = new LinkedList<ReqIF>();
		
		loadReqifs(files);
		
		List<Issue> allIssues = new LinkedList<Issue>();
		
		ReqIFValidator reqIFValidator = new ReqIFValidator();
		for (ReqIF reqif : reqifs) {
			System.out.println(reqif.eResource().getURI());
			System.out.println(reqif);
			List<Issue> validate = reqIFValidator.validate(reqif);
			allIssues.addAll(validate);
			for (Issue issue : validate) {
				System.out.println("    " + issue.toString());
			}	
		}
		return allIssues;
	}
	

	/* (non-Javadoc)
	 * @see org.eclipse.equinox.app.IApplication#stop()
	 */
	public void stop() {
	}
	
	
	
	public void loadReqifs(List<String> filenames) throws IOException{
		for (String filename : filenames) {
			URI emfURI = URI.createFileURI(filename);
			
			if (!"reqif".equals(emfURI.fileExtension())){
				throw new IllegalArgumentException("Illegal File extension '" + emfURI.fileExtension() + "' for " + filename + "");
			}
			
			if (!new File(emfURI.toFileString()).exists() ){
				throw new FileNotFoundException(filename);
			}
			
			XMLPersistenceMappingResourceImpl resource = (XMLPersistenceMappingResourceImpl) resourceSet.createResource(emfURI);
			resource.load(null);
			EList<EObject> rootObjects = resource.getContents();
			if (!rootObjects.isEmpty()) {
				reqifs.add((ReqIF) rootObjects.get(0));
			}
			
		}
	}


	public void setFiles(LinkedList<String> files) {
		this.files = files;
	}
	
}
