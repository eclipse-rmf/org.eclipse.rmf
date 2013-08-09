/**
 * Copyright (c) 2013 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    itemis AG - initial API and implementation
 * 
 */
package org.eclipse.rmf.tests.serialization.model.extnodes.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.rmf.tests.serialization.model.extnodes.ExtNodesFactory;
import org.eclipse.rmf.tests.serialization.model.extnodes.ExtNodesPackage;
import org.eclipse.rmf.tests.serialization.model.extnodes.ExtendedNode;
import org.eclipse.rmf.tests.serialization.model.extnodes.Extension;

import org.eclipse.rmf.tests.serialization.model.nodes.NodesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtNodesPackageImpl extends EPackageImpl implements ExtNodesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;

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
	 * @see org.eclipse.rmf.tests.serialization.model.extnodes.ExtNodesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExtNodesPackageImpl() {
		super(eNS_URI, ExtNodesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExtNodesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExtNodesPackage init() {
		if (isInited) return (ExtNodesPackage)EPackage.Registry.INSTANCE.getEPackage(ExtNodesPackage.eNS_URI);

		// Obtain or create and register package
		ExtNodesPackageImpl theExtNodesPackage = (ExtNodesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExtNodesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExtNodesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		NodesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theExtNodesPackage.createPackageContents();

		// Initialize created meta-data
		theExtNodesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExtNodesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExtNodesPackage.eNS_URI, theExtNodesPackage);
		return theExtNodesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtendedNode() {
		return extendedNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtendedNode_AltenativeName() {
		return (EAttribute)extendedNodeEClass.getEStructuralFeatures().get(0);
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
	public EReference getExtension_Extensions() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtNodesFactory getExtNodesFactory() {
		return (ExtNodesFactory)getEFactoryInstance();
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
		extendedNodeEClass = createEClass(EXTENDED_NODE);
		createEAttribute(extendedNodeEClass, EXTENDED_NODE__ALTENATIVE_NAME);

		extensionEClass = createEClass(EXTENSION);
		createEReference(extensionEClass, EXTENSION__EXTENSIONS);
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
		NodesPackage theNodesPackage = (NodesPackage)EPackage.Registry.INSTANCE.getEPackage(NodesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		extendedNodeEClass.getESuperTypes().add(theNodesPackage.getSubNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(extendedNodeEClass, ExtendedNode.class, "ExtendedNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtendedNode_AltenativeName(), ecorePackage.getEString(), "altenativeName", null, 0, 1, ExtendedNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionEClass, Extension.class, "Extension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtension_Extensions(), this.getExtendedNode(), null, "extensions", null, 0, -1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ExtNodesPackageImpl
