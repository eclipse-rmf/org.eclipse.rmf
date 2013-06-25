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
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType10;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TYPE Type10</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType10Impl#getDATATYPEDEFINITIONBOOLEANREF <em>DATATYPEDEFINITIONBOOLEANREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TYPEType10Impl extends EObjectImpl implements TYPEType10 {
	/**
	 * The default value of the '{@link #getDATATYPEDEFINITIONBOOLEANREF() <em>DATATYPEDEFINITIONBOOLEANREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONBOOLEANREF()
	 * @generated
	 * @ordered
	 */
	protected static final String DATATYPEDEFINITIONBOOLEANREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDATATYPEDEFINITIONBOOLEANREF() <em>DATATYPEDEFINITIONBOOLEANREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONBOOLEANREF()
	 * @generated
	 * @ordered
	 */
	protected String dATATYPEDEFINITIONBOOLEANREF = DATATYPEDEFINITIONBOOLEANREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TYPEType10Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.TYPE_TYPE10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDATATYPEDEFINITIONBOOLEANREF() {
		return dATATYPEDEFINITIONBOOLEANREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATATYPEDEFINITIONBOOLEANREF(String newDATATYPEDEFINITIONBOOLEANREF) {
		String oldDATATYPEDEFINITIONBOOLEANREF = dATATYPEDEFINITIONBOOLEANREF;
		dATATYPEDEFINITIONBOOLEANREF = newDATATYPEDEFINITIONBOOLEANREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.TYPE_TYPE10__DATATYPEDEFINITIONBOOLEANREF, oldDATATYPEDEFINITIONBOOLEANREF, dATATYPEDEFINITIONBOOLEANREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyreqifPackage.TYPE_TYPE10__DATATYPEDEFINITIONBOOLEANREF:
				return getDATATYPEDEFINITIONBOOLEANREF();
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
			case MyreqifPackage.TYPE_TYPE10__DATATYPEDEFINITIONBOOLEANREF:
				setDATATYPEDEFINITIONBOOLEANREF((String)newValue);
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
			case MyreqifPackage.TYPE_TYPE10__DATATYPEDEFINITIONBOOLEANREF:
				setDATATYPEDEFINITIONBOOLEANREF(DATATYPEDEFINITIONBOOLEANREF_EDEFAULT);
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
			case MyreqifPackage.TYPE_TYPE10__DATATYPEDEFINITIONBOOLEANREF:
				return DATATYPEDEFINITIONBOOLEANREF_EDEFAULT == null ? dATATYPEDEFINITIONBOOLEANREF != null : !DATATYPEDEFINITIONBOOLEANREF_EDEFAULT.equals(dATATYPEDEFINITIONBOOLEANREF);
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
		result.append(" (dATATYPEDEFINITIONBOOLEANREF: ");
		result.append(dATATYPEDEFINITIONBOOLEANREF);
		result.append(')');
		return result.toString();
	}

} //TYPEType10Impl
