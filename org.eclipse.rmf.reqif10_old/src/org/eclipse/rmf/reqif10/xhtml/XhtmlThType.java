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

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Th Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getXhtmlFlowMix <em>Xhtml Flow Mix</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getH1 <em>H1</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getH2 <em>H2</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getH3 <em>H3</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getH4 <em>H4</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getH5 <em>H5</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getH6 <em>H6</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getUl <em>Ul</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getOl <em>Ol</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getDl <em>Dl</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getP <em>P</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getDiv <em>Div</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getPre <em>Pre</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getAddress <em>Address</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getHr <em>Hr</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getTable <em>Table</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getBr <em>Br</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getSpan <em>Span</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getEm <em>Em</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getVar <em>Var</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getCite <em>Cite</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getQ <em>Q</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getTt <em>Tt</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getI <em>I</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getB <em>B</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getBig <em>Big</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getSmall <em>Small</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getSub <em>Sub</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getSup <em>Sup</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getA <em>A</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getIns <em>Ins</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getDel <em>Del</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getAbbr1 <em>Abbr1</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getAlign <em>Align</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getChar <em>Char</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getCharoff <em>Charoff</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getColspan <em>Colspan</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getHeaders <em>Headers</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getRowspan <em>Rowspan</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getSpace <em>Space</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getValign <em>Valign</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType()
 * @model extendedMetaData="name='xhtml.th.type' kind='mixed'"
 * @generated
 */
public interface XhtmlThType extends EObject {
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Xhtml Flow Mix</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xhtml Flow Mix</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xhtml Flow Mix</em>' attribute list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_XhtmlFlowMix()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='XhtmlFlowMix:1'"
	 * @generated
	 */
	FeatureMap getXhtmlFlowMix();

	/**
	 * Returns the value of the '<em><b>H1</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H1</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_H1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h1' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlH1Type> getH1();

	/**
	 * Returns the value of the '<em><b>H2</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H2</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_H2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h2' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlH2Type> getH2();

	/**
	 * Returns the value of the '<em><b>H3</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H3</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_H3()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h3' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlH3Type> getH3();

	/**
	 * Returns the value of the '<em><b>H4</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H4</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H4</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_H4()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h4' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlH4Type> getH4();

	/**
	 * Returns the value of the '<em><b>H5</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H5</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H5</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_H5()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h5' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlH5Type> getH5();

	/**
	 * Returns the value of the '<em><b>H6</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H6</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H6</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_H6()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h6' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlH6Type> getH6();

	/**
	 * Returns the value of the '<em><b>Ul</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlUlType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ul</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ul</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Ul()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ul' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlUlType> getUl();

	/**
	 * Returns the value of the '<em><b>Ol</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlOlType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ol</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ol</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Ol()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ol' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlOlType> getOl();

	/**
	 * Returns the value of the '<em><b>Dl</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlDlType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dl</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Dl()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dl' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlDlType> getDl();

	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_P()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlPType> getP();

	/**
	 * Returns the value of the '<em><b>Div</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Div</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Div</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Div()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='div' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlDivType> getDiv();

	/**
	 * Returns the value of the '<em><b>Pre</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Pre()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pre' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlPreType> getPre();

	/**
	 * Returns the value of the '<em><b>Blockquote</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blockquote</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blockquote</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Blockquote()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='blockquote' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlBlockquoteType> getBlockquote();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Address()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlAddressType> getAddress();

	/**
	 * Returns the value of the '<em><b>Hr</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlHrType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hr</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hr</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Hr()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hr' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlHrType> getHr();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Table()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlTableType> getTable();

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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Br()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='br' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Span()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='span' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Em()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='em' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Strong()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='strong' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Dfn()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dfn' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Code()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Samp()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='samp' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Kbd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='kbd' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Var()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='var' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Cite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cite' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Abbr()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abbr' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Acronym()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='acronym' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Q()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='q' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Tt()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tt' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_I()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='i' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_B()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='b' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Big()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='big' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Small()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='small' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Sub()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sub' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Sup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sup' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_A()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='a' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Object()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Ins()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ins' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Del()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='del' namespace='##targetNamespace' group='#XhtmlFlowMix:1'"
	 * @generated
	 */
	EList<XhtmlEditType> getDel();

