/*******************************************************************************
 * Copyright (c) 2014 Formal Mind GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.filter;

import java.io.IOException;

import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.XhtmlContent;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.common.util.ReqIF10XhtmlUtil;

/**
 * Simple String filter used for Quicksearch. Searches all Attributes,
 * case-insensitive, for the string given in the constructor..
 */
public class SimpleStringFilter implements ReqifFilter {

	private String text;

	/**
	 * Constructs a filter for the given text.
	 * @param text must not be null.
	 */
	public SimpleStringFilter(String text) {
		this.text = text.toLowerCase();
	}

	/**
	 * Returns true if any of the attributes contains the given string.
	 */
	public boolean match(SpecElementWithAttributes specElement) {
		for (AttributeValue av : specElement.getValues()) {
			Object value = ReqIF10Util.getTheValue(av);
			if (value == null)
				continue;
			String textValue;
			if (av instanceof AttributeValueEnumeration) {
				textValue = "";
				for (EnumValue enumValue : ((AttributeValueEnumeration)av).getValues()) {
					textValue += enumValue.getLongName().toLowerCase() + " - ";
				}
			} else if (av instanceof AttributeValueXHTML) {
				try {
					XhtmlContent xhtmlContent = ((AttributeValueXHTML)av).getTheValue();
					textValue = ReqIF10XhtmlUtil
							.getXhtmlString(xhtmlContent).toLowerCase();
				} catch (IOException e) {
					e.printStackTrace();
					textValue = "";
				}
				
			} else {
				textValue = value.toString().toLowerCase();
			}
			if (textValue.contains(text)) return true;
		}
		return false;
	}
}
