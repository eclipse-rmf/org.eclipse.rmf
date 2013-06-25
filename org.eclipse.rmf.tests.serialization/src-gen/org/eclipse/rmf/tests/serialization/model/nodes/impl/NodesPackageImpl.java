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
package org.eclipse.rmf.tests.serialization.model.nodes.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.rmf.tests.serialization.model.nodes.AbstractNode;
import org.eclipse.rmf.tests.serialization.model.nodes.Node;
import org.eclipse.rmf.tests.serialization.model.nodes.NodesFactory;
import org.eclipse.rmf.tests.serialization.model.nodes.NodesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodesPackageImpl extends EPackageImpl implements NodesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNodeEClass = null;

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
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.NodesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NodesPackageImpl() {
		super(eNS_URI, NodesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NodesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NodesPackage init() {
		if (isInited) return (NodesPackage)EPackage.Registry.INSTANCE.getEPackage(NodesPackage.eNS_URI);

		// Obtain or create and register package
		NodesPackageImpl theNodesPackage = (NodesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NodesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NodesPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theNodesPackage.createPackageContents();

		// Initialize created meta-data
		theNodesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNodesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NodesPackage.eNS_URI, theNodesPackage);
		return theNodesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization0000_Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization0001_Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization0010_Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization0011_Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization0100_Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization0101_Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization0110_Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization0111_Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization1000_Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization1001_Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization1010_Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization1011_Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization1100_Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization1101_Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization1110_Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization1111_Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureEmptyAnnotation_Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureNoAnnotation_Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization0000_Multi() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization0001_Multi() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization0010_Multi() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization0011_Multi() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization0100_Multi() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization0101_Multi() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization0110_Multi() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization0111_Multi() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization1000_Multi() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization1001_Multi() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization1010_Multi() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization1011_Multi() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization1100_Multi() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization1101_Multi() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization1110_Multi() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithSerialization1111_Multi() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureEmptyAnnotation_Multi() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureNoAnnotation_Multi() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Name() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithTypeEObjectAndSerialization0001_Multi() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithTypeEObjectAndSerialization0010_Multi() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithTypeEObjectAndSerialization0100_Multi() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_FeatureWithTypeEObjectAndSerialization1000_Multi() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractNode() {
		return abstractNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodesFactory getNodesFactory() {
		return (NodesFactory)getEFactoryInstance();
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
		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION0000_SINGLE);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION0001_SINGLE);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION0010_SINGLE);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION0011_SINGLE);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION0100_SINGLE);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION0101_SINGLE);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION0110_SINGLE);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION0111_SINGLE);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION1000_SINGLE);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION1001_SINGLE);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION1010_SINGLE);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION1011_SINGLE);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION1100_SINGLE);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION1101_SINGLE);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION1110_SINGLE);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION1111_SINGLE);
		createEReference(nodeEClass, NODE__FEATURE_EMPTY_ANNOTATION_SINGLE);
		createEReference(nodeEClass, NODE__FEATURE_NO_ANNOTATION_SINGLE);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION0000_MULTI);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION0001_MULTI);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION0010_MULTI);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION0011_MULTI);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION0100_MULTI);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION0101_MULTI);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION0110_MULTI);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION0111_MULTI);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION1000_MULTI);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION1001_MULTI);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION1010_MULTI);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION1011_MULTI);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION1100_MULTI);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION1101_MULTI);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION1110_MULTI);
		createEReference(nodeEClass, NODE__FEATURE_WITH_SERIALIZATION1111_MULTI);
		createEReference(nodeEClass, NODE__FEATURE_EMPTY_ANNOTATION_MULTI);
		createEReference(nodeEClass, NODE__FEATURE_NO_ANNOTATION_MULTI);
		createEAttribute(nodeEClass, NODE__NAME);
		createEReference(nodeEClass, NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0001_MULTI);
		createEReference(nodeEClass, NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0010_MULTI);
		createEReference(nodeEClass, NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0100_MULTI);
		createEReference(nodeEClass, NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION1000_MULTI);

		abstractNodeEClass = createEClass(ABSTRACT_NODE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nodeEClass.getESuperTypes().add(this.getAbstractNode());

		// Initialize classes and features; add operations and parameters
		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_FeatureWithSerialization0000_Single(), this.getNode(), null, "featureWithSerialization0000_Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization0001_Single(), this.getNode(), null, "featureWithSerialization0001_Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization0010_Single(), this.getNode(), null, "featureWithSerialization0010_Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization0011_Single(), this.getNode(), null, "featureWithSerialization0011_Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization0100_Single(), this.getNode(), null, "featureWithSerialization0100_Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization0101_Single(), this.getNode(), null, "featureWithSerialization0101_Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization0110_Single(), this.getNode(), null, "featureWithSerialization0110_Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization0111_Single(), this.getNode(), null, "featureWithSerialization0111_Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization1000_Single(), this.getNode(), null, "featureWithSerialization1000_Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization1001_Single(), this.getNode(), null, "featureWithSerialization1001_Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization1010_Single(), this.getNode(), null, "featureWithSerialization1010_Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization1011_Single(), this.getNode(), null, "featureWithSerialization1011_Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization1100_Single(), this.getNode(), null, "featureWithSerialization1100_Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization1101_Single(), this.getNode(), null, "featureWithSerialization1101_Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization1110_Single(), this.getNode(), null, "featureWithSerialization1110_Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization1111_Single(), this.getNode(), null, "featureWithSerialization1111_Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureEmptyAnnotation_Single(), this.getNode(), null, "featureEmptyAnnotation_Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureNoAnnotation_Single(), this.getNode(), null, "featureNoAnnotation_Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization0000_Multi(), this.getNode(), null, "featureWithSerialization0000_Multi", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization0001_Multi(), this.getNode(), null, "featureWithSerialization0001_Multi", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization0010_Multi(), this.getNode(), null, "featureWithSerialization0010_Multi", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization0011_Multi(), this.getNode(), null, "featureWithSerialization0011_Multi", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization0100_Multi(), this.getNode(), null, "featureWithSerialization0100_Multi", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization0101_Multi(), this.getNode(), null, "featureWithSerialization0101_Multi", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization0110_Multi(), this.getNode(), null, "featureWithSerialization0110_Multi", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization0111_Multi(), this.getNode(), null, "featureWithSerialization0111_Multi", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization1000_Multi(), this.getNode(), null, "featureWithSerialization1000_Multi", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization1001_Multi(), this.getNode(), null, "featureWithSerialization1001_Multi", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization1010_Multi(), this.getNode(), null, "featureWithSerialization1010_Multi", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization1011_Multi(), this.getNode(), null, "featureWithSerialization1011_Multi", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization1100_Multi(), this.getNode(), null, "featureWithSerialization1100_Multi", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization1101_Multi(), this.getNode(), null, "featureWithSerialization1101_Multi", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization1110_Multi(), this.getNode(), null, "featureWithSerialization1110_Multi", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithSerialization1111_Multi(), this.getNode(), null, "featureWithSerialization1111_Multi", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureEmptyAnnotation_Multi(), this.getNode(), null, "featureEmptyAnnotation_Multi", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureNoAnnotation_Multi(), this.getNode(), null, "featureNoAnnotation_Multi", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithTypeEObjectAndSerialization0001_Multi(), ecorePackage.getEObject(), null, "featureWithTypeEObjectAndSerialization0001_Multi", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithTypeEObjectAndSerialization0010_Multi(), ecorePackage.getEObject(), null, "featureWithTypeEObjectAndSerialization0010_Multi", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithTypeEObjectAndSerialization0100_Multi(), ecorePackage.getEObject(), null, "featureWithTypeEObjectAndSerialization0100_Multi", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_FeatureWithTypeEObjectAndSerialization1000_Multi(), ecorePackage.getEObject(), null, "featureWithTypeEObjectAndSerialization1000_Multi", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractNodeEClass, AbstractNode.class, "AbstractNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http:///org/eclipse/rmf/serialization/RMFExtendedMetaData
		createRMFExtendedMetaDataAnnotations();
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
		  (nodeEClass, 
		   source, 
		   new String[] {
			 "name", "NODE",
			 "wrapperName", "NODES"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0000_Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0000-SINGLE",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0000-SINGLES"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0001_Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0001-SINGLE",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0001-SINGLES"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0010_Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0010-SINGLE",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0010-SINGLES"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0011_Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0011-SINGLE",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0011-SINGLES"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0100_Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0100-SINGLE",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0100-SINGLES"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0101_Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0101-SINGLE",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0101-SINGLES"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0110_Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0110-SINGLE",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0110-SINGLES"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0111_Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0111-SINGLE",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0111-SINGLES"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1000_Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1000-SINGLE",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1000-SINGLES"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1001_Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1001-SINGLE",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1001-SINGLES"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1010_Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1010-SINGLE",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1010-SINGLES"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1011_Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1011-SINGLE",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1011-SINGLES"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1100_Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1100-SINGLE",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1100-SINGLES"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1101_Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1101-SINGLE",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1101-SINGLES"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1110_Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1110-SINGLE",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1110-SINGLES"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1111_Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1111-SINGLE",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1111-SINGLES"
		   });				
		addAnnotation
		  (getNode_FeatureWithSerialization0000_Multi(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0000-MULTI",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0000-MULTIS"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0001_Multi(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0010_Multi(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0010-MULTI",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0010-MULTIS"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0011_Multi(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0011-MULTI",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0011-MULTIS"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0100_Multi(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0100-MULTI",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0100-MULTIS"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0101_Multi(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0101-MULTI",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0101-MULTIS"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0110_Multi(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0110-MULTI",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0110-MULTIS"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0111_Multi(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0111-MULTI",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0111-MULTIS"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1000_Multi(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1000-MULTI",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1000-MULTIS"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1001_Multi(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1001-MULTI",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1001-MULTIS"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1010_Multi(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1010-MULTI",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1010-MULTIS"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1011_Multi(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1011-MULTI",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1011-MULTIS"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1100_Multi(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1100-MULTI",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1100-MULTIS"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1101_Multi(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1101-MULTI",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1101-MULTIS"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1110_Multi(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1110-MULTI",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1110-MULTIS"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1111_Multi(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1111-MULTI",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1111-MULTIS"
		   });				
		addAnnotation
		  (getNode_FeatureWithTypeEObjectAndSerialization0001_Multi(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getNode_FeatureWithTypeEObjectAndSerialization0010_Multi(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0010-MULTI",
			 "wrapperName", "FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0010-MULTIS"
		   });			
		addAnnotation
		  (getNode_FeatureWithTypeEObjectAndSerialization0100_Multi(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0100-MULTI",
			 "wrapperName", "FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0100-MULTIS"
		   });			
		addAnnotation
		  (getNode_FeatureWithTypeEObjectAndSerialization1000_Multi(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-1000-MULTI",
			 "wrapperName", "FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-1000-MULTIS"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/rmf/serialization/RMFExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createRMFExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/rmf/serialization/RMFExtendedMetaData";			
		addAnnotation
		  (getNode_FeatureWithSerialization0000_Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "false"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0001_Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "true"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0010_Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "false",
			 "classifierWrapperElement", "true",
			 "classifierElement", "false"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0011_Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "false",
			 "classifierWrapperElement", "true",
			 "classifierElement", "true"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0100_Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "true",
			 "classifierWrapperElement", "false",
			 "classifierElement", "false"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0101_Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "true",
			 "classifierWrapperElement", "false",
			 "classifierElement", "true"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0110_Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "true",
			 "classifierWrapperElement", "true",
			 "classifierElement", "false"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0111_Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "true",
			 "classifierWrapperElement", "true",
			 "classifierElement", "true"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1000_Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "false"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1001_Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "true"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1010_Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "false",
			 "classifierWrapperElement", "true",
			 "classifierElement", "false"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1011_Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "false",
			 "classifierWrapperElement", "true",
			 "classifierElement", "true"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1100_Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "true",
			 "classifierWrapperElement", "false",
			 "classifierElement", "false"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1101_Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "true",
			 "classifierWrapperElement", "false",
			 "classifierElement", "true"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1110_Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "true",
			 "classifierWrapperElement", "true",
			 "classifierElement", "false"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1111_Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "true",
			 "classifierWrapperElement", "true",
			 "classifierElement", "true"
		   });			
		addAnnotation
		  (getNode_FeatureEmptyAnnotation_Single(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getNode_FeatureWithSerialization0000_Multi(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "false"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0001_Multi(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "true",
			 "name", "FEATURE-WITH-SERIALIZATION-0001-MULTI",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0001-MULTIS"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0010_Multi(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "false",
			 "classifierWrapperElement", "true",
			 "classifierElement", "false"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0011_Multi(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "false",
			 "classifierWrapperElement", "true",
			 "classifierElement", "true"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0100_Multi(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "true",
			 "classifierWrapperElement", "false",
			 "classifierElement", "false"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0101_Multi(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "true",
			 "classifierWrapperElement", "false",
			 "classifierElement", "true"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0110_Multi(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "true",
			 "classifierWrapperElement", "true",
			 "classifierElement", "false"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization0111_Multi(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "true",
			 "classifierWrapperElement", "true",
			 "classifierElement", "true"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1000_Multi(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "false"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1001_Multi(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "true"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1010_Multi(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "false",
			 "classifierWrapperElement", "true",
			 "classifierElement", "false"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1011_Multi(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "false",
			 "classifierWrapperElement", "true",
			 "classifierElement", "true"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1100_Multi(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "true",
			 "classifierWrapperElement", "false",
			 "classifierElement", "false"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1101_Multi(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "true",
			 "classifierWrapperElement", "false",
			 "classifierElement", "true"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1110_Multi(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "true",
			 "classifierWrapperElement", "true",
			 "classifierElement", "false"
		   });			
		addAnnotation
		  (getNode_FeatureWithSerialization1111_Multi(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "true",
			 "classifierWrapperElement", "true",
			 "classifierElement", "true"
		   });			
		addAnnotation
		  (getNode_FeatureEmptyAnnotation_Multi(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getNode_FeatureWithTypeEObjectAndSerialization0001_Multi(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "true",
			 "name", "FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0001-MULTI",
			 "wrapperName", "FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0001-MULTIS"
		   });			
		addAnnotation
		  (getNode_FeatureWithTypeEObjectAndSerialization0010_Multi(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "false",
			 "classifierWrapperElement", "true",
			 "classifierElement", "false"
		   });			
		addAnnotation
		  (getNode_FeatureWithTypeEObjectAndSerialization0100_Multi(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "true",
			 "classifierWrapperElement", "false",
			 "classifierElement", "false"
		   });			
		addAnnotation
		  (getNode_FeatureWithTypeEObjectAndSerialization1000_Multi(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "false"
		   });	
	}

} //NodesPackageImpl
