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
package org.eclipse.rmf.reqif10;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.reqif10.ReqIF10Package
 * @generated
 */
public interface ReqIF10Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReqIF10Factory eINSTANCE = org.eclipse.rmf.reqif10.impl.ReqIF10FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Attribute Value XHTML</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value XHTML</em>'.
	 * @generated
	 */
	AttributeValueXHTML createAttributeValueXHTML();

	/**
	 * Returns a new object of class '<em>Attribute Definition XHTML</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Definition XHTML</em>'.
	 * @generated
	 */
	AttributeDefinitionXHTML createAttributeDefinitionXHTML();

	/**
	 * Returns a new object of class '<em>Req IF Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Req IF Content</em>'.
	 * @generated
	 */
	ReqIFContent createReqIFContent();

	/**
	 * Returns a new object of class '<em>Req IF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Req IF</em>'.
	 * @generated
	 */
	ReqIF createReqIF();

	/**
	 * Returns a new object of class '<em>Req IF Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Req IF Header</em>'.
	 * @generated
	 */
	ReqIFHeader createReqIFHeader();

	/**
	 * Returns a new object of class '<em>Req IF Tool Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Req IF Tool Extension</em>'.
	 * @generated
	 */
	ReqIFToolExtension createReqIFToolExtension();

	/**
	 * Returns a new object of class '<em>Spec Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Object</em>'.
	 * @generated
	 */
	SpecObject createSpecObject();

	/**
	 * Returns a new object of class '<em>Spec Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Object Type</em>'.
	 * @generated
	 */
	SpecObjectType createSpecObjectType();

	/**
	 * Returns a new object of class '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specification</em>'.
	 * @generated
	 */
	Specification createSpecification();

	/**
	 * Returns a new object of class '<em>Specification Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specification Type</em>'.
	 * @generated
	 */
	SpecificationType createSpecificationType();

	/**
	 * Returns a new object of class '<em>Spec Hierarchy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Hierarchy</em>'.
	 * @generated
	 */
	SpecHierarchy createSpecHierarchy();

	/**
	 * Returns a new object of class '<em>Spec Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Relation</em>'.
	 * @generated
	 */
	SpecRelation createSpecRelation();

	/**
	 * Returns a new object of class '<em>Spec Relation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spec Relation Type</em>'.
	 * @generated
	 */
	SpecRelationType createSpecRelationType();

	/**
	 * Returns a new object of class '<em>Relation Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Group</em>'.
	 * @generated
	 */
	RelationGroup createRelationGroup();

	/**
	 * Returns a new object of class '<em>Relation Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Group Type</em>'.
	 * @generated
	 */
	RelationGroupType createRelationGroupType();

	/**
	 * Returns a new object of class '<em>Datatype Definition XHTML</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Definition XHTML</em>'.
	 * @generated
	 */
	DatatypeDefinitionXHTML createDatatypeDefinitionXHTML();

	/**
	 * Returns a new object of class '<em>Alternative ID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alternative ID</em>'.
	 * @generated
	 */
	AlternativeID createAlternativeID();

	/**
	 * Returns a new object of class '<em>Attribute Definition Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Definition Boolean</em>'.
	 * @generated
	 */
	AttributeDefinitionBoolean createAttributeDefinitionBoolean();

	/**
	 * Returns a new object of class '<em>Datatype Definition Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Definition Boolean</em>'.
	 * @generated
	 */
	DatatypeDefinitionBoolean createDatatypeDefinitionBoolean();

	/**
	 * Returns a new object of class '<em>Attribute Value Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Boolean</em>'.
	 * @generated
	 */
	AttributeValueBoolean createAttributeValueBoolean();

	/**
	 * Returns a new object of class '<em>Attribute Definition Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Definition Date</em>'.
	 * @generated
	 */
	AttributeDefinitionDate createAttributeDefinitionDate();

	/**
	 * Returns a new object of class '<em>Datatype Definition Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Definition Date</em>'.
	 * @generated
	 */
	DatatypeDefinitionDate createDatatypeDefinitionDate();

	/**
	 * Returns a new object of class '<em>Attribute Value Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Date</em>'.
	 * @generated
	 */
	AttributeValueDate createAttributeValueDate();

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
	 * Returns a new object of class '<em>Attribute Definition Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Definition Integer</em>'.
	 * @generated
	 */
	AttributeDefinitionInteger createAttributeDefinitionInteger();

	/**
	 * Returns a new object of class '<em>Datatype Definition Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Definition Integer</em>'.
	 * @generated
	 */
	DatatypeDefinitionInteger createDatatypeDefinitionInteger();

	/**
	 * Returns a new object of class '<em>Attribute Value Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Integer</em>'.
	 * @generated
	 */
	AttributeValueInteger createAttributeValueInteger();

	/**
	 * Returns a new object of class '<em>Attribute Definition Real</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Definition Real</em>'.
	 * @generated
	 */
	AttributeDefinitionReal createAttributeDefinitionReal();

	/**
	 * Returns a new object of class '<em>Datatype Definition Real</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Definition Real</em>'.
	 * @generated
	 */
	DatatypeDefinitionReal createDatatypeDefinitionReal();

	/**
	 * Returns a new object of class '<em>Attribute Value Real</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value Real</em>'.
	 * @generated
	 */
	AttributeValueReal createAttributeValueReal();

	/**
	 * Returns a new object of class '<em>Attribute Definition String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Definition String</em>'.
	 * @generated
	 */
	AttributeDefinitionString createAttributeDefinitionString();

	/**
	 * Returns a new object of class '<em>Datatype Definition String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datatype Definition String</em>'.
	 * @generated
	 */
	DatatypeDefinitionString createDatatypeDefinitionString();

	/**
	 * Returns a new object of class '<em>Attribute Value String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value String</em>'.
	 * @generated
	 */
	AttributeValueString createAttributeValueString();

	/**
	 * Returns a new object of class '<em>Xhtml Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xhtml Content</em>'.
	 * @generated
	 */
	XhtmlContent createXhtmlContent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReqIF10Package getReqIF10Package();

} //ReqIF10Factory
