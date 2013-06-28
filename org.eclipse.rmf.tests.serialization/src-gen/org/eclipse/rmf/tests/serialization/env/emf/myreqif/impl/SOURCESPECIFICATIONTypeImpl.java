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
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.SOURCESPECIFICATIONType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SOURCESPECIFICATION Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SOURCESPECIFICATIONTypeImpl#getSPECIFICATIONREF <em>SPECIFICATIONREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SOURCESPECIFICATIONTypeImpl extends EObjectImpl implements SOURCESPECIFICATIONType {
	/**
	 * The default value of the '{@link #getSPECIFICATIONREF() <em>SPECIFICATIONREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECIFICATIONREF()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFICATIONREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSPECIFICATIONREF() <em>SPECIFICATIONREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECIFICATIONREF()
	 * @generated
	 * @ordered
	 */
	protected String sPECIFICATIONREF = SPECIFICATIONREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SOURCESPECIFICATIONTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.SOURCESPECIFICATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSPECIFICATIONREF() {
		return sPECIFICATIONREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECIFICATIONREF(String newSPECIFICATIONREF) {
		String oldSPECIFICATIONREF = sPECIFICATIONREF;
		sPECIFICATIONREF = newSPECIFICATIONREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.SOURCESPECIFICATION_TYPE__SPECIFICATIONREF, oldSPECIFICATIONREF, sPECIFICATIONREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyreqifPackage.SOURCESPECIFICATION_TYPE__SPECIFICATIONREF:
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
			case MyreqifPackage.SOURCESPECIFICATION_TYPE__SPECIFICATIONREF:
				setSPECIFICATIONREF((String)newValue);
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
			case MyreqifPackage.SOURCESPECIFICATION_TYPE__SPECIFICATIONREF:
				setSPECIFICATIONREF(SPECIFICATIONREF_EDEFAULT);
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
			case MyreqifPackage.SOURCESPECIFICATION_TYPE__SPECIFICATIONREF:
				return SPECIFICATIONREF_EDEFAULT == null ? sPECIFICATIONREF != null : !SPECIFICATIONREF_EDEFAULT.equals(sPECIFICATIONREF);
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
		result.append(" (sPECIFICATIONREF: ");
		result.append(sPECIFICATIONREF);
		result.append(')');
		return result.toString();
	}

} //SOURCESPECIFICATIONTypeImpl
