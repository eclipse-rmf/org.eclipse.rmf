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

import org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONBOOLEAN;
import org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONDATE;
import org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONENUMERATION;
import org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONINTEGER;
import org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONREAL;
import org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONSTRING;
import org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONXHTML;
import org.eclipse.rmf.reqif10.xsd.DATATYPESType;
import org.eclipse.rmf.reqif10.xsd.ReqifPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DATATYPES Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.DATATYPESTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.DATATYPESTypeImpl#getDATATYPEDEFINITIONBOOLEAN <em>DATATYPEDEFINITIONBOOLEAN</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.DATATYPESTypeImpl#getDATATYPEDEFINITIONDATE <em>DATATYPEDEFINITIONDATE</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.DATATYPESTypeImpl#getDATATYPEDEFINITIONENUMERATION <em>DATATYPEDEFINITIONENUMERATION</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.DATATYPESTypeImpl#getDATATYPEDEFINITIONINTEGER <em>DATATYPEDEFINITIONINTEGER</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.DATATYPESTypeImpl#getDATATYPEDEFINITIONREAL <em>DATATYPEDEFINITIONREAL</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.DATATYPESTypeImpl#getDATATYPEDEFINITIONSTRING <em>DATATYPEDEFINITIONSTRING</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.DATATYPESTypeImpl#getDATATYPEDEFINITIONXHTML <em>DATATYPEDEFINITIONXHTML</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DATATYPESTypeImpl extends EObjectImpl implements DATATYPESType {
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
	protected DATATYPESTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqifPackage.Literals.DATATYPES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, ReqifPackage.DATATYPES_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DATATYPEDEFINITIONBOOLEAN> getDATATYPEDEFINITIONBOOLEAN() {
		return getGroup().list(ReqifPackage.Literals.DATATYPES_TYPE__DATATYPEDEFINITIONBOOLEAN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DATATYPEDEFINITIONDATE> getDATATYPEDEFINITIONDATE() {
		return getGroup().list(ReqifPackage.Literals.DATATYPES_TYPE__DATATYPEDEFINITIONDATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DATATYPEDEFINITIONENUMERATION> getDATATYPEDEFINITIONENUMERATION() {
		return getGroup().list(ReqifPackage.Literals.DATATYPES_TYPE__DATATYPEDEFINITIONENUMERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DATATYPEDEFINITIONINTEGER> getDATATYPEDEFINITIONINTEGER() {
		return getGroup().list(ReqifPackage.Literals.DATATYPES_TYPE__DATATYPEDEFINITIONINTEGER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DATATYPEDEFINITIONREAL> getDATATYPEDEFINITIONREAL() {
		return getGroup().list(ReqifPackage.Literals.DATATYPES_TYPE__DATATYPEDEFINITIONREAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DATATYPEDEFINITIONSTRING> getDATATYPEDEFINITIONSTRING() {
		return getGroup().list(ReqifPackage.Literals.DATATYPES_TYPE__DATATYPEDEFINITIONSTRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DATATYPEDEFINITIONXHTML> getDATATYPEDEFINITIONXHTML() {
		return getGroup().list(ReqifPackage.Literals.DATATYPES_TYPE__DATATYPEDEFINITIONXHTML);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReqifPackage.DATATYPES_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONBOOLEAN:
				return ((InternalEList<?>)getDATATYPEDEFINITIONBOOLEAN()).basicRemove(otherEnd, msgs);
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONDATE:
				return ((InternalEList<?>)getDATATYPEDEFINITIONDATE()).basicRemove(otherEnd, msgs);
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONENUMERATION:
				return ((InternalEList<?>)getDATATYPEDEFINITIONENUMERATION()).basicRemove(otherEnd, msgs);
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONINTEGER:
				return ((InternalEList<?>)getDATATYPEDEFINITIONINTEGER()).basicRemove(otherEnd, msgs);
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONREAL:
				return ((InternalEList<?>)getDATATYPEDEFINITIONREAL()).basicRemove(otherEnd, msgs);
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONSTRING:
				return ((InternalEList<?>)getDATATYPEDEFINITIONSTRING()).basicRemove(otherEnd, msgs);
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONXHTML:
				return ((InternalEList<?>)getDATATYPEDEFINITIONXHTML()).basicRemove(otherEnd, msgs);
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
			case ReqifPackage.DATATYPES_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONBOOLEAN:
				return getDATATYPEDEFINITIONBOOLEAN();
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONDATE:
				return getDATATYPEDEFINITIONDATE();
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONENUMERATION:
				return getDATATYPEDEFINITIONENUMERATION();
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONINTEGER:
				return getDATATYPEDEFINITIONINTEGER();
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONREAL:
				return getDATATYPEDEFINITIONREAL();
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONSTRING:
				return getDATATYPEDEFINITIONSTRING();
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONXHTML:
				return getDATATYPEDEFINITIONXHTML();
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
			case ReqifPackage.DATATYPES_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONBOOLEAN:
				getDATATYPEDEFINITIONBOOLEAN().clear();
				getDATATYPEDEFINITIONBOOLEAN().addAll((Collection<? extends DATATYPEDEFINITIONBOOLEAN>)newValue);
				return;
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONDATE:
				getDATATYPEDEFINITIONDATE().clear();
				getDATATYPEDEFINITIONDATE().addAll((Collection<? extends DATATYPEDEFINITIONDATE>)newValue);
				return;
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONENUMERATION:
				getDATATYPEDEFINITIONENUMERATION().clear();
				getDATATYPEDEFINITIONENUMERATION().addAll((Collection<? extends DATATYPEDEFINITIONENUMERATION>)newValue);
				return;
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONINTEGER:
				getDATATYPEDEFINITIONINTEGER().clear();
				getDATATYPEDEFINITIONINTEGER().addAll((Collection<? extends DATATYPEDEFINITIONINTEGER>)newValue);
				return;
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONREAL:
				getDATATYPEDEFINITIONREAL().clear();
				getDATATYPEDEFINITIONREAL().addAll((Collection<? extends DATATYPEDEFINITIONREAL>)newValue);
				return;
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONSTRING:
				getDATATYPEDEFINITIONSTRING().clear();
				getDATATYPEDEFINITIONSTRING().addAll((Collection<? extends DATATYPEDEFINITIONSTRING>)newValue);
				return;
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONXHTML:
				getDATATYPEDEFINITIONXHTML().clear();
				getDATATYPEDEFINITIONXHTML().addAll((Collection<? extends DATATYPEDEFINITIONXHTML>)newValue);
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
			case ReqifPackage.DATATYPES_TYPE__GROUP:
				getGroup().clear();
				return;
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONBOOLEAN:
				getDATATYPEDEFINITIONBOOLEAN().clear();
				return;
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONDATE:
				getDATATYPEDEFINITIONDATE().clear();
				return;
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONENUMERATION:
				getDATATYPEDEFINITIONENUMERATION().clear();
				return;
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONINTEGER:
				getDATATYPEDEFINITIONINTEGER().clear();
				return;
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONREAL:
				getDATATYPEDEFINITIONREAL().clear();
				return;
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONSTRING:
				getDATATYPEDEFINITIONSTRING().clear();
				return;
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONXHTML:
				getDATATYPEDEFINITIONXHTML().clear();
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
			case ReqifPackage.DATATYPES_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONBOOLEAN:
				return !getDATATYPEDEFINITIONBOOLEAN().isEmpty();
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONDATE:
				return !getDATATYPEDEFINITIONDATE().isEmpty();
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONENUMERATION:
				return !getDATATYPEDEFINITIONENUMERATION().isEmpty();
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONINTEGER:
				return !getDATATYPEDEFINITIONINTEGER().isEmpty();
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONREAL:
				return !getDATATYPEDEFINITIONREAL().isEmpty();
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONSTRING:
				return !getDATATYPEDEFINITIONSTRING().isEmpty();
			case ReqifPackage.DATATYPES_TYPE__DATATYPEDEFINITIONXHTML:
				return !getDATATYPEDEFINITIONXHTML().isEmpty();
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

} //DATATYPESTypeImpl
