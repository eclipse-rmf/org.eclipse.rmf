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
 * A representation of the model object '<em><b>Attribute Value Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.AttributeValueSimple#getTheValue <em>The Value</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.AttributeValueSimple#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getAttributeValueSimple()
 * @model
 * @generated
 */
public interface AttributeValueSimple extends AttributeValue {
	/**
	 * Returns the value of the '<em><b>The Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Value</em>' attribute.
	 * @see #setTheValue(String)
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getAttributeValueSimple_TheValue()
	 * @model dataType="org.eclipse.rmf.rif12.DataTypes.string" required="true" ordered="false"
	 * @generated
	 */
	String getTheValue();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.ExchangeFile.AttributeValueSimple#getTheValue <em>The Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Value</em>' attribute.
	 * @see #getTheValue()
	 * @generated
	 */
	void setTheValue(String value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(AttributeDefinitionSimple)
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getAttributeValueSimple_Definition()
	 * @model required="true"
	 * @generated
	 */
	AttributeDefinitionSimple getDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.ExchangeFile.AttributeValueSimple#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(AttributeDefinitionSimple value);

} // AttributeValueSimple
