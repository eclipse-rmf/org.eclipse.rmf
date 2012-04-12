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

import org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONSTRING;
import org.eclipse.rmf.reqif10.xsd.ReqifPackage;
import org.eclipse.rmf.reqif10.xsd.TYPEType3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TYPE Type3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.TYPEType3Impl#getDATATYPEDEFINITIONSTRINGREF <em>DATATYPEDEFINITIONSTRINGREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TYPEType3Impl extends EObjectImpl implements TYPEType3 {
	/**
	 * The cached value of the '{@link #getDATATYPEDEFINITIONSTRINGREF() <em>DATATYPEDEFINITIONSTRINGREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONSTRINGREF()
	 * @generated
	 * @ordered
	 */
	protected DATATYPEDEFINITIONSTRING dATATYPEDEFINITIONSTRINGREF;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TYPEType3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqifPackage.Literals.TYPE_TYPE3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPEDEFINITIONSTRING getDATATYPEDEFINITIONSTRINGREF() {
		return dATATYPEDEFINITIONSTRINGREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATATYPEDEFINITIONSTRINGREF(DATATYPEDEFINITIONSTRING newDATATYPEDEFINITIONSTRINGREF) {
		DATATYPEDEFINITIONSTRING oldDATATYPEDEFINITIONSTRINGREF = dATATYPEDEFINITIONSTRINGREF;
		dATATYPEDEFINITIONSTRINGREF = newDATATYPEDEFINITIONSTRINGREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.TYPE_TYPE3__DATATYPEDEFINITIONSTRINGREF, oldDATATYPEDEFINITIONSTRINGREF, dATATYPEDEFINITIONSTRINGREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReqifPackage.TYPE_TYPE3__DATATYPEDEFINITIONSTRINGREF:
				return getDATATYPEDEFINITIONSTRINGREF();
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
			case ReqifPackage.TYPE_TYPE3__DATATYPEDEFINITIONSTRINGREF:
				setDATATYPEDEFINITIONSTRINGREF((DATATYPEDEFINITIONSTRING)newValue);
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
			case ReqifPackage.TYPE_TYPE3__DATATYPEDEFINITIONSTRINGREF:
				setDATATYPEDEFINITIONSTRINGREF((DATATYPEDEFINITIONSTRING)null);
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
			case ReqifPackage.TYPE_TYPE3__DATATYPEDEFINITIONSTRINGREF:
				return dATATYPEDEFINITIONSTRINGREF != null;
		}
		return super.eIsSet(featureID);
	}

} //TYPEType3Impl
