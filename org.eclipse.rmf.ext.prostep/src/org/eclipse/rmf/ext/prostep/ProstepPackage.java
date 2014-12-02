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
package org.eclipse.rmf.ext.prostep;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.ext.prostep.ProstepFactory
 * @model kind="package"
 * @generated
 */
public interface ProstepPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "prostep";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.prostep.org/reqif";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "reqif-common";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProstepPackage eINSTANCE = org.eclipse.rmf.ext.prostep.impl.ProstepPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.ext.prostep.impl.ExchangeConversationImpl <em>Exchange Conversation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.ext.prostep.impl.ExchangeConversationImpl
	 * @see org.eclipse.rmf.ext.prostep.impl.ProstepPackageImpl#getExchangeConversation()
	 * @generated
	 */
	int EXCHANGE_CONVERSATION = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_CONVERSATION__IDENTIFIER = 0;

	/**
	 * The number of structural features of the '<em>Exchange Conversation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_CONVERSATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Exchange Conversation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_CONVERSATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.ext.prostep.ExchangeConversation <em>Exchange Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exchange Conversation</em>'.
	 * @see org.eclipse.rmf.ext.prostep.ExchangeConversation
	 * @generated
	 */
	EClass getExchangeConversation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.ext.prostep.ExchangeConversation#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.rmf.ext.prostep.ExchangeConversation#getIdentifier()
	 * @see #getExchangeConversation()
	 * @generated
	 */
	EAttribute getExchangeConversation_Identifier();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProstepFactory getProstepFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.ext.prostep.impl.ExchangeConversationImpl <em>Exchange Conversation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.ext.prostep.impl.ExchangeConversationImpl
		 * @see org.eclipse.rmf.ext.prostep.impl.ProstepPackageImpl#getExchangeConversation()
		 * @generated
		 */
		EClass EXCHANGE_CONVERSATION = eINSTANCE.getExchangeConversation();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE_CONVERSATION__IDENTIFIER = eINSTANCE.getExchangeConversation_Identifier();

	}

} //ProstepPackage
