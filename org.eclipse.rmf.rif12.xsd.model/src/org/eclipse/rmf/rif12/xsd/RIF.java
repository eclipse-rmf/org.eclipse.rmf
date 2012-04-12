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

package org.eclipse.rmf.rif12.xsd;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.rmf.rif12.its.DirType;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RIF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the root element.
 * 			Instances of concrete elements must directly or indirectly be aggregated by the root element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.RIF#getHEADER <em>HEADER</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.RIF#getCORECONTENT <em>CORECONTENT</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.RIF#getTOOLEXTENSIONS <em>TOOLEXTENSIONS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.RIF#getDir <em>Dir</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.RIF#getLang <em>Lang</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getRIF()
 * @model extendedMetaData="name='RIF' kind='elementOnly'"
 * @generated
 */
public interface RIF extends EObject {
	/**
	 * Returns the value of the '<em><b>HEADER</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HEADER</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HEADER</em>' containment reference.
	 * @see #setHEADER(HEADERType)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getRIF_HEADER()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='HEADER' namespace='##targetNamespace'"
	 * @generated
	 */
	HEADERType getHEADER();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.RIF#getHEADER <em>HEADER</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HEADER</em>' containment reference.
	 * @see #getHEADER()
	 * @generated
	 */
	void setHEADER(HEADERType value);

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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getRIF_CORECONTENT()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CORE-CONTENT' namespace='##targetNamespace'"
	 * @generated
	 */
	CORECONTENTType getCORECONTENT();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.RIF#getCORECONTENT <em>CORECONTENT</em>}' containment reference.
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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getRIF_TOOLEXTENSIONS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TOOL-EXTENSIONS' namespace='##targetNamespace'"
	 * @generated
	 */
	TOOLEXTENSIONSType getTOOLEXTENSIONS();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.RIF#getTOOLEXTENSIONS <em>TOOLEXTENSIONS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TOOLEXTENSIONS</em>' containment reference.
	 * @see #getTOOLEXTENSIONS()
	 * @generated
	 */
	void setTOOLEXTENSIONS(TOOLEXTENSIONSType value);

	/**
	 * Returns the value of the '<em><b>Dir</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.rmf.rif12.its.DirType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The text direction for the context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dir</em>' attribute.
	 * @see org.eclipse.rmf.rif12.its.DirType
	 * @see #isSetDir()
	 * @see #unsetDir()
	 * @see #setDir(DirType)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getRIF_Dir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dir' namespace='http://www.w3.org/2005/11/its'"
	 * @generated
	 */
	DirType getDir();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.RIF#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' attribute.
	 * @see org.eclipse.rmf.rif12.its.DirType
	 * @see #isSetDir()
	 * @see #unsetDir()
	 * @see #getDir()
	 * @generated
	 */
	void setDir(DirType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.rif12.xsd.RIF#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDir()
	 * @see #getDir()
	 * @see #setDir(DirType)
	 * @generated
	 */
	void unsetDir();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.rif12.xsd.RIF#getDir <em>Dir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dir</em>' attribute is set.
	 * @see #unsetDir()
	 * @see #getDir()
	 * @see #setDir(DirType)
	 * @generated
	 */
	boolean isSetDir();

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *     <div xmlns="http://www.w3.org/1999/xhtml">
	 *      
	 *       <h3>lang (as an attribute name)</h3>
	 *       <p>
	 *        denotes an attribute whose value
	 *        is a language code for the natural language of the content of
	 *        any element; its value is inherited.  This name is reserved
	 *        by virtue of its definition in the XML specification.</p>
	 *      
	 *     </div>
	 *     <div xmlns="http://www.w3.org/1999/xhtml">
	 *      <h4>Notes</h4>
	 *      <p>
	 *       Attempting to install the relevant ISO 2- and 3-letter
	 *       codes as the enumerated possible values is probably never
	 *       going to be a realistic possibility.  
	 *      </p>
	 *      <p>
	 *       See BCP 47 at <a href="http://www.rfc-editor.org/rfc/bcp/bcp47.txt">
	 *        http://www.rfc-editor.org/rfc/bcp/bcp47.txt</a>
	 *       and the IANA language subtag registry at
	 *       <a href="http://www.iana.org/assignments/language-subtag-registry">
	 *        http://www.iana.org/assignments/language-subtag-registry</a>
	 *       for further information.
	 *      </p>
	 *      <p>
	 *       The union allows for the 'un-declaration' of xml:lang with
	 *       the empty string.
	 *      </p>
	 *     </div>
	 *    
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(String)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getRIF_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.namespace.LangType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.RIF#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

} // RIF
