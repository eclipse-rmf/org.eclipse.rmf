/*******************************************************************************
 * Copyright (c) 2011 itemis GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nirmal Sasidharan - initial API and implementation
 *     François Rey - better use of EMF reflective API
 ******************************************************************************/
package org.eclipse.rmf.reqif10.common.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionBoolean;
import org.eclipse.rmf.reqif10.AttributeDefinitionDate;
import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeDefinitionInteger;
import org.eclipse.rmf.reqif10.AttributeDefinitionReal;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeDefinitionXHTML;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueBoolean;
import org.eclipse.rmf.reqif10.AttributeValueDate;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueInteger;
import org.eclipse.rmf.reqif10.AttributeValueReal;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.SpecType;

/**
 * This class contains various static helper methods for working with ReqIf data objects. Amongst others, we solve a
 * number of issues that would be better served proper OOP (e.g. {@link #getTheValue(AttributeValue)}. However, we
 * decided not to touch the generated code. We decided to use reflection over long if-then-else blocks to
 * <p>
 * This class is not intended to be instantiated.
 * 
 * @author jastram
 */
public class ReqIF10Util {

	/**
	 * This class is not designed to be instantiated.
	 */
	private ReqIF10Util() {
		throw new InstantiationError("This class is not designed to be instantiated."); //$NON-NLS-1$
	}

	/**
	 * Returns the root ReqIF object for the corresponding EObject or null if none exists. This method simply traverses
	 * the object tree to the root - there may be more efficient ways for finding the root ReqIF.
	 * 
	 * @return the root {@link ReqIF} object or null if none found.
	 */
	public static ReqIF getReqIF(Object obj) {
		// TODO: replace and test by EcoreUtil.getRootContainer();
		if (!(obj instanceof EObject)) {
			return null;
		}
		while (((EObject) obj).eContainer() != null) {
			obj = ((EObject) obj).eContainer();
		}
		if (obj instanceof ReqIF) {
			return (ReqIF) obj;
		}
		return null;
	}

	/**
	 * Retrieves the Value from the given AttributeValue. We would prefer to have an abstract getTheValue() method on
	 * AttributeValue, but EMF doesn't support this. Thus, each subclass of AttributeValue has its own getTheValue()
	 * method. This convenience method returns the value.
	 */
	public static Object getTheValue(AttributeValue attributeValue) {
		EStructuralFeature theValueFeature = getTheValueFeature(attributeValue);
		return attributeValue.eGet(theValueFeature);
	}

	/**
	 * Reflectively sets the value.
	 * 
	 * @param attributeValue
	 */
	@SuppressWarnings("unchecked")
	public static void setTheValue(AttributeValue attributeValue, Object value) {
		if (attributeValue instanceof AttributeValueEnumeration) {
			EList<EnumValue> enumValues = ((AttributeValueEnumeration) attributeValue).getValues();
			enumValues.clear();
			enumValues.addAll((Collection<? extends EnumValue>) value);
		} else {
			EStructuralFeature theValueFeature = getTheValueFeature(attributeValue);
			attributeValue.eSet(theValueFeature, value);
		}
	}

	/**
	 * Retrieves the value for the given {@link AttributeValue} from the {@link SpecElementWithAttributes}.
	 */
	public static AttributeValue getAttributeValue(SpecElementWithAttributes specElement, AttributeDefinition attributeDefinition) {
		for (AttributeValue value : specElement.getValues()) {
			AttributeDefinition definition = getAttributeDefinition(value);
			if (attributeDefinition.equals(definition)) {
				return value;
			}
		}
		return null;
	}

	/**
	 * Finds the {@link AttributeValue} for the given {@link SpecElementWithUserDefinedAttributes}. If it does not exist
	 * yet, it is created (but not attached to the specElement). If an attributeDefinition with the label does not
	 * exist, null is returned.
	 * <p>
	 * If a default value is available, it is set as well.
	 */
	public static AttributeValue getAttributeValueForLabel(SpecElementWithAttributes element, String label) {
		if (label == null) {
			return null;
		}

		// find the AttributeDefinition for the label
		SpecType type = ReqIF10Util.getSpecType(element);
		if (type == null) {
			return null;
		}

		AttributeDefinition attrDef = null;
		for (AttributeDefinition ad : type.getSpecAttributes()) {
			if (label.equals(ad.getLongName())) {
				attrDef = ad;
				break;
			}
		}

		if (attrDef == null) {
			return null;
		}

		// return existing value or a new one
		AttributeValue av = getAttributeValue(element, attrDef);
		return av != null ? av : createAttributeValue(attrDef);
	}

