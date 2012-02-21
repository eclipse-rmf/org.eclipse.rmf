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

package org.eclipse.rmf.rif12.ExchangeFile;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RIF Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.RIFHeader#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.RIFHeader#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.RIFHeader#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.RIFHeader#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.RIFHeader#getSourceToolId <em>Source Tool Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.RIFHeader#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getRIFHeader()
 * @model
 * @generated
 */
public interface RIFHeader extends EObject {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getRIFHeader_Author()
	 * @model dataType="org.eclipse.rmf.rif12.DataTypes.string" required="true" ordered="false"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.ExchangeFile.RIFHeader#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getRIFHeader_Comment()
	 * @model dataType="org.eclipse.rmf.rif12.DataTypes.string" ordered="false"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.ExchangeFile.RIFHeader#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Time</em>' attribute.
	 * @see #setCreationTime(XMLGregorianCalendar)
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getRIFHeader_CreationTime()
	 * @model dataType="org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.dateTime" required="true" ordered="false"
	 * @generated
	 */
	XMLGregorianCalendar getCreationTime();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.ExchangeFile.RIFHeader#getCreationTime <em>Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Time</em>' attribute.
	 * @see #getCreationTime()
	 * @generated
	 */
	void setCreationTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getRIFHeader_Identifier()
	 * @model dataType="org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.ID" required="true" ordered="false"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.ExchangeFile.RIFHeader#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Source Tool Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Tool Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Tool Id</em>' attribute.
	 * @see #setSourceToolId(String)
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getRIFHeader_SourceToolId()
	 * @model dataType="org.eclipse.rmf.rif12.DataTypes.string" required="true" ordered="false"
	 * @generated
	 */
	String getSourceToolId();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.ExchangeFile.RIFHeader#getSourceToolId <em>Source Tool Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Tool Id</em>' attribute.
	 * @see #getSourceToolId()
	 * @generated
	 */
	void setSourceToolId(String value);

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
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getRIFHeader_Title()
	 * @model dataType="org.eclipse.rmf.rif12.DataTypes.string" required="true" ordered="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.ExchangeFile.RIFHeader#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

} // RIFHeader
