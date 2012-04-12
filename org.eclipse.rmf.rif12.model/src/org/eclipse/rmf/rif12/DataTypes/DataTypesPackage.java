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

package org.eclipse.rmf.rif12.DataTypes;

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
 * @see org.eclipse.rmf.rif12.DataTypes.DataTypesFactory
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
	String eNS_URI = "http://automotive-his.de/200807/rif/dt";

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
	DataTypesPackage eINSTANCE = org.eclipse.rmf.rif12.DataTypes.impl.DataTypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.DataTypes.impl.BinaryContentImpl <em>Binary Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.DataTypes.impl.BinaryContentImpl
	 * @see org.eclipse.rmf.rif12.DataTypes.impl.DataTypesPackageImpl#getBinaryContent()
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
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.DataTypes.impl.XhtmlContentImpl <em>Xhtml Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.DataTypes.impl.XhtmlContentImpl
	 * @see org.eclipse.rmf.rif12.DataTypes.impl.DataTypesPackageImpl#getXhtmlContent()
	 * @generated
	 */
	int XHTML_CONTENT = 1;

	/**
	 * The number of structural features of the '<em>Xhtml Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CONTENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.DataTypes.impl.XmlContentImpl <em>Xml Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.DataTypes.impl.XmlContentImpl
	 * @see org.eclipse.rmf.rif12.DataTypes.impl.DataTypesPackageImpl#getXmlContent()
	 * @generated
	 */
	int XML_CONTENT = 2;

	/**
	 * The number of structural features of the '<em>Xml Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONTENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '<em>ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.rif12.DataTypes.impl.DataTypesPackageImpl#getID()
	 * @generated
	 */
	int ID = 3;

	/**
	 * The meta object id for the '<em>Unlimited Natural</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.rmf.rif12.DataTypes.impl.DataTypesPackageImpl#getUnlimitedNatural()
	 * @generated
	 */
	int UNLIMITED_NATURAL = 4;

	/**
	 * The meta object id for the '<em>boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.eclipse.rmf.rif12.DataTypes.impl.DataTypesPackageImpl#getboolean()
	 * @generated
	 */
	int BOOLEAN = 5;

	/**
	 * The meta object id for the '<em>date Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see org.eclipse.rmf.rif12.DataTypes.impl.DataTypesPackageImpl#getdateTime()
	 * @generated
	 */
	int DATE_TIME = 6;

	/**
	 * The meta object id for the '<em>float</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.eclipse.rmf.rif12.DataTypes.impl.DataTypesPackageImpl#getfloat()
	 * @generated
	 */
	int FLOAT = 7;

	/**
	 * The meta object id for the '<em>integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.rmf.rif12.DataTypes.impl.DataTypesPackageImpl#getinteger()
	 * @generated
	 */
	int INTEGER = 8;

	/**
	 * The meta object id for the '<em>string</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.rif12.DataTypes.impl.DataTypesPackageImpl#getstring()
	 * @generated
	 */
	int STRING = 9;


	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.DataTypes.BinaryContent <em>Binary Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Content</em>'.
	 * @see org.eclipse.rmf.rif12.DataTypes.BinaryContent
	 * @generated
	 */
	EClass getBinaryContent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.DataTypes.XhtmlContent <em>Xhtml Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xhtml Content</em>'.
	 * @see org.eclipse.rmf.rif12.DataTypes.XhtmlContent
	 * @generated
	 */
	EClass getXhtmlContent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.DataTypes.XmlContent <em>Xml Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Content</em>'.
	 * @see org.eclipse.rmf.rif12.DataTypes.XmlContent
	 * @generated
	 */
	EClass getXmlContent();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ID</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getID();

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
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>boolean</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 * @generated
	 */
	EDataType getboolean();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>date Time</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 * @generated
	 */
	EDataType getdateTime();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>float</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 * @generated
	 */
	EDataType getfloat();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>integer</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 * @generated
	 */
	EDataType getinteger();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>string</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>string</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getstring();

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
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.DataTypes.impl.BinaryContentImpl <em>Binary Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.DataTypes.impl.BinaryContentImpl
		 * @see org.eclipse.rmf.rif12.DataTypes.impl.DataTypesPackageImpl#getBinaryContent()
		 * @generated
		 */
		EClass BINARY_CONTENT = eINSTANCE.getBinaryContent();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.DataTypes.impl.XhtmlContentImpl <em>Xhtml Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.DataTypes.impl.XhtmlContentImpl
		 * @see org.eclipse.rmf.rif12.DataTypes.impl.DataTypesPackageImpl#getXhtmlContent()
		 * @generated
		 */
		EClass XHTML_CONTENT = eINSTANCE.getXhtmlContent();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.DataTypes.impl.XmlContentImpl <em>Xml Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.DataTypes.impl.XmlContentImpl
		 * @see org.eclipse.rmf.rif12.DataTypes.impl.DataTypesPackageImpl#getXmlContent()
		 * @generated
		 */
		EClass XML_CONTENT = eINSTANCE.getXmlContent();

		/**
		 * The meta object literal for the '<em>ID</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.rif12.DataTypes.impl.DataTypesPackageImpl#getID()
		 * @generated
		 */
		EDataType ID = eINSTANCE.getID();

		/**
		 * The meta object literal for the '<em>Unlimited Natural</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.rmf.rif12.DataTypes.impl.DataTypesPackageImpl#getUnlimitedNatural()
		 * @generated
		 */
		EDataType UNLIMITED_NATURAL = eINSTANCE.getUnlimitedNatural();

		/**
		 * The meta object literal for the '<em>boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see org.eclipse.rmf.rif12.DataTypes.impl.DataTypesPackageImpl#getboolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getboolean();

		/**
		 * The meta object literal for the '<em>date Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see org.eclipse.rmf.rif12.DataTypes.impl.DataTypesPackageImpl#getdateTime()
		 * @generated
		 */
		EDataType DATE_TIME = eINSTANCE.getdateTime();

		/**
		 * The meta object literal for the '<em>float</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see org.eclipse.rmf.rif12.DataTypes.impl.DataTypesPackageImpl#getfloat()
		 * @generated
		 */
		EDataType FLOAT = eINSTANCE.getfloat();

		/**
		 * The meta object literal for the '<em>integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.rmf.rif12.DataTypes.impl.DataTypesPackageImpl#getinteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getinteger();

		/**
		 * The meta object literal for the '<em>string</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.rif12.DataTypes.impl.DataTypesPackageImpl#getstring()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getstring();

	}

} //DataTypesPackage
