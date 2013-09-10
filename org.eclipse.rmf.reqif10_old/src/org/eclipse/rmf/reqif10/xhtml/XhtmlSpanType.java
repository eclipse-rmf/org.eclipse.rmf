/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.reqif10.xhtml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Span Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getXhtmlInlineMix <em>Xhtml Inline Mix</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getBr <em>Br</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getSpan <em>Span</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getEm <em>Em</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getVar <em>Var</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getCite <em>Cite</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getQ <em>Q</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getTt <em>Tt</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getI <em>I</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getB <em>B</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getBig <em>Big</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getSmall <em>Small</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getSub <em>Sub</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getSup <em>Sup</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getA <em>A</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getIns <em>Ins</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getDel <em>Del</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getSpace <em>Space</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType()
 * @model extendedMetaData="name='xhtml.span.type' kind='mixed'"
 * @generated
 */
public interface XhtmlSpanType extends EObject {
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Xhtml Inline Mix</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xhtml Inline Mix</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xhtml Inline Mix</em>' attribute list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_XhtmlInlineMix()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='XhtmlInlineMix:1'"
	 * @generated
	 */
	FeatureMap getXhtmlInlineMix();

	/**
	 * Returns the value of the '<em><b>Br</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlBrType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Br</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Br</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Br()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='br' namespace='##targetNamespace' group='#XhtmlInlineMix:1'"
	 * @generated
	 */
	EList<XhtmlBrType> getBr();

	/**
	 * Returns the value of the '<em><b>Span</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Span</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Span()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='span' namespace='##targetNamespace' group='#XhtmlInlineMix:1'"
	 * @generated
	 */
	EList<XhtmlSpanType> getSpan();

	/**
	 * Returns the value of the '<em><b>Em</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Em</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Em</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Em()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='em' namespace='##targetNamespace' group='#XhtmlInlineMix:1'"
	 * @generated
	 */
	EList<XhtmlEmType> getEm();

	/**
	 * Returns the value of the '<em><b>Strong</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strong</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strong</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Strong()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='strong' namespace='##targetNamespace' group='#XhtmlInlineMix:1'"
	 * @generated
	 */
	EList<XhtmlStrongType> getStrong();

	/**
	 * Returns the value of the '<em><b>Dfn</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dfn</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dfn</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Dfn()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dfn' namespace='##targetNamespace' group='#XhtmlInlineMix:1'"
	 * @generated
	 */
	EList<XhtmlDfnType> getDfn();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Code()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace' group='#XhtmlInlineMix:1'"
	 * @generated
	 */
	EList<XhtmlCodeType> getCode();

	/**
	 * Returns the value of the '<em><b>Samp</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Samp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Samp</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Samp()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='samp' namespace='##targetNamespace' group='#XhtmlInlineMix:1'"
	 * @generated
	 */
	EList<XhtmlSampType> getSamp();

	/**
	 * Returns the value of the '<em><b>Kbd</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kbd</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kbd</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Kbd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='kbd' namespace='##targetNamespace' group='#XhtmlInlineMix:1'"
	 * @generated
	 */
	EList<XhtmlKbdType> getKbd();

	/**
	 * Returns the value of the '<em><b>Var</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Var()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='var' namespace='##targetNamespace' group='#XhtmlInlineMix:1'"
	 * @generated
	 */
	EList<XhtmlVarType> getVar();

	/**
	 * Returns the value of the '<em><b>Cite</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cite</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Cite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cite' namespace='##targetNamespace' group='#XhtmlInlineMix:1'"
	 * @generated
	 */
	EList<XhtmlCiteType> getCite();

	/**
	 * Returns the value of the '<em><b>Abbr</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abbr</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbr</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Abbr()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abbr' namespace='##targetNamespace' group='#XhtmlInlineMix:1'"
	 * @generated
	 */
	EList<XhtmlAbbrType> getAbbr();

	/**
	 * Returns the value of the '<em><b>Acronym</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acronym</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acronym</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Acronym()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='acronym' namespace='##targetNamespace' group='#XhtmlInlineMix:1'"
	 * @generated
	 */
	EList<XhtmlAcronymType> getAcronym();

	/**
	 * Returns the value of the '<em><b>Q</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Q</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Q</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Q()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='q' namespace='##targetNamespace' group='#XhtmlInlineMix:1'"
	 * @generated
	 */
	EList<XhtmlQType> getQ();

	/**
	 * Returns the value of the '<em><b>Tt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tt</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tt</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Tt()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tt' namespace='##targetNamespace' group='#XhtmlInlineMix:1'"
	 * @generated
	 */
	EList<XhtmlInlPresType> getTt();

	/**
	 * Returns the value of the '<em><b>I</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_I()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='i' namespace='##targetNamespace' group='#XhtmlInlineMix:1'"
	 * @generated
	 */
	EList<XhtmlInlPresType> getI();

	/**
	 * Returns the value of the '<em><b>B</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_B()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='b' namespace='##targetNamespace' group='#XhtmlInlineMix:1'"
	 * @generated
	 */
	EList<XhtmlInlPresType> getB();

