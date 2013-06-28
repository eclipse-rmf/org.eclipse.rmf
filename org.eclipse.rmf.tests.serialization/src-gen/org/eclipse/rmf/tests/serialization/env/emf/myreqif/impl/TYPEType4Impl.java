/**
 * Copyright (c) 2013 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    itemis AG - initial API and implementation
 * 
 */
package org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType4;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TYPE Type4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType4Impl#getDATATYPEDEFINITIONREALREF <em>DATATYPEDEFINITIONREALREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TYPEType4Impl extends EObjectImpl implements TYPEType4 {
	/**
	 * The default value of the '{@link #getDATATYPEDEFINITIONREALREF() <em>DATATYPEDEFINITIONREALREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONREALREF()
	 * @generated
	 * @ordered
	 */
	protected static final String DATATYPEDEFINITIONREALREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDATATYPEDEFINITIONREALREF() <em>DATATYPEDEFINITIONREALREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONREALREF()
	 * @generated
	 * @ordered
	 */
	protected String dATATYPEDEFINITIONREALREF = DATATYPEDEFINITIONREALREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TYPEType4Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.TYPE_TYPE4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDATATYPEDEFINITIONREALREF() {
		return dATATYPEDEFINITIONREALREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATATYPEDEFINITIONREALREF(String newDATATYPEDEFINITIONREALREF) {
		String oldDATATYPEDEFINITIONREALREF = dATATYPEDEFINITIONREALREF;
		dATATYPEDEFINITIONREALREF = newDATATYPEDEFINITIONREALREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.TYPE_TYPE4__DATATYPEDEFINITIONREALREF, oldDATATYPEDEFINITIONREALREF, dATATYPEDEFINITIONREALREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyreqifPackage.TYPE_TYPE4__DATATYPEDEFINITIONREALREF:
				return getDATATYPEDEFINITIONREALREF();
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
			case MyreqifPackage.TYPE_TYPE4__DATATYPEDEFINITIONREALREF:
				setDATATYPEDEFINITIONREALREF((String)newValue);
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
			case MyreqifPackage.TYPE_TYPE4__DATATYPEDEFINITIONREALREF:
				setDATATYPEDEFINITIONREALREF(DATATYPEDEFINITIONREALREF_EDEFAULT);
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
			case MyreqifPackage.TYPE_TYPE4__DATATYPEDEFINITIONREALREF:
				return DATATYPEDEFINITIONREALREF_EDEFAULT == null ? dATATYPEDEFINITIONREALREF != null : !DATATYPEDEFINITIONREALREF_EDEFAULT.equals(dATATYPEDEFINITIONREALREF);
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
		result.append(" (dATATYPEDEFINITIONREALREF: ");
		result.append(dATATYPEDEFINITIONREALREF);
		result.append(')');
		return result.toString();
	}

} //TYPEType4Impl
