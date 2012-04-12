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

package org.eclipse.rmf.rif11.xhtml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.ParamType#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.ParamType#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.ParamType#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.ParamType#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.ParamType#getValuetype <em>Valuetype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getParamType()
 * @model extendedMetaData="name='param_._type' kind='empty'"
 * @generated
 */
public interface ParamType extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getParamType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.ParamType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(Object)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getParamType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	Object getName();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.ParamType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(Object value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getParamType_Type()
	 * @model dataType="org.eclipse.rmf.rif11.xhtml.ContentType"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.ParamType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getParamType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.ParamType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * Returns the value of the '<em><b>Valuetype</b></em>' attribute.
	 * The default value is <code>"data"</code>.
	 * The literals are from the enumeration {@link org.eclipse.rmf.rif11.xhtml.ValuetypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valuetype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valuetype</em>' attribute.
	 * @see org.eclipse.rmf.rif11.xhtml.ValuetypeType
	 * @see #isSetValuetype()
	 * @see #unsetValuetype()
	 * @see #setValuetype(ValuetypeType)
	 * @see org.eclipse.rmf.rif11.xhtml.XhtmlPackage#getParamType_Valuetype()
	 * @model default="data" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='valuetype'"
	 * @generated
	 */
	ValuetypeType getValuetype();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xhtml.ParamType#getValuetype <em>Valuetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valuetype</em>' attribute.
	 * @see org.eclipse.rmf.rif11.xhtml.ValuetypeType
	 * @see #isSetValuetype()
	 * @see #unsetValuetype()
	 * @see #getValuetype()
	 * @generated
	 */
	void setValuetype(ValuetypeType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.rif11.xhtml.ParamType#getValuetype <em>Valuetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValuetype()
	 * @see #getValuetype()
	 * @see #setValuetype(ValuetypeType)
	 * @generated
	 */
	void unsetValuetype();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.rif11.xhtml.ParamType#getValuetype <em>Valuetype</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valuetype</em>' attribute is set.
	 * @see #unsetValuetype()
	 * @see #getValuetype()
	 * @see #setValuetype(ValuetypeType)
	 * @generated
	 */
	boolean isSetValuetype();

} // ParamType
