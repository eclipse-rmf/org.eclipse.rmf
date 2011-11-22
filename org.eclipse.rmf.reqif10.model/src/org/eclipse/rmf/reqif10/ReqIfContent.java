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

package org.eclipse.rmf.reqif10;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIfContent#getDocumentRoot <em>Document Root</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIfContent#getSpecObjects <em>Spec Objects</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIfContent#getSpecifications <em>Specifications</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIfContent#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIfContent#getSpecRelations <em>Spec Relations</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIfContent#getSpecRelationGroups <em>Spec Relation Groups</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIfContent#getSpecTypes <em>Spec Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.Reqif10Package#getReqIfContent()
 * @model
 * @generated
 */
public interface ReqIfContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Document Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.ReqIf#getCoreContent <em>Core Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Root</em>' container reference.
	 * @see #setDocumentRoot(ReqIf)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getReqIfContent_DocumentRoot()
	 * @see org.eclipse.rmf.reqif10.ReqIf#getCoreContent
	 * @model opposite="coreContent" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ReqIf getDocumentRoot();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.ReqIfContent#getDocumentRoot <em>Document Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Root</em>' container reference.
	 * @see #getDocumentRoot()
	 * @generated
	 */
	void setDocumentRoot(ReqIf value);

	/**
	 * Returns the value of the '<em><b>Spec Objects</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.SpecObject}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.SpecObject#getCoreContent <em>Core Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Objects</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getReqIfContent_SpecObjects()
	 * @see org.eclipse.rmf.reqif10.SpecObject#getCoreContent
	 * @model opposite="coreContent" containment="true" ordered="false"
	 * @generated
	 */
	EList<SpecObject> getSpecObjects();

	/**
	 * Returns the value of the '<em><b>Specifications</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.Specification}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.Specification#getCoreContent <em>Core Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifications</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getReqIfContent_Specifications()
	 * @see org.eclipse.rmf.reqif10.Specification#getCoreContent
	 * @model opposite="coreContent" containment="true" ordered="false"
	 * @generated
	 */
	EList<Specification> getSpecifications();

	/**
	 * Returns the value of the '<em><b>Datatypes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.DatatypeDefinition}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.DatatypeDefinition#getCoreContent <em>Core Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatypes</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getReqIfContent_Datatypes()
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinition#getCoreContent
	 * @model opposite="coreContent" containment="true" ordered="false"
	 * @generated
	 */
	EList<DatatypeDefinition> getDatatypes();

	/**
	 * Returns the value of the '<em><b>Spec Relations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.SpecRelation}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.SpecRelation#getCoreContent <em>Core Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Relations</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getReqIfContent_SpecRelations()
	 * @see org.eclipse.rmf.reqif10.SpecRelation#getCoreContent
	 * @model opposite="coreContent" containment="true" ordered="false"
	 * @generated
	 */
	EList<SpecRelation> getSpecRelations();

	/**
	 * Returns the value of the '<em><b>Spec Relation Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.RelationGroup}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.RelationGroup#getCoreContent <em>Core Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Relation Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Relation Groups</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getReqIfContent_SpecRelationGroups()
	 * @see org.eclipse.rmf.reqif10.RelationGroup#getCoreContent
	 * @model opposite="coreContent" containment="true" ordered="false"
	 * @generated
	 */
	EList<RelationGroup> getSpecRelationGroups();

	/**
	 * Returns the value of the '<em><b>Spec Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.SpecType}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.SpecType#getCoreContent <em>Core Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Types</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getReqIfContent_SpecTypes()
	 * @see org.eclipse.rmf.reqif10.SpecType#getCoreContent
	 * @model opposite="coreContent" containment="true" ordered="false"
	 * @generated
	 */
	EList<SpecType> getSpecTypes();

} // ReqIfContent
