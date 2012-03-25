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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Req IF Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIFContent#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIFContent#getSpecTypes <em>Spec Types</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIFContent#getSpecObjects <em>Spec Objects</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIFContent#getSpecRelations <em>Spec Relations</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIFContent#getSpecifications <em>Specifications</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIFContent#getSpecRelationGroups <em>Spec Relation Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getReqIFContent()
 * @model extendedMetaData="name='REQ-IF-CONTENT' kind='elementOnly'"
 * @generated
 */
public interface ReqIFContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Datatypes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.DatatypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatypes</em>' containment reference list.
	 * @see #isSetDatatypes()
	 * @see #unsetDatatypes()
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getReqIFContent_Datatypes()
	 * @model containment="true" unsettable="true" ordered="false"
	 *        extendedMetaData="name='DATATYPES' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DatatypeDefinition> getDatatypes();

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.ReqIFContent#getDatatypes <em>Datatypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDatatypes()
	 * @see #getDatatypes()
	 * @generated
	 */
	void unsetDatatypes();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.ReqIFContent#getDatatypes <em>Datatypes</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Datatypes</em>' containment reference list is set.
	 * @see #unsetDatatypes()
	 * @see #getDatatypes()
	 * @generated
	 */
	boolean isSetDatatypes();

	/**
	 * Returns the value of the '<em><b>Spec Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.SpecType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Types</em>' containment reference list.
	 * @see #isSetSpecTypes()
	 * @see #unsetSpecTypes()
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getReqIFContent_SpecTypes()
	 * @model containment="true" unsettable="true" ordered="false"
	 *        extendedMetaData="name='SPEC-TYPES' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SpecType> getSpecTypes();

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.ReqIFContent#getSpecTypes <em>Spec Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecTypes()
	 * @see #getSpecTypes()
	 * @generated
	 */
	void unsetSpecTypes();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.ReqIFContent#getSpecTypes <em>Spec Types</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Spec Types</em>' containment reference list is set.
	 * @see #unsetSpecTypes()
	 * @see #getSpecTypes()
	 * @generated
	 */
	boolean isSetSpecTypes();

	/**
	 * Returns the value of the '<em><b>Spec Objects</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.SpecObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Objects</em>' containment reference list.
	 * @see #isSetSpecObjects()
	 * @see #unsetSpecObjects()
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getReqIFContent_SpecObjects()
	 * @model containment="true" unsettable="true" ordered="false"
	 *        extendedMetaData="name='SPEC-OBJECTS' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SpecObject> getSpecObjects();

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.ReqIFContent#getSpecObjects <em>Spec Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecObjects()
	 * @see #getSpecObjects()
	 * @generated
	 */
	void unsetSpecObjects();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.ReqIFContent#getSpecObjects <em>Spec Objects</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Spec Objects</em>' containment reference list is set.
	 * @see #unsetSpecObjects()
	 * @see #getSpecObjects()
	 * @generated
	 */
	boolean isSetSpecObjects();

	/**
	 * Returns the value of the '<em><b>Spec Relations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.SpecRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Relations</em>' containment reference list.
	 * @see #isSetSpecRelations()
	 * @see #unsetSpecRelations()
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getReqIFContent_SpecRelations()
	 * @model containment="true" unsettable="true" ordered="false"
	 *        extendedMetaData="name='SPEC-RELATIONS' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SpecRelation> getSpecRelations();

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.ReqIFContent#getSpecRelations <em>Spec Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecRelations()
	 * @see #getSpecRelations()
	 * @generated
	 */
	void unsetSpecRelations();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.ReqIFContent#getSpecRelations <em>Spec Relations</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Spec Relations</em>' containment reference list is set.
	 * @see #unsetSpecRelations()
	 * @see #getSpecRelations()
	 * @generated
	 */
	boolean isSetSpecRelations();

	/**
	 * Returns the value of the '<em><b>Specifications</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.Specification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifications</em>' containment reference list.
	 * @see #isSetSpecifications()
	 * @see #unsetSpecifications()
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getReqIFContent_Specifications()
	 * @model containment="true" unsettable="true" ordered="false"
	 *        extendedMetaData="name='SPECIFICATIONS' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Specification> getSpecifications();

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.ReqIFContent#getSpecifications <em>Specifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecifications()
	 * @see #getSpecifications()
	 * @generated
	 */
	void unsetSpecifications();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.ReqIFContent#getSpecifications <em>Specifications</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Specifications</em>' containment reference list is set.
	 * @see #unsetSpecifications()
	 * @see #getSpecifications()
	 * @generated
	 */
	boolean isSetSpecifications();

	/**
	 * Returns the value of the '<em><b>Spec Relation Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.RelationGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Relation Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Relation Groups</em>' containment reference list.
	 * @see #isSetSpecRelationGroups()
	 * @see #unsetSpecRelationGroups()
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getReqIFContent_SpecRelationGroups()
	 * @model containment="true" unsettable="true" ordered="false"
	 *        extendedMetaData="name='SPEC-RELATION-GROUPS' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RelationGroup> getSpecRelationGroups();

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.ReqIFContent#getSpecRelationGroups <em>Spec Relation Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecRelationGroups()
	 * @see #getSpecRelationGroups()
	 * @generated
	 */
	void unsetSpecRelationGroups();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.ReqIFContent#getSpecRelationGroups <em>Spec Relation Groups</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Spec Relation Groups</em>' containment reference list is set.
	 * @see #unsetSpecRelationGroups()
	 * @see #getSpecRelationGroups()
	 * @generated
	 */
	boolean isSetSpecRelationGroups();

} // ReqIFContent
