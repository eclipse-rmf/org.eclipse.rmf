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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFileFactory
 * @model kind="package"
 * @generated
 */
public interface ExchangeFilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ExchangeFile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://automotive-his.de/200706/rif/rif/ef";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rif";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExchangeFilePackage eINSTANCE = org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.IdentifiableImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 2;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__DESC = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__LAST_CHANGE = 2;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__LONG_NAME = 3;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.SpecElementWithUserDefinedAttributesImpl <em>Spec Element With User Defined Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.SpecElementWithUserDefinedAttributesImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getSpecElementWithUserDefinedAttributes()
	 * @generated
	 */
	int SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__DESC = IDENTIFIABLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__LAST_CHANGE = IDENTIFIABLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__LONG_NAME = IDENTIFIABLE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__TYPE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__VALUES = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Spec Element With User Defined Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.SpecHierarchyRootImpl <em>Spec Hierarchy Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.SpecHierarchyRootImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getSpecHierarchyRoot()
	 * @generated
	 */
	int SPEC_HIERARCHY_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT__DESC = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT__IDENTIFIER = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT__LAST_CHANGE = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT__LONG_NAME = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT__TYPE = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__TYPE;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT__VALUES = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__VALUES;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT__CHILDREN = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Spec Hierarchy Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_ROOT_FEATURE_COUNT = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.SpecTypeImpl <em>Spec Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.SpecTypeImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getSpecType()
	 * @generated
	 */
	int SPEC_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_TYPE__DESC = IDENTIFIABLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_TYPE__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_TYPE__LAST_CHANGE = IDENTIFIABLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_TYPE__LONG_NAME = IDENTIFIABLE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Spec Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_TYPE__SPEC_ATTRIBUTES = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Spec Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_TYPE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeDefinitionImpl <em>Attribute Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeDefinitionImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getAttributeDefinition()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__DESC = IDENTIFIABLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__LAST_CHANGE = IDENTIFIABLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__LONG_NAME = IDENTIFIABLE__LONG_NAME;

	/**
	 * The number of structural features of the '<em>Attribute Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getAttributeValue()
	 * @generated
	 */
	int ATTRIBUTE_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE__DESC = IDENTIFIABLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE__LAST_CHANGE = IDENTIFIABLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE__LONG_NAME = IDENTIFIABLE__LONG_NAME;

	/**
	 * The number of structural features of the '<em>Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.SpecHierarchyImpl <em>Spec Hierarchy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.SpecHierarchyImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getSpecHierarchy()
	 * @generated
	 */
	int SPEC_HIERARCHY = 6;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY__DESC = IDENTIFIABLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY__LAST_CHANGE = IDENTIFIABLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY__LONG_NAME = IDENTIFIABLE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY__OBJECT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY__CHILDREN = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Spec Hierarchy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_HIERARCHY_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.SpecObjectImpl <em>Spec Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.SpecObjectImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getSpecObject()
	 * @generated
	 */
	int SPEC_OBJECT = 7;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT__DESC = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT__IDENTIFIER = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT__LAST_CHANGE = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT__LONG_NAME = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT__TYPE = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__TYPE;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT__VALUES = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__VALUES;

	/**
	 * The number of structural features of the '<em>Spec Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_OBJECT_FEATURE_COUNT = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.SpecGroupImpl <em>Spec Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.SpecGroupImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getSpecGroup()
	 * @generated
	 */
	int SPEC_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP__DESC = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP__IDENTIFIER = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP__LAST_CHANGE = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP__LONG_NAME = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP__TYPE = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__TYPE;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP__VALUES = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__VALUES;

	/**
	 * The feature id for the '<em><b>Spec Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP__SPEC_OBJECTS = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relation Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP__RELATION_GROUPS = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Spec Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_GROUP_FEATURE_COUNT = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.RelationGroupImpl <em>Relation Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.RelationGroupImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getRelationGroup()
	 * @generated
	 */
	int RELATION_GROUP = 9;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP__DESC = IDENTIFIABLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP__LAST_CHANGE = IDENTIFIABLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP__LONG_NAME = IDENTIFIABLE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Spec Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP__SPEC_RELATIONS = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relation Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP__RELATION_TYPE = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP__SOURCE_GROUP = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relation Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_GROUP_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.SpecRelationImpl <em>Spec Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.SpecRelationImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getSpecRelation()
	 * @generated
	 */
	int SPEC_RELATION = 10;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION__DESC = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION__IDENTIFIER = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION__LAST_CHANGE = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION__LONG_NAME = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION__TYPE = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__TYPE;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION__VALUES = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__VALUES;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION__TARGET = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION__SOURCE = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Spec Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_RELATION_FEATURE_COUNT = SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionImpl <em>Datatype Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getDatatypeDefinition()
	 * @generated
	 */
	int DATATYPE_DEFINITION = 11;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION__DESC = IDENTIFIABLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION__LAST_CHANGE = IDENTIFIABLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION__LONG_NAME = IDENTIFIABLE__LONG_NAME;

	/**
	 * The number of structural features of the '<em>Datatype Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AccessPolicyImpl <em>Access Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.AccessPolicyImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getAccessPolicy()
	 * @generated
	 */
	int ACCESS_POLICY = 12;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__DESC = IDENTIFIABLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__LAST_CHANGE = IDENTIFIABLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__LONG_NAME = IDENTIFIABLE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Access Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__ACCESS_MODE = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Spec Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__SPEC_GROUPS = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__ATTRIBUTE_DEFINITIONS = IDENTIFIABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Relation Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__RELATION_GROUPS = IDENTIFIABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Datatype Definitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__DATATYPE_DEFINITIONS = IDENTIFIABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Spec Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__SPEC_RELATIONS = IDENTIFIABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attribute Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__ATTRIBUTE_VALUES = IDENTIFIABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Spec Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__SPEC_TYPES = IDENTIFIABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Spec Hierarchies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__SPEC_HIERARCHIES = IDENTIFIABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Spec Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__SPEC_OBJECTS = IDENTIFIABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Spec Hierarchy Roots</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY__SPEC_HIERARCHY_ROOTS = IDENTIFIABLE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Access Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POLICY_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeDefinitionComplexImpl <em>Attribute Definition Complex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeDefinitionComplexImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getAttributeDefinitionComplex()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX = 13;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX__DESC = ATTRIBUTE_DEFINITION__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX__IDENTIFIER = ATTRIBUTE_DEFINITION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX__LAST_CHANGE = ATTRIBUTE_DEFINITION__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX__LONG_NAME = ATTRIBUTE_DEFINITION__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX__TYPE = ATTRIBUTE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX__DEFAULT_VALUE = ATTRIBUTE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Definition Complex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_COMPLEX_FEATURE_COUNT = ATTRIBUTE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionComplexImpl <em>Datatype Definition Complex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionComplexImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getDatatypeDefinitionComplex()
	 * @generated
	 */
	int DATATYPE_DEFINITION_COMPLEX = 14;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_COMPLEX__DESC = DATATYPE_DEFINITION__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_COMPLEX__IDENTIFIER = DATATYPE_DEFINITION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_COMPLEX__LAST_CHANGE = DATATYPE_DEFINITION__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_COMPLEX__LONG_NAME = DATATYPE_DEFINITION__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_COMPLEX__EMBEDDED = DATATYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Datatype Definition Complex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_COMPLEX_FEATURE_COUNT = DATATYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueComplexImpl <em>Attribute Value Complex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueComplexImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getAttributeValueComplex()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_COMPLEX = 15;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_COMPLEX__DESC = ATTRIBUTE_VALUE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_COMPLEX__IDENTIFIER = ATTRIBUTE_VALUE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_COMPLEX__LAST_CHANGE = ATTRIBUTE_VALUE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_COMPLEX__LONG_NAME = ATTRIBUTE_VALUE__LONG_NAME;

	/**
	 * The number of structural features of the '<em>Attribute Value Complex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_COMPLEX_FEATURE_COUNT = ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeDefinitionEnumerationImpl <em>Attribute Definition Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeDefinitionEnumerationImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getAttributeDefinitionEnumeration()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION = 16;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION__DESC = ATTRIBUTE_DEFINITION__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION__IDENTIFIER = ATTRIBUTE_DEFINITION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION__LAST_CHANGE = ATTRIBUTE_DEFINITION__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION__LONG_NAME = ATTRIBUTE_DEFINITION__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Multi Valued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION__MULTI_VALUED = ATTRIBUTE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION__TYPE = ATTRIBUTE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULT_VALUE = ATTRIBUTE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute Definition Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_ENUMERATION_FEATURE_COUNT = ATTRIBUTE_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionEnumerationImpl <em>Datatype Definition Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionEnumerationImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getDatatypeDefinitionEnumeration()
	 * @generated
	 */
	int DATATYPE_DEFINITION_ENUMERATION = 17;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_ENUMERATION__DESC = DATATYPE_DEFINITION__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_ENUMERATION__IDENTIFIER = DATATYPE_DEFINITION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_ENUMERATION__LAST_CHANGE = DATATYPE_DEFINITION__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_ENUMERATION__LONG_NAME = DATATYPE_DEFINITION__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Specified Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_ENUMERATION__SPECIFIED_VALUES = DATATYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Datatype Definition Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_ENUMERATION_FEATURE_COUNT = DATATYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.EnumValueImpl <em>Enum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.EnumValueImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getEnumValue()
	 * @generated
	 */
	int ENUM_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__DESC = IDENTIFIABLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__IDENTIFIER = IDENTIFIABLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__LAST_CHANGE = IDENTIFIABLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__LONG_NAME = IDENTIFIABLE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__PROPERTIES = IDENTIFIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_FEATURE_COUNT = IDENTIFIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.EmbeddedValueImpl <em>Embedded Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.EmbeddedValueImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getEmbeddedValue()
	 * @generated
	 */
	int EMBEDDED_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_VALUE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Other Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_VALUE__OTHER_CONTENT = 1;

	/**
	 * The number of structural features of the '<em>Embedded Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDED_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueEnumerationImpl <em>Attribute Value Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueEnumerationImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getAttributeValueEnumeration()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_ENUMERATION = 20;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ENUMERATION__DESC = ATTRIBUTE_VALUE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ENUMERATION__IDENTIFIER = ATTRIBUTE_VALUE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ENUMERATION__LAST_CHANGE = ATTRIBUTE_VALUE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ENUMERATION__LONG_NAME = ATTRIBUTE_VALUE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ENUMERATION__VALUES = ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ENUMERATION__DEFINITION = ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Value Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_ENUMERATION_FEATURE_COUNT = ATTRIBUTE_VALUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeDefinitionSimpleImpl <em>Attribute Definition Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeDefinitionSimpleImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getAttributeDefinitionSimple()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE = 21;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE__DESC = ATTRIBUTE_DEFINITION__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE__IDENTIFIER = ATTRIBUTE_DEFINITION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE__LAST_CHANGE = ATTRIBUTE_DEFINITION__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE__LONG_NAME = ATTRIBUTE_DEFINITION__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE__TYPE = ATTRIBUTE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE = ATTRIBUTE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Definition Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_SIMPLE_FEATURE_COUNT = ATTRIBUTE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionSimpleImpl <em>Datatype Definition Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionSimpleImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getDatatypeDefinitionSimple()
	 * @generated
	 */
	int DATATYPE_DEFINITION_SIMPLE = 22;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_SIMPLE__DESC = DATATYPE_DEFINITION__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_SIMPLE__IDENTIFIER = DATATYPE_DEFINITION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_SIMPLE__LAST_CHANGE = DATATYPE_DEFINITION__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_SIMPLE__LONG_NAME = DATATYPE_DEFINITION__LONG_NAME;

	/**
	 * The number of structural features of the '<em>Datatype Definition Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT = DATATYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueSimpleImpl <em>Attribute Value Simple</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueSimpleImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getAttributeValueSimple()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_SIMPLE = 23;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SIMPLE__DESC = ATTRIBUTE_VALUE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SIMPLE__IDENTIFIER = ATTRIBUTE_VALUE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SIMPLE__LAST_CHANGE = ATTRIBUTE_VALUE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SIMPLE__LONG_NAME = ATTRIBUTE_VALUE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>The Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SIMPLE__THE_VALUE = ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SIMPLE__DEFINITION = ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Value Simple</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_SIMPLE_FEATURE_COUNT = ATTRIBUTE_VALUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueEmbeddedDocumentImpl <em>Attribute Value Embedded Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueEmbeddedDocumentImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getAttributeValueEmbeddedDocument()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT = 24;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DESC = ATTRIBUTE_VALUE_COMPLEX__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__IDENTIFIER = ATTRIBUTE_VALUE_COMPLEX__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__LAST_CHANGE = ATTRIBUTE_VALUE_COMPLEX__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__LONG_NAME = ATTRIBUTE_VALUE_COMPLEX__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DEFINITION = ATTRIBUTE_VALUE_COMPLEX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xhtml Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__XHTML_CONTENT = ATTRIBUTE_VALUE_COMPLEX_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Value Embedded Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT_FEATURE_COUNT = ATTRIBUTE_VALUE_COMPLEX_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueEmbeddedFileImpl <em>Attribute Value Embedded File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueEmbeddedFileImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getAttributeValueEmbeddedFile()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_FILE = 25;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_FILE__DESC = ATTRIBUTE_VALUE_COMPLEX__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_FILE__IDENTIFIER = ATTRIBUTE_VALUE_COMPLEX__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_FILE__LAST_CHANGE = ATTRIBUTE_VALUE_COMPLEX__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_FILE__LONG_NAME = ATTRIBUTE_VALUE_COMPLEX__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_FILE__DEFINITION = ATTRIBUTE_VALUE_COMPLEX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binary Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_FILE__BINARY_CONTENT = ATTRIBUTE_VALUE_COMPLEX_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Value Embedded File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_EMBEDDED_FILE_FEATURE_COUNT = ATTRIBUTE_VALUE_COMPLEX_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueFileReferenceImpl <em>Attribute Value File Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueFileReferenceImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getAttributeValueFileReference()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_FILE_REFERENCE = 26;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FILE_REFERENCE__DESC = ATTRIBUTE_VALUE_COMPLEX__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FILE_REFERENCE__IDENTIFIER = ATTRIBUTE_VALUE_COMPLEX__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FILE_REFERENCE__LAST_CHANGE = ATTRIBUTE_VALUE_COMPLEX__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FILE_REFERENCE__LONG_NAME = ATTRIBUTE_VALUE_COMPLEX__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Path To File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FILE_REFERENCE__PATH_TO_FILE = ATTRIBUTE_VALUE_COMPLEX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FILE_REFERENCE__DEFINITION = ATTRIBUTE_VALUE_COMPLEX_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Value File Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_FILE_REFERENCE_FEATURE_COUNT = ATTRIBUTE_VALUE_COMPLEX_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueXmlDataImpl <em>Attribute Value Xml Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueXmlDataImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getAttributeValueXmlData()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_XML_DATA = 27;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_XML_DATA__DESC = ATTRIBUTE_VALUE_COMPLEX__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_XML_DATA__IDENTIFIER = ATTRIBUTE_VALUE_COMPLEX__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_XML_DATA__LAST_CHANGE = ATTRIBUTE_VALUE_COMPLEX__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_XML_DATA__LONG_NAME = ATTRIBUTE_VALUE_COMPLEX__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_XML_DATA__DEFINITION = ATTRIBUTE_VALUE_COMPLEX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xml Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_XML_DATA__XML_CONTENT = ATTRIBUTE_VALUE_COMPLEX_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Value Xml Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_XML_DATA_FEATURE_COUNT = ATTRIBUTE_VALUE_COMPLEX_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionBinaryFileImpl <em>Datatype Definition Binary File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionBinaryFileImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getDatatypeDefinitionBinaryFile()
	 * @generated
	 */
	int DATATYPE_DEFINITION_BINARY_FILE = 28;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BINARY_FILE__DESC = DATATYPE_DEFINITION_COMPLEX__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BINARY_FILE__IDENTIFIER = DATATYPE_DEFINITION_COMPLEX__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BINARY_FILE__LAST_CHANGE = DATATYPE_DEFINITION_COMPLEX__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BINARY_FILE__LONG_NAME = DATATYPE_DEFINITION_COMPLEX__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BINARY_FILE__EMBEDDED = DATATYPE_DEFINITION_COMPLEX__EMBEDDED;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BINARY_FILE__APPLICATION = DATATYPE_DEFINITION_COMPLEX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filename Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BINARY_FILE__FILENAME_SUFFIX = DATATYPE_DEFINITION_COMPLEX_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Format Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BINARY_FILE__FORMAT_NAME = DATATYPE_DEFINITION_COMPLEX_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BINARY_FILE__MIME_TYPE = DATATYPE_DEFINITION_COMPLEX_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Datatype Definition Binary File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BINARY_FILE_FEATURE_COUNT = DATATYPE_DEFINITION_COMPLEX_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionBooleanImpl <em>Datatype Definition Boolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionBooleanImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getDatatypeDefinitionBoolean()
	 * @generated
	 */
	int DATATYPE_DEFINITION_BOOLEAN = 29;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BOOLEAN__DESC = DATATYPE_DEFINITION_SIMPLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BOOLEAN__IDENTIFIER = DATATYPE_DEFINITION_SIMPLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BOOLEAN__LAST_CHANGE = DATATYPE_DEFINITION_SIMPLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BOOLEAN__LONG_NAME = DATATYPE_DEFINITION_SIMPLE__LONG_NAME;

	/**
	 * The number of structural features of the '<em>Datatype Definition Boolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_BOOLEAN_FEATURE_COUNT = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionDateImpl <em>Datatype Definition Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionDateImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getDatatypeDefinitionDate()
	 * @generated
	 */
	int DATATYPE_DEFINITION_DATE = 30;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_DATE__DESC = DATATYPE_DEFINITION_SIMPLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_DATE__IDENTIFIER = DATATYPE_DEFINITION_SIMPLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_DATE__LAST_CHANGE = DATATYPE_DEFINITION_SIMPLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_DATE__LONG_NAME = DATATYPE_DEFINITION_SIMPLE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_DATE__FORMAT = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Datatype Definition Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_DATE_FEATURE_COUNT = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionDocumentImpl <em>Datatype Definition Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionDocumentImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getDatatypeDefinitionDocument()
	 * @generated
	 */
	int DATATYPE_DEFINITION_DOCUMENT = 31;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_DOCUMENT__DESC = DATATYPE_DEFINITION_COMPLEX__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_DOCUMENT__IDENTIFIER = DATATYPE_DEFINITION_COMPLEX__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_DOCUMENT__LAST_CHANGE = DATATYPE_DEFINITION_COMPLEX__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_DOCUMENT__LONG_NAME = DATATYPE_DEFINITION_COMPLEX__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_DOCUMENT__EMBEDDED = DATATYPE_DEFINITION_COMPLEX__EMBEDDED;

	/**
	 * The number of structural features of the '<em>Datatype Definition Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_DOCUMENT_FEATURE_COUNT = DATATYPE_DEFINITION_COMPLEX_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionIntegerImpl <em>Datatype Definition Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionIntegerImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getDatatypeDefinitionInteger()
	 * @generated
	 */
	int DATATYPE_DEFINITION_INTEGER = 32;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_INTEGER__DESC = DATATYPE_DEFINITION_SIMPLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_INTEGER__IDENTIFIER = DATATYPE_DEFINITION_SIMPLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_INTEGER__LAST_CHANGE = DATATYPE_DEFINITION_SIMPLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_INTEGER__LONG_NAME = DATATYPE_DEFINITION_SIMPLE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_INTEGER__MAX = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_INTEGER__MIN = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Datatype Definition Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_INTEGER_FEATURE_COUNT = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionRealImpl <em>Datatype Definition Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionRealImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getDatatypeDefinitionReal()
	 * @generated
	 */
	int DATATYPE_DEFINITION_REAL = 33;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_REAL__DESC = DATATYPE_DEFINITION_SIMPLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_REAL__IDENTIFIER = DATATYPE_DEFINITION_SIMPLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_REAL__LAST_CHANGE = DATATYPE_DEFINITION_SIMPLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_REAL__LONG_NAME = DATATYPE_DEFINITION_SIMPLE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_REAL__ACCURACY = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_REAL__MAX = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_REAL__MIN = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Datatype Definition Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_REAL_FEATURE_COUNT = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionStringImpl <em>Datatype Definition String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionStringImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getDatatypeDefinitionString()
	 * @generated
	 */
	int DATATYPE_DEFINITION_STRING = 34;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_STRING__DESC = DATATYPE_DEFINITION_SIMPLE__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_STRING__IDENTIFIER = DATATYPE_DEFINITION_SIMPLE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_STRING__LAST_CHANGE = DATATYPE_DEFINITION_SIMPLE__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_STRING__LONG_NAME = DATATYPE_DEFINITION_SIMPLE__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_STRING__MAX_LENGTH = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Datatype Definition String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_STRING_FEATURE_COUNT = DATATYPE_DEFINITION_SIMPLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionXmlDataImpl <em>Datatype Definition Xml Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionXmlDataImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getDatatypeDefinitionXmlData()
	 * @generated
	 */
	int DATATYPE_DEFINITION_XML_DATA = 35;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_XML_DATA__DESC = DATATYPE_DEFINITION_COMPLEX__DESC;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_XML_DATA__IDENTIFIER = DATATYPE_DEFINITION_COMPLEX__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_XML_DATA__LAST_CHANGE = DATATYPE_DEFINITION_COMPLEX__LAST_CHANGE;

	/**
	 * The feature id for the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_XML_DATA__LONG_NAME = DATATYPE_DEFINITION_COMPLEX__LONG_NAME;

	/**
	 * The feature id for the '<em><b>Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_XML_DATA__EMBEDDED = DATATYPE_DEFINITION_COMPLEX__EMBEDDED;

	/**
	 * The feature id for the '<em><b>Name Space URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_XML_DATA__NAME_SPACE_URI = DATATYPE_DEFINITION_COMPLEX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_XML_DATA__SCHEMA_LOCATION = DATATYPE_DEFINITION_COMPLEX_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Datatype Definition Xml Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_DEFINITION_XML_DATA_FEATURE_COUNT = DATATYPE_DEFINITION_COMPLEX_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.RIFImpl <em>RIF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.RIFImpl
	 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getRIF()
	 * @generated
	 */
	int RIF = 36;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__AUTHOR = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>Country Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__COUNTRY_CODE = 2;

	/**
	 * The feature id for the '<em><b>Creation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__CREATION_TIME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Source Tool Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__SOURCE_TOOL_ID = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__TITLE = 6;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__VERSION = 7;

	/**
	 * The feature id for the '<em><b>Access Policies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__ACCESS_POLICIES = 8;

	/**
	 * The feature id for the '<em><b>Datatypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__DATATYPES = 9;

	/**
	 * The feature id for the '<em><b>Spec Hierarchy Roots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__SPEC_HIERARCHY_ROOTS = 10;

	/**
	 * The feature id for the '<em><b>Spec Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__SPEC_OBJECTS = 11;

	/**
	 * The feature id for the '<em><b>Spec Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__SPEC_GROUPS = 12;

	/**
	 * The feature id for the '<em><b>Spec Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__SPEC_TYPES = 13;

	/**
	 * The feature id for the '<em><b>Spec Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__SPEC_RELATIONS = 14;

	/**
	 * The number of structural features of the '<em>RIF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_FEATURE_COUNT = 15;


	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchyRoot <em>Spec Hierarchy Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Hierarchy Root</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchyRoot
	 * @generated
	 */
	EClass getSpecHierarchyRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchyRoot#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchyRoot#getChildren()
	 * @see #getSpecHierarchyRoot()
	 * @generated
	 */
	EReference getSpecHierarchyRoot_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.SpecElementWithUserDefinedAttributes <em>Spec Element With User Defined Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Element With User Defined Attributes</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.SpecElementWithUserDefinedAttributes
	 * @generated
	 */
	EClass getSpecElementWithUserDefinedAttributes();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.ExchangeFile.SpecElementWithUserDefinedAttributes#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.SpecElementWithUserDefinedAttributes#getType()
	 * @see #getSpecElementWithUserDefinedAttributes()
	 * @generated
	 */
	EReference getSpecElementWithUserDefinedAttributes_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.ExchangeFile.SpecElementWithUserDefinedAttributes#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.SpecElementWithUserDefinedAttributes#getValues()
	 * @see #getSpecElementWithUserDefinedAttributes()
	 * @generated
	 */
	EReference getSpecElementWithUserDefinedAttributes_Values();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.Identifiable#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.Identifiable#getDesc()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Desc();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.Identifiable#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.Identifiable#getIdentifier()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.Identifiable#getLastChange <em>Last Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Change</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.Identifiable#getLastChange()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_LastChange();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.Identifiable#getLongName <em>Long Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Name</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.Identifiable#getLongName()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_LongName();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.SpecType <em>Spec Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Type</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.SpecType
	 * @generated
	 */
	EClass getSpecType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.ExchangeFile.SpecType#getSpecAttributes <em>Spec Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spec Attributes</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.SpecType#getSpecAttributes()
	 * @see #getSpecType()
	 * @generated
	 */
	EReference getSpecType_SpecAttributes();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinition <em>Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definition</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinition
	 * @generated
	 */
	EClass getAttributeDefinition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValue
	 * @generated
	 */
	EClass getAttributeValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchy <em>Spec Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Hierarchy</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchy
	 * @generated
	 */
	EClass getSpecHierarchy();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchy#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Object</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchy#getObject()
	 * @see #getSpecHierarchy()
	 * @generated
	 */
	EReference getSpecHierarchy_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchy#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchy#getChildren()
	 * @see #getSpecHierarchy()
	 * @generated
	 */
	EReference getSpecHierarchy_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.SpecObject <em>Spec Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Object</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.SpecObject
	 * @generated
	 */
	EClass getSpecObject();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.SpecGroup <em>Spec Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Group</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.SpecGroup
	 * @generated
	 */
	EClass getSpecGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.ExchangeFile.SpecGroup#getSpecObjects <em>Spec Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Spec Objects</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.SpecGroup#getSpecObjects()
	 * @see #getSpecGroup()
	 * @generated
	 */
	EReference getSpecGroup_SpecObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.ExchangeFile.SpecGroup#getRelationGroups <em>Relation Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation Groups</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.SpecGroup#getRelationGroups()
	 * @see #getSpecGroup()
	 * @generated
	 */
	EReference getSpecGroup_RelationGroups();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.RelationGroup <em>Relation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Group</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.RelationGroup
	 * @generated
	 */
	EClass getRelationGroup();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.ExchangeFile.RelationGroup#getSpecRelations <em>Spec Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Spec Relations</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.RelationGroup#getSpecRelations()
	 * @see #getRelationGroup()
	 * @generated
	 */
	EReference getRelationGroup_SpecRelations();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.ExchangeFile.RelationGroup#getRelationType <em>Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation Type</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.RelationGroup#getRelationType()
	 * @see #getRelationGroup()
	 * @generated
	 */
	EReference getRelationGroup_RelationType();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.rmf.rif11.ExchangeFile.RelationGroup#getSourceGroup <em>Source Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source Group</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.RelationGroup#getSourceGroup()
	 * @see #getRelationGroup()
	 * @generated
	 */
	EReference getRelationGroup_SourceGroup();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.SpecRelation <em>Spec Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Relation</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.SpecRelation
	 * @generated
	 */
	EClass getSpecRelation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.ExchangeFile.SpecRelation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.SpecRelation#getTarget()
	 * @see #getSpecRelation()
	 * @generated
	 */
	EReference getSpecRelation_Target();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.ExchangeFile.SpecRelation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.SpecRelation#getSource()
	 * @see #getSpecRelation()
	 * @generated
	 */
	EReference getSpecRelation_Source();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinition <em>Datatype Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinition
	 * @generated
	 */
	EClass getDatatypeDefinition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy <em>Access Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Policy</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy
	 * @generated
	 */
	EClass getAccessPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getAccessMode <em>Access Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Mode</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getAccessMode()
	 * @see #getAccessPolicy()
	 * @generated
	 */
	EAttribute getAccessPolicy_AccessMode();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getSpecGroups <em>Spec Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Spec Groups</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getSpecGroups()
	 * @see #getAccessPolicy()
	 * @generated
	 */
	EReference getAccessPolicy_SpecGroups();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getAttributeDefinitions <em>Attribute Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attribute Definitions</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getAttributeDefinitions()
	 * @see #getAccessPolicy()
	 * @generated
	 */
	EReference getAccessPolicy_AttributeDefinitions();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getRelationGroups <em>Relation Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relation Groups</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getRelationGroups()
	 * @see #getAccessPolicy()
	 * @generated
	 */
	EReference getAccessPolicy_RelationGroups();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getDatatypeDefinitions <em>Datatype Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Datatype Definitions</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getDatatypeDefinitions()
	 * @see #getAccessPolicy()
	 * @generated
	 */
	EReference getAccessPolicy_DatatypeDefinitions();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getSpecRelations <em>Spec Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Spec Relations</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getSpecRelations()
	 * @see #getAccessPolicy()
	 * @generated
	 */
	EReference getAccessPolicy_SpecRelations();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getAttributeValues <em>Attribute Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attribute Values</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getAttributeValues()
	 * @see #getAccessPolicy()
	 * @generated
	 */
	EReference getAccessPolicy_AttributeValues();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getSpecTypes <em>Spec Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Spec Types</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getSpecTypes()
	 * @see #getAccessPolicy()
	 * @generated
	 */
	EReference getAccessPolicy_SpecTypes();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getSpecHierarchies <em>Spec Hierarchies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Spec Hierarchies</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getSpecHierarchies()
	 * @see #getAccessPolicy()
	 * @generated
	 */
	EReference getAccessPolicy_SpecHierarchies();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getSpecObjects <em>Spec Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Spec Objects</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getSpecObjects()
	 * @see #getAccessPolicy()
	 * @generated
	 */
	EReference getAccessPolicy_SpecObjects();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getSpecHierarchyRoots <em>Spec Hierarchy Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Spec Hierarchy Roots</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy#getSpecHierarchyRoots()
	 * @see #getAccessPolicy()
	 * @generated
	 */
	EReference getAccessPolicy_SpecHierarchyRoots();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionComplex <em>Attribute Definition Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definition Complex</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionComplex
	 * @generated
	 */
	EClass getAttributeDefinitionComplex();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionComplex#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionComplex#getType()
	 * @see #getAttributeDefinitionComplex()
	 * @generated
	 */
	EReference getAttributeDefinitionComplex_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionComplex#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionComplex#getDefaultValue()
	 * @see #getAttributeDefinitionComplex()
	 * @generated
	 */
	EReference getAttributeDefinitionComplex_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionComplex <em>Datatype Definition Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition Complex</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionComplex
	 * @generated
	 */
	EClass getDatatypeDefinitionComplex();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionComplex#getEmbedded <em>Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embedded</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionComplex#getEmbedded()
	 * @see #getDatatypeDefinitionComplex()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionComplex_Embedded();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueComplex <em>Attribute Value Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Complex</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValueComplex
	 * @generated
	 */
	EClass getAttributeValueComplex();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionEnumeration <em>Attribute Definition Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definition Enumeration</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionEnumeration
	 * @generated
	 */
	EClass getAttributeDefinitionEnumeration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionEnumeration#getMultiValued <em>Multi Valued</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Valued</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionEnumeration#getMultiValued()
	 * @see #getAttributeDefinitionEnumeration()
	 * @generated
	 */
	EAttribute getAttributeDefinitionEnumeration_MultiValued();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionEnumeration#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionEnumeration#getType()
	 * @see #getAttributeDefinitionEnumeration()
	 * @generated
	 */
	EReference getAttributeDefinitionEnumeration_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionEnumeration#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionEnumeration#getDefaultValue()
	 * @see #getAttributeDefinitionEnumeration()
	 * @generated
	 */
	EReference getAttributeDefinitionEnumeration_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionEnumeration <em>Datatype Definition Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition Enumeration</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionEnumeration
	 * @generated
	 */
	EClass getDatatypeDefinitionEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionEnumeration#getSpecifiedValues <em>Specified Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specified Values</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionEnumeration#getSpecifiedValues()
	 * @see #getDatatypeDefinitionEnumeration()
	 * @generated
	 */
	EReference getDatatypeDefinitionEnumeration_SpecifiedValues();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Value</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.EnumValue
	 * @generated
	 */
	EClass getEnumValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.ExchangeFile.EnumValue#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.EnumValue#getProperties()
	 * @see #getEnumValue()
	 * @generated
	 */
	EReference getEnumValue_Properties();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.EmbeddedValue <em>Embedded Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embedded Value</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.EmbeddedValue
	 * @generated
	 */
	EClass getEmbeddedValue();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.EmbeddedValue#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.EmbeddedValue#getKey()
	 * @see #getEmbeddedValue()
	 * @generated
	 */
	EAttribute getEmbeddedValue_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.EmbeddedValue#getOtherContent <em>Other Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other Content</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.EmbeddedValue#getOtherContent()
	 * @see #getEmbeddedValue()
	 * @generated
	 */
	EAttribute getEmbeddedValue_OtherContent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEnumeration <em>Attribute Value Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Enumeration</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEnumeration
	 * @generated
	 */
	EClass getAttributeValueEnumeration();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEnumeration#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEnumeration#getValues()
	 * @see #getAttributeValueEnumeration()
	 * @generated
	 */
	EReference getAttributeValueEnumeration_Values();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEnumeration#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEnumeration#getDefinition()
	 * @see #getAttributeValueEnumeration()
	 * @generated
	 */
	EReference getAttributeValueEnumeration_Definition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionSimple <em>Attribute Definition Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definition Simple</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionSimple
	 * @generated
	 */
	EClass getAttributeDefinitionSimple();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionSimple#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionSimple#getType()
	 * @see #getAttributeDefinitionSimple()
	 * @generated
	 */
	EReference getAttributeDefinitionSimple_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionSimple#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Value</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionSimple#getDefaultValue()
	 * @see #getAttributeDefinitionSimple()
	 * @generated
	 */
	EReference getAttributeDefinitionSimple_DefaultValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionSimple <em>Datatype Definition Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition Simple</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionSimple
	 * @generated
	 */
	EClass getDatatypeDefinitionSimple();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueSimple <em>Attribute Value Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Simple</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValueSimple
	 * @generated
	 */
	EClass getAttributeValueSimple();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueSimple#getTheValue <em>The Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>The Value</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValueSimple#getTheValue()
	 * @see #getAttributeValueSimple()
	 * @generated
	 */
	EAttribute getAttributeValueSimple_TheValue();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueSimple#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValueSimple#getDefinition()
	 * @see #getAttributeValueSimple()
	 * @generated
	 */
	EReference getAttributeValueSimple_Definition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEmbeddedDocument <em>Attribute Value Embedded Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Embedded Document</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEmbeddedDocument
	 * @generated
	 */
	EClass getAttributeValueEmbeddedDocument();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEmbeddedDocument#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEmbeddedDocument#getDefinition()
	 * @see #getAttributeValueEmbeddedDocument()
	 * @generated
	 */
	EReference getAttributeValueEmbeddedDocument_Definition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEmbeddedDocument#getXhtmlContent <em>Xhtml Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xhtml Content</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEmbeddedDocument#getXhtmlContent()
	 * @see #getAttributeValueEmbeddedDocument()
	 * @generated
	 */
	EReference getAttributeValueEmbeddedDocument_XhtmlContent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEmbeddedFile <em>Attribute Value Embedded File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Embedded File</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEmbeddedFile
	 * @generated
	 */
	EClass getAttributeValueEmbeddedFile();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEmbeddedFile#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEmbeddedFile#getDefinition()
	 * @see #getAttributeValueEmbeddedFile()
	 * @generated
	 */
	EReference getAttributeValueEmbeddedFile_Definition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEmbeddedFile#getBinaryContent <em>Binary Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binary Content</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEmbeddedFile#getBinaryContent()
	 * @see #getAttributeValueEmbeddedFile()
	 * @generated
	 */
	EReference getAttributeValueEmbeddedFile_BinaryContent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueFileReference <em>Attribute Value File Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value File Reference</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValueFileReference
	 * @generated
	 */
	EClass getAttributeValueFileReference();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueFileReference#getPathToFile <em>Path To File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path To File</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValueFileReference#getPathToFile()
	 * @see #getAttributeValueFileReference()
	 * @generated
	 */
	EAttribute getAttributeValueFileReference_PathToFile();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueFileReference#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValueFileReference#getDefinition()
	 * @see #getAttributeValueFileReference()
	 * @generated
	 */
	EReference getAttributeValueFileReference_Definition();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueXmlData <em>Attribute Value Xml Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Xml Data</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValueXmlData
	 * @generated
	 */
	EClass getAttributeValueXmlData();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueXmlData#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Definition</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValueXmlData#getDefinition()
	 * @see #getAttributeValueXmlData()
	 * @generated
	 */
	EReference getAttributeValueXmlData_Definition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueXmlData#getXmlContent <em>Xml Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xml Content</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValueXmlData#getXmlContent()
	 * @see #getAttributeValueXmlData()
	 * @generated
	 */
	EReference getAttributeValueXmlData_XmlContent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBinaryFile <em>Datatype Definition Binary File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition Binary File</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBinaryFile
	 * @generated
	 */
	EClass getDatatypeDefinitionBinaryFile();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBinaryFile#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBinaryFile#getApplication()
	 * @see #getDatatypeDefinitionBinaryFile()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionBinaryFile_Application();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBinaryFile#getFilenameSuffix <em>Filename Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename Suffix</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBinaryFile#getFilenameSuffix()
	 * @see #getDatatypeDefinitionBinaryFile()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionBinaryFile_FilenameSuffix();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBinaryFile#getFormatName <em>Format Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format Name</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBinaryFile#getFormatName()
	 * @see #getDatatypeDefinitionBinaryFile()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionBinaryFile_FormatName();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBinaryFile#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBinaryFile#getMimeType()
	 * @see #getDatatypeDefinitionBinaryFile()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionBinaryFile_MimeType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBoolean <em>Datatype Definition Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition Boolean</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBoolean
	 * @generated
	 */
	EClass getDatatypeDefinitionBoolean();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionDate <em>Datatype Definition Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition Date</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionDate
	 * @generated
	 */
	EClass getDatatypeDefinitionDate();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionDate#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionDate#getFormat()
	 * @see #getDatatypeDefinitionDate()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionDate_Format();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionDocument <em>Datatype Definition Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition Document</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionDocument
	 * @generated
	 */
	EClass getDatatypeDefinitionDocument();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionInteger <em>Datatype Definition Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition Integer</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionInteger
	 * @generated
	 */
	EClass getDatatypeDefinitionInteger();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionInteger#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionInteger#getMax()
	 * @see #getDatatypeDefinitionInteger()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionInteger_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionInteger#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionInteger#getMin()
	 * @see #getDatatypeDefinitionInteger()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionInteger_Min();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionReal <em>Datatype Definition Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition Real</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionReal
	 * @generated
	 */
	EClass getDatatypeDefinitionReal();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionReal#getAccuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionReal#getAccuracy()
	 * @see #getDatatypeDefinitionReal()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionReal_Accuracy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionReal#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionReal#getMax()
	 * @see #getDatatypeDefinitionReal()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionReal_Max();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionReal#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionReal#getMin()
	 * @see #getDatatypeDefinitionReal()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionReal_Min();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionString <em>Datatype Definition String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition String</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionString
	 * @generated
	 */
	EClass getDatatypeDefinitionString();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionString#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionString#getMaxLength()
	 * @see #getDatatypeDefinitionString()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionString_MaxLength();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionXmlData <em>Datatype Definition Xml Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype Definition Xml Data</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionXmlData
	 * @generated
	 */
	EClass getDatatypeDefinitionXmlData();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionXmlData#getNameSpaceURI <em>Name Space URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Space URI</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionXmlData#getNameSpaceURI()
	 * @see #getDatatypeDefinitionXmlData()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionXmlData_NameSpaceURI();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionXmlData#getSchemaLocation <em>Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Location</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionXmlData#getSchemaLocation()
	 * @see #getDatatypeDefinitionXmlData()
	 * @generated
	 */
	EAttribute getDatatypeDefinitionXmlData_SchemaLocation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.ExchangeFile.RIF <em>RIF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RIF</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.RIF
	 * @generated
	 */
	EClass getRIF();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.RIF#getAuthor()
	 * @see #getRIF()
	 * @generated
	 */
	EAttribute getRIF_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.RIF#getComment()
	 * @see #getRIF()
	 * @generated
	 */
	EAttribute getRIF_Comment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getCountryCode <em>Country Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country Code</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.RIF#getCountryCode()
	 * @see #getRIF()
	 * @generated
	 */
	EAttribute getRIF_CountryCode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getCreationTime <em>Creation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Time</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.RIF#getCreationTime()
	 * @see #getRIF()
	 * @generated
	 */
	EAttribute getRIF_CreationTime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.RIF#getIdentifier()
	 * @see #getRIF()
	 * @generated
	 */
	EAttribute getRIF_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getSourceToolId <em>Source Tool Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Tool Id</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.RIF#getSourceToolId()
	 * @see #getRIF()
	 * @generated
	 */
	EAttribute getRIF_SourceToolId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.RIF#getTitle()
	 * @see #getRIF()
	 * @generated
	 */
	EAttribute getRIF_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.RIF#getVersion()
	 * @see #getRIF()
	 * @generated
	 */
	EAttribute getRIF_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getAccessPolicies <em>Access Policies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Access Policies</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.RIF#getAccessPolicies()
	 * @see #getRIF()
	 * @generated
	 */
	EReference getRIF_AccessPolicies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getDatatypes <em>Datatypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datatypes</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.RIF#getDatatypes()
	 * @see #getRIF()
	 * @generated
	 */
	EReference getRIF_Datatypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getSpecHierarchyRoots <em>Spec Hierarchy Roots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spec Hierarchy Roots</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.RIF#getSpecHierarchyRoots()
	 * @see #getRIF()
	 * @generated
	 */
	EReference getRIF_SpecHierarchyRoots();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getSpecObjects <em>Spec Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spec Objects</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.RIF#getSpecObjects()
	 * @see #getRIF()
	 * @generated
	 */
	EReference getRIF_SpecObjects();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getSpecGroups <em>Spec Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spec Groups</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.RIF#getSpecGroups()
	 * @see #getRIF()
	 * @generated
	 */
	EReference getRIF_SpecGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getSpecTypes <em>Spec Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spec Types</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.RIF#getSpecTypes()
	 * @see #getRIF()
	 * @generated
	 */
	EReference getRIF_SpecTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.ExchangeFile.RIF#getSpecRelations <em>Spec Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spec Relations</em>'.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.RIF#getSpecRelations()
	 * @see #getRIF()
	 * @generated
	 */
	EReference getRIF_SpecRelations();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExchangeFileFactory getExchangeFileFactory();

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
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.SpecHierarchyRootImpl <em>Spec Hierarchy Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.SpecHierarchyRootImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getSpecHierarchyRoot()
		 * @generated
		 */
		EClass SPEC_HIERARCHY_ROOT = eINSTANCE.getSpecHierarchyRoot();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_HIERARCHY_ROOT__CHILDREN = eINSTANCE.getSpecHierarchyRoot_Children();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.SpecElementWithUserDefinedAttributesImpl <em>Spec Element With User Defined Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.SpecElementWithUserDefinedAttributesImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getSpecElementWithUserDefinedAttributes()
		 * @generated
		 */
		EClass SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES = eINSTANCE.getSpecElementWithUserDefinedAttributes();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__TYPE = eINSTANCE.getSpecElementWithUserDefinedAttributes_Type();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__VALUES = eINSTANCE.getSpecElementWithUserDefinedAttributes_Values();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.IdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.IdentifiableImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__DESC = eINSTANCE.getIdentifiable_Desc();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__IDENTIFIER = eINSTANCE.getIdentifiable_Identifier();

		/**
		 * The meta object literal for the '<em><b>Last Change</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__LAST_CHANGE = eINSTANCE.getIdentifiable_LastChange();

		/**
		 * The meta object literal for the '<em><b>Long Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__LONG_NAME = eINSTANCE.getIdentifiable_LongName();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.SpecTypeImpl <em>Spec Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.SpecTypeImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getSpecType()
		 * @generated
		 */
		EClass SPEC_TYPE = eINSTANCE.getSpecType();

		/**
		 * The meta object literal for the '<em><b>Spec Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_TYPE__SPEC_ATTRIBUTES = eINSTANCE.getSpecType_SpecAttributes();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeDefinitionImpl <em>Attribute Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeDefinitionImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getAttributeDefinition()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITION = eINSTANCE.getAttributeDefinition();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getAttributeValue()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE = eINSTANCE.getAttributeValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.SpecHierarchyImpl <em>Spec Hierarchy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.SpecHierarchyImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getSpecHierarchy()
		 * @generated
		 */
		EClass SPEC_HIERARCHY = eINSTANCE.getSpecHierarchy();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_HIERARCHY__OBJECT = eINSTANCE.getSpecHierarchy_Object();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_HIERARCHY__CHILDREN = eINSTANCE.getSpecHierarchy_Children();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.SpecObjectImpl <em>Spec Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.SpecObjectImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getSpecObject()
		 * @generated
		 */
		EClass SPEC_OBJECT = eINSTANCE.getSpecObject();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.SpecGroupImpl <em>Spec Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.SpecGroupImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getSpecGroup()
		 * @generated
		 */
		EClass SPEC_GROUP = eINSTANCE.getSpecGroup();

		/**
		 * The meta object literal for the '<em><b>Spec Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_GROUP__SPEC_OBJECTS = eINSTANCE.getSpecGroup_SpecObjects();

		/**
		 * The meta object literal for the '<em><b>Relation Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_GROUP__RELATION_GROUPS = eINSTANCE.getSpecGroup_RelationGroups();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.RelationGroupImpl <em>Relation Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.RelationGroupImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getRelationGroup()
		 * @generated
		 */
		EClass RELATION_GROUP = eINSTANCE.getRelationGroup();

		/**
		 * The meta object literal for the '<em><b>Spec Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_GROUP__SPEC_RELATIONS = eINSTANCE.getRelationGroup_SpecRelations();

		/**
		 * The meta object literal for the '<em><b>Relation Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_GROUP__RELATION_TYPE = eINSTANCE.getRelationGroup_RelationType();

		/**
		 * The meta object literal for the '<em><b>Source Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_GROUP__SOURCE_GROUP = eINSTANCE.getRelationGroup_SourceGroup();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.SpecRelationImpl <em>Spec Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.SpecRelationImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getSpecRelation()
		 * @generated
		 */
		EClass SPEC_RELATION = eINSTANCE.getSpecRelation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_RELATION__TARGET = eINSTANCE.getSpecRelation_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_RELATION__SOURCE = eINSTANCE.getSpecRelation_Source();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionImpl <em>Datatype Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getDatatypeDefinition()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION = eINSTANCE.getDatatypeDefinition();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AccessPolicyImpl <em>Access Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.AccessPolicyImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getAccessPolicy()
		 * @generated
		 */
		EClass ACCESS_POLICY = eINSTANCE.getAccessPolicy();

		/**
		 * The meta object literal for the '<em><b>Access Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_POLICY__ACCESS_MODE = eINSTANCE.getAccessPolicy_AccessMode();

		/**
		 * The meta object literal for the '<em><b>Spec Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_POLICY__SPEC_GROUPS = eINSTANCE.getAccessPolicy_SpecGroups();

		/**
		 * The meta object literal for the '<em><b>Attribute Definitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_POLICY__ATTRIBUTE_DEFINITIONS = eINSTANCE.getAccessPolicy_AttributeDefinitions();

		/**
		 * The meta object literal for the '<em><b>Relation Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_POLICY__RELATION_GROUPS = eINSTANCE.getAccessPolicy_RelationGroups();

		/**
		 * The meta object literal for the '<em><b>Datatype Definitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_POLICY__DATATYPE_DEFINITIONS = eINSTANCE.getAccessPolicy_DatatypeDefinitions();

		/**
		 * The meta object literal for the '<em><b>Spec Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_POLICY__SPEC_RELATIONS = eINSTANCE.getAccessPolicy_SpecRelations();

		/**
		 * The meta object literal for the '<em><b>Attribute Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_POLICY__ATTRIBUTE_VALUES = eINSTANCE.getAccessPolicy_AttributeValues();

		/**
		 * The meta object literal for the '<em><b>Spec Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_POLICY__SPEC_TYPES = eINSTANCE.getAccessPolicy_SpecTypes();

		/**
		 * The meta object literal for the '<em><b>Spec Hierarchies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_POLICY__SPEC_HIERARCHIES = eINSTANCE.getAccessPolicy_SpecHierarchies();

		/**
		 * The meta object literal for the '<em><b>Spec Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_POLICY__SPEC_OBJECTS = eINSTANCE.getAccessPolicy_SpecObjects();

		/**
		 * The meta object literal for the '<em><b>Spec Hierarchy Roots</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_POLICY__SPEC_HIERARCHY_ROOTS = eINSTANCE.getAccessPolicy_SpecHierarchyRoots();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeDefinitionComplexImpl <em>Attribute Definition Complex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeDefinitionComplexImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getAttributeDefinitionComplex()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITION_COMPLEX = eINSTANCE.getAttributeDefinitionComplex();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_COMPLEX__TYPE = eINSTANCE.getAttributeDefinitionComplex_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_COMPLEX__DEFAULT_VALUE = eINSTANCE.getAttributeDefinitionComplex_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionComplexImpl <em>Datatype Definition Complex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionComplexImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getDatatypeDefinitionComplex()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_COMPLEX = eINSTANCE.getDatatypeDefinitionComplex();

		/**
		 * The meta object literal for the '<em><b>Embedded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_COMPLEX__EMBEDDED = eINSTANCE.getDatatypeDefinitionComplex_Embedded();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueComplexImpl <em>Attribute Value Complex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueComplexImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getAttributeValueComplex()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_COMPLEX = eINSTANCE.getAttributeValueComplex();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeDefinitionEnumerationImpl <em>Attribute Definition Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeDefinitionEnumerationImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getAttributeDefinitionEnumeration()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITION_ENUMERATION = eINSTANCE.getAttributeDefinitionEnumeration();

		/**
		 * The meta object literal for the '<em><b>Multi Valued</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION_ENUMERATION__MULTI_VALUED = eINSTANCE.getAttributeDefinitionEnumeration_MultiValued();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_ENUMERATION__TYPE = eINSTANCE.getAttributeDefinitionEnumeration_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULT_VALUE = eINSTANCE.getAttributeDefinitionEnumeration_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionEnumerationImpl <em>Datatype Definition Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionEnumerationImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getDatatypeDefinitionEnumeration()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_ENUMERATION = eINSTANCE.getDatatypeDefinitionEnumeration();

		/**
		 * The meta object literal for the '<em><b>Specified Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPE_DEFINITION_ENUMERATION__SPECIFIED_VALUES = eINSTANCE.getDatatypeDefinitionEnumeration_SpecifiedValues();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.EnumValueImpl <em>Enum Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.EnumValueImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getEnumValue()
		 * @generated
		 */
		EClass ENUM_VALUE = eINSTANCE.getEnumValue();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_VALUE__PROPERTIES = eINSTANCE.getEnumValue_Properties();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.EmbeddedValueImpl <em>Embedded Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.EmbeddedValueImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getEmbeddedValue()
		 * @generated
		 */
		EClass EMBEDDED_VALUE = eINSTANCE.getEmbeddedValue();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDED_VALUE__KEY = eINSTANCE.getEmbeddedValue_Key();

		/**
		 * The meta object literal for the '<em><b>Other Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDED_VALUE__OTHER_CONTENT = eINSTANCE.getEmbeddedValue_OtherContent();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueEnumerationImpl <em>Attribute Value Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueEnumerationImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getAttributeValueEnumeration()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_ENUMERATION = eINSTANCE.getAttributeValueEnumeration();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_ENUMERATION__VALUES = eINSTANCE.getAttributeValueEnumeration_Values();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_ENUMERATION__DEFINITION = eINSTANCE.getAttributeValueEnumeration_Definition();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeDefinitionSimpleImpl <em>Attribute Definition Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeDefinitionSimpleImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getAttributeDefinitionSimple()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITION_SIMPLE = eINSTANCE.getAttributeDefinitionSimple();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_SIMPLE__TYPE = eINSTANCE.getAttributeDefinitionSimple_Type();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE = eINSTANCE.getAttributeDefinitionSimple_DefaultValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionSimpleImpl <em>Datatype Definition Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionSimpleImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getDatatypeDefinitionSimple()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_SIMPLE = eINSTANCE.getDatatypeDefinitionSimple();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueSimpleImpl <em>Attribute Value Simple</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueSimpleImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getAttributeValueSimple()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_SIMPLE = eINSTANCE.getAttributeValueSimple();

		/**
		 * The meta object literal for the '<em><b>The Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_SIMPLE__THE_VALUE = eINSTANCE.getAttributeValueSimple_TheValue();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_SIMPLE__DEFINITION = eINSTANCE.getAttributeValueSimple_Definition();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueEmbeddedDocumentImpl <em>Attribute Value Embedded Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueEmbeddedDocumentImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getAttributeValueEmbeddedDocument()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT = eINSTANCE.getAttributeValueEmbeddedDocument();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DEFINITION = eINSTANCE.getAttributeValueEmbeddedDocument_Definition();

		/**
		 * The meta object literal for the '<em><b>Xhtml Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__XHTML_CONTENT = eINSTANCE.getAttributeValueEmbeddedDocument_XhtmlContent();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueEmbeddedFileImpl <em>Attribute Value Embedded File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueEmbeddedFileImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getAttributeValueEmbeddedFile()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_EMBEDDED_FILE = eINSTANCE.getAttributeValueEmbeddedFile();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_EMBEDDED_FILE__DEFINITION = eINSTANCE.getAttributeValueEmbeddedFile_Definition();

		/**
		 * The meta object literal for the '<em><b>Binary Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_EMBEDDED_FILE__BINARY_CONTENT = eINSTANCE.getAttributeValueEmbeddedFile_BinaryContent();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueFileReferenceImpl <em>Attribute Value File Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueFileReferenceImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getAttributeValueFileReference()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_FILE_REFERENCE = eINSTANCE.getAttributeValueFileReference();

		/**
		 * The meta object literal for the '<em><b>Path To File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_VALUE_FILE_REFERENCE__PATH_TO_FILE = eINSTANCE.getAttributeValueFileReference_PathToFile();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_FILE_REFERENCE__DEFINITION = eINSTANCE.getAttributeValueFileReference_Definition();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueXmlDataImpl <em>Attribute Value Xml Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeValueXmlDataImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getAttributeValueXmlData()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_XML_DATA = eINSTANCE.getAttributeValueXmlData();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_XML_DATA__DEFINITION = eINSTANCE.getAttributeValueXmlData_Definition();

		/**
		 * The meta object literal for the '<em><b>Xml Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_XML_DATA__XML_CONTENT = eINSTANCE.getAttributeValueXmlData_XmlContent();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionBinaryFileImpl <em>Datatype Definition Binary File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionBinaryFileImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getDatatypeDefinitionBinaryFile()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_BINARY_FILE = eINSTANCE.getDatatypeDefinitionBinaryFile();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_BINARY_FILE__APPLICATION = eINSTANCE.getDatatypeDefinitionBinaryFile_Application();

		/**
		 * The meta object literal for the '<em><b>Filename Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_BINARY_FILE__FILENAME_SUFFIX = eINSTANCE.getDatatypeDefinitionBinaryFile_FilenameSuffix();

		/**
		 * The meta object literal for the '<em><b>Format Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_BINARY_FILE__FORMAT_NAME = eINSTANCE.getDatatypeDefinitionBinaryFile_FormatName();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_BINARY_FILE__MIME_TYPE = eINSTANCE.getDatatypeDefinitionBinaryFile_MimeType();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionBooleanImpl <em>Datatype Definition Boolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionBooleanImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getDatatypeDefinitionBoolean()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_BOOLEAN = eINSTANCE.getDatatypeDefinitionBoolean();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionDateImpl <em>Datatype Definition Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionDateImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getDatatypeDefinitionDate()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_DATE = eINSTANCE.getDatatypeDefinitionDate();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_DATE__FORMAT = eINSTANCE.getDatatypeDefinitionDate_Format();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionDocumentImpl <em>Datatype Definition Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionDocumentImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getDatatypeDefinitionDocument()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_DOCUMENT = eINSTANCE.getDatatypeDefinitionDocument();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionIntegerImpl <em>Datatype Definition Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionIntegerImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getDatatypeDefinitionInteger()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_INTEGER = eINSTANCE.getDatatypeDefinitionInteger();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_INTEGER__MAX = eINSTANCE.getDatatypeDefinitionInteger_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_INTEGER__MIN = eINSTANCE.getDatatypeDefinitionInteger_Min();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionRealImpl <em>Datatype Definition Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionRealImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getDatatypeDefinitionReal()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_REAL = eINSTANCE.getDatatypeDefinitionReal();

		/**
		 * The meta object literal for the '<em><b>Accuracy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_REAL__ACCURACY = eINSTANCE.getDatatypeDefinitionReal_Accuracy();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_REAL__MAX = eINSTANCE.getDatatypeDefinitionReal_Max();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_REAL__MIN = eINSTANCE.getDatatypeDefinitionReal_Min();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionStringImpl <em>Datatype Definition String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionStringImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getDatatypeDefinitionString()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_STRING = eINSTANCE.getDatatypeDefinitionString();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_STRING__MAX_LENGTH = eINSTANCE.getDatatypeDefinitionString_MaxLength();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionXmlDataImpl <em>Datatype Definition Xml Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionXmlDataImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getDatatypeDefinitionXmlData()
		 * @generated
		 */
		EClass DATATYPE_DEFINITION_XML_DATA = eINSTANCE.getDatatypeDefinitionXmlData();

		/**
		 * The meta object literal for the '<em><b>Name Space URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_XML_DATA__NAME_SPACE_URI = eINSTANCE.getDatatypeDefinitionXmlData_NameSpaceURI();

		/**
		 * The meta object literal for the '<em><b>Schema Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPE_DEFINITION_XML_DATA__SCHEMA_LOCATION = eINSTANCE.getDatatypeDefinitionXmlData_SchemaLocation();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.ExchangeFile.impl.RIFImpl <em>RIF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.RIFImpl
		 * @see org.eclipse.rmf.rif11.ExchangeFile.impl.ExchangeFilePackageImpl#getRIF()
		 * @generated
		 */
		EClass RIF = eINSTANCE.getRIF();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF__AUTHOR = eINSTANCE.getRIF_Author();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF__COMMENT = eINSTANCE.getRIF_Comment();

		/**
		 * The meta object literal for the '<em><b>Country Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF__COUNTRY_CODE = eINSTANCE.getRIF_CountryCode();

		/**
		 * The meta object literal for the '<em><b>Creation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF__CREATION_TIME = eINSTANCE.getRIF_CreationTime();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF__IDENTIFIER = eINSTANCE.getRIF_Identifier();

		/**
		 * The meta object literal for the '<em><b>Source Tool Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF__SOURCE_TOOL_ID = eINSTANCE.getRIF_SourceToolId();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF__TITLE = eINSTANCE.getRIF_Title();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF__VERSION = eINSTANCE.getRIF_Version();

		/**
		 * The meta object literal for the '<em><b>Access Policies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF__ACCESS_POLICIES = eINSTANCE.getRIF_AccessPolicies();

		/**
		 * The meta object literal for the '<em><b>Datatypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF__DATATYPES = eINSTANCE.getRIF_Datatypes();

		/**
		 * The meta object literal for the '<em><b>Spec Hierarchy Roots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF__SPEC_HIERARCHY_ROOTS = eINSTANCE.getRIF_SpecHierarchyRoots();

		/**
		 * The meta object literal for the '<em><b>Spec Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF__SPEC_OBJECTS = eINSTANCE.getRIF_SpecObjects();

		/**
		 * The meta object literal for the '<em><b>Spec Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF__SPEC_GROUPS = eINSTANCE.getRIF_SpecGroups();

		/**
		 * The meta object literal for the '<em><b>Spec Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF__SPEC_TYPES = eINSTANCE.getRIF_SpecTypes();

		/**
		 * The meta object literal for the '<em><b>Spec Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF__SPEC_RELATIONS = eINSTANCE.getRIF_SpecRelations();

	}

} //ExchangeFilePackage
