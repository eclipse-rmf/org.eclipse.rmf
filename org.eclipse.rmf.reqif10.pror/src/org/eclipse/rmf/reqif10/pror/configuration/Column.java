/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.pror.configuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.configuration.Column#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.configuration.Column#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * The default value is <code>"<PLEASE SET LABEL>"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage#getColumn_Label()
	 * @model default="<PLEASE SET LABEL>" required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.Column#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage#getColumn_Width()
	 * @model default="100" required="true"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.Column#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

} // Column
