/**
 * Copyright (c) 2013 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.reqif10.impl;

import java.util.GregorianCalendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.eclipse.rmf.reqif10.AccessControlledElement;
import org.eclipse.rmf.reqif10.AlternativeID;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionBoolean;
import org.eclipse.rmf.reqif10.AttributeDefinitionDate;
import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeDefinitionInteger;
import org.eclipse.rmf.reqif10.AttributeDefinitionReal;
import org.eclipse.rmf.reqif10.AttributeDefinitionSimple;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeDefinitionXHTML;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueBoolean;
import org.eclipse.rmf.reqif10.AttributeValueDate;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueInteger;
import org.eclipse.rmf.reqif10.AttributeValueReal;
import org.eclipse.rmf.reqif10.AttributeValueSimple;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean;
import org.eclipse.rmf.reqif10.DatatypeDefinitionDate;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.DatatypeDefinitionInteger;
import org.eclipse.rmf.reqif10.DatatypeDefinitionReal;
import org.eclipse.rmf.reqif10.DatatypeDefinitionSimple;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.DatatypeDefinitionXHTML;
import org.eclipse.rmf.reqif10.EmbeddedValue;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.rmf.reqif10.RelationGroup;
import org.eclipse.rmf.reqif10.RelationGroupType;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.ReqIFHeader;
import org.eclipse.rmf.reqif10.ReqIFToolExtension;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.SpecRelationType;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.SpecificationType;
import org.eclipse.rmf.reqif10.XhtmlContent;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class ReqIF10PackageImpl extends EPackageImpl implements ReqIF10Package {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass accessControlledElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass identifiableEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass attributeValueXHTMLEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass attributeValueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass specElementWithAttributesEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass attributeDefinitionXHTMLEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass attributeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass specTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass reqIFContentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass reqIFEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass reqIFHeaderEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass reqIFToolExtensionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass specObjectEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass specObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass specificationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass specificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass specHierarchyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass datatypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass specRelationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass specRelationTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass relationGroupEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass relationGroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass datatypeDefinitionXHTMLEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass alternativeIDEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass attributeDefinitionBooleanEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass attributeDefinitionSimpleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass datatypeDefinitionBooleanEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass datatypeDefinitionSimpleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass attributeValueBooleanEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass attributeValueSimpleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass attributeDefinitionDateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass datatypeDefinitionDateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass attributeValueDateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass attributeDefinitionEnumerationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass datatypeDefinitionEnumerationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass enumValueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass embeddedValueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass attributeValueEnumerationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass attributeDefinitionIntegerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass datatypeDefinitionIntegerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass attributeValueIntegerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass attributeDefinitionRealEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass datatypeDefinitionRealEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass attributeValueRealEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass attributeDefinitionStringEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass datatypeDefinitionStringEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass attributeValueStringEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass xhtmlContentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType dateTimeEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType idEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
	 * EPackage.Registry} by the package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
	 * performs initialization of the package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReqIF10PackageImpl() {
		super(eNS_URI, ReqIF10Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * <p>
	 * This method is used to initialize {@link ReqIF10Package#eINSTANCE} when that field is accessed. Clients should
	 * not invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReqIF10Package init() {
		if (isInited)
			return (ReqIF10Package) EPackage.Registry.INSTANCE.getEPackage(ReqIF10Package.eNS_URI);

		// Obtain or create and register package
		ReqIF10PackageImpl theReqIF10Package = (ReqIF10PackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ReqIF10PackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new ReqIF10PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theReqIF10Package.createPackageContents();

		// Initialize created meta-data
		theReqIF10Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReqIF10Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReqIF10Package.eNS_URI, theReqIF10Package);
		return theReqIF10Package;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAccessControlledElement() {
		return accessControlledElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAccessControlledElement_Editable() {
		return (EAttribute) accessControlledElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIdentifiable() {
		return identifiableEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIdentifiable_Desc() {
		return (EAttribute) identifiableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIdentifiable_Identifier() {
		return (EAttribute) identifiableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIdentifiable_LastChange() {
		return (EAttribute) identifiableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getIdentifiable_LongName() {
		return (EAttribute) identifiableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getIdentifiable_AlternativeID() {
		return (EReference) identifiableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAttributeValueXHTML() {
		return attributeValueXHTMLEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAttributeValueXHTML_Simplified() {
		return (EAttribute) attributeValueXHTMLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttributeValueXHTML_Definition() {
		return (EReference) attributeValueXHTMLEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttributeValueXHTML_TheOriginalValue() {
		return (EReference) attributeValueXHTMLEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttributeValueXHTML_TheValue() {
		return (EReference) attributeValueXHTMLEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAttributeValue() {
		return attributeValueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSpecElementWithAttributes() {
		return specElementWithAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSpecElementWithAttributes_Values() {
		return (EReference) specElementWithAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAttributeDefinitionXHTML() {
		return attributeDefinitionXHTMLEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttributeDefinitionXHTML_Type() {
		return (EReference) attributeDefinitionXHTMLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttributeDefinitionXHTML_DefaultValue() {
		return (EReference) attributeDefinitionXHTMLEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAttributeDefinition() {
		return attributeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSpecType() {
		return specTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSpecType_SpecAttributes() {
		return (EReference) specTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getReqIFContent() {
		return reqIFContentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getReqIFContent_Datatypes() {
		return (EReference) reqIFContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getReqIFContent_SpecTypes() {
		return (EReference) reqIFContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getReqIFContent_SpecObjects() {
		return (EReference) reqIFContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getReqIFContent_SpecRelations() {
		return (EReference) reqIFContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getReqIFContent_Specifications() {
		return (EReference) reqIFContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getReqIFContent_SpecRelationGroups() {
		return (EReference) reqIFContentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getReqIF() {
		return reqIFEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getReqIF_Lang() {
		return (EAttribute) reqIFEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getReqIF_TheHeader() {
		return (EReference) reqIFEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getReqIF_CoreContent() {
		return (EReference) reqIFEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getReqIF_ToolExtensions() {
		return (EReference) reqIFEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getReqIFHeader() {
		return reqIFHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getReqIFHeader_Comment() {
		return (EAttribute) reqIFHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getReqIFHeader_CreationTime() {
		return (EAttribute) reqIFHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getReqIFHeader_Identifier() {
		return (EAttribute) reqIFHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getReqIFHeader_RepositoryId() {
		return (EAttribute) reqIFHeaderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getReqIFHeader_ReqIFToolId() {
		return (EAttribute) reqIFHeaderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getReqIFHeader_ReqIFVersion() {
		return (EAttribute) reqIFHeaderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getReqIFHeader_SourceToolId() {
		return (EAttribute) reqIFHeaderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getReqIFHeader_Title() {
		return (EAttribute) reqIFHeaderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getReqIFToolExtension() {
		return reqIFToolExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getReqIFToolExtension_Extensions() {
		return (EReference) reqIFToolExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSpecObject() {
		return specObjectEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSpecObject_Type() {
		return (EReference) specObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSpecObjectType() {
		return specObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSpecification() {
		return specificationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSpecification_Type() {
		return (EReference) specificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSpecification_Children() {
		return (EReference) specificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSpecificationType() {
		return specificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSpecHierarchy() {
		return specHierarchyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getSpecHierarchy_TableInternal() {
		return (EAttribute) specHierarchyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSpecHierarchy_Object() {
		return (EReference) specHierarchyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSpecHierarchy_Children() {
		return (EReference) specHierarchyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSpecHierarchy_EditableAtts() {
		return (EReference) specHierarchyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDatatypeDefinition() {
		return datatypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSpecRelation() {
		return specRelationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSpecRelation_Target() {
		return (EReference) specRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSpecRelation_Source() {
		return (EReference) specRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getSpecRelation_Type() {
		return (EReference) specRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getSpecRelationType() {
		return specRelationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRelationGroup() {
		return relationGroupEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRelationGroup_SpecRelations() {
		return (EReference) relationGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRelationGroup_Type() {
		return (EReference) relationGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRelationGroup_SourceSpecification() {
		return (EReference) relationGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getRelationGroup_TargetSpecification() {
		return (EReference) relationGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getRelationGroupType() {
		return relationGroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDatatypeDefinitionXHTML() {
		return datatypeDefinitionXHTMLEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAlternativeID() {
		return alternativeIDEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAlternativeID_Identifier() {
		return (EAttribute) alternativeIDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAttributeDefinitionBoolean() {
		return attributeDefinitionBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttributeDefinitionBoolean_Type() {
		return (EReference) attributeDefinitionBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttributeDefinitionBoolean_DefaultValue() {
		return (EReference) attributeDefinitionBooleanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAttributeDefinitionSimple() {
		return attributeDefinitionSimpleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDatatypeDefinitionBoolean() {
		return datatypeDefinitionBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDatatypeDefinitionSimple() {
		return datatypeDefinitionSimpleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAttributeValueBoolean() {
		return attributeValueBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAttributeValueBoolean_TheValue() {
		return (EAttribute) attributeValueBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttributeValueBoolean_Definition() {
		return (EReference) attributeValueBooleanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAttributeValueSimple() {
		return attributeValueSimpleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAttributeDefinitionDate() {
		return attributeDefinitionDateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttributeDefinitionDate_Type() {
		return (EReference) attributeDefinitionDateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttributeDefinitionDate_DefaultValue() {
		return (EReference) attributeDefinitionDateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDatatypeDefinitionDate() {
		return datatypeDefinitionDateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAttributeValueDate() {
		return attributeValueDateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAttributeValueDate_TheValue() {
		return (EAttribute) attributeValueDateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttributeValueDate_Definition() {
		return (EReference) attributeValueDateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAttributeDefinitionEnumeration() {
		return attributeDefinitionEnumerationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAttributeDefinitionEnumeration_MultiValued() {
		return (EAttribute) attributeDefinitionEnumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttributeDefinitionEnumeration_Type() {
		return (EReference) attributeDefinitionEnumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttributeDefinitionEnumeration_DefaultValue() {
		return (EReference) attributeDefinitionEnumerationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDatatypeDefinitionEnumeration() {
		return datatypeDefinitionEnumerationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getDatatypeDefinitionEnumeration_SpecifiedValues() {
		return (EReference) datatypeDefinitionEnumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEnumValue() {
		return enumValueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEnumValue_Properties() {
		return (EReference) enumValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEmbeddedValue() {
		return embeddedValueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEmbeddedValue_Key() {
		return (EAttribute) embeddedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEmbeddedValue_OtherContent() {
		return (EAttribute) embeddedValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAttributeValueEnumeration() {
		return attributeValueEnumerationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttributeValueEnumeration_Values() {
		return (EReference) attributeValueEnumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttributeValueEnumeration_Definition() {
		return (EReference) attributeValueEnumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAttributeDefinitionInteger() {
		return attributeDefinitionIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttributeDefinitionInteger_Type() {
		return (EReference) attributeDefinitionIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttributeDefinitionInteger_DefaultValue() {
		return (EReference) attributeDefinitionIntegerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDatatypeDefinitionInteger() {
		return datatypeDefinitionIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDatatypeDefinitionInteger_Max() {
		return (EAttribute) datatypeDefinitionIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDatatypeDefinitionInteger_Min() {
		return (EAttribute) datatypeDefinitionIntegerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAttributeValueInteger() {
		return attributeValueIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAttributeValueInteger_TheValue() {
		return (EAttribute) attributeValueIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttributeValueInteger_Definition() {
		return (EReference) attributeValueIntegerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAttributeDefinitionReal() {
		return attributeDefinitionRealEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttributeDefinitionReal_Type() {
		return (EReference) attributeDefinitionRealEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttributeDefinitionReal_DefaultValue() {
		return (EReference) attributeDefinitionRealEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDatatypeDefinitionReal() {
		return datatypeDefinitionRealEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDatatypeDefinitionReal_Accuracy() {
		return (EAttribute) datatypeDefinitionRealEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDatatypeDefinitionReal_Max() {
		return (EAttribute) datatypeDefinitionRealEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDatatypeDefinitionReal_Min() {
		return (EAttribute) datatypeDefinitionRealEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAttributeValueReal() {
		return attributeValueRealEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAttributeValueReal_TheValue() {
		return (EAttribute) attributeValueRealEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttributeValueReal_Definition() {
		return (EReference) attributeValueRealEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAttributeDefinitionString() {
		return attributeDefinitionStringEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttributeDefinitionString_Type() {
		return (EReference) attributeDefinitionStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttributeDefinitionString_DefaultValue() {
		return (EReference) attributeDefinitionStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getDatatypeDefinitionString() {
		return datatypeDefinitionStringEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getDatatypeDefinitionString_MaxLength() {
		return (EAttribute) datatypeDefinitionStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAttributeValueString() {
		return attributeValueStringEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAttributeValueString_TheValue() {
		return (EAttribute) attributeValueStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAttributeValueString_Definition() {
		return (EReference) attributeValueStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getXhtmlContent() {
		return xhtmlContentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getXhtmlContent_Xhtml() {
		return (EReference) xhtmlContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getXhtmlContent_XhtmlSource() {
		return (EAttribute) xhtmlContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getDateTime() {
		return dateTimeEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getID() {
		return idEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ReqIF10Factory getReqIF10Factory() {
		return (ReqIF10Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to have no affect on any invocation but
	 * its first. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		accessControlledElementEClass = createEClass(ACCESS_CONTROLLED_ELEMENT);
		createEAttribute(accessControlledElementEClass, ACCESS_CONTROLLED_ELEMENT__EDITABLE);

		identifiableEClass = createEClass(IDENTIFIABLE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__DESC);
		createEAttribute(identifiableEClass, IDENTIFIABLE__IDENTIFIER);
		createEAttribute(identifiableEClass, IDENTIFIABLE__LAST_CHANGE);
		createEAttribute(identifiableEClass, IDENTIFIABLE__LONG_NAME);
		createEReference(identifiableEClass, IDENTIFIABLE__ALTERNATIVE_ID);

		attributeValueXHTMLEClass = createEClass(ATTRIBUTE_VALUE_XHTML);
		createEAttribute(attributeValueXHTMLEClass, ATTRIBUTE_VALUE_XHTML__SIMPLIFIED);
		createEReference(attributeValueXHTMLEClass, ATTRIBUTE_VALUE_XHTML__DEFINITION);
		createEReference(attributeValueXHTMLEClass, ATTRIBUTE_VALUE_XHTML__THE_ORIGINAL_VALUE);
		createEReference(attributeValueXHTMLEClass, ATTRIBUTE_VALUE_XHTML__THE_VALUE);

		attributeValueEClass = createEClass(ATTRIBUTE_VALUE);

		specElementWithAttributesEClass = createEClass(SPEC_ELEMENT_WITH_ATTRIBUTES);
		createEReference(specElementWithAttributesEClass, SPEC_ELEMENT_WITH_ATTRIBUTES__VALUES);

		attributeDefinitionXHTMLEClass = createEClass(ATTRIBUTE_DEFINITION_XHTML);
		createEReference(attributeDefinitionXHTMLEClass, ATTRIBUTE_DEFINITION_XHTML__TYPE);
		createEReference(attributeDefinitionXHTMLEClass, ATTRIBUTE_DEFINITION_XHTML__DEFAULT_VALUE);

		attributeDefinitionEClass = createEClass(ATTRIBUTE_DEFINITION);

		specTypeEClass = createEClass(SPEC_TYPE);
		createEReference(specTypeEClass, SPEC_TYPE__SPEC_ATTRIBUTES);

		reqIFContentEClass = createEClass(REQ_IF_CONTENT);
		createEReference(reqIFContentEClass, REQ_IF_CONTENT__DATATYPES);
		createEReference(reqIFContentEClass, REQ_IF_CONTENT__SPEC_TYPES);
		createEReference(reqIFContentEClass, REQ_IF_CONTENT__SPEC_OBJECTS);
		createEReference(reqIFContentEClass, REQ_IF_CONTENT__SPEC_RELATIONS);
		createEReference(reqIFContentEClass, REQ_IF_CONTENT__SPECIFICATIONS);
		createEReference(reqIFContentEClass, REQ_IF_CONTENT__SPEC_RELATION_GROUPS);

		reqIFEClass = createEClass(REQ_IF);
		createEAttribute(reqIFEClass, REQ_IF__LANG);
		createEReference(reqIFEClass, REQ_IF__THE_HEADER);
		createEReference(reqIFEClass, REQ_IF__CORE_CONTENT);
		createEReference(reqIFEClass, REQ_IF__TOOL_EXTENSIONS);

		reqIFHeaderEClass = createEClass(REQ_IF_HEADER);
		createEAttribute(reqIFHeaderEClass, REQ_IF_HEADER__COMMENT);
		createEAttribute(reqIFHeaderEClass, REQ_IF_HEADER__CREATION_TIME);
		createEAttribute(reqIFHeaderEClass, REQ_IF_HEADER__IDENTIFIER);
		createEAttribute(reqIFHeaderEClass, REQ_IF_HEADER__REPOSITORY_ID);
		createEAttribute(reqIFHeaderEClass, REQ_IF_HEADER__REQ_IF_TOOL_ID);
		createEAttribute(reqIFHeaderEClass, REQ_IF_HEADER__REQ_IF_VERSION);
		createEAttribute(reqIFHeaderEClass, REQ_IF_HEADER__SOURCE_TOOL_ID);
		createEAttribute(reqIFHeaderEClass, REQ_IF_HEADER__TITLE);

		reqIFToolExtensionEClass = createEClass(REQ_IF_TOOL_EXTENSION);
		createEReference(reqIFToolExtensionEClass, REQ_IF_TOOL_EXTENSION__EXTENSIONS);

		specObjectEClass = createEClass(SPEC_OBJECT);
		createEReference(specObjectEClass, SPEC_OBJECT__TYPE);

		specObjectTypeEClass = createEClass(SPEC_OBJECT_TYPE);

		specificationEClass = createEClass(SPECIFICATION);
		createEReference(specificationEClass, SPECIFICATION__TYPE);
		createEReference(specificationEClass, SPECIFICATION__CHILDREN);

		specificationTypeEClass = createEClass(SPECIFICATION_TYPE);

		specHierarchyEClass = createEClass(SPEC_HIERARCHY);
		createEAttribute(specHierarchyEClass, SPEC_HIERARCHY__TABLE_INTERNAL);
		createEReference(specHierarchyEClass, SPEC_HIERARCHY__OBJECT);
		createEReference(specHierarchyEClass, SPEC_HIERARCHY__CHILDREN);
		createEReference(specHierarchyEClass, SPEC_HIERARCHY__EDITABLE_ATTS);

		datatypeDefinitionEClass = createEClass(DATATYPE_DEFINITION);

		specRelationEClass = createEClass(SPEC_RELATION);
		createEReference(specRelationEClass, SPEC_RELATION__TARGET);
		createEReference(specRelationEClass, SPEC_RELATION__SOURCE);
		createEReference(specRelationEClass, SPEC_RELATION__TYPE);

		specRelationTypeEClass = createEClass(SPEC_RELATION_TYPE);

		relationGroupEClass = createEClass(RELATION_GROUP);
		createEReference(relationGroupEClass, RELATION_GROUP__SPEC_RELATIONS);
		createEReference(relationGroupEClass, RELATION_GROUP__TYPE);
		createEReference(relationGroupEClass, RELATION_GROUP__SOURCE_SPECIFICATION);
		createEReference(relationGroupEClass, RELATION_GROUP__TARGET_SPECIFICATION);

		relationGroupTypeEClass = createEClass(RELATION_GROUP_TYPE);

		datatypeDefinitionXHTMLEClass = createEClass(DATATYPE_DEFINITION_XHTML);

		alternativeIDEClass = createEClass(ALTERNATIVE_ID);
		createEAttribute(alternativeIDEClass, ALTERNATIVE_ID__IDENTIFIER);

		attributeDefinitionBooleanEClass = createEClass(ATTRIBUTE_DEFINITION_BOOLEAN);
		createEReference(attributeDefinitionBooleanEClass, ATTRIBUTE_DEFINITION_BOOLEAN__TYPE);
		createEReference(attributeDefinitionBooleanEClass, ATTRIBUTE_DEFINITION_BOOLEAN__DEFAULT_VALUE);

		attributeDefinitionSimpleEClass = createEClass(ATTRIBUTE_DEFINITION_SIMPLE);

		datatypeDefinitionBooleanEClass = createEClass(DATATYPE_DEFINITION_BOOLEAN);

		datatypeDefinitionSimpleEClass = createEClass(DATATYPE_DEFINITION_SIMPLE);

		attributeValueBooleanEClass = createEClass(ATTRIBUTE_VALUE_BOOLEAN);
		createEAttribute(attributeValueBooleanEClass, ATTRIBUTE_VALUE_BOOLEAN__THE_VALUE);
		createEReference(attributeValueBooleanEClass, ATTRIBUTE_VALUE_BOOLEAN__DEFINITION);

		attributeValueSimpleEClass = createEClass(ATTRIBUTE_VALUE_SIMPLE);

		attributeDefinitionDateEClass = createEClass(ATTRIBUTE_DEFINITION_DATE);
		createEReference(attributeDefinitionDateEClass, ATTRIBUTE_DEFINITION_DATE__TYPE);
		createEReference(attributeDefinitionDateEClass, ATTRIBUTE_DEFINITION_DATE__DEFAULT_VALUE);

		datatypeDefinitionDateEClass = createEClass(DATATYPE_DEFINITION_DATE);

		attributeValueDateEClass = createEClass(ATTRIBUTE_VALUE_DATE);
		createEAttribute(attributeValueDateEClass, ATTRIBUTE_VALUE_DATE__THE_VALUE);
		createEReference(attributeValueDateEClass, ATTRIBUTE_VALUE_DATE__DEFINITION);

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

		attributeDefinitionIntegerEClass = createEClass(ATTRIBUTE_DEFINITION_INTEGER);
		createEReference(attributeDefinitionIntegerEClass, ATTRIBUTE_DEFINITION_INTEGER__TYPE);
		createEReference(attributeDefinitionIntegerEClass, ATTRIBUTE_DEFINITION_INTEGER__DEFAULT_VALUE);

		datatypeDefinitionIntegerEClass = createEClass(DATATYPE_DEFINITION_INTEGER);
		createEAttribute(datatypeDefinitionIntegerEClass, DATATYPE_DEFINITION_INTEGER__MAX);
		createEAttribute(datatypeDefinitionIntegerEClass, DATATYPE_DEFINITION_INTEGER__MIN);

		attributeValueIntegerEClass = createEClass(ATTRIBUTE_VALUE_INTEGER);
		createEAttribute(attributeValueIntegerEClass, ATTRIBUTE_VALUE_INTEGER__THE_VALUE);
		createEReference(attributeValueIntegerEClass, ATTRIBUTE_VALUE_INTEGER__DEFINITION);

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

		attributeDefinitionStringEClass = createEClass(ATTRIBUTE_DEFINITION_STRING);
		createEReference(attributeDefinitionStringEClass, ATTRIBUTE_DEFINITION_STRING__TYPE);
		createEReference(attributeDefinitionStringEClass, ATTRIBUTE_DEFINITION_STRING__DEFAULT_VALUE);

		datatypeDefinitionStringEClass = createEClass(DATATYPE_DEFINITION_STRING);
		createEAttribute(datatypeDefinitionStringEClass, DATATYPE_DEFINITION_STRING__MAX_LENGTH);

		attributeValueStringEClass = createEClass(ATTRIBUTE_VALUE_STRING);
		createEAttribute(attributeValueStringEClass, ATTRIBUTE_VALUE_STRING__THE_VALUE);
		createEReference(attributeValueStringEClass, ATTRIBUTE_VALUE_STRING__DEFINITION);

		xhtmlContentEClass = createEClass(XHTML_CONTENT);
		createEReference(xhtmlContentEClass, XHTML_CONTENT__XHTML);
		createEAttribute(xhtmlContentEClass, XHTML_CONTENT__XHTML_SOURCE);

		// Create data types
		dateTimeEDataType = createEDataType(DATE_TIME);
		idEDataType = createEDataType(ID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This method is guarded to have no affect on any
	 * invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLNamespacePackage theXMLNamespacePackage = (XMLNamespacePackage) EPackage.Registry.INSTANCE.getEPackage(XMLNamespacePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		accessControlledElementEClass.getESuperTypes().add(this.getIdentifiable());
		attributeValueXHTMLEClass.getESuperTypes().add(this.getAttributeValue());
		specElementWithAttributesEClass.getESuperTypes().add(this.getIdentifiable());
		attributeDefinitionXHTMLEClass.getESuperTypes().add(this.getAttributeDefinition());
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
		relationGroupEClass.getESuperTypes().add(this.getIdentifiable());
		relationGroupTypeEClass.getESuperTypes().add(this.getSpecType());
		datatypeDefinitionXHTMLEClass.getESuperTypes().add(this.getDatatypeDefinition());
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
		initEClass(accessControlledElementEClass, AccessControlledElement.class,
				"AccessControlledElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getAccessControlledElement_Editable(),
				ecorePackage.getEBoolean(),
				"editable", null, 0, 1, AccessControlledElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(identifiableEClass, Identifiable.class, "Identifiable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getIdentifiable_Desc(),
				ecorePackage.getEString(),
				"desc", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getIdentifiable_Identifier(),
				this.getID(),
				"identifier", null, 1, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getIdentifiable_LastChange(),
				this.getDateTime(),
				"lastChange", null, 1, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getIdentifiable_LongName(),
				ecorePackage.getEString(),
				"longName", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getIdentifiable_AlternativeID(),
				this.getAlternativeID(),
				null,
				"alternativeID", null, 0, 1, Identifiable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(attributeValueXHTMLEClass, AttributeValueXHTML.class,
				"AttributeValueXHTML", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getAttributeValueXHTML_Simplified(),
				ecorePackage.getEBoolean(),
				"simplified", null, 0, 1, AttributeValueXHTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getAttributeValueXHTML_Definition(),
				this.getAttributeDefinitionXHTML(),
				null,
				"definition", null, 1, 1, AttributeValueXHTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getAttributeValueXHTML_TheOriginalValue(),
				this.getXhtmlContent(),
				null,
				"theOriginalValue", null, 0, 1, AttributeValueXHTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getAttributeValueXHTML_TheValue(),
				this.getXhtmlContent(),
				null,
				"theValue", null, 1, 1, AttributeValueXHTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(attributeValueEClass, AttributeValue.class, "AttributeValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(specElementWithAttributesEClass, SpecElementWithAttributes.class,
				"SpecElementWithAttributes", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getSpecElementWithAttributes_Values(),
				this.getAttributeValue(),
				null,
				"values", null, 0, -1, SpecElementWithAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(attributeDefinitionXHTMLEClass, AttributeDefinitionXHTML.class,
				"AttributeDefinitionXHTML", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getAttributeDefinitionXHTML_Type(),
				this.getDatatypeDefinitionXHTML(),
				null,
				"type", null, 1, 1, AttributeDefinitionXHTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getAttributeDefinitionXHTML_DefaultValue(),
				this.getAttributeValueXHTML(),
				null,
				"defaultValue", null, 0, 1, AttributeDefinitionXHTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(attributeDefinitionEClass, AttributeDefinition.class,
				"AttributeDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(specTypeEClass, SpecType.class, "SpecType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getSpecType_SpecAttributes(),
				this.getAttributeDefinition(),
				null,
				"specAttributes", null, 0, -1, SpecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(reqIFContentEClass, ReqIFContent.class, "ReqIFContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getReqIFContent_Datatypes(),
				this.getDatatypeDefinition(),
				null,
				"datatypes", null, 0, -1, ReqIFContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getReqIFContent_SpecTypes(),
				this.getSpecType(),
				null,
				"specTypes", null, 0, -1, ReqIFContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getReqIFContent_SpecObjects(),
				this.getSpecObject(),
				null,
				"specObjects", null, 0, -1, ReqIFContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getReqIFContent_SpecRelations(),
				this.getSpecRelation(),
				null,
				"specRelations", null, 0, -1, ReqIFContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getReqIFContent_Specifications(),
				this.getSpecification(),
				null,
				"specifications", null, 0, -1, ReqIFContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getReqIFContent_SpecRelationGroups(),
				this.getRelationGroup(),
				null,
				"specRelationGroups", null, 0, -1, ReqIFContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(reqIFEClass, ReqIF.class, "ReqIF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getReqIF_Lang(),
				theXMLNamespacePackage.getLangType(),
				"lang", null, 0, 1, ReqIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getReqIF_TheHeader(),
				this.getReqIFHeader(),
				null,
				"theHeader", null, 1, 1, ReqIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getReqIF_CoreContent(),
				this.getReqIFContent(),
				null,
				"coreContent", null, 1, 1, ReqIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getReqIF_ToolExtensions(),
				this.getReqIFToolExtension(),
				null,
				"toolExtensions", null, 0, -1, ReqIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(reqIFHeaderEClass, ReqIFHeader.class, "ReqIFHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getReqIFHeader_Comment(),
				ecorePackage.getEString(),
				"comment", null, 0, 1, ReqIFHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getReqIFHeader_CreationTime(),
				this.getDateTime(),
				"creationTime", null, 1, 1, ReqIFHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getReqIFHeader_Identifier(),
				this.getID(),
				"identifier", null, 1, 1, ReqIFHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getReqIFHeader_RepositoryId(),
				ecorePackage.getEString(),
				"repositoryId", null, 0, 1, ReqIFHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getReqIFHeader_ReqIFToolId(),
				ecorePackage.getEString(),
				"reqIFToolId", null, 1, 1, ReqIFHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getReqIFHeader_ReqIFVersion(),
				ecorePackage.getEString(),
				"reqIFVersion", null, 1, 1, ReqIFHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getReqIFHeader_SourceToolId(),
				ecorePackage.getEString(),
				"sourceToolId", null, 1, 1, ReqIFHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getReqIFHeader_Title(),
				ecorePackage.getEString(),
				"title", null, 1, 1, ReqIFHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(reqIFToolExtensionEClass, ReqIFToolExtension.class, "ReqIFToolExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getReqIFToolExtension_Extensions(),
				ecorePackage.getEObject(),
				null,
				"extensions", null, 0, -1, ReqIFToolExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(specObjectEClass, SpecObject.class, "SpecObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getSpecObject_Type(),
				this.getSpecObjectType(),
				null,
				"type", null, 1, 1, SpecObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(specObjectTypeEClass, SpecObjectType.class, "SpecObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(specificationEClass, Specification.class, "Specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getSpecification_Type(),
				this.getSpecificationType(),
				null,
				"type", null, 1, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getSpecification_Children(),
				this.getSpecHierarchy(),
				null,
				"children", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(specificationTypeEClass, SpecificationType.class, "SpecificationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(specHierarchyEClass, SpecHierarchy.class, "SpecHierarchy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getSpecHierarchy_TableInternal(),
				ecorePackage.getEBoolean(),
				"tableInternal", null, 0, 1, SpecHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getSpecHierarchy_Object(),
				this.getSpecObject(),
				null,
				"object", null, 1, 1, SpecHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getSpecHierarchy_Children(),
				this.getSpecHierarchy(),
				null,
				"children", null, 0, -1, SpecHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getSpecHierarchy_EditableAtts(),
				this.getAttributeDefinition(),
				null,
				"editableAtts", null, 0, -1, SpecHierarchy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(datatypeDefinitionEClass, DatatypeDefinition.class, "DatatypeDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(specRelationEClass, SpecRelation.class, "SpecRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getSpecRelation_Target(),
				this.getSpecObject(),
				null,
				"target", null, 1, 1, SpecRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getSpecRelation_Source(),
				this.getSpecObject(),
				null,
				"source", null, 1, 1, SpecRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getSpecRelation_Type(),
				this.getSpecRelationType(),
				null,
				"type", null, 1, 1, SpecRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(specRelationTypeEClass, SpecRelationType.class, "SpecRelationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(relationGroupEClass, RelationGroup.class, "RelationGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getRelationGroup_SpecRelations(),
				this.getSpecRelation(),
				null,
				"specRelations", null, 0, -1, RelationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getRelationGroup_Type(),
				this.getRelationGroupType(),
				null,
				"type", null, 1, 1, RelationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getRelationGroup_SourceSpecification(),
				this.getSpecification(),
				null,
				"sourceSpecification", null, 1, 1, RelationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getRelationGroup_TargetSpecification(),
				this.getSpecification(),
				null,
				"targetSpecification", null, 1, 1, RelationGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(relationGroupTypeEClass, RelationGroupType.class, "RelationGroupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(datatypeDefinitionXHTMLEClass, DatatypeDefinitionXHTML.class,
				"DatatypeDefinitionXHTML", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(alternativeIDEClass, AlternativeID.class, "AlternativeID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getAlternativeID_Identifier(),
				ecorePackage.getEString(),
				"identifier", null, 1, 1, AlternativeID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(attributeDefinitionBooleanEClass, AttributeDefinitionBoolean.class,
				"AttributeDefinitionBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getAttributeDefinitionBoolean_Type(),
				this.getDatatypeDefinitionBoolean(),
				null,
				"type", null, 1, 1, AttributeDefinitionBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getAttributeDefinitionBoolean_DefaultValue(),
				this.getAttributeValueBoolean(),
				null,
				"defaultValue", null, 0, 1, AttributeDefinitionBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(attributeDefinitionSimpleEClass, AttributeDefinitionSimple.class,
				"AttributeDefinitionSimple", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(datatypeDefinitionBooleanEClass, DatatypeDefinitionBoolean.class,
				"DatatypeDefinitionBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(datatypeDefinitionSimpleEClass, DatatypeDefinitionSimple.class,
				"DatatypeDefinitionSimple", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(attributeValueBooleanEClass, AttributeValueBoolean.class,
				"AttributeValueBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getAttributeValueBoolean_TheValue(),
				ecorePackage.getEBoolean(),
				"theValue", null, 1, 1, AttributeValueBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getAttributeValueBoolean_Definition(),
				this.getAttributeDefinitionBoolean(),
				null,
				"definition", null, 1, 1, AttributeValueBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(attributeValueSimpleEClass, AttributeValueSimple.class,
				"AttributeValueSimple", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(attributeDefinitionDateEClass, AttributeDefinitionDate.class,
				"AttributeDefinitionDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getAttributeDefinitionDate_Type(),
				this.getDatatypeDefinitionDate(),
				null,
				"type", null, 1, 1, AttributeDefinitionDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getAttributeDefinitionDate_DefaultValue(),
				this.getAttributeValueDate(),
				null,
				"defaultValue", null, 0, 1, AttributeDefinitionDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(datatypeDefinitionDateEClass, DatatypeDefinitionDate.class,
				"DatatypeDefinitionDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(attributeValueDateEClass, AttributeValueDate.class, "AttributeValueDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getAttributeValueDate_TheValue(),
				this.getDateTime(),
				"theValue", null, 1, 1, AttributeValueDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getAttributeValueDate_Definition(),
				this.getAttributeDefinitionDate(),
				null,
				"definition", null, 1, 1, AttributeValueDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(attributeDefinitionEnumerationEClass, AttributeDefinitionEnumeration.class,
				"AttributeDefinitionEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getAttributeDefinitionEnumeration_MultiValued(),
				ecorePackage.getEBoolean(),
				"multiValued", null, 1, 1, AttributeDefinitionEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getAttributeDefinitionEnumeration_Type(),
				this.getDatatypeDefinitionEnumeration(),
				null,
				"type", null, 1, 1, AttributeDefinitionEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getAttributeDefinitionEnumeration_DefaultValue(),
				this.getAttributeValueEnumeration(),
				null,
				"defaultValue", null, 0, 1, AttributeDefinitionEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(datatypeDefinitionEnumerationEClass, DatatypeDefinitionEnumeration.class,
				"DatatypeDefinitionEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getDatatypeDefinitionEnumeration_SpecifiedValues(),
				this.getEnumValue(),
				null,
				"specifiedValues", null, 0, -1, DatatypeDefinitionEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(enumValueEClass, EnumValue.class, "EnumValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getEnumValue_Properties(),
				this.getEmbeddedValue(),
				null,
				"properties", null, 1, 1, EnumValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(embeddedValueEClass, EmbeddedValue.class, "EmbeddedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getEmbeddedValue_Key(),
				ecorePackage.getEBigInteger(),
				"key", null, 1, 1, EmbeddedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getEmbeddedValue_OtherContent(),
				ecorePackage.getEString(),
				"otherContent", null, 1, 1, EmbeddedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(attributeValueEnumerationEClass, AttributeValueEnumeration.class,
				"AttributeValueEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getAttributeValueEnumeration_Values(),
				this.getEnumValue(),
				null,
				"values", null, 0, -1, AttributeValueEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getAttributeValueEnumeration_Definition(),
				this.getAttributeDefinitionEnumeration(),
				null,
				"definition", null, 1, 1, AttributeValueEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(attributeDefinitionIntegerEClass, AttributeDefinitionInteger.class,
				"AttributeDefinitionInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getAttributeDefinitionInteger_Type(),
				this.getDatatypeDefinitionInteger(),
				null,
				"type", null, 1, 1, AttributeDefinitionInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getAttributeDefinitionInteger_DefaultValue(),
				this.getAttributeValueInteger(),
				null,
				"defaultValue", null, 0, 1, AttributeDefinitionInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(datatypeDefinitionIntegerEClass, DatatypeDefinitionInteger.class,
				"DatatypeDefinitionInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getDatatypeDefinitionInteger_Max(),
				ecorePackage.getEBigInteger(),
				"max", null, 1, 1, DatatypeDefinitionInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getDatatypeDefinitionInteger_Min(),
				ecorePackage.getEBigInteger(),
				"min", null, 1, 1, DatatypeDefinitionInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(attributeValueIntegerEClass, AttributeValueInteger.class,
				"AttributeValueInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getAttributeValueInteger_TheValue(),
				ecorePackage.getEBigInteger(),
				"theValue", null, 1, 1, AttributeValueInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getAttributeValueInteger_Definition(),
				this.getAttributeDefinitionInteger(),
				null,
				"definition", null, 1, 1, AttributeValueInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(attributeDefinitionRealEClass, AttributeDefinitionReal.class,
				"AttributeDefinitionReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getAttributeDefinitionReal_Type(),
				this.getDatatypeDefinitionReal(),
				null,
				"type", null, 1, 1, AttributeDefinitionReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getAttributeDefinitionReal_DefaultValue(),
				this.getAttributeValueReal(),
				null,
				"defaultValue", null, 0, 1, AttributeDefinitionReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(datatypeDefinitionRealEClass, DatatypeDefinitionReal.class,
				"DatatypeDefinitionReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getDatatypeDefinitionReal_Accuracy(),
				ecorePackage.getEBigInteger(),
				"accuracy", null, 1, 1, DatatypeDefinitionReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getDatatypeDefinitionReal_Max(),
				ecorePackage.getEDouble(),
				"max", null, 1, 1, DatatypeDefinitionReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getDatatypeDefinitionReal_Min(),
				ecorePackage.getEDouble(),
				"min", null, 1, 1, DatatypeDefinitionReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(attributeValueRealEClass, AttributeValueReal.class, "AttributeValueReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getAttributeValueReal_TheValue(),
				ecorePackage.getEDouble(),
				"theValue", null, 1, 1, AttributeValueReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getAttributeValueReal_Definition(),
				this.getAttributeDefinitionReal(),
				null,
				"definition", null, 1, 1, AttributeValueReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(attributeDefinitionStringEClass, AttributeDefinitionString.class,
				"AttributeDefinitionString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getAttributeDefinitionString_Type(),
				this.getDatatypeDefinitionString(),
				null,
				"type", null, 1, 1, AttributeDefinitionString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getAttributeDefinitionString_DefaultValue(),
				this.getAttributeValueString(),
				null,
				"defaultValue", null, 0, 1, AttributeDefinitionString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(datatypeDefinitionStringEClass, DatatypeDefinitionString.class,
				"DatatypeDefinitionString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getDatatypeDefinitionString_MaxLength(),
				ecorePackage.getEBigInteger(),
				"maxLength", null, 1, 1, DatatypeDefinitionString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(attributeValueStringEClass, AttributeValueString.class,
				"AttributeValueString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(
				getAttributeValueString_TheValue(),
				ecorePackage.getEString(),
				"theValue", null, 1, 1, AttributeValueString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$
		initEReference(
				getAttributeValueString_Definition(),
				this.getAttributeDefinitionString(),
				null,
				"definition", null, 1, 1, AttributeValueString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED); //$NON-NLS-1$

		initEClass(xhtmlContentEClass, XhtmlContent.class, "XhtmlContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(
				getXhtmlContent_Xhtml(),
				ecorePackage.getEObject(),
				null,
				"xhtml", null, 0, 1, XhtmlContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(
				getXhtmlContent_XhtmlSource(),
				ecorePackage.getEString(),
				"xhtmlSource", null, 0, 1, XhtmlContent.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Initialize data types
		initEDataType(dateTimeEDataType, GregorianCalendar.class, "DateTime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(idEDataType, String.class, "ID", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData
		createXMLPersistenceMappingExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData"; //$NON-NLS-1$		
		addAnnotation(accessControlledElementEClass, source, new String[] { "name", "ACCESS-CONTROLLED-ELEMENT", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAccessControlledElement_Editable(), source, new String[] { "name", "IS-EDITABLE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "attribute" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(identifiableEClass, source, new String[] { "name", "IDENTIFIABLE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getIdentifiable_Desc(), source, new String[] { "name", "DESC", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "attribute" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getIdentifiable_Identifier(), source, new String[] { "name", "IDENTIFIER", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "attribute" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getIdentifiable_LastChange(), source, new String[] { "name", "LAST-CHANGE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "attribute" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getIdentifiable_LongName(), source, new String[] { "name", "LONG-NAME", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "attribute" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getIdentifiable_AlternativeID(), source, new String[] { "name", "ALTERNATIVE-ID", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeValueXHTMLEClass, source, new String[] { "name", "ATTRIBUTE-VALUE-XHTML", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueXHTML_Simplified(), source, new String[] { "name", "IS-SIMPLIFIED", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "attribute" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueXHTML_Definition(), source, new String[] { "name", "DEFINITION", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueXHTML_TheOriginalValue(), source, new String[] { "name", "THE-ORIGINAL-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueXHTML_TheValue(), source, new String[] { "name", "THE-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeValueEClass, source, new String[] { "name", "ATTRIBUTE-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(specElementWithAttributesEClass, source, new String[] { "name", "SPEC-ELEMENT-WITH-ATTRIBUTES", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getSpecElementWithAttributes_Values(), source, new String[] { "name", "VALUES", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeDefinitionXHTMLEClass, source, new String[] { "name", "ATTRIBUTE-DEFINITION-XHTML", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionXHTML_Type(), source, new String[] { "name", "TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionXHTML_DefaultValue(), source, new String[] { "name", "DEFAULT-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeDefinitionEClass, source, new String[] { "name", "ATTRIBUTE-DEFINITION", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(specTypeEClass, source, new String[] { "name", "SPEC-TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getSpecType_SpecAttributes(), source, new String[] { "name", "SPEC-ATTRIBUTES", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(reqIFContentEClass, source, new String[] { "name", "REQ-IF-CONTENT", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFContent_Datatypes(), source, new String[] { "name", "DATATYPES", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFContent_SpecTypes(), source, new String[] { "name", "SPEC-TYPES", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFContent_SpecObjects(), source, new String[] { "name", "SPEC-OBJECTS", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFContent_SpecRelations(), source, new String[] { "name", "SPEC-RELATIONS", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFContent_Specifications(), source, new String[] { "name", "SPECIFICATIONS", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFContent_SpecRelationGroups(), source, new String[] { "name", "SPEC-RELATION-GROUPS", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(reqIFEClass, source, new String[] { "name", "REQ-IF", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIF_Lang(), source, new String[] { "name", "lang", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "attribute", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "http://www.w3.org/XML/1998/namespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIF_TheHeader(), source, new String[] { "name", "THE-HEADER", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIF_CoreContent(), source, new String[] { "name", "CORE-CONTENT", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIF_ToolExtensions(), source, new String[] { "name", "TOOL-EXTENSIONS", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(reqIFHeaderEClass, source, new String[] { "name", "REQ-IF-HEADER", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFHeader_Comment(), source, new String[] { "name", "COMMENT", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFHeader_CreationTime(), source, new String[] { "name", "CREATION-TIME", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFHeader_Identifier(), source, new String[] { "name", "IDENTIFIER", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "attribute" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFHeader_RepositoryId(), source, new String[] { "name", "REPOSITORY-ID", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFHeader_ReqIFToolId(), source, new String[] { "name", "REQ-IF-TOOL-ID", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFHeader_ReqIFVersion(), source, new String[] { "name", "REQ-IF-VERSION", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFHeader_SourceToolId(), source, new String[] { "name", "SOURCE-TOOL-ID", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFHeader_Title(), source, new String[] { "name", "TITLE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(reqIFToolExtensionEClass, source, new String[] { "name", "REQ-IF-TOOL-EXTENSION", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFToolExtension_Extensions(), source, new String[] { "name", "EXTENSIONS", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementWildcard", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace", //$NON-NLS-1$ //$NON-NLS-2$
				"precessing", "lax", //$NON-NLS-1$ //$NON-NLS-2$
				"wildcards", "##other" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(specObjectEClass, source, new String[] { "name", "SPEC-OBJECT", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getSpecObject_Type(), source, new String[] { "name", "TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(specObjectTypeEClass, source, new String[] { "name", "SPEC-OBJECT-TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(specificationEClass, source, new String[] { "name", "SPECIFICATION", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getSpecification_Type(), source, new String[] { "name", "TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getSpecification_Children(), source, new String[] { "name", "CHILDREN", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(specificationTypeEClass, source, new String[] { "name", "SPECIFICATION-TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(specHierarchyEClass, source, new String[] { "name", "SPEC-HIERARCHY", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getSpecHierarchy_TableInternal(), source, new String[] { "name", "IS-TABLE-INTERNAL", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "attribute" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getSpecHierarchy_Object(), source, new String[] { "name", "OBJECT", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getSpecHierarchy_Children(), source, new String[] { "name", "CHILDREN", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getSpecHierarchy_EditableAtts(), source, new String[] { "name", "EDITABLE-ATTS", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(datatypeDefinitionEClass, source, new String[] { "name", "DATATYPE-DEFINITION", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(specRelationEClass, source, new String[] { "name", "SPEC-RELATION", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getSpecRelation_Target(), source, new String[] { "name", "TARGET", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getSpecRelation_Source(), source, new String[] { "name", "SOURCE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getSpecRelation_Type(), source, new String[] { "name", "TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(specRelationTypeEClass, source, new String[] { "name", "SPEC-RELATION-TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(relationGroupEClass, source, new String[] { "name", "RELATION-GROUP", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRelationGroup_SpecRelations(), source, new String[] { "name", "SPEC-RELATIONS", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRelationGroup_Type(), source, new String[] { "name", "TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRelationGroup_SourceSpecification(), source, new String[] { "name", "SOURCE-SPECIFICATION", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRelationGroup_TargetSpecification(), source, new String[] { "name", "TARGET-SPECIFICATION", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(relationGroupTypeEClass, source, new String[] { "name", "RELATION-GROUP-TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(datatypeDefinitionXHTMLEClass, source, new String[] { "name", "DATATYPE-DEFINITION-XHTML", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(alternativeIDEClass, source, new String[] { "name", "ALTERNATIVE-ID", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAlternativeID_Identifier(), source, new String[] { "name", "IDENTIFIER", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "attribute" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeDefinitionBooleanEClass, source, new String[] { "name", "ATTRIBUTE-DEFINITION-BOOLEAN", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionBoolean_Type(), source, new String[] { "name", "TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionBoolean_DefaultValue(), source, new String[] { "name", "DEFAULT-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeDefinitionSimpleEClass, source, new String[] { "name", "ATTRIBUTE-DEFINITION-SIMPLE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(datatypeDefinitionBooleanEClass, source, new String[] { "name", "DATATYPE-DEFINITION-BOOLEAN", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(datatypeDefinitionSimpleEClass, source, new String[] { "name", "DATATYPE-DEFINITION-SIMPLE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeValueBooleanEClass, source, new String[] { "name", "ATTRIBUTE-VALUE-BOOLEAN", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueBoolean_TheValue(), source, new String[] { "name", "THE-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "attribute" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueBoolean_Definition(), source, new String[] { "name", "DEFINITION", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeValueSimpleEClass, source, new String[] { "name", "ATTRIBUTE-VALUE-SIMPLE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeDefinitionDateEClass, source, new String[] { "name", "ATTRIBUTE-DEFINITION-DATE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionDate_Type(), source, new String[] { "name", "TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionDate_DefaultValue(), source, new String[] { "name", "DEFAULT-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(datatypeDefinitionDateEClass, source, new String[] { "name", "DATATYPE-DEFINITION-DATE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeValueDateEClass, source, new String[] { "name", "ATTRIBUTE-VALUE-DATE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueDate_TheValue(), source, new String[] { "name", "THE-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "attribute" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueDate_Definition(), source, new String[] { "name", "DEFINITION", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeDefinitionEnumerationEClass, source, new String[] { "name", "ATTRIBUTE-DEFINITION-ENUMERATION", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionEnumeration_MultiValued(), source, new String[] { "name", "MULTI-VALUED", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "attribute" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionEnumeration_Type(), source, new String[] { "name", "TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionEnumeration_DefaultValue(), source, new String[] { "name", "DEFAULT-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(datatypeDefinitionEnumerationEClass, source, new String[] { "name", "DATATYPE-DEFINITION-ENUMERATION", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getDatatypeDefinitionEnumeration_SpecifiedValues(), source, new String[] { "name", "SPECIFIED-VALUES", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(enumValueEClass, source, new String[] { "name", "ENUM-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getEnumValue_Properties(), source, new String[] { "name", "PROPERTIES", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(embeddedValueEClass, source, new String[] { "name", "EMBEDDED-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getEmbeddedValue_Key(), source, new String[] { "name", "KEY", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "attribute" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getEmbeddedValue_OtherContent(), source, new String[] { "name", "OTHER-CONTENT", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "attribute" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeValueEnumerationEClass, source, new String[] { "name", "ATTRIBUTE-VALUE-ENUMERATION", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueEnumeration_Values(), source, new String[] { "name", "VALUES", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueEnumeration_Definition(), source, new String[] { "name", "DEFINITION", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeDefinitionIntegerEClass, source, new String[] { "name", "ATTRIBUTE-DEFINITION-INTEGER", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionInteger_Type(), source, new String[] { "name", "TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionInteger_DefaultValue(), source, new String[] { "name", "DEFAULT-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(datatypeDefinitionIntegerEClass, source, new String[] { "name", "DATATYPE-DEFINITION-INTEGER", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getDatatypeDefinitionInteger_Max(), source, new String[] { "name", "MAX", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "attribute" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getDatatypeDefinitionInteger_Min(), source, new String[] { "name", "MIN", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "attribute" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeValueIntegerEClass, source, new String[] { "name", "ATTRIBUTE-VALUE-INTEGER", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueInteger_TheValue(), source, new String[] { "name", "THE-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "attribute" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueInteger_Definition(), source, new String[] { "name", "DEFINITION", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeDefinitionRealEClass, source, new String[] { "name", "ATTRIBUTE-DEFINITION-REAL", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionReal_Type(), source, new String[] { "name", "TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionReal_DefaultValue(), source, new String[] { "name", "DEFAULT-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(datatypeDefinitionRealEClass, source, new String[] { "name", "DATATYPE-DEFINITION-REAL", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getDatatypeDefinitionReal_Accuracy(), source, new String[] { "name", "ACCURACY", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "attribute" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getDatatypeDefinitionReal_Max(), source, new String[] { "name", "MAX", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "attribute" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getDatatypeDefinitionReal_Min(), source, new String[] { "name", "MIN", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "attribute" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeValueRealEClass, source, new String[] { "name", "ATTRIBUTE-VALUE-REAL", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueReal_TheValue(), source, new String[] { "name", "THE-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "attribute" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueReal_Definition(), source, new String[] { "name", "DEFINITION", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeDefinitionStringEClass, source, new String[] { "name", "ATTRIBUTE-DEFINITION-STRING", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionString_Type(), source, new String[] { "name", "TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionString_DefaultValue(), source, new String[] { "name", "DEFAULT-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(datatypeDefinitionStringEClass, source, new String[] { "name", "DATATYPE-DEFINITION-STRING", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getDatatypeDefinitionString_MaxLength(), source, new String[] { "name", "MAX-LENGTH", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "attribute" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeValueStringEClass, source, new String[] { "name", "ATTRIBUTE-VALUE-STRING", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueString_TheValue(), source, new String[] { "name", "THE-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "attribute" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueString_Definition(), source, new String[] { "name", "DEFINITION", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(xhtmlContentEClass, source, new String[] { "name", "XHTML-CONTENT", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementOnly" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getXhtmlContent_Xhtml(), source, new String[] { "name", "XHTML", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "elementWildcard", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace", //$NON-NLS-1$ //$NON-NLS-2$
				"precessing", "lax", //$NON-NLS-1$ //$NON-NLS-2$
				"wildcards", "http://www.w3.org/1999/xhtml" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getXhtmlContent_XhtmlSource(), source, new String[] { "name", "XHTML-SOURCE", //$NON-NLS-1$ //$NON-NLS-2$
				"kind", "element", //$NON-NLS-1$ //$NON-NLS-2$
				"namespace", "##targetNamespace" //$NON-NLS-1$ //$NON-NLS-2$
		});
	}

	/**
	 * Initializes the annotations for
	 * <b>http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData</b>. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createXMLPersistenceMappingExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData"; //$NON-NLS-1$			
		addAnnotation(accessControlledElementEClass, source, new String[] { "wrapperName", "ACCESS-CONTROLLED-ELEMENT" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAccessControlledElement_Editable(), source, new String[] { "wrapperName", "IS-EDITABLE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(identifiableEClass, source, new String[] { "wrapperName", "IDENTIFIABLE" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getIdentifiable_Desc(), source, new String[] { "wrapperName", "DESC", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getIdentifiable_Identifier(), source, new String[] { "wrapperName", "IDENTIFIER", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getIdentifiable_LastChange(), source, new String[] { "wrapperName", "LAST-CHANGE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getIdentifiable_LongName(), source, new String[] { "wrapperName", "LONG-NAME", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getIdentifiable_AlternativeID(), source, new String[] { "wrapperName", "ALTERNATIVE-ID", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeValueXHTMLEClass, source, new String[] { "wrapperName", "ATTRIBUTE-VALUE-XHTML" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueXHTML_Simplified(), source, new String[] { "wrapperName", "IS-SIMPLIFIED", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueXHTML_Definition(), source, new String[] { "wrapperName", "DEFINITION", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierNameSuffix", "-REF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueXHTML_TheOriginalValue(), source, new String[] { "wrapperName", "THE-ORIGINAL-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueXHTML_TheValue(), source, new String[] { "wrapperName", "THE-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeValueEClass, source, new String[] { "wrapperName", "ATTRIBUTE-VALUE" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(specElementWithAttributesEClass, source, new String[] { "wrapperName", "SPEC-ELEMENT-WITH-ATTRIBUTES" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getSpecElementWithAttributes_Values(), source, new String[] { "wrapperName", "VALUES", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeDefinitionXHTMLEClass, source, new String[] { "wrapperName", "ATTRIBUTE-DEFINITION-XHTML" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionXHTML_Type(), source, new String[] { "wrapperName", "TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierNameSuffix", "-REF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionXHTML_DefaultValue(), source, new String[] { "wrapperName", "DEFAULT-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeDefinitionEClass, source, new String[] { "wrapperName", "ATTRIBUTE-DEFINITION" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(specTypeEClass, source, new String[] { "wrapperName", "SPEC-TYPE" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getSpecType_SpecAttributes(), source, new String[] { "wrapperName", "SPEC-ATTRIBUTES", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(reqIFContentEClass, source, new String[] { "wrapperName", "REQ-IF-CONTENT" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFContent_Datatypes(), source, new String[] { "wrapperName", "DATATYPES", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFContent_SpecTypes(), source, new String[] { "wrapperName", "SPEC-TYPES", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFContent_SpecObjects(), source, new String[] { "wrapperName", "SPEC-OBJECTS", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFContent_SpecRelations(), source, new String[] { "wrapperName", "SPEC-RELATIONS", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFContent_Specifications(), source, new String[] { "wrapperName", "SPECIFICATIONS", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFContent_SpecRelationGroups(), source, new String[] { "wrapperName", "SPEC-RELATION-GROUPS", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(reqIFEClass, source, new String[] { "wrapperName", "REQ-IF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIF_TheHeader(), source, new String[] { "wrapperName", "THE-HEADER", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIF_CoreContent(), source, new String[] { "wrapperName", "CORE-CONTENT", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIF_ToolExtensions(), source, new String[] { "wrapperName", "TOOL-EXTENSIONS", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(reqIFHeaderEClass, source, new String[] { "wrapperName", "REQ-IF-HEADER" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFHeader_Comment(), source, new String[] { "wrapperName", "COMMENT", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFHeader_CreationTime(), source, new String[] { "wrapperName", "CREATION-TIME", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFHeader_Identifier(), source, new String[] { "wrapperName", "IDENTIFIER", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFHeader_RepositoryId(), source, new String[] { "wrapperName", "REPOSITORY-ID", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFHeader_ReqIFToolId(), source, new String[] { "wrapperName", "REQ-IF-TOOL-ID", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFHeader_ReqIFVersion(), source, new String[] { "wrapperName", "REQ-IF-VERSION", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFHeader_SourceToolId(), source, new String[] { "wrapperName", "SOURCE-TOOL-ID", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFHeader_Title(), source, new String[] { "wrapperName", "TITLE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(reqIFToolExtensionEClass, source, new String[] { "wrapperName", "REQ-IF-TOOL-EXTENSION" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getReqIFToolExtension_Extensions(), source, new String[] { "wrapperName", "EXTENSIONS", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(specObjectEClass, source, new String[] { "wrapperName", "SPEC-OBJECT" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getSpecObject_Type(), source, new String[] { "wrapperName", "TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierNameSuffix", "-REF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(specObjectTypeEClass, source, new String[] { "wrapperName", "SPEC-OBJECT-TYPE" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(specificationEClass, source, new String[] { "wrapperName", "SPECIFICATION" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getSpecification_Type(), source, new String[] { "wrapperName", "TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierNameSuffix", "-REF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getSpecification_Children(), source, new String[] { "wrapperName", "CHILDREN", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(specificationTypeEClass, source, new String[] { "wrapperName", "SPECIFICATION-TYPE" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(specHierarchyEClass, source, new String[] { "wrapperName", "SPEC-HIERARCHY" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getSpecHierarchy_TableInternal(), source, new String[] { "wrapperName", "IS-TABLE-INTERNAL", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getSpecHierarchy_Object(), source, new String[] { "wrapperName", "OBJECT", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierNameSuffix", "-REF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getSpecHierarchy_Children(), source, new String[] { "wrapperName", "CHILDREN", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getSpecHierarchy_EditableAtts(), source, new String[] { "wrapperName", "EDITABLE-ATTS", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierNameSuffix", "-REF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(datatypeDefinitionEClass, source, new String[] { "wrapperName", "DATATYPE-DEFINITION" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(specRelationEClass, source, new String[] { "wrapperName", "SPEC-RELATION" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getSpecRelation_Target(), source, new String[] { "wrapperName", "TARGET", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierNameSuffix", "-REF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getSpecRelation_Source(), source, new String[] { "wrapperName", "SOURCE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierNameSuffix", "-REF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getSpecRelation_Type(), source, new String[] { "wrapperName", "TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierNameSuffix", "-REF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(specRelationTypeEClass, source, new String[] { "wrapperName", "SPEC-RELATION-TYPE" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(relationGroupEClass, source, new String[] { "wrapperName", "RELATION-GROUP" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRelationGroup_SpecRelations(), source, new String[] { "wrapperName", "SPEC-RELATIONS", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierNameSuffix", "-REF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRelationGroup_Type(), source, new String[] { "wrapperName", "TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierNameSuffix", "-REF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRelationGroup_SourceSpecification(), source, new String[] { "wrapperName", "SOURCE-SPECIFICATION", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierNameSuffix", "-REF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getRelationGroup_TargetSpecification(), source, new String[] { "wrapperName", "TARGET-SPECIFICATION", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierNameSuffix", "-REF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(relationGroupTypeEClass, source, new String[] { "wrapperName", "RELATION-GROUP-TYPE" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(datatypeDefinitionXHTMLEClass, source, new String[] { "wrapperName", "DATATYPE-DEFINITION-XHTML" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(alternativeIDEClass, source, new String[] { "wrapperName", "ALTERNATIVE-ID" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAlternativeID_Identifier(), source, new String[] { "wrapperName", "IDENTIFIER", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeDefinitionBooleanEClass, source, new String[] { "wrapperName", "ATTRIBUTE-DEFINITION-BOOLEAN" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionBoolean_Type(), source, new String[] { "wrapperName", "TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierNameSuffix", "-REF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionBoolean_DefaultValue(), source, new String[] { "wrapperName", "DEFAULT-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeDefinitionSimpleEClass, source, new String[] { "wrapperName", "ATTRIBUTE-DEFINITION-SIMPLE" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(datatypeDefinitionBooleanEClass, source, new String[] { "wrapperName", "DATATYPE-DEFINITION-BOOLEAN" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(datatypeDefinitionSimpleEClass, source, new String[] { "wrapperName", "DATATYPE-DEFINITION-SIMPLE" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeValueBooleanEClass, source, new String[] { "wrapperName", "ATTRIBUTE-VALUE-BOOLEAN" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueBoolean_TheValue(), source, new String[] { "wrapperName", "THE-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueBoolean_Definition(), source, new String[] { "wrapperName", "DEFINITION", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierNameSuffix", "-REF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeValueSimpleEClass, source, new String[] { "wrapperName", "ATTRIBUTE-VALUE-SIMPLE" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeDefinitionDateEClass, source, new String[] { "wrapperName", "ATTRIBUTE-DEFINITION-DATE" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionDate_Type(), source, new String[] { "wrapperName", "TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierNameSuffix", "-REF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionDate_DefaultValue(), source, new String[] { "wrapperName", "DEFAULT-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(datatypeDefinitionDateEClass, source, new String[] { "wrapperName", "DATATYPE-DEFINITION-DATE" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeValueDateEClass, source, new String[] { "wrapperName", "ATTRIBUTE-VALUE-DATE" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueDate_TheValue(), source, new String[] { "wrapperName", "THE-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueDate_Definition(), source, new String[] { "wrapperName", "DEFINITION", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierNameSuffix", "-REF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeDefinitionEnumerationEClass, source, new String[] { "wrapperName", "ATTRIBUTE-DEFINITION-ENUMERATION" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionEnumeration_MultiValued(), source, new String[] { "wrapperName", "MULTI-VALUED", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionEnumeration_Type(), source, new String[] { "wrapperName", "TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierNameSuffix", "-REF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionEnumeration_DefaultValue(), source, new String[] { "wrapperName", "DEFAULT-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(datatypeDefinitionEnumerationEClass, source, new String[] { "wrapperName", "DATATYPE-DEFINITION-ENUMERATION" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getDatatypeDefinitionEnumeration_SpecifiedValues(), source, new String[] { "wrapperName", "SPECIFIED-VALUES", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(enumValueEClass, source, new String[] { "wrapperName", "ENUM-VALUE" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getEnumValue_Properties(), source, new String[] { "wrapperName", "PROPERTIES", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(embeddedValueEClass, source, new String[] { "wrapperName", "EMBEDDED-VALUE" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getEmbeddedValue_Key(), source, new String[] { "wrapperName", "KEY", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getEmbeddedValue_OtherContent(), source, new String[] { "wrapperName", "OTHER-CONTENT", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeValueEnumerationEClass, source, new String[] { "wrapperName", "ATTRIBUTE-VALUE-ENUMERATION" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueEnumeration_Values(), source, new String[] { "wrapperName", "VALUES", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierNameSuffix", "-REF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueEnumeration_Definition(), source, new String[] { "wrapperName", "DEFINITION", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierNameSuffix", "-REF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeDefinitionIntegerEClass, source, new String[] { "wrapperName", "ATTRIBUTE-DEFINITION-INTEGER" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionInteger_Type(), source, new String[] { "wrapperName", "TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierNameSuffix", "-REF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionInteger_DefaultValue(), source, new String[] { "wrapperName", "DEFAULT-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(datatypeDefinitionIntegerEClass, source, new String[] { "wrapperName", "DATATYPE-DEFINITION-INTEGER" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getDatatypeDefinitionInteger_Max(), source, new String[] { "wrapperName", "MAX", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getDatatypeDefinitionInteger_Min(), source, new String[] { "wrapperName", "MIN", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeValueIntegerEClass, source, new String[] { "wrapperName", "ATTRIBUTE-VALUE-INTEGER" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueInteger_TheValue(), source, new String[] { "wrapperName", "THE-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueInteger_Definition(), source, new String[] { "wrapperName", "DEFINITION", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierNameSuffix", "-REF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeDefinitionRealEClass, source, new String[] { "wrapperName", "ATTRIBUTE-DEFINITION-REAL" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionReal_Type(), source, new String[] { "wrapperName", "TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierNameSuffix", "-REF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionReal_DefaultValue(), source, new String[] { "wrapperName", "DEFAULT-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(datatypeDefinitionRealEClass, source, new String[] { "wrapperName", "DATATYPE-DEFINITION-REAL" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getDatatypeDefinitionReal_Accuracy(), source, new String[] { "wrapperName", "ACCURACY", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getDatatypeDefinitionReal_Max(), source, new String[] { "wrapperName", "MAX", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getDatatypeDefinitionReal_Min(), source, new String[] { "wrapperName", "MIN", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeValueRealEClass, source, new String[] { "wrapperName", "ATTRIBUTE-VALUE-REAL" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueReal_TheValue(), source, new String[] { "wrapperName", "THE-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueReal_Definition(), source, new String[] { "wrapperName", "DEFINITION", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierNameSuffix", "-REF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeDefinitionStringEClass, source, new String[] { "wrapperName", "ATTRIBUTE-DEFINITION-STRING" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionString_Type(), source, new String[] { "wrapperName", "TYPE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierNameSuffix", "-REF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeDefinitionString_DefaultValue(), source, new String[] { "wrapperName", "DEFAULT-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(datatypeDefinitionStringEClass, source, new String[] { "wrapperName", "DATATYPE-DEFINITION-STRING" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getDatatypeDefinitionString_MaxLength(), source, new String[] { "wrapperName", "MAX-LENGTH", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(attributeValueStringEClass, source, new String[] { "wrapperName", "ATTRIBUTE-VALUE-STRING" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueString_TheValue(), source, new String[] { "wrapperName", "THE-VALUE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getAttributeValueString_Definition(), source, new String[] { "wrapperName", "DEFINITION", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierNameSuffix", "-REF" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(xhtmlContentEClass, source, new String[] { "wrapperName", "XHTML-CONTENT" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getXhtmlContent_Xhtml(), source, new String[] { "wrapperName", "XHTML", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "true" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(getXhtmlContent_XhtmlSource(), source, new String[] { "wrapperName", "XHTML-SOURCE", //$NON-NLS-1$ //$NON-NLS-2$
				"featureWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"featureElement", "true", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierWrapperElement", "false", //$NON-NLS-1$ //$NON-NLS-2$
				"classifierElement", "false" //$NON-NLS-1$ //$NON-NLS-2$
		});
	}

} // ReqIF10PackageImpl
