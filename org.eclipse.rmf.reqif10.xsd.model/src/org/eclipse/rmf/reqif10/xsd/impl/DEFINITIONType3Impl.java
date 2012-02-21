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

import org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONXHTML;
import org.eclipse.rmf.reqif10.xsd.DEFINITIONType3;
import org.eclipse.rmf.reqif10.xsd.ReqifPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEFINITION Type3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.DEFINITIONType3Impl#getATTRIBUTEDEFINITIONXHTMLREF <em>ATTRIBUTEDEFINITIONXHTMLREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEFINITIONType3Impl extends EObjectImpl implements DEFINITIONType3 {
	/**
	 * The cached value of the '{@link #getATTRIBUTEDEFINITIONXHTMLREF() <em>ATTRIBUTEDEFINITIONXHTMLREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEDEFINITIONXHTMLREF()
	 * @generated
	 * @ordered
	 */
	protected ATTRIBUTEDEFINITIONXHTML aTTRIBUTEDEFINITIONXHTMLREF;

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
		return ReqifPackage.Literals.DEFINITION_TYPE3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEDEFINITIONXHTML getATTRIBUTEDEFINITIONXHTMLREF() {
		return aTTRIBUTEDEFINITIONXHTMLREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEDEFINITIONXHTMLREF(ATTRIBUTEDEFINITIONXHTML newATTRIBUTEDEFINITIONXHTMLREF) {
		ATTRIBUTEDEFINITIONXHTML oldATTRIBUTEDEFINITIONXHTMLREF = aTTRIBUTEDEFINITIONXHTMLREF;
		aTTRIBUTEDEFINITIONXHTMLREF = newATTRIBUTEDEFINITIONXHTMLREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.DEFINITION_TYPE3__ATTRIBUTEDEFINITIONXHTMLREF, oldATTRIBUTEDEFINITIONXHTMLREF, aTTRIBUTEDEFINITIONXHTMLREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReqifPackage.DEFINITION_TYPE3__ATTRIBUTEDEFINITIONXHTMLREF:
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
			case ReqifPackage.DEFINITION_TYPE3__ATTRIBUTEDEFINITIONXHTMLREF:
				setATTRIBUTEDEFINITIONXHTMLREF((ATTRIBUTEDEFINITIONXHTML)newValue);
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
			case ReqifPackage.DEFINITION_TYPE3__ATTRIBUTEDEFINITIONXHTMLREF:
				setATTRIBUTEDEFINITIONXHTMLREF((ATTRIBUTEDEFINITIONXHTML)null);
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
			case ReqifPackage.DEFINITION_TYPE3__ATTRIBUTEDEFINITIONXHTMLREF:
				return aTTRIBUTEDEFINITIONXHTMLREF != null;
		}
		return super.eIsSet(featureID);
	}

} //DEFINITIONType3Impl
