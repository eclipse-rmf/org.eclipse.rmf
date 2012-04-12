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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ruby Rule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.its.RubyRuleType#getRbcPointer <em>Rbc Pointer</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.RubyRuleType#getRbspanPointer <em>Rbspan Pointer</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.RubyRuleType#getRpPointer <em>Rp Pointer</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.RubyRuleType#getRtcPointer <em>Rtc Pointer</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.RubyRuleType#getRtPointer <em>Rt Pointer</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.RubyRuleType#getRubyPointer <em>Ruby Pointer</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.RubyRuleType#getSelector <em>Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.its.ItsPackage#getRubyRuleType()
 * @model extendedMetaData="name='rubyRule_._type' kind='elementOnly'"
 * @generated
 */
public interface RubyRuleType extends ItsRubyRuleContent {
	/**
	 * Returns the value of the '<em><b>Rbc Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative XPath expression pointing to a node that
	 *                    corresponds to a rbc element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rbc Pointer</em>' attribute.
	 * @see #setRbcPointer(String)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getRubyRuleType_RbcPointer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='rbcPointer'"
	 * @generated
	 */
	String getRbcPointer();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.RubyRuleType#getRbcPointer <em>Rbc Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rbc Pointer</em>' attribute.
	 * @see #getRbcPointer()
	 * @generated
	 */
	void setRbcPointer(String value);

	/**
	 * Returns the value of the '<em><b>Rbspan Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative XPath expression pointing to a node that corresponds to a rbspan attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rbspan Pointer</em>' attribute.
	 * @see #setRbspanPointer(String)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getRubyRuleType_RbspanPointer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='rbspanPointer'"
	 * @generated
	 */
	String getRbspanPointer();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.RubyRuleType#getRbspanPointer <em>Rbspan Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rbspan Pointer</em>' attribute.
	 * @see #getRbspanPointer()
	 * @generated
	 */
	void setRbspanPointer(String value);

	/**
	 * Returns the value of the '<em><b>Rp Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative XPath expression pointing to a node that
	 *                    corresponds to a rp element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rp Pointer</em>' attribute.
	 * @see #setRpPointer(String)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getRubyRuleType_RpPointer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='rpPointer'"
	 * @generated
	 */
	String getRpPointer();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.RubyRuleType#getRpPointer <em>Rp Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rp Pointer</em>' attribute.
	 * @see #getRpPointer()
	 * @generated
	 */
	void setRpPointer(String value);

	/**
	 * Returns the value of the '<em><b>Rtc Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative XPath expression pointing to a node that
	 *                    corresponds to a rtc element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rtc Pointer</em>' attribute.
	 * @see #setRtcPointer(String)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getRubyRuleType_RtcPointer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='rtcPointer'"
	 * @generated
	 */
	String getRtcPointer();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.RubyRuleType#getRtcPointer <em>Rtc Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rtc Pointer</em>' attribute.
	 * @see #getRtcPointer()
	 * @generated
	 */
	void setRtcPointer(String value);

	/**
	 * Returns the value of the '<em><b>Rt Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative XPath expression pointing to a node that
	 *                    corresponds to a rt element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rt Pointer</em>' attribute.
	 * @see #setRtPointer(String)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getRubyRuleType_RtPointer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='rtPointer'"
	 * @generated
	 */
	String getRtPointer();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.RubyRuleType#getRtPointer <em>Rt Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rt Pointer</em>' attribute.
	 * @see #getRtPointer()
	 * @generated
	 */
	void setRtPointer(String value);

	/**
	 * Returns the value of the '<em><b>Ruby Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative XPath expression pointing to a node that corresponds to a ruby element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ruby Pointer</em>' attribute.
	 * @see #setRubyPointer(String)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getRubyRuleType_RubyPointer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='rubyPointer'"
	 * @generated
	 */
	String getRubyPointer();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.RubyRuleType#getRubyPointer <em>Ruby Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruby Pointer</em>' attribute.
	 * @see #getRubyPointer()
	 * @generated
	 */
	void setRubyPointer(String value);

	/**
	 * Returns the value of the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XPath expression identifying the nodes to be selected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selector</em>' attribute.
	 * @see #setSelector(String)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getRubyRuleType_Selector()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='selector'"
	 * @generated
	 */
	String getSelector();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.RubyRuleType#getSelector <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' attribute.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(String value);

} // RubyRuleType
