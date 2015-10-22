package org.eclipse.rmf.reqif10.constraints.ui.popup.actions;

import java.util.List;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.constraints.validator.Issue;
import org.eclipse.rmf.reqif10.constraints.validator.ReqIFValidator;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

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
		final ReqIF reqif = loadReqif();
		final String filename = getFilenameFromCurrentSelection();

		Job job = new Job("Validating ReqIF") {

			protected IStatus run(IProgressMonitor monitor) {
				try {
					validateReqIF(reqif);
					
					Display.getDefault().syncExec(new Runnable() {
						@Override
						public void run() {
							try {
								PlatformUI
										.getWorkbench()
										.getActiveWorkbenchWindow()
										.getActivePage()
										.showView(
												"org.eclipse.ui.views.ProblemView");

							} catch (PartInitException e) {
								e.printStackTrace();
							}
						}
					});

					monitor.done();
					return Status.OK_STATUS;

				} catch (final CoreException e) {

					Display.getDefault().syncExec(new Runnable() {
						@Override
						public void run() {
							MessageDialog.openError(shell, "ReqIF Validation",
									"An error occured while validating "
											+ filename + ": " + e.getMessage());
						}
					});

					return Status.CANCEL_STATUS;
				}
			}
		};
		job.setUser(true);
		job.schedule();

		job.addJobChangeListener(new JobChangeAdapter() {

			@Override
			public void done(IJobChangeEvent event) {
				Display.getDefault().syncExec(new Runnable() {
					@Override
					public void run() {
						MessageDialog
								.openInformation(
										shell,
										"ReqIF Validation",
										filename
												+ " has been validated. Please check the Problems View for created Error Markers.");
					}
				});

			}
		});

	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	/**
	 * Get the Filename from current selection
	 * 
	 * @return
	 */
	private String getFilenameFromCurrentSelection() {
		if (selection instanceof StructuredSelection
				&& ((StructuredSelection) selection).getFirstElement() instanceof org.eclipse.core.resources.IResource) {
			IResource file = (org.eclipse.core.resources.IResource) ((StructuredSelection) selection)
					.getFirstElement();
			return file.getName();
		} else {
			return selection.toString();
		}
	}

	/**
	 * load reqIF file from current selection
	 * 
	 * @return
	 */
	private ReqIF loadReqif() {
		if (selection instanceof StructuredSelection) {
			StructuredSelection structuredSelection = (StructuredSelection) selection;

			if (structuredSelection.getFirstElement() instanceof IResource) {
				IResource file = (IResource) structuredSelection
						.getFirstElement();
				resource = file;

				// TODO: resolving proxies to other files doesnt work like this.
				// We have to load all the possible targets to the same
				// resourceSet
				ResourceSet resourceSet = new ResourceSetImpl();
				// ResourceSet resourceSet = new
				// XMLPersistenceMappingResourceSetImpl();
				// resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("reqif",
				// new ReqIF10ResourceFactoryImpl());

				Resource resource = resourceSet.getResource(
						URI.createFileURI(file.getLocation().toString()), true);
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

	protected void createMarker(Issue issue) throws CoreException {
		if (resource != null && resource.exists()) {

			IMarker marker = resource.createMarker(markerType);

			switch (issue.getSeverity()) {
			case ERROR:
				marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
				break;
			case WARNING:
				marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
				break;
			default:
				marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO);
			}

			marker.setAttribute(IMarker.MESSAGE, issue.getMessage());

			marker.setAttribute(IMarker.LINE_NUMBER, issue.getLine());

			marker.setAttribute(IMarker.LOCATION, issue.getLocation());
		}
	}

}
