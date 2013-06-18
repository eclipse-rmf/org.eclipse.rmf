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

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType5;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEFAULTVALUE Type5</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.DEFAULTVALUEType5Impl#getATTRIBUTEVALUEXHTML <em>ATTRIBUTEVALUEXHTML</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEFAULTVALUEType5Impl extends EObjectImpl implements DEFAULTVALUEType5 {
	/**
	 * The cached value of the '{@link #getATTRIBUTEVALUEXHTML() <em>ATTRIBUTEVALUEXHTML</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEVALUEXHTML()
	 * @generated
	 * @ordered
	 */
	protected ATTRIBUTEVALUEXHTML aTTRIBUTEVALUEXHTML;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DEFAULTVALUEType5Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.DEFAULTVALUE_TYPE5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEVALUEXHTML getATTRIBUTEVALUEXHTML() {
		return aTTRIBUTEVALUEXHTML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetATTRIBUTEVALUEXHTML(ATTRIBUTEVALUEXHTML newATTRIBUTEVALUEXHTML, NotificationChain msgs) {
		ATTRIBUTEVALUEXHTML oldATTRIBUTEVALUEXHTML = aTTRIBUTEVALUEXHTML;
		aTTRIBUTEVALUEXHTML = newATTRIBUTEVALUEXHTML;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.DEFAULTVALUE_TYPE5__ATTRIBUTEVALUEXHTML, oldATTRIBUTEVALUEXHTML, newATTRIBUTEVALUEXHTML);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEVALUEXHTML(ATTRIBUTEVALUEXHTML newATTRIBUTEVALUEXHTML) {
		if (newATTRIBUTEVALUEXHTML != aTTRIBUTEVALUEXHTML) {
			NotificationChain msgs = null;
			if (aTTRIBUTEVALUEXHTML != null)
				msgs = ((InternalEObject)aTTRIBUTEVALUEXHTML).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.DEFAULTVALUE_TYPE5__ATTRIBUTEVALUEXHTML, null, msgs);
			if (newATTRIBUTEVALUEXHTML != null)
				msgs = ((InternalEObject)newATTRIBUTEVALUEXHTML).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.DEFAULTVALUE_TYPE5__ATTRIBUTEVALUEXHTML, null, msgs);
			msgs = basicSetATTRIBUTEVALUEXHTML(newATTRIBUTEVALUEXHTML, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.DEFAULTVALUE_TYPE5__ATTRIBUTEVALUEXHTML, newATTRIBUTEVALUEXHTML, newATTRIBUTEVALUEXHTML));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyreqifPackage.DEFAULTVALUE_TYPE5__ATTRIBUTEVALUEXHTML:
				return basicSetATTRIBUTEVALUEXHTML(null, msgs);
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
			case MyreqifPackage.DEFAULTVALUE_TYPE5__ATTRIBUTEVALUEXHTML:
				return getATTRIBUTEVALUEXHTML();
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
			case MyreqifPackage.DEFAULTVALUE_TYPE5__ATTRIBUTEVALUEXHTML:
				setATTRIBUTEVALUEXHTML((ATTRIBUTEVALUEXHTML)newValue);
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
			case MyreqifPackage.DEFAULTVALUE_TYPE5__ATTRIBUTEVALUEXHTML:
				setATTRIBUTEVALUEXHTML((ATTRIBUTEVALUEXHTML)null);
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
			case MyreqifPackage.DEFAULTVALUE_TYPE5__ATTRIBUTEVALUEXHTML:
				return aTTRIBUTEVALUEXHTML != null;
		}
		return super.eIsSet(featureID);
	}

} //DEFAULTVALUEType5Impl
