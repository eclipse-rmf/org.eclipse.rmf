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

package org.eclipse.rmf.reqif10;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.EnumValue#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.EnumValue#get_ <em></em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.Reqif10Package#getEnumValue()
 * @model
 * @generated
 */
public interface EnumValue extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.EmbeddedValue#getEnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(EmbeddedValue)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getEnumValue_Properties()
	 * @see org.eclipse.rmf.reqif10.EmbeddedValue#getEnumValue
	 * @model opposite="enumValue" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EmbeddedValue getProperties();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.EnumValue#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(EmbeddedValue value);

	/**
	 * Returns the value of the '<em><b></b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration#getSpecifiedValues <em>Specified Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em></em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em></em>' container reference.
	 * @see #set_(DatatypeDefinitionEnumeration)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getEnumValue__()
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration#getSpecifiedValues
	 * @model opposite="specifiedValues" required="true" transient="false" ordered="false"
	 * @generated
	 */
	DatatypeDefinitionEnumeration get_();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.EnumValue#get_ <em></em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em></em>' container reference.
	 * @see #get_()
	 * @generated
	 */
	void set_(DatatypeDefinitionEnumeration value);

} // EnumValue
