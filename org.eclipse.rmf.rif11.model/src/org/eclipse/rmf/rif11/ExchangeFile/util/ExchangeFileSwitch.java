/*******************************************************************************
 * Copyright (c) 2011 itemis GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nirmal Sasidharan - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.rif11.ExchangeFile.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinition;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionComplex;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionEnumeration;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionSimple;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeValue;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeValueComplex;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEmbeddedDocument;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEmbeddedFile;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEnumeration;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeValueFileReference;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeValueSimple;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeValueXmlData;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinition;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBinaryFile;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBoolean;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionComplex;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionDate;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionDocument;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionInteger;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionReal;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionSimple;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionString;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionXmlData;
import org.eclipse.rmf.rif11.ExchangeFile.EmbeddedValue;
import org.eclipse.rmf.rif11.ExchangeFile.EnumValue;
import org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage;
import org.eclipse.rmf.rif11.ExchangeFile.Identifiable;
import org.eclipse.rmf.rif11.ExchangeFile.RIF;
import org.eclipse.rmf.rif11.ExchangeFile.RelationGroup;
import org.eclipse.rmf.rif11.ExchangeFile.SpecElementWithUserDefinedAttributes;
import org.eclipse.rmf.rif11.ExchangeFile.SpecGroup;
import org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchy;
import org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchyRoot;
import org.eclipse.rmf.rif11.ExchangeFile.SpecObject;
import org.eclipse.rmf.rif11.ExchangeFile.SpecRelation;
import org.eclipse.rmf.rif11.ExchangeFile.SpecType;


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
 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage
 * @generated
 */
