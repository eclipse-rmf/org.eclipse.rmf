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

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEENUMERATION;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType1;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEFAULTVALUE Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType1Impl#getATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEFAULTVALUEType1Impl extends EObjectImpl implements DEFAULTVALUEType1 {
	/**
	 * The cached value of the '{@link #getATTRIBUTEVALUEENUMERATION() <em>ATTRIBUTEVALUEENUMERATION</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEVALUEENUMERATION()
	 * @generated
	 * @ordered
	 */
	protected ATTRIBUTEVALUEENUMERATION aTTRIBUTEVALUEENUMERATION;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DEFAULTVALUEType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.DEFAULTVALUE_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEVALUEENUMERATION getATTRIBUTEVALUEENUMERATION() {
		return aTTRIBUTEVALUEENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetATTRIBUTEVALUEENUMERATION(ATTRIBUTEVALUEENUMERATION newATTRIBUTEVALUEENUMERATION, NotificationChain msgs) {
		ATTRIBUTEVALUEENUMERATION oldATTRIBUTEVALUEENUMERATION = aTTRIBUTEVALUEENUMERATION;
		aTTRIBUTEVALUEENUMERATION = newATTRIBUTEVALUEENUMERATION;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.DEFAULTVALUE_TYPE1__ATTRIBUTEVALUEENUMERATION, oldATTRIBUTEVALUEENUMERATION, newATTRIBUTEVALUEENUMERATION);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEVALUEENUMERATION(ATTRIBUTEVALUEENUMERATION newATTRIBUTEVALUEENUMERATION) {
		if (newATTRIBUTEVALUEENUMERATION != aTTRIBUTEVALUEENUMERATION) {
			NotificationChain msgs = null;
			if (aTTRIBUTEVALUEENUMERATION != null)
				msgs = ((InternalEObject)aTTRIBUTEVALUEENUMERATION).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.DEFAULTVALUE_TYPE1__ATTRIBUTEVALUEENUMERATION, null, msgs);
			if (newATTRIBUTEVALUEENUMERATION != null)
				msgs = ((InternalEObject)newATTRIBUTEVALUEENUMERATION).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.DEFAULTVALUE_TYPE1__ATTRIBUTEVALUEENUMERATION, null, msgs);
			msgs = basicSetATTRIBUTEVALUEENUMERATION(newATTRIBUTEVALUEENUMERATION, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.DEFAULTVALUE_TYPE1__ATTRIBUTEVALUEENUMERATION, newATTRIBUTEVALUEENUMERATION, newATTRIBUTEVALUEENUMERATION));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyreqifPackage.DEFAULTVALUE_TYPE1__ATTRIBUTEVALUEENUMERATION:
				return basicSetATTRIBUTEVALUEENUMERATION(null, msgs);
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
			case MyreqifPackage.DEFAULTVALUE_TYPE1__ATTRIBUTEVALUEENUMERATION:
				return getATTRIBUTEVALUEENUMERATION();
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
			case MyreqifPackage.DEFAULTVALUE_TYPE1__ATTRIBUTEVALUEENUMERATION:
				setATTRIBUTEVALUEENUMERATION((ATTRIBUTEVALUEENUMERATION)newValue);
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
			case MyreqifPackage.DEFAULTVALUE_TYPE1__ATTRIBUTEVALUEENUMERATION:
				setATTRIBUTEVALUEENUMERATION((ATTRIBUTEVALUEENUMERATION)null);
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
			case MyreqifPackage.DEFAULTVALUE_TYPE1__ATTRIBUTEVALUEENUMERATION:
				return aTTRIBUTEVALUEENUMERATION != null;
		}
		return super.eIsSet(featureID);
	}

} //DEFAULTVALUEType1Impl
