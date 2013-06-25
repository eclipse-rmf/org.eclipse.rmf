/**
 * Copyright (c) 2013 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    itemis AG - initial API and implementation
 * 
 */
package org.eclipse.rmf.tests.serialization.env.emf.myreqif;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REQIFCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT#getDATATYPES <em>DATATYPES</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT#getSPECTYPES <em>SPECTYPES</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT#getSPECOBJECTS <em>SPECOBJECTS</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT#getSPECRELATIONS <em>SPECRELATIONS</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT#getSPECIFICATIONS <em>SPECIFICATIONS</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT#getSPECRELATIONGROUPS <em>SPECRELATIONGROUPS</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getREQIFCONTENT()
 * @model extendedMetaData="name='REQ-IF-CONTENT' kind='elementOnly'"
 * @generated
 */
public interface REQIFCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>DATATYPES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPES</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPES</em>' containment reference.
	 * @see #setDATATYPES(DATATYPESType)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getREQIFCONTENT_DATATYPES()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DATATYPES' namespace='##targetNamespace'"
	 * @generated
	 */
	DATATYPESType getDATATYPES();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT#getDATATYPES <em>DATATYPES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATATYPES</em>' containment reference.
	 * @see #getDATATYPES()
	 * @generated
	 */
	void setDATATYPES(DATATYPESType value);

	/**
	 * Returns the value of the '<em><b>SPECTYPES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECTYPES</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECTYPES</em>' containment reference.
	 * @see #setSPECTYPES(SPECTYPESType)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getREQIFCONTENT_SPECTYPES()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPEC-TYPES' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECTYPESType getSPECTYPES();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT#getSPECTYPES <em>SPECTYPES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECTYPES</em>' containment reference.
	 * @see #getSPECTYPES()
	 * @generated
	 */
	void setSPECTYPES(SPECTYPESType value);

	/**
	 * Returns the value of the '<em><b>SPECOBJECTS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECOBJECTS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECOBJECTS</em>' containment reference.
	 * @see #setSPECOBJECTS(SPECOBJECTSType)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getREQIFCONTENT_SPECOBJECTS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPEC-OBJECTS' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECOBJECTSType getSPECOBJECTS();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT#getSPECOBJECTS <em>SPECOBJECTS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECOBJECTS</em>' containment reference.
	 * @see #getSPECOBJECTS()
	 * @generated
	 */
	void setSPECOBJECTS(SPECOBJECTSType value);

	/**
	 * Returns the value of the '<em><b>SPECRELATIONS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECRELATIONS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECRELATIONS</em>' containment reference.
	 * @see #setSPECRELATIONS(SPECRELATIONSType1)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getREQIFCONTENT_SPECRELATIONS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPEC-RELATIONS' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECRELATIONSType1 getSPECRELATIONS();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT#getSPECRELATIONS <em>SPECRELATIONS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECRELATIONS</em>' containment reference.
	 * @see #getSPECRELATIONS()
	 * @generated
	 */
	void setSPECRELATIONS(SPECRELATIONSType1 value);

	/**
	 * Returns the value of the '<em><b>SPECIFICATIONS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECIFICATIONS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECIFICATIONS</em>' containment reference.
	 * @see #setSPECIFICATIONS(SPECIFICATIONSType)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getREQIFCONTENT_SPECIFICATIONS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPECIFICATIONS' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECIFICATIONSType getSPECIFICATIONS();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT#getSPECIFICATIONS <em>SPECIFICATIONS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECIFICATIONS</em>' containment reference.
	 * @see #getSPECIFICATIONS()
	 * @generated
	 */
	void setSPECIFICATIONS(SPECIFICATIONSType value);

	/**
	 * Returns the value of the '<em><b>SPECRELATIONGROUPS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECRELATIONGROUPS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECRELATIONGROUPS</em>' containment reference.
	 * @see #setSPECRELATIONGROUPS(SPECRELATIONGROUPSType)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getREQIFCONTENT_SPECRELATIONGROUPS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPEC-RELATION-GROUPS' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECRELATIONGROUPSType getSPECRELATIONGROUPS();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT#getSPECRELATIONGROUPS <em>SPECRELATIONGROUPS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECRELATIONGROUPS</em>' containment reference.
	 * @see #getSPECRELATIONGROUPS()
	 * @generated
	 */
	void setSPECRELATIONGROUPS(SPECRELATIONGROUPSType value);

} // REQIFCONTENT
