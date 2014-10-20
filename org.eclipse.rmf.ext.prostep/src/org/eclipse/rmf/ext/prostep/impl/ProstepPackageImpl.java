/**
 * Copyright (c) 2014 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.ext.prostep.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.rmf.ext.prostep.ExchangeConversation;
import org.eclipse.rmf.ext.prostep.ProstepFactory;
import org.eclipse.rmf.ext.prostep.ProstepPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProstepPackageImpl extends EPackageImpl implements ProstepPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeConversationEClass = null;

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
	 * @see org.eclipse.rmf.ext.prostep.ProstepPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProstepPackageImpl() {
		super(eNS_URI, ProstepFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProstepPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProstepPackage init() {
		if (isInited) return (ProstepPackage)EPackage.Registry.INSTANCE.getEPackage(ProstepPackage.eNS_URI);

		// Obtain or create and register package
		ProstepPackageImpl theProstepPackage = (ProstepPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProstepPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProstepPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theProstepPackage.createPackageContents();

		// Initialize created meta-data
		theProstepPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProstepPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProstepPackage.eNS_URI, theProstepPackage);
		return theProstepPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExchangeConversation() {
		return exchangeConversationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExchangeConversation_Identifier() {
		return (EAttribute)exchangeConversationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProstepFactory getProstepFactory() {
		return (ProstepFactory)getEFactoryInstance();
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
		exchangeConversationEClass = createEClass(EXCHANGE_CONVERSATION);
		createEAttribute(exchangeConversationEClass, EXCHANGE_CONVERSATION__IDENTIFIER);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(exchangeConversationEClass, ExchangeConversation.class, "ExchangeConversation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExchangeConversation_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, ExchangeConversation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (exchangeConversationEClass, 
		   source, 
		   new String[] {
			 "kind", "elementOnly",
			 "name", "EXCHANGE-CONVERSATION"
		   });	
		addAnnotation
		  (getExchangeConversation_Identifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IDENTIFIER"
		   });
	}

} //ProstepPackageImpl
