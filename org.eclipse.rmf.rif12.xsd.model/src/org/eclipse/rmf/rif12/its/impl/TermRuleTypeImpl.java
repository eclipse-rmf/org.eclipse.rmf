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
import org.eclipse.rmf.rif12.its.TermRuleType;
import org.eclipse.rmf.rif12.its.TermType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term Rule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.TermRuleTypeImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.TermRuleTypeImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.TermRuleTypeImpl#getTermInfoPointer <em>Term Info Pointer</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.TermRuleTypeImpl#getTermInfoRef <em>Term Info Ref</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.TermRuleTypeImpl#getTermInfoRefPointer <em>Term Info Ref Pointer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TermRuleTypeImpl extends EObjectImpl implements TermRuleType {
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
	 * The default value of the '{@link #getTerm() <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected static final TermType TERM_EDEFAULT = TermType.YES;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected TermType term = TERM_EDEFAULT;

	/**
	 * This is true if the Term attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean termESet;

	/**
	 * The default value of the '{@link #getTermInfoPointer() <em>Term Info Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermInfoPointer()
	 * @generated
	 * @ordered
	 */
	protected static final String TERM_INFO_POINTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTermInfoPointer() <em>Term Info Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermInfoPointer()
	 * @generated
	 * @ordered
	 */
	protected String termInfoPointer = TERM_INFO_POINTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTermInfoRef() <em>Term Info Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermInfoRef()
	 * @generated
	 * @ordered
	 */
	protected static final String TERM_INFO_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTermInfoRef() <em>Term Info Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermInfoRef()
	 * @generated
	 * @ordered
	 */
	protected String termInfoRef = TERM_INFO_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getTermInfoRefPointer() <em>Term Info Ref Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermInfoRefPointer()
	 * @generated
	 * @ordered
	 */
	protected static final String TERM_INFO_REF_POINTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTermInfoRefPointer() <em>Term Info Ref Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermInfoRefPointer()
	 * @generated
	 * @ordered
	 */
	protected String termInfoRefPointer = TERM_INFO_REF_POINTER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermRuleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItsPackage.Literals.TERM_RULE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.TERM_RULE_TYPE__SELECTOR, oldSelector, selector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermType getTerm() {
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerm(TermType newTerm) {
		TermType oldTerm = term;
		term = newTerm == null ? TERM_EDEFAULT : newTerm;
		boolean oldTermESet = termESet;
		termESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.TERM_RULE_TYPE__TERM, oldTerm, term, !oldTermESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTerm() {
		TermType oldTerm = term;
		boolean oldTermESet = termESet;
		term = TERM_EDEFAULT;
		termESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ItsPackage.TERM_RULE_TYPE__TERM, oldTerm, TERM_EDEFAULT, oldTermESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTerm() {
		return termESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTermInfoPointer() {
		return termInfoPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTermInfoPointer(String newTermInfoPointer) {
		String oldTermInfoPointer = termInfoPointer;
		termInfoPointer = newTermInfoPointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.TERM_RULE_TYPE__TERM_INFO_POINTER, oldTermInfoPointer, termInfoPointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTermInfoRef() {
		return termInfoRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTermInfoRef(String newTermInfoRef) {
		String oldTermInfoRef = termInfoRef;
		termInfoRef = newTermInfoRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.TERM_RULE_TYPE__TERM_INFO_REF, oldTermInfoRef, termInfoRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTermInfoRefPointer() {
		return termInfoRefPointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTermInfoRefPointer(String newTermInfoRefPointer) {
		String oldTermInfoRefPointer = termInfoRefPointer;
		termInfoRefPointer = newTermInfoRefPointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.TERM_RULE_TYPE__TERM_INFO_REF_POINTER, oldTermInfoRefPointer, termInfoRefPointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ItsPackage.TERM_RULE_TYPE__SELECTOR:
				return getSelector();
			case ItsPackage.TERM_RULE_TYPE__TERM:
				return getTerm();
			case ItsPackage.TERM_RULE_TYPE__TERM_INFO_POINTER:
				return getTermInfoPointer();
			case ItsPackage.TERM_RULE_TYPE__TERM_INFO_REF:
				return getTermInfoRef();
			case ItsPackage.TERM_RULE_TYPE__TERM_INFO_REF_POINTER:
				return getTermInfoRefPointer();
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
			case ItsPackage.TERM_RULE_TYPE__SELECTOR:
				setSelector((String)newValue);
				return;
			case ItsPackage.TERM_RULE_TYPE__TERM:
				setTerm((TermType)newValue);
				return;
			case ItsPackage.TERM_RULE_TYPE__TERM_INFO_POINTER:
				setTermInfoPointer((String)newValue);
				return;
			case ItsPackage.TERM_RULE_TYPE__TERM_INFO_REF:
				setTermInfoRef((String)newValue);
				return;
			case ItsPackage.TERM_RULE_TYPE__TERM_INFO_REF_POINTER:
				setTermInfoRefPointer((String)newValue);
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
			case ItsPackage.TERM_RULE_TYPE__SELECTOR:
				setSelector(SELECTOR_EDEFAULT);
				return;
			case ItsPackage.TERM_RULE_TYPE__TERM:
				unsetTerm();
				return;
			case ItsPackage.TERM_RULE_TYPE__TERM_INFO_POINTER:
				setTermInfoPointer(TERM_INFO_POINTER_EDEFAULT);
				return;
			case ItsPackage.TERM_RULE_TYPE__TERM_INFO_REF:
				setTermInfoRef(TERM_INFO_REF_EDEFAULT);
				return;
			case ItsPackage.TERM_RULE_TYPE__TERM_INFO_REF_POINTER:
				setTermInfoRefPointer(TERM_INFO_REF_POINTER_EDEFAULT);
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
			case ItsPackage.TERM_RULE_TYPE__SELECTOR:
				return SELECTOR_EDEFAULT == null ? selector != null : !SELECTOR_EDEFAULT.equals(selector);
			case ItsPackage.TERM_RULE_TYPE__TERM:
				return isSetTerm();
			case ItsPackage.TERM_RULE_TYPE__TERM_INFO_POINTER:
				return TERM_INFO_POINTER_EDEFAULT == null ? termInfoPointer != null : !TERM_INFO_POINTER_EDEFAULT.equals(termInfoPointer);
			case ItsPackage.TERM_RULE_TYPE__TERM_INFO_REF:
				return TERM_INFO_REF_EDEFAULT == null ? termInfoRef != null : !TERM_INFO_REF_EDEFAULT.equals(termInfoRef);
			case ItsPackage.TERM_RULE_TYPE__TERM_INFO_REF_POINTER:
				return TERM_INFO_REF_POINTER_EDEFAULT == null ? termInfoRefPointer != null : !TERM_INFO_REF_POINTER_EDEFAULT.equals(termInfoRefPointer);
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
		result.append(", term: ");
		if (termESet) result.append(term); else result.append("<unset>");
		result.append(", termInfoPointer: ");
		result.append(termInfoPointer);
		result.append(", termInfoRef: ");
		result.append(termInfoRef);
		result.append(", termInfoRefPointer: ");
		result.append(termInfoRefPointer);
		result.append(')');
		return result.toString();
	}

} //TermRuleTypeImpl
