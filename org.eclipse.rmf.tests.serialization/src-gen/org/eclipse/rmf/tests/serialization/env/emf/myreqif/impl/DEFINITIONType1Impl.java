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

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType1;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEFINITION Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType1Impl#getATTRIBUTEDEFINITIONDATEREF <em>ATTRIBUTEDEFINITIONDATEREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEFINITIONType1Impl extends EObjectImpl implements DEFINITIONType1 {
	/**
	 * The default value of the '{@link #getATTRIBUTEDEFINITIONDATEREF() <em>ATTRIBUTEDEFINITIONDATEREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEDEFINITIONDATEREF()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTEDEFINITIONDATEREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getATTRIBUTEDEFINITIONDATEREF() <em>ATTRIBUTEDEFINITIONDATEREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEDEFINITIONDATEREF()
	 * @generated
	 * @ordered
	 */
	protected String aTTRIBUTEDEFINITIONDATEREF = ATTRIBUTEDEFINITIONDATEREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DEFINITIONType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.DEFINITION_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getATTRIBUTEDEFINITIONDATEREF() {
		return aTTRIBUTEDEFINITIONDATEREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEDEFINITIONDATEREF(String newATTRIBUTEDEFINITIONDATEREF) {
		String oldATTRIBUTEDEFINITIONDATEREF = aTTRIBUTEDEFINITIONDATEREF;
		aTTRIBUTEDEFINITIONDATEREF = newATTRIBUTEDEFINITIONDATEREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.DEFINITION_TYPE1__ATTRIBUTEDEFINITIONDATEREF, oldATTRIBUTEDEFINITIONDATEREF, aTTRIBUTEDEFINITIONDATEREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyreqifPackage.DEFINITION_TYPE1__ATTRIBUTEDEFINITIONDATEREF:
				return getATTRIBUTEDEFINITIONDATEREF();
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
			case MyreqifPackage.DEFINITION_TYPE1__ATTRIBUTEDEFINITIONDATEREF:
				setATTRIBUTEDEFINITIONDATEREF((String)newValue);
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
			case MyreqifPackage.DEFINITION_TYPE1__ATTRIBUTEDEFINITIONDATEREF:
				setATTRIBUTEDEFINITIONDATEREF(ATTRIBUTEDEFINITIONDATEREF_EDEFAULT);
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
			case MyreqifPackage.DEFINITION_TYPE1__ATTRIBUTEDEFINITIONDATEREF:
				return ATTRIBUTEDEFINITIONDATEREF_EDEFAULT == null ? aTTRIBUTEDEFINITIONDATEREF != null : !ATTRIBUTEDEFINITIONDATEREF_EDEFAULT.equals(aTTRIBUTEDEFINITIONDATEREF);
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
		result.append(" (aTTRIBUTEDEFINITIONDATEREF: ");
		result.append(aTTRIBUTEDEFINITIONDATEREF);
		result.append(')');
		return result.toString();
	}

} //DEFINITIONType1Impl
