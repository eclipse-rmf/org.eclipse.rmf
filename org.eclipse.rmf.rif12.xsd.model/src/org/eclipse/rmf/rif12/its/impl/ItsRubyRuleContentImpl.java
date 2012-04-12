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
import org.eclipse.rmf.rif12.its.ItsRubyRuleContent;
import org.eclipse.rmf.rif12.its.RubyTextType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ruby Rule Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.ItsRubyRuleContentImpl#getRubyText <em>Ruby Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItsRubyRuleContentImpl extends EObjectImpl implements ItsRubyRuleContent {
	/**
	 * The cached value of the '{@link #getRubyText() <em>Ruby Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRubyText()
	 * @generated
	 * @ordered
	 */
	protected RubyTextType rubyText;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItsRubyRuleContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItsPackage.Literals.ITS_RUBY_RULE_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyTextType getRubyText() {
		return rubyText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRubyText(RubyTextType newRubyText, NotificationChain msgs) {
		RubyTextType oldRubyText = rubyText;
		rubyText = newRubyText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ItsPackage.ITS_RUBY_RULE_CONTENT__RUBY_TEXT, oldRubyText, newRubyText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRubyText(RubyTextType newRubyText) {
		if (newRubyText != rubyText) {
			NotificationChain msgs = null;
			if (rubyText != null)
				msgs = ((InternalEObject)rubyText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ItsPackage.ITS_RUBY_RULE_CONTENT__RUBY_TEXT, null, msgs);
			if (newRubyText != null)
				msgs = ((InternalEObject)newRubyText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ItsPackage.ITS_RUBY_RULE_CONTENT__RUBY_TEXT, null, msgs);
			msgs = basicSetRubyText(newRubyText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.ITS_RUBY_RULE_CONTENT__RUBY_TEXT, newRubyText, newRubyText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ItsPackage.ITS_RUBY_RULE_CONTENT__RUBY_TEXT:
				return basicSetRubyText(null, msgs);
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
			case ItsPackage.ITS_RUBY_RULE_CONTENT__RUBY_TEXT:
				return getRubyText();
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
			case ItsPackage.ITS_RUBY_RULE_CONTENT__RUBY_TEXT:
				setRubyText((RubyTextType)newValue);
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
			case ItsPackage.ITS_RUBY_RULE_CONTENT__RUBY_TEXT:
				setRubyText((RubyTextType)null);
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
			case ItsPackage.ITS_RUBY_RULE_CONTENT__RUBY_TEXT:
				return rubyText != null;
		}
		return super.eIsSet(featureID);
	}

} //ItsRubyRuleContentImpl
