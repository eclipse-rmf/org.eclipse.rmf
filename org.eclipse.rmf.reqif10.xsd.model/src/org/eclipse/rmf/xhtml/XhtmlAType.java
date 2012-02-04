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

package org.eclipse.rmf.xhtml;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getXhtmlInlNoAnchorMix <em>Xhtml Inl No Anchor Mix</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getBr <em>Br</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getSpan <em>Span</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getEm <em>Em</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getVar <em>Var</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getCite <em>Cite</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getQ <em>Q</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getTt <em>Tt</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getI <em>I</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getB <em>B</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getBig <em>Big</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getSmall <em>Small</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getSub <em>Sub</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getSup <em>Sup</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getIns <em>Ins</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getDel <em>Del</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getAccesskey <em>Accesskey</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getHref <em>Href</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getHreflang <em>Hreflang</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getRel <em>Rel</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getRev <em>Rev</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getSpace <em>Space</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getTabindex <em>Tabindex</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlAType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType()
 * @model extendedMetaData="name='xhtml.a.type' kind='mixed'"
 * @generated
 */
public interface XhtmlAType extends EObject {
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
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Xhtml Inl No Anchor Mix</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xhtml Inl No Anchor Mix</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xhtml Inl No Anchor Mix</em>' attribute list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_XhtmlInlNoAnchorMix()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='XhtmlInlNoAnchorMix:1'"
	 * @generated
	 */
	FeatureMap getXhtmlInlNoAnchorMix();

	/**
	 * Returns the value of the '<em><b>Br</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlBrType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Br</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Br</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Br()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='br' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
	 * @generated
	 */
	EList<XhtmlBrType> getBr();

	/**
	 * Returns the value of the '<em><b>Span</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlSpanType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Span</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Span()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='span' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
	 * @generated
	 */
	EList<XhtmlSpanType> getSpan();

	/**
	 * Returns the value of the '<em><b>Em</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlEmType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Em</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Em</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Em()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='em' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
	 * @generated
	 */
	EList<XhtmlEmType> getEm();

	/**
	 * Returns the value of the '<em><b>Strong</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlStrongType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strong</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strong</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Strong()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='strong' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
	 * @generated
	 */
	EList<XhtmlStrongType> getStrong();

	/**
	 * Returns the value of the '<em><b>Dfn</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlDfnType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dfn</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dfn</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Dfn()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dfn' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
	 * @generated
	 */
	EList<XhtmlDfnType> getDfn();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlCodeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Code()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
	 * @generated
	 */
	EList<XhtmlCodeType> getCode();

	/**
	 * Returns the value of the '<em><b>Samp</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlSampType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Samp</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Samp</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Samp()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='samp' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
	 * @generated
	 */
	EList<XhtmlSampType> getSamp();

	/**
	 * Returns the value of the '<em><b>Kbd</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlKbdType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kbd</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kbd</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Kbd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='kbd' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
	 * @generated
	 */
	EList<XhtmlKbdType> getKbd();

	/**
	 * Returns the value of the '<em><b>Var</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlVarType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Var()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='var' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
	 * @generated
	 */
	EList<XhtmlVarType> getVar();

	/**
	 * Returns the value of the '<em><b>Cite</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlCiteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cite</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cite</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Cite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cite' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
	 * @generated
	 */
	EList<XhtmlCiteType> getCite();

	/**
	 * Returns the value of the '<em><b>Abbr</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlAbbrType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abbr</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbr</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Abbr()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abbr' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
	 * @generated
	 */
	EList<XhtmlAbbrType> getAbbr();

	/**
	 * Returns the value of the '<em><b>Acronym</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlAcronymType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acronym</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acronym</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Acronym()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='acronym' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
	 * @generated
	 */
	EList<XhtmlAcronymType> getAcronym();

	/**
	 * Returns the value of the '<em><b>Q</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlQType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Q</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Q</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Q()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='q' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
	 * @generated
	 */
	EList<XhtmlQType> getQ();

	/**
	 * Returns the value of the '<em><b>Tt</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tt</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tt</em>' attribute list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Tt()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tt' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
	 * @generated
	 */
	EList<Object> getTt();

	/**
	 * Returns the value of the '<em><b>I</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>I</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>I</em>' attribute list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_I()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='i' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
	 * @generated
	 */
	EList<Object> getI();

	/**
	 * Returns the value of the '<em><b>B</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' attribute list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_B()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='b' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
	 * @generated
	 */
	EList<Object> getB();

	/**
	 * Returns the value of the '<em><b>Big</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Big</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Big</em>' attribute list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Big()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='big' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
	 * @generated
	 */
	EList<Object> getBig();

	/**
	 * Returns the value of the '<em><b>Small</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Small</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Small</em>' attribute list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Small()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='small' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
	 * @generated
	 */
	EList<Object> getSmall();

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub</em>' attribute list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Sub()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sub' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
	 * @generated
	 */
	EList<Object> getSub();

