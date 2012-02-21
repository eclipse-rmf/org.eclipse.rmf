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

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype Definition String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of the simple data type "String".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionString#getMaxLength <em>Max Length</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getDatatypeDefinitionString()
 * @model
 * @generated
 */
public interface DatatypeDefinitionString extends DatatypeDefinitionSimple {
	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(BigInteger)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getDatatypeDefinitionString_MaxLength()
	 * @model dataType="org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.Int" required="true" ordered="false"
	 * @generated
	 */
	BigInteger getMaxLength();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionString#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(BigInteger value);

} // DatatypeDefinitionString
