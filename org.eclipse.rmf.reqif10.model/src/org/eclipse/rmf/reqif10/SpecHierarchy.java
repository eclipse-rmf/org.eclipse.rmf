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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.SpecHierarchy#getIsTableInternal <em>Is Table Internal</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.SpecHierarchy#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.SpecHierarchy#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.SpecHierarchy#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.SpecHierarchy#getEditableAtts <em>Editable Atts</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.SpecHierarchy#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.Reqif10Package#getSpecHierarchy()
 * @model
 * @generated
 */
public interface SpecHierarchy extends AccessControlledElement {
	/**
	 * Returns the value of the '<em><b>Is Table Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Table Internal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Table Internal</em>' attribute.
	 * @see #setIsTableInternal(Object)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getSpecHierarchy_IsTableInternal()
	 * @model ordered="false"
	 * @generated
	 */
	Object getIsTableInternal();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.SpecHierarchy#getIsTableInternal <em>Is Table Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Table Internal</em>' attribute.
	 * @see #getIsTableInternal()
	 * @generated
	 */
	void setIsTableInternal(Object value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(SpecObject)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getSpecHierarchy_Object()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SpecObject getObject();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.SpecHierarchy#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(SpecObject value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.SpecHierarchy#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(SpecHierarchy)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getSpecHierarchy_Parent()
	 * @see org.eclipse.rmf.reqif10.SpecHierarchy#getChildren
	 * @model opposite="children" transient="false" ordered="false"
	 * @generated
	 */
	SpecHierarchy getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.SpecHierarchy#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(SpecHierarchy value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.SpecHierarchy}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.SpecHierarchy#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getSpecHierarchy_Children()
	 * @see org.eclipse.rmf.reqif10.SpecHierarchy#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<SpecHierarchy> getChildren();

	/**
	 * Returns the value of the '<em><b>Editable Atts</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.AttributeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editable Atts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editable Atts</em>' reference list.
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getSpecHierarchy_EditableAtts()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AttributeDefinition> getEditableAtts();

	/**
	 * Returns the value of the '<em><b>Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.Specification#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' container reference.
	 * @see #setRoot(Specification)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getSpecHierarchy_Root()
	 * @see org.eclipse.rmf.reqif10.Specification#getChildren
	 * @model opposite="children" transient="false" ordered="false"
	 * @generated
	 */
	Specification getRoot();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.SpecHierarchy#getRoot <em>Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' container reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Specification value);

} // SpecHierarchy
