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

package org.eclipse.rmf.rif11.xsd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.rmf.rif11.xsd.EMBEDDEDVALUE;
import org.eclipse.rmf.rif11.xsd.PROPERTIESType;
import org.eclipse.rmf.rif11.xsd.RifPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PROPERTIES Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.PROPERTIESTypeImpl#getEMBEDDEDVALUE <em>EMBEDDEDVALUE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PROPERTIESTypeImpl extends EObjectImpl implements PROPERTIESType {
	/**
	 * The cached value of the '{@link #getEMBEDDEDVALUE() <em>EMBEDDEDVALUE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMBEDDEDVALUE()
	 * @generated
	 * @ordered
	 */
	protected EMBEDDEDVALUE eMBEDDEDVALUE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PROPERTIESTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.PROPERTIES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMBEDDEDVALUE getEMBEDDEDVALUE() {
		return eMBEDDEDVALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEMBEDDEDVALUE(EMBEDDEDVALUE newEMBEDDEDVALUE, NotificationChain msgs) {
		EMBEDDEDVALUE oldEMBEDDEDVALUE = eMBEDDEDVALUE;
		eMBEDDEDVALUE = newEMBEDDEDVALUE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.PROPERTIES_TYPE__EMBEDDEDVALUE, oldEMBEDDEDVALUE, newEMBEDDEDVALUE);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEMBEDDEDVALUE(EMBEDDEDVALUE newEMBEDDEDVALUE) {
		if (newEMBEDDEDVALUE != eMBEDDEDVALUE) {
			NotificationChain msgs = null;
			if (eMBEDDEDVALUE != null)
				msgs = ((InternalEObject)eMBEDDEDVALUE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.PROPERTIES_TYPE__EMBEDDEDVALUE, null, msgs);
			if (newEMBEDDEDVALUE != null)
				msgs = ((InternalEObject)newEMBEDDEDVALUE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.PROPERTIES_TYPE__EMBEDDEDVALUE, null, msgs);
			msgs = basicSetEMBEDDEDVALUE(newEMBEDDEDVALUE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.PROPERTIES_TYPE__EMBEDDEDVALUE, newEMBEDDEDVALUE, newEMBEDDEDVALUE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RifPackage.PROPERTIES_TYPE__EMBEDDEDVALUE:
				return basicSetEMBEDDEDVALUE(null, msgs);
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
			case RifPackage.PROPERTIES_TYPE__EMBEDDEDVALUE:
				return getEMBEDDEDVALUE();
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
			case RifPackage.PROPERTIES_TYPE__EMBEDDEDVALUE:
				setEMBEDDEDVALUE((EMBEDDEDVALUE)newValue);
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
			case RifPackage.PROPERTIES_TYPE__EMBEDDEDVALUE:
				setEMBEDDEDVALUE((EMBEDDEDVALUE)null);
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
			case RifPackage.PROPERTIES_TYPE__EMBEDDEDVALUE:
				return eMBEDDEDVALUE != null;
		}
		return super.eIsSet(featureID);
	}

} //PROPERTIESTypeImpl
