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

package org.eclipse.rmf.rif12.xhtml;

import java.math.BigInteger;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getParam <em>Param</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getP <em>P</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getH1 <em>H1</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getH2 <em>H2</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getH3 <em>H3</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getH4 <em>H4</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getH5 <em>H5</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getH6 <em>H6</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getDiv <em>Div</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getUl <em>Ul</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getOl <em>Ol</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getDl <em>Dl</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getPre <em>Pre</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getHr <em>Hr</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getAddress <em>Address</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getTable <em>Table</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getA <em>A</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getBr <em>Br</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getSpan <em>Span</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getImg <em>Img</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getTt <em>Tt</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getI <em>I</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getB <em>B</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getBig <em>Big</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getSmall <em>Small</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getU <em>U</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getStrike <em>Strike</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getEm <em>Em</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getQ <em>Q</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getVar <em>Var</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getCite <em>Cite</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getSub <em>Sub</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getSup <em>Sup</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getIns <em>Ins</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getDel <em>Del</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getArchive <em>Archive</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getClassid <em>Classid</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getCodebase <em>Codebase</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getCodetype <em>Codetype</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getData <em>Data</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getDeclare <em>Declare</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getStandby <em>Standby</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getTabindex <em>Tabindex</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getUsemap <em>Usemap</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType()
 * @model extendedMetaData="name='object_._type' kind='mixed'"
 * @generated
 */
public interface ObjectType extends EObject {
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
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

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
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.ParamType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       param is used to supply a named property value.
	 *       In XML it would seem natural to follow RDF and support an
	 *       abbreviated syntax where the param elements are replaced
	 *       by attribute value pairs on the object start tag.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Param</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Param()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ParamType> getParam();

	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.PType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_P()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PType> getP();

