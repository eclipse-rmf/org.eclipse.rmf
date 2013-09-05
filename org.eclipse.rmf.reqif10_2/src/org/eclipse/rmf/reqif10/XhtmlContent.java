/**
 * Copyright (c) 2013 itemis AG.
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xhtml Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.XhtmlContent#getXhtml <em>Xhtml</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.XhtmlContent#getXhtmlSource <em>Xhtml Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getXhtmlContent()
 * @model extendedMetaData="name='XHTML-CONTENT' kind='elementOnly'"
 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='XHTML-CONTENT'"
 * @generated
 */
public interface XhtmlContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Xhtml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xhtml</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xhtml</em>' containment reference.
	 * @see #isSetXhtml()
	 * @see #unsetXhtml()
	 * @see #setXhtml(EObject)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getXhtmlContent_Xhtml()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="name='XHTML' kind='elementWildcard' namespace='##targetNamespace' precessing='lax' wildcards='http://www.w3.org/1999/xhtml'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='XHTML' featureWrapperElement='false' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EObject getXhtml();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.XhtmlContent#getXhtml <em>Xhtml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xhtml</em>' containment reference.
	 * @see #isSetXhtml()
	 * @see #unsetXhtml()
	 * @see #getXhtml()
	 * @generated
	 */
	void setXhtml(EObject value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.XhtmlContent#getXhtml <em>Xhtml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXhtml()
	 * @see #getXhtml()
	 * @see #setXhtml(EObject)
	 * @generated
	 */
	void unsetXhtml();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.XhtmlContent#getXhtml <em>Xhtml</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Xhtml</em>' containment reference is set.
	 * @see #unsetXhtml()
	 * @see #getXhtml()
	 * @see #setXhtml(EObject)
	 * @generated
	 */
	boolean isSetXhtml();

	/**
	 * Returns the value of the '<em><b>Xhtml Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xhtml Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xhtml Source</em>' attribute.
	 * @see #isSetXhtmlSource()
	 * @see #unsetXhtmlSource()
	 * @see #setXhtmlSource(String)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getXhtmlContent_XhtmlSource()
	 * @model unsettable="true" transient="true" derived="true"
	 *        extendedMetaData="name='XHTML-SOURCE' kind='element' namespace='##targetNamespace'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='XHTML-SOURCE' featureWrapperElement='false' featureElement='true' classifierWrapperElement='false' classifierElement='false'"
	 * @generated
	 */
	String getXhtmlSource();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.XhtmlContent#getXhtmlSource <em>Xhtml Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xhtml Source</em>' attribute.
	 * @see #isSetXhtmlSource()
	 * @see #unsetXhtmlSource()
	 * @see #getXhtmlSource()
	 * @generated
	 */
	void setXhtmlSource(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.XhtmlContent#getXhtmlSource <em>Xhtml Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetXhtmlSource()
	 * @see #getXhtmlSource()
	 * @see #setXhtmlSource(String)
	 * @generated
	 */
	void unsetXhtmlSource();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.XhtmlContent#getXhtmlSource <em>Xhtml Source</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Xhtml Source</em>' attribute is set.
	 * @see #unsetXhtmlSource()
	 * @see #getXhtmlSource()
	 * @see #setXhtmlSource(String)
	 * @generated
	 */
	boolean isSetXhtmlSource();

} // XhtmlContent
