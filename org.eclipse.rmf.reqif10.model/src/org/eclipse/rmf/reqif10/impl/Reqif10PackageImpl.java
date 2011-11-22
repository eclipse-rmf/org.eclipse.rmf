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

package org.eclipse.rmf.reqif10.impl;


import org.eclipse.rmf.reqif10.AccessControlledElement;
import org.eclipse.rmf.reqif10.AlternativeId;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionBoolean;
import org.eclipse.rmf.reqif10.AttributeDefinitionDate;
import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeDefinitionInteger;
import org.eclipse.rmf.reqif10.AttributeDefinitionReal;
import org.eclipse.rmf.reqif10.AttributeDefinitionSimple;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeDefinitionXhtml;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueBoolean;
import org.eclipse.rmf.reqif10.AttributeValueDate;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueInteger;
import org.eclipse.rmf.reqif10.AttributeValueReal;
import org.eclipse.rmf.reqif10.AttributeValueSimple;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.AttributeValueXhtml;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean;
import org.eclipse.rmf.reqif10.DatatypeDefinitionDate;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.DatatypeDefinitionInteger;
import org.eclipse.rmf.reqif10.DatatypeDefinitionReal;
import org.eclipse.rmf.reqif10.DatatypeDefinitionSimple;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.DatatypeDefinitionXhtml;
import org.eclipse.rmf.reqif10.EmbeddedValue;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.rmf.reqif10.RelationGroup;
import org.eclipse.rmf.reqif10.RelationGroupType;
import org.eclipse.rmf.reqif10.ReqIf;
import org.eclipse.rmf.reqif10.Reqif10Package;
import org.eclipse.rmf.reqif10.ReqIfContent;
import org.eclipse.rmf.reqif10.Reqif10Factory;
import org.eclipse.rmf.reqif10.ReqIfHeader;
import org.eclipse.rmf.reqif10.ReqIfToolExtension;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.SpecRelationType;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.SpecificationType;
import org.eclipse.rmf.reqif10.datatypes.DatatypesPackage;
import org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Reqif10PackageImpl extends EPackageImpl implements Reqif10Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessControlledElementEClass = null;

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
	private EClass attributeValueXhtmlEClass = null;

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
	private EClass specElementWithAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDefinitionXhtmlEClass = null;

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
	private EClass specTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reqIfContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reqIfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reqIfHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reqIfToolExtensionEClass = null;

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
	private EClass specObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationTypeEClass = null;

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
	private EClass datatypeDefinitionEClass = null;

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
	private EClass specRelationTypeEClass = null;

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
	private EClass relationGroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeDefinitionXhtmlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDefinitionBooleanEClass = null;

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
	private EClass datatypeDefinitionBooleanEClass = null;

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
	private EClass attributeValueBooleanEClass = null;

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
	private EClass attributeDefinitionDateEClass = null;

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
	private EClass attributeValueDateEClass = null;

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
	private EClass attributeDefinitionIntegerEClass = null;

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
	private EClass attributeValueIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDefinitionRealEClass = null;

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
	private EClass attributeValueRealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDefinitionStringEClass = null;

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
	private EClass attributeValueStringEClass = null;

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
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Reqif10PackageImpl() {
		super(eNS_URI, Reqif10Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Reqif10Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Reqif10Package init() {
		if (isInited) return (Reqif10Package)EPackage.Registry.INSTANCE.getEPackage(Reqif10Package.eNS_URI);

		// Obtain or create and register package
		Reqif10PackageImpl theReqif10Package = (Reqif10PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Reqif10PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Reqif10PackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI) : DatatypesPackage.eINSTANCE);

		// Create package meta-data objects
		theReqif10Package.createPackageContents();
		theDatatypesPackage.createPackageContents();

		// Initialize created meta-data
		theReqif10Package.initializePackageContents();
		theDatatypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReqif10Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Reqif10Package.eNS_URI, theReqif10Package);
		return theReqif10Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessControlledElement() {
		return accessControlledElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessControlledElement_IsEditable() {
		return (EAttribute)accessControlledElementEClass.getEStructuralFeatures().get(0);
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
	public EReference getIdentifiable_AlternativeId() {
		return (EReference)identifiableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeValueXhtml() {
		return attributeValueXhtmlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeValueXhtml_IsSimplified() {
		return (EAttribute)attributeValueXhtmlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueXhtml_OwningDefinition() {
		return (EReference)attributeValueXhtmlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueXhtml_Definition() {
		return (EReference)attributeValueXhtmlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueXhtml_TheOriginalValue() {
		return (EReference)attributeValueXhtmlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueXhtml_TheValue() {
		return (EReference)attributeValueXhtmlEClass.getEStructuralFeatures().get(4);
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
	public EReference getAttributeValue_SpecElAt() {
		return (EReference)attributeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecElementWithAttributes() {
		return specElementWithAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecElementWithAttributes_Values() {
		return (EReference)specElementWithAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDefinitionXhtml() {
		return attributeDefinitionXhtmlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDefinitionXhtml_Type() {
		return (EReference)attributeDefinitionXhtmlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDefinitionXhtml_DefaultValue() {
		return (EReference)attributeDefinitionXhtmlEClass.getEStructuralFeatures().get(1);
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
	public EReference getAttributeDefinition_SpecType() {
		return (EReference)attributeDefinitionEClass.getEStructuralFeatures().get(0);
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
	public EReference getSpecType_CoreContent() {
		return (EReference)specTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecType_SpecAttributes() {
		return (EReference)specTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReqIfContent() {
		return reqIfContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqIfContent_DocumentRoot() {
		return (EReference)reqIfContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqIfContent_SpecObjects() {
		return (EReference)reqIfContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqIfContent_Specifications() {
		return (EReference)reqIfContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqIfContent_Datatypes() {
		return (EReference)reqIfContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqIfContent_SpecRelations() {
		return (EReference)reqIfContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqIfContent_SpecRelationGroups() {
		return (EReference)reqIfContentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqIfContent_SpecTypes() {
		return (EReference)reqIfContentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReqIf() {
		return reqIfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReqIf_Lang() {
		return (EAttribute)reqIfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqIf_TheHeader() {
		return (EReference)reqIfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqIf_ToolExtensions() {
		return (EReference)reqIfEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqIf_CoreContent() {
		return (EReference)reqIfEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReqIfHeader() {
		return reqIfHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReqIfHeader_Comment() {
		return (EAttribute)reqIfHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReqIfHeader_CreationTime() {
		return (EAttribute)reqIfHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReqIfHeader_Identifier() {
		return (EAttribute)reqIfHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReqIfHeader_RepositoryId() {
		return (EAttribute)reqIfHeaderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReqIfHeader_ReqIfToolId() {
		return (EAttribute)reqIfHeaderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReqIfHeader_ReqIfVersion() {
		return (EAttribute)reqIfHeaderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReqIfHeader_SourceToolId() {
		return (EAttribute)reqIfHeaderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReqIfHeader_Title() {
		return (EAttribute)reqIfHeaderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqIfHeader_DocumentRoot() {
		return (EReference)reqIfHeaderEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReqIfToolExtension() {
		return reqIfToolExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReqIfToolExtension_DocumentRoot() {
		return (EReference)reqIfToolExtensionEClass.getEStructuralFeatures().get(0);
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
	public EReference getSpecObject_Type() {
		return (EReference)specObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecObject_CoreContent() {
		return (EReference)specObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecObjectType() {
		return specObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecification() {
		return specificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_Type() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_Children() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_CoreContent() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificationType() {
		return specificationTypeEClass;
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
	public EAttribute getSpecHierarchy_IsTableInternal() {
		return (EAttribute)specHierarchyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecHierarchy_Object() {
		return (EReference)specHierarchyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecHierarchy_Parent() {
		return (EReference)specHierarchyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecHierarchy_Children() {
		return (EReference)specHierarchyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecHierarchy_EditableAtts() {
		return (EReference)specHierarchyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecHierarchy_Root() {
		return (EReference)specHierarchyEClass.getEStructuralFeatures().get(5);
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
	public EReference getDatatypeDefinition_CoreContent() {
		return (EReference)datatypeDefinitionEClass.getEStructuralFeatures().get(0);
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
	public EReference getSpecRelation_Type() {
		return (EReference)specRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecRelation_CoreContent() {
		return (EReference)specRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecRelationType() {
		return specRelationTypeEClass;
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
	public EReference getRelationGroup_Type() {
		return (EReference)relationGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationGroup_SourceSpecification() {
		return (EReference)relationGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationGroup_TargetSpecification() {
		return (EReference)relationGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationGroup_CoreContent() {
		return (EReference)relationGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationGroupType() {
		return relationGroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatypeDefinitionXhtml() {
		return datatypeDefinitionXhtmlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlternativeId() {
		return alternativeIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlternativeId_Identifier() {
		return (EAttribute)alternativeIdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternativeId_Ident() {
		return (EReference)alternativeIdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDefinitionBoolean() {
		return attributeDefinitionBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDefinitionBoolean_Type() {
		return (EReference)attributeDefinitionBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDefinitionBoolean_DefaultValue() {
		return (EReference)attributeDefinitionBooleanEClass.getEStructuralFeatures().get(1);
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
	public EClass getDatatypeDefinitionBoolean() {
		return datatypeDefinitionBooleanEClass;
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
	public EClass getAttributeValueBoolean() {
		return attributeValueBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeValueBoolean_TheValue() {
		return (EAttribute)attributeValueBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueBoolean_Definition() {
		return (EReference)attributeValueBooleanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueBoolean_OwningDefinition() {
		return (EReference)attributeValueBooleanEClass.getEStructuralFeatures().get(2);
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
	public EClass getAttributeDefinitionDate() {
		return attributeDefinitionDateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDefinitionDate_Type() {
		return (EReference)attributeDefinitionDateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDefinitionDate_DefaultValue() {
		return (EReference)attributeDefinitionDateEClass.getEStructuralFeatures().get(1);
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
	public EClass getAttributeValueDate() {
		return attributeValueDateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeValueDate_TheValue() {
		return (EAttribute)attributeValueDateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueDate_Definition() {
		return (EReference)attributeValueDateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueDate_OwningDefinition() {
		return (EReference)attributeValueDateEClass.getEStructuralFeatures().get(2);
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
	public EReference getEnumValue__() {
		return (EReference)enumValueEClass.getEStructuralFeatures().get(1);
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
	public EReference getEmbeddedValue_EnumValue() {
		return (EReference)embeddedValueEClass.getEStructuralFeatures().get(2);
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
	public EReference getAttributeValueEnumeration_OwningDefinition() {
		return (EReference)attributeValueEnumerationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDefinitionInteger() {
		return attributeDefinitionIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDefinitionInteger_Type() {
		return (EReference)attributeDefinitionIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDefinitionInteger_DefaultValue() {
		return (EReference)attributeDefinitionIntegerEClass.getEStructuralFeatures().get(1);
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
	public EClass getAttributeValueInteger() {
		return attributeValueIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeValueInteger_TheValue() {
		return (EAttribute)attributeValueIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueInteger_Definition() {
		return (EReference)attributeValueIntegerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueInteger_OwningDefinition() {
		return (EReference)attributeValueIntegerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDefinitionReal() {
		return attributeDefinitionRealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDefinitionReal_Type() {
		return (EReference)attributeDefinitionRealEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDefinitionReal_DefaultValue() {
		return (EReference)attributeDefinitionRealEClass.getEStructuralFeatures().get(1);
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
	public EClass getAttributeValueReal() {
		return attributeValueRealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeValueReal_TheValue() {
		return (EAttribute)attributeValueRealEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueReal_Definition() {
		return (EReference)attributeValueRealEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueReal_OwningDefinition() {
		return (EReference)attributeValueRealEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDefinitionString() {
		return attributeDefinitionStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDefinitionString_Type() {
		return (EReference)attributeDefinitionStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeDefinitionString_DefaultValue() {
		return (EReference)attributeDefinitionStringEClass.getEStructuralFeatures().get(1);
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
	public EClass getAttributeValueString() {
		return attributeValueStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeValueString_TheValue() {
		return (EAttribute)attributeValueStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueString_Definition() {
		return (EReference)attributeValueStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeValueString_OwningDefinition() {
		return (EReference)attributeValueStringEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reqif10Factory getReqif10Factory() {
		return (Reqif10Factory)getEFactoryInstance();
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
		accessControlledElementEClass = createEClass(ACCESS_CONTROLLED_ELEMENT);
		createEAttribute(accessControlledElementEClass, ACCESS_CONTROLLED_ELEMENT__IS_EDITABLE);

		identifiableEClass = createEClass(IDENTIFIABLE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__DESC);
		createEAttribute(identifiableEClass, IDENTIFIABLE__IDENTIFIER);
		createEAttribute(identifiableEClass, IDENTIFIABLE__LAST_CHANGE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__LONG_NAME);
		createEReference(identifiableEClass, IDENTIFIABLE__ALTERNATIVE_ID);

		attributeValueXhtmlEClass = createEClass(ATTRIBUTE_VALUE_XHTML);
		createEAttribute(attributeValueXhtmlEClass, ATTRIBUTE_VALUE_XHTML__IS_SIMPLIFIED);
		createEReference(attributeValueXhtmlEClass, ATTRIBUTE_VALUE_XHTML__OWNING_DEFINITION);
		createEReference(attributeValueXhtmlEClass, ATTRIBUTE_VALUE_XHTML__DEFINITION);
		createEReference(attributeValueXhtmlEClass, ATTRIBUTE_VALUE_XHTML__THE_ORIGINAL_VALUE);
		createEReference(attributeValueXhtmlEClass, ATTRIBUTE_VALUE_XHTML__THE_VALUE);

		attributeValueEClass = createEClass(ATTRIBUTE_VALUE);
		createEReference(attributeValueEClass, ATTRIBUTE_VALUE__SPEC_EL_AT);

		specElementWithAttributesEClass = createEClass(SPEC_ELEMENT_WITH_ATTRIBUTES);
		createEReference(specElementWithAttributesEClass, SPEC_ELEMENT_WITH_ATTRIBUTES__VALUES);

		attributeDefinitionXhtmlEClass = createEClass(ATTRIBUTE_DEFINITION_XHTML);
		createEReference(attributeDefinitionXhtmlEClass, ATTRIBUTE_DEFINITION_XHTML__TYPE);
		createEReference(attributeDefinitionXhtmlEClass, ATTRIBUTE_DEFINITION_XHTML__DEFAULT_VALUE);

		attributeDefinitionEClass = createEClass(ATTRIBUTE_DEFINITION);
		createEReference(attributeDefinitionEClass, ATTRIBUTE_DEFINITION__SPEC_TYPE);

		specTypeEClass = createEClass(SPEC_TYPE);
		createEReference(specTypeEClass, SPEC_TYPE__CORE_CONTENT);
		createEReference(specTypeEClass, SPEC_TYPE__SPEC_ATTRIBUTES);

		reqIfContentEClass = createEClass(REQ_IF_CONTENT);
		createEReference(reqIfContentEClass, REQ_IF_CONTENT__DOCUMENT_ROOT);
		createEReference(reqIfContentEClass, REQ_IF_CONTENT__SPEC_OBJECTS);
		createEReference(reqIfContentEClass, REQ_IF_CONTENT__SPECIFICATIONS);
		createEReference(reqIfContentEClass, REQ_IF_CONTENT__DATATYPES);
		createEReference(reqIfContentEClass, REQ_IF_CONTENT__SPEC_RELATIONS);
		createEReference(reqIfContentEClass, REQ_IF_CONTENT__SPEC_RELATION_GROUPS);
		createEReference(reqIfContentEClass, REQ_IF_CONTENT__SPEC_TYPES);

		reqIfEClass = createEClass(REQ_IF);
		createEAttribute(reqIfEClass, REQ_IF__LANG);
		createEReference(reqIfEClass, REQ_IF__THE_HEADER);
		createEReference(reqIfEClass, REQ_IF__TOOL_EXTENSIONS);
		createEReference(reqIfEClass, REQ_IF__CORE_CONTENT);

		reqIfHeaderEClass = createEClass(REQ_IF_HEADER);
		createEAttribute(reqIfHeaderEClass, REQ_IF_HEADER__COMMENT);
		createEAttribute(reqIfHeaderEClass, REQ_IF_HEADER__CREATION_TIME);
		createEAttribute(reqIfHeaderEClass, REQ_IF_HEADER__IDENTIFIER);
		createEAttribute(reqIfHeaderEClass, REQ_IF_HEADER__REPOSITORY_ID);
		createEAttribute(reqIfHeaderEClass, REQ_IF_HEADER__REQ_IF_TOOL_ID);
		createEAttribute(reqIfHeaderEClass, REQ_IF_HEADER__REQ_IF_VERSION);
		createEAttribute(reqIfHeaderEClass, REQ_IF_HEADER__SOURCE_TOOL_ID);
		createEAttribute(reqIfHeaderEClass, REQ_IF_HEADER__TITLE);
		createEReference(reqIfHeaderEClass, REQ_IF_HEADER__DOCUMENT_ROOT);

		reqIfToolExtensionEClass = createEClass(REQ_IF_TOOL_EXTENSION);
		createEReference(reqIfToolExtensionEClass, REQ_IF_TOOL_EXTENSION__DOCUMENT_ROOT);

		specObjectEClass = createEClass(SPEC_OBJECT);
		createEReference(specObjectEClass, SPEC_OBJECT__TYPE);
		createEReference(specObjectEClass, SPEC_OBJECT__CORE_CONTENT);

		specObjectTypeEClass = createEClass(SPEC_OBJECT_TYPE);

		specificationEClass = createEClass(SPECIFICATION);
		createEReference(specificationEClass, SPECIFICATION__TYPE);
		createEReference(specificationEClass, SPECIFICATION__CHILDREN);
		createEReference(specificationEClass, SPECIFICATION__CORE_CONTENT);

		specificationTypeEClass = createEClass(SPECIFICATION_TYPE);

		specHierarchyEClass = createEClass(SPEC_HIERARCHY);
		createEAttribute(specHierarchyEClass, SPEC_HIERARCHY__IS_TABLE_INTERNAL);
		createEReference(specHierarchyEClass, SPEC_HIERARCHY__OBJECT);
		createEReference(specHierarchyEClass, SPEC_HIERARCHY__PARENT);
		createEReference(specHierarchyEClass, SPEC_HIERARCHY__CHILDREN);
		createEReference(specHierarchyEClass, SPEC_HIERARCHY__EDITABLE_ATTS);
		createEReference(specHierarchyEClass, SPEC_HIERARCHY__ROOT);

		datatypeDefinitionEClass = createEClass(DATATYPE_DEFINITION);
		createEReference(datatypeDefinitionEClass, DATATYPE_DEFINITION__CORE_CONTENT);

		specRelationEClass = createEClass(SPEC_RELATION);
		createEReference(specRelationEClass, SPEC_RELATION__TARGET);
		createEReference(specRelationEClass, SPEC_RELATION__SOURCE);
		createEReference(specRelationEClass, SPEC_RELATION__TYPE);
		createEReference(specRelationEClass, SPEC_RELATION__CORE_CONTENT);

		specRelationTypeEClass = createEClass(SPEC_RELATION_TYPE);

		relationGroupEClass = createEClass(RELATION_GROUP);
		createEReference(relationGroupEClass, RELATION_GROUP__SPEC_RELATIONS);
		createEReference(relationGroupEClass, RELATION_GROUP__TYPE);
		createEReference(relationGroupEClass, RELATION_GROUP__SOURCE_SPECIFICATION);
		createEReference(relationGroupEClass, RELATION_GROUP__TARGET_SPECIFICATION);
		createEReference(relationGroupEClass, RELATION_GROUP__CORE_CONTENT);

		relationGroupTypeEClass = createEClass(RELATION_GROUP_TYPE);

		datatypeDefinitionXhtmlEClass = createEClass(DATATYPE_DEFINITION_XHTML);

		alternativeIdEClass = createEClass(ALTERNATIVE_ID);
		createEAttribute(alternativeIdEClass, ALTERNATIVE_ID__IDENTIFIER);
		createEReference(alternativeIdEClass, ALTERNATIVE_ID__IDENT);

		attributeDefinitionBooleanEClass = createEClass(ATTRIBUTE_DEFINITION_BOOLEAN);
		createEReference(attributeDefinitionBooleanEClass, ATTRIBUTE_DEFINITION_BOOLEAN__TYPE);
		createEReference(attributeDefinitionBooleanEClass, ATTRIBUTE_DEFINITION_BOOLEAN__DEFAULT_VALUE);

		attributeDefinitionSimpleEClass = createEClass(ATTRIBUTE_DEFINITION_SIMPLE);

		datatypeDefinitionBooleanEClass = createEClass(DATATYPE_DEFINITION_BOOLEAN);

		datatypeDefinitionSimpleEClass = createEClass(DATATYPE_DEFINITION_SIMPLE);

		attributeValueBooleanEClass = createEClass(ATTRIBUTE_VALUE_BOOLEAN);
		createEAttribute(attributeValueBooleanEClass, ATTRIBUTE_VALUE_BOOLEAN__THE_VALUE);
		createEReference(attributeValueBooleanEClass, ATTRIBUTE_VALUE_BOOLEAN__DEFINITION);
		createEReference(attributeValueBooleanEClass, ATTRIBUTE_VALUE_BOOLEAN__OWNING_DEFINITION);

		attributeValueSimpleEClass = createEClass(ATTRIBUTE_VALUE_SIMPLE);

		attributeDefinitionDateEClass = createEClass(ATTRIBUTE_DEFINITION_DATE);
		createEReference(attributeDefinitionDateEClass, ATTRIBUTE_DEFINITION_DATE__TYPE);
		createEReference(attributeDefinitionDateEClass, ATTRIBUTE_DEFINITION_DATE__DEFAULT_VALUE);

		datatypeDefinitionDateEClass = createEClass(DATATYPE_DEFINITION_DATE);

		attributeValueDateEClass = createEClass(ATTRIBUTE_VALUE_DATE);
		createEAttribute(attributeValueDateEClass, ATTRIBUTE_VALUE_DATE__THE_VALUE);
		createEReference(attributeValueDateEClass, ATTRIBUTE_VALUE_DATE__DEFINITION);
		createEReference(attributeValueDateEClass, ATTRIBUTE_VALUE_DATE__OWNING_DEFINITION);

		attributeDefinitionEnumerationEClass = createEClass(ATTRIBUTE_DEFINITION_ENUMERATION);
		createEAttribute(attributeDefinitionEnumerationEClass, ATTRIBUTE_DEFINITION_ENUMERATION__MULTI_VALUED);
		createEReference(attributeDefinitionEnumerationEClass, ATTRIBUTE_DEFINITION_ENUMERATION__TYPE);
		createEReference(attributeDefinitionEnumerationEClass, ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULT_VALUE);

		datatypeDefinitionEnumerationEClass = createEClass(DATATYPE_DEFINITION_ENUMERATION);
		createEReference(datatypeDefinitionEnumerationEClass, DATATYPE_DEFINITION_ENUMERATION__SPECIFIED_VALUES);

		enumValueEClass = createEClass(ENUM_VALUE);
		createEReference(enumValueEClass, ENUM_VALUE__PROPERTIES);
		createEReference(enumValueEClass, ENUM_VALUE__);

		embeddedValueEClass = createEClass(EMBEDDED_VALUE);
		createEAttribute(embeddedValueEClass, EMBEDDED_VALUE__KEY);
		createEAttribute(embeddedValueEClass, EMBEDDED_VALUE__OTHER_CONTENT);
		createEReference(embeddedValueEClass, EMBEDDED_VALUE__ENUM_VALUE);

		attributeValueEnumerationEClass = createEClass(ATTRIBUTE_VALUE_ENUMERATION);
		createEReference(attributeValueEnumerationEClass, ATTRIBUTE_VALUE_ENUMERATION__VALUES);
		createEReference(attributeValueEnumerationEClass, ATTRIBUTE_VALUE_ENUMERATION__DEFINITION);
		createEReference(attributeValueEnumerationEClass, ATTRIBUTE_VALUE_ENUMERATION__OWNING_DEFINITION);

		attributeDefinitionIntegerEClass = createEClass(ATTRIBUTE_DEFINITION_INTEGER);
		createEReference(attributeDefinitionIntegerEClass, ATTRIBUTE_DEFINITION_INTEGER__TYPE);
		createEReference(attributeDefinitionIntegerEClass, ATTRIBUTE_DEFINITION_INTEGER__DEFAULT_VALUE);

		datatypeDefinitionIntegerEClass = createEClass(DATATYPE_DEFINITION_INTEGER);
		createEAttribute(datatypeDefinitionIntegerEClass, DATATYPE_DEFINITION_INTEGER__MAX);
		createEAttribute(datatypeDefinitionIntegerEClass, DATATYPE_DEFINITION_INTEGER__MIN);

		attributeValueIntegerEClass = createEClass(ATTRIBUTE_VALUE_INTEGER);
		createEAttribute(attributeValueIntegerEClass, ATTRIBUTE_VALUE_INTEGER__THE_VALUE);
		createEReference(attributeValueIntegerEClass, ATTRIBUTE_VALUE_INTEGER__DEFINITION);
		createEReference(attributeValueIntegerEClass, ATTRIBUTE_VALUE_INTEGER__OWNING_DEFINITION);

		attributeDefinitionRealEClass = createEClass(ATTRIBUTE_DEFINITION_REAL);
		createEReference(attributeDefinitionRealEClass, ATTRIBUTE_DEFINITION_REAL__TYPE);
		createEReference(attributeDefinitionRealEClass, ATTRIBUTE_DEFINITION_REAL__DEFAULT_VALUE);

		datatypeDefinitionRealEClass = createEClass(DATATYPE_DEFINITION_REAL);
		createEAttribute(datatypeDefinitionRealEClass, DATATYPE_DEFINITION_REAL__ACCURACY);
		createEAttribute(datatypeDefinitionRealEClass, DATATYPE_DEFINITION_REAL__MAX);
		createEAttribute(datatypeDefinitionRealEClass, DATATYPE_DEFINITION_REAL__MIN);

		attributeValueRealEClass = createEClass(ATTRIBUTE_VALUE_REAL);
		createEAttribute(attributeValueRealEClass, ATTRIBUTE_VALUE_REAL__THE_VALUE);
		createEReference(attributeValueRealEClass, ATTRIBUTE_VALUE_REAL__DEFINITION);
		createEReference(attributeValueRealEClass, ATTRIBUTE_VALUE_REAL__OWNING_DEFINITION);

		attributeDefinitionStringEClass = createEClass(ATTRIBUTE_DEFINITION_STRING);
		createEReference(attributeDefinitionStringEClass, ATTRIBUTE_DEFINITION_STRING__TYPE);
		createEReference(attributeDefinitionStringEClass, ATTRIBUTE_DEFINITION_STRING__DEFAULT_VALUE);

		datatypeDefinitionStringEClass = createEClass(DATATYPE_DEFINITION_STRING);
		createEAttribute(datatypeDefinitionStringEClass, DATATYPE_DEFINITION_STRING__MAX_LENGTH);

		attributeValueStringEClass = createEClass(ATTRIBUTE_VALUE_STRING);
		createEAttribute(attributeValueStringEClass, ATTRIBUTE_VALUE_STRING__THE_VALUE);
		createEReference(attributeValueStringEClass, ATTRIBUTE_VALUE_STRING__DEFINITION);
		createEReference(attributeValueStringEClass, ATTRIBUTE_VALUE_STRING__OWNING_DEFINITION);
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
		DatatypesPackage theDatatypesPackage = (DatatypesPackage)EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDatatypesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		accessControlledElementEClass.getESuperTypes().add(this.getIdentifiable());
		attributeValueXhtmlEClass.getESuperTypes().add(this.getAttributeValue());
		specElementWithAttributesEClass.getESuperTypes().add(this.getIdentifiable());
		attributeDefinitionXhtmlEClass.getESuperTypes().add(this.getAttributeDefinition());
		attributeDefinitionEClass.getESuperTypes().add(this.getAccessControlledElement());
		specTypeEClass.getESuperTypes().add(this.getIdentifiable());
		specObjectEClass.getESuperTypes().add(this.getSpecElementWithAttributes());
		specObjectTypeEClass.getESuperTypes().add(this.getSpecType());
		specificationEClass.getESuperTypes().add(this.getSpecElementWithAttributes());
		specificationTypeEClass.getESuperTypes().add(this.getSpecType());
		specHierarchyEClass.getESuperTypes().add(this.getAccessControlledElement());
		datatypeDefinitionEClass.getESuperTypes().add(this.getIdentifiable());
		specRelationEClass.getESuperTypes().add(this.getSpecElementWithAttributes());
		specRelationTypeEClass.getESuperTypes().add(this.getSpecType());
		relationGroupEClass.getESuperTypes().add(this.getSpecElementWithAttributes());
		relationGroupTypeEClass.getESuperTypes().add(this.getSpecType());
		datatypeDefinitionXhtmlEClass.getESuperTypes().add(this.getDatatypeDefinition());
		attributeDefinitionBooleanEClass.getESuperTypes().add(this.getAttributeDefinitionSimple());
		attributeDefinitionSimpleEClass.getESuperTypes().add(this.getAttributeDefinition());
		datatypeDefinitionBooleanEClass.getESuperTypes().add(this.getDatatypeDefinitionSimple());
		datatypeDefinitionSimpleEClass.getESuperTypes().add(this.getDatatypeDefinition());
		attributeValueBooleanEClass.getESuperTypes().add(this.getAttributeValueSimple());
		attributeValueSimpleEClass.getESuperTypes().add(this.getAttributeValue());
		attributeDefinitionDateEClass.getESuperTypes().add(this.getAttributeDefinitionSimple());
		datatypeDefinitionDateEClass.getESuperTypes().add(this.getDatatypeDefinitionSimple());
		attributeValueDateEClass.getESuperTypes().add(this.getAttributeValueSimple());
		attributeDefinitionEnumerationEClass.getESuperTypes().add(this.getAttributeDefinition());
		datatypeDefinitionEnumerationEClass.getESuperTypes().add(this.getDatatypeDefinition());
		enumValueEClass.getESuperTypes().add(this.getIdentifiable());
		attributeValueEnumerationEClass.getESuperTypes().add(this.getAttributeValue());
		attributeDefinitionIntegerEClass.getESuperTypes().add(this.getAttributeDefinitionSimple());
		datatypeDefinitionIntegerEClass.getESuperTypes().add(this.getDatatypeDefinitionSimple());
		attributeValueIntegerEClass.getESuperTypes().add(this.getAttributeValueSimple());
		attributeDefinitionRealEClass.getESuperTypes().add(this.getAttributeDefinitionSimple());
		datatypeDefinitionRealEClass.getESuperTypes().add(this.getDatatypeDefinitionSimple());
		attributeValueRealEClass.getESuperTypes().add(this.getAttributeValueSimple());
		attributeDefinitionStringEClass.getESuperTypes().add(this.getAttributeDefinitionSimple());
		datatypeDefinitionStringEClass.getESuperTypes().add(this.getDatatypeDefinitionSimple());
		attributeValueStringEClass.getESuperTypes().add(this.getAttributeValueSimple());

		// Initialize classes and features; add operations and parameters
		initEClass(accessControlledElementEClass, AccessControlledElement.class, "AccessControlledElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessControlledElement_IsEditable(), ecorePackage.getEJavaObject(), "isEditable", null, 0, 1, AccessControlledElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(identifiableEClass, Identifiable.class, "Identifiable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiable_Desc(), ecorePackage.getEString(), "desc", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIdentifiable_Identifier(), theDatatypesPackage.getId(), "identifier", null, 1, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIdentifiable_LastChange(), theDatatypesPackage.getDateTime(), "lastChange", null, 1, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIdentifiable_LongName(), ecorePackage.getEString(), "longName", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIdentifiable_AlternativeId(), this.getAlternativeId(), this.getAlternativeId_Ident(), "alternativeId", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeValueXhtmlEClass, AttributeValueXhtml.class, "AttributeValueXhtml", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeValueXhtml_IsSimplified(), ecorePackage.getEJavaObject(), "isSimplified", null, 0, 1, AttributeValueXhtml.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeValueXhtml_OwningDefinition(), this.getAttributeDefinitionXhtml(), this.getAttributeDefinitionXhtml_DefaultValue(), "owningDefinition", null, 1, 1, AttributeValueXhtml.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeValueXhtml_Definition(), this.getAttributeDefinitionXhtml(), null, "definition", null, 1, 1, AttributeValueXhtml.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeValueXhtml_TheOriginalValue(), theDatatypesPackage.getXhtmlContent(), null, "theOriginalValue", null, 0, 1, AttributeValueXhtml.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeValueXhtml_TheValue(), theDatatypesPackage.getXhtmlContent(), theDatatypesPackage.getXhtmlContent_AttributeValue(), "theValue", null, 1, 1, AttributeValueXhtml.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeValueEClass, AttributeValue.class, "AttributeValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeValue_SpecElAt(), this.getSpecElementWithAttributes(), null, "specElAt", null, 1, 1, AttributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(specElementWithAttributesEClass, SpecElementWithAttributes.class, "SpecElementWithAttributes", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecElementWithAttributes_Values(), this.getAttributeValue(), null, "values", null, 0, -1, SpecElementWithAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeDefinitionXhtmlEClass, AttributeDefinitionXhtml.class, "AttributeDefinitionXhtml", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeDefinitionXhtml_Type(), this.getDatatypeDefinitionXhtml(), null, "type", null, 1, 1, AttributeDefinitionXhtml.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeDefinitionXhtml_DefaultValue(), this.getAttributeValueXhtml(), this.getAttributeValueXhtml_OwningDefinition(), "defaultValue", null, 0, 1, AttributeDefinitionXhtml.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeDefinitionEClass, AttributeDefinition.class, "AttributeDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeDefinition_SpecType(), this.getSpecType(), this.getSpecType_SpecAttributes(), "specType", null, 1, 1, AttributeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(specTypeEClass, SpecType.class, "SpecType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecType_CoreContent(), this.getReqIfContent(), this.getReqIfContent_SpecTypes(), "coreContent", null, 1, 1, SpecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecType_SpecAttributes(), this.getAttributeDefinition(), this.getAttributeDefinition_SpecType(), "specAttributes", null, 0, -1, SpecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(reqIfContentEClass, ReqIfContent.class, "ReqIfContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReqIfContent_DocumentRoot(), this.getReqIf(), this.getReqIf_CoreContent(), "documentRoot", null, 1, 1, ReqIfContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReqIfContent_SpecObjects(), this.getSpecObject(), this.getSpecObject_CoreContent(), "specObjects", null, 0, -1, ReqIfContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReqIfContent_Specifications(), this.getSpecification(), this.getSpecification_CoreContent(), "specifications", null, 0, -1, ReqIfContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReqIfContent_Datatypes(), this.getDatatypeDefinition(), this.getDatatypeDefinition_CoreContent(), "datatypes", null, 0, -1, ReqIfContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReqIfContent_SpecRelations(), this.getSpecRelation(), this.getSpecRelation_CoreContent(), "specRelations", null, 0, -1, ReqIfContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReqIfContent_SpecRelationGroups(), this.getRelationGroup(), this.getRelationGroup_CoreContent(), "specRelationGroups", null, 0, -1, ReqIfContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReqIfContent_SpecTypes(), this.getSpecType(), this.getSpecType_CoreContent(), "specTypes", null, 0, -1, ReqIfContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(reqIfEClass, ReqIf.class, "ReqIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReqIf_Lang(), ecorePackage.getEString(), "lang", null, 0, 1, ReqIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReqIf_TheHeader(), this.getReqIfHeader(), this.getReqIfHeader_DocumentRoot(), "theHeader", null, 1, 1, ReqIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReqIf_ToolExtensions(), this.getReqIfToolExtension(), this.getReqIfToolExtension_DocumentRoot(), "toolExtensions", null, 0, -1, ReqIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReqIf_CoreContent(), this.getReqIfContent(), this.getReqIfContent_DocumentRoot(), "coreContent", null, 1, 1, ReqIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(reqIfHeaderEClass, ReqIfHeader.class, "ReqIfHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReqIfHeader_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, ReqIfHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReqIfHeader_CreationTime(), theDatatypesPackage.getDateTime(), "creationTime", null, 1, 1, ReqIfHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReqIfHeader_Identifier(), theDatatypesPackage.getId(), "identifier", null, 1, 1, ReqIfHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReqIfHeader_RepositoryId(), ecorePackage.getEString(), "repositoryId", null, 0, 1, ReqIfHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReqIfHeader_ReqIfToolId(), ecorePackage.getEString(), "reqIfToolId", null, 1, 1, ReqIfHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReqIfHeader_ReqIfVersion(), ecorePackage.getEString(), "reqIfVersion", null, 1, 1, ReqIfHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReqIfHeader_SourceToolId(), ecorePackage.getEString(), "sourceToolId", null, 1, 1, ReqIfHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReqIfHeader_Title(), ecorePackage.getEString(), "title", null, 1, 1, ReqIfHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReqIfHeader_DocumentRoot(), this.getReqIf(), this.getReqIf_TheHeader(), "documentRoot", null, 1, 1, ReqIfHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(reqIfToolExtensionEClass, ReqIfToolExtension.class, "ReqIfToolExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReqIfToolExtension_DocumentRoot(), this.getReqIf(), this.getReqIf_ToolExtensions(), "documentRoot", null, 1, 1, ReqIfToolExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(specObjectEClass, SpecObject.class, "SpecObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecObject_Type(), this.getSpecObjectType(), null, "type", null, 1, 1, SpecObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecObject_CoreContent(), this.getReqIfContent(), this.getReqIfContent_SpecObjects(), "coreContent", null, 1, 1, SpecObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(specObjectTypeEClass, SpecObjectType.class, "SpecObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificationEClass, Specification.class, "Specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecification_Type(), this.getSpecificationType(), null, "type", null, 1, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecification_Children(), this.getSpecHierarchy(), this.getSpecHierarchy_Root(), "children", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_CoreContent(), this.getReqIfContent(), this.getReqIfContent_Specifications(), "coreContent", null, 1, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(specificationTypeEClass, SpecificationType.class, "SpecificationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specHierarchyEClass, SpecHierarchy.class, "SpecHierarchy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecHierarchy_IsTableInternal(), ecorePackage.getEJavaObject(), "isTableInternal", null, 0, 1, SpecHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecHierarchy_Object(), this.getSpecObject(), null, "object", null, 1, 1, SpecHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecHierarchy_Parent(), this.getSpecHierarchy(), this.getSpecHierarchy_Children(), "parent", null, 0, 1, SpecHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecHierarchy_Children(), this.getSpecHierarchy(), this.getSpecHierarchy_Parent(), "children", null, 0, -1, SpecHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecHierarchy_EditableAtts(), this.getAttributeDefinition(), null, "editableAtts", null, 0, -1, SpecHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecHierarchy_Root(), this.getSpecification(), this.getSpecification_Children(), "root", null, 0, 1, SpecHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(datatypeDefinitionEClass, DatatypeDefinition.class, "DatatypeDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatatypeDefinition_CoreContent(), this.getReqIfContent(), this.getReqIfContent_Datatypes(), "coreContent", null, 1, 1, DatatypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(specRelationEClass, SpecRelation.class, "SpecRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecRelation_Target(), this.getSpecObject(), null, "target", null, 1, 1, SpecRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecRelation_Source(), this.getSpecObject(), null, "source", null, 1, 1, SpecRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecRelation_Type(), this.getSpecRelationType(), null, "type", null, 1, 1, SpecRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpecRelation_CoreContent(), this.getReqIfContent(), this.getReqIfContent_SpecRelations(), "coreContent", null, 1, 1, SpecRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(specRelationTypeEClass, SpecRelationType.class, "SpecRelationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationGroupEClass, RelationGroup.class, "RelationGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationGroup_SpecRelations(), this.getSpecRelation(), null, "specRelations", null, 0, -1, RelationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationGroup_Type(), this.getRelationGroupType(), null, "type", null, 1, 1, RelationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationGroup_SourceSpecification(), this.getSpecification(), null, "sourceSpecification", null, 1, 1, RelationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationGroup_TargetSpecification(), this.getSpecification(), null, "targetSpecification", null, 1, 1, RelationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationGroup_CoreContent(), this.getReqIfContent(), this.getReqIfContent_SpecRelationGroups(), "coreContent", null, 1, 1, RelationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(relationGroupTypeEClass, RelationGroupType.class, "RelationGroupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(datatypeDefinitionXhtmlEClass, DatatypeDefinitionXhtml.class, "DatatypeDefinitionXhtml", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alternativeIdEClass, AlternativeId.class, "AlternativeId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlternativeId_Identifier(), ecorePackage.getEJavaObject(), "identifier", null, 1, 1, AlternativeId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAlternativeId_Ident(), this.getIdentifiable(), this.getIdentifiable_AlternativeId(), "ident", null, 1, 1, AlternativeId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeDefinitionBooleanEClass, AttributeDefinitionBoolean.class, "AttributeDefinitionBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeDefinitionBoolean_Type(), this.getDatatypeDefinitionBoolean(), null, "type", null, 1, 1, AttributeDefinitionBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeDefinitionBoolean_DefaultValue(), this.getAttributeValueBoolean(), this.getAttributeValueBoolean_OwningDefinition(), "defaultValue", null, 0, 1, AttributeDefinitionBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeDefinitionSimpleEClass, AttributeDefinitionSimple.class, "AttributeDefinitionSimple", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(datatypeDefinitionBooleanEClass, DatatypeDefinitionBoolean.class, "DatatypeDefinitionBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(datatypeDefinitionSimpleEClass, DatatypeDefinitionSimple.class, "DatatypeDefinitionSimple", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeValueBooleanEClass, AttributeValueBoolean.class, "AttributeValueBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeValueBoolean_TheValue(), ecorePackage.getEBooleanObject(), "theValue", null, 1, 1, AttributeValueBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeValueBoolean_Definition(), this.getAttributeDefinitionBoolean(), null, "definition", null, 1, 1, AttributeValueBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeValueBoolean_OwningDefinition(), this.getAttributeDefinitionBoolean(), this.getAttributeDefinitionBoolean_DefaultValue(), "owningDefinition", null, 1, 1, AttributeValueBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeValueSimpleEClass, AttributeValueSimple.class, "AttributeValueSimple", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeDefinitionDateEClass, AttributeDefinitionDate.class, "AttributeDefinitionDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeDefinitionDate_Type(), this.getDatatypeDefinitionDate(), null, "type", null, 1, 1, AttributeDefinitionDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeDefinitionDate_DefaultValue(), this.getAttributeValueDate(), this.getAttributeValueDate_OwningDefinition(), "defaultValue", null, 0, 1, AttributeDefinitionDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(datatypeDefinitionDateEClass, DatatypeDefinitionDate.class, "DatatypeDefinitionDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeValueDateEClass, AttributeValueDate.class, "AttributeValueDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeValueDate_TheValue(), theDatatypesPackage.getDateTime(), "theValue", null, 1, 1, AttributeValueDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeValueDate_Definition(), this.getAttributeDefinitionDate(), null, "definition", null, 1, 1, AttributeValueDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeValueDate_OwningDefinition(), this.getAttributeDefinitionDate(), this.getAttributeDefinitionDate_DefaultValue(), "owningDefinition", null, 1, 1, AttributeValueDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeDefinitionEnumerationEClass, AttributeDefinitionEnumeration.class, "AttributeDefinitionEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeDefinitionEnumeration_MultiValued(), ecorePackage.getEBooleanObject(), "multiValued", null, 1, 1, AttributeDefinitionEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeDefinitionEnumeration_Type(), this.getDatatypeDefinitionEnumeration(), null, "type", null, 1, 1, AttributeDefinitionEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeDefinitionEnumeration_DefaultValue(), this.getAttributeValueEnumeration(), this.getAttributeValueEnumeration_OwningDefinition(), "defaultValue", null, 0, 1, AttributeDefinitionEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(datatypeDefinitionEnumerationEClass, DatatypeDefinitionEnumeration.class, "DatatypeDefinitionEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatatypeDefinitionEnumeration_SpecifiedValues(), this.getEnumValue(), this.getEnumValue__(), "specifiedValues", null, 0, -1, DatatypeDefinitionEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumValueEClass, EnumValue.class, "EnumValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumValue_Properties(), this.getEmbeddedValue(), this.getEmbeddedValue_EnumValue(), "properties", null, 1, 1, EnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEnumValue__(), this.getDatatypeDefinitionEnumeration(), this.getDatatypeDefinitionEnumeration_SpecifiedValues(), "_", null, 1, 1, EnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(embeddedValueEClass, EmbeddedValue.class, "EmbeddedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmbeddedValue_Key(), ecorePackage.getEJavaObject(), "key", null, 1, 1, EmbeddedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEmbeddedValue_OtherContent(), ecorePackage.getEJavaObject(), "otherContent", null, 1, 1, EmbeddedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEmbeddedValue_EnumValue(), this.getEnumValue(), this.getEnumValue_Properties(), "enumValue", null, 1, 1, EmbeddedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeValueEnumerationEClass, AttributeValueEnumeration.class, "AttributeValueEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeValueEnumeration_Values(), this.getEnumValue(), null, "values", null, 0, -1, AttributeValueEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeValueEnumeration_Definition(), this.getAttributeDefinitionEnumeration(), null, "definition", null, 1, 1, AttributeValueEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeValueEnumeration_OwningDefinition(), this.getAttributeDefinitionEnumeration(), this.getAttributeDefinitionEnumeration_DefaultValue(), "owningDefinition", null, 1, 1, AttributeValueEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeDefinitionIntegerEClass, AttributeDefinitionInteger.class, "AttributeDefinitionInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeDefinitionInteger_Type(), this.getDatatypeDefinitionInteger(), null, "type", null, 1, 1, AttributeDefinitionInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeDefinitionInteger_DefaultValue(), this.getAttributeValueInteger(), this.getAttributeValueInteger_OwningDefinition(), "defaultValue", null, 0, 1, AttributeDefinitionInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(datatypeDefinitionIntegerEClass, DatatypeDefinitionInteger.class, "DatatypeDefinitionInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatatypeDefinitionInteger_Max(), ecorePackage.getEBigInteger(), "max", null, 1, 1, DatatypeDefinitionInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDatatypeDefinitionInteger_Min(), ecorePackage.getEBigInteger(), "min", null, 1, 1, DatatypeDefinitionInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeValueIntegerEClass, AttributeValueInteger.class, "AttributeValueInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeValueInteger_TheValue(), ecorePackage.getEBigInteger(), "theValue", null, 1, 1, AttributeValueInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeValueInteger_Definition(), this.getAttributeDefinitionInteger(), null, "definition", null, 1, 1, AttributeValueInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeValueInteger_OwningDefinition(), this.getAttributeDefinitionInteger(), this.getAttributeDefinitionInteger_DefaultValue(), "owningDefinition", null, 1, 1, AttributeValueInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeDefinitionRealEClass, AttributeDefinitionReal.class, "AttributeDefinitionReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeDefinitionReal_Type(), this.getDatatypeDefinitionReal(), null, "type", null, 1, 1, AttributeDefinitionReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeDefinitionReal_DefaultValue(), this.getAttributeValueReal(), this.getAttributeValueReal_OwningDefinition(), "defaultValue", null, 0, 1, AttributeDefinitionReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(datatypeDefinitionRealEClass, DatatypeDefinitionReal.class, "DatatypeDefinitionReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatatypeDefinitionReal_Accuracy(), ecorePackage.getEJavaObject(), "accuracy", null, 1, 1, DatatypeDefinitionReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDatatypeDefinitionReal_Max(), ecorePackage.getEDoubleObject(), "max", null, 1, 1, DatatypeDefinitionReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDatatypeDefinitionReal_Min(), ecorePackage.getEDoubleObject(), "min", null, 1, 1, DatatypeDefinitionReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeValueRealEClass, AttributeValueReal.class, "AttributeValueReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeValueReal_TheValue(), ecorePackage.getEDoubleObject(), "theValue", null, 1, 1, AttributeValueReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeValueReal_Definition(), this.getAttributeDefinitionReal(), null, "definition", null, 1, 1, AttributeValueReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeValueReal_OwningDefinition(), this.getAttributeDefinitionReal(), this.getAttributeDefinitionReal_DefaultValue(), "owningDefinition", null, 1, 1, AttributeValueReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeDefinitionStringEClass, AttributeDefinitionString.class, "AttributeDefinitionString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeDefinitionString_Type(), this.getDatatypeDefinitionString(), null, "type", null, 1, 1, AttributeDefinitionString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeDefinitionString_DefaultValue(), this.getAttributeValueString(), this.getAttributeValueString_OwningDefinition(), "defaultValue", null, 0, 1, AttributeDefinitionString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(datatypeDefinitionStringEClass, DatatypeDefinitionString.class, "DatatypeDefinitionString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatatypeDefinitionString_MaxLength(), ecorePackage.getEBigInteger(), "maxLength", null, 1, 1, DatatypeDefinitionString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(attributeValueStringEClass, AttributeValueString.class, "AttributeValueString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeValueString_TheValue(), ecorePackage.getEString(), "theValue", null, 1, 1, AttributeValueString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeValueString_Definition(), this.getAttributeDefinitionString(), null, "definition", null, 1, 1, AttributeValueString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAttributeValueString_OwningDefinition(), this.getAttributeDefinitionString(), this.getAttributeDefinitionString_DefaultValue(), "owningDefinition", null, 1, 1, AttributeValueString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ReqIfPackageImpl
