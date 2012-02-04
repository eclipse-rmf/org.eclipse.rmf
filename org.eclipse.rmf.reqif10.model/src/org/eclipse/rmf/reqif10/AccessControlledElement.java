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
 * A representation of the model object '<em><b>Access Controlled Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.AccessControlledElement#getIsEditable <em>Is Editable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.Reqif10Package#getAccessControlledElement()
 * @model abstract="true"
 * @generated
 */
public interface AccessControlledElement extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Is Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Editable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Editable</em>' attribute.
	 * @see #setIsEditable(Object)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getAccessControlledElement_IsEditable()
	 * @model ordered="false"
	 * @generated
	 */
	Object getIsEditable();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AccessControlledElement#getIsEditable <em>Is Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Editable</em>' attribute.
	 * @see #getIsEditable()
	 * @generated
	 */
	void setIsEditable(Object value);

} // AccessControlledElement