	/**
	 * Returns the value of the '<em><b>H1</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.H1Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H1</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_H1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h1' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<H1Type> getH1();

	/**
	 * Returns the value of the '<em><b>H2</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.H2Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H2</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_H2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h2' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<H2Type> getH2();

	/**
	 * Returns the value of the '<em><b>H3</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.H3Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H3</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_H3()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h3' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<H3Type> getH3();

	/**
	 * Returns the value of the '<em><b>H4</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.H4Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H4</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H4</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_H4()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h4' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<H4Type> getH4();

	/**
	 * Returns the value of the '<em><b>H5</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.H5Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H5</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H5</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_H5()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h5' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<H5Type> getH5();

	/**
	 * Returns the value of the '<em><b>H6</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.H6Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H6</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H6</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_H6()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h6' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<H6Type> getH6();

	/**
	 * Returns the value of the '<em><b>Div</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.DivType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       generic language/style container      
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Div</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Div()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='div' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DivType> getDiv();

	/**
	 * Returns the value of the '<em><b>Ul</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.UlType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       Unordered list
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ul</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Ul()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ul' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<UlType> getUl();

	/**
	 * Returns the value of the '<em><b>Ol</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.OlType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       Ordered (numbered) list
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ol</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Ol()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ol' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<OlType> getOl();

	/**
	 * Returns the value of the '<em><b>Dl</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.DlType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dl</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Dl()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dl' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DlType> getDl();

	/**
	 * Returns the value of the '<em><b>Pre</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.PreType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       content is "Inline" excluding "img|object|big|small|sub|sup"
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Pre()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pre' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PreType> getPre();

	/**
	 * Returns the value of the '<em><b>Hr</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.HrType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hr</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hr</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Hr()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hr' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<HrType> getHr();

	/**
	 * Returns the value of the '<em><b>Blockquote</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.BlockquoteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blockquote</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blockquote</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Blockquote()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='blockquote' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<BlockquoteType> getBlockquote();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.AddressType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       information on author
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Address()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AddressType> getAddress();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.TableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Table()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TableType> getTable();

	/**
	 * Returns the value of the '<em><b>A</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.AType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       content is "Inline" except that anchors shouldn't be nested
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>A</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_A()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='a' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AType> getA();

	/**
	 * Returns the value of the '<em><b>Br</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.BrType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       forced line break
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Br</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Br()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='br' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<BrType> getBr();

	/**
	 * Returns the value of the '<em><b>Span</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.SpanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       generic language/style container
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Span</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Span()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='span' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SpanType> getSpan();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.ObjectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Object()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ObjectType> getObject();

	/**
	 * Returns the value of the '<em><b>Img</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.ImgType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Img</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Img</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Img()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='img' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ImgType> getImg();

	/**
	 * Returns the value of the '<em><b>Tt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.TtType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       fixed pitch font
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tt</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Tt()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tt' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TtType> getTt();

	/**
	 * Returns the value of the '<em><b>I</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.IType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       italic font
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>I</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_I()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='i' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<IType> getI();

	/**
	 * Returns the value of the '<em><b>B</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.BType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       bold font
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>B</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_B()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='b' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<BType> getB();

	/**
	 * Returns the value of the '<em><b>Big</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.BigType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       bigger font
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Big</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Big()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='big' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<BigType> getBig();

	/**
	 * Returns the value of the '<em><b>Small</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.SmallType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       smaller font
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Small</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Small()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='small' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SmallType> getSmall();

	/**
	 * Returns the value of the '<em><b>U</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.UType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 				underline
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>U</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_U()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='u' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<UType> getU();

	/**
	 * Returns the value of the '<em><b>Strike</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.StrikeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 			strike-through
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strike</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Strike()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='strike' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<StrikeType> getStrike();

	/**
	 * Returns the value of the '<em><b>Em</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.EmType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       emphasis
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Em</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Em()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='em' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<EmType> getEm();

	/**
	 * Returns the value of the '<em><b>Strong</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.StrongType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       strong emphasis
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strong</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Strong()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='strong' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<StrongType> getStrong();

	/**
	 * Returns the value of the '<em><b>Dfn</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.DfnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       definitional
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dfn</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Dfn()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dfn' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DfnType> getDfn();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.CodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       program code
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Code()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<CodeType> getCode();

	/**
	 * Returns the value of the '<em><b>Q</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.QType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       inlined quote
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Q</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Q()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='q' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<QType> getQ();

	/**
	 * Returns the value of the '<em><b>Samp</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.SampType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       sample
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Samp</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Samp()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='samp' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SampType> getSamp();

	/**
	 * Returns the value of the '<em><b>Kbd</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.KbdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       something user would type
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kbd</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Kbd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='kbd' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<KbdType> getKbd();

	/**
	 * Returns the value of the '<em><b>Var</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.VarType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       variable
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Var</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Var()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='var' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<VarType> getVar();

	/**
	 * Returns the value of the '<em><b>Cite</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.CiteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       citation
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cite</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Cite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cite' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<CiteType> getCite();

	/**
	 * Returns the value of the '<em><b>Abbr</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.AbbrType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       abbreviation
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abbr</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Abbr()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abbr' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AbbrType> getAbbr();

	/**
	 * Returns the value of the '<em><b>Acronym</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.AcronymType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       acronym
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Acronym</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Acronym()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='acronym' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AcronymType> getAcronym();

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.SubType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       subscript
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Sub()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sub' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SubType> getSub();

	/**
	 * Returns the value of the '<em><b>Sup</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.SupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       superscript
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sup</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Sup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sup' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SupType> getSup();

	/**
	 * Returns the value of the '<em><b>Ins</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.InsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ins</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Ins()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ins' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<InsType> getIns();

	/**
	 * Returns the value of the '<em><b>Del</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.DelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Del</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Del</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Del()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='del' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DelType> getDel();

	/**
	 * Returns the value of the '<em><b>Archive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Archive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archive</em>' attribute.
	 * @see #setArchive(String)
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Archive()
	 * @model dataType="org.eclipse.rmf.rif12.xhtml.UriList"
	 *        extendedMetaData="kind='attribute' name='archive'"
	 * @generated
	 */
	String getArchive();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getArchive <em>Archive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive</em>' attribute.
	 * @see #getArchive()
	 * @generated
	 */
	void setArchive(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(List)
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	List<String> getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(List<String> value);

	/**
	 * Returns the value of the '<em><b>Classid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classid</em>' attribute.
	 * @see #setClassid(String)
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Classid()
	 * @model dataType="org.eclipse.rmf.rif12.xhtml.URI"
	 *        extendedMetaData="kind='attribute' name='classid'"
	 * @generated
	 */
	String getClassid();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getClassid <em>Classid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classid</em>' attribute.
	 * @see #getClassid()
	 * @generated
	 */
	void setClassid(String value);

	/**
	 * Returns the value of the '<em><b>Codebase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codebase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codebase</em>' attribute.
	 * @see #setCodebase(String)
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Codebase()
	 * @model dataType="org.eclipse.rmf.rif12.xhtml.URI"
	 *        extendedMetaData="kind='attribute' name='codebase'"
	 * @generated
	 */
	String getCodebase();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getCodebase <em>Codebase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codebase</em>' attribute.
	 * @see #getCodebase()
	 * @generated
	 */
	void setCodebase(String value);

	/**
	 * Returns the value of the '<em><b>Codetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codetype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codetype</em>' attribute.
	 * @see #setCodetype(String)
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Codetype()
	 * @model dataType="org.eclipse.rmf.rif12.xhtml.ContentType"
	 *        extendedMetaData="kind='attribute' name='codetype'"
	 * @generated
	 */
	String getCodetype();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getCodetype <em>Codetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codetype</em>' attribute.
	 * @see #getCodetype()
	 * @generated
	 */
	void setCodetype(String value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Data()
	 * @model dataType="org.eclipse.rmf.rif12.xhtml.URI"
	 *        extendedMetaData="kind='attribute' name='data'"
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

	/**
	 * Returns the value of the '<em><b>Declare</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.rmf.rif12.xhtml.DeclareType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declare</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declare</em>' attribute.
	 * @see org.eclipse.rmf.rif12.xhtml.DeclareType
	 * @see #isSetDeclare()
	 * @see #unsetDeclare()
	 * @see #setDeclare(DeclareType)
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Declare()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='declare'"
	 * @generated
	 */
	DeclareType getDeclare();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getDeclare <em>Declare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declare</em>' attribute.
	 * @see org.eclipse.rmf.rif12.xhtml.DeclareType
	 * @see #isSetDeclare()
	 * @see #unsetDeclare()
	 * @see #getDeclare()
	 * @generated
	 */
	void setDeclare(DeclareType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getDeclare <em>Declare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeclare()
	 * @see #getDeclare()
	 * @see #setDeclare(DeclareType)
	 * @generated
	 */
	void unsetDeclare();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getDeclare <em>Declare</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Declare</em>' attribute is set.
	 * @see #unsetDeclare()
	 * @see #getDeclare()
	 * @see #setDeclare(DeclareType)
	 * @generated
	 */
	boolean isSetDeclare();

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(String)
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Height()
	 * @model dataType="org.eclipse.rmf.rif12.xhtml.Length"
	 *        extendedMetaData="kind='attribute' name='height'"
	 * @generated
	 */
	String getHeight();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(String value);

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
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Standby</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standby</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standby</em>' attribute.
	 * @see #setStandby(String)
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Standby()
	 * @model dataType="org.eclipse.rmf.rif12.xhtml.Text"
	 *        extendedMetaData="kind='attribute' name='standby'"
	 * @generated
	 */
	String getStandby();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getStandby <em>Standby</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standby</em>' attribute.
	 * @see #getStandby()
	 * @generated
	 */
	void setStandby(String value);

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
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Style()
	 * @model dataType="org.eclipse.rmf.rif12.xhtml.StyleSheet"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getStyle <em>Style</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Tabindex()
	 * @model dataType="org.eclipse.rmf.rif12.xhtml.TabindexNumber"
	 *        extendedMetaData="kind='attribute' name='tabindex'"
	 * @generated
	 */
	BigInteger getTabindex();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getTabindex <em>Tabindex</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Title()
	 * @model dataType="org.eclipse.rmf.rif12.xhtml.Text"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getTitle <em>Title</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Type()
	 * @model dataType="org.eclipse.rmf.rif12.xhtml.ContentType"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Usemap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usemap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usemap</em>' attribute.
	 * @see #setUsemap(String)
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Usemap()
	 * @model dataType="org.eclipse.rmf.rif12.xhtml.URI"
	 *        extendedMetaData="kind='attribute' name='usemap'"
	 * @generated
	 */
	String getUsemap();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getUsemap <em>Usemap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usemap</em>' attribute.
	 * @see #getUsemap()
	 * @generated
	 */
	void setUsemap(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getObjectType_Width()
	 * @model dataType="org.eclipse.rmf.rif12.xhtml.Length"
	 *        extendedMetaData="kind='attribute' name='width'"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

} // ObjectType
