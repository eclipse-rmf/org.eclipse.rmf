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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUESTRING;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType4;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEFAULTVALUE Type4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType4Impl#getATTRIBUTEVALUESTRING <em>ATTRIBUTEVALUESTRING</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEFAULTVALUEType4Impl extends EObjectImpl implements DEFAULTVALUEType4 {
	/**
	 * The cached value of the '{@link #getATTRIBUTEVALUESTRING() <em>ATTRIBUTEVALUESTRING</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEVALUESTRING()
	 * @generated
	 * @ordered
	 */
	protected ATTRIBUTEVALUESTRING aTTRIBUTEVALUESTRING;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DEFAULTVALUEType4Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.DEFAULTVALUE_TYPE4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEVALUESTRING getATTRIBUTEVALUESTRING() {
		return aTTRIBUTEVALUESTRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetATTRIBUTEVALUESTRING(ATTRIBUTEVALUESTRING newATTRIBUTEVALUESTRING, NotificationChain msgs) {
		ATTRIBUTEVALUESTRING oldATTRIBUTEVALUESTRING = aTTRIBUTEVALUESTRING;
		aTTRIBUTEVALUESTRING = newATTRIBUTEVALUESTRING;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.DEFAULTVALUE_TYPE4__ATTRIBUTEVALUESTRING, oldATTRIBUTEVALUESTRING, newATTRIBUTEVALUESTRING);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEVALUESTRING(ATTRIBUTEVALUESTRING newATTRIBUTEVALUESTRING) {
		if (newATTRIBUTEVALUESTRING != aTTRIBUTEVALUESTRING) {
			NotificationChain msgs = null;
			if (aTTRIBUTEVALUESTRING != null)
				msgs = ((InternalEObject)aTTRIBUTEVALUESTRING).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.DEFAULTVALUE_TYPE4__ATTRIBUTEVALUESTRING, null, msgs);
			if (newATTRIBUTEVALUESTRING != null)
				msgs = ((InternalEObject)newATTRIBUTEVALUESTRING).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.DEFAULTVALUE_TYPE4__ATTRIBUTEVALUESTRING, null, msgs);
			msgs = basicSetATTRIBUTEVALUESTRING(newATTRIBUTEVALUESTRING, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.DEFAULTVALUE_TYPE4__ATTRIBUTEVALUESTRING, newATTRIBUTEVALUESTRING, newATTRIBUTEVALUESTRING));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyreqifPackage.DEFAULTVALUE_TYPE4__ATTRIBUTEVALUESTRING:
				return basicSetATTRIBUTEVALUESTRING(null, msgs);
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
			case MyreqifPackage.DEFAULTVALUE_TYPE4__ATTRIBUTEVALUESTRING:
				return getATTRIBUTEVALUESTRING();
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
			case MyreqifPackage.DEFAULTVALUE_TYPE4__ATTRIBUTEVALUESTRING:
				setATTRIBUTEVALUESTRING((ATTRIBUTEVALUESTRING)newValue);
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
			case MyreqifPackage.DEFAULTVALUE_TYPE4__ATTRIBUTEVALUESTRING:
				setATTRIBUTEVALUESTRING((ATTRIBUTEVALUESTRING)null);
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
			case MyreqifPackage.DEFAULTVALUE_TYPE4__ATTRIBUTEVALUESTRING:
				return aTTRIBUTEVALUESTRING != null;
		}
		return super.eIsSet(featureID);
	}

} //DEFAULTVALUEType4Impl
