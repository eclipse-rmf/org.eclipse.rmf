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

import org.eclipse.rmf.reqif10.AttributeDefinitionBoolean;
import org.eclipse.rmf.reqif10.AttributeValueBoolean;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

/**
 * Filter for String-based values.
 */
public class BoolFilter implements IFilter {

	public static final ImmutableSet<Operator> SUPPORTED_OPERATORS = Sets
			.immutableEnumSet(Operator.IS);

	private Operator operator;
	private Boolean filterValue;
	private AttributeDefinitionBoolean attributeDefinition;

	public BoolFilter(Operator operator, Boolean filterValue,
			AttributeDefinitionBoolean attributeDefinition) {

		if (!SUPPORTED_OPERATORS.contains(operator)) {
			throw new IllegalArgumentException(
					"This filter does not support the " + operator.toString()
							+ " operation");
		}
		if (null == attributeDefinition) {
			throw new IllegalArgumentException(
					"AttributeDefinition can not be null");
		}

		this.operator = operator;
		this.filterValue = filterValue;
		this.attributeDefinition = attributeDefinition;

	}

	@Override
	public boolean match(SpecElementWithAttributes element) {

		Boolean theValue;

		AttributeValueBoolean attributeValue = (AttributeValueBoolean) ReqIF10Util.getAttributeValue(element, attributeDefinition);
		
		if (null == attributeValue){
			return false;
		}
		
		theValue =  attributeValue.isTheValue();
	
		switch (operator) {
		case IS:
			return filterValue == theValue;
		default:
			throw new IllegalArgumentException(
					"This filter does not support the " + this.operator
							+ " operation");
		}
	}

}
