/**
 * <copyright>
 *
 * Copyright (c) 2008-2014 itemis and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     itemis - Initial API and implementation
 *     itemis - [442342] Sphinx doen't trim context information from proxy URIs when serializing proxyfied cross-document references
 *
 * </copyright>
 */
package org.eclipse.rmf.internal.reqif10.ide;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.rmf.reqif10.serialization.ReqIF10ResourceImpl;
import org.eclipse.sphinx.emf.resource.ExtendedXMIHelperImpl;


public class ExtendedReqIFResourceImpl extends ReqIF10ResourceImpl {

	public ExtendedReqIFResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	protected XMLLoad createXMLLoad() {
		// Use extended XMILoad implementation to enable augmentation of proxy URIs created at resource loading time to
		// context-aware proxy URIs required to honor their {@link IResourceScope resource scope}s when they are being
		// resolved and to support the resolution of proxified references between objects from different metamodels
		return new ExtendedReqIFLoadImpl(createXMLHelper());
	}

	@Override
	protected XMLHelper createXMLHelper() {
		// Use extended XMIHelper implementation to enable trimming of all potentially present proxy context information
		// from HREFs representing cross-document references to objects in other resources at resource save time.
		return new ExtendedReqIFHelperImpl(this);
	}
}
