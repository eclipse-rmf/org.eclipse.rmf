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

package org.eclipse.rmf.reqif10.impl;

import org.eclipse.rmf.reqif10.AccessControlledElement;
import org.eclipse.rmf.reqif10.Reqif10Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Controlled Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.AccessControlledElementImpl#getIsEditable <em>Is Editable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AccessControlledElementImpl extends IdentifiableImpl implements AccessControlledElement {
	/**
	 * The default value of the '{@link #getIsEditable() <em>Is Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsEditable()
	 * @generated
	 * @ordered
	 */
	protected static final Object IS_EDITABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsEditable() <em>Is Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsEditable()
	 * @generated
	 * @ordered
	 */
	protected Object isEditable = IS_EDITABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessControlledElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Reqif10Package.Literals.ACCESS_CONTROLLED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getIsEditable() {
		return isEditable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEditable(Object newIsEditable) {
		Object oldIsEditable = isEditable;
		isEditable = newIsEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.ACCESS_CONTROLLED_ELEMENT__IS_EDITABLE, oldIsEditable, isEditable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Reqif10Package.ACCESS_CONTROLLED_ELEMENT__IS_EDITABLE:
				return getIsEditable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Reqif10Package.ACCESS_CONTROLLED_ELEMENT__IS_EDITABLE:
				setIsEditable(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Reqif10Package.ACCESS_CONTROLLED_ELEMENT__IS_EDITABLE:
				setIsEditable(IS_EDITABLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Reqif10Package.ACCESS_CONTROLLED_ELEMENT__IS_EDITABLE:
				return IS_EDITABLE_EDEFAULT == null ? isEditable != null : !IS_EDITABLE_EDEFAULT.equals(isEditable);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isEditable: ");
		result.append(isEditable);
		result.append(')');
		return result.toString();
	}

} //AccessControlledElementImpl
