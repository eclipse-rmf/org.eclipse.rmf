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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.SpecHierarchy#isTableInternal <em>Table Internal</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.SpecHierarchy#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.SpecHierarchy#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.SpecHierarchy#getEditableAtts <em>Editable Atts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getSpecHierarchy()
 * @model extendedMetaData="name='SPEC-HIERARCHY' kind='elementOnly'"
 * @generated
 */
public interface SpecHierarchy extends AccessControlledElement {
	/**
	 * Returns the value of the '<em><b>Table Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Internal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Internal</em>' attribute.
	 * @see #isSetTableInternal()
	 * @see #unsetTableInternal()
	 * @see #setTableInternal(boolean)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getSpecHierarchy_TableInternal()
	 * @model unsettable="true" ordered="false"
	 *        extendedMetaData="name='IS-TABLE-INTERNAL' kind='attribute'"
	 * @generated
	 */
	boolean isTableInternal();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.SpecHierarchy#isTableInternal <em>Table Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Internal</em>' attribute.
	 * @see #isSetTableInternal()
	 * @see #unsetTableInternal()
	 * @see #isTableInternal()
	 * @generated
	 */
	void setTableInternal(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.SpecHierarchy#isTableInternal <em>Table Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTableInternal()
	 * @see #isTableInternal()
	 * @see #setTableInternal(boolean)
	 * @generated
	 */
	void unsetTableInternal();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.SpecHierarchy#isTableInternal <em>Table Internal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Table Internal</em>' attribute is set.
	 * @see #unsetTableInternal()
	 * @see #isTableInternal()
	 * @see #setTableInternal(boolean)
	 * @generated
	 */
	boolean isSetTableInternal();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #isSetObject()
	 * @see #unsetObject()
	 * @see #setObject(SpecObject)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getSpecHierarchy_Object()
	 * @model unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='OBJECT' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecObject getObject();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.SpecHierarchy#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #isSetObject()
	 * @see #unsetObject()
	 * @see #getObject()
	 * @generated
	 */
	void setObject(SpecObject value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.SpecHierarchy#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetObject()
	 * @see #getObject()
	 * @see #setObject(SpecObject)
	 * @generated
	 */
	void unsetObject();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.SpecHierarchy#getObject <em>Object</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Object</em>' reference is set.
	 * @see #unsetObject()
	 * @see #getObject()
	 * @see #setObject(SpecObject)
	 * @generated
	 */
	boolean isSetObject();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.SpecHierarchy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see #isSetChildren()
	 * @see #unsetChildren()
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getSpecHierarchy_Children()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="name='CHILDREN' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SpecHierarchy> getChildren();

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.SpecHierarchy#getChildren <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChildren()
	 * @see #getChildren()
	 * @generated
	 */
	void unsetChildren();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.SpecHierarchy#getChildren <em>Children</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Children</em>' containment reference list is set.
	 * @see #unsetChildren()
	 * @see #getChildren()
	 * @generated
	 */
	boolean isSetChildren();

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
	 * @see #isSetEditableAtts()
	 * @see #unsetEditableAtts()
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getSpecHierarchy_EditableAtts()
	 * @model unsettable="true" ordered="false"
	 *        extendedMetaData="name='EDITABLE-ATTS' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AttributeDefinition> getEditableAtts();

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.SpecHierarchy#getEditableAtts <em>Editable Atts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEditableAtts()
	 * @see #getEditableAtts()
	 * @generated
	 */
	void unsetEditableAtts();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.SpecHierarchy#getEditableAtts <em>Editable Atts</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Editable Atts</em>' reference list is set.
	 * @see #unsetEditableAtts()
	 * @see #getEditableAtts()
	 * @generated
	 */
	boolean isSetEditableAtts();

} // SpecHierarchy
