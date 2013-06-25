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

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEFINITION Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFINITIONTypeImpl#getATTRIBUTEDEFINITIONENUMERATIONREF <em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEFINITIONTypeImpl extends EObjectImpl implements DEFINITIONType {
	/**
	 * The default value of the '{@link #getATTRIBUTEDEFINITIONENUMERATIONREF() <em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEDEFINITIONENUMERATIONREF()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTEDEFINITIONENUMERATIONREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getATTRIBUTEDEFINITIONENUMERATIONREF() <em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEDEFINITIONENUMERATIONREF()
	 * @generated
	 * @ordered
	 */
	protected String aTTRIBUTEDEFINITIONENUMERATIONREF = ATTRIBUTEDEFINITIONENUMERATIONREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DEFINITIONTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.DEFINITION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getATTRIBUTEDEFINITIONENUMERATIONREF() {
		return aTTRIBUTEDEFINITIONENUMERATIONREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEDEFINITIONENUMERATIONREF(String newATTRIBUTEDEFINITIONENUMERATIONREF) {
		String oldATTRIBUTEDEFINITIONENUMERATIONREF = aTTRIBUTEDEFINITIONENUMERATIONREF;
		aTTRIBUTEDEFINITIONENUMERATIONREF = newATTRIBUTEDEFINITIONENUMERATIONREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.DEFINITION_TYPE__ATTRIBUTEDEFINITIONENUMERATIONREF, oldATTRIBUTEDEFINITIONENUMERATIONREF, aTTRIBUTEDEFINITIONENUMERATIONREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyreqifPackage.DEFINITION_TYPE__ATTRIBUTEDEFINITIONENUMERATIONREF:
				return getATTRIBUTEDEFINITIONENUMERATIONREF();
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
			case MyreqifPackage.DEFINITION_TYPE__ATTRIBUTEDEFINITIONENUMERATIONREF:
				setATTRIBUTEDEFINITIONENUMERATIONREF((String)newValue);
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
			case MyreqifPackage.DEFINITION_TYPE__ATTRIBUTEDEFINITIONENUMERATIONREF:
				setATTRIBUTEDEFINITIONENUMERATIONREF(ATTRIBUTEDEFINITIONENUMERATIONREF_EDEFAULT);
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
			case MyreqifPackage.DEFINITION_TYPE__ATTRIBUTEDEFINITIONENUMERATIONREF:
				return ATTRIBUTEDEFINITIONENUMERATIONREF_EDEFAULT == null ? aTTRIBUTEDEFINITIONENUMERATIONREF != null : !ATTRIBUTEDEFINITIONENUMERATIONREF_EDEFAULT.equals(aTTRIBUTEDEFINITIONENUMERATIONREF);
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
		result.append(" (aTTRIBUTEDEFINITIONENUMERATIONREF: ");
		result.append(aTTRIBUTEDEFINITIONENUMERATIONREF);
		result.append(')');
		return result.toString();
	}

} //DEFINITIONTypeImpl
