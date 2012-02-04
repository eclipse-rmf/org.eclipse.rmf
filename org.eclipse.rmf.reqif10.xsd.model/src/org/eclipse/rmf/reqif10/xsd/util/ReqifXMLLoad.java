/*******************************************************************************
 * Copyright (c) 2011 itemis GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nirmal Sasidharan - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.xsd.util;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMLLoadImpl;
import org.xml.sax.helpers.DefaultHandler;

public class ReqifXMLLoad extends XMLLoadImpl {

	public ReqifXMLLoad(XMLHelper helper) {
		super(helper);
	}

	@Override
	protected DefaultHandler makeDefaultHandler() {
		return new ReqifSAXXMLHandler(resource, helper, options);
	}

	/**
	 * TODO: If loading of a ReqIF fails, error propagation fails right now. We
	 * intercept here to output the errors at least to the console.
	 * <p>
	 * 
	 * Rather than throwing an Exception (default behavior), we output the
	 * problems to the console and proceed. While less than optimal, this allows
	 * us to at least inspect the content.
	 */
	@Override
	protected void handleErrors() throws IOException {
		if (!resource.getErrors().isEmpty()) {
			for (Diagnostic error : resource.getErrors()) {
				System.err.println("Problem while loading ReqIF: " + error);
			}
		}
	}

}
