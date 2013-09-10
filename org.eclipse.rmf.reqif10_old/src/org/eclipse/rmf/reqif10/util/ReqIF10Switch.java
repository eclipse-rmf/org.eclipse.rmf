/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.reqif10.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.rmf.reqif10.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.reqif10.ReqIF10Package
 * @generated
 */
public class ReqIF10Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReqIF10Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqIF10Switch() {
		if (modelPackage == null) {
			modelPackage = ReqIF10Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ReqIF10Package.ACCESS_CONTROLLED_ELEMENT: {
				AccessControlledElement accessControlledElement = (AccessControlledElement)theEObject;
				T result = caseAccessControlledElement(accessControlledElement);
				if (result == null) result = caseIdentifiable(accessControlledElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.IDENTIFIABLE: {
				Identifiable identifiable = (Identifiable)theEObject;
				T result = caseIdentifiable(identifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.ATTRIBUTE_VALUE_XHTML: {
				AttributeValueXHTML attributeValueXHTML = (AttributeValueXHTML)theEObject;
				T result = caseAttributeValueXHTML(attributeValueXHTML);
				if (result == null) result = caseAttributeValue(attributeValueXHTML);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.ATTRIBUTE_VALUE: {
				AttributeValue attributeValue = (AttributeValue)theEObject;
				T result = caseAttributeValue(attributeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.SPEC_ELEMENT_WITH_ATTRIBUTES: {
				SpecElementWithAttributes specElementWithAttributes = (SpecElementWithAttributes)theEObject;
				T result = caseSpecElementWithAttributes(specElementWithAttributes);
				if (result == null) result = caseIdentifiable(specElementWithAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.ATTRIBUTE_DEFINITION_XHTML: {
				AttributeDefinitionXHTML attributeDefinitionXHTML = (AttributeDefinitionXHTML)theEObject;
				T result = caseAttributeDefinitionXHTML(attributeDefinitionXHTML);
				if (result == null) result = caseAttributeDefinition(attributeDefinitionXHTML);
				if (result == null) result = caseAccessControlledElement(attributeDefinitionXHTML);
				if (result == null) result = caseIdentifiable(attributeDefinitionXHTML);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.ATTRIBUTE_DEFINITION: {
				AttributeDefinition attributeDefinition = (AttributeDefinition)theEObject;
				T result = caseAttributeDefinition(attributeDefinition);
				if (result == null) result = caseAccessControlledElement(attributeDefinition);
				if (result == null) result = caseIdentifiable(attributeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.SPEC_TYPE: {
				SpecType specType = (SpecType)theEObject;
				T result = caseSpecType(specType);
				if (result == null) result = caseIdentifiable(specType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.REQ_IF_CONTENT: {
				ReqIFContent reqIFContent = (ReqIFContent)theEObject;
				T result = caseReqIFContent(reqIFContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.REQ_IF: {
				ReqIF reqIF = (ReqIF)theEObject;
				T result = caseReqIF(reqIF);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.REQ_IF_HEADER: {
				ReqIFHeader reqIFHeader = (ReqIFHeader)theEObject;
				T result = caseReqIFHeader(reqIFHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.REQ_IF_TOOL_EXTENSION: {
				ReqIFToolExtension reqIFToolExtension = (ReqIFToolExtension)theEObject;
				T result = caseReqIFToolExtension(reqIFToolExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.SPEC_OBJECT: {
				SpecObject specObject = (SpecObject)theEObject;
				T result = caseSpecObject(specObject);
				if (result == null) result = caseSpecElementWithAttributes(specObject);
				if (result == null) result = caseIdentifiable(specObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.SPEC_OBJECT_TYPE: {
				SpecObjectType specObjectType = (SpecObjectType)theEObject;
				T result = caseSpecObjectType(specObjectType);
				if (result == null) result = caseSpecType(specObjectType);
				if (result == null) result = caseIdentifiable(specObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.SPECIFICATION: {
				Specification specification = (Specification)theEObject;
				T result = caseSpecification(specification);
				if (result == null) result = caseSpecElementWithAttributes(specification);
				if (result == null) result = caseIdentifiable(specification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.SPECIFICATION_TYPE: {
				SpecificationType specificationType = (SpecificationType)theEObject;
				T result = caseSpecificationType(specificationType);
				if (result == null) result = caseSpecType(specificationType);
				if (result == null) result = caseIdentifiable(specificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.SPEC_HIERARCHY: {
				SpecHierarchy specHierarchy = (SpecHierarchy)theEObject;
				T result = caseSpecHierarchy(specHierarchy);
				if (result == null) result = caseAccessControlledElement(specHierarchy);
				if (result == null) result = caseIdentifiable(specHierarchy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.DATATYPE_DEFINITION: {
				DatatypeDefinition datatypeDefinition = (DatatypeDefinition)theEObject;
				T result = caseDatatypeDefinition(datatypeDefinition);
				if (result == null) result = caseIdentifiable(datatypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.SPEC_RELATION: {
				SpecRelation specRelation = (SpecRelation)theEObject;
				T result = caseSpecRelation(specRelation);
				if (result == null) result = caseSpecElementWithAttributes(specRelation);
				if (result == null) result = caseIdentifiable(specRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.SPEC_RELATION_TYPE: {
				SpecRelationType specRelationType = (SpecRelationType)theEObject;
				T result = caseSpecRelationType(specRelationType);
				if (result == null) result = caseSpecType(specRelationType);
				if (result == null) result = caseIdentifiable(specRelationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.RELATION_GROUP: {
				RelationGroup relationGroup = (RelationGroup)theEObject;
				T result = caseRelationGroup(relationGroup);
				if (result == null) result = caseIdentifiable(relationGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.RELATION_GROUP_TYPE: {
				RelationGroupType relationGroupType = (RelationGroupType)theEObject;
				T result = caseRelationGroupType(relationGroupType);
				if (result == null) result = caseSpecType(relationGroupType);
				if (result == null) result = caseIdentifiable(relationGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.DATATYPE_DEFINITION_XHTML: {
				DatatypeDefinitionXHTML datatypeDefinitionXHTML = (DatatypeDefinitionXHTML)theEObject;
				T result = caseDatatypeDefinitionXHTML(datatypeDefinitionXHTML);
				if (result == null) result = caseDatatypeDefinition(datatypeDefinitionXHTML);
				if (result == null) result = caseIdentifiable(datatypeDefinitionXHTML);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.ALTERNATIVE_ID: {
				AlternativeID alternativeID = (AlternativeID)theEObject;
				T result = caseAlternativeID(alternativeID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.ATTRIBUTE_DEFINITION_BOOLEAN: {
				AttributeDefinitionBoolean attributeDefinitionBoolean = (AttributeDefinitionBoolean)theEObject;
				T result = caseAttributeDefinitionBoolean(attributeDefinitionBoolean);
				if (result == null) result = caseAttributeDefinitionSimple(attributeDefinitionBoolean);
				if (result == null) result = caseAttributeDefinition(attributeDefinitionBoolean);
				if (result == null) result = caseAccessControlledElement(attributeDefinitionBoolean);
				if (result == null) result = caseIdentifiable(attributeDefinitionBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.ATTRIBUTE_DEFINITION_SIMPLE: {
				AttributeDefinitionSimple attributeDefinitionSimple = (AttributeDefinitionSimple)theEObject;
				T result = caseAttributeDefinitionSimple(attributeDefinitionSimple);
				if (result == null) result = caseAttributeDefinition(attributeDefinitionSimple);
				if (result == null) result = caseAccessControlledElement(attributeDefinitionSimple);
				if (result == null) result = caseIdentifiable(attributeDefinitionSimple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.DATATYPE_DEFINITION_BOOLEAN: {
				DatatypeDefinitionBoolean datatypeDefinitionBoolean = (DatatypeDefinitionBoolean)theEObject;
				T result = caseDatatypeDefinitionBoolean(datatypeDefinitionBoolean);
				if (result == null) result = caseDatatypeDefinitionSimple(datatypeDefinitionBoolean);
				if (result == null) result = caseDatatypeDefinition(datatypeDefinitionBoolean);
				if (result == null) result = caseIdentifiable(datatypeDefinitionBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.DATATYPE_DEFINITION_SIMPLE: {
				DatatypeDefinitionSimple datatypeDefinitionSimple = (DatatypeDefinitionSimple)theEObject;
				T result = caseDatatypeDefinitionSimple(datatypeDefinitionSimple);
				if (result == null) result = caseDatatypeDefinition(datatypeDefinitionSimple);
				if (result == null) result = caseIdentifiable(datatypeDefinitionSimple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.ATTRIBUTE_VALUE_BOOLEAN: {
				AttributeValueBoolean attributeValueBoolean = (AttributeValueBoolean)theEObject;
				T result = caseAttributeValueBoolean(attributeValueBoolean);
				if (result == null) result = caseAttributeValueSimple(attributeValueBoolean);
				if (result == null) result = caseAttributeValue(attributeValueBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.ATTRIBUTE_VALUE_SIMPLE: {
				AttributeValueSimple attributeValueSimple = (AttributeValueSimple)theEObject;
				T result = caseAttributeValueSimple(attributeValueSimple);
				if (result == null) result = caseAttributeValue(attributeValueSimple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.ATTRIBUTE_DEFINITION_DATE: {
				AttributeDefinitionDate attributeDefinitionDate = (AttributeDefinitionDate)theEObject;
				T result = caseAttributeDefinitionDate(attributeDefinitionDate);
				if (result == null) result = caseAttributeDefinitionSimple(attributeDefinitionDate);
				if (result == null) result = caseAttributeDefinition(attributeDefinitionDate);
				if (result == null) result = caseAccessControlledElement(attributeDefinitionDate);
				if (result == null) result = caseIdentifiable(attributeDefinitionDate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.DATATYPE_DEFINITION_DATE: {
				DatatypeDefinitionDate datatypeDefinitionDate = (DatatypeDefinitionDate)theEObject;
				T result = caseDatatypeDefinitionDate(datatypeDefinitionDate);
				if (result == null) result = caseDatatypeDefinitionSimple(datatypeDefinitionDate);
				if (result == null) result = caseDatatypeDefinition(datatypeDefinitionDate);
				if (result == null) result = caseIdentifiable(datatypeDefinitionDate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.ATTRIBUTE_VALUE_DATE: {
				AttributeValueDate attributeValueDate = (AttributeValueDate)theEObject;
				T result = caseAttributeValueDate(attributeValueDate);
				if (result == null) result = caseAttributeValueSimple(attributeValueDate);
				if (result == null) result = caseAttributeValue(attributeValueDate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.ATTRIBUTE_DEFINITION_ENUMERATION: {
				AttributeDefinitionEnumeration attributeDefinitionEnumeration = (AttributeDefinitionEnumeration)theEObject;
				T result = caseAttributeDefinitionEnumeration(attributeDefinitionEnumeration);
				if (result == null) result = caseAttributeDefinition(attributeDefinitionEnumeration);
				if (result == null) result = caseAccessControlledElement(attributeDefinitionEnumeration);
				if (result == null) result = caseIdentifiable(attributeDefinitionEnumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.DATATYPE_DEFINITION_ENUMERATION: {
				DatatypeDefinitionEnumeration datatypeDefinitionEnumeration = (DatatypeDefinitionEnumeration)theEObject;
				T result = caseDatatypeDefinitionEnumeration(datatypeDefinitionEnumeration);
				if (result == null) result = caseDatatypeDefinition(datatypeDefinitionEnumeration);
				if (result == null) result = caseIdentifiable(datatypeDefinitionEnumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.ENUM_VALUE: {
				EnumValue enumValue = (EnumValue)theEObject;
				T result = caseEnumValue(enumValue);
				if (result == null) result = caseIdentifiable(enumValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.EMBEDDED_VALUE: {
				EmbeddedValue embeddedValue = (EmbeddedValue)theEObject;
				T result = caseEmbeddedValue(embeddedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.ATTRIBUTE_VALUE_ENUMERATION: {
				AttributeValueEnumeration attributeValueEnumeration = (AttributeValueEnumeration)theEObject;
				T result = caseAttributeValueEnumeration(attributeValueEnumeration);
				if (result == null) result = caseAttributeValue(attributeValueEnumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.ATTRIBUTE_DEFINITION_INTEGER: {
				AttributeDefinitionInteger attributeDefinitionInteger = (AttributeDefinitionInteger)theEObject;
				T result = caseAttributeDefinitionInteger(attributeDefinitionInteger);
				if (result == null) result = caseAttributeDefinitionSimple(attributeDefinitionInteger);
				if (result == null) result = caseAttributeDefinition(attributeDefinitionInteger);
				if (result == null) result = caseAccessControlledElement(attributeDefinitionInteger);
				if (result == null) result = caseIdentifiable(attributeDefinitionInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.DATATYPE_DEFINITION_INTEGER: {
				DatatypeDefinitionInteger datatypeDefinitionInteger = (DatatypeDefinitionInteger)theEObject;
				T result = caseDatatypeDefinitionInteger(datatypeDefinitionInteger);
				if (result == null) result = caseDatatypeDefinitionSimple(datatypeDefinitionInteger);
				if (result == null) result = caseDatatypeDefinition(datatypeDefinitionInteger);
				if (result == null) result = caseIdentifiable(datatypeDefinitionInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.ATTRIBUTE_VALUE_INTEGER: {
				AttributeValueInteger attributeValueInteger = (AttributeValueInteger)theEObject;
				T result = caseAttributeValueInteger(attributeValueInteger);
				if (result == null) result = caseAttributeValueSimple(attributeValueInteger);
				if (result == null) result = caseAttributeValue(attributeValueInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.ATTRIBUTE_DEFINITION_REAL: {
				AttributeDefinitionReal attributeDefinitionReal = (AttributeDefinitionReal)theEObject;
				T result = caseAttributeDefinitionReal(attributeDefinitionReal);
				if (result == null) result = caseAttributeDefinitionSimple(attributeDefinitionReal);
				if (result == null) result = caseAttributeDefinition(attributeDefinitionReal);
				if (result == null) result = caseAccessControlledElement(attributeDefinitionReal);
				if (result == null) result = caseIdentifiable(attributeDefinitionReal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.DATATYPE_DEFINITION_REAL: {
				DatatypeDefinitionReal datatypeDefinitionReal = (DatatypeDefinitionReal)theEObject;
				T result = caseDatatypeDefinitionReal(datatypeDefinitionReal);
				if (result == null) result = caseDatatypeDefinitionSimple(datatypeDefinitionReal);
				if (result == null) result = caseDatatypeDefinition(datatypeDefinitionReal);
				if (result == null) result = caseIdentifiable(datatypeDefinitionReal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.ATTRIBUTE_VALUE_REAL: {
				AttributeValueReal attributeValueReal = (AttributeValueReal)theEObject;
				T result = caseAttributeValueReal(attributeValueReal);
				if (result == null) result = caseAttributeValueSimple(attributeValueReal);
				if (result == null) result = caseAttributeValue(attributeValueReal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.ATTRIBUTE_DEFINITION_STRING: {
				AttributeDefinitionString attributeDefinitionString = (AttributeDefinitionString)theEObject;
				T result = caseAttributeDefinitionString(attributeDefinitionString);
				if (result == null) result = caseAttributeDefinitionSimple(attributeDefinitionString);
				if (result == null) result = caseAttributeDefinition(attributeDefinitionString);
				if (result == null) result = caseAccessControlledElement(attributeDefinitionString);
				if (result == null) result = caseIdentifiable(attributeDefinitionString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.DATATYPE_DEFINITION_STRING: {
				DatatypeDefinitionString datatypeDefinitionString = (DatatypeDefinitionString)theEObject;
				T result = caseDatatypeDefinitionString(datatypeDefinitionString);
				if (result == null) result = caseDatatypeDefinitionSimple(datatypeDefinitionString);
				if (result == null) result = caseDatatypeDefinition(datatypeDefinitionString);
				if (result == null) result = caseIdentifiable(datatypeDefinitionString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.ATTRIBUTE_VALUE_STRING: {
				AttributeValueString attributeValueString = (AttributeValueString)theEObject;
				T result = caseAttributeValueString(attributeValueString);
				if (result == null) result = caseAttributeValueSimple(attributeValueString);
				if (result == null) result = caseAttributeValue(attributeValueString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqIF10Package.XHTML_CONTENT: {
				XhtmlContent xhtmlContent = (XhtmlContent)theEObject;
				T result = caseXhtmlContent(xhtmlContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Controlled Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Controlled Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessControlledElement(AccessControlledElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiable(Identifiable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value XHTML</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value XHTML</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValueXHTML(AttributeValueXHTML object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValue(AttributeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spec Element With Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spec Element With Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecElementWithAttributes(SpecElementWithAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Definition XHTML</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Definition XHTML</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDefinitionXHTML(AttributeDefinitionXHTML object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDefinition(AttributeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spec Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spec Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecType(SpecType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Req IF Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Req IF Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReqIFContent(ReqIFContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Req IF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Req IF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReqIF(ReqIF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Req IF Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Req IF Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReqIFHeader(ReqIFHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Req IF Tool Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Req IF Tool Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReqIFToolExtension(ReqIFToolExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spec Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spec Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecObject(SpecObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spec Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spec Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecObjectType(SpecObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecification(Specification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificationType(SpecificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spec Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spec Hierarchy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecHierarchy(SpecHierarchy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeDefinition(DatatypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spec Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spec Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecRelation(SpecRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spec Relation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spec Relation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecRelationType(SpecRelationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationGroup(RelationGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationGroupType(RelationGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Definition XHTML</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Definition XHTML</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeDefinitionXHTML(DatatypeDefinitionXHTML object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternative ID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternative ID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternativeID(AlternativeID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Definition Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Definition Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDefinitionBoolean(AttributeDefinitionBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Definition Simple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Definition Simple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDefinitionSimple(AttributeDefinitionSimple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Definition Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Definition Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeDefinitionBoolean(DatatypeDefinitionBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Definition Simple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Definition Simple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeDefinitionSimple(DatatypeDefinitionSimple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValueBoolean(AttributeValueBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value Simple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value Simple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValueSimple(AttributeValueSimple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Definition Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Definition Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDefinitionDate(AttributeDefinitionDate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Definition Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Definition Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeDefinitionDate(DatatypeDefinitionDate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value Date</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value Date</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValueDate(AttributeValueDate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Definition Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Definition Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDefinitionEnumeration(AttributeDefinitionEnumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Definition Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Definition Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeDefinitionEnumeration(DatatypeDefinitionEnumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumValue(EnumValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Embedded Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Embedded Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmbeddedValue(EmbeddedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValueEnumeration(AttributeValueEnumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Definition Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Definition Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDefinitionInteger(AttributeDefinitionInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Definition Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Definition Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeDefinitionInteger(DatatypeDefinitionInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValueInteger(AttributeValueInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Definition Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Definition Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDefinitionReal(AttributeDefinitionReal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Definition Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Definition Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeDefinitionReal(DatatypeDefinitionReal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValueReal(AttributeValueReal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Definition String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Definition String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDefinitionString(AttributeDefinitionString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Definition String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Definition String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeDefinitionString(DatatypeDefinitionString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValueString(AttributeValueString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xhtml Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xhtml Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXhtmlContent(XhtmlContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ReqIF10Switch
