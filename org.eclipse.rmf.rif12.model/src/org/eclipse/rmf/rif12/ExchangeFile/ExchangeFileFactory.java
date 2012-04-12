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

package org.eclipse.rmf.rif12.ExchangeFile;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage
 * @generated
 */
public interface ExchangeFileFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExchangeFileFactory eINSTANCE = org.eclipse.rmf.rif12.ExchangeFile.impl.ExchangeFileFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Spec Hierarchy Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Hierarchy Root</em>'.
	 * @generated
	 */
	SpecHierarchyRoot createSpecHierarchyRoot();

	/**
	 * Returns a new object of class '<em>Spec Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Type</em>'.
	 * @generated
	 */
	SpecType createSpecType();

	/**
	 * Returns a new object of class '<em>Spec Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Hierarchy</em>'.
	 * @generated
	 */
	SpecHierarchy createSpecHierarchy();

	/**
	 * Returns a new object of class '<em>Spec Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Object</em>'.
	 * @generated
	 */
	SpecObject createSpecObject();

	/**
	 * Returns a new object of class '<em>Spec Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Group</em>'.
	 * @generated
	 */
	SpecGroup createSpecGroup();

	/**
	 * Returns a new object of class '<em>Relation Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Group</em>'.
	 * @generated
	 */
	RelationGroup createRelationGroup();

	/**
	 * Returns a new object of class '<em>Spec Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Relation</em>'.
	 * @generated
	 */
	SpecRelation createSpecRelation();

	/**
	 * Returns a new object of class '<em>Access Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Policy</em>'.
	 * @generated
	 */
	AccessPolicy createAccessPolicy();

	/**
	 * Returns a new object of class '<em>Spec Group Hierarchy Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Group Hierarchy Root</em>'.
	 * @generated
	 */
	SpecGroupHierarchyRoot createSpecGroupHierarchyRoot();

	/**
	 * Returns a new object of class '<em>Spec Group Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Group Hierarchy</em>'.
	 * @generated
	 */
	SpecGroupHierarchy createSpecGroupHierarchy();

	/**
	 * Returns a new object of class '<em>Attribute Definition Complex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Definition Complex</em>'.
	 * @generated
	 */
	AttributeDefinitionComplex createAttributeDefinitionComplex();

	/**
	 * Returns a new object of class '<em>Attribute Definition Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Definition Enumeration</em>'.
	 * @generated
	 */
	AttributeDefinitionEnumeration createAttributeDefinitionEnumeration();

	/**
	 * Returns a new object of class '<em>Datatype Definition Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Definition Enumeration</em>'.
	 * @generated
	 */
	DatatypeDefinitionEnumeration createDatatypeDefinitionEnumeration();

	/**
	 * Returns a new object of class '<em>Enum Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Value</em>'.
	 * @generated
	 */
	EnumValue createEnumValue();

	/**
	 * Returns a new object of class '<em>Embedded Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Embedded Value</em>'.
	 * @generated
	 */
	EmbeddedValue createEmbeddedValue();

	/**
	 * Returns a new object of class '<em>Attribute Value Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Enumeration</em>'.
	 * @generated
	 */
	AttributeValueEnumeration createAttributeValueEnumeration();

	/**
	 * Returns a new object of class '<em>Attribute Definition Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Definition Simple</em>'.
	 * @generated
	 */
	AttributeDefinitionSimple createAttributeDefinitionSimple();

	/**
	 * Returns a new object of class '<em>Attribute Value Simple</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Simple</em>'.
	 * @generated
	 */
	AttributeValueSimple createAttributeValueSimple();

	/**
	 * Returns a new object of class '<em>Attribute Value Embedded Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Embedded Document</em>'.
	 * @generated
	 */
	AttributeValueEmbeddedDocument createAttributeValueEmbeddedDocument();

	/**
	 * Returns a new object of class '<em>Attribute Value Embedded File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Embedded File</em>'.
	 * @generated
	 */
	AttributeValueEmbeddedFile createAttributeValueEmbeddedFile();

	/**
	 * Returns a new object of class '<em>Attribute Value File Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value File Reference</em>'.
	 * @generated
	 */
	AttributeValueFileReference createAttributeValueFileReference();

	/**
	 * Returns a new object of class '<em>Attribute Value Xml Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Xml Data</em>'.
	 * @generated
	 */
	AttributeValueXmlData createAttributeValueXmlData();

	/**
	 * Returns a new object of class '<em>Datatype Definition Binary File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Definition Binary File</em>'.
	 * @generated
	 */
	DatatypeDefinitionBinaryFile createDatatypeDefinitionBinaryFile();

	/**
	 * Returns a new object of class '<em>Datatype Definition Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Definition Boolean</em>'.
	 * @generated
	 */
	DatatypeDefinitionBoolean createDatatypeDefinitionBoolean();

	/**
	 * Returns a new object of class '<em>Datatype Definition Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Definition Date</em>'.
	 * @generated
	 */
	DatatypeDefinitionDate createDatatypeDefinitionDate();

	/**
	 * Returns a new object of class '<em>Datatype Definition Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Definition Document</em>'.
	 * @generated
	 */
	DatatypeDefinitionDocument createDatatypeDefinitionDocument();

	/**
	 * Returns a new object of class '<em>Datatype Definition Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Definition Integer</em>'.
	 * @generated
	 */
	DatatypeDefinitionInteger createDatatypeDefinitionInteger();

	/**
	 * Returns a new object of class '<em>Datatype Definition Real</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Definition Real</em>'.
	 * @generated
	 */
	DatatypeDefinitionReal createDatatypeDefinitionReal();

	/**
	 * Returns a new object of class '<em>Datatype Definition String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Definition String</em>'.
	 * @generated
	 */
	DatatypeDefinitionString createDatatypeDefinitionString();

	/**
	 * Returns a new object of class '<em>Datatype Definition Xml Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Definition Xml Data</em>'.
	 * @generated
	 */
	DatatypeDefinitionXmlData createDatatypeDefinitionXmlData();

	/**
	 * Returns a new object of class '<em>RIF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RIF</em>'.
	 * @generated
	 */
	RIF createRIF();

	/**
	 * Returns a new object of class '<em>RIF Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RIF Header</em>'.
	 * @generated
	 */
	RIFHeader createRIFHeader();

	/**
	 * Returns a new object of class '<em>RIF Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RIF Content</em>'.
	 * @generated
	 */
	RIFContent createRIFContent();

	/**
	 * Returns a new object of class '<em>RIF Tool Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RIF Tool Extension</em>'.
	 * @generated
	 */
	RIFToolExtension createRIFToolExtension();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExchangeFilePackage getExchangeFilePackage();

} //ExchangeFileFactory
