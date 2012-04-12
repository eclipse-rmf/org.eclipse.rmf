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
import org.eclipse.rmf.rif12.its.RubyRuleType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ruby Rule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.RubyRuleTypeImpl#getRbcPointer <em>Rbc Pointer</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.RubyRuleTypeImpl#getRbspanPointer <em>Rbspan Pointer</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.RubyRuleTypeImpl#getRpPointer <em>Rp Pointer</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.RubyRuleTypeImpl#getRtcPointer <em>Rtc Pointer</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.RubyRuleTypeImpl#getRtPointer <em>Rt Pointer</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.RubyRuleTypeImpl#getRubyPointer <em>Ruby Pointer</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.RubyRuleTypeImpl#getSelector <em>Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RubyRuleTypeImpl extends ItsRubyRuleContentImpl implements RubyRuleType {
	/**
	 * The default value of the '{@link #getRbcPointer() <em>Rbc Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRbcPointer()
	 * @generated
	 * @ordered
	 */
	protected static final String RBC_POINTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRbcPointer() <em>Rbc Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRbcPointer()
	 * @generated
	 * @ordered
	 */
	protected String rbcPointer = RBC_POINTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRbspanPointer() <em>Rbspan Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRbspanPointer()
	 * @generated
	 * @ordered
	 */
	protected static final String RBSPAN_POINTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRbspanPointer() <em>Rbspan Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRbspanPointer()
	 * @generated
	 * @ordered
	 */
	protected String rbspanPointer = RBSPAN_POINTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRpPointer() <em>Rp Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpPointer()
	 * @generated
	 * @ordered
	 */
	protected static final String RP_POINTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRpPointer() <em>Rp Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpPointer()
	 * @generated
	 * @ordered
	 */
	protected String rpPointer = RP_POINTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRtcPointer() <em>Rtc Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtcPointer()
	 * @generated
	 * @ordered
	 */
	protected static final String RTC_POINTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRtcPointer() <em>Rtc Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtcPointer()
	 * @generated
	 * @ordered
	 */
	protected String rtcPointer = RTC_POINTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRtPointer() <em>Rt Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtPointer()
	 * @generated
	 * @ordered
	 */
	protected static final String RT_POINTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRtPointer() <em>Rt Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtPointer()
	 * @generated
	 * @ordered
	 */
	protected String rtPointer = RT_POINTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRubyPointer() <em>Ruby Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRubyPointer()
	 * @generated
	 * @ordered
	 */
	protected static final String RUBY_POINTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRubyPointer() <em>Ruby Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRubyPointer()
	 * @generated
	 * @ordered
	 */
	protected String rubyPointer = RUBY_POINTER_EDEFAULT;

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
	protected RubyRuleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItsPackage.Literals.RUBY_RULE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRbcPointer() {
		return rbcPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRbcPointer(String newRbcPointer) {
		String oldRbcPointer = rbcPointer;
		rbcPointer = newRbcPointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.RUBY_RULE_TYPE__RBC_POINTER, oldRbcPointer, rbcPointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRbspanPointer() {
		return rbspanPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRbspanPointer(String newRbspanPointer) {
		String oldRbspanPointer = rbspanPointer;
		rbspanPointer = newRbspanPointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.RUBY_RULE_TYPE__RBSPAN_POINTER, oldRbspanPointer, rbspanPointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRpPointer() {
		return rpPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRpPointer(String newRpPointer) {
		String oldRpPointer = rpPointer;
		rpPointer = newRpPointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.RUBY_RULE_TYPE__RP_POINTER, oldRpPointer, rpPointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRtcPointer() {
		return rtcPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtcPointer(String newRtcPointer) {
		String oldRtcPointer = rtcPointer;
		rtcPointer = newRtcPointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.RUBY_RULE_TYPE__RTC_POINTER, oldRtcPointer, rtcPointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRtPointer() {
		return rtPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtPointer(String newRtPointer) {
		String oldRtPointer = rtPointer;
		rtPointer = newRtPointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.RUBY_RULE_TYPE__RT_POINTER, oldRtPointer, rtPointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRubyPointer() {
		return rubyPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRubyPointer(String newRubyPointer) {
		String oldRubyPointer = rubyPointer;
		rubyPointer = newRubyPointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.RUBY_RULE_TYPE__RUBY_POINTER, oldRubyPointer, rubyPointer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.RUBY_RULE_TYPE__SELECTOR, oldSelector, selector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ItsPackage.RUBY_RULE_TYPE__RBC_POINTER:
				return getRbcPointer();
			case ItsPackage.RUBY_RULE_TYPE__RBSPAN_POINTER:
				return getRbspanPointer();
			case ItsPackage.RUBY_RULE_TYPE__RP_POINTER:
				return getRpPointer();
			case ItsPackage.RUBY_RULE_TYPE__RTC_POINTER:
				return getRtcPointer();
			case ItsPackage.RUBY_RULE_TYPE__RT_POINTER:
				return getRtPointer();
			case ItsPackage.RUBY_RULE_TYPE__RUBY_POINTER:
				return getRubyPointer();
			case ItsPackage.RUBY_RULE_TYPE__SELECTOR:
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
			case ItsPackage.RUBY_RULE_TYPE__RBC_POINTER:
				setRbcPointer((String)newValue);
				return;
			case ItsPackage.RUBY_RULE_TYPE__RBSPAN_POINTER:
				setRbspanPointer((String)newValue);
				return;
			case ItsPackage.RUBY_RULE_TYPE__RP_POINTER:
				setRpPointer((String)newValue);
				return;
			case ItsPackage.RUBY_RULE_TYPE__RTC_POINTER:
				setRtcPointer((String)newValue);
				return;
			case ItsPackage.RUBY_RULE_TYPE__RT_POINTER:
				setRtPointer((String)newValue);
				return;
			case ItsPackage.RUBY_RULE_TYPE__RUBY_POINTER:
				setRubyPointer((String)newValue);
				return;
			case ItsPackage.RUBY_RULE_TYPE__SELECTOR:
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
			case ItsPackage.RUBY_RULE_TYPE__RBC_POINTER:
				setRbcPointer(RBC_POINTER_EDEFAULT);
				return;
			case ItsPackage.RUBY_RULE_TYPE__RBSPAN_POINTER:
				setRbspanPointer(RBSPAN_POINTER_EDEFAULT);
				return;
			case ItsPackage.RUBY_RULE_TYPE__RP_POINTER:
				setRpPointer(RP_POINTER_EDEFAULT);
				return;
			case ItsPackage.RUBY_RULE_TYPE__RTC_POINTER:
				setRtcPointer(RTC_POINTER_EDEFAULT);
				return;
			case ItsPackage.RUBY_RULE_TYPE__RT_POINTER:
				setRtPointer(RT_POINTER_EDEFAULT);
				return;
			case ItsPackage.RUBY_RULE_TYPE__RUBY_POINTER:
				setRubyPointer(RUBY_POINTER_EDEFAULT);
				return;
			case ItsPackage.RUBY_RULE_TYPE__SELECTOR:
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
			case ItsPackage.RUBY_RULE_TYPE__RBC_POINTER:
				return RBC_POINTER_EDEFAULT == null ? rbcPointer != null : !RBC_POINTER_EDEFAULT.equals(rbcPointer);
			case ItsPackage.RUBY_RULE_TYPE__RBSPAN_POINTER:
				return RBSPAN_POINTER_EDEFAULT == null ? rbspanPointer != null : !RBSPAN_POINTER_EDEFAULT.equals(rbspanPointer);
			case ItsPackage.RUBY_RULE_TYPE__RP_POINTER:
				return RP_POINTER_EDEFAULT == null ? rpPointer != null : !RP_POINTER_EDEFAULT.equals(rpPointer);
			case ItsPackage.RUBY_RULE_TYPE__RTC_POINTER:
				return RTC_POINTER_EDEFAULT == null ? rtcPointer != null : !RTC_POINTER_EDEFAULT.equals(rtcPointer);
			case ItsPackage.RUBY_RULE_TYPE__RT_POINTER:
				return RT_POINTER_EDEFAULT == null ? rtPointer != null : !RT_POINTER_EDEFAULT.equals(rtPointer);
			case ItsPackage.RUBY_RULE_TYPE__RUBY_POINTER:
				return RUBY_POINTER_EDEFAULT == null ? rubyPointer != null : !RUBY_POINTER_EDEFAULT.equals(rubyPointer);
			case ItsPackage.RUBY_RULE_TYPE__SELECTOR:
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
		result.append(" (rbcPointer: ");
		result.append(rbcPointer);
		result.append(", rbspanPointer: ");
		result.append(rbspanPointer);
		result.append(", rpPointer: ");
		result.append(rpPointer);
		result.append(", rtcPointer: ");
		result.append(rtcPointer);
		result.append(", rtPointer: ");
		result.append(rtPointer);
		result.append(", rubyPointer: ");
		result.append(rubyPointer);
		result.append(", selector: ");
		result.append(selector);
		result.append(')');
		return result.toString();
	}

} //RubyRuleTypeImpl
