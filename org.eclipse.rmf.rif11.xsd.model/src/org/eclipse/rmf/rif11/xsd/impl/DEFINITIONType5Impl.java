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

package org.eclipse.rmf.rif11.xsd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONCOMPLEX;
import org.eclipse.rmf.rif11.xsd.DEFINITIONType5;
import org.eclipse.rmf.rif11.xsd.RifPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEFINITION Type5</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.DEFINITIONType5Impl#getATTRIBUTEDEFINITIONCOMPLEXREF <em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEFINITIONType5Impl extends EObjectImpl implements DEFINITIONType5 {
	/**
	 * The cached value of the '{@link #getATTRIBUTEDEFINITIONCOMPLEXREF() <em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEDEFINITIONCOMPLEXREF()
	 * @generated
	 * @ordered
	 */
	protected ATTRIBUTEDEFINITIONCOMPLEX aTTRIBUTEDEFINITIONCOMPLEXREF;

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
		return RifPackage.Literals.DEFINITION_TYPE5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEDEFINITIONCOMPLEX getATTRIBUTEDEFINITIONCOMPLEXREF() {
		return aTTRIBUTEDEFINITIONCOMPLEXREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEDEFINITIONCOMPLEXREF(ATTRIBUTEDEFINITIONCOMPLEX newATTRIBUTEDEFINITIONCOMPLEXREF) {
		ATTRIBUTEDEFINITIONCOMPLEX oldATTRIBUTEDEFINITIONCOMPLEXREF = aTTRIBUTEDEFINITIONCOMPLEXREF;
		aTTRIBUTEDEFINITIONCOMPLEXREF = newATTRIBUTEDEFINITIONCOMPLEXREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DEFINITION_TYPE5__ATTRIBUTEDEFINITIONCOMPLEXREF, oldATTRIBUTEDEFINITIONCOMPLEXREF, aTTRIBUTEDEFINITIONCOMPLEXREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RifPackage.DEFINITION_TYPE5__ATTRIBUTEDEFINITIONCOMPLEXREF:
				return getATTRIBUTEDEFINITIONCOMPLEXREF();
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
			case RifPackage.DEFINITION_TYPE5__ATTRIBUTEDEFINITIONCOMPLEXREF:
				setATTRIBUTEDEFINITIONCOMPLEXREF((ATTRIBUTEDEFINITIONCOMPLEX)newValue);
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
			case RifPackage.DEFINITION_TYPE5__ATTRIBUTEDEFINITIONCOMPLEXREF:
				setATTRIBUTEDEFINITIONCOMPLEXREF((ATTRIBUTEDEFINITIONCOMPLEX)null);
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
			case RifPackage.DEFINITION_TYPE5__ATTRIBUTEDEFINITIONCOMPLEXREF:
				return aTTRIBUTEDEFINITIONCOMPLEXREF != null;
		}
		return super.eIsSet(featureID);
	}

} //DEFINITIONType5Impl
