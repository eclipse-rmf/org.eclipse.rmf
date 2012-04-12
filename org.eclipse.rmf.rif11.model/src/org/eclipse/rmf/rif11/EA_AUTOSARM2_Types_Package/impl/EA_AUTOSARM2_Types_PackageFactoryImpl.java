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

package org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.impl;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.AccessPolicyAccessModeEnum;
import org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.DatatypeDefinitionDateFormatEnum;
import org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.EA_AUTOSARM2_Types_PackageFactory;
import org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.EA_AUTOSARM2_Types_PackagePackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EA_AUTOSARM2_Types_PackageFactoryImpl extends EFactoryImpl implements EA_AUTOSARM2_Types_PackageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EA_AUTOSARM2_Types_PackageFactory init() {
		try {
			EA_AUTOSARM2_Types_PackageFactory theEA_AUTOSARM2_Types_PackageFactory = (EA_AUTOSARM2_Types_PackageFactory)EPackage.Registry.INSTANCE.getEFactory("http:///EA_Model/EA_PrimitiveTypes_Package/EA_AUTOSARM2_Types_Package.ecore"); 
			if (theEA_AUTOSARM2_Types_PackageFactory != null) {
				return theEA_AUTOSARM2_Types_PackageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EA_AUTOSARM2_Types_PackageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EA_AUTOSARM2_Types_PackageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EA_AUTOSARM2_Types_PackagePackage.ACCESS_POLICY_ACCESS_MODE_ENUM:
				return createAccessPolicyAccessModeEnumFromString(eDataType, initialValue);
			case EA_AUTOSARM2_Types_PackagePackage.DATATYPE_DEFINITION_DATE_FORMAT_ENUM:
				return createDatatypeDefinitionDateFormatEnumFromString(eDataType, initialValue);
			case EA_AUTOSARM2_Types_PackagePackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case EA_AUTOSARM2_Types_PackagePackage.ENUMERATION_W3C_CUSTOM:
				return createenumerationW3CCustomFromString(eDataType, initialValue);
			case EA_AUTOSARM2_Types_PackagePackage.INT:
				return createIntFromString(eDataType, initialValue);
			case EA_AUTOSARM2_Types_PackagePackage.FLOAT:
				return createFloatFromString(eDataType, initialValue);
			case EA_AUTOSARM2_Types_PackagePackage.IDENTIFIER:
				return createIdentifierFromString(eDataType, initialValue);
			case EA_AUTOSARM2_Types_PackagePackage.DATE_TIME:
				return createDateTimeFromString(eDataType, initialValue);
			case EA_AUTOSARM2_Types_PackagePackage.STRING:
				return createStringFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EA_AUTOSARM2_Types_PackagePackage.ACCESS_POLICY_ACCESS_MODE_ENUM:
				return convertAccessPolicyAccessModeEnumToString(eDataType, instanceValue);
			case EA_AUTOSARM2_Types_PackagePackage.DATATYPE_DEFINITION_DATE_FORMAT_ENUM:
				return convertDatatypeDefinitionDateFormatEnumToString(eDataType, instanceValue);
			case EA_AUTOSARM2_Types_PackagePackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case EA_AUTOSARM2_Types_PackagePackage.ENUMERATION_W3C_CUSTOM:
				return convertenumerationW3CCustomToString(eDataType, instanceValue);
			case EA_AUTOSARM2_Types_PackagePackage.INT:
				return convertIntToString(eDataType, instanceValue);
			case EA_AUTOSARM2_Types_PackagePackage.FLOAT:
				return convertFloatToString(eDataType, instanceValue);
			case EA_AUTOSARM2_Types_PackagePackage.IDENTIFIER:
				return convertIdentifierToString(eDataType, instanceValue);
			case EA_AUTOSARM2_Types_PackagePackage.DATE_TIME:
				return convertDateTimeToString(eDataType, instanceValue);
			case EA_AUTOSARM2_Types_PackagePackage.STRING:
				return convertStringToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessPolicyAccessModeEnum createAccessPolicyAccessModeEnumFromString(EDataType eDataType, String initialValue) {
		AccessPolicyAccessModeEnum result = AccessPolicyAccessModeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessPolicyAccessModeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeDefinitionDateFormatEnum createDatatypeDefinitionDateFormatEnumFromString(EDataType eDataType, String initialValue) {
		DatatypeDefinitionDateFormatEnum result = DatatypeDefinitionDateFormatEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatatypeDefinitionDateFormatEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createenumerationW3CCustomFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertenumerationW3CCustomToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createIntFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createFloatFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFloatToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createIdentifierFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentifierToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDateTimeFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EA_AUTOSARM2_Types_PackagePackage getEA_AUTOSARM2_Types_PackagePackage() {
		return (EA_AUTOSARM2_Types_PackagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EA_AUTOSARM2_Types_PackagePackage getPackage() {
		return EA_AUTOSARM2_Types_PackagePackage.eINSTANCE;
	}

} //EA_AUTOSARM2_Types_PackageFactoryImpl
