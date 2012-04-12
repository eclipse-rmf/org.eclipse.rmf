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
import org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT;
import org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEEMBEDDEDFILE;
import org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEENUMERATION;
import org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEFILEREFERENCE;
import org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUESIMPLE;
import org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUESType;
import org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEXMLDATA;
import org.eclipse.rmf.rif12.xsd.RifPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATTRIBUTEVALUES Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.ATTRIBUTEVALUESTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.ATTRIBUTEVALUESTypeImpl#getATTRIBUTEVALUEEMBEDDEDDOCUMENTREF <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.ATTRIBUTEVALUESTypeImpl#getATTRIBUTEVALUEEMBEDDEDFILEREF <em>ATTRIBUTEVALUEEMBEDDEDFILEREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.ATTRIBUTEVALUESTypeImpl#getATTRIBUTEVALUEENUMERATIONREF <em>ATTRIBUTEVALUEENUMERATIONREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.ATTRIBUTEVALUESTypeImpl#getATTRIBUTEVALUEFILEREFERENCEREF <em>ATTRIBUTEVALUEFILEREFERENCEREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.ATTRIBUTEVALUESTypeImpl#getATTRIBUTEVALUESIMPLEREF <em>ATTRIBUTEVALUESIMPLEREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.ATTRIBUTEVALUESTypeImpl#getATTRIBUTEVALUEXMLDATAREF <em>ATTRIBUTEVALUEXMLDATAREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ATTRIBUTEVALUESTypeImpl extends EObjectImpl implements ATTRIBUTEVALUESType {
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
	protected ATTRIBUTEVALUESTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.ATTRIBUTEVALUES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, RifPackage.ATTRIBUTEVALUES_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEVALUEEMBEDDEDDOCUMENT> getATTRIBUTEVALUEEMBEDDEDDOCUMENTREF() {
		return getGroup().list(RifPackage.Literals.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEVALUEEMBEDDEDFILE> getATTRIBUTEVALUEEMBEDDEDFILEREF() {
		return getGroup().list(RifPackage.Literals.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEEMBEDDEDFILEREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEVALUEENUMERATION> getATTRIBUTEVALUEENUMERATIONREF() {
		return getGroup().list(RifPackage.Literals.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEENUMERATIONREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEVALUEFILEREFERENCE> getATTRIBUTEVALUEFILEREFERENCEREF() {
		return getGroup().list(RifPackage.Literals.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEFILEREFERENCEREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEVALUESIMPLE> getATTRIBUTEVALUESIMPLEREF() {
		return getGroup().list(RifPackage.Literals.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUESIMPLEREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATTRIBUTEVALUEXMLDATA> getATTRIBUTEVALUEXMLDATAREF() {
		return getGroup().list(RifPackage.Literals.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEXMLDATAREF);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RifPackage.ATTRIBUTEVALUES_TYPE__GROUP:
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
			case RifPackage.ATTRIBUTEVALUES_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case RifPackage.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF:
				return getATTRIBUTEVALUEEMBEDDEDDOCUMENTREF();
			case RifPackage.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEEMBEDDEDFILEREF:
				return getATTRIBUTEVALUEEMBEDDEDFILEREF();
			case RifPackage.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEENUMERATIONREF:
				return getATTRIBUTEVALUEENUMERATIONREF();
			case RifPackage.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEFILEREFERENCEREF:
				return getATTRIBUTEVALUEFILEREFERENCEREF();
			case RifPackage.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUESIMPLEREF:
				return getATTRIBUTEVALUESIMPLEREF();
			case RifPackage.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEXMLDATAREF:
				return getATTRIBUTEVALUEXMLDATAREF();
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
			case RifPackage.ATTRIBUTEVALUES_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case RifPackage.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF:
				getATTRIBUTEVALUEEMBEDDEDDOCUMENTREF().clear();
				getATTRIBUTEVALUEEMBEDDEDDOCUMENTREF().addAll((Collection<? extends ATTRIBUTEVALUEEMBEDDEDDOCUMENT>)newValue);
				return;
			case RifPackage.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEEMBEDDEDFILEREF:
				getATTRIBUTEVALUEEMBEDDEDFILEREF().clear();
				getATTRIBUTEVALUEEMBEDDEDFILEREF().addAll((Collection<? extends ATTRIBUTEVALUEEMBEDDEDFILE>)newValue);
				return;
			case RifPackage.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEENUMERATIONREF:
				getATTRIBUTEVALUEENUMERATIONREF().clear();
				getATTRIBUTEVALUEENUMERATIONREF().addAll((Collection<? extends ATTRIBUTEVALUEENUMERATION>)newValue);
				return;
			case RifPackage.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEFILEREFERENCEREF:
				getATTRIBUTEVALUEFILEREFERENCEREF().clear();
				getATTRIBUTEVALUEFILEREFERENCEREF().addAll((Collection<? extends ATTRIBUTEVALUEFILEREFERENCE>)newValue);
				return;
			case RifPackage.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUESIMPLEREF:
				getATTRIBUTEVALUESIMPLEREF().clear();
				getATTRIBUTEVALUESIMPLEREF().addAll((Collection<? extends ATTRIBUTEVALUESIMPLE>)newValue);
				return;
			case RifPackage.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEXMLDATAREF:
				getATTRIBUTEVALUEXMLDATAREF().clear();
				getATTRIBUTEVALUEXMLDATAREF().addAll((Collection<? extends ATTRIBUTEVALUEXMLDATA>)newValue);
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
			case RifPackage.ATTRIBUTEVALUES_TYPE__GROUP:
				getGroup().clear();
				return;
			case RifPackage.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF:
				getATTRIBUTEVALUEEMBEDDEDDOCUMENTREF().clear();
				return;
			case RifPackage.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEEMBEDDEDFILEREF:
				getATTRIBUTEVALUEEMBEDDEDFILEREF().clear();
				return;
			case RifPackage.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEENUMERATIONREF:
				getATTRIBUTEVALUEENUMERATIONREF().clear();
				return;
			case RifPackage.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEFILEREFERENCEREF:
				getATTRIBUTEVALUEFILEREFERENCEREF().clear();
				return;
			case RifPackage.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUESIMPLEREF:
				getATTRIBUTEVALUESIMPLEREF().clear();
				return;
			case RifPackage.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEXMLDATAREF:
				getATTRIBUTEVALUEXMLDATAREF().clear();
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
			case RifPackage.ATTRIBUTEVALUES_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case RifPackage.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF:
				return !getATTRIBUTEVALUEEMBEDDEDDOCUMENTREF().isEmpty();
			case RifPackage.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEEMBEDDEDFILEREF:
				return !getATTRIBUTEVALUEEMBEDDEDFILEREF().isEmpty();
			case RifPackage.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEENUMERATIONREF:
				return !getATTRIBUTEVALUEENUMERATIONREF().isEmpty();
			case RifPackage.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEFILEREFERENCEREF:
				return !getATTRIBUTEVALUEFILEREFERENCEREF().isEmpty();
			case RifPackage.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUESIMPLEREF:
				return !getATTRIBUTEVALUESIMPLEREF().isEmpty();
			case RifPackage.ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEXMLDATAREF:
				return !getATTRIBUTEVALUEXMLDATAREF().isEmpty();
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

} //ATTRIBUTEVALUESTypeImpl
