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
 * A representation of the model object '<em><b>Datatype Definition Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of the simple data type "Integer".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionInteger#getMax <em>Max</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionInteger#getMin <em>Min</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getDatatypeDefinitionInteger()
 * @model
 * @generated
 */
public interface DatatypeDefinitionInteger extends DatatypeDefinitionSimple {
	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(BigInteger)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getDatatypeDefinitionInteger_Max()
	 * @model dataType="org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.Int" required="true" ordered="false"
	 * @generated
	 */
	BigInteger getMax();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionInteger#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(BigInteger)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getDatatypeDefinitionInteger_Min()
	 * @model dataType="org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.Int" required="true" ordered="false"
	 * @generated
	 */
	BigInteger getMin();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionInteger#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(BigInteger value);

} // DatatypeDefinitionInteger
