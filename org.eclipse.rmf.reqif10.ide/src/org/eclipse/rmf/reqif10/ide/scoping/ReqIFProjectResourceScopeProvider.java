/**
 * <copyright>
 *
 * Copyright (c) 2014 itemis and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     itemis - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.rmf.reqif10.ide.scoping;

import org.eclipse.core.resources.IResource;
import org.eclipse.sphinx.emf.scoping.ProjectResourceScope;
import org.eclipse.sphinx.emf.scoping.ProjectResourceScopeProvider;

public class ReqIFProjectResourceScopeProvider extends ProjectResourceScopeProvider {

	/*
	 * @see
	 * org.eclipse.sphinx.emf.scoping.ProjectResourceScopeProvider#createScope(org.eclipse.core.resources.IResource)
	 */
	@Override
	protected ProjectResourceScope createScope(IResource resource) {
		return new ReqIFProjectResourceScope(resource);
	}
}
