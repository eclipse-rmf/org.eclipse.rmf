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

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.THEHEADERType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>THEHEADER Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.THEHEADERTypeImpl#getREQIFHEADER <em>REQIFHEADER</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class THEHEADERTypeImpl extends EObjectImpl implements THEHEADERType {
	/**
	 * The cached value of the '{@link #getREQIFHEADER() <em>REQIFHEADER</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getREQIFHEADER()
	 * @generated
	 * @ordered
	 */
	protected REQIFHEADER rEQIFHEADER;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected THEHEADERTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.THEHEADER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REQIFHEADER getREQIFHEADER() {
		return rEQIFHEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetREQIFHEADER(REQIFHEADER newREQIFHEADER, NotificationChain msgs) {
		REQIFHEADER oldREQIFHEADER = rEQIFHEADER;
		rEQIFHEADER = newREQIFHEADER;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.THEHEADER_TYPE__REQIFHEADER, oldREQIFHEADER, newREQIFHEADER);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setREQIFHEADER(REQIFHEADER newREQIFHEADER) {
		if (newREQIFHEADER != rEQIFHEADER) {
			NotificationChain msgs = null;
			if (rEQIFHEADER != null)
				msgs = ((InternalEObject)rEQIFHEADER).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.THEHEADER_TYPE__REQIFHEADER, null, msgs);
			if (newREQIFHEADER != null)
				msgs = ((InternalEObject)newREQIFHEADER).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.THEHEADER_TYPE__REQIFHEADER, null, msgs);
			msgs = basicSetREQIFHEADER(newREQIFHEADER, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.THEHEADER_TYPE__REQIFHEADER, newREQIFHEADER, newREQIFHEADER));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyreqifPackage.THEHEADER_TYPE__REQIFHEADER:
				return basicSetREQIFHEADER(null, msgs);
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
			case MyreqifPackage.THEHEADER_TYPE__REQIFHEADER:
				return getREQIFHEADER();
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
			case MyreqifPackage.THEHEADER_TYPE__REQIFHEADER:
				setREQIFHEADER((REQIFHEADER)newValue);
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
			case MyreqifPackage.THEHEADER_TYPE__REQIFHEADER:
				setREQIFHEADER((REQIFHEADER)null);
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
			case MyreqifPackage.THEHEADER_TYPE__REQIFHEADER:
				return rEQIFHEADER != null;
		}
		return super.eIsSet(featureID);
	}

} //THEHEADERTypeImpl
