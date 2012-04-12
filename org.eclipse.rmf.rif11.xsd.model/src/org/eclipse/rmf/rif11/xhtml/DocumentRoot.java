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

package org.eclipse.rmf.rif11.xhtml;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getA <em>A</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getAddress <em>Address</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getB <em>B</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getBig <em>Big</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getBody <em>Body</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getBr <em>Br</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getCite <em>Cite</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getCol <em>Col</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getColgroup <em>Colgroup</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getDd <em>Dd</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getDel <em>Del</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getDiv <em>Div</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getDl <em>Dl</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getDt <em>Dt</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getEm <em>Em</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getH1 <em>H1</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getH2 <em>H2</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getH3 <em>H3</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getH4 <em>H4</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getH5 <em>H5</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getH6 <em>H6</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getHr <em>Hr</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getHtml <em>Html</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getI <em>I</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getImg <em>Img</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getIns <em>Ins</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getLi <em>Li</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getOl <em>Ol</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getP <em>P</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getParam <em>Param</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getPre <em>Pre</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getQ <em>Q</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getSmall <em>Small</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getSpan <em>Span</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getStrike <em>Strike</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getSub <em>Sub</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getSup <em>Sup</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getTable <em>Table</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getTbody <em>Tbody</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getTd <em>Td</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getTfoot <em>Tfoot</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getTh <em>Th</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getThead <em>Thead</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getTr <em>Tr</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getTt <em>Tt</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getU <em>U</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getUl <em>Ul</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getVar <em>Var</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
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
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       content is "Inline" except that anchors shouldn't be nested
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>A</em>' containment reference.
	 * @see #setA(AType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_A()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='a' namespace='##targetNamespace'"
	 * @generated
	 */
	AType getA();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getA <em>A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A</em>' containment reference.
	 * @see #getA()
	 * @generated
	 */
	void setA(AType value);

	/**
	 * Returns the value of the '<em><b>Abbr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       abbreviation
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abbr</em>' containment reference.
	 * @see #setAbbr(AbbrType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Abbr()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abbr' namespace='##targetNamespace'"
	 * @generated
	 */
	AbbrType getAbbr();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getAbbr <em>Abbr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbr</em>' containment reference.
	 * @see #getAbbr()
	 * @generated
	 */
	void setAbbr(AbbrType value);

	/**
	 * Returns the value of the '<em><b>Acronym</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       acronym
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Acronym</em>' containment reference.
	 * @see #setAcronym(AcronymType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Acronym()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='acronym' namespace='##targetNamespace'"
	 * @generated
	 */
	AcronymType getAcronym();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getAcronym <em>Acronym</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acronym</em>' containment reference.
	 * @see #getAcronym()
	 * @generated
	 */
	void setAcronym(AcronymType value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       information on author
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(AddressType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Address()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressType getAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(AddressType value);

	/**
	 * Returns the value of the '<em><b>B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       bold font
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>B</em>' containment reference.
	 * @see #setB(BType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_B()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='b' namespace='##targetNamespace'"
	 * @generated
	 */
	BType getB();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getB <em>B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' containment reference.
	 * @see #getB()
	 * @generated
	 */
	void setB(BType value);

	/**
	 * Returns the value of the '<em><b>Big</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       bigger font
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Big</em>' containment reference.
	 * @see #setBig(BigType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Big()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='big' namespace='##targetNamespace'"
	 * @generated
	 */
	BigType getBig();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getBig <em>Big</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Big</em>' containment reference.
	 * @see #getBig()
	 * @generated
	 */
	void setBig(BigType value);

	/**
	 * Returns the value of the '<em><b>Blockquote</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blockquote</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blockquote</em>' containment reference.
	 * @see #setBlockquote(BlockquoteType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Blockquote()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='blockquote' namespace='##targetNamespace'"
	 * @generated
	 */
	BlockquoteType getBlockquote();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getBlockquote <em>Blockquote</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blockquote</em>' containment reference.
	 * @see #getBlockquote()
	 * @generated
	 */
	void setBlockquote(BlockquoteType value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(BodyType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Body()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='body' namespace='##targetNamespace'"
	 * @generated
	 */
	BodyType getBody();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(BodyType value);

	/**
	 * Returns the value of the '<em><b>Br</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       forced line break
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Br</em>' containment reference.
	 * @see #setBr(BrType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Br()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='br' namespace='##targetNamespace'"
	 * @generated
	 */
	BrType getBr();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getBr <em>Br</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Br</em>' containment reference.
	 * @see #getBr()
	 * @generated
	 */
	void setBr(BrType value);

	/**
	 * Returns the value of the '<em><b>Caption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption</em>' containment reference.
	 * @see #setCaption(CaptionType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Caption()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='caption' namespace='##targetNamespace'"
	 * @generated
	 */
	CaptionType getCaption();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getCaption <em>Caption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption</em>' containment reference.
	 * @see #getCaption()
	 * @generated
	 */
	void setCaption(CaptionType value);

	/**
	 * Returns the value of the '<em><b>Cite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       citation
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cite</em>' containment reference.
	 * @see #setCite(CiteType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Cite()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cite' namespace='##targetNamespace'"
	 * @generated
	 */
	CiteType getCite();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getCite <em>Cite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cite</em>' containment reference.
	 * @see #getCite()
	 * @generated
	 */
	void setCite(CiteType value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       program code
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Code()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getCode();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeType value);

	/**
	 * Returns the value of the '<em><b>Col</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       col elements define the alignment properties for cells in
	 *       one or more columns.
	 *       The width attribute specifies the width of the columns, e.g.
	 *           width=64        width in screen pixels
	 *           width=0.5*      relative width of 0.5
	 *       The span attribute causes the attributes of one
	 *       col element to apply to more than one column.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Col</em>' containment reference.
	 * @see #setCol(ColType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Col()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='col' namespace='##targetNamespace'"
	 * @generated
	 */
	ColType getCol();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getCol <em>Col</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col</em>' containment reference.
	 * @see #getCol()
	 * @generated
	 */
	void setCol(ColType value);

	/**
	 * Returns the value of the '<em><b>Colgroup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       colgroup groups a set of col elements. It allows you to group
	 *       several semantically related columns together.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Colgroup</em>' containment reference.
	 * @see #setColgroup(ColgroupType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Colgroup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='colgroup' namespace='##targetNamespace'"
	 * @generated
	 */
	ColgroupType getColgroup();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getColgroup <em>Colgroup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colgroup</em>' containment reference.
	 * @see #getColgroup()
	 * @generated
	 */
	void setColgroup(ColgroupType value);

	/**
	 * Returns the value of the '<em><b>Dd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dd</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dd</em>' containment reference.
	 * @see #setDd(DdType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Dd()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dd' namespace='##targetNamespace'"
	 * @generated
	 */
	DdType getDd();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getDd <em>Dd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dd</em>' containment reference.
	 * @see #getDd()
	 * @generated
	 */
	void setDd(DdType value);

	/**
	 * Returns the value of the '<em><b>Del</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Del</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Del</em>' containment reference.
	 * @see #setDel(DelType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Del()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='del' namespace='##targetNamespace'"
	 * @generated
	 */
	DelType getDel();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getDel <em>Del</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Del</em>' containment reference.
	 * @see #getDel()
	 * @generated
	 */
	void setDel(DelType value);

	/**
	 * Returns the value of the '<em><b>Dfn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       definitional
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dfn</em>' containment reference.
	 * @see #setDfn(DfnType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Dfn()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dfn' namespace='##targetNamespace'"
	 * @generated
	 */
	DfnType getDfn();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getDfn <em>Dfn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dfn</em>' containment reference.
	 * @see #getDfn()
	 * @generated
	 */
	void setDfn(DfnType value);

	/**
	 * Returns the value of the '<em><b>Div</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       generic language/style container      
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Div</em>' containment reference.
	 * @see #setDiv(DivType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Div()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='div' namespace='##targetNamespace'"
	 * @generated
	 */
	DivType getDiv();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getDiv <em>Div</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Div</em>' containment reference.
	 * @see #getDiv()
	 * @generated
	 */
	void setDiv(DivType value);

	/**
	 * Returns the value of the '<em><b>Dl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dl</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dl</em>' containment reference.
	 * @see #setDl(DlType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Dl()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dl' namespace='##targetNamespace'"
	 * @generated
	 */
	DlType getDl();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getDl <em>Dl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dl</em>' containment reference.
	 * @see #getDl()
	 * @generated
	 */
	void setDl(DlType value);

	/**
	 * Returns the value of the '<em><b>Dt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dt</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dt</em>' containment reference.
	 * @see #setDt(DtType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Dt()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dt' namespace='##targetNamespace'"
	 * @generated
	 */
	DtType getDt();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getDt <em>Dt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dt</em>' containment reference.
	 * @see #getDt()
	 * @generated
	 */
	void setDt(DtType value);

	/**
	 * Returns the value of the '<em><b>Em</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       emphasis
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Em</em>' containment reference.
	 * @see #setEm(EmType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Em()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='em' namespace='##targetNamespace'"
	 * @generated
	 */
	EmType getEm();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getEm <em>Em</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Em</em>' containment reference.
	 * @see #getEm()
	 * @generated
	 */
	void setEm(EmType value);

	/**
	 * Returns the value of the '<em><b>H1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H1</em>' containment reference.
	 * @see #setH1(H1Type)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_H1()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h1' namespace='##targetNamespace'"
	 * @generated
	 */
	H1Type getH1();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getH1 <em>H1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>H1</em>' containment reference.
	 * @see #getH1()
	 * @generated
	 */
	void setH1(H1Type value);

	/**
	 * Returns the value of the '<em><b>H2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H2</em>' containment reference.
	 * @see #setH2(H2Type)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_H2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h2' namespace='##targetNamespace'"
	 * @generated
	 */
	H2Type getH2();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getH2 <em>H2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>H2</em>' containment reference.
	 * @see #getH2()
	 * @generated
	 */
	void setH2(H2Type value);

	/**
	 * Returns the value of the '<em><b>H3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H3</em>' containment reference.
	 * @see #setH3(H3Type)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_H3()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h3' namespace='##targetNamespace'"
	 * @generated
	 */
	H3Type getH3();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getH3 <em>H3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>H3</em>' containment reference.
	 * @see #getH3()
	 * @generated
	 */
	void setH3(H3Type value);

	/**
	 * Returns the value of the '<em><b>H4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H4</em>' containment reference.
	 * @see #setH4(H4Type)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_H4()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h4' namespace='##targetNamespace'"
	 * @generated
	 */
	H4Type getH4();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getH4 <em>H4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>H4</em>' containment reference.
	 * @see #getH4()
	 * @generated
	 */
	void setH4(H4Type value);

	/**
	 * Returns the value of the '<em><b>H5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H5</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H5</em>' containment reference.
	 * @see #setH5(H5Type)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_H5()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h5' namespace='##targetNamespace'"
	 * @generated
	 */
	H5Type getH5();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getH5 <em>H5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>H5</em>' containment reference.
	 * @see #getH5()
	 * @generated
	 */
	void setH5(H5Type value);

	/**
	 * Returns the value of the '<em><b>H6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H6</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H6</em>' containment reference.
	 * @see #setH6(H6Type)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_H6()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h6' namespace='##targetNamespace'"
	 * @generated
	 */
	H6Type getH6();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getH6 <em>H6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>H6</em>' containment reference.
	 * @see #getH6()
	 * @generated
	 */
	void setH6(H6Type value);

	/**
	 * Returns the value of the '<em><b>Hr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hr</em>' containment reference.
	 * @see #setHr(HrType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Hr()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hr' namespace='##targetNamespace'"
	 * @generated
	 */
	HrType getHr();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getHr <em>Hr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hr</em>' containment reference.
	 * @see #getHr()
	 * @generated
	 */
	void setHr(HrType value);

	/**
	 * Returns the value of the '<em><b>Html</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Html</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Html</em>' containment reference.
	 * @see #setHtml(HtmlType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Html()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='html' namespace='##targetNamespace'"
	 * @generated
	 */
	HtmlType getHtml();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getHtml <em>Html</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html</em>' containment reference.
	 * @see #getHtml()
	 * @generated
	 */
	void setHtml(HtmlType value);

	/**
	 * Returns the value of the '<em><b>I</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       italic font
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>I</em>' containment reference.
	 * @see #setI(IType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_I()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='i' namespace='##targetNamespace'"
	 * @generated
	 */
	IType getI();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getI <em>I</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>I</em>' containment reference.
	 * @see #getI()
	 * @generated
	 */
	void setI(IType value);

	/**
	 * Returns the value of the '<em><b>Img</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Img</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Img</em>' containment reference.
	 * @see #setImg(ImgType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Img()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='img' namespace='##targetNamespace'"
	 * @generated
	 */
	ImgType getImg();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getImg <em>Img</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Img</em>' containment reference.
	 * @see #getImg()
	 * @generated
	 */
	void setImg(ImgType value);

	/**
	 * Returns the value of the '<em><b>Ins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ins</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ins</em>' containment reference.
	 * @see #setIns(InsType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Ins()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ins' namespace='##targetNamespace'"
	 * @generated
	 */
	InsType getIns();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getIns <em>Ins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ins</em>' containment reference.
	 * @see #getIns()
	 * @generated
	 */
	void setIns(InsType value);

	/**
	 * Returns the value of the '<em><b>Kbd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       something user would type
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kbd</em>' containment reference.
	 * @see #setKbd(KbdType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Kbd()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='kbd' namespace='##targetNamespace'"
	 * @generated
	 */
	KbdType getKbd();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getKbd <em>Kbd</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kbd</em>' containment reference.
	 * @see #getKbd()
	 * @generated
	 */
	void setKbd(KbdType value);

	/**
	 * Returns the value of the '<em><b>Li</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       list item
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Li</em>' containment reference.
	 * @see #setLi(LiType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Li()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='li' namespace='##targetNamespace'"
	 * @generated
	 */
	LiType getLi();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getLi <em>Li</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Li</em>' containment reference.
	 * @see #getLi()
	 * @generated
	 */
	void setLi(LiType value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(ObjectType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Object()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectType getObject();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(ObjectType value);

	/**
	 * Returns the value of the '<em><b>Ol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       Ordered (numbered) list
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ol</em>' containment reference.
	 * @see #setOl(OlType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Ol()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ol' namespace='##targetNamespace'"
	 * @generated
	 */
	OlType getOl();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getOl <em>Ol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ol</em>' containment reference.
	 * @see #getOl()
	 * @generated
	 */
	void setOl(OlType value);

	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference.
	 * @see #setP(PType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_P()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace'"
	 * @generated
	 */
	PType getP();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getP <em>P</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P</em>' containment reference.
	 * @see #getP()
	 * @generated
	 */
	void setP(PType value);

	/**
	 * Returns the value of the '<em><b>Param</b></em>' containment reference.
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
	 * @return the value of the '<em>Param</em>' containment reference.
	 * @see #setParam(ParamType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Param()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='param' namespace='##targetNamespace'"
	 * @generated
	 */
	ParamType getParam();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getParam <em>Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param</em>' containment reference.
	 * @see #getParam()
	 * @generated
	 */
	void setParam(ParamType value);

	/**
	 * Returns the value of the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       content is "Inline" excluding "img|object|big|small|sub|sup"
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre</em>' containment reference.
	 * @see #setPre(PreType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Pre()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pre' namespace='##targetNamespace'"
	 * @generated
	 */
	PreType getPre();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getPre <em>Pre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre</em>' containment reference.
	 * @see #getPre()
	 * @generated
	 */
	void setPre(PreType value);

	/**
	 * Returns the value of the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       inlined quote
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Q</em>' containment reference.
	 * @see #setQ(QType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Q()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='q' namespace='##targetNamespace'"
	 * @generated
	 */
	QType getQ();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getQ <em>Q</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q</em>' containment reference.
	 * @see #getQ()
	 * @generated
	 */
	void setQ(QType value);

	/**
	 * Returns the value of the '<em><b>Samp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       sample
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Samp</em>' containment reference.
	 * @see #setSamp(SampType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Samp()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='samp' namespace='##targetNamespace'"
	 * @generated
	 */
	SampType getSamp();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getSamp <em>Samp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Samp</em>' containment reference.
	 * @see #getSamp()
	 * @generated
	 */
	void setSamp(SampType value);

	/**
	 * Returns the value of the '<em><b>Small</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       smaller font
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Small</em>' containment reference.
	 * @see #setSmall(SmallType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Small()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='small' namespace='##targetNamespace'"
	 * @generated
	 */
	SmallType getSmall();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getSmall <em>Small</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Small</em>' containment reference.
	 * @see #getSmall()
	 * @generated
	 */
	void setSmall(SmallType value);

	/**
	 * Returns the value of the '<em><b>Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       generic language/style container
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Span</em>' containment reference.
	 * @see #setSpan(SpanType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Span()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='span' namespace='##targetNamespace'"
	 * @generated
	 */
	SpanType getSpan();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getSpan <em>Span</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span</em>' containment reference.
	 * @see #getSpan()
	 * @generated
	 */
	void setSpan(SpanType value);

	/**
	 * Returns the value of the '<em><b>Strike</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 			strike-through
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strike</em>' containment reference.
	 * @see #setStrike(StrikeType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Strike()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='strike' namespace='##targetNamespace'"
	 * @generated
	 */
	StrikeType getStrike();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getStrike <em>Strike</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strike</em>' containment reference.
	 * @see #getStrike()
	 * @generated
	 */
	void setStrike(StrikeType value);

	/**
	 * Returns the value of the '<em><b>Strong</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       strong emphasis
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strong</em>' containment reference.
	 * @see #setStrong(StrongType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Strong()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='strong' namespace='##targetNamespace'"
	 * @generated
	 */
	StrongType getStrong();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getStrong <em>Strong</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strong</em>' containment reference.
	 * @see #getStrong()
	 * @generated
	 */
	void setStrong(StrongType value);

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       subscript
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub</em>' containment reference.
	 * @see #setSub(SubType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Sub()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sub' namespace='##targetNamespace'"
	 * @generated
	 */
	SubType getSub();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getSub <em>Sub</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub</em>' containment reference.
	 * @see #getSub()
	 * @generated
	 */
	void setSub(SubType value);

	/**
	 * Returns the value of the '<em><b>Sup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       superscript
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sup</em>' containment reference.
	 * @see #setSup(SupType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Sup()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sup' namespace='##targetNamespace'"
	 * @generated
	 */
	SupType getSup();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getSup <em>Sup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sup</em>' containment reference.
	 * @see #getSup()
	 * @generated
	 */
	void setSup(SupType value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference.
	 * @see #setTable(TableType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Table()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table' namespace='##targetNamespace'"
	 * @generated
	 */
	TableType getTable();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getTable <em>Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' containment reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(TableType value);

	/**
	 * Returns the value of the '<em><b>Tbody</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tbody</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tbody</em>' containment reference.
	 * @see #setTbody(TbodyType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Tbody()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tbody' namespace='##targetNamespace'"
	 * @generated
	 */
	TbodyType getTbody();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getTbody <em>Tbody</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tbody</em>' containment reference.
	 * @see #getTbody()
	 * @generated
	 */
	void setTbody(TbodyType value);

	/**
	 * Returns the value of the '<em><b>Td</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Td</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Td</em>' containment reference.
	 * @see #setTd(TdType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Td()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='td' namespace='##targetNamespace'"
	 * @generated
	 */
	TdType getTd();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getTd <em>Td</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Td</em>' containment reference.
	 * @see #getTd()
	 * @generated
	 */
	void setTd(TdType value);

	/**
	 * Returns the value of the '<em><b>Tfoot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tfoot</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tfoot</em>' containment reference.
	 * @see #setTfoot(TfootType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Tfoot()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tfoot' namespace='##targetNamespace'"
	 * @generated
	 */
	TfootType getTfoot();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getTfoot <em>Tfoot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tfoot</em>' containment reference.
	 * @see #getTfoot()
	 * @generated
	 */
	void setTfoot(TfootType value);

	/**
	 * Returns the value of the '<em><b>Th</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Th</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Th</em>' containment reference.
	 * @see #setTh(ThType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Th()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='th' namespace='##targetNamespace'"
	 * @generated
	 */
	ThType getTh();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getTh <em>Th</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Th</em>' containment reference.
	 * @see #getTh()
	 * @generated
	 */
	void setTh(ThType value);

	/**
	 * Returns the value of the '<em><b>Thead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thead</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thead</em>' containment reference.
	 * @see #setThead(TheadType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Thead()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='thead' namespace='##targetNamespace'"
	 * @generated
	 */
	TheadType getThead();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getThead <em>Thead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thead</em>' containment reference.
	 * @see #getThead()
	 * @generated
	 */
	void setThead(TheadType value);

	/**
	 * Returns the value of the '<em><b>Tr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tr</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tr</em>' containment reference.
	 * @see #setTr(TrType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Tr()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tr' namespace='##targetNamespace'"
	 * @generated
	 */
	TrType getTr();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getTr <em>Tr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tr</em>' containment reference.
	 * @see #getTr()
	 * @generated
	 */
	void setTr(TrType value);

	/**
	 * Returns the value of the '<em><b>Tt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       fixed pitch font
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tt</em>' containment reference.
	 * @see #setTt(TtType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Tt()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tt' namespace='##targetNamespace'"
	 * @generated
	 */
	TtType getTt();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getTt <em>Tt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tt</em>' containment reference.
	 * @see #getTt()
	 * @generated
	 */
	void setTt(TtType value);

	/**
	 * Returns the value of the '<em><b>U</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 				underline
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>U</em>' containment reference.
	 * @see #setU(UType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_U()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='u' namespace='##targetNamespace'"
	 * @generated
	 */
	UType getU();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getU <em>U</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>U</em>' containment reference.
	 * @see #getU()
	 * @generated
	 */
	void setU(UType value);

	/**
	 * Returns the value of the '<em><b>Ul</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       Unordered list
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ul</em>' containment reference.
	 * @see #setUl(UlType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Ul()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ul' namespace='##targetNamespace'"
	 * @generated
	 */
	UlType getUl();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getUl <em>Ul</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ul</em>' containment reference.
	 * @see #getUl()
	 * @generated
	 */
	void setUl(UlType value);

	/**
	 * Returns the value of the '<em><b>Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       variable
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Var</em>' containment reference.
	 * @see #setVar(VarType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getDocumentRoot_Var()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='var' namespace='##targetNamespace'"
	 * @generated
	 */
	VarType getVar();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.DocumentRoot#getVar <em>Var</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' containment reference.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(VarType value);

} // DocumentRoot
