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

package org.eclipse.rmf.reqif10;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIfHeader#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIfHeader#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIfHeader#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIfHeader#getRepositoryId <em>Repository Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIfHeader#getReqIfToolId <em>Req If Tool Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIfHeader#getReqIfVersion <em>Req If Version</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIfHeader#getSourceToolId <em>Source Tool Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIfHeader#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIfHeader#getDocumentRoot <em>Document Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.Reqif10Package#getReqIfHeader()
 * @model
 * @generated
 */
public interface ReqIfHeader extends EObject {
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
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getReqIfHeader_Comment()
	 * @model ordered="false"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.ReqIfHeader#getComment <em>Comment</em>}' attribute.
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
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getReqIfHeader_CreationTime()
	 * @model dataType="org.eclipse.rmf.reqif10.datatypes.DateTime" required="true" ordered="false"
	 * @generated
	 */
	XMLGregorianCalendar getCreationTime();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.ReqIfHeader#getCreationTime <em>Creation Time</em>}' attribute.
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
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getReqIfHeader_Identifier()
	 * @model dataType="org.eclipse.rmf.reqif10.datatypes.Id" required="true" ordered="false"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.ReqIfHeader#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Repository Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Id</em>' attribute.
	 * @see #setRepositoryId(String)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getReqIfHeader_RepositoryId()
	 * @model ordered="false"
	 * @generated
	 */
	String getRepositoryId();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.ReqIfHeader#getRepositoryId <em>Repository Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository Id</em>' attribute.
	 * @see #getRepositoryId()
	 * @generated
	 */
	void setRepositoryId(String value);

	/**
	 * Returns the value of the '<em><b>Req If Tool Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req If Tool Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req If Tool Id</em>' attribute.
	 * @see #setReqIfToolId(String)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getReqIfHeader_ReqIfToolId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getReqIfToolId();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.ReqIfHeader#getReqIfToolId <em>Req If Tool Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req If Tool Id</em>' attribute.
	 * @see #getReqIfToolId()
	 * @generated
	 */
	void setReqIfToolId(String value);

	/**
	 * Returns the value of the '<em><b>Req If Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req If Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req If Version</em>' attribute.
	 * @see #setReqIfVersion(String)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getReqIfHeader_ReqIfVersion()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getReqIfVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.ReqIfHeader#getReqIfVersion <em>Req If Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Req If Version</em>' attribute.
	 * @see #getReqIfVersion()
	 * @generated
	 */
	void setReqIfVersion(String value);

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
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getReqIfHeader_SourceToolId()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSourceToolId();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.ReqIfHeader#getSourceToolId <em>Source Tool Id</em>}' attribute.
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
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getReqIfHeader_Title()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.ReqIfHeader#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Document Root</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.ReqIf#getTheHeader <em>The Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Root</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Root</em>' container reference.
	 * @see #setDocumentRoot(ReqIf)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getReqIfHeader_DocumentRoot()
	 * @see org.eclipse.rmf.reqif10.ReqIf#getTheHeader
	 * @model opposite="theHeader" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ReqIf getDocumentRoot();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.ReqIfHeader#getDocumentRoot <em>Document Root</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Root</em>' container reference.
	 * @see #getDocumentRoot()
	 * @generated
	 */
	void setDocumentRoot(ReqIf value);

} // ReqIfHeader
