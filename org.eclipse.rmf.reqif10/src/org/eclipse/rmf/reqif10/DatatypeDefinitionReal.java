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
 * A representation of the model object '<em><b>Datatype Definition Real</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.DatatypeDefinitionReal#getAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.DatatypeDefinitionReal#getMax <em>Max</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.DatatypeDefinitionReal#getMin <em>Min</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getDatatypeDefinitionReal()
 * @model extendedMetaData="name='DATATYPE-DEFINITION-REAL' kind='elementOnly'"
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
	 * @see #isSetAccuracy()
	 * @see #unsetAccuracy()
	 * @see #setAccuracy(BigInteger)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getDatatypeDefinitionReal_Accuracy()
	 * @model unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='ACCURACY' kind='attribute'"
	 * @generated
	 */
	BigInteger getAccuracy();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionReal#getAccuracy <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accuracy</em>' attribute.
	 * @see #isSetAccuracy()
	 * @see #unsetAccuracy()
	 * @see #getAccuracy()
	 * @generated
	 */
	void setAccuracy(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionReal#getAccuracy <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAccuracy()
	 * @see #getAccuracy()
	 * @see #setAccuracy(BigInteger)
	 * @generated
	 */
	void unsetAccuracy();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionReal#getAccuracy <em>Accuracy</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Accuracy</em>' attribute is set.
	 * @see #unsetAccuracy()
	 * @see #getAccuracy()
	 * @see #setAccuracy(BigInteger)
	 * @generated
	 */
	boolean isSetAccuracy();

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
	 * @see #setMax(double)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getDatatypeDefinitionReal_Max()
	 * @model unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='MAX' kind='attribute'"
	 * @generated
	 */
	double getMax();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionReal#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #isSetMax()
	 * @see #unsetMax()
	 * @see #getMax()
	 * @generated
	 */
	void setMax(double value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionReal#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMax()
	 * @see #getMax()
	 * @see #setMax(double)
	 * @generated
	 */
	void unsetMax();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionReal#getMax <em>Max</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max</em>' attribute is set.
	 * @see #unsetMax()
	 * @see #getMax()
	 * @see #setMax(double)
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
	 * @see #setMin(double)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getDatatypeDefinitionReal_Min()
	 * @model unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='MIN' kind='attribute'"
	 * @generated
	 */
	double getMin();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionReal#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #isSetMin()
	 * @see #unsetMin()
	 * @see #getMin()
	 * @generated
	 */
	void setMin(double value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionReal#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMin()
	 * @see #getMin()
	 * @see #setMin(double)
	 * @generated
	 */
	void unsetMin();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionReal#getMin <em>Min</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min</em>' attribute is set.
	 * @see #unsetMin()
	 * @see #getMin()
	 * @see #setMin(double)
	 * @generated
	 */
	boolean isSetMin();

} // DatatypeDefinitionReal
