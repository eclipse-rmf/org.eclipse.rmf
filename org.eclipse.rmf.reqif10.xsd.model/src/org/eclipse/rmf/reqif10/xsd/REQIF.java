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

package org.eclipse.rmf.reqif10.xsd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REQIF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.REQIF#getTHEHEADER <em>THEHEADER</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.REQIF#getCORECONTENT <em>CORECONTENT</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.REQIF#getTOOLEXTENSIONS <em>TOOLEXTENSIONS</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.REQIF#getLang <em>Lang</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getREQIF()
 * @model extendedMetaData="name='REQ-IF' kind='elementOnly'"
 * @generated
 */
public interface REQIF extends EObject {
	/**
	 * Returns the value of the '<em><b>THEHEADER</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>THEHEADER</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>THEHEADER</em>' containment reference.
	 * @see #setTHEHEADER(THEHEADERType)
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getREQIF_THEHEADER()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='THE-HEADER' namespace='##targetNamespace'"
	 * @generated
	 */
	THEHEADERType getTHEHEADER();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xsd.REQIF#getTHEHEADER <em>THEHEADER</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>THEHEADER</em>' containment reference.
	 * @see #getTHEHEADER()
	 * @generated
	 */
	void setTHEHEADER(THEHEADERType value);

	/**
	 * Returns the value of the '<em><b>CORECONTENT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CORECONTENT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CORECONTENT</em>' containment reference.
	 * @see #setCORECONTENT(CORECONTENTType)
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getREQIF_CORECONTENT()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CORE-CONTENT' namespace='##targetNamespace'"
	 * @generated
	 */
	CORECONTENTType getCORECONTENT();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xsd.REQIF#getCORECONTENT <em>CORECONTENT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CORECONTENT</em>' containment reference.
	 * @see #getCORECONTENT()
	 * @generated
	 */
	void setCORECONTENT(CORECONTENTType value);

	/**
	 * Returns the value of the '<em><b>TOOLEXTENSIONS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TOOLEXTENSIONS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TOOLEXTENSIONS</em>' containment reference.
	 * @see #setTOOLEXTENSIONS(TOOLEXTENSIONSType)
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getREQIF_TOOLEXTENSIONS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TOOL-EXTENSIONS' namespace='##targetNamespace'"
	 * @generated
	 */
	TOOLEXTENSIONSType getTOOLEXTENSIONS();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xsd.REQIF#getTOOLEXTENSIONS <em>TOOLEXTENSIONS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TOOLEXTENSIONS</em>' containment reference.
	 * @see #getTOOLEXTENSIONS()
	 * @generated
	 */
	void setTOOLEXTENSIONS(TOOLEXTENSIONSType value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(Object)
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getREQIF_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getLang();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xsd.REQIF#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(Object value);

} // REQIF
