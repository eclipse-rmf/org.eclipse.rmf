package org.eclipse.rmf.tests.reqif10.serialization.uc003.tc18xx;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueBoolean;
import org.eclipse.rmf.reqif10.AttributeValueDate;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueInteger;
import org.eclipse.rmf.reqif10.AttributeValueReal;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.RelationGroup;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.Specification;

public class ReqIFUtil {
	public static ReqIF getReqIF(EObject eObject) {
		EObject root = EcoreUtil.getRootContainer(eObject);
		if (null != root && root instanceof ReqIF) {
			return (ReqIF) root;
		} else {
			return null;
		}
	}

	public static SpecType getSpecType(SpecElementWithAttributes specElementWithAttributes) {
		SpecType specType = null;
		if (null != specElementWithAttributes) {

			switch (specElementWithAttributes.eClass().getClassifierID()) {
			case ReqIF10Package.SPEC_OBJECT:
				specType = ((SpecObject) specElementWithAttributes).getType();
				break;
			case ReqIF10Package.SPECIFICATION:
				specType = ((Specification) specElementWithAttributes).getType();
				break;
			case ReqIF10Package.RELATION_GROUP:
				specType = ((RelationGroup) specElementWithAttributes).getType();
				break;
			case ReqIF10Package.SPEC_RELATION:
				specType = ((SpecRelation) specElementWithAttributes).getType();
				break;
			default:
				specType = null;

			}
		}
		return specType;
	}

	public static AttributeDefinition getAttributeDefinition(AttributeValue attributeValue) {
		AttributeDefinition attributeDefinition = null;
		if (null != attributeValue) {

			switch (attributeValue.eClass().getClassifierID()) {
			case ReqIF10Package.ATTRIBUTE_VALUE_BOOLEAN:
				attributeDefinition = ((AttributeValueBoolean) attributeValue).getDefinition();
				break;
			case ReqIF10Package.ATTRIBUTE_VALUE_DATE:
				attributeDefinition = ((AttributeValueDate) attributeValue).getDefinition();
				break;
			case ReqIF10Package.ATTRIBUTE_VALUE_ENUMERATION:
				attributeDefinition = ((AttributeValueEnumeration) attributeValue).getDefinition();
				break;
			case ReqIF10Package.ATTRIBUTE_VALUE_INTEGER:
				attributeDefinition = ((AttributeValueInteger) attributeValue).getDefinition();
				break;
			case ReqIF10Package.ATTRIBUTE_VALUE_REAL:
				attributeDefinition = ((AttributeValueReal) attributeValue).getDefinition();
				break;
			case ReqIF10Package.ATTRIBUTE_VALUE_STRING:
				attributeDefinition = ((AttributeValueString) attributeValue).getDefinition();
				break;
			case ReqIF10Package.ATTRIBUTE_VALUE_XHTML:
				attributeDefinition = ((AttributeValueXHTML) attributeValue).getDefinition();
				break;
			default:
				attributeDefinition = null;

			}
		}
		return attributeDefinition;
	}

	public static AttributeValue getAttributeValueForLabel(SpecElementWithAttributes specElementWithAttributes, String longName) {
		AttributeValue attributeValue = null;

		if (null != specElementWithAttributes && null != longName) {
			SpecType specType = getSpecType(specElementWithAttributes);
			if (null != specType) {
				AttributeDefinition attributeDefinition = null;
				int size = specType.getSpecAttributes().size();
				AttributeDefinition possibleAttributeDefinition;
				for (int i = 0; i < size; i++) {
					possibleAttributeDefinition = specType.getSpecAttributes().get(i);
					if (longName.equals(possibleAttributeDefinition.getLongName())) {
						attributeDefinition = possibleAttributeDefinition;
						break; // leave the loop
					}
				}

				if (null != attributeDefinition) {
					size = specElementWithAttributes.getValues().size();
					AttributeValue possibleAttributeValue;
					for (int i = 0; i < size; i++) {
						possibleAttributeValue = specElementWithAttributes.getValues().get(i);
						if (attributeDefinition == getAttributeDefinition(possibleAttributeValue)) {
							attributeValue = possibleAttributeValue;
							break;
						}
					}
				}
			}
		} else {
			// NOP, return null
		}

		return attributeValue;
	}

	public static Object getTheValue(AttributeValue attributeValue) {
		switch (attributeValue.eClass().getClassifierID()) {
		case ReqIF10Package.ATTRIBUTE_VALUE_BOOLEAN:
			return ((AttributeValueBoolean) attributeValue).isTheValue();
		case ReqIF10Package.ATTRIBUTE_VALUE_DATE:
			return ((AttributeValueDate) attributeValue).getTheValue();
		case ReqIF10Package.ATTRIBUTE_VALUE_ENUMERATION:
			return ((AttributeValueEnumeration) attributeValue).getValues();
		case ReqIF10Package.ATTRIBUTE_VALUE_INTEGER:
			return ((AttributeValueInteger) attributeValue).getTheValue();
		case ReqIF10Package.ATTRIBUTE_VALUE_REAL:
			return ((AttributeValueReal) attributeValue).getTheValue();
		case ReqIF10Package.ATTRIBUTE_VALUE_STRING:
			return ((AttributeValueString) attributeValue).getTheValue();
		case ReqIF10Package.ATTRIBUTE_VALUE_XHTML:
			return ((AttributeValueXHTML) attributeValue).getTheValue();
		default:
			return null;
		}
	}

}
