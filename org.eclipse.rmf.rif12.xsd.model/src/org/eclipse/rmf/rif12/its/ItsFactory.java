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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.rif12.its.ItsPackage
 * @generated
 */
public interface ItsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ItsFactory eINSTANCE = org.eclipse.rmf.rif12.its.impl.ItsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dir Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dir Rule Type</em>'.
	 * @generated
	 */
	DirRuleType createDirRuleType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Loc Note Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loc Note Content</em>'.
	 * @generated
	 */
	ItsLocNoteContent createItsLocNoteContent();

	/**
	 * Returns a new object of class '<em>Loc Note Rule Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loc Note Rule Content</em>'.
	 * @generated
	 */
	ItsLocNoteRuleContent createItsLocNoteRuleContent();

	/**
	 * Returns a new object of class '<em>Rbc Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rbc Content</em>'.
	 * @generated
	 */
	ItsRbcContent createItsRbcContent();

	/**
	 * Returns a new object of class '<em>Rb Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rb Content</em>'.
	 * @generated
	 */
	ItsRbContent createItsRbContent();

	/**
	 * Returns a new object of class '<em>Rtc Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rtc Content</em>'.
	 * @generated
	 */
	ItsRtcContent createItsRtcContent();

	/**
	 * Returns a new object of class '<em>Rt Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rt Content</em>'.
	 * @generated
	 */
	ItsRtContent createItsRtContent();

	/**
	 * Returns a new object of class '<em>Ruby Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ruby Content</em>'.
	 * @generated
	 */
	ItsRubyContent createItsRubyContent();

	/**
	 * Returns a new object of class '<em>Ruby Rule Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ruby Rule Content</em>'.
	 * @generated
	 */
	ItsRubyRuleContent createItsRubyRuleContent();

	/**
	 * Returns a new object of class '<em>Rules Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rules Content</em>'.
	 * @generated
	 */
	ItsRulesContent createItsRulesContent();

	/**
	 * Returns a new object of class '<em>Span Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Span Content</em>'.
	 * @generated
	 */
	ItsSpanContent createItsSpanContent();

	/**
	 * Returns a new object of class '<em>Lang Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lang Rule Type</em>'.
	 * @generated
	 */
	LangRuleType createLangRuleType();

	/**
	 * Returns a new object of class '<em>Loc Note Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loc Note Rule Type</em>'.
	 * @generated
	 */
	LocNoteRuleType createLocNoteRuleType();

	/**
	 * Returns a new object of class '<em>Loc Note Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loc Note Type</em>'.
	 * @generated
	 */
	LocNoteType createLocNoteType();

	/**
	 * Returns a new object of class '<em>Rbc Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rbc Type</em>'.
	 * @generated
	 */
	RbcType createRbcType();

	/**
	 * Returns a new object of class '<em>Rb Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rb Type</em>'.
	 * @generated
	 */
	RbType createRbType();

	/**
	 * Returns a new object of class '<em>Rp Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rp Type</em>'.
	 * @generated
	 */
	RpType createRpType();

	/**
	 * Returns a new object of class '<em>Rtc Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rtc Type</em>'.
	 * @generated
	 */
	RtcType createRtcType();

	/**
	 * Returns a new object of class '<em>Rt Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rt Type</em>'.
	 * @generated
	 */
	RtType createRtType();

	/**
	 * Returns a new object of class '<em>Ruby Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ruby Rule Type</em>'.
	 * @generated
	 */
	RubyRuleType createRubyRuleType();

	/**
	 * Returns a new object of class '<em>Ruby Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ruby Text Type</em>'.
	 * @generated
	 */
	RubyTextType createRubyTextType();

	/**
	 * Returns a new object of class '<em>Ruby Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ruby Type</em>'.
	 * @generated
	 */
	RubyType createRubyType();

	/**
	 * Returns a new object of class '<em>Rules Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rules Type</em>'.
	 * @generated
	 */
	RulesType createRulesType();

	/**
	 * Returns a new object of class '<em>Span Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Span Type</em>'.
	 * @generated
	 */
	SpanType createSpanType();

	/**
	 * Returns a new object of class '<em>Term Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term Rule Type</em>'.
	 * @generated
	 */
	TermRuleType createTermRuleType();

	/**
	 * Returns a new object of class '<em>Translate Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Translate Rule Type</em>'.
	 * @generated
	 */
	TranslateRuleType createTranslateRuleType();

	/**
	 * Returns a new object of class '<em>Within Text Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Within Text Rule Type</em>'.
	 * @generated
	 */
	WithinTextRuleType createWithinTextRuleType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ItsPackage getItsPackage();

} //ItsFactory
