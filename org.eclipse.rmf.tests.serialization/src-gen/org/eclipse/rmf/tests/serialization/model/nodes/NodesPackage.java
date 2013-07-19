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
	 * The feature id for the '<em><b>EReference Referenced0000 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED0000_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>EReference Referenced0001 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED0001_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>EReference Referenced0010 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED0010_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>EReference Referenced0011 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED0011_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>EReference Referenced0100 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED0100_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>EReference Referenced0101 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED0101_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>EReference Referenced0110 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED0110_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 47;

	/**
	 * The feature id for the '<em><b>EReference Referenced0111 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED0111_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 48;

	/**
	 * The feature id for the '<em><b>EReference Referenced1000 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED1000_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 49;

	/**
	 * The feature id for the '<em><b>EReference Referenced1001 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED1001_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 50;

	/**
	 * The feature id for the '<em><b>EReference Referenced1010 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED1010_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 51;

	/**
	 * The feature id for the '<em><b>EReference Referenced1011 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED1011_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 52;

	/**
	 * The feature id for the '<em><b>EReference Referenced1100 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED1100_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 53;

	/**
	 * The feature id for the '<em><b>EReference Referenced1101 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED1101_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 54;

	/**
	 * The feature id for the '<em><b>EReference Referenced1110 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED1110_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 55;

	/**
	 * The feature id for the '<em><b>EReference Referenced1111 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED1111_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 56;

	/**
	 * The feature id for the '<em><b>EReference Referenced0000 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED0000_MANY = ABSTRACT_NODE_FEATURE_COUNT + 57;

	/**
	 * The feature id for the '<em><b>EReference Referenced0001 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED0001_MANY = ABSTRACT_NODE_FEATURE_COUNT + 58;

	/**
	 * The feature id for the '<em><b>EReference Referenced0010 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED0010_MANY = ABSTRACT_NODE_FEATURE_COUNT + 59;

	/**
	 * The feature id for the '<em><b>EReference Referenced0011 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED0011_MANY = ABSTRACT_NODE_FEATURE_COUNT + 60;

	/**
	 * The feature id for the '<em><b>EReference Referenced0100 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED0100_MANY = ABSTRACT_NODE_FEATURE_COUNT + 61;

	/**
	 * The feature id for the '<em><b>EReference Referenced0101 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED0101_MANY = ABSTRACT_NODE_FEATURE_COUNT + 62;

	/**
	 * The feature id for the '<em><b>EReference Referenced0110 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED0110_MANY = ABSTRACT_NODE_FEATURE_COUNT + 63;

	/**
	 * The feature id for the '<em><b>EReference Referenced0111 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED0111_MANY = ABSTRACT_NODE_FEATURE_COUNT + 64;

	/**
	 * The feature id for the '<em><b>EReference Referenced1000 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED1000_MANY = ABSTRACT_NODE_FEATURE_COUNT + 65;

	/**
	 * The feature id for the '<em><b>EReference Referenced1001 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED1001_MANY = ABSTRACT_NODE_FEATURE_COUNT + 66;

	/**
	 * The feature id for the '<em><b>EReference Referenced1010 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED1010_MANY = ABSTRACT_NODE_FEATURE_COUNT + 67;

	/**
	 * The feature id for the '<em><b>EReference Referenced1011 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED1011_MANY = ABSTRACT_NODE_FEATURE_COUNT + 68;

	/**
	 * The feature id for the '<em><b>EReference Referenced1100 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED1100_MANY = ABSTRACT_NODE_FEATURE_COUNT + 69;

	/**
	 * The feature id for the '<em><b>EReference Referenced1101 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED1101_MANY = ABSTRACT_NODE_FEATURE_COUNT + 70;

	/**
	 * The feature id for the '<em><b>EReference Referenced1110 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED1110_MANY = ABSTRACT_NODE_FEATURE_COUNT + 71;

	/**
	 * The feature id for the '<em><b>EReference Referenced1111 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EREFERENCE_REFERENCED1111_MANY = ABSTRACT_NODE_FEATURE_COUNT + 72;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0000 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE0000_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 73;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0001 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE0001_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 74;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0010 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE0010_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 75;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0011 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE0011_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 76;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0100 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE0100_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 77;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0101 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE0101_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 78;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0110 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE0110_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 79;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0111 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE0111_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 80;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1000 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE1000_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 81;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1001 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE1001_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 82;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1010 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE1010_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 83;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1011 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE1011_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 84;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1100 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE1100_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 85;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1101 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE1101_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 86;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1110 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE1110_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 87;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1111 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE1111_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 88;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0000 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE0000_MANY = ABSTRACT_NODE_FEATURE_COUNT + 89;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0001 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE0001_MANY = ABSTRACT_NODE_FEATURE_COUNT + 90;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0010 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE0010_MANY = ABSTRACT_NODE_FEATURE_COUNT + 91;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0011 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE0011_MANY = ABSTRACT_NODE_FEATURE_COUNT + 92;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0100 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE0100_MANY = ABSTRACT_NODE_FEATURE_COUNT + 93;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0101 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE0101_MANY = ABSTRACT_NODE_FEATURE_COUNT + 94;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0110 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE0110_MANY = ABSTRACT_NODE_FEATURE_COUNT + 95;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0111 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE0111_MANY = ABSTRACT_NODE_FEATURE_COUNT + 96;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1000 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE1000_MANY = ABSTRACT_NODE_FEATURE_COUNT + 97;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1001 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE1001_MANY = ABSTRACT_NODE_FEATURE_COUNT + 98;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1010 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE1010_MANY = ABSTRACT_NODE_FEATURE_COUNT + 99;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1011 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE1011_MANY = ABSTRACT_NODE_FEATURE_COUNT + 100;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1100 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE1100_MANY = ABSTRACT_NODE_FEATURE_COUNT + 101;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1101 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE1101_MANY = ABSTRACT_NODE_FEATURE_COUNT + 102;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1110 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE1110_MANY = ABSTRACT_NODE_FEATURE_COUNT + 103;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1111 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EATTRIBUTE_ATTRIBUTE1111_MANY = ABSTRACT_NODE_FEATURE_COUNT + 104;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 105;


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
	 * The feature id for the '<em><b>EReference Referenced0000 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED0000_SINGLE = NODE__EREFERENCE_REFERENCED0000_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Referenced0001 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED0001_SINGLE = NODE__EREFERENCE_REFERENCED0001_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Referenced0010 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED0010_SINGLE = NODE__EREFERENCE_REFERENCED0010_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Referenced0011 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED0011_SINGLE = NODE__EREFERENCE_REFERENCED0011_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Referenced0100 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED0100_SINGLE = NODE__EREFERENCE_REFERENCED0100_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Referenced0101 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED0101_SINGLE = NODE__EREFERENCE_REFERENCED0101_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Referenced0110 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED0110_SINGLE = NODE__EREFERENCE_REFERENCED0110_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Referenced0111 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED0111_SINGLE = NODE__EREFERENCE_REFERENCED0111_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Referenced1000 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED1000_SINGLE = NODE__EREFERENCE_REFERENCED1000_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Referenced1001 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED1001_SINGLE = NODE__EREFERENCE_REFERENCED1001_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Referenced1010 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED1010_SINGLE = NODE__EREFERENCE_REFERENCED1010_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Referenced1011 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED1011_SINGLE = NODE__EREFERENCE_REFERENCED1011_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Referenced1100 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED1100_SINGLE = NODE__EREFERENCE_REFERENCED1100_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Referenced1101 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED1101_SINGLE = NODE__EREFERENCE_REFERENCED1101_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Referenced1110 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED1110_SINGLE = NODE__EREFERENCE_REFERENCED1110_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Referenced1111 Single</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED1111_SINGLE = NODE__EREFERENCE_REFERENCED1111_SINGLE;

	/**
	 * The feature id for the '<em><b>EReference Referenced0000 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED0000_MANY = NODE__EREFERENCE_REFERENCED0000_MANY;

	/**
	 * The feature id for the '<em><b>EReference Referenced0001 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED0001_MANY = NODE__EREFERENCE_REFERENCED0001_MANY;

	/**
	 * The feature id for the '<em><b>EReference Referenced0010 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED0010_MANY = NODE__EREFERENCE_REFERENCED0010_MANY;

	/**
	 * The feature id for the '<em><b>EReference Referenced0011 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED0011_MANY = NODE__EREFERENCE_REFERENCED0011_MANY;

	/**
	 * The feature id for the '<em><b>EReference Referenced0100 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED0100_MANY = NODE__EREFERENCE_REFERENCED0100_MANY;

	/**
	 * The feature id for the '<em><b>EReference Referenced0101 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED0101_MANY = NODE__EREFERENCE_REFERENCED0101_MANY;

	/**
	 * The feature id for the '<em><b>EReference Referenced0110 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED0110_MANY = NODE__EREFERENCE_REFERENCED0110_MANY;

	/**
	 * The feature id for the '<em><b>EReference Referenced0111 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED0111_MANY = NODE__EREFERENCE_REFERENCED0111_MANY;

	/**
	 * The feature id for the '<em><b>EReference Referenced1000 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED1000_MANY = NODE__EREFERENCE_REFERENCED1000_MANY;

	/**
	 * The feature id for the '<em><b>EReference Referenced1001 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED1001_MANY = NODE__EREFERENCE_REFERENCED1001_MANY;

	/**
	 * The feature id for the '<em><b>EReference Referenced1010 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED1010_MANY = NODE__EREFERENCE_REFERENCED1010_MANY;

	/**
	 * The feature id for the '<em><b>EReference Referenced1011 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED1011_MANY = NODE__EREFERENCE_REFERENCED1011_MANY;

	/**
	 * The feature id for the '<em><b>EReference Referenced1100 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED1100_MANY = NODE__EREFERENCE_REFERENCED1100_MANY;

	/**
	 * The feature id for the '<em><b>EReference Referenced1101 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED1101_MANY = NODE__EREFERENCE_REFERENCED1101_MANY;

	/**
	 * The feature id for the '<em><b>EReference Referenced1110 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED1110_MANY = NODE__EREFERENCE_REFERENCED1110_MANY;

	/**
	 * The feature id for the '<em><b>EReference Referenced1111 Many</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EREFERENCE_REFERENCED1111_MANY = NODE__EREFERENCE_REFERENCED1111_MANY;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0000 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE0000_SINGLE = NODE__EATTRIBUTE_ATTRIBUTE0000_SINGLE;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0001 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE0001_SINGLE = NODE__EATTRIBUTE_ATTRIBUTE0001_SINGLE;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0010 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE0010_SINGLE = NODE__EATTRIBUTE_ATTRIBUTE0010_SINGLE;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0011 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE0011_SINGLE = NODE__EATTRIBUTE_ATTRIBUTE0011_SINGLE;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0100 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE0100_SINGLE = NODE__EATTRIBUTE_ATTRIBUTE0100_SINGLE;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0101 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE0101_SINGLE = NODE__EATTRIBUTE_ATTRIBUTE0101_SINGLE;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0110 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE0110_SINGLE = NODE__EATTRIBUTE_ATTRIBUTE0110_SINGLE;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0111 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE0111_SINGLE = NODE__EATTRIBUTE_ATTRIBUTE0111_SINGLE;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1000 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE1000_SINGLE = NODE__EATTRIBUTE_ATTRIBUTE1000_SINGLE;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1001 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE1001_SINGLE = NODE__EATTRIBUTE_ATTRIBUTE1001_SINGLE;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1010 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE1010_SINGLE = NODE__EATTRIBUTE_ATTRIBUTE1010_SINGLE;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1011 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE1011_SINGLE = NODE__EATTRIBUTE_ATTRIBUTE1011_SINGLE;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1100 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE1100_SINGLE = NODE__EATTRIBUTE_ATTRIBUTE1100_SINGLE;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1101 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE1101_SINGLE = NODE__EATTRIBUTE_ATTRIBUTE1101_SINGLE;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1110 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE1110_SINGLE = NODE__EATTRIBUTE_ATTRIBUTE1110_SINGLE;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1111 Single</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE1111_SINGLE = NODE__EATTRIBUTE_ATTRIBUTE1111_SINGLE;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0000 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE0000_MANY = NODE__EATTRIBUTE_ATTRIBUTE0000_MANY;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0001 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE0001_MANY = NODE__EATTRIBUTE_ATTRIBUTE0001_MANY;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0010 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE0010_MANY = NODE__EATTRIBUTE_ATTRIBUTE0010_MANY;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0011 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE0011_MANY = NODE__EATTRIBUTE_ATTRIBUTE0011_MANY;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0100 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE0100_MANY = NODE__EATTRIBUTE_ATTRIBUTE0100_MANY;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0101 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE0101_MANY = NODE__EATTRIBUTE_ATTRIBUTE0101_MANY;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0110 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE0110_MANY = NODE__EATTRIBUTE_ATTRIBUTE0110_MANY;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute0111 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE0111_MANY = NODE__EATTRIBUTE_ATTRIBUTE0111_MANY;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1000 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE1000_MANY = NODE__EATTRIBUTE_ATTRIBUTE1000_MANY;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1001 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE1001_MANY = NODE__EATTRIBUTE_ATTRIBUTE1001_MANY;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1010 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE1010_MANY = NODE__EATTRIBUTE_ATTRIBUTE1010_MANY;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1011 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE1011_MANY = NODE__EATTRIBUTE_ATTRIBUTE1011_MANY;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1100 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE1100_MANY = NODE__EATTRIBUTE_ATTRIBUTE1100_MANY;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1101 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE1101_MANY = NODE__EATTRIBUTE_ATTRIBUTE1101_MANY;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1110 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE1110_MANY = NODE__EATTRIBUTE_ATTRIBUTE1110_MANY;

	/**
	 * The feature id for the '<em><b>EAttribute Attribute1111 Many</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_NODE__EATTRIBUTE_ATTRIBUTE1111_MANY = NODE__EATTRIBUTE_ATTRIBUTE1111_MANY;

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
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0000Single <em>EReference Referenced0000 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference Referenced0000 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0000Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced0000Single();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0001Single <em>EReference Referenced0001 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference Referenced0001 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0001Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced0001Single();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0010Single <em>EReference Referenced0010 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference Referenced0010 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0010Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced0010Single();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0011Single <em>EReference Referenced0011 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference Referenced0011 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0011Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced0011Single();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0100Single <em>EReference Referenced0100 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference Referenced0100 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0100Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced0100Single();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0101Single <em>EReference Referenced0101 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference Referenced0101 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0101Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced0101Single();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0110Single <em>EReference Referenced0110 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference Referenced0110 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0110Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced0110Single();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0111Single <em>EReference Referenced0111 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference Referenced0111 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0111Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced0111Single();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1000Single <em>EReference Referenced1000 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference Referenced1000 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1000Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced1000Single();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1001Single <em>EReference Referenced1001 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference Referenced1001 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1001Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced1001Single();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1010Single <em>EReference Referenced1010 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference Referenced1010 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1010Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced1010Single();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1011Single <em>EReference Referenced1011 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference Referenced1011 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1011Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced1011Single();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1100Single <em>EReference Referenced1100 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference Referenced1100 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1100Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced1100Single();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1101Single <em>EReference Referenced1101 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference Referenced1101 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1101Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced1101Single();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1110Single <em>EReference Referenced1110 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference Referenced1110 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1110Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced1110Single();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1111Single <em>EReference Referenced1111 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference Referenced1111 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1111Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced1111Single();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0000Many <em>EReference Referenced0000 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EReference Referenced0000 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0000Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced0000Many();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0001Many <em>EReference Referenced0001 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EReference Referenced0001 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0001Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced0001Many();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0010Many <em>EReference Referenced0010 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EReference Referenced0010 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0010Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced0010Many();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0011Many <em>EReference Referenced0011 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EReference Referenced0011 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0011Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced0011Many();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0100Many <em>EReference Referenced0100 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EReference Referenced0100 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0100Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced0100Many();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0101Many <em>EReference Referenced0101 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EReference Referenced0101 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0101Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced0101Many();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0110Many <em>EReference Referenced0110 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EReference Referenced0110 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0110Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced0110Many();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0111Many <em>EReference Referenced0111 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EReference Referenced0111 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced0111Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced0111Many();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1000Many <em>EReference Referenced1000 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EReference Referenced1000 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1000Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced1000Many();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1001Many <em>EReference Referenced1001 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EReference Referenced1001 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1001Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced1001Many();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1010Many <em>EReference Referenced1010 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EReference Referenced1010 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1010Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced1010Many();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1011Many <em>EReference Referenced1011 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EReference Referenced1011 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1011Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced1011Many();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1100Many <em>EReference Referenced1100 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EReference Referenced1100 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1100Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced1100Many();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1101Many <em>EReference Referenced1101 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EReference Referenced1101 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1101Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced1101Many();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1110Many <em>EReference Referenced1110 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EReference Referenced1110 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1110Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced1110Many();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1111Many <em>EReference Referenced1111 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EReference Referenced1111 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEReference_Referenced1111Many()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EReference_Referenced1111Many();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0000Single <em>EAttribute Attribute0000 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EAttribute Attribute0000 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0000Single()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute0000Single();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0001Single <em>EAttribute Attribute0001 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EAttribute Attribute0001 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0001Single()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute0001Single();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0010Single <em>EAttribute Attribute0010 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EAttribute Attribute0010 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0010Single()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute0010Single();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0011Single <em>EAttribute Attribute0011 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EAttribute Attribute0011 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0011Single()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute0011Single();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0100Single <em>EAttribute Attribute0100 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EAttribute Attribute0100 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0100Single()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute0100Single();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0101Single <em>EAttribute Attribute0101 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EAttribute Attribute0101 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0101Single()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute0101Single();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0110Single <em>EAttribute Attribute0110 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EAttribute Attribute0110 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0110Single()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute0110Single();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0111Single <em>EAttribute Attribute0111 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EAttribute Attribute0111 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0111Single()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute0111Single();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1000Single <em>EAttribute Attribute1000 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EAttribute Attribute1000 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1000Single()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute1000Single();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1001Single <em>EAttribute Attribute1001 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EAttribute Attribute1001 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1001Single()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute1001Single();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1010Single <em>EAttribute Attribute1010 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EAttribute Attribute1010 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1010Single()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute1010Single();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1011Single <em>EAttribute Attribute1011 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EAttribute Attribute1011 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1011Single()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute1011Single();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1100Single <em>EAttribute Attribute1100 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EAttribute Attribute1100 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1100Single()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute1100Single();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1101Single <em>EAttribute Attribute1101 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EAttribute Attribute1101 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1101Single()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute1101Single();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1110Single <em>EAttribute Attribute1110 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EAttribute Attribute1110 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1110Single()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute1110Single();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1111Single <em>EAttribute Attribute1111 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EAttribute Attribute1111 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1111Single()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute1111Single();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0000Many <em>EAttribute Attribute0000 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>EAttribute Attribute0000 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0000Many()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute0000Many();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0001Many <em>EAttribute Attribute0001 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>EAttribute Attribute0001 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0001Many()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute0001Many();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0010Many <em>EAttribute Attribute0010 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>EAttribute Attribute0010 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0010Many()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute0010Many();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0011Many <em>EAttribute Attribute0011 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>EAttribute Attribute0011 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0011Many()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute0011Many();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0100Many <em>EAttribute Attribute0100 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>EAttribute Attribute0100 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0100Many()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute0100Many();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0101Many <em>EAttribute Attribute0101 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>EAttribute Attribute0101 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0101Many()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute0101Many();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0110Many <em>EAttribute Attribute0110 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>EAttribute Attribute0110 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0110Many()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute0110Many();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0111Many <em>EAttribute Attribute0111 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>EAttribute Attribute0111 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute0111Many()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute0111Many();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1000Many <em>EAttribute Attribute1000 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>EAttribute Attribute1000 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1000Many()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute1000Many();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1001Many <em>EAttribute Attribute1001 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>EAttribute Attribute1001 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1001Many()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute1001Many();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1010Many <em>EAttribute Attribute1010 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>EAttribute Attribute1010 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1010Many()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute1010Many();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1011Many <em>EAttribute Attribute1011 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>EAttribute Attribute1011 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1011Many()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute1011Many();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1100Many <em>EAttribute Attribute1100 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>EAttribute Attribute1100 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1100Many()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute1100Many();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1101Many <em>EAttribute Attribute1101 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>EAttribute Attribute1101 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1101Many()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute1101Many();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1110Many <em>EAttribute Attribute1110 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>EAttribute Attribute1110 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1110Many()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute1110Many();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1111Many <em>EAttribute Attribute1111 Many</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>EAttribute Attribute1111 Many</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getEAttribute_Attribute1111Many()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EAttribute_Attribute1111Many();

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
		 * The meta object literal for the '<em><b>EReference Referenced0000 Single</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED0000_SINGLE = eINSTANCE.getNode_EReference_Referenced0000Single();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced0001 Single</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED0001_SINGLE = eINSTANCE.getNode_EReference_Referenced0001Single();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced0010 Single</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED0010_SINGLE = eINSTANCE.getNode_EReference_Referenced0010Single();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced0011 Single</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED0011_SINGLE = eINSTANCE.getNode_EReference_Referenced0011Single();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced0100 Single</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED0100_SINGLE = eINSTANCE.getNode_EReference_Referenced0100Single();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced0101 Single</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED0101_SINGLE = eINSTANCE.getNode_EReference_Referenced0101Single();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced0110 Single</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED0110_SINGLE = eINSTANCE.getNode_EReference_Referenced0110Single();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced0111 Single</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED0111_SINGLE = eINSTANCE.getNode_EReference_Referenced0111Single();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced1000 Single</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED1000_SINGLE = eINSTANCE.getNode_EReference_Referenced1000Single();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced1001 Single</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED1001_SINGLE = eINSTANCE.getNode_EReference_Referenced1001Single();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced1010 Single</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED1010_SINGLE = eINSTANCE.getNode_EReference_Referenced1010Single();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced1011 Single</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED1011_SINGLE = eINSTANCE.getNode_EReference_Referenced1011Single();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced1100 Single</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED1100_SINGLE = eINSTANCE.getNode_EReference_Referenced1100Single();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced1101 Single</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED1101_SINGLE = eINSTANCE.getNode_EReference_Referenced1101Single();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced1110 Single</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED1110_SINGLE = eINSTANCE.getNode_EReference_Referenced1110Single();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced1111 Single</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED1111_SINGLE = eINSTANCE.getNode_EReference_Referenced1111Single();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced0000 Many</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED0000_MANY = eINSTANCE.getNode_EReference_Referenced0000Many();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced0001 Many</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED0001_MANY = eINSTANCE.getNode_EReference_Referenced0001Many();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced0010 Many</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED0010_MANY = eINSTANCE.getNode_EReference_Referenced0010Many();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced0011 Many</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED0011_MANY = eINSTANCE.getNode_EReference_Referenced0011Many();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced0100 Many</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED0100_MANY = eINSTANCE.getNode_EReference_Referenced0100Many();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced0101 Many</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED0101_MANY = eINSTANCE.getNode_EReference_Referenced0101Many();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced0110 Many</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED0110_MANY = eINSTANCE.getNode_EReference_Referenced0110Many();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced0111 Many</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED0111_MANY = eINSTANCE.getNode_EReference_Referenced0111Many();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced1000 Many</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED1000_MANY = eINSTANCE.getNode_EReference_Referenced1000Many();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced1001 Many</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED1001_MANY = eINSTANCE.getNode_EReference_Referenced1001Many();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced1010 Many</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED1010_MANY = eINSTANCE.getNode_EReference_Referenced1010Many();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced1011 Many</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED1011_MANY = eINSTANCE.getNode_EReference_Referenced1011Many();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced1100 Many</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED1100_MANY = eINSTANCE.getNode_EReference_Referenced1100Many();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced1101 Many</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED1101_MANY = eINSTANCE.getNode_EReference_Referenced1101Many();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced1110 Many</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED1110_MANY = eINSTANCE.getNode_EReference_Referenced1110Many();

		/**
		 * The meta object literal for the '<em><b>EReference Referenced1111 Many</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EREFERENCE_REFERENCED1111_MANY = eINSTANCE.getNode_EReference_Referenced1111Many();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute0000 Single</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE0000_SINGLE = eINSTANCE.getNode_EAttribute_Attribute0000Single();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute0001 Single</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE0001_SINGLE = eINSTANCE.getNode_EAttribute_Attribute0001Single();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute0010 Single</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE0010_SINGLE = eINSTANCE.getNode_EAttribute_Attribute0010Single();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute0011 Single</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE0011_SINGLE = eINSTANCE.getNode_EAttribute_Attribute0011Single();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute0100 Single</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE0100_SINGLE = eINSTANCE.getNode_EAttribute_Attribute0100Single();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute0101 Single</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE0101_SINGLE = eINSTANCE.getNode_EAttribute_Attribute0101Single();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute0110 Single</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE0110_SINGLE = eINSTANCE.getNode_EAttribute_Attribute0110Single();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute0111 Single</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE0111_SINGLE = eINSTANCE.getNode_EAttribute_Attribute0111Single();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute1000 Single</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE1000_SINGLE = eINSTANCE.getNode_EAttribute_Attribute1000Single();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute1001 Single</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE1001_SINGLE = eINSTANCE.getNode_EAttribute_Attribute1001Single();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute1010 Single</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE1010_SINGLE = eINSTANCE.getNode_EAttribute_Attribute1010Single();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute1011 Single</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE1011_SINGLE = eINSTANCE.getNode_EAttribute_Attribute1011Single();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute1100 Single</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE1100_SINGLE = eINSTANCE.getNode_EAttribute_Attribute1100Single();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute1101 Single</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE1101_SINGLE = eINSTANCE.getNode_EAttribute_Attribute1101Single();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute1110 Single</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE1110_SINGLE = eINSTANCE.getNode_EAttribute_Attribute1110Single();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute1111 Single</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE1111_SINGLE = eINSTANCE.getNode_EAttribute_Attribute1111Single();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute0000 Many</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE0000_MANY = eINSTANCE.getNode_EAttribute_Attribute0000Many();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute0001 Many</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE0001_MANY = eINSTANCE.getNode_EAttribute_Attribute0001Many();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute0010 Many</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE0010_MANY = eINSTANCE.getNode_EAttribute_Attribute0010Many();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute0011 Many</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE0011_MANY = eINSTANCE.getNode_EAttribute_Attribute0011Many();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute0100 Many</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE0100_MANY = eINSTANCE.getNode_EAttribute_Attribute0100Many();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute0101 Many</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE0101_MANY = eINSTANCE.getNode_EAttribute_Attribute0101Many();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute0110 Many</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE0110_MANY = eINSTANCE.getNode_EAttribute_Attribute0110Many();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute0111 Many</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE0111_MANY = eINSTANCE.getNode_EAttribute_Attribute0111Many();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute1000 Many</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE1000_MANY = eINSTANCE.getNode_EAttribute_Attribute1000Many();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute1001 Many</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE1001_MANY = eINSTANCE.getNode_EAttribute_Attribute1001Many();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute1010 Many</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE1010_MANY = eINSTANCE.getNode_EAttribute_Attribute1010Many();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute1011 Many</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE1011_MANY = eINSTANCE.getNode_EAttribute_Attribute1011Many();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute1100 Many</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE1100_MANY = eINSTANCE.getNode_EAttribute_Attribute1100Many();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute1101 Many</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE1101_MANY = eINSTANCE.getNode_EAttribute_Attribute1101Many();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute1110 Many</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE1110_MANY = eINSTANCE.getNode_EAttribute_Attribute1110Many();

		/**
		 * The meta object literal for the '<em><b>EAttribute Attribute1111 Many</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__EATTRIBUTE_ATTRIBUTE1111_MANY = eINSTANCE.getNode_EAttribute_Attribute1111Many();

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
