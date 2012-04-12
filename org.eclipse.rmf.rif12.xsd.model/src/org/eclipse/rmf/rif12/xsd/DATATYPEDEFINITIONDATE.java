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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DATATYPEDEFINITIONDATE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONDATE#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONDATE#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONDATE#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONDATE#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONDATE#getFORMAT <em>FORMAT</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONDATE()
 * @model extendedMetaData="name='DATATYPE-DEFINITION-DATE' kind='elementOnly'"
 * @generated
 */
public interface DATATYPEDEFINITIONDATE extends EObject {
	/**
	 * Returns the value of the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DESC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DESC</em>' attribute.
	 * @see #setDESC(String)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONDATE_DESC()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DESC' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDESC();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONDATE#getDESC <em>DESC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DESC</em>' attribute.
	 * @see #getDESC()
	 * @generated
	 */
	void setDESC(String value);

	/**
	 * Returns the value of the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IDENTIFIER</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IDENTIFIER</em>' attribute.
	 * @see #setIDENTIFIER(String)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONDATE_IDENTIFIER()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIDENTIFIER();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONDATE#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDENTIFIER</em>' attribute.
	 * @see #getIDENTIFIER()
	 * @generated
	 */
	void setIDENTIFIER(String value);

	/**
	 * Returns the value of the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LASTCHANGE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LASTCHANGE</em>' attribute.
	 * @see #setLASTCHANGE(XMLGregorianCalendar)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONDATE_LASTCHANGE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='LAST-CHANGE' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getLASTCHANGE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONDATE#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LASTCHANGE</em>' attribute.
	 * @see #getLASTCHANGE()
	 * @generated
	 */
	void setLASTCHANGE(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LONGNAME</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LONGNAME</em>' attribute.
	 * @see #setLONGNAME(String)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONDATE_LONGNAME()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='LONG-NAME' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLONGNAME();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONDATE#getLONGNAME <em>LONGNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LONGNAME</em>' attribute.
	 * @see #getLONGNAME()
	 * @generated
	 */
	void setLONGNAME(String value);

	/**
	 * Returns the value of the '<em><b>FORMAT</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONDATEFORMATENUM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FORMAT</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FORMAT</em>' attribute.
	 * @see org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONDATEFORMATENUM
	 * @see #isSetFORMAT()
	 * @see #unsetFORMAT()
	 * @see #setFORMAT(DATATYPEDEFINITIONDATEFORMATENUM)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONDATE_FORMAT()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='FORMAT' namespace='##targetNamespace'"
	 * @generated
	 */
	DATATYPEDEFINITIONDATEFORMATENUM getFORMAT();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONDATE#getFORMAT <em>FORMAT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FORMAT</em>' attribute.
	 * @see org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONDATEFORMATENUM
	 * @see #isSetFORMAT()
	 * @see #unsetFORMAT()
	 * @see #getFORMAT()
	 * @generated
	 */
	void setFORMAT(DATATYPEDEFINITIONDATEFORMATENUM value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONDATE#getFORMAT <em>FORMAT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFORMAT()
	 * @see #getFORMAT()
	 * @see #setFORMAT(DATATYPEDEFINITIONDATEFORMATENUM)
	 * @generated
	 */
	void unsetFORMAT();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONDATE#getFORMAT <em>FORMAT</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>FORMAT</em>' attribute is set.
	 * @see #unsetFORMAT()
	 * @see #getFORMAT()
	 * @see #setFORMAT(DATATYPEDEFINITIONDATEFORMATENUM)
	 * @generated
	 */
	boolean isSetFORMAT();

} // DATATYPEDEFINITIONDATE
