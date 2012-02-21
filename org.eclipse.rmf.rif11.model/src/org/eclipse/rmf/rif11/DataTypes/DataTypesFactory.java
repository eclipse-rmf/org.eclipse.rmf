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

package org.eclipse.rmf.rif11.DataTypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.rif11.DataTypes.DataTypesPackage
 * @generated
 */
public interface DataTypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataTypesFactory eINSTANCE = org.eclipse.rmf.rif11.DataTypes.impl.DataTypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Binary Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Content</em>'.
	 * @generated
	 */
	BinaryContent createBinaryContent();

	/**
	 * Returns a new object of class '<em>Xml Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xml Content</em>'.
	 * @generated
	 */
	XmlContent createXmlContent();

	/**
	 * Returns a new object of class '<em>Xhtml Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xhtml Content</em>'.
	 * @generated
	 */
	XhtmlContent createXhtmlContent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataTypesPackage getDataTypesPackage();

} //DataTypesFactory
