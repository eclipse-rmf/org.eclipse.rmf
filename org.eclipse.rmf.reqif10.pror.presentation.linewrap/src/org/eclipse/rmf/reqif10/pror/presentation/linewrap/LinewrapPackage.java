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

package org.eclipse.rmf.reqif10.pror.presentation.linewrap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.reqif10.pror.presentation.linewrap.LinewrapFactory
 * @model kind="package"
 * @generated
 */
public interface LinewrapPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "linewrap";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://pror.org/presentation/linewrap";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "linewrap";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LinewrapPackage eINSTANCE = org.eclipse.rmf.reqif10.pror.presentation.linewrap.impl.LinewrapPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.pror.presentation.linewrap.impl.LinewrapConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.pror.presentation.linewrap.impl.LinewrapConfigurationImpl
	 * @see org.eclipse.rmf.reqif10.pror.presentation.linewrap.impl.LinewrapPackageImpl#getLinewrapConfiguration()
	 * @generated
	 */
	int LINEWRAP_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEWRAP_CONFIGURATION__DATATYPE = ConfigurationPackage.PROR_PRESENTATION_CONFIGURATION__DATATYPE;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEWRAP_CONFIGURATION_FEATURE_COUNT = ConfigurationPackage.PROR_PRESENTATION_CONFIGURATION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.pror.presentation.linewrap.LinewrapConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see org.eclipse.rmf.reqif10.pror.presentation.linewrap.LinewrapConfiguration
	 * @generated
	 */
	EClass getLinewrapConfiguration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LinewrapFactory getLinewrapFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.pror.presentation.linewrap.impl.LinewrapConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.pror.presentation.linewrap.impl.LinewrapConfigurationImpl
		 * @see org.eclipse.rmf.reqif10.pror.presentation.linewrap.impl.LinewrapPackageImpl#getLinewrapConfiguration()
		 * @generated
		 */
		EClass LINEWRAP_CONFIGURATION = eINSTANCE.getLinewrapConfiguration();

	}

} //LinewrapPackage
