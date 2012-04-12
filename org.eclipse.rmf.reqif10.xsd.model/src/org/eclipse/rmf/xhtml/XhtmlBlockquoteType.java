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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blockquote Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getXhtmlBlockMix <em>Xhtml Block Mix</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getH1 <em>H1</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getH2 <em>H2</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getH3 <em>H3</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getH4 <em>H4</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getH5 <em>H5</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getH6 <em>H6</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getUl <em>Ul</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getOl <em>Ol</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getDl <em>Dl</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getP <em>P</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getDiv <em>Div</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getPre <em>Pre</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getAddress <em>Address</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getHr <em>Hr</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getTable <em>Table</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getIns <em>Ins</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getDel <em>Del</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getCite <em>Cite</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getSpace <em>Space</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType()
 * @model extendedMetaData="name='xhtml.blockquote.type' kind='elementOnly'"
 * @generated
 */
public interface XhtmlBlockquoteType extends EObject {
	/**
	 * Returns the value of the '<em><b>Xhtml Block Mix</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xhtml Block Mix</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xhtml Block Mix</em>' attribute list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType_XhtmlBlockMix()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='XhtmlBlockMix:0'"
	 * @generated
	 */
	FeatureMap getXhtmlBlockMix();

	/**
	 * Returns the value of the '<em><b>H1</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlH1Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H1</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType_H1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h1' namespace='##targetNamespace' group='#XhtmlBlockMix:0'"
	 * @generated
	 */
	EList<XhtmlH1Type> getH1();

	/**
	 * Returns the value of the '<em><b>H2</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlH2Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H2</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType_H2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h2' namespace='##targetNamespace' group='#XhtmlBlockMix:0'"
	 * @generated
	 */
	EList<XhtmlH2Type> getH2();

	/**
	 * Returns the value of the '<em><b>H3</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlH3Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H3</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType_H3()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h3' namespace='##targetNamespace' group='#XhtmlBlockMix:0'"
	 * @generated
	 */
	EList<XhtmlH3Type> getH3();

	/**
	 * Returns the value of the '<em><b>H4</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlH4Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H4</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H4</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType_H4()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h4' namespace='##targetNamespace' group='#XhtmlBlockMix:0'"
	 * @generated
	 */
	EList<XhtmlH4Type> getH4();

	/**
	 * Returns the value of the '<em><b>H5</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlH5Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H5</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H5</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType_H5()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h5' namespace='##targetNamespace' group='#XhtmlBlockMix:0'"
	 * @generated
	 */
	EList<XhtmlH5Type> getH5();

	/**
	 * Returns the value of the '<em><b>H6</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlH6Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H6</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H6</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType_H6()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h6' namespace='##targetNamespace' group='#XhtmlBlockMix:0'"
	 * @generated
	 */
	EList<XhtmlH6Type> getH6();

	/**
	 * Returns the value of the '<em><b>Ul</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlUlType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ul</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ul</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType_Ul()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ul' namespace='##targetNamespace' group='#XhtmlBlockMix:0'"
	 * @generated
	 */
	EList<XhtmlUlType> getUl();

	/**
	 * Returns the value of the '<em><b>Ol</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlOlType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ol</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ol</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType_Ol()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ol' namespace='##targetNamespace' group='#XhtmlBlockMix:0'"
	 * @generated
	 */
	EList<XhtmlOlType> getOl();

	/**
	 * Returns the value of the '<em><b>Dl</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlDlType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dl</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType_Dl()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dl' namespace='##targetNamespace' group='#XhtmlBlockMix:0'"
	 * @generated
	 */
	EList<XhtmlDlType> getDl();

	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlPType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType_P()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace' group='#XhtmlBlockMix:0'"
	 * @generated
	 */
	EList<XhtmlPType> getP();

	/**
	 * Returns the value of the '<em><b>Div</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlDivType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Div</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Div</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType_Div()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='div' namespace='##targetNamespace' group='#XhtmlBlockMix:0'"
	 * @generated
	 */
	EList<XhtmlDivType> getDiv();

	/**
	 * Returns the value of the '<em><b>Pre</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlPreType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType_Pre()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pre' namespace='##targetNamespace' group='#XhtmlBlockMix:0'"
	 * @generated
	 */
	EList<XhtmlPreType> getPre();

	/**
	 * Returns the value of the '<em><b>Blockquote</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blockquote</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blockquote</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType_Blockquote()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='blockquote' namespace='##targetNamespace' group='#XhtmlBlockMix:0'"
	 * @generated
	 */
	EList<XhtmlBlockquoteType> getBlockquote();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlAddressType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType_Address()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace' group='#XhtmlBlockMix:0'"
	 * @generated
	 */
	EList<XhtmlAddressType> getAddress();

	/**
	 * Returns the value of the '<em><b>Hr</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hr</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hr</em>' attribute list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType_Hr()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hr' namespace='##targetNamespace' group='#XhtmlBlockMix:0'"
	 * @generated
	 */
	EList<Object> getHr();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.xhtml.XhtmlTableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType_Table()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table' namespace='##targetNamespace' group='#XhtmlBlockMix:0'"
	 * @generated
	 */
	EList<XhtmlTableType> getTable();

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
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType_Ins()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ins' namespace='##targetNamespace' group='#XhtmlBlockMix:0'"
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
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType_Del()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='del' namespace='##targetNamespace' group='#XhtmlBlockMix:0'"
	 * @generated
	 */
	EList<XhtmlEditType> getDel();

	/**
	 * Returns the value of the '<em><b>Cite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cite</em>' attribute.
	 * @see #setCite(String)
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType_Cite()
	 * @model dataType="org.eclipse.rmf.datatypes.URI"
	 *        extendedMetaData="kind='attribute' name='cite'"
	 * @generated
	 */
	String getCite();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getCite <em>Cite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cite</em>' attribute.
	 * @see #getCite()
	 * @generated
	 */
	void setCite(String value);

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
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getClass_ <em>Class</em>}' attribute.
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
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getId <em>Id</em>}' attribute.
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
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getLang();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(Object value);

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
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType_Space()
	 * @model default="preserve" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='space' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getSpace();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getSpace <em>Space</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getSpace <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpace()
	 * @see #getSpace()
	 * @see #setSpace(Object)
	 * @generated
	 */
	void unsetSpace();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getSpace <em>Space</em>}' attribute is set.
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
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType_Style()
	 * @model dataType="org.eclipse.rmf.datatypes.CDATA"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getStyle <em>Style</em>}' attribute.
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
	 * @see org.eclipse.rmf.xhtml.XhtmlPackage#getXhtmlBlockquoteType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.xhtml.XhtmlBlockquoteType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // XhtmlBlockquoteType
