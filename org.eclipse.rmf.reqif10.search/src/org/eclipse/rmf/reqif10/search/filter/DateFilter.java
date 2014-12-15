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

import java.util.GregorianCalendar;

import org.eclipse.rmf.reqif10.AttributeDefinitionDate;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueDate;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

/**
 * Filter for String-based values.
 */
public class DateFilter extends AbstractAttributeFilter {

	public static enum InternalAttribute {
		LAST_CHANGE
	}

	// TODO cross-check this with supported operators.
	public static final ImmutableSet<Operator> SUPPORTED_OPERATORS = Sets
			.immutableEnumSet(Operator.IS, Operator.IS_NOT,
					Operator.BETWEEN, Operator.BEFORE, Operator.AFTER, Operator.IS_SET, Operator.IS_NOT_SET);

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
		if (null == value1 && operator != Operator.IS_SET && operator != Operator.IS_NOT_SET  ){
			throw new IllegalArgumentException(
					"Value can not be null");
		}
		
		if (operator.equals(Operator.BETWEEN) ){
			if (value2 == null){
				throw new IllegalArgumentException("Value2 can not be null when using the operator " + operator.toString());
			}
		}
		
		
		this.operator = operator;
		if (operator.equals(Operator.BETWEEN) && value1.after(value2)){
			this.filterValue1 = value2;
			this.filterValue2 = value1;
		}else{
			this.filterValue1 = value1;
			this.filterValue2 = value2;			
		}
		
		
		if (operator.equals(Operator.IS) || operator.equals(Operator.IS_NOT)){
			filterValue1.set(GregorianCalendar.HOUR, 0);
			filterValue1.set(GregorianCalendar.MINUTE, 0);
			filterValue1.set(GregorianCalendar.SECOND, 0);
			
			filterValue2 = (GregorianCalendar) filterValue1.clone();
			filterValue2.add(GregorianCalendar.HOUR, 24);
			
//			SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MMM-dd");
//			System.out.println(fmt.format(filterValue1.getTime()));
//			System.out.println(fmt.format(filterValue2.getTime()));
		}
		
		
		this.internalAttribute = internalFeature;
		this.attributeDefinition = attributeDefinition;
	}

	
	@Override
	public boolean match(SpecElementWithAttributes element) {

		GregorianCalendar theValue;

		// retrieve the value to check depending on this is a filter on an
		// internal Attribute or a value
		if (isInternal) {
			theValue = getInternalAttributeValue(element);
		} else {
			AttributeValue attributeValue = ReqIF10Util.getAttributeValue(
					element, attributeDefinition);
			if (attributeValue == null || !((AttributeValueDate) attributeValue).isSetTheValue()){
				theValue = null;
			}else{
				theValue = ((AttributeValueDate) attributeValue).getTheValue();
			}
		}
		
		if (theValue == null){
			theValue = getDefaultValue(element);
		}
		
		if (theValue == null){
			switch (operator) {
			case IS_NOT:
				return true;
			case IS:
			case BEFORE:
			case AFTER:
			case BETWEEN:
				return false;
			default:
				return super.match(element);
			}
		}
		
		
		switch (operator) {
		case IS:
			return theValue.compareTo(filterValue1) >= 0 && theValue.before(filterValue2);
		case IS_NOT:
			return !(theValue.compareTo(filterValue1) >= 0 && theValue.before(filterValue2));
		case BEFORE:
			return theValue.compareTo(filterValue1) < 0;
		case AFTER:
			return theValue.compareTo(filterValue1) > 0;
		case BETWEEN:	
			return theValue.compareTo(filterValue1) >= 0 && theValue.compareTo(filterValue2) <= 0;
		default:
			return super.match(element);
		}
	}

	private GregorianCalendar getDefaultValue(SpecElementWithAttributes element) {
		if (!AbstractAttributeFilter.isSetAttribute(element, attributeDefinition)){
			return null;
		}
		
		if (!isInternal && attributeDefinition instanceof AttributeDefinitionDate) {
			AttributeDefinitionDate ad = (AttributeDefinitionDate) attributeDefinition;
			return ad.isSetDefaultValue() ? ad.getDefaultValue().getTheValue() : null;
		}
		if (isInternal){
			// What is the default Value for LAST_CHANGE
			// I am not even sure if a non set LAST_CHANGE is valid
			return null;
		}
		
		throw new IllegalStateException("Expected an AttributeDefinitionString as attribute but found " + attributeDefinition.getClass());
	}

	@Override
	public Object getAttribute() {
		return isInternal ? internalAttribute : attributeDefinition;
	}

	public Operator getOperator() {
		return operator;
	}
	
	public GregorianCalendar getFilterValue1() {
		return filterValue1;
	}

	public GregorianCalendar getFilterValue2() {
		return filterValue2;
	}

	@Override
	public ImmutableSet<Operator> getSupportedOperators() {
		return SUPPORTED_OPERATORS;
	}

	@Override
	protected GregorianCalendar getInternalAttributeValue(SpecElementWithAttributes element) {
		if (internalAttribute.equals(InternalAttribute.LAST_CHANGE)){
			if (!element.isSetLastChange()){
				return null;
			}
			return element.getLastChange();
		}else{
			throw new IllegalArgumentException(internalAttribute + " is not supported by this feature");
		}
	}


}
