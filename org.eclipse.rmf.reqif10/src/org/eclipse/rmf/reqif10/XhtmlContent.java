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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.rmf.reqif10.xhtml.XhtmlDivType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xhtml Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.XhtmlContent#getP <em>P</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.XhtmlContent#getDiv <em>Div</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getXhtmlContent()
 * @model extendedMetaData="name='XHTML-CONTENT' kind='elementOnly'"
 * @generated
 */
public interface XhtmlContent extends EObject {
	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference.
	 * @see #setP(XhtmlPType)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getXhtmlContent_P()
	 * @model containment="true"
	 *        extendedMetaData="name='p' kind='element' namespace='http://www.w3.org/1999/xhtml'"
	 * @generated
	 */
	XhtmlPType getP();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.XhtmlContent#getP <em>P</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P</em>' containment reference.
	 * @see #getP()
	 * @generated
	 */
	void setP(XhtmlPType value);

	/**
	 * Returns the value of the '<em><b>Div</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Div</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Div</em>' containment reference.
	 * @see #setDiv(XhtmlDivType)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getXhtmlContent_Div()
	 * @model containment="true"
	 *        extendedMetaData="name='div' kind='element' namespace='http://www.w3.org/1999/xhtml'"
	 * @generated
	 */
	XhtmlDivType getDiv();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.XhtmlContent#getDiv <em>Div</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Div</em>' containment reference.
	 * @see #getDiv()
	 * @generated
	 */
	void setDiv(XhtmlDivType value);

} // XhtmlContent
