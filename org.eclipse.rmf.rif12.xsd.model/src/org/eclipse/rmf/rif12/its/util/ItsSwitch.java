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

package org.eclipse.rmf.rif12.its.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.rmf.rif12.its.DirRuleType;
import org.eclipse.rmf.rif12.its.DocumentRoot;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.rif12.its.ItsPackage
 * @generated
 */
public class ItsSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ItsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItsSwitch() {
		if (modelPackage == null) {
			modelPackage = ItsPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ItsPackage.DIR_RULE_TYPE: {
				DirRuleType dirRuleType = (DirRuleType)theEObject;
				T result = caseDirRuleType(dirRuleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.ITS_LOC_NOTE_CONTENT: {
				ItsLocNoteContent itsLocNoteContent = (ItsLocNoteContent)theEObject;
				T result = caseItsLocNoteContent(itsLocNoteContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.ITS_LOC_NOTE_RULE_CONTENT: {
				ItsLocNoteRuleContent itsLocNoteRuleContent = (ItsLocNoteRuleContent)theEObject;
				T result = caseItsLocNoteRuleContent(itsLocNoteRuleContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.ITS_RBC_CONTENT: {
				ItsRbcContent itsRbcContent = (ItsRbcContent)theEObject;
				T result = caseItsRbcContent(itsRbcContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.ITS_RB_CONTENT: {
				ItsRbContent itsRbContent = (ItsRbContent)theEObject;
				T result = caseItsRbContent(itsRbContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.ITS_RTC_CONTENT: {
				ItsRtcContent itsRtcContent = (ItsRtcContent)theEObject;
				T result = caseItsRtcContent(itsRtcContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.ITS_RT_CONTENT: {
				ItsRtContent itsRtContent = (ItsRtContent)theEObject;
				T result = caseItsRtContent(itsRtContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.ITS_RUBY_CONTENT: {
				ItsRubyContent itsRubyContent = (ItsRubyContent)theEObject;
				T result = caseItsRubyContent(itsRubyContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.ITS_RUBY_RULE_CONTENT: {
				ItsRubyRuleContent itsRubyRuleContent = (ItsRubyRuleContent)theEObject;
				T result = caseItsRubyRuleContent(itsRubyRuleContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.ITS_RULES_CONTENT: {
				ItsRulesContent itsRulesContent = (ItsRulesContent)theEObject;
				T result = caseItsRulesContent(itsRulesContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.ITS_SPAN_CONTENT: {
				ItsSpanContent itsSpanContent = (ItsSpanContent)theEObject;
				T result = caseItsSpanContent(itsSpanContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.LANG_RULE_TYPE: {
				LangRuleType langRuleType = (LangRuleType)theEObject;
				T result = caseLangRuleType(langRuleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.LOC_NOTE_RULE_TYPE: {
				LocNoteRuleType locNoteRuleType = (LocNoteRuleType)theEObject;
				T result = caseLocNoteRuleType(locNoteRuleType);
				if (result == null) result = caseItsLocNoteRuleContent(locNoteRuleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.LOC_NOTE_TYPE: {
				LocNoteType locNoteType = (LocNoteType)theEObject;
				T result = caseLocNoteType(locNoteType);
				if (result == null) result = caseItsLocNoteContent(locNoteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.RBC_TYPE: {
				RbcType rbcType = (RbcType)theEObject;
				T result = caseRbcType(rbcType);
				if (result == null) result = caseItsRbcContent(rbcType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.RB_TYPE: {
				RbType rbType = (RbType)theEObject;
				T result = caseRbType(rbType);
				if (result == null) result = caseItsRbContent(rbType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.RP_TYPE: {
				RpType rpType = (RpType)theEObject;
				T result = caseRpType(rpType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.RTC_TYPE: {
				RtcType rtcType = (RtcType)theEObject;
				T result = caseRtcType(rtcType);
				if (result == null) result = caseItsRtcContent(rtcType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.RT_TYPE: {
				RtType rtType = (RtType)theEObject;
				T result = caseRtType(rtType);
				if (result == null) result = caseItsRtContent(rtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.RUBY_RULE_TYPE: {
				RubyRuleType rubyRuleType = (RubyRuleType)theEObject;
				T result = caseRubyRuleType(rubyRuleType);
				if (result == null) result = caseItsRubyRuleContent(rubyRuleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.RUBY_TEXT_TYPE: {
				RubyTextType rubyTextType = (RubyTextType)theEObject;
				T result = caseRubyTextType(rubyTextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.RUBY_TYPE: {
				RubyType rubyType = (RubyType)theEObject;
				T result = caseRubyType(rubyType);
				if (result == null) result = caseItsRubyContent(rubyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.RULES_TYPE: {
				RulesType rulesType = (RulesType)theEObject;
				T result = caseRulesType(rulesType);
				if (result == null) result = caseItsRulesContent(rulesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.SPAN_TYPE: {
				SpanType spanType = (SpanType)theEObject;
				T result = caseSpanType(spanType);
				if (result == null) result = caseItsSpanContent(spanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.TERM_RULE_TYPE: {
				TermRuleType termRuleType = (TermRuleType)theEObject;
				T result = caseTermRuleType(termRuleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.TRANSLATE_RULE_TYPE: {
				TranslateRuleType translateRuleType = (TranslateRuleType)theEObject;
				T result = caseTranslateRuleType(translateRuleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ItsPackage.WITHIN_TEXT_RULE_TYPE: {
				WithinTextRuleType withinTextRuleType = (WithinTextRuleType)theEObject;
				T result = caseWithinTextRuleType(withinTextRuleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dir Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dir Rule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirRuleType(DirRuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loc Note Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loc Note Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItsLocNoteContent(ItsLocNoteContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loc Note Rule Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loc Note Rule Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItsLocNoteRuleContent(ItsLocNoteRuleContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rbc Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rbc Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItsRbcContent(ItsRbcContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rb Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rb Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItsRbContent(ItsRbContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtc Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtc Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItsRtcContent(ItsRtcContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rt Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rt Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItsRtContent(ItsRtContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ruby Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ruby Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItsRubyContent(ItsRubyContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ruby Rule Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ruby Rule Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItsRubyRuleContent(ItsRubyRuleContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rules Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rules Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItsRulesContent(ItsRulesContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Span Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Span Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItsSpanContent(ItsSpanContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lang Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lang Rule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLangRuleType(LangRuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loc Note Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loc Note Rule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocNoteRuleType(LocNoteRuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loc Note Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loc Note Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocNoteType(LocNoteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rbc Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rbc Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRbcType(RbcType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rb Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rb Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRbType(RbType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rp Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rp Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRpType(RpType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rtc Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rtc Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtcType(RtcType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRtType(RtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ruby Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ruby Rule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRubyRuleType(RubyRuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ruby Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ruby Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRubyTextType(RubyTextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ruby Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ruby Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRubyType(RubyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rules Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rules Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRulesType(RulesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Span Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Span Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpanType(SpanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Rule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermRuleType(TermRuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Translate Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Translate Rule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTranslateRuleType(TranslateRuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Within Text Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Within Text Rule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWithinTextRuleType(WithinTextRuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //ItsSwitch
