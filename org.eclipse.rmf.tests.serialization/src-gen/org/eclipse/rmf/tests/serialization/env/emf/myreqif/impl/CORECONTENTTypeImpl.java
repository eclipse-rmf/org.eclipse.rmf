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

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.CORECONTENTType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CORECONTENT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.CORECONTENTTypeImpl#getREQIFCONTENT <em>REQIFCONTENT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CORECONTENTTypeImpl extends EObjectImpl implements CORECONTENTType {
	/**
	 * The cached value of the '{@link #getREQIFCONTENT() <em>REQIFCONTENT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getREQIFCONTENT()
	 * @generated
	 * @ordered
	 */
	protected REQIFCONTENT rEQIFCONTENT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CORECONTENTTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.CORECONTENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REQIFCONTENT getREQIFCONTENT() {
		return rEQIFCONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetREQIFCONTENT(REQIFCONTENT newREQIFCONTENT, NotificationChain msgs) {
		REQIFCONTENT oldREQIFCONTENT = rEQIFCONTENT;
		rEQIFCONTENT = newREQIFCONTENT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.CORECONTENT_TYPE__REQIFCONTENT, oldREQIFCONTENT, newREQIFCONTENT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setREQIFCONTENT(REQIFCONTENT newREQIFCONTENT) {
		if (newREQIFCONTENT != rEQIFCONTENT) {
			NotificationChain msgs = null;
			if (rEQIFCONTENT != null)
				msgs = ((InternalEObject)rEQIFCONTENT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.CORECONTENT_TYPE__REQIFCONTENT, null, msgs);
			if (newREQIFCONTENT != null)
				msgs = ((InternalEObject)newREQIFCONTENT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.CORECONTENT_TYPE__REQIFCONTENT, null, msgs);
			msgs = basicSetREQIFCONTENT(newREQIFCONTENT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.CORECONTENT_TYPE__REQIFCONTENT, newREQIFCONTENT, newREQIFCONTENT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyreqifPackage.CORECONTENT_TYPE__REQIFCONTENT:
				return basicSetREQIFCONTENT(null, msgs);
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
			case MyreqifPackage.CORECONTENT_TYPE__REQIFCONTENT:
				return getREQIFCONTENT();
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
			case MyreqifPackage.CORECONTENT_TYPE__REQIFCONTENT:
				setREQIFCONTENT((REQIFCONTENT)newValue);
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
			case MyreqifPackage.CORECONTENT_TYPE__REQIFCONTENT:
				setREQIFCONTENT((REQIFCONTENT)null);
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
			case MyreqifPackage.CORECONTENT_TYPE__REQIFCONTENT:
				return rEQIFCONTENT != null;
		}
		return super.eIsSet(featureID);
	}

} //CORECONTENTTypeImpl
