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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ENUMVALUE;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFIEDVALUESType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SPECIFIEDVALUES Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECIFIEDVALUESTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECIFIEDVALUESTypeImpl#getENUMVALUE <em>ENUMVALUE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SPECIFIEDVALUESTypeImpl extends EObjectImpl implements SPECIFIEDVALUESType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SPECIFIEDVALUESTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.SPECIFIEDVALUES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, MyreqifPackage.SPECIFIEDVALUES_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ENUMVALUE> getENUMVALUE() {
		return getGroup().list(MyreqifPackage.Literals.SPECIFIEDVALUES_TYPE__ENUMVALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyreqifPackage.SPECIFIEDVALUES_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case MyreqifPackage.SPECIFIEDVALUES_TYPE__ENUMVALUE:
				return ((InternalEList<?>)getENUMVALUE()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyreqifPackage.SPECIFIEDVALUES_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case MyreqifPackage.SPECIFIEDVALUES_TYPE__ENUMVALUE:
				return getENUMVALUE();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MyreqifPackage.SPECIFIEDVALUES_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case MyreqifPackage.SPECIFIEDVALUES_TYPE__ENUMVALUE:
				getENUMVALUE().clear();
				getENUMVALUE().addAll((Collection<? extends ENUMVALUE>)newValue);
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
			case MyreqifPackage.SPECIFIEDVALUES_TYPE__GROUP:
				getGroup().clear();
				return;
			case MyreqifPackage.SPECIFIEDVALUES_TYPE__ENUMVALUE:
				getENUMVALUE().clear();
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
			case MyreqifPackage.SPECIFIEDVALUES_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case MyreqifPackage.SPECIFIEDVALUES_TYPE__ENUMVALUE:
				return !getENUMVALUE().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //SPECIFIEDVALUESTypeImpl
