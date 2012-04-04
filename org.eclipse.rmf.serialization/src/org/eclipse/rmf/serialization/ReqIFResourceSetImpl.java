/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 */
package org.eclipse.rmf.serialization;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class ReqIFResourceSetImpl extends ResourceSetImpl {

	@Override
	public EObject getEObject(URI uri, boolean loadOnDemand) {
		// brute force search in all contained ressources
		EObject eObject = null;
		for (Resource resource : this.getResources()) {
			eObject = resource.getEObject(uri.fragment());
			if (null != eObject) {
				break;
			} 
		}
		
		return eObject;
	}
	
	

}
