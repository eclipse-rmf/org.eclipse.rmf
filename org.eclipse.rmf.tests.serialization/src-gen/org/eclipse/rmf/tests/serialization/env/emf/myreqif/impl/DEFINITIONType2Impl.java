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

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType2;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEFINITION Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType2Impl#getATTRIBUTEDEFINITIONSTRINGREF <em>ATTRIBUTEDEFINITIONSTRINGREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEFINITIONType2Impl extends EObjectImpl implements DEFINITIONType2 {
	/**
	 * The default value of the '{@link #getATTRIBUTEDEFINITIONSTRINGREF() <em>ATTRIBUTEDEFINITIONSTRINGREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEDEFINITIONSTRINGREF()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTEDEFINITIONSTRINGREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getATTRIBUTEDEFINITIONSTRINGREF() <em>ATTRIBUTEDEFINITIONSTRINGREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEDEFINITIONSTRINGREF()
	 * @generated
	 * @ordered
	 */
	protected String aTTRIBUTEDEFINITIONSTRINGREF = ATTRIBUTEDEFINITIONSTRINGREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DEFINITIONType2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.DEFINITION_TYPE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getATTRIBUTEDEFINITIONSTRINGREF() {
		return aTTRIBUTEDEFINITIONSTRINGREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEDEFINITIONSTRINGREF(String newATTRIBUTEDEFINITIONSTRINGREF) {
		String oldATTRIBUTEDEFINITIONSTRINGREF = aTTRIBUTEDEFINITIONSTRINGREF;
		aTTRIBUTEDEFINITIONSTRINGREF = newATTRIBUTEDEFINITIONSTRINGREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.DEFINITION_TYPE2__ATTRIBUTEDEFINITIONSTRINGREF, oldATTRIBUTEDEFINITIONSTRINGREF, aTTRIBUTEDEFINITIONSTRINGREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyreqifPackage.DEFINITION_TYPE2__ATTRIBUTEDEFINITIONSTRINGREF:
				return getATTRIBUTEDEFINITIONSTRINGREF();
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
			case MyreqifPackage.DEFINITION_TYPE2__ATTRIBUTEDEFINITIONSTRINGREF:
				setATTRIBUTEDEFINITIONSTRINGREF((String)newValue);
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
			case MyreqifPackage.DEFINITION_TYPE2__ATTRIBUTEDEFINITIONSTRINGREF:
				setATTRIBUTEDEFINITIONSTRINGREF(ATTRIBUTEDEFINITIONSTRINGREF_EDEFAULT);
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
			case MyreqifPackage.DEFINITION_TYPE2__ATTRIBUTEDEFINITIONSTRINGREF:
				return ATTRIBUTEDEFINITIONSTRINGREF_EDEFAULT == null ? aTTRIBUTEDEFINITIONSTRINGREF != null : !ATTRIBUTEDEFINITIONSTRINGREF_EDEFAULT.equals(aTTRIBUTEDEFINITIONSTRINGREF);
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
		result.append(" (aTTRIBUTEDEFINITIONSTRINGREF: ");
		result.append(aTTRIBUTEDEFINITIONSTRINGREF);
		result.append(')');
		return result.toString();
	}

} //DEFINITIONType2Impl