	/**
	 * Returns the AttributeDefinition for a given value.
	 */
	public static AttributeDefinition getAttributeDefinition(AttributeValue attributeValue) {
		EStructuralFeature theDefinitionFeature = getDefinitionFeature(attributeValue);
		return (AttributeDefinition) attributeValue.eGet(theDefinitionFeature);
	}

	/**
	 * Returns the {@link DatatypeDefinition} for the given {@link AttributeDefinition} (Would be so much easier with
	 * inheritance).
	 */
	public static DatatypeDefinition getDatatypeDefinition(AttributeDefinition attributeDefinition) {
		// Using generated code instead of literal value "type"
		// A model change will should raise a compiler error
		String featureName = ReqIF10Package.eINSTANCE.getAttributeDefinitionString_Type().getName();
		return (DatatypeDefinition) reflectiveGet(attributeDefinition, featureName);
	}

	/**
	 * Returns the {@link DatatypeDefinition} for the given {@link AttributeValue}.
	 * 
	 * @return the corresponding {@link DatatypeDefinition} or null if it cannot be determined.
	 */
	public static DatatypeDefinition getDatatypeDefinition(AttributeValue value) {
		if (value == null) {
			return null;
		}
		AttributeDefinition ad = getAttributeDefinition(value);
		if (ad == null) {
			return null;
		}
		return getDatatypeDefinition(ad);
	}

	public static SpecType getSpecType(SpecElementWithAttributes specElement) {
		// Using generated code instead of literal value "type"
		// A model change will should raise a compiler error
		String featureName = ReqIF10Package.eINSTANCE.getSpecObject_Type().getName();
		return (SpecType) reflectiveGet(specElement, featureName);
	}

	public static SpecType getSpecType(AttributeDefinition ad) {
		return (SpecType) ad.eContainer();
	}

	/**
	 * Helper method that uses EMF reflective API to retrieve a feature given its name.
	 */
	public static EStructuralFeature getFeature(EObject object, String featureName) {
		return object.eClass().getEStructuralFeature(featureName);
	}

	/**
	 * Helper method that uses EMF reflective API to retrieve the value for a given feature name.
	 */
	public static Object reflectiveGet(EObject object, String featureName) {
		return object.eGet(getFeature(object, featureName));
	}

	/**
	 * Helper method that uses EMF reflective API to set the value for a given feature name.
	 */
	public static void reflectiveSet(EObject object, String featureName, Object value) {
		object.eSet(getFeature(object, featureName), value);
	}

	/**
	 * Returns the "the value" feature for the given attributeValue. For instance, for an {@link AttributeValueString}
	 * it returns {@link Reqif10Package.Literals#ATTRIBUTE_VALUE_STRING__THE_VALUE}. The one exception is
	 * {@link AttributeValueEnumeration}, where the feature name is "values", rather than "the value".
	 * 
	 * @throws IllegalArgumentException
	 *             for unknown {@link AttributeValue}s.
	 */
	public static EStructuralFeature getDefinitionFeature(AttributeValue attributeValue) {
		// This implementation may be tedious to write but has the advantage
		// of raising compiler errors if the model changes.
		// The much shorter and reflective version would not:
		//return getFeature(attributeValue, "definition"); //$NON-NLS-1$
		if (attributeValue instanceof AttributeValueBoolean) {
			return ReqIF10Package.Literals.ATTRIBUTE_VALUE_BOOLEAN__DEFINITION;
		} else if (attributeValue instanceof AttributeValueDate) {
			return ReqIF10Package.Literals.ATTRIBUTE_VALUE_DATE__DEFINITION;
		} else if (attributeValue instanceof AttributeValueInteger) {
			return ReqIF10Package.Literals.ATTRIBUTE_VALUE_INTEGER__DEFINITION;
		} else if (attributeValue instanceof AttributeValueReal) {
			return ReqIF10Package.Literals.ATTRIBUTE_VALUE_REAL__DEFINITION;
		} else if (attributeValue instanceof AttributeValueString) {
			return ReqIF10Package.Literals.ATTRIBUTE_VALUE_STRING__DEFINITION;
		} else if (attributeValue instanceof AttributeValueXHTML) {
			return ReqIF10Package.Literals.ATTRIBUTE_VALUE_XHTML__DEFINITION;
		} else if (attributeValue instanceof AttributeValueEnumeration) {
			return ReqIF10Package.Literals.ATTRIBUTE_VALUE_ENUMERATION__DEFINITION;
		} else {
			throw new IllegalArgumentException("Unknown AttributeValue: " + attributeValue); //$NON-NLS-1$
		}
	}

