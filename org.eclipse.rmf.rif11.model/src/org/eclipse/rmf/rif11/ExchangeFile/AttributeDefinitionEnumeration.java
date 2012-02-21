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
 * A representation of the model object '<em><b>Attribute Definition Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of a requirement attribute that is based on an "Enumeration" data type.
 * 
 * In principle, this element constitutes an attribute column that can contain enumeration values of a certain enumeration data type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionEnumeration#getMultiValued <em>Multi Valued</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionEnumeration#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionEnumeration#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getAttributeDefinitionEnumeration()
 * @model
 * @generated
 */
public interface AttributeDefinitionEnumeration extends AttributeDefinition {
	/**
	 * Returns the value of the '<em><b>Multi Valued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Valued</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Valued</em>' attribute.
	 * @see #setMultiValued(Boolean)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getAttributeDefinitionEnumeration_MultiValued()
	 * @model dataType="org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getMultiValued();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionEnumeration#getMultiValued <em>Multi Valued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Valued</em>' attribute.
	 * @see #getMultiValued()
	 * @generated
	 */
	void setMultiValued(Boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DatatypeDefinitionEnumeration)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getAttributeDefinitionEnumeration_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DatatypeDefinitionEnumeration getType();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionEnumeration#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DatatypeDefinitionEnumeration value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(AttributeValueEnumeration)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getAttributeDefinitionEnumeration_DefaultValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	AttributeValueEnumeration getDefaultValue();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionEnumeration#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(AttributeValueEnumeration value);

} // AttributeDefinitionEnumeration
