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

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

public class EnumFilter extends AbstractAttributeFilter{

	private static final long serialVersionUID = -1981374202532459804L;

	public static final ImmutableSet<Operator> SUPPORTED_OPERATORS = Sets
			.immutableEnumSet(Operator.EQUALS, Operator.NOT_EQUALS,
					Operator.CONTAINS_ALL, Operator.CONTAINS_ANY, Operator.IS_SET, Operator.IS_NOT_SET);
	
	
	private transient AttributeDefinitionEnumeration attributeDefinition;
	
	private Operator operator;
	private transient HashSet<EnumValue> filterValues;
	private transient HashSet<EnumValue> defaultValues;
	

	public EnumFilter(Operator operator, Collection<EnumValue> value, AttributeDefinitionEnumeration attributeDefinition) {
		// ensure that operator is supported
		if (!SUPPORTED_OPERATORS.contains(operator)){
				throw new IllegalArgumentException(
						"This filter does not support the " + operator.toString()
								+ " operation");
		};
		
		// ensure that value1 is not null
		if (null == value && operator != Operator.IS_SET && operator != Operator.IS_NOT_SET  ){
			throw new IllegalArgumentException(
					"value1 can not be null");
		}
		
		this.attributeDefinition = attributeDefinition;
		this.operator = operator;
		this.filterValues = value == null ? new HashSet<EnumValue>() : new HashSet<EnumValue>(value);
		populateDefaultValue(attributeDefinition);
	}

	private void populateDefaultValue(AttributeDefinitionEnumeration attributeDefinition) {
		if (attributeDefinition.getDefaultValue() != null){
			this.defaultValues = new HashSet<EnumValue>(attributeDefinition.getDefaultValue().getValues());
		}else{
			this.defaultValues = new HashSet<EnumValue>();
		}
	}

	@Override
	public boolean match(SpecElementWithAttributes element) {	
		if (operator == Operator.IS_SET || operator == Operator.IS_NOT_SET){
			return super.match(element);
		}
		
		AttributeValueEnumeration attributeValue = (AttributeValueEnumeration) ReqIF10Util.getAttributeValue(element, attributeDefinition);
		HashSet<EnumValue> elementValues = null;
		
		if (attributeValue == null || !attributeValue.isSetValues()){
			if (AbstractAttributeFilter.isSetAttribute(element, attributeDefinition)){
				elementValues = defaultValues;
			}else{
				elementValues = null;
			}
		}else{
			elementValues = new HashSet<EnumValue>(attributeValue.getValues());
		}
		
		if (elementValues == null || elementValues.size() == 0){
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
	
		
	@Override
	public String getFilterValue1AsString() {
		return enumValuesAsString(getFilterValue1());
	}
	
	@Override
	public String getFilterValue2AsString() {
		return null;
	}
	
	private String enumValuesAsString(Collection<EnumValue> values){
		StringBuilder sb = new StringBuilder("[");
		for (Iterator<EnumValue> iterator = values.iterator(); iterator
				.hasNext();) {
			EnumValue enumValue = (EnumValue) iterator.next();
			String label = enumValue.getLongName();
			if (label == null){
				label = enumValue.getDesc();
			}
			if (label == null){
				label = "ID="+enumValue.getIdentifier();
			}
			sb.append(label);
			
			if (iterator.hasNext()){
				sb.append(", ");
			}
		}
		sb.append("]");
		
		return sb.toString();
	}

	private void writeObject(ObjectOutputStream s) throws IOException {
		s.defaultWriteObject();
		s.writeUTF(getAttribute().getIdentifier());
		// We write the enum values as String array
		String[] valueIds = new String[filterValues.size()];
		int i = 0;
		for(EnumValue value: filterValues) {
			valueIds[i++] = value.getIdentifier();
		}
		s.writeObject(valueIds);
	}

	private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
		s.defaultReadObject();
		String adId = s.readUTF();
		attributeDefinition = (AttributeDefinitionEnumeration) ReqIF10Util.getAttributeDefinition(FilterContext.REQIF, adId);
		String[] valueIds = (String[]) s.readObject();
		EList<EnumValue> allValues = attributeDefinition.getType().getSpecifiedValues();
		filterValues = new HashSet<EnumValue>();
		for (int i = 0; i < valueIds.length; i++) {
			for (EnumValue value : allValues) {
				if (value.getIdentifier().equals(valueIds[i])) {
					filterValues.add(value);
					break;
				}
			}
		}
		populateDefaultValue(attributeDefinition);
	}

	
}
