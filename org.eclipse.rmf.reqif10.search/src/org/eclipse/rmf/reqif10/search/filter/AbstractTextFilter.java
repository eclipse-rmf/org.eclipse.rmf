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
 *     Michael Jastram - adding getters, so that we can reconstruct the GUI
 ******************************************************************************/
package org.eclipse.rmf.reqif10.search.filter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

/**
 * Filter for String-based values.
 */
public abstract class AbstractTextFilter extends AbstractAttributeFilter {

	public enum InternalAttribute {
		IDENTIFIER, DESC, LONG_NAME
	}

	// TODO cross-check this with supported operators.
	public static final ImmutableSet<Operator> SUPPORTED_OPERATORS = Sets
			.immutableEnumSet(Operator.EQUALS, Operator.NOT_EQUALS,
					Operator.CONTAINS, Operator.NOT_CONTAINS, Operator.REGEXP, Operator.IS_SET, Operator.IS_NOT_SET);

	protected Operator operator;
	protected String filterValue;
	protected AttributeDefinition attributeDefinition;
	protected InternalAttribute internalAttribute;
	protected boolean caseSensitive;
	protected boolean isInternal;

	
	/**
	 * Constructor used to create a filter for an {@link AttributeDefinitionString}
	 * 
	 * @param operator the filter operator to use
	 * @param value the value to match
	 * @param attributeDefinition the attributeDefinition that defines the value of a SpecObject that should be matched
	 * @param caseSensitive 
	 */
	public AbstractTextFilter(Operator operator, String value,
			AttributeDefinition attributeDefinition, boolean caseSensitive) {
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
	public AbstractTextFilter(Operator operator, String value,
			InternalAttribute internalFeature, boolean caseSensitive) {
		this(operator, value, internalFeature, null, caseSensitive);
		this.isInternal = true;
		if (null == internalFeature){
			throw new IllegalArgumentException("AttributeDefinition can not be null");
		}
	}
	
	
	protected AbstractTextFilter(Operator operator, String value, 
			InternalAttribute internalFeature, AttributeDefinition attributeDefinition, boolean caseSensitive){

		if (!getSupportedOperators().contains(operator)){
			throw new IllegalArgumentException(
					"This filter does not support the " + operator.toString()
							+ " operation");
		}
		if (null == value){
			throw new IllegalArgumentException(
					"Value can not be null");
		}
		
		if (internalFeature != null && attributeDefinition == null){
			isInternal = true;
		}else if(attributeDefinition != null && internalFeature == null){
			isInternal = false;
		}else{
			throw new IllegalArgumentException(
					"internalFeature and attribute definition can not be null or set at the same time");
		}
		
		this.operator = operator;
		this.filterValue = (null == value ? "" : value);
		this.internalAttribute = internalFeature;
		this.attributeDefinition = attributeDefinition;
		this.caseSensitive = caseSensitive;
	}

	
	@Override
	public boolean match(SpecElementWithAttributes element) {

		String theValue;

		// retrieve the value to check depending on this is a filter on an
		// internal Attribute or a value
		if (isInternal) {
			theValue = getInternalAttributeValue(element);
		} else {
			theValue = getAttributeValue(element);
		}
		
		if (theValue == null){
			/* Check if there is any default value for this attribute */
			theValue = getDefaultValue();
		}
		
		/* 1. handle empty attribute case */ 
		if (theValue == null){
			switch (operator) {
			case EQUALS:
			case CONTAINS:
				return false;
			case NOT_EQUALS:
			case NOT_CONTAINS:
				return true;
			case REGEXP:
				// apply regexp to the empty string
				return matchRegexp("");
			default:
				break;
			}
		}

		/* 2. handle non-empty attribute case */
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
//			return (caseSensitive ? theValue.matches(filterValue) 
//					              : theValue.toLowerCase().matches(filterValue.toLowerCase()));
			return matchRegexp(theValue);
		default:
			return super.match(element);
		}
	}


	protected abstract String getDefaultValue();

	/**
	 * returns the value of the Internal Attribute that is defined by this.internalAttribute
	 * 
	 * @return
	 */
	protected abstract String getInternalAttributeValue(SpecElementWithAttributes element);

	/**
	 * returns the value of the element that is defined by this.attributeDefinition
	 * 
	 * @param element
	 * @return
	 */
	protected abstract String getAttributeValue(SpecElementWithAttributes element);
	
	
	/**
	 * Has to return the instance of this.SUPPORTED_OPERATORS
	 * @return
	 */
	public abstract ImmutableSet<Operator> getSupportedOperators();
	
	
	
	/**
	 * matches this.filterValue to the String value
	 * takes this.caseSensitive into account
	 * 
	 * @return
	 */
	protected boolean matchRegexp(String value){
		Pattern p;
		if (caseSensitive){
			p = Pattern.compile(filterValue, Pattern.DOTALL);
		}else{
			p = Pattern.compile(filterValue, Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
		}
		Matcher matcher = p.matcher(value);
		return matcher.find();
	}
	
	public boolean isCaseSensitive() {
		return caseSensitive;
	}
	
	@Override
	public String getFilterValue1() {
		return filterValue;
	}
	
	@Override
	public String getFilterValue2() {
		return null;
	}

	@Override
	public Operator getOperator() {
		return operator;
	}
	
	@Override
	public Object getAttribute() {
		return isInternal ? internalAttribute : attributeDefinition;
	}

}
