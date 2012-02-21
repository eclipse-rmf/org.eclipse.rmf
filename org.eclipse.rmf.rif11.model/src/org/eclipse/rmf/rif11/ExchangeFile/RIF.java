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

package org.eclipse.rmf.rif11.ExchangeFile;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RIF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the root element.
 * 
 * Instances of concrete elements must directly or indirectly be aggregated by the root element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getCountryCode <em>Country Code</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getSourceToolId <em>Source Tool Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getAccessPolicies <em>Access Policies</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getSpecHierarchyRoots <em>Spec Hierarchy Roots</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getSpecObjects <em>Spec Objects</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getSpecGroups <em>Spec Groups</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getSpecTypes <em>Spec Types</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getSpecRelations <em>Spec Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getRIF()
 * @model
 * @generated
 */
public interface RIF extends EObject {
	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getRIF_Author()
	 * @model dataType="org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.String" required="true" ordered="false"
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getRIF_Comment()
	 * @model dataType="org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.String" ordered="false"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country Code</em>' attribute.
	 * @see #setCountryCode(String)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getRIF_CountryCode()
	 * @model dataType="org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.String" ordered="false"
	 * @generated
	 */
	String getCountryCode();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getCountryCode <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country Code</em>' attribute.
	 * @see #getCountryCode()
	 * @generated
	 */
	void setCountryCode(String value);

	/**
	 * Returns the value of the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Time</em>' attribute.
	 * @see #setCreationTime(XMLGregorianCalendar)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getRIF_CreationTime()
	 * @model dataType="org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.DateTime" required="true" ordered="false"
	 * @generated
	 */
	XMLGregorianCalendar getCreationTime();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getCreationTime <em>Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Time</em>' attribute.
	 * @see #getCreationTime()
	 * @generated
	 */
	void setCreationTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getRIF_Identifier()
	 * @model dataType="org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.String" required="true" ordered="false"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Source Tool Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Tool Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Tool Id</em>' attribute.
	 * @see #setSourceToolId(String)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getRIF_SourceToolId()
	 * @model dataType="org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.String" required="true" ordered="false"
	 * @generated
	 */
	String getSourceToolId();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getSourceToolId <em>Source Tool Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Tool Id</em>' attribute.
	 * @see #getSourceToolId()
	 * @generated
	 */
	void setSourceToolId(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getRIF_Title()
	 * @model dataType="org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.String" required="true" ordered="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getRIF_Version()
	 * @model dataType="org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.String" required="true" ordered="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Access Policies</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Policies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Policies</em>' containment reference list.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getRIF_AccessPolicies()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AccessPolicy> getAccessPolicies();

	/**
	 * Returns the value of the '<em><b>Datatypes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatypes</em>' containment reference list.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getRIF_Datatypes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DatatypeDefinition> getDatatypes();

	/**
	 * Returns the value of the '<em><b>Spec Hierarchy Roots</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchyRoot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Hierarchy Roots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Hierarchy Roots</em>' containment reference list.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getRIF_SpecHierarchyRoots()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SpecHierarchyRoot> getSpecHierarchyRoots();

	/**
	 * Returns the value of the '<em><b>Spec Objects</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.ExchangeFile.SpecObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Objects</em>' containment reference list.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getRIF_SpecObjects()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SpecObject> getSpecObjects();

	/**
	 * Returns the value of the '<em><b>Spec Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.ExchangeFile.SpecGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Groups</em>' containment reference list.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getRIF_SpecGroups()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SpecGroup> getSpecGroups();

	/**
	 * Returns the value of the '<em><b>Spec Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.ExchangeFile.SpecType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Types</em>' containment reference list.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getRIF_SpecTypes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SpecType> getSpecTypes();

	/**
	 * Returns the value of the '<em><b>Spec Relations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.ExchangeFile.SpecRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Relations</em>' containment reference list.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getRIF_SpecRelations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SpecRelation> getSpecRelations();

} // RIF
