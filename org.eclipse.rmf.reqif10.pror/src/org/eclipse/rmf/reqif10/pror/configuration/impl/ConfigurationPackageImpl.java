/*******************************************************************************
 * Copyright (c) 2011, 2013 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.pror.configuration.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.impl.ReqIF10PackageImpl;
import org.eclipse.rmf.reqif10.pror.configuration.Column;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationFactory;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage;
import org.eclipse.rmf.reqif10.pror.configuration.LabelConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrGeneralConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfigurations;
import org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigurationPackageImpl extends EPackageImpl implements ConfigurationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prorToolExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prorSpecViewConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prorPresentationConfigurationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prorPresentationConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prorGeneralConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelConfigurationEClass = null;

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
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConfigurationPackageImpl() {
		super(eNS_URI, ConfigurationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConfigurationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConfigurationPackage init() {
		if (isInited) return (ConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);

		// Obtain or create and register package
		ConfigurationPackageImpl theConfigurationPackage = (ConfigurationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConfigurationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConfigurationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		ReqIF10PackageImpl theReqIF10Package = (ReqIF10PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ReqIF10Package.eNS_URI) instanceof ReqIF10PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ReqIF10Package.eNS_URI) : ReqIF10Package.eINSTANCE);

		// Create package meta-data objects
		theConfigurationPackage.createPackageContents();
		theReqIF10Package.createPackageContents();

		// Initialize created meta-data
		theConfigurationPackage.initializePackageContents();
		theReqIF10Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConfigurationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConfigurationPackage.eNS_URI, theConfigurationPackage);
		return theConfigurationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProrToolExtension() {
		return prorToolExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProrToolExtension_SpecViewConfigurations() {
		return (EReference)prorToolExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProrToolExtension_GeneralConfiguration() {
		return (EReference)prorToolExtensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProrToolExtension_PresentationConfigurations() {
		return (EReference)prorToolExtensionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProrSpecViewConfiguration() {
		return prorSpecViewConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProrSpecViewConfiguration_Specification() {
		return (EReference)prorSpecViewConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProrSpecViewConfiguration_Columns() {
		return (EReference)prorSpecViewConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProrSpecViewConfiguration_LeftHeaderColumn() {
		return (EReference)prorSpecViewConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Label() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Width() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProrPresentationConfigurations() {
		return prorPresentationConfigurationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProrPresentationConfigurations_PresentationConfigurations() {
		return (EReference)prorPresentationConfigurationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProrPresentationConfiguration() {
		return prorPresentationConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProrPresentationConfiguration_Datatype() {
		return (EReference)prorPresentationConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProrGeneralConfiguration() {
		return prorGeneralConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProrGeneralConfiguration_LabelConfiguration() {
		return (EReference)prorGeneralConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelConfiguration() {
		return labelConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelConfiguration_DefaultLabel() {
		return (EAttribute)labelConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationFactory getConfigurationFactory() {
		return (ConfigurationFactory)getEFactoryInstance();
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
		prorToolExtensionEClass = createEClass(PROR_TOOL_EXTENSION);
		createEReference(prorToolExtensionEClass, PROR_TOOL_EXTENSION__SPEC_VIEW_CONFIGURATIONS);
		createEReference(prorToolExtensionEClass, PROR_TOOL_EXTENSION__GENERAL_CONFIGURATION);
		createEReference(prorToolExtensionEClass, PROR_TOOL_EXTENSION__PRESENTATION_CONFIGURATIONS);

		prorSpecViewConfigurationEClass = createEClass(PROR_SPEC_VIEW_CONFIGURATION);
		createEReference(prorSpecViewConfigurationEClass, PROR_SPEC_VIEW_CONFIGURATION__SPECIFICATION);
		createEReference(prorSpecViewConfigurationEClass, PROR_SPEC_VIEW_CONFIGURATION__COLUMNS);
		createEReference(prorSpecViewConfigurationEClass, PROR_SPEC_VIEW_CONFIGURATION__LEFT_HEADER_COLUMN);

		columnEClass = createEClass(COLUMN);
		createEAttribute(columnEClass, COLUMN__LABEL);
		createEAttribute(columnEClass, COLUMN__WIDTH);

		prorPresentationConfigurationsEClass = createEClass(PROR_PRESENTATION_CONFIGURATIONS);
		createEReference(prorPresentationConfigurationsEClass, PROR_PRESENTATION_CONFIGURATIONS__PRESENTATION_CONFIGURATIONS);

		prorPresentationConfigurationEClass = createEClass(PROR_PRESENTATION_CONFIGURATION);
		createEReference(prorPresentationConfigurationEClass, PROR_PRESENTATION_CONFIGURATION__DATATYPE);

		prorGeneralConfigurationEClass = createEClass(PROR_GENERAL_CONFIGURATION);
		createEReference(prorGeneralConfigurationEClass, PROR_GENERAL_CONFIGURATION__LABEL_CONFIGURATION);

		labelConfigurationEClass = createEClass(LABEL_CONFIGURATION);
		createEAttribute(labelConfigurationEClass, LABEL_CONFIGURATION__DEFAULT_LABEL);
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
		ReqIF10Package theReqIF10Package = (ReqIF10Package)EPackage.Registry.INSTANCE.getEPackage(ReqIF10Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(prorToolExtensionEClass, ProrToolExtension.class, "ProrToolExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProrToolExtension_SpecViewConfigurations(), this.getProrSpecViewConfiguration(), null, "specViewConfigurations", null, 0, -1, ProrToolExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProrToolExtension_GeneralConfiguration(), this.getProrGeneralConfiguration(), null, "generalConfiguration", null, 1, 1, ProrToolExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProrToolExtension_PresentationConfigurations(), this.getProrPresentationConfigurations(), null, "presentationConfigurations", null, 1, 1, ProrToolExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prorSpecViewConfigurationEClass, ProrSpecViewConfiguration.class, "ProrSpecViewConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProrSpecViewConfiguration_Specification(), theReqIF10Package.getSpecification(), null, "specification", null, 1, 1, ProrSpecViewConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProrSpecViewConfiguration_Columns(), this.getColumn(), null, "columns", null, 0, -1, ProrSpecViewConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProrSpecViewConfiguration_LeftHeaderColumn(), this.getColumn(), null, "leftHeaderColumn", null, 1, 1, ProrSpecViewConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumn_Label(), ecorePackage.getEString(), "label", "<PLEASE SET LABEL>", 1, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Width(), ecorePackage.getEInt(), "width", "100", 1, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prorPresentationConfigurationsEClass, ProrPresentationConfigurations.class, "ProrPresentationConfigurations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProrPresentationConfigurations_PresentationConfigurations(), this.getProrPresentationConfiguration(), null, "presentationConfigurations", null, 0, -1, ProrPresentationConfigurations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prorPresentationConfigurationEClass, ProrPresentationConfiguration.class, "ProrPresentationConfiguration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProrPresentationConfiguration_Datatype(), theReqIF10Package.getDatatypeDefinition(), null, "datatype", null, 1, 1, ProrPresentationConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prorGeneralConfigurationEClass, ProrGeneralConfiguration.class, "ProrGeneralConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProrGeneralConfiguration_LabelConfiguration(), this.getLabelConfiguration(), null, "labelConfiguration", null, 1, 1, ProrGeneralConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelConfigurationEClass, LabelConfiguration.class, "LabelConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabelConfiguration_DefaultLabel(), ecorePackage.getEString(), "defaultLabel", null, 0, -1, LabelConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData
		createXMLPersistenceMappingExtendedMetaDataAnnotations();
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
		  (getProrToolExtension_SpecViewConfigurations(), 
		   source, 
		   new String[] {
			 "name", "specViewConfigurations",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getProrToolExtension_GeneralConfiguration(), 
		   source, 
		   new String[] {
			 "name", "generalConfiguration",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getProrToolExtension_PresentationConfigurations(), 
		   source, 
		   new String[] {
			 "name", "presentationConfigurations",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getProrSpecViewConfiguration_Columns(), 
		   source, 
		   new String[] {
			 "name", "columns",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getProrSpecViewConfiguration_LeftHeaderColumn(), 
		   source, 
		   new String[] {
			 "name", "leftHeaderColumn",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getProrPresentationConfigurations_PresentationConfigurations(), 
		   source, 
		   new String[] {
			 "name", "presentationConfigurations",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getProrGeneralConfiguration_LabelConfiguration(), 
		   source, 
		   new String[] {
			 "name", "labelConfiguration",
			 "kind", "element",
			 "namespace", "##targetNamespace"
		   });	
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXMLPersistenceMappingExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData";			
		addAnnotation
		  (getProrToolExtension_SpecViewConfigurations(), 
		   source, 
		   new String[] {
			 "wrapperName", "specViewConfigurations",
			 "featureWrapperElement", "true",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "true"
		   });			
		addAnnotation
		  (getProrToolExtension_GeneralConfiguration(), 
		   source, 
		   new String[] {
			 "wrapperName", "generalConfiguration",
			 "featureWrapperElement", "true",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "true"
		   });			
		addAnnotation
		  (getProrToolExtension_PresentationConfigurations(), 
		   source, 
		   new String[] {
			 "wrapperName", "presentationConfigurations",
			 "featureWrapperElement", "true",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "true"
		   });			
		addAnnotation
		  (getProrSpecViewConfiguration_Columns(), 
		   source, 
		   new String[] {
			 "wrapperName", "columns",
			 "featureWrapperElement", "true",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "true"
		   });			
		addAnnotation
		  (getProrSpecViewConfiguration_LeftHeaderColumn(), 
		   source, 
		   new String[] {
			 "wrapperName", "leftHeaderColumn",
			 "featureWrapperElement", "true",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "true"
		   });			
		addAnnotation
		  (getProrPresentationConfigurations_PresentationConfigurations(), 
		   source, 
		   new String[] {
			 "wrapperName", "presentationConfigurations",
			 "featureWrapperElement", "true",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "true"
		   });			
		addAnnotation
		  (getProrGeneralConfiguration_LabelConfiguration(), 
		   source, 
		   new String[] {
			 "wrapperName", "labelConfiguration",
			 "featureWrapperElement", "true",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "true"
		   });
	}

} //ConfigPackageImpl
