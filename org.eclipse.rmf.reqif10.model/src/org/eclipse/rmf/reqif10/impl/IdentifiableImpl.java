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

package org.eclipse.rmf.reqif10.impl;

import org.eclipse.rmf.reqif10.AlternativeId;
import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.rmf.reqif10.Reqif10Package;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identifiable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.IdentifiableImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.IdentifiableImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.IdentifiableImpl#getLastChange <em>Last Change</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.IdentifiableImpl#getLongName <em>Long Name</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.IdentifiableImpl#getAlternativeId <em>Alternative Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IdentifiableImpl extends EObjectImpl implements Identifiable {
	/**
	 * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesc() <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected String desc = DESC_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastChange() <em>Last Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastChange()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_CHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastChange() <em>Last Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastChange()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastChange = LAST_CHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongName() <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongName()
	 * @generated
	 * @ordered
	 */
	protected static final String LONG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongName() <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongName()
	 * @generated
	 * @ordered
	 */
	protected String longName = LONG_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAlternativeId() <em>Alternative Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternativeId()
	 * @generated
	 * @ordered
	 */
	protected AlternativeId alternativeId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected IdentifiableImpl() {
		super();
		identifier  = EcoreUtil.generateUUID();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Reqif10Package.Literals.IDENTIFIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesc(String newDesc) {
		String oldDesc = desc;
		desc = newDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.IDENTIFIABLE__DESC, oldDesc, desc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.IDENTIFIABLE__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getLastChange() {
		return lastChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastChange(XMLGregorianCalendar newLastChange) {
		XMLGregorianCalendar oldLastChange = lastChange;
		lastChange = newLastChange;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.IDENTIFIABLE__LAST_CHANGE, oldLastChange, lastChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLongName() {
		return longName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongName(String newLongName) {
		String oldLongName = longName;
		longName = newLongName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.IDENTIFIABLE__LONG_NAME, oldLongName, longName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternativeId getAlternativeId() {
		return alternativeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlternativeId(AlternativeId newAlternativeId, NotificationChain msgs) {
		AlternativeId oldAlternativeId = alternativeId;
		alternativeId = newAlternativeId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Reqif10Package.IDENTIFIABLE__ALTERNATIVE_ID, oldAlternativeId, newAlternativeId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlternativeId(AlternativeId newAlternativeId) {
		if (newAlternativeId != alternativeId) {
			NotificationChain msgs = null;
			if (alternativeId != null)
				msgs = ((InternalEObject)alternativeId).eInverseRemove(this, Reqif10Package.ALTERNATIVE_ID__IDENT, AlternativeId.class, msgs);
			if (newAlternativeId != null)
				msgs = ((InternalEObject)newAlternativeId).eInverseAdd(this, Reqif10Package.ALTERNATIVE_ID__IDENT, AlternativeId.class, msgs);
			msgs = basicSetAlternativeId(newAlternativeId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.IDENTIFIABLE__ALTERNATIVE_ID, newAlternativeId, newAlternativeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Reqif10Package.IDENTIFIABLE__ALTERNATIVE_ID:
				if (alternativeId != null)
					msgs = ((InternalEObject)alternativeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Reqif10Package.IDENTIFIABLE__ALTERNATIVE_ID, null, msgs);
				return basicSetAlternativeId((AlternativeId)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Reqif10Package.IDENTIFIABLE__ALTERNATIVE_ID:
				return basicSetAlternativeId(null, msgs);
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
			case Reqif10Package.IDENTIFIABLE__DESC:
				return getDesc();
			case Reqif10Package.IDENTIFIABLE__IDENTIFIER:
				return getIdentifier();
			case Reqif10Package.IDENTIFIABLE__LAST_CHANGE:
				return getLastChange();
			case Reqif10Package.IDENTIFIABLE__LONG_NAME:
				return getLongName();
			case Reqif10Package.IDENTIFIABLE__ALTERNATIVE_ID:
				return getAlternativeId();
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
			case Reqif10Package.IDENTIFIABLE__DESC:
				setDesc((String)newValue);
				return;
			case Reqif10Package.IDENTIFIABLE__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case Reqif10Package.IDENTIFIABLE__LAST_CHANGE:
				setLastChange((XMLGregorianCalendar)newValue);
				return;
			case Reqif10Package.IDENTIFIABLE__LONG_NAME:
				setLongName((String)newValue);
				return;
			case Reqif10Package.IDENTIFIABLE__ALTERNATIVE_ID:
				setAlternativeId((AlternativeId)newValue);
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
			case Reqif10Package.IDENTIFIABLE__DESC:
				setDesc(DESC_EDEFAULT);
				return;
			case Reqif10Package.IDENTIFIABLE__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case Reqif10Package.IDENTIFIABLE__LAST_CHANGE:
				setLastChange(LAST_CHANGE_EDEFAULT);
				return;
			case Reqif10Package.IDENTIFIABLE__LONG_NAME:
				setLongName(LONG_NAME_EDEFAULT);
				return;
			case Reqif10Package.IDENTIFIABLE__ALTERNATIVE_ID:
				setAlternativeId((AlternativeId)null);
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
			case Reqif10Package.IDENTIFIABLE__DESC:
				return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
			case Reqif10Package.IDENTIFIABLE__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case Reqif10Package.IDENTIFIABLE__LAST_CHANGE:
				return LAST_CHANGE_EDEFAULT == null ? lastChange != null : !LAST_CHANGE_EDEFAULT.equals(lastChange);
			case Reqif10Package.IDENTIFIABLE__LONG_NAME:
				return LONG_NAME_EDEFAULT == null ? longName != null : !LONG_NAME_EDEFAULT.equals(longName);
			case Reqif10Package.IDENTIFIABLE__ALTERNATIVE_ID:
				return alternativeId != null;
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
		result.append(" (desc: ");
		result.append(desc);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", lastChange: ");
		result.append(lastChange);
		result.append(", longName: ");
		result.append(longName);
		result.append(')');
		return result.toString();
	}

} //IdentifiableImpl
