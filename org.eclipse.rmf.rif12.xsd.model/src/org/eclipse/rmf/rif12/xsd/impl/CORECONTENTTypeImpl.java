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
import org.eclipse.rmf.rif12.xsd.CORECONTENTType;
import org.eclipse.rmf.rif12.xsd.RIFCONTENT;
import org.eclipse.rmf.rif12.xsd.RifPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CORECONTENT Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.CORECONTENTTypeImpl#getRIFCONTENT <em>RIFCONTENT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CORECONTENTTypeImpl extends EObjectImpl implements CORECONTENTType {
	/**
	 * The cached value of the '{@link #getRIFCONTENT() <em>RIFCONTENT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRIFCONTENT()
	 * @generated
	 * @ordered
	 */
	protected RIFCONTENT rIFCONTENT;

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
		return RifPackage.Literals.CORECONTENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIFCONTENT getRIFCONTENT() {
		return rIFCONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRIFCONTENT(RIFCONTENT newRIFCONTENT, NotificationChain msgs) {
		RIFCONTENT oldRIFCONTENT = rIFCONTENT;
		rIFCONTENT = newRIFCONTENT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.CORECONTENT_TYPE__RIFCONTENT, oldRIFCONTENT, newRIFCONTENT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRIFCONTENT(RIFCONTENT newRIFCONTENT) {
		if (newRIFCONTENT != rIFCONTENT) {
			NotificationChain msgs = null;
			if (rIFCONTENT != null)
				msgs = ((InternalEObject)rIFCONTENT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.CORECONTENT_TYPE__RIFCONTENT, null, msgs);
			if (newRIFCONTENT != null)
				msgs = ((InternalEObject)newRIFCONTENT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.CORECONTENT_TYPE__RIFCONTENT, null, msgs);
			msgs = basicSetRIFCONTENT(newRIFCONTENT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.CORECONTENT_TYPE__RIFCONTENT, newRIFCONTENT, newRIFCONTENT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RifPackage.CORECONTENT_TYPE__RIFCONTENT:
				return basicSetRIFCONTENT(null, msgs);
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
			case RifPackage.CORECONTENT_TYPE__RIFCONTENT:
				return getRIFCONTENT();
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
			case RifPackage.CORECONTENT_TYPE__RIFCONTENT:
				setRIFCONTENT((RIFCONTENT)newValue);
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
			case RifPackage.CORECONTENT_TYPE__RIFCONTENT:
				setRIFCONTENT((RIFCONTENT)null);
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
			case RifPackage.CORECONTENT_TYPE__RIFCONTENT:
				return rIFCONTENT != null;
		}
		return super.eIsSet(featureID);
	}

} //CORECONTENTTypeImpl
