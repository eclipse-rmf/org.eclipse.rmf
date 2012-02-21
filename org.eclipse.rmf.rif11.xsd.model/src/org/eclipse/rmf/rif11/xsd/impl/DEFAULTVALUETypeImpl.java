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
import org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE;
import org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType;
import org.eclipse.rmf.rif11.xsd.RifPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DEFAULTVALUE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.DEFAULTVALUETypeImpl#getATTRIBUTEVALUESIMPLE <em>ATTRIBUTEVALUESIMPLE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DEFAULTVALUETypeImpl extends EObjectImpl implements DEFAULTVALUEType {
	/**
	 * The cached value of the '{@link #getATTRIBUTEVALUESIMPLE() <em>ATTRIBUTEVALUESIMPLE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEVALUESIMPLE()
	 * @generated
	 * @ordered
	 */
	protected ATTRIBUTEVALUESIMPLE aTTRIBUTEVALUESIMPLE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DEFAULTVALUETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.DEFAULTVALUE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEVALUESIMPLE getATTRIBUTEVALUESIMPLE() {
		return aTTRIBUTEVALUESIMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetATTRIBUTEVALUESIMPLE(ATTRIBUTEVALUESIMPLE newATTRIBUTEVALUESIMPLE, NotificationChain msgs) {
		ATTRIBUTEVALUESIMPLE oldATTRIBUTEVALUESIMPLE = aTTRIBUTEVALUESIMPLE;
		aTTRIBUTEVALUESIMPLE = newATTRIBUTEVALUESIMPLE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.DEFAULTVALUE_TYPE__ATTRIBUTEVALUESIMPLE, oldATTRIBUTEVALUESIMPLE, newATTRIBUTEVALUESIMPLE);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEVALUESIMPLE(ATTRIBUTEVALUESIMPLE newATTRIBUTEVALUESIMPLE) {
		if (newATTRIBUTEVALUESIMPLE != aTTRIBUTEVALUESIMPLE) {
			NotificationChain msgs = null;
			if (aTTRIBUTEVALUESIMPLE != null)
				msgs = ((InternalEObject)aTTRIBUTEVALUESIMPLE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.DEFAULTVALUE_TYPE__ATTRIBUTEVALUESIMPLE, null, msgs);
			if (newATTRIBUTEVALUESIMPLE != null)
				msgs = ((InternalEObject)newATTRIBUTEVALUESIMPLE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.DEFAULTVALUE_TYPE__ATTRIBUTEVALUESIMPLE, null, msgs);
			msgs = basicSetATTRIBUTEVALUESIMPLE(newATTRIBUTEVALUESIMPLE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DEFAULTVALUE_TYPE__ATTRIBUTEVALUESIMPLE, newATTRIBUTEVALUESIMPLE, newATTRIBUTEVALUESIMPLE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RifPackage.DEFAULTVALUE_TYPE__ATTRIBUTEVALUESIMPLE:
				return basicSetATTRIBUTEVALUESIMPLE(null, msgs);
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
			case RifPackage.DEFAULTVALUE_TYPE__ATTRIBUTEVALUESIMPLE:
				return getATTRIBUTEVALUESIMPLE();
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
			case RifPackage.DEFAULTVALUE_TYPE__ATTRIBUTEVALUESIMPLE:
				setATTRIBUTEVALUESIMPLE((ATTRIBUTEVALUESIMPLE)newValue);
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
			case RifPackage.DEFAULTVALUE_TYPE__ATTRIBUTEVALUESIMPLE:
				setATTRIBUTEVALUESIMPLE((ATTRIBUTEVALUESIMPLE)null);
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
			case RifPackage.DEFAULTVALUE_TYPE__ATTRIBUTEVALUESIMPLE:
				return aTTRIBUTEVALUESIMPLE != null;
		}
		return super.eIsSet(featureID);
	}

} //DEFAULTVALUETypeImpl
