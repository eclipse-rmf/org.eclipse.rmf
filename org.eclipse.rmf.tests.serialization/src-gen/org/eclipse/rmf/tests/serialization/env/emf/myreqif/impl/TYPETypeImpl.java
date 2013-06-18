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
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TYPE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.TYPETypeImpl#getRELATIONGROUPTYPEREF <em>RELATIONGROUPTYPEREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TYPETypeImpl extends EObjectImpl implements TYPEType {
	/**
	 * The default value of the '{@link #getRELATIONGROUPTYPEREF() <em>RELATIONGROUPTYPEREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRELATIONGROUPTYPEREF()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATIONGROUPTYPEREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRELATIONGROUPTYPEREF() <em>RELATIONGROUPTYPEREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRELATIONGROUPTYPEREF()
	 * @generated
	 * @ordered
	 */
	protected String rELATIONGROUPTYPEREF = RELATIONGROUPTYPEREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TYPETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.TYPE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRELATIONGROUPTYPEREF() {
		return rELATIONGROUPTYPEREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRELATIONGROUPTYPEREF(String newRELATIONGROUPTYPEREF) {
		String oldRELATIONGROUPTYPEREF = rELATIONGROUPTYPEREF;
		rELATIONGROUPTYPEREF = newRELATIONGROUPTYPEREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.TYPE_TYPE__RELATIONGROUPTYPEREF, oldRELATIONGROUPTYPEREF, rELATIONGROUPTYPEREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyreqifPackage.TYPE_TYPE__RELATIONGROUPTYPEREF:
				return getRELATIONGROUPTYPEREF();
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
			case MyreqifPackage.TYPE_TYPE__RELATIONGROUPTYPEREF:
				setRELATIONGROUPTYPEREF((String)newValue);
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
			case MyreqifPackage.TYPE_TYPE__RELATIONGROUPTYPEREF:
				setRELATIONGROUPTYPEREF(RELATIONGROUPTYPEREF_EDEFAULT);
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
			case MyreqifPackage.TYPE_TYPE__RELATIONGROUPTYPEREF:
				return RELATIONGROUPTYPEREF_EDEFAULT == null ? rELATIONGROUPTYPEREF != null : !RELATIONGROUPTYPEREF_EDEFAULT.equals(rELATIONGROUPTYPEREF);
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
		result.append(" (rELATIONGROUPTYPEREF: ");
		result.append(rELATIONGROUPTYPEREF);
		result.append(')');
		return result.toString();
	}

} //TYPETypeImpl
