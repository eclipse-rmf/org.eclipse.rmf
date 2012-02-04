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

import org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONBOOLEAN;
import org.eclipse.rmf.reqif10.xsd.DEFINITIONType6;
import org.eclipse.rmf.reqif10.xsd.ReqifPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEFINITION Type6</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.DEFINITIONType6Impl#getATTRIBUTEDEFINITIONBOOLEANREF <em>ATTRIBUTEDEFINITIONBOOLEANREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEFINITIONType6Impl extends EObjectImpl implements DEFINITIONType6 {
	/**
	 * The cached value of the '{@link #getATTRIBUTEDEFINITIONBOOLEANREF() <em>ATTRIBUTEDEFINITIONBOOLEANREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEDEFINITIONBOOLEANREF()
	 * @generated
	 * @ordered
	 */
	protected ATTRIBUTEDEFINITIONBOOLEAN aTTRIBUTEDEFINITIONBOOLEANREF;

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
		return ReqifPackage.Literals.DEFINITION_TYPE6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEDEFINITIONBOOLEAN getATTRIBUTEDEFINITIONBOOLEANREF() {
		return aTTRIBUTEDEFINITIONBOOLEANREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEDEFINITIONBOOLEANREF(ATTRIBUTEDEFINITIONBOOLEAN newATTRIBUTEDEFINITIONBOOLEANREF) {
		ATTRIBUTEDEFINITIONBOOLEAN oldATTRIBUTEDEFINITIONBOOLEANREF = aTTRIBUTEDEFINITIONBOOLEANREF;
		aTTRIBUTEDEFINITIONBOOLEANREF = newATTRIBUTEDEFINITIONBOOLEANREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.DEFINITION_TYPE6__ATTRIBUTEDEFINITIONBOOLEANREF, oldATTRIBUTEDEFINITIONBOOLEANREF, aTTRIBUTEDEFINITIONBOOLEANREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReqifPackage.DEFINITION_TYPE6__ATTRIBUTEDEFINITIONBOOLEANREF:
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
			case ReqifPackage.DEFINITION_TYPE6__ATTRIBUTEDEFINITIONBOOLEANREF:
				setATTRIBUTEDEFINITIONBOOLEANREF((ATTRIBUTEDEFINITIONBOOLEAN)newValue);
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
			case ReqifPackage.DEFINITION_TYPE6__ATTRIBUTEDEFINITIONBOOLEANREF:
				setATTRIBUTEDEFINITIONBOOLEANREF((ATTRIBUTEDEFINITIONBOOLEAN)null);
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
			case ReqifPackage.DEFINITION_TYPE6__ATTRIBUTEDEFINITIONBOOLEANREF:
				return aTTRIBUTEDEFINITIONBOOLEANREF != null;
		}
		return super.eIsSet(featureID);
	}

} //DEFINITIONType6Impl
