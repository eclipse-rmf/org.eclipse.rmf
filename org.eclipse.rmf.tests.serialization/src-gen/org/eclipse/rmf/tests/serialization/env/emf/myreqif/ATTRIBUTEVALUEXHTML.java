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
 * A representation of the model object '<em><b>ATTRIBUTEVALUEXHTML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML#getTHEVALUE <em>THEVALUE</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML#getTHEORIGINALVALUE <em>THEORIGINALVALUE</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML#getDEFINITION <em>DEFINITION</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML#isISSIMPLIFIED <em>ISSIMPLIFIED</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getATTRIBUTEVALUEXHTML()
 * @model extendedMetaData="name='ATTRIBUTE-VALUE-XHTML' kind='elementOnly'"
 * @generated
 */
public interface ATTRIBUTEVALUEXHTML extends EObject {
	/**
	 * Returns the value of the '<em><b>THEVALUE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>THEVALUE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>THEVALUE</em>' attribute.
	 * @see #setTHEVALUE(String)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getATTRIBUTEVALUEXHTML_THEVALUE()
	 * @model dataType="org.eclipse.rmf.tests.serialization.env.emf.myreqif.XHTMLCONTENT" required="true"
	 *        extendedMetaData="kind='element' name='THE-VALUE' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTHEVALUE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML#getTHEVALUE <em>THEVALUE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>THEVALUE</em>' attribute.
	 * @see #getTHEVALUE()
	 * @generated
	 */
	void setTHEVALUE(String value);

	/**
	 * Returns the value of the '<em><b>THEORIGINALVALUE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>THEORIGINALVALUE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>THEORIGINALVALUE</em>' attribute.
	 * @see #setTHEORIGINALVALUE(String)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getATTRIBUTEVALUEXHTML_THEORIGINALVALUE()
	 * @model dataType="org.eclipse.rmf.tests.serialization.env.emf.myreqif.XHTMLCONTENT"
	 *        extendedMetaData="kind='element' name='THE-ORIGINAL-VALUE' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTHEORIGINALVALUE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML#getTHEORIGINALVALUE <em>THEORIGINALVALUE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>THEORIGINALVALUE</em>' attribute.
	 * @see #getTHEORIGINALVALUE()
	 * @generated
	 */
	void setTHEORIGINALVALUE(String value);

	/**
	 * Returns the value of the '<em><b>DEFINITION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DEFINITION</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DEFINITION</em>' containment reference.
	 * @see #setDEFINITION(DEFINITIONType3)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getATTRIBUTEVALUEXHTML_DEFINITION()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DEFINITION' namespace='##targetNamespace'"
	 * @generated
	 */
	DEFINITIONType3 getDEFINITION();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML#getDEFINITION <em>DEFINITION</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DEFINITION</em>' containment reference.
	 * @see #getDEFINITION()
	 * @generated
	 */
	void setDEFINITION(DEFINITIONType3 value);

	/**
	 * Returns the value of the '<em><b>ISSIMPLIFIED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ISSIMPLIFIED</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ISSIMPLIFIED</em>' attribute.
	 * @see #isSetISSIMPLIFIED()
	 * @see #unsetISSIMPLIFIED()
	 * @see #setISSIMPLIFIED(boolean)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getATTRIBUTEVALUEXHTML_ISSIMPLIFIED()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IS-SIMPLIFIED'"
	 * @generated
	 */
	boolean isISSIMPLIFIED();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML#isISSIMPLIFIED <em>ISSIMPLIFIED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ISSIMPLIFIED</em>' attribute.
	 * @see #isSetISSIMPLIFIED()
	 * @see #unsetISSIMPLIFIED()
	 * @see #isISSIMPLIFIED()
	 * @generated
	 */
	void setISSIMPLIFIED(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML#isISSIMPLIFIED <em>ISSIMPLIFIED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetISSIMPLIFIED()
	 * @see #isISSIMPLIFIED()
	 * @see #setISSIMPLIFIED(boolean)
	 * @generated
	 */
	void unsetISSIMPLIFIED();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML#isISSIMPLIFIED <em>ISSIMPLIFIED</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ISSIMPLIFIED</em>' attribute is set.
	 * @see #unsetISSIMPLIFIED()
	 * @see #isISSIMPLIFIED()
	 * @see #setISSIMPLIFIED(boolean)
	 * @generated
	 */
	boolean isSetISSIMPLIFIED();

} // ATTRIBUTEVALUEXHTML
