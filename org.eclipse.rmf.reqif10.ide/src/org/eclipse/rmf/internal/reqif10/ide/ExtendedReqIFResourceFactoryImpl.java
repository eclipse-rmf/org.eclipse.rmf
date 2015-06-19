/**
 * <copyright>
 *
 * Copyright (c) 2008-2013 itemis and others.
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
package org.eclipse.rmf.internal.reqif10.ide;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.rmf.reqif10.serialization.ReqIF10ResourceFactoryImpl;
import org.eclipse.rmf.reqif10.serialization.ReqIF10ResourceImpl;

@SuppressWarnings("restriction")
public class ExtendedReqIFResourceFactoryImpl extends ReqIF10ResourceFactoryImpl {

	@Override
	public Resource createResource(URI uri) {
		ReqIF10ResourceImpl result = new ExtendedReqIFResourceImpl(uri);
		return result;
	}
}
