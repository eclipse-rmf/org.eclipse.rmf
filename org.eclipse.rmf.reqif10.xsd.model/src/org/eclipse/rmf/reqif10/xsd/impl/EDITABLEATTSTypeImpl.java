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
import org.eclipse.rmf.reqif10.xsd.EDITABLEATTSType;
import org.eclipse.rmf.reqif10.xsd.ReqifPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDITABLEATTS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.EDITABLEATTSTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.EDITABLEATTSTypeImpl#getATTRIBUTEDEFINITIONBOOLEANREF <em>ATTRIBUTEDEFINITIONBOOLEANREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.EDITABLEATTSTypeImpl#getATTRIBUTEDEFINITIONDATEREF <em>ATTRIBUTEDEFINITIONDATEREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.EDITABLEATTSTypeImpl#getATTRIBUTEDEFINITIONENUMERATIONREF <em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.EDITABLEATTSTypeImpl#getATTRIBUTEDEFINITIONINTEGERREF <em>ATTRIBUTEDEFINITIONINTEGERREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.EDITABLEATTSTypeImpl#getATTRIBUTEDEFINITIONREALREF <em>ATTRIBUTEDEFINITIONREALREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.EDITABLEATTSTypeImpl#getATTRIBUTEDEFINITIONSTRINGREF <em>ATTRIBUTEDEFINITIONSTRINGREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.EDITABLEATTSTypeImpl#getATTRIBUTEDEFINITIONXHTMLREF <em>ATTRIBUTEDEFINITIONXHTMLREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EDITABLEATTSTypeImpl extends EObjectImpl implements EDITABLEATTSType {
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
	protected EDITABLEATTSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqifPackage.Literals.EDITABLEATTS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, ReqifPackage.EDITABLEATTS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEDEFINITIONBOOLEAN> getATTRIBUTEDEFINITIONBOOLEANREF() {
		return getGroup().list(ReqifPackage.Literals.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONBOOLEANREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEDEFINITIONDATE> getATTRIBUTEDEFINITIONDATEREF() {
		return getGroup().list(ReqifPackage.Literals.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONDATEREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEDEFINITIONENUMERATION> getATTRIBUTEDEFINITIONENUMERATIONREF() {
		return getGroup().list(ReqifPackage.Literals.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONENUMERATIONREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEDEFINITIONINTEGER> getATTRIBUTEDEFINITIONINTEGERREF() {
		return getGroup().list(ReqifPackage.Literals.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONINTEGERREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEDEFINITIONREAL> getATTRIBUTEDEFINITIONREALREF() {
		return getGroup().list(ReqifPackage.Literals.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONREALREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEDEFINITIONSTRING> getATTRIBUTEDEFINITIONSTRINGREF() {
		return getGroup().list(ReqifPackage.Literals.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONSTRINGREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEDEFINITIONXHTML> getATTRIBUTEDEFINITIONXHTMLREF() {
		return getGroup().list(ReqifPackage.Literals.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONXHTMLREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReqifPackage.EDITABLEATTS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
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
			case ReqifPackage.EDITABLEATTS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONBOOLEANREF:
				return getATTRIBUTEDEFINITIONBOOLEANREF();
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONDATEREF:
				return getATTRIBUTEDEFINITIONDATEREF();
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONENUMERATIONREF:
				return getATTRIBUTEDEFINITIONENUMERATIONREF();
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONINTEGERREF:
				return getATTRIBUTEDEFINITIONINTEGERREF();
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONREALREF:
				return getATTRIBUTEDEFINITIONREALREF();
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONSTRINGREF:
				return getATTRIBUTEDEFINITIONSTRINGREF();
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONXHTMLREF:
				return getATTRIBUTEDEFINITIONXHTMLREF();
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
			case ReqifPackage.EDITABLEATTS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONBOOLEANREF:
				getATTRIBUTEDEFINITIONBOOLEANREF().clear();
				getATTRIBUTEDEFINITIONBOOLEANREF().addAll((Collection<? extends ATTRIBUTEDEFINITIONBOOLEAN>)newValue);
				return;
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONDATEREF:
				getATTRIBUTEDEFINITIONDATEREF().clear();
				getATTRIBUTEDEFINITIONDATEREF().addAll((Collection<? extends ATTRIBUTEDEFINITIONDATE>)newValue);
				return;
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONENUMERATIONREF:
				getATTRIBUTEDEFINITIONENUMERATIONREF().clear();
				getATTRIBUTEDEFINITIONENUMERATIONREF().addAll((Collection<? extends ATTRIBUTEDEFINITIONENUMERATION>)newValue);
				return;
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONINTEGERREF:
				getATTRIBUTEDEFINITIONINTEGERREF().clear();
				getATTRIBUTEDEFINITIONINTEGERREF().addAll((Collection<? extends ATTRIBUTEDEFINITIONINTEGER>)newValue);
				return;
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONREALREF:
				getATTRIBUTEDEFINITIONREALREF().clear();
				getATTRIBUTEDEFINITIONREALREF().addAll((Collection<? extends ATTRIBUTEDEFINITIONREAL>)newValue);
				return;
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONSTRINGREF:
				getATTRIBUTEDEFINITIONSTRINGREF().clear();
				getATTRIBUTEDEFINITIONSTRINGREF().addAll((Collection<? extends ATTRIBUTEDEFINITIONSTRING>)newValue);
				return;
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONXHTMLREF:
				getATTRIBUTEDEFINITIONXHTMLREF().clear();
				getATTRIBUTEDEFINITIONXHTMLREF().addAll((Collection<? extends ATTRIBUTEDEFINITIONXHTML>)newValue);
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
			case ReqifPackage.EDITABLEATTS_TYPE__GROUP:
				getGroup().clear();
				return;
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONBOOLEANREF:
				getATTRIBUTEDEFINITIONBOOLEANREF().clear();
				return;
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONDATEREF:
				getATTRIBUTEDEFINITIONDATEREF().clear();
				return;
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONENUMERATIONREF:
				getATTRIBUTEDEFINITIONENUMERATIONREF().clear();
				return;
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONINTEGERREF:
				getATTRIBUTEDEFINITIONINTEGERREF().clear();
				return;
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONREALREF:
				getATTRIBUTEDEFINITIONREALREF().clear();
				return;
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONSTRINGREF:
				getATTRIBUTEDEFINITIONSTRINGREF().clear();
				return;
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONXHTMLREF:
				getATTRIBUTEDEFINITIONXHTMLREF().clear();
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
			case ReqifPackage.EDITABLEATTS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONBOOLEANREF:
				return !getATTRIBUTEDEFINITIONBOOLEANREF().isEmpty();
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONDATEREF:
				return !getATTRIBUTEDEFINITIONDATEREF().isEmpty();
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONENUMERATIONREF:
				return !getATTRIBUTEDEFINITIONENUMERATIONREF().isEmpty();
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONINTEGERREF:
				return !getATTRIBUTEDEFINITIONINTEGERREF().isEmpty();
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONREALREF:
				return !getATTRIBUTEDEFINITIONREALREF().isEmpty();
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONSTRINGREF:
				return !getATTRIBUTEDEFINITIONSTRINGREF().isEmpty();
			case ReqifPackage.EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONXHTMLREF:
				return !getATTRIBUTEDEFINITIONXHTMLREF().isEmpty();
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

} //EDITABLEATTSTypeImpl
