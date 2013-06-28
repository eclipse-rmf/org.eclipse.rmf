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
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TYPE Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType1Impl#getSPECIFICATIONTYPEREF <em>SPECIFICATIONTYPEREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TYPEType1Impl extends EObjectImpl implements TYPEType1 {
	/**
	 * The default value of the '{@link #getSPECIFICATIONTYPEREF() <em>SPECIFICATIONTYPEREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECIFICATIONTYPEREF()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFICATIONTYPEREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPECIFICATIONTYPEREF() <em>SPECIFICATIONTYPEREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECIFICATIONTYPEREF()
	 * @generated
	 * @ordered
	 */
	protected String sPECIFICATIONTYPEREF = SPECIFICATIONTYPEREF_EDEFAULT;

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
		return MyreqifPackage.Literals.TYPE_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSPECIFICATIONTYPEREF() {
		return sPECIFICATIONTYPEREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECIFICATIONTYPEREF(String newSPECIFICATIONTYPEREF) {
		String oldSPECIFICATIONTYPEREF = sPECIFICATIONTYPEREF;
		sPECIFICATIONTYPEREF = newSPECIFICATIONTYPEREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.TYPE_TYPE1__SPECIFICATIONTYPEREF, oldSPECIFICATIONTYPEREF, sPECIFICATIONTYPEREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyreqifPackage.TYPE_TYPE1__SPECIFICATIONTYPEREF:
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
			case MyreqifPackage.TYPE_TYPE1__SPECIFICATIONTYPEREF:
				setSPECIFICATIONTYPEREF((String)newValue);
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
			case MyreqifPackage.TYPE_TYPE1__SPECIFICATIONTYPEREF:
				setSPECIFICATIONTYPEREF(SPECIFICATIONTYPEREF_EDEFAULT);
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
			case MyreqifPackage.TYPE_TYPE1__SPECIFICATIONTYPEREF:
				return SPECIFICATIONTYPEREF_EDEFAULT == null ? sPECIFICATIONTYPEREF != null : !SPECIFICATIONTYPEREF_EDEFAULT.equals(sPECIFICATIONTYPEREF);
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
		result.append(" (sPECIFICATIONTYPEREF: ");
		result.append(sPECIFICATIONTYPEREF);
		result.append(')');
		return result.toString();
	}

} //TYPEType1Impl
