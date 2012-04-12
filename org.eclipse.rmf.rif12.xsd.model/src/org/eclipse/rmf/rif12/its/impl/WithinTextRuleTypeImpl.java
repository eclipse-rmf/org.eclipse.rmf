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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.rmf.rif12.its.ItsPackage;
import org.eclipse.rmf.rif12.its.WithinTextRuleType;
import org.eclipse.rmf.rif12.its.WithinTextType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Within Text Rule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.WithinTextRuleTypeImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.WithinTextRuleTypeImpl#getWithinText <em>Within Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WithinTextRuleTypeImpl extends EObjectImpl implements WithinTextRuleType {
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
	 * The default value of the '{@link #getWithinText() <em>Within Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithinText()
	 * @generated
	 * @ordered
	 */
	protected static final WithinTextType WITHIN_TEXT_EDEFAULT = WithinTextType.YES;

	/**
	 * The cached value of the '{@link #getWithinText() <em>Within Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithinText()
	 * @generated
	 * @ordered
	 */
	protected WithinTextType withinText = WITHIN_TEXT_EDEFAULT;

	/**
	 * This is true if the Within Text attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean withinTextESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WithinTextRuleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItsPackage.Literals.WITHIN_TEXT_RULE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.WITHIN_TEXT_RULE_TYPE__SELECTOR, oldSelector, selector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithinTextType getWithinText() {
		return withinText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithinText(WithinTextType newWithinText) {
		WithinTextType oldWithinText = withinText;
		withinText = newWithinText == null ? WITHIN_TEXT_EDEFAULT : newWithinText;
		boolean oldWithinTextESet = withinTextESet;
		withinTextESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.WITHIN_TEXT_RULE_TYPE__WITHIN_TEXT, oldWithinText, withinText, !oldWithinTextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWithinText() {
		WithinTextType oldWithinText = withinText;
		boolean oldWithinTextESet = withinTextESet;
		withinText = WITHIN_TEXT_EDEFAULT;
		withinTextESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ItsPackage.WITHIN_TEXT_RULE_TYPE__WITHIN_TEXT, oldWithinText, WITHIN_TEXT_EDEFAULT, oldWithinTextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWithinText() {
		return withinTextESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ItsPackage.WITHIN_TEXT_RULE_TYPE__SELECTOR:
				return getSelector();
			case ItsPackage.WITHIN_TEXT_RULE_TYPE__WITHIN_TEXT:
				return getWithinText();
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
			case ItsPackage.WITHIN_TEXT_RULE_TYPE__SELECTOR:
				setSelector((String)newValue);
				return;
			case ItsPackage.WITHIN_TEXT_RULE_TYPE__WITHIN_TEXT:
				setWithinText((WithinTextType)newValue);
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
			case ItsPackage.WITHIN_TEXT_RULE_TYPE__SELECTOR:
				setSelector(SELECTOR_EDEFAULT);
				return;
			case ItsPackage.WITHIN_TEXT_RULE_TYPE__WITHIN_TEXT:
				unsetWithinText();
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
			case ItsPackage.WITHIN_TEXT_RULE_TYPE__SELECTOR:
				return SELECTOR_EDEFAULT == null ? selector != null : !SELECTOR_EDEFAULT.equals(selector);
			case ItsPackage.WITHIN_TEXT_RULE_TYPE__WITHIN_TEXT:
				return isSetWithinText();
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
		result.append(" (selector: ");
		result.append(selector);
		result.append(", withinText: ");
		if (withinTextESet) result.append(withinText); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //WithinTextRuleTypeImpl
