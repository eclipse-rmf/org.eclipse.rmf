/*******************************************************************************
 * Copyright (c) 2014 Formal Mind GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ingo Weigelt - initial API and implementation
 *     Michael Jastram - adding SUPPORTED_OPERATIONS
 ******************************************************************************/
package org.eclipse.rmf.reqif10.search.filter;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionXHTML;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.XhtmlContent;
import org.eclipse.rmf.reqif10.common.util.ProrXhtmlSimplifiedHelper;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.common.util.ReqIF10XhtmlUtil;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

/**
 * Filter for String-based values.
 */
public class XhtmlFilter extends AbstractTextFilter {

	private static final long serialVersionUID = 7048676012067603581L;

	// TODO cross-check this with supported operators.
	public static final ImmutableSet<Operator> SUPPORTED_OPERATORS = Sets
			.immutableEnumSet(Operator.CONTAINS, Operator.NOT_CONTAINS,
					Operator.REGEXP, Operator.REGEXP_PLAIN, Operator.IS_SET, Operator.IS_NOT_SET);


	public XhtmlFilter(Operator operator, String value,
			AttributeDefinitionXHTML attributeDefinition, boolean caseSensitive) {
		super(operator, value, attributeDefinition, caseSensitive);
	}
	
	
	private XhtmlFilter(Operator operator, String value,
			InternalAttribute internalFeature, boolean caseSensitive) {
		super(operator, value, internalFeature, (AttributeDefinition) null, caseSensitive);
		throw new InstantiationError("The XhtmlFilter does not support internalFeature."); //$NON-NLS-1$
	}
	

	@Override
	public boolean match(SpecElementWithAttributes element) {
		if (operator.equals(Operator.REGEXP_PLAIN)){
			AttributeValueXHTML attributeValue = (AttributeValueXHTML) ReqIF10Util.getAttributeValue(element, attributeDefinition);
			
			XhtmlContent theValue = null;
					
			if (attributeValue != null){
				theValue = attributeValue.getTheValue();
			}
			
			if (theValue == null){
				theValue = getDefaultXhtmlContent(element);
			}
			
			String simplifiedString;
			if (theValue == null){
				// according to the spec a regexp_plain match on on an empty
				// value is equivalent to "regexp applied to empty string"
				simplifiedString = "";
			}else{
				simplifiedString = ProrXhtmlSimplifiedHelper.xhtmlToSimplifiedString(theValue);
			}
			
			//System.out.println(simplifiedString);
			
			return matchRegexp(simplifiedString);
		}else{
			return super.match(element);
		}
	}


	@Override
	protected String getInternalAttributeValue(SpecElementWithAttributes element) {
		// There are no internal features of type Xhtml
		return null;
	}


	@Override
	protected String getAttributeValue(SpecElementWithAttributes element) {
		AttributeValueXHTML attributeValue = (AttributeValueXHTML) ReqIF10Util.getAttributeValue(element, attributeDefinition);
		if (attributeValue == null){
			return null;
		}
		XhtmlContent xhtmlContent = attributeValue.getTheValue();
		try {
			return ReqIF10XhtmlUtil.getXhtmlString(xhtmlContent);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}


	@Override
	public ImmutableSet<Operator> getSupportedOperators() {
		return SUPPORTED_OPERATORS;
	}

	
	/**
	 * returns the NON-simplified default Value
	 */
	@Override
	protected String getDefaultValue(SpecElementWithAttributes element) {
		if (!AbstractAttributeFilter.isSetAttribute(element, attributeDefinition)){
			return null;
		}
		
		try {
			XhtmlContent xhtmlContent = getDefaultXhtmlContent(element);
			return xhtmlContent == null ? null : ReqIF10XhtmlUtil.getXhtmlString(xhtmlContent);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}	 
	}
	
	
	private XhtmlContent getDefaultXhtmlContent(SpecElementWithAttributes element) {
		if (!AbstractAttributeFilter.isSetAttribute(element, attributeDefinition)){
			return null;
		}
		
		if (attributeDefinition instanceof AttributeDefinitionXHTML) {
			AttributeDefinitionXHTML ad = (AttributeDefinitionXHTML) attributeDefinition;
			return (ad.isSetDefaultValue() ? ad.getDefaultValue().getTheValue() : null);
		}
		throw new IllegalStateException("Expected an AttributeDefinitionString as attribute but found " + attributeDefinition.getClass());
	}
	
	private void writeObject(ObjectOutputStream s) throws IOException {
		s.defaultWriteObject();
		s.writeUTF(attributeDefinition.getIdentifier());
	}

	private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
		s.defaultReadObject();
		String adId = s.readUTF();
		attributeDefinition = ReqIF10Util.getAttributeDefinition(FilterContext.REQIF, adId);
	}


}
