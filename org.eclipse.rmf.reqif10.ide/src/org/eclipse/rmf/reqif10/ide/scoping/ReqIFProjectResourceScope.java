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

import java.util.regex.Pattern;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.sphinx.emf.scoping.ProjectResourceScope;

public class ReqIFProjectResourceScope extends ProjectResourceScope {


	public ReqIFProjectResourceScope(IResource resource) {
		super(resource);
	}

	/*
	 * @see org.eclipse.sphinx.emf.scoping.AbstractResourceScope#isShared(org.eclipse.emf.common.util.URI)
	 */
	@Override
	public boolean isShared(URI uri) {
		if (super.isShared(uri)) {
			return true;
		}

		

		return false;
	}
}
