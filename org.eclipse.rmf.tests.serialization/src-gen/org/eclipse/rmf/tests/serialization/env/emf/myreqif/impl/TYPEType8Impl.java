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
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType8;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TYPE Type8</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType8Impl#getDATATYPEDEFINITIONDATEREF <em>DATATYPEDEFINITIONDATEREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TYPEType8Impl extends EObjectImpl implements TYPEType8 {
	/**
	 * The default value of the '{@link #getDATATYPEDEFINITIONDATEREF() <em>DATATYPEDEFINITIONDATEREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONDATEREF()
	 * @generated
	 * @ordered
	 */
	protected static final String DATATYPEDEFINITIONDATEREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDATATYPEDEFINITIONDATEREF() <em>DATATYPEDEFINITIONDATEREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONDATEREF()
	 * @generated
	 * @ordered
	 */
	protected String dATATYPEDEFINITIONDATEREF = DATATYPEDEFINITIONDATEREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TYPEType8Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.TYPE_TYPE8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDATATYPEDEFINITIONDATEREF() {
		return dATATYPEDEFINITIONDATEREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATATYPEDEFINITIONDATEREF(String newDATATYPEDEFINITIONDATEREF) {
		String oldDATATYPEDEFINITIONDATEREF = dATATYPEDEFINITIONDATEREF;
		dATATYPEDEFINITIONDATEREF = newDATATYPEDEFINITIONDATEREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.TYPE_TYPE8__DATATYPEDEFINITIONDATEREF, oldDATATYPEDEFINITIONDATEREF, dATATYPEDEFINITIONDATEREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyreqifPackage.TYPE_TYPE8__DATATYPEDEFINITIONDATEREF:
				return getDATATYPEDEFINITIONDATEREF();
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
			case MyreqifPackage.TYPE_TYPE8__DATATYPEDEFINITIONDATEREF:
				setDATATYPEDEFINITIONDATEREF((String)newValue);
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
			case MyreqifPackage.TYPE_TYPE8__DATATYPEDEFINITIONDATEREF:
				setDATATYPEDEFINITIONDATEREF(DATATYPEDEFINITIONDATEREF_EDEFAULT);
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
			case MyreqifPackage.TYPE_TYPE8__DATATYPEDEFINITIONDATEREF:
				return DATATYPEDEFINITIONDATEREF_EDEFAULT == null ? dATATYPEDEFINITIONDATEREF != null : !DATATYPEDEFINITIONDATEREF_EDEFAULT.equals(dATATYPEDEFINITIONDATEREF);
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
		result.append(" (dATATYPEDEFINITIONDATEREF: ");
		result.append(dATATYPEDEFINITIONDATEREF);
		result.append(')');
		return result.toString();
	}

} //TYPEType8Impl
