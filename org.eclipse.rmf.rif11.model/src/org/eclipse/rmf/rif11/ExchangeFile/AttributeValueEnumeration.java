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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains the concrete values of an "Enumeration" data type.
 * 
 * Note that in case of "multi value enumerations", a set of different enumeration values can be specified.
 * 
 * The value is thus indicated by multiple references ("values") to enumeration values that are contained in the associated enumeration data type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEnumeration#getValues <em>Values</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEnumeration#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getAttributeValueEnumeration()
 * @model
 * @generated
 */
public interface AttributeValueEnumeration extends AttributeValue {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.ExchangeFile.EnumValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getAttributeValueEnumeration_Values()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EnumValue> getValues();

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(AttributeDefinitionEnumeration)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getAttributeValueEnumeration_Definition()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AttributeDefinitionEnumeration getDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEnumeration#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(AttributeDefinitionEnumeration value);

} // AttributeValueEnumeration
