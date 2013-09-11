/**
 */
package org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.rmf.reqif10.ReqIF10Package;

import org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.Extension;
import org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.SpecObjectExtension;
import org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.ToolextensionFactory;
import org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.ToolextensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToolextensionPackageImpl extends EPackageImpl implements ToolextensionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specObjectExtensionEClass = null;

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
	 * @see org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.ToolextensionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ToolextensionPackageImpl() {
		super(eNS_URI, ToolextensionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ToolextensionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ToolextensionPackage init() {
		if (isInited) return (ToolextensionPackage)EPackage.Registry.INSTANCE.getEPackage(ToolextensionPackage.eNS_URI);

		// Obtain or create and register package
		ToolextensionPackageImpl theToolextensionPackage = (ToolextensionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ToolextensionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ToolextensionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ReqIF10Package.eINSTANCE.eClass();

		// Create package meta-data objects
		theToolextensionPackage.createPackageContents();

		// Initialize created meta-data
		theToolextensionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theToolextensionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ToolextensionPackage.eNS_URI, theToolextensionPackage);
		return theToolextensionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtension() {
		return extensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_SpecObjectExtensions() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecObjectExtension() {
		return specObjectExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecObjectExtension_ExtendedDesc() {
		return (EAttribute)specObjectExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecObjectExtension_ExtendedSpecObject() {
		return (EReference)specObjectExtensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolextensionFactory getToolextensionFactory() {
		return (ToolextensionFactory)getEFactoryInstance();
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
		extensionEClass = createEClass(EXTENSION);
		createEReference(extensionEClass, EXTENSION__SPEC_OBJECT_EXTENSIONS);

		specObjectExtensionEClass = createEClass(SPEC_OBJECT_EXTENSION);
		createEAttribute(specObjectExtensionEClass, SPEC_OBJECT_EXTENSION__EXTENDED_DESC);
		createEReference(specObjectExtensionEClass, SPEC_OBJECT_EXTENSION__EXTENDED_SPEC_OBJECT);
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
		initEClass(extensionEClass, Extension.class, "Extension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtension_SpecObjectExtensions(), this.getSpecObjectExtension(), null, "specObjectExtensions", null, 0, -1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specObjectExtensionEClass, SpecObjectExtension.class, "SpecObjectExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecObjectExtension_ExtendedDesc(), ecorePackage.getEString(), "extendedDesc", null, 0, 1, SpecObjectExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecObjectExtension_ExtendedSpecObject(), theReqIF10Package.getSpecObject(), null, "extendedSpecObject", null, 0, 1, SpecObjectExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (getExtension_SpecObjectExtensions(), 
		   source, 
		   new String[] {
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
		  (getExtension_SpecObjectExtensions(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "true"
		   });
	}

} //ToolextensionPackageImpl
