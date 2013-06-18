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
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType9;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TYPE Type9</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType9Impl#getDATATYPEDEFINITIONENUMERATIONREF <em>DATATYPEDEFINITIONENUMERATIONREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TYPEType9Impl extends EObjectImpl implements TYPEType9 {
	/**
	 * The default value of the '{@link #getDATATYPEDEFINITIONENUMERATIONREF() <em>DATATYPEDEFINITIONENUMERATIONREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONENUMERATIONREF()
	 * @generated
	 * @ordered
	 */
	protected static final String DATATYPEDEFINITIONENUMERATIONREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDATATYPEDEFINITIONENUMERATIONREF() <em>DATATYPEDEFINITIONENUMERATIONREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONENUMERATIONREF()
	 * @generated
	 * @ordered
	 */
	protected String dATATYPEDEFINITIONENUMERATIONREF = DATATYPEDEFINITIONENUMERATIONREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TYPEType9Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.TYPE_TYPE9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDATATYPEDEFINITIONENUMERATIONREF() {
		return dATATYPEDEFINITIONENUMERATIONREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATATYPEDEFINITIONENUMERATIONREF(String newDATATYPEDEFINITIONENUMERATIONREF) {
		String oldDATATYPEDEFINITIONENUMERATIONREF = dATATYPEDEFINITIONENUMERATIONREF;
		dATATYPEDEFINITIONENUMERATIONREF = newDATATYPEDEFINITIONENUMERATIONREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.TYPE_TYPE9__DATATYPEDEFINITIONENUMERATIONREF, oldDATATYPEDEFINITIONENUMERATIONREF, dATATYPEDEFINITIONENUMERATIONREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyreqifPackage.TYPE_TYPE9__DATATYPEDEFINITIONENUMERATIONREF:
				return getDATATYPEDEFINITIONENUMERATIONREF();
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
			case MyreqifPackage.TYPE_TYPE9__DATATYPEDEFINITIONENUMERATIONREF:
				setDATATYPEDEFINITIONENUMERATIONREF((String)newValue);
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
			case MyreqifPackage.TYPE_TYPE9__DATATYPEDEFINITIONENUMERATIONREF:
				setDATATYPEDEFINITIONENUMERATIONREF(DATATYPEDEFINITIONENUMERATIONREF_EDEFAULT);
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
			case MyreqifPackage.TYPE_TYPE9__DATATYPEDEFINITIONENUMERATIONREF:
				return DATATYPEDEFINITIONENUMERATIONREF_EDEFAULT == null ? dATATYPEDEFINITIONENUMERATIONREF != null : !DATATYPEDEFINITIONENUMERATIONREF_EDEFAULT.equals(dATATYPEDEFINITIONENUMERATIONREF);
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
		result.append(" (dATATYPEDEFINITIONENUMERATIONREF: ");
		result.append(dATATYPEDEFINITIONENUMERATIONREF);
		result.append(')');
		return result.toString();
	}

} //TYPEType9Impl
