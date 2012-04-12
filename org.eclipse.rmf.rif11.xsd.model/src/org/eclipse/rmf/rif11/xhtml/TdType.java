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

import java.math.BigInteger;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Td Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.TdType#getAbbr1 <em>Abbr1</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.TdType#getAlign <em>Align</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.TdType#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.TdType#getChar <em>Char</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.TdType#getCharoff <em>Charoff</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.TdType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.TdType#getColspan <em>Colspan</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.TdType#getHeaders <em>Headers</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.TdType#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.TdType#getRowspan <em>Rowspan</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.TdType#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.TdType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.TdType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.TdType#getValign <em>Valign</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getTdType()
 * @model extendedMetaData="name='td_._type' kind='mixed'"
 * @generated
 */
public interface TdType extends Flow {
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
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getTdType_Abbr1()
	 * @model dataType="org.eclipse.rmf.rif11.xhtml.Text"
	 *        extendedMetaData="kind='attribute' name='abbr'"
	 * @generated
	 */
	String getAbbr1();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.TdType#getAbbr1 <em>Abbr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbr1</em>' attribute.
	 * @see #getAbbr1()
	 * @generated
	 */
	void setAbbr1(String value);

	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.rmf.rif11.xhtml.AlignType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see org.eclipse.rmf.rif11.xhtml.AlignType
	 * @see #isSetAlign()
	 * @see #unsetAlign()
	 * @see #setAlign(AlignType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getTdType_Align()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='align'"
	 * @generated
	 */
	AlignType getAlign();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.TdType#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see org.eclipse.rmf.rif11.xhtml.AlignType
	 * @see #isSetAlign()
	 * @see #unsetAlign()
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(AlignType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.rif11.xhtml.TdType#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlign()
	 * @see #getAlign()
	 * @see #setAlign(AlignType)
	 * @generated
	 */
	void unsetAlign();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.rif11.xhtml.TdType#getAlign <em>Align</em>}' attribute is set.
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
	 * @see #setAxis(Object)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getTdType_Axis()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='axis'"
	 * @generated
	 */
	Object getAxis();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.TdType#getAxis <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' attribute.
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(Object value);

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
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getTdType_Char()
	 * @model dataType="org.eclipse.rmf.rif11.xhtml.Character"
	 *        extendedMetaData="kind='attribute' name='char'"
	 * @generated
	 */
	String getChar();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.TdType#getChar <em>Char</em>}' attribute.
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
	 * @see #setCharoff(String)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getTdType_Charoff()
	 * @model dataType="org.eclipse.rmf.rif11.xhtml.Length"
	 *        extendedMetaData="kind='attribute' name='charoff'"
	 * @generated
	 */
	String getCharoff();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.TdType#getCharoff <em>Charoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charoff</em>' attribute.
	 * @see #getCharoff()
	 * @generated
	 */
	void setCharoff(String value);

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
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getTdType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	List<String> getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.TdType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(List<String> value);

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
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getTdType_Colspan()
	 * @model default="1" unsettable="true" dataType="org.eclipse.rmf.rif11.xhtml.Number"
	 *        extendedMetaData="kind='attribute' name='colspan'"
	 * @generated
	 */
	BigInteger getColspan();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.TdType#getColspan <em>Colspan</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.rmf.rif11.xhtml.TdType#getColspan <em>Colspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColspan()
	 * @see #getColspan()
	 * @see #setColspan(BigInteger)
	 * @generated
	 */
	void unsetColspan();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.rif11.xhtml.TdType#getColspan <em>Colspan</em>}' attribute is set.
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
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getTdType_Headers()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='headers'"
	 * @generated
	 */
	List<String> getHeaders();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.TdType#getHeaders <em>Headers</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getTdType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.TdType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getTdType_Rowspan()
	 * @model default="1" unsettable="true" dataType="org.eclipse.rmf.rif11.xhtml.Number"
	 *        extendedMetaData="kind='attribute' name='rowspan'"
	 * @generated
	 */
	BigInteger getRowspan();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.TdType#getRowspan <em>Rowspan</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.rmf.rif11.xhtml.TdType#getRowspan <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRowspan()
	 * @see #getRowspan()
	 * @see #setRowspan(BigInteger)
	 * @generated
	 */
	void unsetRowspan();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.rif11.xhtml.TdType#getRowspan <em>Rowspan</em>}' attribute is set.
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
	 * The literals are from the enumeration {@link org.eclipse.rmf.rif11.xhtml.Scope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see org.eclipse.rmf.rif11.xhtml.Scope
	 * @see #isSetScope()
	 * @see #unsetScope()
	 * @see #setScope(Scope)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getTdType_Scope()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='scope'"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.TdType#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see org.eclipse.rmf.rif11.xhtml.Scope
	 * @see #isSetScope()
	 * @see #unsetScope()
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.rif11.xhtml.TdType#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScope()
	 * @see #getScope()
	 * @see #setScope(Scope)
	 * @generated
	 */
	void unsetScope();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.rif11.xhtml.TdType#getScope <em>Scope</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scope</em>' attribute is set.
	 * @see #unsetScope()
	 * @see #getScope()
	 * @see #setScope(Scope)
	 * @generated
	 */
	boolean isSetScope();

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
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getTdType_Style()
	 * @model dataType="org.eclipse.rmf.rif11.xhtml.StyleSheet"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.TdType#getStyle <em>Style</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getTdType_Title()
	 * @model dataType="org.eclipse.rmf.rif11.xhtml.Text"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.TdType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Valign</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.rmf.rif11.xhtml.ValignType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valign</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valign</em>' attribute.
	 * @see org.eclipse.rmf.rif11.xhtml.ValignType
	 * @see #isSetValign()
	 * @see #unsetValign()
	 * @see #setValign(ValignType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getTdType_Valign()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='valign'"
	 * @generated
	 */
	ValignType getValign();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.TdType#getValign <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valign</em>' attribute.
	 * @see org.eclipse.rmf.rif11.xhtml.ValignType
	 * @see #isSetValign()
	 * @see #unsetValign()
	 * @see #getValign()
	 * @generated
	 */
	void setValign(ValignType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.rif11.xhtml.TdType#getValign <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValign()
	 * @see #getValign()
	 * @see #setValign(ValignType)
	 * @generated
	 */
	void unsetValign();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.rif11.xhtml.TdType#getValign <em>Valign</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valign</em>' attribute is set.
	 * @see #unsetValign()
	 * @see #getValign()
	 * @see #setValign(ValignType)
	 * @generated
	 */
	boolean isSetValign();

} // TdType
