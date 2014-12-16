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

import java.text.SimpleDateFormat;
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
		System.out.println("Instatiated new Filter: " + toString());
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
		System.out.println("Instatiated new Filter: " + toString());
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
		
		
		if (value2 != null){
			filterValue2 = copyCalendar(value2, true);
			filterValue2.set(GregorianCalendar.HOUR_OF_DAY, 23);
			filterValue2.set(GregorianCalendar.MINUTE, 59);
			filterValue2.set(GregorianCalendar.SECOND, 59);
			filterValue2.set(GregorianCalendar.MILLISECOND, 999);
			
			// Calling getTimeInMillis() forces the GregorianCalendar to compute the time.
			// If the time is not computed a compareTo might fail
			filterValue2.getTimeInMillis();
		}
		
		
		if (value1 != null){
			if (operator == Operator.IS || operator == Operator.IS_NOT){
				filterValue1 = copyCalendar(value1, false);
				filterValue2 = copyCalendar(value1, false);
				filterValue2.add(GregorianCalendar.HOUR, 24);		
				filterValue2.getTimeInMillis();
			}else{
				filterValue1 = copyCalendar(value1, true);
			}
			// Calling getTimeInMillis() forces the GregorianCalendar to compute the time.
			// If the time is not computed a compareTo might fail
			filterValue1.getTimeInMillis();
		}
		
		
		this.operator = operator;
		if (operator.equals(Operator.BETWEEN) && filterValue1.after(filterValue2)){
			GregorianCalendar fv1 = filterValue1;
			this.filterValue1 = this.filterValue2;
			this.filterValue2 = fv1;
		}		
		
		this.internalAttribute = internalFeature;
		this.attributeDefinition = attributeDefinition;
		
	}

	
	/* 
	 * 
	 */
	private GregorianCalendar copyCalendar(GregorianCalendar source, boolean copyTimeOfDay ){
		source.getTimeInMillis();
		
		GregorianCalendar calendar = new GregorianCalendar(source.getTimeZone());
		
		calendar.set(GregorianCalendar.YEAR, source.get(GregorianCalendar.YEAR));
		calendar.set(GregorianCalendar.MONTH, source.get(GregorianCalendar.MONTH));
		calendar.set(GregorianCalendar.DAY_OF_MONTH, source.get(GregorianCalendar.DAY_OF_MONTH));
		
		if (copyTimeOfDay){
			calendar.set(GregorianCalendar.HOUR_OF_DAY, source.get(GregorianCalendar.HOUR_OF_DAY));
			calendar.set(GregorianCalendar.MINUTE, source.get(GregorianCalendar.MINUTE));
			calendar.set(GregorianCalendar.SECOND, source.get(GregorianCalendar.SECOND));
			calendar.set(GregorianCalendar.MILLISECOND, source.get(GregorianCalendar.MILLISECOND));
		}else{
			calendar.set(GregorianCalendar.HOUR_OF_DAY, 0);
			calendar.set(GregorianCalendar.MINUTE, 0);
			calendar.set(GregorianCalendar.SECOND, 0);
			calendar.set(GregorianCalendar.MILLISECOND, 0);
		}
		
		return calendar;
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
		
		
		// Calling getTimeInMillis() forces the GregorianCalendar to compute the time.
		// If the time is not computed a compareTo might fail
		theValue.getTimeInMillis();
		
		
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

	@Override
	public String getFilterValue1AsString() {
	    SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MMM-dd");
	    return fmt.format(getFilterValue1().getTime());
	}
	
	@Override
	public String getFilterValue2AsString() {
	    SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MMM-dd");
	    return fmt.format(getFilterValue2().getTime());
	}
	

}
