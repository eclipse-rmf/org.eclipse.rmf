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

package org.eclipse.rmf.rif12.ExchangeFile.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.rmf.rif12.DataTypes.DataTypesPackage;
import org.eclipse.rmf.rif12.DataTypes.impl.DataTypesPackageImpl;
import org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.EA_AUTOSARM2_Types_PackagePackage;
import org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.impl.EA_AUTOSARM2_Types_PackagePackageImpl;
import org.eclipse.rmf.rif12.ExchangeFile.AccessPolicy;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeDefinition;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeDefinitionComplex;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeDefinitionEnumeration;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeDefinitionSimple;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeValue;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeValueComplex;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeValueEmbeddedDocument;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeValueEmbeddedFile;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeValueEnumeration;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeValueFileReference;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeValueSimple;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeValueXmlData;
import org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinition;
import org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinitionBinaryFile;
import org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinitionBoolean;
import org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinitionComplex;
import org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinitionDate;
import org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinitionDocument;
import org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinitionInteger;
import org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinitionReal;
import org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinitionSimple;
import org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinitionString;
import org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinitionXmlData;
import org.eclipse.rmf.rif12.ExchangeFile.EmbeddedValue;
import org.eclipse.rmf.rif12.ExchangeFile.EnumValue;
import org.eclipse.rmf.rif12.ExchangeFile.ExchangeFileFactory;
import org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage;
import org.eclipse.rmf.rif12.ExchangeFile.Identifiable;
import org.eclipse.rmf.rif12.ExchangeFile.RIFContent;
import org.eclipse.rmf.rif12.ExchangeFile.RIFHeader;
import org.eclipse.rmf.rif12.ExchangeFile.RIFToolExtension;
import org.eclipse.rmf.rif12.ExchangeFile.RelationGroup;
import org.eclipse.rmf.rif12.ExchangeFile.SpecElementWithUserDefinedAttributes;
import org.eclipse.rmf.rif12.ExchangeFile.SpecGroup;
import org.eclipse.rmf.rif12.ExchangeFile.SpecGroupHierarchy;
import org.eclipse.rmf.rif12.ExchangeFile.SpecGroupHierarchyRoot;
import org.eclipse.rmf.rif12.ExchangeFile.SpecHierarchy;
import org.eclipse.rmf.rif12.ExchangeFile.SpecHierarchyRoot;
import org.eclipse.rmf.rif12.ExchangeFile.SpecObject;
import org.eclipse.rmf.rif12.ExchangeFile.SpecRelation;
import org.eclipse.rmf.rif12.ExchangeFile.SpecType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExchangeFilePackageImpl extends EPackageImpl implements ExchangeFilePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specHierarchyRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specElementWithUserDefinedAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specHierarchyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specGroupHierarchyRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specGroupHierarchyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDefinitionComplexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeDefinitionComplexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueComplexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDefinitionEnumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeDefinitionEnumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass embeddedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueEnumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDefinitionSimpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeDefinitionSimpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueSimpleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueEmbeddedDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueEmbeddedFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueFileReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeValueXmlDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeDefinitionBinaryFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeDefinitionBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeDefinitionDateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeDefinitionDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeDefinitionIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeDefinitionRealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeDefinitionStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeDefinitionXmlDataEClass = null;

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
	private EClass rifHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rifContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rifToolExtensionEClass = null;

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
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExchangeFilePackageImpl() {
		super(eNS_URI, ExchangeFileFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExchangeFilePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExchangeFilePackage init() {
		if (isInited) return (ExchangeFilePackage)EPackage.Registry.INSTANCE.getEPackage(ExchangeFilePackage.eNS_URI);

		// Obtain or create and register package
		ExchangeFilePackageImpl theExchangeFilePackage = (ExchangeFilePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExchangeFilePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExchangeFilePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DataTypesPackageImpl theDataTypesPackage = (DataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) instanceof DataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) : DataTypesPackage.eINSTANCE);
		EA_AUTOSARM2_Types_PackagePackageImpl theEA_AUTOSARM2_Types_PackagePackage = (EA_AUTOSARM2_Types_PackagePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EA_AUTOSARM2_Types_PackagePackage.eNS_URI) instanceof EA_AUTOSARM2_Types_PackagePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EA_AUTOSARM2_Types_PackagePackage.eNS_URI) : EA_AUTOSARM2_Types_PackagePackage.eINSTANCE);

		// Create package meta-data objects
		theExchangeFilePackage.createPackageContents();
		theDataTypesPackage.createPackageContents();
		theEA_AUTOSARM2_Types_PackagePackage.createPackageContents();

		// Initialize created meta-data
		theExchangeFilePackage.initializePackageContents();
		theDataTypesPackage.initializePackageContents();
		theEA_AUTOSARM2_Types_PackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExchangeFilePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExchangeFilePackage.eNS_URI, theExchangeFilePackage);
		return theExchangeFilePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecHierarchyRoot() {
		return specHierarchyRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecHierarchyRoot_Children() {
		return (EReference)specHierarchyRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecElementWithUserDefinedAttributes() {
		return specElementWithUserDefinedAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecElementWithUserDefinedAttributes_Type() {
		return (EReference)specElementWithUserDefinedAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecElementWithUserDefinedAttributes_Values() {
		return (EReference)specElementWithUserDefinedAttributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiable() {
		return identifiableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_Desc() {
		return (EAttribute)identifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_Identifier() {
		return (EAttribute)identifiableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_LastChange() {
		return (EAttribute)identifiableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiable_LongName() {
		return (EAttribute)identifiableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecType() {
		return specTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecType_SpecAttributes() {
		return (EReference)specTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDefinition() {
		return attributeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValue() {
		return attributeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecHierarchy() {
		return specHierarchyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecHierarchy_Object() {
		return (EReference)specHierarchyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecHierarchy_Values() {
		return (EReference)specHierarchyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecHierarchy_Children() {
		return (EReference)specHierarchyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecObject() {
		return specObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecGroup() {
		return specGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecGroup_SpecObjects() {
		return (EReference)specGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecGroup_RelationGroups() {
		return (EReference)specGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationGroup() {
		return relationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationGroup_SpecRelations() {
		return (EReference)relationGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationGroup_RelationType() {
		return (EReference)relationGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecRelation() {
		return specRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecRelation_Target() {
		return (EReference)specRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecRelation_Source() {
		return (EReference)specRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeDefinition() {
		return datatypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessPolicy() {
		return accessPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessPolicy_AccessMode() {
		return (EAttribute)accessPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessPolicy_SpecGroupHierarchyRoots() {
		return (EReference)accessPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessPolicy_SpecGroups() {
		return (EReference)accessPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessPolicy_AttributeDefinitions() {
		return (EReference)accessPolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessPolicy_RelationGroups() {
		return (EReference)accessPolicyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessPolicy_DatatypeDefinitions() {
		return (EReference)accessPolicyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessPolicy_SpecRelations() {
		return (EReference)accessPolicyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessPolicy_AttributeValues() {
		return (EReference)accessPolicyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessPolicy_SpecTypes() {
		return (EReference)accessPolicyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessPolicy_SpecHierarchies() {
		return (EReference)accessPolicyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessPolicy_SpecObjects() {
		return (EReference)accessPolicyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccessPolicy_SpecHierarchyRoots() {
		return (EReference)accessPolicyEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecGroupHierarchyRoot() {
		return specGroupHierarchyRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecGroupHierarchyRoot_Children() {
		return (EReference)specGroupHierarchyRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecGroupHierarchy() {
		return specGroupHierarchyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecGroupHierarchy_Group() {
		return (EReference)specGroupHierarchyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDefinitionComplex() {
		return attributeDefinitionComplexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDefinitionComplex_Type() {
		return (EReference)attributeDefinitionComplexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDefinitionComplex_DefaultValue() {
		return (EReference)attributeDefinitionComplexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeDefinitionComplex() {
		return datatypeDefinitionComplexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeDefinitionComplex_Embedded() {
		return (EAttribute)datatypeDefinitionComplexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValueComplex() {
		return attributeValueComplexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDefinitionEnumeration() {
		return attributeDefinitionEnumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDefinitionEnumeration_MultiValued() {
		return (EAttribute)attributeDefinitionEnumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDefinitionEnumeration_Type() {
		return (EReference)attributeDefinitionEnumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDefinitionEnumeration_DefaultValue() {
		return (EReference)attributeDefinitionEnumerationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeDefinitionEnumeration() {
		return datatypeDefinitionEnumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatatypeDefinitionEnumeration_SpecifiedValues() {
		return (EReference)datatypeDefinitionEnumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumValue() {
		return enumValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumValue_Properties() {
		return (EReference)enumValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmbeddedValue() {
		return embeddedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbeddedValue_Key() {
		return (EAttribute)embeddedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmbeddedValue_OtherContent() {
		return (EAttribute)embeddedValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValueEnumeration() {
		return attributeValueEnumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueEnumeration_Values() {
		return (EReference)attributeValueEnumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueEnumeration_Definition() {
		return (EReference)attributeValueEnumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDefinitionSimple() {
		return attributeDefinitionSimpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDefinitionSimple_Type() {
		return (EReference)attributeDefinitionSimpleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDefinitionSimple_DefaultValue() {
		return (EReference)attributeDefinitionSimpleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeDefinitionSimple() {
		return datatypeDefinitionSimpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValueSimple() {
		return attributeValueSimpleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeValueSimple_TheValue() {
		return (EAttribute)attributeValueSimpleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueSimple_Definition() {
		return (EReference)attributeValueSimpleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValueEmbeddedDocument() {
		return attributeValueEmbeddedDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueEmbeddedDocument_Definition() {
		return (EReference)attributeValueEmbeddedDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueEmbeddedDocument_XhtmlContent() {
		return (EReference)attributeValueEmbeddedDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValueEmbeddedFile() {
		return attributeValueEmbeddedFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueEmbeddedFile_Definition() {
		return (EReference)attributeValueEmbeddedFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueEmbeddedFile_BinaryContent() {
		return (EReference)attributeValueEmbeddedFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValueFileReference() {
		return attributeValueFileReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeValueFileReference_PathToFile() {
		return (EAttribute)attributeValueFileReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueFileReference_Definition() {
		return (EReference)attributeValueFileReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValueXmlData() {
		return attributeValueXmlDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueXmlData_Definition() {
		return (EReference)attributeValueXmlDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueXmlData_XmlContent() {
		return (EReference)attributeValueXmlDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeDefinitionBinaryFile() {
		return datatypeDefinitionBinaryFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeDefinitionBinaryFile_Application() {
		return (EAttribute)datatypeDefinitionBinaryFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeDefinitionBinaryFile_FilenameSuffix() {
		return (EAttribute)datatypeDefinitionBinaryFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeDefinitionBinaryFile_FormatName() {
		return (EAttribute)datatypeDefinitionBinaryFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeDefinitionBinaryFile_MimeType() {
		return (EAttribute)datatypeDefinitionBinaryFileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeDefinitionBoolean() {
		return datatypeDefinitionBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeDefinitionDate() {
		return datatypeDefinitionDateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeDefinitionDate_Format() {
		return (EAttribute)datatypeDefinitionDateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeDefinitionDocument() {
		return datatypeDefinitionDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeDefinitionInteger() {
		return datatypeDefinitionIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeDefinitionInteger_Max() {
		return (EAttribute)datatypeDefinitionIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeDefinitionInteger_Min() {
		return (EAttribute)datatypeDefinitionIntegerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeDefinitionReal() {
		return datatypeDefinitionRealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeDefinitionReal_Accuracy() {
		return (EAttribute)datatypeDefinitionRealEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeDefinitionReal_Max() {
		return (EAttribute)datatypeDefinitionRealEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeDefinitionReal_Min() {
		return (EAttribute)datatypeDefinitionRealEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeDefinitionString() {
		return datatypeDefinitionStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeDefinitionString_MaxLength() {
		return (EAttribute)datatypeDefinitionStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeDefinitionXmlData() {
		return datatypeDefinitionXmlDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeDefinitionXmlData_NameSpaceURI() {
		return (EAttribute)datatypeDefinitionXmlDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatatypeDefinitionXmlData_SchemaLocation() {
		return (EAttribute)datatypeDefinitionXmlDataEClass.getEStructuralFeatures().get(1);
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
	public EReference getRIF_Header() {
		return (EReference)rifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIF_CoreContent() {
		return (EReference)rifEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIF_ToolExtensions() {
		return (EReference)rifEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRIFHeader() {
		return rifHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRIFHeader_Author() {
		return (EAttribute)rifHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRIFHeader_Comment() {
		return (EAttribute)rifHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRIFHeader_CreationTime() {
		return (EAttribute)rifHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRIFHeader_Identifier() {
		return (EAttribute)rifHeaderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRIFHeader_SourceToolId() {
		return (EAttribute)rifHeaderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRIFHeader_Title() {
		return (EAttribute)rifHeaderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRIFContent() {
		return rifContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIFContent_AccessPolicies() {
		return (EReference)rifContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIFContent_Datatypes() {
		return (EReference)rifContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIFContent_SpecHierarchyRoots() {
		return (EReference)rifContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIFContent_SpecObjects() {
		return (EReference)rifContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIFContent_SpecGroups() {
		return (EReference)rifContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIFContent_SpecGroupHierarchyRoots() {
		return (EReference)rifContentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIFContent_SpecTypes() {
		return (EReference)rifContentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRIFContent_SpecRelations() {
		return (EReference)rifContentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRIFToolExtension() {
		return rifToolExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeFileFactory getExchangeFileFactory() {
		return (ExchangeFileFactory)getEFactoryInstance();
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
		specHierarchyRootEClass = createEClass(SPEC_HIERARCHY_ROOT);
		createEReference(specHierarchyRootEClass, SPEC_HIERARCHY_ROOT__CHILDREN);

		specElementWithUserDefinedAttributesEClass = createEClass(SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES);
		createEReference(specElementWithUserDefinedAttributesEClass, SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__TYPE);
		createEReference(specElementWithUserDefinedAttributesEClass, SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__VALUES);

		identifiableEClass = createEClass(IDENTIFIABLE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__DESC);
		createEAttribute(identifiableEClass, IDENTIFIABLE__IDENTIFIER);
		createEAttribute(identifiableEClass, IDENTIFIABLE__LAST_CHANGE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__LONG_NAME);

		specTypeEClass = createEClass(SPEC_TYPE);
		createEReference(specTypeEClass, SPEC_TYPE__SPEC_ATTRIBUTES);

		attributeDefinitionEClass = createEClass(ATTRIBUTE_DEFINITION);

		attributeValueEClass = createEClass(ATTRIBUTE_VALUE);

		specHierarchyEClass = createEClass(SPEC_HIERARCHY);
		createEReference(specHierarchyEClass, SPEC_HIERARCHY__OBJECT);
		createEReference(specHierarchyEClass, SPEC_HIERARCHY__VALUES);
		createEReference(specHierarchyEClass, SPEC_HIERARCHY__CHILDREN);

		specObjectEClass = createEClass(SPEC_OBJECT);

		specGroupEClass = createEClass(SPEC_GROUP);
		createEReference(specGroupEClass, SPEC_GROUP__SPEC_OBJECTS);
		createEReference(specGroupEClass, SPEC_GROUP__RELATION_GROUPS);

		relationGroupEClass = createEClass(RELATION_GROUP);
		createEReference(relationGroupEClass, RELATION_GROUP__SPEC_RELATIONS);
		createEReference(relationGroupEClass, RELATION_GROUP__RELATION_TYPE);

		specRelationEClass = createEClass(SPEC_RELATION);
		createEReference(specRelationEClass, SPEC_RELATION__TARGET);
		createEReference(specRelationEClass, SPEC_RELATION__SOURCE);

		datatypeDefinitionEClass = createEClass(DATATYPE_DEFINITION);

		accessPolicyEClass = createEClass(ACCESS_POLICY);
		createEAttribute(accessPolicyEClass, ACCESS_POLICY__ACCESS_MODE);
		createEReference(accessPolicyEClass, ACCESS_POLICY__SPEC_GROUP_HIERARCHY_ROOTS);
		createEReference(accessPolicyEClass, ACCESS_POLICY__SPEC_GROUPS);
		createEReference(accessPolicyEClass, ACCESS_POLICY__ATTRIBUTE_DEFINITIONS);
		createEReference(accessPolicyEClass, ACCESS_POLICY__RELATION_GROUPS);
		createEReference(accessPolicyEClass, ACCESS_POLICY__DATATYPE_DEFINITIONS);
		createEReference(accessPolicyEClass, ACCESS_POLICY__SPEC_RELATIONS);
		createEReference(accessPolicyEClass, ACCESS_POLICY__ATTRIBUTE_VALUES);
		createEReference(accessPolicyEClass, ACCESS_POLICY__SPEC_TYPES);
		createEReference(accessPolicyEClass, ACCESS_POLICY__SPEC_HIERARCHIES);
		createEReference(accessPolicyEClass, ACCESS_POLICY__SPEC_OBJECTS);
		createEReference(accessPolicyEClass, ACCESS_POLICY__SPEC_HIERARCHY_ROOTS);

		specGroupHierarchyRootEClass = createEClass(SPEC_GROUP_HIERARCHY_ROOT);
		createEReference(specGroupHierarchyRootEClass, SPEC_GROUP_HIERARCHY_ROOT__CHILDREN);

		specGroupHierarchyEClass = createEClass(SPEC_GROUP_HIERARCHY);
		createEReference(specGroupHierarchyEClass, SPEC_GROUP_HIERARCHY__GROUP);

		attributeDefinitionComplexEClass = createEClass(ATTRIBUTE_DEFINITION_COMPLEX);
		createEReference(attributeDefinitionComplexEClass, ATTRIBUTE_DEFINITION_COMPLEX__TYPE);
		createEReference(attributeDefinitionComplexEClass, ATTRIBUTE_DEFINITION_COMPLEX__DEFAULT_VALUE);

		datatypeDefinitionComplexEClass = createEClass(DATATYPE_DEFINITION_COMPLEX);
		createEAttribute(datatypeDefinitionComplexEClass, DATATYPE_DEFINITION_COMPLEX__EMBEDDED);

		attributeValueComplexEClass = createEClass(ATTRIBUTE_VALUE_COMPLEX);

		attributeDefinitionEnumerationEClass = createEClass(ATTRIBUTE_DEFINITION_ENUMERATION);
		createEAttribute(attributeDefinitionEnumerationEClass, ATTRIBUTE_DEFINITION_ENUMERATION__MULTI_VALUED);
		createEReference(attributeDefinitionEnumerationEClass, ATTRIBUTE_DEFINITION_ENUMERATION__TYPE);
		createEReference(attributeDefinitionEnumerationEClass, ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULT_VALUE);

		datatypeDefinitionEnumerationEClass = createEClass(DATATYPE_DEFINITION_ENUMERATION);
		createEReference(datatypeDefinitionEnumerationEClass, DATATYPE_DEFINITION_ENUMERATION__SPECIFIED_VALUES);

		enumValueEClass = createEClass(ENUM_VALUE);
		createEReference(enumValueEClass, ENUM_VALUE__PROPERTIES);

		embeddedValueEClass = createEClass(EMBEDDED_VALUE);
		createEAttribute(embeddedValueEClass, EMBEDDED_VALUE__KEY);
		createEAttribute(embeddedValueEClass, EMBEDDED_VALUE__OTHER_CONTENT);

		attributeValueEnumerationEClass = createEClass(ATTRIBUTE_VALUE_ENUMERATION);
		createEReference(attributeValueEnumerationEClass, ATTRIBUTE_VALUE_ENUMERATION__VALUES);
		createEReference(attributeValueEnumerationEClass, ATTRIBUTE_VALUE_ENUMERATION__DEFINITION);

		attributeDefinitionSimpleEClass = createEClass(ATTRIBUTE_DEFINITION_SIMPLE);
		createEReference(attributeDefinitionSimpleEClass, ATTRIBUTE_DEFINITION_SIMPLE__TYPE);
		createEReference(attributeDefinitionSimpleEClass, ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE);

		datatypeDefinitionSimpleEClass = createEClass(DATATYPE_DEFINITION_SIMPLE);

		attributeValueSimpleEClass = createEClass(ATTRIBUTE_VALUE_SIMPLE);
		createEAttribute(attributeValueSimpleEClass, ATTRIBUTE_VALUE_SIMPLE__THE_VALUE);
		createEReference(attributeValueSimpleEClass, ATTRIBUTE_VALUE_SIMPLE__DEFINITION);

		attributeValueEmbeddedDocumentEClass = createEClass(ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT);
		createEReference(attributeValueEmbeddedDocumentEClass, ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DEFINITION);
		createEReference(attributeValueEmbeddedDocumentEClass, ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__XHTML_CONTENT);

		attributeValueEmbeddedFileEClass = createEClass(ATTRIBUTE_VALUE_EMBEDDED_FILE);
		createEReference(attributeValueEmbeddedFileEClass, ATTRIBUTE_VALUE_EMBEDDED_FILE__DEFINITION);
		createEReference(attributeValueEmbeddedFileEClass, ATTRIBUTE_VALUE_EMBEDDED_FILE__BINARY_CONTENT);

		attributeValueFileReferenceEClass = createEClass(ATTRIBUTE_VALUE_FILE_REFERENCE);
		createEAttribute(attributeValueFileReferenceEClass, ATTRIBUTE_VALUE_FILE_REFERENCE__PATH_TO_FILE);
		createEReference(attributeValueFileReferenceEClass, ATTRIBUTE_VALUE_FILE_REFERENCE__DEFINITION);

		attributeValueXmlDataEClass = createEClass(ATTRIBUTE_VALUE_XML_DATA);
		createEReference(attributeValueXmlDataEClass, ATTRIBUTE_VALUE_XML_DATA__DEFINITION);
		createEReference(attributeValueXmlDataEClass, ATTRIBUTE_VALUE_XML_DATA__XML_CONTENT);

		datatypeDefinitionBinaryFileEClass = createEClass(DATATYPE_DEFINITION_BINARY_FILE);
		createEAttribute(datatypeDefinitionBinaryFileEClass, DATATYPE_DEFINITION_BINARY_FILE__APPLICATION);
		createEAttribute(datatypeDefinitionBinaryFileEClass, DATATYPE_DEFINITION_BINARY_FILE__FILENAME_SUFFIX);
		createEAttribute(datatypeDefinitionBinaryFileEClass, DATATYPE_DEFINITION_BINARY_FILE__FORMAT_NAME);
		createEAttribute(datatypeDefinitionBinaryFileEClass, DATATYPE_DEFINITION_BINARY_FILE__MIME_TYPE);

		datatypeDefinitionBooleanEClass = createEClass(DATATYPE_DEFINITION_BOOLEAN);

		datatypeDefinitionDateEClass = createEClass(DATATYPE_DEFINITION_DATE);
		createEAttribute(datatypeDefinitionDateEClass, DATATYPE_DEFINITION_DATE__FORMAT);

		datatypeDefinitionDocumentEClass = createEClass(DATATYPE_DEFINITION_DOCUMENT);

		datatypeDefinitionIntegerEClass = createEClass(DATATYPE_DEFINITION_INTEGER);
		createEAttribute(datatypeDefinitionIntegerEClass, DATATYPE_DEFINITION_INTEGER__MAX);
		createEAttribute(datatypeDefinitionIntegerEClass, DATATYPE_DEFINITION_INTEGER__MIN);

		datatypeDefinitionRealEClass = createEClass(DATATYPE_DEFINITION_REAL);
		createEAttribute(datatypeDefinitionRealEClass, DATATYPE_DEFINITION_REAL__ACCURACY);
		createEAttribute(datatypeDefinitionRealEClass, DATATYPE_DEFINITION_REAL__MAX);
		createEAttribute(datatypeDefinitionRealEClass, DATATYPE_DEFINITION_REAL__MIN);

		datatypeDefinitionStringEClass = createEClass(DATATYPE_DEFINITION_STRING);
		createEAttribute(datatypeDefinitionStringEClass, DATATYPE_DEFINITION_STRING__MAX_LENGTH);

		datatypeDefinitionXmlDataEClass = createEClass(DATATYPE_DEFINITION_XML_DATA);
		createEAttribute(datatypeDefinitionXmlDataEClass, DATATYPE_DEFINITION_XML_DATA__NAME_SPACE_URI);
		createEAttribute(datatypeDefinitionXmlDataEClass, DATATYPE_DEFINITION_XML_DATA__SCHEMA_LOCATION);

		rifEClass = createEClass(RIF);
		createEReference(rifEClass, RIF__HEADER);
		createEReference(rifEClass, RIF__CORE_CONTENT);
		createEReference(rifEClass, RIF__TOOL_EXTENSIONS);

		rifHeaderEClass = createEClass(RIF_HEADER);
		createEAttribute(rifHeaderEClass, RIF_HEADER__AUTHOR);
		createEAttribute(rifHeaderEClass, RIF_HEADER__COMMENT);
		createEAttribute(rifHeaderEClass, RIF_HEADER__CREATION_TIME);
		createEAttribute(rifHeaderEClass, RIF_HEADER__IDENTIFIER);
		createEAttribute(rifHeaderEClass, RIF_HEADER__SOURCE_TOOL_ID);
		createEAttribute(rifHeaderEClass, RIF_HEADER__TITLE);

		rifContentEClass = createEClass(RIF_CONTENT);
		createEReference(rifContentEClass, RIF_CONTENT__ACCESS_POLICIES);
		createEReference(rifContentEClass, RIF_CONTENT__DATATYPES);
		createEReference(rifContentEClass, RIF_CONTENT__SPEC_HIERARCHY_ROOTS);
		createEReference(rifContentEClass, RIF_CONTENT__SPEC_OBJECTS);
		createEReference(rifContentEClass, RIF_CONTENT__SPEC_GROUPS);
		createEReference(rifContentEClass, RIF_CONTENT__SPEC_GROUP_HIERARCHY_ROOTS);
		createEReference(rifContentEClass, RIF_CONTENT__SPEC_TYPES);
		createEReference(rifContentEClass, RIF_CONTENT__SPEC_RELATIONS);

		rifToolExtensionEClass = createEClass(RIF_TOOL_EXTENSION);
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
		DataTypesPackage theDataTypesPackage = (DataTypesPackage)EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI);
		EA_AUTOSARM2_Types_PackagePackage theEA_AUTOSARM2_Types_PackagePackage = (EA_AUTOSARM2_Types_PackagePackage)EPackage.Registry.INSTANCE.getEPackage(EA_AUTOSARM2_Types_PackagePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDataTypesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		specHierarchyRootEClass.getESuperTypes().add(this.getSpecElementWithUserDefinedAttributes());
		specElementWithUserDefinedAttributesEClass.getESuperTypes().add(this.getIdentifiable());
		specTypeEClass.getESuperTypes().add(this.getIdentifiable());
		attributeDefinitionEClass.getESuperTypes().add(this.getIdentifiable());
		attributeValueEClass.getESuperTypes().add(this.getIdentifiable());
		specHierarchyEClass.getESuperTypes().add(this.getIdentifiable());
		specObjectEClass.getESuperTypes().add(this.getSpecElementWithUserDefinedAttributes());
		specGroupEClass.getESuperTypes().add(this.getSpecElementWithUserDefinedAttributes());
		relationGroupEClass.getESuperTypes().add(this.getIdentifiable());
		specRelationEClass.getESuperTypes().add(this.getSpecElementWithUserDefinedAttributes());
		datatypeDefinitionEClass.getESuperTypes().add(this.getIdentifiable());
		accessPolicyEClass.getESuperTypes().add(this.getIdentifiable());
		specGroupHierarchyRootEClass.getESuperTypes().add(this.getSpecElementWithUserDefinedAttributes());
		specGroupHierarchyEClass.getESuperTypes().add(this.getIdentifiable());
		attributeDefinitionComplexEClass.getESuperTypes().add(this.getAttributeDefinition());
		datatypeDefinitionComplexEClass.getESuperTypes().add(this.getDatatypeDefinition());
		attributeValueComplexEClass.getESuperTypes().add(this.getAttributeValue());
		attributeDefinitionEnumerationEClass.getESuperTypes().add(this.getAttributeDefinition());
		datatypeDefinitionEnumerationEClass.getESuperTypes().add(this.getDatatypeDefinition());
		enumValueEClass.getESuperTypes().add(this.getIdentifiable());
		attributeValueEnumerationEClass.getESuperTypes().add(this.getAttributeValue());
		attributeDefinitionSimpleEClass.getESuperTypes().add(this.getAttributeDefinition());
		datatypeDefinitionSimpleEClass.getESuperTypes().add(this.getDatatypeDefinition());
		attributeValueSimpleEClass.getESuperTypes().add(this.getAttributeValue());
		attributeValueEmbeddedDocumentEClass.getESuperTypes().add(this.getAttributeValueComplex());
		attributeValueEmbeddedFileEClass.getESuperTypes().add(this.getAttributeValueComplex());
		attributeValueFileReferenceEClass.getESuperTypes().add(this.getAttributeValueComplex());
		attributeValueXmlDataEClass.getESuperTypes().add(this.getAttributeValueComplex());
		datatypeDefinitionBinaryFileEClass.getESuperTypes().add(this.getDatatypeDefinitionComplex());
		datatypeDefinitionBooleanEClass.getESuperTypes().add(this.getDatatypeDefinitionSimple());
		datatypeDefinitionDateEClass.getESuperTypes().add(this.getDatatypeDefinitionSimple());
		datatypeDefinitionDocumentEClass.getESuperTypes().add(this.getDatatypeDefinitionComplex());
		datatypeDefinitionIntegerEClass.getESuperTypes().add(this.getDatatypeDefinitionSimple());
		datatypeDefinitionRealEClass.getESuperTypes().add(this.getDatatypeDefinitionSimple());
		datatypeDefinitionStringEClass.getESuperTypes().add(this.getDatatypeDefinitionSimple());
		datatypeDefinitionXmlDataEClass.getESuperTypes().add(this.getDatatypeDefinitionComplex());

		// Initialize classes and features; add operations and parameters
		initEClass(specHierarchyRootEClass, SpecHierarchyRoot.class, "SpecHierarchyRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecHierarchyRoot_Children(), this.getSpecHierarchy(), null, "children", null, 0, -1, SpecHierarchyRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specElementWithUserDefinedAttributesEClass, SpecElementWithUserDefinedAttributes.class, "SpecElementWithUserDefinedAttributes", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecElementWithUserDefinedAttributes_Type(), this.getSpecType(), null, "type", null, 1, 1, SpecElementWithUserDefinedAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecElementWithUserDefinedAttributes_Values(), this.getAttributeValue(), null, "values", null, 0, -1, SpecElementWithUserDefinedAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(identifiableEClass, Identifiable.class, "Identifiable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiable_Desc(), theDataTypesPackage.getstring(), "desc", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIdentifiable_Identifier(), theEA_AUTOSARM2_Types_PackagePackage.getID(), "identifier", null, 1, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIdentifiable_LastChange(), theEA_AUTOSARM2_Types_PackagePackage.getdateTime(), "lastChange", null, 1, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIdentifiable_LongName(), theDataTypesPackage.getstring(), "longName", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(specTypeEClass, SpecType.class, "SpecType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecType_SpecAttributes(), this.getAttributeDefinition(), null, "specAttributes", null, 0, -1, SpecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeDefinitionEClass, AttributeDefinition.class, "AttributeDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeValueEClass, AttributeValue.class, "AttributeValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specHierarchyEClass, SpecHierarchy.class, "SpecHierarchy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecHierarchy_Object(), this.getSpecObject(), null, "object", null, 1, 1, SpecHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecHierarchy_Values(), this.getAttributeValue(), null, "values", null, 0, -1, SpecHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecHierarchy_Children(), this.getSpecHierarchy(), null, "children", null, 0, -1, SpecHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specObjectEClass, SpecObject.class, "SpecObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specGroupEClass, SpecGroup.class, "SpecGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecGroup_SpecObjects(), this.getSpecObject(), null, "specObjects", null, 0, -1, SpecGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecGroup_RelationGroups(), this.getRelationGroup(), null, "relationGroups", null, 0, -1, SpecGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(relationGroupEClass, RelationGroup.class, "RelationGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationGroup_SpecRelations(), this.getSpecRelation(), null, "specRelations", null, 0, -1, RelationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationGroup_RelationType(), this.getSpecType(), null, "relationType", null, 0, 1, RelationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(specRelationEClass, SpecRelation.class, "SpecRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecRelation_Target(), this.getSpecObject(), null, "target", null, 1, 1, SpecRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecRelation_Source(), this.getSpecObject(), null, "source", null, 1, 1, SpecRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(datatypeDefinitionEClass, DatatypeDefinition.class, "DatatypeDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(accessPolicyEClass, AccessPolicy.class, "AccessPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessPolicy_AccessMode(), theEA_AUTOSARM2_Types_PackagePackage.getAccessPolicyAccessModeEnum(), "accessMode", null, 1, 1, AccessPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAccessPolicy_SpecGroupHierarchyRoots(), this.getSpecGroupHierarchyRoot(), null, "specGroupHierarchyRoots", null, 0, -1, AccessPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAccessPolicy_SpecGroups(), this.getSpecGroup(), null, "specGroups", null, 0, -1, AccessPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAccessPolicy_AttributeDefinitions(), this.getAttributeDefinition(), null, "attributeDefinitions", null, 0, -1, AccessPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAccessPolicy_RelationGroups(), this.getRelationGroup(), null, "relationGroups", null, 0, -1, AccessPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAccessPolicy_DatatypeDefinitions(), this.getDatatypeDefinition(), null, "datatypeDefinitions", null, 0, -1, AccessPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAccessPolicy_SpecRelations(), this.getSpecRelation(), null, "specRelations", null, 0, -1, AccessPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAccessPolicy_AttributeValues(), this.getAttributeValue(), null, "attributeValues", null, 0, -1, AccessPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAccessPolicy_SpecTypes(), this.getSpecType(), null, "specTypes", null, 0, -1, AccessPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAccessPolicy_SpecHierarchies(), this.getSpecHierarchy(), null, "specHierarchies", null, 0, -1, AccessPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAccessPolicy_SpecObjects(), this.getSpecObject(), null, "specObjects", null, 0, -1, AccessPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAccessPolicy_SpecHierarchyRoots(), this.getSpecHierarchyRoot(), null, "specHierarchyRoots", null, 0, -1, AccessPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(specGroupHierarchyRootEClass, SpecGroupHierarchyRoot.class, "SpecGroupHierarchyRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecGroupHierarchyRoot_Children(), this.getSpecGroupHierarchy(), null, "children", null, 0, -1, SpecGroupHierarchyRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(specGroupHierarchyEClass, SpecGroupHierarchy.class, "SpecGroupHierarchy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecGroupHierarchy_Group(), this.getSpecGroup(), null, "group", null, 1, 1, SpecGroupHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeDefinitionComplexEClass, AttributeDefinitionComplex.class, "AttributeDefinitionComplex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeDefinitionComplex_Type(), this.getDatatypeDefinitionComplex(), null, "type", null, 1, 1, AttributeDefinitionComplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeDefinitionComplex_DefaultValue(), this.getAttributeValueComplex(), null, "defaultValue", null, 0, 1, AttributeDefinitionComplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(datatypeDefinitionComplexEClass, DatatypeDefinitionComplex.class, "DatatypeDefinitionComplex", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatatypeDefinitionComplex_Embedded(), theDataTypesPackage.getboolean(), "embedded", null, 1, 1, DatatypeDefinitionComplex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeValueComplexEClass, AttributeValueComplex.class, "AttributeValueComplex", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeDefinitionEnumerationEClass, AttributeDefinitionEnumeration.class, "AttributeDefinitionEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeDefinitionEnumeration_MultiValued(), theDataTypesPackage.getboolean(), "multiValued", null, 1, 1, AttributeDefinitionEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeDefinitionEnumeration_Type(), this.getDatatypeDefinitionEnumeration(), null, "type", null, 1, 1, AttributeDefinitionEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeDefinitionEnumeration_DefaultValue(), this.getAttributeValueEnumeration(), null, "defaultValue", null, 0, 1, AttributeDefinitionEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(datatypeDefinitionEnumerationEClass, DatatypeDefinitionEnumeration.class, "DatatypeDefinitionEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatatypeDefinitionEnumeration_SpecifiedValues(), this.getEnumValue(), null, "specifiedValues", null, 0, -1, DatatypeDefinitionEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumValueEClass, EnumValue.class, "EnumValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumValue_Properties(), this.getEmbeddedValue(), null, "properties", null, 1, 1, EnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(embeddedValueEClass, EmbeddedValue.class, "EmbeddedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmbeddedValue_Key(), theEA_AUTOSARM2_Types_PackagePackage.getinteger(), "key", null, 1, 1, EmbeddedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmbeddedValue_OtherContent(), theDataTypesPackage.getstring(), "otherContent", null, 1, 1, EmbeddedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeValueEnumerationEClass, AttributeValueEnumeration.class, "AttributeValueEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeValueEnumeration_Values(), this.getEnumValue(), null, "values", null, 0, -1, AttributeValueEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeValueEnumeration_Definition(), this.getAttributeDefinitionEnumeration(), null, "definition", null, 1, 1, AttributeValueEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeDefinitionSimpleEClass, AttributeDefinitionSimple.class, "AttributeDefinitionSimple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeDefinitionSimple_Type(), this.getDatatypeDefinitionSimple(), null, "type", null, 1, 1, AttributeDefinitionSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeDefinitionSimple_DefaultValue(), this.getAttributeValueSimple(), null, "defaultValue", null, 0, 1, AttributeDefinitionSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(datatypeDefinitionSimpleEClass, DatatypeDefinitionSimple.class, "DatatypeDefinitionSimple", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeValueSimpleEClass, AttributeValueSimple.class, "AttributeValueSimple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeValueSimple_TheValue(), theDataTypesPackage.getstring(), "theValue", null, 1, 1, AttributeValueSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeValueSimple_Definition(), this.getAttributeDefinitionSimple(), null, "definition", null, 1, 1, AttributeValueSimple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeValueEmbeddedDocumentEClass, AttributeValueEmbeddedDocument.class, "AttributeValueEmbeddedDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeValueEmbeddedDocument_Definition(), this.getAttributeDefinitionComplex(), null, "definition", null, 1, 1, AttributeValueEmbeddedDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeValueEmbeddedDocument_XhtmlContent(), theDataTypesPackage.getXhtmlContent(), null, "xhtmlContent", null, 1, 1, AttributeValueEmbeddedDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeValueEmbeddedFileEClass, AttributeValueEmbeddedFile.class, "AttributeValueEmbeddedFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeValueEmbeddedFile_Definition(), this.getAttributeDefinitionComplex(), null, "definition", null, 1, 1, AttributeValueEmbeddedFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeValueEmbeddedFile_BinaryContent(), theDataTypesPackage.getBinaryContent(), null, "binaryContent", null, 1, 1, AttributeValueEmbeddedFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeValueFileReferenceEClass, AttributeValueFileReference.class, "AttributeValueFileReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeValueFileReference_PathToFile(), theDataTypesPackage.getstring(), "pathToFile", null, 1, 1, AttributeValueFileReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeValueFileReference_Definition(), this.getAttributeDefinitionComplex(), null, "definition", null, 1, 1, AttributeValueFileReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeValueXmlDataEClass, AttributeValueXmlData.class, "AttributeValueXmlData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeValueXmlData_Definition(), this.getAttributeDefinitionComplex(), null, "definition", null, 1, 1, AttributeValueXmlData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeValueXmlData_XmlContent(), theDataTypesPackage.getXmlContent(), null, "xmlContent", null, 1, 1, AttributeValueXmlData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(datatypeDefinitionBinaryFileEClass, DatatypeDefinitionBinaryFile.class, "DatatypeDefinitionBinaryFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatatypeDefinitionBinaryFile_Application(), theEA_AUTOSARM2_Types_PackagePackage.getstring(), "application", null, 1, 1, DatatypeDefinitionBinaryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDatatypeDefinitionBinaryFile_FilenameSuffix(), theDataTypesPackage.getstring(), "filenameSuffix", null, 1, 1, DatatypeDefinitionBinaryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDatatypeDefinitionBinaryFile_FormatName(), theDataTypesPackage.getstring(), "formatName", null, 1, 1, DatatypeDefinitionBinaryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDatatypeDefinitionBinaryFile_MimeType(), theDataTypesPackage.getstring(), "mimeType", null, 1, 1, DatatypeDefinitionBinaryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(datatypeDefinitionBooleanEClass, DatatypeDefinitionBoolean.class, "DatatypeDefinitionBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(datatypeDefinitionDateEClass, DatatypeDefinitionDate.class, "DatatypeDefinitionDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatatypeDefinitionDate_Format(), theEA_AUTOSARM2_Types_PackagePackage.getDatatypeDefinitionDateFormatEnum(), "format", null, 1, 1, DatatypeDefinitionDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypeDefinitionDocumentEClass, DatatypeDefinitionDocument.class, "DatatypeDefinitionDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(datatypeDefinitionIntegerEClass, DatatypeDefinitionInteger.class, "DatatypeDefinitionInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatatypeDefinitionInteger_Max(), theEA_AUTOSARM2_Types_PackagePackage.getinteger(), "max", null, 1, 1, DatatypeDefinitionInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDatatypeDefinitionInteger_Min(), theEA_AUTOSARM2_Types_PackagePackage.getinteger(), "min", null, 1, 1, DatatypeDefinitionInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(datatypeDefinitionRealEClass, DatatypeDefinitionReal.class, "DatatypeDefinitionReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatatypeDefinitionReal_Accuracy(), theEA_AUTOSARM2_Types_PackagePackage.getinteger(), "accuracy", null, 1, 1, DatatypeDefinitionReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDatatypeDefinitionReal_Max(), theDataTypesPackage.getfloat(), "max", null, 1, 1, DatatypeDefinitionReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDatatypeDefinitionReal_Min(), theDataTypesPackage.getfloat(), "min", null, 1, 1, DatatypeDefinitionReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(datatypeDefinitionStringEClass, DatatypeDefinitionString.class, "DatatypeDefinitionString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatatypeDefinitionString_MaxLength(), theEA_AUTOSARM2_Types_PackagePackage.getinteger(), "maxLength", null, 1, 1, DatatypeDefinitionString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(datatypeDefinitionXmlDataEClass, DatatypeDefinitionXmlData.class, "DatatypeDefinitionXmlData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatatypeDefinitionXmlData_NameSpaceURI(), theDataTypesPackage.getstring(), "nameSpaceURI", null, 1, 1, DatatypeDefinitionXmlData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDatatypeDefinitionXmlData_SchemaLocation(), theDataTypesPackage.getstring(), "schemaLocation", null, 1, 1, DatatypeDefinitionXmlData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rifEClass, org.eclipse.rmf.rif12.ExchangeFile.RIF.class, "RIF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRIF_Header(), this.getRIFHeader(), null, "header", null, 1, 1, org.eclipse.rmf.rif12.ExchangeFile.RIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRIF_CoreContent(), this.getRIFContent(), null, "coreContent", null, 1, 1, org.eclipse.rmf.rif12.ExchangeFile.RIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRIF_ToolExtensions(), this.getRIFToolExtension(), null, "toolExtensions", null, 1, 1, org.eclipse.rmf.rif12.ExchangeFile.RIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rifHeaderEClass, RIFHeader.class, "RIFHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRIFHeader_Author(), theDataTypesPackage.getstring(), "author", null, 1, 1, RIFHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRIFHeader_Comment(), theDataTypesPackage.getstring(), "comment", null, 0, 1, RIFHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRIFHeader_CreationTime(), theEA_AUTOSARM2_Types_PackagePackage.getdateTime(), "creationTime", null, 1, 1, RIFHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRIFHeader_Identifier(), theEA_AUTOSARM2_Types_PackagePackage.getID(), "identifier", null, 1, 1, RIFHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRIFHeader_SourceToolId(), theDataTypesPackage.getstring(), "sourceToolId", null, 1, 1, RIFHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRIFHeader_Title(), theDataTypesPackage.getstring(), "title", null, 1, 1, RIFHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rifContentEClass, RIFContent.class, "RIFContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRIFContent_AccessPolicies(), this.getAccessPolicy(), null, "accessPolicies", null, 0, -1, RIFContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRIFContent_Datatypes(), this.getDatatypeDefinition(), null, "datatypes", null, 0, -1, RIFContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRIFContent_SpecHierarchyRoots(), this.getSpecHierarchyRoot(), null, "SpecHierarchyRoots", null, 0, -1, RIFContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRIFContent_SpecObjects(), this.getSpecObject(), null, "specObjects", null, 0, -1, RIFContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRIFContent_SpecGroups(), this.getSpecGroup(), null, "specGroups", null, 0, -1, RIFContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRIFContent_SpecGroupHierarchyRoots(), this.getSpecGroupHierarchyRoot(), null, "SpecGroupHierarchyRoots", null, 0, -1, RIFContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRIFContent_SpecTypes(), this.getSpecType(), null, "specTypes", null, 0, -1, RIFContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRIFContent_SpecRelations(), this.getSpecRelation(), null, "specRelations", null, 0, -1, RIFContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rifToolExtensionEClass, RIFToolExtension.class, "RIFToolExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ExchangeFilePackageImpl
