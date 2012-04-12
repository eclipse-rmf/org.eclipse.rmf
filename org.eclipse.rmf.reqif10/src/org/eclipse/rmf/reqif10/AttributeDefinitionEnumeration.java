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
 * A representation of the model object '<em><b>Attribute Definition Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration#isMultiValued <em>Multi Valued</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getAttributeDefinitionEnumeration()
 * @model extendedMetaData="name='ATTRIBUTE-DEFINITION-ENUMERATION' kind='elementOnly'"
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
	 * @see #isSetMultiValued()
	 * @see #unsetMultiValued()
	 * @see #setMultiValued(boolean)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getAttributeDefinitionEnumeration_MultiValued()
	 * @model unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='MULTI-VALUED' kind='attribute'"
	 * @generated
	 */
	boolean isMultiValued();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration#isMultiValued <em>Multi Valued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Valued</em>' attribute.
	 * @see #isSetMultiValued()
	 * @see #unsetMultiValued()
	 * @see #isMultiValued()
	 * @generated
	 */
	void setMultiValued(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration#isMultiValued <em>Multi Valued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMultiValued()
	 * @see #isMultiValued()
	 * @see #setMultiValued(boolean)
	 * @generated
	 */
	void unsetMultiValued();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration#isMultiValued <em>Multi Valued</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multi Valued</em>' attribute is set.
	 * @see #unsetMultiValued()
	 * @see #isMultiValued()
	 * @see #setMultiValued(boolean)
	 * @generated
	 */
	boolean isSetMultiValued();

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
	 * @see #setType(DatatypeDefinitionEnumeration)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getAttributeDefinitionEnumeration_Type()
	 * @model unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='TYPE' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	DatatypeDefinitionEnumeration getType();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(DatatypeDefinitionEnumeration value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(DatatypeDefinitionEnumeration)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration#getType <em>Type</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' reference is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(DatatypeDefinitionEnumeration)
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
	 * @see #setDefaultValue(AttributeValueEnumeration)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getAttributeDefinitionEnumeration_DefaultValue()
	 * @model containment="true" unsettable="true" ordered="false"
	 *        extendedMetaData="name='DEFAULT-VALUE' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributeValueEnumeration getDefaultValue();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #isSetDefaultValue()
	 * @see #unsetDefaultValue()
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(AttributeValueEnumeration value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultValue()
	 * @see #getDefaultValue()
	 * @see #setDefaultValue(AttributeValueEnumeration)
	 * @generated
	 */
	void unsetDefaultValue();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration#getDefaultValue <em>Default Value</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Value</em>' containment reference is set.
	 * @see #unsetDefaultValue()
	 * @see #getDefaultValue()
	 * @see #setDefaultValue(AttributeValueEnumeration)
	 * @generated
	 */
	boolean isSetDefaultValue();

} // AttributeDefinitionEnumeration
