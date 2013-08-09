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
package org.eclipse.rmf.tests.serialization.model.extnodes.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.rmf.tests.serialization.model.extnodes.ExtNodesPackage;
import org.eclipse.rmf.tests.serialization.model.extnodes.ExtendedNode;

import org.eclipse.rmf.tests.serialization.model.nodes.impl.SubNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.extnodes.impl.ExtendedNodeImpl#getAltenativeName <em>Altenative Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedNodeImpl extends SubNodeImpl implements ExtendedNode {
	/**
	 * The default value of the '{@link #getAltenativeName() <em>Altenative Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltenativeName()
	 * @generated
	 * @ordered
	 */
	protected static final String ALTENATIVE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAltenativeName() <em>Altenative Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltenativeName()
	 * @generated
	 * @ordered
	 */
	protected String altenativeName = ALTENATIVE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtendedNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtNodesPackage.Literals.EXTENDED_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAltenativeName() {
		return altenativeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltenativeName(String newAltenativeName) {
		String oldAltenativeName = altenativeName;
		altenativeName = newAltenativeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExtNodesPackage.EXTENDED_NODE__ALTENATIVE_NAME, oldAltenativeName, altenativeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtNodesPackage.EXTENDED_NODE__ALTENATIVE_NAME:
				return getAltenativeName();
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
			case ExtNodesPackage.EXTENDED_NODE__ALTENATIVE_NAME:
				setAltenativeName((String)newValue);
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
			case ExtNodesPackage.EXTENDED_NODE__ALTENATIVE_NAME:
				setAltenativeName(ALTENATIVE_NAME_EDEFAULT);
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
			case ExtNodesPackage.EXTENDED_NODE__ALTENATIVE_NAME:
				return ALTENATIVE_NAME_EDEFAULT == null ? altenativeName != null : !ALTENATIVE_NAME_EDEFAULT.equals(altenativeName);
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
		result.append(" (altenativeName: ");
		result.append(altenativeName);
		result.append(')');
		return result.toString();
	}

} //ExtendedNodeImpl