	/**
	 * Returns the "the value" feature for the given attributeValue. For instance, for an {@link AttributeValueString}
	 * it returns {@link Reqif10Package.Literals#ATTRIBUTE_VALUE_STRING__THE_VALUE}. The one exception is
	 * {@link AttributeValueEnumeration}, where the feature name is "values", rather than "the value".
	 * 
	 * @throws IllegalArgumentException
	 *             for unknown {@link AttributeValue}s.
	 */
	public static EStructuralFeature getTheValueFeature(AttributeValue attributeValue) {
		// This implementation may be tedious to write but has the advantage
		// of raising compiler errors if the model changes.
		// The much shorter and reflective version would not:
		//return getFeature(attributeValue, attributeValue instanceof AttributeValueEnumeration ? "values" : "theValue"); //$NON-NLS-1$
		if (attributeValue instanceof AttributeValueBoolean) {
			return ReqIF10Package.Literals.ATTRIBUTE_VALUE_BOOLEAN__THE_VALUE;
		} else if (attributeValue instanceof AttributeValueDate) {
			return ReqIF10Package.Literals.ATTRIBUTE_VALUE_DATE__THE_VALUE;
		} else if (attributeValue instanceof AttributeValueInteger) {
			return ReqIF10Package.Literals.ATTRIBUTE_VALUE_INTEGER__THE_VALUE;
		} else if (attributeValue instanceof AttributeValueReal) {
			return ReqIF10Package.Literals.ATTRIBUTE_VALUE_REAL__THE_VALUE;
		} else if (attributeValue instanceof AttributeValueString) {
			return ReqIF10Package.Literals.ATTRIBUTE_VALUE_STRING__THE_VALUE;
		} else if (attributeValue instanceof AttributeValueXHTML) {
			return ReqIF10Package.Literals.ATTRIBUTE_VALUE_XHTML__THE_VALUE;
		} else if (attributeValue instanceof AttributeValueEnumeration) {
			return ReqIF10Package.Literals.ATTRIBUTE_VALUE_ENUMERATION__VALUES;
		} else {
			throw new IllegalArgumentException("Unknown AttributeValue: " + attributeValue); //$NON-NLS-1$
		}
	}

	/**
	 * Returns the "defaultValue" feature for the given attributeDefinition. For instance, for an
	 * {@link AttributeDefinitionString} it returns
	 * {@link Reqif10Package.Literals#ATTRIBUTE_DEFINITION_STRING__DEFAULT_VALUE}.
	 * 
	 * @throws IllegalArgumentException
	 *             for an unknown {@link AttributeDefinition}.
	 */
	public static EStructuralFeature getDefaultValueFeature(AttributeDefinition attributeDefinition) {
		// This implementation may be tedious to write but has the advantage
		// of raising compiler errors if the model changes.
		// The much shorter and reflective version would not:
		//return getFeature(attributeDefinition, "defaultValue"); //$NON-NLS-1$
		if (attributeDefinition instanceof AttributeDefinitionBoolean) {
			return ReqIF10Package.Literals.ATTRIBUTE_DEFINITION_BOOLEAN__DEFAULT_VALUE;
		} else if (attributeDefinition instanceof AttributeDefinitionDate) {
			return ReqIF10Package.Literals.ATTRIBUTE_DEFINITION_DATE__DEFAULT_VALUE;
		} else if (attributeDefinition instanceof AttributeDefinitionInteger) {
			return ReqIF10Package.Literals.ATTRIBUTE_DEFINITION_INTEGER__DEFAULT_VALUE;
		} else if (attributeDefinition instanceof AttributeDefinitionReal) {
			return ReqIF10Package.Literals.ATTRIBUTE_DEFINITION_REAL__DEFAULT_VALUE;
		} else if (attributeDefinition instanceof AttributeDefinitionString) {
			return ReqIF10Package.Literals.ATTRIBUTE_DEFINITION_STRING__DEFAULT_VALUE;
		} else if (attributeDefinition instanceof AttributeDefinitionXHTML) {
			return ReqIF10Package.Literals.ATTRIBUTE_DEFINITION_XHTML__DEFAULT_VALUE;
		} else if (attributeDefinition instanceof AttributeDefinitionEnumeration) {
			return ReqIF10Package.Literals.ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULT_VALUE;
		} else {
			throw new IllegalArgumentException("Unknown AttributeDefinition: " + attributeDefinition); //$NON-NLS-1$
		}
	}

