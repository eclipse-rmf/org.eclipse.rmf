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

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.rmf.rif11.DataTypes.DataTypesPackage;
import org.eclipse.rmf.rif11.DataTypes.impl.DataTypesPackageImpl;
import org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.AccessPolicyAccessModeEnum;
import org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.DatatypeDefinitionDateFormatEnum;
import org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.EA_AUTOSARM2_Types_PackageFactory;
import org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.EA_AUTOSARM2_Types_PackagePackage;
import org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage;
import org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EA_AUTOSARM2_Types_PackagePackageImpl extends EPackageImpl implements EA_AUTOSARM2_Types_PackagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessPolicyAccessModeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum datatypeDefinitionDateFormatEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType booleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumerationW3CCustomEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType intEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType floatEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType identifierEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateTimeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stringEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.EA_AUTOSARM2_Types_PackagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EA_AUTOSARM2_Types_PackagePackageImpl() {
		super(eNS_URI, EA_AUTOSARM2_Types_PackageFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EA_AUTOSARM2_Types_PackagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EA_AUTOSARM2_Types_PackagePackage init() {
		if (isInited) return (EA_AUTOSARM2_Types_PackagePackage)EPackage.Registry.INSTANCE.getEPackage(EA_AUTOSARM2_Types_PackagePackage.eNS_URI);

		// Obtain or create and register package
		EA_AUTOSARM2_Types_PackagePackageImpl theEA_AUTOSARM2_Types_PackagePackage = (EA_AUTOSARM2_Types_PackagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EA_AUTOSARM2_Types_PackagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EA_AUTOSARM2_Types_PackagePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ExchangeFilePackageImpl theExchangeFilePackage = (ExchangeFilePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExchangeFilePackage.eNS_URI) instanceof ExchangeFilePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExchangeFilePackage.eNS_URI) : ExchangeFilePackage.eINSTANCE);
		DataTypesPackageImpl theDataTypesPackage = (DataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) instanceof DataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) : DataTypesPackage.eINSTANCE);

		// Create package meta-data objects
		theEA_AUTOSARM2_Types_PackagePackage.createPackageContents();
		theExchangeFilePackage.createPackageContents();
		theDataTypesPackage.createPackageContents();

		// Initialize created meta-data
		theEA_AUTOSARM2_Types_PackagePackage.initializePackageContents();
		theExchangeFilePackage.initializePackageContents();
		theDataTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEA_AUTOSARM2_Types_PackagePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EA_AUTOSARM2_Types_PackagePackage.eNS_URI, theEA_AUTOSARM2_Types_PackagePackage);
		return theEA_AUTOSARM2_Types_PackagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessPolicyAccessModeEnum() {
		return accessPolicyAccessModeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatatypeDefinitionDateFormatEnum() {
		return datatypeDefinitionDateFormatEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBoolean() {
		return booleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getenumerationW3CCustom() {
		return enumerationW3CCustomEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInt() {
		return intEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFloat() {
		return floatEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIdentifier() {
		return identifierEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDateTime() {
		return dateTimeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getString() {
		return stringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EA_AUTOSARM2_Types_PackageFactory getEA_AUTOSARM2_Types_PackageFactory() {
		return (EA_AUTOSARM2_Types_PackageFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create enums
		accessPolicyAccessModeEnumEEnum = createEEnum(ACCESS_POLICY_ACCESS_MODE_ENUM);
		datatypeDefinitionDateFormatEnumEEnum = createEEnum(DATATYPE_DEFINITION_DATE_FORMAT_ENUM);

		// Create data types
		booleanEDataType = createEDataType(BOOLEAN);
		enumerationW3CCustomEDataType = createEDataType(ENUMERATION_W3C_CUSTOM);
		intEDataType = createEDataType(INT);
		floatEDataType = createEDataType(FLOAT);
		identifierEDataType = createEDataType(IDENTIFIER);
		dateTimeEDataType = createEDataType(DATE_TIME);
		stringEDataType = createEDataType(STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Initialize enums and add enum literals
		initEEnum(accessPolicyAccessModeEnumEEnum, AccessPolicyAccessModeEnum.class, "AccessPolicyAccessModeEnum");
		addEEnumLiteral(accessPolicyAccessModeEnumEEnum, AccessPolicyAccessModeEnum.EDIT);
		addEEnumLiteral(accessPolicyAccessModeEnumEEnum, AccessPolicyAccessModeEnum.DELETE);
		addEEnumLiteral(accessPolicyAccessModeEnumEEnum, AccessPolicyAccessModeEnum.CREATE);

		initEEnum(datatypeDefinitionDateFormatEnumEEnum, DatatypeDefinitionDateFormatEnum.class, "DatatypeDefinitionDateFormatEnum");
		addEEnumLiteral(datatypeDefinitionDateFormatEnumEEnum, DatatypeDefinitionDateFormatEnum.W3C);
		addEEnumLiteral(datatypeDefinitionDateFormatEnumEEnum, DatatypeDefinitionDateFormatEnum.CUSTOM);

		// Initialize data types
		initEDataType(booleanEDataType, Boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumerationW3CCustomEDataType, int.class, "enumerationW3CCustom", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(intEDataType, BigInteger.class, "Int", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(floatEDataType, Double.class, "Float", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(identifierEDataType, String.class, "Identifier", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateTimeEDataType, XMLGregorianCalendar.class, "DateTime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EA_AUTOSARM2_Types_PackagePackageImpl
