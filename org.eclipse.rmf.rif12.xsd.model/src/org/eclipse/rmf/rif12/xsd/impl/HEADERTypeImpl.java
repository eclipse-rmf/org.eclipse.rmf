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
import org.eclipse.rmf.rif12.xsd.HEADERType;
import org.eclipse.rmf.rif12.xsd.RIFHEADER;
import org.eclipse.rmf.rif12.xsd.RifPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HEADER Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.HEADERTypeImpl#getRIFHEADER <em>RIFHEADER</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HEADERTypeImpl extends EObjectImpl implements HEADERType {
	/**
	 * The cached value of the '{@link #getRIFHEADER() <em>RIFHEADER</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRIFHEADER()
	 * @generated
	 * @ordered
	 */
	protected RIFHEADER rIFHEADER;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HEADERTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.HEADER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIFHEADER getRIFHEADER() {
		return rIFHEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRIFHEADER(RIFHEADER newRIFHEADER, NotificationChain msgs) {
		RIFHEADER oldRIFHEADER = rIFHEADER;
		rIFHEADER = newRIFHEADER;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.HEADER_TYPE__RIFHEADER, oldRIFHEADER, newRIFHEADER);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRIFHEADER(RIFHEADER newRIFHEADER) {
		if (newRIFHEADER != rIFHEADER) {
			NotificationChain msgs = null;
			if (rIFHEADER != null)
				msgs = ((InternalEObject)rIFHEADER).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.HEADER_TYPE__RIFHEADER, null, msgs);
			if (newRIFHEADER != null)
				msgs = ((InternalEObject)newRIFHEADER).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.HEADER_TYPE__RIFHEADER, null, msgs);
			msgs = basicSetRIFHEADER(newRIFHEADER, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.HEADER_TYPE__RIFHEADER, newRIFHEADER, newRIFHEADER));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RifPackage.HEADER_TYPE__RIFHEADER:
				return basicSetRIFHEADER(null, msgs);
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
			case RifPackage.HEADER_TYPE__RIFHEADER:
				return getRIFHEADER();
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
			case RifPackage.HEADER_TYPE__RIFHEADER:
				setRIFHEADER((RIFHEADER)newValue);
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
			case RifPackage.HEADER_TYPE__RIFHEADER:
				setRIFHEADER((RIFHEADER)null);
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
			case RifPackage.HEADER_TYPE__RIFHEADER:
				return rIFHEADER != null;
		}
		return super.eIsSet(featureID);
	}

} //HEADERTypeImpl
