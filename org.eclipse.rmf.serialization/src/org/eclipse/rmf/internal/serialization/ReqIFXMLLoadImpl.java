/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.internal.serialization;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMLLoadImpl;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ReqIFXMLLoadImpl extends XMLLoadImpl {

	public ReqIFXMLLoadImpl(XMLHelper helper) {
		super(helper);
	}
	
	@Override
	protected DefaultHandler makeDefaultHandler() {
		ReqIFXMLSAXHandler handler = new ReqIFXMLSAXHandler(resource, helper, options);

		return handler;
	}
	
	@Override
	protected SAXParser makeParser() throws ParserConfigurationException, SAXException {
		// Create an instance of org.apache.xerces.parsers.SAXParser
		/*
		 * !! Important Note !! We must override makeParser() - even if we wouldn't have any functional changes to apply
		 * - in order to make sure that SAXParserFactory.newInstance() gets invoked from this plug-in which has a
		 * dependency to the org.apache.xerces plug-in and all its classes on the classpath. Otherwise we wouldn't
		 * obtain an instance of org.apache.xerces.jaxp.SAXParserFactoryImpl as intended but fall back to the default
		 * implementation com.sun.org.apache.xerces.internal.jaxp.SAXParserFactoryImpl.
		 */
		SAXParserFactory factory = SAXParserFactory.newInstance();
		return factory.newSAXParser();
	}

}
