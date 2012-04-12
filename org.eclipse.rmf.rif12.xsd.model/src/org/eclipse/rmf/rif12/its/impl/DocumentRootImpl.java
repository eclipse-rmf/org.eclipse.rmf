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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.rmf.rif12.its.DirRuleType;
import org.eclipse.rmf.rif12.its.DocumentRoot;
import org.eclipse.rmf.rif12.its.ItsPackage;
import org.eclipse.rmf.rif12.its.LangRuleType;
import org.eclipse.rmf.rif12.its.LocNoteRuleType;
import org.eclipse.rmf.rif12.its.LocNoteType;
import org.eclipse.rmf.rif12.its.RbType;
import org.eclipse.rmf.rif12.its.RbcType;
import org.eclipse.rmf.rif12.its.RpType;
import org.eclipse.rmf.rif12.its.RtType;
import org.eclipse.rmf.rif12.its.RtcType;
import org.eclipse.rmf.rif12.its.RubyRuleType;
import org.eclipse.rmf.rif12.its.RubyTextType;
import org.eclipse.rmf.rif12.its.RubyType;
import org.eclipse.rmf.rif12.its.RulesType;
import org.eclipse.rmf.rif12.its.SpanType;
import org.eclipse.rmf.rif12.its.TermRuleType;
import org.eclipse.rmf.rif12.its.TranslateRuleType;
import org.eclipse.rmf.rif12.its.WithinTextRuleType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.DocumentRootImpl#getDirRule <em>Dir Rule</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.DocumentRootImpl#getLangRule <em>Lang Rule</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.DocumentRootImpl#getLocNote <em>Loc Note</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.DocumentRootImpl#getLocNoteRule <em>Loc Note Rule</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.DocumentRootImpl#getRb <em>Rb</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.DocumentRootImpl#getRbc <em>Rbc</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.DocumentRootImpl#getRp <em>Rp</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.DocumentRootImpl#getRt <em>Rt</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.DocumentRootImpl#getRtc <em>Rtc</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.DocumentRootImpl#getRuby <em>Ruby</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.DocumentRootImpl#getRubyRule <em>Ruby Rule</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.DocumentRootImpl#getRubyText <em>Ruby Text</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.DocumentRootImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.DocumentRootImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.DocumentRootImpl#getTermRule <em>Term Rule</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.DocumentRootImpl#getTranslateRule <em>Translate Rule</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.DocumentRootImpl#getWithinTextRule <em>Within Text Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
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
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItsPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, ItsPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ItsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ItsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirRuleType getDirRule() {
		return (DirRuleType)getMixed().get(ItsPackage.Literals.DOCUMENT_ROOT__DIR_RULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirRule(DirRuleType newDirRule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ItsPackage.Literals.DOCUMENT_ROOT__DIR_RULE, newDirRule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirRule(DirRuleType newDirRule) {
		((FeatureMap.Internal)getMixed()).set(ItsPackage.Literals.DOCUMENT_ROOT__DIR_RULE, newDirRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LangRuleType getLangRule() {
		return (LangRuleType)getMixed().get(ItsPackage.Literals.DOCUMENT_ROOT__LANG_RULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLangRule(LangRuleType newLangRule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ItsPackage.Literals.DOCUMENT_ROOT__LANG_RULE, newLangRule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLangRule(LangRuleType newLangRule) {
		((FeatureMap.Internal)getMixed()).set(ItsPackage.Literals.DOCUMENT_ROOT__LANG_RULE, newLangRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocNoteType getLocNote() {
		return (LocNoteType)getMixed().get(ItsPackage.Literals.DOCUMENT_ROOT__LOC_NOTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocNote(LocNoteType newLocNote, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ItsPackage.Literals.DOCUMENT_ROOT__LOC_NOTE, newLocNote, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocNote(LocNoteType newLocNote) {
		((FeatureMap.Internal)getMixed()).set(ItsPackage.Literals.DOCUMENT_ROOT__LOC_NOTE, newLocNote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocNoteRuleType getLocNoteRule() {
		return (LocNoteRuleType)getMixed().get(ItsPackage.Literals.DOCUMENT_ROOT__LOC_NOTE_RULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocNoteRule(LocNoteRuleType newLocNoteRule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ItsPackage.Literals.DOCUMENT_ROOT__LOC_NOTE_RULE, newLocNoteRule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocNoteRule(LocNoteRuleType newLocNoteRule) {
		((FeatureMap.Internal)getMixed()).set(ItsPackage.Literals.DOCUMENT_ROOT__LOC_NOTE_RULE, newLocNoteRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RbType getRb() {
		return (RbType)getMixed().get(ItsPackage.Literals.DOCUMENT_ROOT__RB, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRb(RbType newRb, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ItsPackage.Literals.DOCUMENT_ROOT__RB, newRb, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRb(RbType newRb) {
		((FeatureMap.Internal)getMixed()).set(ItsPackage.Literals.DOCUMENT_ROOT__RB, newRb);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RbcType getRbc() {
		return (RbcType)getMixed().get(ItsPackage.Literals.DOCUMENT_ROOT__RBC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRbc(RbcType newRbc, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ItsPackage.Literals.DOCUMENT_ROOT__RBC, newRbc, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRbc(RbcType newRbc) {
		((FeatureMap.Internal)getMixed()).set(ItsPackage.Literals.DOCUMENT_ROOT__RBC, newRbc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RpType getRp() {
		return (RpType)getMixed().get(ItsPackage.Literals.DOCUMENT_ROOT__RP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRp(RpType newRp, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ItsPackage.Literals.DOCUMENT_ROOT__RP, newRp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRp(RpType newRp) {
		((FeatureMap.Internal)getMixed()).set(ItsPackage.Literals.DOCUMENT_ROOT__RP, newRp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtType getRt() {
		return (RtType)getMixed().get(ItsPackage.Literals.DOCUMENT_ROOT__RT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRt(RtType newRt, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ItsPackage.Literals.DOCUMENT_ROOT__RT, newRt, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRt(RtType newRt) {
		((FeatureMap.Internal)getMixed()).set(ItsPackage.Literals.DOCUMENT_ROOT__RT, newRt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtcType getRtc() {
		return (RtcType)getMixed().get(ItsPackage.Literals.DOCUMENT_ROOT__RTC, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRtc(RtcType newRtc, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ItsPackage.Literals.DOCUMENT_ROOT__RTC, newRtc, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRtc(RtcType newRtc) {
		((FeatureMap.Internal)getMixed()).set(ItsPackage.Literals.DOCUMENT_ROOT__RTC, newRtc);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyType getRuby() {
		return (RubyType)getMixed().get(ItsPackage.Literals.DOCUMENT_ROOT__RUBY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuby(RubyType newRuby, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ItsPackage.Literals.DOCUMENT_ROOT__RUBY, newRuby, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuby(RubyType newRuby) {
		((FeatureMap.Internal)getMixed()).set(ItsPackage.Literals.DOCUMENT_ROOT__RUBY, newRuby);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyRuleType getRubyRule() {
		return (RubyRuleType)getMixed().get(ItsPackage.Literals.DOCUMENT_ROOT__RUBY_RULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRubyRule(RubyRuleType newRubyRule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ItsPackage.Literals.DOCUMENT_ROOT__RUBY_RULE, newRubyRule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRubyRule(RubyRuleType newRubyRule) {
		((FeatureMap.Internal)getMixed()).set(ItsPackage.Literals.DOCUMENT_ROOT__RUBY_RULE, newRubyRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyTextType getRubyText() {
		return (RubyTextType)getMixed().get(ItsPackage.Literals.DOCUMENT_ROOT__RUBY_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRubyText(RubyTextType newRubyText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ItsPackage.Literals.DOCUMENT_ROOT__RUBY_TEXT, newRubyText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRubyText(RubyTextType newRubyText) {
		((FeatureMap.Internal)getMixed()).set(ItsPackage.Literals.DOCUMENT_ROOT__RUBY_TEXT, newRubyText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesType getRules() {
		return (RulesType)getMixed().get(ItsPackage.Literals.DOCUMENT_ROOT__RULES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRules(RulesType newRules, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ItsPackage.Literals.DOCUMENT_ROOT__RULES, newRules, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRules(RulesType newRules) {
		((FeatureMap.Internal)getMixed()).set(ItsPackage.Literals.DOCUMENT_ROOT__RULES, newRules);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpanType getSpan() {
		return (SpanType)getMixed().get(ItsPackage.Literals.DOCUMENT_ROOT__SPAN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpan(SpanType newSpan, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ItsPackage.Literals.DOCUMENT_ROOT__SPAN, newSpan, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpan(SpanType newSpan) {
		((FeatureMap.Internal)getMixed()).set(ItsPackage.Literals.DOCUMENT_ROOT__SPAN, newSpan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermRuleType getTermRule() {
		return (TermRuleType)getMixed().get(ItsPackage.Literals.DOCUMENT_ROOT__TERM_RULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTermRule(TermRuleType newTermRule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ItsPackage.Literals.DOCUMENT_ROOT__TERM_RULE, newTermRule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTermRule(TermRuleType newTermRule) {
		((FeatureMap.Internal)getMixed()).set(ItsPackage.Literals.DOCUMENT_ROOT__TERM_RULE, newTermRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslateRuleType getTranslateRule() {
		return (TranslateRuleType)getMixed().get(ItsPackage.Literals.DOCUMENT_ROOT__TRANSLATE_RULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTranslateRule(TranslateRuleType newTranslateRule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ItsPackage.Literals.DOCUMENT_ROOT__TRANSLATE_RULE, newTranslateRule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslateRule(TranslateRuleType newTranslateRule) {
		((FeatureMap.Internal)getMixed()).set(ItsPackage.Literals.DOCUMENT_ROOT__TRANSLATE_RULE, newTranslateRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithinTextRuleType getWithinTextRule() {
		return (WithinTextRuleType)getMixed().get(ItsPackage.Literals.DOCUMENT_ROOT__WITHIN_TEXT_RULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWithinTextRule(WithinTextRuleType newWithinTextRule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ItsPackage.Literals.DOCUMENT_ROOT__WITHIN_TEXT_RULE, newWithinTextRule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithinTextRule(WithinTextRuleType newWithinTextRule) {
		((FeatureMap.Internal)getMixed()).set(ItsPackage.Literals.DOCUMENT_ROOT__WITHIN_TEXT_RULE, newWithinTextRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ItsPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case ItsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case ItsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case ItsPackage.DOCUMENT_ROOT__DIR_RULE:
				return basicSetDirRule(null, msgs);
			case ItsPackage.DOCUMENT_ROOT__LANG_RULE:
				return basicSetLangRule(null, msgs);
			case ItsPackage.DOCUMENT_ROOT__LOC_NOTE:
				return basicSetLocNote(null, msgs);
			case ItsPackage.DOCUMENT_ROOT__LOC_NOTE_RULE:
				return basicSetLocNoteRule(null, msgs);
			case ItsPackage.DOCUMENT_ROOT__RB:
				return basicSetRb(null, msgs);
			case ItsPackage.DOCUMENT_ROOT__RBC:
				return basicSetRbc(null, msgs);
			case ItsPackage.DOCUMENT_ROOT__RP:
				return basicSetRp(null, msgs);
			case ItsPackage.DOCUMENT_ROOT__RT:
				return basicSetRt(null, msgs);
			case ItsPackage.DOCUMENT_ROOT__RTC:
				return basicSetRtc(null, msgs);
			case ItsPackage.DOCUMENT_ROOT__RUBY:
				return basicSetRuby(null, msgs);
			case ItsPackage.DOCUMENT_ROOT__RUBY_RULE:
				return basicSetRubyRule(null, msgs);
			case ItsPackage.DOCUMENT_ROOT__RUBY_TEXT:
				return basicSetRubyText(null, msgs);
			case ItsPackage.DOCUMENT_ROOT__RULES:
				return basicSetRules(null, msgs);
			case ItsPackage.DOCUMENT_ROOT__SPAN:
				return basicSetSpan(null, msgs);
			case ItsPackage.DOCUMENT_ROOT__TERM_RULE:
				return basicSetTermRule(null, msgs);
			case ItsPackage.DOCUMENT_ROOT__TRANSLATE_RULE:
				return basicSetTranslateRule(null, msgs);
			case ItsPackage.DOCUMENT_ROOT__WITHIN_TEXT_RULE:
				return basicSetWithinTextRule(null, msgs);
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
			case ItsPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case ItsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case ItsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case ItsPackage.DOCUMENT_ROOT__DIR_RULE:
				return getDirRule();
			case ItsPackage.DOCUMENT_ROOT__LANG_RULE:
				return getLangRule();
			case ItsPackage.DOCUMENT_ROOT__LOC_NOTE:
				return getLocNote();
			case ItsPackage.DOCUMENT_ROOT__LOC_NOTE_RULE:
				return getLocNoteRule();
			case ItsPackage.DOCUMENT_ROOT__RB:
				return getRb();
			case ItsPackage.DOCUMENT_ROOT__RBC:
				return getRbc();
			case ItsPackage.DOCUMENT_ROOT__RP:
				return getRp();
			case ItsPackage.DOCUMENT_ROOT__RT:
				return getRt();
			case ItsPackage.DOCUMENT_ROOT__RTC:
				return getRtc();
			case ItsPackage.DOCUMENT_ROOT__RUBY:
				return getRuby();
			case ItsPackage.DOCUMENT_ROOT__RUBY_RULE:
				return getRubyRule();
			case ItsPackage.DOCUMENT_ROOT__RUBY_TEXT:
				return getRubyText();
			case ItsPackage.DOCUMENT_ROOT__RULES:
				return getRules();
			case ItsPackage.DOCUMENT_ROOT__SPAN:
				return getSpan();
			case ItsPackage.DOCUMENT_ROOT__TERM_RULE:
				return getTermRule();
			case ItsPackage.DOCUMENT_ROOT__TRANSLATE_RULE:
				return getTranslateRule();
			case ItsPackage.DOCUMENT_ROOT__WITHIN_TEXT_RULE:
				return getWithinTextRule();
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
			case ItsPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case ItsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case ItsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case ItsPackage.DOCUMENT_ROOT__DIR_RULE:
				setDirRule((DirRuleType)newValue);
				return;
			case ItsPackage.DOCUMENT_ROOT__LANG_RULE:
				setLangRule((LangRuleType)newValue);
				return;
			case ItsPackage.DOCUMENT_ROOT__LOC_NOTE:
				setLocNote((LocNoteType)newValue);
				return;
			case ItsPackage.DOCUMENT_ROOT__LOC_NOTE_RULE:
				setLocNoteRule((LocNoteRuleType)newValue);
				return;
			case ItsPackage.DOCUMENT_ROOT__RB:
				setRb((RbType)newValue);
				return;
			case ItsPackage.DOCUMENT_ROOT__RBC:
				setRbc((RbcType)newValue);
				return;
			case ItsPackage.DOCUMENT_ROOT__RP:
				setRp((RpType)newValue);
				return;
			case ItsPackage.DOCUMENT_ROOT__RT:
				setRt((RtType)newValue);
				return;
			case ItsPackage.DOCUMENT_ROOT__RTC:
				setRtc((RtcType)newValue);
				return;
			case ItsPackage.DOCUMENT_ROOT__RUBY:
				setRuby((RubyType)newValue);
				return;
			case ItsPackage.DOCUMENT_ROOT__RUBY_RULE:
				setRubyRule((RubyRuleType)newValue);
				return;
			case ItsPackage.DOCUMENT_ROOT__RUBY_TEXT:
				setRubyText((RubyTextType)newValue);
				return;
			case ItsPackage.DOCUMENT_ROOT__RULES:
				setRules((RulesType)newValue);
				return;
			case ItsPackage.DOCUMENT_ROOT__SPAN:
				setSpan((SpanType)newValue);
				return;
			case ItsPackage.DOCUMENT_ROOT__TERM_RULE:
				setTermRule((TermRuleType)newValue);
				return;
			case ItsPackage.DOCUMENT_ROOT__TRANSLATE_RULE:
				setTranslateRule((TranslateRuleType)newValue);
				return;
			case ItsPackage.DOCUMENT_ROOT__WITHIN_TEXT_RULE:
				setWithinTextRule((WithinTextRuleType)newValue);
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
			case ItsPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case ItsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case ItsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case ItsPackage.DOCUMENT_ROOT__DIR_RULE:
				setDirRule((DirRuleType)null);
				return;
			case ItsPackage.DOCUMENT_ROOT__LANG_RULE:
				setLangRule((LangRuleType)null);
				return;
			case ItsPackage.DOCUMENT_ROOT__LOC_NOTE:
				setLocNote((LocNoteType)null);
				return;
			case ItsPackage.DOCUMENT_ROOT__LOC_NOTE_RULE:
				setLocNoteRule((LocNoteRuleType)null);
				return;
			case ItsPackage.DOCUMENT_ROOT__RB:
				setRb((RbType)null);
				return;
			case ItsPackage.DOCUMENT_ROOT__RBC:
				setRbc((RbcType)null);
				return;
			case ItsPackage.DOCUMENT_ROOT__RP:
				setRp((RpType)null);
				return;
			case ItsPackage.DOCUMENT_ROOT__RT:
				setRt((RtType)null);
				return;
			case ItsPackage.DOCUMENT_ROOT__RTC:
				setRtc((RtcType)null);
				return;
			case ItsPackage.DOCUMENT_ROOT__RUBY:
				setRuby((RubyType)null);
				return;
			case ItsPackage.DOCUMENT_ROOT__RUBY_RULE:
				setRubyRule((RubyRuleType)null);
				return;
			case ItsPackage.DOCUMENT_ROOT__RUBY_TEXT:
				setRubyText((RubyTextType)null);
				return;
			case ItsPackage.DOCUMENT_ROOT__RULES:
				setRules((RulesType)null);
				return;
			case ItsPackage.DOCUMENT_ROOT__SPAN:
				setSpan((SpanType)null);
				return;
			case ItsPackage.DOCUMENT_ROOT__TERM_RULE:
				setTermRule((TermRuleType)null);
				return;
			case ItsPackage.DOCUMENT_ROOT__TRANSLATE_RULE:
				setTranslateRule((TranslateRuleType)null);
				return;
			case ItsPackage.DOCUMENT_ROOT__WITHIN_TEXT_RULE:
				setWithinTextRule((WithinTextRuleType)null);
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
			case ItsPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case ItsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case ItsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case ItsPackage.DOCUMENT_ROOT__DIR_RULE:
				return getDirRule() != null;
			case ItsPackage.DOCUMENT_ROOT__LANG_RULE:
				return getLangRule() != null;
			case ItsPackage.DOCUMENT_ROOT__LOC_NOTE:
				return getLocNote() != null;
			case ItsPackage.DOCUMENT_ROOT__LOC_NOTE_RULE:
				return getLocNoteRule() != null;
			case ItsPackage.DOCUMENT_ROOT__RB:
				return getRb() != null;
			case ItsPackage.DOCUMENT_ROOT__RBC:
				return getRbc() != null;
			case ItsPackage.DOCUMENT_ROOT__RP:
				return getRp() != null;
			case ItsPackage.DOCUMENT_ROOT__RT:
				return getRt() != null;
			case ItsPackage.DOCUMENT_ROOT__RTC:
				return getRtc() != null;
			case ItsPackage.DOCUMENT_ROOT__RUBY:
				return getRuby() != null;
			case ItsPackage.DOCUMENT_ROOT__RUBY_RULE:
				return getRubyRule() != null;
			case ItsPackage.DOCUMENT_ROOT__RUBY_TEXT:
				return getRubyText() != null;
			case ItsPackage.DOCUMENT_ROOT__RULES:
				return getRules() != null;
			case ItsPackage.DOCUMENT_ROOT__SPAN:
				return getSpan() != null;
			case ItsPackage.DOCUMENT_ROOT__TERM_RULE:
				return getTermRule() != null;
			case ItsPackage.DOCUMENT_ROOT__TRANSLATE_RULE:
				return getTranslateRule() != null;
			case ItsPackage.DOCUMENT_ROOT__WITHIN_TEXT_RULE:
				return getWithinTextRule() != null;
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

} //DocumentRootImpl
