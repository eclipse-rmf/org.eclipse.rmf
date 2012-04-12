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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT;
import org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEEMBEDDEDFILE;
import org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEFILEREFERENCE;
import org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEXMLDATA;
import org.eclipse.rmf.rif12.xsd.DEFAULTVALUEType2;
import org.eclipse.rmf.rif12.xsd.RifPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEFAULTVALUE Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DEFAULTVALUEType2Impl#getATTRIBUTEVALUEEMBEDDEDDOCUMENT <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DEFAULTVALUEType2Impl#getATTRIBUTEVALUEEMBEDDEDFILE <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DEFAULTVALUEType2Impl#getATTRIBUTEVALUEFILEREFERENCE <em>ATTRIBUTEVALUEFILEREFERENCE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DEFAULTVALUEType2Impl#getATTRIBUTEVALUEXMLDATA <em>ATTRIBUTEVALUEXMLDATA</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEFAULTVALUEType2Impl extends EObjectImpl implements DEFAULTVALUEType2 {
	/**
	 * The cached value of the '{@link #getATTRIBUTEVALUEEMBEDDEDDOCUMENT() <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEVALUEEMBEDDEDDOCUMENT()
	 * @generated
	 * @ordered
	 */
	protected ATTRIBUTEVALUEEMBEDDEDDOCUMENT aTTRIBUTEVALUEEMBEDDEDDOCUMENT;

	/**
	 * The cached value of the '{@link #getATTRIBUTEVALUEEMBEDDEDFILE() <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEVALUEEMBEDDEDFILE()
	 * @generated
	 * @ordered
	 */
	protected ATTRIBUTEVALUEEMBEDDEDFILE aTTRIBUTEVALUEEMBEDDEDFILE;

	/**
	 * The cached value of the '{@link #getATTRIBUTEVALUEFILEREFERENCE() <em>ATTRIBUTEVALUEFILEREFERENCE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEVALUEFILEREFERENCE()
	 * @generated
	 * @ordered
	 */
	protected ATTRIBUTEVALUEFILEREFERENCE aTTRIBUTEVALUEFILEREFERENCE;

	/**
	 * The cached value of the '{@link #getATTRIBUTEVALUEXMLDATA() <em>ATTRIBUTEVALUEXMLDATA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEVALUEXMLDATA()
	 * @generated
	 * @ordered
	 */
	protected ATTRIBUTEVALUEXMLDATA aTTRIBUTEVALUEXMLDATA;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DEFAULTVALUEType2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.DEFAULTVALUE_TYPE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEVALUEEMBEDDEDDOCUMENT getATTRIBUTEVALUEEMBEDDEDDOCUMENT() {
		return aTTRIBUTEVALUEEMBEDDEDDOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetATTRIBUTEVALUEEMBEDDEDDOCUMENT(ATTRIBUTEVALUEEMBEDDEDDOCUMENT newATTRIBUTEVALUEEMBEDDEDDOCUMENT, NotificationChain msgs) {
		ATTRIBUTEVALUEEMBEDDEDDOCUMENT oldATTRIBUTEVALUEEMBEDDEDDOCUMENT = aTTRIBUTEVALUEEMBEDDEDDOCUMENT;
		aTTRIBUTEVALUEEMBEDDEDDOCUMENT = newATTRIBUTEVALUEEMBEDDEDDOCUMENT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEEMBEDDEDDOCUMENT, oldATTRIBUTEVALUEEMBEDDEDDOCUMENT, newATTRIBUTEVALUEEMBEDDEDDOCUMENT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEVALUEEMBEDDEDDOCUMENT(ATTRIBUTEVALUEEMBEDDEDDOCUMENT newATTRIBUTEVALUEEMBEDDEDDOCUMENT) {
		if (newATTRIBUTEVALUEEMBEDDEDDOCUMENT != aTTRIBUTEVALUEEMBEDDEDDOCUMENT) {
			NotificationChain msgs = null;
			if (aTTRIBUTEVALUEEMBEDDEDDOCUMENT != null)
				msgs = ((InternalEObject)aTTRIBUTEVALUEEMBEDDEDDOCUMENT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEEMBEDDEDDOCUMENT, null, msgs);
			if (newATTRIBUTEVALUEEMBEDDEDDOCUMENT != null)
				msgs = ((InternalEObject)newATTRIBUTEVALUEEMBEDDEDDOCUMENT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEEMBEDDEDDOCUMENT, null, msgs);
			msgs = basicSetATTRIBUTEVALUEEMBEDDEDDOCUMENT(newATTRIBUTEVALUEEMBEDDEDDOCUMENT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEEMBEDDEDDOCUMENT, newATTRIBUTEVALUEEMBEDDEDDOCUMENT, newATTRIBUTEVALUEEMBEDDEDDOCUMENT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEVALUEEMBEDDEDFILE getATTRIBUTEVALUEEMBEDDEDFILE() {
		return aTTRIBUTEVALUEEMBEDDEDFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetATTRIBUTEVALUEEMBEDDEDFILE(ATTRIBUTEVALUEEMBEDDEDFILE newATTRIBUTEVALUEEMBEDDEDFILE, NotificationChain msgs) {
		ATTRIBUTEVALUEEMBEDDEDFILE oldATTRIBUTEVALUEEMBEDDEDFILE = aTTRIBUTEVALUEEMBEDDEDFILE;
		aTTRIBUTEVALUEEMBEDDEDFILE = newATTRIBUTEVALUEEMBEDDEDFILE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEEMBEDDEDFILE, oldATTRIBUTEVALUEEMBEDDEDFILE, newATTRIBUTEVALUEEMBEDDEDFILE);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEVALUEEMBEDDEDFILE(ATTRIBUTEVALUEEMBEDDEDFILE newATTRIBUTEVALUEEMBEDDEDFILE) {
		if (newATTRIBUTEVALUEEMBEDDEDFILE != aTTRIBUTEVALUEEMBEDDEDFILE) {
			NotificationChain msgs = null;
			if (aTTRIBUTEVALUEEMBEDDEDFILE != null)
				msgs = ((InternalEObject)aTTRIBUTEVALUEEMBEDDEDFILE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEEMBEDDEDFILE, null, msgs);
			if (newATTRIBUTEVALUEEMBEDDEDFILE != null)
				msgs = ((InternalEObject)newATTRIBUTEVALUEEMBEDDEDFILE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEEMBEDDEDFILE, null, msgs);
			msgs = basicSetATTRIBUTEVALUEEMBEDDEDFILE(newATTRIBUTEVALUEEMBEDDEDFILE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEEMBEDDEDFILE, newATTRIBUTEVALUEEMBEDDEDFILE, newATTRIBUTEVALUEEMBEDDEDFILE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEVALUEFILEREFERENCE getATTRIBUTEVALUEFILEREFERENCE() {
		return aTTRIBUTEVALUEFILEREFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetATTRIBUTEVALUEFILEREFERENCE(ATTRIBUTEVALUEFILEREFERENCE newATTRIBUTEVALUEFILEREFERENCE, NotificationChain msgs) {
		ATTRIBUTEVALUEFILEREFERENCE oldATTRIBUTEVALUEFILEREFERENCE = aTTRIBUTEVALUEFILEREFERENCE;
		aTTRIBUTEVALUEFILEREFERENCE = newATTRIBUTEVALUEFILEREFERENCE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEFILEREFERENCE, oldATTRIBUTEVALUEFILEREFERENCE, newATTRIBUTEVALUEFILEREFERENCE);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEVALUEFILEREFERENCE(ATTRIBUTEVALUEFILEREFERENCE newATTRIBUTEVALUEFILEREFERENCE) {
		if (newATTRIBUTEVALUEFILEREFERENCE != aTTRIBUTEVALUEFILEREFERENCE) {
			NotificationChain msgs = null;
			if (aTTRIBUTEVALUEFILEREFERENCE != null)
				msgs = ((InternalEObject)aTTRIBUTEVALUEFILEREFERENCE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEFILEREFERENCE, null, msgs);
			if (newATTRIBUTEVALUEFILEREFERENCE != null)
				msgs = ((InternalEObject)newATTRIBUTEVALUEFILEREFERENCE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEFILEREFERENCE, null, msgs);
			msgs = basicSetATTRIBUTEVALUEFILEREFERENCE(newATTRIBUTEVALUEFILEREFERENCE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEFILEREFERENCE, newATTRIBUTEVALUEFILEREFERENCE, newATTRIBUTEVALUEFILEREFERENCE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEVALUEXMLDATA getATTRIBUTEVALUEXMLDATA() {
		return aTTRIBUTEVALUEXMLDATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetATTRIBUTEVALUEXMLDATA(ATTRIBUTEVALUEXMLDATA newATTRIBUTEVALUEXMLDATA, NotificationChain msgs) {
		ATTRIBUTEVALUEXMLDATA oldATTRIBUTEVALUEXMLDATA = aTTRIBUTEVALUEXMLDATA;
		aTTRIBUTEVALUEXMLDATA = newATTRIBUTEVALUEXMLDATA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEXMLDATA, oldATTRIBUTEVALUEXMLDATA, newATTRIBUTEVALUEXMLDATA);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEVALUEXMLDATA(ATTRIBUTEVALUEXMLDATA newATTRIBUTEVALUEXMLDATA) {
		if (newATTRIBUTEVALUEXMLDATA != aTTRIBUTEVALUEXMLDATA) {
			NotificationChain msgs = null;
			if (aTTRIBUTEVALUEXMLDATA != null)
				msgs = ((InternalEObject)aTTRIBUTEVALUEXMLDATA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEXMLDATA, null, msgs);
			if (newATTRIBUTEVALUEXMLDATA != null)
				msgs = ((InternalEObject)newATTRIBUTEVALUEXMLDATA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEXMLDATA, null, msgs);
			msgs = basicSetATTRIBUTEVALUEXMLDATA(newATTRIBUTEVALUEXMLDATA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEXMLDATA, newATTRIBUTEVALUEXMLDATA, newATTRIBUTEVALUEXMLDATA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
				return basicSetATTRIBUTEVALUEEMBEDDEDDOCUMENT(null, msgs);
			case RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEEMBEDDEDFILE:
				return basicSetATTRIBUTEVALUEEMBEDDEDFILE(null, msgs);
			case RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEFILEREFERENCE:
				return basicSetATTRIBUTEVALUEFILEREFERENCE(null, msgs);
			case RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEXMLDATA:
				return basicSetATTRIBUTEVALUEXMLDATA(null, msgs);
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
			case RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
				return getATTRIBUTEVALUEEMBEDDEDDOCUMENT();
			case RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEEMBEDDEDFILE:
				return getATTRIBUTEVALUEEMBEDDEDFILE();
			case RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEFILEREFERENCE:
				return getATTRIBUTEVALUEFILEREFERENCE();
			case RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEXMLDATA:
				return getATTRIBUTEVALUEXMLDATA();
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
			case RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
				setATTRIBUTEVALUEEMBEDDEDDOCUMENT((ATTRIBUTEVALUEEMBEDDEDDOCUMENT)newValue);
				return;
			case RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEEMBEDDEDFILE:
				setATTRIBUTEVALUEEMBEDDEDFILE((ATTRIBUTEVALUEEMBEDDEDFILE)newValue);
				return;
			case RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEFILEREFERENCE:
				setATTRIBUTEVALUEFILEREFERENCE((ATTRIBUTEVALUEFILEREFERENCE)newValue);
				return;
			case RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEXMLDATA:
				setATTRIBUTEVALUEXMLDATA((ATTRIBUTEVALUEXMLDATA)newValue);
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
			case RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
				setATTRIBUTEVALUEEMBEDDEDDOCUMENT((ATTRIBUTEVALUEEMBEDDEDDOCUMENT)null);
				return;
			case RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEEMBEDDEDFILE:
				setATTRIBUTEVALUEEMBEDDEDFILE((ATTRIBUTEVALUEEMBEDDEDFILE)null);
				return;
			case RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEFILEREFERENCE:
				setATTRIBUTEVALUEFILEREFERENCE((ATTRIBUTEVALUEFILEREFERENCE)null);
				return;
			case RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEXMLDATA:
				setATTRIBUTEVALUEXMLDATA((ATTRIBUTEVALUEXMLDATA)null);
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
			case RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEEMBEDDEDDOCUMENT:
				return aTTRIBUTEVALUEEMBEDDEDDOCUMENT != null;
			case RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEEMBEDDEDFILE:
				return aTTRIBUTEVALUEEMBEDDEDFILE != null;
			case RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEFILEREFERENCE:
				return aTTRIBUTEVALUEFILEREFERENCE != null;
			case RifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEXMLDATA:
				return aTTRIBUTEVALUEXMLDATA != null;
		}
		return super.eIsSet(featureID);
	}

} //DEFAULTVALUEType2Impl
