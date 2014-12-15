/*******************************************************************************
 * Copyright (c) 2014 Formal Mind GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ingo Weigelt - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.search.filter;

import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

/**
 * implementation of operators that can be run on any {@link AttributeDefinition}
 * 
 * @author Ingo Weigelt
 */
public abstract class AbstractAttributeFilter implements IFilter {
	
	public static final ImmutableSet<Operator> SUPPORTED_OPERATORS = Sets
			.immutableEnumSet(Operator.IS_SET, Operator.IS_NOT_SET);
		
	public AbstractAttributeFilter(){
	}
	
	
	@Override
	public boolean match(SpecElementWithAttributes element) {
		
		if (getAttribute() instanceof AttributeDefinition){
			switch (getOperator()) {
			case IS_SET:
				return isSetAttribute(element, (AttributeDefinition) getAttribute());
			case IS_NOT_SET:
				return !isSetAttribute(element, (AttributeDefinition) getAttribute());
			default:
				throw new IllegalArgumentException(
						"This filter does not support the " + getOperator()
								+ " operation");
			}	
		}else{
			Object attributeValue = getInternalAttributeValue(element);
			switch (getOperator()) {
			case IS_SET:
				return attributeValue != null;
			case IS_NOT_SET:
				return attributeValue == null;
			default:
				throw new IllegalArgumentException(
						"This filter does not support the " + getOperator()
								+ " operation");
			}
		}
	}
	
	
	
	public static boolean isSetAttribute(SpecElementWithAttributes element, AttributeDefinition attributeDefinition){
		return ReqIF10Util.getSpecType(element).getSpecAttributes().contains(attributeDefinition);
	}
	
	

	/**
	 * Filters that can be applied to internalAttributes have to implement this
	 * class and return a non-null value if the internalAttribute should be
	 * considered as SET.
	 * Otherwise they have to return null
	 * 
	 * @param element
	 * @param attribute
	 * @return the value of the internal attribute or null if the attribute is
	 *         not set
	 */
	protected Object getInternalAttributeValue(
			SpecElementWithAttributes element){
		return null;
	}
	
	
	@Override
	public ImmutableSet<Operator> getSupportedOperators() {
		return SUPPORTED_OPERATORS;
	}
	
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		
		String attribute = null;
		if (getAttribute() instanceof AttributeDefinition) {
			AttributeDefinition ad = (AttributeDefinition) getAttribute();
			attribute = ad.getLongName();
			if (attribute == null){
				attribute = ad.getDesc();
			}
			if (attribute == null){
				attribute = "Attribute with ID="+ad.getIdentifier();
			}
		}else{
			attribute = getAttribute().toString();
		}
		
		sb.append(attribute);
		sb.append(" ");
		
		sb.append(getOperator().toLocaleString());
		
		if (getOperator() == Operator.IS_SET || getOperator() == Operator.IS_NOT_SET){
			// we dont want any values for these operations and return;
			return sb.toString();
		}
		
		sb.append(" ");
		sb.append(getFilterValue1AsString());
		if (getOperator().equals(Operator.BETWEEN)){
			sb.append(" and ").append(getFilterValue2AsString());
		}
		
		return sb.toString();
	}
	
	public String getFilterValue1AsString() {
		return getFilterValue1().toString();
	}
	
	public String getFilterValue2AsString() {
		return getFilterValue2().toString();
	}	
	
	
}
