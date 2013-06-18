/**
 * Copyright (c) 2013 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   itemis AG - initial API and implementation
 */
package org.eclipse.rmf.serialization;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class RMFResourceSetImpl extends ResourceSetImpl {

	/**
	 * Tools that need to follow the progress may store an {@link IProgressMonitor} in {@link #getLoadOptions()}, using
	 * this constant as the key.
	 */
	public static final String PROGRESS_MONITOR = "PROGRESS_MONITOR"; //$NON-NLS-1$

	@Override
	/**
	 * ReqIF doesn't contain any information about the resource where to find an object with a given ID.
	 * Since most references are expected to be references to objects within the same file, we first search in the resource that contained the reference.
	 * If the referenced object is not found, then the search continues in all other resources that are contained in the resource set.
	 * 
	 * In order to map this behavior to the standard EMF proxy resolution mechanism the 
	 * URI of the resource that contains the reference is added to the reference by default during deserialization.
	 * 
	 * This allows using the ReqIFResourceImpl in a standard EMF resource set if no cross resource links need to be resolved.
	 */
	public EObject getEObject(URI uri, boolean loadOnDemand) {
		EObject eObject = null;
		// first try to find the object in the resource that contained the reference using the standard EMF proxy
		// resolution strategy

		eObject = super.getEObject(uri, loadOnDemand);

		// if the eObject was not found: continue searching in all other resources
		if (null == eObject) {
			Resource sourceResource = getResource(uri.trimFragment(), loadOnDemand);
			for (Resource resource : getResources()) {
				if (resource != sourceResource) {
					eObject = resource.getEObject(uri.fragment());
					if (null != eObject) {
						break;
					}
				}
			}
		}

		return eObject;
	}

}
