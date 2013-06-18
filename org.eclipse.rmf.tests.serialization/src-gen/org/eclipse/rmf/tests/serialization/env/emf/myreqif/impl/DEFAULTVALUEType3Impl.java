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

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEREAL;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType3;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEFAULTVALUE Type3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType3Impl#getATTRIBUTEVALUEREAL <em>ATTRIBUTEVALUEREAL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEFAULTVALUEType3Impl extends EObjectImpl implements DEFAULTVALUEType3 {
	/**
	 * The cached value of the '{@link #getATTRIBUTEVALUEREAL() <em>ATTRIBUTEVALUEREAL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEVALUEREAL()
	 * @generated
	 * @ordered
	 */
	protected ATTRIBUTEVALUEREAL aTTRIBUTEVALUEREAL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DEFAULTVALUEType3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.DEFAULTVALUE_TYPE3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEVALUEREAL getATTRIBUTEVALUEREAL() {
		return aTTRIBUTEVALUEREAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetATTRIBUTEVALUEREAL(ATTRIBUTEVALUEREAL newATTRIBUTEVALUEREAL, NotificationChain msgs) {
		ATTRIBUTEVALUEREAL oldATTRIBUTEVALUEREAL = aTTRIBUTEVALUEREAL;
		aTTRIBUTEVALUEREAL = newATTRIBUTEVALUEREAL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.DEFAULTVALUE_TYPE3__ATTRIBUTEVALUEREAL, oldATTRIBUTEVALUEREAL, newATTRIBUTEVALUEREAL);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEVALUEREAL(ATTRIBUTEVALUEREAL newATTRIBUTEVALUEREAL) {
		if (newATTRIBUTEVALUEREAL != aTTRIBUTEVALUEREAL) {
			NotificationChain msgs = null;
			if (aTTRIBUTEVALUEREAL != null)
				msgs = ((InternalEObject)aTTRIBUTEVALUEREAL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.DEFAULTVALUE_TYPE3__ATTRIBUTEVALUEREAL, null, msgs);
			if (newATTRIBUTEVALUEREAL != null)
				msgs = ((InternalEObject)newATTRIBUTEVALUEREAL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.DEFAULTVALUE_TYPE3__ATTRIBUTEVALUEREAL, null, msgs);
			msgs = basicSetATTRIBUTEVALUEREAL(newATTRIBUTEVALUEREAL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.DEFAULTVALUE_TYPE3__ATTRIBUTEVALUEREAL, newATTRIBUTEVALUEREAL, newATTRIBUTEVALUEREAL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyreqifPackage.DEFAULTVALUE_TYPE3__ATTRIBUTEVALUEREAL:
				return basicSetATTRIBUTEVALUEREAL(null, msgs);
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
			case MyreqifPackage.DEFAULTVALUE_TYPE3__ATTRIBUTEVALUEREAL:
				return getATTRIBUTEVALUEREAL();
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
			case MyreqifPackage.DEFAULTVALUE_TYPE3__ATTRIBUTEVALUEREAL:
				setATTRIBUTEVALUEREAL((ATTRIBUTEVALUEREAL)newValue);
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
			case MyreqifPackage.DEFAULTVALUE_TYPE3__ATTRIBUTEVALUEREAL:
				setATTRIBUTEVALUEREAL((ATTRIBUTEVALUEREAL)null);
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
			case MyreqifPackage.DEFAULTVALUE_TYPE3__ATTRIBUTEVALUEREAL:
				return aTTRIBUTEVALUEREAL != null;
		}
		return super.eIsSet(featureID);
	}

} //DEFAULTVALUEType3Impl
