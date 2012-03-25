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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeValueEnumeration#getValues <em>Values</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeValueEnumeration#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getAttributeValueEnumeration()
 * @model extendedMetaData="name='ATTRIBUTE-VALUE-ENUMERATION' kind='elementOnly'"
 * @generated
 */
public interface AttributeValueEnumeration extends AttributeValue {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.EnumValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see #isSetValues()
	 * @see #unsetValues()
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getAttributeValueEnumeration_Values()
	 * @model unsettable="true" ordered="false"
	 *        extendedMetaData="name='VALUES' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EnumValue> getValues();

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueEnumeration#getValues <em>Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValues()
	 * @see #getValues()
	 * @generated
	 */
	void unsetValues();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueEnumeration#getValues <em>Values</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Values</em>' reference list is set.
	 * @see #unsetValues()
	 * @see #getValues()
	 * @generated
	 */
	boolean isSetValues();

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #isSetDefinition()
	 * @see #unsetDefinition()
	 * @see #setDefinition(AttributeDefinitionEnumeration)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getAttributeValueEnumeration_Definition()
	 * @model unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='DEFINITION' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributeDefinitionEnumeration getDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueEnumeration#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #isSetDefinition()
	 * @see #unsetDefinition()
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(AttributeDefinitionEnumeration value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueEnumeration#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefinition()
	 * @see #getDefinition()
	 * @see #setDefinition(AttributeDefinitionEnumeration)
	 * @generated
	 */
	void unsetDefinition();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueEnumeration#getDefinition <em>Definition</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Definition</em>' reference is set.
	 * @see #unsetDefinition()
	 * @see #getDefinition()
	 * @see #setDefinition(AttributeDefinitionEnumeration)
	 * @generated
	 */
	boolean isSetDefinition();

} // AttributeValueEnumeration
