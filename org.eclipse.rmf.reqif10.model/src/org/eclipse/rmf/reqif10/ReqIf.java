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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Req If</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIf#getLang <em>Lang</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIf#getTheHeader <em>The Header</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIf#getToolExtensions <em>Tool Extensions</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIf#getCoreContent <em>Core Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.Reqif10Package#getReqIf()
 * @model
 * @generated
 */
public interface ReqIf extends EObject {
	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(String)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getReqIf_Lang()
	 * @model ordered="false"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.ReqIf#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Returns the value of the '<em><b>The Header</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.ReqIfHeader#getDocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Header</em>' containment reference.
	 * @see #setTheHeader(ReqIfHeader)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getReqIf_TheHeader()
	 * @see org.eclipse.rmf.reqif10.ReqIfHeader#getDocumentRoot
	 * @model opposite="documentRoot" containment="true" required="true" ordered="false"
	 * @generated
	 */
	ReqIfHeader getTheHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.ReqIf#getTheHeader <em>The Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Header</em>' containment reference.
	 * @see #getTheHeader()
	 * @generated
	 */
	void setTheHeader(ReqIfHeader value);

	/**
	 * Returns the value of the '<em><b>Tool Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.ReqIfToolExtension}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.ReqIfToolExtension#getDocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Extensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Extensions</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getReqIf_ToolExtensions()
	 * @see org.eclipse.rmf.reqif10.ReqIfToolExtension#getDocumentRoot
	 * @model opposite="documentRoot" containment="true" ordered="false"
	 * @generated
	 */
	EList<ReqIfToolExtension> getToolExtensions();

	/**
	 * Returns the value of the '<em><b>Core Content</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.ReqIfContent#getDocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Content</em>' containment reference.
	 * @see #setCoreContent(ReqIfContent)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getReqIf_CoreContent()
	 * @see org.eclipse.rmf.reqif10.ReqIfContent#getDocumentRoot
	 * @model opposite="documentRoot" containment="true" required="true" ordered="false"
	 * @generated
	 */
	ReqIfContent getCoreContent();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.ReqIf#getCoreContent <em>Core Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Content</em>' containment reference.
	 * @see #getCoreContent()
	 * @generated
	 */
	void setCoreContent(ReqIfContent value);

} // ReqIf
