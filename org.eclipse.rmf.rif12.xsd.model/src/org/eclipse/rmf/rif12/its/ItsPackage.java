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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.rif12.its.ItsFactory
 * @model kind="package"
 * @generated
 */
public interface ItsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "its";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/2005/11/its";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "its";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ItsPackage eINSTANCE = org.eclipse.rmf.rif12.its.impl.ItsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.DirRuleTypeImpl <em>Dir Rule Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.DirRuleTypeImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getDirRuleType()
	 * @generated
	 */
	int DIR_RULE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIR_RULE_TYPE__DIR = 0;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIR_RULE_TYPE__SELECTOR = 1;

	/**
	 * The number of structural features of the '<em>Dir Rule Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIR_RULE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.DocumentRootImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Dir Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIR_RULE = 3;

	/**
	 * The feature id for the '<em><b>Lang Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LANG_RULE = 4;

	/**
	 * The feature id for the '<em><b>Loc Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOC_NOTE = 5;

	/**
	 * The feature id for the '<em><b>Loc Note Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOC_NOTE_RULE = 6;

	/**
	 * The feature id for the '<em><b>Rb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RB = 7;

	/**
	 * The feature id for the '<em><b>Rbc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RBC = 8;

	/**
	 * The feature id for the '<em><b>Rp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RP = 9;

	/**
	 * The feature id for the '<em><b>Rt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RT = 10;

	/**
	 * The feature id for the '<em><b>Rtc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RTC = 11;

	/**
	 * The feature id for the '<em><b>Ruby</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RUBY = 12;

	/**
	 * The feature id for the '<em><b>Ruby Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RUBY_RULE = 13;

	/**
	 * The feature id for the '<em><b>Ruby Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RUBY_TEXT = 14;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RULES = 15;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPAN = 16;

	/**
	 * The feature id for the '<em><b>Term Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TERM_RULE = 17;

	/**
	 * The feature id for the '<em><b>Translate Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSLATE_RULE = 18;

	/**
	 * The feature id for the '<em><b>Within Text Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WITHIN_TEXT_RULE = 19;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.ItsLocNoteContentImpl <em>Loc Note Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.ItsLocNoteContentImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getItsLocNoteContent()
	 * @generated
	 */
	int ITS_LOC_NOTE_CONTENT = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_LOC_NOTE_CONTENT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_LOC_NOTE_CONTENT__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Ruby</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_LOC_NOTE_CONTENT__RUBY = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_LOC_NOTE_CONTENT__SPAN = 3;

	/**
	 * The number of structural features of the '<em>Loc Note Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_LOC_NOTE_CONTENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.ItsLocNoteRuleContentImpl <em>Loc Note Rule Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.ItsLocNoteRuleContentImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getItsLocNoteRuleContent()
	 * @generated
	 */
	int ITS_LOC_NOTE_RULE_CONTENT = 3;

	/**
	 * The feature id for the '<em><b>Loc Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_LOC_NOTE_RULE_CONTENT__LOC_NOTE = 0;

	/**
	 * The number of structural features of the '<em>Loc Note Rule Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_LOC_NOTE_RULE_CONTENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.ItsRbcContentImpl <em>Rbc Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.ItsRbcContentImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getItsRbcContent()
	 * @generated
	 */
	int ITS_RBC_CONTENT = 4;

	/**
	 * The feature id for the '<em><b>Rb</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RBC_CONTENT__RB = 0;

	/**
	 * The number of structural features of the '<em>Rbc Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RBC_CONTENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.ItsRbContentImpl <em>Rb Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.ItsRbContentImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getItsRbContent()
	 * @generated
	 */
	int ITS_RB_CONTENT = 5;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RB_CONTENT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RB_CONTENT__SPAN = 1;

	/**
	 * The number of structural features of the '<em>Rb Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RB_CONTENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.ItsRtcContentImpl <em>Rtc Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.ItsRtcContentImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getItsRtcContent()
	 * @generated
	 */
	int ITS_RTC_CONTENT = 6;

	/**
	 * The feature id for the '<em><b>Rt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RTC_CONTENT__RT = 0;

	/**
	 * The number of structural features of the '<em>Rtc Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RTC_CONTENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.ItsRtContentImpl <em>Rt Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.ItsRtContentImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getItsRtContent()
	 * @generated
	 */
	int ITS_RT_CONTENT = 7;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RT_CONTENT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RT_CONTENT__SPAN = 1;

	/**
	 * The number of structural features of the '<em>Rt Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RT_CONTENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.ItsRubyContentImpl <em>Ruby Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.ItsRubyContentImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getItsRubyContent()
	 * @generated
	 */
	int ITS_RUBY_CONTENT = 8;

	/**
	 * The feature id for the '<em><b>Rb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RUBY_CONTENT__RB = 0;

	/**
	 * The feature id for the '<em><b>Rt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RUBY_CONTENT__RT = 1;

	/**
	 * The feature id for the '<em><b>Rp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RUBY_CONTENT__RP = 2;

	/**
	 * The feature id for the '<em><b>Rt1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RUBY_CONTENT__RT1 = 3;

	/**
	 * The feature id for the '<em><b>Rp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RUBY_CONTENT__RP1 = 4;

	/**
	 * The feature id for the '<em><b>Rbc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RUBY_CONTENT__RBC = 5;

	/**
	 * The feature id for the '<em><b>Rtc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RUBY_CONTENT__RTC = 6;

	/**
	 * The feature id for the '<em><b>Rtc1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RUBY_CONTENT__RTC1 = 7;

	/**
	 * The number of structural features of the '<em>Ruby Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RUBY_CONTENT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.ItsRubyRuleContentImpl <em>Ruby Rule Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.ItsRubyRuleContentImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getItsRubyRuleContent()
	 * @generated
	 */
	int ITS_RUBY_RULE_CONTENT = 9;

	/**
	 * The feature id for the '<em><b>Ruby Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RUBY_RULE_CONTENT__RUBY_TEXT = 0;

	/**
	 * The number of structural features of the '<em>Ruby Rule Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RUBY_RULE_CONTENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.ItsRulesContentImpl <em>Rules Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.ItsRulesContentImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getItsRulesContent()
	 * @generated
	 */
	int ITS_RULES_CONTENT = 10;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RULES_CONTENT__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Translate Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RULES_CONTENT__TRANSLATE_RULE = 1;

	/**
	 * The feature id for the '<em><b>Loc Note Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RULES_CONTENT__LOC_NOTE_RULE = 2;

	/**
	 * The feature id for the '<em><b>Term Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RULES_CONTENT__TERM_RULE = 3;

	/**
	 * The feature id for the '<em><b>Dir Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RULES_CONTENT__DIR_RULE = 4;

	/**
	 * The feature id for the '<em><b>Ruby Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RULES_CONTENT__RUBY_RULE = 5;

	/**
	 * The feature id for the '<em><b>Lang Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RULES_CONTENT__LANG_RULE = 6;

	/**
	 * The feature id for the '<em><b>Within Text Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RULES_CONTENT__WITHIN_TEXT_RULE = 7;

	/**
	 * The number of structural features of the '<em>Rules Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_RULES_CONTENT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.ItsSpanContentImpl <em>Span Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.ItsSpanContentImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getItsSpanContent()
	 * @generated
	 */
	int ITS_SPAN_CONTENT = 11;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_SPAN_CONTENT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_SPAN_CONTENT__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Ruby</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_SPAN_CONTENT__RUBY = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_SPAN_CONTENT__SPAN = 3;

	/**
	 * The number of structural features of the '<em>Span Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITS_SPAN_CONTENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.LangRuleTypeImpl <em>Lang Rule Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.LangRuleTypeImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getLangRuleType()
	 * @generated
	 */
	int LANG_RULE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Lang Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_RULE_TYPE__LANG_POINTER = 0;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_RULE_TYPE__SELECTOR = 1;

	/**
	 * The number of structural features of the '<em>Lang Rule Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANG_RULE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.LocNoteRuleTypeImpl <em>Loc Note Rule Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.LocNoteRuleTypeImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getLocNoteRuleType()
	 * @generated
	 */
	int LOC_NOTE_RULE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Loc Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOC_NOTE_RULE_TYPE__LOC_NOTE = ITS_LOC_NOTE_RULE_CONTENT__LOC_NOTE;

	/**
	 * The feature id for the '<em><b>Loc Note Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOC_NOTE_RULE_TYPE__LOC_NOTE_POINTER = ITS_LOC_NOTE_RULE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loc Note Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOC_NOTE_RULE_TYPE__LOC_NOTE_REF = ITS_LOC_NOTE_RULE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Loc Note Ref Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOC_NOTE_RULE_TYPE__LOC_NOTE_REF_POINTER = ITS_LOC_NOTE_RULE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Loc Note Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOC_NOTE_RULE_TYPE__LOC_NOTE_TYPE = ITS_LOC_NOTE_RULE_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOC_NOTE_RULE_TYPE__SELECTOR = ITS_LOC_NOTE_RULE_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Loc Note Rule Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOC_NOTE_RULE_TYPE_FEATURE_COUNT = ITS_LOC_NOTE_RULE_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.LocNoteTypeImpl <em>Loc Note Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.LocNoteTypeImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getLocNoteType()
	 * @generated
	 */
	int LOC_NOTE_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOC_NOTE_TYPE__MIXED = ITS_LOC_NOTE_CONTENT__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOC_NOTE_TYPE__GROUP = ITS_LOC_NOTE_CONTENT__GROUP;

	/**
	 * The feature id for the '<em><b>Ruby</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOC_NOTE_TYPE__RUBY = ITS_LOC_NOTE_CONTENT__RUBY;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOC_NOTE_TYPE__SPAN = ITS_LOC_NOTE_CONTENT__SPAN;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOC_NOTE_TYPE__DIR = ITS_LOC_NOTE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loc Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOC_NOTE_TYPE__LOC_NOTE = ITS_LOC_NOTE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Loc Note Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOC_NOTE_TYPE__LOC_NOTE_REF = ITS_LOC_NOTE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Loc Note Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOC_NOTE_TYPE__LOC_NOTE_TYPE = ITS_LOC_NOTE_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOC_NOTE_TYPE__TERM = ITS_LOC_NOTE_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Term Info Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOC_NOTE_TYPE__TERM_INFO_REF = ITS_LOC_NOTE_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Translate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOC_NOTE_TYPE__TRANSLATE = ITS_LOC_NOTE_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Loc Note Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOC_NOTE_TYPE_FEATURE_COUNT = ITS_LOC_NOTE_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.RbcTypeImpl <em>Rbc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.RbcTypeImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getRbcType()
	 * @generated
	 */
	int RBC_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Rb</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBC_TYPE__RB = ITS_RBC_CONTENT__RB;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBC_TYPE__DIR = ITS_RBC_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loc Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBC_TYPE__LOC_NOTE = ITS_RBC_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Loc Note Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBC_TYPE__LOC_NOTE_REF = ITS_RBC_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Loc Note Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBC_TYPE__LOC_NOTE_TYPE = ITS_RBC_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBC_TYPE__TERM = ITS_RBC_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Term Info Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBC_TYPE__TERM_INFO_REF = ITS_RBC_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Translate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBC_TYPE__TRANSLATE = ITS_RBC_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Rbc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RBC_TYPE_FEATURE_COUNT = ITS_RBC_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.RbTypeImpl <em>Rb Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.RbTypeImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getRbType()
	 * @generated
	 */
	int RB_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RB_TYPE__MIXED = ITS_RB_CONTENT__MIXED;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RB_TYPE__SPAN = ITS_RB_CONTENT__SPAN;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RB_TYPE__DIR = ITS_RB_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loc Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RB_TYPE__LOC_NOTE = ITS_RB_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Loc Note Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RB_TYPE__LOC_NOTE_REF = ITS_RB_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Loc Note Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RB_TYPE__LOC_NOTE_TYPE = ITS_RB_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RB_TYPE__TERM = ITS_RB_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Term Info Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RB_TYPE__TERM_INFO_REF = ITS_RB_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Translate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RB_TYPE__TRANSLATE = ITS_RB_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Rb Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RB_TYPE_FEATURE_COUNT = ITS_RB_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.RpTypeImpl <em>Rp Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.RpTypeImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getRpType()
	 * @generated
	 */
	int RP_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RP_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RP_TYPE__DIR = 1;

	/**
	 * The feature id for the '<em><b>Loc Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RP_TYPE__LOC_NOTE = 2;

	/**
	 * The feature id for the '<em><b>Loc Note Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RP_TYPE__LOC_NOTE_REF = 3;

	/**
	 * The feature id for the '<em><b>Loc Note Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RP_TYPE__LOC_NOTE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RP_TYPE__TERM = 5;

	/**
	 * The feature id for the '<em><b>Term Info Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RP_TYPE__TERM_INFO_REF = 6;

	/**
	 * The feature id for the '<em><b>Translate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RP_TYPE__TRANSLATE = 7;

	/**
	 * The number of structural features of the '<em>Rp Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RP_TYPE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.RtcTypeImpl <em>Rtc Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.RtcTypeImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getRtcType()
	 * @generated
	 */
	int RTC_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Rt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTC_TYPE__RT = ITS_RTC_CONTENT__RT;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTC_TYPE__DIR = ITS_RTC_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loc Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTC_TYPE__LOC_NOTE = ITS_RTC_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Loc Note Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTC_TYPE__LOC_NOTE_REF = ITS_RTC_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Loc Note Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTC_TYPE__LOC_NOTE_TYPE = ITS_RTC_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTC_TYPE__TERM = ITS_RTC_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Term Info Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTC_TYPE__TERM_INFO_REF = ITS_RTC_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Translate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTC_TYPE__TRANSLATE = ITS_RTC_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Rtc Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTC_TYPE_FEATURE_COUNT = ITS_RTC_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.RtTypeImpl <em>Rt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.RtTypeImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getRtType()
	 * @generated
	 */
	int RT_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_TYPE__MIXED = ITS_RT_CONTENT__MIXED;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_TYPE__SPAN = ITS_RT_CONTENT__SPAN;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_TYPE__DIR = ITS_RT_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loc Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_TYPE__LOC_NOTE = ITS_RT_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Loc Note Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_TYPE__LOC_NOTE_REF = ITS_RT_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Loc Note Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_TYPE__LOC_NOTE_TYPE = ITS_RT_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rbspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_TYPE__RBSPAN = ITS_RT_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_TYPE__TERM = ITS_RT_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Term Info Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_TYPE__TERM_INFO_REF = ITS_RT_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Translate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_TYPE__TRANSLATE = ITS_RT_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Rt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RT_TYPE_FEATURE_COUNT = ITS_RT_CONTENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.RubyRuleTypeImpl <em>Ruby Rule Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.RubyRuleTypeImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getRubyRuleType()
	 * @generated
	 */
	int RUBY_RULE_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Ruby Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_RULE_TYPE__RUBY_TEXT = ITS_RUBY_RULE_CONTENT__RUBY_TEXT;

	/**
	 * The feature id for the '<em><b>Rbc Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_RULE_TYPE__RBC_POINTER = ITS_RUBY_RULE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rbspan Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_RULE_TYPE__RBSPAN_POINTER = ITS_RUBY_RULE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rp Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_RULE_TYPE__RP_POINTER = ITS_RUBY_RULE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rtc Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_RULE_TYPE__RTC_POINTER = ITS_RUBY_RULE_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rt Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_RULE_TYPE__RT_POINTER = ITS_RUBY_RULE_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ruby Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_RULE_TYPE__RUBY_POINTER = ITS_RUBY_RULE_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_RULE_TYPE__SELECTOR = ITS_RUBY_RULE_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Ruby Rule Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_RULE_TYPE_FEATURE_COUNT = ITS_RUBY_RULE_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.RubyTextTypeImpl <em>Ruby Text Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.RubyTextTypeImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getRubyTextType()
	 * @generated
	 */
	int RUBY_TEXT_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_TEXT_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_TEXT_TYPE__DIR = 1;

	/**
	 * The feature id for the '<em><b>Loc Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_TEXT_TYPE__LOC_NOTE = 2;

	/**
	 * The feature id for the '<em><b>Loc Note Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_TEXT_TYPE__LOC_NOTE_REF = 3;

	/**
	 * The feature id for the '<em><b>Loc Note Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_TEXT_TYPE__LOC_NOTE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Rbspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_TEXT_TYPE__RBSPAN = 5;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_TEXT_TYPE__TERM = 6;

	/**
	 * The feature id for the '<em><b>Term Info Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_TEXT_TYPE__TERM_INFO_REF = 7;

	/**
	 * The feature id for the '<em><b>Translate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_TEXT_TYPE__TRANSLATE = 8;

	/**
	 * The number of structural features of the '<em>Ruby Text Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_TEXT_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.RubyTypeImpl <em>Ruby Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.RubyTypeImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getRubyType()
	 * @generated
	 */
	int RUBY_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Rb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_TYPE__RB = ITS_RUBY_CONTENT__RB;

	/**
	 * The feature id for the '<em><b>Rt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_TYPE__RT = ITS_RUBY_CONTENT__RT;

	/**
	 * The feature id for the '<em><b>Rp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_TYPE__RP = ITS_RUBY_CONTENT__RP;

	/**
	 * The feature id for the '<em><b>Rt1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_TYPE__RT1 = ITS_RUBY_CONTENT__RT1;

	/**
	 * The feature id for the '<em><b>Rp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_TYPE__RP1 = ITS_RUBY_CONTENT__RP1;

	/**
	 * The feature id for the '<em><b>Rbc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_TYPE__RBC = ITS_RUBY_CONTENT__RBC;

	/**
	 * The feature id for the '<em><b>Rtc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_TYPE__RTC = ITS_RUBY_CONTENT__RTC;

	/**
	 * The feature id for the '<em><b>Rtc1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_TYPE__RTC1 = ITS_RUBY_CONTENT__RTC1;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_TYPE__DIR = ITS_RUBY_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loc Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_TYPE__LOC_NOTE = ITS_RUBY_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Loc Note Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_TYPE__LOC_NOTE_REF = ITS_RUBY_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Loc Note Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_TYPE__LOC_NOTE_TYPE = ITS_RUBY_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_TYPE__TERM = ITS_RUBY_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Term Info Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_TYPE__TERM_INFO_REF = ITS_RUBY_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Translate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_TYPE__TRANSLATE = ITS_RUBY_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Ruby Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUBY_TYPE_FEATURE_COUNT = ITS_RUBY_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.RulesTypeImpl <em>Rules Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.RulesTypeImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getRulesType()
	 * @generated
	 */
	int RULES_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_TYPE__GROUP = ITS_RULES_CONTENT__GROUP;

	/**
	 * The feature id for the '<em><b>Translate Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_TYPE__TRANSLATE_RULE = ITS_RULES_CONTENT__TRANSLATE_RULE;

	/**
	 * The feature id for the '<em><b>Loc Note Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_TYPE__LOC_NOTE_RULE = ITS_RULES_CONTENT__LOC_NOTE_RULE;

	/**
	 * The feature id for the '<em><b>Term Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_TYPE__TERM_RULE = ITS_RULES_CONTENT__TERM_RULE;

	/**
	 * The feature id for the '<em><b>Dir Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_TYPE__DIR_RULE = ITS_RULES_CONTENT__DIR_RULE;

	/**
	 * The feature id for the '<em><b>Ruby Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_TYPE__RUBY_RULE = ITS_RULES_CONTENT__RUBY_RULE;

	/**
	 * The feature id for the '<em><b>Lang Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_TYPE__LANG_RULE = ITS_RULES_CONTENT__LANG_RULE;

	/**
	 * The feature id for the '<em><b>Within Text Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_TYPE__WITHIN_TEXT_RULE = ITS_RULES_CONTENT__WITHIN_TEXT_RULE;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_TYPE__HREF = ITS_RULES_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_TYPE__TYPE = ITS_RULES_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_TYPE__VERSION = ITS_RULES_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rules Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULES_TYPE_FEATURE_COUNT = ITS_RULES_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.SpanTypeImpl <em>Span Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.SpanTypeImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getSpanType()
	 * @generated
	 */
	int SPAN_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__MIXED = ITS_SPAN_CONTENT__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__GROUP = ITS_SPAN_CONTENT__GROUP;

	/**
	 * The feature id for the '<em><b>Ruby</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__RUBY = ITS_SPAN_CONTENT__RUBY;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__SPAN = ITS_SPAN_CONTENT__SPAN;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__DIR = ITS_SPAN_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loc Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__LOC_NOTE = ITS_SPAN_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Loc Note Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__LOC_NOTE_REF = ITS_SPAN_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Loc Note Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__LOC_NOTE_TYPE = ITS_SPAN_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__TERM = ITS_SPAN_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Term Info Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__TERM_INFO_REF = ITS_SPAN_CONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Translate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__TRANSLATE = ITS_SPAN_CONTENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Span Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE_FEATURE_COUNT = ITS_SPAN_CONTENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.TermRuleTypeImpl <em>Term Rule Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.TermRuleTypeImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getTermRuleType()
	 * @generated
	 */
	int TERM_RULE_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_RULE_TYPE__SELECTOR = 0;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_RULE_TYPE__TERM = 1;

	/**
	 * The feature id for the '<em><b>Term Info Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_RULE_TYPE__TERM_INFO_POINTER = 2;

	/**
	 * The feature id for the '<em><b>Term Info Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_RULE_TYPE__TERM_INFO_REF = 3;

	/**
	 * The feature id for the '<em><b>Term Info Ref Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_RULE_TYPE__TERM_INFO_REF_POINTER = 4;

	/**
	 * The number of structural features of the '<em>Term Rule Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_RULE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.TranslateRuleTypeImpl <em>Translate Rule Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.TranslateRuleTypeImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getTranslateRuleType()
	 * @generated
	 */
	int TRANSLATE_RULE_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE_RULE_TYPE__SELECTOR = 0;

	/**
	 * The feature id for the '<em><b>Translate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE_RULE_TYPE__TRANSLATE = 1;

	/**
	 * The number of structural features of the '<em>Translate Rule Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSLATE_RULE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.impl.WithinTextRuleTypeImpl <em>Within Text Rule Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.impl.WithinTextRuleTypeImpl
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getWithinTextRuleType()
	 * @generated
	 */
	int WITHIN_TEXT_RULE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN_TEXT_RULE_TYPE__SELECTOR = 0;

	/**
	 * The feature id for the '<em><b>Within Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN_TEXT_RULE_TYPE__WITHIN_TEXT = 1;

	/**
	 * The number of structural features of the '<em>Within Text Rule Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITHIN_TEXT_RULE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.DirType <em>Dir Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.DirType
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getDirType()
	 * @generated
	 */
	int DIR_TYPE = 28;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.DirType1 <em>Dir Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.DirType1
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getDirType1()
	 * @generated
	 */
	int DIR_TYPE1 = 29;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.DirType2 <em>Dir Type2</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.DirType2
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getDirType2()
	 * @generated
	 */
	int DIR_TYPE2 = 30;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.LocNoteTypeType <em>Loc Note Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.LocNoteTypeType
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getLocNoteTypeType()
	 * @generated
	 */
	int LOC_NOTE_TYPE_TYPE = 31;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.LocNoteTypeType1 <em>Loc Note Type Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.LocNoteTypeType1
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getLocNoteTypeType1()
	 * @generated
	 */
	int LOC_NOTE_TYPE_TYPE1 = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.TermType <em>Term Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.TermType
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getTermType()
	 * @generated
	 */
	int TERM_TYPE = 33;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.TermType1 <em>Term Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.TermType1
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getTermType1()
	 * @generated
	 */
	int TERM_TYPE1 = 34;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.TranslateType <em>Translate Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.TranslateType
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getTranslateType()
	 * @generated
	 */
	int TRANSLATE_TYPE = 35;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.TranslateType1 <em>Translate Type1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.TranslateType1
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getTranslateType1()
	 * @generated
	 */
	int TRANSLATE_TYPE1 = 36;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.its.WithinTextType <em>Within Text Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.WithinTextType
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getWithinTextType()
	 * @generated
	 */
	int WITHIN_TEXT_TYPE = 37;

	/**
	 * The meta object id for the '<em>Dir Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.DirType1
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getDirTypeObject()
	 * @generated
	 */
	int DIR_TYPE_OBJECT = 38;

	/**
	 * The meta object id for the '<em>Dir Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.DirType
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getDirTypeObject1()
	 * @generated
	 */
	int DIR_TYPE_OBJECT1 = 39;

	/**
	 * The meta object id for the '<em>Dir Type Object2</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.DirType2
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getDirTypeObject2()
	 * @generated
	 */
	int DIR_TYPE_OBJECT2 = 40;

	/**
	 * The meta object id for the '<em>Loc Note Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.LocNoteTypeType
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getLocNoteTypeTypeObject()
	 * @generated
	 */
	int LOC_NOTE_TYPE_TYPE_OBJECT = 41;

	/**
	 * The meta object id for the '<em>Loc Note Type Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.LocNoteTypeType1
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getLocNoteTypeTypeObject1()
	 * @generated
	 */
	int LOC_NOTE_TYPE_TYPE_OBJECT1 = 42;

	/**
	 * The meta object id for the '<em>Term Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.TermType
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getTermTypeObject()
	 * @generated
	 */
	int TERM_TYPE_OBJECT = 43;

	/**
	 * The meta object id for the '<em>Term Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.TermType1
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getTermTypeObject1()
	 * @generated
	 */
	int TERM_TYPE_OBJECT1 = 44;

	/**
	 * The meta object id for the '<em>Translate Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.TranslateType
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getTranslateTypeObject()
	 * @generated
	 */
	int TRANSLATE_TYPE_OBJECT = 45;

	/**
	 * The meta object id for the '<em>Translate Type Object1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.TranslateType1
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getTranslateTypeObject1()
	 * @generated
	 */
	int TRANSLATE_TYPE_OBJECT1 = 46;

	/**
	 * The meta object id for the '<em>Within Text Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.its.WithinTextType
	 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getWithinTextTypeObject()
	 * @generated
	 */
	int WITHIN_TEXT_TYPE_OBJECT = 47;


	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.DirRuleType <em>Dir Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dir Rule Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.DirRuleType
	 * @generated
	 */
	EClass getDirRuleType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.DirRuleType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.eclipse.rmf.rif12.its.DirRuleType#getDir()
	 * @see #getDirRuleType()
	 * @generated
	 */
	EAttribute getDirRuleType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.DirRuleType#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selector</em>'.
	 * @see org.eclipse.rmf.rif12.its.DirRuleType#getSelector()
	 * @see #getDirRuleType()
	 * @generated
	 */
	EAttribute getDirRuleType_Selector();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.rmf.rif12.its.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.rif12.its.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.rmf.rif12.its.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.rmf.rif12.its.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getDirRule <em>Dir Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dir Rule</em>'.
	 * @see org.eclipse.rmf.rif12.its.DocumentRoot#getDirRule()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DirRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getLangRule <em>Lang Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lang Rule</em>'.
	 * @see org.eclipse.rmf.rif12.its.DocumentRoot#getLangRule()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LangRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getLocNote <em>Loc Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loc Note</em>'.
	 * @see org.eclipse.rmf.rif12.its.DocumentRoot#getLocNote()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LocNote();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getLocNoteRule <em>Loc Note Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loc Note Rule</em>'.
	 * @see org.eclipse.rmf.rif12.its.DocumentRoot#getLocNoteRule()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LocNoteRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRb <em>Rb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rb</em>'.
	 * @see org.eclipse.rmf.rif12.its.DocumentRoot#getRb()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Rb();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRbc <em>Rbc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rbc</em>'.
	 * @see org.eclipse.rmf.rif12.its.DocumentRoot#getRbc()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Rbc();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRp <em>Rp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rp</em>'.
	 * @see org.eclipse.rmf.rif12.its.DocumentRoot#getRp()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Rp();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRt <em>Rt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rt</em>'.
	 * @see org.eclipse.rmf.rif12.its.DocumentRoot#getRt()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Rt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRtc <em>Rtc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtc</em>'.
	 * @see org.eclipse.rmf.rif12.its.DocumentRoot#getRtc()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Rtc();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRuby <em>Ruby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ruby</em>'.
	 * @see org.eclipse.rmf.rif12.its.DocumentRoot#getRuby()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Ruby();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRubyRule <em>Ruby Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ruby Rule</em>'.
	 * @see org.eclipse.rmf.rif12.its.DocumentRoot#getRubyRule()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RubyRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRubyText <em>Ruby Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ruby Text</em>'.
	 * @see org.eclipse.rmf.rif12.its.DocumentRoot#getRubyText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RubyText();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rules</em>'.
	 * @see org.eclipse.rmf.rif12.its.DocumentRoot#getRules()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Rules();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Span</em>'.
	 * @see org.eclipse.rmf.rif12.its.DocumentRoot#getSpan()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Span();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getTermRule <em>Term Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Term Rule</em>'.
	 * @see org.eclipse.rmf.rif12.its.DocumentRoot#getTermRule()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TermRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getTranslateRule <em>Translate Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Translate Rule</em>'.
	 * @see org.eclipse.rmf.rif12.its.DocumentRoot#getTranslateRule()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TranslateRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.DocumentRoot#getWithinTextRule <em>Within Text Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Within Text Rule</em>'.
	 * @see org.eclipse.rmf.rif12.its.DocumentRoot#getWithinTextRule()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WithinTextRule();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.ItsLocNoteContent <em>Loc Note Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loc Note Content</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsLocNoteContent
	 * @generated
	 */
	EClass getItsLocNoteContent();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif12.its.ItsLocNoteContent#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsLocNoteContent#getMixed()
	 * @see #getItsLocNoteContent()
	 * @generated
	 */
	EAttribute getItsLocNoteContent_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif12.its.ItsLocNoteContent#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsLocNoteContent#getGroup()
	 * @see #getItsLocNoteContent()
	 * @generated
	 */
	EAttribute getItsLocNoteContent_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.its.ItsLocNoteContent#getRuby <em>Ruby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ruby</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsLocNoteContent#getRuby()
	 * @see #getItsLocNoteContent()
	 * @generated
	 */
	EReference getItsLocNoteContent_Ruby();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.its.ItsLocNoteContent#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsLocNoteContent#getSpan()
	 * @see #getItsLocNoteContent()
	 * @generated
	 */
	EReference getItsLocNoteContent_Span();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.ItsLocNoteRuleContent <em>Loc Note Rule Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loc Note Rule Content</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsLocNoteRuleContent
	 * @generated
	 */
	EClass getItsLocNoteRuleContent();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.ItsLocNoteRuleContent#getLocNote <em>Loc Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loc Note</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsLocNoteRuleContent#getLocNote()
	 * @see #getItsLocNoteRuleContent()
	 * @generated
	 */
	EReference getItsLocNoteRuleContent_LocNote();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.ItsRbcContent <em>Rbc Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rbc Content</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRbcContent
	 * @generated
	 */
	EClass getItsRbcContent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.its.ItsRbcContent#getRb <em>Rb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rb</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRbcContent#getRb()
	 * @see #getItsRbcContent()
	 * @generated
	 */
	EReference getItsRbcContent_Rb();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.ItsRbContent <em>Rb Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rb Content</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRbContent
	 * @generated
	 */
	EClass getItsRbContent();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif12.its.ItsRbContent#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRbContent#getMixed()
	 * @see #getItsRbContent()
	 * @generated
	 */
	EAttribute getItsRbContent_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.its.ItsRbContent#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRbContent#getSpan()
	 * @see #getItsRbContent()
	 * @generated
	 */
	EReference getItsRbContent_Span();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.ItsRtcContent <em>Rtc Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtc Content</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRtcContent
	 * @generated
	 */
	EClass getItsRtcContent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.its.ItsRtcContent#getRt <em>Rt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rt</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRtcContent#getRt()
	 * @see #getItsRtcContent()
	 * @generated
	 */
	EReference getItsRtcContent_Rt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.ItsRtContent <em>Rt Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rt Content</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRtContent
	 * @generated
	 */
	EClass getItsRtContent();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif12.its.ItsRtContent#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRtContent#getMixed()
	 * @see #getItsRtContent()
	 * @generated
	 */
	EAttribute getItsRtContent_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.its.ItsRtContent#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRtContent#getSpan()
	 * @see #getItsRtContent()
	 * @generated
	 */
	EReference getItsRtContent_Span();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.ItsRubyContent <em>Ruby Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ruby Content</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRubyContent
	 * @generated
	 */
	EClass getItsRubyContent();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.ItsRubyContent#getRb <em>Rb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rb</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRubyContent#getRb()
	 * @see #getItsRubyContent()
	 * @generated
	 */
	EReference getItsRubyContent_Rb();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.ItsRubyContent#getRt <em>Rt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rt</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRubyContent#getRt()
	 * @see #getItsRubyContent()
	 * @generated
	 */
	EReference getItsRubyContent_Rt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.ItsRubyContent#getRp <em>Rp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rp</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRubyContent#getRp()
	 * @see #getItsRubyContent()
	 * @generated
	 */
	EReference getItsRubyContent_Rp();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.ItsRubyContent#getRt1 <em>Rt1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rt1</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRubyContent#getRt1()
	 * @see #getItsRubyContent()
	 * @generated
	 */
	EReference getItsRubyContent_Rt1();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.ItsRubyContent#getRp1 <em>Rp1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rp1</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRubyContent#getRp1()
	 * @see #getItsRubyContent()
	 * @generated
	 */
	EReference getItsRubyContent_Rp1();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.ItsRubyContent#getRbc <em>Rbc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rbc</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRubyContent#getRbc()
	 * @see #getItsRubyContent()
	 * @generated
	 */
	EReference getItsRubyContent_Rbc();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.ItsRubyContent#getRtc <em>Rtc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtc</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRubyContent#getRtc()
	 * @see #getItsRubyContent()
	 * @generated
	 */
	EReference getItsRubyContent_Rtc();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.ItsRubyContent#getRtc1 <em>Rtc1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rtc1</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRubyContent#getRtc1()
	 * @see #getItsRubyContent()
	 * @generated
	 */
	EReference getItsRubyContent_Rtc1();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.ItsRubyRuleContent <em>Ruby Rule Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ruby Rule Content</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRubyRuleContent
	 * @generated
	 */
	EClass getItsRubyRuleContent();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.its.ItsRubyRuleContent#getRubyText <em>Ruby Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ruby Text</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRubyRuleContent#getRubyText()
	 * @see #getItsRubyRuleContent()
	 * @generated
	 */
	EReference getItsRubyRuleContent_RubyText();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.ItsRulesContent <em>Rules Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rules Content</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRulesContent
	 * @generated
	 */
	EClass getItsRulesContent();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif12.its.ItsRulesContent#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRulesContent#getGroup()
	 * @see #getItsRulesContent()
	 * @generated
	 */
	EAttribute getItsRulesContent_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.its.ItsRulesContent#getTranslateRule <em>Translate Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Translate Rule</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRulesContent#getTranslateRule()
	 * @see #getItsRulesContent()
	 * @generated
	 */
	EReference getItsRulesContent_TranslateRule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.its.ItsRulesContent#getLocNoteRule <em>Loc Note Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loc Note Rule</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRulesContent#getLocNoteRule()
	 * @see #getItsRulesContent()
	 * @generated
	 */
	EReference getItsRulesContent_LocNoteRule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.its.ItsRulesContent#getTermRule <em>Term Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Term Rule</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRulesContent#getTermRule()
	 * @see #getItsRulesContent()
	 * @generated
	 */
	EReference getItsRulesContent_TermRule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.its.ItsRulesContent#getDirRule <em>Dir Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dir Rule</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRulesContent#getDirRule()
	 * @see #getItsRulesContent()
	 * @generated
	 */
	EReference getItsRulesContent_DirRule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.its.ItsRulesContent#getRubyRule <em>Ruby Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ruby Rule</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRulesContent#getRubyRule()
	 * @see #getItsRulesContent()
	 * @generated
	 */
	EReference getItsRulesContent_RubyRule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.its.ItsRulesContent#getLangRule <em>Lang Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lang Rule</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRulesContent#getLangRule()
	 * @see #getItsRulesContent()
	 * @generated
	 */
	EReference getItsRulesContent_LangRule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.its.ItsRulesContent#getWithinTextRule <em>Within Text Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Within Text Rule</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsRulesContent#getWithinTextRule()
	 * @see #getItsRulesContent()
	 * @generated
	 */
	EReference getItsRulesContent_WithinTextRule();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.ItsSpanContent <em>Span Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Span Content</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsSpanContent
	 * @generated
	 */
	EClass getItsSpanContent();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif12.its.ItsSpanContent#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsSpanContent#getMixed()
	 * @see #getItsSpanContent()
	 * @generated
	 */
	EAttribute getItsSpanContent_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif12.its.ItsSpanContent#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsSpanContent#getGroup()
	 * @see #getItsSpanContent()
	 * @generated
	 */
	EAttribute getItsSpanContent_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.its.ItsSpanContent#getRuby <em>Ruby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ruby</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsSpanContent#getRuby()
	 * @see #getItsSpanContent()
	 * @generated
	 */
	EReference getItsSpanContent_Ruby();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.its.ItsSpanContent#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.rif12.its.ItsSpanContent#getSpan()
	 * @see #getItsSpanContent()
	 * @generated
	 */
	EReference getItsSpanContent_Span();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.LangRuleType <em>Lang Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lang Rule Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.LangRuleType
	 * @generated
	 */
	EClass getLangRuleType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.LangRuleType#getLangPointer <em>Lang Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang Pointer</em>'.
	 * @see org.eclipse.rmf.rif12.its.LangRuleType#getLangPointer()
	 * @see #getLangRuleType()
	 * @generated
	 */
	EAttribute getLangRuleType_LangPointer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.LangRuleType#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selector</em>'.
	 * @see org.eclipse.rmf.rif12.its.LangRuleType#getSelector()
	 * @see #getLangRuleType()
	 * @generated
	 */
	EAttribute getLangRuleType_Selector();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.LocNoteRuleType <em>Loc Note Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loc Note Rule Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.LocNoteRuleType
	 * @generated
	 */
	EClass getLocNoteRuleType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.LocNoteRuleType#getLocNotePointer <em>Loc Note Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note Pointer</em>'.
	 * @see org.eclipse.rmf.rif12.its.LocNoteRuleType#getLocNotePointer()
	 * @see #getLocNoteRuleType()
	 * @generated
	 */
	EAttribute getLocNoteRuleType_LocNotePointer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.LocNoteRuleType#getLocNoteRef <em>Loc Note Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note Ref</em>'.
	 * @see org.eclipse.rmf.rif12.its.LocNoteRuleType#getLocNoteRef()
	 * @see #getLocNoteRuleType()
	 * @generated
	 */
	EAttribute getLocNoteRuleType_LocNoteRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.LocNoteRuleType#getLocNoteRefPointer <em>Loc Note Ref Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note Ref Pointer</em>'.
	 * @see org.eclipse.rmf.rif12.its.LocNoteRuleType#getLocNoteRefPointer()
	 * @see #getLocNoteRuleType()
	 * @generated
	 */
	EAttribute getLocNoteRuleType_LocNoteRefPointer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.LocNoteRuleType#getLocNoteType <em>Loc Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.LocNoteRuleType#getLocNoteType()
	 * @see #getLocNoteRuleType()
	 * @generated
	 */
	EAttribute getLocNoteRuleType_LocNoteType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.LocNoteRuleType#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selector</em>'.
	 * @see org.eclipse.rmf.rif12.its.LocNoteRuleType#getSelector()
	 * @see #getLocNoteRuleType()
	 * @generated
	 */
	EAttribute getLocNoteRuleType_Selector();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.LocNoteType <em>Loc Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loc Note Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.LocNoteType
	 * @generated
	 */
	EClass getLocNoteType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.LocNoteType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.eclipse.rmf.rif12.its.LocNoteType#getDir()
	 * @see #getLocNoteType()
	 * @generated
	 */
	EAttribute getLocNoteType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.LocNoteType#getLocNote <em>Loc Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note</em>'.
	 * @see org.eclipse.rmf.rif12.its.LocNoteType#getLocNote()
	 * @see #getLocNoteType()
	 * @generated
	 */
	EAttribute getLocNoteType_LocNote();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.LocNoteType#getLocNoteRef <em>Loc Note Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note Ref</em>'.
	 * @see org.eclipse.rmf.rif12.its.LocNoteType#getLocNoteRef()
	 * @see #getLocNoteType()
	 * @generated
	 */
	EAttribute getLocNoteType_LocNoteRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.LocNoteType#getLocNoteType <em>Loc Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.LocNoteType#getLocNoteType()
	 * @see #getLocNoteType()
	 * @generated
	 */
	EAttribute getLocNoteType_LocNoteType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.LocNoteType#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see org.eclipse.rmf.rif12.its.LocNoteType#getTerm()
	 * @see #getLocNoteType()
	 * @generated
	 */
	EAttribute getLocNoteType_Term();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.LocNoteType#getTermInfoRef <em>Term Info Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Info Ref</em>'.
	 * @see org.eclipse.rmf.rif12.its.LocNoteType#getTermInfoRef()
	 * @see #getLocNoteType()
	 * @generated
	 */
	EAttribute getLocNoteType_TermInfoRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.LocNoteType#getTranslate <em>Translate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translate</em>'.
	 * @see org.eclipse.rmf.rif12.its.LocNoteType#getTranslate()
	 * @see #getLocNoteType()
	 * @generated
	 */
	EAttribute getLocNoteType_Translate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.RbcType <em>Rbc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rbc Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.RbcType
	 * @generated
	 */
	EClass getRbcType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RbcType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.eclipse.rmf.rif12.its.RbcType#getDir()
	 * @see #getRbcType()
	 * @generated
	 */
	EAttribute getRbcType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RbcType#getLocNote <em>Loc Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note</em>'.
	 * @see org.eclipse.rmf.rif12.its.RbcType#getLocNote()
	 * @see #getRbcType()
	 * @generated
	 */
	EAttribute getRbcType_LocNote();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RbcType#getLocNoteRef <em>Loc Note Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note Ref</em>'.
	 * @see org.eclipse.rmf.rif12.its.RbcType#getLocNoteRef()
	 * @see #getRbcType()
	 * @generated
	 */
	EAttribute getRbcType_LocNoteRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RbcType#getLocNoteType <em>Loc Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.RbcType#getLocNoteType()
	 * @see #getRbcType()
	 * @generated
	 */
	EAttribute getRbcType_LocNoteType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RbcType#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see org.eclipse.rmf.rif12.its.RbcType#getTerm()
	 * @see #getRbcType()
	 * @generated
	 */
	EAttribute getRbcType_Term();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RbcType#getTermInfoRef <em>Term Info Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Info Ref</em>'.
	 * @see org.eclipse.rmf.rif12.its.RbcType#getTermInfoRef()
	 * @see #getRbcType()
	 * @generated
	 */
	EAttribute getRbcType_TermInfoRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RbcType#getTranslate <em>Translate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translate</em>'.
	 * @see org.eclipse.rmf.rif12.its.RbcType#getTranslate()
	 * @see #getRbcType()
	 * @generated
	 */
	EAttribute getRbcType_Translate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.RbType <em>Rb Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rb Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.RbType
	 * @generated
	 */
	EClass getRbType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RbType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.eclipse.rmf.rif12.its.RbType#getDir()
	 * @see #getRbType()
	 * @generated
	 */
	EAttribute getRbType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RbType#getLocNote <em>Loc Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note</em>'.
	 * @see org.eclipse.rmf.rif12.its.RbType#getLocNote()
	 * @see #getRbType()
	 * @generated
	 */
	EAttribute getRbType_LocNote();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RbType#getLocNoteRef <em>Loc Note Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note Ref</em>'.
	 * @see org.eclipse.rmf.rif12.its.RbType#getLocNoteRef()
	 * @see #getRbType()
	 * @generated
	 */
	EAttribute getRbType_LocNoteRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RbType#getLocNoteType <em>Loc Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.RbType#getLocNoteType()
	 * @see #getRbType()
	 * @generated
	 */
	EAttribute getRbType_LocNoteType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RbType#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see org.eclipse.rmf.rif12.its.RbType#getTerm()
	 * @see #getRbType()
	 * @generated
	 */
	EAttribute getRbType_Term();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RbType#getTermInfoRef <em>Term Info Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Info Ref</em>'.
	 * @see org.eclipse.rmf.rif12.its.RbType#getTermInfoRef()
	 * @see #getRbType()
	 * @generated
	 */
	EAttribute getRbType_TermInfoRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RbType#getTranslate <em>Translate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translate</em>'.
	 * @see org.eclipse.rmf.rif12.its.RbType#getTranslate()
	 * @see #getRbType()
	 * @generated
	 */
	EAttribute getRbType_Translate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.RpType <em>Rp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rp Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.RpType
	 * @generated
	 */
	EClass getRpType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif12.its.RpType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.rif12.its.RpType#getMixed()
	 * @see #getRpType()
	 * @generated
	 */
	EAttribute getRpType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RpType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.eclipse.rmf.rif12.its.RpType#getDir()
	 * @see #getRpType()
	 * @generated
	 */
	EAttribute getRpType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RpType#getLocNote <em>Loc Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note</em>'.
	 * @see org.eclipse.rmf.rif12.its.RpType#getLocNote()
	 * @see #getRpType()
	 * @generated
	 */
	EAttribute getRpType_LocNote();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RpType#getLocNoteRef <em>Loc Note Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note Ref</em>'.
	 * @see org.eclipse.rmf.rif12.its.RpType#getLocNoteRef()
	 * @see #getRpType()
	 * @generated
	 */
	EAttribute getRpType_LocNoteRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RpType#getLocNoteType <em>Loc Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.RpType#getLocNoteType()
	 * @see #getRpType()
	 * @generated
	 */
	EAttribute getRpType_LocNoteType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RpType#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see org.eclipse.rmf.rif12.its.RpType#getTerm()
	 * @see #getRpType()
	 * @generated
	 */
	EAttribute getRpType_Term();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RpType#getTermInfoRef <em>Term Info Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Info Ref</em>'.
	 * @see org.eclipse.rmf.rif12.its.RpType#getTermInfoRef()
	 * @see #getRpType()
	 * @generated
	 */
	EAttribute getRpType_TermInfoRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RpType#getTranslate <em>Translate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translate</em>'.
	 * @see org.eclipse.rmf.rif12.its.RpType#getTranslate()
	 * @see #getRpType()
	 * @generated
	 */
	EAttribute getRpType_Translate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.RtcType <em>Rtc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rtc Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.RtcType
	 * @generated
	 */
	EClass getRtcType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RtcType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.eclipse.rmf.rif12.its.RtcType#getDir()
	 * @see #getRtcType()
	 * @generated
	 */
	EAttribute getRtcType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RtcType#getLocNote <em>Loc Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note</em>'.
	 * @see org.eclipse.rmf.rif12.its.RtcType#getLocNote()
	 * @see #getRtcType()
	 * @generated
	 */
	EAttribute getRtcType_LocNote();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RtcType#getLocNoteRef <em>Loc Note Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note Ref</em>'.
	 * @see org.eclipse.rmf.rif12.its.RtcType#getLocNoteRef()
	 * @see #getRtcType()
	 * @generated
	 */
	EAttribute getRtcType_LocNoteRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RtcType#getLocNoteType <em>Loc Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.RtcType#getLocNoteType()
	 * @see #getRtcType()
	 * @generated
	 */
	EAttribute getRtcType_LocNoteType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RtcType#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see org.eclipse.rmf.rif12.its.RtcType#getTerm()
	 * @see #getRtcType()
	 * @generated
	 */
	EAttribute getRtcType_Term();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RtcType#getTermInfoRef <em>Term Info Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Info Ref</em>'.
	 * @see org.eclipse.rmf.rif12.its.RtcType#getTermInfoRef()
	 * @see #getRtcType()
	 * @generated
	 */
	EAttribute getRtcType_TermInfoRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RtcType#getTranslate <em>Translate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translate</em>'.
	 * @see org.eclipse.rmf.rif12.its.RtcType#getTranslate()
	 * @see #getRtcType()
	 * @generated
	 */
	EAttribute getRtcType_Translate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.RtType <em>Rt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rt Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.RtType
	 * @generated
	 */
	EClass getRtType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RtType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.eclipse.rmf.rif12.its.RtType#getDir()
	 * @see #getRtType()
	 * @generated
	 */
	EAttribute getRtType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RtType#getLocNote <em>Loc Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note</em>'.
	 * @see org.eclipse.rmf.rif12.its.RtType#getLocNote()
	 * @see #getRtType()
	 * @generated
	 */
	EAttribute getRtType_LocNote();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RtType#getLocNoteRef <em>Loc Note Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note Ref</em>'.
	 * @see org.eclipse.rmf.rif12.its.RtType#getLocNoteRef()
	 * @see #getRtType()
	 * @generated
	 */
	EAttribute getRtType_LocNoteRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RtType#getLocNoteType <em>Loc Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.RtType#getLocNoteType()
	 * @see #getRtType()
	 * @generated
	 */
	EAttribute getRtType_LocNoteType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RtType#getRbspan <em>Rbspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rbspan</em>'.
	 * @see org.eclipse.rmf.rif12.its.RtType#getRbspan()
	 * @see #getRtType()
	 * @generated
	 */
	EAttribute getRtType_Rbspan();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RtType#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see org.eclipse.rmf.rif12.its.RtType#getTerm()
	 * @see #getRtType()
	 * @generated
	 */
	EAttribute getRtType_Term();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RtType#getTermInfoRef <em>Term Info Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Info Ref</em>'.
	 * @see org.eclipse.rmf.rif12.its.RtType#getTermInfoRef()
	 * @see #getRtType()
	 * @generated
	 */
	EAttribute getRtType_TermInfoRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RtType#getTranslate <em>Translate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translate</em>'.
	 * @see org.eclipse.rmf.rif12.its.RtType#getTranslate()
	 * @see #getRtType()
	 * @generated
	 */
	EAttribute getRtType_Translate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.RubyRuleType <em>Ruby Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ruby Rule Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.RubyRuleType
	 * @generated
	 */
	EClass getRubyRuleType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RubyRuleType#getRbcPointer <em>Rbc Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rbc Pointer</em>'.
	 * @see org.eclipse.rmf.rif12.its.RubyRuleType#getRbcPointer()
	 * @see #getRubyRuleType()
	 * @generated
	 */
	EAttribute getRubyRuleType_RbcPointer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RubyRuleType#getRbspanPointer <em>Rbspan Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rbspan Pointer</em>'.
	 * @see org.eclipse.rmf.rif12.its.RubyRuleType#getRbspanPointer()
	 * @see #getRubyRuleType()
	 * @generated
	 */
	EAttribute getRubyRuleType_RbspanPointer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RubyRuleType#getRpPointer <em>Rp Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rp Pointer</em>'.
	 * @see org.eclipse.rmf.rif12.its.RubyRuleType#getRpPointer()
	 * @see #getRubyRuleType()
	 * @generated
	 */
	EAttribute getRubyRuleType_RpPointer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RubyRuleType#getRtcPointer <em>Rtc Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rtc Pointer</em>'.
	 * @see org.eclipse.rmf.rif12.its.RubyRuleType#getRtcPointer()
	 * @see #getRubyRuleType()
	 * @generated
	 */
	EAttribute getRubyRuleType_RtcPointer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RubyRuleType#getRtPointer <em>Rt Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rt Pointer</em>'.
	 * @see org.eclipse.rmf.rif12.its.RubyRuleType#getRtPointer()
	 * @see #getRubyRuleType()
	 * @generated
	 */
	EAttribute getRubyRuleType_RtPointer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RubyRuleType#getRubyPointer <em>Ruby Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ruby Pointer</em>'.
	 * @see org.eclipse.rmf.rif12.its.RubyRuleType#getRubyPointer()
	 * @see #getRubyRuleType()
	 * @generated
	 */
	EAttribute getRubyRuleType_RubyPointer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RubyRuleType#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selector</em>'.
	 * @see org.eclipse.rmf.rif12.its.RubyRuleType#getSelector()
	 * @see #getRubyRuleType()
	 * @generated
	 */
	EAttribute getRubyRuleType_Selector();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.RubyTextType <em>Ruby Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ruby Text Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.RubyTextType
	 * @generated
	 */
	EClass getRubyTextType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif12.its.RubyTextType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.rif12.its.RubyTextType#getMixed()
	 * @see #getRubyTextType()
	 * @generated
	 */
	EAttribute getRubyTextType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RubyTextType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.eclipse.rmf.rif12.its.RubyTextType#getDir()
	 * @see #getRubyTextType()
	 * @generated
	 */
	EAttribute getRubyTextType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RubyTextType#getLocNote <em>Loc Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note</em>'.
	 * @see org.eclipse.rmf.rif12.its.RubyTextType#getLocNote()
	 * @see #getRubyTextType()
	 * @generated
	 */
	EAttribute getRubyTextType_LocNote();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RubyTextType#getLocNoteRef <em>Loc Note Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note Ref</em>'.
	 * @see org.eclipse.rmf.rif12.its.RubyTextType#getLocNoteRef()
	 * @see #getRubyTextType()
	 * @generated
	 */
	EAttribute getRubyTextType_LocNoteRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RubyTextType#getLocNoteType <em>Loc Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.RubyTextType#getLocNoteType()
	 * @see #getRubyTextType()
	 * @generated
	 */
	EAttribute getRubyTextType_LocNoteType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RubyTextType#getRbspan <em>Rbspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rbspan</em>'.
	 * @see org.eclipse.rmf.rif12.its.RubyTextType#getRbspan()
	 * @see #getRubyTextType()
	 * @generated
	 */
	EAttribute getRubyTextType_Rbspan();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RubyTextType#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see org.eclipse.rmf.rif12.its.RubyTextType#getTerm()
	 * @see #getRubyTextType()
	 * @generated
	 */
	EAttribute getRubyTextType_Term();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RubyTextType#getTermInfoRef <em>Term Info Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Info Ref</em>'.
	 * @see org.eclipse.rmf.rif12.its.RubyTextType#getTermInfoRef()
	 * @see #getRubyTextType()
	 * @generated
	 */
	EAttribute getRubyTextType_TermInfoRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RubyTextType#getTranslate <em>Translate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translate</em>'.
	 * @see org.eclipse.rmf.rif12.its.RubyTextType#getTranslate()
	 * @see #getRubyTextType()
	 * @generated
	 */
	EAttribute getRubyTextType_Translate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.RubyType <em>Ruby Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ruby Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.RubyType
	 * @generated
	 */
	EClass getRubyType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RubyType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.eclipse.rmf.rif12.its.RubyType#getDir()
	 * @see #getRubyType()
	 * @generated
	 */
	EAttribute getRubyType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RubyType#getLocNote <em>Loc Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note</em>'.
	 * @see org.eclipse.rmf.rif12.its.RubyType#getLocNote()
	 * @see #getRubyType()
	 * @generated
	 */
	EAttribute getRubyType_LocNote();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RubyType#getLocNoteRef <em>Loc Note Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note Ref</em>'.
	 * @see org.eclipse.rmf.rif12.its.RubyType#getLocNoteRef()
	 * @see #getRubyType()
	 * @generated
	 */
	EAttribute getRubyType_LocNoteRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RubyType#getLocNoteType <em>Loc Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.RubyType#getLocNoteType()
	 * @see #getRubyType()
	 * @generated
	 */
	EAttribute getRubyType_LocNoteType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RubyType#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see org.eclipse.rmf.rif12.its.RubyType#getTerm()
	 * @see #getRubyType()
	 * @generated
	 */
	EAttribute getRubyType_Term();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RubyType#getTermInfoRef <em>Term Info Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Info Ref</em>'.
	 * @see org.eclipse.rmf.rif12.its.RubyType#getTermInfoRef()
	 * @see #getRubyType()
	 * @generated
	 */
	EAttribute getRubyType_TermInfoRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RubyType#getTranslate <em>Translate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translate</em>'.
	 * @see org.eclipse.rmf.rif12.its.RubyType#getTranslate()
	 * @see #getRubyType()
	 * @generated
	 */
	EAttribute getRubyType_Translate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.RulesType <em>Rules Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rules Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.RulesType
	 * @generated
	 */
	EClass getRulesType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RulesType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.eclipse.rmf.rif12.its.RulesType#getHref()
	 * @see #getRulesType()
	 * @generated
	 */
	EAttribute getRulesType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RulesType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.RulesType#getType()
	 * @see #getRulesType()
	 * @generated
	 */
	EAttribute getRulesType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.RulesType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.rmf.rif12.its.RulesType#getVersion()
	 * @see #getRulesType()
	 * @generated
	 */
	EAttribute getRulesType_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.SpanType <em>Span Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Span Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.SpanType
	 * @generated
	 */
	EClass getSpanType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.SpanType#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see org.eclipse.rmf.rif12.its.SpanType#getDir()
	 * @see #getSpanType()
	 * @generated
	 */
	EAttribute getSpanType_Dir();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.SpanType#getLocNote <em>Loc Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note</em>'.
	 * @see org.eclipse.rmf.rif12.its.SpanType#getLocNote()
	 * @see #getSpanType()
	 * @generated
	 */
	EAttribute getSpanType_LocNote();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.SpanType#getLocNoteRef <em>Loc Note Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note Ref</em>'.
	 * @see org.eclipse.rmf.rif12.its.SpanType#getLocNoteRef()
	 * @see #getSpanType()
	 * @generated
	 */
	EAttribute getSpanType_LocNoteRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.SpanType#getLocNoteType <em>Loc Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loc Note Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.SpanType#getLocNoteType()
	 * @see #getSpanType()
	 * @generated
	 */
	EAttribute getSpanType_LocNoteType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.SpanType#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see org.eclipse.rmf.rif12.its.SpanType#getTerm()
	 * @see #getSpanType()
	 * @generated
	 */
	EAttribute getSpanType_Term();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.SpanType#getTermInfoRef <em>Term Info Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Info Ref</em>'.
	 * @see org.eclipse.rmf.rif12.its.SpanType#getTermInfoRef()
	 * @see #getSpanType()
	 * @generated
	 */
	EAttribute getSpanType_TermInfoRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.SpanType#getTranslate <em>Translate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translate</em>'.
	 * @see org.eclipse.rmf.rif12.its.SpanType#getTranslate()
	 * @see #getSpanType()
	 * @generated
	 */
	EAttribute getSpanType_Translate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.TermRuleType <em>Term Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Rule Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.TermRuleType
	 * @generated
	 */
	EClass getTermRuleType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.TermRuleType#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selector</em>'.
	 * @see org.eclipse.rmf.rif12.its.TermRuleType#getSelector()
	 * @see #getTermRuleType()
	 * @generated
	 */
	EAttribute getTermRuleType_Selector();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.TermRuleType#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see org.eclipse.rmf.rif12.its.TermRuleType#getTerm()
	 * @see #getTermRuleType()
	 * @generated
	 */
	EAttribute getTermRuleType_Term();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.TermRuleType#getTermInfoPointer <em>Term Info Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Info Pointer</em>'.
	 * @see org.eclipse.rmf.rif12.its.TermRuleType#getTermInfoPointer()
	 * @see #getTermRuleType()
	 * @generated
	 */
	EAttribute getTermRuleType_TermInfoPointer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.TermRuleType#getTermInfoRef <em>Term Info Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Info Ref</em>'.
	 * @see org.eclipse.rmf.rif12.its.TermRuleType#getTermInfoRef()
	 * @see #getTermRuleType()
	 * @generated
	 */
	EAttribute getTermRuleType_TermInfoRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.TermRuleType#getTermInfoRefPointer <em>Term Info Ref Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Info Ref Pointer</em>'.
	 * @see org.eclipse.rmf.rif12.its.TermRuleType#getTermInfoRefPointer()
	 * @see #getTermRuleType()
	 * @generated
	 */
	EAttribute getTermRuleType_TermInfoRefPointer();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.TranslateRuleType <em>Translate Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Translate Rule Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.TranslateRuleType
	 * @generated
	 */
	EClass getTranslateRuleType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.TranslateRuleType#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selector</em>'.
	 * @see org.eclipse.rmf.rif12.its.TranslateRuleType#getSelector()
	 * @see #getTranslateRuleType()
	 * @generated
	 */
	EAttribute getTranslateRuleType_Selector();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.TranslateRuleType#getTranslate <em>Translate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Translate</em>'.
	 * @see org.eclipse.rmf.rif12.its.TranslateRuleType#getTranslate()
	 * @see #getTranslateRuleType()
	 * @generated
	 */
	EAttribute getTranslateRuleType_Translate();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.its.WithinTextRuleType <em>Within Text Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Within Text Rule Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.WithinTextRuleType
	 * @generated
	 */
	EClass getWithinTextRuleType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.WithinTextRuleType#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selector</em>'.
	 * @see org.eclipse.rmf.rif12.its.WithinTextRuleType#getSelector()
	 * @see #getWithinTextRuleType()
	 * @generated
	 */
	EAttribute getWithinTextRuleType_Selector();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.its.WithinTextRuleType#getWithinText <em>Within Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Within Text</em>'.
	 * @see org.eclipse.rmf.rif12.its.WithinTextRuleType#getWithinText()
	 * @see #getWithinTextRuleType()
	 * @generated
	 */
	EAttribute getWithinTextRuleType_WithinText();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.rif12.its.DirType <em>Dir Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dir Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.DirType
	 * @generated
	 */
	EEnum getDirType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.rif12.its.DirType1 <em>Dir Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dir Type1</em>'.
	 * @see org.eclipse.rmf.rif12.its.DirType1
	 * @generated
	 */
	EEnum getDirType1();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.rif12.its.DirType2 <em>Dir Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dir Type2</em>'.
	 * @see org.eclipse.rmf.rif12.its.DirType2
	 * @generated
	 */
	EEnum getDirType2();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.rif12.its.LocNoteTypeType <em>Loc Note Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Loc Note Type Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.LocNoteTypeType
	 * @generated
	 */
	EEnum getLocNoteTypeType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.rif12.its.LocNoteTypeType1 <em>Loc Note Type Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Loc Note Type Type1</em>'.
	 * @see org.eclipse.rmf.rif12.its.LocNoteTypeType1
	 * @generated
	 */
	EEnum getLocNoteTypeType1();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.rif12.its.TermType <em>Term Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Term Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.TermType
	 * @generated
	 */
	EEnum getTermType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.rif12.its.TermType1 <em>Term Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Term Type1</em>'.
	 * @see org.eclipse.rmf.rif12.its.TermType1
	 * @generated
	 */
	EEnum getTermType1();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.rif12.its.TranslateType <em>Translate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Translate Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.TranslateType
	 * @generated
	 */
	EEnum getTranslateType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.rif12.its.TranslateType1 <em>Translate Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Translate Type1</em>'.
	 * @see org.eclipse.rmf.rif12.its.TranslateType1
	 * @generated
	 */
	EEnum getTranslateType1();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.rif12.its.WithinTextType <em>Within Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Within Text Type</em>'.
	 * @see org.eclipse.rmf.rif12.its.WithinTextType
	 * @generated
	 */
	EEnum getWithinTextType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.rif12.its.DirType1 <em>Dir Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dir Type Object</em>'.
	 * @see org.eclipse.rmf.rif12.its.DirType1
	 * @model instanceClass="org.eclipse.rmf.rif12.its.DirType1"
	 *        extendedMetaData="name='dir_._2_._type:Object' baseType='dir_._2_._type'"
	 * @generated
	 */
	EDataType getDirTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.rif12.its.DirType <em>Dir Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dir Type Object1</em>'.
	 * @see org.eclipse.rmf.rif12.its.DirType
	 * @model instanceClass="org.eclipse.rmf.rif12.its.DirType"
	 *        extendedMetaData="name='dir_._1_._type:Object' baseType='dir_._1_._type'"
	 * @generated
	 */
	EDataType getDirTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.rif12.its.DirType2 <em>Dir Type Object2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Dir Type Object2</em>'.
	 * @see org.eclipse.rmf.rif12.its.DirType2
	 * @model instanceClass="org.eclipse.rmf.rif12.its.DirType2"
	 *        extendedMetaData="name='dir_._type:Object' baseType='dir_._type'"
	 * @generated
	 */
	EDataType getDirTypeObject2();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.rif12.its.LocNoteTypeType <em>Loc Note Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Loc Note Type Type Object</em>'.
	 * @see org.eclipse.rmf.rif12.its.LocNoteTypeType
	 * @model instanceClass="org.eclipse.rmf.rif12.its.LocNoteTypeType"
	 *        extendedMetaData="name='locNoteType_._type:Object' baseType='locNoteType_._type'"
	 * @generated
	 */
	EDataType getLocNoteTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.rif12.its.LocNoteTypeType1 <em>Loc Note Type Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Loc Note Type Type Object1</em>'.
	 * @see org.eclipse.rmf.rif12.its.LocNoteTypeType1
	 * @model instanceClass="org.eclipse.rmf.rif12.its.LocNoteTypeType1"
	 *        extendedMetaData="name='locNoteType_._1_._type:Object' baseType='locNoteType_._1_._type'"
	 * @generated
	 */
	EDataType getLocNoteTypeTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.rif12.its.TermType <em>Term Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Term Type Object</em>'.
	 * @see org.eclipse.rmf.rif12.its.TermType
	 * @model instanceClass="org.eclipse.rmf.rif12.its.TermType"
	 *        extendedMetaData="name='term_._type:Object' baseType='term_._type'"
	 * @generated
	 */
	EDataType getTermTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.rif12.its.TermType1 <em>Term Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Term Type Object1</em>'.
	 * @see org.eclipse.rmf.rif12.its.TermType1
	 * @model instanceClass="org.eclipse.rmf.rif12.its.TermType1"
	 *        extendedMetaData="name='term_._1_._type:Object' baseType='term_._1_._type'"
	 * @generated
	 */
	EDataType getTermTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.rif12.its.TranslateType <em>Translate Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Translate Type Object</em>'.
	 * @see org.eclipse.rmf.rif12.its.TranslateType
	 * @model instanceClass="org.eclipse.rmf.rif12.its.TranslateType"
	 *        extendedMetaData="name='translate_._type:Object' baseType='translate_._type'"
	 * @generated
	 */
	EDataType getTranslateTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.rif12.its.TranslateType1 <em>Translate Type Object1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Translate Type Object1</em>'.
	 * @see org.eclipse.rmf.rif12.its.TranslateType1
	 * @model instanceClass="org.eclipse.rmf.rif12.its.TranslateType1"
	 *        extendedMetaData="name='translate_._1_._type:Object' baseType='translate_._1_._type'"
	 * @generated
	 */
	EDataType getTranslateTypeObject1();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.rif12.its.WithinTextType <em>Within Text Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Within Text Type Object</em>'.
	 * @see org.eclipse.rmf.rif12.its.WithinTextType
	 * @model instanceClass="org.eclipse.rmf.rif12.its.WithinTextType"
	 *        extendedMetaData="name='withinText_._type:Object' baseType='withinText_._type'"
	 * @generated
	 */
	EDataType getWithinTextTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ItsFactory getItsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.DirRuleTypeImpl <em>Dir Rule Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.DirRuleTypeImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getDirRuleType()
		 * @generated
		 */
		EClass DIR_RULE_TYPE = eINSTANCE.getDirRuleType();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIR_RULE_TYPE__DIR = eINSTANCE.getDirRuleType_Dir();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIR_RULE_TYPE__SELECTOR = eINSTANCE.getDirRuleType_Selector();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.DocumentRootImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Dir Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DIR_RULE = eINSTANCE.getDocumentRoot_DirRule();

		/**
		 * The meta object literal for the '<em><b>Lang Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LANG_RULE = eINSTANCE.getDocumentRoot_LangRule();

		/**
		 * The meta object literal for the '<em><b>Loc Note</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOC_NOTE = eINSTANCE.getDocumentRoot_LocNote();

		/**
		 * The meta object literal for the '<em><b>Loc Note Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOC_NOTE_RULE = eINSTANCE.getDocumentRoot_LocNoteRule();

		/**
		 * The meta object literal for the '<em><b>Rb</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RB = eINSTANCE.getDocumentRoot_Rb();

		/**
		 * The meta object literal for the '<em><b>Rbc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RBC = eINSTANCE.getDocumentRoot_Rbc();

		/**
		 * The meta object literal for the '<em><b>Rp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RP = eINSTANCE.getDocumentRoot_Rp();

		/**
		 * The meta object literal for the '<em><b>Rt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RT = eINSTANCE.getDocumentRoot_Rt();

		/**
		 * The meta object literal for the '<em><b>Rtc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RTC = eINSTANCE.getDocumentRoot_Rtc();

		/**
		 * The meta object literal for the '<em><b>Ruby</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RUBY = eINSTANCE.getDocumentRoot_Ruby();

		/**
		 * The meta object literal for the '<em><b>Ruby Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RUBY_RULE = eINSTANCE.getDocumentRoot_RubyRule();

		/**
		 * The meta object literal for the '<em><b>Ruby Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RUBY_TEXT = eINSTANCE.getDocumentRoot_RubyText();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RULES = eINSTANCE.getDocumentRoot_Rules();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPAN = eINSTANCE.getDocumentRoot_Span();

		/**
		 * The meta object literal for the '<em><b>Term Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TERM_RULE = eINSTANCE.getDocumentRoot_TermRule();

		/**
		 * The meta object literal for the '<em><b>Translate Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSLATE_RULE = eINSTANCE.getDocumentRoot_TranslateRule();

		/**
		 * The meta object literal for the '<em><b>Within Text Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WITHIN_TEXT_RULE = eINSTANCE.getDocumentRoot_WithinTextRule();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.ItsLocNoteContentImpl <em>Loc Note Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.ItsLocNoteContentImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getItsLocNoteContent()
		 * @generated
		 */
		EClass ITS_LOC_NOTE_CONTENT = eINSTANCE.getItsLocNoteContent();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITS_LOC_NOTE_CONTENT__MIXED = eINSTANCE.getItsLocNoteContent_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITS_LOC_NOTE_CONTENT__GROUP = eINSTANCE.getItsLocNoteContent_Group();

		/**
		 * The meta object literal for the '<em><b>Ruby</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITS_LOC_NOTE_CONTENT__RUBY = eINSTANCE.getItsLocNoteContent_Ruby();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITS_LOC_NOTE_CONTENT__SPAN = eINSTANCE.getItsLocNoteContent_Span();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.ItsLocNoteRuleContentImpl <em>Loc Note Rule Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.ItsLocNoteRuleContentImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getItsLocNoteRuleContent()
		 * @generated
		 */
		EClass ITS_LOC_NOTE_RULE_CONTENT = eINSTANCE.getItsLocNoteRuleContent();

		/**
		 * The meta object literal for the '<em><b>Loc Note</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITS_LOC_NOTE_RULE_CONTENT__LOC_NOTE = eINSTANCE.getItsLocNoteRuleContent_LocNote();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.ItsRbcContentImpl <em>Rbc Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.ItsRbcContentImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getItsRbcContent()
		 * @generated
		 */
		EClass ITS_RBC_CONTENT = eINSTANCE.getItsRbcContent();

		/**
		 * The meta object literal for the '<em><b>Rb</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITS_RBC_CONTENT__RB = eINSTANCE.getItsRbcContent_Rb();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.ItsRbContentImpl <em>Rb Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.ItsRbContentImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getItsRbContent()
		 * @generated
		 */
		EClass ITS_RB_CONTENT = eINSTANCE.getItsRbContent();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITS_RB_CONTENT__MIXED = eINSTANCE.getItsRbContent_Mixed();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITS_RB_CONTENT__SPAN = eINSTANCE.getItsRbContent_Span();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.ItsRtcContentImpl <em>Rtc Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.ItsRtcContentImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getItsRtcContent()
		 * @generated
		 */
		EClass ITS_RTC_CONTENT = eINSTANCE.getItsRtcContent();

		/**
		 * The meta object literal for the '<em><b>Rt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITS_RTC_CONTENT__RT = eINSTANCE.getItsRtcContent_Rt();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.ItsRtContentImpl <em>Rt Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.ItsRtContentImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getItsRtContent()
		 * @generated
		 */
		EClass ITS_RT_CONTENT = eINSTANCE.getItsRtContent();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITS_RT_CONTENT__MIXED = eINSTANCE.getItsRtContent_Mixed();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITS_RT_CONTENT__SPAN = eINSTANCE.getItsRtContent_Span();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.ItsRubyContentImpl <em>Ruby Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.ItsRubyContentImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getItsRubyContent()
		 * @generated
		 */
		EClass ITS_RUBY_CONTENT = eINSTANCE.getItsRubyContent();

		/**
		 * The meta object literal for the '<em><b>Rb</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITS_RUBY_CONTENT__RB = eINSTANCE.getItsRubyContent_Rb();

		/**
		 * The meta object literal for the '<em><b>Rt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITS_RUBY_CONTENT__RT = eINSTANCE.getItsRubyContent_Rt();

		/**
		 * The meta object literal for the '<em><b>Rp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITS_RUBY_CONTENT__RP = eINSTANCE.getItsRubyContent_Rp();

		/**
		 * The meta object literal for the '<em><b>Rt1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITS_RUBY_CONTENT__RT1 = eINSTANCE.getItsRubyContent_Rt1();

		/**
		 * The meta object literal for the '<em><b>Rp1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITS_RUBY_CONTENT__RP1 = eINSTANCE.getItsRubyContent_Rp1();

		/**
		 * The meta object literal for the '<em><b>Rbc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITS_RUBY_CONTENT__RBC = eINSTANCE.getItsRubyContent_Rbc();

		/**
		 * The meta object literal for the '<em><b>Rtc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITS_RUBY_CONTENT__RTC = eINSTANCE.getItsRubyContent_Rtc();

		/**
		 * The meta object literal for the '<em><b>Rtc1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITS_RUBY_CONTENT__RTC1 = eINSTANCE.getItsRubyContent_Rtc1();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.ItsRubyRuleContentImpl <em>Ruby Rule Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.ItsRubyRuleContentImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getItsRubyRuleContent()
		 * @generated
		 */
		EClass ITS_RUBY_RULE_CONTENT = eINSTANCE.getItsRubyRuleContent();

		/**
		 * The meta object literal for the '<em><b>Ruby Text</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITS_RUBY_RULE_CONTENT__RUBY_TEXT = eINSTANCE.getItsRubyRuleContent_RubyText();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.ItsRulesContentImpl <em>Rules Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.ItsRulesContentImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getItsRulesContent()
		 * @generated
		 */
		EClass ITS_RULES_CONTENT = eINSTANCE.getItsRulesContent();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITS_RULES_CONTENT__GROUP = eINSTANCE.getItsRulesContent_Group();

		/**
		 * The meta object literal for the '<em><b>Translate Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITS_RULES_CONTENT__TRANSLATE_RULE = eINSTANCE.getItsRulesContent_TranslateRule();

		/**
		 * The meta object literal for the '<em><b>Loc Note Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITS_RULES_CONTENT__LOC_NOTE_RULE = eINSTANCE.getItsRulesContent_LocNoteRule();

		/**
		 * The meta object literal for the '<em><b>Term Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITS_RULES_CONTENT__TERM_RULE = eINSTANCE.getItsRulesContent_TermRule();

		/**
		 * The meta object literal for the '<em><b>Dir Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITS_RULES_CONTENT__DIR_RULE = eINSTANCE.getItsRulesContent_DirRule();

		/**
		 * The meta object literal for the '<em><b>Ruby Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITS_RULES_CONTENT__RUBY_RULE = eINSTANCE.getItsRulesContent_RubyRule();

		/**
		 * The meta object literal for the '<em><b>Lang Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITS_RULES_CONTENT__LANG_RULE = eINSTANCE.getItsRulesContent_LangRule();

		/**
		 * The meta object literal for the '<em><b>Within Text Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITS_RULES_CONTENT__WITHIN_TEXT_RULE = eINSTANCE.getItsRulesContent_WithinTextRule();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.ItsSpanContentImpl <em>Span Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.ItsSpanContentImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getItsSpanContent()
		 * @generated
		 */
		EClass ITS_SPAN_CONTENT = eINSTANCE.getItsSpanContent();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITS_SPAN_CONTENT__MIXED = eINSTANCE.getItsSpanContent_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITS_SPAN_CONTENT__GROUP = eINSTANCE.getItsSpanContent_Group();

		/**
		 * The meta object literal for the '<em><b>Ruby</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITS_SPAN_CONTENT__RUBY = eINSTANCE.getItsSpanContent_Ruby();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITS_SPAN_CONTENT__SPAN = eINSTANCE.getItsSpanContent_Span();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.LangRuleTypeImpl <em>Lang Rule Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.LangRuleTypeImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getLangRuleType()
		 * @generated
		 */
		EClass LANG_RULE_TYPE = eINSTANCE.getLangRuleType();

		/**
		 * The meta object literal for the '<em><b>Lang Pointer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANG_RULE_TYPE__LANG_POINTER = eINSTANCE.getLangRuleType_LangPointer();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANG_RULE_TYPE__SELECTOR = eINSTANCE.getLangRuleType_Selector();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.LocNoteRuleTypeImpl <em>Loc Note Rule Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.LocNoteRuleTypeImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getLocNoteRuleType()
		 * @generated
		 */
		EClass LOC_NOTE_RULE_TYPE = eINSTANCE.getLocNoteRuleType();

		/**
		 * The meta object literal for the '<em><b>Loc Note Pointer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOC_NOTE_RULE_TYPE__LOC_NOTE_POINTER = eINSTANCE.getLocNoteRuleType_LocNotePointer();

		/**
		 * The meta object literal for the '<em><b>Loc Note Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOC_NOTE_RULE_TYPE__LOC_NOTE_REF = eINSTANCE.getLocNoteRuleType_LocNoteRef();

		/**
		 * The meta object literal for the '<em><b>Loc Note Ref Pointer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOC_NOTE_RULE_TYPE__LOC_NOTE_REF_POINTER = eINSTANCE.getLocNoteRuleType_LocNoteRefPointer();

		/**
		 * The meta object literal for the '<em><b>Loc Note Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOC_NOTE_RULE_TYPE__LOC_NOTE_TYPE = eINSTANCE.getLocNoteRuleType_LocNoteType();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOC_NOTE_RULE_TYPE__SELECTOR = eINSTANCE.getLocNoteRuleType_Selector();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.LocNoteTypeImpl <em>Loc Note Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.LocNoteTypeImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getLocNoteType()
		 * @generated
		 */
		EClass LOC_NOTE_TYPE = eINSTANCE.getLocNoteType();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOC_NOTE_TYPE__DIR = eINSTANCE.getLocNoteType_Dir();

		/**
		 * The meta object literal for the '<em><b>Loc Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOC_NOTE_TYPE__LOC_NOTE = eINSTANCE.getLocNoteType_LocNote();

		/**
		 * The meta object literal for the '<em><b>Loc Note Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOC_NOTE_TYPE__LOC_NOTE_REF = eINSTANCE.getLocNoteType_LocNoteRef();

		/**
		 * The meta object literal for the '<em><b>Loc Note Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOC_NOTE_TYPE__LOC_NOTE_TYPE = eINSTANCE.getLocNoteType_LocNoteType();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOC_NOTE_TYPE__TERM = eINSTANCE.getLocNoteType_Term();

		/**
		 * The meta object literal for the '<em><b>Term Info Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOC_NOTE_TYPE__TERM_INFO_REF = eINSTANCE.getLocNoteType_TermInfoRef();

		/**
		 * The meta object literal for the '<em><b>Translate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOC_NOTE_TYPE__TRANSLATE = eINSTANCE.getLocNoteType_Translate();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.RbcTypeImpl <em>Rbc Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.RbcTypeImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getRbcType()
		 * @generated
		 */
		EClass RBC_TYPE = eINSTANCE.getRbcType();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RBC_TYPE__DIR = eINSTANCE.getRbcType_Dir();

		/**
		 * The meta object literal for the '<em><b>Loc Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RBC_TYPE__LOC_NOTE = eINSTANCE.getRbcType_LocNote();

		/**
		 * The meta object literal for the '<em><b>Loc Note Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RBC_TYPE__LOC_NOTE_REF = eINSTANCE.getRbcType_LocNoteRef();

		/**
		 * The meta object literal for the '<em><b>Loc Note Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RBC_TYPE__LOC_NOTE_TYPE = eINSTANCE.getRbcType_LocNoteType();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RBC_TYPE__TERM = eINSTANCE.getRbcType_Term();

		/**
		 * The meta object literal for the '<em><b>Term Info Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RBC_TYPE__TERM_INFO_REF = eINSTANCE.getRbcType_TermInfoRef();

		/**
		 * The meta object literal for the '<em><b>Translate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RBC_TYPE__TRANSLATE = eINSTANCE.getRbcType_Translate();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.RbTypeImpl <em>Rb Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.RbTypeImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getRbType()
		 * @generated
		 */
		EClass RB_TYPE = eINSTANCE.getRbType();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RB_TYPE__DIR = eINSTANCE.getRbType_Dir();

		/**
		 * The meta object literal for the '<em><b>Loc Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RB_TYPE__LOC_NOTE = eINSTANCE.getRbType_LocNote();

		/**
		 * The meta object literal for the '<em><b>Loc Note Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RB_TYPE__LOC_NOTE_REF = eINSTANCE.getRbType_LocNoteRef();

		/**
		 * The meta object literal for the '<em><b>Loc Note Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RB_TYPE__LOC_NOTE_TYPE = eINSTANCE.getRbType_LocNoteType();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RB_TYPE__TERM = eINSTANCE.getRbType_Term();

		/**
		 * The meta object literal for the '<em><b>Term Info Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RB_TYPE__TERM_INFO_REF = eINSTANCE.getRbType_TermInfoRef();

		/**
		 * The meta object literal for the '<em><b>Translate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RB_TYPE__TRANSLATE = eINSTANCE.getRbType_Translate();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.RpTypeImpl <em>Rp Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.RpTypeImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getRpType()
		 * @generated
		 */
		EClass RP_TYPE = eINSTANCE.getRpType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RP_TYPE__MIXED = eINSTANCE.getRpType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RP_TYPE__DIR = eINSTANCE.getRpType_Dir();

		/**
		 * The meta object literal for the '<em><b>Loc Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RP_TYPE__LOC_NOTE = eINSTANCE.getRpType_LocNote();

		/**
		 * The meta object literal for the '<em><b>Loc Note Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RP_TYPE__LOC_NOTE_REF = eINSTANCE.getRpType_LocNoteRef();

		/**
		 * The meta object literal for the '<em><b>Loc Note Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RP_TYPE__LOC_NOTE_TYPE = eINSTANCE.getRpType_LocNoteType();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RP_TYPE__TERM = eINSTANCE.getRpType_Term();

		/**
		 * The meta object literal for the '<em><b>Term Info Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RP_TYPE__TERM_INFO_REF = eINSTANCE.getRpType_TermInfoRef();

		/**
		 * The meta object literal for the '<em><b>Translate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RP_TYPE__TRANSLATE = eINSTANCE.getRpType_Translate();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.RtcTypeImpl <em>Rtc Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.RtcTypeImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getRtcType()
		 * @generated
		 */
		EClass RTC_TYPE = eINSTANCE.getRtcType();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTC_TYPE__DIR = eINSTANCE.getRtcType_Dir();

		/**
		 * The meta object literal for the '<em><b>Loc Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTC_TYPE__LOC_NOTE = eINSTANCE.getRtcType_LocNote();

		/**
		 * The meta object literal for the '<em><b>Loc Note Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTC_TYPE__LOC_NOTE_REF = eINSTANCE.getRtcType_LocNoteRef();

		/**
		 * The meta object literal for the '<em><b>Loc Note Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTC_TYPE__LOC_NOTE_TYPE = eINSTANCE.getRtcType_LocNoteType();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTC_TYPE__TERM = eINSTANCE.getRtcType_Term();

		/**
		 * The meta object literal for the '<em><b>Term Info Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTC_TYPE__TERM_INFO_REF = eINSTANCE.getRtcType_TermInfoRef();

		/**
		 * The meta object literal for the '<em><b>Translate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RTC_TYPE__TRANSLATE = eINSTANCE.getRtcType_Translate();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.RtTypeImpl <em>Rt Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.RtTypeImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getRtType()
		 * @generated
		 */
		EClass RT_TYPE = eINSTANCE.getRtType();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RT_TYPE__DIR = eINSTANCE.getRtType_Dir();

		/**
		 * The meta object literal for the '<em><b>Loc Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RT_TYPE__LOC_NOTE = eINSTANCE.getRtType_LocNote();

		/**
		 * The meta object literal for the '<em><b>Loc Note Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RT_TYPE__LOC_NOTE_REF = eINSTANCE.getRtType_LocNoteRef();

		/**
		 * The meta object literal for the '<em><b>Loc Note Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RT_TYPE__LOC_NOTE_TYPE = eINSTANCE.getRtType_LocNoteType();

		/**
		 * The meta object literal for the '<em><b>Rbspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RT_TYPE__RBSPAN = eINSTANCE.getRtType_Rbspan();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RT_TYPE__TERM = eINSTANCE.getRtType_Term();

		/**
		 * The meta object literal for the '<em><b>Term Info Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RT_TYPE__TERM_INFO_REF = eINSTANCE.getRtType_TermInfoRef();

		/**
		 * The meta object literal for the '<em><b>Translate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RT_TYPE__TRANSLATE = eINSTANCE.getRtType_Translate();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.RubyRuleTypeImpl <em>Ruby Rule Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.RubyRuleTypeImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getRubyRuleType()
		 * @generated
		 */
		EClass RUBY_RULE_TYPE = eINSTANCE.getRubyRuleType();

		/**
		 * The meta object literal for the '<em><b>Rbc Pointer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBY_RULE_TYPE__RBC_POINTER = eINSTANCE.getRubyRuleType_RbcPointer();

		/**
		 * The meta object literal for the '<em><b>Rbspan Pointer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBY_RULE_TYPE__RBSPAN_POINTER = eINSTANCE.getRubyRuleType_RbspanPointer();

		/**
		 * The meta object literal for the '<em><b>Rp Pointer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBY_RULE_TYPE__RP_POINTER = eINSTANCE.getRubyRuleType_RpPointer();

		/**
		 * The meta object literal for the '<em><b>Rtc Pointer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBY_RULE_TYPE__RTC_POINTER = eINSTANCE.getRubyRuleType_RtcPointer();

		/**
		 * The meta object literal for the '<em><b>Rt Pointer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBY_RULE_TYPE__RT_POINTER = eINSTANCE.getRubyRuleType_RtPointer();

		/**
		 * The meta object literal for the '<em><b>Ruby Pointer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBY_RULE_TYPE__RUBY_POINTER = eINSTANCE.getRubyRuleType_RubyPointer();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBY_RULE_TYPE__SELECTOR = eINSTANCE.getRubyRuleType_Selector();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.RubyTextTypeImpl <em>Ruby Text Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.RubyTextTypeImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getRubyTextType()
		 * @generated
		 */
		EClass RUBY_TEXT_TYPE = eINSTANCE.getRubyTextType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBY_TEXT_TYPE__MIXED = eINSTANCE.getRubyTextType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBY_TEXT_TYPE__DIR = eINSTANCE.getRubyTextType_Dir();

		/**
		 * The meta object literal for the '<em><b>Loc Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBY_TEXT_TYPE__LOC_NOTE = eINSTANCE.getRubyTextType_LocNote();

		/**
		 * The meta object literal for the '<em><b>Loc Note Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBY_TEXT_TYPE__LOC_NOTE_REF = eINSTANCE.getRubyTextType_LocNoteRef();

		/**
		 * The meta object literal for the '<em><b>Loc Note Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBY_TEXT_TYPE__LOC_NOTE_TYPE = eINSTANCE.getRubyTextType_LocNoteType();

		/**
		 * The meta object literal for the '<em><b>Rbspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBY_TEXT_TYPE__RBSPAN = eINSTANCE.getRubyTextType_Rbspan();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBY_TEXT_TYPE__TERM = eINSTANCE.getRubyTextType_Term();

		/**
		 * The meta object literal for the '<em><b>Term Info Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBY_TEXT_TYPE__TERM_INFO_REF = eINSTANCE.getRubyTextType_TermInfoRef();

		/**
		 * The meta object literal for the '<em><b>Translate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBY_TEXT_TYPE__TRANSLATE = eINSTANCE.getRubyTextType_Translate();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.RubyTypeImpl <em>Ruby Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.RubyTypeImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getRubyType()
		 * @generated
		 */
		EClass RUBY_TYPE = eINSTANCE.getRubyType();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBY_TYPE__DIR = eINSTANCE.getRubyType_Dir();

		/**
		 * The meta object literal for the '<em><b>Loc Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBY_TYPE__LOC_NOTE = eINSTANCE.getRubyType_LocNote();

		/**
		 * The meta object literal for the '<em><b>Loc Note Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBY_TYPE__LOC_NOTE_REF = eINSTANCE.getRubyType_LocNoteRef();

		/**
		 * The meta object literal for the '<em><b>Loc Note Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBY_TYPE__LOC_NOTE_TYPE = eINSTANCE.getRubyType_LocNoteType();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBY_TYPE__TERM = eINSTANCE.getRubyType_Term();

		/**
		 * The meta object literal for the '<em><b>Term Info Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBY_TYPE__TERM_INFO_REF = eINSTANCE.getRubyType_TermInfoRef();

		/**
		 * The meta object literal for the '<em><b>Translate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUBY_TYPE__TRANSLATE = eINSTANCE.getRubyType_Translate();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.RulesTypeImpl <em>Rules Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.RulesTypeImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getRulesType()
		 * @generated
		 */
		EClass RULES_TYPE = eINSTANCE.getRulesType();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULES_TYPE__HREF = eINSTANCE.getRulesType_Href();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULES_TYPE__TYPE = eINSTANCE.getRulesType_Type();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULES_TYPE__VERSION = eINSTANCE.getRulesType_Version();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.SpanTypeImpl <em>Span Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.SpanTypeImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getSpanType()
		 * @generated
		 */
		EClass SPAN_TYPE = eINSTANCE.getSpanType();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_TYPE__DIR = eINSTANCE.getSpanType_Dir();

		/**
		 * The meta object literal for the '<em><b>Loc Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_TYPE__LOC_NOTE = eINSTANCE.getSpanType_LocNote();

		/**
		 * The meta object literal for the '<em><b>Loc Note Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_TYPE__LOC_NOTE_REF = eINSTANCE.getSpanType_LocNoteRef();

		/**
		 * The meta object literal for the '<em><b>Loc Note Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_TYPE__LOC_NOTE_TYPE = eINSTANCE.getSpanType_LocNoteType();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_TYPE__TERM = eINSTANCE.getSpanType_Term();

		/**
		 * The meta object literal for the '<em><b>Term Info Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_TYPE__TERM_INFO_REF = eINSTANCE.getSpanType_TermInfoRef();

		/**
		 * The meta object literal for the '<em><b>Translate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_TYPE__TRANSLATE = eINSTANCE.getSpanType_Translate();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.TermRuleTypeImpl <em>Term Rule Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.TermRuleTypeImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getTermRuleType()
		 * @generated
		 */
		EClass TERM_RULE_TYPE = eINSTANCE.getTermRuleType();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM_RULE_TYPE__SELECTOR = eINSTANCE.getTermRuleType_Selector();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM_RULE_TYPE__TERM = eINSTANCE.getTermRuleType_Term();

		/**
		 * The meta object literal for the '<em><b>Term Info Pointer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM_RULE_TYPE__TERM_INFO_POINTER = eINSTANCE.getTermRuleType_TermInfoPointer();

		/**
		 * The meta object literal for the '<em><b>Term Info Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM_RULE_TYPE__TERM_INFO_REF = eINSTANCE.getTermRuleType_TermInfoRef();

		/**
		 * The meta object literal for the '<em><b>Term Info Ref Pointer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM_RULE_TYPE__TERM_INFO_REF_POINTER = eINSTANCE.getTermRuleType_TermInfoRefPointer();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.TranslateRuleTypeImpl <em>Translate Rule Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.TranslateRuleTypeImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getTranslateRuleType()
		 * @generated
		 */
		EClass TRANSLATE_RULE_TYPE = eINSTANCE.getTranslateRuleType();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATE_RULE_TYPE__SELECTOR = eINSTANCE.getTranslateRuleType_Selector();

		/**
		 * The meta object literal for the '<em><b>Translate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSLATE_RULE_TYPE__TRANSLATE = eINSTANCE.getTranslateRuleType_Translate();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.impl.WithinTextRuleTypeImpl <em>Within Text Rule Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.impl.WithinTextRuleTypeImpl
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getWithinTextRuleType()
		 * @generated
		 */
		EClass WITHIN_TEXT_RULE_TYPE = eINSTANCE.getWithinTextRuleType();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WITHIN_TEXT_RULE_TYPE__SELECTOR = eINSTANCE.getWithinTextRuleType_Selector();

		/**
		 * The meta object literal for the '<em><b>Within Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WITHIN_TEXT_RULE_TYPE__WITHIN_TEXT = eINSTANCE.getWithinTextRuleType_WithinText();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.DirType <em>Dir Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.DirType
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getDirType()
		 * @generated
		 */
		EEnum DIR_TYPE = eINSTANCE.getDirType();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.DirType1 <em>Dir Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.DirType1
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getDirType1()
		 * @generated
		 */
		EEnum DIR_TYPE1 = eINSTANCE.getDirType1();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.DirType2 <em>Dir Type2</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.DirType2
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getDirType2()
		 * @generated
		 */
		EEnum DIR_TYPE2 = eINSTANCE.getDirType2();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.LocNoteTypeType <em>Loc Note Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.LocNoteTypeType
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getLocNoteTypeType()
		 * @generated
		 */
		EEnum LOC_NOTE_TYPE_TYPE = eINSTANCE.getLocNoteTypeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.LocNoteTypeType1 <em>Loc Note Type Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.LocNoteTypeType1
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getLocNoteTypeType1()
		 * @generated
		 */
		EEnum LOC_NOTE_TYPE_TYPE1 = eINSTANCE.getLocNoteTypeType1();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.TermType <em>Term Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.TermType
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getTermType()
		 * @generated
		 */
		EEnum TERM_TYPE = eINSTANCE.getTermType();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.TermType1 <em>Term Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.TermType1
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getTermType1()
		 * @generated
		 */
		EEnum TERM_TYPE1 = eINSTANCE.getTermType1();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.TranslateType <em>Translate Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.TranslateType
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getTranslateType()
		 * @generated
		 */
		EEnum TRANSLATE_TYPE = eINSTANCE.getTranslateType();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.TranslateType1 <em>Translate Type1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.TranslateType1
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getTranslateType1()
		 * @generated
		 */
		EEnum TRANSLATE_TYPE1 = eINSTANCE.getTranslateType1();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.its.WithinTextType <em>Within Text Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.WithinTextType
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getWithinTextType()
		 * @generated
		 */
		EEnum WITHIN_TEXT_TYPE = eINSTANCE.getWithinTextType();

		/**
		 * The meta object literal for the '<em>Dir Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.DirType1
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getDirTypeObject()
		 * @generated
		 */
		EDataType DIR_TYPE_OBJECT = eINSTANCE.getDirTypeObject();

		/**
		 * The meta object literal for the '<em>Dir Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.DirType
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getDirTypeObject1()
		 * @generated
		 */
		EDataType DIR_TYPE_OBJECT1 = eINSTANCE.getDirTypeObject1();

		/**
		 * The meta object literal for the '<em>Dir Type Object2</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.DirType2
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getDirTypeObject2()
		 * @generated
		 */
		EDataType DIR_TYPE_OBJECT2 = eINSTANCE.getDirTypeObject2();

		/**
		 * The meta object literal for the '<em>Loc Note Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.LocNoteTypeType
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getLocNoteTypeTypeObject()
		 * @generated
		 */
		EDataType LOC_NOTE_TYPE_TYPE_OBJECT = eINSTANCE.getLocNoteTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Loc Note Type Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.LocNoteTypeType1
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getLocNoteTypeTypeObject1()
		 * @generated
		 */
		EDataType LOC_NOTE_TYPE_TYPE_OBJECT1 = eINSTANCE.getLocNoteTypeTypeObject1();

		/**
		 * The meta object literal for the '<em>Term Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.TermType
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getTermTypeObject()
		 * @generated
		 */
		EDataType TERM_TYPE_OBJECT = eINSTANCE.getTermTypeObject();

		/**
		 * The meta object literal for the '<em>Term Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.TermType1
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getTermTypeObject1()
		 * @generated
		 */
		EDataType TERM_TYPE_OBJECT1 = eINSTANCE.getTermTypeObject1();

		/**
		 * The meta object literal for the '<em>Translate Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.TranslateType
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getTranslateTypeObject()
		 * @generated
		 */
		EDataType TRANSLATE_TYPE_OBJECT = eINSTANCE.getTranslateTypeObject();

		/**
		 * The meta object literal for the '<em>Translate Type Object1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.TranslateType1
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getTranslateTypeObject1()
		 * @generated
		 */
		EDataType TRANSLATE_TYPE_OBJECT1 = eINSTANCE.getTranslateTypeObject1();

		/**
		 * The meta object literal for the '<em>Within Text Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.its.WithinTextType
		 * @see org.eclipse.rmf.rif12.its.impl.ItsPackageImpl#getWithinTextTypeObject()
		 * @generated
		 */
		EDataType WITHIN_TEXT_TYPE_OBJECT = eINSTANCE.getWithinTextTypeObject();

	}

} //ItsPackage
