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

package org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package;

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
 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.EA_AUTOSARM2_Types_PackageFactory
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
	String eNS_URI = "http:///EA_Model/EA_PrimitiveTypes_Package/EA_AUTOSARM2_Types_Package.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "EA_Model.EA_PrimitiveTypes_Package.EA_AUTOSARM2_Types_Package";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EA_AUTOSARM2_Types_PackagePackage eINSTANCE = org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.AccessPolicyAccessModeEnum <em>Access Policy Access Mode Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.AccessPolicyAccessModeEnum
	 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getAccessPolicyAccessModeEnum()
	 * @generated
	 */
	int ACCESS_POLICY_ACCESS_MODE_ENUM = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.DatatypeDefinitionDateFormatEnum <em>Datatype Definition Date Format Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.DatatypeDefinitionDateFormatEnum
	 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getDatatypeDefinitionDateFormatEnum()
	 * @generated
	 */
	int DATATYPE_DEFINITION_DATE_FORMAT_ENUM = 1;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 2;

	/**
	 * The meta object id for the '<em>enumeration W3C Custom</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getenumerationW3CCustom()
	 * @generated
	 */
	int ENUMERATION_W3C_CUSTOM = 3;

	/**
	 * The meta object id for the '<em>Int</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getInt()
	 * @generated
	 */
	int INT = 4;

	/**
	 * The meta object id for the '<em>Float</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 5;

	/**
	 * The meta object id for the '<em>Identifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 6;

	/**
	 * The meta object id for the '<em>Date Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getDateTime()
	 * @generated
	 */
	int DATE_TIME = 7;

	/**
	 * The meta object id for the '<em>String</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getString()
	 * @generated
	 */
	int STRING = 8;


	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.AccessPolicyAccessModeEnum <em>Access Policy Access Mode Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Policy Access Mode Enum</em>'.
	 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.AccessPolicyAccessModeEnum
	 * @generated
	 */
	EEnum getAccessPolicyAccessModeEnum();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.DatatypeDefinitionDateFormatEnum <em>Datatype Definition Date Format Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Datatype Definition Date Format Enum</em>'.
	 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.DatatypeDefinitionDateFormatEnum
	 * @generated
	 */
	EEnum getDatatypeDefinitionDateFormatEnum();

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
	 * Returns the meta object for data type '<em>enumeration W3C Custom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>enumeration W3C Custom</em>'.
	 * @model instanceClass="int"
	 * @generated
	 */
	EDataType getenumerationW3CCustom();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Int</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 * @generated
	 */
	EDataType getInt();

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
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.AccessPolicyAccessModeEnum <em>Access Policy Access Mode Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.AccessPolicyAccessModeEnum
		 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getAccessPolicyAccessModeEnum()
		 * @generated
		 */
		EEnum ACCESS_POLICY_ACCESS_MODE_ENUM = eINSTANCE.getAccessPolicyAccessModeEnum();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.DatatypeDefinitionDateFormatEnum <em>Datatype Definition Date Format Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.DatatypeDefinitionDateFormatEnum
		 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getDatatypeDefinitionDateFormatEnum()
		 * @generated
		 */
		EEnum DATATYPE_DEFINITION_DATE_FORMAT_ENUM = eINSTANCE.getDatatypeDefinitionDateFormatEnum();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

		/**
		 * The meta object literal for the '<em>enumeration W3C Custom</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getenumerationW3CCustom()
		 * @generated
		 */
		EDataType ENUMERATION_W3C_CUSTOM = eINSTANCE.getenumerationW3CCustom();

		/**
		 * The meta object literal for the '<em>Int</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getInt()
		 * @generated
		 */
		EDataType INT = eINSTANCE.getInt();

		/**
		 * The meta object literal for the '<em>Float</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getFloat()
		 * @generated
		 */
		EDataType FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '<em>Identifier</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getIdentifier()
		 * @generated
		 */
		EDataType IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em>Date Time</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getDateTime()
		 * @generated
		 */
		EDataType DATE_TIME = eINSTANCE.getDateTime();

		/**
		 * The meta object literal for the '<em>String</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl#getString()
		 * @generated
		 */
		EDataType STRING = eINSTANCE.getString();

	}

} //EA_AUTOSARM2_Types_PackagePackage
