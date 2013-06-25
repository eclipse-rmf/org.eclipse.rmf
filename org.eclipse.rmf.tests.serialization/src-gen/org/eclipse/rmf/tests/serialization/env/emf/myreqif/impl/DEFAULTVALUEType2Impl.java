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

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEINTEGER;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType2;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEFAULTVALUE Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType2Impl#getATTRIBUTEVALUEINTEGER <em>ATTRIBUTEVALUEINTEGER</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEFAULTVALUEType2Impl extends EObjectImpl implements DEFAULTVALUEType2 {
	/**
	 * The cached value of the '{@link #getATTRIBUTEVALUEINTEGER() <em>ATTRIBUTEVALUEINTEGER</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEVALUEINTEGER()
	 * @generated
	 * @ordered
	 */
	protected ATTRIBUTEVALUEINTEGER aTTRIBUTEVALUEINTEGER;

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
		return MyreqifPackage.Literals.DEFAULTVALUE_TYPE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEVALUEINTEGER getATTRIBUTEVALUEINTEGER() {
		return aTTRIBUTEVALUEINTEGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetATTRIBUTEVALUEINTEGER(ATTRIBUTEVALUEINTEGER newATTRIBUTEVALUEINTEGER, NotificationChain msgs) {
		ATTRIBUTEVALUEINTEGER oldATTRIBUTEVALUEINTEGER = aTTRIBUTEVALUEINTEGER;
		aTTRIBUTEVALUEINTEGER = newATTRIBUTEVALUEINTEGER;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEINTEGER, oldATTRIBUTEVALUEINTEGER, newATTRIBUTEVALUEINTEGER);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEVALUEINTEGER(ATTRIBUTEVALUEINTEGER newATTRIBUTEVALUEINTEGER) {
		if (newATTRIBUTEVALUEINTEGER != aTTRIBUTEVALUEINTEGER) {
			NotificationChain msgs = null;
			if (aTTRIBUTEVALUEINTEGER != null)
				msgs = ((InternalEObject)aTTRIBUTEVALUEINTEGER).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEINTEGER, null, msgs);
			if (newATTRIBUTEVALUEINTEGER != null)
				msgs = ((InternalEObject)newATTRIBUTEVALUEINTEGER).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEINTEGER, null, msgs);
			msgs = basicSetATTRIBUTEVALUEINTEGER(newATTRIBUTEVALUEINTEGER, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEINTEGER, newATTRIBUTEVALUEINTEGER, newATTRIBUTEVALUEINTEGER));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyreqifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEINTEGER:
				return basicSetATTRIBUTEVALUEINTEGER(null, msgs);
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
			case MyreqifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEINTEGER:
				return getATTRIBUTEVALUEINTEGER();
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
			case MyreqifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEINTEGER:
				setATTRIBUTEVALUEINTEGER((ATTRIBUTEVALUEINTEGER)newValue);
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
			case MyreqifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEINTEGER:
				setATTRIBUTEVALUEINTEGER((ATTRIBUTEVALUEINTEGER)null);
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
			case MyreqifPackage.DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEINTEGER:
				return aTTRIBUTEVALUEINTEGER != null;
		}
		return super.eIsSet(featureID);
	}

} //DEFAULTVALUEType2Impl
