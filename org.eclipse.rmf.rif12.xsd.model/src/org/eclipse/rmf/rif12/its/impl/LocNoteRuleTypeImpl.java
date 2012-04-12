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

package org.eclipse.rmf.rif12.its.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.rmf.rif12.its.ItsPackage;
import org.eclipse.rmf.rif12.its.LocNoteRuleType;
import org.eclipse.rmf.rif12.its.LocNoteTypeType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loc Note Rule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.LocNoteRuleTypeImpl#getLocNotePointer <em>Loc Note Pointer</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.LocNoteRuleTypeImpl#getLocNoteRef <em>Loc Note Ref</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.LocNoteRuleTypeImpl#getLocNoteRefPointer <em>Loc Note Ref Pointer</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.LocNoteRuleTypeImpl#getLocNoteType <em>Loc Note Type</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.LocNoteRuleTypeImpl#getSelector <em>Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocNoteRuleTypeImpl extends ItsLocNoteRuleContentImpl implements LocNoteRuleType {
	/**
	 * The default value of the '{@link #getLocNotePointer() <em>Loc Note Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocNotePointer()
	 * @generated
	 * @ordered
	 */
	protected static final String LOC_NOTE_POINTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocNotePointer() <em>Loc Note Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocNotePointer()
	 * @generated
	 * @ordered
	 */
	protected String locNotePointer = LOC_NOTE_POINTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocNoteRef() <em>Loc Note Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocNoteRef()
	 * @generated
	 * @ordered
	 */
	protected static final String LOC_NOTE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocNoteRef() <em>Loc Note Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocNoteRef()
	 * @generated
	 * @ordered
	 */
	protected String locNoteRef = LOC_NOTE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocNoteRefPointer() <em>Loc Note Ref Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocNoteRefPointer()
	 * @generated
	 * @ordered
	 */
	protected static final String LOC_NOTE_REF_POINTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocNoteRefPointer() <em>Loc Note Ref Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocNoteRefPointer()
	 * @generated
	 * @ordered
	 */
	protected String locNoteRefPointer = LOC_NOTE_REF_POINTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocNoteType() <em>Loc Note Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocNoteType()
	 * @generated
	 * @ordered
	 */
	protected static final LocNoteTypeType LOC_NOTE_TYPE_EDEFAULT = LocNoteTypeType.ALERT;

	/**
	 * The cached value of the '{@link #getLocNoteType() <em>Loc Note Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocNoteType()
	 * @generated
	 * @ordered
	 */
	protected LocNoteTypeType locNoteType = LOC_NOTE_TYPE_EDEFAULT;

	/**
	 * This is true if the Loc Note Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean locNoteTypeESet;

	/**
	 * The default value of the '{@link #getSelector() <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelector() <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected String selector = SELECTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocNoteRuleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItsPackage.Literals.LOC_NOTE_RULE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocNotePointer() {
		return locNotePointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocNotePointer(String newLocNotePointer) {
		String oldLocNotePointer = locNotePointer;
		locNotePointer = newLocNotePointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.LOC_NOTE_RULE_TYPE__LOC_NOTE_POINTER, oldLocNotePointer, locNotePointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocNoteRef() {
		return locNoteRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocNoteRef(String newLocNoteRef) {
		String oldLocNoteRef = locNoteRef;
		locNoteRef = newLocNoteRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.LOC_NOTE_RULE_TYPE__LOC_NOTE_REF, oldLocNoteRef, locNoteRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocNoteRefPointer() {
		return locNoteRefPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocNoteRefPointer(String newLocNoteRefPointer) {
		String oldLocNoteRefPointer = locNoteRefPointer;
		locNoteRefPointer = newLocNoteRefPointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.LOC_NOTE_RULE_TYPE__LOC_NOTE_REF_POINTER, oldLocNoteRefPointer, locNoteRefPointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocNoteTypeType getLocNoteType() {
		return locNoteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocNoteType(LocNoteTypeType newLocNoteType) {
		LocNoteTypeType oldLocNoteType = locNoteType;
		locNoteType = newLocNoteType == null ? LOC_NOTE_TYPE_EDEFAULT : newLocNoteType;
		boolean oldLocNoteTypeESet = locNoteTypeESet;
		locNoteTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.LOC_NOTE_RULE_TYPE__LOC_NOTE_TYPE, oldLocNoteType, locNoteType, !oldLocNoteTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLocNoteType() {
		LocNoteTypeType oldLocNoteType = locNoteType;
		boolean oldLocNoteTypeESet = locNoteTypeESet;
		locNoteType = LOC_NOTE_TYPE_EDEFAULT;
		locNoteTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ItsPackage.LOC_NOTE_RULE_TYPE__LOC_NOTE_TYPE, oldLocNoteType, LOC_NOTE_TYPE_EDEFAULT, oldLocNoteTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLocNoteType() {
		return locNoteTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelector() {
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelector(String newSelector) {
		String oldSelector = selector;
		selector = newSelector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.LOC_NOTE_RULE_TYPE__SELECTOR, oldSelector, selector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ItsPackage.LOC_NOTE_RULE_TYPE__LOC_NOTE_POINTER:
				return getLocNotePointer();
			case ItsPackage.LOC_NOTE_RULE_TYPE__LOC_NOTE_REF:
				return getLocNoteRef();
			case ItsPackage.LOC_NOTE_RULE_TYPE__LOC_NOTE_REF_POINTER:
				return getLocNoteRefPointer();
			case ItsPackage.LOC_NOTE_RULE_TYPE__LOC_NOTE_TYPE:
				return getLocNoteType();
			case ItsPackage.LOC_NOTE_RULE_TYPE__SELECTOR:
				return getSelector();
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
			case ItsPackage.LOC_NOTE_RULE_TYPE__LOC_NOTE_POINTER:
				setLocNotePointer((String)newValue);
				return;
			case ItsPackage.LOC_NOTE_RULE_TYPE__LOC_NOTE_REF:
				setLocNoteRef((String)newValue);
				return;
			case ItsPackage.LOC_NOTE_RULE_TYPE__LOC_NOTE_REF_POINTER:
				setLocNoteRefPointer((String)newValue);
				return;
			case ItsPackage.LOC_NOTE_RULE_TYPE__LOC_NOTE_TYPE:
				setLocNoteType((LocNoteTypeType)newValue);
				return;
			case ItsPackage.LOC_NOTE_RULE_TYPE__SELECTOR:
				setSelector((String)newValue);
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
			case ItsPackage.LOC_NOTE_RULE_TYPE__LOC_NOTE_POINTER:
				setLocNotePointer(LOC_NOTE_POINTER_EDEFAULT);
				return;
			case ItsPackage.LOC_NOTE_RULE_TYPE__LOC_NOTE_REF:
				setLocNoteRef(LOC_NOTE_REF_EDEFAULT);
				return;
			case ItsPackage.LOC_NOTE_RULE_TYPE__LOC_NOTE_REF_POINTER:
				setLocNoteRefPointer(LOC_NOTE_REF_POINTER_EDEFAULT);
				return;
			case ItsPackage.LOC_NOTE_RULE_TYPE__LOC_NOTE_TYPE:
				unsetLocNoteType();
				return;
			case ItsPackage.LOC_NOTE_RULE_TYPE__SELECTOR:
				setSelector(SELECTOR_EDEFAULT);
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
			case ItsPackage.LOC_NOTE_RULE_TYPE__LOC_NOTE_POINTER:
				return LOC_NOTE_POINTER_EDEFAULT == null ? locNotePointer != null : !LOC_NOTE_POINTER_EDEFAULT.equals(locNotePointer);
			case ItsPackage.LOC_NOTE_RULE_TYPE__LOC_NOTE_REF:
				return LOC_NOTE_REF_EDEFAULT == null ? locNoteRef != null : !LOC_NOTE_REF_EDEFAULT.equals(locNoteRef);
			case ItsPackage.LOC_NOTE_RULE_TYPE__LOC_NOTE_REF_POINTER:
				return LOC_NOTE_REF_POINTER_EDEFAULT == null ? locNoteRefPointer != null : !LOC_NOTE_REF_POINTER_EDEFAULT.equals(locNoteRefPointer);
			case ItsPackage.LOC_NOTE_RULE_TYPE__LOC_NOTE_TYPE:
				return isSetLocNoteType();
			case ItsPackage.LOC_NOTE_RULE_TYPE__SELECTOR:
				return SELECTOR_EDEFAULT == null ? selector != null : !SELECTOR_EDEFAULT.equals(selector);
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
		result.append(" (locNotePointer: ");
		result.append(locNotePointer);
		result.append(", locNoteRef: ");
		result.append(locNoteRef);
		result.append(", locNoteRefPointer: ");
		result.append(locNoteRefPointer);
		result.append(", locNoteType: ");
		if (locNoteTypeESet) result.append(locNoteType); else result.append("<unset>");
		result.append(", selector: ");
		result.append(selector);
		result.append(')');
		return result.toString();
	}

} //LocNoteRuleTypeImpl
