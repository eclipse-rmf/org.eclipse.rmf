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

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEBOOLEAN;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEDATE;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEENUMERATION;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEINTEGER;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEREAL;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUESTRING;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VALUES Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.VALUESTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.VALUESTypeImpl#getATTRIBUTEVALUEBOOLEAN <em>ATTRIBUTEVALUEBOOLEAN</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.VALUESTypeImpl#getATTRIBUTEVALUEDATE <em>ATTRIBUTEVALUEDATE</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.VALUESTypeImpl#getATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.VALUESTypeImpl#getATTRIBUTEVALUEINTEGER <em>ATTRIBUTEVALUEINTEGER</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.VALUESTypeImpl#getATTRIBUTEVALUEREAL <em>ATTRIBUTEVALUEREAL</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.VALUESTypeImpl#getATTRIBUTEVALUESTRING <em>ATTRIBUTEVALUESTRING</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.VALUESTypeImpl#getATTRIBUTEVALUEXHTML <em>ATTRIBUTEVALUEXHTML</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VALUESTypeImpl extends EObjectImpl implements VALUESType {
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
	protected VALUESTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.VALUES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, MyreqifPackage.VALUES_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEVALUEBOOLEAN> getATTRIBUTEVALUEBOOLEAN() {
		return getGroup().list(MyreqifPackage.Literals.VALUES_TYPE__ATTRIBUTEVALUEBOOLEAN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEVALUEDATE> getATTRIBUTEVALUEDATE() {
		return getGroup().list(MyreqifPackage.Literals.VALUES_TYPE__ATTRIBUTEVALUEDATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEVALUEENUMERATION> getATTRIBUTEVALUEENUMERATION() {
		return getGroup().list(MyreqifPackage.Literals.VALUES_TYPE__ATTRIBUTEVALUEENUMERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEVALUEINTEGER> getATTRIBUTEVALUEINTEGER() {
		return getGroup().list(MyreqifPackage.Literals.VALUES_TYPE__ATTRIBUTEVALUEINTEGER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEVALUEREAL> getATTRIBUTEVALUEREAL() {
		return getGroup().list(MyreqifPackage.Literals.VALUES_TYPE__ATTRIBUTEVALUEREAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEVALUESTRING> getATTRIBUTEVALUESTRING() {
		return getGroup().list(MyreqifPackage.Literals.VALUES_TYPE__ATTRIBUTEVALUESTRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEVALUEXHTML> getATTRIBUTEVALUEXHTML() {
		return getGroup().list(MyreqifPackage.Literals.VALUES_TYPE__ATTRIBUTEVALUEXHTML);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyreqifPackage.VALUES_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEBOOLEAN:
				return ((InternalEList<?>)getATTRIBUTEVALUEBOOLEAN()).basicRemove(otherEnd, msgs);
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEDATE:
				return ((InternalEList<?>)getATTRIBUTEVALUEDATE()).basicRemove(otherEnd, msgs);
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEENUMERATION:
				return ((InternalEList<?>)getATTRIBUTEVALUEENUMERATION()).basicRemove(otherEnd, msgs);
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEINTEGER:
				return ((InternalEList<?>)getATTRIBUTEVALUEINTEGER()).basicRemove(otherEnd, msgs);
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEREAL:
				return ((InternalEList<?>)getATTRIBUTEVALUEREAL()).basicRemove(otherEnd, msgs);
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUESTRING:
				return ((InternalEList<?>)getATTRIBUTEVALUESTRING()).basicRemove(otherEnd, msgs);
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEXHTML:
				return ((InternalEList<?>)getATTRIBUTEVALUEXHTML()).basicRemove(otherEnd, msgs);
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
			case MyreqifPackage.VALUES_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEBOOLEAN:
				return getATTRIBUTEVALUEBOOLEAN();
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEDATE:
				return getATTRIBUTEVALUEDATE();
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEENUMERATION:
				return getATTRIBUTEVALUEENUMERATION();
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEINTEGER:
				return getATTRIBUTEVALUEINTEGER();
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEREAL:
				return getATTRIBUTEVALUEREAL();
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUESTRING:
				return getATTRIBUTEVALUESTRING();
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEXHTML:
				return getATTRIBUTEVALUEXHTML();
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
			case MyreqifPackage.VALUES_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEBOOLEAN:
				getATTRIBUTEVALUEBOOLEAN().clear();
				getATTRIBUTEVALUEBOOLEAN().addAll((Collection<? extends ATTRIBUTEVALUEBOOLEAN>)newValue);
				return;
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEDATE:
				getATTRIBUTEVALUEDATE().clear();
				getATTRIBUTEVALUEDATE().addAll((Collection<? extends ATTRIBUTEVALUEDATE>)newValue);
				return;
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEENUMERATION:
				getATTRIBUTEVALUEENUMERATION().clear();
				getATTRIBUTEVALUEENUMERATION().addAll((Collection<? extends ATTRIBUTEVALUEENUMERATION>)newValue);
				return;
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEINTEGER:
				getATTRIBUTEVALUEINTEGER().clear();
				getATTRIBUTEVALUEINTEGER().addAll((Collection<? extends ATTRIBUTEVALUEINTEGER>)newValue);
				return;
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEREAL:
				getATTRIBUTEVALUEREAL().clear();
				getATTRIBUTEVALUEREAL().addAll((Collection<? extends ATTRIBUTEVALUEREAL>)newValue);
				return;
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUESTRING:
				getATTRIBUTEVALUESTRING().clear();
				getATTRIBUTEVALUESTRING().addAll((Collection<? extends ATTRIBUTEVALUESTRING>)newValue);
				return;
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEXHTML:
				getATTRIBUTEVALUEXHTML().clear();
				getATTRIBUTEVALUEXHTML().addAll((Collection<? extends ATTRIBUTEVALUEXHTML>)newValue);
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
			case MyreqifPackage.VALUES_TYPE__GROUP:
				getGroup().clear();
				return;
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEBOOLEAN:
				getATTRIBUTEVALUEBOOLEAN().clear();
				return;
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEDATE:
				getATTRIBUTEVALUEDATE().clear();
				return;
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEENUMERATION:
				getATTRIBUTEVALUEENUMERATION().clear();
				return;
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEINTEGER:
				getATTRIBUTEVALUEINTEGER().clear();
				return;
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEREAL:
				getATTRIBUTEVALUEREAL().clear();
				return;
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUESTRING:
				getATTRIBUTEVALUESTRING().clear();
				return;
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEXHTML:
				getATTRIBUTEVALUEXHTML().clear();
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
			case MyreqifPackage.VALUES_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEBOOLEAN:
				return !getATTRIBUTEVALUEBOOLEAN().isEmpty();
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEDATE:
				return !getATTRIBUTEVALUEDATE().isEmpty();
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEENUMERATION:
				return !getATTRIBUTEVALUEENUMERATION().isEmpty();
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEINTEGER:
				return !getATTRIBUTEVALUEINTEGER().isEmpty();
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEREAL:
				return !getATTRIBUTEVALUEREAL().isEmpty();
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUESTRING:
				return !getATTRIBUTEVALUESTRING().isEmpty();
			case MyreqifPackage.VALUES_TYPE__ATTRIBUTEVALUEXHTML:
				return !getATTRIBUTEVALUEXHTML().isEmpty();
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

} //VALUESTypeImpl