	/**
	 * Returns the value of the '<em><b>Sup</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sup</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sup</em>' attribute list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Sup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sup' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
	 * @generated
	 */
	EList<Object> getSup();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlObjectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Object()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
	 * @generated
	 */
	EList<XhtmlObjectType> getObject();

	/**
	 * Returns the value of the '<em><b>Ins</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlEditType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ins</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Ins()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ins' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
	 * @generated
	 */
	EList<XhtmlEditType> getIns();

	/**
	 * Returns the value of the '<em><b>Del</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlEditType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Del</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Del</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Del()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='del' namespace='##targetNamespace' group='#XhtmlInlNoAnchorMix:1'"
	 * @generated
	 */
	EList<XhtmlEditType> getDel();

	/**
	 * Returns the value of the '<em><b>Accesskey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accesskey</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accesskey</em>' attribute.
	 * @see #setAccesskey(String)
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Accesskey()
	 * @model dataType="org.eclipse.rmf.datatypes.Character"
	 *        extendedMetaData="kind='attribute' name='accesskey'"
	 * @generated
	 */
	String getAccesskey();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlAType#getAccesskey <em>Accesskey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accesskey</em>' attribute.
	 * @see #getAccesskey()
	 * @generated
	 */
	void setAccesskey(String value);

	/**
	 * Returns the value of the '<em><b>Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charset</em>' attribute.
	 * @see #setCharset(String)
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Charset()
	 * @model dataType="org.eclipse.rmf.datatypes.Charset"
	 *        extendedMetaData="kind='attribute' name='charset'"
	 * @generated
	 */
	String getCharset();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlAType#getCharset <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charset</em>' attribute.
	 * @see #getCharset()
	 * @generated
	 */
	void setCharset(String value);

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
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlAType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Href</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Href()
	 * @model dataType="org.eclipse.rmf.datatypes.URI"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlAType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Hreflang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hreflang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hreflang</em>' attribute.
	 * @see #setHreflang(String)
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Hreflang()
	 * @model dataType="org.eclipse.rmf.datatypes.LanguageCode"
	 *        extendedMetaData="kind='attribute' name='hreflang'"
	 * @generated
	 */
	String getHreflang();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlAType#getHreflang <em>Hreflang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hreflang</em>' attribute.
	 * @see #getHreflang()
	 * @generated
	 */
	void setHreflang(String value);

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
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlAType#getId <em>Id</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Lang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(Object)
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getLang();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlAType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(Object value);

	/**
	 * Returns the value of the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel</em>' attribute.
	 * @see #setRel(List)
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Rel()
	 * @model dataType="org.eclipse.rmf.datatypes.LinkTypes" many="false"
	 *        extendedMetaData="kind='attribute' name='rel'"
	 * @generated
	 */
	List<String> getRel();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlAType#getRel <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel</em>' attribute.
	 * @see #getRel()
	 * @generated
	 */
	void setRel(List<String> value);

	/**
	 * Returns the value of the '<em><b>Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rev</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rev</em>' attribute.
	 * @see #setRev(List)
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Rev()
	 * @model dataType="org.eclipse.rmf.datatypes.LinkTypes" many="false"
	 *        extendedMetaData="kind='attribute' name='rev'"
	 * @generated
	 */
	List<String> getRev();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlAType#getRev <em>Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rev</em>' attribute.
	 * @see #getRev()
	 * @generated
	 */
	void setRev(List<String> value);

	/**
	 * Returns the value of the '<em><b>Space</b></em>' attribute.
	 * The default value is <code>"preserve"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Space</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space</em>' attribute.
	 * @see #isSetSpace()
	 * @see #unsetSpace()
	 * @see #setSpace(Object)
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Space()
	 * @model default="preserve" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='space' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getSpace();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlAType#getSpace <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space</em>' attribute.
	 * @see #isSetSpace()
	 * @see #unsetSpace()
	 * @see #getSpace()
	 * @generated
	 */
	void setSpace(Object value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlAType#getSpace <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpace()
	 * @see #getSpace()
	 * @see #setSpace(Object)
	 * @generated
	 */
	void unsetSpace();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.xhtml.XhtmlAType#getSpace <em>Space</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Space</em>' attribute is set.
	 * @see #unsetSpace()
	 * @see #getSpace()
	 * @see #setSpace(Object)
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
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Style()
	 * @model dataType="org.eclipse.rmf.datatypes.CDATA"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlAType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Tabindex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tabindex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabindex</em>' attribute.
	 * @see #setTabindex(BigInteger)
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Tabindex()
	 * @model dataType="org.eclipse.rmf.datatypes.Number"
	 *        extendedMetaData="kind='attribute' name='tabindex'"
	 * @generated
	 */
	BigInteger getTabindex();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlAType#getTabindex <em>Tabindex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabindex</em>' attribute.
	 * @see #getTabindex()
	 * @generated
	 */
	void setTabindex(BigInteger value);

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
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlAType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlAType_Type()
	 * @model dataType="org.eclipse.rmf.datatypes.ContentType"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlAType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // XhtmlAType