public class ExchangeFileSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExchangeFilePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeFileSwitch() {
		if (modelPackage == null) {
			modelPackage = ExchangeFilePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ExchangeFilePackage.SPEC_HIERARCHY_ROOT: {
				SpecHierarchyRoot specHierarchyRoot = (SpecHierarchyRoot)theEObject;
				T result = caseSpecHierarchyRoot(specHierarchyRoot);
				if (result == null) result = caseSpecElementWithUserDefinedAttributes(specHierarchyRoot);
				if (result == null) result = caseIdentifiable(specHierarchyRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES: {
				SpecElementWithUserDefinedAttributes specElementWithUserDefinedAttributes = (SpecElementWithUserDefinedAttributes)theEObject;
				T result = caseSpecElementWithUserDefinedAttributes(specElementWithUserDefinedAttributes);
				if (result == null) result = caseIdentifiable(specElementWithUserDefinedAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.IDENTIFIABLE: {
				Identifiable identifiable = (Identifiable)theEObject;
				T result = caseIdentifiable(identifiable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.SPEC_TYPE: {
				SpecType specType = (SpecType)theEObject;
				T result = caseSpecType(specType);
				if (result == null) result = caseIdentifiable(specType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.ATTRIBUTE_DEFINITION: {
				AttributeDefinition attributeDefinition = (AttributeDefinition)theEObject;
				T result = caseAttributeDefinition(attributeDefinition);
				if (result == null) result = caseIdentifiable(attributeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.ATTRIBUTE_VALUE: {
				AttributeValue attributeValue = (AttributeValue)theEObject;
				T result = caseAttributeValue(attributeValue);
				if (result == null) result = caseIdentifiable(attributeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.SPEC_HIERARCHY: {
				SpecHierarchy specHierarchy = (SpecHierarchy)theEObject;
				T result = caseSpecHierarchy(specHierarchy);
				if (result == null) result = caseIdentifiable(specHierarchy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.SPEC_OBJECT: {
				SpecObject specObject = (SpecObject)theEObject;
				T result = caseSpecObject(specObject);
				if (result == null) result = caseSpecElementWithUserDefinedAttributes(specObject);
				if (result == null) result = caseIdentifiable(specObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.SPEC_GROUP: {
				SpecGroup specGroup = (SpecGroup)theEObject;
				T result = caseSpecGroup(specGroup);
				if (result == null) result = caseSpecElementWithUserDefinedAttributes(specGroup);
				if (result == null) result = caseIdentifiable(specGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.RELATION_GROUP: {
				RelationGroup relationGroup = (RelationGroup)theEObject;
				T result = caseRelationGroup(relationGroup);
				if (result == null) result = caseIdentifiable(relationGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.SPEC_RELATION: {
				SpecRelation specRelation = (SpecRelation)theEObject;
				T result = caseSpecRelation(specRelation);
				if (result == null) result = caseSpecElementWithUserDefinedAttributes(specRelation);
				if (result == null) result = caseIdentifiable(specRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.DATATYPE_DEFINITION: {
				DatatypeDefinition datatypeDefinition = (DatatypeDefinition)theEObject;
				T result = caseDatatypeDefinition(datatypeDefinition);
				if (result == null) result = caseIdentifiable(datatypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.ACCESS_POLICY: {
				AccessPolicy accessPolicy = (AccessPolicy)theEObject;
				T result = caseAccessPolicy(accessPolicy);
				if (result == null) result = caseIdentifiable(accessPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.ATTRIBUTE_DEFINITION_COMPLEX: {
				AttributeDefinitionComplex attributeDefinitionComplex = (AttributeDefinitionComplex)theEObject;
				T result = caseAttributeDefinitionComplex(attributeDefinitionComplex);
				if (result == null) result = caseAttributeDefinition(attributeDefinitionComplex);
				if (result == null) result = caseIdentifiable(attributeDefinitionComplex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.DATATYPE_DEFINITION_COMPLEX: {
				DatatypeDefinitionComplex datatypeDefinitionComplex = (DatatypeDefinitionComplex)theEObject;
				T result = caseDatatypeDefinitionComplex(datatypeDefinitionComplex);
				if (result == null) result = caseDatatypeDefinition(datatypeDefinitionComplex);
				if (result == null) result = caseIdentifiable(datatypeDefinitionComplex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.ATTRIBUTE_VALUE_COMPLEX: {
				AttributeValueComplex attributeValueComplex = (AttributeValueComplex)theEObject;
				T result = caseAttributeValueComplex(attributeValueComplex);
				if (result == null) result = caseAttributeValue(attributeValueComplex);
				if (result == null) result = caseIdentifiable(attributeValueComplex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.ATTRIBUTE_DEFINITION_ENUMERATION: {
				AttributeDefinitionEnumeration attributeDefinitionEnumeration = (AttributeDefinitionEnumeration)theEObject;
				T result = caseAttributeDefinitionEnumeration(attributeDefinitionEnumeration);
				if (result == null) result = caseAttributeDefinition(attributeDefinitionEnumeration);
				if (result == null) result = caseIdentifiable(attributeDefinitionEnumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.DATATYPE_DEFINITION_ENUMERATION: {
				DatatypeDefinitionEnumeration datatypeDefinitionEnumeration = (DatatypeDefinitionEnumeration)theEObject;
				T result = caseDatatypeDefinitionEnumeration(datatypeDefinitionEnumeration);
				if (result == null) result = caseDatatypeDefinition(datatypeDefinitionEnumeration);
				if (result == null) result = caseIdentifiable(datatypeDefinitionEnumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.ENUM_VALUE: {
				EnumValue enumValue = (EnumValue)theEObject;
				T result = caseEnumValue(enumValue);
				if (result == null) result = caseIdentifiable(enumValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.EMBEDDED_VALUE: {
				EmbeddedValue embeddedValue = (EmbeddedValue)theEObject;
				T result = caseEmbeddedValue(embeddedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.ATTRIBUTE_VALUE_ENUMERATION: {
				AttributeValueEnumeration attributeValueEnumeration = (AttributeValueEnumeration)theEObject;
				T result = caseAttributeValueEnumeration(attributeValueEnumeration);
				if (result == null) result = caseAttributeValue(attributeValueEnumeration);
				if (result == null) result = caseIdentifiable(attributeValueEnumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.ATTRIBUTE_DEFINITION_SIMPLE: {
				AttributeDefinitionSimple attributeDefinitionSimple = (AttributeDefinitionSimple)theEObject;
				T result = caseAttributeDefinitionSimple(attributeDefinitionSimple);
				if (result == null) result = caseAttributeDefinition(attributeDefinitionSimple);
				if (result == null) result = caseIdentifiable(attributeDefinitionSimple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.DATATYPE_DEFINITION_SIMPLE: {
				DatatypeDefinitionSimple datatypeDefinitionSimple = (DatatypeDefinitionSimple)theEObject;
				T result = caseDatatypeDefinitionSimple(datatypeDefinitionSimple);
				if (result == null) result = caseDatatypeDefinition(datatypeDefinitionSimple);
				if (result == null) result = caseIdentifiable(datatypeDefinitionSimple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.ATTRIBUTE_VALUE_SIMPLE: {
				AttributeValueSimple attributeValueSimple = (AttributeValueSimple)theEObject;
				T result = caseAttributeValueSimple(attributeValueSimple);
				if (result == null) result = caseAttributeValue(attributeValueSimple);
				if (result == null) result = caseIdentifiable(attributeValueSimple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT: {
				AttributeValueEmbeddedDocument attributeValueEmbeddedDocument = (AttributeValueEmbeddedDocument)theEObject;
				T result = caseAttributeValueEmbeddedDocument(attributeValueEmbeddedDocument);
				if (result == null) result = caseAttributeValueComplex(attributeValueEmbeddedDocument);
				if (result == null) result = caseAttributeValue(attributeValueEmbeddedDocument);
				if (result == null) result = caseIdentifiable(attributeValueEmbeddedDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_FILE: {
				AttributeValueEmbeddedFile attributeValueEmbeddedFile = (AttributeValueEmbeddedFile)theEObject;
				T result = caseAttributeValueEmbeddedFile(attributeValueEmbeddedFile);
				if (result == null) result = caseAttributeValueComplex(attributeValueEmbeddedFile);
				if (result == null) result = caseAttributeValue(attributeValueEmbeddedFile);
				if (result == null) result = caseIdentifiable(attributeValueEmbeddedFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.ATTRIBUTE_VALUE_FILE_REFERENCE: {
				AttributeValueFileReference attributeValueFileReference = (AttributeValueFileReference)theEObject;
				T result = caseAttributeValueFileReference(attributeValueFileReference);
				if (result == null) result = caseAttributeValueComplex(attributeValueFileReference);
				if (result == null) result = caseAttributeValue(attributeValueFileReference);
				if (result == null) result = caseIdentifiable(attributeValueFileReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.ATTRIBUTE_VALUE_XML_DATA: {
				AttributeValueXmlData attributeValueXmlData = (AttributeValueXmlData)theEObject;
				T result = caseAttributeValueXmlData(attributeValueXmlData);
				if (result == null) result = caseAttributeValueComplex(attributeValueXmlData);
				if (result == null) result = caseAttributeValue(attributeValueXmlData);
				if (result == null) result = caseIdentifiable(attributeValueXmlData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.DATATYPE_DEFINITION_BINARY_FILE: {
				DatatypeDefinitionBinaryFile datatypeDefinitionBinaryFile = (DatatypeDefinitionBinaryFile)theEObject;
				T result = caseDatatypeDefinitionBinaryFile(datatypeDefinitionBinaryFile);
				if (result == null) result = caseDatatypeDefinitionComplex(datatypeDefinitionBinaryFile);
				if (result == null) result = caseDatatypeDefinition(datatypeDefinitionBinaryFile);
				if (result == null) result = caseIdentifiable(datatypeDefinitionBinaryFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.DATATYPE_DEFINITION_BOOLEAN: {
				DatatypeDefinitionBoolean datatypeDefinitionBoolean = (DatatypeDefinitionBoolean)theEObject;
				T result = caseDatatypeDefinitionBoolean(datatypeDefinitionBoolean);
				if (result == null) result = caseDatatypeDefinitionSimple(datatypeDefinitionBoolean);
				if (result == null) result = caseDatatypeDefinition(datatypeDefinitionBoolean);
				if (result == null) result = caseIdentifiable(datatypeDefinitionBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.DATATYPE_DEFINITION_DATE: {
				DatatypeDefinitionDate datatypeDefinitionDate = (DatatypeDefinitionDate)theEObject;
				T result = caseDatatypeDefinitionDate(datatypeDefinitionDate);
				if (result == null) result = caseDatatypeDefinitionSimple(datatypeDefinitionDate);
				if (result == null) result = caseDatatypeDefinition(datatypeDefinitionDate);
				if (result == null) result = caseIdentifiable(datatypeDefinitionDate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.DATATYPE_DEFINITION_DOCUMENT: {
				DatatypeDefinitionDocument datatypeDefinitionDocument = (DatatypeDefinitionDocument)theEObject;
				T result = caseDatatypeDefinitionDocument(datatypeDefinitionDocument);
				if (result == null) result = caseDatatypeDefinitionComplex(datatypeDefinitionDocument);
				if (result == null) result = caseDatatypeDefinition(datatypeDefinitionDocument);
				if (result == null) result = caseIdentifiable(datatypeDefinitionDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.DATATYPE_DEFINITION_INTEGER: {
				DatatypeDefinitionInteger datatypeDefinitionInteger = (DatatypeDefinitionInteger)theEObject;
				T result = caseDatatypeDefinitionInteger(datatypeDefinitionInteger);
				if (result == null) result = caseDatatypeDefinitionSimple(datatypeDefinitionInteger);
				if (result == null) result = caseDatatypeDefinition(datatypeDefinitionInteger);
				if (result == null) result = caseIdentifiable(datatypeDefinitionInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.DATATYPE_DEFINITION_REAL: {
				DatatypeDefinitionReal datatypeDefinitionReal = (DatatypeDefinitionReal)theEObject;
				T result = caseDatatypeDefinitionReal(datatypeDefinitionReal);
				if (result == null) result = caseDatatypeDefinitionSimple(datatypeDefinitionReal);
				if (result == null) result = caseDatatypeDefinition(datatypeDefinitionReal);
				if (result == null) result = caseIdentifiable(datatypeDefinitionReal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.DATATYPE_DEFINITION_STRING: {
				DatatypeDefinitionString datatypeDefinitionString = (DatatypeDefinitionString)theEObject;
				T result = caseDatatypeDefinitionString(datatypeDefinitionString);
				if (result == null) result = caseDatatypeDefinitionSimple(datatypeDefinitionString);
				if (result == null) result = caseDatatypeDefinition(datatypeDefinitionString);
				if (result == null) result = caseIdentifiable(datatypeDefinitionString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.DATATYPE_DEFINITION_XML_DATA: {
				DatatypeDefinitionXmlData datatypeDefinitionXmlData = (DatatypeDefinitionXmlData)theEObject;
				T result = caseDatatypeDefinitionXmlData(datatypeDefinitionXmlData);
				if (result == null) result = caseDatatypeDefinitionComplex(datatypeDefinitionXmlData);
				if (result == null) result = caseDatatypeDefinition(datatypeDefinitionXmlData);
				if (result == null) result = caseIdentifiable(datatypeDefinitionXmlData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExchangeFilePackage.RIF: {
				RIF rif = (RIF)theEObject;
				T result = caseRIF(rif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spec Hierarchy Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spec Hierarchy Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecHierarchyRoot(SpecHierarchyRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spec Element With User Defined Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spec Element With User Defined Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecElementWithUserDefinedAttributes(SpecElementWithUserDefinedAttributes object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Spec Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spec Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecGroup(SpecGroup object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Access Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessPolicy(AccessPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Definition Complex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Definition Complex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDefinitionComplex(AttributeDefinitionComplex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Definition Complex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Definition Complex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeDefinitionComplex(DatatypeDefinitionComplex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value Complex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value Complex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValueComplex(AttributeValueComplex object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value Embedded Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value Embedded Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValueEmbeddedDocument(AttributeValueEmbeddedDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value Embedded File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value Embedded File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValueEmbeddedFile(AttributeValueEmbeddedFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value File Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value File Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValueFileReference(AttributeValueFileReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value Xml Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value Xml Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeValueXmlData(AttributeValueXmlData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Definition Binary File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Definition Binary File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeDefinitionBinaryFile(DatatypeDefinitionBinaryFile object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Definition Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Definition Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeDefinitionDocument(DatatypeDefinitionDocument object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Datatype Definition Xml Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datatype Definition Xml Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatatypeDefinitionXmlData(DatatypeDefinitionXmlData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RIF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RIF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRIF(RIF object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //ExchangeFileSwitch
