/*******************************************************************************
 * Copyright (c) 2011, 2013 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 *     Kay M??nch       - vertical alignment of the spec objects id
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
	 * @see #isSetPrefix()
	 * @see #unsetPrefix()
	 * @see #setPrefix(String)
	 * @see org.eclipse.rmf.reqif10.pror.presentation.id.IdPackage#getIdConfiguration_Prefix()
	 * @model default="REQ-" unsettable="true" required="true"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.pror.presentation.id.IdConfiguration#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #isSetPrefix()
	 * @see #unsetPrefix()
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.pror.presentation.id.IdConfiguration#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrefix()
	 * @see #getPrefix()
	 * @see #setPrefix(String)
	 * @generated
	 */
	void unsetPrefix();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.pror.presentation.id.IdConfiguration#getPrefix <em>Prefix</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Prefix</em>' attribute is set.
	 * @see #unsetPrefix()
	 * @see #getPrefix()
	 * @see #setPrefix(String)
	 * @generated
	 */
	boolean isSetPrefix();

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #isSetCount()
	 * @see #unsetCount()
	 * @see #setCount(int)
	 * @see org.eclipse.rmf.reqif10.pror.presentation.id.IdPackage#getIdConfiguration_Count()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.pror.presentation.id.IdConfiguration#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #isSetCount()
	 * @see #unsetCount()
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.pror.presentation.id.IdConfiguration#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCount()
	 * @see #getCount()
	 * @see #setCount(int)
	 * @generated
	 */
	void unsetCount();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.pror.presentation.id.IdConfiguration#getCount <em>Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Count</em>' attribute is set.
	 * @see #unsetCount()
	 * @see #getCount()
	 * @see #setCount(int)
	 * @generated
	 */
	boolean isSetCount();

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
	 * @see #isSetVerticalAlign()
	 * @see #unsetVerticalAlign()
	 * @see #setVerticalAlign(IdVerticalAlign)
	 * @see org.eclipse.rmf.reqif10.pror.presentation.id.IdPackage#getIdConfiguration_VerticalAlign()
	 * @model default="Top" unsettable="true"
	 * @generated
	 */
	IdVerticalAlign getVerticalAlign();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.pror.presentation.id.IdConfiguration#getVerticalAlign <em>Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Align</em>' attribute.
	 * @see org.eclipse.rmf.reqif10.pror.presentation.id.IdVerticalAlign
	 * @see #isSetVerticalAlign()
	 * @see #unsetVerticalAlign()
	 * @see #getVerticalAlign()
	 * @generated
	 */
	void setVerticalAlign(IdVerticalAlign value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.pror.presentation.id.IdConfiguration#getVerticalAlign <em>Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVerticalAlign()
	 * @see #getVerticalAlign()
	 * @see #setVerticalAlign(IdVerticalAlign)
	 * @generated
	 */
	void unsetVerticalAlign();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.pror.presentation.id.IdConfiguration#getVerticalAlign <em>Vertical Align</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vertical Align</em>' attribute is set.
	 * @see #unsetVerticalAlign()
	 * @see #getVerticalAlign()
	 * @see #setVerticalAlign(IdVerticalAlign)
	 * @generated
	 */
	boolean isSetVerticalAlign();

} // IdConfiguration
