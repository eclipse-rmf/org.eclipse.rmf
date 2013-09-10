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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Controlled Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.AccessControlledElement#isEditable <em>Editable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getAccessControlledElement()
 * @model abstract="true"
 *        extendedMetaData="name='ACCESS-CONTROLLED-ELEMENT' kind='elementOnly'"
 * @generated
 */
public interface AccessControlledElement extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editable</em>' attribute.
	 * @see #isSetEditable()
	 * @see #unsetEditable()
	 * @see #setEditable(boolean)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getAccessControlledElement_Editable()
	 * @model unsettable="true" ordered="false"
	 *        extendedMetaData="name='IS-EDITABLE' kind='attribute'"
	 * @generated
	 */
	boolean isEditable();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AccessControlledElement#isEditable <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editable</em>' attribute.
	 * @see #isSetEditable()
	 * @see #unsetEditable()
	 * @see #isEditable()
	 * @generated
	 */
	void setEditable(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.AccessControlledElement#isEditable <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEditable()
	 * @see #isEditable()
	 * @see #setEditable(boolean)
	 * @generated
	 */
	void unsetEditable();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.AccessControlledElement#isEditable <em>Editable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Editable</em>' attribute is set.
	 * @see #unsetEditable()
	 * @see #isEditable()
	 * @see #setEditable(boolean)
	 * @generated
	 */
	boolean isSetEditable();

} // AccessControlledElement
