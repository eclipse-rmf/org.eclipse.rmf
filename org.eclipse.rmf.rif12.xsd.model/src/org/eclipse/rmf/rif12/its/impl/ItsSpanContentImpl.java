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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.rmf.rif12.its.ItsPackage;
import org.eclipse.rmf.rif12.its.ItsSpanContent;
import org.eclipse.rmf.rif12.its.RubyType;
import org.eclipse.rmf.rif12.its.SpanType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Span Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.ItsSpanContentImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.ItsSpanContentImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.ItsSpanContentImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.ItsSpanContentImpl#getSpan <em>Span</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItsSpanContentImpl extends EObjectImpl implements ItsSpanContent {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItsSpanContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItsPackage.Literals.ITS_SPAN_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, ItsPackage.ITS_SPAN_CONTENT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(ItsPackage.Literals.ITS_SPAN_CONTENT__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RubyType> getRuby() {
		return getGroup().list(ItsPackage.Literals.ITS_SPAN_CONTENT__RUBY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpanType> getSpan() {
		return getGroup().list(ItsPackage.Literals.ITS_SPAN_CONTENT__SPAN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ItsPackage.ITS_SPAN_CONTENT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case ItsPackage.ITS_SPAN_CONTENT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case ItsPackage.ITS_SPAN_CONTENT__RUBY:
				return ((InternalEList<?>)getRuby()).basicRemove(otherEnd, msgs);
			case ItsPackage.ITS_SPAN_CONTENT__SPAN:
				return ((InternalEList<?>)getSpan()).basicRemove(otherEnd, msgs);
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
			case ItsPackage.ITS_SPAN_CONTENT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case ItsPackage.ITS_SPAN_CONTENT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case ItsPackage.ITS_SPAN_CONTENT__RUBY:
				return getRuby();
			case ItsPackage.ITS_SPAN_CONTENT__SPAN:
				return getSpan();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ItsPackage.ITS_SPAN_CONTENT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case ItsPackage.ITS_SPAN_CONTENT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case ItsPackage.ITS_SPAN_CONTENT__RUBY:
				getRuby().clear();
				getRuby().addAll((Collection<? extends RubyType>)newValue);
				return;
			case ItsPackage.ITS_SPAN_CONTENT__SPAN:
				getSpan().clear();
				getSpan().addAll((Collection<? extends SpanType>)newValue);
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
			case ItsPackage.ITS_SPAN_CONTENT__MIXED:
				getMixed().clear();
				return;
			case ItsPackage.ITS_SPAN_CONTENT__GROUP:
				getGroup().clear();
				return;
			case ItsPackage.ITS_SPAN_CONTENT__RUBY:
				getRuby().clear();
				return;
			case ItsPackage.ITS_SPAN_CONTENT__SPAN:
				getSpan().clear();
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
			case ItsPackage.ITS_SPAN_CONTENT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case ItsPackage.ITS_SPAN_CONTENT__GROUP:
				return !getGroup().isEmpty();
			case ItsPackage.ITS_SPAN_CONTENT__RUBY:
				return !getRuby().isEmpty();
			case ItsPackage.ITS_SPAN_CONTENT__SPAN:
				return !getSpan().isEmpty();
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //ItsSpanContentImpl
