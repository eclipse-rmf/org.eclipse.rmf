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
package org.eclipse.rmf.reqif10;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Req IF Tool Extension</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.rmf.reqif10.ReqIFToolExtension#getExtensions <em>Extensions</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getReqIFToolExtension()
 * @model extendedMetaData="name='REQ-IF-TOOL-EXTENSION' kind='elementOnly'" annotation=
 *        "http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='REQ-IF-TOOL-EXTENSION'"
 * @generated
 */
public interface ReqIFToolExtension extends EObject {
	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference list. The list contents are of type
	 * {@link org.eclipse.emf.ecore.EObject}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extensions</em>' containment reference list isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Extensions</em>' containment reference list.
	 * @see #isSetExtensions()
	 * @see #unsetExtensions()
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getReqIFToolExtension_Extensions()
	 * @model containment="true" unsettable="true" extendedMetaData=
	 *        "name='EXTENSIONS' kind='elementWildcard' namespace='##targetNamespace' precessing='lax' wildcards='##other'"
	 *        annotation=
	 *        "http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='EXTENSIONS' featureWrapperElement='false' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<EObject> getExtensions();

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.ReqIFToolExtension#getExtensions <em>Extensions</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isSetExtensions()
	 * @see #getExtensions()
	 * @generated
	 */
	void unsetExtensions();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.ReqIFToolExtension#getExtensions
	 * <em>Extensions</em>}' containment reference list is set. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Extensions</em>' containment reference list is set.
	 * @see #unsetExtensions()
	 * @see #getExtensions()
	 * @generated
	 */
	boolean isSetExtensions();

} // ReqIFToolExtension
