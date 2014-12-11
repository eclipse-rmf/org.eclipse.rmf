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

import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;

/**
 * Filter for String-based values.
 */
public class StringFilter extends AbstractTextFilter {

	// TODO cross-check this with supported operators.
	public static final ImmutableSet<Operator> SUPPORTED_OPERATORS = Sets
			.immutableEnumSet(Operator.EQUALS, Operator.NOT_EQUALS,
					Operator.CONTAINS, Operator.NOT_CONTAINS, Operator.REGEXP, Operator.IS_SET, Operator.IS_NOT_SET);

	/**
	 * Constructor used to create a filter for an
	 * {@link AttributeDefinitionString}
	 * 
	 * @param operator
	 *            the filter operator to use
	 * @param value
	 *            the value to match
	 * @param attributeDefinition
	 *            the attributeDefinition that defines the value of a SpecObject
	 *            that should be matched
	 * @param caseSensitive
	 */
	public StringFilter(Operator operator, String value,
			AttributeDefinitionString attributeDefinition, boolean caseSensitive) {
		super(operator, value, null, (AttributeDefinition) attributeDefinition,
				caseSensitive);
	}

	/**
	 * Constructor used to create a filter for an {@link InternalAttribute}
	 * 
	 * @param operator
	 *            the filter operator to use
	 * @param value
	 *            the value to match
	 * @param attributeDefinition
	 *            the attributeDefinition that defines the value of a SpecObject
	 *            that should be matched
	 * @param caseSensitive
	 */
	public StringFilter(Operator operator, String value,
			InternalAttribute internalFeature, boolean caseSensitive) {
		super(operator, value, internalFeature, null, caseSensitive);
	}

	/**
	 * return the value of the Internal Attribute that is defined by
	 * internalAttribute
	 * 
	 * @return
	 */
	protected String getInternalAttributeValue(SpecElementWithAttributes element) {
		switch (internalAttribute) {
		case IDENTIFIER:
			return element.isSetIdentifier() ? element.getIdentifier() : null;
		case DESC:
			return element.isSetDesc() ? element.getDesc() : null;
		case LONG_NAME:
			return element.isSetLongName() ? element.getLongName() : null;
		default:
			throw new UnsupportedOperationException();
		}
	}

	@Override
	protected String getAttributeValue(SpecElementWithAttributes element) {
		AttributeValueString attributeValue = (AttributeValueString) ReqIF10Util
				.getAttributeValue(element, attributeDefinition);
		if (attributeValue == null) {
			return null;
		}

		return attributeValue.getTheValue();
	}

	@Override
	public ImmutableSet<Operator> getSupportedOperators() {
		return SUPPORTED_OPERATORS;
	}

	@Override
	protected String getDefaultValue() {
		if (attributeDefinition instanceof AttributeDefinitionString) {
			AttributeDefinitionString ad = (AttributeDefinitionString) attributeDefinition;
			return ad.isSetDefaultValue() ? ad.getDefaultValue().getTheValue() : null;
		}
		throw new IllegalStateException("Expected an AttributeDefinitionString as attribute but found " + attributeDefinition.getClass());
	}

}
