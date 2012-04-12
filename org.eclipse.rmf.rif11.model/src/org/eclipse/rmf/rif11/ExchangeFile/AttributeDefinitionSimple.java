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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Definition Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of a requirement attribute that is based on a simple data type.
 * 
 * In principle, this element constitutes an attribute column that can contain values of one of the data types "Integer", "Boolean", "Real" or "String".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionSimple#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionSimple#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getAttributeDefinitionSimple()
 * @model
 * @generated
 */
public interface AttributeDefinitionSimple extends AttributeDefinition {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DatatypeDefinitionSimple)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getAttributeDefinitionSimple_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DatatypeDefinitionSimple getType();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionSimple#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DatatypeDefinitionSimple value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(AttributeValueSimple)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getAttributeDefinitionSimple_DefaultValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	AttributeValueSimple getDefaultValue();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionSimple#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(AttributeValueSimple value);

} // AttributeDefinitionSimple
