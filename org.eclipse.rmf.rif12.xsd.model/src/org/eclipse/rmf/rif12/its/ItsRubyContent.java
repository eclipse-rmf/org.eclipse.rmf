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

package org.eclipse.rmf.rif12.its;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ruby Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.its.ItsRubyContent#getRb <em>Rb</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.ItsRubyContent#getRt <em>Rt</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.ItsRubyContent#getRp <em>Rp</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.ItsRubyContent#getRt1 <em>Rt1</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.ItsRubyContent#getRp1 <em>Rp1</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.ItsRubyContent#getRbc <em>Rbc</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.ItsRubyContent#getRtc <em>Rtc</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.ItsRubyContent#getRtc1 <em>Rtc1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.its.ItsPackage#getItsRubyContent()
 * @model extendedMetaData="name='its-ruby.content' kind='elementOnly'"
 * @generated
 */
public interface ItsRubyContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Rb</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ruby base text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rb</em>' containment reference.
	 * @see #setRb(RbType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getItsRubyContent_Rb()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rb' namespace='##targetNamespace'"
	 * @generated
	 */
	RbType getRb();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.ItsRubyContent#getRb <em>Rb</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rb</em>' containment reference.
	 * @see #getRb()
	 * @generated
	 */
	void setRb(RbType value);

	/**
	 * Returns the value of the '<em><b>Rt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ruby text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rt</em>' containment reference.
	 * @see #setRt(RtType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getItsRubyContent_Rt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rt' namespace='##targetNamespace'"
	 * @generated
	 */
	RtType getRt();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.ItsRubyContent#getRt <em>Rt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rt</em>' containment reference.
	 * @see #getRt()
	 * @generated
	 */
	void setRt(RtType value);

	/**
	 * Returns the value of the '<em><b>Rp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used in the case of simple ruby markup to specify characters that can denote the beginning and end of ruby text when user agents do not have other ways to present ruby text distinctively from the base text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rp</em>' containment reference.
	 * @see #setRp(RpType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getItsRubyContent_Rp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rp' namespace='##targetNamespace'"
	 * @generated
	 */
	RpType getRp();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.ItsRubyContent#getRp <em>Rp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rp</em>' containment reference.
	 * @see #getRp()
	 * @generated
	 */
	void setRp(RpType value);

	/**
	 * Returns the value of the '<em><b>Rt1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ruby text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rt1</em>' containment reference.
	 * @see #setRt1(RtType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getItsRubyContent_Rt1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rt' namespace='##targetNamespace'"
	 * @generated
	 */
	RtType getRt1();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.ItsRubyContent#getRt1 <em>Rt1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rt1</em>' containment reference.
	 * @see #getRt1()
	 * @generated
	 */
	void setRt1(RtType value);

	/**
	 * Returns the value of the '<em><b>Rp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used in the case of simple ruby markup to specify characters that can denote the beginning and end of ruby text when user agents do not have other ways to present ruby text distinctively from the base text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rp1</em>' containment reference.
	 * @see #setRp1(RpType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getItsRubyContent_Rp1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rp' namespace='##targetNamespace'"
	 * @generated
	 */
	RpType getRp1();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.ItsRubyContent#getRp1 <em>Rp1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rp1</em>' containment reference.
	 * @see #getRp1()
	 * @generated
	 */
	void setRp1(RpType value);

	/**
	 * Returns the value of the '<em><b>Rbc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for rb elements in the case of complex ruby markup.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rbc</em>' containment reference.
	 * @see #setRbc(RbcType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getItsRubyContent_Rbc()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rbc' namespace='##targetNamespace'"
	 * @generated
	 */
	RbcType getRbc();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.ItsRubyContent#getRbc <em>Rbc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rbc</em>' containment reference.
	 * @see #getRbc()
	 * @generated
	 */
	void setRbc(RbcType value);

	/**
	 * Returns the value of the '<em><b>Rtc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for rt elements in the case of complex ruby markup. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rtc</em>' containment reference.
	 * @see #setRtc(RtcType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getItsRubyContent_Rtc()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rtc' namespace='##targetNamespace'"
	 * @generated
	 */
	RtcType getRtc();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.ItsRubyContent#getRtc <em>Rtc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtc</em>' containment reference.
	 * @see #getRtc()
	 * @generated
	 */
	void setRtc(RtcType value);

	/**
	 * Returns the value of the '<em><b>Rtc1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for rt elements in the case of complex ruby markup. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rtc1</em>' containment reference.
	 * @see #setRtc1(RtcType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getItsRubyContent_Rtc1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rtc' namespace='##targetNamespace'"
	 * @generated
	 */
	RtcType getRtc1();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.ItsRubyContent#getRtc1 <em>Rtc1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtc1</em>' containment reference.
	 * @see #getRtc1()
	 * @generated
	 */
	void setRtc1(RtcType value);

} // ItsRubyContent
