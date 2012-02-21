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
 * A representation of the model object '<em><b>SPECGROUP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Constitutes a group of SpecObjects that belong together.
 * A group of SpecObjects is a simple set, i.e. no structure or order is implicited by SpecGroup.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.SPECGROUP#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.SPECGROUP#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.SPECGROUP#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.SPECGROUP#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.SPECGROUP#getTYPE <em>TYPE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.SPECGROUP#getVALUES <em>VALUES</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.SPECGROUP#getRELATIONGROUPS <em>RELATIONGROUPS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.SPECGROUP#getSPECOBJECTS <em>SPECOBJECTS</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getSPECGROUP()
 * @model extendedMetaData="name='SPEC-GROUP' kind='elementOnly'"
 * @generated
 */
public interface SPECGROUP extends EObject {
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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getSPECGROUP_DESC()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DESC' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDESC();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.SPECGROUP#getDESC <em>DESC</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getSPECGROUP_IDENTIFIER()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIDENTIFIER();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.SPECGROUP#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getSPECGROUP_LASTCHANGE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='LAST-CHANGE' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getLASTCHANGE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.SPECGROUP#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getSPECGROUP_LONGNAME()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='LONG-NAME' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLONGNAME();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.SPECGROUP#getLONGNAME <em>LONGNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LONGNAME</em>' attribute.
	 * @see #getLONGNAME()
	 * @generated
	 */
	void setLONGNAME(String value);

	/**
	 * Returns the value of the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TYPE</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TYPE</em>' containment reference.
	 * @see #setTYPE(TYPEType1)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getSPECGROUP_TYPE()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TYPE' namespace='##targetNamespace'"
	 * @generated
	 */
	TYPEType1 getTYPE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.SPECGROUP#getTYPE <em>TYPE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TYPE</em>' containment reference.
	 * @see #getTYPE()
	 * @generated
	 */
	void setTYPE(TYPEType1 value);

	/**
	 * Returns the value of the '<em><b>VALUES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VALUES</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VALUES</em>' containment reference.
	 * @see #setVALUES(VALUESType)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getSPECGROUP_VALUES()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VALUES' namespace='##targetNamespace'"
	 * @generated
	 */
	VALUESType getVALUES();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.SPECGROUP#getVALUES <em>VALUES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VALUES</em>' containment reference.
	 * @see #getVALUES()
	 * @generated
	 */
	void setVALUES(VALUESType value);

	/**
	 * Returns the value of the '<em><b>RELATIONGROUPS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RELATIONGROUPS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RELATIONGROUPS</em>' containment reference.
	 * @see #setRELATIONGROUPS(RELATIONGROUPSType)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getSPECGROUP_RELATIONGROUPS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RELATION-GROUPS' namespace='##targetNamespace'"
	 * @generated
	 */
	RELATIONGROUPSType getRELATIONGROUPS();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.SPECGROUP#getRELATIONGROUPS <em>RELATIONGROUPS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RELATIONGROUPS</em>' containment reference.
	 * @see #getRELATIONGROUPS()
	 * @generated
	 */
	void setRELATIONGROUPS(RELATIONGROUPSType value);

	/**
	 * Returns the value of the '<em><b>SPECOBJECTS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECOBJECTS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECOBJECTS</em>' containment reference.
	 * @see #setSPECOBJECTS(SPECOBJECTSType2)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getSPECGROUP_SPECOBJECTS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPEC-OBJECTS' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECOBJECTSType2 getSPECOBJECTS();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.SPECGROUP#getSPECOBJECTS <em>SPECOBJECTS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECOBJECTS</em>' containment reference.
	 * @see #getSPECOBJECTS()
	 * @generated
	 */
	void setSPECOBJECTS(SPECOBJECTSType2 value);

} // SPECGROUP
