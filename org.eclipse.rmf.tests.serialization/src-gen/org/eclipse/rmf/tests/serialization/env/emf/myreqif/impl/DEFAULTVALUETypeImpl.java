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

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEDATE;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEFAULTVALUE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUETypeImpl#getATTRIBUTEVALUEDATE <em>ATTRIBUTEVALUEDATE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEFAULTVALUETypeImpl extends EObjectImpl implements DEFAULTVALUEType {
	/**
	 * The cached value of the '{@link #getATTRIBUTEVALUEDATE() <em>ATTRIBUTEVALUEDATE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEVALUEDATE()
	 * @generated
	 * @ordered
	 */
	protected ATTRIBUTEVALUEDATE aTTRIBUTEVALUEDATE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DEFAULTVALUETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.DEFAULTVALUE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEVALUEDATE getATTRIBUTEVALUEDATE() {
		return aTTRIBUTEVALUEDATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetATTRIBUTEVALUEDATE(ATTRIBUTEVALUEDATE newATTRIBUTEVALUEDATE, NotificationChain msgs) {
		ATTRIBUTEVALUEDATE oldATTRIBUTEVALUEDATE = aTTRIBUTEVALUEDATE;
		aTTRIBUTEVALUEDATE = newATTRIBUTEVALUEDATE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.DEFAULTVALUE_TYPE__ATTRIBUTEVALUEDATE, oldATTRIBUTEVALUEDATE, newATTRIBUTEVALUEDATE);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEVALUEDATE(ATTRIBUTEVALUEDATE newATTRIBUTEVALUEDATE) {
		if (newATTRIBUTEVALUEDATE != aTTRIBUTEVALUEDATE) {
			NotificationChain msgs = null;
			if (aTTRIBUTEVALUEDATE != null)
				msgs = ((InternalEObject)aTTRIBUTEVALUEDATE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.DEFAULTVALUE_TYPE__ATTRIBUTEVALUEDATE, null, msgs);
			if (newATTRIBUTEVALUEDATE != null)
				msgs = ((InternalEObject)newATTRIBUTEVALUEDATE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.DEFAULTVALUE_TYPE__ATTRIBUTEVALUEDATE, null, msgs);
			msgs = basicSetATTRIBUTEVALUEDATE(newATTRIBUTEVALUEDATE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.DEFAULTVALUE_TYPE__ATTRIBUTEVALUEDATE, newATTRIBUTEVALUEDATE, newATTRIBUTEVALUEDATE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyreqifPackage.DEFAULTVALUE_TYPE__ATTRIBUTEVALUEDATE:
				return basicSetATTRIBUTEVALUEDATE(null, msgs);
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
			case MyreqifPackage.DEFAULTVALUE_TYPE__ATTRIBUTEVALUEDATE:
				return getATTRIBUTEVALUEDATE();
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
			case MyreqifPackage.DEFAULTVALUE_TYPE__ATTRIBUTEVALUEDATE:
				setATTRIBUTEVALUEDATE((ATTRIBUTEVALUEDATE)newValue);
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
			case MyreqifPackage.DEFAULTVALUE_TYPE__ATTRIBUTEVALUEDATE:
				setATTRIBUTEVALUEDATE((ATTRIBUTEVALUEDATE)null);
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
			case MyreqifPackage.DEFAULTVALUE_TYPE__ATTRIBUTEVALUEDATE:
				return aTTRIBUTEVALUEDATE != null;
		}
		return super.eIsSet(featureID);
	}

} //DEFAULTVALUETypeImpl
