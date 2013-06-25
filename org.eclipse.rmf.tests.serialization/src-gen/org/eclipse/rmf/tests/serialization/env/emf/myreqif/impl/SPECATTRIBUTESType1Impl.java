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

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SPECATTRIBUTES Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECATTRIBUTESType1Impl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECATTRIBUTESType1Impl#getATTRIBUTEDEFINITIONBOOLEAN <em>ATTRIBUTEDEFINITIONBOOLEAN</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECATTRIBUTESType1Impl#getATTRIBUTEDEFINITIONDATE <em>ATTRIBUTEDEFINITIONDATE</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECATTRIBUTESType1Impl#getATTRIBUTEDEFINITIONENUMERATION <em>ATTRIBUTEDEFINITIONENUMERATION</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECATTRIBUTESType1Impl#getATTRIBUTEDEFINITIONINTEGER <em>ATTRIBUTEDEFINITIONINTEGER</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECATTRIBUTESType1Impl#getATTRIBUTEDEFINITIONREAL <em>ATTRIBUTEDEFINITIONREAL</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECATTRIBUTESType1Impl#getATTRIBUTEDEFINITIONSTRING <em>ATTRIBUTEDEFINITIONSTRING</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECATTRIBUTESType1Impl#getATTRIBUTEDEFINITIONXHTML <em>ATTRIBUTEDEFINITIONXHTML</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SPECATTRIBUTESType1Impl extends EObjectImpl implements SPECATTRIBUTESType1 {
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
	protected SPECATTRIBUTESType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.SPECATTRIBUTES_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, MyreqifPackage.SPECATTRIBUTES_TYPE1__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEDEFINITIONBOOLEAN> getATTRIBUTEDEFINITIONBOOLEAN() {
		return getGroup().list(MyreqifPackage.Literals.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONBOOLEAN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEDEFINITIONDATE> getATTRIBUTEDEFINITIONDATE() {
		return getGroup().list(MyreqifPackage.Literals.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONDATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEDEFINITIONENUMERATION> getATTRIBUTEDEFINITIONENUMERATION() {
		return getGroup().list(MyreqifPackage.Literals.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONENUMERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEDEFINITIONINTEGER> getATTRIBUTEDEFINITIONINTEGER() {
		return getGroup().list(MyreqifPackage.Literals.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONINTEGER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEDEFINITIONREAL> getATTRIBUTEDEFINITIONREAL() {
		return getGroup().list(MyreqifPackage.Literals.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONREAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEDEFINITIONSTRING> getATTRIBUTEDEFINITIONSTRING() {
		return getGroup().list(MyreqifPackage.Literals.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONSTRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEDEFINITIONXHTML> getATTRIBUTEDEFINITIONXHTML() {
		return getGroup().list(MyreqifPackage.Literals.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONXHTML);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONBOOLEAN:
				return ((InternalEList<?>)getATTRIBUTEDEFINITIONBOOLEAN()).basicRemove(otherEnd, msgs);
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONDATE:
				return ((InternalEList<?>)getATTRIBUTEDEFINITIONDATE()).basicRemove(otherEnd, msgs);
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONENUMERATION:
				return ((InternalEList<?>)getATTRIBUTEDEFINITIONENUMERATION()).basicRemove(otherEnd, msgs);
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONINTEGER:
				return ((InternalEList<?>)getATTRIBUTEDEFINITIONINTEGER()).basicRemove(otherEnd, msgs);
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONREAL:
				return ((InternalEList<?>)getATTRIBUTEDEFINITIONREAL()).basicRemove(otherEnd, msgs);
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONSTRING:
				return ((InternalEList<?>)getATTRIBUTEDEFINITIONSTRING()).basicRemove(otherEnd, msgs);
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONXHTML:
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
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONBOOLEAN:
				return getATTRIBUTEDEFINITIONBOOLEAN();
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONDATE:
				return getATTRIBUTEDEFINITIONDATE();
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONENUMERATION:
				return getATTRIBUTEDEFINITIONENUMERATION();
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONINTEGER:
				return getATTRIBUTEDEFINITIONINTEGER();
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONREAL:
				return getATTRIBUTEDEFINITIONREAL();
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONSTRING:
				return getATTRIBUTEDEFINITIONSTRING();
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONXHTML:
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
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONBOOLEAN:
				getATTRIBUTEDEFINITIONBOOLEAN().clear();
				getATTRIBUTEDEFINITIONBOOLEAN().addAll((Collection<? extends ATTRIBUTEDEFINITIONBOOLEAN>)newValue);
				return;
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONDATE:
				getATTRIBUTEDEFINITIONDATE().clear();
				getATTRIBUTEDEFINITIONDATE().addAll((Collection<? extends ATTRIBUTEDEFINITIONDATE>)newValue);
				return;
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONENUMERATION:
				getATTRIBUTEDEFINITIONENUMERATION().clear();
				getATTRIBUTEDEFINITIONENUMERATION().addAll((Collection<? extends ATTRIBUTEDEFINITIONENUMERATION>)newValue);
				return;
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONINTEGER:
				getATTRIBUTEDEFINITIONINTEGER().clear();
				getATTRIBUTEDEFINITIONINTEGER().addAll((Collection<? extends ATTRIBUTEDEFINITIONINTEGER>)newValue);
				return;
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONREAL:
				getATTRIBUTEDEFINITIONREAL().clear();
				getATTRIBUTEDEFINITIONREAL().addAll((Collection<? extends ATTRIBUTEDEFINITIONREAL>)newValue);
				return;
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONSTRING:
				getATTRIBUTEDEFINITIONSTRING().clear();
				getATTRIBUTEDEFINITIONSTRING().addAll((Collection<? extends ATTRIBUTEDEFINITIONSTRING>)newValue);
				return;
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONXHTML:
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
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__GROUP:
				getGroup().clear();
				return;
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONBOOLEAN:
				getATTRIBUTEDEFINITIONBOOLEAN().clear();
				return;
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONDATE:
				getATTRIBUTEDEFINITIONDATE().clear();
				return;
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONENUMERATION:
				getATTRIBUTEDEFINITIONENUMERATION().clear();
				return;
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONINTEGER:
				getATTRIBUTEDEFINITIONINTEGER().clear();
				return;
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONREAL:
				getATTRIBUTEDEFINITIONREAL().clear();
				return;
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONSTRING:
				getATTRIBUTEDEFINITIONSTRING().clear();
				return;
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONXHTML:
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
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__GROUP:
				return group != null && !group.isEmpty();
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONBOOLEAN:
				return !getATTRIBUTEDEFINITIONBOOLEAN().isEmpty();
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONDATE:
				return !getATTRIBUTEDEFINITIONDATE().isEmpty();
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONENUMERATION:
				return !getATTRIBUTEDEFINITIONENUMERATION().isEmpty();
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONINTEGER:
				return !getATTRIBUTEDEFINITIONINTEGER().isEmpty();
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONREAL:
				return !getATTRIBUTEDEFINITIONREAL().isEmpty();
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONSTRING:
				return !getATTRIBUTEDEFINITIONSTRING().isEmpty();
			case MyreqifPackage.SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONXHTML:
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

} //SPECATTRIBUTESType1Impl
