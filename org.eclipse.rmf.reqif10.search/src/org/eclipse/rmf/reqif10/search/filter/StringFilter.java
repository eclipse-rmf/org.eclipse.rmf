package org.eclipse.rmf.reqif10.search.filter;

import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

public class StringFilter implements IFilter {

	public enum InternalAttributes {
		IDENTIFIER, DESC, LONG_NAME
	}

	private Operator operator;
	private String filterValue;
	private AttributeDefinitionString attributeDefinition;
	private InternalAttributes internalAttribute;
	private boolean caseSensitive;
	private boolean isInternal;

	
	public StringFilter(Operator operator, String value,
			AttributeDefinitionString ad, boolean caseSensitive) {
		this.operator = operator;
		this.filterValue = value;
		this.attributeDefinition = ad;
		this.caseSensitive = caseSensitive;
		this.isInternal = false;
	}

	
	public StringFilter(Operator operator, String value,
			InternalAttributes internalFeature, boolean caseSensitive) {
		this.operator = operator;
		this.filterValue = value;
		this.internalAttribute = internalFeature;
		this.caseSensitive = caseSensitive;
		this.isInternal = true;
	}

	
	@Override
	public boolean accept(SpecElementWithAttributes element) {

		String theValue;

		// retreive the value to check depending on this is a filter on an
		// internal Attribute or a value
		if (isInternal) {
			theValue = getInternalAttributeValue(element);
		} else {
			AttributeValue attributeValue = ReqIF10Util.getAttributeValue(
					element, attributeDefinition);
			theValue = (null == attributeValue ? null : ((AttributeValueString) attributeValue).getTheValue());
		}
		
		if (theValue == null){
			/* According to the spec; If an attribute is null or does not exist, then it is treated as if it was empty. */
			theValue = "";
		}

		switch (operator) {
		case EQUALS:
			return (caseSensitive ? theValue.equals(filterValue)  
								  : theValue.equalsIgnoreCase(filterValue));
		case NOT_EQUALS:
			return (caseSensitive ? !theValue.equals(filterValue) 
					              :	!theValue.equalsIgnoreCase(filterValue));
		case CONTAINS:
			return (caseSensitive ? theValue.contains(filterValue) 
					              : theValue.toLowerCase().contains(filterValue.toLowerCase()));
		case NOT_CONTAINS:
			return (caseSensitive ? !theValue.contains(filterValue) 
					              : !theValue.toLowerCase().contains(filterValue.toLowerCase()));
		case REGEXP:
			return (caseSensitive ? theValue.matches(filterValue) 
					              : theValue.toLowerCase().matches(filterValue.toLowerCase()));
		default:
			throw new IllegalArgumentException(
					"This filter does not support the " + this.operator
							+ " operation");
		}
	}

	/**
	 * return the value of the Internal Attribute that is defined by
	 * internalAttribute
	 * 
	 * @return
	 */
	private String getInternalAttributeValue(SpecElementWithAttributes element) {
		switch (internalAttribute) {
		case IDENTIFIER:
			return element.getIdentifier();
		case DESC:
			return element.getDesc();
		case LONG_NAME:
			return element.getLongName();
		default:
			throw new UnsupportedOperationException();
		}
	}

}
