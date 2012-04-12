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

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype Definition Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.DatatypeDefinitionInteger#getMax <em>Max</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.DatatypeDefinitionInteger#getMin <em>Min</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getDatatypeDefinitionInteger()
 * @model extendedMetaData="name='DATATYPE-DEFINITION-INTEGER' kind='elementOnly'"
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
	 * @see #isSetMax()
	 * @see #unsetMax()
	 * @see #setMax(BigInteger)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getDatatypeDefinitionInteger_Max()
	 * @model unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='MAX' kind='attribute'"
	 * @generated
	 */
	BigInteger getMax();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionInteger#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #isSetMax()
	 * @see #unsetMax()
	 * @see #getMax()
	 * @generated
	 */
	void setMax(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionInteger#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMax()
	 * @see #getMax()
	 * @see #setMax(BigInteger)
	 * @generated
	 */
	void unsetMax();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionInteger#getMax <em>Max</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max</em>' attribute is set.
	 * @see #unsetMax()
	 * @see #getMax()
	 * @see #setMax(BigInteger)
	 * @generated
	 */
	boolean isSetMax();

	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #isSetMin()
	 * @see #unsetMin()
	 * @see #setMin(BigInteger)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getDatatypeDefinitionInteger_Min()
	 * @model unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='MIN' kind='attribute'"
	 * @generated
	 */
	BigInteger getMin();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionInteger#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #isSetMin()
	 * @see #unsetMin()
	 * @see #getMin()
	 * @generated
	 */
	void setMin(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionInteger#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMin()
	 * @see #getMin()
	 * @see #setMin(BigInteger)
	 * @generated
	 */
	void unsetMin();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionInteger#getMin <em>Min</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min</em>' attribute is set.
	 * @see #unsetMin()
	 * @see #getMin()
	 * @see #setMin(BigInteger)
	 * @generated
	 */
	boolean isSetMin();

} // DatatypeDefinitionInteger
