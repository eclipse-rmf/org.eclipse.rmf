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
import org.eclipse.rmf.reqif10.xsd.SPECOBJECTTYPE;
import org.eclipse.rmf.reqif10.xsd.TYPEType6;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TYPE Type6</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.TYPEType6Impl#getSPECOBJECTTYPEREF <em>SPECOBJECTTYPEREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TYPEType6Impl extends EObjectImpl implements TYPEType6 {
	/**
	 * The cached value of the '{@link #getSPECOBJECTTYPEREF() <em>SPECOBJECTTYPEREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECOBJECTTYPEREF()
	 * @generated
	 * @ordered
	 */
	protected SPECOBJECTTYPE sPECOBJECTTYPEREF;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TYPEType6Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqifPackage.Literals.TYPE_TYPE6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECOBJECTTYPE getSPECOBJECTTYPEREF() {
		return sPECOBJECTTYPEREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECOBJECTTYPEREF(SPECOBJECTTYPE newSPECOBJECTTYPEREF) {
		SPECOBJECTTYPE oldSPECOBJECTTYPEREF = sPECOBJECTTYPEREF;
		sPECOBJECTTYPEREF = newSPECOBJECTTYPEREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.TYPE_TYPE6__SPECOBJECTTYPEREF, oldSPECOBJECTTYPEREF, sPECOBJECTTYPEREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReqifPackage.TYPE_TYPE6__SPECOBJECTTYPEREF:
				return getSPECOBJECTTYPEREF();
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
			case ReqifPackage.TYPE_TYPE6__SPECOBJECTTYPEREF:
				setSPECOBJECTTYPEREF((SPECOBJECTTYPE)newValue);
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
			case ReqifPackage.TYPE_TYPE6__SPECOBJECTTYPEREF:
				setSPECOBJECTTYPEREF((SPECOBJECTTYPE)null);
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
			case ReqifPackage.TYPE_TYPE6__SPECOBJECTTYPEREF:
				return sPECOBJECTTYPEREF != null;
		}
		return super.eIsSet(featureID);
	}

} //TYPEType6Impl
