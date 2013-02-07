/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.pror.presentation.headline.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.datatypes.DatatypesPackage;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage;
import org.eclipse.rmf.reqif10.pror.presentation.headline.HeadlineConfiguration;
import org.eclipse.rmf.reqif10.pror.presentation.headline.HeadlineFactory;
import org.eclipse.rmf.reqif10.pror.presentation.headline.HeadlinePackage;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HeadlinePackageImpl extends EPackageImpl implements HeadlinePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headlineConfigurationEClass = null;

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
	 * @see org.eclipse.rmf.reqif10.pror.presentation.headline.HeadlinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HeadlinePackageImpl() {
		super(eNS_URI, HeadlineFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HeadlinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HeadlinePackage init() {
		if (isInited) return (HeadlinePackage)EPackage.Registry.INSTANCE.getEPackage(HeadlinePackage.eNS_URI);

		// Obtain or create and register package
		HeadlinePackageImpl theHeadlinePackage = (HeadlinePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HeadlinePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HeadlinePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ConfigurationPackage.eINSTANCE.eClass();
		ReqIF10Package.eINSTANCE.eClass();
		XhtmlPackage.eINSTANCE.eClass();
		DatatypesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theHeadlinePackage.createPackageContents();

		// Initialize created meta-data
		theHeadlinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHeadlinePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HeadlinePackage.eNS_URI, theHeadlinePackage);
		return theHeadlinePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeadlineConfiguration() {
		return headlineConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHeadlineConfiguration_Size() {
		return (EAttribute)headlineConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeadlineFactory getHeadlineFactory() {
		return (HeadlineFactory)getEFactoryInstance();
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
		headlineConfigurationEClass = createEClass(HEADLINE_CONFIGURATION);
		createEAttribute(headlineConfigurationEClass, HEADLINE_CONFIGURATION__SIZE);
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
		ConfigurationPackage theConfigurationPackage = (ConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		headlineConfigurationEClass.getESuperTypes().add(theConfigurationPackage.getProrPresentationConfiguration());

		// Initialize classes and features; add operations and parameters
		initEClass(headlineConfigurationEClass, HeadlineConfiguration.class, "HeadlineConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHeadlineConfiguration_Size(), ecorePackage.getEInt(), "size", "14", 1, 1, HeadlineConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //HeadlinePackageImpl
