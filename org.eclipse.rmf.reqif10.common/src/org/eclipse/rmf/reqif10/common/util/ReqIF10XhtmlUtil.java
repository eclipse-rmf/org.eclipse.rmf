/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 *     Lukas Ladenberger - ProR GUI     
 ******************************************************************************/
package org.eclipse.rmf.reqif10.common.util;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.rmf.reqif10.XhtmlContent;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDivType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPType;
import org.w3c.dom.Document;

/**
 * Static helper class with methods for ReqIF Xhtml content.
 * 
 * @author Lukas Ladenberger
 */
public class ReqIF10XhtmlUtil {

	/**
	 * This class is not designed to be instantiated.
	 */
	private ReqIF10XhtmlUtil() {
		throw new InstantiationError("This class is not designed to be instantiated."); //$NON-NLS-1$
	}

	/**
	 * This static method returns the root element of the {@link XhtmlContent} or null, if no root element exists.
	 * 
	 * @param xhtmlContent
	 *            , the ReqIF container that holds the xhtml content (See also: {@link XhtmlContent})
	 * @return the root element of the given {@link XhtmlContent} ({@link XhtmlPType} or {@link XhtmlDivType}) or null
	 *         if no root element exists
	 */
	public static EObject getXhtmlRootObject(XhtmlContent xhtmlContent) {
		EObject root = null;
		if (xhtmlContent != null) {
			if (xhtmlContent.getDiv() != null) {
				root = xhtmlContent.getDiv();
			} else if (xhtmlContent.getP() != null) {
				root = xhtmlContent.getP();
			}
		}
		return root;
	}

	/**
	 * This static method generates a {@link Document} for a given {@link XhtmlContent} object.
	 * 
	 * @param xhtmlContent
	 *            , the ReqIF container that holds the xhtml content (See also: {@link XhtmlContent})
	 * @return a {@link Document} object or null if no root element exists in the xhtml content object
	 */
	public static Document getXhtmlDom(XhtmlContent xhtmlContent) {
		EObject xhtmlRootObject = getXhtmlRootObject(xhtmlContent);
		if (xhtmlRootObject == null) {
			return null;
		}
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_ROOT_OBJECTS, Collections.singletonList(xhtmlRootObject));
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		options.put(XMLResource.OPTION_DECLARE_XML, Boolean.FALSE);
		options.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION, Boolean.FALSE);
		options.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		XMLResourceImpl ri = new XMLResourceImpl();
		Document doc = ri.save(null, options, null);
		return doc;
	}

	/**
	 * This static method generates the string representation of the given {@link XhtmlContent} and returns it.
	 * 
	 * @param xhtmlContent
	 *            , the ReqIF container that holds the xhtml content (See also: {@link XhtmlContent})
	 * @return the string representation of the given {@link XhtmlContent} or null if no root element exists.
	 * @throws IOException
	 */
	public static String getXhtmlString(XhtmlContent xhtmlContent) throws IOException {
		EObject xhtmlRootObject = getXhtmlRootObject(xhtmlContent);
		if (xhtmlRootObject == null) {
			return null;
		}
		StringWriter str = new StringWriter();
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMLResource.OPTION_ROOT_OBJECTS, Collections.singletonList(xhtmlRootObject));
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		options.put(XMLResource.OPTION_DECLARE_XML, Boolean.FALSE);
		options.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION, Boolean.FALSE);
		options.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		XMLResourceImpl ri = new XMLResourceImpl();
		ri.save(str, options);
		return str.toString();
	}

}
