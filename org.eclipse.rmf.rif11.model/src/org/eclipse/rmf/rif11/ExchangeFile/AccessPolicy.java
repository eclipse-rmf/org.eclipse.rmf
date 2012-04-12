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

package org.eclipse.rmf.rif11.ExchangeFile;

import org.eclipse.emf.common.util.EList;
import org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.AccessPolicyAccessModeEnum;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getAccessMode <em>Access Mode</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getSpecGroups <em>Spec Groups</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getAttributeDefinitions <em>Attribute Definitions</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getRelationGroups <em>Relation Groups</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getDatatypeDefinitions <em>Datatype Definitions</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getSpecRelations <em>Spec Relations</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getAttributeValues <em>Attribute Values</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getSpecTypes <em>Spec Types</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getSpecHierarchies <em>Spec Hierarchies</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getSpecObjects <em>Spec Objects</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getSpecHierarchyRoots <em>Spec Hierarchy Roots</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getAccessPolicy()
 * @model
 * @generated
 */
public interface AccessPolicy extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Access Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.AccessPolicyAccessModeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Mode</em>' attribute.
	 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.AccessPolicyAccessModeEnum
	 * @see #setAccessMode(AccessPolicyAccessModeEnum)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getAccessPolicy_AccessMode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AccessPolicyAccessModeEnum getAccessMode();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getAccessMode <em>Access Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Mode</em>' attribute.
	 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.AccessPolicyAccessModeEnum
	 * @see #getAccessMode()
	 * @generated
	 */
	void setAccessMode(AccessPolicyAccessModeEnum value);

	/**
	 * Returns the value of the '<em><b>Spec Groups</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.ExchangeFile.SpecGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Groups</em>' reference list.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getAccessPolicy_SpecGroups()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SpecGroup> getSpecGroups();

	/**
	 * Returns the value of the '<em><b>Attribute Definitions</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Definitions</em>' reference list.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getAccessPolicy_AttributeDefinitions()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AttributeDefinition> getAttributeDefinitions();

	/**
	 * Returns the value of the '<em><b>Relation Groups</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.ExchangeFile.RelationGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Groups</em>' reference list.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getAccessPolicy_RelationGroups()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RelationGroup> getRelationGroups();

	/**
	 * Returns the value of the '<em><b>Datatype Definitions</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype Definitions</em>' reference list.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getAccessPolicy_DatatypeDefinitions()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DatatypeDefinition> getDatatypeDefinitions();

	/**
	 * Returns the value of the '<em><b>Spec Relations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.ExchangeFile.SpecRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Relations</em>' reference list.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getAccessPolicy_SpecRelations()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SpecRelation> getSpecRelations();

	/**
	 * Returns the value of the '<em><b>Attribute Values</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Values</em>' reference list.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getAccessPolicy_AttributeValues()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AttributeValue> getAttributeValues();

	/**
	 * Returns the value of the '<em><b>Spec Types</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.ExchangeFile.SpecType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Types</em>' reference list.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getAccessPolicy_SpecTypes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SpecType> getSpecTypes();

	/**
	 * Returns the value of the '<em><b>Spec Hierarchies</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Hierarchies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Hierarchies</em>' reference list.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getAccessPolicy_SpecHierarchies()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SpecHierarchy> getSpecHierarchies();

	/**
	 * Returns the value of the '<em><b>Spec Objects</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.ExchangeFile.SpecObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Objects</em>' reference list.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getAccessPolicy_SpecObjects()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SpecObject> getSpecObjects();

	/**
	 * Returns the value of the '<em><b>Spec Hierarchy Roots</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchyRoot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Hierarchy Roots</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Hierarchy Roots</em>' reference list.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getAccessPolicy_SpecHierarchyRoots()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SpecHierarchyRoot> getSpecHierarchyRoots();

} // AccessPolicy
