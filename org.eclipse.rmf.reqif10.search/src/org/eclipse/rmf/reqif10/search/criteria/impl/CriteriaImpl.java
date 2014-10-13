/*******************************************************************************
 * Copyright (c) 2014 Hussein Mhanna
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Hussein Mhanna - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.search.criteria.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.rmf.reqif10.search.criteria.Criteria;
import org.eclipse.rmf.reqif10.search.criteria.CriteriaPackage;
import org.eclipse.rmf.reqif10.search.criteria.Operator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Criteria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.search.criteria.impl.CriteriaImpl#getFeatureName <em>Feature Name</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.search.criteria.impl.CriteriaImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.search.criteria.impl.CriteriaImpl#getSerachedText <em>Serached Text</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.search.criteria.impl.CriteriaImpl#isSensitiveCase <em>Sensitive Case</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.search.criteria.impl.CriteriaImpl#getReplacementText <em>Replacement Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CriteriaImpl extends MinimalEObjectImpl.Container implements Criteria {
	/**
	 * The default value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getFeatureName() <em>Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureName()
	 * @generated
	 * @ordered
	 */
	protected String featureName = FEATURE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final Operator OPERATOR_EDEFAULT = Operator.EQUALS;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Operator operator = OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSerachedText() <em>Serached Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerachedText()
	 * @generated
	 * @ordered
	 */
	protected static final String SERACHED_TEXT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSerachedText() <em>Serached Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerachedText()
	 * @generated
	 * @ordered
	 */
	protected String serachedText = SERACHED_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #isSensitiveCase() <em>Sensitive Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSensitiveCase()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SENSITIVE_CASE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSensitiveCase() <em>Sensitive Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSensitiveCase()
	 * @generated
	 * @ordered
	 */
	protected boolean sensitiveCase = SENSITIVE_CASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplacementText() <em>Replacement Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacementText()
	 * @generated
	 * @ordered
	 */
	protected static final String REPLACEMENT_TEXT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getReplacementText() <em>Replacement Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplacementText()
	 * @generated
	 * @ordered
	 */
	protected String replacementText = REPLACEMENT_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CriteriaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CriteriaPackage.Literals.CRITERIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureName() {
		return featureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureName(String newFeatureName) {
		String oldFeatureName = featureName;
		featureName = newFeatureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CriteriaPackage.CRITERIA__FEATURE_NAME, oldFeatureName, featureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(Operator newOperator) {
		Operator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CriteriaPackage.CRITERIA__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSerachedText() {
		return serachedText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerachedText(String newSerachedText) {
		String oldSerachedText = serachedText;
		serachedText = newSerachedText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CriteriaPackage.CRITERIA__SERACHED_TEXT, oldSerachedText, serachedText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSensitiveCase() {
		return sensitiveCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensitiveCase(boolean newSensitiveCase) {
		boolean oldSensitiveCase = sensitiveCase;
		sensitiveCase = newSensitiveCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CriteriaPackage.CRITERIA__SENSITIVE_CASE, oldSensitiveCase, sensitiveCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReplacementText() {
		return replacementText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplacementText(String newReplacementText) {
		String oldReplacementText = replacementText;
		replacementText = newReplacementText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CriteriaPackage.CRITERIA__REPLACEMENT_TEXT, oldReplacementText, replacementText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CriteriaPackage.CRITERIA__FEATURE_NAME:
				return getFeatureName();
			case CriteriaPackage.CRITERIA__OPERATOR:
				return getOperator();
			case CriteriaPackage.CRITERIA__SERACHED_TEXT:
				return getSerachedText();
			case CriteriaPackage.CRITERIA__SENSITIVE_CASE:
				return isSensitiveCase();
			case CriteriaPackage.CRITERIA__REPLACEMENT_TEXT:
				return getReplacementText();
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
			case CriteriaPackage.CRITERIA__FEATURE_NAME:
				setFeatureName((String)newValue);
				return;
			case CriteriaPackage.CRITERIA__OPERATOR:
				setOperator((Operator)newValue);
				return;
			case CriteriaPackage.CRITERIA__SERACHED_TEXT:
				setSerachedText((String)newValue);
				return;
			case CriteriaPackage.CRITERIA__SENSITIVE_CASE:
				setSensitiveCase((Boolean)newValue);
				return;
			case CriteriaPackage.CRITERIA__REPLACEMENT_TEXT:
				setReplacementText((String)newValue);
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
			case CriteriaPackage.CRITERIA__FEATURE_NAME:
				setFeatureName(FEATURE_NAME_EDEFAULT);
				return;
			case CriteriaPackage.CRITERIA__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case CriteriaPackage.CRITERIA__SERACHED_TEXT:
				setSerachedText(SERACHED_TEXT_EDEFAULT);
				return;
			case CriteriaPackage.CRITERIA__SENSITIVE_CASE:
				setSensitiveCase(SENSITIVE_CASE_EDEFAULT);
				return;
			case CriteriaPackage.CRITERIA__REPLACEMENT_TEXT:
				setReplacementText(REPLACEMENT_TEXT_EDEFAULT);
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
			case CriteriaPackage.CRITERIA__FEATURE_NAME:
				return FEATURE_NAME_EDEFAULT == null ? featureName != null : !FEATURE_NAME_EDEFAULT.equals(featureName);
			case CriteriaPackage.CRITERIA__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case CriteriaPackage.CRITERIA__SERACHED_TEXT:
				return SERACHED_TEXT_EDEFAULT == null ? serachedText != null : !SERACHED_TEXT_EDEFAULT.equals(serachedText);
			case CriteriaPackage.CRITERIA__SENSITIVE_CASE:
				return sensitiveCase != SENSITIVE_CASE_EDEFAULT;
			case CriteriaPackage.CRITERIA__REPLACEMENT_TEXT:
				return REPLACEMENT_TEXT_EDEFAULT == null ? replacementText != null : !REPLACEMENT_TEXT_EDEFAULT.equals(replacementText);
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
		result.append(" (featureName: ");
		result.append(featureName);
		result.append(", operator: ");
		result.append(operator);
		result.append(", serachedText: ");
		result.append(serachedText);
		result.append(", sensitiveCase: ");
		result.append(sensitiveCase);
		result.append(", replacementText: ");
		result.append(replacementText);
		result.append(')');
		return result.toString();
	}

} //CriteriaImpl