	/**
	 * Returns the value of the '<em><b>Big</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Big</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Big</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Big()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='big' namespace='##targetNamespace' group='#XhtmlInlineMix:1'"
	 * @generated
	 */
	EList<XhtmlInlPresType> getBig();

	/**
	 * Returns the value of the '<em><b>Small</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Small</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Small</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Small()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='small' namespace='##targetNamespace' group='#XhtmlInlineMix:1'"
	 * @generated
	 */
	EList<XhtmlInlPresType> getSmall();

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Sub()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sub' namespace='##targetNamespace' group='#XhtmlInlineMix:1'"
	 * @generated
	 */
	EList<XhtmlInlPresType> getSub();

	/**
	 * Returns the value of the '<em><b>Sup</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sup</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sup</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Sup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sup' namespace='##targetNamespace' group='#XhtmlInlineMix:1'"
	 * @generated
	 */
	EList<XhtmlInlPresType> getSup();

	/**
	 * Returns the value of the '<em><b>A</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_A()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='a' namespace='##targetNamespace' group='#XhtmlInlineMix:1'"
	 * @generated
	 */
	EList<XhtmlAType> getA();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Object()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object' namespace='##targetNamespace' group='#XhtmlInlineMix:1'"
	 * @generated
	 */
	EList<XhtmlObjectType> getObject();

	/**
	 * Returns the value of the '<em><b>Ins</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ins</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Ins()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ins' namespace='##targetNamespace' group='#XhtmlInlineMix:1'"
	 * @generated
	 */
	EList<XhtmlEditType> getIns();

	/**
	 * Returns the value of the '<em><b>Del</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Del</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Del</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Del()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='del' namespace='##targetNamespace' group='#XhtmlInlineMix:1'"
	 * @generated
	 */
	EList<XhtmlEditType> getDel();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *     <div xmlns="http://www.w3.org/1999/xhtml">
	 *      
	 *       <h3>lang (as an attribute name)</h3>
	 *       <p>
	 *        denotes an attribute whose value
	 *        is a language code for the natural language of the content of
	 *        any element; its value is inherited.  This name is reserved
	 *        by virtue of its definition in the XML specification.</p>
	 *      
	 *     </div>
	 *     <div xmlns="http://www.w3.org/1999/xhtml">
	 *      <h4>Notes</h4>
	 *      <p>
	 *       Attempting to install the relevant ISO 2- and 3-letter
	 *       codes as the enumerated possible values is probably never
	 *       going to be a realistic possibility.  
	 *      </p>
	 *      <p>
	 *       See BCP 47 at <a href="http://www.rfc-editor.org/rfc/bcp/bcp47.txt">
	 *        http://www.rfc-editor.org/rfc/bcp/bcp47.txt</a>
	 *       and the IANA language subtag registry at
	 *       <a href="http://www.iana.org/assignments/language-subtag-registry">
	 *        http://www.iana.org/assignments/language-subtag-registry</a>
	 *       for further information.
	 *      </p>
	 *      <p>
	 *       The union allows for the 'un-declaration' of xml:lang with
	 *       the empty string.
	 *      </p>
	 *     </div>
	 *    
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(String)
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.namespace.LangType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Returns the value of the '<em><b>Space</b></em>' attribute.
	 * The default value is <code>"preserve"</code>.
	 * The literals are from the enumeration {@link org.eclipse.emf.ecore.xml.namespace.SpaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *     <div xmlns="http://www.w3.org/1999/xhtml">
	 *      
	 *       <h3>space (as an attribute name)</h3>
	 *       <p>
	 *        denotes an attribute whose
	 *        value is a keyword indicating what whitespace processing
	 *        discipline is intended for the content of the element; its
	 *        value is inherited.  This name is reserved by virtue of its
	 *        definition in the XML specification.</p>
	 *      
	 *     </div>
	 *    
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Space</em>' attribute.
	 * @see org.eclipse.emf.ecore.xml.namespace.SpaceType
	 * @see #isSetSpace()
	 * @see #unsetSpace()
	 * @see #setSpace(SpaceType)
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Space()
	 * @model default="preserve" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='space' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	SpaceType getSpace();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getSpace <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space</em>' attribute.
	 * @see org.eclipse.emf.ecore.xml.namespace.SpaceType
	 * @see #isSetSpace()
	 * @see #unsetSpace()
	 * @see #getSpace()
	 * @generated
	 */
	void setSpace(SpaceType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getSpace <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpace()
	 * @see #getSpace()
	 * @see #setSpace(SpaceType)
	 * @generated
	 */
	void unsetSpace();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getSpace <em>Space</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Space</em>' attribute is set.
	 * @see #unsetSpace()
	 * @see #getSpace()
	 * @see #setSpace(SpaceType)
	 * @generated
	 */
	boolean isSetSpace();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Style()
	 * @model dataType="org.eclipse.rmf.reqif10.datatypes.CDATA"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlSpanType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // XhtmlSpanType
