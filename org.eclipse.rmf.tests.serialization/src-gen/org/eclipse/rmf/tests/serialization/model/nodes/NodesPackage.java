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
package org.eclipse.rmf.tests.serialization.model.nodes;

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
 * @see org.eclipse.rmf.tests.serialization.model.nodes.NodesFactory
 * @model kind="package"
 * @generated
 */
public interface NodesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nodes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/rmf/serialization/model/nodes.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nodes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NodesPackage eINSTANCE = org.eclipse.rmf.tests.serialization.model.nodes.impl.NodesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.impl.AbstractNodeImpl
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.impl.NodesPackageImpl#getAbstractNode()
	 * @generated
	 */
	int ABSTRACT_NODE = 1;

	/**
	 * The number of structural features of the '<em>Abstract Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_NODE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.impl.NodesPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>EReference Contained0000 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED0000_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EReference Contained0001 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED0001_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EReference Contained0010 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED0010_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EReference Contained0011 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED0011_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EReference Contained0100 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED0100_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>EReference Contained0101 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED0101_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>EReference Contained0110 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED0110_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>EReference Contained0111 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED0111_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>EReference Contained1000 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED1000_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>EReference Contained1001 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED1001_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>EReference Contained1010 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED1010_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>EReference Contained1011 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED1011_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>EReference Contained1100 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED1100_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>EReference Contained1101 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED1101_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>EReference Contained1110 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED1110_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>EReference Contained1111 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED1111_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>EReference Empty Annotation Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_EMPTY_ANNOTATION_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>EReference No Annotation Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_NO_ANNOTATION_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>EReference Contained0000 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED0000_MANY = ABSTRACT_NODE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>EReference Contained0001 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED0001_MANY = ABSTRACT_NODE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>EReference Contained0010 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED0010_MANY = ABSTRACT_NODE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>EReference Contained0011 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED0011_MANY = ABSTRACT_NODE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>EReference Contained0100 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED0100_MANY = ABSTRACT_NODE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>EReference Contained0101 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED0101_MANY = ABSTRACT_NODE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>EReference Contained0110 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED0110_MANY = ABSTRACT_NODE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>EReference Contained0111 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED0111_MANY = ABSTRACT_NODE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>EReference Contained1000 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED1000_MANY = ABSTRACT_NODE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>EReference Contained1001 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED1001_MANY = ABSTRACT_NODE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>EReference Contained1010 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED1010_MANY = ABSTRACT_NODE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>EReference Contained1011 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED1011_MANY = ABSTRACT_NODE_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>EReference Contained1100 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED1100_MANY = ABSTRACT_NODE_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>EReference Contained1101 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED1101_MANY = ABSTRACT_NODE_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>EReference Contained1110 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED1110_MANY = ABSTRACT_NODE_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>EReference Contained1111 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_CONTAINED1111_MANY = ABSTRACT_NODE_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>EReference Empty Annotation Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_EMPTY_ANNOTATION_MANY = ABSTRACT_NODE_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>EReference No Annotation Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_NO_ANNOTATION_MANY = ABSTRACT_NODE_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = ABSTRACT_NODE_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>EReference With Type EObject Contained0001 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0001_MANY = ABSTRACT_NODE_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>EReference With Type EObject Contained0010 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0010_MANY = ABSTRACT_NODE_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>EReference With Type EObject Contained0100 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0100_MANY = ABSTRACT_NODE_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>EReference With Type EObject Contained1000 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED1000_MANY = ABSTRACT_NODE_FEATURE_COUNT + 40;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 41;


	/**
	 * The meta object id for the '{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.SubNodeImpl <em>Sub Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.impl.SubNodeImpl
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.impl.NodesPackageImpl#getSubNode()
	 * @generated
	 */
	int SUB_NODE = 2;

	/**
	 * The feature id for the '<em><b>EReference Contained0000 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED0000_SINGLE = NODE__EREFERENCE_CONTAINED0000_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Contained0001 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED0001_SINGLE = NODE__EREFERENCE_CONTAINED0001_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Contained0010 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED0010_SINGLE = NODE__EREFERENCE_CONTAINED0010_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Contained0011 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED0011_SINGLE = NODE__EREFERENCE_CONTAINED0011_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Contained0100 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED0100_SINGLE = NODE__EREFERENCE_CONTAINED0100_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Contained0101 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED0101_SINGLE = NODE__EREFERENCE_CONTAINED0101_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Contained0110 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED0110_SINGLE = NODE__EREFERENCE_CONTAINED0110_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Contained0111 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED0111_SINGLE = NODE__EREFERENCE_CONTAINED0111_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Contained1000 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED1000_SINGLE = NODE__EREFERENCE_CONTAINED1000_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Contained1001 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED1001_SINGLE = NODE__EREFERENCE_CONTAINED1001_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Contained1010 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED1010_SINGLE = NODE__EREFERENCE_CONTAINED1010_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Contained1011 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED1011_SINGLE = NODE__EREFERENCE_CONTAINED1011_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Contained1100 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED1100_SINGLE = NODE__EREFERENCE_CONTAINED1100_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Contained1101 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED1101_SINGLE = NODE__EREFERENCE_CONTAINED1101_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Contained1110 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED1110_SINGLE = NODE__EREFERENCE_CONTAINED1110_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Contained1111 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED1111_SINGLE = NODE__EREFERENCE_CONTAINED1111_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Empty Annotation Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_EMPTY_ANNOTATION_SINGLE = NODE__EREFERENCE_EMPTY_ANNOTATION_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference No Annotation Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_NO_ANNOTATION_SINGLE = NODE__EREFERENCE_NO_ANNOTATION_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Contained0000 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED0000_MANY = NODE__EREFERENCE_CONTAINED0000_MANY;

	/**
	 * The feature id for the '<em><b>EReference Contained0001 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED0001_MANY = NODE__EREFERENCE_CONTAINED0001_MANY;

	/**
	 * The feature id for the '<em><b>EReference Contained0010 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED0010_MANY = NODE__EREFERENCE_CONTAINED0010_MANY;

	/**
	 * The feature id for the '<em><b>EReference Contained0011 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED0011_MANY = NODE__EREFERENCE_CONTAINED0011_MANY;

	/**
	 * The feature id for the '<em><b>EReference Contained0100 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED0100_MANY = NODE__EREFERENCE_CONTAINED0100_MANY;

	/**
	 * The feature id for the '<em><b>EReference Contained0101 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED0101_MANY = NODE__EREFERENCE_CONTAINED0101_MANY;

	/**
	 * The feature id for the '<em><b>EReference Contained0110 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED0110_MANY = NODE__EREFERENCE_CONTAINED0110_MANY;

	/**
	 * The feature id for the '<em><b>EReference Contained0111 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED0111_MANY = NODE__EREFERENCE_CONTAINED0111_MANY;

	/**
	 * The feature id for the '<em><b>EReference Contained1000 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED1000_MANY = NODE__EREFERENCE_CONTAINED1000_MANY;

	/**
	 * The feature id for the '<em><b>EReference Contained1001 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED1001_MANY = NODE__EREFERENCE_CONTAINED1001_MANY;

	/**
	 * The feature id for the '<em><b>EReference Contained1010 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED1010_MANY = NODE__EREFERENCE_CONTAINED1010_MANY;

	/**
	 * The feature id for the '<em><b>EReference Contained1011 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED1011_MANY = NODE__EREFERENCE_CONTAINED1011_MANY;

	/**
	 * The feature id for the '<em><b>EReference Contained1100 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED1100_MANY = NODE__EREFERENCE_CONTAINED1100_MANY;

	/**
	 * The feature id for the '<em><b>EReference Contained1101 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED1101_MANY = NODE__EREFERENCE_CONTAINED1101_MANY;

	/**
	 * The feature id for the '<em><b>EReference Contained1110 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED1110_MANY = NODE__EREFERENCE_CONTAINED1110_MANY;

	/**
	 * The feature id for the '<em><b>EReference Contained1111 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_CONTAINED1111_MANY = NODE__EREFERENCE_CONTAINED1111_MANY;

	/**
	 * The feature id for the '<em><b>EReference Empty Annotation Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_EMPTY_ANNOTATION_MANY = NODE__EREFERENCE_EMPTY_ANNOTATION_MANY;

	/**
	 * The feature id for the '<em><b>EReference No Annotation Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_NO_ANNOTATION_MANY = NODE__EREFERENCE_NO_ANNOTATION_MANY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__NAME = NODE__NAME;

	/**
	 * The feature id for the '<em><b>EReference With Type EObject Contained0001 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0001_MANY = NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0001_MANY;

	/**
	 * The feature id for the '<em><b>EReference With Type EObject Contained0010 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0010_MANY = NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0010_MANY;

	/**
	 * The feature id for the '<em><b>EReference With Type EObject Contained0100 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0100_MANY = NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0100_MANY;

	/**
	 * The feature id for the '<em><b>EReference With Type EObject Contained1000 Many</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED1000_MANY = NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED1000_MANY;

	/**
	 * The number of structural features of the '<em>Sub Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE_FEATURE_COUNT = NODE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0000Single <em>EReference Contained0000 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EReference Contained0000 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0000Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained0000Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0001Single <em>EReference Contained0001 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EReference Contained0001 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0001Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained0001Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0010Single <em>EReference Contained0010 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EReference Contained0010 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0010Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained0010Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0011Single <em>EReference Contained0011 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EReference Contained0011 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0011Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained0011Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0100Single <em>EReference Contained0100 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EReference Contained0100 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0100Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained0100Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0101Single <em>EReference Contained0101 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EReference Contained0101 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0101Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained0101Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0110Single <em>EReference Contained0110 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EReference Contained0110 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0110Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained0110Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0111Single <em>EReference Contained0111 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EReference Contained0111 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0111Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained0111Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1000Single <em>EReference Contained1000 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EReference Contained1000 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1000Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained1000Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1001Single <em>EReference Contained1001 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EReference Contained1001 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1001Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained1001Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1010Single <em>EReference Contained1010 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EReference Contained1010 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1010Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained1010Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1011Single <em>EReference Contained1011 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EReference Contained1011 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1011Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained1011Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1100Single <em>EReference Contained1100 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EReference Contained1100 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1100Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained1100Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1101Single <em>EReference Contained1101 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EReference Contained1101 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1101Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained1101Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1110Single <em>EReference Contained1110 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EReference Contained1110 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1110Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained1110Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1111Single <em>EReference Contained1111 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EReference Contained1111 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1111Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained1111Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_EmptyAnnotationSingle <em>EReference Empty Annotation Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EReference Empty Annotation Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_EmptyAnnotationSingle()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_EmptyAnnotationSingle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_NoAnnotationSingle <em>EReference No Annotation Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EReference No Annotation Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_NoAnnotationSingle()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_NoAnnotationSingle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0000Many <em>EReference Contained0000 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference Contained0000 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0000Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained0000Many();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0001Many <em>EReference Contained0001 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference Contained0001 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0001Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained0001Many();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0010Many <em>EReference Contained0010 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference Contained0010 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0010Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained0010Many();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0011Many <em>EReference Contained0011 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference Contained0011 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0011Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained0011Many();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0100Many <em>EReference Contained0100 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference Contained0100 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0100Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained0100Many();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0101Many <em>EReference Contained0101 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference Contained0101 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0101Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained0101Many();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0110Many <em>EReference Contained0110 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference Contained0110 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0110Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained0110Many();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0111Many <em>EReference Contained0111 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference Contained0111 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained0111Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained0111Many();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1000Many <em>EReference Contained1000 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference Contained1000 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1000Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained1000Many();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1001Many <em>EReference Contained1001 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference Contained1001 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1001Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained1001Many();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1010Many <em>EReference Contained1010 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference Contained1010 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1010Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained1010Many();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1011Many <em>EReference Contained1011 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference Contained1011 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1011Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained1011Many();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1100Many <em>EReference Contained1100 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference Contained1100 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1100Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained1100Many();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1101Many <em>EReference Contained1101 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference Contained1101 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1101Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained1101Many();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1110Many <em>EReference Contained1110 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference Contained1110 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1110Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained1110Many();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1111Many <em>EReference Contained1111 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference Contained1111 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Contained1111Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Contained1111Many();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_EmptyAnnotationMany <em>EReference Empty Annotation Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference Empty Annotation Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_EmptyAnnotationMany()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_EmptyAnnotationMany();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_NoAnnotationMany <em>EReference No Annotation Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference No Annotation Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_NoAnnotationMany()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_NoAnnotationMany();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_WithTypeEObject_Contained0001Many <em>EReference With Type EObject Contained0001 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference With Type EObject Contained0001 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_WithTypeEObject_Contained0001Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_WithTypeEObject_Contained0001Many();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_WithTypeEObject_Contained0010Many <em>EReference With Type EObject Contained0010 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference With Type EObject Contained0010 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_WithTypeEObject_Contained0010Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_WithTypeEObject_Contained0010Many();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_WithTypeEObject_Contained0100Many <em>EReference With Type EObject Contained0100 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference With Type EObject Contained0100 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_WithTypeEObject_Contained0100Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_WithTypeEObject_Contained0100Many();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_WithTypeEObject_Contained1000Many <em>EReference With Type EObject Contained1000 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EReference With Type EObject Contained1000 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_WithTypeEObject_Contained1000Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_WithTypeEObject_Contained1000Many();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.model.nodes.AbstractNode <em>Abstract Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Node</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.AbstractNode
	 * @generated
	 */
	EClass getAbstractNode();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.tests.serialization.model.nodes.SubNode <em>Sub Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Node</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.SubNode
	 * @generated
	 */
	EClass getSubNode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NodesFactory getNodesFactory();

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
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl
		 * @see org.eclipse.rmf.tests.serialization.model.nodes.impl.NodesPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>EReference Contained0000 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED0000_SINGLE = eINSTANCE.getNode_EReference_Contained0000Single();

		/**
		 * The meta object literal for the '<em><b>EReference Contained0001 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED0001_SINGLE = eINSTANCE.getNode_EReference_Contained0001Single();

		/**
		 * The meta object literal for the '<em><b>EReference Contained0010 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED0010_SINGLE = eINSTANCE.getNode_EReference_Contained0010Single();

		/**
		 * The meta object literal for the '<em><b>EReference Contained0011 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED0011_SINGLE = eINSTANCE.getNode_EReference_Contained0011Single();

		/**
		 * The meta object literal for the '<em><b>EReference Contained0100 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED0100_SINGLE = eINSTANCE.getNode_EReference_Contained0100Single();

		/**
		 * The meta object literal for the '<em><b>EReference Contained0101 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED0101_SINGLE = eINSTANCE.getNode_EReference_Contained0101Single();

		/**
		 * The meta object literal for the '<em><b>EReference Contained0110 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED0110_SINGLE = eINSTANCE.getNode_EReference_Contained0110Single();

		/**
		 * The meta object literal for the '<em><b>EReference Contained0111 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED0111_SINGLE = eINSTANCE.getNode_EReference_Contained0111Single();

		/**
		 * The meta object literal for the '<em><b>EReference Contained1000 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED1000_SINGLE = eINSTANCE.getNode_EReference_Contained1000Single();

		/**
		 * The meta object literal for the '<em><b>EReference Contained1001 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED1001_SINGLE = eINSTANCE.getNode_EReference_Contained1001Single();

		/**
		 * The meta object literal for the '<em><b>EReference Contained1010 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED1010_SINGLE = eINSTANCE.getNode_EReference_Contained1010Single();

		/**
		 * The meta object literal for the '<em><b>EReference Contained1011 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED1011_SINGLE = eINSTANCE.getNode_EReference_Contained1011Single();

		/**
		 * The meta object literal for the '<em><b>EReference Contained1100 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED1100_SINGLE = eINSTANCE.getNode_EReference_Contained1100Single();

		/**
		 * The meta object literal for the '<em><b>EReference Contained1101 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED1101_SINGLE = eINSTANCE.getNode_EReference_Contained1101Single();

		/**
		 * The meta object literal for the '<em><b>EReference Contained1110 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED1110_SINGLE = eINSTANCE.getNode_EReference_Contained1110Single();

		/**
		 * The meta object literal for the '<em><b>EReference Contained1111 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED1111_SINGLE = eINSTANCE.getNode_EReference_Contained1111Single();

		/**
		 * The meta object literal for the '<em><b>EReference Empty Annotation Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_EMPTY_ANNOTATION_SINGLE = eINSTANCE.getNode_EReference_EmptyAnnotationSingle();

		/**
		 * The meta object literal for the '<em><b>EReference No Annotation Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_NO_ANNOTATION_SINGLE = eINSTANCE.getNode_EReference_NoAnnotationSingle();

		/**
		 * The meta object literal for the '<em><b>EReference Contained0000 Many</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED0000_MANY = eINSTANCE.getNode_EReference_Contained0000Many();

		/**
		 * The meta object literal for the '<em><b>EReference Contained0001 Many</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED0001_MANY = eINSTANCE.getNode_EReference_Contained0001Many();

		/**
		 * The meta object literal for the '<em><b>EReference Contained0010 Many</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED0010_MANY = eINSTANCE.getNode_EReference_Contained0010Many();

		/**
		 * The meta object literal for the '<em><b>EReference Contained0011 Many</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED0011_MANY = eINSTANCE.getNode_EReference_Contained0011Many();

		/**
		 * The meta object literal for the '<em><b>EReference Contained0100 Many</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED0100_MANY = eINSTANCE.getNode_EReference_Contained0100Many();

		/**
		 * The meta object literal for the '<em><b>EReference Contained0101 Many</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED0101_MANY = eINSTANCE.getNode_EReference_Contained0101Many();

		/**
		 * The meta object literal for the '<em><b>EReference Contained0110 Many</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED0110_MANY = eINSTANCE.getNode_EReference_Contained0110Many();

		/**
		 * The meta object literal for the '<em><b>EReference Contained0111 Many</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED0111_MANY = eINSTANCE.getNode_EReference_Contained0111Many();

		/**
		 * The meta object literal for the '<em><b>EReference Contained1000 Many</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED1000_MANY = eINSTANCE.getNode_EReference_Contained1000Many();

		/**
		 * The meta object literal for the '<em><b>EReference Contained1001 Many</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED1001_MANY = eINSTANCE.getNode_EReference_Contained1001Many();

		/**
		 * The meta object literal for the '<em><b>EReference Contained1010 Many</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED1010_MANY = eINSTANCE.getNode_EReference_Contained1010Many();

		/**
		 * The meta object literal for the '<em><b>EReference Contained1011 Many</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED1011_MANY = eINSTANCE.getNode_EReference_Contained1011Many();

		/**
		 * The meta object literal for the '<em><b>EReference Contained1100 Many</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED1100_MANY = eINSTANCE.getNode_EReference_Contained1100Many();

		/**
		 * The meta object literal for the '<em><b>EReference Contained1101 Many</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED1101_MANY = eINSTANCE.getNode_EReference_Contained1101Many();

		/**
		 * The meta object literal for the '<em><b>EReference Contained1110 Many</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED1110_MANY = eINSTANCE.getNode_EReference_Contained1110Many();

		/**
		 * The meta object literal for the '<em><b>EReference Contained1111 Many</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_CONTAINED1111_MANY = eINSTANCE.getNode_EReference_Contained1111Many();

		/**
		 * The meta object literal for the '<em><b>EReference Empty Annotation Many</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_EMPTY_ANNOTATION_MANY = eINSTANCE.getNode_EReference_EmptyAnnotationMany();

		/**
		 * The meta object literal for the '<em><b>EReference No Annotation Many</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_NO_ANNOTATION_MANY = eINSTANCE.getNode_EReference_NoAnnotationMany();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>EReference With Type EObject Contained0001 Many</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0001_MANY = eINSTANCE.getNode_EReference_WithTypeEObject_Contained0001Many();

		/**
		 * The meta object literal for the '<em><b>EReference With Type EObject Contained0010 Many</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0010_MANY = eINSTANCE.getNode_EReference_WithTypeEObject_Contained0010Many();

		/**
		 * The meta object literal for the '<em><b>EReference With Type EObject Contained0100 Many</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0100_MANY = eINSTANCE.getNode_EReference_WithTypeEObject_Contained0100Many();

		/**
		 * The meta object literal for the '<em><b>EReference With Type EObject Contained1000 Many</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED1000_MANY = eINSTANCE.getNode_EReference_WithTypeEObject_Contained1000Many();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.model.nodes.impl.AbstractNodeImpl
		 * @see org.eclipse.rmf.tests.serialization.model.nodes.impl.NodesPackageImpl#getAbstractNode()
		 * @generated
		 */
		EClass ABSTRACT_NODE = eINSTANCE.getAbstractNode();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.SubNodeImpl <em>Sub Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.model.nodes.impl.SubNodeImpl
		 * @see org.eclipse.rmf.tests.serialization.model.nodes.impl.NodesPackageImpl#getSubNode()
		 * @generated
		 */
		EClass SUB_NODE = eINSTANCE.getSubNode();

	}

} //NodesPackage
