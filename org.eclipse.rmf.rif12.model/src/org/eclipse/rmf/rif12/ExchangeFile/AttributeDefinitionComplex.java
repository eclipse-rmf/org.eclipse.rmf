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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Definition Complex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.AttributeDefinitionComplex#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.AttributeDefinitionComplex#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getAttributeDefinitionComplex()
 * @model
 * @generated
 */
public interface AttributeDefinitionComplex extends AttributeDefinition {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DatatypeDefinitionComplex)
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getAttributeDefinitionComplex_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DatatypeDefinitionComplex getType();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.ExchangeFile.AttributeDefinitionComplex#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DatatypeDefinitionComplex value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(AttributeValueComplex)
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getAttributeDefinitionComplex_DefaultValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	AttributeValueComplex getDefaultValue();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.ExchangeFile.AttributeDefinitionComplex#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(AttributeValueComplex value);

} // AttributeDefinitionComplex
