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
import org.eclipse.rmf.tests.serialization.model.nodes.SubNode;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subNodeEClass = null;

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
	public EReference getNode_EReference_Contained0000Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained0001Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained0010Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained0011Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained0100Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained0101Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained0110Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained0111Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained1000Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained1001Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained1010Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained1011Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained1100Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained1101Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained1110Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained1111Single() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_EmptyAnnotationSingle() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_NoAnnotationSingle() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained0000Many() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained0001Many() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained0010Many() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained0011Many() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained0100Many() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained0101Many() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained0110Many() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained0111Many() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained1000Many() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained1001Many() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained1010Many() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained1011Many() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained1100Many() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained1101Many() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained1110Many() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_Contained1111Many() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_EmptyAnnotationMany() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_NoAnnotationMany() {
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
	public EReference getNode_EReference_WithTypeEObject_Contained0001Many() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_WithTypeEObject_Contained0010Many() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_WithTypeEObject_Contained0100Many() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_EReference_WithTypeEObject_Contained1000Many() {
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
	public EClass getSubNode() {
		return subNodeEClass;
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
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED0000_SINGLE);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED0001_SINGLE);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED0010_SINGLE);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED0011_SINGLE);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED0100_SINGLE);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED0101_SINGLE);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED0110_SINGLE);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED0111_SINGLE);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED1000_SINGLE);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED1001_SINGLE);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED1010_SINGLE);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED1011_SINGLE);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED1100_SINGLE);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED1101_SINGLE);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED1110_SINGLE);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED1111_SINGLE);
		createEReference(nodeEClass, NODE__EREFERENCE_EMPTY_ANNOTATION_SINGLE);
		createEReference(nodeEClass, NODE__EREFERENCE_NO_ANNOTATION_SINGLE);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED0000_MANY);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED0001_MANY);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED0010_MANY);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED0011_MANY);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED0100_MANY);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED0101_MANY);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED0110_MANY);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED0111_MANY);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED1000_MANY);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED1001_MANY);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED1010_MANY);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED1011_MANY);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED1100_MANY);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED1101_MANY);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED1110_MANY);
		createEReference(nodeEClass, NODE__EREFERENCE_CONTAINED1111_MANY);
		createEReference(nodeEClass, NODE__EREFERENCE_EMPTY_ANNOTATION_MANY);
		createEReference(nodeEClass, NODE__EREFERENCE_NO_ANNOTATION_MANY);
		createEAttribute(nodeEClass, NODE__NAME);
		createEReference(nodeEClass, NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0001_MANY);
		createEReference(nodeEClass, NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0010_MANY);
		createEReference(nodeEClass, NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0100_MANY);
		createEReference(nodeEClass, NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED1000_MANY);

		abstractNodeEClass = createEClass(ABSTRACT_NODE);

		subNodeEClass = createEClass(SUB_NODE);
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
		subNodeEClass.getESuperTypes().add(this.getNode());

		// Initialize classes and features; add operations and parameters
		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_EReference_Contained0000Single(), this.getNode(), null, "eReference_Contained0000Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained0001Single(), this.getNode(), null, "eReference_Contained0001Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained0010Single(), this.getNode(), null, "eReference_Contained0010Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained0011Single(), this.getNode(), null, "eReference_Contained0011Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained0100Single(), this.getNode(), null, "eReference_Contained0100Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained0101Single(), this.getNode(), null, "eReference_Contained0101Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained0110Single(), this.getNode(), null, "eReference_Contained0110Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained0111Single(), this.getNode(), null, "eReference_Contained0111Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained1000Single(), this.getNode(), null, "eReference_Contained1000Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained1001Single(), this.getNode(), null, "eReference_Contained1001Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained1010Single(), this.getNode(), null, "eReference_Contained1010Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained1011Single(), this.getNode(), null, "eReference_Contained1011Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained1100Single(), this.getNode(), null, "eReference_Contained1100Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained1101Single(), this.getNode(), null, "eReference_Contained1101Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained1110Single(), this.getNode(), null, "eReference_Contained1110Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained1111Single(), this.getNode(), null, "eReference_Contained1111Single", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_EmptyAnnotationSingle(), this.getNode(), null, "eReference_EmptyAnnotationSingle", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_NoAnnotationSingle(), this.getNode(), null, "eReference_NoAnnotationSingle", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained0000Many(), this.getNode(), null, "eReference_Contained0000Many", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained0001Many(), this.getNode(), null, "eReference_Contained0001Many", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained0010Many(), this.getNode(), null, "eReference_Contained0010Many", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained0011Many(), this.getNode(), null, "eReference_Contained0011Many", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained0100Many(), this.getNode(), null, "eReference_Contained0100Many", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained0101Many(), this.getNode(), null, "eReference_Contained0101Many", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained0110Many(), this.getNode(), null, "eReference_Contained0110Many", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained0111Many(), this.getNode(), null, "eReference_Contained0111Many", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained1000Many(), this.getNode(), null, "eReference_Contained1000Many", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained1001Many(), this.getNode(), null, "eReference_Contained1001Many", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained1010Many(), this.getNode(), null, "eReference_Contained1010Many", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained1011Many(), this.getNode(), null, "eReference_Contained1011Many", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained1100Many(), this.getNode(), null, "eReference_Contained1100Many", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained1101Many(), this.getNode(), null, "eReference_Contained1101Many", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained1110Many(), this.getNode(), null, "eReference_Contained1110Many", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_Contained1111Many(), this.getNode(), null, "eReference_Contained1111Many", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_EmptyAnnotationMany(), this.getNode(), null, "eReference_EmptyAnnotationMany", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_NoAnnotationMany(), this.getNode(), null, "eReference_NoAnnotationMany", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_WithTypeEObject_Contained0001Many(), ecorePackage.getEObject(), null, "eReference_WithTypeEObject_Contained0001Many", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_WithTypeEObject_Contained0010Many(), ecorePackage.getEObject(), null, "eReference_WithTypeEObject_Contained0010Many", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_WithTypeEObject_Contained0100Many(), ecorePackage.getEObject(), null, "eReference_WithTypeEObject_Contained0100Many", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_EReference_WithTypeEObject_Contained1000Many(), ecorePackage.getEObject(), null, "eReference_WithTypeEObject_Contained1000Many", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractNodeEClass, AbstractNode.class, "AbstractNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subNodeEClass, SubNode.class, "SubNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (nodeEClass, 
		   source, 
		   new String[] {
			 "name", "NODE"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0000Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0000-SINGLE"
		   });				
		addAnnotation
		  (getNode_EReference_Contained0001Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0001-SINGLE"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0010Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0010-SINGLE"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0011Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0011-SINGLE"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0100Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0100-SINGLE"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0101Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0101-SINGLE"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0110Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0110-SINGLE"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0111Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0111-SINGLE"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1000Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1000-SINGLE"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1001Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1001-SINGLE"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1010Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1010-SINGLE"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1011Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1011-SINGLE"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1100Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1100-SINGLE"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1101Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1101-SINGLE"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1110Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1110-SINGLE"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1111Single(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1111-SINGLE"
		   });				
		addAnnotation
		  (getNode_EReference_Contained0000Many(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0000-MULTI"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0001Many(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0001-MULTI"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0010Many(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0010-MULTI"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0011Many(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0011-MULTI"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0100Many(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0100-MULTI"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0101Many(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0101-MULTI"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0110Many(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0110-MULTI"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0111Many(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-0111-MULTI"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1000Many(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1000-MULTI"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1001Many(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1001-MULTI"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1010Many(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1010-MULTI"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1011Many(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1011-MULTI"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1100Many(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1100-MULTI"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1101Many(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1101-MULTI"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1110Many(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1110-MULTI"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1111Many(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-SERIALIZATION-1111-MULTI"
		   });				
		addAnnotation
		  (getNode_EReference_WithTypeEObject_Contained0001Many(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0001-MULTI"
		   });			
		addAnnotation
		  (getNode_EReference_WithTypeEObject_Contained0010Many(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0010-MULTI"
		   });			
		addAnnotation
		  (getNode_EReference_WithTypeEObject_Contained0100Many(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0100-MULTI"
		   });			
		addAnnotation
		  (getNode_EReference_WithTypeEObject_Contained1000Many(), 
		   source, 
		   new String[] {
			 "namespace", "##targetNamespace",
			 "name", "FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-1000-MULTI"
		   });		
		addAnnotation
		  (subNodeEClass, 
		   source, 
		   new String[] {
			 "name", "SUB-NODE"
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
		  (nodeEClass, 
		   source, 
		   new String[] {
			 "wrapperName", "NODES"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0000Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "false",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0000-SINGLES"
		   });		
		addAnnotation
		  (getNode_EReference_Contained0001Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "true",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0001-SINGLES"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0010Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "false",
			 "classifierWrapperElement", "true",
			 "classifierElement", "false",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0010-SINGLES"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0011Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "false",
			 "classifierWrapperElement", "true",
			 "classifierElement", "true",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0011-SINGLES"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0100Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "true",
			 "classifierWrapperElement", "false",
			 "classifierElement", "false",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0100-SINGLES"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0101Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "true",
			 "classifierWrapperElement", "false",
			 "classifierElement", "true",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0101-SINGLES"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0110Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "true",
			 "classifierWrapperElement", "true",
			 "classifierElement", "false",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0110-SINGLES"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0111Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "true",
			 "classifierWrapperElement", "true",
			 "classifierElement", "true",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0111-SINGLES"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1000Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "false",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1000-SINGLES"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1001Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "true",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1001-SINGLES"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1010Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "false",
			 "classifierWrapperElement", "true",
			 "classifierElement", "false",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1010-SINGLES"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1011Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "false",
			 "classifierWrapperElement", "true",
			 "classifierElement", "true",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1011-SINGLES"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1100Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "true",
			 "classifierWrapperElement", "false",
			 "classifierElement", "false",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1100-SINGLES"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1101Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "true",
			 "classifierWrapperElement", "false",
			 "classifierElement", "true",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1101-SINGLES"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1110Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "true",
			 "classifierWrapperElement", "true",
			 "classifierElement", "false",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1110-SINGLES"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1111Single(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "true",
			 "classifierWrapperElement", "true",
			 "classifierElement", "true",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1111-SINGLES"
		   });			
		addAnnotation
		  (getNode_EReference_EmptyAnnotationSingle(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getNode_EReference_Contained0000Many(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "false",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0000-MULTIS"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0001Many(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "true",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0001-MULTIS"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0010Many(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "false",
			 "classifierWrapperElement", "true",
			 "classifierElement", "false",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0010-MULTIS"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0011Many(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "false",
			 "classifierWrapperElement", "true",
			 "classifierElement", "true",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0011-MULTIS"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0100Many(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "true",
			 "classifierWrapperElement", "false",
			 "classifierElement", "false",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0100-MULTIS"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0101Many(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "true",
			 "classifierWrapperElement", "false",
			 "classifierElement", "true",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0101-MULTIS"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0110Many(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "true",
			 "classifierWrapperElement", "true",
			 "classifierElement", "false",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0110-MULTIS"
		   });			
		addAnnotation
		  (getNode_EReference_Contained0111Many(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "true",
			 "classifierWrapperElement", "true",
			 "classifierElement", "true",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-0111-MULTIS"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1000Many(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "false",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1000-MULTIS"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1001Many(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "true",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1001-MULTIS"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1010Many(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "false",
			 "classifierWrapperElement", "true",
			 "classifierElement", "false",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1010-MULTIS"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1011Many(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "false",
			 "classifierWrapperElement", "true",
			 "classifierElement", "true",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1011-MULTIS"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1100Many(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "true",
			 "classifierWrapperElement", "false",
			 "classifierElement", "false",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1100-MULTIS"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1101Many(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "true",
			 "classifierWrapperElement", "false",
			 "classifierElement", "true",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1101-MULTIS"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1110Many(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "true",
			 "classifierWrapperElement", "true",
			 "classifierElement", "false",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1110-MULTIS"
		   });			
		addAnnotation
		  (getNode_EReference_Contained1111Many(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "true",
			 "classifierWrapperElement", "true",
			 "classifierElement", "true",
			 "wrapperName", "FEATURE-WITH-SERIALIZATION-1111-MULTIS"
		   });			
		addAnnotation
		  (getNode_EReference_EmptyAnnotationMany(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getNode_EReference_WithTypeEObject_Contained0001Many(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "true",
			 "wrapperName", "FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0001-MULTIS"
		   });			
		addAnnotation
		  (getNode_EReference_WithTypeEObject_Contained0010Many(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "false",
			 "classifierWrapperElement", "true",
			 "classifierElement", "false",
			 "wrapperName", "FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0010-MULTIS"
		   });			
		addAnnotation
		  (getNode_EReference_WithTypeEObject_Contained0100Many(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "false",
			 "featureElement", "true",
			 "classifierWrapperElement", "false",
			 "classifierElement", "false",
			 "wrapperName", "FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-0100-MULTIS"
		   });			
		addAnnotation
		  (getNode_EReference_WithTypeEObject_Contained1000Many(), 
		   source, 
		   new String[] {
			 "featureWrapperElement", "true",
			 "featureElement", "false",
			 "classifierWrapperElement", "false",
			 "classifierElement", "false",
			 "wrapperName", "FEATURE-WITH-TYPE-EOBJECT-AND-SERIALIZATION-1000-MULTIS"
		   });				
		addAnnotation
		  (subNodeEClass, 
		   source, 
		   new String[] {
			 "wrapperName", "SUB-NODES"
		   });
	}

} //NodesPackageImpl
