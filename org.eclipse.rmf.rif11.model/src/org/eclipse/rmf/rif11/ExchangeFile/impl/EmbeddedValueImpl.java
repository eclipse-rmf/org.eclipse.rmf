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

package org.eclipse.rmf.rif11.ExchangeFile.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.rmf.rif11.ExchangeFile.EmbeddedValue;
import org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Embedded Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.EmbeddedValueImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.EmbeddedValueImpl#getOtherContent <em>Other Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmbeddedValueImpl extends EObjectImpl implements EmbeddedValue {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected BigInteger key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherContent() <em>Other Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherContent()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherContent() <em>Other Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherContent()
	 * @generated
	 * @ordered
	 */
	protected String otherContent = OTHER_CONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmbeddedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExchangeFilePackage.Literals.EMBEDDED_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(BigInteger newKey) {
		BigInteger oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.EMBEDDED_VALUE__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOtherContent() {
		return otherContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherContent(String newOtherContent) {
		String oldOtherContent = otherContent;
		otherContent = newOtherContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.EMBEDDED_VALUE__OTHER_CONTENT, oldOtherContent, otherContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExchangeFilePackage.EMBEDDED_VALUE__KEY:
				return getKey();
			case ExchangeFilePackage.EMBEDDED_VALUE__OTHER_CONTENT:
				return getOtherContent();
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
			case ExchangeFilePackage.EMBEDDED_VALUE__KEY:
				setKey((BigInteger)newValue);
				return;
			case ExchangeFilePackage.EMBEDDED_VALUE__OTHER_CONTENT:
				setOtherContent((String)newValue);
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
			case ExchangeFilePackage.EMBEDDED_VALUE__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case ExchangeFilePackage.EMBEDDED_VALUE__OTHER_CONTENT:
				setOtherContent(OTHER_CONTENT_EDEFAULT);
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
			case ExchangeFilePackage.EMBEDDED_VALUE__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case ExchangeFilePackage.EMBEDDED_VALUE__OTHER_CONTENT:
				return OTHER_CONTENT_EDEFAULT == null ? otherContent != null : !OTHER_CONTENT_EDEFAULT.equals(otherContent);
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
		result.append(" (key: ");
		result.append(key);
		result.append(", otherContent: ");
		result.append(otherContent);
		result.append(')');
		return result.toString();
	}

} //EmbeddedValueImpl
