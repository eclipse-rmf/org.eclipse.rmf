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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec Element With User Defined Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.SpecElementWithUserDefinedAttributes#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.SpecElementWithUserDefinedAttributes#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getSpecElementWithUserDefinedAttributes()
 * @model abstract="true"
 * @generated
 */
public interface SpecElementWithUserDefinedAttributes extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(SpecType)
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getSpecElementWithUserDefinedAttributes_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SpecType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.ExchangeFile.SpecElementWithUserDefinedAttributes#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(SpecType value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.ExchangeFile.AttributeValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getSpecElementWithUserDefinedAttributes_Values()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AttributeValue> getValues();

} // SpecElementWithUserDefinedAttributes
