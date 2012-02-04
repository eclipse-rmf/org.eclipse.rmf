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

package org.eclipse.rmf.reqif10.xsd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONBOOLEAN;
import org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONDATE;
import org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONENUMERATION;
import org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONINTEGER;
import org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONREAL;
import org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONSTRING;
import org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONXHTML;
import org.eclipse.rmf.reqif10.xsd.ReqifPackage;
import org.eclipse.rmf.reqif10.xsd.SPECATTRIBUTESType3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SPECATTRIBUTES Type3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.SPECATTRIBUTESType3Impl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.SPECATTRIBUTESType3Impl#getATTRIBUTEDEFINITIONBOOLEAN <em>ATTRIBUTEDEFINITIONBOOLEAN</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.SPECATTRIBUTESType3Impl#getATTRIBUTEDEFINITIONDATE <em>ATTRIBUTEDEFINITIONDATE</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.SPECATTRIBUTESType3Impl#getATTRIBUTEDEFINITIONENUMERATION <em>ATTRIBUTEDEFINITIONENUMERATION</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.SPECATTRIBUTESType3Impl#getATTRIBUTEDEFINITIONINTEGER <em>ATTRIBUTEDEFINITIONINTEGER</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.SPECATTRIBUTESType3Impl#getATTRIBUTEDEFINITIONREAL <em>ATTRIBUTEDEFINITIONREAL</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.SPECATTRIBUTESType3Impl#getATTRIBUTEDEFINITIONSTRING <em>ATTRIBUTEDEFINITIONSTRING</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.SPECATTRIBUTESType3Impl#getATTRIBUTEDEFINITIONXHTML <em>ATTRIBUTEDEFINITIONXHTML</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SPECATTRIBUTESType3Impl extends EObjectImpl implements SPECATTRIBUTESType3 {
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
	protected SPECATTRIBUTESType3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqifPackage.Literals.SPECATTRIBUTES_TYPE3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, ReqifPackage.SPECATTRIBUTES_TYPE3__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEDEFINITIONBOOLEAN> getATTRIBUTEDEFINITIONBOOLEAN() {
		return getGroup().list(ReqifPackage.Literals.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONBOOLEAN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEDEFINITIONDATE> getATTRIBUTEDEFINITIONDATE() {
		return getGroup().list(ReqifPackage.Literals.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONDATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEDEFINITIONENUMERATION> getATTRIBUTEDEFINITIONENUMERATION() {
		return getGroup().list(ReqifPackage.Literals.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONENUMERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEDEFINITIONINTEGER> getATTRIBUTEDEFINITIONINTEGER() {
		return getGroup().list(ReqifPackage.Literals.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONINTEGER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEDEFINITIONREAL> getATTRIBUTEDEFINITIONREAL() {
		return getGroup().list(ReqifPackage.Literals.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONREAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEDEFINITIONSTRING> getATTRIBUTEDEFINITIONSTRING() {
		return getGroup().list(ReqifPackage.Literals.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONSTRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEDEFINITIONXHTML> getATTRIBUTEDEFINITIONXHTML() {
		return getGroup().list(ReqifPackage.Literals.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONXHTML);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReqifPackage.SPECATTRIBUTES_TYPE3__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONBOOLEAN:
				return ((InternalEList<?>)getATTRIBUTEDEFINITIONBOOLEAN()).basicRemove(otherEnd, msgs);
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONDATE:
				return ((InternalEList<?>)getATTRIBUTEDEFINITIONDATE()).basicRemove(otherEnd, msgs);
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONENUMERATION:
				return ((InternalEList<?>)getATTRIBUTEDEFINITIONENUMERATION()).basicRemove(otherEnd, msgs);
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONINTEGER:
				return ((InternalEList<?>)getATTRIBUTEDEFINITIONINTEGER()).basicRemove(otherEnd, msgs);
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONREAL:
				return ((InternalEList<?>)getATTRIBUTEDEFINITIONREAL()).basicRemove(otherEnd, msgs);
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONSTRING:
				return ((InternalEList<?>)getATTRIBUTEDEFINITIONSTRING()).basicRemove(otherEnd, msgs);
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONXHTML:
				return ((InternalEList<?>)getATTRIBUTEDEFINITIONXHTML()).basicRemove(otherEnd, msgs);
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
			case ReqifPackage.SPECATTRIBUTES_TYPE3__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONBOOLEAN:
				return getATTRIBUTEDEFINITIONBOOLEAN();
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONDATE:
				return getATTRIBUTEDEFINITIONDATE();
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONENUMERATION:
				return getATTRIBUTEDEFINITIONENUMERATION();
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONINTEGER:
				return getATTRIBUTEDEFINITIONINTEGER();
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONREAL:
				return getATTRIBUTEDEFINITIONREAL();
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONSTRING:
				return getATTRIBUTEDEFINITIONSTRING();
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONXHTML:
				return getATTRIBUTEDEFINITIONXHTML();
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
			case ReqifPackage.SPECATTRIBUTES_TYPE3__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONBOOLEAN:
				getATTRIBUTEDEFINITIONBOOLEAN().clear();
				getATTRIBUTEDEFINITIONBOOLEAN().addAll((Collection<? extends ATTRIBUTEDEFINITIONBOOLEAN>)newValue);
				return;
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONDATE:
				getATTRIBUTEDEFINITIONDATE().clear();
				getATTRIBUTEDEFINITIONDATE().addAll((Collection<? extends ATTRIBUTEDEFINITIONDATE>)newValue);
				return;
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONENUMERATION:
				getATTRIBUTEDEFINITIONENUMERATION().clear();
				getATTRIBUTEDEFINITIONENUMERATION().addAll((Collection<? extends ATTRIBUTEDEFINITIONENUMERATION>)newValue);
				return;
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONINTEGER:
				getATTRIBUTEDEFINITIONINTEGER().clear();
				getATTRIBUTEDEFINITIONINTEGER().addAll((Collection<? extends ATTRIBUTEDEFINITIONINTEGER>)newValue);
				return;
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONREAL:
				getATTRIBUTEDEFINITIONREAL().clear();
				getATTRIBUTEDEFINITIONREAL().addAll((Collection<? extends ATTRIBUTEDEFINITIONREAL>)newValue);
				return;
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONSTRING:
				getATTRIBUTEDEFINITIONSTRING().clear();
				getATTRIBUTEDEFINITIONSTRING().addAll((Collection<? extends ATTRIBUTEDEFINITIONSTRING>)newValue);
				return;
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONXHTML:
				getATTRIBUTEDEFINITIONXHTML().clear();
				getATTRIBUTEDEFINITIONXHTML().addAll((Collection<? extends ATTRIBUTEDEFINITIONXHTML>)newValue);
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
			case ReqifPackage.SPECATTRIBUTES_TYPE3__GROUP:
				getGroup().clear();
				return;
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONBOOLEAN:
				getATTRIBUTEDEFINITIONBOOLEAN().clear();
				return;
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONDATE:
				getATTRIBUTEDEFINITIONDATE().clear();
				return;
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONENUMERATION:
				getATTRIBUTEDEFINITIONENUMERATION().clear();
				return;
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONINTEGER:
				getATTRIBUTEDEFINITIONINTEGER().clear();
				return;
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONREAL:
				getATTRIBUTEDEFINITIONREAL().clear();
				return;
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONSTRING:
				getATTRIBUTEDEFINITIONSTRING().clear();
				return;
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONXHTML:
				getATTRIBUTEDEFINITIONXHTML().clear();
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
			case ReqifPackage.SPECATTRIBUTES_TYPE3__GROUP:
				return group != null && !group.isEmpty();
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONBOOLEAN:
				return !getATTRIBUTEDEFINITIONBOOLEAN().isEmpty();
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONDATE:
				return !getATTRIBUTEDEFINITIONDATE().isEmpty();
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONENUMERATION:
				return !getATTRIBUTEDEFINITIONENUMERATION().isEmpty();
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONINTEGER:
				return !getATTRIBUTEDEFINITIONINTEGER().isEmpty();
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONREAL:
				return !getATTRIBUTEDEFINITIONREAL().isEmpty();
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONSTRING:
				return !getATTRIBUTEDEFINITIONSTRING().isEmpty();
			case ReqifPackage.SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONXHTML:
				return !getATTRIBUTEDEFINITIONXHTML().isEmpty();
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

} //SPECATTRIBUTESType3Impl
