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
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType7;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TYPE Type7</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType7Impl#getSPECRELATIONTYPEREF <em>SPECRELATIONTYPEREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TYPEType7Impl extends EObjectImpl implements TYPEType7 {
	/**
	 * The default value of the '{@link #getSPECRELATIONTYPEREF() <em>SPECRELATIONTYPEREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECRELATIONTYPEREF()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECRELATIONTYPEREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPECRELATIONTYPEREF() <em>SPECRELATIONTYPEREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECRELATIONTYPEREF()
	 * @generated
	 * @ordered
	 */
	protected String sPECRELATIONTYPEREF = SPECRELATIONTYPEREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TYPEType7Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.TYPE_TYPE7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSPECRELATIONTYPEREF() {
		return sPECRELATIONTYPEREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECRELATIONTYPEREF(String newSPECRELATIONTYPEREF) {
		String oldSPECRELATIONTYPEREF = sPECRELATIONTYPEREF;
		sPECRELATIONTYPEREF = newSPECRELATIONTYPEREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.TYPE_TYPE7__SPECRELATIONTYPEREF, oldSPECRELATIONTYPEREF, sPECRELATIONTYPEREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyreqifPackage.TYPE_TYPE7__SPECRELATIONTYPEREF:
				return getSPECRELATIONTYPEREF();
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
			case MyreqifPackage.TYPE_TYPE7__SPECRELATIONTYPEREF:
				setSPECRELATIONTYPEREF((String)newValue);
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
			case MyreqifPackage.TYPE_TYPE7__SPECRELATIONTYPEREF:
				setSPECRELATIONTYPEREF(SPECRELATIONTYPEREF_EDEFAULT);
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
			case MyreqifPackage.TYPE_TYPE7__SPECRELATIONTYPEREF:
				return SPECRELATIONTYPEREF_EDEFAULT == null ? sPECRELATIONTYPEREF != null : !SPECRELATIONTYPEREF_EDEFAULT.equals(sPECRELATIONTYPEREF);
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
		result.append(" (sPECRELATIONTYPEREF: ");
		result.append(sPECRELATIONTYPEREF);
		result.append(')');
		return result.toString();
	}

} //TYPEType7Impl
