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

import java.math.BigInteger;

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
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getEmbeddedValue()
 * @model extendedMetaData="name='EMBEDDED-VALUE' kind='elementOnly'"
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
	 * @see #isSetKey()
	 * @see #unsetKey()
	 * @see #setKey(BigInteger)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getEmbeddedValue_Key()
	 * @model unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='KEY' kind='attribute'"
	 * @generated
	 */
	BigInteger getKey();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.EmbeddedValue#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #isSetKey()
	 * @see #unsetKey()
	 * @see #getKey()
	 * @generated
	 */
	void setKey(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.EmbeddedValue#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKey()
	 * @see #getKey()
	 * @see #setKey(BigInteger)
	 * @generated
	 */
	void unsetKey();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.EmbeddedValue#getKey <em>Key</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Key</em>' attribute is set.
	 * @see #unsetKey()
	 * @see #getKey()
	 * @see #setKey(BigInteger)
	 * @generated
	 */
	boolean isSetKey();

	/**
	 * Returns the value of the '<em><b>Other Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Content</em>' attribute.
	 * @see #isSetOtherContent()
	 * @see #unsetOtherContent()
	 * @see #setOtherContent(String)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getEmbeddedValue_OtherContent()
	 * @model unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='OTHER-CONTENT' kind='attribute'"
	 * @generated
	 */
	String getOtherContent();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.EmbeddedValue#getOtherContent <em>Other Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Content</em>' attribute.
	 * @see #isSetOtherContent()
	 * @see #unsetOtherContent()
	 * @see #getOtherContent()
	 * @generated
	 */
	void setOtherContent(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.EmbeddedValue#getOtherContent <em>Other Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOtherContent()
	 * @see #getOtherContent()
	 * @see #setOtherContent(String)
	 * @generated
	 */
	void unsetOtherContent();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.EmbeddedValue#getOtherContent <em>Other Content</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Other Content</em>' attribute is set.
	 * @see #unsetOtherContent()
	 * @see #getOtherContent()
	 * @see #setOtherContent(String)
	 * @generated
	 */
	boolean isSetOtherContent();

} // EmbeddedValue
