/*******************************************************************************
 * Copyright (c) 2014 Formal Mind GmbH.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ingo Weigelt - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.search.filter;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

public class EnumFilter implements IFilter{

	public static final ImmutableSet<Operator> SUPPORTED_OPERATORS = Sets
			.immutableEnumSet(Operator.EQUALS, Operator.NOT_EQUALS,
					Operator.CONTAINS_ALL, Operator.CONTAINS_ANY);
	
	
	private AttributeDefinitionEnumeration attributeDefinition;
	
	private Operator operator;
	private HashSet<EnumValue> filterValues;


	private HashSet<EnumValue> defaultValues;
	

	public EnumFilter(Operator operator, Collection<EnumValue> value, AttributeDefinitionEnumeration attributeDefinition) {
		// ensure that operator is supported
		if (!SUPPORTED_OPERATORS.contains(operator)){
				throw new IllegalArgumentException(
						"This filter does not support the " + operator.toString()
								+ " operation");
		};
		
		// ensure that value1 is not null
		if (null == value){
			throw new IllegalArgumentException(
					"value1 can not be null");
		}
		
		this.attributeDefinition = attributeDefinition;
		this.operator = operator;
		this.filterValues =  new HashSet<EnumValue>(value);
		this.defaultValues = new HashSet<EnumValue>(attributeDefinition.getDefaultValue().getValues());
	}



	@Override
	public boolean match(SpecElementWithAttributes element) {	
		AttributeValueEnumeration attributeValue = (AttributeValueEnumeration) ReqIF10Util.getAttributeValue(element, attributeDefinition);
		
		boolean useDefaultValue;
		if (attributeValue == null || !attributeValue.isSetValues()){
			attributeValue = attributeDefinition.getDefaultValue();
			useDefaultValue = true;
		}else{
			useDefaultValue = false;
		}
		
		if (attributeValue == null || !attributeValue.isSetValues()){
			switch (operator) {
			case NOT_EQUALS:
				return filterValues.isEmpty() ? false : true;
			case EQUALS:
			case CONTAINS_ALL:
			case CONTAINS_ANY:
				return filterValues.isEmpty() ? true : false;
			default:
				throw new IllegalArgumentException(
						"This filter does not support the " + this.operator
								+ " operation");
			}
		}
		
		HashSet<EnumValue> elementValues;
		if (useDefaultValue){
			elementValues = defaultValues;
		}else{
			elementValues = new HashSet<EnumValue>(attributeValue.getValues());
		}
		
		switch (operator) {
		case EQUALS:
			return elementValues.equals(filterValues);
		case NOT_EQUALS:
			return !elementValues.equals(filterValues);
		case CONTAINS_ALL:
			return elementValues.containsAll(filterValues);
		case CONTAINS_ANY:
			for (EnumValue enumValue : filterValues) {
				if (elementValues.contains(enumValue)){
					return true;
				}
			}
			return false;
		default:
			throw new IllegalArgumentException(
					"This filter does not support the " + this.operator
							+ " operation");
		}
		
	}



	@Override
	public AttributeDefinitionEnumeration getAttribute() {
		return attributeDefinition;
	}

	@Override
	public Operator getOperator() {
		return operator;
	}

	@Override
	public Collection<EnumValue> getFilterValue1() {
		return filterValues;
	}

	@Override
	public Object getFilterValue2() {
		return null;
	}



	@Override
	public ImmutableSet<Operator> getSupportedOperators() {
		return SUPPORTED_OPERATORS;
	}
	

}
