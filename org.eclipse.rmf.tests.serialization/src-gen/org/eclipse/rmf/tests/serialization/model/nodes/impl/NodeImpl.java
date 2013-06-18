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
package org.eclipse.rmf.tests.serialization.model.nodes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.rmf.tests.serialization.model.nodes.Node;
import org.eclipse.rmf.tests.serialization.model.nodes.NodesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization0000_Single <em>Feature With Serialization0000 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization0001_Single <em>Feature With Serialization0001 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization0010_Single <em>Feature With Serialization0010 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization0011_Single <em>Feature With Serialization0011 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization0100_Single <em>Feature With Serialization0100 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization0101_Single <em>Feature With Serialization0101 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization0110_Single <em>Feature With Serialization0110 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization0111_Single <em>Feature With Serialization0111 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization1000_Single <em>Feature With Serialization1000 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization1001_Single <em>Feature With Serialization1001 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization1010_Single <em>Feature With Serialization1010 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization1011_Single <em>Feature With Serialization1011 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization1100_Single <em>Feature With Serialization1100 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization1101_Single <em>Feature With Serialization1101 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization1110_Single <em>Feature With Serialization1110 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization1111_Single <em>Feature With Serialization1111 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureEmptyAnnotation_Single <em>Feature Empty Annotation Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureNoAnnotation_Single <em>Feature No Annotation Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization0000_Multi <em>Feature With Serialization0000 Multi</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization0001_Multi <em>Feature With Serialization0001 Multi</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization0010_Multi <em>Feature With Serialization0010 Multi</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization0011_Multi <em>Feature With Serialization0011 Multi</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization0100_Multi <em>Feature With Serialization0100 Multi</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization0101_Multi <em>Feature With Serialization0101 Multi</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization0110_Multi <em>Feature With Serialization0110 Multi</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization0111_Multi <em>Feature With Serialization0111 Multi</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization1000_Multi <em>Feature With Serialization1000 Multi</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization1001_Multi <em>Feature With Serialization1001 Multi</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization1010_Multi <em>Feature With Serialization1010 Multi</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization1011_Multi <em>Feature With Serialization1011 Multi</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization1100_Multi <em>Feature With Serialization1100 Multi</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization1101_Multi <em>Feature With Serialization1101 Multi</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization1110_Multi <em>Feature With Serialization1110 Multi</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithSerialization1111_Multi <em>Feature With Serialization1111 Multi</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureEmptyAnnotation_Multi <em>Feature Empty Annotation Multi</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureNoAnnotation_Multi <em>Feature No Annotation Multi</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithTypeEObjectAndSerialization0001_Multi <em>Feature With Type EObject And Serialization0001 Multi</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithTypeEObjectAndSerialization0010_Multi <em>Feature With Type EObject And Serialization0010 Multi</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithTypeEObjectAndSerialization0100_Multi <em>Feature With Type EObject And Serialization0100 Multi</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getFeatureWithTypeEObjectAndSerialization1000_Multi <em>Feature With Type EObject And Serialization1000 Multi</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends AbstractNodeImpl implements Node {
	/**
	 * The cached value of the '{@link #getFeatureWithSerialization0000_Single() <em>Feature With Serialization0000 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization0000_Single()
	 * @generated
	 * @ordered
	 */
	protected Node featureWithSerialization0000_Single;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization0001_Single() <em>Feature With Serialization0001 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization0001_Single()
	 * @generated
	 * @ordered
	 */
	protected Node featureWithSerialization0001_Single;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization0010_Single() <em>Feature With Serialization0010 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization0010_Single()
	 * @generated
	 * @ordered
	 */
	protected Node featureWithSerialization0010_Single;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization0011_Single() <em>Feature With Serialization0011 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization0011_Single()
	 * @generated
	 * @ordered
	 */
	protected Node featureWithSerialization0011_Single;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization0100_Single() <em>Feature With Serialization0100 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization0100_Single()
	 * @generated
	 * @ordered
	 */
	protected Node featureWithSerialization0100_Single;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization0101_Single() <em>Feature With Serialization0101 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization0101_Single()
	 * @generated
	 * @ordered
	 */
	protected Node featureWithSerialization0101_Single;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization0110_Single() <em>Feature With Serialization0110 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization0110_Single()
	 * @generated
	 * @ordered
	 */
	protected Node featureWithSerialization0110_Single;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization0111_Single() <em>Feature With Serialization0111 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization0111_Single()
	 * @generated
	 * @ordered
	 */
	protected Node featureWithSerialization0111_Single;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization1000_Single() <em>Feature With Serialization1000 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization1000_Single()
	 * @generated
	 * @ordered
	 */
	protected Node featureWithSerialization1000_Single;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization1001_Single() <em>Feature With Serialization1001 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization1001_Single()
	 * @generated
	 * @ordered
	 */
	protected Node featureWithSerialization1001_Single;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization1010_Single() <em>Feature With Serialization1010 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization1010_Single()
	 * @generated
	 * @ordered
	 */
	protected Node featureWithSerialization1010_Single;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization1011_Single() <em>Feature With Serialization1011 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization1011_Single()
	 * @generated
	 * @ordered
	 */
	protected Node featureWithSerialization1011_Single;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization1100_Single() <em>Feature With Serialization1100 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization1100_Single()
	 * @generated
	 * @ordered
	 */
	protected Node featureWithSerialization1100_Single;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization1101_Single() <em>Feature With Serialization1101 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization1101_Single()
	 * @generated
	 * @ordered
	 */
	protected Node featureWithSerialization1101_Single;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization1110_Single() <em>Feature With Serialization1110 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization1110_Single()
	 * @generated
	 * @ordered
	 */
	protected Node featureWithSerialization1110_Single;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization1111_Single() <em>Feature With Serialization1111 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization1111_Single()
	 * @generated
	 * @ordered
	 */
	protected Node featureWithSerialization1111_Single;

	/**
	 * The cached value of the '{@link #getFeatureEmptyAnnotation_Single() <em>Feature Empty Annotation Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureEmptyAnnotation_Single()
	 * @generated
	 * @ordered
	 */
	protected Node featureEmptyAnnotation_Single;

	/**
	 * The cached value of the '{@link #getFeatureNoAnnotation_Single() <em>Feature No Annotation Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureNoAnnotation_Single()
	 * @generated
	 * @ordered
	 */
	protected Node featureNoAnnotation_Single;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization0000_Multi() <em>Feature With Serialization0000 Multi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization0000_Multi()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> featureWithSerialization0000_Multi;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization0001_Multi() <em>Feature With Serialization0001 Multi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization0001_Multi()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> featureWithSerialization0001_Multi;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization0010_Multi() <em>Feature With Serialization0010 Multi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization0010_Multi()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> featureWithSerialization0010_Multi;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization0011_Multi() <em>Feature With Serialization0011 Multi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization0011_Multi()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> featureWithSerialization0011_Multi;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization0100_Multi() <em>Feature With Serialization0100 Multi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization0100_Multi()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> featureWithSerialization0100_Multi;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization0101_Multi() <em>Feature With Serialization0101 Multi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization0101_Multi()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> featureWithSerialization0101_Multi;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization0110_Multi() <em>Feature With Serialization0110 Multi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization0110_Multi()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> featureWithSerialization0110_Multi;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization0111_Multi() <em>Feature With Serialization0111 Multi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization0111_Multi()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> featureWithSerialization0111_Multi;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization1000_Multi() <em>Feature With Serialization1000 Multi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization1000_Multi()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> featureWithSerialization1000_Multi;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization1001_Multi() <em>Feature With Serialization1001 Multi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization1001_Multi()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> featureWithSerialization1001_Multi;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization1010_Multi() <em>Feature With Serialization1010 Multi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization1010_Multi()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> featureWithSerialization1010_Multi;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization1011_Multi() <em>Feature With Serialization1011 Multi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization1011_Multi()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> featureWithSerialization1011_Multi;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization1100_Multi() <em>Feature With Serialization1100 Multi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization1100_Multi()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> featureWithSerialization1100_Multi;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization1101_Multi() <em>Feature With Serialization1101 Multi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization1101_Multi()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> featureWithSerialization1101_Multi;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization1110_Multi() <em>Feature With Serialization1110 Multi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization1110_Multi()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> featureWithSerialization1110_Multi;

	/**
	 * The cached value of the '{@link #getFeatureWithSerialization1111_Multi() <em>Feature With Serialization1111 Multi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithSerialization1111_Multi()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> featureWithSerialization1111_Multi;

	/**
	 * The cached value of the '{@link #getFeatureEmptyAnnotation_Multi() <em>Feature Empty Annotation Multi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureEmptyAnnotation_Multi()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> featureEmptyAnnotation_Multi;

	/**
	 * The cached value of the '{@link #getFeatureNoAnnotation_Multi() <em>Feature No Annotation Multi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureNoAnnotation_Multi()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> featureNoAnnotation_Multi;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatureWithTypeEObjectAndSerialization0001_Multi() <em>Feature With Type EObject And Serialization0001 Multi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithTypeEObjectAndSerialization0001_Multi()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> featureWithTypeEObjectAndSerialization0001_Multi;

	/**
	 * The cached value of the '{@link #getFeatureWithTypeEObjectAndSerialization0010_Multi() <em>Feature With Type EObject And Serialization0010 Multi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithTypeEObjectAndSerialization0010_Multi()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> featureWithTypeEObjectAndSerialization0010_Multi;

	/**
	 * The cached value of the '{@link #getFeatureWithTypeEObjectAndSerialization0100_Multi() <em>Feature With Type EObject And Serialization0100 Multi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithTypeEObjectAndSerialization0100_Multi()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> featureWithTypeEObjectAndSerialization0100_Multi;

	/**
	 * The cached value of the '{@link #getFeatureWithTypeEObjectAndSerialization1000_Multi() <em>Feature With Type EObject And Serialization1000 Multi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithTypeEObjectAndSerialization1000_Multi()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> featureWithTypeEObjectAndSerialization1000_Multi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NodesPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFeatureWithSerialization0000_Single() {
		return featureWithSerialization0000_Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureWithSerialization0000_Single(Node newFeatureWithSerialization0000_Single, NotificationChain msgs) {
		Node oldFeatureWithSerialization0000_Single = featureWithSerialization0000_Single;
		featureWithSerialization0000_Single = newFeatureWithSerialization0000_Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0000_SINGLE, oldFeatureWithSerialization0000_Single, newFeatureWithSerialization0000_Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureWithSerialization0000_Single(Node newFeatureWithSerialization0000_Single) {
		if (newFeatureWithSerialization0000_Single != featureWithSerialization0000_Single) {
			NotificationChain msgs = null;
			if (featureWithSerialization0000_Single != null)
				msgs = ((InternalEObject)featureWithSerialization0000_Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0000_SINGLE, null, msgs);
			if (newFeatureWithSerialization0000_Single != null)
				msgs = ((InternalEObject)newFeatureWithSerialization0000_Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0000_SINGLE, null, msgs);
			msgs = basicSetFeatureWithSerialization0000_Single(newFeatureWithSerialization0000_Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0000_SINGLE, newFeatureWithSerialization0000_Single, newFeatureWithSerialization0000_Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFeatureWithSerialization0001_Single() {
		return featureWithSerialization0001_Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureWithSerialization0001_Single(Node newFeatureWithSerialization0001_Single, NotificationChain msgs) {
		Node oldFeatureWithSerialization0001_Single = featureWithSerialization0001_Single;
		featureWithSerialization0001_Single = newFeatureWithSerialization0001_Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0001_SINGLE, oldFeatureWithSerialization0001_Single, newFeatureWithSerialization0001_Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureWithSerialization0001_Single(Node newFeatureWithSerialization0001_Single) {
		if (newFeatureWithSerialization0001_Single != featureWithSerialization0001_Single) {
			NotificationChain msgs = null;
			if (featureWithSerialization0001_Single != null)
				msgs = ((InternalEObject)featureWithSerialization0001_Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0001_SINGLE, null, msgs);
			if (newFeatureWithSerialization0001_Single != null)
				msgs = ((InternalEObject)newFeatureWithSerialization0001_Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0001_SINGLE, null, msgs);
			msgs = basicSetFeatureWithSerialization0001_Single(newFeatureWithSerialization0001_Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0001_SINGLE, newFeatureWithSerialization0001_Single, newFeatureWithSerialization0001_Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFeatureWithSerialization0010_Single() {
		return featureWithSerialization0010_Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureWithSerialization0010_Single(Node newFeatureWithSerialization0010_Single, NotificationChain msgs) {
		Node oldFeatureWithSerialization0010_Single = featureWithSerialization0010_Single;
		featureWithSerialization0010_Single = newFeatureWithSerialization0010_Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0010_SINGLE, oldFeatureWithSerialization0010_Single, newFeatureWithSerialization0010_Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureWithSerialization0010_Single(Node newFeatureWithSerialization0010_Single) {
		if (newFeatureWithSerialization0010_Single != featureWithSerialization0010_Single) {
			NotificationChain msgs = null;
			if (featureWithSerialization0010_Single != null)
				msgs = ((InternalEObject)featureWithSerialization0010_Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0010_SINGLE, null, msgs);
			if (newFeatureWithSerialization0010_Single != null)
				msgs = ((InternalEObject)newFeatureWithSerialization0010_Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0010_SINGLE, null, msgs);
			msgs = basicSetFeatureWithSerialization0010_Single(newFeatureWithSerialization0010_Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0010_SINGLE, newFeatureWithSerialization0010_Single, newFeatureWithSerialization0010_Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFeatureWithSerialization0011_Single() {
		return featureWithSerialization0011_Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureWithSerialization0011_Single(Node newFeatureWithSerialization0011_Single, NotificationChain msgs) {
		Node oldFeatureWithSerialization0011_Single = featureWithSerialization0011_Single;
		featureWithSerialization0011_Single = newFeatureWithSerialization0011_Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0011_SINGLE, oldFeatureWithSerialization0011_Single, newFeatureWithSerialization0011_Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureWithSerialization0011_Single(Node newFeatureWithSerialization0011_Single) {
		if (newFeatureWithSerialization0011_Single != featureWithSerialization0011_Single) {
			NotificationChain msgs = null;
			if (featureWithSerialization0011_Single != null)
				msgs = ((InternalEObject)featureWithSerialization0011_Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0011_SINGLE, null, msgs);
			if (newFeatureWithSerialization0011_Single != null)
				msgs = ((InternalEObject)newFeatureWithSerialization0011_Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0011_SINGLE, null, msgs);
			msgs = basicSetFeatureWithSerialization0011_Single(newFeatureWithSerialization0011_Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0011_SINGLE, newFeatureWithSerialization0011_Single, newFeatureWithSerialization0011_Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFeatureWithSerialization0100_Single() {
		return featureWithSerialization0100_Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureWithSerialization0100_Single(Node newFeatureWithSerialization0100_Single, NotificationChain msgs) {
		Node oldFeatureWithSerialization0100_Single = featureWithSerialization0100_Single;
		featureWithSerialization0100_Single = newFeatureWithSerialization0100_Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0100_SINGLE, oldFeatureWithSerialization0100_Single, newFeatureWithSerialization0100_Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureWithSerialization0100_Single(Node newFeatureWithSerialization0100_Single) {
		if (newFeatureWithSerialization0100_Single != featureWithSerialization0100_Single) {
			NotificationChain msgs = null;
			if (featureWithSerialization0100_Single != null)
				msgs = ((InternalEObject)featureWithSerialization0100_Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0100_SINGLE, null, msgs);
			if (newFeatureWithSerialization0100_Single != null)
				msgs = ((InternalEObject)newFeatureWithSerialization0100_Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0100_SINGLE, null, msgs);
			msgs = basicSetFeatureWithSerialization0100_Single(newFeatureWithSerialization0100_Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0100_SINGLE, newFeatureWithSerialization0100_Single, newFeatureWithSerialization0100_Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFeatureWithSerialization0101_Single() {
		return featureWithSerialization0101_Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureWithSerialization0101_Single(Node newFeatureWithSerialization0101_Single, NotificationChain msgs) {
		Node oldFeatureWithSerialization0101_Single = featureWithSerialization0101_Single;
		featureWithSerialization0101_Single = newFeatureWithSerialization0101_Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0101_SINGLE, oldFeatureWithSerialization0101_Single, newFeatureWithSerialization0101_Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureWithSerialization0101_Single(Node newFeatureWithSerialization0101_Single) {
		if (newFeatureWithSerialization0101_Single != featureWithSerialization0101_Single) {
			NotificationChain msgs = null;
			if (featureWithSerialization0101_Single != null)
				msgs = ((InternalEObject)featureWithSerialization0101_Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0101_SINGLE, null, msgs);
			if (newFeatureWithSerialization0101_Single != null)
				msgs = ((InternalEObject)newFeatureWithSerialization0101_Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0101_SINGLE, null, msgs);
			msgs = basicSetFeatureWithSerialization0101_Single(newFeatureWithSerialization0101_Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0101_SINGLE, newFeatureWithSerialization0101_Single, newFeatureWithSerialization0101_Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFeatureWithSerialization0110_Single() {
		return featureWithSerialization0110_Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureWithSerialization0110_Single(Node newFeatureWithSerialization0110_Single, NotificationChain msgs) {
		Node oldFeatureWithSerialization0110_Single = featureWithSerialization0110_Single;
		featureWithSerialization0110_Single = newFeatureWithSerialization0110_Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0110_SINGLE, oldFeatureWithSerialization0110_Single, newFeatureWithSerialization0110_Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureWithSerialization0110_Single(Node newFeatureWithSerialization0110_Single) {
		if (newFeatureWithSerialization0110_Single != featureWithSerialization0110_Single) {
			NotificationChain msgs = null;
			if (featureWithSerialization0110_Single != null)
				msgs = ((InternalEObject)featureWithSerialization0110_Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0110_SINGLE, null, msgs);
			if (newFeatureWithSerialization0110_Single != null)
				msgs = ((InternalEObject)newFeatureWithSerialization0110_Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0110_SINGLE, null, msgs);
			msgs = basicSetFeatureWithSerialization0110_Single(newFeatureWithSerialization0110_Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0110_SINGLE, newFeatureWithSerialization0110_Single, newFeatureWithSerialization0110_Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFeatureWithSerialization0111_Single() {
		return featureWithSerialization0111_Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureWithSerialization0111_Single(Node newFeatureWithSerialization0111_Single, NotificationChain msgs) {
		Node oldFeatureWithSerialization0111_Single = featureWithSerialization0111_Single;
		featureWithSerialization0111_Single = newFeatureWithSerialization0111_Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0111_SINGLE, oldFeatureWithSerialization0111_Single, newFeatureWithSerialization0111_Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureWithSerialization0111_Single(Node newFeatureWithSerialization0111_Single) {
		if (newFeatureWithSerialization0111_Single != featureWithSerialization0111_Single) {
			NotificationChain msgs = null;
			if (featureWithSerialization0111_Single != null)
				msgs = ((InternalEObject)featureWithSerialization0111_Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0111_SINGLE, null, msgs);
			if (newFeatureWithSerialization0111_Single != null)
				msgs = ((InternalEObject)newFeatureWithSerialization0111_Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0111_SINGLE, null, msgs);
			msgs = basicSetFeatureWithSerialization0111_Single(newFeatureWithSerialization0111_Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0111_SINGLE, newFeatureWithSerialization0111_Single, newFeatureWithSerialization0111_Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFeatureWithSerialization1000_Single() {
		return featureWithSerialization1000_Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureWithSerialization1000_Single(Node newFeatureWithSerialization1000_Single, NotificationChain msgs) {
		Node oldFeatureWithSerialization1000_Single = featureWithSerialization1000_Single;
		featureWithSerialization1000_Single = newFeatureWithSerialization1000_Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1000_SINGLE, oldFeatureWithSerialization1000_Single, newFeatureWithSerialization1000_Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureWithSerialization1000_Single(Node newFeatureWithSerialization1000_Single) {
		if (newFeatureWithSerialization1000_Single != featureWithSerialization1000_Single) {
			NotificationChain msgs = null;
			if (featureWithSerialization1000_Single != null)
				msgs = ((InternalEObject)featureWithSerialization1000_Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1000_SINGLE, null, msgs);
			if (newFeatureWithSerialization1000_Single != null)
				msgs = ((InternalEObject)newFeatureWithSerialization1000_Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1000_SINGLE, null, msgs);
			msgs = basicSetFeatureWithSerialization1000_Single(newFeatureWithSerialization1000_Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1000_SINGLE, newFeatureWithSerialization1000_Single, newFeatureWithSerialization1000_Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFeatureWithSerialization1001_Single() {
		return featureWithSerialization1001_Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureWithSerialization1001_Single(Node newFeatureWithSerialization1001_Single, NotificationChain msgs) {
		Node oldFeatureWithSerialization1001_Single = featureWithSerialization1001_Single;
		featureWithSerialization1001_Single = newFeatureWithSerialization1001_Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1001_SINGLE, oldFeatureWithSerialization1001_Single, newFeatureWithSerialization1001_Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureWithSerialization1001_Single(Node newFeatureWithSerialization1001_Single) {
		if (newFeatureWithSerialization1001_Single != featureWithSerialization1001_Single) {
			NotificationChain msgs = null;
			if (featureWithSerialization1001_Single != null)
				msgs = ((InternalEObject)featureWithSerialization1001_Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1001_SINGLE, null, msgs);
			if (newFeatureWithSerialization1001_Single != null)
				msgs = ((InternalEObject)newFeatureWithSerialization1001_Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1001_SINGLE, null, msgs);
			msgs = basicSetFeatureWithSerialization1001_Single(newFeatureWithSerialization1001_Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1001_SINGLE, newFeatureWithSerialization1001_Single, newFeatureWithSerialization1001_Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFeatureWithSerialization1010_Single() {
		return featureWithSerialization1010_Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureWithSerialization1010_Single(Node newFeatureWithSerialization1010_Single, NotificationChain msgs) {
		Node oldFeatureWithSerialization1010_Single = featureWithSerialization1010_Single;
		featureWithSerialization1010_Single = newFeatureWithSerialization1010_Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1010_SINGLE, oldFeatureWithSerialization1010_Single, newFeatureWithSerialization1010_Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureWithSerialization1010_Single(Node newFeatureWithSerialization1010_Single) {
		if (newFeatureWithSerialization1010_Single != featureWithSerialization1010_Single) {
			NotificationChain msgs = null;
			if (featureWithSerialization1010_Single != null)
				msgs = ((InternalEObject)featureWithSerialization1010_Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1010_SINGLE, null, msgs);
			if (newFeatureWithSerialization1010_Single != null)
				msgs = ((InternalEObject)newFeatureWithSerialization1010_Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1010_SINGLE, null, msgs);
			msgs = basicSetFeatureWithSerialization1010_Single(newFeatureWithSerialization1010_Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1010_SINGLE, newFeatureWithSerialization1010_Single, newFeatureWithSerialization1010_Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFeatureWithSerialization1011_Single() {
		return featureWithSerialization1011_Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureWithSerialization1011_Single(Node newFeatureWithSerialization1011_Single, NotificationChain msgs) {
		Node oldFeatureWithSerialization1011_Single = featureWithSerialization1011_Single;
		featureWithSerialization1011_Single = newFeatureWithSerialization1011_Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1011_SINGLE, oldFeatureWithSerialization1011_Single, newFeatureWithSerialization1011_Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureWithSerialization1011_Single(Node newFeatureWithSerialization1011_Single) {
		if (newFeatureWithSerialization1011_Single != featureWithSerialization1011_Single) {
			NotificationChain msgs = null;
			if (featureWithSerialization1011_Single != null)
				msgs = ((InternalEObject)featureWithSerialization1011_Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1011_SINGLE, null, msgs);
			if (newFeatureWithSerialization1011_Single != null)
				msgs = ((InternalEObject)newFeatureWithSerialization1011_Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1011_SINGLE, null, msgs);
			msgs = basicSetFeatureWithSerialization1011_Single(newFeatureWithSerialization1011_Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1011_SINGLE, newFeatureWithSerialization1011_Single, newFeatureWithSerialization1011_Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFeatureWithSerialization1100_Single() {
		return featureWithSerialization1100_Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureWithSerialization1100_Single(Node newFeatureWithSerialization1100_Single, NotificationChain msgs) {
		Node oldFeatureWithSerialization1100_Single = featureWithSerialization1100_Single;
		featureWithSerialization1100_Single = newFeatureWithSerialization1100_Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1100_SINGLE, oldFeatureWithSerialization1100_Single, newFeatureWithSerialization1100_Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureWithSerialization1100_Single(Node newFeatureWithSerialization1100_Single) {
		if (newFeatureWithSerialization1100_Single != featureWithSerialization1100_Single) {
			NotificationChain msgs = null;
			if (featureWithSerialization1100_Single != null)
				msgs = ((InternalEObject)featureWithSerialization1100_Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1100_SINGLE, null, msgs);
			if (newFeatureWithSerialization1100_Single != null)
				msgs = ((InternalEObject)newFeatureWithSerialization1100_Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1100_SINGLE, null, msgs);
			msgs = basicSetFeatureWithSerialization1100_Single(newFeatureWithSerialization1100_Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1100_SINGLE, newFeatureWithSerialization1100_Single, newFeatureWithSerialization1100_Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFeatureWithSerialization1101_Single() {
		return featureWithSerialization1101_Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureWithSerialization1101_Single(Node newFeatureWithSerialization1101_Single, NotificationChain msgs) {
		Node oldFeatureWithSerialization1101_Single = featureWithSerialization1101_Single;
		featureWithSerialization1101_Single = newFeatureWithSerialization1101_Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1101_SINGLE, oldFeatureWithSerialization1101_Single, newFeatureWithSerialization1101_Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureWithSerialization1101_Single(Node newFeatureWithSerialization1101_Single) {
		if (newFeatureWithSerialization1101_Single != featureWithSerialization1101_Single) {
			NotificationChain msgs = null;
			if (featureWithSerialization1101_Single != null)
				msgs = ((InternalEObject)featureWithSerialization1101_Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1101_SINGLE, null, msgs);
			if (newFeatureWithSerialization1101_Single != null)
				msgs = ((InternalEObject)newFeatureWithSerialization1101_Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1101_SINGLE, null, msgs);
			msgs = basicSetFeatureWithSerialization1101_Single(newFeatureWithSerialization1101_Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1101_SINGLE, newFeatureWithSerialization1101_Single, newFeatureWithSerialization1101_Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFeatureWithSerialization1110_Single() {
		return featureWithSerialization1110_Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureWithSerialization1110_Single(Node newFeatureWithSerialization1110_Single, NotificationChain msgs) {
		Node oldFeatureWithSerialization1110_Single = featureWithSerialization1110_Single;
		featureWithSerialization1110_Single = newFeatureWithSerialization1110_Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1110_SINGLE, oldFeatureWithSerialization1110_Single, newFeatureWithSerialization1110_Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureWithSerialization1110_Single(Node newFeatureWithSerialization1110_Single) {
		if (newFeatureWithSerialization1110_Single != featureWithSerialization1110_Single) {
			NotificationChain msgs = null;
			if (featureWithSerialization1110_Single != null)
				msgs = ((InternalEObject)featureWithSerialization1110_Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1110_SINGLE, null, msgs);
			if (newFeatureWithSerialization1110_Single != null)
				msgs = ((InternalEObject)newFeatureWithSerialization1110_Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1110_SINGLE, null, msgs);
			msgs = basicSetFeatureWithSerialization1110_Single(newFeatureWithSerialization1110_Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1110_SINGLE, newFeatureWithSerialization1110_Single, newFeatureWithSerialization1110_Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFeatureWithSerialization1111_Single() {
		return featureWithSerialization1111_Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureWithSerialization1111_Single(Node newFeatureWithSerialization1111_Single, NotificationChain msgs) {
		Node oldFeatureWithSerialization1111_Single = featureWithSerialization1111_Single;
		featureWithSerialization1111_Single = newFeatureWithSerialization1111_Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1111_SINGLE, oldFeatureWithSerialization1111_Single, newFeatureWithSerialization1111_Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureWithSerialization1111_Single(Node newFeatureWithSerialization1111_Single) {
		if (newFeatureWithSerialization1111_Single != featureWithSerialization1111_Single) {
			NotificationChain msgs = null;
			if (featureWithSerialization1111_Single != null)
				msgs = ((InternalEObject)featureWithSerialization1111_Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1111_SINGLE, null, msgs);
			if (newFeatureWithSerialization1111_Single != null)
				msgs = ((InternalEObject)newFeatureWithSerialization1111_Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1111_SINGLE, null, msgs);
			msgs = basicSetFeatureWithSerialization1111_Single(newFeatureWithSerialization1111_Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1111_SINGLE, newFeatureWithSerialization1111_Single, newFeatureWithSerialization1111_Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFeatureEmptyAnnotation_Single() {
		return featureEmptyAnnotation_Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureEmptyAnnotation_Single(Node newFeatureEmptyAnnotation_Single, NotificationChain msgs) {
		Node oldFeatureEmptyAnnotation_Single = featureEmptyAnnotation_Single;
		featureEmptyAnnotation_Single = newFeatureEmptyAnnotation_Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_EMPTY_ANNOTATION_SINGLE, oldFeatureEmptyAnnotation_Single, newFeatureEmptyAnnotation_Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureEmptyAnnotation_Single(Node newFeatureEmptyAnnotation_Single) {
		if (newFeatureEmptyAnnotation_Single != featureEmptyAnnotation_Single) {
			NotificationChain msgs = null;
			if (featureEmptyAnnotation_Single != null)
				msgs = ((InternalEObject)featureEmptyAnnotation_Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_EMPTY_ANNOTATION_SINGLE, null, msgs);
			if (newFeatureEmptyAnnotation_Single != null)
				msgs = ((InternalEObject)newFeatureEmptyAnnotation_Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_EMPTY_ANNOTATION_SINGLE, null, msgs);
			msgs = basicSetFeatureEmptyAnnotation_Single(newFeatureEmptyAnnotation_Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_EMPTY_ANNOTATION_SINGLE, newFeatureEmptyAnnotation_Single, newFeatureEmptyAnnotation_Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getFeatureNoAnnotation_Single() {
		return featureNoAnnotation_Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureNoAnnotation_Single(Node newFeatureNoAnnotation_Single, NotificationChain msgs) {
		Node oldFeatureNoAnnotation_Single = featureNoAnnotation_Single;
		featureNoAnnotation_Single = newFeatureNoAnnotation_Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_NO_ANNOTATION_SINGLE, oldFeatureNoAnnotation_Single, newFeatureNoAnnotation_Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureNoAnnotation_Single(Node newFeatureNoAnnotation_Single) {
		if (newFeatureNoAnnotation_Single != featureNoAnnotation_Single) {
			NotificationChain msgs = null;
			if (featureNoAnnotation_Single != null)
				msgs = ((InternalEObject)featureNoAnnotation_Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_NO_ANNOTATION_SINGLE, null, msgs);
			if (newFeatureNoAnnotation_Single != null)
				msgs = ((InternalEObject)newFeatureNoAnnotation_Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__FEATURE_NO_ANNOTATION_SINGLE, null, msgs);
			msgs = basicSetFeatureNoAnnotation_Single(newFeatureNoAnnotation_Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__FEATURE_NO_ANNOTATION_SINGLE, newFeatureNoAnnotation_Single, newFeatureNoAnnotation_Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getFeatureWithSerialization0000_Multi() {
		if (featureWithSerialization0000_Multi == null) {
			featureWithSerialization0000_Multi = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0000_MULTI);
		}
		return featureWithSerialization0000_Multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getFeatureWithSerialization0001_Multi() {
		if (featureWithSerialization0001_Multi == null) {
			featureWithSerialization0001_Multi = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0001_MULTI);
		}
		return featureWithSerialization0001_Multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getFeatureWithSerialization0010_Multi() {
		if (featureWithSerialization0010_Multi == null) {
			featureWithSerialization0010_Multi = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0010_MULTI);
		}
		return featureWithSerialization0010_Multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getFeatureWithSerialization0011_Multi() {
		if (featureWithSerialization0011_Multi == null) {
			featureWithSerialization0011_Multi = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0011_MULTI);
		}
		return featureWithSerialization0011_Multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getFeatureWithSerialization0100_Multi() {
		if (featureWithSerialization0100_Multi == null) {
			featureWithSerialization0100_Multi = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0100_MULTI);
		}
		return featureWithSerialization0100_Multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getFeatureWithSerialization0101_Multi() {
		if (featureWithSerialization0101_Multi == null) {
			featureWithSerialization0101_Multi = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0101_MULTI);
		}
		return featureWithSerialization0101_Multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getFeatureWithSerialization0110_Multi() {
		if (featureWithSerialization0110_Multi == null) {
			featureWithSerialization0110_Multi = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0110_MULTI);
		}
		return featureWithSerialization0110_Multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getFeatureWithSerialization0111_Multi() {
		if (featureWithSerialization0111_Multi == null) {
			featureWithSerialization0111_Multi = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0111_MULTI);
		}
		return featureWithSerialization0111_Multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getFeatureWithSerialization1000_Multi() {
		if (featureWithSerialization1000_Multi == null) {
			featureWithSerialization1000_Multi = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1000_MULTI);
		}
		return featureWithSerialization1000_Multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getFeatureWithSerialization1001_Multi() {
		if (featureWithSerialization1001_Multi == null) {
			featureWithSerialization1001_Multi = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1001_MULTI);
		}
		return featureWithSerialization1001_Multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getFeatureWithSerialization1010_Multi() {
		if (featureWithSerialization1010_Multi == null) {
			featureWithSerialization1010_Multi = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1010_MULTI);
		}
		return featureWithSerialization1010_Multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getFeatureWithSerialization1011_Multi() {
		if (featureWithSerialization1011_Multi == null) {
			featureWithSerialization1011_Multi = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1011_MULTI);
		}
		return featureWithSerialization1011_Multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getFeatureWithSerialization1100_Multi() {
		if (featureWithSerialization1100_Multi == null) {
			featureWithSerialization1100_Multi = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1100_MULTI);
		}
		return featureWithSerialization1100_Multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getFeatureWithSerialization1101_Multi() {
		if (featureWithSerialization1101_Multi == null) {
			featureWithSerialization1101_Multi = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1101_MULTI);
		}
		return featureWithSerialization1101_Multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getFeatureWithSerialization1110_Multi() {
		if (featureWithSerialization1110_Multi == null) {
			featureWithSerialization1110_Multi = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1110_MULTI);
		}
		return featureWithSerialization1110_Multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getFeatureWithSerialization1111_Multi() {
		if (featureWithSerialization1111_Multi == null) {
			featureWithSerialization1111_Multi = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1111_MULTI);
		}
		return featureWithSerialization1111_Multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getFeatureEmptyAnnotation_Multi() {
		if (featureEmptyAnnotation_Multi == null) {
			featureEmptyAnnotation_Multi = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__FEATURE_EMPTY_ANNOTATION_MULTI);
		}
		return featureEmptyAnnotation_Multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getFeatureNoAnnotation_Multi() {
		if (featureNoAnnotation_Multi == null) {
			featureNoAnnotation_Multi = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__FEATURE_NO_ANNOTATION_MULTI);
		}
		return featureNoAnnotation_Multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getFeatureWithTypeEObjectAndSerialization0001_Multi() {
		if (featureWithTypeEObjectAndSerialization0001_Multi == null) {
			featureWithTypeEObjectAndSerialization0001_Multi = new EObjectContainmentEList<EObject>(EObject.class, this, NodesPackage.NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0001_MULTI);
		}
		return featureWithTypeEObjectAndSerialization0001_Multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getFeatureWithTypeEObjectAndSerialization0010_Multi() {
		if (featureWithTypeEObjectAndSerialization0010_Multi == null) {
			featureWithTypeEObjectAndSerialization0010_Multi = new EObjectContainmentEList<EObject>(EObject.class, this, NodesPackage.NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0010_MULTI);
		}
		return featureWithTypeEObjectAndSerialization0010_Multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getFeatureWithTypeEObjectAndSerialization0100_Multi() {
		if (featureWithTypeEObjectAndSerialization0100_Multi == null) {
			featureWithTypeEObjectAndSerialization0100_Multi = new EObjectContainmentEList<EObject>(EObject.class, this, NodesPackage.NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0100_MULTI);
		}
		return featureWithTypeEObjectAndSerialization0100_Multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getFeatureWithTypeEObjectAndSerialization1000_Multi() {
		if (featureWithTypeEObjectAndSerialization1000_Multi == null) {
			featureWithTypeEObjectAndSerialization1000_Multi = new EObjectContainmentEList<EObject>(EObject.class, this, NodesPackage.NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION1000_MULTI);
		}
		return featureWithTypeEObjectAndSerialization1000_Multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0000_SINGLE:
				return basicSetFeatureWithSerialization0000_Single(null, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0001_SINGLE:
				return basicSetFeatureWithSerialization0001_Single(null, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0010_SINGLE:
				return basicSetFeatureWithSerialization0010_Single(null, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0011_SINGLE:
				return basicSetFeatureWithSerialization0011_Single(null, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0100_SINGLE:
				return basicSetFeatureWithSerialization0100_Single(null, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0101_SINGLE:
				return basicSetFeatureWithSerialization0101_Single(null, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0110_SINGLE:
				return basicSetFeatureWithSerialization0110_Single(null, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0111_SINGLE:
				return basicSetFeatureWithSerialization0111_Single(null, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1000_SINGLE:
				return basicSetFeatureWithSerialization1000_Single(null, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1001_SINGLE:
				return basicSetFeatureWithSerialization1001_Single(null, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1010_SINGLE:
				return basicSetFeatureWithSerialization1010_Single(null, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1011_SINGLE:
				return basicSetFeatureWithSerialization1011_Single(null, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1100_SINGLE:
				return basicSetFeatureWithSerialization1100_Single(null, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1101_SINGLE:
				return basicSetFeatureWithSerialization1101_Single(null, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1110_SINGLE:
				return basicSetFeatureWithSerialization1110_Single(null, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1111_SINGLE:
				return basicSetFeatureWithSerialization1111_Single(null, msgs);
			case NodesPackage.NODE__FEATURE_EMPTY_ANNOTATION_SINGLE:
				return basicSetFeatureEmptyAnnotation_Single(null, msgs);
			case NodesPackage.NODE__FEATURE_NO_ANNOTATION_SINGLE:
				return basicSetFeatureNoAnnotation_Single(null, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0000_MULTI:
				return ((InternalEList<?>)getFeatureWithSerialization0000_Multi()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0001_MULTI:
				return ((InternalEList<?>)getFeatureWithSerialization0001_Multi()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0010_MULTI:
				return ((InternalEList<?>)getFeatureWithSerialization0010_Multi()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0011_MULTI:
				return ((InternalEList<?>)getFeatureWithSerialization0011_Multi()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0100_MULTI:
				return ((InternalEList<?>)getFeatureWithSerialization0100_Multi()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0101_MULTI:
				return ((InternalEList<?>)getFeatureWithSerialization0101_Multi()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0110_MULTI:
				return ((InternalEList<?>)getFeatureWithSerialization0110_Multi()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0111_MULTI:
				return ((InternalEList<?>)getFeatureWithSerialization0111_Multi()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1000_MULTI:
				return ((InternalEList<?>)getFeatureWithSerialization1000_Multi()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1001_MULTI:
				return ((InternalEList<?>)getFeatureWithSerialization1001_Multi()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1010_MULTI:
				return ((InternalEList<?>)getFeatureWithSerialization1010_Multi()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1011_MULTI:
				return ((InternalEList<?>)getFeatureWithSerialization1011_Multi()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1100_MULTI:
				return ((InternalEList<?>)getFeatureWithSerialization1100_Multi()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1101_MULTI:
				return ((InternalEList<?>)getFeatureWithSerialization1101_Multi()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1110_MULTI:
				return ((InternalEList<?>)getFeatureWithSerialization1110_Multi()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1111_MULTI:
				return ((InternalEList<?>)getFeatureWithSerialization1111_Multi()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__FEATURE_EMPTY_ANNOTATION_MULTI:
				return ((InternalEList<?>)getFeatureEmptyAnnotation_Multi()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__FEATURE_NO_ANNOTATION_MULTI:
				return ((InternalEList<?>)getFeatureNoAnnotation_Multi()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0001_MULTI:
				return ((InternalEList<?>)getFeatureWithTypeEObjectAndSerialization0001_Multi()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0010_MULTI:
				return ((InternalEList<?>)getFeatureWithTypeEObjectAndSerialization0010_Multi()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0100_MULTI:
				return ((InternalEList<?>)getFeatureWithTypeEObjectAndSerialization0100_Multi()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION1000_MULTI:
				return ((InternalEList<?>)getFeatureWithTypeEObjectAndSerialization1000_Multi()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0000_SINGLE:
				return getFeatureWithSerialization0000_Single();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0001_SINGLE:
				return getFeatureWithSerialization0001_Single();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0010_SINGLE:
				return getFeatureWithSerialization0010_Single();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0011_SINGLE:
				return getFeatureWithSerialization0011_Single();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0100_SINGLE:
				return getFeatureWithSerialization0100_Single();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0101_SINGLE:
				return getFeatureWithSerialization0101_Single();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0110_SINGLE:
				return getFeatureWithSerialization0110_Single();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0111_SINGLE:
				return getFeatureWithSerialization0111_Single();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1000_SINGLE:
				return getFeatureWithSerialization1000_Single();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1001_SINGLE:
				return getFeatureWithSerialization1001_Single();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1010_SINGLE:
				return getFeatureWithSerialization1010_Single();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1011_SINGLE:
				return getFeatureWithSerialization1011_Single();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1100_SINGLE:
				return getFeatureWithSerialization1100_Single();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1101_SINGLE:
				return getFeatureWithSerialization1101_Single();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1110_SINGLE:
				return getFeatureWithSerialization1110_Single();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1111_SINGLE:
				return getFeatureWithSerialization1111_Single();
			case NodesPackage.NODE__FEATURE_EMPTY_ANNOTATION_SINGLE:
				return getFeatureEmptyAnnotation_Single();
			case NodesPackage.NODE__FEATURE_NO_ANNOTATION_SINGLE:
				return getFeatureNoAnnotation_Single();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0000_MULTI:
				return getFeatureWithSerialization0000_Multi();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0001_MULTI:
				return getFeatureWithSerialization0001_Multi();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0010_MULTI:
				return getFeatureWithSerialization0010_Multi();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0011_MULTI:
				return getFeatureWithSerialization0011_Multi();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0100_MULTI:
				return getFeatureWithSerialization0100_Multi();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0101_MULTI:
				return getFeatureWithSerialization0101_Multi();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0110_MULTI:
				return getFeatureWithSerialization0110_Multi();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0111_MULTI:
				return getFeatureWithSerialization0111_Multi();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1000_MULTI:
				return getFeatureWithSerialization1000_Multi();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1001_MULTI:
				return getFeatureWithSerialization1001_Multi();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1010_MULTI:
				return getFeatureWithSerialization1010_Multi();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1011_MULTI:
				return getFeatureWithSerialization1011_Multi();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1100_MULTI:
				return getFeatureWithSerialization1100_Multi();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1101_MULTI:
				return getFeatureWithSerialization1101_Multi();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1110_MULTI:
				return getFeatureWithSerialization1110_Multi();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1111_MULTI:
				return getFeatureWithSerialization1111_Multi();
			case NodesPackage.NODE__FEATURE_EMPTY_ANNOTATION_MULTI:
				return getFeatureEmptyAnnotation_Multi();
			case NodesPackage.NODE__FEATURE_NO_ANNOTATION_MULTI:
				return getFeatureNoAnnotation_Multi();
			case NodesPackage.NODE__NAME:
				return getName();
			case NodesPackage.NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0001_MULTI:
				return getFeatureWithTypeEObjectAndSerialization0001_Multi();
			case NodesPackage.NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0010_MULTI:
				return getFeatureWithTypeEObjectAndSerialization0010_Multi();
			case NodesPackage.NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0100_MULTI:
				return getFeatureWithTypeEObjectAndSerialization0100_Multi();
			case NodesPackage.NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION1000_MULTI:
				return getFeatureWithTypeEObjectAndSerialization1000_Multi();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0000_SINGLE:
				setFeatureWithSerialization0000_Single((Node)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0001_SINGLE:
				setFeatureWithSerialization0001_Single((Node)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0010_SINGLE:
				setFeatureWithSerialization0010_Single((Node)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0011_SINGLE:
				setFeatureWithSerialization0011_Single((Node)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0100_SINGLE:
				setFeatureWithSerialization0100_Single((Node)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0101_SINGLE:
				setFeatureWithSerialization0101_Single((Node)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0110_SINGLE:
				setFeatureWithSerialization0110_Single((Node)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0111_SINGLE:
				setFeatureWithSerialization0111_Single((Node)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1000_SINGLE:
				setFeatureWithSerialization1000_Single((Node)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1001_SINGLE:
				setFeatureWithSerialization1001_Single((Node)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1010_SINGLE:
				setFeatureWithSerialization1010_Single((Node)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1011_SINGLE:
				setFeatureWithSerialization1011_Single((Node)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1100_SINGLE:
				setFeatureWithSerialization1100_Single((Node)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1101_SINGLE:
				setFeatureWithSerialization1101_Single((Node)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1110_SINGLE:
				setFeatureWithSerialization1110_Single((Node)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1111_SINGLE:
				setFeatureWithSerialization1111_Single((Node)newValue);
				return;
			case NodesPackage.NODE__FEATURE_EMPTY_ANNOTATION_SINGLE:
				setFeatureEmptyAnnotation_Single((Node)newValue);
				return;
			case NodesPackage.NODE__FEATURE_NO_ANNOTATION_SINGLE:
				setFeatureNoAnnotation_Single((Node)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0000_MULTI:
				getFeatureWithSerialization0000_Multi().clear();
				getFeatureWithSerialization0000_Multi().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0001_MULTI:
				getFeatureWithSerialization0001_Multi().clear();
				getFeatureWithSerialization0001_Multi().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0010_MULTI:
				getFeatureWithSerialization0010_Multi().clear();
				getFeatureWithSerialization0010_Multi().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0011_MULTI:
				getFeatureWithSerialization0011_Multi().clear();
				getFeatureWithSerialization0011_Multi().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0100_MULTI:
				getFeatureWithSerialization0100_Multi().clear();
				getFeatureWithSerialization0100_Multi().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0101_MULTI:
				getFeatureWithSerialization0101_Multi().clear();
				getFeatureWithSerialization0101_Multi().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0110_MULTI:
				getFeatureWithSerialization0110_Multi().clear();
				getFeatureWithSerialization0110_Multi().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0111_MULTI:
				getFeatureWithSerialization0111_Multi().clear();
				getFeatureWithSerialization0111_Multi().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1000_MULTI:
				getFeatureWithSerialization1000_Multi().clear();
				getFeatureWithSerialization1000_Multi().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1001_MULTI:
				getFeatureWithSerialization1001_Multi().clear();
				getFeatureWithSerialization1001_Multi().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1010_MULTI:
				getFeatureWithSerialization1010_Multi().clear();
				getFeatureWithSerialization1010_Multi().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1011_MULTI:
				getFeatureWithSerialization1011_Multi().clear();
				getFeatureWithSerialization1011_Multi().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1100_MULTI:
				getFeatureWithSerialization1100_Multi().clear();
				getFeatureWithSerialization1100_Multi().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1101_MULTI:
				getFeatureWithSerialization1101_Multi().clear();
				getFeatureWithSerialization1101_Multi().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1110_MULTI:
				getFeatureWithSerialization1110_Multi().clear();
				getFeatureWithSerialization1110_Multi().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1111_MULTI:
				getFeatureWithSerialization1111_Multi().clear();
				getFeatureWithSerialization1111_Multi().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__FEATURE_EMPTY_ANNOTATION_MULTI:
				getFeatureEmptyAnnotation_Multi().clear();
				getFeatureEmptyAnnotation_Multi().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__FEATURE_NO_ANNOTATION_MULTI:
				getFeatureNoAnnotation_Multi().clear();
				getFeatureNoAnnotation_Multi().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0001_MULTI:
				getFeatureWithTypeEObjectAndSerialization0001_Multi().clear();
				getFeatureWithTypeEObjectAndSerialization0001_Multi().addAll((Collection<? extends EObject>)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0010_MULTI:
				getFeatureWithTypeEObjectAndSerialization0010_Multi().clear();
				getFeatureWithTypeEObjectAndSerialization0010_Multi().addAll((Collection<? extends EObject>)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0100_MULTI:
				getFeatureWithTypeEObjectAndSerialization0100_Multi().clear();
				getFeatureWithTypeEObjectAndSerialization0100_Multi().addAll((Collection<? extends EObject>)newValue);
				return;
			case NodesPackage.NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION1000_MULTI:
				getFeatureWithTypeEObjectAndSerialization1000_Multi().clear();
				getFeatureWithTypeEObjectAndSerialization1000_Multi().addAll((Collection<? extends EObject>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0000_SINGLE:
				setFeatureWithSerialization0000_Single((Node)null);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0001_SINGLE:
				setFeatureWithSerialization0001_Single((Node)null);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0010_SINGLE:
				setFeatureWithSerialization0010_Single((Node)null);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0011_SINGLE:
				setFeatureWithSerialization0011_Single((Node)null);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0100_SINGLE:
				setFeatureWithSerialization0100_Single((Node)null);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0101_SINGLE:
				setFeatureWithSerialization0101_Single((Node)null);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0110_SINGLE:
				setFeatureWithSerialization0110_Single((Node)null);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0111_SINGLE:
				setFeatureWithSerialization0111_Single((Node)null);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1000_SINGLE:
				setFeatureWithSerialization1000_Single((Node)null);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1001_SINGLE:
				setFeatureWithSerialization1001_Single((Node)null);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1010_SINGLE:
				setFeatureWithSerialization1010_Single((Node)null);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1011_SINGLE:
				setFeatureWithSerialization1011_Single((Node)null);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1100_SINGLE:
				setFeatureWithSerialization1100_Single((Node)null);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1101_SINGLE:
				setFeatureWithSerialization1101_Single((Node)null);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1110_SINGLE:
				setFeatureWithSerialization1110_Single((Node)null);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1111_SINGLE:
				setFeatureWithSerialization1111_Single((Node)null);
				return;
			case NodesPackage.NODE__FEATURE_EMPTY_ANNOTATION_SINGLE:
				setFeatureEmptyAnnotation_Single((Node)null);
				return;
			case NodesPackage.NODE__FEATURE_NO_ANNOTATION_SINGLE:
				setFeatureNoAnnotation_Single((Node)null);
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0000_MULTI:
				getFeatureWithSerialization0000_Multi().clear();
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0001_MULTI:
				getFeatureWithSerialization0001_Multi().clear();
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0010_MULTI:
				getFeatureWithSerialization0010_Multi().clear();
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0011_MULTI:
				getFeatureWithSerialization0011_Multi().clear();
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0100_MULTI:
				getFeatureWithSerialization0100_Multi().clear();
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0101_MULTI:
				getFeatureWithSerialization0101_Multi().clear();
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0110_MULTI:
				getFeatureWithSerialization0110_Multi().clear();
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0111_MULTI:
				getFeatureWithSerialization0111_Multi().clear();
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1000_MULTI:
				getFeatureWithSerialization1000_Multi().clear();
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1001_MULTI:
				getFeatureWithSerialization1001_Multi().clear();
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1010_MULTI:
				getFeatureWithSerialization1010_Multi().clear();
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1011_MULTI:
				getFeatureWithSerialization1011_Multi().clear();
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1100_MULTI:
				getFeatureWithSerialization1100_Multi().clear();
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1101_MULTI:
				getFeatureWithSerialization1101_Multi().clear();
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1110_MULTI:
				getFeatureWithSerialization1110_Multi().clear();
				return;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1111_MULTI:
				getFeatureWithSerialization1111_Multi().clear();
				return;
			case NodesPackage.NODE__FEATURE_EMPTY_ANNOTATION_MULTI:
				getFeatureEmptyAnnotation_Multi().clear();
				return;
			case NodesPackage.NODE__FEATURE_NO_ANNOTATION_MULTI:
				getFeatureNoAnnotation_Multi().clear();
				return;
			case NodesPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NodesPackage.NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0001_MULTI:
				getFeatureWithTypeEObjectAndSerialization0001_Multi().clear();
				return;
			case NodesPackage.NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0010_MULTI:
				getFeatureWithTypeEObjectAndSerialization0010_Multi().clear();
				return;
			case NodesPackage.NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0100_MULTI:
				getFeatureWithTypeEObjectAndSerialization0100_Multi().clear();
				return;
			case NodesPackage.NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION1000_MULTI:
				getFeatureWithTypeEObjectAndSerialization1000_Multi().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0000_SINGLE:
				return featureWithSerialization0000_Single != null;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0001_SINGLE:
				return featureWithSerialization0001_Single != null;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0010_SINGLE:
				return featureWithSerialization0010_Single != null;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0011_SINGLE:
				return featureWithSerialization0011_Single != null;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0100_SINGLE:
				return featureWithSerialization0100_Single != null;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0101_SINGLE:
				return featureWithSerialization0101_Single != null;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0110_SINGLE:
				return featureWithSerialization0110_Single != null;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0111_SINGLE:
				return featureWithSerialization0111_Single != null;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1000_SINGLE:
				return featureWithSerialization1000_Single != null;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1001_SINGLE:
				return featureWithSerialization1001_Single != null;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1010_SINGLE:
				return featureWithSerialization1010_Single != null;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1011_SINGLE:
				return featureWithSerialization1011_Single != null;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1100_SINGLE:
				return featureWithSerialization1100_Single != null;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1101_SINGLE:
				return featureWithSerialization1101_Single != null;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1110_SINGLE:
				return featureWithSerialization1110_Single != null;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1111_SINGLE:
				return featureWithSerialization1111_Single != null;
			case NodesPackage.NODE__FEATURE_EMPTY_ANNOTATION_SINGLE:
				return featureEmptyAnnotation_Single != null;
			case NodesPackage.NODE__FEATURE_NO_ANNOTATION_SINGLE:
				return featureNoAnnotation_Single != null;
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0000_MULTI:
				return featureWithSerialization0000_Multi != null && !featureWithSerialization0000_Multi.isEmpty();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0001_MULTI:
				return featureWithSerialization0001_Multi != null && !featureWithSerialization0001_Multi.isEmpty();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0010_MULTI:
				return featureWithSerialization0010_Multi != null && !featureWithSerialization0010_Multi.isEmpty();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0011_MULTI:
				return featureWithSerialization0011_Multi != null && !featureWithSerialization0011_Multi.isEmpty();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0100_MULTI:
				return featureWithSerialization0100_Multi != null && !featureWithSerialization0100_Multi.isEmpty();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0101_MULTI:
				return featureWithSerialization0101_Multi != null && !featureWithSerialization0101_Multi.isEmpty();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0110_MULTI:
				return featureWithSerialization0110_Multi != null && !featureWithSerialization0110_Multi.isEmpty();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION0111_MULTI:
				return featureWithSerialization0111_Multi != null && !featureWithSerialization0111_Multi.isEmpty();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1000_MULTI:
				return featureWithSerialization1000_Multi != null && !featureWithSerialization1000_Multi.isEmpty();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1001_MULTI:
				return featureWithSerialization1001_Multi != null && !featureWithSerialization1001_Multi.isEmpty();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1010_MULTI:
				return featureWithSerialization1010_Multi != null && !featureWithSerialization1010_Multi.isEmpty();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1011_MULTI:
				return featureWithSerialization1011_Multi != null && !featureWithSerialization1011_Multi.isEmpty();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1100_MULTI:
				return featureWithSerialization1100_Multi != null && !featureWithSerialization1100_Multi.isEmpty();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1101_MULTI:
				return featureWithSerialization1101_Multi != null && !featureWithSerialization1101_Multi.isEmpty();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1110_MULTI:
				return featureWithSerialization1110_Multi != null && !featureWithSerialization1110_Multi.isEmpty();
			case NodesPackage.NODE__FEATURE_WITH_SERIALIZATION1111_MULTI:
				return featureWithSerialization1111_Multi != null && !featureWithSerialization1111_Multi.isEmpty();
			case NodesPackage.NODE__FEATURE_EMPTY_ANNOTATION_MULTI:
				return featureEmptyAnnotation_Multi != null && !featureEmptyAnnotation_Multi.isEmpty();
			case NodesPackage.NODE__FEATURE_NO_ANNOTATION_MULTI:
				return featureNoAnnotation_Multi != null && !featureNoAnnotation_Multi.isEmpty();
			case NodesPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NodesPackage.NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0001_MULTI:
				return featureWithTypeEObjectAndSerialization0001_Multi != null && !featureWithTypeEObjectAndSerialization0001_Multi.isEmpty();
			case NodesPackage.NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0010_MULTI:
				return featureWithTypeEObjectAndSerialization0010_Multi != null && !featureWithTypeEObjectAndSerialization0010_Multi.isEmpty();
			case NodesPackage.NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION0100_MULTI:
				return featureWithTypeEObjectAndSerialization0100_Multi != null && !featureWithTypeEObjectAndSerialization0100_Multi.isEmpty();
			case NodesPackage.NODE__FEATURE_WITH_TYPE_EOBJECT_AND_SERIALIZATION1000_MULTI:
				return featureWithTypeEObjectAndSerialization1000_Multi != null && !featureWithTypeEObjectAndSerialization1000_Multi.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
