/**
 * <copyright>
 *
 * Copyright (c) 2008-2013 See4sys, itemis and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     See4sys - Initial API and implementation
 *     itemis - [402945] Add a new Hummingbird project creation wizard for Hummingbird examples
 *     itemis - [402951] Add a new Hummingbird file creation wizard for Hummingbird examples
 *
 * </copyright>
 */
package org.eclipse.rmf.reqif.ide.natures;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.rmf.internal.reqif.ide.Activator;
import org.eclipse.sphinx.platform.util.ExtendedPlatform;
import org.eclipse.sphinx.platform.util.PlatformLogUtil;

/**
 * {@link IProjectNature Project nature} for {@link IProject}s containing Hummingbird models.
 */
public class ReqIFNature implements IProjectNature {

	/**
	 * The id of this {@link IProjectNature project nature}.
	 */
	public static final String ID = Activator.getPlugin().getSymbolicName() + ".ReqIFNature"; //$NON-NLS-1$

	/**
	 * The project to which this {@link IProjectNature project nature} applies.
	 */
	private IProject project;

	/**
	 * Adds a {@link ReqIFNature ReqIF nature} to the given {@link IProject project}.
	 * 
	 * @param project
	 *            The {@link IProject project} to be handled.
	 * @param monitor
	 *            A {@link IProgressMonitor progress monitor}, or <code>null</code> if progress reporting is not
	 *            desired.
	 * @throws CoreException
	 *             If the {@link IProject project} does not exist or is not open.
	 */
	public static void addTo(IProject project, IProgressMonitor monitor) throws CoreException {
		ExtendedPlatform.addNature(project, ID, monitor);
	}

	/**
	 * Checks if the specified {@linkplain IProject project} has the
	 * {@linkplain ReqIFNature#REQIF_NATURE_ID ReqIF nature}.
	 * 
	 * @param project
	 *            The project to be investigated; must not be <code>null</code> and must be <em>accessible</em>.
	 * @return <code>true</code> if the specified project has the ReqIF nature, <code>false</code> otherwise.
	 */
	public static boolean has(IProject project) {
		Assert.isNotNull(project);
		Assert.isTrue(project.isAccessible());
		boolean hasHummingbirdNature = false;
		try {
			hasHummingbirdNature = project.hasNature(ID);
		} catch (CoreException ex) {
			PlatformLogUtil.logAsError(Activator.getDefault(), ex);
		}
		return hasHummingbirdNature;
	}

	/**
	 * Removes the {@link ReqIFNature ReqIF nature} from the given {@link IProject project}.
	 * 
	 * @param project
	 *            The {@link IProject project} to be handled.
	 * @param monitor
	 *            A {@link IProgressMonitor progress monitor}, or <code>null</code> if progress reporting is not
	 *            desired.
	 * @throws CoreException
	 *             If the {@link IProject project} does not exist or is not open.
	 */
	public static void removeFrom(IProject project, IProgressMonitor monitor) throws CoreException {
		ExtendedPlatform.removeNature(project, ID, monitor);
	}

	/*
	 * @see org.eclipse.core.resources.IProjectNature#configure()
	 */
	@Override
	public void configure() throws CoreException {
		// Do nothing
	}

	/*
	 * @see org.eclipse.core.resources.IProjectNature#deconfigure()
	 */
	@Override
	public void deconfigure() throws CoreException {
		// Do nothing
	}

	/*
	 * @see org.eclipse.core.resources.IProjectNature#getProject()
	 */
	@Override
	public IProject getProject() {
		return project;
	}

	/*
	 * @see org.eclipse.core.resources.IProjectNature#setProject(org.eclipse.core.resources.IProject)
	 */
	@Override
	public void setProject(IProject project) {
		this.project = project;
	}
}
