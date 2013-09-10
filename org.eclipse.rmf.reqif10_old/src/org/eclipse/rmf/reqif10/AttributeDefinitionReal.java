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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Definition Real</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeDefinitionReal#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeDefinitionReal#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getAttributeDefinitionReal()
 * @model extendedMetaData="name='ATTRIBUTE-DEFINITION-REAL' kind='elementOnly'"
 * @generated
 */
public interface AttributeDefinitionReal extends AttributeDefinitionSimple {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(DatatypeDefinitionReal)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getAttributeDefinitionReal_Type()
	 * @model unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='TYPE' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	DatatypeDefinitionReal getType();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionReal#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(DatatypeDefinitionReal value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionReal#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(DatatypeDefinitionReal)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionReal#getType <em>Type</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' reference is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(DatatypeDefinitionReal)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #isSetDefaultValue()
	 * @see #unsetDefaultValue()
	 * @see #setDefaultValue(AttributeValueReal)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getAttributeDefinitionReal_DefaultValue()
	 * @model containment="true" unsettable="true" ordered="false"
	 *        extendedMetaData="name='DEFAULT-VALUE' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributeValueReal getDefaultValue();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionReal#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #isSetDefaultValue()
	 * @see #unsetDefaultValue()
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(AttributeValueReal value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionReal#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultValue()
	 * @see #getDefaultValue()
	 * @see #setDefaultValue(AttributeValueReal)
	 * @generated
	 */
	void unsetDefaultValue();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionReal#getDefaultValue <em>Default Value</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Value</em>' containment reference is set.
	 * @see #unsetDefaultValue()
	 * @see #getDefaultValue()
	 * @see #setDefaultValue(AttributeValueReal)
	 * @generated
	 */
	boolean isSetDefaultValue();

} // AttributeDefinitionReal
