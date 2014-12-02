/*******************************************************************************
 * Copyright (c) 2014 Hussein Mhanna
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Hussein Mhanna - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.csv.importer.mapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.csv.importer.mapping.MappingItem#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.csv.importer.mapping.MappingItem#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.csv.importer.mapping.MappingItem#getColumnId <em>Column Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.MappingPackage#getMappingItem()
 * @model
 * @generated
 */
public interface MappingItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Name</em>' attribute.
	 * @see #setAttributeName(String)
	 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.MappingPackage#getMappingItem_AttributeName()
	 * @model default="" required="true"
	 * @generated
	 */
	String getAttributeName();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.csv.importer.mapping.MappingItem#getAttributeName <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Name</em>' attribute.
	 * @see #getAttributeName()
	 * @generated
	 */
	void setAttributeName(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.rmf.reqif10.csv.importer.mapping.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.DataType
	 * @see #setDataType(DataType)
	 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.MappingPackage#getMappingItem_DataType()
	 * @model required="true"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.csv.importer.mapping.MappingItem#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.DataType
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Column Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Id</em>' attribute.
	 * @see #setColumnId(String)
	 * @see org.eclipse.rmf.reqif10.csv.importer.mapping.MappingPackage#getMappingItem_ColumnId()
	 * @model default="" required="true"
	 * @generated
	 */
	String getColumnId();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.csv.importer.mapping.MappingItem#getColumnId <em>Column Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Id</em>' attribute.
	 * @see #getColumnId()
	 * @generated
	 */
	void setColumnId(String value);

} // MappingItem
