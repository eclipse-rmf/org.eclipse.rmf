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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.rif12.its.ItsPackage
 * @generated
 */
public class ItsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ItsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ItsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItsSwitch<Adapter> modelSwitch =
		new ItsSwitch<Adapter>() {
			@Override
			public Adapter caseDirRuleType(DirRuleType object) {
				return createDirRuleTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseItsLocNoteContent(ItsLocNoteContent object) {
				return createItsLocNoteContentAdapter();
			}
			@Override
			public Adapter caseItsLocNoteRuleContent(ItsLocNoteRuleContent object) {
				return createItsLocNoteRuleContentAdapter();
			}
			@Override
			public Adapter caseItsRbcContent(ItsRbcContent object) {
				return createItsRbcContentAdapter();
			}
			@Override
			public Adapter caseItsRbContent(ItsRbContent object) {
				return createItsRbContentAdapter();
			}
			@Override
			public Adapter caseItsRtcContent(ItsRtcContent object) {
				return createItsRtcContentAdapter();
			}
			@Override
			public Adapter caseItsRtContent(ItsRtContent object) {
				return createItsRtContentAdapter();
			}
			@Override
			public Adapter caseItsRubyContent(ItsRubyContent object) {
				return createItsRubyContentAdapter();
			}
			@Override
			public Adapter caseItsRubyRuleContent(ItsRubyRuleContent object) {
				return createItsRubyRuleContentAdapter();
			}
			@Override
			public Adapter caseItsRulesContent(ItsRulesContent object) {
				return createItsRulesContentAdapter();
			}
			@Override
			public Adapter caseItsSpanContent(ItsSpanContent object) {
				return createItsSpanContentAdapter();
			}
			@Override
			public Adapter caseLangRuleType(LangRuleType object) {
				return createLangRuleTypeAdapter();
			}
			@Override
			public Adapter caseLocNoteRuleType(LocNoteRuleType object) {
				return createLocNoteRuleTypeAdapter();
			}
			@Override
			public Adapter caseLocNoteType(LocNoteType object) {
				return createLocNoteTypeAdapter();
			}
			@Override
			public Adapter caseRbcType(RbcType object) {
				return createRbcTypeAdapter();
			}
			@Override
			public Adapter caseRbType(RbType object) {
				return createRbTypeAdapter();
			}
			@Override
			public Adapter caseRpType(RpType object) {
				return createRpTypeAdapter();
			}
			@Override
			public Adapter caseRtcType(RtcType object) {
				return createRtcTypeAdapter();
			}
			@Override
			public Adapter caseRtType(RtType object) {
				return createRtTypeAdapter();
			}
			@Override
			public Adapter caseRubyRuleType(RubyRuleType object) {
				return createRubyRuleTypeAdapter();
			}
			@Override
			public Adapter caseRubyTextType(RubyTextType object) {
				return createRubyTextTypeAdapter();
			}
			@Override
			public Adapter caseRubyType(RubyType object) {
				return createRubyTypeAdapter();
			}
			@Override
			public Adapter caseRulesType(RulesType object) {
				return createRulesTypeAdapter();
			}
			@Override
			public Adapter caseSpanType(SpanType object) {
				return createSpanTypeAdapter();
			}
			@Override
			public Adapter caseTermRuleType(TermRuleType object) {
				return createTermRuleTypeAdapter();
			}
			@Override
			public Adapter caseTranslateRuleType(TranslateRuleType object) {
				return createTranslateRuleTypeAdapter();
			}
			@Override
			public Adapter caseWithinTextRuleType(WithinTextRuleType object) {
				return createWithinTextRuleTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.DirRuleType <em>Dir Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.DirRuleType
	 * @generated
	 */
	public Adapter createDirRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.ItsLocNoteContent <em>Loc Note Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.ItsLocNoteContent
	 * @generated
	 */
	public Adapter createItsLocNoteContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.ItsLocNoteRuleContent <em>Loc Note Rule Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.ItsLocNoteRuleContent
	 * @generated
	 */
	public Adapter createItsLocNoteRuleContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.ItsRbcContent <em>Rbc Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.ItsRbcContent
	 * @generated
	 */
	public Adapter createItsRbcContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.ItsRbContent <em>Rb Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.ItsRbContent
	 * @generated
	 */
	public Adapter createItsRbContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.ItsRtcContent <em>Rtc Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.ItsRtcContent
	 * @generated
	 */
	public Adapter createItsRtcContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.ItsRtContent <em>Rt Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.ItsRtContent
	 * @generated
	 */
	public Adapter createItsRtContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.ItsRubyContent <em>Ruby Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.ItsRubyContent
	 * @generated
	 */
	public Adapter createItsRubyContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.ItsRubyRuleContent <em>Ruby Rule Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.ItsRubyRuleContent
	 * @generated
	 */
	public Adapter createItsRubyRuleContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.ItsRulesContent <em>Rules Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.ItsRulesContent
	 * @generated
	 */
	public Adapter createItsRulesContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.ItsSpanContent <em>Span Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.ItsSpanContent
	 * @generated
	 */
	public Adapter createItsSpanContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.LangRuleType <em>Lang Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.LangRuleType
	 * @generated
	 */
	public Adapter createLangRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.LocNoteRuleType <em>Loc Note Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.LocNoteRuleType
	 * @generated
	 */
	public Adapter createLocNoteRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.LocNoteType <em>Loc Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.LocNoteType
	 * @generated
	 */
	public Adapter createLocNoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.RbcType <em>Rbc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.RbcType
	 * @generated
	 */
	public Adapter createRbcTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.RbType <em>Rb Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.RbType
	 * @generated
	 */
	public Adapter createRbTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.RpType <em>Rp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.RpType
	 * @generated
	 */
	public Adapter createRpTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.RtcType <em>Rtc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.RtcType
	 * @generated
	 */
	public Adapter createRtcTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.RtType <em>Rt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.RtType
	 * @generated
	 */
	public Adapter createRtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.RubyRuleType <em>Ruby Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.RubyRuleType
	 * @generated
	 */
	public Adapter createRubyRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.RubyTextType <em>Ruby Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.RubyTextType
	 * @generated
	 */
	public Adapter createRubyTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.RubyType <em>Ruby Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.RubyType
	 * @generated
	 */
	public Adapter createRubyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.RulesType <em>Rules Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.RulesType
	 * @generated
	 */
	public Adapter createRulesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.SpanType <em>Span Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.SpanType
	 * @generated
	 */
	public Adapter createSpanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.TermRuleType <em>Term Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.TermRuleType
	 * @generated
	 */
	public Adapter createTermRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.TranslateRuleType <em>Translate Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.TranslateRuleType
	 * @generated
	 */
	public Adapter createTranslateRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif12.its.WithinTextRuleType <em>Within Text Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif12.its.WithinTextRuleType
	 * @generated
	 */
	public Adapter createWithinTextRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ItsAdapterFactory
