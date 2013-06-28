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
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TYPE Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType2Impl#getDATATYPEDEFINITIONINTEGERREF <em>DATATYPEDEFINITIONINTEGERREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TYPEType2Impl extends EObjectImpl implements TYPEType2 {
	/**
	 * The default value of the '{@link #getDATATYPEDEFINITIONINTEGERREF() <em>DATATYPEDEFINITIONINTEGERREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONINTEGERREF()
	 * @generated
	 * @ordered
	 */
	protected static final String DATATYPEDEFINITIONINTEGERREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDATATYPEDEFINITIONINTEGERREF() <em>DATATYPEDEFINITIONINTEGERREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONINTEGERREF()
	 * @generated
	 * @ordered
	 */
	protected String dATATYPEDEFINITIONINTEGERREF = DATATYPEDEFINITIONINTEGERREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TYPEType2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.TYPE_TYPE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDATATYPEDEFINITIONINTEGERREF() {
		return dATATYPEDEFINITIONINTEGERREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATATYPEDEFINITIONINTEGERREF(String newDATATYPEDEFINITIONINTEGERREF) {
		String oldDATATYPEDEFINITIONINTEGERREF = dATATYPEDEFINITIONINTEGERREF;
		dATATYPEDEFINITIONINTEGERREF = newDATATYPEDEFINITIONINTEGERREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.TYPE_TYPE2__DATATYPEDEFINITIONINTEGERREF, oldDATATYPEDEFINITIONINTEGERREF, dATATYPEDEFINITIONINTEGERREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyreqifPackage.TYPE_TYPE2__DATATYPEDEFINITIONINTEGERREF:
				return getDATATYPEDEFINITIONINTEGERREF();
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
			case MyreqifPackage.TYPE_TYPE2__DATATYPEDEFINITIONINTEGERREF:
				setDATATYPEDEFINITIONINTEGERREF((String)newValue);
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
			case MyreqifPackage.TYPE_TYPE2__DATATYPEDEFINITIONINTEGERREF:
				setDATATYPEDEFINITIONINTEGERREF(DATATYPEDEFINITIONINTEGERREF_EDEFAULT);
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
			case MyreqifPackage.TYPE_TYPE2__DATATYPEDEFINITIONINTEGERREF:
				return DATATYPEDEFINITIONINTEGERREF_EDEFAULT == null ? dATATYPEDEFINITIONINTEGERREF != null : !DATATYPEDEFINITIONINTEGERREF_EDEFAULT.equals(dATATYPEDEFINITIONINTEGERREF);
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
		result.append(" (dATATYPEDEFINITIONINTEGERREF: ");
		result.append(dATATYPEDEFINITIONINTEGERREF);
		result.append(')');
		return result.toString();
	}

} //TYPEType2Impl
