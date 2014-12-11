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

import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

public class EnumFilter implements IFilter{

	public static final ImmutableSet<Operator> SUPPORTED_OPERATORS = Sets
			.immutableEnumSet(Operator.EQUALS, Operator.NOT_EQUALS,
					Operator.CONTAINS, Operator.CONTAINS_ANY);
	
	
	private AttributeDefinitionEnumeration attributeDefinition;
	private Operator operator;
	private Collection<EnumValue> values;

	
	
	public EnumFilter(Operator operator, Collection<EnumValue> value, AttributeDefinitionEnumeration attributeDefinition) {
		// ensure that operator is supported
		if (!SUPPORTED_OPERATORS.contains(operator)){
			if (!SUPPORTED_OPERATORS.contains(operator)){
				throw new IllegalArgumentException(
						"This filter does not support the " + operator.toString()
								+ " operation");
			}
		};
		
		// ensure that value1 is not null
		if (null == value){
			throw new IllegalArgumentException(
					"value1 can not be null");
		}
		
		this.attributeDefinition = attributeDefinition;
		this.operator = operator;
		this.values =  value;
	}



	@Override
	public boolean match(SpecElementWithAttributes element) {
		
		
		
		
		return false;
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
		return values;
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
