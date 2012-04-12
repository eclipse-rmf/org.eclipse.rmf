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

import org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONSTRING;
import org.eclipse.rmf.reqif10.xsd.DEFINITIONType2;
import org.eclipse.rmf.reqif10.xsd.ReqifPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEFINITION Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.DEFINITIONType2Impl#getATTRIBUTEDEFINITIONSTRINGREF <em>ATTRIBUTEDEFINITIONSTRINGREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEFINITIONType2Impl extends EObjectImpl implements DEFINITIONType2 {
	/**
	 * The cached value of the '{@link #getATTRIBUTEDEFINITIONSTRINGREF() <em>ATTRIBUTEDEFINITIONSTRINGREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEDEFINITIONSTRINGREF()
	 * @generated
	 * @ordered
	 */
	protected ATTRIBUTEDEFINITIONSTRING aTTRIBUTEDEFINITIONSTRINGREF;

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
		return ReqifPackage.Literals.DEFINITION_TYPE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEDEFINITIONSTRING getATTRIBUTEDEFINITIONSTRINGREF() {
		return aTTRIBUTEDEFINITIONSTRINGREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEDEFINITIONSTRINGREF(ATTRIBUTEDEFINITIONSTRING newATTRIBUTEDEFINITIONSTRINGREF) {
		ATTRIBUTEDEFINITIONSTRING oldATTRIBUTEDEFINITIONSTRINGREF = aTTRIBUTEDEFINITIONSTRINGREF;
		aTTRIBUTEDEFINITIONSTRINGREF = newATTRIBUTEDEFINITIONSTRINGREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.DEFINITION_TYPE2__ATTRIBUTEDEFINITIONSTRINGREF, oldATTRIBUTEDEFINITIONSTRINGREF, aTTRIBUTEDEFINITIONSTRINGREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReqifPackage.DEFINITION_TYPE2__ATTRIBUTEDEFINITIONSTRINGREF:
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
			case ReqifPackage.DEFINITION_TYPE2__ATTRIBUTEDEFINITIONSTRINGREF:
				setATTRIBUTEDEFINITIONSTRINGREF((ATTRIBUTEDEFINITIONSTRING)newValue);
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
			case ReqifPackage.DEFINITION_TYPE2__ATTRIBUTEDEFINITIONSTRINGREF:
				setATTRIBUTEDEFINITIONSTRINGREF((ATTRIBUTEDEFINITIONSTRING)null);
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
			case ReqifPackage.DEFINITION_TYPE2__ATTRIBUTEDEFINITIONSTRINGREF:
				return aTTRIBUTEDEFINITIONSTRINGREF != null;
		}
		return super.eIsSet(featureID);
	}

} //DEFINITIONType2Impl