	/**
	 * Returns an empty value of the correct type for the given {@link AttributeDefinition}. Note that we do not use the
	 * command stack here.
	 */
	public static AttributeValue createAttributeValue(AttributeDefinition attributeDefinition) {
		if (attributeDefinition == null) {
			return null;
		} else {
			// Get the default value class, and instantiate it
			EStructuralFeature defaultValueFeature = getDefaultValueFeature(attributeDefinition);
			EClass attributeValueClass = (EClass) defaultValueFeature.getEType();
			AttributeValue value = (AttributeValue) EcoreUtil.create(attributeValueClass);
			// Set the link back to the definition object
			value.eSet(getDefinitionFeature(value), attributeDefinition);
			// Set the value to the default value if any
			AttributeValue defaultValue = (AttributeValue) attributeDefinition.eGet(defaultValueFeature);
			if (defaultValue != null) {
				setTheValue(value, getTheValue(defaultValue));
			}
			return value;
		}
	}

	/**
	 * Ensures that the {@link Identifiable}'s ID is unique, with respect to the given {@link ResourceImpl}. This method
	 * is not using a command, assuming that the {@link Identifiable} is not yet attached to the model.
	 * <p>
	 * All (real) children are processed as well.
	 */
	public static void ensureIdIsUnique(Resource resource, Identifiable identifiable) {
		// FIXME unfinished code
		// if (resource == null) {
		// return;
		// }
		// if (identifiable.getIdentifier() == null || resource.getEObject(identifiable.getIdentifier()) != null) {
		//			identifiable.setIdentifier("rmf-" + UUID.randomUUID()); //$NON-NLS-1$
		// }
		//
		// // Also process the children
		// for (EObject obj : identifiable.eContents()) {
		// if (obj instanceof Identifiable) {
		// ensureIdIsUnique(resource, (Identifiable) obj);
		// }
		// }
	}

	public static Collection<?> ensureIdIsUnique(Resource resource, Collection<?> collection) {
		return collection;
		// FIXME unfinished code
		// if (resource == null) {
		//			System.err.println("Cannot ensure unique IDs without resource."); //$NON-NLS-1$
		// return collection;
		// }
		// Collection<?> newCollection = EcoreUtil.copyAll(collection);
		// for (Object object : newCollection) {
		// if (object instanceof Identifiable) {
		// Identifiable identifiable = (Identifiable) object;
		// if (identifiable.getIdentifier() == null || resource.getEObject(identifiable.getIdentifier()) != null) {
		//					identifiable.setIdentifier("rmf-" + UUID.randomUUID()); //$NON-NLS-1$
		// }
		// EObject eobject = (EObject) object;
		// Collection<?> newContents = ensureIdIsUnique(resource, eobject.eContents());
		// eobject.eContents().clear();
		// eobject.eContents().addAll((Collection<? extends EObject>) newContents);
		// }
		// }
		// return newCollection;
	}

	/**
	 * This method returns the current date as an {@link XMLGregorianCalendar} object already formatted into a
	 * Specification conform format.
	 * 
	 * @return the current date/time formatted for ReqIF
	 */
	public static GregorianCalendar getReqIFLastChange() {

		return new GregorianCalendar();

	}

	/**
	 * Helper that converts String to {@link XMLGregorianCalendar}. We use this for Validation and for setting.
	 */
	public static GregorianCalendar stingToCalendar(String value) throws ParseException, DatatypeConfigurationException {
		Date date = DateFormat.getDateInstance().parse(value.toString());
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		return cal;
	}

}