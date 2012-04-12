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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.rmf.rif12.its.ItsPackage;
import org.eclipse.rmf.rif12.its.ItsRubyContent;
import org.eclipse.rmf.rif12.its.RbType;
import org.eclipse.rmf.rif12.its.RbcType;
import org.eclipse.rmf.rif12.its.RpType;
import org.eclipse.rmf.rif12.its.RtType;
import org.eclipse.rmf.rif12.its.RtcType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ruby Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.ItsRubyContentImpl#getRb <em>Rb</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.ItsRubyContentImpl#getRt <em>Rt</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.ItsRubyContentImpl#getRp <em>Rp</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.ItsRubyContentImpl#getRt1 <em>Rt1</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.ItsRubyContentImpl#getRp1 <em>Rp1</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.ItsRubyContentImpl#getRbc <em>Rbc</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.ItsRubyContentImpl#getRtc <em>Rtc</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.ItsRubyContentImpl#getRtc1 <em>Rtc1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItsRubyContentImpl extends EObjectImpl implements ItsRubyContent {
	/**
	 * The cached value of the '{@link #getRb() <em>Rb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRb()
	 * @generated
	 * @ordered
	 */
	protected RbType rb;

	/**
	 * The cached value of the '{@link #getRt() <em>Rt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRt()
	 * @generated
	 * @ordered
	 */
	protected RtType rt;

	/**
	 * The cached value of the '{@link #getRp() <em>Rp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRp()
	 * @generated
	 * @ordered
	 */
	protected RpType rp;

	/**
	 * The cached value of the '{@link #getRt1() <em>Rt1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRt1()
	 * @generated
	 * @ordered
	 */
	protected RtType rt1;

	/**
	 * The cached value of the '{@link #getRp1() <em>Rp1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRp1()
	 * @generated
	 * @ordered
	 */
	protected RpType rp1;

	/**
	 * The cached value of the '{@link #getRbc() <em>Rbc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRbc()
	 * @generated
	 * @ordered
	 */
	protected RbcType rbc;

	/**
	 * The cached value of the '{@link #getRtc() <em>Rtc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtc()
	 * @generated
	 * @ordered
	 */
	protected RtcType rtc;

	/**
	 * The cached value of the '{@link #getRtc1() <em>Rtc1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRtc1()
	 * @generated
	 * @ordered
	 */
	protected RtcType rtc1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItsRubyContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItsPackage.Literals.ITS_RUBY_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RbType getRb() {
		return rb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRb(RbType newRb, NotificationChain msgs) {
		RbType oldRb = rb;
		rb = newRb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ItsPackage.ITS_RUBY_CONTENT__RB, oldRb, newRb);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRb(RbType newRb) {
		if (newRb != rb) {
			NotificationChain msgs = null;
			if (rb != null)
				msgs = ((InternalEObject)rb).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ItsPackage.ITS_RUBY_CONTENT__RB, null, msgs);
			if (newRb != null)
				msgs = ((InternalEObject)newRb).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ItsPackage.ITS_RUBY_CONTENT__RB, null, msgs);
			msgs = basicSetRb(newRb, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.ITS_RUBY_CONTENT__RB, newRb, newRb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtType getRt() {
		return rt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRt(RtType newRt, NotificationChain msgs) {
		RtType oldRt = rt;
		rt = newRt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ItsPackage.ITS_RUBY_CONTENT__RT, oldRt, newRt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRt(RtType newRt) {
		if (newRt != rt) {
			NotificationChain msgs = null;
			if (rt != null)
				msgs = ((InternalEObject)rt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ItsPackage.ITS_RUBY_CONTENT__RT, null, msgs);
			if (newRt != null)
				msgs = ((InternalEObject)newRt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ItsPackage.ITS_RUBY_CONTENT__RT, null, msgs);
			msgs = basicSetRt(newRt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.ITS_RUBY_CONTENT__RT, newRt, newRt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RpType getRp() {
		return rp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRp(RpType newRp, NotificationChain msgs) {
		RpType oldRp = rp;
		rp = newRp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ItsPackage.ITS_RUBY_CONTENT__RP, oldRp, newRp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRp(RpType newRp) {
		if (newRp != rp) {
			NotificationChain msgs = null;
			if (rp != null)
				msgs = ((InternalEObject)rp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ItsPackage.ITS_RUBY_CONTENT__RP, null, msgs);
			if (newRp != null)
				msgs = ((InternalEObject)newRp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ItsPackage.ITS_RUBY_CONTENT__RP, null, msgs);
			msgs = basicSetRp(newRp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.ITS_RUBY_CONTENT__RP, newRp, newRp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtType getRt1() {
		return rt1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRt1(RtType newRt1, NotificationChain msgs) {
		RtType oldRt1 = rt1;
		rt1 = newRt1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ItsPackage.ITS_RUBY_CONTENT__RT1, oldRt1, newRt1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRt1(RtType newRt1) {
		if (newRt1 != rt1) {
			NotificationChain msgs = null;
			if (rt1 != null)
				msgs = ((InternalEObject)rt1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ItsPackage.ITS_RUBY_CONTENT__RT1, null, msgs);
			if (newRt1 != null)
				msgs = ((InternalEObject)newRt1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ItsPackage.ITS_RUBY_CONTENT__RT1, null, msgs);
			msgs = basicSetRt1(newRt1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.ITS_RUBY_CONTENT__RT1, newRt1, newRt1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RpType getRp1() {
		return rp1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRp1(RpType newRp1, NotificationChain msgs) {
		RpType oldRp1 = rp1;
		rp1 = newRp1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ItsPackage.ITS_RUBY_CONTENT__RP1, oldRp1, newRp1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRp1(RpType newRp1) {
		if (newRp1 != rp1) {
			NotificationChain msgs = null;
			if (rp1 != null)
				msgs = ((InternalEObject)rp1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ItsPackage.ITS_RUBY_CONTENT__RP1, null, msgs);
			if (newRp1 != null)
				msgs = ((InternalEObject)newRp1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ItsPackage.ITS_RUBY_CONTENT__RP1, null, msgs);
			msgs = basicSetRp1(newRp1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.ITS_RUBY_CONTENT__RP1, newRp1, newRp1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RbcType getRbc() {
		return rbc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRbc(RbcType newRbc, NotificationChain msgs) {
		RbcType oldRbc = rbc;
		rbc = newRbc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ItsPackage.ITS_RUBY_CONTENT__RBC, oldRbc, newRbc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRbc(RbcType newRbc) {
		if (newRbc != rbc) {
			NotificationChain msgs = null;
			if (rbc != null)
				msgs = ((InternalEObject)rbc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ItsPackage.ITS_RUBY_CONTENT__RBC, null, msgs);
			if (newRbc != null)
				msgs = ((InternalEObject)newRbc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ItsPackage.ITS_RUBY_CONTENT__RBC, null, msgs);
			msgs = basicSetRbc(newRbc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.ITS_RUBY_CONTENT__RBC, newRbc, newRbc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtcType getRtc() {
		return rtc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtc(RtcType newRtc, NotificationChain msgs) {
		RtcType oldRtc = rtc;
		rtc = newRtc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ItsPackage.ITS_RUBY_CONTENT__RTC, oldRtc, newRtc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtc(RtcType newRtc) {
		if (newRtc != rtc) {
			NotificationChain msgs = null;
			if (rtc != null)
				msgs = ((InternalEObject)rtc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ItsPackage.ITS_RUBY_CONTENT__RTC, null, msgs);
			if (newRtc != null)
				msgs = ((InternalEObject)newRtc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ItsPackage.ITS_RUBY_CONTENT__RTC, null, msgs);
			msgs = basicSetRtc(newRtc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.ITS_RUBY_CONTENT__RTC, newRtc, newRtc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtcType getRtc1() {
		return rtc1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtc1(RtcType newRtc1, NotificationChain msgs) {
		RtcType oldRtc1 = rtc1;
		rtc1 = newRtc1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ItsPackage.ITS_RUBY_CONTENT__RTC1, oldRtc1, newRtc1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtc1(RtcType newRtc1) {
		if (newRtc1 != rtc1) {
			NotificationChain msgs = null;
			if (rtc1 != null)
				msgs = ((InternalEObject)rtc1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ItsPackage.ITS_RUBY_CONTENT__RTC1, null, msgs);
			if (newRtc1 != null)
				msgs = ((InternalEObject)newRtc1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ItsPackage.ITS_RUBY_CONTENT__RTC1, null, msgs);
			msgs = basicSetRtc1(newRtc1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.ITS_RUBY_CONTENT__RTC1, newRtc1, newRtc1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ItsPackage.ITS_RUBY_CONTENT__RB:
				return basicSetRb(null, msgs);
			case ItsPackage.ITS_RUBY_CONTENT__RT:
				return basicSetRt(null, msgs);
			case ItsPackage.ITS_RUBY_CONTENT__RP:
				return basicSetRp(null, msgs);
			case ItsPackage.ITS_RUBY_CONTENT__RT1:
				return basicSetRt1(null, msgs);
			case ItsPackage.ITS_RUBY_CONTENT__RP1:
				return basicSetRp1(null, msgs);
			case ItsPackage.ITS_RUBY_CONTENT__RBC:
				return basicSetRbc(null, msgs);
			case ItsPackage.ITS_RUBY_CONTENT__RTC:
				return basicSetRtc(null, msgs);
			case ItsPackage.ITS_RUBY_CONTENT__RTC1:
				return basicSetRtc1(null, msgs);
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
			case ItsPackage.ITS_RUBY_CONTENT__RB:
				return getRb();
			case ItsPackage.ITS_RUBY_CONTENT__RT:
				return getRt();
			case ItsPackage.ITS_RUBY_CONTENT__RP:
				return getRp();
			case ItsPackage.ITS_RUBY_CONTENT__RT1:
				return getRt1();
			case ItsPackage.ITS_RUBY_CONTENT__RP1:
				return getRp1();
			case ItsPackage.ITS_RUBY_CONTENT__RBC:
				return getRbc();
			case ItsPackage.ITS_RUBY_CONTENT__RTC:
				return getRtc();
			case ItsPackage.ITS_RUBY_CONTENT__RTC1:
				return getRtc1();
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
			case ItsPackage.ITS_RUBY_CONTENT__RB:
				setRb((RbType)newValue);
				return;
			case ItsPackage.ITS_RUBY_CONTENT__RT:
				setRt((RtType)newValue);
				return;
			case ItsPackage.ITS_RUBY_CONTENT__RP:
				setRp((RpType)newValue);
				return;
			case ItsPackage.ITS_RUBY_CONTENT__RT1:
				setRt1((RtType)newValue);
				return;
			case ItsPackage.ITS_RUBY_CONTENT__RP1:
				setRp1((RpType)newValue);
				return;
			case ItsPackage.ITS_RUBY_CONTENT__RBC:
				setRbc((RbcType)newValue);
				return;
			case ItsPackage.ITS_RUBY_CONTENT__RTC:
				setRtc((RtcType)newValue);
				return;
			case ItsPackage.ITS_RUBY_CONTENT__RTC1:
				setRtc1((RtcType)newValue);
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
			case ItsPackage.ITS_RUBY_CONTENT__RB:
				setRb((RbType)null);
				return;
			case ItsPackage.ITS_RUBY_CONTENT__RT:
				setRt((RtType)null);
				return;
			case ItsPackage.ITS_RUBY_CONTENT__RP:
				setRp((RpType)null);
				return;
			case ItsPackage.ITS_RUBY_CONTENT__RT1:
				setRt1((RtType)null);
				return;
			case ItsPackage.ITS_RUBY_CONTENT__RP1:
				setRp1((RpType)null);
				return;
			case ItsPackage.ITS_RUBY_CONTENT__RBC:
				setRbc((RbcType)null);
				return;
			case ItsPackage.ITS_RUBY_CONTENT__RTC:
				setRtc((RtcType)null);
				return;
			case ItsPackage.ITS_RUBY_CONTENT__RTC1:
				setRtc1((RtcType)null);
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
			case ItsPackage.ITS_RUBY_CONTENT__RB:
				return rb != null;
			case ItsPackage.ITS_RUBY_CONTENT__RT:
				return rt != null;
			case ItsPackage.ITS_RUBY_CONTENT__RP:
				return rp != null;
			case ItsPackage.ITS_RUBY_CONTENT__RT1:
				return rt1 != null;
			case ItsPackage.ITS_RUBY_CONTENT__RP1:
				return rp1 != null;
			case ItsPackage.ITS_RUBY_CONTENT__RBC:
				return rbc != null;
			case ItsPackage.ITS_RUBY_CONTENT__RTC:
				return rtc != null;
			case ItsPackage.ITS_RUBY_CONTENT__RTC1:
				return rtc1 != null;
		}
		return super.eIsSet(featureID);
	}

} //ItsRubyContentImpl
