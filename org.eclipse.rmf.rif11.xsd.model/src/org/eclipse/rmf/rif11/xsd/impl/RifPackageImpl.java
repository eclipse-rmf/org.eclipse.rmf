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

package org.eclipse.rmf.rif11.xsd.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.rmf.rif11.xsd.ACCESSPOLICIESType;
import org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSType;
import org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESType;
import org.eclipse.rmf.rif11.xsd.CHILDRENType;
import org.eclipse.rmf.rif11.xsd.CHILDRENType1;
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType;
import org.eclipse.rmf.rif11.xsd.DATATYPESType;
import org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType;
import org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType1;
import org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType2;
import org.eclipse.rmf.rif11.xsd.DEFINITIONType;
import org.eclipse.rmf.rif11.xsd.DEFINITIONType1;
import org.eclipse.rmf.rif11.xsd.DEFINITIONType2;
import org.eclipse.rmf.rif11.xsd.DEFINITIONType3;
import org.eclipse.rmf.rif11.xsd.DEFINITIONType4;
import org.eclipse.rmf.rif11.xsd.DEFINITIONType5;
import org.eclipse.rmf.rif11.xsd.DocumentRoot;
import org.eclipse.rmf.rif11.xsd.OBJECTType;
import org.eclipse.rmf.rif11.xsd.PROPERTIESType;
import org.eclipse.rmf.rif11.xsd.RELATIONGROUPSType;
import org.eclipse.rmf.rif11.xsd.RELATIONGROUPSType1;
import org.eclipse.rmf.rif11.xsd.RELATIONTYPEType;
import org.eclipse.rmf.rif11.xsd.RifFactory;
import org.eclipse.rmf.rif11.xsd.RifPackage;
import org.eclipse.rmf.rif11.xsd.SOURCEType;
import org.eclipse.rmf.rif11.xsd.SPECATTRIBUTESType;
import org.eclipse.rmf.rif11.xsd.SPECGROUPSType;
import org.eclipse.rmf.rif11.xsd.SPECGROUPSType1;
import org.eclipse.rmf.rif11.xsd.SPECHIERARCHIESType;
import org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOTSType;
import org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOTSType1;
import org.eclipse.rmf.rif11.xsd.SPECIFIEDVALUESType;
import org.eclipse.rmf.rif11.xsd.SPECOBJECTSType;
import org.eclipse.rmf.rif11.xsd.SPECOBJECTSType1;
import org.eclipse.rmf.rif11.xsd.SPECOBJECTSType2;
import org.eclipse.rmf.rif11.xsd.SPECRELATIONSType;
import org.eclipse.rmf.rif11.xsd.SPECRELATIONSType1;
import org.eclipse.rmf.rif11.xsd.SPECRELATIONSType2;
import org.eclipse.rmf.rif11.xsd.SPECTYPESType;
import org.eclipse.rmf.rif11.xsd.SPECTYPESType1;
import org.eclipse.rmf.rif11.xsd.TARGETGROUPType;
import org.eclipse.rmf.rif11.xsd.TARGETType;
import org.eclipse.rmf.rif11.xsd.TYPEType;
import org.eclipse.rmf.rif11.xsd.TYPEType1;
import org.eclipse.rmf.rif11.xsd.TYPEType2;
import org.eclipse.rmf.rif11.xsd.TYPEType3;
import org.eclipse.rmf.rif11.xsd.TYPEType4;
import org.eclipse.rmf.rif11.xsd.TYPEType5;
import org.eclipse.rmf.rif11.xsd.TYPEType6;
import org.eclipse.rmf.rif11.xsd.VALUESType;
import org.eclipse.rmf.rif11.xsd.VALUESType1;
import org.eclipse.rmf.rif11.xsd.VALUESType2;
import org.eclipse.rmf.rif11.xsd.VALUESType3;
import org.eclipse.rmf.rif11.xsd.VALUESType4;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RifPackageImpl extends EPackageImpl implements RifPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accesspoliciesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accesspolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributedefinitioncomplexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributedefinitionenumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributedefinitionsimpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributedefinitionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributevalueembeddeddocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributevalueembeddedfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributevalueenumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributevaluefilereferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributevaluesimpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributevaluesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributevaluexmldataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binarycontentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childrenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childrenType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypedefinitionbinaryfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypedefinitionbooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypedefinitiondateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypedefinitiondocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypedefinitionenumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypedefinitionintegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypedefinitionrealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypedefinitionstringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypedefinitionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypedefinitionxmldataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultvalueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultvalueType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultvalueType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionType4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionType5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass embeddedvalueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumvalueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationgroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationgroupsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationgroupsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationtypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specattributesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specgroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specgroupsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specgroupsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spechierarchiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spechierarchyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spechierarchyrootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spechierarchyrootsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spechierarchyrootsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specifiedvaluesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specobjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specobjectsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specobjectsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specobjectsType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specrelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specrelationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specrelationsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specrelationsType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spectypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spectypesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spectypesType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetgroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeType4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeType5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeType6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuesType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuesType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuesType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuesType4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xhtmlcontentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlcontentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accesspolicyaccessmodeenumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum datatypedefinitiondateformatenumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType accesspolicyaccessmodeenumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datatypedefinitiondateformatenumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType refEDataType = null;

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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RifPackageImpl() {
		super(eNS_URI, RifFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RifPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RifPackage init() {
		if (isInited) return (RifPackage)EPackage.Registry.INSTANCE.getEPackage(RifPackage.eNS_URI);

		// Obtain or create and register package
		RifPackageImpl theRifPackage = (RifPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RifPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RifPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRifPackage.createPackageContents();

		// Initialize created meta-data
		theRifPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRifPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RifPackage.eNS_URI, theRifPackage);
		return theRifPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getACCESSPOLICIESType() {
		return accesspoliciesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACCESSPOLICIESType_Group() {
		return (EAttribute)accesspoliciesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getACCESSPOLICIESType_ACCESSPOLICY() {
		return (EReference)accesspoliciesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getACCESSPOLICY() {
		return accesspolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACCESSPOLICY_DESC() {
		return (EAttribute)accesspolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACCESSPOLICY_IDENTIFIER() {
		return (EAttribute)accesspolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACCESSPOLICY_LASTCHANGE() {
		return (EAttribute)accesspolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACCESSPOLICY_LONGNAME() {
		return (EAttribute)accesspolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACCESSPOLICY_ACCESSMODE() {
		return (EAttribute)accesspolicyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getACCESSPOLICY_ATTRIBUTEDEFINITIONS() {
		return (EReference)accesspolicyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getACCESSPOLICY_ATTRIBUTEVALUES() {
		return (EReference)accesspolicyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getACCESSPOLICY_DATATYPEDEFINITIONS() {
		return (EReference)accesspolicyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getACCESSPOLICY_RELATIONGROUPS() {
		return (EReference)accesspolicyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getACCESSPOLICY_SPECGROUPS() {
		return (EReference)accesspolicyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getACCESSPOLICY_SPECHIERARCHIES() {
		return (EReference)accesspolicyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getACCESSPOLICY_SPECHIERARCHYROOTS() {
		return (EReference)accesspolicyEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getACCESSPOLICY_SPECOBJECTS() {
		return (EReference)accesspolicyEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getACCESSPOLICY_SPECRELATIONS() {
		return (EReference)accesspolicyEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getACCESSPOLICY_SPECTYPES() {
		return (EReference)accesspolicyEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATTRIBUTEDEFINITIONCOMPLEX() {
		return attributedefinitioncomplexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONCOMPLEX_DESC() {
		return (EAttribute)attributedefinitioncomplexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONCOMPLEX_IDENTIFIER() {
		return (EAttribute)attributedefinitioncomplexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONCOMPLEX_LASTCHANGE() {
		return (EAttribute)attributedefinitioncomplexEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONCOMPLEX_LONGNAME() {
		return (EAttribute)attributedefinitioncomplexEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONCOMPLEX_DEFAULTVALUE() {
		return (EReference)attributedefinitioncomplexEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONCOMPLEX_TYPE() {
		return (EReference)attributedefinitioncomplexEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATTRIBUTEDEFINITIONENUMERATION() {
		return attributedefinitionenumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONENUMERATION_DESC() {
		return (EAttribute)attributedefinitionenumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONENUMERATION_IDENTIFIER() {
		return (EAttribute)attributedefinitionenumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONENUMERATION_LASTCHANGE() {
		return (EAttribute)attributedefinitionenumerationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONENUMERATION_LONGNAME() {
		return (EAttribute)attributedefinitionenumerationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONENUMERATION_DEFAULTVALUE() {
		return (EReference)attributedefinitionenumerationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONENUMERATION_MULTIVALUED() {
		return (EAttribute)attributedefinitionenumerationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONENUMERATION_TYPE() {
		return (EReference)attributedefinitionenumerationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATTRIBUTEDEFINITIONSIMPLE() {
		return attributedefinitionsimpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONSIMPLE_DESC() {
		return (EAttribute)attributedefinitionsimpleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONSIMPLE_IDENTIFIER() {
		return (EAttribute)attributedefinitionsimpleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONSIMPLE_LASTCHANGE() {
		return (EAttribute)attributedefinitionsimpleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONSIMPLE_LONGNAME() {
		return (EAttribute)attributedefinitionsimpleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONSIMPLE_DEFAULTVALUE() {
		return (EReference)attributedefinitionsimpleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONSIMPLE_TYPE() {
		return (EReference)attributedefinitionsimpleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATTRIBUTEDEFINITIONSType() {
		return attributedefinitionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONSType_Group() {
		return (EAttribute)attributedefinitionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONSType_ATTRIBUTEDEFINITIONCOMPLEXREF() {
		return (EReference)attributedefinitionsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONSType_ATTRIBUTEDEFINITIONENUMERATIONREF() {
		return (EReference)attributedefinitionsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONSType_ATTRIBUTEDEFINITIONSIMPLEREF() {
		return (EReference)attributedefinitionsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATTRIBUTEVALUEEMBEDDEDDOCUMENT() {
		return attributevalueembeddeddocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEEMBEDDEDDOCUMENT_DESC() {
		return (EAttribute)attributevalueembeddeddocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEEMBEDDEDDOCUMENT_IDENTIFIER() {
		return (EAttribute)attributevalueembeddeddocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEEMBEDDEDDOCUMENT_LASTCHANGE() {
		return (EAttribute)attributevalueembeddeddocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEEMBEDDEDDOCUMENT_LONGNAME() {
		return (EAttribute)attributevalueembeddeddocumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEVALUEEMBEDDEDDOCUMENT_DEFINITION() {
		return (EReference)attributevalueembeddeddocumentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEVALUEEMBEDDEDDOCUMENT_XHTMLCONTENT() {
		return (EReference)attributevalueembeddeddocumentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATTRIBUTEVALUEEMBEDDEDFILE() {
		return attributevalueembeddedfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEEMBEDDEDFILE_DESC() {
		return (EAttribute)attributevalueembeddedfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEEMBEDDEDFILE_IDENTIFIER() {
		return (EAttribute)attributevalueembeddedfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEEMBEDDEDFILE_LASTCHANGE() {
		return (EAttribute)attributevalueembeddedfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEEMBEDDEDFILE_LONGNAME() {
		return (EAttribute)attributevalueembeddedfileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEVALUEEMBEDDEDFILE_BINARYCONTENT() {
		return (EReference)attributevalueembeddedfileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEVALUEEMBEDDEDFILE_DEFINITION() {
		return (EReference)attributevalueembeddedfileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATTRIBUTEVALUEENUMERATION() {
		return attributevalueenumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEENUMERATION_DESC() {
		return (EAttribute)attributevalueenumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEENUMERATION_IDENTIFIER() {
		return (EAttribute)attributevalueenumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEENUMERATION_LASTCHANGE() {
		return (EAttribute)attributevalueenumerationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEENUMERATION_LONGNAME() {
		return (EAttribute)attributevalueenumerationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEVALUEENUMERATION_DEFINITION() {
		return (EReference)attributevalueenumerationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEVALUEENUMERATION_VALUES() {
		return (EReference)attributevalueenumerationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATTRIBUTEVALUEFILEREFERENCE() {
		return attributevaluefilereferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEFILEREFERENCE_DESC() {
		return (EAttribute)attributevaluefilereferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEFILEREFERENCE_IDENTIFIER() {
		return (EAttribute)attributevaluefilereferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEFILEREFERENCE_LASTCHANGE() {
		return (EAttribute)attributevaluefilereferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEFILEREFERENCE_LONGNAME() {
		return (EAttribute)attributevaluefilereferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEVALUEFILEREFERENCE_DEFINITION() {
		return (EReference)attributevaluefilereferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEFILEREFERENCE_PATHTOFILE() {
		return (EAttribute)attributevaluefilereferenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATTRIBUTEVALUESIMPLE() {
		return attributevaluesimpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUESIMPLE_DESC() {
		return (EAttribute)attributevaluesimpleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUESIMPLE_IDENTIFIER() {
		return (EAttribute)attributevaluesimpleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUESIMPLE_LASTCHANGE() {
		return (EAttribute)attributevaluesimpleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUESIMPLE_LONGNAME() {
		return (EAttribute)attributevaluesimpleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEVALUESIMPLE_DEFINITION() {
		return (EReference)attributevaluesimpleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUESIMPLE_THEVALUE() {
		return (EAttribute)attributevaluesimpleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATTRIBUTEVALUESType() {
		return attributevaluesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUESType_Group() {
		return (EAttribute)attributevaluesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEVALUESType_ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF() {
		return (EReference)attributevaluesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEVALUESType_ATTRIBUTEVALUEEMBEDDEDFILEREF() {
		return (EReference)attributevaluesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEVALUESType_ATTRIBUTEVALUEENUMERATIONREF() {
		return (EReference)attributevaluesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEVALUESType_ATTRIBUTEVALUEFILEREFERENCEREF() {
		return (EReference)attributevaluesTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEVALUESType_ATTRIBUTEVALUESIMPLEREF() {
		return (EReference)attributevaluesTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEVALUESType_ATTRIBUTEVALUEXMLDATAREF() {
		return (EReference)attributevaluesTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATTRIBUTEVALUEXMLDATA() {
		return attributevaluexmldataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEXMLDATA_DESC() {
		return (EAttribute)attributevaluexmldataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEXMLDATA_IDENTIFIER() {
		return (EAttribute)attributevaluexmldataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEXMLDATA_LASTCHANGE() {
		return (EAttribute)attributevaluexmldataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEXMLDATA_LONGNAME() {
		return (EAttribute)attributevaluexmldataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEVALUEXMLDATA_DEFINITION() {
		return (EReference)attributevaluexmldataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEVALUEXMLDATA_XMLCONTENT() {
		return (EReference)attributevaluexmldataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBINARYCONTENT() {
		return binarycontentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBINARYCONTENT_Value() {
		return (EAttribute)binarycontentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCHILDRENType() {
		return childrenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCHILDRENType_Group() {
		return (EAttribute)childrenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCHILDRENType_SPECHIERARCHY() {
		return (EReference)childrenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCHILDRENType1() {
		return childrenType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCHILDRENType1_Group() {
		return (EAttribute)childrenType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCHILDRENType1_SPECHIERARCHY() {
		return (EReference)childrenType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDATATYPEDEFINITIONBINARYFILE() {
		return datatypedefinitionbinaryfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONBINARYFILE_DESC() {
		return (EAttribute)datatypedefinitionbinaryfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONBINARYFILE_IDENTIFIER() {
		return (EAttribute)datatypedefinitionbinaryfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONBINARYFILE_LASTCHANGE() {
		return (EAttribute)datatypedefinitionbinaryfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONBINARYFILE_LONGNAME() {
		return (EAttribute)datatypedefinitionbinaryfileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONBINARYFILE_EMBEDDED() {
		return (EAttribute)datatypedefinitionbinaryfileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONBINARYFILE_APPLICATION() {
		return (EAttribute)datatypedefinitionbinaryfileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONBINARYFILE_FILENAMESUFFIX() {
		return (EAttribute)datatypedefinitionbinaryfileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONBINARYFILE_FORMATNAME() {
		return (EAttribute)datatypedefinitionbinaryfileEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONBINARYFILE_MIMETYPE() {
		return (EAttribute)datatypedefinitionbinaryfileEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDATATYPEDEFINITIONBOOLEAN() {
		return datatypedefinitionbooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONBOOLEAN_DESC() {
		return (EAttribute)datatypedefinitionbooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONBOOLEAN_IDENTIFIER() {
		return (EAttribute)datatypedefinitionbooleanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONBOOLEAN_LASTCHANGE() {
		return (EAttribute)datatypedefinitionbooleanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONBOOLEAN_LONGNAME() {
		return (EAttribute)datatypedefinitionbooleanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDATATYPEDEFINITIONDATE() {
		return datatypedefinitiondateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONDATE_DESC() {
		return (EAttribute)datatypedefinitiondateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONDATE_IDENTIFIER() {
		return (EAttribute)datatypedefinitiondateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONDATE_LASTCHANGE() {
		return (EAttribute)datatypedefinitiondateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONDATE_LONGNAME() {
		return (EAttribute)datatypedefinitiondateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONDATE_FORMAT() {
		return (EAttribute)datatypedefinitiondateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDATATYPEDEFINITIONDOCUMENT() {
		return datatypedefinitiondocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONDOCUMENT_DESC() {
		return (EAttribute)datatypedefinitiondocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONDOCUMENT_IDENTIFIER() {
		return (EAttribute)datatypedefinitiondocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONDOCUMENT_LASTCHANGE() {
		return (EAttribute)datatypedefinitiondocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONDOCUMENT_LONGNAME() {
		return (EAttribute)datatypedefinitiondocumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONDOCUMENT_EMBEDDED() {
		return (EAttribute)datatypedefinitiondocumentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDATATYPEDEFINITIONENUMERATION() {
		return datatypedefinitionenumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONENUMERATION_DESC() {
		return (EAttribute)datatypedefinitionenumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONENUMERATION_IDENTIFIER() {
		return (EAttribute)datatypedefinitionenumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONENUMERATION_LASTCHANGE() {
		return (EAttribute)datatypedefinitionenumerationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONENUMERATION_LONGNAME() {
		return (EAttribute)datatypedefinitionenumerationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEDEFINITIONENUMERATION_SPECIFIEDVALUES() {
		return (EReference)datatypedefinitionenumerationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDATATYPEDEFINITIONINTEGER() {
		return datatypedefinitionintegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONINTEGER_DESC() {
		return (EAttribute)datatypedefinitionintegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONINTEGER_IDENTIFIER() {
		return (EAttribute)datatypedefinitionintegerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONINTEGER_LASTCHANGE() {
		return (EAttribute)datatypedefinitionintegerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONINTEGER_LONGNAME() {
		return (EAttribute)datatypedefinitionintegerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONINTEGER_MAX() {
		return (EAttribute)datatypedefinitionintegerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONINTEGER_MIN() {
		return (EAttribute)datatypedefinitionintegerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDATATYPEDEFINITIONREAL() {
		return datatypedefinitionrealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONREAL_DESC() {
		return (EAttribute)datatypedefinitionrealEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONREAL_IDENTIFIER() {
		return (EAttribute)datatypedefinitionrealEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONREAL_LASTCHANGE() {
		return (EAttribute)datatypedefinitionrealEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONREAL_LONGNAME() {
		return (EAttribute)datatypedefinitionrealEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONREAL_ACCURACY() {
		return (EAttribute)datatypedefinitionrealEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONREAL_MAX() {
		return (EAttribute)datatypedefinitionrealEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONREAL_MIN() {
		return (EAttribute)datatypedefinitionrealEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDATATYPEDEFINITIONSTRING() {
		return datatypedefinitionstringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONSTRING_DESC() {
		return (EAttribute)datatypedefinitionstringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONSTRING_IDENTIFIER() {
		return (EAttribute)datatypedefinitionstringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONSTRING_LASTCHANGE() {
		return (EAttribute)datatypedefinitionstringEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONSTRING_LONGNAME() {
		return (EAttribute)datatypedefinitionstringEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONSTRING_MAXLENGTH() {
		return (EAttribute)datatypedefinitionstringEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDATATYPEDEFINITIONSType() {
		return datatypedefinitionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONSType_Group() {
		return (EAttribute)datatypedefinitionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONBINARYFILEREF() {
		return (EReference)datatypedefinitionsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONBOOLEANREF() {
		return (EReference)datatypedefinitionsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONDATEREF() {
		return (EReference)datatypedefinitionsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONDOCUMENTREF() {
		return (EReference)datatypedefinitionsTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONENUMERATIONREF() {
		return (EReference)datatypedefinitionsTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONINTEGERREF() {
		return (EReference)datatypedefinitionsTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONREALREF() {
		return (EReference)datatypedefinitionsTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONSTRINGREF() {
		return (EReference)datatypedefinitionsTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONXMLDATAREF() {
		return (EReference)datatypedefinitionsTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDATATYPEDEFINITIONXMLDATA() {
		return datatypedefinitionxmldataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONXMLDATA_DESC() {
		return (EAttribute)datatypedefinitionxmldataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONXMLDATA_IDENTIFIER() {
		return (EAttribute)datatypedefinitionxmldataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONXMLDATA_LASTCHANGE() {
		return (EAttribute)datatypedefinitionxmldataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONXMLDATA_LONGNAME() {
		return (EAttribute)datatypedefinitionxmldataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONXMLDATA_EMBEDDED() {
		return (EAttribute)datatypedefinitionxmldataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONXMLDATA_NAMESPACEURI() {
		return (EAttribute)datatypedefinitionxmldataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONXMLDATA_SCHEMALOCATION() {
		return (EAttribute)datatypedefinitionxmldataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDATATYPESType() {
		return datatypesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPESType_Group() {
		return (EAttribute)datatypesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPESType_DATATYPEDEFINITIONBINARYFILE() {
		return (EReference)datatypesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPESType_DATATYPEDEFINITIONBOOLEAN() {
		return (EReference)datatypesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPESType_DATATYPEDEFINITIONDATE() {
		return (EReference)datatypesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPESType_DATATYPEDEFINITIONDOCUMENT() {
		return (EReference)datatypesTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPESType_DATATYPEDEFINITIONENUMERATION() {
		return (EReference)datatypesTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPESType_DATATYPEDEFINITIONINTEGER() {
		return (EReference)datatypesTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPESType_DATATYPEDEFINITIONREAL() {
		return (EReference)datatypesTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPESType_DATATYPEDEFINITIONSTRING() {
		return (EReference)datatypesTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPESType_DATATYPEDEFINITIONXMLDATA() {
		return (EReference)datatypesTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEFAULTVALUEType() {
		return defaultvalueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEFAULTVALUEType_ATTRIBUTEVALUESIMPLE() {
		return (EReference)defaultvalueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEFAULTVALUEType1() {
		return defaultvalueType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEFAULTVALUEType1_ATTRIBUTEVALUEENUMERATION() {
		return (EReference)defaultvalueType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEFAULTVALUEType2() {
		return defaultvalueType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEFAULTVALUEType2_ATTRIBUTEVALUEEMBEDDEDDOCUMENT() {
		return (EReference)defaultvalueType2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEFAULTVALUEType2_ATTRIBUTEVALUEEMBEDDEDFILE() {
		return (EReference)defaultvalueType2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEFAULTVALUEType2_ATTRIBUTEVALUEFILEREFERENCE() {
		return (EReference)defaultvalueType2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEFAULTVALUEType2_ATTRIBUTEVALUEXMLDATA() {
		return (EReference)defaultvalueType2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEFINITIONType() {
		return definitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEFINITIONType_ATTRIBUTEDEFINITIONCOMPLEXREF() {
		return (EReference)definitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEFINITIONType1() {
		return definitionType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEFINITIONType1_ATTRIBUTEDEFINITIONCOMPLEXREF() {
		return (EReference)definitionType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEFINITIONType2() {
		return definitionType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEFINITIONType2_ATTRIBUTEDEFINITIONSIMPLEREF() {
		return (EReference)definitionType2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEFINITIONType3() {
		return definitionType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEFINITIONType3_ATTRIBUTEDEFINITIONENUMERATIONREF() {
		return (EReference)definitionType3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEFINITIONType4() {
		return definitionType4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEFINITIONType4_ATTRIBUTEDEFINITIONCOMPLEXREF() {
		return (EReference)definitionType4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEFINITIONType5() {
		return definitionType5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEFINITIONType5_ATTRIBUTEDEFINITIONCOMPLEXREF() {
		return (EReference)definitionType5EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RIF() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMBEDDEDVALUE() {
		return embeddedvalueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMBEDDEDVALUE_KEY() {
		return (EAttribute)embeddedvalueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMBEDDEDVALUE_OTHERCONTENT() {
		return (EAttribute)embeddedvalueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getENUMVALUE() {
		return enumvalueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getENUMVALUE_DESC() {
		return (EAttribute)enumvalueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getENUMVALUE_IDENTIFIER() {
		return (EAttribute)enumvalueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getENUMVALUE_LASTCHANGE() {
		return (EAttribute)enumvalueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getENUMVALUE_LONGNAME() {
		return (EAttribute)enumvalueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getENUMVALUE_PROPERTIES() {
		return (EReference)enumvalueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOBJECTType() {
		return objectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOBJECTType_SPECOBJECTREF() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPROPERTIESType() {
		return propertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTIESType_EMBEDDEDVALUE() {
		return (EReference)propertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRELATIONGROUP() {
		return relationgroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRELATIONGROUP_DESC() {
		return (EAttribute)relationgroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRELATIONGROUP_IDENTIFIER() {
		return (EAttribute)relationgroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRELATIONGROUP_LASTCHANGE() {
		return (EAttribute)relationgroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRELATIONGROUP_LONGNAME() {
		return (EAttribute)relationgroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRELATIONGROUP_RELATIONTYPE() {
		return (EReference)relationgroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRELATIONGROUP_SPECRELATIONS() {
		return (EReference)relationgroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRELATIONGROUP_TARGETGROUP() {
		return (EReference)relationgroupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRELATIONGROUPSType() {
		return relationgroupsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRELATIONGROUPSType_Group() {
		return (EAttribute)relationgroupsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRELATIONGROUPSType_RELATIONGROUP() {
		return (EReference)relationgroupsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRELATIONGROUPSType1() {
		return relationgroupsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRELATIONGROUPSType1_Group() {
		return (EAttribute)relationgroupsType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRELATIONGROUPSType1_RELATIONGROUPREF() {
		return (EReference)relationgroupsType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRELATIONTYPEType() {
		return relationtypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRELATIONTYPEType_SPECTYPEREF() {
		return (EReference)relationtypeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRIF() {
		return rifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRIF_AUTHOR() {
		return (EAttribute)rifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRIF_COMMENT() {
		return (EAttribute)rifEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRIF_COUNTRYCODE() {
		return (EAttribute)rifEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRIF_CREATIONTIME() {
		return (EAttribute)rifEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRIF_IDENTIFIER() {
		return (EAttribute)rifEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRIF_SOURCETOOLID() {
		return (EAttribute)rifEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRIF_TITLE() {
		return (EAttribute)rifEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRIF_VERSION() {
		return (EAttribute)rifEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIF_ACCESSPOLICIES() {
		return (EReference)rifEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIF_DATATYPES() {
		return (EReference)rifEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIF_SPECTYPES() {
		return (EReference)rifEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIF_SPECOBJECTS() {
		return (EReference)rifEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIF_SPECRELATIONS() {
		return (EReference)rifEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIF_SPECGROUPS() {
		return (EReference)rifEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIF_SPECHIERARCHYROOTS() {
		return (EReference)rifEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSOURCEType() {
		return sourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSOURCEType_SPECOBJECTREF() {
		return (EReference)sourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECATTRIBUTESType() {
		return specattributesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECATTRIBUTESType_Group() {
		return (EAttribute)specattributesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONCOMPLEX() {
		return (EReference)specattributesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONENUMERATION() {
		return (EReference)specattributesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONSIMPLE() {
		return (EReference)specattributesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECGROUP() {
		return specgroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECGROUP_DESC() {
		return (EAttribute)specgroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECGROUP_IDENTIFIER() {
		return (EAttribute)specgroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECGROUP_LASTCHANGE() {
		return (EAttribute)specgroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECGROUP_LONGNAME() {
		return (EAttribute)specgroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECGROUP_TYPE() {
		return (EReference)specgroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECGROUP_VALUES() {
		return (EReference)specgroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECGROUP_RELATIONGROUPS() {
		return (EReference)specgroupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECGROUP_SPECOBJECTS() {
		return (EReference)specgroupEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECGROUPSType() {
		return specgroupsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECGROUPSType_Group() {
		return (EAttribute)specgroupsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECGROUPSType_SPECGROUP() {
		return (EReference)specgroupsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECGROUPSType1() {
		return specgroupsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECGROUPSType1_Group() {
		return (EAttribute)specgroupsType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECGROUPSType1_SPECGROUPREF() {
		return (EReference)specgroupsType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECHIERARCHIESType() {
		return spechierarchiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECHIERARCHIESType_Group() {
		return (EAttribute)spechierarchiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECHIERARCHIESType_SPECHIERARCHYREF() {
		return (EReference)spechierarchiesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECHIERARCHY() {
		return spechierarchyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECHIERARCHY_DESC() {
		return (EAttribute)spechierarchyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECHIERARCHY_IDENTIFIER() {
		return (EAttribute)spechierarchyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECHIERARCHY_LASTCHANGE() {
		return (EAttribute)spechierarchyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECHIERARCHY_LONGNAME() {
		return (EAttribute)spechierarchyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECHIERARCHY_CHILDREN() {
		return (EReference)spechierarchyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECHIERARCHY_OBJECT() {
		return (EReference)spechierarchyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECHIERARCHYROOT() {
		return spechierarchyrootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECHIERARCHYROOT_DESC() {
		return (EAttribute)spechierarchyrootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECHIERARCHYROOT_IDENTIFIER() {
		return (EAttribute)spechierarchyrootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECHIERARCHYROOT_LASTCHANGE() {
		return (EAttribute)spechierarchyrootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECHIERARCHYROOT_LONGNAME() {
		return (EAttribute)spechierarchyrootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECHIERARCHYROOT_TYPE() {
		return (EReference)spechierarchyrootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECHIERARCHYROOT_VALUES() {
		return (EReference)spechierarchyrootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECHIERARCHYROOT_CHILDREN() {
		return (EReference)spechierarchyrootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECHIERARCHYROOTSType() {
		return spechierarchyrootsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECHIERARCHYROOTSType_Group() {
		return (EAttribute)spechierarchyrootsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECHIERARCHYROOTSType_SPECHIERARCHYROOT() {
		return (EReference)spechierarchyrootsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECHIERARCHYROOTSType1() {
		return spechierarchyrootsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECHIERARCHYROOTSType1_Group() {
		return (EAttribute)spechierarchyrootsType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECHIERARCHYROOTSType1_SPECHIERARCHYROOTREF() {
		return (EReference)spechierarchyrootsType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECIFIEDVALUESType() {
		return specifiedvaluesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECIFIEDVALUESType_Group() {
		return (EAttribute)specifiedvaluesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECIFIEDVALUESType_ENUMVALUE() {
		return (EReference)specifiedvaluesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECOBJECT() {
		return specobjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECOBJECT_DESC() {
		return (EAttribute)specobjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECOBJECT_IDENTIFIER() {
		return (EAttribute)specobjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECOBJECT_LASTCHANGE() {
		return (EAttribute)specobjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECOBJECT_LONGNAME() {
		return (EAttribute)specobjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECOBJECT_TYPE() {
		return (EReference)specobjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECOBJECT_VALUES() {
		return (EReference)specobjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECOBJECTSType() {
		return specobjectsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECOBJECTSType_Group() {
		return (EAttribute)specobjectsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECOBJECTSType_SPECOBJECT() {
		return (EReference)specobjectsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECOBJECTSType1() {
		return specobjectsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECOBJECTSType1_Group() {
		return (EAttribute)specobjectsType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECOBJECTSType1_SPECOBJECTREF() {
		return (EReference)specobjectsType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECOBJECTSType2() {
		return specobjectsType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECOBJECTSType2_Group() {
		return (EAttribute)specobjectsType2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECOBJECTSType2_SPECOBJECTREF() {
		return (EReference)specobjectsType2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECRELATION() {
		return specrelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECRELATION_DESC() {
		return (EAttribute)specrelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECRELATION_IDENTIFIER() {
		return (EAttribute)specrelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECRELATION_LASTCHANGE() {
		return (EAttribute)specrelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECRELATION_LONGNAME() {
		return (EAttribute)specrelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECRELATION_TYPE() {
		return (EReference)specrelationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECRELATION_VALUES() {
		return (EReference)specrelationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECRELATION_SOURCE() {
		return (EReference)specrelationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECRELATION_TARGET() {
		return (EReference)specrelationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECRELATIONSType() {
		return specrelationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECRELATIONSType_Group() {
		return (EAttribute)specrelationsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECRELATIONSType_SPECRELATIONREF() {
		return (EReference)specrelationsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECRELATIONSType1() {
		return specrelationsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECRELATIONSType1_Group() {
		return (EAttribute)specrelationsType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECRELATIONSType1_SPECRELATION() {
		return (EReference)specrelationsType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECRELATIONSType2() {
		return specrelationsType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECRELATIONSType2_Group() {
		return (EAttribute)specrelationsType2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECRELATIONSType2_SPECRELATIONREF() {
		return (EReference)specrelationsType2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECTYPE() {
		return spectypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECTYPE_DESC() {
		return (EAttribute)spectypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECTYPE_IDENTIFIER() {
		return (EAttribute)spectypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECTYPE_LASTCHANGE() {
		return (EAttribute)spectypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECTYPE_LONGNAME() {
		return (EAttribute)spectypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECTYPE_SPECATTRIBUTES() {
		return (EReference)spectypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECTYPESType() {
		return spectypesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECTYPESType_Group() {
		return (EAttribute)spectypesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECTYPESType_SPECTYPE() {
		return (EReference)spectypesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECTYPESType1() {
		return spectypesType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECTYPESType1_Group() {
		return (EAttribute)spectypesType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECTYPESType1_SPECTYPEREF() {
		return (EReference)spectypesType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTARGETGROUPType() {
		return targetgroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTARGETGROUPType_SPECGROUPREF() {
		return (EReference)targetgroupTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTARGETType() {
		return targetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTARGETType_SPECOBJECTREF() {
		return (EReference)targetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTYPEType() {
		return typeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTYPEType_SPECTYPEREF() {
		return (EReference)typeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTYPEType1() {
		return typeType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTYPEType1_SPECTYPEREF() {
		return (EReference)typeType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTYPEType2() {
		return typeType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTYPEType2_SPECTYPEREF() {
		return (EReference)typeType2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTYPEType3() {
		return typeType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTYPEType3_DATATYPEDEFINITIONBOOLEANREF() {
		return (EReference)typeType3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTYPEType3_DATATYPEDEFINITIONDATEREF() {
		return (EReference)typeType3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTYPEType3_DATATYPEDEFINITIONINTEGERREF() {
		return (EReference)typeType3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTYPEType3_DATATYPEDEFINITIONREALREF() {
		return (EReference)typeType3EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTYPEType3_DATATYPEDEFINITIONSTRINGREF() {
		return (EReference)typeType3EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTYPEType4() {
		return typeType4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTYPEType4_DATATYPEDEFINITIONENUMERATIONREF() {
		return (EReference)typeType4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTYPEType5() {
		return typeType5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTYPEType5_SPECTYPEREF() {
		return (EReference)typeType5EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTYPEType6() {
		return typeType6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTYPEType6_DATATYPEDEFINITIONBINARYFILEREF() {
		return (EReference)typeType6EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTYPEType6_DATATYPEDEFINITIONDOCUMENTREF() {
		return (EReference)typeType6EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTYPEType6_DATATYPEDEFINITIONXMLDATAREF() {
		return (EReference)typeType6EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVALUESType() {
		return valuesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVALUESType_Group() {
		return (EAttribute)valuesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType_ATTRIBUTEVALUEEMBEDDEDDOCUMENT() {
		return (EReference)valuesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType_ATTRIBUTEVALUEEMBEDDEDFILE() {
		return (EReference)valuesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType_ATTRIBUTEVALUEENUMERATION() {
		return (EReference)valuesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType_ATTRIBUTEVALUEFILEREFERENCE() {
		return (EReference)valuesTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType_ATTRIBUTEVALUESIMPLE() {
		return (EReference)valuesTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType_ATTRIBUTEVALUEXMLDATA() {
		return (EReference)valuesTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVALUESType1() {
		return valuesType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVALUESType1_Group() {
		return (EAttribute)valuesType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType1_ATTRIBUTEVALUEEMBEDDEDDOCUMENT() {
		return (EReference)valuesType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType1_ATTRIBUTEVALUEEMBEDDEDFILE() {
		return (EReference)valuesType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType1_ATTRIBUTEVALUEENUMERATION() {
		return (EReference)valuesType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType1_ATTRIBUTEVALUEFILEREFERENCE() {
		return (EReference)valuesType1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType1_ATTRIBUTEVALUESIMPLE() {
		return (EReference)valuesType1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType1_ATTRIBUTEVALUEXMLDATA() {
		return (EReference)valuesType1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVALUESType2() {
		return valuesType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVALUESType2_Group() {
		return (EAttribute)valuesType2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType2_ATTRIBUTEVALUEEMBEDDEDDOCUMENT() {
		return (EReference)valuesType2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType2_ATTRIBUTEVALUEEMBEDDEDFILE() {
		return (EReference)valuesType2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType2_ATTRIBUTEVALUEENUMERATION() {
		return (EReference)valuesType2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType2_ATTRIBUTEVALUEFILEREFERENCE() {
		return (EReference)valuesType2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType2_ATTRIBUTEVALUESIMPLE() {
		return (EReference)valuesType2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType2_ATTRIBUTEVALUEXMLDATA() {
		return (EReference)valuesType2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVALUESType3() {
		return valuesType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVALUESType3_Group() {
		return (EAttribute)valuesType3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType3_ATTRIBUTEVALUEEMBEDDEDDOCUMENT() {
		return (EReference)valuesType3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType3_ATTRIBUTEVALUEEMBEDDEDFILE() {
		return (EReference)valuesType3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType3_ATTRIBUTEVALUEENUMERATION() {
		return (EReference)valuesType3EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType3_ATTRIBUTEVALUEFILEREFERENCE() {
		return (EReference)valuesType3EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType3_ATTRIBUTEVALUESIMPLE() {
		return (EReference)valuesType3EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType3_ATTRIBUTEVALUEXMLDATA() {
		return (EReference)valuesType3EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVALUESType4() {
		return valuesType4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVALUESType4_Group() {
		return (EAttribute)valuesType4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType4_ENUMVALUEREF() {
		return (EReference)valuesType4EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXHTMLCONTENT() {
		return xhtmlcontentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXHTMLCONTENT_Any() {
		return (EAttribute)xhtmlcontentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMLCONTENT() {
		return xmlcontentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMLCONTENT_Any() {
		return (EAttribute)xmlcontentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getACCESSPOLICYACCESSMODEENUM() {
		return accesspolicyaccessmodeenumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDATATYPEDEFINITIONDATEFORMATENUM() {
		return datatypedefinitiondateformatenumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getACCESSPOLICYACCESSMODEENUMObject() {
		return accesspolicyaccessmodeenumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDATATYPEDEFINITIONDATEFORMATENUMObject() {
		return datatypedefinitiondateformatenumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getREF() {
		return refEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RifFactory getRifFactory() {
		return (RifFactory)getEFactoryInstance();
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

		// Create classes and their features
		accesspoliciesTypeEClass = createEClass(ACCESSPOLICIES_TYPE);
		createEAttribute(accesspoliciesTypeEClass, ACCESSPOLICIES_TYPE__GROUP);
		createEReference(accesspoliciesTypeEClass, ACCESSPOLICIES_TYPE__ACCESSPOLICY);

		accesspolicyEClass = createEClass(ACCESSPOLICY);
		createEAttribute(accesspolicyEClass, ACCESSPOLICY__DESC);
		createEAttribute(accesspolicyEClass, ACCESSPOLICY__IDENTIFIER);
		createEAttribute(accesspolicyEClass, ACCESSPOLICY__LASTCHANGE);
		createEAttribute(accesspolicyEClass, ACCESSPOLICY__LONGNAME);
		createEAttribute(accesspolicyEClass, ACCESSPOLICY__ACCESSMODE);
		createEReference(accesspolicyEClass, ACCESSPOLICY__ATTRIBUTEDEFINITIONS);
		createEReference(accesspolicyEClass, ACCESSPOLICY__ATTRIBUTEVALUES);
		createEReference(accesspolicyEClass, ACCESSPOLICY__DATATYPEDEFINITIONS);
		createEReference(accesspolicyEClass, ACCESSPOLICY__RELATIONGROUPS);
		createEReference(accesspolicyEClass, ACCESSPOLICY__SPECGROUPS);
		createEReference(accesspolicyEClass, ACCESSPOLICY__SPECHIERARCHIES);
		createEReference(accesspolicyEClass, ACCESSPOLICY__SPECHIERARCHYROOTS);
		createEReference(accesspolicyEClass, ACCESSPOLICY__SPECOBJECTS);
		createEReference(accesspolicyEClass, ACCESSPOLICY__SPECRELATIONS);
		createEReference(accesspolicyEClass, ACCESSPOLICY__SPECTYPES);

		attributedefinitioncomplexEClass = createEClass(ATTRIBUTEDEFINITIONCOMPLEX);
		createEAttribute(attributedefinitioncomplexEClass, ATTRIBUTEDEFINITIONCOMPLEX__DESC);
		createEAttribute(attributedefinitioncomplexEClass, ATTRIBUTEDEFINITIONCOMPLEX__IDENTIFIER);
		createEAttribute(attributedefinitioncomplexEClass, ATTRIBUTEDEFINITIONCOMPLEX__LASTCHANGE);
		createEAttribute(attributedefinitioncomplexEClass, ATTRIBUTEDEFINITIONCOMPLEX__LONGNAME);
		createEReference(attributedefinitioncomplexEClass, ATTRIBUTEDEFINITIONCOMPLEX__DEFAULTVALUE);
		createEReference(attributedefinitioncomplexEClass, ATTRIBUTEDEFINITIONCOMPLEX__TYPE);

		attributedefinitionenumerationEClass = createEClass(ATTRIBUTEDEFINITIONENUMERATION);
		createEAttribute(attributedefinitionenumerationEClass, ATTRIBUTEDEFINITIONENUMERATION__DESC);
		createEAttribute(attributedefinitionenumerationEClass, ATTRIBUTEDEFINITIONENUMERATION__IDENTIFIER);
		createEAttribute(attributedefinitionenumerationEClass, ATTRIBUTEDEFINITIONENUMERATION__LASTCHANGE);
		createEAttribute(attributedefinitionenumerationEClass, ATTRIBUTEDEFINITIONENUMERATION__LONGNAME);
		createEReference(attributedefinitionenumerationEClass, ATTRIBUTEDEFINITIONENUMERATION__DEFAULTVALUE);
		createEAttribute(attributedefinitionenumerationEClass, ATTRIBUTEDEFINITIONENUMERATION__MULTIVALUED);
		createEReference(attributedefinitionenumerationEClass, ATTRIBUTEDEFINITIONENUMERATION__TYPE);

		attributedefinitionsimpleEClass = createEClass(ATTRIBUTEDEFINITIONSIMPLE);
		createEAttribute(attributedefinitionsimpleEClass, ATTRIBUTEDEFINITIONSIMPLE__DESC);
		createEAttribute(attributedefinitionsimpleEClass, ATTRIBUTEDEFINITIONSIMPLE__IDENTIFIER);
		createEAttribute(attributedefinitionsimpleEClass, ATTRIBUTEDEFINITIONSIMPLE__LASTCHANGE);
		createEAttribute(attributedefinitionsimpleEClass, ATTRIBUTEDEFINITIONSIMPLE__LONGNAME);
		createEReference(attributedefinitionsimpleEClass, ATTRIBUTEDEFINITIONSIMPLE__DEFAULTVALUE);
		createEReference(attributedefinitionsimpleEClass, ATTRIBUTEDEFINITIONSIMPLE__TYPE);

		attributedefinitionsTypeEClass = createEClass(ATTRIBUTEDEFINITIONS_TYPE);
		createEAttribute(attributedefinitionsTypeEClass, ATTRIBUTEDEFINITIONS_TYPE__GROUP);
		createEReference(attributedefinitionsTypeEClass, ATTRIBUTEDEFINITIONS_TYPE__ATTRIBUTEDEFINITIONCOMPLEXREF);
		createEReference(attributedefinitionsTypeEClass, ATTRIBUTEDEFINITIONS_TYPE__ATTRIBUTEDEFINITIONENUMERATIONREF);
		createEReference(attributedefinitionsTypeEClass, ATTRIBUTEDEFINITIONS_TYPE__ATTRIBUTEDEFINITIONSIMPLEREF);

		attributevalueembeddeddocumentEClass = createEClass(ATTRIBUTEVALUEEMBEDDEDDOCUMENT);
		createEAttribute(attributevalueembeddeddocumentEClass, ATTRIBUTEVALUEEMBEDDEDDOCUMENT__DESC);
		createEAttribute(attributevalueembeddeddocumentEClass, ATTRIBUTEVALUEEMBEDDEDDOCUMENT__IDENTIFIER);
		createEAttribute(attributevalueembeddeddocumentEClass, ATTRIBUTEVALUEEMBEDDEDDOCUMENT__LASTCHANGE);
		createEAttribute(attributevalueembeddeddocumentEClass, ATTRIBUTEVALUEEMBEDDEDDOCUMENT__LONGNAME);
		createEReference(attributevalueembeddeddocumentEClass, ATTRIBUTEVALUEEMBEDDEDDOCUMENT__DEFINITION);
		createEReference(attributevalueembeddeddocumentEClass, ATTRIBUTEVALUEEMBEDDEDDOCUMENT__XHTMLCONTENT);

		attributevalueembeddedfileEClass = createEClass(ATTRIBUTEVALUEEMBEDDEDFILE);
		createEAttribute(attributevalueembeddedfileEClass, ATTRIBUTEVALUEEMBEDDEDFILE__DESC);
		createEAttribute(attributevalueembeddedfileEClass, ATTRIBUTEVALUEEMBEDDEDFILE__IDENTIFIER);
		createEAttribute(attributevalueembeddedfileEClass, ATTRIBUTEVALUEEMBEDDEDFILE__LASTCHANGE);
		createEAttribute(attributevalueembeddedfileEClass, ATTRIBUTEVALUEEMBEDDEDFILE__LONGNAME);
		createEReference(attributevalueembeddedfileEClass, ATTRIBUTEVALUEEMBEDDEDFILE__BINARYCONTENT);
		createEReference(attributevalueembeddedfileEClass, ATTRIBUTEVALUEEMBEDDEDFILE__DEFINITION);

		attributevalueenumerationEClass = createEClass(ATTRIBUTEVALUEENUMERATION);
		createEAttribute(attributevalueenumerationEClass, ATTRIBUTEVALUEENUMERATION__DESC);
		createEAttribute(attributevalueenumerationEClass, ATTRIBUTEVALUEENUMERATION__IDENTIFIER);
		createEAttribute(attributevalueenumerationEClass, ATTRIBUTEVALUEENUMERATION__LASTCHANGE);
		createEAttribute(attributevalueenumerationEClass, ATTRIBUTEVALUEENUMERATION__LONGNAME);
		createEReference(attributevalueenumerationEClass, ATTRIBUTEVALUEENUMERATION__DEFINITION);
		createEReference(attributevalueenumerationEClass, ATTRIBUTEVALUEENUMERATION__VALUES);

		attributevaluefilereferenceEClass = createEClass(ATTRIBUTEVALUEFILEREFERENCE);
		createEAttribute(attributevaluefilereferenceEClass, ATTRIBUTEVALUEFILEREFERENCE__DESC);
		createEAttribute(attributevaluefilereferenceEClass, ATTRIBUTEVALUEFILEREFERENCE__IDENTIFIER);
		createEAttribute(attributevaluefilereferenceEClass, ATTRIBUTEVALUEFILEREFERENCE__LASTCHANGE);
		createEAttribute(attributevaluefilereferenceEClass, ATTRIBUTEVALUEFILEREFERENCE__LONGNAME);
		createEReference(attributevaluefilereferenceEClass, ATTRIBUTEVALUEFILEREFERENCE__DEFINITION);
		createEAttribute(attributevaluefilereferenceEClass, ATTRIBUTEVALUEFILEREFERENCE__PATHTOFILE);

		attributevaluesimpleEClass = createEClass(ATTRIBUTEVALUESIMPLE);
		createEAttribute(attributevaluesimpleEClass, ATTRIBUTEVALUESIMPLE__DESC);
		createEAttribute(attributevaluesimpleEClass, ATTRIBUTEVALUESIMPLE__IDENTIFIER);
		createEAttribute(attributevaluesimpleEClass, ATTRIBUTEVALUESIMPLE__LASTCHANGE);
		createEAttribute(attributevaluesimpleEClass, ATTRIBUTEVALUESIMPLE__LONGNAME);
		createEReference(attributevaluesimpleEClass, ATTRIBUTEVALUESIMPLE__DEFINITION);
		createEAttribute(attributevaluesimpleEClass, ATTRIBUTEVALUESIMPLE__THEVALUE);

		attributevaluesTypeEClass = createEClass(ATTRIBUTEVALUES_TYPE);
		createEAttribute(attributevaluesTypeEClass, ATTRIBUTEVALUES_TYPE__GROUP);
		createEReference(attributevaluesTypeEClass, ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF);
		createEReference(attributevaluesTypeEClass, ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEEMBEDDEDFILEREF);
		createEReference(attributevaluesTypeEClass, ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEENUMERATIONREF);
		createEReference(attributevaluesTypeEClass, ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEFILEREFERENCEREF);
		createEReference(attributevaluesTypeEClass, ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUESIMPLEREF);
		createEReference(attributevaluesTypeEClass, ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEXMLDATAREF);

		attributevaluexmldataEClass = createEClass(ATTRIBUTEVALUEXMLDATA);
		createEAttribute(attributevaluexmldataEClass, ATTRIBUTEVALUEXMLDATA__DESC);
		createEAttribute(attributevaluexmldataEClass, ATTRIBUTEVALUEXMLDATA__IDENTIFIER);
		createEAttribute(attributevaluexmldataEClass, ATTRIBUTEVALUEXMLDATA__LASTCHANGE);
		createEAttribute(attributevaluexmldataEClass, ATTRIBUTEVALUEXMLDATA__LONGNAME);
		createEReference(attributevaluexmldataEClass, ATTRIBUTEVALUEXMLDATA__DEFINITION);
		createEReference(attributevaluexmldataEClass, ATTRIBUTEVALUEXMLDATA__XMLCONTENT);

		binarycontentEClass = createEClass(BINARYCONTENT);
		createEAttribute(binarycontentEClass, BINARYCONTENT__VALUE);

		childrenTypeEClass = createEClass(CHILDREN_TYPE);
		createEAttribute(childrenTypeEClass, CHILDREN_TYPE__GROUP);
		createEReference(childrenTypeEClass, CHILDREN_TYPE__SPECHIERARCHY);

		childrenType1EClass = createEClass(CHILDREN_TYPE1);
		createEAttribute(childrenType1EClass, CHILDREN_TYPE1__GROUP);
		createEReference(childrenType1EClass, CHILDREN_TYPE1__SPECHIERARCHY);

		datatypedefinitionbinaryfileEClass = createEClass(DATATYPEDEFINITIONBINARYFILE);
		createEAttribute(datatypedefinitionbinaryfileEClass, DATATYPEDEFINITIONBINARYFILE__DESC);
		createEAttribute(datatypedefinitionbinaryfileEClass, DATATYPEDEFINITIONBINARYFILE__IDENTIFIER);
		createEAttribute(datatypedefinitionbinaryfileEClass, DATATYPEDEFINITIONBINARYFILE__LASTCHANGE);
		createEAttribute(datatypedefinitionbinaryfileEClass, DATATYPEDEFINITIONBINARYFILE__LONGNAME);
		createEAttribute(datatypedefinitionbinaryfileEClass, DATATYPEDEFINITIONBINARYFILE__EMBEDDED);
		createEAttribute(datatypedefinitionbinaryfileEClass, DATATYPEDEFINITIONBINARYFILE__APPLICATION);
		createEAttribute(datatypedefinitionbinaryfileEClass, DATATYPEDEFINITIONBINARYFILE__FILENAMESUFFIX);
		createEAttribute(datatypedefinitionbinaryfileEClass, DATATYPEDEFINITIONBINARYFILE__FORMATNAME);
		createEAttribute(datatypedefinitionbinaryfileEClass, DATATYPEDEFINITIONBINARYFILE__MIMETYPE);

		datatypedefinitionbooleanEClass = createEClass(DATATYPEDEFINITIONBOOLEAN);
		createEAttribute(datatypedefinitionbooleanEClass, DATATYPEDEFINITIONBOOLEAN__DESC);
		createEAttribute(datatypedefinitionbooleanEClass, DATATYPEDEFINITIONBOOLEAN__IDENTIFIER);
		createEAttribute(datatypedefinitionbooleanEClass, DATATYPEDEFINITIONBOOLEAN__LASTCHANGE);
		createEAttribute(datatypedefinitionbooleanEClass, DATATYPEDEFINITIONBOOLEAN__LONGNAME);

		datatypedefinitiondateEClass = createEClass(DATATYPEDEFINITIONDATE);
		createEAttribute(datatypedefinitiondateEClass, DATATYPEDEFINITIONDATE__DESC);
		createEAttribute(datatypedefinitiondateEClass, DATATYPEDEFINITIONDATE__IDENTIFIER);
		createEAttribute(datatypedefinitiondateEClass, DATATYPEDEFINITIONDATE__LASTCHANGE);
		createEAttribute(datatypedefinitiondateEClass, DATATYPEDEFINITIONDATE__LONGNAME);
		createEAttribute(datatypedefinitiondateEClass, DATATYPEDEFINITIONDATE__FORMAT);

		datatypedefinitiondocumentEClass = createEClass(DATATYPEDEFINITIONDOCUMENT);
		createEAttribute(datatypedefinitiondocumentEClass, DATATYPEDEFINITIONDOCUMENT__DESC);
		createEAttribute(datatypedefinitiondocumentEClass, DATATYPEDEFINITIONDOCUMENT__IDENTIFIER);
		createEAttribute(datatypedefinitiondocumentEClass, DATATYPEDEFINITIONDOCUMENT__LASTCHANGE);
		createEAttribute(datatypedefinitiondocumentEClass, DATATYPEDEFINITIONDOCUMENT__LONGNAME);
		createEAttribute(datatypedefinitiondocumentEClass, DATATYPEDEFINITIONDOCUMENT__EMBEDDED);

		datatypedefinitionenumerationEClass = createEClass(DATATYPEDEFINITIONENUMERATION);
		createEAttribute(datatypedefinitionenumerationEClass, DATATYPEDEFINITIONENUMERATION__DESC);
		createEAttribute(datatypedefinitionenumerationEClass, DATATYPEDEFINITIONENUMERATION__IDENTIFIER);
		createEAttribute(datatypedefinitionenumerationEClass, DATATYPEDEFINITIONENUMERATION__LASTCHANGE);
		createEAttribute(datatypedefinitionenumerationEClass, DATATYPEDEFINITIONENUMERATION__LONGNAME);
		createEReference(datatypedefinitionenumerationEClass, DATATYPEDEFINITIONENUMERATION__SPECIFIEDVALUES);

		datatypedefinitionintegerEClass = createEClass(DATATYPEDEFINITIONINTEGER);
		createEAttribute(datatypedefinitionintegerEClass, DATATYPEDEFINITIONINTEGER__DESC);
		createEAttribute(datatypedefinitionintegerEClass, DATATYPEDEFINITIONINTEGER__IDENTIFIER);
		createEAttribute(datatypedefinitionintegerEClass, DATATYPEDEFINITIONINTEGER__LASTCHANGE);
		createEAttribute(datatypedefinitionintegerEClass, DATATYPEDEFINITIONINTEGER__LONGNAME);
		createEAttribute(datatypedefinitionintegerEClass, DATATYPEDEFINITIONINTEGER__MAX);
		createEAttribute(datatypedefinitionintegerEClass, DATATYPEDEFINITIONINTEGER__MIN);

		datatypedefinitionrealEClass = createEClass(DATATYPEDEFINITIONREAL);
		createEAttribute(datatypedefinitionrealEClass, DATATYPEDEFINITIONREAL__DESC);
		createEAttribute(datatypedefinitionrealEClass, DATATYPEDEFINITIONREAL__IDENTIFIER);
		createEAttribute(datatypedefinitionrealEClass, DATATYPEDEFINITIONREAL__LASTCHANGE);
		createEAttribute(datatypedefinitionrealEClass, DATATYPEDEFINITIONREAL__LONGNAME);
		createEAttribute(datatypedefinitionrealEClass, DATATYPEDEFINITIONREAL__ACCURACY);
		createEAttribute(datatypedefinitionrealEClass, DATATYPEDEFINITIONREAL__MAX);
		createEAttribute(datatypedefinitionrealEClass, DATATYPEDEFINITIONREAL__MIN);

		datatypedefinitionstringEClass = createEClass(DATATYPEDEFINITIONSTRING);
		createEAttribute(datatypedefinitionstringEClass, DATATYPEDEFINITIONSTRING__DESC);
		createEAttribute(datatypedefinitionstringEClass, DATATYPEDEFINITIONSTRING__IDENTIFIER);
		createEAttribute(datatypedefinitionstringEClass, DATATYPEDEFINITIONSTRING__LASTCHANGE);
		createEAttribute(datatypedefinitionstringEClass, DATATYPEDEFINITIONSTRING__LONGNAME);
		createEAttribute(datatypedefinitionstringEClass, DATATYPEDEFINITIONSTRING__MAXLENGTH);

		datatypedefinitionsTypeEClass = createEClass(DATATYPEDEFINITIONS_TYPE);
		createEAttribute(datatypedefinitionsTypeEClass, DATATYPEDEFINITIONS_TYPE__GROUP);
		createEReference(datatypedefinitionsTypeEClass, DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONBINARYFILEREF);
		createEReference(datatypedefinitionsTypeEClass, DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONBOOLEANREF);
		createEReference(datatypedefinitionsTypeEClass, DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONDATEREF);
		createEReference(datatypedefinitionsTypeEClass, DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONDOCUMENTREF);
		createEReference(datatypedefinitionsTypeEClass, DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONENUMERATIONREF);
		createEReference(datatypedefinitionsTypeEClass, DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONINTEGERREF);
		createEReference(datatypedefinitionsTypeEClass, DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONREALREF);
		createEReference(datatypedefinitionsTypeEClass, DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONSTRINGREF);
		createEReference(datatypedefinitionsTypeEClass, DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONXMLDATAREF);

		datatypedefinitionxmldataEClass = createEClass(DATATYPEDEFINITIONXMLDATA);
		createEAttribute(datatypedefinitionxmldataEClass, DATATYPEDEFINITIONXMLDATA__DESC);
		createEAttribute(datatypedefinitionxmldataEClass, DATATYPEDEFINITIONXMLDATA__IDENTIFIER);
		createEAttribute(datatypedefinitionxmldataEClass, DATATYPEDEFINITIONXMLDATA__LASTCHANGE);
		createEAttribute(datatypedefinitionxmldataEClass, DATATYPEDEFINITIONXMLDATA__LONGNAME);
		createEAttribute(datatypedefinitionxmldataEClass, DATATYPEDEFINITIONXMLDATA__EMBEDDED);
		createEAttribute(datatypedefinitionxmldataEClass, DATATYPEDEFINITIONXMLDATA__NAMESPACEURI);
		createEAttribute(datatypedefinitionxmldataEClass, DATATYPEDEFINITIONXMLDATA__SCHEMALOCATION);

		datatypesTypeEClass = createEClass(DATATYPES_TYPE);
		createEAttribute(datatypesTypeEClass, DATATYPES_TYPE__GROUP);
		createEReference(datatypesTypeEClass, DATATYPES_TYPE__DATATYPEDEFINITIONBINARYFILE);
		createEReference(datatypesTypeEClass, DATATYPES_TYPE__DATATYPEDEFINITIONBOOLEAN);
		createEReference(datatypesTypeEClass, DATATYPES_TYPE__DATATYPEDEFINITIONDATE);
		createEReference(datatypesTypeEClass, DATATYPES_TYPE__DATATYPEDEFINITIONDOCUMENT);
		createEReference(datatypesTypeEClass, DATATYPES_TYPE__DATATYPEDEFINITIONENUMERATION);
		createEReference(datatypesTypeEClass, DATATYPES_TYPE__DATATYPEDEFINITIONINTEGER);
		createEReference(datatypesTypeEClass, DATATYPES_TYPE__DATATYPEDEFINITIONREAL);
		createEReference(datatypesTypeEClass, DATATYPES_TYPE__DATATYPEDEFINITIONSTRING);
		createEReference(datatypesTypeEClass, DATATYPES_TYPE__DATATYPEDEFINITIONXMLDATA);

		defaultvalueTypeEClass = createEClass(DEFAULTVALUE_TYPE);
		createEReference(defaultvalueTypeEClass, DEFAULTVALUE_TYPE__ATTRIBUTEVALUESIMPLE);

		defaultvalueType1EClass = createEClass(DEFAULTVALUE_TYPE1);
		createEReference(defaultvalueType1EClass, DEFAULTVALUE_TYPE1__ATTRIBUTEVALUEENUMERATION);

		defaultvalueType2EClass = createEClass(DEFAULTVALUE_TYPE2);
		createEReference(defaultvalueType2EClass, DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEEMBEDDEDDOCUMENT);
		createEReference(defaultvalueType2EClass, DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEEMBEDDEDFILE);
		createEReference(defaultvalueType2EClass, DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEFILEREFERENCE);
		createEReference(defaultvalueType2EClass, DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEXMLDATA);

		definitionTypeEClass = createEClass(DEFINITION_TYPE);
		createEReference(definitionTypeEClass, DEFINITION_TYPE__ATTRIBUTEDEFINITIONCOMPLEXREF);

		definitionType1EClass = createEClass(DEFINITION_TYPE1);
		createEReference(definitionType1EClass, DEFINITION_TYPE1__ATTRIBUTEDEFINITIONCOMPLEXREF);

		definitionType2EClass = createEClass(DEFINITION_TYPE2);
		createEReference(definitionType2EClass, DEFINITION_TYPE2__ATTRIBUTEDEFINITIONSIMPLEREF);

		definitionType3EClass = createEClass(DEFINITION_TYPE3);
		createEReference(definitionType3EClass, DEFINITION_TYPE3__ATTRIBUTEDEFINITIONENUMERATIONREF);

		definitionType4EClass = createEClass(DEFINITION_TYPE4);
		createEReference(definitionType4EClass, DEFINITION_TYPE4__ATTRIBUTEDEFINITIONCOMPLEXREF);

		definitionType5EClass = createEClass(DEFINITION_TYPE5);
		createEReference(definitionType5EClass, DEFINITION_TYPE5__ATTRIBUTEDEFINITIONCOMPLEXREF);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RIF);

		embeddedvalueEClass = createEClass(EMBEDDEDVALUE);
		createEAttribute(embeddedvalueEClass, EMBEDDEDVALUE__KEY);
		createEAttribute(embeddedvalueEClass, EMBEDDEDVALUE__OTHERCONTENT);

		enumvalueEClass = createEClass(ENUMVALUE);
		createEAttribute(enumvalueEClass, ENUMVALUE__DESC);
		createEAttribute(enumvalueEClass, ENUMVALUE__IDENTIFIER);
		createEAttribute(enumvalueEClass, ENUMVALUE__LASTCHANGE);
		createEAttribute(enumvalueEClass, ENUMVALUE__LONGNAME);
		createEReference(enumvalueEClass, ENUMVALUE__PROPERTIES);

		objectTypeEClass = createEClass(OBJECT_TYPE);
		createEReference(objectTypeEClass, OBJECT_TYPE__SPECOBJECTREF);

		propertiesTypeEClass = createEClass(PROPERTIES_TYPE);
		createEReference(propertiesTypeEClass, PROPERTIES_TYPE__EMBEDDEDVALUE);

		relationgroupEClass = createEClass(RELATIONGROUP);
		createEAttribute(relationgroupEClass, RELATIONGROUP__DESC);
		createEAttribute(relationgroupEClass, RELATIONGROUP__IDENTIFIER);
		createEAttribute(relationgroupEClass, RELATIONGROUP__LASTCHANGE);
		createEAttribute(relationgroupEClass, RELATIONGROUP__LONGNAME);
		createEReference(relationgroupEClass, RELATIONGROUP__RELATIONTYPE);
		createEReference(relationgroupEClass, RELATIONGROUP__SPECRELATIONS);
		createEReference(relationgroupEClass, RELATIONGROUP__TARGETGROUP);

		relationgroupsTypeEClass = createEClass(RELATIONGROUPS_TYPE);
		createEAttribute(relationgroupsTypeEClass, RELATIONGROUPS_TYPE__GROUP);
		createEReference(relationgroupsTypeEClass, RELATIONGROUPS_TYPE__RELATIONGROUP);

		relationgroupsType1EClass = createEClass(RELATIONGROUPS_TYPE1);
		createEAttribute(relationgroupsType1EClass, RELATIONGROUPS_TYPE1__GROUP);
		createEReference(relationgroupsType1EClass, RELATIONGROUPS_TYPE1__RELATIONGROUPREF);

		relationtypeTypeEClass = createEClass(RELATIONTYPE_TYPE);
		createEReference(relationtypeTypeEClass, RELATIONTYPE_TYPE__SPECTYPEREF);

		rifEClass = createEClass(RIF);
		createEAttribute(rifEClass, RIF__AUTHOR);
		createEAttribute(rifEClass, RIF__COMMENT);
		createEAttribute(rifEClass, RIF__COUNTRYCODE);
		createEAttribute(rifEClass, RIF__CREATIONTIME);
		createEAttribute(rifEClass, RIF__IDENTIFIER);
		createEAttribute(rifEClass, RIF__SOURCETOOLID);
		createEAttribute(rifEClass, RIF__TITLE);
		createEAttribute(rifEClass, RIF__VERSION);
		createEReference(rifEClass, RIF__ACCESSPOLICIES);
		createEReference(rifEClass, RIF__DATATYPES);
		createEReference(rifEClass, RIF__SPECTYPES);
		createEReference(rifEClass, RIF__SPECOBJECTS);
		createEReference(rifEClass, RIF__SPECRELATIONS);
		createEReference(rifEClass, RIF__SPECGROUPS);
		createEReference(rifEClass, RIF__SPECHIERARCHYROOTS);

		sourceTypeEClass = createEClass(SOURCE_TYPE);
		createEReference(sourceTypeEClass, SOURCE_TYPE__SPECOBJECTREF);

		specattributesTypeEClass = createEClass(SPECATTRIBUTES_TYPE);
		createEAttribute(specattributesTypeEClass, SPECATTRIBUTES_TYPE__GROUP);
		createEReference(specattributesTypeEClass, SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONCOMPLEX);
		createEReference(specattributesTypeEClass, SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONENUMERATION);
		createEReference(specattributesTypeEClass, SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONSIMPLE);

		specgroupEClass = createEClass(SPECGROUP);
		createEAttribute(specgroupEClass, SPECGROUP__DESC);
		createEAttribute(specgroupEClass, SPECGROUP__IDENTIFIER);
		createEAttribute(specgroupEClass, SPECGROUP__LASTCHANGE);
		createEAttribute(specgroupEClass, SPECGROUP__LONGNAME);
		createEReference(specgroupEClass, SPECGROUP__TYPE);
		createEReference(specgroupEClass, SPECGROUP__VALUES);
		createEReference(specgroupEClass, SPECGROUP__RELATIONGROUPS);
		createEReference(specgroupEClass, SPECGROUP__SPECOBJECTS);

		specgroupsTypeEClass = createEClass(SPECGROUPS_TYPE);
		createEAttribute(specgroupsTypeEClass, SPECGROUPS_TYPE__GROUP);
		createEReference(specgroupsTypeEClass, SPECGROUPS_TYPE__SPECGROUP);

		specgroupsType1EClass = createEClass(SPECGROUPS_TYPE1);
		createEAttribute(specgroupsType1EClass, SPECGROUPS_TYPE1__GROUP);
		createEReference(specgroupsType1EClass, SPECGROUPS_TYPE1__SPECGROUPREF);

		spechierarchiesTypeEClass = createEClass(SPECHIERARCHIES_TYPE);
		createEAttribute(spechierarchiesTypeEClass, SPECHIERARCHIES_TYPE__GROUP);
		createEReference(spechierarchiesTypeEClass, SPECHIERARCHIES_TYPE__SPECHIERARCHYREF);

		spechierarchyEClass = createEClass(SPECHIERARCHY);
		createEAttribute(spechierarchyEClass, SPECHIERARCHY__DESC);
		createEAttribute(spechierarchyEClass, SPECHIERARCHY__IDENTIFIER);
		createEAttribute(spechierarchyEClass, SPECHIERARCHY__LASTCHANGE);
		createEAttribute(spechierarchyEClass, SPECHIERARCHY__LONGNAME);
		createEReference(spechierarchyEClass, SPECHIERARCHY__CHILDREN);
		createEReference(spechierarchyEClass, SPECHIERARCHY__OBJECT);

		spechierarchyrootEClass = createEClass(SPECHIERARCHYROOT);
		createEAttribute(spechierarchyrootEClass, SPECHIERARCHYROOT__DESC);
		createEAttribute(spechierarchyrootEClass, SPECHIERARCHYROOT__IDENTIFIER);
		createEAttribute(spechierarchyrootEClass, SPECHIERARCHYROOT__LASTCHANGE);
		createEAttribute(spechierarchyrootEClass, SPECHIERARCHYROOT__LONGNAME);
		createEReference(spechierarchyrootEClass, SPECHIERARCHYROOT__TYPE);
		createEReference(spechierarchyrootEClass, SPECHIERARCHYROOT__VALUES);
		createEReference(spechierarchyrootEClass, SPECHIERARCHYROOT__CHILDREN);

		spechierarchyrootsTypeEClass = createEClass(SPECHIERARCHYROOTS_TYPE);
		createEAttribute(spechierarchyrootsTypeEClass, SPECHIERARCHYROOTS_TYPE__GROUP);
		createEReference(spechierarchyrootsTypeEClass, SPECHIERARCHYROOTS_TYPE__SPECHIERARCHYROOT);

		spechierarchyrootsType1EClass = createEClass(SPECHIERARCHYROOTS_TYPE1);
		createEAttribute(spechierarchyrootsType1EClass, SPECHIERARCHYROOTS_TYPE1__GROUP);
		createEReference(spechierarchyrootsType1EClass, SPECHIERARCHYROOTS_TYPE1__SPECHIERARCHYROOTREF);

		specifiedvaluesTypeEClass = createEClass(SPECIFIEDVALUES_TYPE);
		createEAttribute(specifiedvaluesTypeEClass, SPECIFIEDVALUES_TYPE__GROUP);
		createEReference(specifiedvaluesTypeEClass, SPECIFIEDVALUES_TYPE__ENUMVALUE);

		specobjectEClass = createEClass(SPECOBJECT);
		createEAttribute(specobjectEClass, SPECOBJECT__DESC);
		createEAttribute(specobjectEClass, SPECOBJECT__IDENTIFIER);
		createEAttribute(specobjectEClass, SPECOBJECT__LASTCHANGE);
		createEAttribute(specobjectEClass, SPECOBJECT__LONGNAME);
		createEReference(specobjectEClass, SPECOBJECT__TYPE);
		createEReference(specobjectEClass, SPECOBJECT__VALUES);

		specobjectsTypeEClass = createEClass(SPECOBJECTS_TYPE);
		createEAttribute(specobjectsTypeEClass, SPECOBJECTS_TYPE__GROUP);
		createEReference(specobjectsTypeEClass, SPECOBJECTS_TYPE__SPECOBJECT);

		specobjectsType1EClass = createEClass(SPECOBJECTS_TYPE1);
		createEAttribute(specobjectsType1EClass, SPECOBJECTS_TYPE1__GROUP);
		createEReference(specobjectsType1EClass, SPECOBJECTS_TYPE1__SPECOBJECTREF);

		specobjectsType2EClass = createEClass(SPECOBJECTS_TYPE2);
		createEAttribute(specobjectsType2EClass, SPECOBJECTS_TYPE2__GROUP);
		createEReference(specobjectsType2EClass, SPECOBJECTS_TYPE2__SPECOBJECTREF);

		specrelationEClass = createEClass(SPECRELATION);
		createEAttribute(specrelationEClass, SPECRELATION__DESC);
		createEAttribute(specrelationEClass, SPECRELATION__IDENTIFIER);
		createEAttribute(specrelationEClass, SPECRELATION__LASTCHANGE);
		createEAttribute(specrelationEClass, SPECRELATION__LONGNAME);
		createEReference(specrelationEClass, SPECRELATION__TYPE);
		createEReference(specrelationEClass, SPECRELATION__VALUES);
		createEReference(specrelationEClass, SPECRELATION__SOURCE);
		createEReference(specrelationEClass, SPECRELATION__TARGET);

		specrelationsTypeEClass = createEClass(SPECRELATIONS_TYPE);
		createEAttribute(specrelationsTypeEClass, SPECRELATIONS_TYPE__GROUP);
		createEReference(specrelationsTypeEClass, SPECRELATIONS_TYPE__SPECRELATIONREF);

		specrelationsType1EClass = createEClass(SPECRELATIONS_TYPE1);
		createEAttribute(specrelationsType1EClass, SPECRELATIONS_TYPE1__GROUP);
		createEReference(specrelationsType1EClass, SPECRELATIONS_TYPE1__SPECRELATION);

		specrelationsType2EClass = createEClass(SPECRELATIONS_TYPE2);
		createEAttribute(specrelationsType2EClass, SPECRELATIONS_TYPE2__GROUP);
		createEReference(specrelationsType2EClass, SPECRELATIONS_TYPE2__SPECRELATIONREF);

		spectypeEClass = createEClass(SPECTYPE);
		createEAttribute(spectypeEClass, SPECTYPE__DESC);
		createEAttribute(spectypeEClass, SPECTYPE__IDENTIFIER);
		createEAttribute(spectypeEClass, SPECTYPE__LASTCHANGE);
		createEAttribute(spectypeEClass, SPECTYPE__LONGNAME);
		createEReference(spectypeEClass, SPECTYPE__SPECATTRIBUTES);

		spectypesTypeEClass = createEClass(SPECTYPES_TYPE);
		createEAttribute(spectypesTypeEClass, SPECTYPES_TYPE__GROUP);
		createEReference(spectypesTypeEClass, SPECTYPES_TYPE__SPECTYPE);

		spectypesType1EClass = createEClass(SPECTYPES_TYPE1);
		createEAttribute(spectypesType1EClass, SPECTYPES_TYPE1__GROUP);
		createEReference(spectypesType1EClass, SPECTYPES_TYPE1__SPECTYPEREF);

		targetgroupTypeEClass = createEClass(TARGETGROUP_TYPE);
		createEReference(targetgroupTypeEClass, TARGETGROUP_TYPE__SPECGROUPREF);

		targetTypeEClass = createEClass(TARGET_TYPE);
		createEReference(targetTypeEClass, TARGET_TYPE__SPECOBJECTREF);

		typeTypeEClass = createEClass(TYPE_TYPE);
		createEReference(typeTypeEClass, TYPE_TYPE__SPECTYPEREF);

		typeType1EClass = createEClass(TYPE_TYPE1);
		createEReference(typeType1EClass, TYPE_TYPE1__SPECTYPEREF);

		typeType2EClass = createEClass(TYPE_TYPE2);
		createEReference(typeType2EClass, TYPE_TYPE2__SPECTYPEREF);

		typeType3EClass = createEClass(TYPE_TYPE3);
		createEReference(typeType3EClass, TYPE_TYPE3__DATATYPEDEFINITIONBOOLEANREF);
		createEReference(typeType3EClass, TYPE_TYPE3__DATATYPEDEFINITIONDATEREF);
		createEReference(typeType3EClass, TYPE_TYPE3__DATATYPEDEFINITIONINTEGERREF);
		createEReference(typeType3EClass, TYPE_TYPE3__DATATYPEDEFINITIONREALREF);
		createEReference(typeType3EClass, TYPE_TYPE3__DATATYPEDEFINITIONSTRINGREF);

		typeType4EClass = createEClass(TYPE_TYPE4);
		createEReference(typeType4EClass, TYPE_TYPE4__DATATYPEDEFINITIONENUMERATIONREF);

		typeType5EClass = createEClass(TYPE_TYPE5);
		createEReference(typeType5EClass, TYPE_TYPE5__SPECTYPEREF);

		typeType6EClass = createEClass(TYPE_TYPE6);
		createEReference(typeType6EClass, TYPE_TYPE6__DATATYPEDEFINITIONBINARYFILEREF);
		createEReference(typeType6EClass, TYPE_TYPE6__DATATYPEDEFINITIONDOCUMENTREF);
		createEReference(typeType6EClass, TYPE_TYPE6__DATATYPEDEFINITIONXMLDATAREF);

		valuesTypeEClass = createEClass(VALUES_TYPE);
		createEAttribute(valuesTypeEClass, VALUES_TYPE__GROUP);
		createEReference(valuesTypeEClass, VALUES_TYPE__ATTRIBUTEVALUEEMBEDDEDDOCUMENT);
		createEReference(valuesTypeEClass, VALUES_TYPE__ATTRIBUTEVALUEEMBEDDEDFILE);
		createEReference(valuesTypeEClass, VALUES_TYPE__ATTRIBUTEVALUEENUMERATION);
		createEReference(valuesTypeEClass, VALUES_TYPE__ATTRIBUTEVALUEFILEREFERENCE);
		createEReference(valuesTypeEClass, VALUES_TYPE__ATTRIBUTEVALUESIMPLE);
		createEReference(valuesTypeEClass, VALUES_TYPE__ATTRIBUTEVALUEXMLDATA);

		valuesType1EClass = createEClass(VALUES_TYPE1);
		createEAttribute(valuesType1EClass, VALUES_TYPE1__GROUP);
		createEReference(valuesType1EClass, VALUES_TYPE1__ATTRIBUTEVALUEEMBEDDEDDOCUMENT);
		createEReference(valuesType1EClass, VALUES_TYPE1__ATTRIBUTEVALUEEMBEDDEDFILE);
		createEReference(valuesType1EClass, VALUES_TYPE1__ATTRIBUTEVALUEENUMERATION);
		createEReference(valuesType1EClass, VALUES_TYPE1__ATTRIBUTEVALUEFILEREFERENCE);
		createEReference(valuesType1EClass, VALUES_TYPE1__ATTRIBUTEVALUESIMPLE);
		createEReference(valuesType1EClass, VALUES_TYPE1__ATTRIBUTEVALUEXMLDATA);

		valuesType2EClass = createEClass(VALUES_TYPE2);
		createEAttribute(valuesType2EClass, VALUES_TYPE2__GROUP);
		createEReference(valuesType2EClass, VALUES_TYPE2__ATTRIBUTEVALUEEMBEDDEDDOCUMENT);
		createEReference(valuesType2EClass, VALUES_TYPE2__ATTRIBUTEVALUEEMBEDDEDFILE);
		createEReference(valuesType2EClass, VALUES_TYPE2__ATTRIBUTEVALUEENUMERATION);
		createEReference(valuesType2EClass, VALUES_TYPE2__ATTRIBUTEVALUEFILEREFERENCE);
		createEReference(valuesType2EClass, VALUES_TYPE2__ATTRIBUTEVALUESIMPLE);
		createEReference(valuesType2EClass, VALUES_TYPE2__ATTRIBUTEVALUEXMLDATA);

		valuesType3EClass = createEClass(VALUES_TYPE3);
		createEAttribute(valuesType3EClass, VALUES_TYPE3__GROUP);
		createEReference(valuesType3EClass, VALUES_TYPE3__ATTRIBUTEVALUEEMBEDDEDDOCUMENT);
		createEReference(valuesType3EClass, VALUES_TYPE3__ATTRIBUTEVALUEEMBEDDEDFILE);
		createEReference(valuesType3EClass, VALUES_TYPE3__ATTRIBUTEVALUEENUMERATION);
		createEReference(valuesType3EClass, VALUES_TYPE3__ATTRIBUTEVALUEFILEREFERENCE);
		createEReference(valuesType3EClass, VALUES_TYPE3__ATTRIBUTEVALUESIMPLE);
		createEReference(valuesType3EClass, VALUES_TYPE3__ATTRIBUTEVALUEXMLDATA);

		valuesType4EClass = createEClass(VALUES_TYPE4);
		createEAttribute(valuesType4EClass, VALUES_TYPE4__GROUP);
		createEReference(valuesType4EClass, VALUES_TYPE4__ENUMVALUEREF);

		xhtmlcontentEClass = createEClass(XHTMLCONTENT);
		createEAttribute(xhtmlcontentEClass, XHTMLCONTENT__ANY);

		xmlcontentEClass = createEClass(XMLCONTENT);
		createEAttribute(xmlcontentEClass, XMLCONTENT__ANY);

		// Create enums
		accesspolicyaccessmodeenumEEnum = createEEnum(ACCESSPOLICYACCESSMODEENUM);
		datatypedefinitiondateformatenumEEnum = createEEnum(DATATYPEDEFINITIONDATEFORMATENUM);

		// Create data types
		accesspolicyaccessmodeenumObjectEDataType = createEDataType(ACCESSPOLICYACCESSMODEENUM_OBJECT);
		datatypedefinitiondateformatenumObjectEDataType = createEDataType(DATATYPEDEFINITIONDATEFORMATENUM_OBJECT);
		refEDataType = createEDataType(REF);
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

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(accesspoliciesTypeEClass, ACCESSPOLICIESType.class, "ACCESSPOLICIESType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getACCESSPOLICIESType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ACCESSPOLICIESType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getACCESSPOLICIESType_ACCESSPOLICY(), this.getACCESSPOLICY(), null, "aCCESSPOLICY", null, 0, -1, ACCESSPOLICIESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(accesspolicyEClass, org.eclipse.rmf.rif11.xsd.ACCESSPOLICY.class, "ACCESSPOLICY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getACCESSPOLICY_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.ACCESSPOLICY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getACCESSPOLICY_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.ACCESSPOLICY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getACCESSPOLICY_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.ACCESSPOLICY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getACCESSPOLICY_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.ACCESSPOLICY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getACCESSPOLICY_ACCESSMODE(), this.getACCESSPOLICYACCESSMODEENUM(), "aCCESSMODE", null, 1, 1, org.eclipse.rmf.rif11.xsd.ACCESSPOLICY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getACCESSPOLICY_ATTRIBUTEDEFINITIONS(), this.getATTRIBUTEDEFINITIONSType(), null, "aTTRIBUTEDEFINITIONS", null, 0, 1, org.eclipse.rmf.rif11.xsd.ACCESSPOLICY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getACCESSPOLICY_ATTRIBUTEVALUES(), this.getATTRIBUTEVALUESType(), null, "aTTRIBUTEVALUES", null, 0, 1, org.eclipse.rmf.rif11.xsd.ACCESSPOLICY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getACCESSPOLICY_DATATYPEDEFINITIONS(), this.getDATATYPEDEFINITIONSType(), null, "dATATYPEDEFINITIONS", null, 0, 1, org.eclipse.rmf.rif11.xsd.ACCESSPOLICY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getACCESSPOLICY_RELATIONGROUPS(), this.getRELATIONGROUPSType1(), null, "rELATIONGROUPS", null, 0, 1, org.eclipse.rmf.rif11.xsd.ACCESSPOLICY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getACCESSPOLICY_SPECGROUPS(), this.getSPECGROUPSType1(), null, "sPECGROUPS", null, 0, 1, org.eclipse.rmf.rif11.xsd.ACCESSPOLICY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getACCESSPOLICY_SPECHIERARCHIES(), this.getSPECHIERARCHIESType(), null, "sPECHIERARCHIES", null, 0, 1, org.eclipse.rmf.rif11.xsd.ACCESSPOLICY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getACCESSPOLICY_SPECHIERARCHYROOTS(), this.getSPECHIERARCHYROOTSType1(), null, "sPECHIERARCHYROOTS", null, 0, 1, org.eclipse.rmf.rif11.xsd.ACCESSPOLICY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getACCESSPOLICY_SPECOBJECTS(), this.getSPECOBJECTSType1(), null, "sPECOBJECTS", null, 0, 1, org.eclipse.rmf.rif11.xsd.ACCESSPOLICY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getACCESSPOLICY_SPECRELATIONS(), this.getSPECRELATIONSType(), null, "sPECRELATIONS", null, 0, 1, org.eclipse.rmf.rif11.xsd.ACCESSPOLICY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getACCESSPOLICY_SPECTYPES(), this.getSPECTYPESType1(), null, "sPECTYPES", null, 0, 1, org.eclipse.rmf.rif11.xsd.ACCESSPOLICY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributedefinitioncomplexEClass, org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONCOMPLEX.class, "ATTRIBUTEDEFINITIONCOMPLEX", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getATTRIBUTEDEFINITIONCOMPLEX_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONCOMPLEX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONCOMPLEX_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONCOMPLEX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONCOMPLEX_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONCOMPLEX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONCOMPLEX_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONCOMPLEX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEDEFINITIONCOMPLEX_DEFAULTVALUE(), this.getDEFAULTVALUEType2(), null, "dEFAULTVALUE", null, 0, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONCOMPLEX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEDEFINITIONCOMPLEX_TYPE(), this.getTYPEType6(), null, "tYPE", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONCOMPLEX.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributedefinitionenumerationEClass, org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION.class, "ATTRIBUTEDEFINITIONENUMERATION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getATTRIBUTEDEFINITIONENUMERATION_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONENUMERATION_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONENUMERATION_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONENUMERATION_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEDEFINITIONENUMERATION_DEFAULTVALUE(), this.getDEFAULTVALUEType1(), null, "dEFAULTVALUE", null, 0, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONENUMERATION_MULTIVALUED(), theXMLTypePackage.getBoolean(), "mULTIVALUED", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEDEFINITIONENUMERATION_TYPE(), this.getTYPEType4(), null, "tYPE", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributedefinitionsimpleEClass, org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSIMPLE.class, "ATTRIBUTEDEFINITIONSIMPLE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getATTRIBUTEDEFINITIONSIMPLE_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSIMPLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONSIMPLE_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSIMPLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONSIMPLE_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSIMPLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONSIMPLE_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSIMPLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEDEFINITIONSIMPLE_DEFAULTVALUE(), this.getDEFAULTVALUEType(), null, "dEFAULTVALUE", null, 0, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSIMPLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEDEFINITIONSIMPLE_TYPE(), this.getTYPEType3(), null, "tYPE", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSIMPLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributedefinitionsTypeEClass, ATTRIBUTEDEFINITIONSType.class, "ATTRIBUTEDEFINITIONSType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getATTRIBUTEDEFINITIONSType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ATTRIBUTEDEFINITIONSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEDEFINITIONSType_ATTRIBUTEDEFINITIONCOMPLEXREF(), this.getATTRIBUTEDEFINITIONCOMPLEX(), null, "aTTRIBUTEDEFINITIONCOMPLEXREF", null, 0, -1, ATTRIBUTEDEFINITIONSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEDEFINITIONSType_ATTRIBUTEDEFINITIONENUMERATIONREF(), this.getATTRIBUTEDEFINITIONENUMERATION(), null, "aTTRIBUTEDEFINITIONENUMERATIONREF", null, 0, -1, ATTRIBUTEDEFINITIONSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEDEFINITIONSType_ATTRIBUTEDEFINITIONSIMPLEREF(), this.getATTRIBUTEDEFINITIONSIMPLE(), null, "aTTRIBUTEDEFINITIONSIMPLEREF", null, 0, -1, ATTRIBUTEDEFINITIONSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(attributevalueembeddeddocumentEClass, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT.class, "ATTRIBUTEVALUEEMBEDDEDDOCUMENT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getATTRIBUTEVALUEEMBEDDEDDOCUMENT_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUEEMBEDDEDDOCUMENT_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUEEMBEDDEDDOCUMENT_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUEEMBEDDEDDOCUMENT_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEVALUEEMBEDDEDDOCUMENT_DEFINITION(), this.getDEFINITIONType5(), null, "dEFINITION", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEVALUEEMBEDDEDDOCUMENT_XHTMLCONTENT(), this.getXHTMLCONTENT(), null, "xHTMLCONTENT", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributevalueembeddedfileEClass, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDFILE.class, "ATTRIBUTEVALUEEMBEDDEDFILE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getATTRIBUTEVALUEEMBEDDEDFILE_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDFILE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUEEMBEDDEDFILE_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDFILE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUEEMBEDDEDFILE_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDFILE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUEEMBEDDEDFILE_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDFILE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEVALUEEMBEDDEDFILE_BINARYCONTENT(), this.getBINARYCONTENT(), null, "bINARYCONTENT", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDFILE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEVALUEEMBEDDEDFILE_DEFINITION(), this.getDEFINITIONType(), null, "dEFINITION", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDFILE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributevalueenumerationEClass, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEENUMERATION.class, "ATTRIBUTEVALUEENUMERATION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getATTRIBUTEVALUEENUMERATION_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUEENUMERATION_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUEENUMERATION_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUEENUMERATION_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEVALUEENUMERATION_DEFINITION(), this.getDEFINITIONType3(), null, "dEFINITION", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEVALUEENUMERATION_VALUES(), this.getVALUESType4(), null, "vALUES", null, 0, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributevaluefilereferenceEClass, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEFILEREFERENCE.class, "ATTRIBUTEVALUEFILEREFERENCE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getATTRIBUTEVALUEFILEREFERENCE_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEFILEREFERENCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUEFILEREFERENCE_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEFILEREFERENCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUEFILEREFERENCE_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEFILEREFERENCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUEFILEREFERENCE_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEFILEREFERENCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEVALUEFILEREFERENCE_DEFINITION(), this.getDEFINITIONType1(), null, "dEFINITION", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEFILEREFERENCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUEFILEREFERENCE_PATHTOFILE(), theXMLTypePackage.getString(), "pATHTOFILE", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEFILEREFERENCE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributevaluesimpleEClass, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE.class, "ATTRIBUTEVALUESIMPLE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getATTRIBUTEVALUESIMPLE_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUESIMPLE_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUESIMPLE_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUESIMPLE_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEVALUESIMPLE_DEFINITION(), this.getDEFINITIONType2(), null, "dEFINITION", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUESIMPLE_THEVALUE(), theXMLTypePackage.getString(), "tHEVALUE", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributevaluesTypeEClass, ATTRIBUTEVALUESType.class, "ATTRIBUTEVALUESType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getATTRIBUTEVALUESType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ATTRIBUTEVALUESType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEVALUESType_ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF(), this.getATTRIBUTEVALUEEMBEDDEDDOCUMENT(), null, "aTTRIBUTEVALUEEMBEDDEDDOCUMENTREF", null, 0, -1, ATTRIBUTEVALUESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEVALUESType_ATTRIBUTEVALUEEMBEDDEDFILEREF(), this.getATTRIBUTEVALUEEMBEDDEDFILE(), null, "aTTRIBUTEVALUEEMBEDDEDFILEREF", null, 0, -1, ATTRIBUTEVALUESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEVALUESType_ATTRIBUTEVALUEENUMERATIONREF(), this.getATTRIBUTEVALUEENUMERATION(), null, "aTTRIBUTEVALUEENUMERATIONREF", null, 0, -1, ATTRIBUTEVALUESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEVALUESType_ATTRIBUTEVALUEFILEREFERENCEREF(), this.getATTRIBUTEVALUEFILEREFERENCE(), null, "aTTRIBUTEVALUEFILEREFERENCEREF", null, 0, -1, ATTRIBUTEVALUESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEVALUESType_ATTRIBUTEVALUESIMPLEREF(), this.getATTRIBUTEVALUESIMPLE(), null, "aTTRIBUTEVALUESIMPLEREF", null, 0, -1, ATTRIBUTEVALUESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEVALUESType_ATTRIBUTEVALUEXMLDATAREF(), this.getATTRIBUTEVALUEXMLDATA(), null, "aTTRIBUTEVALUEXMLDATAREF", null, 0, -1, ATTRIBUTEVALUESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(attributevaluexmldataEClass, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEXMLDATA.class, "ATTRIBUTEVALUEXMLDATA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getATTRIBUTEVALUEXMLDATA_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEXMLDATA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUEXMLDATA_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEXMLDATA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUEXMLDATA_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEXMLDATA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUEXMLDATA_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEXMLDATA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEVALUEXMLDATA_DEFINITION(), this.getDEFINITIONType4(), null, "dEFINITION", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEXMLDATA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEVALUEXMLDATA_XMLCONTENT(), this.getXMLCONTENT(), null, "xMLCONTENT", null, 1, 1, org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEXMLDATA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binarycontentEClass, org.eclipse.rmf.rif11.xsd.BINARYCONTENT.class, "BINARYCONTENT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBINARYCONTENT_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, org.eclipse.rmf.rif11.xsd.BINARYCONTENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childrenTypeEClass, CHILDRENType.class, "CHILDRENType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCHILDRENType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, CHILDRENType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCHILDRENType_SPECHIERARCHY(), this.getSPECHIERARCHY(), null, "sPECHIERARCHY", null, 0, -1, CHILDRENType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(childrenType1EClass, CHILDRENType1.class, "CHILDRENType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCHILDRENType1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, CHILDRENType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCHILDRENType1_SPECHIERARCHY(), this.getSPECHIERARCHY(), null, "sPECHIERARCHY", null, 0, -1, CHILDRENType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(datatypedefinitionbinaryfileEClass, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE.class, "DATATYPEDEFINITIONBINARYFILE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDATATYPEDEFINITIONBINARYFILE_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONBINARYFILE_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONBINARYFILE_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONBINARYFILE_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONBINARYFILE_EMBEDDED(), theXMLTypePackage.getBoolean(), "eMBEDDED", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONBINARYFILE_APPLICATION(), theXMLTypePackage.getString(), "aPPLICATION", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONBINARYFILE_FILENAMESUFFIX(), theXMLTypePackage.getString(), "fILENAMESUFFIX", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONBINARYFILE_FORMATNAME(), theXMLTypePackage.getString(), "fORMATNAME", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONBINARYFILE_MIMETYPE(), theXMLTypePackage.getString(), "mIMETYPE", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypedefinitionbooleanEClass, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBOOLEAN.class, "DATATYPEDEFINITIONBOOLEAN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDATATYPEDEFINITIONBOOLEAN_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBOOLEAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONBOOLEAN_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBOOLEAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONBOOLEAN_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBOOLEAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONBOOLEAN_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBOOLEAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypedefinitiondateEClass, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATE.class, "DATATYPEDEFINITIONDATE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDATATYPEDEFINITIONDATE_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONDATE_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONDATE_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONDATE_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONDATE_FORMAT(), this.getDATATYPEDEFINITIONDATEFORMATENUM(), "fORMAT", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypedefinitiondocumentEClass, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDOCUMENT.class, "DATATYPEDEFINITIONDOCUMENT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDATATYPEDEFINITIONDOCUMENT_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDOCUMENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONDOCUMENT_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDOCUMENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONDOCUMENT_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDOCUMENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONDOCUMENT_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDOCUMENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONDOCUMENT_EMBEDDED(), theXMLTypePackage.getBoolean(), "eMBEDDED", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDOCUMENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypedefinitionenumerationEClass, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONENUMERATION.class, "DATATYPEDEFINITIONENUMERATION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDATATYPEDEFINITIONENUMERATION_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONENUMERATION_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONENUMERATION_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONENUMERATION_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPEDEFINITIONENUMERATION_SPECIFIEDVALUES(), this.getSPECIFIEDVALUESType(), null, "sPECIFIEDVALUES", null, 0, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypedefinitionintegerEClass, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONINTEGER.class, "DATATYPEDEFINITIONINTEGER", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDATATYPEDEFINITIONINTEGER_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONINTEGER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONINTEGER_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONINTEGER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONINTEGER_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONINTEGER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONINTEGER_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONINTEGER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONINTEGER_MAX(), theXMLTypePackage.getInteger(), "mAX", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONINTEGER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONINTEGER_MIN(), theXMLTypePackage.getInteger(), "mIN", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONINTEGER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypedefinitionrealEClass, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL.class, "DATATYPEDEFINITIONREAL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDATATYPEDEFINITIONREAL_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONREAL_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONREAL_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONREAL_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONREAL_ACCURACY(), theXMLTypePackage.getInteger(), "aCCURACY", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONREAL_MAX(), theXMLTypePackage.getDouble(), "mAX", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONREAL_MIN(), theXMLTypePackage.getDouble(), "mIN", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypedefinitionstringEClass, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSTRING.class, "DATATYPEDEFINITIONSTRING", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDATATYPEDEFINITIONSTRING_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSTRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONSTRING_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSTRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONSTRING_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSTRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONSTRING_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSTRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONSTRING_MAXLENGTH(), theXMLTypePackage.getInteger(), "mAXLENGTH", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSTRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypedefinitionsTypeEClass, DATATYPEDEFINITIONSType.class, "DATATYPEDEFINITIONSType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDATATYPEDEFINITIONSType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, DATATYPEDEFINITIONSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONBINARYFILEREF(), this.getDATATYPEDEFINITIONBINARYFILE(), null, "dATATYPEDEFINITIONBINARYFILEREF", null, 0, -1, DATATYPEDEFINITIONSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONBOOLEANREF(), this.getDATATYPEDEFINITIONBOOLEAN(), null, "dATATYPEDEFINITIONBOOLEANREF", null, 0, -1, DATATYPEDEFINITIONSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONDATEREF(), this.getDATATYPEDEFINITIONDATE(), null, "dATATYPEDEFINITIONDATEREF", null, 0, -1, DATATYPEDEFINITIONSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONDOCUMENTREF(), this.getDATATYPEDEFINITIONDOCUMENT(), null, "dATATYPEDEFINITIONDOCUMENTREF", null, 0, -1, DATATYPEDEFINITIONSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONENUMERATIONREF(), this.getDATATYPEDEFINITIONENUMERATION(), null, "dATATYPEDEFINITIONENUMERATIONREF", null, 0, -1, DATATYPEDEFINITIONSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONINTEGERREF(), this.getDATATYPEDEFINITIONINTEGER(), null, "dATATYPEDEFINITIONINTEGERREF", null, 0, -1, DATATYPEDEFINITIONSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONREALREF(), this.getDATATYPEDEFINITIONREAL(), null, "dATATYPEDEFINITIONREALREF", null, 0, -1, DATATYPEDEFINITIONSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONSTRINGREF(), this.getDATATYPEDEFINITIONSTRING(), null, "dATATYPEDEFINITIONSTRINGREF", null, 0, -1, DATATYPEDEFINITIONSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONXMLDATAREF(), this.getDATATYPEDEFINITIONXMLDATA(), null, "dATATYPEDEFINITIONXMLDATAREF", null, 0, -1, DATATYPEDEFINITIONSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(datatypedefinitionxmldataEClass, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA.class, "DATATYPEDEFINITIONXMLDATA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDATATYPEDEFINITIONXMLDATA_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONXMLDATA_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONXMLDATA_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONXMLDATA_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONXMLDATA_EMBEDDED(), theXMLTypePackage.getBoolean(), "eMBEDDED", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONXMLDATA_NAMESPACEURI(), theXMLTypePackage.getString(), "nAMESPACEURI", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONXMLDATA_SCHEMALOCATION(), theXMLTypePackage.getString(), "sCHEMALOCATION", null, 1, 1, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypesTypeEClass, DATATYPESType.class, "DATATYPESType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDATATYPESType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, DATATYPESType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPESType_DATATYPEDEFINITIONBINARYFILE(), this.getDATATYPEDEFINITIONBINARYFILE(), null, "dATATYPEDEFINITIONBINARYFILE", null, 0, -1, DATATYPESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPESType_DATATYPEDEFINITIONBOOLEAN(), this.getDATATYPEDEFINITIONBOOLEAN(), null, "dATATYPEDEFINITIONBOOLEAN", null, 0, -1, DATATYPESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPESType_DATATYPEDEFINITIONDATE(), this.getDATATYPEDEFINITIONDATE(), null, "dATATYPEDEFINITIONDATE", null, 0, -1, DATATYPESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPESType_DATATYPEDEFINITIONDOCUMENT(), this.getDATATYPEDEFINITIONDOCUMENT(), null, "dATATYPEDEFINITIONDOCUMENT", null, 0, -1, DATATYPESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPESType_DATATYPEDEFINITIONENUMERATION(), this.getDATATYPEDEFINITIONENUMERATION(), null, "dATATYPEDEFINITIONENUMERATION", null, 0, -1, DATATYPESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPESType_DATATYPEDEFINITIONINTEGER(), this.getDATATYPEDEFINITIONINTEGER(), null, "dATATYPEDEFINITIONINTEGER", null, 0, -1, DATATYPESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPESType_DATATYPEDEFINITIONREAL(), this.getDATATYPEDEFINITIONREAL(), null, "dATATYPEDEFINITIONREAL", null, 0, -1, DATATYPESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPESType_DATATYPEDEFINITIONSTRING(), this.getDATATYPEDEFINITIONSTRING(), null, "dATATYPEDEFINITIONSTRING", null, 0, -1, DATATYPESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPESType_DATATYPEDEFINITIONXMLDATA(), this.getDATATYPEDEFINITIONXMLDATA(), null, "dATATYPEDEFINITIONXMLDATA", null, 0, -1, DATATYPESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(defaultvalueTypeEClass, DEFAULTVALUEType.class, "DEFAULTVALUEType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDEFAULTVALUEType_ATTRIBUTEVALUESIMPLE(), this.getATTRIBUTEVALUESIMPLE(), null, "aTTRIBUTEVALUESIMPLE", null, 0, 1, DEFAULTVALUEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultvalueType1EClass, DEFAULTVALUEType1.class, "DEFAULTVALUEType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDEFAULTVALUEType1_ATTRIBUTEVALUEENUMERATION(), this.getATTRIBUTEVALUEENUMERATION(), null, "aTTRIBUTEVALUEENUMERATION", null, 0, 1, DEFAULTVALUEType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultvalueType2EClass, DEFAULTVALUEType2.class, "DEFAULTVALUEType2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDEFAULTVALUEType2_ATTRIBUTEVALUEEMBEDDEDDOCUMENT(), this.getATTRIBUTEVALUEEMBEDDEDDOCUMENT(), null, "aTTRIBUTEVALUEEMBEDDEDDOCUMENT", null, 0, 1, DEFAULTVALUEType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDEFAULTVALUEType2_ATTRIBUTEVALUEEMBEDDEDFILE(), this.getATTRIBUTEVALUEEMBEDDEDFILE(), null, "aTTRIBUTEVALUEEMBEDDEDFILE", null, 0, 1, DEFAULTVALUEType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDEFAULTVALUEType2_ATTRIBUTEVALUEFILEREFERENCE(), this.getATTRIBUTEVALUEFILEREFERENCE(), null, "aTTRIBUTEVALUEFILEREFERENCE", null, 0, 1, DEFAULTVALUEType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDEFAULTVALUEType2_ATTRIBUTEVALUEXMLDATA(), this.getATTRIBUTEVALUEXMLDATA(), null, "aTTRIBUTEVALUEXMLDATA", null, 0, 1, DEFAULTVALUEType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionTypeEClass, DEFINITIONType.class, "DEFINITIONType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDEFINITIONType_ATTRIBUTEDEFINITIONCOMPLEXREF(), this.getATTRIBUTEDEFINITIONCOMPLEX(), null, "aTTRIBUTEDEFINITIONCOMPLEXREF", null, 0, 1, DEFINITIONType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionType1EClass, DEFINITIONType1.class, "DEFINITIONType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDEFINITIONType1_ATTRIBUTEDEFINITIONCOMPLEXREF(), this.getATTRIBUTEDEFINITIONCOMPLEX(), null, "aTTRIBUTEDEFINITIONCOMPLEXREF", null, 0, 1, DEFINITIONType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionType2EClass, DEFINITIONType2.class, "DEFINITIONType2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDEFINITIONType2_ATTRIBUTEDEFINITIONSIMPLEREF(), this.getATTRIBUTEDEFINITIONSIMPLE(), null, "aTTRIBUTEDEFINITIONSIMPLEREF", null, 0, 1, DEFINITIONType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionType3EClass, DEFINITIONType3.class, "DEFINITIONType3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDEFINITIONType3_ATTRIBUTEDEFINITIONENUMERATIONREF(), this.getATTRIBUTEDEFINITIONENUMERATION(), null, "aTTRIBUTEDEFINITIONENUMERATIONREF", null, 0, 1, DEFINITIONType3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionType4EClass, DEFINITIONType4.class, "DEFINITIONType4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDEFINITIONType4_ATTRIBUTEDEFINITIONCOMPLEXREF(), this.getATTRIBUTEDEFINITIONCOMPLEX(), null, "aTTRIBUTEDEFINITIONCOMPLEXREF", null, 0, 1, DEFINITIONType4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionType5EClass, DEFINITIONType5.class, "DEFINITIONType5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDEFINITIONType5_ATTRIBUTEDEFINITIONCOMPLEXREF(), this.getATTRIBUTEDEFINITIONCOMPLEX(), null, "aTTRIBUTEDEFINITIONCOMPLEXREF", null, 0, 1, DEFINITIONType5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RIF(), this.getRIF(), null, "rIF", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(embeddedvalueEClass, org.eclipse.rmf.rif11.xsd.EMBEDDEDVALUE.class, "EMBEDDEDVALUE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMBEDDEDVALUE_KEY(), theXMLTypePackage.getInteger(), "kEY", null, 1, 1, org.eclipse.rmf.rif11.xsd.EMBEDDEDVALUE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMBEDDEDVALUE_OTHERCONTENT(), theXMLTypePackage.getString(), "oTHERCONTENT", null, 1, 1, org.eclipse.rmf.rif11.xsd.EMBEDDEDVALUE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumvalueEClass, org.eclipse.rmf.rif11.xsd.ENUMVALUE.class, "ENUMVALUE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getENUMVALUE_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.ENUMVALUE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getENUMVALUE_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.ENUMVALUE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getENUMVALUE_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.ENUMVALUE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getENUMVALUE_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.ENUMVALUE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getENUMVALUE_PROPERTIES(), this.getPROPERTIESType(), null, "pROPERTIES", null, 1, 1, org.eclipse.rmf.rif11.xsd.ENUMVALUE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectTypeEClass, OBJECTType.class, "OBJECTType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOBJECTType_SPECOBJECTREF(), this.getSPECOBJECT(), null, "sPECOBJECTREF", null, 0, 1, OBJECTType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesTypeEClass, PROPERTIESType.class, "PROPERTIESType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPROPERTIESType_EMBEDDEDVALUE(), this.getEMBEDDEDVALUE(), null, "eMBEDDEDVALUE", null, 0, 1, PROPERTIESType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationgroupEClass, org.eclipse.rmf.rif11.xsd.RELATIONGROUP.class, "RELATIONGROUP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRELATIONGROUP_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.RELATIONGROUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRELATIONGROUP_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.RELATIONGROUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRELATIONGROUP_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.RELATIONGROUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRELATIONGROUP_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.RELATIONGROUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRELATIONGROUP_RELATIONTYPE(), this.getRELATIONTYPEType(), null, "rELATIONTYPE", null, 0, 1, org.eclipse.rmf.rif11.xsd.RELATIONGROUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRELATIONGROUP_SPECRELATIONS(), this.getSPECRELATIONSType2(), null, "sPECRELATIONS", null, 0, 1, org.eclipse.rmf.rif11.xsd.RELATIONGROUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRELATIONGROUP_TARGETGROUP(), this.getTARGETGROUPType(), null, "tARGETGROUP", null, 1, 1, org.eclipse.rmf.rif11.xsd.RELATIONGROUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationgroupsTypeEClass, RELATIONGROUPSType.class, "RELATIONGROUPSType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRELATIONGROUPSType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, RELATIONGROUPSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRELATIONGROUPSType_RELATIONGROUP(), this.getRELATIONGROUP(), null, "rELATIONGROUP", null, 0, -1, RELATIONGROUPSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(relationgroupsType1EClass, RELATIONGROUPSType1.class, "RELATIONGROUPSType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRELATIONGROUPSType1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, RELATIONGROUPSType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRELATIONGROUPSType1_RELATIONGROUPREF(), this.getRELATIONGROUP(), null, "rELATIONGROUPREF", null, 0, -1, RELATIONGROUPSType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(relationtypeTypeEClass, RELATIONTYPEType.class, "RELATIONTYPEType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRELATIONTYPEType_SPECTYPEREF(), this.getSPECTYPE(), null, "sPECTYPEREF", null, 0, 1, RELATIONTYPEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rifEClass, org.eclipse.rmf.rif11.xsd.RIF.class, "RIF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRIF_AUTHOR(), theXMLTypePackage.getString(), "aUTHOR", null, 1, 1, org.eclipse.rmf.rif11.xsd.RIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRIF_COMMENT(), theXMLTypePackage.getString(), "cOMMENT", null, 0, 1, org.eclipse.rmf.rif11.xsd.RIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRIF_COUNTRYCODE(), theXMLTypePackage.getString(), "cOUNTRYCODE", null, 0, 1, org.eclipse.rmf.rif11.xsd.RIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRIF_CREATIONTIME(), theXMLTypePackage.getDateTime(), "cREATIONTIME", null, 1, 1, org.eclipse.rmf.rif11.xsd.RIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRIF_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.RIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRIF_SOURCETOOLID(), theXMLTypePackage.getString(), "sOURCETOOLID", null, 1, 1, org.eclipse.rmf.rif11.xsd.RIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRIF_TITLE(), theXMLTypePackage.getString(), "tITLE", null, 1, 1, org.eclipse.rmf.rif11.xsd.RIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRIF_VERSION(), theXMLTypePackage.getString(), "vERSION", null, 1, 1, org.eclipse.rmf.rif11.xsd.RIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRIF_ACCESSPOLICIES(), this.getACCESSPOLICIESType(), null, "aCCESSPOLICIES", null, 0, 1, org.eclipse.rmf.rif11.xsd.RIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRIF_DATATYPES(), this.getDATATYPESType(), null, "dATATYPES", null, 0, 1, org.eclipse.rmf.rif11.xsd.RIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRIF_SPECTYPES(), this.getSPECTYPESType(), null, "sPECTYPES", null, 0, 1, org.eclipse.rmf.rif11.xsd.RIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRIF_SPECOBJECTS(), this.getSPECOBJECTSType(), null, "sPECOBJECTS", null, 0, 1, org.eclipse.rmf.rif11.xsd.RIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRIF_SPECRELATIONS(), this.getSPECRELATIONSType1(), null, "sPECRELATIONS", null, 0, 1, org.eclipse.rmf.rif11.xsd.RIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRIF_SPECGROUPS(), this.getSPECGROUPSType(), null, "sPECGROUPS", null, 0, 1, org.eclipse.rmf.rif11.xsd.RIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRIF_SPECHIERARCHYROOTS(), this.getSPECHIERARCHYROOTSType(), null, "sPECHIERARCHYROOTS", null, 0, 1, org.eclipse.rmf.rif11.xsd.RIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceTypeEClass, SOURCEType.class, "SOURCEType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSOURCEType_SPECOBJECTREF(), this.getSPECOBJECT(), null, "sPECOBJECTREF", null, 0, 1, SOURCEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specattributesTypeEClass, SPECATTRIBUTESType.class, "SPECATTRIBUTESType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECATTRIBUTESType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPECATTRIBUTESType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONCOMPLEX(), this.getATTRIBUTEDEFINITIONCOMPLEX(), null, "aTTRIBUTEDEFINITIONCOMPLEX", null, 0, -1, SPECATTRIBUTESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONENUMERATION(), this.getATTRIBUTEDEFINITIONENUMERATION(), null, "aTTRIBUTEDEFINITIONENUMERATION", null, 0, -1, SPECATTRIBUTESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONSIMPLE(), this.getATTRIBUTEDEFINITIONSIMPLE(), null, "aTTRIBUTEDEFINITIONSIMPLE", null, 0, -1, SPECATTRIBUTESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(specgroupEClass, org.eclipse.rmf.rif11.xsd.SPECGROUP.class, "SPECGROUP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECGROUP_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.SPECGROUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECGROUP_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.SPECGROUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECGROUP_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.SPECGROUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECGROUP_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.SPECGROUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECGROUP_TYPE(), this.getTYPEType1(), null, "tYPE", null, 1, 1, org.eclipse.rmf.rif11.xsd.SPECGROUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECGROUP_VALUES(), this.getVALUESType(), null, "vALUES", null, 0, 1, org.eclipse.rmf.rif11.xsd.SPECGROUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECGROUP_RELATIONGROUPS(), this.getRELATIONGROUPSType(), null, "rELATIONGROUPS", null, 0, 1, org.eclipse.rmf.rif11.xsd.SPECGROUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECGROUP_SPECOBJECTS(), this.getSPECOBJECTSType2(), null, "sPECOBJECTS", null, 0, 1, org.eclipse.rmf.rif11.xsd.SPECGROUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specgroupsTypeEClass, SPECGROUPSType.class, "SPECGROUPSType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECGROUPSType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPECGROUPSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECGROUPSType_SPECGROUP(), this.getSPECGROUP(), null, "sPECGROUP", null, 0, -1, SPECGROUPSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(specgroupsType1EClass, SPECGROUPSType1.class, "SPECGROUPSType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECGROUPSType1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPECGROUPSType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECGROUPSType1_SPECGROUPREF(), this.getSPECGROUP(), null, "sPECGROUPREF", null, 0, -1, SPECGROUPSType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(spechierarchiesTypeEClass, SPECHIERARCHIESType.class, "SPECHIERARCHIESType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECHIERARCHIESType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPECHIERARCHIESType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECHIERARCHIESType_SPECHIERARCHYREF(), this.getSPECHIERARCHY(), null, "sPECHIERARCHYREF", null, 0, -1, SPECHIERARCHIESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(spechierarchyEClass, org.eclipse.rmf.rif11.xsd.SPECHIERARCHY.class, "SPECHIERARCHY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECHIERARCHY_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.SPECHIERARCHY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECHIERARCHY_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.SPECHIERARCHY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECHIERARCHY_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.SPECHIERARCHY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECHIERARCHY_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.SPECHIERARCHY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECHIERARCHY_CHILDREN(), this.getCHILDRENType1(), null, "cHILDREN", null, 0, 1, org.eclipse.rmf.rif11.xsd.SPECHIERARCHY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECHIERARCHY_OBJECT(), this.getOBJECTType(), null, "oBJECT", null, 1, 1, org.eclipse.rmf.rif11.xsd.SPECHIERARCHY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spechierarchyrootEClass, org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT.class, "SPECHIERARCHYROOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECHIERARCHYROOT_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECHIERARCHYROOT_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECHIERARCHYROOT_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECHIERARCHYROOT_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECHIERARCHYROOT_TYPE(), this.getTYPEType2(), null, "tYPE", null, 1, 1, org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECHIERARCHYROOT_VALUES(), this.getVALUESType1(), null, "vALUES", null, 0, 1, org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECHIERARCHYROOT_CHILDREN(), this.getCHILDRENType(), null, "cHILDREN", null, 0, 1, org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spechierarchyrootsTypeEClass, SPECHIERARCHYROOTSType.class, "SPECHIERARCHYROOTSType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECHIERARCHYROOTSType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPECHIERARCHYROOTSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECHIERARCHYROOTSType_SPECHIERARCHYROOT(), this.getSPECHIERARCHYROOT(), null, "sPECHIERARCHYROOT", null, 0, -1, SPECHIERARCHYROOTSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(spechierarchyrootsType1EClass, SPECHIERARCHYROOTSType1.class, "SPECHIERARCHYROOTSType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECHIERARCHYROOTSType1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPECHIERARCHYROOTSType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECHIERARCHYROOTSType1_SPECHIERARCHYROOTREF(), this.getSPECHIERARCHYROOT(), null, "sPECHIERARCHYROOTREF", null, 0, -1, SPECHIERARCHYROOTSType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(specifiedvaluesTypeEClass, SPECIFIEDVALUESType.class, "SPECIFIEDVALUESType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECIFIEDVALUESType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPECIFIEDVALUESType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECIFIEDVALUESType_ENUMVALUE(), this.getENUMVALUE(), null, "eNUMVALUE", null, 0, -1, SPECIFIEDVALUESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(specobjectEClass, org.eclipse.rmf.rif11.xsd.SPECOBJECT.class, "SPECOBJECT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECOBJECT_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.SPECOBJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECOBJECT_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.SPECOBJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECOBJECT_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.SPECOBJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECOBJECT_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.SPECOBJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECOBJECT_TYPE(), this.getTYPEType(), null, "tYPE", null, 1, 1, org.eclipse.rmf.rif11.xsd.SPECOBJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECOBJECT_VALUES(), this.getVALUESType2(), null, "vALUES", null, 0, 1, org.eclipse.rmf.rif11.xsd.SPECOBJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specobjectsTypeEClass, SPECOBJECTSType.class, "SPECOBJECTSType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECOBJECTSType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPECOBJECTSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECOBJECTSType_SPECOBJECT(), this.getSPECOBJECT(), null, "sPECOBJECT", null, 0, -1, SPECOBJECTSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(specobjectsType1EClass, SPECOBJECTSType1.class, "SPECOBJECTSType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECOBJECTSType1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPECOBJECTSType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECOBJECTSType1_SPECOBJECTREF(), this.getSPECOBJECT(), null, "sPECOBJECTREF", null, 0, -1, SPECOBJECTSType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(specobjectsType2EClass, SPECOBJECTSType2.class, "SPECOBJECTSType2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECOBJECTSType2_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPECOBJECTSType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECOBJECTSType2_SPECOBJECTREF(), this.getSPECOBJECT(), null, "sPECOBJECTREF", null, 0, -1, SPECOBJECTSType2.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(specrelationEClass, org.eclipse.rmf.rif11.xsd.SPECRELATION.class, "SPECRELATION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECRELATION_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.SPECRELATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECRELATION_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.SPECRELATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECRELATION_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.SPECRELATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECRELATION_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.SPECRELATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECRELATION_TYPE(), this.getTYPEType5(), null, "tYPE", null, 1, 1, org.eclipse.rmf.rif11.xsd.SPECRELATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECRELATION_VALUES(), this.getVALUESType3(), null, "vALUES", null, 0, 1, org.eclipse.rmf.rif11.xsd.SPECRELATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECRELATION_SOURCE(), this.getSOURCEType(), null, "sOURCE", null, 1, 1, org.eclipse.rmf.rif11.xsd.SPECRELATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECRELATION_TARGET(), this.getTARGETType(), null, "tARGET", null, 1, 1, org.eclipse.rmf.rif11.xsd.SPECRELATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specrelationsTypeEClass, SPECRELATIONSType.class, "SPECRELATIONSType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECRELATIONSType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPECRELATIONSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECRELATIONSType_SPECRELATIONREF(), this.getSPECRELATION(), null, "sPECRELATIONREF", null, 0, -1, SPECRELATIONSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(specrelationsType1EClass, SPECRELATIONSType1.class, "SPECRELATIONSType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECRELATIONSType1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPECRELATIONSType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECRELATIONSType1_SPECRELATION(), this.getSPECRELATION(), null, "sPECRELATION", null, 0, -1, SPECRELATIONSType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(specrelationsType2EClass, SPECRELATIONSType2.class, "SPECRELATIONSType2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECRELATIONSType2_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPECRELATIONSType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECRELATIONSType2_SPECRELATIONREF(), this.getSPECRELATION(), null, "sPECRELATIONREF", null, 0, -1, SPECRELATIONSType2.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(spectypeEClass, org.eclipse.rmf.rif11.xsd.SPECTYPE.class, "SPECTYPE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECTYPE_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.rif11.xsd.SPECTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECTYPE_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.rif11.xsd.SPECTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECTYPE_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.rif11.xsd.SPECTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECTYPE_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.rif11.xsd.SPECTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECTYPE_SPECATTRIBUTES(), this.getSPECATTRIBUTESType(), null, "sPECATTRIBUTES", null, 0, 1, org.eclipse.rmf.rif11.xsd.SPECTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spectypesTypeEClass, SPECTYPESType.class, "SPECTYPESType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECTYPESType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPECTYPESType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECTYPESType_SPECTYPE(), this.getSPECTYPE(), null, "sPECTYPE", null, 0, -1, SPECTYPESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(spectypesType1EClass, SPECTYPESType1.class, "SPECTYPESType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECTYPESType1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPECTYPESType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECTYPESType1_SPECTYPEREF(), this.getSPECTYPE(), null, "sPECTYPEREF", null, 0, -1, SPECTYPESType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(targetgroupTypeEClass, TARGETGROUPType.class, "TARGETGROUPType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTARGETGROUPType_SPECGROUPREF(), this.getSPECGROUP(), null, "sPECGROUPREF", null, 0, 1, TARGETGROUPType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetTypeEClass, TARGETType.class, "TARGETType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTARGETType_SPECOBJECTREF(), this.getSPECOBJECT(), null, "sPECOBJECTREF", null, 0, 1, TARGETType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeTypeEClass, TYPEType.class, "TYPEType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTYPEType_SPECTYPEREF(), this.getSPECTYPE(), null, "sPECTYPEREF", null, 0, 1, TYPEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeType1EClass, TYPEType1.class, "TYPEType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTYPEType1_SPECTYPEREF(), this.getSPECTYPE(), null, "sPECTYPEREF", null, 0, 1, TYPEType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeType2EClass, TYPEType2.class, "TYPEType2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTYPEType2_SPECTYPEREF(), this.getSPECTYPE(), null, "sPECTYPEREF", null, 0, 1, TYPEType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeType3EClass, TYPEType3.class, "TYPEType3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTYPEType3_DATATYPEDEFINITIONBOOLEANREF(), this.getDATATYPEDEFINITIONBOOLEAN(), null, "dATATYPEDEFINITIONBOOLEANREF", null, 0, 1, TYPEType3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTYPEType3_DATATYPEDEFINITIONDATEREF(), this.getDATATYPEDEFINITIONDATE(), null, "dATATYPEDEFINITIONDATEREF", null, 0, 1, TYPEType3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTYPEType3_DATATYPEDEFINITIONINTEGERREF(), this.getDATATYPEDEFINITIONINTEGER(), null, "dATATYPEDEFINITIONINTEGERREF", null, 0, 1, TYPEType3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTYPEType3_DATATYPEDEFINITIONREALREF(), this.getDATATYPEDEFINITIONREAL(), null, "dATATYPEDEFINITIONREALREF", null, 0, 1, TYPEType3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTYPEType3_DATATYPEDEFINITIONSTRINGREF(), this.getDATATYPEDEFINITIONSTRING(), null, "dATATYPEDEFINITIONSTRINGREF", null, 0, 1, TYPEType3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeType4EClass, TYPEType4.class, "TYPEType4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTYPEType4_DATATYPEDEFINITIONENUMERATIONREF(), this.getDATATYPEDEFINITIONENUMERATION(), null, "dATATYPEDEFINITIONENUMERATIONREF", null, 0, 1, TYPEType4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeType5EClass, TYPEType5.class, "TYPEType5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTYPEType5_SPECTYPEREF(), this.getSPECTYPE(), null, "sPECTYPEREF", null, 0, 1, TYPEType5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeType6EClass, TYPEType6.class, "TYPEType6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTYPEType6_DATATYPEDEFINITIONBINARYFILEREF(), this.getDATATYPEDEFINITIONBINARYFILE(), null, "dATATYPEDEFINITIONBINARYFILEREF", null, 0, 1, TYPEType6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTYPEType6_DATATYPEDEFINITIONDOCUMENTREF(), this.getDATATYPEDEFINITIONDOCUMENT(), null, "dATATYPEDEFINITIONDOCUMENTREF", null, 0, 1, TYPEType6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTYPEType6_DATATYPEDEFINITIONXMLDATAREF(), this.getDATATYPEDEFINITIONXMLDATA(), null, "dATATYPEDEFINITIONXMLDATAREF", null, 0, 1, TYPEType6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valuesTypeEClass, VALUESType.class, "VALUESType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVALUESType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, VALUESType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType_ATTRIBUTEVALUEEMBEDDEDDOCUMENT(), this.getATTRIBUTEVALUEEMBEDDEDDOCUMENT(), null, "aTTRIBUTEVALUEEMBEDDEDDOCUMENT", null, 0, -1, VALUESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType_ATTRIBUTEVALUEEMBEDDEDFILE(), this.getATTRIBUTEVALUEEMBEDDEDFILE(), null, "aTTRIBUTEVALUEEMBEDDEDFILE", null, 0, -1, VALUESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType_ATTRIBUTEVALUEENUMERATION(), this.getATTRIBUTEVALUEENUMERATION(), null, "aTTRIBUTEVALUEENUMERATION", null, 0, -1, VALUESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType_ATTRIBUTEVALUEFILEREFERENCE(), this.getATTRIBUTEVALUEFILEREFERENCE(), null, "aTTRIBUTEVALUEFILEREFERENCE", null, 0, -1, VALUESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType_ATTRIBUTEVALUESIMPLE(), this.getATTRIBUTEVALUESIMPLE(), null, "aTTRIBUTEVALUESIMPLE", null, 0, -1, VALUESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType_ATTRIBUTEVALUEXMLDATA(), this.getATTRIBUTEVALUEXMLDATA(), null, "aTTRIBUTEVALUEXMLDATA", null, 0, -1, VALUESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(valuesType1EClass, VALUESType1.class, "VALUESType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVALUESType1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, VALUESType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType1_ATTRIBUTEVALUEEMBEDDEDDOCUMENT(), this.getATTRIBUTEVALUEEMBEDDEDDOCUMENT(), null, "aTTRIBUTEVALUEEMBEDDEDDOCUMENT", null, 0, -1, VALUESType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType1_ATTRIBUTEVALUEEMBEDDEDFILE(), this.getATTRIBUTEVALUEEMBEDDEDFILE(), null, "aTTRIBUTEVALUEEMBEDDEDFILE", null, 0, -1, VALUESType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType1_ATTRIBUTEVALUEENUMERATION(), this.getATTRIBUTEVALUEENUMERATION(), null, "aTTRIBUTEVALUEENUMERATION", null, 0, -1, VALUESType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType1_ATTRIBUTEVALUEFILEREFERENCE(), this.getATTRIBUTEVALUEFILEREFERENCE(), null, "aTTRIBUTEVALUEFILEREFERENCE", null, 0, -1, VALUESType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType1_ATTRIBUTEVALUESIMPLE(), this.getATTRIBUTEVALUESIMPLE(), null, "aTTRIBUTEVALUESIMPLE", null, 0, -1, VALUESType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType1_ATTRIBUTEVALUEXMLDATA(), this.getATTRIBUTEVALUEXMLDATA(), null, "aTTRIBUTEVALUEXMLDATA", null, 0, -1, VALUESType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(valuesType2EClass, VALUESType2.class, "VALUESType2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVALUESType2_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, VALUESType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType2_ATTRIBUTEVALUEEMBEDDEDDOCUMENT(), this.getATTRIBUTEVALUEEMBEDDEDDOCUMENT(), null, "aTTRIBUTEVALUEEMBEDDEDDOCUMENT", null, 0, -1, VALUESType2.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType2_ATTRIBUTEVALUEEMBEDDEDFILE(), this.getATTRIBUTEVALUEEMBEDDEDFILE(), null, "aTTRIBUTEVALUEEMBEDDEDFILE", null, 0, -1, VALUESType2.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType2_ATTRIBUTEVALUEENUMERATION(), this.getATTRIBUTEVALUEENUMERATION(), null, "aTTRIBUTEVALUEENUMERATION", null, 0, -1, VALUESType2.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType2_ATTRIBUTEVALUEFILEREFERENCE(), this.getATTRIBUTEVALUEFILEREFERENCE(), null, "aTTRIBUTEVALUEFILEREFERENCE", null, 0, -1, VALUESType2.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType2_ATTRIBUTEVALUESIMPLE(), this.getATTRIBUTEVALUESIMPLE(), null, "aTTRIBUTEVALUESIMPLE", null, 0, -1, VALUESType2.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType2_ATTRIBUTEVALUEXMLDATA(), this.getATTRIBUTEVALUEXMLDATA(), null, "aTTRIBUTEVALUEXMLDATA", null, 0, -1, VALUESType2.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(valuesType3EClass, VALUESType3.class, "VALUESType3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVALUESType3_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, VALUESType3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType3_ATTRIBUTEVALUEEMBEDDEDDOCUMENT(), this.getATTRIBUTEVALUEEMBEDDEDDOCUMENT(), null, "aTTRIBUTEVALUEEMBEDDEDDOCUMENT", null, 0, -1, VALUESType3.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType3_ATTRIBUTEVALUEEMBEDDEDFILE(), this.getATTRIBUTEVALUEEMBEDDEDFILE(), null, "aTTRIBUTEVALUEEMBEDDEDFILE", null, 0, -1, VALUESType3.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType3_ATTRIBUTEVALUEENUMERATION(), this.getATTRIBUTEVALUEENUMERATION(), null, "aTTRIBUTEVALUEENUMERATION", null, 0, -1, VALUESType3.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType3_ATTRIBUTEVALUEFILEREFERENCE(), this.getATTRIBUTEVALUEFILEREFERENCE(), null, "aTTRIBUTEVALUEFILEREFERENCE", null, 0, -1, VALUESType3.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType3_ATTRIBUTEVALUESIMPLE(), this.getATTRIBUTEVALUESIMPLE(), null, "aTTRIBUTEVALUESIMPLE", null, 0, -1, VALUESType3.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType3_ATTRIBUTEVALUEXMLDATA(), this.getATTRIBUTEVALUEXMLDATA(), null, "aTTRIBUTEVALUEXMLDATA", null, 0, -1, VALUESType3.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(valuesType4EClass, VALUESType4.class, "VALUESType4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVALUESType4_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, VALUESType4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType4_ENUMVALUEREF(), this.getENUMVALUE(), null, "eNUMVALUEREF", null, 0, -1, VALUESType4.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(xhtmlcontentEClass, org.eclipse.rmf.rif11.xsd.XHTMLCONTENT.class, "XHTMLCONTENT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXHTMLCONTENT_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, 1, org.eclipse.rmf.rif11.xsd.XHTMLCONTENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlcontentEClass, org.eclipse.rmf.rif11.xsd.XMLCONTENT.class, "XMLCONTENT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMLCONTENT_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 1, 1, org.eclipse.rmf.rif11.xsd.XMLCONTENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(accesspolicyaccessmodeenumEEnum, org.eclipse.rmf.rif11.xsd.ACCESSPOLICYACCESSMODEENUM.class, "ACCESSPOLICYACCESSMODEENUM");
		addEEnumLiteral(accesspolicyaccessmodeenumEEnum, org.eclipse.rmf.rif11.xsd.ACCESSPOLICYACCESSMODEENUM.EDIT);
		addEEnumLiteral(accesspolicyaccessmodeenumEEnum, org.eclipse.rmf.rif11.xsd.ACCESSPOLICYACCESSMODEENUM.DELETE);
		addEEnumLiteral(accesspolicyaccessmodeenumEEnum, org.eclipse.rmf.rif11.xsd.ACCESSPOLICYACCESSMODEENUM.CREATE);

		initEEnum(datatypedefinitiondateformatenumEEnum, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATEFORMATENUM.class, "DATATYPEDEFINITIONDATEFORMATENUM");
		addEEnumLiteral(datatypedefinitiondateformatenumEEnum, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATEFORMATENUM.W3C);
		addEEnumLiteral(datatypedefinitiondateformatenumEEnum, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATEFORMATENUM.CUSTOM);

		// Initialize data types
		initEDataType(accesspolicyaccessmodeenumObjectEDataType, org.eclipse.rmf.rif11.xsd.ACCESSPOLICYACCESSMODEENUM.class, "ACCESSPOLICYACCESSMODEENUMObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(datatypedefinitiondateformatenumObjectEDataType, org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATEFORMATENUM.class, "DATATYPEDEFINITIONDATEFORMATENUMObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(refEDataType, String.class, "REF", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (accesspoliciesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ACCESS-POLICIES_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getACCESSPOLICIESType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getACCESSPOLICIESType_ACCESSPOLICY(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ACCESS-POLICY",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (accesspolicyEClass, 
		   source, 
		   new String[] {
			 "name", "ACCESS-POLICY",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getACCESSPOLICY_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getACCESSPOLICY_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getACCESSPOLICY_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getACCESSPOLICY_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getACCESSPOLICY_ACCESSMODE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ACCESS-MODE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getACCESSPOLICY_ATTRIBUTEDEFINITIONS(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITIONS",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getACCESSPOLICY_ATTRIBUTEVALUES(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUES",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getACCESSPOLICY_DATATYPEDEFINITIONS(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITIONS",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getACCESSPOLICY_RELATIONGROUPS(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RELATION-GROUPS",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getACCESSPOLICY_SPECGROUPS(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-GROUPS",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getACCESSPOLICY_SPECHIERARCHIES(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-HIERARCHIES",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getACCESSPOLICY_SPECHIERARCHYROOTS(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-HIERARCHY-ROOTS",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getACCESSPOLICY_SPECOBJECTS(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-OBJECTS",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getACCESSPOLICY_SPECRELATIONS(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-RELATIONS",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getACCESSPOLICY_SPECTYPES(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-TYPES",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (accesspolicyaccessmodeenumEEnum, 
		   source, 
		   new String[] {
			 "name", "ACCESS-POLICY-ACCESS-MODE-ENUM"
		   });		
		addAnnotation
		  (accesspolicyaccessmodeenumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ACCESS-POLICY-ACCESS-MODE-ENUM:Object",
			 "baseType", "ACCESS-POLICY-ACCESS-MODE-ENUM"
		   });			
		addAnnotation
		  (attributedefinitioncomplexEClass, 
		   source, 
		   new String[] {
			 "name", "ATTRIBUTE-DEFINITION-COMPLEX",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONCOMPLEX_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONCOMPLEX_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONCOMPLEX_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONCOMPLEX_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONCOMPLEX_DEFAULTVALUE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DEFAULT-VALUE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONCOMPLEX_TYPE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TYPE",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (attributedefinitionenumerationEClass, 
		   source, 
		   new String[] {
			 "name", "ATTRIBUTE-DEFINITION-ENUMERATION",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONENUMERATION_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONENUMERATION_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONENUMERATION_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONENUMERATION_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONENUMERATION_DEFAULTVALUE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DEFAULT-VALUE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONENUMERATION_MULTIVALUED(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MULTI-VALUED",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONENUMERATION_TYPE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TYPE",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (attributedefinitionsimpleEClass, 
		   source, 
		   new String[] {
			 "name", "ATTRIBUTE-DEFINITION-SIMPLE",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONSIMPLE_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONSIMPLE_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONSIMPLE_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONSIMPLE_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONSIMPLE_DEFAULTVALUE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DEFAULT-VALUE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONSIMPLE_TYPE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TYPE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (attributedefinitionsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ATTRIBUTE-DEFINITIONS_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONSType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONSType_ATTRIBUTEDEFINITIONCOMPLEXREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-COMPLEX-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONSType_ATTRIBUTEDEFINITIONENUMERATIONREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-ENUMERATION-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONSType_ATTRIBUTEDEFINITIONSIMPLEREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-SIMPLE-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (attributevalueembeddeddocumentEClass, 
		   source, 
		   new String[] {
			 "name", "ATTRIBUTE-VALUE-EMBEDDED-DOCUMENT",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEEMBEDDEDDOCUMENT_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEEMBEDDEDDOCUMENT_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEEMBEDDEDDOCUMENT_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEEMBEDDEDDOCUMENT_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEEMBEDDEDDOCUMENT_DEFINITION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DEFINITION",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEEMBEDDEDDOCUMENT_XHTMLCONTENT(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "XHTML-CONTENT",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (attributevalueembeddedfileEClass, 
		   source, 
		   new String[] {
			 "name", "ATTRIBUTE-VALUE-EMBEDDED-FILE",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEEMBEDDEDFILE_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEEMBEDDEDFILE_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEEMBEDDEDFILE_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEEMBEDDEDFILE_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEEMBEDDEDFILE_BINARYCONTENT(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BINARY-CONTENT",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEEMBEDDEDFILE_DEFINITION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DEFINITION",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (attributevalueenumerationEClass, 
		   source, 
		   new String[] {
			 "name", "ATTRIBUTE-VALUE-ENUMERATION",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEENUMERATION_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEENUMERATION_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEENUMERATION_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEENUMERATION_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEENUMERATION_DEFINITION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DEFINITION",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEENUMERATION_VALUES(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "VALUES",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (attributevaluefilereferenceEClass, 
		   source, 
		   new String[] {
			 "name", "ATTRIBUTE-VALUE-FILE-REFERENCE",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEFILEREFERENCE_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEFILEREFERENCE_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEFILEREFERENCE_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEFILEREFERENCE_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEFILEREFERENCE_DEFINITION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DEFINITION",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEFILEREFERENCE_PATHTOFILE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PATH-TO-FILE",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (attributevaluesimpleEClass, 
		   source, 
		   new String[] {
			 "name", "ATTRIBUTE-VALUE-SIMPLE",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUESIMPLE_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUESIMPLE_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUESIMPLE_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUESIMPLE_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUESIMPLE_DEFINITION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DEFINITION",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUESIMPLE_THEVALUE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "THE-VALUE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (attributevaluesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ATTRIBUTE-VALUES_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUESType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUESType_ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-EMBEDDED-DOCUMENT-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUESType_ATTRIBUTEVALUEEMBEDDEDFILEREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-EMBEDDED-FILE-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUESType_ATTRIBUTEVALUEENUMERATIONREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-ENUMERATION-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUESType_ATTRIBUTEVALUEFILEREFERENCEREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-FILE-REFERENCE-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUESType_ATTRIBUTEVALUESIMPLEREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-SIMPLE-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUESType_ATTRIBUTEVALUEXMLDATAREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-XML-DATA-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (attributevaluexmldataEClass, 
		   source, 
		   new String[] {
			 "name", "ATTRIBUTE-VALUE-XML-DATA",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEXMLDATA_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEXMLDATA_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEXMLDATA_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEXMLDATA_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEXMLDATA_DEFINITION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DEFINITION",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEXMLDATA_XMLCONTENT(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "XML-CONTENT",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (binarycontentEClass, 
		   source, 
		   new String[] {
			 "name", "BINARY-CONTENT",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getBINARYCONTENT_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (childrenTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CHILDREN_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCHILDRENType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getCHILDRENType_SPECHIERARCHY(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-HIERARCHY",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (childrenType1EClass, 
		   source, 
		   new String[] {
			 "name", "CHILDREN_._1_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCHILDRENType1_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getCHILDRENType1_SPECHIERARCHY(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-HIERARCHY",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (datatypedefinitionbinaryfileEClass, 
		   source, 
		   new String[] {
			 "name", "DATATYPE-DEFINITION-BINARY-FILE",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONBINARYFILE_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONBINARYFILE_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONBINARYFILE_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONBINARYFILE_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONBINARYFILE_EMBEDDED(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EMBEDDED",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONBINARYFILE_APPLICATION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "APPLICATION",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONBINARYFILE_FILENAMESUFFIX(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FILENAME-SUFFIX",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONBINARYFILE_FORMATNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FORMAT-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONBINARYFILE_MIMETYPE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MIME-TYPE",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (datatypedefinitionbooleanEClass, 
		   source, 
		   new String[] {
			 "name", "DATATYPE-DEFINITION-BOOLEAN",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONBOOLEAN_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONBOOLEAN_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONBOOLEAN_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONBOOLEAN_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (datatypedefinitiondateEClass, 
		   source, 
		   new String[] {
			 "name", "DATATYPE-DEFINITION-DATE",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONDATE_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONDATE_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONDATE_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONDATE_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONDATE_FORMAT(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FORMAT",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (datatypedefinitiondateformatenumEEnum, 
		   source, 
		   new String[] {
			 "name", "DATATYPE-DEFINITION-DATE-FORMAT-ENUM"
		   });		
		addAnnotation
		  (datatypedefinitiondateformatenumObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "DATATYPE-DEFINITION-DATE-FORMAT-ENUM:Object",
			 "baseType", "DATATYPE-DEFINITION-DATE-FORMAT-ENUM"
		   });		
		addAnnotation
		  (datatypedefinitiondocumentEClass, 
		   source, 
		   new String[] {
			 "name", "DATATYPE-DEFINITION-DOCUMENT",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONDOCUMENT_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONDOCUMENT_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONDOCUMENT_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONDOCUMENT_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONDOCUMENT_EMBEDDED(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EMBEDDED",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (datatypedefinitionenumerationEClass, 
		   source, 
		   new String[] {
			 "name", "DATATYPE-DEFINITION-ENUMERATION",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONENUMERATION_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONENUMERATION_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONENUMERATION_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONENUMERATION_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONENUMERATION_SPECIFIEDVALUES(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPECIFIED-VALUES",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (datatypedefinitionintegerEClass, 
		   source, 
		   new String[] {
			 "name", "DATATYPE-DEFINITION-INTEGER",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONINTEGER_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONINTEGER_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONINTEGER_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONINTEGER_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONINTEGER_MAX(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MAX",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONINTEGER_MIN(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MIN",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (datatypedefinitionrealEClass, 
		   source, 
		   new String[] {
			 "name", "DATATYPE-DEFINITION-REAL",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONREAL_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONREAL_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONREAL_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONREAL_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONREAL_ACCURACY(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ACCURACY",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONREAL_MAX(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MAX",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONREAL_MIN(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MIN",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (datatypedefinitionstringEClass, 
		   source, 
		   new String[] {
			 "name", "DATATYPE-DEFINITION-STRING",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONSTRING_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONSTRING_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONSTRING_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONSTRING_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONSTRING_MAXLENGTH(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MAX-LENGTH",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (datatypedefinitionsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DATATYPE-DEFINITIONS_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONSType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONBINARYFILEREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-BINARY-FILE-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONBOOLEANREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-BOOLEAN-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONDATEREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-DATE-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONDOCUMENTREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-DOCUMENT-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONENUMERATIONREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-ENUMERATION-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONINTEGERREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-INTEGER-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONREALREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-REAL-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONSTRINGREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-STRING-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONXMLDATAREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-XML-DATA-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (datatypedefinitionxmldataEClass, 
		   source, 
		   new String[] {
			 "name", "DATATYPE-DEFINITION-XML-DATA",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONXMLDATA_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONXMLDATA_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONXMLDATA_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONXMLDATA_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONXMLDATA_EMBEDDED(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EMBEDDED",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONXMLDATA_NAMESPACEURI(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "NAME-SPACE-URI",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONXMLDATA_SCHEMALOCATION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SCHEMA-LOCATION",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (datatypesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DATATYPES_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDATATYPESType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getDATATYPESType_DATATYPEDEFINITIONBINARYFILE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-BINARY-FILE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDATATYPESType_DATATYPEDEFINITIONBOOLEAN(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-BOOLEAN",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDATATYPESType_DATATYPEDEFINITIONDATE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-DATE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDATATYPESType_DATATYPEDEFINITIONDOCUMENT(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-DOCUMENT",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDATATYPESType_DATATYPEDEFINITIONENUMERATION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-ENUMERATION",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDATATYPESType_DATATYPEDEFINITIONINTEGER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-INTEGER",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDATATYPESType_DATATYPEDEFINITIONREAL(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-REAL",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDATATYPESType_DATATYPEDEFINITIONSTRING(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-STRING",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDATATYPESType_DATATYPEDEFINITIONXMLDATA(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-XML-DATA",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (defaultvalueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DEFAULT-VALUE_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDEFAULTVALUEType_ATTRIBUTEVALUESIMPLE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-SIMPLE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (defaultvalueType1EClass, 
		   source, 
		   new String[] {
			 "name", "DEFAULT-VALUE_._1_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDEFAULTVALUEType1_ATTRIBUTEVALUEENUMERATION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-ENUMERATION",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (defaultvalueType2EClass, 
		   source, 
		   new String[] {
			 "name", "DEFAULT-VALUE_._2_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDEFAULTVALUEType2_ATTRIBUTEVALUEEMBEDDEDDOCUMENT(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-EMBEDDED-DOCUMENT",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDEFAULTVALUEType2_ATTRIBUTEVALUEEMBEDDEDFILE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-EMBEDDED-FILE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDEFAULTVALUEType2_ATTRIBUTEVALUEFILEREFERENCE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-FILE-REFERENCE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDEFAULTVALUEType2_ATTRIBUTEVALUEXMLDATA(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-XML-DATA",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (definitionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DEFINITION_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDEFINITIONType_ATTRIBUTEDEFINITIONCOMPLEXREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-COMPLEX-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (definitionType1EClass, 
		   source, 
		   new String[] {
			 "name", "DEFINITION_._1_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDEFINITIONType1_ATTRIBUTEDEFINITIONCOMPLEXREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-COMPLEX-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (definitionType2EClass, 
		   source, 
		   new String[] {
			 "name", "DEFINITION_._2_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDEFINITIONType2_ATTRIBUTEDEFINITIONSIMPLEREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-SIMPLE-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (definitionType3EClass, 
		   source, 
		   new String[] {
			 "name", "DEFINITION_._3_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDEFINITIONType3_ATTRIBUTEDEFINITIONENUMERATIONREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-ENUMERATION-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (definitionType4EClass, 
		   source, 
		   new String[] {
			 "name", "DEFINITION_._4_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDEFINITIONType4_ATTRIBUTEDEFINITIONCOMPLEXREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-COMPLEX-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (definitionType5EClass, 
		   source, 
		   new String[] {
			 "name", "DEFINITION_._5_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDEFINITIONType5_ATTRIBUTEDEFINITIONCOMPLEXREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-COMPLEX-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });			
		addAnnotation
		  (getDocumentRoot_RIF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RIF",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (embeddedvalueEClass, 
		   source, 
		   new String[] {
			 "name", "EMBEDDED-VALUE",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEMBEDDEDVALUE_KEY(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "KEY",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEMBEDDEDVALUE_OTHERCONTENT(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OTHER-CONTENT",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (enumvalueEClass, 
		   source, 
		   new String[] {
			 "name", "ENUM-VALUE",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getENUMVALUE_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getENUMVALUE_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getENUMVALUE_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getENUMVALUE_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getENUMVALUE_PROPERTIES(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PROPERTIES",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (objectTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OBJECT_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOBJECTType_SPECOBJECTREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-OBJECT-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (propertiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PROPERTIES_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPROPERTIESType_EMBEDDEDVALUE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EMBEDDED-VALUE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (refEDataType, 
		   source, 
		   new String[] {
			 "name", "REF",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#IDREF"
		   });			
		addAnnotation
		  (relationgroupEClass, 
		   source, 
		   new String[] {
			 "name", "RELATION-GROUP",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRELATIONGROUP_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRELATIONGROUP_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRELATIONGROUP_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRELATIONGROUP_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRELATIONGROUP_RELATIONTYPE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RELATION-TYPE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRELATIONGROUP_SPECRELATIONS(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-RELATIONS",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRELATIONGROUP_TARGETGROUP(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TARGET-GROUP",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (relationgroupsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RELATION-GROUPS_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRELATIONGROUPSType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getRELATIONGROUPSType_RELATIONGROUP(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RELATION-GROUP",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (relationgroupsType1EClass, 
		   source, 
		   new String[] {
			 "name", "RELATION-GROUPS_._1_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRELATIONGROUPSType1_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getRELATIONGROUPSType1_RELATIONGROUPREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RELATION-GROUP-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (relationtypeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "RELATION-TYPE_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRELATIONTYPEType_SPECTYPEREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-TYPE-REF",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (rifEClass, 
		   source, 
		   new String[] {
			 "name", "RIF",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRIF_AUTHOR(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AUTHOR",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRIF_COMMENT(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "COMMENT",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRIF_COUNTRYCODE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "COUNTRY-CODE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRIF_CREATIONTIME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CREATION-TIME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRIF_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRIF_SOURCETOOLID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SOURCE-TOOL-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRIF_TITLE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TITLE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRIF_VERSION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "VERSION",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRIF_ACCESSPOLICIES(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ACCESS-POLICIES",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRIF_DATATYPES(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPES",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRIF_SPECTYPES(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-TYPES",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRIF_SPECOBJECTS(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-OBJECTS",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRIF_SPECRELATIONS(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-RELATIONS",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRIF_SPECGROUPS(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-GROUPS",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRIF_SPECHIERARCHYROOTS(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-HIERARCHY-ROOTS",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (sourceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SOURCE_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSOURCEType_SPECOBJECTREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-OBJECT-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (specattributesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-ATTRIBUTES_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONCOMPLEX(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-COMPLEX",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONENUMERATION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-ENUMERATION",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONSIMPLE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-SIMPLE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (specgroupEClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-GROUP",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECGROUP_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECGROUP_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECGROUP_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECGROUP_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECGROUP_TYPE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TYPE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECGROUP_VALUES(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "VALUES",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECGROUP_RELATIONGROUPS(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RELATION-GROUPS",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECGROUP_SPECOBJECTS(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-OBJECTS",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (specgroupsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-GROUPS_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECGROUPSType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPECGROUPSType_SPECGROUP(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-GROUP",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (specgroupsType1EClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-GROUPS_._1_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECGROUPSType1_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPECGROUPSType1_SPECGROUPREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-GROUP-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (spechierarchiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-HIERARCHIES_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECHIERARCHIESType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPECHIERARCHIESType_SPECHIERARCHYREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-HIERARCHY-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (spechierarchyEClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-HIERARCHY",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECHIERARCHY_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECHIERARCHY_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECHIERARCHY_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECHIERARCHY_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECHIERARCHY_CHILDREN(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CHILDREN",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECHIERARCHY_OBJECT(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OBJECT",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (spechierarchyrootEClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-HIERARCHY-ROOT",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECHIERARCHYROOT_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECHIERARCHYROOT_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECHIERARCHYROOT_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECHIERARCHYROOT_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECHIERARCHYROOT_TYPE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TYPE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECHIERARCHYROOT_VALUES(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "VALUES",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECHIERARCHYROOT_CHILDREN(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CHILDREN",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (spechierarchyrootsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-HIERARCHY-ROOTS_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECHIERARCHYROOTSType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPECHIERARCHYROOTSType_SPECHIERARCHYROOT(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-HIERARCHY-ROOT",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (spechierarchyrootsType1EClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-HIERARCHY-ROOTS_._1_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECHIERARCHYROOTSType1_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPECHIERARCHYROOTSType1_SPECHIERARCHYROOTREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-HIERARCHY-ROOT-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (specifiedvaluesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SPECIFIED-VALUES_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECIFIEDVALUESType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPECIFIEDVALUESType_ENUMVALUE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ENUM-VALUE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (specobjectEClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-OBJECT",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECOBJECT_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECOBJECT_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECOBJECT_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECOBJECT_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECOBJECT_TYPE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TYPE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECOBJECT_VALUES(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "VALUES",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (specobjectsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-OBJECTS_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECOBJECTSType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPECOBJECTSType_SPECOBJECT(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-OBJECT",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (specobjectsType1EClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-OBJECTS_._1_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECOBJECTSType1_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPECOBJECTSType1_SPECOBJECTREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-OBJECT-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (specobjectsType2EClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-OBJECTS_._2_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECOBJECTSType2_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPECOBJECTSType2_SPECOBJECTREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-OBJECT-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (specrelationEClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-RELATION",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECRELATION_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECRELATION_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECRELATION_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECRELATION_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECRELATION_TYPE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TYPE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECRELATION_VALUES(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "VALUES",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECRELATION_SOURCE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SOURCE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECRELATION_TARGET(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TARGET",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (specrelationsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-RELATIONS_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECRELATIONSType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPECRELATIONSType_SPECRELATIONREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-RELATION-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (specrelationsType1EClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-RELATIONS_._1_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECRELATIONSType1_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPECRELATIONSType1_SPECRELATION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-RELATION",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (specrelationsType2EClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-RELATIONS_._2_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECRELATIONSType2_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPECRELATIONSType2_SPECRELATIONREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-RELATION-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (spectypeEClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-TYPE",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECTYPE_DESC(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DESC",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECTYPE_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECTYPE_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LAST-CHANGE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECTYPE_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "LONG-NAME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECTYPE_SPECATTRIBUTES(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-ATTRIBUTES",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (spectypesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-TYPES_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECTYPESType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPECTYPESType_SPECTYPE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-TYPE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (spectypesType1EClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-TYPES_._1_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECTYPESType1_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPECTYPESType1_SPECTYPEREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-TYPE-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (targetgroupTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TARGET-GROUP_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTARGETGROUPType_SPECGROUPREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-GROUP-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (targetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TARGET_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTARGETType_SPECOBJECTREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-OBJECT-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (typeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TYPE_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTYPEType_SPECTYPEREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-TYPE-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (typeType1EClass, 
		   source, 
		   new String[] {
			 "name", "TYPE_._1_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTYPEType1_SPECTYPEREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-TYPE-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (typeType2EClass, 
		   source, 
		   new String[] {
			 "name", "TYPE_._2_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTYPEType2_SPECTYPEREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-TYPE-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (typeType3EClass, 
		   source, 
		   new String[] {
			 "name", "TYPE_._3_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTYPEType3_DATATYPEDEFINITIONBOOLEANREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-BOOLEAN-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTYPEType3_DATATYPEDEFINITIONDATEREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-DATE-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTYPEType3_DATATYPEDEFINITIONINTEGERREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-INTEGER-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTYPEType3_DATATYPEDEFINITIONREALREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-REAL-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTYPEType3_DATATYPEDEFINITIONSTRINGREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-STRING-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (typeType4EClass, 
		   source, 
		   new String[] {
			 "name", "TYPE_._4_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTYPEType4_DATATYPEDEFINITIONENUMERATIONREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-ENUMERATION-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (typeType5EClass, 
		   source, 
		   new String[] {
			 "name", "TYPE_._5_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTYPEType5_SPECTYPEREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-TYPE-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (typeType6EClass, 
		   source, 
		   new String[] {
			 "name", "TYPE_._6_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTYPEType6_DATATYPEDEFINITIONBINARYFILEREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-BINARY-FILE-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTYPEType6_DATATYPEDEFINITIONDOCUMENTREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-DOCUMENT-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTYPEType6_DATATYPEDEFINITIONXMLDATAREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-XML-DATA-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (valuesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "VALUES_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getVALUESType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getVALUESType_ATTRIBUTEVALUEEMBEDDEDDOCUMENT(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-EMBEDDED-DOCUMENT",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType_ATTRIBUTEVALUEEMBEDDEDFILE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-EMBEDDED-FILE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType_ATTRIBUTEVALUEENUMERATION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-ENUMERATION",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType_ATTRIBUTEVALUEFILEREFERENCE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-FILE-REFERENCE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType_ATTRIBUTEVALUESIMPLE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-SIMPLE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType_ATTRIBUTEVALUEXMLDATA(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-XML-DATA",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (valuesType1EClass, 
		   source, 
		   new String[] {
			 "name", "VALUES_._1_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getVALUESType1_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getVALUESType1_ATTRIBUTEVALUEEMBEDDEDDOCUMENT(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-EMBEDDED-DOCUMENT",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType1_ATTRIBUTEVALUEEMBEDDEDFILE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-EMBEDDED-FILE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType1_ATTRIBUTEVALUEENUMERATION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-ENUMERATION",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType1_ATTRIBUTEVALUEFILEREFERENCE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-FILE-REFERENCE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType1_ATTRIBUTEVALUESIMPLE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-SIMPLE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType1_ATTRIBUTEVALUEXMLDATA(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-XML-DATA",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (valuesType2EClass, 
		   source, 
		   new String[] {
			 "name", "VALUES_._2_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getVALUESType2_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getVALUESType2_ATTRIBUTEVALUEEMBEDDEDDOCUMENT(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-EMBEDDED-DOCUMENT",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType2_ATTRIBUTEVALUEEMBEDDEDFILE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-EMBEDDED-FILE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType2_ATTRIBUTEVALUEENUMERATION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-ENUMERATION",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType2_ATTRIBUTEVALUEFILEREFERENCE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-FILE-REFERENCE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType2_ATTRIBUTEVALUESIMPLE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-SIMPLE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType2_ATTRIBUTEVALUEXMLDATA(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-XML-DATA",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (valuesType3EClass, 
		   source, 
		   new String[] {
			 "name", "VALUES_._3_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getVALUESType3_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getVALUESType3_ATTRIBUTEVALUEEMBEDDEDDOCUMENT(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-EMBEDDED-DOCUMENT",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType3_ATTRIBUTEVALUEEMBEDDEDFILE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-EMBEDDED-FILE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType3_ATTRIBUTEVALUEENUMERATION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-ENUMERATION",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType3_ATTRIBUTEVALUEFILEREFERENCE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-FILE-REFERENCE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType3_ATTRIBUTEVALUESIMPLE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-SIMPLE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType3_ATTRIBUTEVALUEXMLDATA(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-XML-DATA",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (valuesType4EClass, 
		   source, 
		   new String[] {
			 "name", "VALUES_._4_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getVALUESType4_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getVALUESType4_ENUMVALUEREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ENUM-VALUE-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (xhtmlcontentEClass, 
		   source, 
		   new String[] {
			 "name", "XHTML-CONTENT",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getXHTMLCONTENT_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "http://automotive-his.de/200706/rif-xhtml",
			 "name", ":0",
			 "processing", "strict"
		   });		
		addAnnotation
		  (xmlcontentEClass, 
		   source, 
		   new String[] {
			 "name", "XML-CONTENT",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getXMLCONTENT_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });
	}

} //RifPackageImpl
