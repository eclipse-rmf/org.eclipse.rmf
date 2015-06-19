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

import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.rmf.reqif10.serialization.ReqIF10LoadImpl;
import org.xml.sax.helpers.DefaultHandler;

public class ExtendedReqIFLoadImpl extends ReqIF10LoadImpl {

	public ExtendedReqIFLoadImpl(XMLHelper helper) {
		super(helper);
	}

	/*
	 * @see org.eclipse.sphinx.emf.resource.ExtendedXMLLoadImpl#makeDefaultHandler()
	 */
	@Override
	protected DefaultHandler makeDefaultHandler() {
		return new ExtendedReqIFHandler(resource, helper, options);
	}
}
