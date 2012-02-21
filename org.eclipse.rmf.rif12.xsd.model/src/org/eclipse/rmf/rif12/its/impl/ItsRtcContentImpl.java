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

package org.eclipse.rmf.rif12.its.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.rmf.rif12.its.ItsPackage;
import org.eclipse.rmf.rif12.its.ItsRtcContent;
import org.eclipse.rmf.rif12.its.RtType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rtc Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.ItsRtcContentImpl#getRt <em>Rt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItsRtcContentImpl extends EObjectImpl implements ItsRtcContent {
	/**
	 * The cached value of the '{@link #getRt() <em>Rt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRt()
	 * @generated
	 * @ordered
	 */
	protected EList<RtType> rt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItsRtcContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItsPackage.Literals.ITS_RTC_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RtType> getRt() {
		if (rt == null) {
			rt = new EObjectContainmentEList<RtType>(RtType.class, this, ItsPackage.ITS_RTC_CONTENT__RT);
		}
		return rt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ItsPackage.ITS_RTC_CONTENT__RT:
				return ((InternalEList<?>)getRt()).basicRemove(otherEnd, msgs);
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
			case ItsPackage.ITS_RTC_CONTENT__RT:
				return getRt();
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
			case ItsPackage.ITS_RTC_CONTENT__RT:
				getRt().clear();
				getRt().addAll((Collection<? extends RtType>)newValue);
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
			case ItsPackage.ITS_RTC_CONTENT__RT:
				getRt().clear();
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
			case ItsPackage.ITS_RTC_CONTENT__RT:
				return rt != null && !rt.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ItsRtcContentImpl
