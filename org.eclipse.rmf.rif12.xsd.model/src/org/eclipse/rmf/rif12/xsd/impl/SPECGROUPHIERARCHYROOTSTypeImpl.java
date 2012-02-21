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
import org.eclipse.rmf.rif12.xsd.SPECGROUPHIERARCHYROOT;
import org.eclipse.rmf.rif12.xsd.SPECGROUPHIERARCHYROOTSType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SPECGROUPHIERARCHYROOTS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.SPECGROUPHIERARCHYROOTSTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.SPECGROUPHIERARCHYROOTSTypeImpl#getSPECGROUPHIERARCHYROOT <em>SPECGROUPHIERARCHYROOT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SPECGROUPHIERARCHYROOTSTypeImpl extends EObjectImpl implements SPECGROUPHIERARCHYROOTSType {
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
	protected SPECGROUPHIERARCHYROOTSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.SPECGROUPHIERARCHYROOTS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, RifPackage.SPECGROUPHIERARCHYROOTS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SPECGROUPHIERARCHYROOT> getSPECGROUPHIERARCHYROOT() {
		return getGroup().list(RifPackage.Literals.SPECGROUPHIERARCHYROOTS_TYPE__SPECGROUPHIERARCHYROOT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RifPackage.SPECGROUPHIERARCHYROOTS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case RifPackage.SPECGROUPHIERARCHYROOTS_TYPE__SPECGROUPHIERARCHYROOT:
				return ((InternalEList<?>)getSPECGROUPHIERARCHYROOT()).basicRemove(otherEnd, msgs);
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
			case RifPackage.SPECGROUPHIERARCHYROOTS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case RifPackage.SPECGROUPHIERARCHYROOTS_TYPE__SPECGROUPHIERARCHYROOT:
				return getSPECGROUPHIERARCHYROOT();
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
			case RifPackage.SPECGROUPHIERARCHYROOTS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case RifPackage.SPECGROUPHIERARCHYROOTS_TYPE__SPECGROUPHIERARCHYROOT:
				getSPECGROUPHIERARCHYROOT().clear();
				getSPECGROUPHIERARCHYROOT().addAll((Collection<? extends SPECGROUPHIERARCHYROOT>)newValue);
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
			case RifPackage.SPECGROUPHIERARCHYROOTS_TYPE__GROUP:
				getGroup().clear();
				return;
			case RifPackage.SPECGROUPHIERARCHYROOTS_TYPE__SPECGROUPHIERARCHYROOT:
				getSPECGROUPHIERARCHYROOT().clear();
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
			case RifPackage.SPECGROUPHIERARCHYROOTS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case RifPackage.SPECGROUPHIERARCHYROOTS_TYPE__SPECGROUPHIERARCHYROOT:
				return !getSPECGROUPHIERARCHYROOT().isEmpty();
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

} //SPECGROUPHIERARCHYROOTSTypeImpl
