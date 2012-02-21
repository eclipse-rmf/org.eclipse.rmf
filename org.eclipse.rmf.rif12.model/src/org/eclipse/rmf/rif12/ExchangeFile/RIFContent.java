/*******************************************************************************
 * Copyright (c) 2011 itemis GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nirmal Sasidharan - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.rif12.ExchangeFile;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RIF Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.RIFContent#getAccessPolicies <em>Access Policies</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.RIFContent#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.RIFContent#getSpecHierarchyRoots <em>Spec Hierarchy Roots</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.RIFContent#getSpecObjects <em>Spec Objects</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.RIFContent#getSpecGroups <em>Spec Groups</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.RIFContent#getSpecGroupHierarchyRoots <em>Spec Group Hierarchy Roots</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.RIFContent#getSpecTypes <em>Spec Types</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.RIFContent#getSpecRelations <em>Spec Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getRIFContent()
 * @model
 * @generated
 */
public interface RIFContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Access Policies</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.ExchangeFile.AccessPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Policies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Policies</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getRIFContent_AccessPolicies()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AccessPolicy> getAccessPolicies();

	/**
	 * Returns the value of the '<em><b>Datatypes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatypes</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getRIFContent_Datatypes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DatatypeDefinition> getDatatypes();

	/**
	 * Returns the value of the '<em><b>Spec Hierarchy Roots</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.ExchangeFile.SpecHierarchyRoot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Hierarchy Roots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Hierarchy Roots</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getRIFContent_SpecHierarchyRoots()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SpecHierarchyRoot> getSpecHierarchyRoots();

	/**
	 * Returns the value of the '<em><b>Spec Objects</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.ExchangeFile.SpecObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Objects</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getRIFContent_SpecObjects()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SpecObject> getSpecObjects();

	/**
	 * Returns the value of the '<em><b>Spec Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.ExchangeFile.SpecGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Groups</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getRIFContent_SpecGroups()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SpecGroup> getSpecGroups();

	/**
	 * Returns the value of the '<em><b>Spec Group Hierarchy Roots</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.ExchangeFile.SpecGroupHierarchyRoot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Group Hierarchy Roots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Group Hierarchy Roots</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getRIFContent_SpecGroupHierarchyRoots()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SpecGroupHierarchyRoot> getSpecGroupHierarchyRoots();

	/**
	 * Returns the value of the '<em><b>Spec Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.ExchangeFile.SpecType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Types</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getRIFContent_SpecTypes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SpecType> getSpecTypes();

	/**
	 * Returns the value of the '<em><b>Spec Relations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.ExchangeFile.SpecRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Relations</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getRIFContent_SpecRelations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SpecRelation> getSpecRelations();

} // RIFContent
