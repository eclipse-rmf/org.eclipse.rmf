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

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.EMBEDDEDVALUE;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMBEDDEDVALUE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.EMBEDDEDVALUEImpl#getKEY <em>KEY</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.EMBEDDEDVALUEImpl#getOTHERCONTENT <em>OTHERCONTENT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EMBEDDEDVALUEImpl extends EObjectImpl implements EMBEDDEDVALUE {
	/**
	 * The default value of the '{@link #getKEY() <em>KEY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKEY()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKEY() <em>KEY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKEY()
	 * @generated
	 * @ordered
	 */
	protected BigInteger kEY = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOTHERCONTENT() <em>OTHERCONTENT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOTHERCONTENT()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHERCONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOTHERCONTENT() <em>OTHERCONTENT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOTHERCONTENT()
	 * @generated
	 * @ordered
	 */
	protected String oTHERCONTENT = OTHERCONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMBEDDEDVALUEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.EMBEDDEDVALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getKEY() {
		return kEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKEY(BigInteger newKEY) {
		BigInteger oldKEY = kEY;
		kEY = newKEY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.EMBEDDEDVALUE__KEY, oldKEY, kEY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOTHERCONTENT() {
		return oTHERCONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOTHERCONTENT(String newOTHERCONTENT) {
		String oldOTHERCONTENT = oTHERCONTENT;
		oTHERCONTENT = newOTHERCONTENT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.EMBEDDEDVALUE__OTHERCONTENT, oldOTHERCONTENT, oTHERCONTENT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyreqifPackage.EMBEDDEDVALUE__KEY:
				return getKEY();
			case MyreqifPackage.EMBEDDEDVALUE__OTHERCONTENT:
				return getOTHERCONTENT();
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
			case MyreqifPackage.EMBEDDEDVALUE__KEY:
				setKEY((BigInteger)newValue);
				return;
			case MyreqifPackage.EMBEDDEDVALUE__OTHERCONTENT:
				setOTHERCONTENT((String)newValue);
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
			case MyreqifPackage.EMBEDDEDVALUE__KEY:
				setKEY(KEY_EDEFAULT);
				return;
			case MyreqifPackage.EMBEDDEDVALUE__OTHERCONTENT:
				setOTHERCONTENT(OTHERCONTENT_EDEFAULT);
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
			case MyreqifPackage.EMBEDDEDVALUE__KEY:
				return KEY_EDEFAULT == null ? kEY != null : !KEY_EDEFAULT.equals(kEY);
			case MyreqifPackage.EMBEDDEDVALUE__OTHERCONTENT:
				return OTHERCONTENT_EDEFAULT == null ? oTHERCONTENT != null : !OTHERCONTENT_EDEFAULT.equals(oTHERCONTENT);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (kEY: ");
		result.append(kEY);
		result.append(", oTHERCONTENT: ");
		result.append(oTHERCONTENT);
		result.append(')');
		return result.toString();
	}

} //EMBEDDEDVALUEImpl
