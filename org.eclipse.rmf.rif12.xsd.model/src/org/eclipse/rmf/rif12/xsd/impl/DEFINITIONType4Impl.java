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
import org.eclipse.rmf.rif12.xsd.ATTRIBUTEDEFINITIONSIMPLE;
import org.eclipse.rmf.rif12.xsd.DEFINITIONType4;
import org.eclipse.rmf.rif12.xsd.RifPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEFINITION Type4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DEFINITIONType4Impl#getATTRIBUTEDEFINITIONSIMPLEREF <em>ATTRIBUTEDEFINITIONSIMPLEREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEFINITIONType4Impl extends EObjectImpl implements DEFINITIONType4 {
	/**
	 * The cached value of the '{@link #getATTRIBUTEDEFINITIONSIMPLEREF() <em>ATTRIBUTEDEFINITIONSIMPLEREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEDEFINITIONSIMPLEREF()
	 * @generated
	 * @ordered
	 */
	protected ATTRIBUTEDEFINITIONSIMPLE aTTRIBUTEDEFINITIONSIMPLEREF;

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
		return RifPackage.Literals.DEFINITION_TYPE4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEDEFINITIONSIMPLE getATTRIBUTEDEFINITIONSIMPLEREF() {
		return aTTRIBUTEDEFINITIONSIMPLEREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEDEFINITIONSIMPLEREF(ATTRIBUTEDEFINITIONSIMPLE newATTRIBUTEDEFINITIONSIMPLEREF) {
		ATTRIBUTEDEFINITIONSIMPLE oldATTRIBUTEDEFINITIONSIMPLEREF = aTTRIBUTEDEFINITIONSIMPLEREF;
		aTTRIBUTEDEFINITIONSIMPLEREF = newATTRIBUTEDEFINITIONSIMPLEREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DEFINITION_TYPE4__ATTRIBUTEDEFINITIONSIMPLEREF, oldATTRIBUTEDEFINITIONSIMPLEREF, aTTRIBUTEDEFINITIONSIMPLEREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RifPackage.DEFINITION_TYPE4__ATTRIBUTEDEFINITIONSIMPLEREF:
				return getATTRIBUTEDEFINITIONSIMPLEREF();
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
			case RifPackage.DEFINITION_TYPE4__ATTRIBUTEDEFINITIONSIMPLEREF:
				setATTRIBUTEDEFINITIONSIMPLEREF((ATTRIBUTEDEFINITIONSIMPLE)newValue);
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
			case RifPackage.DEFINITION_TYPE4__ATTRIBUTEDEFINITIONSIMPLEREF:
				setATTRIBUTEDEFINITIONSIMPLEREF((ATTRIBUTEDEFINITIONSIMPLE)null);
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
			case RifPackage.DEFINITION_TYPE4__ATTRIBUTEDEFINITIONSIMPLEREF:
				return aTTRIBUTEDEFINITIONSIMPLEREF != null;
		}
		return super.eIsSet(featureID);
	}

} //DEFINITIONType4Impl
