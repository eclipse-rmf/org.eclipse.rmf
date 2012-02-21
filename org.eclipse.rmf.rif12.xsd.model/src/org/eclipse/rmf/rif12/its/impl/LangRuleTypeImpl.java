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
import org.eclipse.rmf.rif12.its.LangRuleType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lang Rule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.LangRuleTypeImpl#getLangPointer <em>Lang Pointer</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.LangRuleTypeImpl#getSelector <em>Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LangRuleTypeImpl extends EObjectImpl implements LangRuleType {
	/**
	 * The default value of the '{@link #getLangPointer() <em>Lang Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangPointer()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_POINTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLangPointer() <em>Lang Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangPointer()
	 * @generated
	 * @ordered
	 */
	protected String langPointer = LANG_POINTER_EDEFAULT;

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
	protected LangRuleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItsPackage.Literals.LANG_RULE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLangPointer() {
		return langPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLangPointer(String newLangPointer) {
		String oldLangPointer = langPointer;
		langPointer = newLangPointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.LANG_RULE_TYPE__LANG_POINTER, oldLangPointer, langPointer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.LANG_RULE_TYPE__SELECTOR, oldSelector, selector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ItsPackage.LANG_RULE_TYPE__LANG_POINTER:
				return getLangPointer();
			case ItsPackage.LANG_RULE_TYPE__SELECTOR:
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
			case ItsPackage.LANG_RULE_TYPE__LANG_POINTER:
				setLangPointer((String)newValue);
				return;
			case ItsPackage.LANG_RULE_TYPE__SELECTOR:
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
			case ItsPackage.LANG_RULE_TYPE__LANG_POINTER:
				setLangPointer(LANG_POINTER_EDEFAULT);
				return;
			case ItsPackage.LANG_RULE_TYPE__SELECTOR:
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
			case ItsPackage.LANG_RULE_TYPE__LANG_POINTER:
				return LANG_POINTER_EDEFAULT == null ? langPointer != null : !LANG_POINTER_EDEFAULT.equals(langPointer);
			case ItsPackage.LANG_RULE_TYPE__SELECTOR:
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
		result.append(" (langPointer: ");
		result.append(langPointer);
		result.append(", selector: ");
		result.append(selector);
		result.append(')');
		return result.toString();
	}

} //LangRuleTypeImpl
