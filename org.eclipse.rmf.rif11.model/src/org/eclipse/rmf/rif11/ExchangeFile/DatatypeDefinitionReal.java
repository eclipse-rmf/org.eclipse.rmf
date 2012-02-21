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
 * A representation of the model object '<em><b>Datatype Definition Real</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of the simple data type "Real".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionReal#getAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionReal#getMax <em>Max</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionReal#getMin <em>Min</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getDatatypeDefinitionReal()
 * @model
 * @generated
 */
public interface DatatypeDefinitionReal extends DatatypeDefinitionSimple {
	/**
	 * Returns the value of the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accuracy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accuracy</em>' attribute.
	 * @see #setAccuracy(BigInteger)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getDatatypeDefinitionReal_Accuracy()
	 * @model dataType="org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.Int" required="true" ordered="false"
	 * @generated
	 */
	BigInteger getAccuracy();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionReal#getAccuracy <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accuracy</em>' attribute.
	 * @see #getAccuracy()
	 * @generated
	 */
	void setAccuracy(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(Double)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getDatatypeDefinitionReal_Max()
	 * @model dataType="org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.Float" required="true" ordered="false"
	 * @generated
	 */
	Double getMax();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionReal#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(Double value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(Double)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getDatatypeDefinitionReal_Min()
	 * @model dataType="org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.Float" required="true" ordered="false"
	 * @generated
	 */
	Double getMin();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionReal#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(Double value);

} // DatatypeDefinitionReal
