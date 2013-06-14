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
package org.eclipse.rmf.internal.serialization;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLHandler;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class RMFXMLHandler extends XMLHandler {

	public RMFXMLHandler(XMLResource xmlResource, XMLHelper helper, Map<?, ?> options) {
		super(xmlResource, helper, options);
		// TODO Auto-generated constructor stub
	}

	@Override
	public InputSource resolveEntity(String publicId, String systemId) throws SAXException {
		// TODO Auto-generated method stub
		return super.resolveEntity(publicId, systemId);
	}

	@Override
	public void notationDecl(String name, String publicId, String systemId) throws SAXException {
		// TODO Auto-generated method stub
		super.notationDecl(name, publicId, systemId);
	}

	@Override
	public void unparsedEntityDecl(String name, String publicId, String systemId, String notationName) throws SAXException {
		// TODO Auto-generated method stub
		super.unparsedEntityDecl(name, publicId, systemId, notationName);
	}

	@Override
	public void setDocumentLocator(Locator locator) {
		// TODO Auto-generated method stub
		super.setDocumentLocator(locator);
	}

	@Override
	public void startDocument() {
		// TODO Auto-generated method stub
		super.startDocument();
	}

	@Override
	public void endDocument() {
		// TODO Auto-generated method stub
		super.endDocument();
	}

	@Override
	public void startPrefixMapping(String prefix, String uri) {
		// TODO Auto-generated method stub
		super.startPrefixMapping(prefix, uri);
	}

	@Override
	public void endPrefixMapping(String prefix) {
		// TODO Auto-generated method stub
		super.endPrefixMapping(prefix);
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(uri, localName, qName, attributes);
	}

	@Override
	public void endElement(String uri, String localName, String qName) {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, qName);
	}

	@Override
	public void characters(char[] ch, int start, int length) {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
	}

	@Override
	public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		super.ignorableWhitespace(ch, start, length);
	}

	@Override
	public void processingInstruction(String target, String data) {
		// TODO Auto-generated method stub
		super.processingInstruction(target, data);
	}

	@Override
	public void skippedEntity(String name) throws SAXException {
		// TODO Auto-generated method stub
		super.skippedEntity(name);
	}

	@Override
	public void warning(SAXParseException e) throws SAXException {
		// TODO Auto-generated method stub
		super.warning(e);
	}

	@Override
	public void error(SAXParseException e) throws SAXException {
		// TODO Auto-generated method stub
		super.error(e);
	}

	@Override
	public void fatalError(SAXParseException e) throws SAXException {
		// TODO Auto-generated method stub
		super.fatalError(e);
	}

	@Override
	protected String getXSIType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void handleObjectAttribs(EObject obj) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void recordUnknownFeature(String prefix, String name, boolean isElement, EObject peekObject, String value) {
		// TODO Auto-generated method stub
		super.recordUnknownFeature(prefix, name, isElement, peekObject, value);
	}

	@Override
	protected void reportUnknownFeature(String prefix, String name, boolean isElement, EObject peekObject, String value) {
		// TODO Auto-generated method stub
		super.reportUnknownFeature(prefix, name, isElement, peekObject, value);
	}

	@Override
	protected void setLocator(Object locator) {
		// TODO Auto-generated method stub
		super.setLocator(locator);
	}

}
