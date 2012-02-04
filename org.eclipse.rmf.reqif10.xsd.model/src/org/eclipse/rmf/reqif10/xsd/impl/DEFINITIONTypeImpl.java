/*******************************************************************************
 * Copyright (c) 2011 itemis GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nirmal Sasidharan - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.xsd.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONENUMERATION;
import org.eclipse.rmf.reqif10.xsd.DEFINITIONType;
import org.eclipse.rmf.reqif10.xsd.ReqifPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEFINITION Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.DEFINITIONTypeImpl#getATTRIBUTEDEFINITIONENUMERATIONREF <em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEFINITIONTypeImpl extends EObjectImpl implements DEFINITIONType {
	/**
	 * The cached value of the '{@link #getATTRIBUTEDEFINITIONENUMERATIONREF() <em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEDEFINITIONENUMERATIONREF()
	 * @generated
	 * @ordered
	 */
	protected ATTRIBUTEDEFINITIONENUMERATION aTTRIBUTEDEFINITIONENUMERATIONREF;

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
		return ReqifPackage.Literals.DEFINITION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEDEFINITIONENUMERATION getATTRIBUTEDEFINITIONENUMERATIONREF() {
		return aTTRIBUTEDEFINITIONENUMERATIONREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEDEFINITIONENUMERATIONREF(ATTRIBUTEDEFINITIONENUMERATION newATTRIBUTEDEFINITIONENUMERATIONREF) {
		ATTRIBUTEDEFINITIONENUMERATION oldATTRIBUTEDEFINITIONENUMERATIONREF = aTTRIBUTEDEFINITIONENUMERATIONREF;
		aTTRIBUTEDEFINITIONENUMERATIONREF = newATTRIBUTEDEFINITIONENUMERATIONREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.DEFINITION_TYPE__ATTRIBUTEDEFINITIONENUMERATIONREF, oldATTRIBUTEDEFINITIONENUMERATIONREF, aTTRIBUTEDEFINITIONENUMERATIONREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReqifPackage.DEFINITION_TYPE__ATTRIBUTEDEFINITIONENUMERATIONREF:
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
			case ReqifPackage.DEFINITION_TYPE__ATTRIBUTEDEFINITIONENUMERATIONREF:
				setATTRIBUTEDEFINITIONENUMERATIONREF((ATTRIBUTEDEFINITIONENUMERATION)newValue);
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
			case ReqifPackage.DEFINITION_TYPE__ATTRIBUTEDEFINITIONENUMERATIONREF:
				setATTRIBUTEDEFINITIONENUMERATIONREF((ATTRIBUTEDEFINITIONENUMERATION)null);
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
			case ReqifPackage.DEFINITION_TYPE__ATTRIBUTEDEFINITIONENUMERATIONREF:
				return aTTRIBUTEDEFINITIONENUMERATIONREF != null;
		}
		return super.eIsSet(featureID);
	}

} //DEFINITIONTypeImpl
