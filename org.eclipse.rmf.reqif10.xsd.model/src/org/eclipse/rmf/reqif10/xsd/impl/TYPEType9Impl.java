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

import org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONENUMERATION;
import org.eclipse.rmf.reqif10.xsd.ReqifPackage;
import org.eclipse.rmf.reqif10.xsd.TYPEType9;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TYPE Type9</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.TYPEType9Impl#getDATATYPEDEFINITIONENUMERATIONREF <em>DATATYPEDEFINITIONENUMERATIONREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TYPEType9Impl extends EObjectImpl implements TYPEType9 {
	/**
	 * The cached value of the '{@link #getDATATYPEDEFINITIONENUMERATIONREF() <em>DATATYPEDEFINITIONENUMERATIONREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONENUMERATIONREF()
	 * @generated
	 * @ordered
	 */
	protected DATATYPEDEFINITIONENUMERATION dATATYPEDEFINITIONENUMERATIONREF;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TYPEType9Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqifPackage.Literals.TYPE_TYPE9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPEDEFINITIONENUMERATION getDATATYPEDEFINITIONENUMERATIONREF() {
		return dATATYPEDEFINITIONENUMERATIONREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATATYPEDEFINITIONENUMERATIONREF(DATATYPEDEFINITIONENUMERATION newDATATYPEDEFINITIONENUMERATIONREF) {
		DATATYPEDEFINITIONENUMERATION oldDATATYPEDEFINITIONENUMERATIONREF = dATATYPEDEFINITIONENUMERATIONREF;
		dATATYPEDEFINITIONENUMERATIONREF = newDATATYPEDEFINITIONENUMERATIONREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.TYPE_TYPE9__DATATYPEDEFINITIONENUMERATIONREF, oldDATATYPEDEFINITIONENUMERATIONREF, dATATYPEDEFINITIONENUMERATIONREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReqifPackage.TYPE_TYPE9__DATATYPEDEFINITIONENUMERATIONREF:
				return getDATATYPEDEFINITIONENUMERATIONREF();
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
			case ReqifPackage.TYPE_TYPE9__DATATYPEDEFINITIONENUMERATIONREF:
				setDATATYPEDEFINITIONENUMERATIONREF((DATATYPEDEFINITIONENUMERATION)newValue);
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
			case ReqifPackage.TYPE_TYPE9__DATATYPEDEFINITIONENUMERATIONREF:
				setDATATYPEDEFINITIONENUMERATIONREF((DATATYPEDEFINITIONENUMERATION)null);
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
			case ReqifPackage.TYPE_TYPE9__DATATYPEDEFINITIONENUMERATIONREF:
				return dATATYPEDEFINITIONENUMERATIONREF != null;
		}
		return super.eIsSet(featureID);
	}

} //TYPEType9Impl
