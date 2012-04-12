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

package org.eclipse.rmf.rif11.xsd;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DATATYPEDEFINITIONBINARYFILE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a complex data type that is based on generic binary data.
 * 
 * It contains further information on the file format, the associated application etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#isEMBEDDED <em>EMBEDDED</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getAPPLICATION <em>APPLICATION</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getFILENAMESUFFIX <em>FILENAMESUFFIX</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getFORMATNAME <em>FORMATNAME</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getMIMETYPE <em>MIMETYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getDATATYPEDEFINITIONBINARYFILE()
 * @model extendedMetaData="name='DATATYPE-DEFINITION-BINARY-FILE' kind='elementOnly'"
 * @generated
 */
public interface DATATYPEDEFINITIONBINARYFILE extends EObject {
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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getDATATYPEDEFINITIONBINARYFILE_DESC()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DESC' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDESC();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getDESC <em>DESC</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getDATATYPEDEFINITIONBINARYFILE_IDENTIFIER()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIDENTIFIER();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getDATATYPEDEFINITIONBINARYFILE_LASTCHANGE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='LAST-CHANGE' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getLASTCHANGE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getDATATYPEDEFINITIONBINARYFILE_LONGNAME()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='LONG-NAME' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLONGNAME();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getLONGNAME <em>LONGNAME</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getDATATYPEDEFINITIONBINARYFILE_EMBEDDED()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='EMBEDDED' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEMBEDDED();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#isEMBEDDED <em>EMBEDDED</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#isEMBEDDED <em>EMBEDDED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEMBEDDED()
	 * @see #isEMBEDDED()
	 * @see #setEMBEDDED(boolean)
	 * @generated
	 */
	void unsetEMBEDDED();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#isEMBEDDED <em>EMBEDDED</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>APPLICATION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APPLICATION</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APPLICATION</em>' attribute.
	 * @see #setAPPLICATION(String)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getDATATYPEDEFINITIONBINARYFILE_APPLICATION()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='APPLICATION' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAPPLICATION();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getAPPLICATION <em>APPLICATION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APPLICATION</em>' attribute.
	 * @see #getAPPLICATION()
	 * @generated
	 */
	void setAPPLICATION(String value);

	/**
	 * Returns the value of the '<em><b>FILENAMESUFFIX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FILENAMESUFFIX</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FILENAMESUFFIX</em>' attribute.
	 * @see #setFILENAMESUFFIX(String)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getDATATYPEDEFINITIONBINARYFILE_FILENAMESUFFIX()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='FILENAME-SUFFIX' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFILENAMESUFFIX();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getFILENAMESUFFIX <em>FILENAMESUFFIX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FILENAMESUFFIX</em>' attribute.
	 * @see #getFILENAMESUFFIX()
	 * @generated
	 */
	void setFILENAMESUFFIX(String value);

	/**
	 * Returns the value of the '<em><b>FORMATNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FORMATNAME</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FORMATNAME</em>' attribute.
	 * @see #setFORMATNAME(String)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getDATATYPEDEFINITIONBINARYFILE_FORMATNAME()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='FORMAT-NAME' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFORMATNAME();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getFORMATNAME <em>FORMATNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FORMATNAME</em>' attribute.
	 * @see #getFORMATNAME()
	 * @generated
	 */
	void setFORMATNAME(String value);

	/**
	 * Returns the value of the '<em><b>MIMETYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MIMETYPE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MIMETYPE</em>' attribute.
	 * @see #setMIMETYPE(String)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getDATATYPEDEFINITIONBINARYFILE_MIMETYPE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='MIME-TYPE' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMIMETYPE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getMIMETYPE <em>MIMETYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MIMETYPE</em>' attribute.
	 * @see #getMIMETYPE()
	 * @generated
	 */
	void setMIMETYPE(String value);

} // DATATYPEDEFINITIONBINARYFILE
