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

package org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.EA_AUTOSARM2_Types_PackageFactory
 * @model kind="package"
 * @generated
 */
public interface EA_AUTOSARM2_Types_PackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "EA_AUTOSARM2_Types_Package";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://automotive-his.de/200706/rif/eatp";

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
	EA_AUTOSARM2_Types_PackagePackage eINSTANCE = org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.AccessPolicyAccessModeEnum <em>Access Policy Access Mode Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.AccessPolicyAccessModeEnum
	 * @see org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getAccessPolicyAccessModeEnum()
	 * @generated
	 */
	int ACCESS_POLICY_ACCESS_MODE_ENUM = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.DatatypeDefinitionDateFormatEnum <em>Datatype Definition Date Format Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.DatatypeDefinitionDateFormatEnum
	 * @see org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getDatatypeDefinitionDateFormatEnum()
	 * @generated
	 */
	int DATATYPE_DEFINITION_DATE_FORMAT_ENUM = 1;

	/**
	 * The meta object id for the '<em>string</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getstring()
	 * @generated
	 */
	int STRING = 2;

	/**
	 * The meta object id for the '<em>integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getinteger()
	 * @generated
	 */
	int INTEGER = 3;

	/**
	 * The meta object id for the '<em>date Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getdateTime()
	 * @generated
	 */
	int DATE_TIME = 4;

	/**
	 * The meta object id for the '<em>ID</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getID()
	 * @generated
	 */
	int ID = 5;


	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.AccessPolicyAccessModeEnum <em>Access Policy Access Mode Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Policy Access Mode Enum</em>'.
	 * @see org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.AccessPolicyAccessModeEnum
	 * @generated
	 */
	EEnum getAccessPolicyAccessModeEnum();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.DatatypeDefinitionDateFormatEnum <em>Datatype Definition Date Format Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datatype Definition Date Format Enum</em>'.
	 * @see org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.DatatypeDefinitionDateFormatEnum
	 * @generated
	 */
	EEnum getDatatypeDefinitionDateFormatEnum();

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
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EA_AUTOSARM2_Types_PackageFactory getEA_AUTOSARM2_Types_PackageFactory();

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
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.AccessPolicyAccessModeEnum <em>Access Policy Access Mode Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.AccessPolicyAccessModeEnum
		 * @see org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getAccessPolicyAccessModeEnum()
		 * @generated
		 */
		EEnum ACCESS_POLICY_ACCESS_MODE_ENUM = eINSTANCE.getAccessPolicyAccessModeEnum();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.DatatypeDefinitionDateFormatEnum <em>Datatype Definition Date Format Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.DatatypeDefinitionDateFormatEnum
		 * @see org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getDatatypeDefinitionDateFormatEnum()
		 * @generated
		 */
		EEnum DATATYPE_DEFINITION_DATE_FORMAT_ENUM = eINSTANCE.getDatatypeDefinitionDateFormatEnum();

		/**
		 * The meta object literal for the '<em>string</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getstring()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getstring();

		/**
		 * The meta object literal for the '<em>integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getinteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getinteger();

		/**
		 * The meta object literal for the '<em>date Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getdateTime()
		 * @generated
		 */
		EDataType DATE_TIME = eINSTANCE.getdateTime();

		/**
		 * The meta object literal for the '<em>ID</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getID()
		 * @generated
		 */
		EDataType ID = eINSTANCE.getID();

	}

} //EA_AUTOSARM2_Types_PackagePackage
