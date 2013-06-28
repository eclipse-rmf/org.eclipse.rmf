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

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEBOOLEAN;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType6;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEFAULTVALUE Type6</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType6Impl#getATTRIBUTEVALUEBOOLEAN <em>ATTRIBUTEVALUEBOOLEAN</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEFAULTVALUEType6Impl extends EObjectImpl implements DEFAULTVALUEType6 {
	/**
	 * The cached value of the '{@link #getATTRIBUTEVALUEBOOLEAN() <em>ATTRIBUTEVALUEBOOLEAN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEVALUEBOOLEAN()
	 * @generated
	 * @ordered
	 */
	protected ATTRIBUTEVALUEBOOLEAN aTTRIBUTEVALUEBOOLEAN;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DEFAULTVALUEType6Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.DEFAULTVALUE_TYPE6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEVALUEBOOLEAN getATTRIBUTEVALUEBOOLEAN() {
		return aTTRIBUTEVALUEBOOLEAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetATTRIBUTEVALUEBOOLEAN(ATTRIBUTEVALUEBOOLEAN newATTRIBUTEVALUEBOOLEAN, NotificationChain msgs) {
		ATTRIBUTEVALUEBOOLEAN oldATTRIBUTEVALUEBOOLEAN = aTTRIBUTEVALUEBOOLEAN;
		aTTRIBUTEVALUEBOOLEAN = newATTRIBUTEVALUEBOOLEAN;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.DEFAULTVALUE_TYPE6__ATTRIBUTEVALUEBOOLEAN, oldATTRIBUTEVALUEBOOLEAN, newATTRIBUTEVALUEBOOLEAN);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEVALUEBOOLEAN(ATTRIBUTEVALUEBOOLEAN newATTRIBUTEVALUEBOOLEAN) {
		if (newATTRIBUTEVALUEBOOLEAN != aTTRIBUTEVALUEBOOLEAN) {
			NotificationChain msgs = null;
			if (aTTRIBUTEVALUEBOOLEAN != null)
				msgs = ((InternalEObject)aTTRIBUTEVALUEBOOLEAN).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.DEFAULTVALUE_TYPE6__ATTRIBUTEVALUEBOOLEAN, null, msgs);
			if (newATTRIBUTEVALUEBOOLEAN != null)
				msgs = ((InternalEObject)newATTRIBUTEVALUEBOOLEAN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.DEFAULTVALUE_TYPE6__ATTRIBUTEVALUEBOOLEAN, null, msgs);
			msgs = basicSetATTRIBUTEVALUEBOOLEAN(newATTRIBUTEVALUEBOOLEAN, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.DEFAULTVALUE_TYPE6__ATTRIBUTEVALUEBOOLEAN, newATTRIBUTEVALUEBOOLEAN, newATTRIBUTEVALUEBOOLEAN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyreqifPackage.DEFAULTVALUE_TYPE6__ATTRIBUTEVALUEBOOLEAN:
				return basicSetATTRIBUTEVALUEBOOLEAN(null, msgs);
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
			case MyreqifPackage.DEFAULTVALUE_TYPE6__ATTRIBUTEVALUEBOOLEAN:
				return getATTRIBUTEVALUEBOOLEAN();
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
			case MyreqifPackage.DEFAULTVALUE_TYPE6__ATTRIBUTEVALUEBOOLEAN:
				setATTRIBUTEVALUEBOOLEAN((ATTRIBUTEVALUEBOOLEAN)newValue);
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
			case MyreqifPackage.DEFAULTVALUE_TYPE6__ATTRIBUTEVALUEBOOLEAN:
				setATTRIBUTEVALUEBOOLEAN((ATTRIBUTEVALUEBOOLEAN)null);
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
			case MyreqifPackage.DEFAULTVALUE_TYPE6__ATTRIBUTEVALUEBOOLEAN:
				return aTTRIBUTEVALUEBOOLEAN != null;
		}
		return super.eIsSet(featureID);
	}

} //DEFAULTVALUEType6Impl
