/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 *     Kay Münch       - vertical alignment of the spec objects id
 ******************************************************************************/

package org.eclipse.rmf.reqif10.pror.presentation.id;

import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.presentation.id.IdConfiguration#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.presentation.id.IdConfiguration#getCount <em>Count</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.presentation.id.IdConfiguration#getVerticalAlign <em>Vertical Align</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.pror.presentation.id.IdPackage#getIdConfiguration()
 * @model
 * @generated
 */
public interface IdConfiguration extends ProrPresentationConfiguration {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * The default value is <code>"REQ-"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see org.eclipse.rmf.reqif10.pror.presentation.id.IdPackage#getIdConfiguration_Prefix()
	 * @model default="REQ-" required="true"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.pror.presentation.id.IdConfiguration#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see org.eclipse.rmf.reqif10.pror.presentation.id.IdPackage#getIdConfiguration_Count()
	 * @model required="true"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.pror.presentation.id.IdConfiguration#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Returns the value of the '<em><b>Vertical Align</b></em>' attribute.
	 * The default value is <code>"Top"</code>.
	 * The literals are from the enumeration {@link org.eclipse.rmf.reqif10.pror.presentation.id.IdVerticalAlign}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Align</em>' attribute.
	 * @see org.eclipse.rmf.reqif10.pror.presentation.id.IdVerticalAlign
	 * @see #setVerticalAlign(IdVerticalAlign)
	 * @see org.eclipse.rmf.reqif10.pror.presentation.id.IdPackage#getIdConfiguration_VerticalAlign()
	 * @model default="Top"
	 * @generated
	 */
	IdVerticalAlign getVerticalAlign();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.pror.presentation.id.IdConfiguration#getVerticalAlign <em>Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Align</em>' attribute.
	 * @see org.eclipse.rmf.reqif10.pror.presentation.id.IdVerticalAlign
	 * @see #getVerticalAlign()
	 * @generated
	 */
	void setVerticalAlign(IdVerticalAlign value);

} // IdConfiguration
