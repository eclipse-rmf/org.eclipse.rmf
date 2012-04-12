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
package org.eclipse.rmf.reqif10.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.rmf.reqif10.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReqIF10FactoryImpl extends EFactoryImpl implements ReqIF10Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReqIF10Factory init() {
		try {
			ReqIF10Factory theReqIF10Factory = (ReqIF10Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.omg.org/spec/ReqIF/20110401/reqif.xsd"); 
			if (theReqIF10Factory != null) {
				return theReqIF10Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReqIF10FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqIF10FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ReqIF10Package.ATTRIBUTE_VALUE_XHTML: return createAttributeValueXHTML();
			case ReqIF10Package.ATTRIBUTE_DEFINITION_XHTML: return createAttributeDefinitionXHTML();
			case ReqIF10Package.REQ_IF_CONTENT: return createReqIFContent();
			case ReqIF10Package.REQ_IF: return createReqIF();
			case ReqIF10Package.REQ_IF_HEADER: return createReqIFHeader();
			case ReqIF10Package.REQ_IF_TOOL_EXTENSION: return createReqIFToolExtension();
			case ReqIF10Package.SPEC_OBJECT: return createSpecObject();
			case ReqIF10Package.SPEC_OBJECT_TYPE: return createSpecObjectType();
			case ReqIF10Package.SPECIFICATION: return createSpecification();
			case ReqIF10Package.SPECIFICATION_TYPE: return createSpecificationType();
			case ReqIF10Package.SPEC_HIERARCHY: return createSpecHierarchy();
			case ReqIF10Package.SPEC_RELATION: return createSpecRelation();
			case ReqIF10Package.SPEC_RELATION_TYPE: return createSpecRelationType();
			case ReqIF10Package.RELATION_GROUP: return createRelationGroup();
			case ReqIF10Package.RELATION_GROUP_TYPE: return createRelationGroupType();
			case ReqIF10Package.DATATYPE_DEFINITION_XHTML: return createDatatypeDefinitionXHTML();
			case ReqIF10Package.ALTERNATIVE_ID: return createAlternativeID();
			case ReqIF10Package.ATTRIBUTE_DEFINITION_BOOLEAN: return createAttributeDefinitionBoolean();
			case ReqIF10Package.DATATYPE_DEFINITION_BOOLEAN: return createDatatypeDefinitionBoolean();
			case ReqIF10Package.ATTRIBUTE_VALUE_BOOLEAN: return createAttributeValueBoolean();
			case ReqIF10Package.ATTRIBUTE_DEFINITION_DATE: return createAttributeDefinitionDate();
			case ReqIF10Package.DATATYPE_DEFINITION_DATE: return createDatatypeDefinitionDate();
			case ReqIF10Package.ATTRIBUTE_VALUE_DATE: return createAttributeValueDate();
			case ReqIF10Package.ATTRIBUTE_DEFINITION_ENUMERATION: return createAttributeDefinitionEnumeration();
			case ReqIF10Package.DATATYPE_DEFINITION_ENUMERATION: return createDatatypeDefinitionEnumeration();
			case ReqIF10Package.ENUM_VALUE: return createEnumValue();
			case ReqIF10Package.EMBEDDED_VALUE: return createEmbeddedValue();
			case ReqIF10Package.ATTRIBUTE_VALUE_ENUMERATION: return createAttributeValueEnumeration();
			case ReqIF10Package.ATTRIBUTE_DEFINITION_INTEGER: return createAttributeDefinitionInteger();
			case ReqIF10Package.DATATYPE_DEFINITION_INTEGER: return createDatatypeDefinitionInteger();
			case ReqIF10Package.ATTRIBUTE_VALUE_INTEGER: return createAttributeValueInteger();
			case ReqIF10Package.ATTRIBUTE_DEFINITION_REAL: return createAttributeDefinitionReal();
			case ReqIF10Package.DATATYPE_DEFINITION_REAL: return createDatatypeDefinitionReal();
			case ReqIF10Package.ATTRIBUTE_VALUE_REAL: return createAttributeValueReal();
			case ReqIF10Package.ATTRIBUTE_DEFINITION_STRING: return createAttributeDefinitionString();
			case ReqIF10Package.DATATYPE_DEFINITION_STRING: return createDatatypeDefinitionString();
			case ReqIF10Package.ATTRIBUTE_VALUE_STRING: return createAttributeValueString();
			case ReqIF10Package.XHTML_CONTENT: return createXhtmlContent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ReqIF10Package.ID:
				return createIDFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ReqIF10Package.ID:
				return convertIDToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueXHTML createAttributeValueXHTML() {
		AttributeValueXHTMLImpl attributeValueXHTML = new AttributeValueXHTMLImpl();
		return attributeValueXHTML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionXHTML createAttributeDefinitionXHTML() {
		AttributeDefinitionXHTMLImpl attributeDefinitionXHTML = new AttributeDefinitionXHTMLImpl();
		return attributeDefinitionXHTML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqIFContent createReqIFContent() {
		ReqIFContentImpl reqIFContent = new ReqIFContentImpl();
		return reqIFContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqIF createReqIF() {
		ReqIFImpl reqIF = new ReqIFImpl();
		return reqIF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqIFHeader createReqIFHeader() {
		ReqIFHeaderImpl reqIFHeader = new ReqIFHeaderImpl();
		return reqIFHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqIFToolExtension createReqIFToolExtension() {
		ReqIFToolExtensionImpl reqIFToolExtension = new ReqIFToolExtensionImpl();
		return reqIFToolExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecObject createSpecObject() {
		SpecObjectImpl specObject = new SpecObjectImpl();
		return specObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecObjectType createSpecObjectType() {
		SpecObjectTypeImpl specObjectType = new SpecObjectTypeImpl();
		return specObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification createSpecification() {
		SpecificationImpl specification = new SpecificationImpl();
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationType createSpecificationType() {
		SpecificationTypeImpl specificationType = new SpecificationTypeImpl();
		return specificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecHierarchy createSpecHierarchy() {
		SpecHierarchyImpl specHierarchy = new SpecHierarchyImpl();
		return specHierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecRelation createSpecRelation() {
		SpecRelationImpl specRelation = new SpecRelationImpl();
		return specRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecRelationType createSpecRelationType() {
		SpecRelationTypeImpl specRelationType = new SpecRelationTypeImpl();
		return specRelationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationGroup createRelationGroup() {
		RelationGroupImpl relationGroup = new RelationGroupImpl();
		return relationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationGroupType createRelationGroupType() {
		RelationGroupTypeImpl relationGroupType = new RelationGroupTypeImpl();
		return relationGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeDefinitionXHTML createDatatypeDefinitionXHTML() {
		DatatypeDefinitionXHTMLImpl datatypeDefinitionXHTML = new DatatypeDefinitionXHTMLImpl();
		return datatypeDefinitionXHTML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternativeID createAlternativeID() {
		AlternativeIDImpl alternativeID = new AlternativeIDImpl();
		return alternativeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionBoolean createAttributeDefinitionBoolean() {
		AttributeDefinitionBooleanImpl attributeDefinitionBoolean = new AttributeDefinitionBooleanImpl();
		return attributeDefinitionBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeDefinitionBoolean createDatatypeDefinitionBoolean() {
		DatatypeDefinitionBooleanImpl datatypeDefinitionBoolean = new DatatypeDefinitionBooleanImpl();
		return datatypeDefinitionBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueBoolean createAttributeValueBoolean() {
		AttributeValueBooleanImpl attributeValueBoolean = new AttributeValueBooleanImpl();
		return attributeValueBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionDate createAttributeDefinitionDate() {
		AttributeDefinitionDateImpl attributeDefinitionDate = new AttributeDefinitionDateImpl();
		return attributeDefinitionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeDefinitionDate createDatatypeDefinitionDate() {
		DatatypeDefinitionDateImpl datatypeDefinitionDate = new DatatypeDefinitionDateImpl();
		return datatypeDefinitionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueDate createAttributeValueDate() {
		AttributeValueDateImpl attributeValueDate = new AttributeValueDateImpl();
		return attributeValueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionEnumeration createAttributeDefinitionEnumeration() {
		AttributeDefinitionEnumerationImpl attributeDefinitionEnumeration = new AttributeDefinitionEnumerationImpl();
		return attributeDefinitionEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeDefinitionEnumeration createDatatypeDefinitionEnumeration() {
		DatatypeDefinitionEnumerationImpl datatypeDefinitionEnumeration = new DatatypeDefinitionEnumerationImpl();
		return datatypeDefinitionEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumValue createEnumValue() {
		EnumValueImpl enumValue = new EnumValueImpl();
		return enumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmbeddedValue createEmbeddedValue() {
		EmbeddedValueImpl embeddedValue = new EmbeddedValueImpl();
		return embeddedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueEnumeration createAttributeValueEnumeration() {
		AttributeValueEnumerationImpl attributeValueEnumeration = new AttributeValueEnumerationImpl();
		return attributeValueEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionInteger createAttributeDefinitionInteger() {
		AttributeDefinitionIntegerImpl attributeDefinitionInteger = new AttributeDefinitionIntegerImpl();
		return attributeDefinitionInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeDefinitionInteger createDatatypeDefinitionInteger() {
		DatatypeDefinitionIntegerImpl datatypeDefinitionInteger = new DatatypeDefinitionIntegerImpl();
		return datatypeDefinitionInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueInteger createAttributeValueInteger() {
		AttributeValueIntegerImpl attributeValueInteger = new AttributeValueIntegerImpl();
		return attributeValueInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionReal createAttributeDefinitionReal() {
		AttributeDefinitionRealImpl attributeDefinitionReal = new AttributeDefinitionRealImpl();
		return attributeDefinitionReal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeDefinitionReal createDatatypeDefinitionReal() {
		DatatypeDefinitionRealImpl datatypeDefinitionReal = new DatatypeDefinitionRealImpl();
		return datatypeDefinitionReal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueReal createAttributeValueReal() {
		AttributeValueRealImpl attributeValueReal = new AttributeValueRealImpl();
		return attributeValueReal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionString createAttributeDefinitionString() {
		AttributeDefinitionStringImpl attributeDefinitionString = new AttributeDefinitionStringImpl();
		return attributeDefinitionString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeDefinitionString createDatatypeDefinitionString() {
		DatatypeDefinitionStringImpl datatypeDefinitionString = new DatatypeDefinitionStringImpl();
		return datatypeDefinitionString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueString createAttributeValueString() {
		AttributeValueStringImpl attributeValueString = new AttributeValueStringImpl();
		return attributeValueString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlContent createXhtmlContent() {
		XhtmlContentImpl xhtmlContent = new XhtmlContentImpl();
		return xhtmlContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIDFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIDToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqIF10Package getReqIF10Package() {
		return (ReqIF10Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReqIF10Package getPackage() {
		return ReqIF10Package.eINSTANCE;
	}

} //ReqIF10FactoryImpl
