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
		Object attributeValue = null;
		
		
		if (getAttribute() instanceof AttributeDefinition) {
			attributeValue = ReqIF10Util.getAttributeValue(element, (AttributeDefinition) getAttribute());
		}else{
			attributeValue = getInternalAttributeValue(element);
		}
		
		
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
}
