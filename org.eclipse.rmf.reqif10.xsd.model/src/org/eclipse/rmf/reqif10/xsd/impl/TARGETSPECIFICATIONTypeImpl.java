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

import org.eclipse.rmf.reqif10.xsd.ReqifPackage;
import org.eclipse.rmf.reqif10.xsd.SPECIFICATION;
import org.eclipse.rmf.reqif10.xsd.TARGETSPECIFICATIONType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TARGETSPECIFICATION Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.TARGETSPECIFICATIONTypeImpl#getSPECIFICATIONREF <em>SPECIFICATIONREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TARGETSPECIFICATIONTypeImpl extends EObjectImpl implements TARGETSPECIFICATIONType {
	/**
	 * The cached value of the '{@link #getSPECIFICATIONREF() <em>SPECIFICATIONREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECIFICATIONREF()
	 * @generated
	 * @ordered
	 */
	protected SPECIFICATION sPECIFICATIONREF;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TARGETSPECIFICATIONTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqifPackage.Literals.TARGETSPECIFICATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECIFICATION getSPECIFICATIONREF() {
		return sPECIFICATIONREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECIFICATIONREF(SPECIFICATION newSPECIFICATIONREF) {
		SPECIFICATION oldSPECIFICATIONREF = sPECIFICATIONREF;
		sPECIFICATIONREF = newSPECIFICATIONREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.TARGETSPECIFICATION_TYPE__SPECIFICATIONREF, oldSPECIFICATIONREF, sPECIFICATIONREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReqifPackage.TARGETSPECIFICATION_TYPE__SPECIFICATIONREF:
				return getSPECIFICATIONREF();
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
			case ReqifPackage.TARGETSPECIFICATION_TYPE__SPECIFICATIONREF:
				setSPECIFICATIONREF((SPECIFICATION)newValue);
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
			case ReqifPackage.TARGETSPECIFICATION_TYPE__SPECIFICATIONREF:
				setSPECIFICATIONREF((SPECIFICATION)null);
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
			case ReqifPackage.TARGETSPECIFICATION_TYPE__SPECIFICATIONREF:
				return sPECIFICATIONREF != null;
		}
		return super.eIsSet(featureID);
	}

} //TARGETSPECIFICATIONTypeImpl
