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
package org.eclipse.rmf.reqif10;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Req IF Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIFHeader#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIFHeader#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIFHeader#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIFHeader#getRepositoryId <em>Repository Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIFHeader#getReqIFToolId <em>Req IF Tool Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIFHeader#getReqIFVersion <em>Req IF Version</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIFHeader#getSourceToolId <em>Source Tool Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIFHeader#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getReqIFHeader()
 * @model extendedMetaData="name='REQ-IF-HEADER' kind='elementOnly'"
 * @generated
 */
public interface ReqIFHeader extends EObject {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #isSetComment()
	 * @see #unsetComment()
	 * @see #setComment(String)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getReqIFHeader_Comment()
	 * @model unsettable="true" ordered="false"
	 *        extendedMetaData="name='COMMENT' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.ReqIFHeader#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #isSetComment()
	 * @see #unsetComment()
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.ReqIFHeader#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetComment()
	 * @see #getComment()
	 * @see #setComment(String)
	 * @generated
	 */
	void unsetComment();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.ReqIFHeader#getComment <em>Comment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Comment</em>' attribute is set.
	 * @see #unsetComment()
	 * @see #getComment()
	 * @see #setComment(String)
	 * @generated
	 */
	boolean isSetComment();

	/**
	 * Returns the value of the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Time</em>' attribute.
	 * @see #isSetCreationTime()
	 * @see #unsetCreationTime()
	 * @see #setCreationTime(XMLGregorianCalendar)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getReqIFHeader_CreationTime()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true" ordered="false"
	 *        extendedMetaData="name='CREATION-TIME' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getCreationTime();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.ReqIFHeader#getCreationTime <em>Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Time</em>' attribute.
	 * @see #isSetCreationTime()
	 * @see #unsetCreationTime()
	 * @see #getCreationTime()
	 * @generated
	 */
	void setCreationTime(XMLGregorianCalendar value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.ReqIFHeader#getCreationTime <em>Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCreationTime()
	 * @see #getCreationTime()
	 * @see #setCreationTime(XMLGregorianCalendar)
	 * @generated
	 */
	void unsetCreationTime();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.ReqIFHeader#getCreationTime <em>Creation Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Creation Time</em>' attribute is set.
	 * @see #unsetCreationTime()
	 * @see #getCreationTime()
	 * @see #setCreationTime(XMLGregorianCalendar)
	 * @generated
	 */
	boolean isSetCreationTime();

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #isSetIdentifier()
	 * @see #unsetIdentifier()
	 * @see #setIdentifier(String)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getReqIFHeader_Identifier()
	 * @model unsettable="true" id="true" dataType="org.eclipse.rmf.reqif10.ID" required="true" ordered="false"
	 *        extendedMetaData="name='IDENTIFIER' kind='attribute'"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.ReqIFHeader#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #isSetIdentifier()
	 * @see #unsetIdentifier()
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.ReqIFHeader#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIdentifier()
	 * @see #getIdentifier()
	 * @see #setIdentifier(String)
	 * @generated
	 */
	void unsetIdentifier();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.ReqIFHeader#getIdentifier <em>Identifier</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Identifier</em>' attribute is set.
	 * @see #unsetIdentifier()
	 * @see #getIdentifier()
	 * @see #setIdentifier(String)
	 * @generated
	 */
	boolean isSetIdentifier();

	/**
	 * Returns the value of the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Id</em>' attribute.
	 * @see #isSetRepositoryId()
	 * @see #unsetRepositoryId()
	 * @see #setRepositoryId(String)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getReqIFHeader_RepositoryId()
	 * @model unsettable="true" ordered="false"
	 *        extendedMetaData="name='REPOSITORY-ID' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRepositoryId();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.ReqIFHeader#getRepositoryId <em>Repository Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository Id</em>' attribute.
	 * @see #isSetRepositoryId()
	 * @see #unsetRepositoryId()
	 * @see #getRepositoryId()
	 * @generated
	 */
	void setRepositoryId(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.ReqIFHeader#getRepositoryId <em>Repository Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRepositoryId()
	 * @see #getRepositoryId()
	 * @see #setRepositoryId(String)
	 * @generated
	 */
	void unsetRepositoryId();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.ReqIFHeader#getRepositoryId <em>Repository Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Repository Id</em>' attribute is set.
	 * @see #unsetRepositoryId()
	 * @see #getRepositoryId()
	 * @see #setRepositoryId(String)
	 * @generated
	 */
	boolean isSetRepositoryId();

	/**
	 * Returns the value of the '<em><b>Req IF Tool Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req IF Tool Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req IF Tool Id</em>' attribute.
	 * @see #isSetReqIFToolId()
	 * @see #unsetReqIFToolId()
	 * @see #setReqIFToolId(String)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getReqIFHeader_ReqIFToolId()
	 * @model unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='REQ-IF-TOOL-ID' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReqIFToolId();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.ReqIFHeader#getReqIFToolId <em>Req IF Tool Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req IF Tool Id</em>' attribute.
	 * @see #isSetReqIFToolId()
	 * @see #unsetReqIFToolId()
	 * @see #getReqIFToolId()
	 * @generated
	 */
	void setReqIFToolId(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.ReqIFHeader#getReqIFToolId <em>Req IF Tool Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReqIFToolId()
	 * @see #getReqIFToolId()
	 * @see #setReqIFToolId(String)
	 * @generated
	 */
	void unsetReqIFToolId();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.ReqIFHeader#getReqIFToolId <em>Req IF Tool Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Req IF Tool Id</em>' attribute is set.
	 * @see #unsetReqIFToolId()
	 * @see #getReqIFToolId()
	 * @see #setReqIFToolId(String)
	 * @generated
	 */
	boolean isSetReqIFToolId();

	/**
	 * Returns the value of the '<em><b>Req IF Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req IF Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req IF Version</em>' attribute.
	 * @see #isSetReqIFVersion()
	 * @see #unsetReqIFVersion()
	 * @see #setReqIFVersion(String)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getReqIFHeader_ReqIFVersion()
	 * @model unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='REQ-IF-VERSION' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReqIFVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.ReqIFHeader#getReqIFVersion <em>Req IF Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req IF Version</em>' attribute.
	 * @see #isSetReqIFVersion()
	 * @see #unsetReqIFVersion()
	 * @see #getReqIFVersion()
	 * @generated
	 */
	void setReqIFVersion(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.ReqIFHeader#getReqIFVersion <em>Req IF Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReqIFVersion()
	 * @see #getReqIFVersion()
	 * @see #setReqIFVersion(String)
	 * @generated
	 */
	void unsetReqIFVersion();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.ReqIFHeader#getReqIFVersion <em>Req IF Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Req IF Version</em>' attribute is set.
	 * @see #unsetReqIFVersion()
	 * @see #getReqIFVersion()
	 * @see #setReqIFVersion(String)
	 * @generated
	 */
	boolean isSetReqIFVersion();

	/**
	 * Returns the value of the '<em><b>Source Tool Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Tool Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Tool Id</em>' attribute.
	 * @see #isSetSourceToolId()
	 * @see #unsetSourceToolId()
	 * @see #setSourceToolId(String)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getReqIFHeader_SourceToolId()
	 * @model unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='SOURCE-TOOL-ID' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceToolId();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.ReqIFHeader#getSourceToolId <em>Source Tool Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Tool Id</em>' attribute.
	 * @see #isSetSourceToolId()
	 * @see #unsetSourceToolId()
	 * @see #getSourceToolId()
	 * @generated
	 */
	void setSourceToolId(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.ReqIFHeader#getSourceToolId <em>Source Tool Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSourceToolId()
	 * @see #getSourceToolId()
	 * @see #setSourceToolId(String)
	 * @generated
	 */
	void unsetSourceToolId();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.ReqIFHeader#getSourceToolId <em>Source Tool Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Source Tool Id</em>' attribute is set.
	 * @see #unsetSourceToolId()
	 * @see #getSourceToolId()
	 * @see #setSourceToolId(String)
	 * @generated
	 */
	boolean isSetSourceToolId();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #isSetTitle()
	 * @see #unsetTitle()
	 * @see #setTitle(String)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getReqIFHeader_Title()
	 * @model unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='TITLE' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.ReqIFHeader#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #isSetTitle()
	 * @see #unsetTitle()
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.ReqIFHeader#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTitle()
	 * @see #getTitle()
	 * @see #setTitle(String)
	 * @generated
	 */
	void unsetTitle();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.ReqIFHeader#getTitle <em>Title</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Title</em>' attribute is set.
	 * @see #unsetTitle()
	 * @see #getTitle()
	 * @see #setTitle(String)
	 * @generated
	 */
	boolean isSetTitle();

} // ReqIFHeader
