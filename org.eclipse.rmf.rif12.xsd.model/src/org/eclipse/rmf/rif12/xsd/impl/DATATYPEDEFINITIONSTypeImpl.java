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
import org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONBINARYFILE;
import org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONBOOLEAN;
import org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONDATE;
import org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONDOCUMENT;
import org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONENUMERATION;
import org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONINTEGER;
import org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONREAL;
import org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONSTRING;
import org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONSType;
import org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONXMLDATA;
import org.eclipse.rmf.rif12.xsd.RifPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DATATYPEDEFINITIONS Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONSTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONSTypeImpl#getDATATYPEDEFINITIONBINARYFILEREF <em>DATATYPEDEFINITIONBINARYFILEREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONSTypeImpl#getDATATYPEDEFINITIONBOOLEANREF <em>DATATYPEDEFINITIONBOOLEANREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONSTypeImpl#getDATATYPEDEFINITIONDATEREF <em>DATATYPEDEFINITIONDATEREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONSTypeImpl#getDATATYPEDEFINITIONDOCUMENTREF <em>DATATYPEDEFINITIONDOCUMENTREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONSTypeImpl#getDATATYPEDEFINITIONENUMERATIONREF <em>DATATYPEDEFINITIONENUMERATIONREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONSTypeImpl#getDATATYPEDEFINITIONINTEGERREF <em>DATATYPEDEFINITIONINTEGERREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONSTypeImpl#getDATATYPEDEFINITIONREALREF <em>DATATYPEDEFINITIONREALREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONSTypeImpl#getDATATYPEDEFINITIONSTRINGREF <em>DATATYPEDEFINITIONSTRINGREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONSTypeImpl#getDATATYPEDEFINITIONXMLDATAREF <em>DATATYPEDEFINITIONXMLDATAREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DATATYPEDEFINITIONSTypeImpl extends EObjectImpl implements DATATYPEDEFINITIONSType {
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
	protected DATATYPEDEFINITIONSTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.DATATYPEDEFINITIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, RifPackage.DATATYPEDEFINITIONS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DATATYPEDEFINITIONBINARYFILE> getDATATYPEDEFINITIONBINARYFILEREF() {
		return getGroup().list(RifPackage.Literals.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONBINARYFILEREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DATATYPEDEFINITIONBOOLEAN> getDATATYPEDEFINITIONBOOLEANREF() {
		return getGroup().list(RifPackage.Literals.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONBOOLEANREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DATATYPEDEFINITIONDATE> getDATATYPEDEFINITIONDATEREF() {
		return getGroup().list(RifPackage.Literals.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONDATEREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DATATYPEDEFINITIONDOCUMENT> getDATATYPEDEFINITIONDOCUMENTREF() {
		return getGroup().list(RifPackage.Literals.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONDOCUMENTREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DATATYPEDEFINITIONENUMERATION> getDATATYPEDEFINITIONENUMERATIONREF() {
		return getGroup().list(RifPackage.Literals.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONENUMERATIONREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DATATYPEDEFINITIONINTEGER> getDATATYPEDEFINITIONINTEGERREF() {
		return getGroup().list(RifPackage.Literals.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONINTEGERREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DATATYPEDEFINITIONREAL> getDATATYPEDEFINITIONREALREF() {
		return getGroup().list(RifPackage.Literals.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONREALREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DATATYPEDEFINITIONSTRING> getDATATYPEDEFINITIONSTRINGREF() {
		return getGroup().list(RifPackage.Literals.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONSTRINGREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DATATYPEDEFINITIONXMLDATA> getDATATYPEDEFINITIONXMLDATAREF() {
		return getGroup().list(RifPackage.Literals.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONXMLDATAREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RifPackage.DATATYPEDEFINITIONS_TYPE__GROUP:
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
			case RifPackage.DATATYPEDEFINITIONS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONBINARYFILEREF:
				return getDATATYPEDEFINITIONBINARYFILEREF();
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONBOOLEANREF:
				return getDATATYPEDEFINITIONBOOLEANREF();
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONDATEREF:
				return getDATATYPEDEFINITIONDATEREF();
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONDOCUMENTREF:
				return getDATATYPEDEFINITIONDOCUMENTREF();
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONENUMERATIONREF:
				return getDATATYPEDEFINITIONENUMERATIONREF();
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONINTEGERREF:
				return getDATATYPEDEFINITIONINTEGERREF();
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONREALREF:
				return getDATATYPEDEFINITIONREALREF();
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONSTRINGREF:
				return getDATATYPEDEFINITIONSTRINGREF();
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONXMLDATAREF:
				return getDATATYPEDEFINITIONXMLDATAREF();
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
			case RifPackage.DATATYPEDEFINITIONS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONBINARYFILEREF:
				getDATATYPEDEFINITIONBINARYFILEREF().clear();
				getDATATYPEDEFINITIONBINARYFILEREF().addAll((Collection<? extends DATATYPEDEFINITIONBINARYFILE>)newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONBOOLEANREF:
				getDATATYPEDEFINITIONBOOLEANREF().clear();
				getDATATYPEDEFINITIONBOOLEANREF().addAll((Collection<? extends DATATYPEDEFINITIONBOOLEAN>)newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONDATEREF:
				getDATATYPEDEFINITIONDATEREF().clear();
				getDATATYPEDEFINITIONDATEREF().addAll((Collection<? extends DATATYPEDEFINITIONDATE>)newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONDOCUMENTREF:
				getDATATYPEDEFINITIONDOCUMENTREF().clear();
				getDATATYPEDEFINITIONDOCUMENTREF().addAll((Collection<? extends DATATYPEDEFINITIONDOCUMENT>)newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONENUMERATIONREF:
				getDATATYPEDEFINITIONENUMERATIONREF().clear();
				getDATATYPEDEFINITIONENUMERATIONREF().addAll((Collection<? extends DATATYPEDEFINITIONENUMERATION>)newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONINTEGERREF:
				getDATATYPEDEFINITIONINTEGERREF().clear();
				getDATATYPEDEFINITIONINTEGERREF().addAll((Collection<? extends DATATYPEDEFINITIONINTEGER>)newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONREALREF:
				getDATATYPEDEFINITIONREALREF().clear();
				getDATATYPEDEFINITIONREALREF().addAll((Collection<? extends DATATYPEDEFINITIONREAL>)newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONSTRINGREF:
				getDATATYPEDEFINITIONSTRINGREF().clear();
				getDATATYPEDEFINITIONSTRINGREF().addAll((Collection<? extends DATATYPEDEFINITIONSTRING>)newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONXMLDATAREF:
				getDATATYPEDEFINITIONXMLDATAREF().clear();
				getDATATYPEDEFINITIONXMLDATAREF().addAll((Collection<? extends DATATYPEDEFINITIONXMLDATA>)newValue);
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
			case RifPackage.DATATYPEDEFINITIONS_TYPE__GROUP:
				getGroup().clear();
				return;
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONBINARYFILEREF:
				getDATATYPEDEFINITIONBINARYFILEREF().clear();
				return;
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONBOOLEANREF:
				getDATATYPEDEFINITIONBOOLEANREF().clear();
				return;
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONDATEREF:
				getDATATYPEDEFINITIONDATEREF().clear();
				return;
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONDOCUMENTREF:
				getDATATYPEDEFINITIONDOCUMENTREF().clear();
				return;
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONENUMERATIONREF:
				getDATATYPEDEFINITIONENUMERATIONREF().clear();
				return;
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONINTEGERREF:
				getDATATYPEDEFINITIONINTEGERREF().clear();
				return;
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONREALREF:
				getDATATYPEDEFINITIONREALREF().clear();
				return;
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONSTRINGREF:
				getDATATYPEDEFINITIONSTRINGREF().clear();
				return;
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONXMLDATAREF:
				getDATATYPEDEFINITIONXMLDATAREF().clear();
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
			case RifPackage.DATATYPEDEFINITIONS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONBINARYFILEREF:
				return !getDATATYPEDEFINITIONBINARYFILEREF().isEmpty();
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONBOOLEANREF:
				return !getDATATYPEDEFINITIONBOOLEANREF().isEmpty();
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONDATEREF:
				return !getDATATYPEDEFINITIONDATEREF().isEmpty();
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONDOCUMENTREF:
				return !getDATATYPEDEFINITIONDOCUMENTREF().isEmpty();
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONENUMERATIONREF:
				return !getDATATYPEDEFINITIONENUMERATIONREF().isEmpty();
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONINTEGERREF:
				return !getDATATYPEDEFINITIONINTEGERREF().isEmpty();
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONREALREF:
				return !getDATATYPEDEFINITIONREALREF().isEmpty();
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONSTRINGREF:
				return !getDATATYPEDEFINITIONSTRINGREF().isEmpty();
			case RifPackage.DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONXMLDATAREF:
				return !getDATATYPEDEFINITIONXMLDATAREF().isEmpty();
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

} //DATATYPEDEFINITIONSTypeImpl
