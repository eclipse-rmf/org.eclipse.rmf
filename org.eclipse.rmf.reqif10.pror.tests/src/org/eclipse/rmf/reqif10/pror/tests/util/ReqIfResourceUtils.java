/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.tests.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.ReqIF;

public class ReqIfResourceUtils {

	private static IWorkspace workspace = ResourcesPlugin.getWorkspace();

	public static ReqIF createReqIfPlatformResorce(IProject project, String fileName,
			String contents, EditingDomain editingDomain)
			throws Exception {

		IFile file = project.getFile(fileName);
		InputStream input = new ByteArrayInputStream(
				contents.getBytes("utf-8"));
		file.create(input, IResource.FORCE, null);

		URI resourceURI = URI.createPlatformResourceURI(file.getFullPath()
				.toOSString(), true);
		Resource resource = editingDomain.getResourceSet().getResource(
				resourceURI, true);
		ReqIF reqif = (ReqIF) resource.getContents().get(0);

		return reqif;

	}

	public static ReqIF createReqIfPlatformResorce(IProject project, String fileName,
			InputStream inputStream, EditingDomain editingDomain)
			throws Exception {
		return createReqIfPlatformResorce(project, fileName,
				ResourceUtils.inputStreamToString(inputStream), editingDomain);
	}
	
	public static IProject createProjectPlatformResource(String projectName)
			throws CoreException {
		IProject project = workspace.getRoot().getProject(projectName);
		project.create(null);
		project.open(null);
		return project;
	}	

}
