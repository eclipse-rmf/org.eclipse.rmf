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
import org.eclipse.rmf.reqif10.xsd.SPECIFICATIONTYPE;
import org.eclipse.rmf.reqif10.xsd.TYPEType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TYPE Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.TYPEType1Impl#getSPECIFICATIONTYPEREF <em>SPECIFICATIONTYPEREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TYPEType1Impl extends EObjectImpl implements TYPEType1 {
	/**
	 * The cached value of the '{@link #getSPECIFICATIONTYPEREF() <em>SPECIFICATIONTYPEREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECIFICATIONTYPEREF()
	 * @generated
	 * @ordered
	 */
	protected SPECIFICATIONTYPE sPECIFICATIONTYPEREF;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TYPEType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqifPackage.Literals.TYPE_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECIFICATIONTYPE getSPECIFICATIONTYPEREF() {
		return sPECIFICATIONTYPEREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECIFICATIONTYPEREF(SPECIFICATIONTYPE newSPECIFICATIONTYPEREF) {
		SPECIFICATIONTYPE oldSPECIFICATIONTYPEREF = sPECIFICATIONTYPEREF;
		sPECIFICATIONTYPEREF = newSPECIFICATIONTYPEREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.TYPE_TYPE1__SPECIFICATIONTYPEREF, oldSPECIFICATIONTYPEREF, sPECIFICATIONTYPEREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReqifPackage.TYPE_TYPE1__SPECIFICATIONTYPEREF:
				return getSPECIFICATIONTYPEREF();
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
			case ReqifPackage.TYPE_TYPE1__SPECIFICATIONTYPEREF:
				setSPECIFICATIONTYPEREF((SPECIFICATIONTYPE)newValue);
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
			case ReqifPackage.TYPE_TYPE1__SPECIFICATIONTYPEREF:
				setSPECIFICATIONTYPEREF((SPECIFICATIONTYPE)null);
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
			case ReqifPackage.TYPE_TYPE1__SPECIFICATIONTYPEREF:
				return sPECIFICATIONTYPEREF != null;
		}
		return super.eIsSet(featureID);
	}

} //TYPEType1Impl
