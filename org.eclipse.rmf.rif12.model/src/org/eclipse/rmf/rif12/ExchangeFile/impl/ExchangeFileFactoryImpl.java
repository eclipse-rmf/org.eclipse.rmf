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

package org.eclipse.rmf.rif12.ExchangeFile.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.rmf.rif12.ExchangeFile.AccessPolicy;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeDefinitionComplex;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeDefinitionEnumeration;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeDefinitionSimple;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeValueEmbeddedDocument;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeValueEmbeddedFile;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeValueEnumeration;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeValueFileReference;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeValueSimple;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeValueXmlData;
import org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinitionBinaryFile;
import org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinitionBoolean;
import org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinitionDate;
import org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinitionDocument;
import org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinitionInteger;
import org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinitionReal;
import org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinitionString;
import org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinitionXmlData;
import org.eclipse.rmf.rif12.ExchangeFile.EmbeddedValue;
import org.eclipse.rmf.rif12.ExchangeFile.EnumValue;
import org.eclipse.rmf.rif12.ExchangeFile.ExchangeFileFactory;
import org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage;
import org.eclipse.rmf.rif12.ExchangeFile.RIF;
import org.eclipse.rmf.rif12.ExchangeFile.RIFContent;
import org.eclipse.rmf.rif12.ExchangeFile.RIFHeader;
import org.eclipse.rmf.rif12.ExchangeFile.RIFToolExtension;
import org.eclipse.rmf.rif12.ExchangeFile.RelationGroup;
import org.eclipse.rmf.rif12.ExchangeFile.SpecGroup;
import org.eclipse.rmf.rif12.ExchangeFile.SpecGroupHierarchy;
import org.eclipse.rmf.rif12.ExchangeFile.SpecGroupHierarchyRoot;
import org.eclipse.rmf.rif12.ExchangeFile.SpecHierarchy;
import org.eclipse.rmf.rif12.ExchangeFile.SpecHierarchyRoot;
import org.eclipse.rmf.rif12.ExchangeFile.SpecObject;
import org.eclipse.rmf.rif12.ExchangeFile.SpecRelation;
import org.eclipse.rmf.rif12.ExchangeFile.SpecType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExchangeFileFactoryImpl extends EFactoryImpl implements ExchangeFileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExchangeFileFactory init() {
		try {
			ExchangeFileFactory theExchangeFileFactory = (ExchangeFileFactory)EPackage.Registry.INSTANCE.getEFactory("http://automotive-his.de/200807/rif/ef"); 
			if (theExchangeFileFactory != null) {
				return theExchangeFileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExchangeFileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeFileFactoryImpl() {
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
			case ExchangeFilePackage.SPEC_HIERARCHY_ROOT: return createSpecHierarchyRoot();
			case ExchangeFilePackage.SPEC_TYPE: return createSpecType();
			case ExchangeFilePackage.SPEC_HIERARCHY: return createSpecHierarchy();
			case ExchangeFilePackage.SPEC_OBJECT: return createSpecObject();
			case ExchangeFilePackage.SPEC_GROUP: return createSpecGroup();
			case ExchangeFilePackage.RELATION_GROUP: return createRelationGroup();
			case ExchangeFilePackage.SPEC_RELATION: return createSpecRelation();
			case ExchangeFilePackage.ACCESS_POLICY: return createAccessPolicy();
			case ExchangeFilePackage.SPEC_GROUP_HIERARCHY_ROOT: return createSpecGroupHierarchyRoot();
			case ExchangeFilePackage.SPEC_GROUP_HIERARCHY: return createSpecGroupHierarchy();
			case ExchangeFilePackage.ATTRIBUTE_DEFINITION_COMPLEX: return createAttributeDefinitionComplex();
			case ExchangeFilePackage.ATTRIBUTE_DEFINITION_ENUMERATION: return createAttributeDefinitionEnumeration();
			case ExchangeFilePackage.DATATYPE_DEFINITION_ENUMERATION: return createDatatypeDefinitionEnumeration();
			case ExchangeFilePackage.ENUM_VALUE: return createEnumValue();
			case ExchangeFilePackage.EMBEDDED_VALUE: return createEmbeddedValue();
			case ExchangeFilePackage.ATTRIBUTE_VALUE_ENUMERATION: return createAttributeValueEnumeration();
			case ExchangeFilePackage.ATTRIBUTE_DEFINITION_SIMPLE: return createAttributeDefinitionSimple();
			case ExchangeFilePackage.ATTRIBUTE_VALUE_SIMPLE: return createAttributeValueSimple();
			case ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT: return createAttributeValueEmbeddedDocument();
			case ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_FILE: return createAttributeValueEmbeddedFile();
			case ExchangeFilePackage.ATTRIBUTE_VALUE_FILE_REFERENCE: return createAttributeValueFileReference();
			case ExchangeFilePackage.ATTRIBUTE_VALUE_XML_DATA: return createAttributeValueXmlData();
			case ExchangeFilePackage.DATATYPE_DEFINITION_BINARY_FILE: return createDatatypeDefinitionBinaryFile();
			case ExchangeFilePackage.DATATYPE_DEFINITION_BOOLEAN: return createDatatypeDefinitionBoolean();
			case ExchangeFilePackage.DATATYPE_DEFINITION_DATE: return createDatatypeDefinitionDate();
			case ExchangeFilePackage.DATATYPE_DEFINITION_DOCUMENT: return createDatatypeDefinitionDocument();
			case ExchangeFilePackage.DATATYPE_DEFINITION_INTEGER: return createDatatypeDefinitionInteger();
			case ExchangeFilePackage.DATATYPE_DEFINITION_REAL: return createDatatypeDefinitionReal();
			case ExchangeFilePackage.DATATYPE_DEFINITION_STRING: return createDatatypeDefinitionString();
			case ExchangeFilePackage.DATATYPE_DEFINITION_XML_DATA: return createDatatypeDefinitionXmlData();
			case ExchangeFilePackage.RIF: return createRIF();
			case ExchangeFilePackage.RIF_HEADER: return createRIFHeader();
			case ExchangeFilePackage.RIF_CONTENT: return createRIFContent();
			case ExchangeFilePackage.RIF_TOOL_EXTENSION: return createRIFToolExtension();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecHierarchyRoot createSpecHierarchyRoot() {
		SpecHierarchyRootImpl specHierarchyRoot = new SpecHierarchyRootImpl();
		return specHierarchyRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecType createSpecType() {
		SpecTypeImpl specType = new SpecTypeImpl();
		return specType;
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
	public SpecObject createSpecObject() {
		SpecObjectImpl specObject = new SpecObjectImpl();
		return specObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecGroup createSpecGroup() {
		SpecGroupImpl specGroup = new SpecGroupImpl();
		return specGroup;
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
	public SpecRelation createSpecRelation() {
		SpecRelationImpl specRelation = new SpecRelationImpl();
		return specRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessPolicy createAccessPolicy() {
		AccessPolicyImpl accessPolicy = new AccessPolicyImpl();
		return accessPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecGroupHierarchyRoot createSpecGroupHierarchyRoot() {
		SpecGroupHierarchyRootImpl specGroupHierarchyRoot = new SpecGroupHierarchyRootImpl();
		return specGroupHierarchyRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecGroupHierarchy createSpecGroupHierarchy() {
		SpecGroupHierarchyImpl specGroupHierarchy = new SpecGroupHierarchyImpl();
		return specGroupHierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionComplex createAttributeDefinitionComplex() {
		AttributeDefinitionComplexImpl attributeDefinitionComplex = new AttributeDefinitionComplexImpl();
		return attributeDefinitionComplex;
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
	public AttributeDefinitionSimple createAttributeDefinitionSimple() {
		AttributeDefinitionSimpleImpl attributeDefinitionSimple = new AttributeDefinitionSimpleImpl();
		return attributeDefinitionSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueSimple createAttributeValueSimple() {
		AttributeValueSimpleImpl attributeValueSimple = new AttributeValueSimpleImpl();
		return attributeValueSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueEmbeddedDocument createAttributeValueEmbeddedDocument() {
		AttributeValueEmbeddedDocumentImpl attributeValueEmbeddedDocument = new AttributeValueEmbeddedDocumentImpl();
		return attributeValueEmbeddedDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueEmbeddedFile createAttributeValueEmbeddedFile() {
		AttributeValueEmbeddedFileImpl attributeValueEmbeddedFile = new AttributeValueEmbeddedFileImpl();
		return attributeValueEmbeddedFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueFileReference createAttributeValueFileReference() {
		AttributeValueFileReferenceImpl attributeValueFileReference = new AttributeValueFileReferenceImpl();
		return attributeValueFileReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueXmlData createAttributeValueXmlData() {
		AttributeValueXmlDataImpl attributeValueXmlData = new AttributeValueXmlDataImpl();
		return attributeValueXmlData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeDefinitionBinaryFile createDatatypeDefinitionBinaryFile() {
		DatatypeDefinitionBinaryFileImpl datatypeDefinitionBinaryFile = new DatatypeDefinitionBinaryFileImpl();
		return datatypeDefinitionBinaryFile;
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
	public DatatypeDefinitionDate createDatatypeDefinitionDate() {
		DatatypeDefinitionDateImpl datatypeDefinitionDate = new DatatypeDefinitionDateImpl();
		return datatypeDefinitionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeDefinitionDocument createDatatypeDefinitionDocument() {
		DatatypeDefinitionDocumentImpl datatypeDefinitionDocument = new DatatypeDefinitionDocumentImpl();
		return datatypeDefinitionDocument;
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
	public DatatypeDefinitionReal createDatatypeDefinitionReal() {
		DatatypeDefinitionRealImpl datatypeDefinitionReal = new DatatypeDefinitionRealImpl();
		return datatypeDefinitionReal;
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
	public DatatypeDefinitionXmlData createDatatypeDefinitionXmlData() {
		DatatypeDefinitionXmlDataImpl datatypeDefinitionXmlData = new DatatypeDefinitionXmlDataImpl();
		return datatypeDefinitionXmlData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIF createRIF() {
		RIFImpl rif = new RIFImpl();
		return rif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIFHeader createRIFHeader() {
		RIFHeaderImpl rifHeader = new RIFHeaderImpl();
		return rifHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIFContent createRIFContent() {
		RIFContentImpl rifContent = new RIFContentImpl();
		return rifContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIFToolExtension createRIFToolExtension() {
		RIFToolExtensionImpl rifToolExtension = new RIFToolExtensionImpl();
		return rifToolExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeFilePackage getExchangeFilePackage() {
		return (ExchangeFilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExchangeFilePackage getPackage() {
		return ExchangeFilePackage.eINSTANCE;
	}

} //ExchangeFileFactoryImpl
