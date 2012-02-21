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

package org.eclipse.rmf.rif12.xsd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.rmf.rif12.xsd.ATTRIBUTEDEFINITIONENUMERATION;
import org.eclipse.rmf.rif12.xsd.DEFINITIONType3;
import org.eclipse.rmf.rif12.xsd.RifPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEFINITION Type3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DEFINITIONType3Impl#getATTRIBUTEDEFINITIONENUMERATIONREF <em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEFINITIONType3Impl extends EObjectImpl implements DEFINITIONType3 {
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
		return RifPackage.Literals.DEFINITION_TYPE3;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DEFINITION_TYPE3__ATTRIBUTEDEFINITIONENUMERATIONREF, oldATTRIBUTEDEFINITIONENUMERATIONREF, aTTRIBUTEDEFINITIONENUMERATIONREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RifPackage.DEFINITION_TYPE3__ATTRIBUTEDEFINITIONENUMERATIONREF:
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
			case RifPackage.DEFINITION_TYPE3__ATTRIBUTEDEFINITIONENUMERATIONREF:
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
			case RifPackage.DEFINITION_TYPE3__ATTRIBUTEDEFINITIONENUMERATIONREF:
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
			case RifPackage.DEFINITION_TYPE3__ATTRIBUTEDEFINITIONENUMERATIONREF:
				return aTTRIBUTEDEFINITIONENUMERATIONREF != null;
		}
		return super.eIsSet(featureID);
	}

} //DEFINITIONType3Impl
