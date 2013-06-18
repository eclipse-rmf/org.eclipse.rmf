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

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType6;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEFINITION Type6</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType6Impl#getATTRIBUTEDEFINITIONBOOLEANREF <em>ATTRIBUTEDEFINITIONBOOLEANREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEFINITIONType6Impl extends EObjectImpl implements DEFINITIONType6 {
	/**
	 * The default value of the '{@link #getATTRIBUTEDEFINITIONBOOLEANREF() <em>ATTRIBUTEDEFINITIONBOOLEANREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEDEFINITIONBOOLEANREF()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTEDEFINITIONBOOLEANREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getATTRIBUTEDEFINITIONBOOLEANREF() <em>ATTRIBUTEDEFINITIONBOOLEANREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEDEFINITIONBOOLEANREF()
	 * @generated
	 * @ordered
	 */
	protected String aTTRIBUTEDEFINITIONBOOLEANREF = ATTRIBUTEDEFINITIONBOOLEANREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DEFINITIONType6Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.DEFINITION_TYPE6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getATTRIBUTEDEFINITIONBOOLEANREF() {
		return aTTRIBUTEDEFINITIONBOOLEANREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEDEFINITIONBOOLEANREF(String newATTRIBUTEDEFINITIONBOOLEANREF) {
		String oldATTRIBUTEDEFINITIONBOOLEANREF = aTTRIBUTEDEFINITIONBOOLEANREF;
		aTTRIBUTEDEFINITIONBOOLEANREF = newATTRIBUTEDEFINITIONBOOLEANREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.DEFINITION_TYPE6__ATTRIBUTEDEFINITIONBOOLEANREF, oldATTRIBUTEDEFINITIONBOOLEANREF, aTTRIBUTEDEFINITIONBOOLEANREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyreqifPackage.DEFINITION_TYPE6__ATTRIBUTEDEFINITIONBOOLEANREF:
				return getATTRIBUTEDEFINITIONBOOLEANREF();
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
			case MyreqifPackage.DEFINITION_TYPE6__ATTRIBUTEDEFINITIONBOOLEANREF:
				setATTRIBUTEDEFINITIONBOOLEANREF((String)newValue);
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
			case MyreqifPackage.DEFINITION_TYPE6__ATTRIBUTEDEFINITIONBOOLEANREF:
				setATTRIBUTEDEFINITIONBOOLEANREF(ATTRIBUTEDEFINITIONBOOLEANREF_EDEFAULT);
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
			case MyreqifPackage.DEFINITION_TYPE6__ATTRIBUTEDEFINITIONBOOLEANREF:
				return ATTRIBUTEDEFINITIONBOOLEANREF_EDEFAULT == null ? aTTRIBUTEDEFINITIONBOOLEANREF != null : !ATTRIBUTEDEFINITIONBOOLEANREF_EDEFAULT.equals(aTTRIBUTEDEFINITIONBOOLEANREF);
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
		result.append(" (aTTRIBUTEDEFINITIONBOOLEANREF: ");
		result.append(aTTRIBUTEDEFINITIONBOOLEANREF);
		result.append(')');
		return result.toString();
	}

} //DEFINITIONType6Impl
