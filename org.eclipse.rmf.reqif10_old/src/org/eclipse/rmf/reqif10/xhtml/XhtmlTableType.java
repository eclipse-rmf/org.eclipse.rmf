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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getCol <em>Col</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getColgroup <em>Colgroup</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getThead <em>Thead</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getTfoot <em>Tfoot</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getTbody <em>Tbody</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getTr <em>Tr</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getBorder <em>Border</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getCellpadding <em>Cellpadding</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getCellspacing <em>Cellspacing</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getRules <em>Rules</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getSpace <em>Space</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlTableType()
 * @model extendedMetaData="name='xhtml.table.type' kind='elementOnly'"
 * @generated
 */
public interface XhtmlTableType extends EObject {
	/**
	 * Returns the value of the '<em><b>Caption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption</em>' containment reference.
	 * @see #setCaption(XhtmlCaptionType)
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlTableType_Caption()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='caption' namespace='##targetNamespace'"
	 * @generated
	 */
	XhtmlCaptionType getCaption();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getCaption <em>Caption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption</em>' containment reference.
	 * @see #getCaption()
	 * @generated
	 */
	void setCaption(XhtmlCaptionType value);

	/**
	 * Returns the value of the '<em><b>Col</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlColType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Col</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlTableType_Col()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='col' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<XhtmlColType> getCol();

	/**
	 * Returns the value of the '<em><b>Colgroup</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colgroup</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colgroup</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlTableType_Colgroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='colgroup' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<XhtmlColgroupType> getColgroup();

	/**
	 * Returns the value of the '<em><b>Thead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thead</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thead</em>' containment reference.
	 * @see #setThead(XhtmlTheadType)
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlTableType_Thead()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thead' namespace='##targetNamespace'"
	 * @generated
	 */
	XhtmlTheadType getThead();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getThead <em>Thead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thead</em>' containment reference.
	 * @see #getThead()
	 * @generated
	 */
	void setThead(XhtmlTheadType value);

	/**
	 * Returns the value of the '<em><b>Tfoot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tfoot</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tfoot</em>' containment reference.
	 * @see #setTfoot(XhtmlTfootType)
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlTableType_Tfoot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tfoot' namespace='##targetNamespace'"
	 * @generated
	 */
	XhtmlTfootType getTfoot();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getTfoot <em>Tfoot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tfoot</em>' containment reference.
	 * @see #getTfoot()
	 * @generated
	 */
	void setTfoot(XhtmlTfootType value);

	/**
	 * Returns the value of the '<em><b>Tbody</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tbody</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tbody</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlTableType_Tbody()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tbody' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<XhtmlTbodyType> getTbody();

	/**
	 * Returns the value of the '<em><b>Tr</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xhtml.XhtmlTrType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tr</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tr</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlTableType_Tr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tr' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<XhtmlTrType> getTr();

	/**
	 * Returns the value of the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border</em>' attribute.
	 * @see #setBorder(BigInteger)
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlTableType_Border()
	 * @model dataType="org.eclipse.rmf.reqif10.datatypes.Pixels"
	 *        extendedMetaData="kind='attribute' name='border'"
	 * @generated
	 */
	BigInteger getBorder();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getBorder <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border</em>' attribute.
	 * @see #getBorder()
	 * @generated
	 */
	void setBorder(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Cellpadding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cellpadding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cellpadding</em>' attribute.
	 * @see #setCellpadding(Object)
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlTableType_Cellpadding()
	 * @model dataType="org.eclipse.rmf.reqif10.datatypes.Length"
	 *        extendedMetaData="kind='attribute' name='cellpadding'"
	 * @generated
	 */
	Object getCellpadding();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getCellpadding <em>Cellpadding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cellpadding</em>' attribute.
	 * @see #getCellpadding()
	 * @generated
	 */
	void setCellpadding(Object value);

	/**
	 * Returns the value of the '<em><b>Cellspacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cellspacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cellspacing</em>' attribute.
	 * @see #setCellspacing(Object)
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlTableType_Cellspacing()
	 * @model dataType="org.eclipse.rmf.reqif10.datatypes.Length"
	 *        extendedMetaData="kind='attribute' name='cellspacing'"
	 * @generated
	 */
	Object getCellspacing();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getCellspacing <em>Cellspacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cellspacing</em>' attribute.
	 * @see #getCellspacing()
	 * @generated
	 */
	void setCellspacing(Object value);

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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlTableType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.rmf.reqif10.xhtml.FrameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' attribute.
	 * @see org.eclipse.rmf.reqif10.xhtml.FrameType
	 * @see #isSetFrame()
	 * @see #unsetFrame()
	 * @see #setFrame(FrameType)
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlTableType_Frame()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='frame'"
	 * @generated
	 */
	FrameType getFrame();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getFrame <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' attribute.
	 * @see org.eclipse.rmf.reqif10.xhtml.FrameType
	 * @see #isSetFrame()
	 * @see #unsetFrame()
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(FrameType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getFrame <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrame()
	 * @see #getFrame()
	 * @see #setFrame(FrameType)
	 * @generated
	 */
	void unsetFrame();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getFrame <em>Frame</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frame</em>' attribute is set.
	 * @see #unsetFrame()
	 * @see #getFrame()
	 * @see #setFrame(FrameType)
	 * @generated
	 */
	boolean isSetFrame();

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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlTableType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getId <em>Id</em>}' attribute.
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlTableType_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.namespace.LangType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.rmf.reqif10.xhtml.RulesType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' attribute.
	 * @see org.eclipse.rmf.reqif10.xhtml.RulesType
	 * @see #isSetRules()
	 * @see #unsetRules()
	 * @see #setRules(RulesType)
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlTableType_Rules()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='rules'"
	 * @generated
	 */
	RulesType getRules();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getRules <em>Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rules</em>' attribute.
	 * @see org.eclipse.rmf.reqif10.xhtml.RulesType
	 * @see #isSetRules()
	 * @see #unsetRules()
	 * @see #getRules()
	 * @generated
	 */
	void setRules(RulesType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getRules <em>Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRules()
	 * @see #getRules()
	 * @see #setRules(RulesType)
	 * @generated
	 */
	void unsetRules();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getRules <em>Rules</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rules</em>' attribute is set.
	 * @see #unsetRules()
	 * @see #getRules()
	 * @see #setRules(RulesType)
	 * @generated
	 */
	boolean isSetRules();

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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlTableType_Space()
	 * @model default="preserve" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='space' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	SpaceType getSpace();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getSpace <em>Space</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getSpace <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpace()
	 * @see #getSpace()
	 * @see #setSpace(SpaceType)
	 * @generated
	 */
	void unsetSpace();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getSpace <em>Space</em>}' attribute is set.
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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlTableType_Style()
	 * @model dataType="org.eclipse.rmf.reqif10.datatypes.CDATA"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlTableType_Summary()
	 * @model dataType="org.eclipse.rmf.reqif10.datatypes.Text"
	 *        extendedMetaData="kind='attribute' name='summary'"
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

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
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlTableType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(Object)
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage#getXhtmlTableType_Width()
	 * @model dataType="org.eclipse.rmf.reqif10.datatypes.Length"
	 *        extendedMetaData="kind='attribute' name='width'"
	 * @generated
	 */
	Object getWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Object value);

} // XhtmlTableType
