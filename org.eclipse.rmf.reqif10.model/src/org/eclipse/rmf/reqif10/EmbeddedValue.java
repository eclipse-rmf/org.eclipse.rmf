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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Embedded Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.EmbeddedValue#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.EmbeddedValue#getOtherContent <em>Other Content</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.EmbeddedValue#getEnumValue <em>Enum Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.Reqif10Package#getEmbeddedValue()
 * @model
 * @generated
 */
public interface EmbeddedValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(Object)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getEmbeddedValue_Key()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getKey();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.EmbeddedValue#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(Object value);

	/**
	 * Returns the value of the '<em><b>Other Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Content</em>' attribute.
	 * @see #setOtherContent(Object)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getEmbeddedValue_OtherContent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getOtherContent();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.EmbeddedValue#getOtherContent <em>Other Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Content</em>' attribute.
	 * @see #getOtherContent()
	 * @generated
	 */
	void setOtherContent(Object value);

	/**
	 * Returns the value of the '<em><b>Enum Value</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.EnumValue#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Value</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Value</em>' container reference.
	 * @see #setEnumValue(EnumValue)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getEmbeddedValue_EnumValue()
	 * @see org.eclipse.rmf.reqif10.EnumValue#getProperties
	 * @model opposite="properties" required="true" transient="false" ordered="false"
	 * @generated
	 */
	EnumValue getEnumValue();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.EmbeddedValue#getEnumValue <em>Enum Value</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Value</em>' container reference.
	 * @see #getEnumValue()
	 * @generated
	 */
	void setEnumValue(EnumValue value);

} // EmbeddedValue
