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
import org.eclipse.rmf.rif12.its.DirRuleType;
import org.eclipse.rmf.rif12.its.ItsPackage;
import org.eclipse.rmf.rif12.its.ItsRulesContent;
import org.eclipse.rmf.rif12.its.LangRuleType;
import org.eclipse.rmf.rif12.its.LocNoteRuleType;
import org.eclipse.rmf.rif12.its.RubyRuleType;
import org.eclipse.rmf.rif12.its.TermRuleType;
import org.eclipse.rmf.rif12.its.TranslateRuleType;
import org.eclipse.rmf.rif12.its.WithinTextRuleType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rules Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.ItsRulesContentImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.ItsRulesContentImpl#getTranslateRule <em>Translate Rule</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.ItsRulesContentImpl#getLocNoteRule <em>Loc Note Rule</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.ItsRulesContentImpl#getTermRule <em>Term Rule</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.ItsRulesContentImpl#getDirRule <em>Dir Rule</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.ItsRulesContentImpl#getRubyRule <em>Ruby Rule</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.ItsRulesContentImpl#getLangRule <em>Lang Rule</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.ItsRulesContentImpl#getWithinTextRule <em>Within Text Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItsRulesContentImpl extends EObjectImpl implements ItsRulesContent {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItsRulesContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItsPackage.Literals.ITS_RULES_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, ItsPackage.ITS_RULES_CONTENT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TranslateRuleType> getTranslateRule() {
		return getGroup().list(ItsPackage.Literals.ITS_RULES_CONTENT__TRANSLATE_RULE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LocNoteRuleType> getLocNoteRule() {
		return getGroup().list(ItsPackage.Literals.ITS_RULES_CONTENT__LOC_NOTE_RULE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TermRuleType> getTermRule() {
		return getGroup().list(ItsPackage.Literals.ITS_RULES_CONTENT__TERM_RULE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DirRuleType> getDirRule() {
		return getGroup().list(ItsPackage.Literals.ITS_RULES_CONTENT__DIR_RULE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RubyRuleType> getRubyRule() {
		return getGroup().list(ItsPackage.Literals.ITS_RULES_CONTENT__RUBY_RULE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LangRuleType> getLangRule() {
		return getGroup().list(ItsPackage.Literals.ITS_RULES_CONTENT__LANG_RULE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WithinTextRuleType> getWithinTextRule() {
		return getGroup().list(ItsPackage.Literals.ITS_RULES_CONTENT__WITHIN_TEXT_RULE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ItsPackage.ITS_RULES_CONTENT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case ItsPackage.ITS_RULES_CONTENT__TRANSLATE_RULE:
				return ((InternalEList<?>)getTranslateRule()).basicRemove(otherEnd, msgs);
			case ItsPackage.ITS_RULES_CONTENT__LOC_NOTE_RULE:
				return ((InternalEList<?>)getLocNoteRule()).basicRemove(otherEnd, msgs);
			case ItsPackage.ITS_RULES_CONTENT__TERM_RULE:
				return ((InternalEList<?>)getTermRule()).basicRemove(otherEnd, msgs);
			case ItsPackage.ITS_RULES_CONTENT__DIR_RULE:
				return ((InternalEList<?>)getDirRule()).basicRemove(otherEnd, msgs);
			case ItsPackage.ITS_RULES_CONTENT__RUBY_RULE:
				return ((InternalEList<?>)getRubyRule()).basicRemove(otherEnd, msgs);
			case ItsPackage.ITS_RULES_CONTENT__LANG_RULE:
				return ((InternalEList<?>)getLangRule()).basicRemove(otherEnd, msgs);
			case ItsPackage.ITS_RULES_CONTENT__WITHIN_TEXT_RULE:
				return ((InternalEList<?>)getWithinTextRule()).basicRemove(otherEnd, msgs);
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
			case ItsPackage.ITS_RULES_CONTENT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case ItsPackage.ITS_RULES_CONTENT__TRANSLATE_RULE:
				return getTranslateRule();
			case ItsPackage.ITS_RULES_CONTENT__LOC_NOTE_RULE:
				return getLocNoteRule();
			case ItsPackage.ITS_RULES_CONTENT__TERM_RULE:
				return getTermRule();
			case ItsPackage.ITS_RULES_CONTENT__DIR_RULE:
				return getDirRule();
			case ItsPackage.ITS_RULES_CONTENT__RUBY_RULE:
				return getRubyRule();
			case ItsPackage.ITS_RULES_CONTENT__LANG_RULE:
				return getLangRule();
			case ItsPackage.ITS_RULES_CONTENT__WITHIN_TEXT_RULE:
				return getWithinTextRule();
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
			case ItsPackage.ITS_RULES_CONTENT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case ItsPackage.ITS_RULES_CONTENT__TRANSLATE_RULE:
				getTranslateRule().clear();
				getTranslateRule().addAll((Collection<? extends TranslateRuleType>)newValue);
				return;
			case ItsPackage.ITS_RULES_CONTENT__LOC_NOTE_RULE:
				getLocNoteRule().clear();
				getLocNoteRule().addAll((Collection<? extends LocNoteRuleType>)newValue);
				return;
			case ItsPackage.ITS_RULES_CONTENT__TERM_RULE:
				getTermRule().clear();
				getTermRule().addAll((Collection<? extends TermRuleType>)newValue);
				return;
			case ItsPackage.ITS_RULES_CONTENT__DIR_RULE:
				getDirRule().clear();
				getDirRule().addAll((Collection<? extends DirRuleType>)newValue);
				return;
			case ItsPackage.ITS_RULES_CONTENT__RUBY_RULE:
				getRubyRule().clear();
				getRubyRule().addAll((Collection<? extends RubyRuleType>)newValue);
				return;
			case ItsPackage.ITS_RULES_CONTENT__LANG_RULE:
				getLangRule().clear();
				getLangRule().addAll((Collection<? extends LangRuleType>)newValue);
				return;
			case ItsPackage.ITS_RULES_CONTENT__WITHIN_TEXT_RULE:
				getWithinTextRule().clear();
				getWithinTextRule().addAll((Collection<? extends WithinTextRuleType>)newValue);
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
			case ItsPackage.ITS_RULES_CONTENT__GROUP:
				getGroup().clear();
				return;
			case ItsPackage.ITS_RULES_CONTENT__TRANSLATE_RULE:
				getTranslateRule().clear();
				return;
			case ItsPackage.ITS_RULES_CONTENT__LOC_NOTE_RULE:
				getLocNoteRule().clear();
				return;
			case ItsPackage.ITS_RULES_CONTENT__TERM_RULE:
				getTermRule().clear();
				return;
			case ItsPackage.ITS_RULES_CONTENT__DIR_RULE:
				getDirRule().clear();
				return;
			case ItsPackage.ITS_RULES_CONTENT__RUBY_RULE:
				getRubyRule().clear();
				return;
			case ItsPackage.ITS_RULES_CONTENT__LANG_RULE:
				getLangRule().clear();
				return;
			case ItsPackage.ITS_RULES_CONTENT__WITHIN_TEXT_RULE:
				getWithinTextRule().clear();
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
			case ItsPackage.ITS_RULES_CONTENT__GROUP:
				return group != null && !group.isEmpty();
			case ItsPackage.ITS_RULES_CONTENT__TRANSLATE_RULE:
				return !getTranslateRule().isEmpty();
			case ItsPackage.ITS_RULES_CONTENT__LOC_NOTE_RULE:
				return !getLocNoteRule().isEmpty();
			case ItsPackage.ITS_RULES_CONTENT__TERM_RULE:
				return !getTermRule().isEmpty();
			case ItsPackage.ITS_RULES_CONTENT__DIR_RULE:
				return !getDirRule().isEmpty();
			case ItsPackage.ITS_RULES_CONTENT__RUBY_RULE:
				return !getRubyRule().isEmpty();
			case ItsPackage.ITS_RULES_CONTENT__LANG_RULE:
				return !getLangRule().isEmpty();
			case ItsPackage.ITS_RULES_CONTENT__WITHIN_TEXT_RULE:
				return !getWithinTextRule().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //ItsRulesContentImpl
