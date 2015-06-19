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

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.sphinx.emf.resource.ExtendedResource;
import org.eclipse.sphinx.emf.resource.ExtendedResourceAdapterFactory;
import org.eclipse.sphinx.emf.serialization.internal.XMLPersistenceMappingHandler;

@SuppressWarnings("restriction")
public class ExtendedReqIFHandler extends XMLPersistenceMappingHandler {

	protected ExtendedResource extendedResource;

	public ExtendedReqIFHandler(XMLResource xmiResource, XMLHelper helper, Map<?, ?> options) {
		super(xmiResource, helper, options);

		extendedResource = ExtendedResourceAdapterFactory.INSTANCE.adapt(xmlResource);
	}

	/*
	 * Overridden to augment proxy URIs to context-aware proxy URIs required to honor their {@link IResourceScope
	 * resource scope}s when they are being resolved and to support the resolution of proxified references between
	 * objects from different metamodels.
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLHandler#handleProxy(org.eclipse.emf.ecore.InternalEObject,
	 * java.lang.String)
	 */
	@Override
	protected void handleProxy(InternalEObject proxy, String uriLiteral) {
		// we should have the fragment part only
		if (uriLiteral != null) {
			int index = uriLiteral.lastIndexOf("#");
			if (index > -1) {
				uriLiteral = uriLiteral.substring(index);
			}
		}
		
		proxy.eSetProxyURI(URI.createURI(uriLiteral));
		//super.handleProxy(proxy, uriLiteral);

		if (extendedResource != null) {
			extendedResource.augmentToContextAwareProxy(proxy);
		}
	}
}
