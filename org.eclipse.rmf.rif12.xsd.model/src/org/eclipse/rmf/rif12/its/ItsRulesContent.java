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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rules Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.its.ItsRulesContent#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.ItsRulesContent#getTranslateRule <em>Translate Rule</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.ItsRulesContent#getLocNoteRule <em>Loc Note Rule</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.ItsRulesContent#getTermRule <em>Term Rule</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.ItsRulesContent#getDirRule <em>Dir Rule</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.ItsRulesContent#getRubyRule <em>Ruby Rule</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.ItsRulesContent#getLangRule <em>Lang Rule</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.ItsRulesContent#getWithinTextRule <em>Within Text Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.its.ItsPackage#getItsRulesContent()
 * @model extendedMetaData="name='its-rules.content' kind='elementOnly'"
 * @generated
 */
public interface ItsRulesContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getItsRulesContent_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Translate Rule</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.its.TranslateRuleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rule about the Translate data category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Translate Rule</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getItsRulesContent_TranslateRule()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='translateRule' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TranslateRuleType> getTranslateRule();

	/**
	 * Returns the value of the '<em><b>Loc Note Rule</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.its.LocNoteRuleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rule about the Localization Note data category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Note Rule</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getItsRulesContent_LocNoteRule()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='locNoteRule' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<LocNoteRuleType> getLocNoteRule();

	/**
	 * Returns the value of the '<em><b>Term Rule</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.its.TermRuleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rule about the Terminology data category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term Rule</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getItsRulesContent_TermRule()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='termRule' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TermRuleType> getTermRule();

	/**
	 * Returns the value of the '<em><b>Dir Rule</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.its.DirRuleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rule about the Directionality data category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dir Rule</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getItsRulesContent_DirRule()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dirRule' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DirRuleType> getDirRule();

	/**
	 * Returns the value of the '<em><b>Ruby Rule</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.its.RubyRuleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rule about the Ruby data category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ruby Rule</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getItsRulesContent_RubyRule()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rubyRule' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RubyRuleType> getRubyRule();

	/**
	 * Returns the value of the '<em><b>Lang Rule</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.its.LangRuleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rule about the Language Information data category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang Rule</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getItsRulesContent_LangRule()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='langRule' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<LangRuleType> getLangRule();

	/**
	 * Returns the value of the '<em><b>Within Text Rule</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.its.WithinTextRuleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rule about the Elements Within Text data category.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Within Text Rule</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getItsRulesContent_WithinTextRule()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='withinTextRule' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<WithinTextRuleType> getWithinTextRule();

} // ItsRulesContent
