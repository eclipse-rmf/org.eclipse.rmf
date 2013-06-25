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
	 * The feature id for the '<em><b>Feature With Serialization0000 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION0000_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature With Serialization0001 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION0001_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feature With Serialization0010 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION0010_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Feature With Serialization0011 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION0011_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Feature With Serialization0100 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION0100_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Feature With Serialization0101 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION0101_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Feature With Serialization0110 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION0110_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Feature With Serialization0111 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION0111_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Feature With Serialization1000 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION1000_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Feature With Serialization1001 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION1001_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Feature With Serialization1010 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION1010_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Feature With Serialization1011 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION1011_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Feature With Serialization1100 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION1100_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Feature With Serialization1101 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION1101_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Feature With Serialization1110 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION1110_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Feature With Serialization1111 Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION1111_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Feature Empty Annotation Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_EMPTY_ANNOTATION_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Feature No Annotation Single</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_NO_ANNOTATION_SINGLE = ABSTRACT_NODE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Feature With Serialization0000 Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION0000_MULTI = ABSTRACT_NODE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Feature With Serialization0001 Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION0001_MULTI = ABSTRACT_NODE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Feature With Serialization0010 Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION0010_MULTI = ABSTRACT_NODE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Feature With Serialization0011 Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION0011_MULTI = ABSTRACT_NODE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Feature With Serialization0100 Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION0100_MULTI = ABSTRACT_NODE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Feature With Serialization0101 Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION0101_MULTI = ABSTRACT_NODE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Feature With Serialization0110 Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION0110_MULTI = ABSTRACT_NODE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Feature With Serialization0111 Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION0111_MULTI = ABSTRACT_NODE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Feature With Serialization1000 Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION1000_MULTI = ABSTRACT_NODE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Feature With Serialization1001 Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION1001_MULTI = ABSTRACT_NODE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Feature With Serialization1010 Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION1010_MULTI = ABSTRACT_NODE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Feature With Serialization1011 Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION1011_MULTI = ABSTRACT_NODE_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Feature With Serialization1100 Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION1100_MULTI = ABSTRACT_NODE_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Feature With Serialization1101 Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION1101_MULTI = ABSTRACT_NODE_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Feature With Serialization1110 Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION1110_MULTI = ABSTRACT_NODE_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Feature With Serialization1111 Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_SERIALIZATION1111_MULTI = ABSTRACT_NODE_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Feature Empty Annotation Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_EMPTY_ANNOTATION_MULTI = ABSTRACT_NODE_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Feature No Annotation Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_NO_ANNOTATION_MULTI = ABSTRACT_NODE_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = ABSTRACT_NODE_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Feature With Type EObject And Serialization0001 Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0001_MULTI = ABSTRACT_NODE_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Feature With Type EObject And Serialization0010 Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0010_MULTI = ABSTRACT_NODE_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Feature With Type EObject And Serialization0100 Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0100_MULTI = ABSTRACT_NODE_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Feature With Type EObject And Serialization1000 Multi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION1000_MULTI = ABSTRACT_NODE_FEATURE_COUNT + 40;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = ABSTRACT_NODE_FEATURE_COUNT + 41;


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
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0000_Single <em>Feature With Serialization0000 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature With Serialization0000 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0000_Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization0000_Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0001_Single <em>Feature With Serialization0001 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature With Serialization0001 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0001_Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization0001_Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0010_Single <em>Feature With Serialization0010 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature With Serialization0010 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0010_Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization0010_Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0011_Single <em>Feature With Serialization0011 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature With Serialization0011 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0011_Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization0011_Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0100_Single <em>Feature With Serialization0100 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature With Serialization0100 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0100_Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization0100_Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0101_Single <em>Feature With Serialization0101 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature With Serialization0101 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0101_Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization0101_Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0110_Single <em>Feature With Serialization0110 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature With Serialization0110 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0110_Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization0110_Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0111_Single <em>Feature With Serialization0111 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature With Serialization0111 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0111_Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization0111_Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1000_Single <em>Feature With Serialization1000 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature With Serialization1000 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1000_Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization1000_Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1001_Single <em>Feature With Serialization1001 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature With Serialization1001 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1001_Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization1001_Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1010_Single <em>Feature With Serialization1010 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature With Serialization1010 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1010_Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization1010_Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1011_Single <em>Feature With Serialization1011 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature With Serialization1011 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1011_Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization1011_Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1100_Single <em>Feature With Serialization1100 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature With Serialization1100 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1100_Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization1100_Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1101_Single <em>Feature With Serialization1101 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature With Serialization1101 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1101_Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization1101_Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1110_Single <em>Feature With Serialization1110 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature With Serialization1110 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1110_Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization1110_Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1111_Single <em>Feature With Serialization1111 Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature With Serialization1111 Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1111_Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization1111_Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureEmptyAnnotation_Single <em>Feature Empty Annotation Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Empty Annotation Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureEmptyAnnotation_Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureEmptyAnnotation_Single();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureNoAnnotation_Single <em>Feature No Annotation Single</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature No Annotation Single</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureNoAnnotation_Single()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureNoAnnotation_Single();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0000_Multi <em>Feature With Serialization0000 Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature With Serialization0000 Multi</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0000_Multi()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization0000_Multi();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0001_Multi <em>Feature With Serialization0001 Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature With Serialization0001 Multi</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0001_Multi()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization0001_Multi();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0010_Multi <em>Feature With Serialization0010 Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature With Serialization0010 Multi</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0010_Multi()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization0010_Multi();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0011_Multi <em>Feature With Serialization0011 Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature With Serialization0011 Multi</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0011_Multi()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization0011_Multi();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0100_Multi <em>Feature With Serialization0100 Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature With Serialization0100 Multi</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0100_Multi()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization0100_Multi();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0101_Multi <em>Feature With Serialization0101 Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature With Serialization0101 Multi</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0101_Multi()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization0101_Multi();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0110_Multi <em>Feature With Serialization0110 Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature With Serialization0110 Multi</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0110_Multi()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization0110_Multi();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0111_Multi <em>Feature With Serialization0111 Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature With Serialization0111 Multi</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization0111_Multi()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization0111_Multi();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1000_Multi <em>Feature With Serialization1000 Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature With Serialization1000 Multi</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1000_Multi()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization1000_Multi();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1001_Multi <em>Feature With Serialization1001 Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature With Serialization1001 Multi</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1001_Multi()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization1001_Multi();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1010_Multi <em>Feature With Serialization1010 Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature With Serialization1010 Multi</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1010_Multi()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization1010_Multi();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1011_Multi <em>Feature With Serialization1011 Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature With Serialization1011 Multi</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1011_Multi()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization1011_Multi();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1100_Multi <em>Feature With Serialization1100 Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature With Serialization1100 Multi</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1100_Multi()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization1100_Multi();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1101_Multi <em>Feature With Serialization1101 Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature With Serialization1101 Multi</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1101_Multi()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization1101_Multi();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1110_Multi <em>Feature With Serialization1110 Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature With Serialization1110 Multi</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1110_Multi()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization1110_Multi();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1111_Multi <em>Feature With Serialization1111 Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature With Serialization1111 Multi</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithSerialization1111_Multi()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithSerialization1111_Multi();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureEmptyAnnotation_Multi <em>Feature Empty Annotation Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Empty Annotation Multi</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureEmptyAnnotation_Multi()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureEmptyAnnotation_Multi();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureNoAnnotation_Multi <em>Feature No Annotation Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature No Annotation Multi</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureNoAnnotation_Multi()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureNoAnnotation_Multi();

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
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithTypeEObjectAndSerialization0001_Multi <em>Feature With Type EObject And Serialization0001 Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature With Type EObject And Serialization0001 Multi</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithTypeEObjectAndSerialization0001_Multi()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithTypeEObjectAndSerialization0001_Multi();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithTypeEObjectAndSerialization0010_Multi <em>Feature With Type EObject And Serialization0010 Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature With Type EObject And Serialization0010 Multi</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithTypeEObjectAndSerialization0010_Multi()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithTypeEObjectAndSerialization0010_Multi();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithTypeEObjectAndSerialization0100_Multi <em>Feature With Type EObject And Serialization0100 Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature With Type EObject And Serialization0100 Multi</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithTypeEObjectAndSerialization0100_Multi()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithTypeEObjectAndSerialization0100_Multi();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithTypeEObjectAndSerialization1000_Multi <em>Feature With Type EObject And Serialization1000 Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature With Type EObject And Serialization1000 Multi</em>'.
	 * @see org.eclipse.rmf.tests.serialization.model.nodes.Node#getFeatureWithTypeEObjectAndSerialization1000_Multi()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_FeatureWithTypeEObjectAndSerialization1000_Multi();

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
		 * The meta object literal for the '<em><b>Feature With Serialization0000 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION0000_SINGLE = eINSTANCE.getNode_FeatureWithSerialization0000_Single();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization0001 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION0001_SINGLE = eINSTANCE.getNode_FeatureWithSerialization0001_Single();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization0010 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION0010_SINGLE = eINSTANCE.getNode_FeatureWithSerialization0010_Single();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization0011 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION0011_SINGLE = eINSTANCE.getNode_FeatureWithSerialization0011_Single();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization0100 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION0100_SINGLE = eINSTANCE.getNode_FeatureWithSerialization0100_Single();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization0101 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION0101_SINGLE = eINSTANCE.getNode_FeatureWithSerialization0101_Single();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization0110 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION0110_SINGLE = eINSTANCE.getNode_FeatureWithSerialization0110_Single();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization0111 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION0111_SINGLE = eINSTANCE.getNode_FeatureWithSerialization0111_Single();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization1000 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION1000_SINGLE = eINSTANCE.getNode_FeatureWithSerialization1000_Single();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization1001 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION1001_SINGLE = eINSTANCE.getNode_FeatureWithSerialization1001_Single();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization1010 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION1010_SINGLE = eINSTANCE.getNode_FeatureWithSerialization1010_Single();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization1011 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION1011_SINGLE = eINSTANCE.getNode_FeatureWithSerialization1011_Single();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization1100 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION1100_SINGLE = eINSTANCE.getNode_FeatureWithSerialization1100_Single();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization1101 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION1101_SINGLE = eINSTANCE.getNode_FeatureWithSerialization1101_Single();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization1110 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION1110_SINGLE = eINSTANCE.getNode_FeatureWithSerialization1110_Single();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization1111 Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION1111_SINGLE = eINSTANCE.getNode_FeatureWithSerialization1111_Single();

		/**
		 * The meta object literal for the '<em><b>Feature Empty Annotation Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_EMPTY_ANNOTATION_SINGLE = eINSTANCE.getNode_FeatureEmptyAnnotation_Single();

		/**
		 * The meta object literal for the '<em><b>Feature No Annotation Single</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_NO_ANNOTATION_SINGLE = eINSTANCE.getNode_FeatureNoAnnotation_Single();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization0000 Multi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION0000_MULTI = eINSTANCE.getNode_FeatureWithSerialization0000_Multi();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization0001 Multi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION0001_MULTI = eINSTANCE.getNode_FeatureWithSerialization0001_Multi();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization0010 Multi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION0010_MULTI = eINSTANCE.getNode_FeatureWithSerialization0010_Multi();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization0011 Multi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION0011_MULTI = eINSTANCE.getNode_FeatureWithSerialization0011_Multi();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization0100 Multi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION0100_MULTI = eINSTANCE.getNode_FeatureWithSerialization0100_Multi();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization0101 Multi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION0101_MULTI = eINSTANCE.getNode_FeatureWithSerialization0101_Multi();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization0110 Multi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION0110_MULTI = eINSTANCE.getNode_FeatureWithSerialization0110_Multi();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization0111 Multi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION0111_MULTI = eINSTANCE.getNode_FeatureWithSerialization0111_Multi();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization1000 Multi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION1000_MULTI = eINSTANCE.getNode_FeatureWithSerialization1000_Multi();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization1001 Multi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION1001_MULTI = eINSTANCE.getNode_FeatureWithSerialization1001_Multi();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization1010 Multi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION1010_MULTI = eINSTANCE.getNode_FeatureWithSerialization1010_Multi();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization1011 Multi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION1011_MULTI = eINSTANCE.getNode_FeatureWithSerialization1011_Multi();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization1100 Multi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION1100_MULTI = eINSTANCE.getNode_FeatureWithSerialization1100_Multi();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization1101 Multi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION1101_MULTI = eINSTANCE.getNode_FeatureWithSerialization1101_Multi();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization1110 Multi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION1110_MULTI = eINSTANCE.getNode_FeatureWithSerialization1110_Multi();

		/**
		 * The meta object literal for the '<em><b>Feature With Serialization1111 Multi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_SERIALIZATION1111_MULTI = eINSTANCE.getNode_FeatureWithSerialization1111_Multi();

		/**
		 * The meta object literal for the '<em><b>Feature Empty Annotation Multi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_EMPTY_ANNOTATION_MULTI = eINSTANCE.getNode_FeatureEmptyAnnotation_Multi();

		/**
		 * The meta object literal for the '<em><b>Feature No Annotation Multi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_NO_ANNOTATION_MULTI = eINSTANCE.getNode_FeatureNoAnnotation_Multi();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Feature With Type EObject And Serialization0001 Multi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0001_MULTI = eINSTANCE.getNode_FeatureWithTypeEObjectAndSerialization0001_Multi();

		/**
		 * The meta object literal for the '<em><b>Feature With Type EObject And Serialization0010 Multi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0010_MULTI = eINSTANCE.getNode_FeatureWithTypeEObjectAndSerialization0010_Multi();

		/**
		 * The meta object literal for the '<em><b>Feature With Type EObject And Serialization0100 Multi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0100_MULTI = eINSTANCE.getNode_FeatureWithTypeEObjectAndSerialization0100_Multi();

		/**
		 * The meta object literal for the '<em><b>Feature With Type EObject And Serialization1000 Multi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION1000_MULTI = eINSTANCE.getNode_FeatureWithTypeEObjectAndSerialization1000_Multi();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.AbstractNodeImpl <em>Abstract Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.tests.serialization.model.nodes.impl.AbstractNodeImpl
		 * @see org.eclipse.rmf.tests.serialization.model.nodes.impl.NodesPackageImpl#getAbstractNode()
		 * @generated
		 */
		EClass ABSTRACT_NODE = eINSTANCE.getAbstractNode();

	}

} //NodesPackage
