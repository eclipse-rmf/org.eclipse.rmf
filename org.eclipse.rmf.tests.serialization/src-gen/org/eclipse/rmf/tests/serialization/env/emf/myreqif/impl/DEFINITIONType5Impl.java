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

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType5;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEFINITION Type5</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType5Impl#getATTRIBUTEDEFINITIONINTEGERREF <em>ATTRIBUTEDEFINITIONINTEGERREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEFINITIONType5Impl extends EObjectImpl implements DEFINITIONType5 {
	/**
	 * The default value of the '{@link #getATTRIBUTEDEFINITIONINTEGERREF() <em>ATTRIBUTEDEFINITIONINTEGERREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEDEFINITIONINTEGERREF()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTEDEFINITIONINTEGERREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getATTRIBUTEDEFINITIONINTEGERREF() <em>ATTRIBUTEDEFINITIONINTEGERREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEDEFINITIONINTEGERREF()
	 * @generated
	 * @ordered
	 */
	protected String aTTRIBUTEDEFINITIONINTEGERREF = ATTRIBUTEDEFINITIONINTEGERREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DEFINITIONType5Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.DEFINITION_TYPE5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getATTRIBUTEDEFINITIONINTEGERREF() {
		return aTTRIBUTEDEFINITIONINTEGERREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEDEFINITIONINTEGERREF(String newATTRIBUTEDEFINITIONINTEGERREF) {
		String oldATTRIBUTEDEFINITIONINTEGERREF = aTTRIBUTEDEFINITIONINTEGERREF;
		aTTRIBUTEDEFINITIONINTEGERREF = newATTRIBUTEDEFINITIONINTEGERREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.DEFINITION_TYPE5__ATTRIBUTEDEFINITIONINTEGERREF, oldATTRIBUTEDEFINITIONINTEGERREF, aTTRIBUTEDEFINITIONINTEGERREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyreqifPackage.DEFINITION_TYPE5__ATTRIBUTEDEFINITIONINTEGERREF:
				return getATTRIBUTEDEFINITIONINTEGERREF();
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
			case MyreqifPackage.DEFINITION_TYPE5__ATTRIBUTEDEFINITIONINTEGERREF:
				setATTRIBUTEDEFINITIONINTEGERREF((String)newValue);
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
			case MyreqifPackage.DEFINITION_TYPE5__ATTRIBUTEDEFINITIONINTEGERREF:
				setATTRIBUTEDEFINITIONINTEGERREF(ATTRIBUTEDEFINITIONINTEGERREF_EDEFAULT);
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
			case MyreqifPackage.DEFINITION_TYPE5__ATTRIBUTEDEFINITIONINTEGERREF:
				return ATTRIBUTEDEFINITIONINTEGERREF_EDEFAULT == null ? aTTRIBUTEDEFINITIONINTEGERREF != null : !ATTRIBUTEDEFINITIONINTEGERREF_EDEFAULT.equals(aTTRIBUTEDEFINITIONINTEGERREF);
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
		result.append(" (aTTRIBUTEDEFINITIONINTEGERREF: ");
		result.append(aTTRIBUTEDEFINITIONINTEGERREF);
		result.append(')');
		return result.toString();
	}

} //DEFINITIONType5Impl
