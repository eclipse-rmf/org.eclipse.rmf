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

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType3;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEFINITION Type3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONType3Impl#getATTRIBUTEDEFINITIONXHTMLREF <em>ATTRIBUTEDEFINITIONXHTMLREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEFINITIONType3Impl extends EObjectImpl implements DEFINITIONType3 {
	/**
	 * The default value of the '{@link #getATTRIBUTEDEFINITIONXHTMLREF() <em>ATTRIBUTEDEFINITIONXHTMLREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEDEFINITIONXHTMLREF()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTEDEFINITIONXHTMLREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getATTRIBUTEDEFINITIONXHTMLREF() <em>ATTRIBUTEDEFINITIONXHTMLREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEDEFINITIONXHTMLREF()
	 * @generated
	 * @ordered
	 */
	protected String aTTRIBUTEDEFINITIONXHTMLREF = ATTRIBUTEDEFINITIONXHTMLREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DEFINITIONType3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.DEFINITION_TYPE3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getATTRIBUTEDEFINITIONXHTMLREF() {
		return aTTRIBUTEDEFINITIONXHTMLREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEDEFINITIONXHTMLREF(String newATTRIBUTEDEFINITIONXHTMLREF) {
		String oldATTRIBUTEDEFINITIONXHTMLREF = aTTRIBUTEDEFINITIONXHTMLREF;
		aTTRIBUTEDEFINITIONXHTMLREF = newATTRIBUTEDEFINITIONXHTMLREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.DEFINITION_TYPE3__ATTRIBUTEDEFINITIONXHTMLREF, oldATTRIBUTEDEFINITIONXHTMLREF, aTTRIBUTEDEFINITIONXHTMLREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyreqifPackage.DEFINITION_TYPE3__ATTRIBUTEDEFINITIONXHTMLREF:
				return getATTRIBUTEDEFINITIONXHTMLREF();
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
			case MyreqifPackage.DEFINITION_TYPE3__ATTRIBUTEDEFINITIONXHTMLREF:
				setATTRIBUTEDEFINITIONXHTMLREF((String)newValue);
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
			case MyreqifPackage.DEFINITION_TYPE3__ATTRIBUTEDEFINITIONXHTMLREF:
				setATTRIBUTEDEFINITIONXHTMLREF(ATTRIBUTEDEFINITIONXHTMLREF_EDEFAULT);
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
			case MyreqifPackage.DEFINITION_TYPE3__ATTRIBUTEDEFINITIONXHTMLREF:
				return ATTRIBUTEDEFINITIONXHTMLREF_EDEFAULT == null ? aTTRIBUTEDEFINITIONXHTMLREF != null : !ATTRIBUTEDEFINITIONXHTMLREF_EDEFAULT.equals(aTTRIBUTEDEFINITIONXHTMLREF);
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
		result.append(" (aTTRIBUTEDEFINITIONXHTMLREF: ");
		result.append(aTTRIBUTEDEFINITIONXHTMLREF);
		result.append(')');
		return result.toString();
	}

} //DEFINITIONType3Impl
