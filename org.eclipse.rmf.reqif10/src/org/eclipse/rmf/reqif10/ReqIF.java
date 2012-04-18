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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Req IF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIF#getLang <em>Lang</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIF#getTheHeader <em>The Header</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIF#getCoreContent <em>Core Content</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.ReqIF#getToolExtensions <em>Tool Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getReqIF()
 * @model extendedMetaData="name='REQ-IF' kind='elementOnly'"
 * @generated
 */
public interface ReqIF extends EObject {
	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #isSetLang()
	 * @see #unsetLang()
	 * @see #setLang(String)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getReqIF_Lang()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.namespace.LangType" ordered="false"
	 *        extendedMetaData="name='LANG' kind='attribute'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.ReqIF#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #isSetLang()
	 * @see #unsetLang()
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.ReqIF#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLang()
	 * @see #getLang()
	 * @see #setLang(String)
	 * @generated
	 */
	void unsetLang();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.ReqIF#getLang <em>Lang</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lang</em>' attribute is set.
	 * @see #unsetLang()
	 * @see #getLang()
	 * @see #setLang(String)
	 * @generated
	 */
	boolean isSetLang();

	/**
	 * Returns the value of the '<em><b>The Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Header</em>' containment reference.
	 * @see #isSetTheHeader()
	 * @see #unsetTheHeader()
	 * @see #setTheHeader(ReqIFHeader)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getReqIF_TheHeader()
	 * @model containment="true" unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='THE-HEADER' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	ReqIFHeader getTheHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.ReqIF#getTheHeader <em>The Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Header</em>' containment reference.
	 * @see #isSetTheHeader()
	 * @see #unsetTheHeader()
	 * @see #getTheHeader()
	 * @generated
	 */
	void setTheHeader(ReqIFHeader value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.ReqIF#getTheHeader <em>The Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTheHeader()
	 * @see #getTheHeader()
	 * @see #setTheHeader(ReqIFHeader)
	 * @generated
	 */
	void unsetTheHeader();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.ReqIF#getTheHeader <em>The Header</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>The Header</em>' containment reference is set.
	 * @see #unsetTheHeader()
	 * @see #getTheHeader()
	 * @see #setTheHeader(ReqIFHeader)
	 * @generated
	 */
	boolean isSetTheHeader();

	/**
	 * Returns the value of the '<em><b>Tool Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.ReqIFToolExtension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Extensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Extensions</em>' containment reference list.
	 * @see #isSetToolExtensions()
	 * @see #unsetToolExtensions()
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getReqIF_ToolExtensions()
	 * @model containment="true" unsettable="true" ordered="false"
	 *        extendedMetaData="name='TOOL-EXTENSIONS' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReqIFToolExtension> getToolExtensions();

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.ReqIF#getToolExtensions <em>Tool Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetToolExtensions()
	 * @see #getToolExtensions()
	 * @generated
	 */
	void unsetToolExtensions();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.ReqIF#getToolExtensions <em>Tool Extensions</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tool Extensions</em>' containment reference list is set.
	 * @see #unsetToolExtensions()
	 * @see #getToolExtensions()
	 * @generated
	 */
	boolean isSetToolExtensions();

	/**
	 * Returns the value of the '<em><b>Core Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Content</em>' containment reference.
	 * @see #isSetCoreContent()
	 * @see #unsetCoreContent()
	 * @see #setCoreContent(ReqIFContent)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getReqIF_CoreContent()
	 * @model containment="true" unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='CORE-CONTENT' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	ReqIFContent getCoreContent();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.ReqIF#getCoreContent <em>Core Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Content</em>' containment reference.
	 * @see #isSetCoreContent()
	 * @see #unsetCoreContent()
	 * @see #getCoreContent()
	 * @generated
	 */
	void setCoreContent(ReqIFContent value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.ReqIF#getCoreContent <em>Core Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCoreContent()
	 * @see #getCoreContent()
	 * @see #setCoreContent(ReqIFContent)
	 * @generated
	 */
	void unsetCoreContent();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.ReqIF#getCoreContent <em>Core Content</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Core Content</em>' containment reference is set.
	 * @see #unsetCoreContent()
	 * @see #getCoreContent()
	 * @see #setCoreContent(ReqIFContent)
	 * @generated
	 */
	boolean isSetCoreContent();

} // ReqIF
