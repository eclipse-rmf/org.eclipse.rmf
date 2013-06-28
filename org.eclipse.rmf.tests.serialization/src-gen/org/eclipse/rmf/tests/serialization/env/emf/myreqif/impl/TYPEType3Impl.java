/**
 * Copyright (c) 2013 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    itemis AG - initial API and implementation
 * 
 */
package org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TYPE Type3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType3Impl#getDATATYPEDEFINITIONSTRINGREF <em>DATATYPEDEFINITIONSTRINGREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TYPEType3Impl extends EObjectImpl implements TYPEType3 {
	/**
	 * The default value of the '{@link #getDATATYPEDEFINITIONSTRINGREF() <em>DATATYPEDEFINITIONSTRINGREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONSTRINGREF()
	 * @generated
	 * @ordered
	 */
	protected static final String DATATYPEDEFINITIONSTRINGREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDATATYPEDEFINITIONSTRINGREF() <em>DATATYPEDEFINITIONSTRINGREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONSTRINGREF()
	 * @generated
	 * @ordered
	 */
	protected String dATATYPEDEFINITIONSTRINGREF = DATATYPEDEFINITIONSTRINGREF_EDEFAULT;

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
		return MyreqifPackage.Literals.TYPE_TYPE3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDATATYPEDEFINITIONSTRINGREF() {
		return dATATYPEDEFINITIONSTRINGREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATATYPEDEFINITIONSTRINGREF(String newDATATYPEDEFINITIONSTRINGREF) {
		String oldDATATYPEDEFINITIONSTRINGREF = dATATYPEDEFINITIONSTRINGREF;
		dATATYPEDEFINITIONSTRINGREF = newDATATYPEDEFINITIONSTRINGREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.TYPE_TYPE3__DATATYPEDEFINITIONSTRINGREF, oldDATATYPEDEFINITIONSTRINGREF, dATATYPEDEFINITIONSTRINGREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyreqifPackage.TYPE_TYPE3__DATATYPEDEFINITIONSTRINGREF:
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
			case MyreqifPackage.TYPE_TYPE3__DATATYPEDEFINITIONSTRINGREF:
				setDATATYPEDEFINITIONSTRINGREF((String)newValue);
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
			case MyreqifPackage.TYPE_TYPE3__DATATYPEDEFINITIONSTRINGREF:
				setDATATYPEDEFINITIONSTRINGREF(DATATYPEDEFINITIONSTRINGREF_EDEFAULT);
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
			case MyreqifPackage.TYPE_TYPE3__DATATYPEDEFINITIONSTRINGREF:
				return DATATYPEDEFINITIONSTRINGREF_EDEFAULT == null ? dATATYPEDEFINITIONSTRINGREF != null : !DATATYPEDEFINITIONSTRINGREF_EDEFAULT.equals(dATATYPEDEFINITIONSTRINGREF);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dATATYPEDEFINITIONSTRINGREF: ");
		result.append(dATATYPEDEFINITIONSTRINGREF);
		result.append(')');
		return result.toString();
	}

} //TYPEType3Impl
