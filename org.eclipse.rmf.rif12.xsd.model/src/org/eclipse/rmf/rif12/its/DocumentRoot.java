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

package org.eclipse.rmf.rif12.its;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.its.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.DocumentRoot#getDirRule <em>Dir Rule</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.DocumentRoot#getLangRule <em>Lang Rule</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.DocumentRoot#getLocNote <em>Loc Note</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.DocumentRoot#getLocNoteRule <em>Loc Note Rule</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRb <em>Rb</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRbc <em>Rbc</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRp <em>Rp</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRt <em>Rt</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRtc <em>Rtc</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRuby <em>Ruby</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRubyRule <em>Ruby Rule</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRubyText <em>Ruby Text</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRules <em>Rules</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.DocumentRoot#getSpan <em>Span</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.DocumentRoot#getTermRule <em>Term Rule</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.DocumentRoot#getTranslateRule <em>Translate Rule</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.DocumentRoot#getWithinTextRule <em>Within Text Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.its.ItsPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Dir Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rule about the Directionality data category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dir Rule</em>' containment reference.
	 * @see #setDirRule(DirRuleType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getDocumentRoot_DirRule()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dirRule' namespace='##targetNamespace'"
	 * @generated
	 */
	DirRuleType getDirRule();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getDirRule <em>Dir Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir Rule</em>' containment reference.
	 * @see #getDirRule()
	 * @generated
	 */
	void setDirRule(DirRuleType value);

	/**
	 * Returns the value of the '<em><b>Lang Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rule about the Language Information data category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang Rule</em>' containment reference.
	 * @see #setLangRule(LangRuleType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getDocumentRoot_LangRule()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='langRule' namespace='##targetNamespace'"
	 * @generated
	 */
	LangRuleType getLangRule();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getLangRule <em>Lang Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang Rule</em>' containment reference.
	 * @see #getLangRule()
	 * @generated
	 */
	void setLangRule(LangRuleType value);

	/**
	 * Returns the value of the '<em><b>Loc Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains a localization note.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Note</em>' containment reference.
	 * @see #setLocNote(LocNoteType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getDocumentRoot_LocNote()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='locNote' namespace='##targetNamespace'"
	 * @generated
	 */
	LocNoteType getLocNote();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getLocNote <em>Loc Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Note</em>' containment reference.
	 * @see #getLocNote()
	 * @generated
	 */
	void setLocNote(LocNoteType value);

	/**
	 * Returns the value of the '<em><b>Loc Note Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rule about the Localization Note data category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Note Rule</em>' containment reference.
	 * @see #setLocNoteRule(LocNoteRuleType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getDocumentRoot_LocNoteRule()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='locNoteRule' namespace='##targetNamespace'"
	 * @generated
	 */
	LocNoteRuleType getLocNoteRule();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getLocNoteRule <em>Loc Note Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Note Rule</em>' containment reference.
	 * @see #getLocNoteRule()
	 * @generated
	 */
	void setLocNoteRule(LocNoteRuleType value);

	/**
	 * Returns the value of the '<em><b>Rb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ruby base text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rb</em>' containment reference.
	 * @see #setRb(RbType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getDocumentRoot_Rb()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rb' namespace='##targetNamespace'"
	 * @generated
	 */
	RbType getRb();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRb <em>Rb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rb</em>' containment reference.
	 * @see #getRb()
	 * @generated
	 */
	void setRb(RbType value);

	/**
	 * Returns the value of the '<em><b>Rbc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for rb elements in the case of complex ruby markup.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rbc</em>' containment reference.
	 * @see #setRbc(RbcType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getDocumentRoot_Rbc()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rbc' namespace='##targetNamespace'"
	 * @generated
	 */
	RbcType getRbc();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRbc <em>Rbc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rbc</em>' containment reference.
	 * @see #getRbc()
	 * @generated
	 */
	void setRbc(RbcType value);

	/**
	 * Returns the value of the '<em><b>Rp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used in the case of simple ruby markup to specify characters that can denote the beginning and end of ruby text when user agents do not have other ways to present ruby text distinctively from the base text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rp</em>' containment reference.
	 * @see #setRp(RpType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getDocumentRoot_Rp()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rp' namespace='##targetNamespace'"
	 * @generated
	 */
	RpType getRp();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRp <em>Rp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rp</em>' containment reference.
	 * @see #getRp()
	 * @generated
	 */
	void setRp(RpType value);

	/**
	 * Returns the value of the '<em><b>Rt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ruby text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rt</em>' containment reference.
	 * @see #setRt(RtType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getDocumentRoot_Rt()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rt' namespace='##targetNamespace'"
	 * @generated
	 */
	RtType getRt();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRt <em>Rt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rt</em>' containment reference.
	 * @see #getRt()
	 * @generated
	 */
	void setRt(RtType value);

	/**
	 * Returns the value of the '<em><b>Rtc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for rt elements in the case of complex ruby markup. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rtc</em>' containment reference.
	 * @see #setRtc(RtcType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getDocumentRoot_Rtc()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rtc' namespace='##targetNamespace'"
	 * @generated
	 */
	RtcType getRtc();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRtc <em>Rtc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtc</em>' containment reference.
	 * @see #getRtc()
	 * @generated
	 */
	void setRtc(RtcType value);

	/**
	 * Returns the value of the '<em><b>Ruby</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ruby markup.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ruby</em>' containment reference.
	 * @see #setRuby(RubyType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getDocumentRoot_Ruby()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ruby' namespace='##targetNamespace'"
	 * @generated
	 */
	RubyType getRuby();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRuby <em>Ruby</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruby</em>' containment reference.
	 * @see #getRuby()
	 * @generated
	 */
	void setRuby(RubyType value);

	/**
	 * Returns the value of the '<em><b>Ruby Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rule about the Ruby data category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ruby Rule</em>' containment reference.
	 * @see #setRubyRule(RubyRuleType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getDocumentRoot_RubyRule()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rubyRule' namespace='##targetNamespace'"
	 * @generated
	 */
	RubyRuleType getRubyRule();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRubyRule <em>Ruby Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruby Rule</em>' containment reference.
	 * @see #getRubyRule()
	 * @generated
	 */
	void setRubyRule(RubyRuleType value);

	/**
	 * Returns the value of the '<em><b>Ruby Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ruby text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ruby Text</em>' containment reference.
	 * @see #setRubyText(RubyTextType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getDocumentRoot_RubyText()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rubyText' namespace='##targetNamespace'"
	 * @generated
	 */
	RubyTextType getRubyText();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRubyText <em>Ruby Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruby Text</em>' containment reference.
	 * @see #getRubyText()
	 * @generated
	 */
	void setRubyText(RubyTextType value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for global rules.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference.
	 * @see #setRules(RulesType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getDocumentRoot_Rules()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rules' namespace='##targetNamespace'"
	 * @generated
	 */
	RulesType getRules();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRules <em>Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rules</em>' containment reference.
	 * @see #getRules()
	 * @generated
	 */
	void setRules(RulesType value);

	/**
	 * Returns the value of the '<em><b>Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inline element to contain ITS information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Span</em>' containment reference.
	 * @see #setSpan(SpanType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getDocumentRoot_Span()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='span' namespace='##targetNamespace'"
	 * @generated
	 */
	SpanType getSpan();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getSpan <em>Span</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span</em>' containment reference.
	 * @see #getSpan()
	 * @generated
	 */
	void setSpan(SpanType value);

	/**
	 * Returns the value of the '<em><b>Term Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rule about the Terminology data category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term Rule</em>' containment reference.
	 * @see #setTermRule(TermRuleType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getDocumentRoot_TermRule()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='termRule' namespace='##targetNamespace'"
	 * @generated
	 */
	TermRuleType getTermRule();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getTermRule <em>Term Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Rule</em>' containment reference.
	 * @see #getTermRule()
	 * @generated
	 */
	void setTermRule(TermRuleType value);

	/**
	 * Returns the value of the '<em><b>Translate Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rule about the Translate data category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Translate Rule</em>' containment reference.
	 * @see #setTranslateRule(TranslateRuleType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getDocumentRoot_TranslateRule()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='translateRule' namespace='##targetNamespace'"
	 * @generated
	 */
	TranslateRuleType getTranslateRule();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getTranslateRule <em>Translate Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translate Rule</em>' containment reference.
	 * @see #getTranslateRule()
	 * @generated
	 */
	void setTranslateRule(TranslateRuleType value);

	/**
	 * Returns the value of the '<em><b>Within Text Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rule about the Elements Within Text data category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Within Text Rule</em>' containment reference.
	 * @see #setWithinTextRule(WithinTextRuleType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getDocumentRoot_WithinTextRule()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='withinTextRule' namespace='##targetNamespace'"
	 * @generated
	 */
	WithinTextRuleType getWithinTextRule();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getWithinTextRule <em>Within Text Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Within Text Rule</em>' containment reference.
	 * @see #getWithinTextRule()
	 * @generated
	 */
	void setWithinTextRule(WithinTextRuleType value);

} // DocumentRoot
