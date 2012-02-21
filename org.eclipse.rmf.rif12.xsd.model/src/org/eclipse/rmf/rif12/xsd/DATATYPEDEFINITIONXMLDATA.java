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
 * A representation of the model object '<em><b>DATATYPEDEFINITIONXMLDATA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a complex data type that is based on an XML-Schema.
 * 
 * It contains the reference to the XML-Schema on which the complex data is based.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONXMLDATA#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONXMLDATA#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONXMLDATA#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONXMLDATA#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONXMLDATA#isEMBEDDED <em>EMBEDDED</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONXMLDATA#getNAMESPACEURI <em>NAMESPACEURI</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONXMLDATA#getSCHEMALOCATION <em>SCHEMALOCATION</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONXMLDATA()
 * @model extendedMetaData="name='DATATYPE-DEFINITION-XML-DATA' kind='elementOnly'"
 * @generated
 */
public interface DATATYPEDEFINITIONXMLDATA extends EObject {
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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONXMLDATA_DESC()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DESC' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDESC();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONXMLDATA#getDESC <em>DESC</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONXMLDATA_IDENTIFIER()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIDENTIFIER();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONXMLDATA#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONXMLDATA_LASTCHANGE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='LAST-CHANGE' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getLASTCHANGE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONXMLDATA#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONXMLDATA_LONGNAME()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='LONG-NAME' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLONGNAME();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONXMLDATA#getLONGNAME <em>LONGNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LONGNAME</em>' attribute.
	 * @see #getLONGNAME()
	 * @generated
	 */
	void setLONGNAME(String value);

	/**
	 * Returns the value of the '<em><b>EMBEDDED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EMBEDDED</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EMBEDDED</em>' attribute.
	 * @see #isSetEMBEDDED()
	 * @see #unsetEMBEDDED()
	 * @see #setEMBEDDED(boolean)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONXMLDATA_EMBEDDED()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='EMBEDDED' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEMBEDDED();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONXMLDATA#isEMBEDDED <em>EMBEDDED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EMBEDDED</em>' attribute.
	 * @see #isSetEMBEDDED()
	 * @see #unsetEMBEDDED()
	 * @see #isEMBEDDED()
	 * @generated
	 */
	void setEMBEDDED(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONXMLDATA#isEMBEDDED <em>EMBEDDED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEMBEDDED()
	 * @see #isEMBEDDED()
	 * @see #setEMBEDDED(boolean)
	 * @generated
	 */
	void unsetEMBEDDED();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONXMLDATA#isEMBEDDED <em>EMBEDDED</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>EMBEDDED</em>' attribute is set.
	 * @see #unsetEMBEDDED()
	 * @see #isEMBEDDED()
	 * @see #setEMBEDDED(boolean)
	 * @generated
	 */
	boolean isSetEMBEDDED();

	/**
	 * Returns the value of the '<em><b>NAMESPACEURI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NAMESPACEURI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NAMESPACEURI</em>' attribute.
	 * @see #setNAMESPACEURI(String)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONXMLDATA_NAMESPACEURI()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='NAME-SPACE-URI' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNAMESPACEURI();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONXMLDATA#getNAMESPACEURI <em>NAMESPACEURI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NAMESPACEURI</em>' attribute.
	 * @see #getNAMESPACEURI()
	 * @generated
	 */
	void setNAMESPACEURI(String value);

	/**
	 * Returns the value of the '<em><b>SCHEMALOCATION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SCHEMALOCATION</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SCHEMALOCATION</em>' attribute.
	 * @see #setSCHEMALOCATION(String)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONXMLDATA_SCHEMALOCATION()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='SCHEMA-LOCATION' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSCHEMALOCATION();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONXMLDATA#getSCHEMALOCATION <em>SCHEMALOCATION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SCHEMALOCATION</em>' attribute.
	 * @see #getSCHEMALOCATION()
	 * @generated
	 */
	void setSCHEMALOCATION(String value);

} // DATATYPEDEFINITIONXMLDATA
