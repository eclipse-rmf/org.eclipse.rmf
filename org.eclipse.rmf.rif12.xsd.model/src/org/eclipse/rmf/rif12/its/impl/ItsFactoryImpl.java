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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.rmf.rif12.its.DirRuleType;
import org.eclipse.rmf.rif12.its.DirType;
import org.eclipse.rmf.rif12.its.DirType1;
import org.eclipse.rmf.rif12.its.DirType2;
import org.eclipse.rmf.rif12.its.DocumentRoot;
import org.eclipse.rmf.rif12.its.ItsFactory;
import org.eclipse.rmf.rif12.its.ItsLocNoteContent;
import org.eclipse.rmf.rif12.its.ItsLocNoteRuleContent;
import org.eclipse.rmf.rif12.its.ItsPackage;
import org.eclipse.rmf.rif12.its.ItsRbContent;
import org.eclipse.rmf.rif12.its.ItsRbcContent;
import org.eclipse.rmf.rif12.its.ItsRtContent;
import org.eclipse.rmf.rif12.its.ItsRtcContent;
import org.eclipse.rmf.rif12.its.ItsRubyContent;
import org.eclipse.rmf.rif12.its.ItsRubyRuleContent;
import org.eclipse.rmf.rif12.its.ItsRulesContent;
import org.eclipse.rmf.rif12.its.ItsSpanContent;
import org.eclipse.rmf.rif12.its.LangRuleType;
import org.eclipse.rmf.rif12.its.LocNoteRuleType;
import org.eclipse.rmf.rif12.its.LocNoteType;
import org.eclipse.rmf.rif12.its.LocNoteTypeType;
import org.eclipse.rmf.rif12.its.LocNoteTypeType1;
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
import org.eclipse.rmf.rif12.its.TermType;
import org.eclipse.rmf.rif12.its.TermType1;
import org.eclipse.rmf.rif12.its.TranslateRuleType;
import org.eclipse.rmf.rif12.its.TranslateType;
import org.eclipse.rmf.rif12.its.TranslateType1;
import org.eclipse.rmf.rif12.its.WithinTextRuleType;
import org.eclipse.rmf.rif12.its.WithinTextType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ItsFactoryImpl extends EFactoryImpl implements ItsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ItsFactory init() {
		try {
			ItsFactory theItsFactory = (ItsFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.w3.org/2005/11/its"); 
			if (theItsFactory != null) {
				return theItsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ItsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ItsPackage.DIR_RULE_TYPE: return createDirRuleType();
			case ItsPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ItsPackage.ITS_LOC_NOTE_CONTENT: return createItsLocNoteContent();
			case ItsPackage.ITS_LOC_NOTE_RULE_CONTENT: return createItsLocNoteRuleContent();
			case ItsPackage.ITS_RBC_CONTENT: return createItsRbcContent();
			case ItsPackage.ITS_RB_CONTENT: return createItsRbContent();
			case ItsPackage.ITS_RTC_CONTENT: return createItsRtcContent();
			case ItsPackage.ITS_RT_CONTENT: return createItsRtContent();
			case ItsPackage.ITS_RUBY_CONTENT: return createItsRubyContent();
			case ItsPackage.ITS_RUBY_RULE_CONTENT: return createItsRubyRuleContent();
			case ItsPackage.ITS_RULES_CONTENT: return createItsRulesContent();
			case ItsPackage.ITS_SPAN_CONTENT: return createItsSpanContent();
			case ItsPackage.LANG_RULE_TYPE: return createLangRuleType();
			case ItsPackage.LOC_NOTE_RULE_TYPE: return createLocNoteRuleType();
			case ItsPackage.LOC_NOTE_TYPE: return createLocNoteType();
			case ItsPackage.RBC_TYPE: return createRbcType();
			case ItsPackage.RB_TYPE: return createRbType();
			case ItsPackage.RP_TYPE: return createRpType();
			case ItsPackage.RTC_TYPE: return createRtcType();
			case ItsPackage.RT_TYPE: return createRtType();
			case ItsPackage.RUBY_RULE_TYPE: return createRubyRuleType();
			case ItsPackage.RUBY_TEXT_TYPE: return createRubyTextType();
			case ItsPackage.RUBY_TYPE: return createRubyType();
			case ItsPackage.RULES_TYPE: return createRulesType();
			case ItsPackage.SPAN_TYPE: return createSpanType();
			case ItsPackage.TERM_RULE_TYPE: return createTermRuleType();
			case ItsPackage.TRANSLATE_RULE_TYPE: return createTranslateRuleType();
			case ItsPackage.WITHIN_TEXT_RULE_TYPE: return createWithinTextRuleType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ItsPackage.DIR_TYPE:
				return createDirTypeFromString(eDataType, initialValue);
			case ItsPackage.DIR_TYPE1:
				return createDirType1FromString(eDataType, initialValue);
			case ItsPackage.DIR_TYPE2:
				return createDirType2FromString(eDataType, initialValue);
			case ItsPackage.LOC_NOTE_TYPE_TYPE:
				return createLocNoteTypeTypeFromString(eDataType, initialValue);
			case ItsPackage.LOC_NOTE_TYPE_TYPE1:
				return createLocNoteTypeType1FromString(eDataType, initialValue);
			case ItsPackage.TERM_TYPE:
				return createTermTypeFromString(eDataType, initialValue);
			case ItsPackage.TERM_TYPE1:
				return createTermType1FromString(eDataType, initialValue);
			case ItsPackage.TRANSLATE_TYPE:
				return createTranslateTypeFromString(eDataType, initialValue);
			case ItsPackage.TRANSLATE_TYPE1:
				return createTranslateType1FromString(eDataType, initialValue);
			case ItsPackage.WITHIN_TEXT_TYPE:
				return createWithinTextTypeFromString(eDataType, initialValue);
			case ItsPackage.DIR_TYPE_OBJECT:
				return createDirTypeObjectFromString(eDataType, initialValue);
			case ItsPackage.DIR_TYPE_OBJECT1:
				return createDirTypeObject1FromString(eDataType, initialValue);
			case ItsPackage.DIR_TYPE_OBJECT2:
				return createDirTypeObject2FromString(eDataType, initialValue);
			case ItsPackage.LOC_NOTE_TYPE_TYPE_OBJECT:
				return createLocNoteTypeTypeObjectFromString(eDataType, initialValue);
			case ItsPackage.LOC_NOTE_TYPE_TYPE_OBJECT1:
				return createLocNoteTypeTypeObject1FromString(eDataType, initialValue);
			case ItsPackage.TERM_TYPE_OBJECT:
				return createTermTypeObjectFromString(eDataType, initialValue);
			case ItsPackage.TERM_TYPE_OBJECT1:
				return createTermTypeObject1FromString(eDataType, initialValue);
			case ItsPackage.TRANSLATE_TYPE_OBJECT:
				return createTranslateTypeObjectFromString(eDataType, initialValue);
			case ItsPackage.TRANSLATE_TYPE_OBJECT1:
				return createTranslateTypeObject1FromString(eDataType, initialValue);
			case ItsPackage.WITHIN_TEXT_TYPE_OBJECT:
				return createWithinTextTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ItsPackage.DIR_TYPE:
				return convertDirTypeToString(eDataType, instanceValue);
			case ItsPackage.DIR_TYPE1:
				return convertDirType1ToString(eDataType, instanceValue);
			case ItsPackage.DIR_TYPE2:
				return convertDirType2ToString(eDataType, instanceValue);
			case ItsPackage.LOC_NOTE_TYPE_TYPE:
				return convertLocNoteTypeTypeToString(eDataType, instanceValue);
			case ItsPackage.LOC_NOTE_TYPE_TYPE1:
				return convertLocNoteTypeType1ToString(eDataType, instanceValue);
			case ItsPackage.TERM_TYPE:
				return convertTermTypeToString(eDataType, instanceValue);
			case ItsPackage.TERM_TYPE1:
				return convertTermType1ToString(eDataType, instanceValue);
			case ItsPackage.TRANSLATE_TYPE:
				return convertTranslateTypeToString(eDataType, instanceValue);
			case ItsPackage.TRANSLATE_TYPE1:
				return convertTranslateType1ToString(eDataType, instanceValue);
			case ItsPackage.WITHIN_TEXT_TYPE:
				return convertWithinTextTypeToString(eDataType, instanceValue);
			case ItsPackage.DIR_TYPE_OBJECT:
				return convertDirTypeObjectToString(eDataType, instanceValue);
			case ItsPackage.DIR_TYPE_OBJECT1:
				return convertDirTypeObject1ToString(eDataType, instanceValue);
			case ItsPackage.DIR_TYPE_OBJECT2:
				return convertDirTypeObject2ToString(eDataType, instanceValue);
			case ItsPackage.LOC_NOTE_TYPE_TYPE_OBJECT:
				return convertLocNoteTypeTypeObjectToString(eDataType, instanceValue);
			case ItsPackage.LOC_NOTE_TYPE_TYPE_OBJECT1:
				return convertLocNoteTypeTypeObject1ToString(eDataType, instanceValue);
			case ItsPackage.TERM_TYPE_OBJECT:
				return convertTermTypeObjectToString(eDataType, instanceValue);
			case ItsPackage.TERM_TYPE_OBJECT1:
				return convertTermTypeObject1ToString(eDataType, instanceValue);
			case ItsPackage.TRANSLATE_TYPE_OBJECT:
				return convertTranslateTypeObjectToString(eDataType, instanceValue);
			case ItsPackage.TRANSLATE_TYPE_OBJECT1:
				return convertTranslateTypeObject1ToString(eDataType, instanceValue);
			case ItsPackage.WITHIN_TEXT_TYPE_OBJECT:
				return convertWithinTextTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirRuleType createDirRuleType() {
		DirRuleTypeImpl dirRuleType = new DirRuleTypeImpl();
		return dirRuleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItsLocNoteContent createItsLocNoteContent() {
		ItsLocNoteContentImpl itsLocNoteContent = new ItsLocNoteContentImpl();
		return itsLocNoteContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItsLocNoteRuleContent createItsLocNoteRuleContent() {
		ItsLocNoteRuleContentImpl itsLocNoteRuleContent = new ItsLocNoteRuleContentImpl();
		return itsLocNoteRuleContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItsRbcContent createItsRbcContent() {
		ItsRbcContentImpl itsRbcContent = new ItsRbcContentImpl();
		return itsRbcContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItsRbContent createItsRbContent() {
		ItsRbContentImpl itsRbContent = new ItsRbContentImpl();
		return itsRbContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItsRtcContent createItsRtcContent() {
		ItsRtcContentImpl itsRtcContent = new ItsRtcContentImpl();
		return itsRtcContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItsRtContent createItsRtContent() {
		ItsRtContentImpl itsRtContent = new ItsRtContentImpl();
		return itsRtContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItsRubyContent createItsRubyContent() {
		ItsRubyContentImpl itsRubyContent = new ItsRubyContentImpl();
		return itsRubyContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItsRubyRuleContent createItsRubyRuleContent() {
		ItsRubyRuleContentImpl itsRubyRuleContent = new ItsRubyRuleContentImpl();
		return itsRubyRuleContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItsRulesContent createItsRulesContent() {
		ItsRulesContentImpl itsRulesContent = new ItsRulesContentImpl();
		return itsRulesContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItsSpanContent createItsSpanContent() {
		ItsSpanContentImpl itsSpanContent = new ItsSpanContentImpl();
		return itsSpanContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LangRuleType createLangRuleType() {
		LangRuleTypeImpl langRuleType = new LangRuleTypeImpl();
		return langRuleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocNoteRuleType createLocNoteRuleType() {
		LocNoteRuleTypeImpl locNoteRuleType = new LocNoteRuleTypeImpl();
		return locNoteRuleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocNoteType createLocNoteType() {
		LocNoteTypeImpl locNoteType = new LocNoteTypeImpl();
		return locNoteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RbcType createRbcType() {
		RbcTypeImpl rbcType = new RbcTypeImpl();
		return rbcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RbType createRbType() {
		RbTypeImpl rbType = new RbTypeImpl();
		return rbType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RpType createRpType() {
		RpTypeImpl rpType = new RpTypeImpl();
		return rpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtcType createRtcType() {
		RtcTypeImpl rtcType = new RtcTypeImpl();
		return rtcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RtType createRtType() {
		RtTypeImpl rtType = new RtTypeImpl();
		return rtType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyRuleType createRubyRuleType() {
		RubyRuleTypeImpl rubyRuleType = new RubyRuleTypeImpl();
		return rubyRuleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyTextType createRubyTextType() {
		RubyTextTypeImpl rubyTextType = new RubyTextTypeImpl();
		return rubyTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RubyType createRubyType() {
		RubyTypeImpl rubyType = new RubyTypeImpl();
		return rubyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesType createRulesType() {
		RulesTypeImpl rulesType = new RulesTypeImpl();
		return rulesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpanType createSpanType() {
		SpanTypeImpl spanType = new SpanTypeImpl();
		return spanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermRuleType createTermRuleType() {
		TermRuleTypeImpl termRuleType = new TermRuleTypeImpl();
		return termRuleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslateRuleType createTranslateRuleType() {
		TranslateRuleTypeImpl translateRuleType = new TranslateRuleTypeImpl();
		return translateRuleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithinTextRuleType createWithinTextRuleType() {
		WithinTextRuleTypeImpl withinTextRuleType = new WithinTextRuleTypeImpl();
		return withinTextRuleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType createDirTypeFromString(EDataType eDataType, String initialValue) {
		DirType result = DirType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType1 createDirType1FromString(EDataType eDataType, String initialValue) {
		DirType1 result = DirType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType2 createDirType2FromString(EDataType eDataType, String initialValue) {
		DirType2 result = DirType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocNoteTypeType createLocNoteTypeTypeFromString(EDataType eDataType, String initialValue) {
		LocNoteTypeType result = LocNoteTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocNoteTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocNoteTypeType1 createLocNoteTypeType1FromString(EDataType eDataType, String initialValue) {
		LocNoteTypeType1 result = LocNoteTypeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocNoteTypeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermType createTermTypeFromString(EDataType eDataType, String initialValue) {
		TermType result = TermType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTermTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermType1 createTermType1FromString(EDataType eDataType, String initialValue) {
		TermType1 result = TermType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTermType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslateType createTranslateTypeFromString(EDataType eDataType, String initialValue) {
		TranslateType result = TranslateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTranslateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslateType1 createTranslateType1FromString(EDataType eDataType, String initialValue) {
		TranslateType1 result = TranslateType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTranslateType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithinTextType createWithinTextTypeFromString(EDataType eDataType, String initialValue) {
		WithinTextType result = WithinTextType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWithinTextTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType1 createDirTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDirType1FromString(ItsPackage.Literals.DIR_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDirType1ToString(ItsPackage.Literals.DIR_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType createDirTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createDirTypeFromString(ItsPackage.Literals.DIR_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertDirTypeToString(ItsPackage.Literals.DIR_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType2 createDirTypeObject2FromString(EDataType eDataType, String initialValue) {
		return createDirType2FromString(ItsPackage.Literals.DIR_TYPE2, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirTypeObject2ToString(EDataType eDataType, Object instanceValue) {
		return convertDirType2ToString(ItsPackage.Literals.DIR_TYPE2, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocNoteTypeType createLocNoteTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLocNoteTypeTypeFromString(ItsPackage.Literals.LOC_NOTE_TYPE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocNoteTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLocNoteTypeTypeToString(ItsPackage.Literals.LOC_NOTE_TYPE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocNoteTypeType1 createLocNoteTypeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createLocNoteTypeType1FromString(ItsPackage.Literals.LOC_NOTE_TYPE_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocNoteTypeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertLocNoteTypeType1ToString(ItsPackage.Literals.LOC_NOTE_TYPE_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermType createTermTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTermTypeFromString(ItsPackage.Literals.TERM_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTermTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTermTypeToString(ItsPackage.Literals.TERM_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermType1 createTermTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createTermType1FromString(ItsPackage.Literals.TERM_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTermTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertTermType1ToString(ItsPackage.Literals.TERM_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslateType createTranslateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTranslateTypeFromString(ItsPackage.Literals.TRANSLATE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTranslateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTranslateTypeToString(ItsPackage.Literals.TRANSLATE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslateType1 createTranslateTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createTranslateType1FromString(ItsPackage.Literals.TRANSLATE_TYPE1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTranslateTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertTranslateType1ToString(ItsPackage.Literals.TRANSLATE_TYPE1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WithinTextType createWithinTextTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createWithinTextTypeFromString(ItsPackage.Literals.WITHIN_TEXT_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWithinTextTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertWithinTextTypeToString(ItsPackage.Literals.WITHIN_TEXT_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItsPackage getItsPackage() {
		return (ItsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ItsPackage getPackage() {
		return ItsPackage.eINSTANCE;
	}

} //ItsFactoryImpl