	/**
	 * Returns the value of the '<em><b>Abbr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abbr1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbr1</em>' attribute.
	 * @see #setAbbr1(String)
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Abbr1()
	 * @model dataType="org.eclipse.rmf.reqif10.datatypes.Text"
	 *        extendedMetaData="kind='attribute' name='abbr'"
	 * @generated
	 */
	String getAbbr1();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getAbbr1 <em>Abbr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbr1</em>' attribute.
	 * @see #getAbbr1()
	 * @generated
	 */
	void setAbbr1(String value);

	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.rmf.reqif10.xhtml.AlignType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see org.eclipse.rmf.reqif10.xhtml.AlignType
	 * @see #isSetAlign()
	 * @see #unsetAlign()
	 * @see #setAlign(AlignType)
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Align()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='align'"
	 * @generated
	 */
	AlignType getAlign();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see org.eclipse.rmf.reqif10.xhtml.AlignType
	 * @see #isSetAlign()
	 * @see #unsetAlign()
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(AlignType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlign()
	 * @see #getAlign()
	 * @see #setAlign(AlignType)
	 * @generated
	 */
	void unsetAlign();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getAlign <em>Align</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Align</em>' attribute is set.
	 * @see #unsetAlign()
	 * @see #getAlign()
	 * @see #setAlign(AlignType)
	 * @generated
	 */
	boolean isSetAlign();

	/**
	 * Returns the value of the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' attribute.
	 * @see #setAxis(String)
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Axis()
	 * @model dataType="org.eclipse.rmf.reqif10.datatypes.CDATA"
	 *        extendedMetaData="kind='attribute' name='axis'"
	 * @generated
	 */
	String getAxis();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getAxis <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' attribute.
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(String value);

	/**
	 * Returns the value of the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char</em>' attribute.
	 * @see #setChar(String)
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Char()
	 * @model dataType="org.eclipse.rmf.reqif10.datatypes.Character"
	 *        extendedMetaData="kind='attribute' name='char'"
	 * @generated
	 */
	String getChar();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getChar <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char</em>' attribute.
	 * @see #getChar()
	 * @generated
	 */
	void setChar(String value);

	/**
	 * Returns the value of the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charoff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charoff</em>' attribute.
	 * @see #setCharoff(Object)
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Charoff()
	 * @model dataType="org.eclipse.rmf.reqif10.datatypes.Length"
	 *        extendedMetaData="kind='attribute' name='charoff'"
	 * @generated
	 */
	Object getCharoff();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getCharoff <em>Charoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charoff</em>' attribute.
	 * @see #getCharoff()
	 * @generated
	 */
	void setCharoff(Object value);

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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Colspan</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colspan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colspan</em>' attribute.
	 * @see #isSetColspan()
	 * @see #unsetColspan()
	 * @see #setColspan(BigInteger)
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Colspan()
	 * @model default="1" unsettable="true" dataType="org.eclipse.rmf.reqif10.datatypes.Number"
	 *        extendedMetaData="kind='attribute' name='colspan'"
	 * @generated
	 */
	BigInteger getColspan();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getColspan <em>Colspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colspan</em>' attribute.
	 * @see #isSetColspan()
	 * @see #unsetColspan()
	 * @see #getColspan()
	 * @generated
	 */
	void setColspan(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getColspan <em>Colspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColspan()
	 * @see #getColspan()
	 * @see #setColspan(BigInteger)
	 * @generated
	 */
	void unsetColspan();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getColspan <em>Colspan</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Colspan</em>' attribute is set.
	 * @see #unsetColspan()
	 * @see #getColspan()
	 * @see #setColspan(BigInteger)
	 * @generated
	 */
	boolean isSetColspan();

	/**
	 * Returns the value of the '<em><b>Headers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Headers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headers</em>' attribute.
	 * @see #setHeaders(List)
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Headers()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='headers'"
	 * @generated
	 */
	List<String> getHeaders();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getHeaders <em>Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Headers</em>' attribute.
	 * @see #getHeaders()
	 * @generated
	 */
	void setHeaders(List<String> value);

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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getId <em>Id</em>}' attribute.
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.namespace.LangType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Returns the value of the '<em><b>Rowspan</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rowspan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rowspan</em>' attribute.
	 * @see #isSetRowspan()
	 * @see #unsetRowspan()
	 * @see #setRowspan(BigInteger)
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Rowspan()
	 * @model default="1" unsettable="true" dataType="org.eclipse.rmf.reqif10.datatypes.Number"
	 *        extendedMetaData="kind='attribute' name='rowspan'"
	 * @generated
	 */
	BigInteger getRowspan();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getRowspan <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rowspan</em>' attribute.
	 * @see #isSetRowspan()
	 * @see #unsetRowspan()
	 * @see #getRowspan()
	 * @generated
	 */
	void setRowspan(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getRowspan <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRowspan()
	 * @see #getRowspan()
	 * @see #setRowspan(BigInteger)
	 * @generated
	 */
	void unsetRowspan();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getRowspan <em>Rowspan</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rowspan</em>' attribute is set.
	 * @see #unsetRowspan()
	 * @see #getRowspan()
	 * @see #setRowspan(BigInteger)
	 * @generated
	 */
	boolean isSetRowspan();

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.rmf.reqif10.xhtml.ScopeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see org.eclipse.rmf.reqif10.xhtml.ScopeType
	 * @see #isSetScope()
	 * @see #unsetScope()
	 * @see #setScope(ScopeType)
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Scope()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='scope'"
	 * @generated
	 */
	ScopeType getScope();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see org.eclipse.rmf.reqif10.xhtml.ScopeType
	 * @see #isSetScope()
	 * @see #unsetScope()
	 * @see #getScope()
	 * @generated
	 */
	void setScope(ScopeType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScope()
	 * @see #getScope()
	 * @see #setScope(ScopeType)
	 * @generated
	 */
	void unsetScope();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getScope <em>Scope</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scope</em>' attribute is set.
	 * @see #unsetScope()
	 * @see #getScope()
	 * @see #setScope(ScopeType)
	 * @generated
	 */
	boolean isSetScope();

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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Space()
	 * @model default="preserve" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='space' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	SpaceType getSpace();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getSpace <em>Space</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getSpace <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpace()
	 * @see #getSpace()
	 * @see #setSpace(SpaceType)
	 * @generated
	 */
	void unsetSpace();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getSpace <em>Space</em>}' attribute is set.
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Style()
	 * @model dataType="org.eclipse.rmf.reqif10.datatypes.CDATA"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getStyle <em>Style</em>}' attribute.
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Valign</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.rmf.reqif10.xhtml.ValignType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valign</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valign</em>' attribute.
	 * @see org.eclipse.rmf.reqif10.xhtml.ValignType
	 * @see #isSetValign()
	 * @see #unsetValign()
	 * @see #setValign(ValignType)
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlThType_Valign()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='valign'"
	 * @generated
	 */
	ValignType getValign();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getValign <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valign</em>' attribute.
	 * @see org.eclipse.rmf.reqif10.xhtml.ValignType
	 * @see #isSetValign()
	 * @see #unsetValign()
	 * @see #getValign()
	 * @generated
	 */
	void setValign(ValignType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getValign <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValign()
	 * @see #getValign()
	 * @see #setValign(ValignType)
	 * @generated
	 */
	void unsetValign();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getValign <em>Valign</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valign</em>' attribute is set.
	 * @see #unsetValign()
	 * @see #getValign()
	 * @see #setValign(ValignType)
	 * @generated
	 */
	boolean isSetValign();

} // XhtmlThType
