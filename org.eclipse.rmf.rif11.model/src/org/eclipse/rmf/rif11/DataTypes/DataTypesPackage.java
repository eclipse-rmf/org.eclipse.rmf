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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.rif11.DataTypes.DataTypesFactory
 * @model kind="package"
 * @generated
 */
public interface DataTypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DataTypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://automotive-his.de/200706/rif/rif/dt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rif";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataTypesPackage eINSTANCE = org.eclipse.rmf.rif11.DataTypes.impl.DataTypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.DataTypes.impl.BinaryContentImpl <em>Binary Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.DataTypes.impl.BinaryContentImpl
	 * @see org.eclipse.rmf.rif11.DataTypes.impl.DataTypesPackageImpl#getBinaryContent()
	 * @generated
	 */
	int BINARY_CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Binary Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_CONTENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.DataTypes.impl.XmlContentImpl <em>Xml Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.DataTypes.impl.XmlContentImpl
	 * @see org.eclipse.rmf.rif11.DataTypes.impl.DataTypesPackageImpl#getXmlContent()
	 * @generated
	 */
	int XML_CONTENT = 1;

	/**
	 * The number of structural features of the '<em>Xml Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONTENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.DataTypes.impl.XhtmlContentImpl <em>Xhtml Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.DataTypes.impl.XhtmlContentImpl
	 * @see org.eclipse.rmf.rif11.DataTypes.impl.DataTypesPackageImpl#getXhtmlContent()
	 * @generated
	 */
	int XHTML_CONTENT = 2;

	/**
	 * The number of structural features of the '<em>Xhtml Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CONTENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.eclipse.rmf.rif11.DataTypes.impl.DataTypesPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 3;

	/**
	 * The meta object id for the '<em>Date Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see org.eclipse.rmf.rif11.DataTypes.impl.DataTypesPackageImpl#getDateTime()
	 * @generated
	 */
	int DATE_TIME = 4;

	/**
	 * The meta object id for the '<em>Float</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.eclipse.rmf.rif11.DataTypes.impl.DataTypesPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 5;

	/**
	 * The meta object id for the '<em>Identifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.rif11.DataTypes.impl.DataTypesPackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 6;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.rmf.rif11.DataTypes.impl.DataTypesPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 7;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.rif11.DataTypes.impl.DataTypesPackageImpl#getString()
	 * @generated
	 */
	int STRING = 8;

	/**
	 * The meta object id for the '<em>Unlimited Natural</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.rmf.rif11.DataTypes.impl.DataTypesPackageImpl#getUnlimitedNatural()
	 * @generated
	 */
	int UNLIMITED_NATURAL = 9;


	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.DataTypes.BinaryContent <em>Binary Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Content</em>'.
	 * @see org.eclipse.rmf.rif11.DataTypes.BinaryContent
	 * @generated
	 */
	EClass getBinaryContent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.DataTypes.XmlContent <em>Xml Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Content</em>'.
	 * @see org.eclipse.rmf.rif11.DataTypes.XmlContent
	 * @generated
	 */
	EClass getXmlContent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.DataTypes.XhtmlContent <em>Xhtml Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xhtml Content</em>'.
	 * @see org.eclipse.rmf.rif11.DataTypes.XhtmlContent
	 * @generated
	 */
	EClass getXhtmlContent();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Time</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 * @generated
	 */
	EDataType getDateTime();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Float</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 * @generated
	 */
	EDataType getFloat();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Identifier</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getIdentifier();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 * @generated
	 */
	EDataType getInteger();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getString();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Unlimited Natural</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Unlimited Natural</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 * @generated
	 */
	EDataType getUnlimitedNatural();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataTypesFactory getDataTypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.DataTypes.impl.BinaryContentImpl <em>Binary Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.DataTypes.impl.BinaryContentImpl
		 * @see org.eclipse.rmf.rif11.DataTypes.impl.DataTypesPackageImpl#getBinaryContent()
		 * @generated
		 */
		EClass BINARY_CONTENT = eINSTANCE.getBinaryContent();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.DataTypes.impl.XmlContentImpl <em>Xml Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.DataTypes.impl.XmlContentImpl
		 * @see org.eclipse.rmf.rif11.DataTypes.impl.DataTypesPackageImpl#getXmlContent()
		 * @generated
		 */
		EClass XML_CONTENT = eINSTANCE.getXmlContent();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.DataTypes.impl.XhtmlContentImpl <em>Xhtml Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.DataTypes.impl.XhtmlContentImpl
		 * @see org.eclipse.rmf.rif11.DataTypes.impl.DataTypesPackageImpl#getXhtmlContent()
		 * @generated
		 */
		EClass XHTML_CONTENT = eINSTANCE.getXhtmlContent();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see org.eclipse.rmf.rif11.DataTypes.impl.DataTypesPackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>Date Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see org.eclipse.rmf.rif11.DataTypes.impl.DataTypesPackageImpl#getDateTime()
		 * @generated
		 */
		EDataType DATE_TIME = eINSTANCE.getDateTime();

		/**
		 * The meta object literal for the '<em>Float</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see org.eclipse.rmf.rif11.DataTypes.impl.DataTypesPackageImpl#getFloat()
		 * @generated
		 */
		EDataType FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '<em>Identifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.rif11.DataTypes.impl.DataTypesPackageImpl#getIdentifier()
		 * @generated
		 */
		EDataType IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.rmf.rif11.DataTypes.impl.DataTypesPackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.rif11.DataTypes.impl.DataTypesPackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em>Unlimited Natural</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.rmf.rif11.DataTypes.impl.DataTypesPackageImpl#getUnlimitedNatural()
		 * @generated
		 */
		EDataType UNLIMITED_NATURAL = eINSTANCE.getUnlimitedNatural();

	}

} //DataTypesPackage
