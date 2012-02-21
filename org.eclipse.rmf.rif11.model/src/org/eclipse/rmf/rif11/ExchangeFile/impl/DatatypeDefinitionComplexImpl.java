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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionComplex;
import org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype Definition Complex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionComplexImpl#getEmbedded <em>Embedded</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DatatypeDefinitionComplexImpl extends DatatypeDefinitionImpl implements DatatypeDefinitionComplex {
	/**
	 * The default value of the '{@link #getEmbedded() <em>Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbedded()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EMBEDDED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmbedded() <em>Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbedded()
	 * @generated
	 * @ordered
	 */
	protected Boolean embedded = EMBEDDED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatatypeDefinitionComplexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExchangeFilePackage.Literals.DATATYPE_DEFINITION_COMPLEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getEmbedded() {
		return embedded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbedded(Boolean newEmbedded) {
		Boolean oldEmbedded = embedded;
		embedded = newEmbedded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.DATATYPE_DEFINITION_COMPLEX__EMBEDDED, oldEmbedded, embedded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExchangeFilePackage.DATATYPE_DEFINITION_COMPLEX__EMBEDDED:
				return getEmbedded();
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
			case ExchangeFilePackage.DATATYPE_DEFINITION_COMPLEX__EMBEDDED:
				setEmbedded((Boolean)newValue);
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
			case ExchangeFilePackage.DATATYPE_DEFINITION_COMPLEX__EMBEDDED:
				setEmbedded(EMBEDDED_EDEFAULT);
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
			case ExchangeFilePackage.DATATYPE_DEFINITION_COMPLEX__EMBEDDED:
				return EMBEDDED_EDEFAULT == null ? embedded != null : !EMBEDDED_EDEFAULT.equals(embedded);
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
		result.append(" (embedded: ");
		result.append(embedded);
		result.append(')');
		return result.toString();
	}

} //DatatypeDefinitionComplexImpl
