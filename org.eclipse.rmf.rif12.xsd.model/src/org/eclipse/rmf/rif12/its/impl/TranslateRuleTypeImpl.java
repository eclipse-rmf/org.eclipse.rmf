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
import org.eclipse.rmf.rif12.its.TranslateRuleType;
import org.eclipse.rmf.rif12.its.TranslateType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Translate Rule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.TranslateRuleTypeImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.TranslateRuleTypeImpl#getTranslate <em>Translate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TranslateRuleTypeImpl extends EObjectImpl implements TranslateRuleType {
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
	 * The default value of the '{@link #getTranslate() <em>Translate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslate()
	 * @generated
	 * @ordered
	 */
	protected static final TranslateType TRANSLATE_EDEFAULT = TranslateType.YES;

	/**
	 * The cached value of the '{@link #getTranslate() <em>Translate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslate()
	 * @generated
	 * @ordered
	 */
	protected TranslateType translate = TRANSLATE_EDEFAULT;

	/**
	 * This is true if the Translate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean translateESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TranslateRuleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItsPackage.Literals.TRANSLATE_RULE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.TRANSLATE_RULE_TYPE__SELECTOR, oldSelector, selector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslateType getTranslate() {
		return translate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslate(TranslateType newTranslate) {
		TranslateType oldTranslate = translate;
		translate = newTranslate == null ? TRANSLATE_EDEFAULT : newTranslate;
		boolean oldTranslateESet = translateESet;
		translateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.TRANSLATE_RULE_TYPE__TRANSLATE, oldTranslate, translate, !oldTranslateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTranslate() {
		TranslateType oldTranslate = translate;
		boolean oldTranslateESet = translateESet;
		translate = TRANSLATE_EDEFAULT;
		translateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ItsPackage.TRANSLATE_RULE_TYPE__TRANSLATE, oldTranslate, TRANSLATE_EDEFAULT, oldTranslateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTranslate() {
		return translateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ItsPackage.TRANSLATE_RULE_TYPE__SELECTOR:
				return getSelector();
			case ItsPackage.TRANSLATE_RULE_TYPE__TRANSLATE:
				return getTranslate();
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
			case ItsPackage.TRANSLATE_RULE_TYPE__SELECTOR:
				setSelector((String)newValue);
				return;
			case ItsPackage.TRANSLATE_RULE_TYPE__TRANSLATE:
				setTranslate((TranslateType)newValue);
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
			case ItsPackage.TRANSLATE_RULE_TYPE__SELECTOR:
				setSelector(SELECTOR_EDEFAULT);
				return;
			case ItsPackage.TRANSLATE_RULE_TYPE__TRANSLATE:
				unsetTranslate();
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
			case ItsPackage.TRANSLATE_RULE_TYPE__SELECTOR:
				return SELECTOR_EDEFAULT == null ? selector != null : !SELECTOR_EDEFAULT.equals(selector);
			case ItsPackage.TRANSLATE_RULE_TYPE__TRANSLATE:
				return isSetTranslate();
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
		result.append(", translate: ");
		if (translateESet) result.append(translate); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TranslateRuleTypeImpl
