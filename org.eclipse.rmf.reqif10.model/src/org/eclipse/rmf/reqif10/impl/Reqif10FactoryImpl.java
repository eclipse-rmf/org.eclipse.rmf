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

package org.eclipse.rmf.reqif10.impl;

import org.eclipse.rmf.reqif10.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Reqif10FactoryImpl extends EFactoryImpl implements Reqif10Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Reqif10Factory init() {
		try {
			Reqif10Factory theReqif10Factory = (Reqif10Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.omg.org/spec/ReqIF/20101201"); 
			if (theReqif10Factory != null) {
				return theReqif10Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Reqif10FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reqif10FactoryImpl() {
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
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML: return createAttributeValueXhtml();
			case Reqif10Package.ATTRIBUTE_DEFINITION_XHTML: return createAttributeDefinitionXhtml();
			case Reqif10Package.REQ_IF_CONTENT: return createReqIfContent();
			case Reqif10Package.REQ_IF: return createReqIf();
			case Reqif10Package.REQ_IF_HEADER: return createReqIfHeader();
			case Reqif10Package.REQ_IF_TOOL_EXTENSION: return createReqIfToolExtension();
			case Reqif10Package.SPEC_OBJECT: return createSpecObject();
			case Reqif10Package.SPEC_OBJECT_TYPE: return createSpecObjectType();
			case Reqif10Package.SPECIFICATION: return createSpecification();
			case Reqif10Package.SPECIFICATION_TYPE: return createSpecificationType();
			case Reqif10Package.SPEC_HIERARCHY: return createSpecHierarchy();
			case Reqif10Package.SPEC_RELATION: return createSpecRelation();
			case Reqif10Package.SPEC_RELATION_TYPE: return createSpecRelationType();
			case Reqif10Package.RELATION_GROUP: return createRelationGroup();
			case Reqif10Package.RELATION_GROUP_TYPE: return createRelationGroupType();
			case Reqif10Package.DATATYPE_DEFINITION_XHTML: return createDatatypeDefinitionXhtml();
			case Reqif10Package.ALTERNATIVE_ID: return createAlternativeId();
			case Reqif10Package.ATTRIBUTE_DEFINITION_BOOLEAN: return createAttributeDefinitionBoolean();
			case Reqif10Package.DATATYPE_DEFINITION_BOOLEAN: return createDatatypeDefinitionBoolean();
			case Reqif10Package.ATTRIBUTE_VALUE_BOOLEAN: return createAttributeValueBoolean();
			case Reqif10Package.ATTRIBUTE_DEFINITION_DATE: return createAttributeDefinitionDate();
			case Reqif10Package.DATATYPE_DEFINITION_DATE: return createDatatypeDefinitionDate();
			case Reqif10Package.ATTRIBUTE_VALUE_DATE: return createAttributeValueDate();
			case Reqif10Package.ATTRIBUTE_DEFINITION_ENUMERATION: return createAttributeDefinitionEnumeration();
			case Reqif10Package.DATATYPE_DEFINITION_ENUMERATION: return createDatatypeDefinitionEnumeration();
			case Reqif10Package.ENUM_VALUE: return createEnumValue();
			case Reqif10Package.EMBEDDED_VALUE: return createEmbeddedValue();
			case Reqif10Package.ATTRIBUTE_VALUE_ENUMERATION: return createAttributeValueEnumeration();
			case Reqif10Package.ATTRIBUTE_DEFINITION_INTEGER: return createAttributeDefinitionInteger();
			case Reqif10Package.DATATYPE_DEFINITION_INTEGER: return createDatatypeDefinitionInteger();
			case Reqif10Package.ATTRIBUTE_VALUE_INTEGER: return createAttributeValueInteger();
			case Reqif10Package.ATTRIBUTE_DEFINITION_REAL: return createAttributeDefinitionReal();
			case Reqif10Package.DATATYPE_DEFINITION_REAL: return createDatatypeDefinitionReal();
			case Reqif10Package.ATTRIBUTE_VALUE_REAL: return createAttributeValueReal();
			case Reqif10Package.ATTRIBUTE_DEFINITION_STRING: return createAttributeDefinitionString();
			case Reqif10Package.DATATYPE_DEFINITION_STRING: return createDatatypeDefinitionString();
			case Reqif10Package.ATTRIBUTE_VALUE_STRING: return createAttributeValueString();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueXhtml createAttributeValueXhtml() {
		AttributeValueXhtmlImpl attributeValueXhtml = new AttributeValueXhtmlImpl();
		return attributeValueXhtml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionXhtml createAttributeDefinitionXhtml() {
		AttributeDefinitionXhtmlImpl attributeDefinitionXhtml = new AttributeDefinitionXhtmlImpl();
		return attributeDefinitionXhtml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqIfContent createReqIfContent() {
		ReqIfContentImpl reqIfContent = new ReqIfContentImpl();
		return reqIfContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqIf createReqIf() {
		ReqIfImpl reqIf = new ReqIfImpl();
		return reqIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqIfHeader createReqIfHeader() {
		ReqIfHeaderImpl reqIfHeader = new ReqIfHeaderImpl();
		return reqIfHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqIfToolExtension createReqIfToolExtension() {
		ReqIfToolExtensionImpl reqIfToolExtension = new ReqIfToolExtensionImpl();
		return reqIfToolExtension;
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
	public DatatypeDefinitionXhtml createDatatypeDefinitionXhtml() {
		DatatypeDefinitionXhtmlImpl datatypeDefinitionXhtml = new DatatypeDefinitionXhtmlImpl();
		return datatypeDefinitionXhtml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternativeId createAlternativeId() {
		AlternativeIdImpl alternativeId = new AlternativeIdImpl();
		return alternativeId;
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
	public Reqif10Package getReqif10Package() {
		return (Reqif10Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Reqif10Package getPackage() {
		return Reqif10Package.eINSTANCE;
	}

} //ReqIfFactoryImpl
