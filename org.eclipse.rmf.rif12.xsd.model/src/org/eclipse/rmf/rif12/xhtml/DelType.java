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

import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Del Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.DelType#getCite1 <em>Cite1</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.DelType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.DelType#getDatetime <em>Datetime</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.DelType#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.DelType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.DelType#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getDelType()
 * @model extendedMetaData="name='del_._type' kind='mixed'"
 * @generated
 */
public interface DelType extends Flow {
	/**
	 * Returns the value of the '<em><b>Cite1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cite1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cite1</em>' attribute.
	 * @see #setCite1(String)
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getDelType_Cite1()
	 * @model dataType="org.eclipse.rmf.rif12.xhtml.URI"
	 *        extendedMetaData="kind='attribute' name='cite'"
	 * @generated
	 */
	String getCite1();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.DelType#getCite1 <em>Cite1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cite1</em>' attribute.
	 * @see #getCite1()
	 * @generated
	 */
	void setCite1(String value);

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
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getDelType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	List<String> getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.DelType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(List<String> value);

	/**
	 * Returns the value of the '<em><b>Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datetime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datetime</em>' attribute.
	 * @see #setDatetime(XMLGregorianCalendar)
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getDelType_Datetime()
	 * @model dataType="org.eclipse.rmf.rif12.xhtml.Datetime"
	 *        extendedMetaData="kind='attribute' name='datetime'"
	 * @generated
	 */
	XMLGregorianCalendar getDatetime();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.DelType#getDatetime <em>Datetime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datetime</em>' attribute.
	 * @see #getDatetime()
	 * @generated
	 */
	void setDatetime(XMLGregorianCalendar value);

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
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getDelType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.DelType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getDelType_Style()
	 * @model dataType="org.eclipse.rmf.rif12.xhtml.StyleSheet"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.DelType#getStyle <em>Style</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getDelType_Title()
	 * @model dataType="org.eclipse.rmf.rif12.xhtml.Text"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.DelType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // DelType
