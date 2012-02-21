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

package org.eclipse.rmf.rif12.xsd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.rmf.rif12.xsd.RifPackage;
import org.eclipse.rmf.rif12.xsd.SPECHIERARCHYROOT;
import org.eclipse.rmf.rif12.xsd.SPECHIERARCHYROOTSType1;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SPECHIERARCHYROOTS Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.SPECHIERARCHYROOTSType1Impl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.SPECHIERARCHYROOTSType1Impl#getSPECHIERARCHYROOT <em>SPECHIERARCHYROOT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SPECHIERARCHYROOTSType1Impl extends EObjectImpl implements SPECHIERARCHYROOTSType1 {
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
	protected SPECHIERARCHYROOTSType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.SPECHIERARCHYROOTS_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, RifPackage.SPECHIERARCHYROOTS_TYPE1__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SPECHIERARCHYROOT> getSPECHIERARCHYROOT() {
		return getGroup().list(RifPackage.Literals.SPECHIERARCHYROOTS_TYPE1__SPECHIERARCHYROOT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RifPackage.SPECHIERARCHYROOTS_TYPE1__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case RifPackage.SPECHIERARCHYROOTS_TYPE1__SPECHIERARCHYROOT:
				return ((InternalEList<?>)getSPECHIERARCHYROOT()).basicRemove(otherEnd, msgs);
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
			case RifPackage.SPECHIERARCHYROOTS_TYPE1__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case RifPackage.SPECHIERARCHYROOTS_TYPE1__SPECHIERARCHYROOT:
				return getSPECHIERARCHYROOT();
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
			case RifPackage.SPECHIERARCHYROOTS_TYPE1__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case RifPackage.SPECHIERARCHYROOTS_TYPE1__SPECHIERARCHYROOT:
				getSPECHIERARCHYROOT().clear();
				getSPECHIERARCHYROOT().addAll((Collection<? extends SPECHIERARCHYROOT>)newValue);
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
			case RifPackage.SPECHIERARCHYROOTS_TYPE1__GROUP:
				getGroup().clear();
				return;
			case RifPackage.SPECHIERARCHYROOTS_TYPE1__SPECHIERARCHYROOT:
				getSPECHIERARCHYROOT().clear();
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
			case RifPackage.SPECHIERARCHYROOTS_TYPE1__GROUP:
				return group != null && !group.isEmpty();
			case RifPackage.SPECHIERARCHYROOTS_TYPE1__SPECHIERARCHYROOT:
				return !getSPECHIERARCHYROOT().isEmpty();
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

} //SPECHIERARCHYROOTSType1Impl
