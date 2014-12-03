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

import java.security.acl.LastOwnerException;
import java.util.GregorianCalendar;

import org.eclipse.rmf.reqif10.AttributeDefinitionDate;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueDate;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

/**
 * Filter for String-based values.
 */
public class DateFilter implements IFilter {

	public enum InternalAttribute {
		LAST_CHANGE
	}

	// TODO cross-check this with supported operators.
	public static final ImmutableSet<Operator> SUPPORTED_OPERATORS = Sets
			.immutableEnumSet(Operator.IS, Operator.IS_NOT,
					Operator.BETWEEN, Operator.BEFORE, Operator.AFTER);

	private Operator operator;
	private GregorianCalendar filterValue1;
	private GregorianCalendar filterValue2;
	private AttributeDefinitionDate attributeDefinition;
	private InternalAttribute internalAttribute;
	private boolean isInternal;

	
	/**
	 * Constructor used to create a filter for an {@link AttributeDefinitionDate}
	 * 
	 * @param operator the filter operator to use
	 * @param value the value to match
	 * @param attributeDefinition the attributeDefinition that defines the value of a SpecObject that should be matched
	 * @param caseSensitive 
	 */
	public DateFilter(Operator operator, GregorianCalendar value1, GregorianCalendar value2,
			AttributeDefinitionDate attributeDefinition) {
		this(operator, value1, value2, null, attributeDefinition);
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
	public DateFilter(Operator operator, GregorianCalendar value1, GregorianCalendar value2,
			InternalAttribute internalFeature) {
		this(operator, value1, value2, internalFeature, null);
		this.isInternal = true;
		if (null == internalFeature){
			throw new IllegalArgumentException("AttributeDefinition can not be null");
		}
	}
	
	private DateFilter(Operator operator, GregorianCalendar value1, GregorianCalendar value2, 
			InternalAttribute internalFeature, AttributeDefinitionDate attributeDefinition){

		if (!SUPPORTED_OPERATORS.contains(operator)){
			throw new IllegalArgumentException(
					"This filter does not support the " + operator.toString()
							+ " operation");
		}
		if (null == value1){
			throw new IllegalArgumentException(
					"Value can not be null");
		}
		
		this.operator = operator;
		this.filterValue1 = value1;
		this.filterValue2 = value2;
		this.internalAttribute = internalFeature;
		this.attributeDefinition = attributeDefinition;
	}

	
	@Override
	public boolean match(SpecElementWithAttributes element) {

		GregorianCalendar theValue;

		// retrieve the value to check depending on this is a filter on an
		// internal Attribute or a value
		if (isInternal) {
			if (internalAttribute.equals(InternalAttribute.LAST_CHANGE)){
				theValue = element.getLastChange();
			}else{
				throw new IllegalArgumentException(internalAttribute + " is not supported by this feature");
			}
		} else {
			AttributeValue attributeValue = ReqIF10Util.getAttributeValue(
					element, attributeDefinition);
			// TODO
			theValue = (null == attributeValue ? null : ((AttributeValueDate) attributeValue).getTheValue());
		}
		
		if (theValue == null){
			if (operator.equals(Operator.IS_NOT)){
				return true;
			}else{
				return false;
			}
		}

		switch (operator) {
		case IS:
			return theValue.equals(filterValue1);
		case IS_NOT:
			return !theValue.equals(filterValue1);
		case BEFORE:
			return theValue.compareTo(filterValue1) < 0;
		case AFTER:
			return theValue.compareTo(filterValue1) > 0;
		case BETWEEN:	
			return theValue.compareTo(filterValue1) >= 0 && theValue.compareTo(filterValue2) <= 0;
		default:
			throw new IllegalArgumentException(
					"This filter does not support the " + this.operator
							+ " operation");
		}
	}

	


}
