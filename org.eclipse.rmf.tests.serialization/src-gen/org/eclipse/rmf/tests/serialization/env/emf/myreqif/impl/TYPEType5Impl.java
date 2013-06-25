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
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType5;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TYPE Type5</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPEType5Impl#getDATATYPEDEFINITIONXHTMLREF <em>DATATYPEDEFINITIONXHTMLREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TYPEType5Impl extends EObjectImpl implements TYPEType5 {
	/**
	 * The default value of the '{@link #getDATATYPEDEFINITIONXHTMLREF() <em>DATATYPEDEFINITIONXHTMLREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONXHTMLREF()
	 * @generated
	 * @ordered
	 */
	protected static final String DATATYPEDEFINITIONXHTMLREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDATATYPEDEFINITIONXHTMLREF() <em>DATATYPEDEFINITIONXHTMLREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONXHTMLREF()
	 * @generated
	 * @ordered
	 */
	protected String dATATYPEDEFINITIONXHTMLREF = DATATYPEDEFINITIONXHTMLREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TYPEType5Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.TYPE_TYPE5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDATATYPEDEFINITIONXHTMLREF() {
		return dATATYPEDEFINITIONXHTMLREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATATYPEDEFINITIONXHTMLREF(String newDATATYPEDEFINITIONXHTMLREF) {
		String oldDATATYPEDEFINITIONXHTMLREF = dATATYPEDEFINITIONXHTMLREF;
		dATATYPEDEFINITIONXHTMLREF = newDATATYPEDEFINITIONXHTMLREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.TYPE_TYPE5__DATATYPEDEFINITIONXHTMLREF, oldDATATYPEDEFINITIONXHTMLREF, dATATYPEDEFINITIONXHTMLREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyreqifPackage.TYPE_TYPE5__DATATYPEDEFINITIONXHTMLREF:
				return getDATATYPEDEFINITIONXHTMLREF();
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
			case MyreqifPackage.TYPE_TYPE5__DATATYPEDEFINITIONXHTMLREF:
				setDATATYPEDEFINITIONXHTMLREF((String)newValue);
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
			case MyreqifPackage.TYPE_TYPE5__DATATYPEDEFINITIONXHTMLREF:
				setDATATYPEDEFINITIONXHTMLREF(DATATYPEDEFINITIONXHTMLREF_EDEFAULT);
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
			case MyreqifPackage.TYPE_TYPE5__DATATYPEDEFINITIONXHTMLREF:
				return DATATYPEDEFINITIONXHTMLREF_EDEFAULT == null ? dATATYPEDEFINITIONXHTMLREF != null : !DATATYPEDEFINITIONXHTMLREF_EDEFAULT.equals(dATATYPEDEFINITIONXHTMLREF);
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
		result.append(" (dATATYPEDEFINITIONXHTMLREF: ");
		result.append(dATATYPEDEFINITIONXHTMLREF);
		result.append(')');
		return result.toString();
	}

} //TYPEType5Impl
