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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Img Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ImgType#getAlt <em>Alt</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ImgType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ImgType#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ImgType#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ImgType#getIsmap <em>Ismap</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ImgType#getLongdesc <em>Longdesc</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ImgType#getSrc <em>Src</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ImgType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ImgType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ImgType#getUsemap <em>Usemap</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.ImgType#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getImgType()
 * @model extendedMetaData="name='img_._type' kind='empty'"
 * @generated
 */
public interface ImgType extends EObject {
	/**
	 * Returns the value of the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alt</em>' attribute.
	 * @see #setAlt(String)
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getImgType_Alt()
	 * @model dataType="org.eclipse.rmf.rif12.xhtml.Text" required="true"
	 *        extendedMetaData="kind='attribute' name='alt'"
	 * @generated
	 */
	String getAlt();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ImgType#getAlt <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alt</em>' attribute.
	 * @see #getAlt()
	 * @generated
	 */
	void setAlt(String value);

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
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getImgType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	List<String> getClass_();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ImgType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(List<String> value);

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
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getImgType_Height()
	 * @model dataType="org.eclipse.rmf.rif12.xhtml.Length"
	 *        extendedMetaData="kind='attribute' name='height'"
	 * @generated
	 */
	String getHeight();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ImgType#getHeight <em>Height</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getImgType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ImgType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Ismap</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.rmf.rif12.xhtml.IsmapType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ismap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ismap</em>' attribute.
	 * @see org.eclipse.rmf.rif12.xhtml.IsmapType
	 * @see #isSetIsmap()
	 * @see #unsetIsmap()
	 * @see #setIsmap(IsmapType)
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getImgType_Ismap()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='ismap'"
	 * @generated
	 */
	IsmapType getIsmap();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ImgType#getIsmap <em>Ismap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ismap</em>' attribute.
	 * @see org.eclipse.rmf.rif12.xhtml.IsmapType
	 * @see #isSetIsmap()
	 * @see #unsetIsmap()
	 * @see #getIsmap()
	 * @generated
	 */
	void setIsmap(IsmapType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ImgType#getIsmap <em>Ismap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsmap()
	 * @see #getIsmap()
	 * @see #setIsmap(IsmapType)
	 * @generated
	 */
	void unsetIsmap();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.rif12.xhtml.ImgType#getIsmap <em>Ismap</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ismap</em>' attribute is set.
	 * @see #unsetIsmap()
	 * @see #getIsmap()
	 * @see #setIsmap(IsmapType)
	 * @generated
	 */
	boolean isSetIsmap();

	/**
	 * Returns the value of the '<em><b>Longdesc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Longdesc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Longdesc</em>' attribute.
	 * @see #setLongdesc(String)
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getImgType_Longdesc()
	 * @model dataType="org.eclipse.rmf.rif12.xhtml.URI"
	 *        extendedMetaData="kind='attribute' name='longdesc'"
	 * @generated
	 */
	String getLongdesc();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ImgType#getLongdesc <em>Longdesc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Longdesc</em>' attribute.
	 * @see #getLongdesc()
	 * @generated
	 */
	void setLongdesc(String value);

	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(String)
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getImgType_Src()
	 * @model dataType="org.eclipse.rmf.rif12.xhtml.URI" required="true"
	 *        extendedMetaData="kind='attribute' name='src'"
	 * @generated
	 */
	String getSrc();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ImgType#getSrc <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(String value);

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
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getImgType_Style()
	 * @model dataType="org.eclipse.rmf.rif12.xhtml.StyleSheet"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ImgType#getStyle <em>Style</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getImgType_Title()
	 * @model dataType="org.eclipse.rmf.rif12.xhtml.Text"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ImgType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Usemap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           usemap points to a map element which may be in this document
	 *           or an external document, although the latter is not widely supported
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usemap</em>' attribute.
	 * @see #setUsemap(String)
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getImgType_Usemap()
	 * @model dataType="org.eclipse.rmf.rif12.xhtml.URI"
	 *        extendedMetaData="kind='attribute' name='usemap'"
	 * @generated
	 */
	String getUsemap();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ImgType#getUsemap <em>Usemap</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getImgType_Width()
	 * @model dataType="org.eclipse.rmf.rif12.xhtml.Length"
	 *        extendedMetaData="kind='attribute' name='width'"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xhtml.ImgType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

} // ImgType
