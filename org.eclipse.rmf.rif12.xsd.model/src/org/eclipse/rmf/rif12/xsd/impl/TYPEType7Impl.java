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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONBINARYFILE;
import org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONDOCUMENT;
import org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONXMLDATA;
import org.eclipse.rmf.rif12.xsd.RifPackage;
import org.eclipse.rmf.rif12.xsd.TYPEType7;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TYPE Type7</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.TYPEType7Impl#getDATATYPEDEFINITIONBINARYFILEREF <em>DATATYPEDEFINITIONBINARYFILEREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.TYPEType7Impl#getDATATYPEDEFINITIONDOCUMENTREF <em>DATATYPEDEFINITIONDOCUMENTREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.TYPEType7Impl#getDATATYPEDEFINITIONXMLDATAREF <em>DATATYPEDEFINITIONXMLDATAREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TYPEType7Impl extends EObjectImpl implements TYPEType7 {
	/**
	 * The cached value of the '{@link #getDATATYPEDEFINITIONBINARYFILEREF() <em>DATATYPEDEFINITIONBINARYFILEREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONBINARYFILEREF()
	 * @generated
	 * @ordered
	 */
	protected DATATYPEDEFINITIONBINARYFILE dATATYPEDEFINITIONBINARYFILEREF;

	/**
	 * The cached value of the '{@link #getDATATYPEDEFINITIONDOCUMENTREF() <em>DATATYPEDEFINITIONDOCUMENTREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONDOCUMENTREF()
	 * @generated
	 * @ordered
	 */
	protected DATATYPEDEFINITIONDOCUMENT dATATYPEDEFINITIONDOCUMENTREF;

	/**
	 * The cached value of the '{@link #getDATATYPEDEFINITIONXMLDATAREF() <em>DATATYPEDEFINITIONXMLDATAREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONXMLDATAREF()
	 * @generated
	 * @ordered
	 */
	protected DATATYPEDEFINITIONXMLDATA dATATYPEDEFINITIONXMLDATAREF;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TYPEType7Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.TYPE_TYPE7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPEDEFINITIONBINARYFILE getDATATYPEDEFINITIONBINARYFILEREF() {
		return dATATYPEDEFINITIONBINARYFILEREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATATYPEDEFINITIONBINARYFILEREF(DATATYPEDEFINITIONBINARYFILE newDATATYPEDEFINITIONBINARYFILEREF) {
		DATATYPEDEFINITIONBINARYFILE oldDATATYPEDEFINITIONBINARYFILEREF = dATATYPEDEFINITIONBINARYFILEREF;
		dATATYPEDEFINITIONBINARYFILEREF = newDATATYPEDEFINITIONBINARYFILEREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.TYPE_TYPE7__DATATYPEDEFINITIONBINARYFILEREF, oldDATATYPEDEFINITIONBINARYFILEREF, dATATYPEDEFINITIONBINARYFILEREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPEDEFINITIONDOCUMENT getDATATYPEDEFINITIONDOCUMENTREF() {
		return dATATYPEDEFINITIONDOCUMENTREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATATYPEDEFINITIONDOCUMENTREF(DATATYPEDEFINITIONDOCUMENT newDATATYPEDEFINITIONDOCUMENTREF) {
		DATATYPEDEFINITIONDOCUMENT oldDATATYPEDEFINITIONDOCUMENTREF = dATATYPEDEFINITIONDOCUMENTREF;
		dATATYPEDEFINITIONDOCUMENTREF = newDATATYPEDEFINITIONDOCUMENTREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.TYPE_TYPE7__DATATYPEDEFINITIONDOCUMENTREF, oldDATATYPEDEFINITIONDOCUMENTREF, dATATYPEDEFINITIONDOCUMENTREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPEDEFINITIONXMLDATA getDATATYPEDEFINITIONXMLDATAREF() {
		return dATATYPEDEFINITIONXMLDATAREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATATYPEDEFINITIONXMLDATAREF(DATATYPEDEFINITIONXMLDATA newDATATYPEDEFINITIONXMLDATAREF) {
		DATATYPEDEFINITIONXMLDATA oldDATATYPEDEFINITIONXMLDATAREF = dATATYPEDEFINITIONXMLDATAREF;
		dATATYPEDEFINITIONXMLDATAREF = newDATATYPEDEFINITIONXMLDATAREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.TYPE_TYPE7__DATATYPEDEFINITIONXMLDATAREF, oldDATATYPEDEFINITIONXMLDATAREF, dATATYPEDEFINITIONXMLDATAREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RifPackage.TYPE_TYPE7__DATATYPEDEFINITIONBINARYFILEREF:
				return getDATATYPEDEFINITIONBINARYFILEREF();
			case RifPackage.TYPE_TYPE7__DATATYPEDEFINITIONDOCUMENTREF:
				return getDATATYPEDEFINITIONDOCUMENTREF();
			case RifPackage.TYPE_TYPE7__DATATYPEDEFINITIONXMLDATAREF:
				return getDATATYPEDEFINITIONXMLDATAREF();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RifPackage.TYPE_TYPE7__DATATYPEDEFINITIONBINARYFILEREF:
				setDATATYPEDEFINITIONBINARYFILEREF((DATATYPEDEFINITIONBINARYFILE)newValue);
				return;
			case RifPackage.TYPE_TYPE7__DATATYPEDEFINITIONDOCUMENTREF:
				setDATATYPEDEFINITIONDOCUMENTREF((DATATYPEDEFINITIONDOCUMENT)newValue);
				return;
			case RifPackage.TYPE_TYPE7__DATATYPEDEFINITIONXMLDATAREF:
				setDATATYPEDEFINITIONXMLDATAREF((DATATYPEDEFINITIONXMLDATA)newValue);
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
			case RifPackage.TYPE_TYPE7__DATATYPEDEFINITIONBINARYFILEREF:
				setDATATYPEDEFINITIONBINARYFILEREF((DATATYPEDEFINITIONBINARYFILE)null);
				return;
			case RifPackage.TYPE_TYPE7__DATATYPEDEFINITIONDOCUMENTREF:
				setDATATYPEDEFINITIONDOCUMENTREF((DATATYPEDEFINITIONDOCUMENT)null);
				return;
			case RifPackage.TYPE_TYPE7__DATATYPEDEFINITIONXMLDATAREF:
				setDATATYPEDEFINITIONXMLDATAREF((DATATYPEDEFINITIONXMLDATA)null);
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
			case RifPackage.TYPE_TYPE7__DATATYPEDEFINITIONBINARYFILEREF:
				return dATATYPEDEFINITIONBINARYFILEREF != null;
			case RifPackage.TYPE_TYPE7__DATATYPEDEFINITIONDOCUMENTREF:
				return dATATYPEDEFINITIONDOCUMENTREF != null;
			case RifPackage.TYPE_TYPE7__DATATYPEDEFINITIONXMLDATAREF:
				return dATATYPEDEFINITIONXMLDATAREF != null;
		}
		return super.eIsSet(featureID);
	}

} //TYPEType7Impl
