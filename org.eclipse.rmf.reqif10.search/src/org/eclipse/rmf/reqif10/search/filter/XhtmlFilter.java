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

import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionXHTML;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

/**
 * Filter for String-based values.
 */
public class XhtmlFilter extends AbstractTextFilter {

	// TODO cross-check this with supported operators.
	public static final ImmutableSet<Operator> SUPPORTED_OPERATORS = Sets
			.immutableEnumSet(Operator.CONTAINS, Operator.NOT_CONTAINS,
					Operator.REGEXP, Operator.REGEXP_PLAIN);


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
		if (AbstractTextFilter.SUPPORTED_OPERATORS.contains(operator)){
			return super.match(element);
		}else{
			//TODO
			System.out.println("NEED TO IMPLEMENT " + operator.toString());
			return false;
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
		
		return attributeValue.getTheValue().getXhtmlSource();
	}


	@Override
	protected ImmutableSet<Operator> getSupportedOperators() {
		return SUPPORTED_OPERATORS;
	}
	
	

}
