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

import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

/**
 * Filter for String-based values.
 */
public class StringFilter implements IFilter {

	public enum InternalAttribute {
		IDENTIFIER, DESC, LONG_NAME
	}

	// TODO cross-check this with supported operators.
	public final ImmutableSet<Operator> SUPPORTED_OPERATORS = Sets
			.immutableEnumSet(Operator.EQUALS, Operator.NOT_EQUALS,
					Operator.CONTAINS, Operator.NOT_CONTAINS, Operator.REGEXP);

	private Operator operator;
	private String filterValue;
	private AttributeDefinitionString attributeDefinition;
	private InternalAttribute internalAttribute;
	private boolean caseSensitive;
	private boolean isInternal;

	
	/**
	 * Constructor used to create a filter for an {@link AttributeDefinitionString}
	 * 
	 * @param operator the filter operator to use
	 * @param value the value to match
	 * @param attributeDefinition the attributeDefinition that defines the value of a SpecObject that should be matched
	 * @param caseSensitive 
	 */
	public StringFilter(Operator operator, String value,
			AttributeDefinitionString attributeDefinition, boolean caseSensitive) {
		this(operator, value, null, attributeDefinition, caseSensitive);
		this.isInternal = false;
		if (null == attributeDefinition){
			throw new IllegalArgumentException("AttributeDefinition can not be null");
		}
	}

	/**
	 * Constructor used to create a filter for an {@link InternalAttribute}
	 * 
	 * @param operator the filter operator to use
	 * @param value the value to match
	 * @param attributeDefinition the attributeDefinition that defines the value of a SpecObject that should be matched
	 * @param caseSensitive 
	 */
	public StringFilter(Operator operator, String value,
			InternalAttribute internalFeature, boolean caseSensitive) {
		this(operator, value, internalFeature, null, caseSensitive);
		this.isInternal = true;
		if (null == internalFeature){
			throw new IllegalArgumentException("AttributeDefinition can not be null");
		}
	}
	
	private StringFilter(Operator operator, String value, 
			InternalAttribute internalFeature, AttributeDefinitionString ad, boolean caseSensitive){

		if (!SUPPORTED_OPERATORS.contains(operator)){
			throw new IllegalArgumentException(
					"This filter does not support the " + operator.toString()
							+ " operation");
		}
		
		this.operator = operator;
		this.filterValue = (null == value ? "" : value);
		this.internalAttribute = internalFeature;
		this.attributeDefinition = ad;
		this.caseSensitive = caseSensitive;
	}

	
	@Override
	public boolean match(SpecElementWithAttributes element) {

		String theValue;

		// retreive the value to check depending on this is a filter on an
		// internal Attribute or a value
		if (isInternal) {
			theValue = getInternalAttributeValue(element);
		} else {
			AttributeValue attributeValue = ReqIF10Util.getAttributeValue(
					element, attributeDefinition);
			theValue = (null == attributeValue ? null : ((AttributeValueString) attributeValue).getTheValue());
		}
		
		if (theValue == null){
			/* According to the spec; If an attribute is null or does not exist, then it is treated as if it was empty. */
			theValue = "";
		}

		switch (operator) {
		case EQUALS:
			return (caseSensitive ? theValue.equals(filterValue)  
								  : theValue.equalsIgnoreCase(filterValue));
		case NOT_EQUALS:
			return (caseSensitive ? !theValue.equals(filterValue) 
					              :	!theValue.equalsIgnoreCase(filterValue));
		case CONTAINS:
			return (caseSensitive ? theValue.contains(filterValue) 
					              : theValue.toLowerCase().contains(filterValue.toLowerCase()));
		case NOT_CONTAINS:
			return (caseSensitive ? !theValue.contains(filterValue) 
					              : !theValue.toLowerCase().contains(filterValue.toLowerCase()));
		case REGEXP:
			return (caseSensitive ? theValue.matches(filterValue) 
					              : theValue.toLowerCase().matches(filterValue.toLowerCase()));
		default:
			throw new IllegalArgumentException(
					"This filter does not support the " + this.operator
							+ " operation");
		}
	}

	/**
	 * return the value of the Internal Attribute that is defined by
	 * internalAttribute
	 * 
	 * @return
	 */
	private String getInternalAttributeValue(SpecElementWithAttributes element) {
		switch (internalAttribute) {
		case IDENTIFIER:
			return element.getIdentifier();
		case DESC:
			return element.getDesc();
		case LONG_NAME:
			return element.getLongName();
		default:
			throw new UnsupportedOperationException();
		}
	}


}
