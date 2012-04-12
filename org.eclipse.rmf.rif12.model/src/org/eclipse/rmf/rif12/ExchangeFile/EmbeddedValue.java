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
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.EmbeddedValue#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.EmbeddedValue#getOtherContent <em>Other Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getEmbeddedValue()
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
	 * @see #setKey(BigInteger)
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getEmbeddedValue_Key()
	 * @model dataType="org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.integer" required="true" ordered="false"
	 * @generated
	 */
	BigInteger getKey();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.ExchangeFile.EmbeddedValue#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Other Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Content</em>' attribute.
	 * @see #setOtherContent(String)
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getEmbeddedValue_OtherContent()
	 * @model dataType="org.eclipse.rmf.rif12.DataTypes.string" required="true" ordered="false"
	 * @generated
	 */
	String getOtherContent();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.ExchangeFile.EmbeddedValue#getOtherContent <em>Other Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Content</em>' attribute.
	 * @see #getOtherContent()
	 * @generated
	 */
	void setOtherContent(String value);

} // EmbeddedValue
