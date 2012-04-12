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

import org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONREAL;
import org.eclipse.rmf.reqif10.xsd.DEFINITIONType4;
import org.eclipse.rmf.reqif10.xsd.ReqifPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEFINITION Type4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.DEFINITIONType4Impl#getATTRIBUTEDEFINITIONREALREF <em>ATTRIBUTEDEFINITIONREALREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEFINITIONType4Impl extends EObjectImpl implements DEFINITIONType4 {
	/**
	 * The cached value of the '{@link #getATTRIBUTEDEFINITIONREALREF() <em>ATTRIBUTEDEFINITIONREALREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEDEFINITIONREALREF()
	 * @generated
	 * @ordered
	 */
	protected ATTRIBUTEDEFINITIONREAL aTTRIBUTEDEFINITIONREALREF;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DEFINITIONType4Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqifPackage.Literals.DEFINITION_TYPE4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEDEFINITIONREAL getATTRIBUTEDEFINITIONREALREF() {
		return aTTRIBUTEDEFINITIONREALREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEDEFINITIONREALREF(ATTRIBUTEDEFINITIONREAL newATTRIBUTEDEFINITIONREALREF) {
		ATTRIBUTEDEFINITIONREAL oldATTRIBUTEDEFINITIONREALREF = aTTRIBUTEDEFINITIONREALREF;
		aTTRIBUTEDEFINITIONREALREF = newATTRIBUTEDEFINITIONREALREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.DEFINITION_TYPE4__ATTRIBUTEDEFINITIONREALREF, oldATTRIBUTEDEFINITIONREALREF, aTTRIBUTEDEFINITIONREALREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReqifPackage.DEFINITION_TYPE4__ATTRIBUTEDEFINITIONREALREF:
				return getATTRIBUTEDEFINITIONREALREF();
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
			case ReqifPackage.DEFINITION_TYPE4__ATTRIBUTEDEFINITIONREALREF:
				setATTRIBUTEDEFINITIONREALREF((ATTRIBUTEDEFINITIONREAL)newValue);
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
			case ReqifPackage.DEFINITION_TYPE4__ATTRIBUTEDEFINITIONREALREF:
				setATTRIBUTEDEFINITIONREALREF((ATTRIBUTEDEFINITIONREAL)null);
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
			case ReqifPackage.DEFINITION_TYPE4__ATTRIBUTEDEFINITIONREALREF:
				return aTTRIBUTEDEFINITIONREALREF != null;
		}
		return super.eIsSet(featureID);
	}

} //DEFINITIONType4Impl
