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
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained0000Single <em>EReference Contained0000 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained0001Single <em>EReference Contained0001 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained0010Single <em>EReference Contained0010 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained0011Single <em>EReference Contained0011 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained0100Single <em>EReference Contained0100 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained0101Single <em>EReference Contained0101 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained0110Single <em>EReference Contained0110 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained0111Single <em>EReference Contained0111 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained1000Single <em>EReference Contained1000 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained1001Single <em>EReference Contained1001 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained1010Single <em>EReference Contained1010 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained1011Single <em>EReference Contained1011 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained1100Single <em>EReference Contained1100 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained1101Single <em>EReference Contained1101 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained1110Single <em>EReference Contained1110 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained1111Single <em>EReference Contained1111 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_EmptyAnnotationSingle <em>EReference Empty Annotation Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_NoAnnotationSingle <em>EReference No Annotation Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained0000Many <em>EReference Contained0000 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained0001Many <em>EReference Contained0001 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained0010Many <em>EReference Contained0010 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained0011Many <em>EReference Contained0011 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained0100Many <em>EReference Contained0100 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained0101Many <em>EReference Contained0101 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained0110Many <em>EReference Contained0110 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained0111Many <em>EReference Contained0111 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained1000Many <em>EReference Contained1000 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained1001Many <em>EReference Contained1001 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained1010Many <em>EReference Contained1010 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained1011Many <em>EReference Contained1011 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained1100Many <em>EReference Contained1100 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained1101Many <em>EReference Contained1101 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained1110Many <em>EReference Contained1110 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Contained1111Many <em>EReference Contained1111 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_EmptyAnnotationMany <em>EReference Empty Annotation Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_NoAnnotationMany <em>EReference No Annotation Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_WithTypeEObject_Contained0001Many <em>EReference With Type EObject Contained0001 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_WithTypeEObject_Contained0010Many <em>EReference With Type EObject Contained0010 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_WithTypeEObject_Contained0100Many <em>EReference With Type EObject Contained0100 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_WithTypeEObject_Contained1000Many <em>EReference With Type EObject Contained1000 Many</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends AbstractNodeImpl implements Node {
	/**
	 * The cached value of the '{@link #getEReference_Contained0000Single() <em>EReference Contained0000 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained0000Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Contained0000Single;

	/**
	 * The cached value of the '{@link #getEReference_Contained0001Single() <em>EReference Contained0001 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained0001Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Contained0001Single;

	/**
	 * The cached value of the '{@link #getEReference_Contained0010Single() <em>EReference Contained0010 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained0010Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Contained0010Single;

	/**
	 * The cached value of the '{@link #getEReference_Contained0011Single() <em>EReference Contained0011 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained0011Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Contained0011Single;

	/**
	 * The cached value of the '{@link #getEReference_Contained0100Single() <em>EReference Contained0100 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained0100Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Contained0100Single;

	/**
	 * The cached value of the '{@link #getEReference_Contained0101Single() <em>EReference Contained0101 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained0101Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Contained0101Single;

	/**
	 * The cached value of the '{@link #getEReference_Contained0110Single() <em>EReference Contained0110 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained0110Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Contained0110Single;

	/**
	 * The cached value of the '{@link #getEReference_Contained0111Single() <em>EReference Contained0111 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained0111Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Contained0111Single;

	/**
	 * The cached value of the '{@link #getEReference_Contained1000Single() <em>EReference Contained1000 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained1000Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Contained1000Single;

	/**
	 * The cached value of the '{@link #getEReference_Contained1001Single() <em>EReference Contained1001 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained1001Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Contained1001Single;

	/**
	 * The cached value of the '{@link #getEReference_Contained1010Single() <em>EReference Contained1010 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained1010Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Contained1010Single;

	/**
	 * The cached value of the '{@link #getEReference_Contained1011Single() <em>EReference Contained1011 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained1011Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Contained1011Single;

	/**
	 * The cached value of the '{@link #getEReference_Contained1100Single() <em>EReference Contained1100 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained1100Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Contained1100Single;

	/**
	 * The cached value of the '{@link #getEReference_Contained1101Single() <em>EReference Contained1101 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained1101Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Contained1101Single;

	/**
	 * The cached value of the '{@link #getEReference_Contained1110Single() <em>EReference Contained1110 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained1110Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Contained1110Single;

	/**
	 * The cached value of the '{@link #getEReference_Contained1111Single() <em>EReference Contained1111 Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained1111Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Contained1111Single;

	/**
	 * The cached value of the '{@link #getEReference_EmptyAnnotationSingle() <em>EReference Empty Annotation Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_EmptyAnnotationSingle()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_EmptyAnnotationSingle;

	/**
	 * The cached value of the '{@link #getEReference_NoAnnotationSingle() <em>EReference No Annotation Single</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_NoAnnotationSingle()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_NoAnnotationSingle;

	/**
	 * The cached value of the '{@link #getEReference_Contained0000Many() <em>EReference Contained0000 Many</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained0000Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Contained0000Many;

	/**
	 * The cached value of the '{@link #getEReference_Contained0001Many() <em>EReference Contained0001 Many</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained0001Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Contained0001Many;

	/**
	 * The cached value of the '{@link #getEReference_Contained0010Many() <em>EReference Contained0010 Many</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained0010Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Contained0010Many;

	/**
	 * The cached value of the '{@link #getEReference_Contained0011Many() <em>EReference Contained0011 Many</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained0011Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Contained0011Many;

	/**
	 * The cached value of the '{@link #getEReference_Contained0100Many() <em>EReference Contained0100 Many</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained0100Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Contained0100Many;

	/**
	 * The cached value of the '{@link #getEReference_Contained0101Many() <em>EReference Contained0101 Many</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained0101Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Contained0101Many;

	/**
	 * The cached value of the '{@link #getEReference_Contained0110Many() <em>EReference Contained0110 Many</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained0110Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Contained0110Many;

	/**
	 * The cached value of the '{@link #getEReference_Contained0111Many() <em>EReference Contained0111 Many</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained0111Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Contained0111Many;

	/**
	 * The cached value of the '{@link #getEReference_Contained1000Many() <em>EReference Contained1000 Many</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained1000Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Contained1000Many;

	/**
	 * The cached value of the '{@link #getEReference_Contained1001Many() <em>EReference Contained1001 Many</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained1001Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Contained1001Many;

	/**
	 * The cached value of the '{@link #getEReference_Contained1010Many() <em>EReference Contained1010 Many</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained1010Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Contained1010Many;

	/**
	 * The cached value of the '{@link #getEReference_Contained1011Many() <em>EReference Contained1011 Many</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained1011Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Contained1011Many;

	/**
	 * The cached value of the '{@link #getEReference_Contained1100Many() <em>EReference Contained1100 Many</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained1100Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Contained1100Many;

	/**
	 * The cached value of the '{@link #getEReference_Contained1101Many() <em>EReference Contained1101 Many</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained1101Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Contained1101Many;

	/**
	 * The cached value of the '{@link #getEReference_Contained1110Many() <em>EReference Contained1110 Many</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained1110Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Contained1110Many;

	/**
	 * The cached value of the '{@link #getEReference_Contained1111Many() <em>EReference Contained1111 Many</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Contained1111Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Contained1111Many;

	/**
	 * The cached value of the '{@link #getEReference_EmptyAnnotationMany() <em>EReference Empty Annotation Many</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_EmptyAnnotationMany()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_EmptyAnnotationMany;

	/**
	 * The cached value of the '{@link #getEReference_NoAnnotationMany() <em>EReference No Annotation Many</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_NoAnnotationMany()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_NoAnnotationMany;

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
	 * The cached value of the '{@link #getEReference_WithTypeEObject_Contained0001Many() <em>EReference With Type EObject Contained0001 Many</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_WithTypeEObject_Contained0001Many()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> eReference_WithTypeEObject_Contained0001Many;

	/**
	 * The cached value of the '{@link #getEReference_WithTypeEObject_Contained0010Many() <em>EReference With Type EObject Contained0010 Many</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_WithTypeEObject_Contained0010Many()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> eReference_WithTypeEObject_Contained0010Many;

	/**
	 * The cached value of the '{@link #getEReference_WithTypeEObject_Contained0100Many() <em>EReference With Type EObject Contained0100 Many</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_WithTypeEObject_Contained0100Many()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> eReference_WithTypeEObject_Contained0100Many;

	/**
	 * The cached value of the '{@link #getEReference_WithTypeEObject_Contained1000Many() <em>EReference With Type EObject Contained1000 Many</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_WithTypeEObject_Contained1000Many()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> eReference_WithTypeEObject_Contained1000Many;

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
	public Node getEReference_Contained0000Single() {
		return eReference_Contained0000Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEReference_Contained0000Single(Node newEReference_Contained0000Single, NotificationChain msgs) {
		Node oldEReference_Contained0000Single = eReference_Contained0000Single;
		eReference_Contained0000Single = newEReference_Contained0000Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0000_SINGLE, oldEReference_Contained0000Single, newEReference_Contained0000Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Contained0000Single(Node newEReference_Contained0000Single) {
		if (newEReference_Contained0000Single != eReference_Contained0000Single) {
			NotificationChain msgs = null;
			if (eReference_Contained0000Single != null)
				msgs = ((InternalEObject)eReference_Contained0000Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED0000_SINGLE, null, msgs);
			if (newEReference_Contained0000Single != null)
				msgs = ((InternalEObject)newEReference_Contained0000Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED0000_SINGLE, null, msgs);
			msgs = basicSetEReference_Contained0000Single(newEReference_Contained0000Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0000_SINGLE, newEReference_Contained0000Single, newEReference_Contained0000Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Contained0001Single() {
		return eReference_Contained0001Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEReference_Contained0001Single(Node newEReference_Contained0001Single, NotificationChain msgs) {
		Node oldEReference_Contained0001Single = eReference_Contained0001Single;
		eReference_Contained0001Single = newEReference_Contained0001Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0001_SINGLE, oldEReference_Contained0001Single, newEReference_Contained0001Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Contained0001Single(Node newEReference_Contained0001Single) {
		if (newEReference_Contained0001Single != eReference_Contained0001Single) {
			NotificationChain msgs = null;
			if (eReference_Contained0001Single != null)
				msgs = ((InternalEObject)eReference_Contained0001Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED0001_SINGLE, null, msgs);
			if (newEReference_Contained0001Single != null)
				msgs = ((InternalEObject)newEReference_Contained0001Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED0001_SINGLE, null, msgs);
			msgs = basicSetEReference_Contained0001Single(newEReference_Contained0001Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0001_SINGLE, newEReference_Contained0001Single, newEReference_Contained0001Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Contained0010Single() {
		return eReference_Contained0010Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEReference_Contained0010Single(Node newEReference_Contained0010Single, NotificationChain msgs) {
		Node oldEReference_Contained0010Single = eReference_Contained0010Single;
		eReference_Contained0010Single = newEReference_Contained0010Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0010_SINGLE, oldEReference_Contained0010Single, newEReference_Contained0010Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Contained0010Single(Node newEReference_Contained0010Single) {
		if (newEReference_Contained0010Single != eReference_Contained0010Single) {
			NotificationChain msgs = null;
			if (eReference_Contained0010Single != null)
				msgs = ((InternalEObject)eReference_Contained0010Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED0010_SINGLE, null, msgs);
			if (newEReference_Contained0010Single != null)
				msgs = ((InternalEObject)newEReference_Contained0010Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED0010_SINGLE, null, msgs);
			msgs = basicSetEReference_Contained0010Single(newEReference_Contained0010Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0010_SINGLE, newEReference_Contained0010Single, newEReference_Contained0010Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Contained0011Single() {
		return eReference_Contained0011Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEReference_Contained0011Single(Node newEReference_Contained0011Single, NotificationChain msgs) {
		Node oldEReference_Contained0011Single = eReference_Contained0011Single;
		eReference_Contained0011Single = newEReference_Contained0011Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0011_SINGLE, oldEReference_Contained0011Single, newEReference_Contained0011Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Contained0011Single(Node newEReference_Contained0011Single) {
		if (newEReference_Contained0011Single != eReference_Contained0011Single) {
			NotificationChain msgs = null;
			if (eReference_Contained0011Single != null)
				msgs = ((InternalEObject)eReference_Contained0011Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED0011_SINGLE, null, msgs);
			if (newEReference_Contained0011Single != null)
				msgs = ((InternalEObject)newEReference_Contained0011Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED0011_SINGLE, null, msgs);
			msgs = basicSetEReference_Contained0011Single(newEReference_Contained0011Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0011_SINGLE, newEReference_Contained0011Single, newEReference_Contained0011Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Contained0100Single() {
		return eReference_Contained0100Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEReference_Contained0100Single(Node newEReference_Contained0100Single, NotificationChain msgs) {
		Node oldEReference_Contained0100Single = eReference_Contained0100Single;
		eReference_Contained0100Single = newEReference_Contained0100Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0100_SINGLE, oldEReference_Contained0100Single, newEReference_Contained0100Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Contained0100Single(Node newEReference_Contained0100Single) {
		if (newEReference_Contained0100Single != eReference_Contained0100Single) {
			NotificationChain msgs = null;
			if (eReference_Contained0100Single != null)
				msgs = ((InternalEObject)eReference_Contained0100Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED0100_SINGLE, null, msgs);
			if (newEReference_Contained0100Single != null)
				msgs = ((InternalEObject)newEReference_Contained0100Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED0100_SINGLE, null, msgs);
			msgs = basicSetEReference_Contained0100Single(newEReference_Contained0100Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0100_SINGLE, newEReference_Contained0100Single, newEReference_Contained0100Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Contained0101Single() {
		return eReference_Contained0101Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEReference_Contained0101Single(Node newEReference_Contained0101Single, NotificationChain msgs) {
		Node oldEReference_Contained0101Single = eReference_Contained0101Single;
		eReference_Contained0101Single = newEReference_Contained0101Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0101_SINGLE, oldEReference_Contained0101Single, newEReference_Contained0101Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Contained0101Single(Node newEReference_Contained0101Single) {
		if (newEReference_Contained0101Single != eReference_Contained0101Single) {
			NotificationChain msgs = null;
			if (eReference_Contained0101Single != null)
				msgs = ((InternalEObject)eReference_Contained0101Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED0101_SINGLE, null, msgs);
			if (newEReference_Contained0101Single != null)
				msgs = ((InternalEObject)newEReference_Contained0101Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED0101_SINGLE, null, msgs);
			msgs = basicSetEReference_Contained0101Single(newEReference_Contained0101Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0101_SINGLE, newEReference_Contained0101Single, newEReference_Contained0101Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Contained0110Single() {
		return eReference_Contained0110Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEReference_Contained0110Single(Node newEReference_Contained0110Single, NotificationChain msgs) {
		Node oldEReference_Contained0110Single = eReference_Contained0110Single;
		eReference_Contained0110Single = newEReference_Contained0110Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0110_SINGLE, oldEReference_Contained0110Single, newEReference_Contained0110Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Contained0110Single(Node newEReference_Contained0110Single) {
		if (newEReference_Contained0110Single != eReference_Contained0110Single) {
			NotificationChain msgs = null;
			if (eReference_Contained0110Single != null)
				msgs = ((InternalEObject)eReference_Contained0110Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED0110_SINGLE, null, msgs);
			if (newEReference_Contained0110Single != null)
				msgs = ((InternalEObject)newEReference_Contained0110Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED0110_SINGLE, null, msgs);
			msgs = basicSetEReference_Contained0110Single(newEReference_Contained0110Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0110_SINGLE, newEReference_Contained0110Single, newEReference_Contained0110Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Contained0111Single() {
		return eReference_Contained0111Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEReference_Contained0111Single(Node newEReference_Contained0111Single, NotificationChain msgs) {
		Node oldEReference_Contained0111Single = eReference_Contained0111Single;
		eReference_Contained0111Single = newEReference_Contained0111Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0111_SINGLE, oldEReference_Contained0111Single, newEReference_Contained0111Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Contained0111Single(Node newEReference_Contained0111Single) {
		if (newEReference_Contained0111Single != eReference_Contained0111Single) {
			NotificationChain msgs = null;
			if (eReference_Contained0111Single != null)
				msgs = ((InternalEObject)eReference_Contained0111Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED0111_SINGLE, null, msgs);
			if (newEReference_Contained0111Single != null)
				msgs = ((InternalEObject)newEReference_Contained0111Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED0111_SINGLE, null, msgs);
			msgs = basicSetEReference_Contained0111Single(newEReference_Contained0111Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0111_SINGLE, newEReference_Contained0111Single, newEReference_Contained0111Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Contained1000Single() {
		return eReference_Contained1000Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEReference_Contained1000Single(Node newEReference_Contained1000Single, NotificationChain msgs) {
		Node oldEReference_Contained1000Single = eReference_Contained1000Single;
		eReference_Contained1000Single = newEReference_Contained1000Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1000_SINGLE, oldEReference_Contained1000Single, newEReference_Contained1000Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Contained1000Single(Node newEReference_Contained1000Single) {
		if (newEReference_Contained1000Single != eReference_Contained1000Single) {
			NotificationChain msgs = null;
			if (eReference_Contained1000Single != null)
				msgs = ((InternalEObject)eReference_Contained1000Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED1000_SINGLE, null, msgs);
			if (newEReference_Contained1000Single != null)
				msgs = ((InternalEObject)newEReference_Contained1000Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED1000_SINGLE, null, msgs);
			msgs = basicSetEReference_Contained1000Single(newEReference_Contained1000Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1000_SINGLE, newEReference_Contained1000Single, newEReference_Contained1000Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Contained1001Single() {
		return eReference_Contained1001Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEReference_Contained1001Single(Node newEReference_Contained1001Single, NotificationChain msgs) {
		Node oldEReference_Contained1001Single = eReference_Contained1001Single;
		eReference_Contained1001Single = newEReference_Contained1001Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1001_SINGLE, oldEReference_Contained1001Single, newEReference_Contained1001Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Contained1001Single(Node newEReference_Contained1001Single) {
		if (newEReference_Contained1001Single != eReference_Contained1001Single) {
			NotificationChain msgs = null;
			if (eReference_Contained1001Single != null)
				msgs = ((InternalEObject)eReference_Contained1001Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED1001_SINGLE, null, msgs);
			if (newEReference_Contained1001Single != null)
				msgs = ((InternalEObject)newEReference_Contained1001Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED1001_SINGLE, null, msgs);
			msgs = basicSetEReference_Contained1001Single(newEReference_Contained1001Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1001_SINGLE, newEReference_Contained1001Single, newEReference_Contained1001Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Contained1010Single() {
		return eReference_Contained1010Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEReference_Contained1010Single(Node newEReference_Contained1010Single, NotificationChain msgs) {
		Node oldEReference_Contained1010Single = eReference_Contained1010Single;
		eReference_Contained1010Single = newEReference_Contained1010Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1010_SINGLE, oldEReference_Contained1010Single, newEReference_Contained1010Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Contained1010Single(Node newEReference_Contained1010Single) {
		if (newEReference_Contained1010Single != eReference_Contained1010Single) {
			NotificationChain msgs = null;
			if (eReference_Contained1010Single != null)
				msgs = ((InternalEObject)eReference_Contained1010Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED1010_SINGLE, null, msgs);
			if (newEReference_Contained1010Single != null)
				msgs = ((InternalEObject)newEReference_Contained1010Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED1010_SINGLE, null, msgs);
			msgs = basicSetEReference_Contained1010Single(newEReference_Contained1010Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1010_SINGLE, newEReference_Contained1010Single, newEReference_Contained1010Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Contained1011Single() {
		return eReference_Contained1011Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEReference_Contained1011Single(Node newEReference_Contained1011Single, NotificationChain msgs) {
		Node oldEReference_Contained1011Single = eReference_Contained1011Single;
		eReference_Contained1011Single = newEReference_Contained1011Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1011_SINGLE, oldEReference_Contained1011Single, newEReference_Contained1011Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Contained1011Single(Node newEReference_Contained1011Single) {
		if (newEReference_Contained1011Single != eReference_Contained1011Single) {
			NotificationChain msgs = null;
			if (eReference_Contained1011Single != null)
				msgs = ((InternalEObject)eReference_Contained1011Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED1011_SINGLE, null, msgs);
			if (newEReference_Contained1011Single != null)
				msgs = ((InternalEObject)newEReference_Contained1011Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED1011_SINGLE, null, msgs);
			msgs = basicSetEReference_Contained1011Single(newEReference_Contained1011Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1011_SINGLE, newEReference_Contained1011Single, newEReference_Contained1011Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Contained1100Single() {
		return eReference_Contained1100Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEReference_Contained1100Single(Node newEReference_Contained1100Single, NotificationChain msgs) {
		Node oldEReference_Contained1100Single = eReference_Contained1100Single;
		eReference_Contained1100Single = newEReference_Contained1100Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1100_SINGLE, oldEReference_Contained1100Single, newEReference_Contained1100Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Contained1100Single(Node newEReference_Contained1100Single) {
		if (newEReference_Contained1100Single != eReference_Contained1100Single) {
			NotificationChain msgs = null;
			if (eReference_Contained1100Single != null)
				msgs = ((InternalEObject)eReference_Contained1100Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED1100_SINGLE, null, msgs);
			if (newEReference_Contained1100Single != null)
				msgs = ((InternalEObject)newEReference_Contained1100Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED1100_SINGLE, null, msgs);
			msgs = basicSetEReference_Contained1100Single(newEReference_Contained1100Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1100_SINGLE, newEReference_Contained1100Single, newEReference_Contained1100Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Contained1101Single() {
		return eReference_Contained1101Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEReference_Contained1101Single(Node newEReference_Contained1101Single, NotificationChain msgs) {
		Node oldEReference_Contained1101Single = eReference_Contained1101Single;
		eReference_Contained1101Single = newEReference_Contained1101Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1101_SINGLE, oldEReference_Contained1101Single, newEReference_Contained1101Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Contained1101Single(Node newEReference_Contained1101Single) {
		if (newEReference_Contained1101Single != eReference_Contained1101Single) {
			NotificationChain msgs = null;
			if (eReference_Contained1101Single != null)
				msgs = ((InternalEObject)eReference_Contained1101Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED1101_SINGLE, null, msgs);
			if (newEReference_Contained1101Single != null)
				msgs = ((InternalEObject)newEReference_Contained1101Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED1101_SINGLE, null, msgs);
			msgs = basicSetEReference_Contained1101Single(newEReference_Contained1101Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1101_SINGLE, newEReference_Contained1101Single, newEReference_Contained1101Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Contained1110Single() {
		return eReference_Contained1110Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEReference_Contained1110Single(Node newEReference_Contained1110Single, NotificationChain msgs) {
		Node oldEReference_Contained1110Single = eReference_Contained1110Single;
		eReference_Contained1110Single = newEReference_Contained1110Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1110_SINGLE, oldEReference_Contained1110Single, newEReference_Contained1110Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Contained1110Single(Node newEReference_Contained1110Single) {
		if (newEReference_Contained1110Single != eReference_Contained1110Single) {
			NotificationChain msgs = null;
			if (eReference_Contained1110Single != null)
				msgs = ((InternalEObject)eReference_Contained1110Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED1110_SINGLE, null, msgs);
			if (newEReference_Contained1110Single != null)
				msgs = ((InternalEObject)newEReference_Contained1110Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED1110_SINGLE, null, msgs);
			msgs = basicSetEReference_Contained1110Single(newEReference_Contained1110Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1110_SINGLE, newEReference_Contained1110Single, newEReference_Contained1110Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Contained1111Single() {
		return eReference_Contained1111Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEReference_Contained1111Single(Node newEReference_Contained1111Single, NotificationChain msgs) {
		Node oldEReference_Contained1111Single = eReference_Contained1111Single;
		eReference_Contained1111Single = newEReference_Contained1111Single;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1111_SINGLE, oldEReference_Contained1111Single, newEReference_Contained1111Single);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Contained1111Single(Node newEReference_Contained1111Single) {
		if (newEReference_Contained1111Single != eReference_Contained1111Single) {
			NotificationChain msgs = null;
			if (eReference_Contained1111Single != null)
				msgs = ((InternalEObject)eReference_Contained1111Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED1111_SINGLE, null, msgs);
			if (newEReference_Contained1111Single != null)
				msgs = ((InternalEObject)newEReference_Contained1111Single).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED1111_SINGLE, null, msgs);
			msgs = basicSetEReference_Contained1111Single(newEReference_Contained1111Single, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1111_SINGLE, newEReference_Contained1111Single, newEReference_Contained1111Single));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_EmptyAnnotationSingle() {
		return eReference_EmptyAnnotationSingle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEReference_EmptyAnnotationSingle(Node newEReference_EmptyAnnotationSingle, NotificationChain msgs) {
		Node oldEReference_EmptyAnnotationSingle = eReference_EmptyAnnotationSingle;
		eReference_EmptyAnnotationSingle = newEReference_EmptyAnnotationSingle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_EMPTY_ANNOTATION_SINGLE, oldEReference_EmptyAnnotationSingle, newEReference_EmptyAnnotationSingle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_EmptyAnnotationSingle(Node newEReference_EmptyAnnotationSingle) {
		if (newEReference_EmptyAnnotationSingle != eReference_EmptyAnnotationSingle) {
			NotificationChain msgs = null;
			if (eReference_EmptyAnnotationSingle != null)
				msgs = ((InternalEObject)eReference_EmptyAnnotationSingle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_EMPTY_ANNOTATION_SINGLE, null, msgs);
			if (newEReference_EmptyAnnotationSingle != null)
				msgs = ((InternalEObject)newEReference_EmptyAnnotationSingle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_EMPTY_ANNOTATION_SINGLE, null, msgs);
			msgs = basicSetEReference_EmptyAnnotationSingle(newEReference_EmptyAnnotationSingle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_EMPTY_ANNOTATION_SINGLE, newEReference_EmptyAnnotationSingle, newEReference_EmptyAnnotationSingle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_NoAnnotationSingle() {
		return eReference_NoAnnotationSingle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEReference_NoAnnotationSingle(Node newEReference_NoAnnotationSingle, NotificationChain msgs) {
		Node oldEReference_NoAnnotationSingle = eReference_NoAnnotationSingle;
		eReference_NoAnnotationSingle = newEReference_NoAnnotationSingle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_NO_ANNOTATION_SINGLE, oldEReference_NoAnnotationSingle, newEReference_NoAnnotationSingle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_NoAnnotationSingle(Node newEReference_NoAnnotationSingle) {
		if (newEReference_NoAnnotationSingle != eReference_NoAnnotationSingle) {
			NotificationChain msgs = null;
			if (eReference_NoAnnotationSingle != null)
				msgs = ((InternalEObject)eReference_NoAnnotationSingle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_NO_ANNOTATION_SINGLE, null, msgs);
			if (newEReference_NoAnnotationSingle != null)
				msgs = ((InternalEObject)newEReference_NoAnnotationSingle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_NO_ANNOTATION_SINGLE, null, msgs);
			msgs = basicSetEReference_NoAnnotationSingle(newEReference_NoAnnotationSingle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_NO_ANNOTATION_SINGLE, newEReference_NoAnnotationSingle, newEReference_NoAnnotationSingle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained0000Many() {
		if (eReference_Contained0000Many == null) {
			eReference_Contained0000Many = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED0000_MANY);
		}
		return eReference_Contained0000Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained0001Many() {
		if (eReference_Contained0001Many == null) {
			eReference_Contained0001Many = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED0001_MANY);
		}
		return eReference_Contained0001Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained0010Many() {
		if (eReference_Contained0010Many == null) {
			eReference_Contained0010Many = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED0010_MANY);
		}
		return eReference_Contained0010Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained0011Many() {
		if (eReference_Contained0011Many == null) {
			eReference_Contained0011Many = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED0011_MANY);
		}
		return eReference_Contained0011Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained0100Many() {
		if (eReference_Contained0100Many == null) {
			eReference_Contained0100Many = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED0100_MANY);
		}
		return eReference_Contained0100Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained0101Many() {
		if (eReference_Contained0101Many == null) {
			eReference_Contained0101Many = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED0101_MANY);
		}
		return eReference_Contained0101Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained0110Many() {
		if (eReference_Contained0110Many == null) {
			eReference_Contained0110Many = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED0110_MANY);
		}
		return eReference_Contained0110Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained0111Many() {
		if (eReference_Contained0111Many == null) {
			eReference_Contained0111Many = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED0111_MANY);
		}
		return eReference_Contained0111Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained1000Many() {
		if (eReference_Contained1000Many == null) {
			eReference_Contained1000Many = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED1000_MANY);
		}
		return eReference_Contained1000Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained1001Many() {
		if (eReference_Contained1001Many == null) {
			eReference_Contained1001Many = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED1001_MANY);
		}
		return eReference_Contained1001Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained1010Many() {
		if (eReference_Contained1010Many == null) {
			eReference_Contained1010Many = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED1010_MANY);
		}
		return eReference_Contained1010Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained1011Many() {
		if (eReference_Contained1011Many == null) {
			eReference_Contained1011Many = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED1011_MANY);
		}
		return eReference_Contained1011Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained1100Many() {
		if (eReference_Contained1100Many == null) {
			eReference_Contained1100Many = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED1100_MANY);
		}
		return eReference_Contained1100Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained1101Many() {
		if (eReference_Contained1101Many == null) {
			eReference_Contained1101Many = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED1101_MANY);
		}
		return eReference_Contained1101Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained1110Many() {
		if (eReference_Contained1110Many == null) {
			eReference_Contained1110Many = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED1110_MANY);
		}
		return eReference_Contained1110Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained1111Many() {
		if (eReference_Contained1111Many == null) {
			eReference_Contained1111Many = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED1111_MANY);
		}
		return eReference_Contained1111Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_EmptyAnnotationMany() {
		if (eReference_EmptyAnnotationMany == null) {
			eReference_EmptyAnnotationMany = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_EMPTY_ANNOTATION_MANY);
		}
		return eReference_EmptyAnnotationMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_NoAnnotationMany() {
		if (eReference_NoAnnotationMany == null) {
			eReference_NoAnnotationMany = new EObjectContainmentEList<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_NO_ANNOTATION_MANY);
		}
		return eReference_NoAnnotationMany;
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
	public EList<EObject> getEReference_WithTypeEObject_Contained0001Many() {
		if (eReference_WithTypeEObject_Contained0001Many == null) {
			eReference_WithTypeEObject_Contained0001Many = new EObjectContainmentEList<EObject>(EObject.class, this, NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0001_MANY);
		}
		return eReference_WithTypeEObject_Contained0001Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getEReference_WithTypeEObject_Contained0010Many() {
		if (eReference_WithTypeEObject_Contained0010Many == null) {
			eReference_WithTypeEObject_Contained0010Many = new EObjectContainmentEList<EObject>(EObject.class, this, NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0010_MANY);
		}
		return eReference_WithTypeEObject_Contained0010Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getEReference_WithTypeEObject_Contained0100Many() {
		if (eReference_WithTypeEObject_Contained0100Many == null) {
			eReference_WithTypeEObject_Contained0100Many = new EObjectContainmentEList<EObject>(EObject.class, this, NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0100_MANY);
		}
		return eReference_WithTypeEObject_Contained0100Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getEReference_WithTypeEObject_Contained1000Many() {
		if (eReference_WithTypeEObject_Contained1000Many == null) {
			eReference_WithTypeEObject_Contained1000Many = new EObjectContainmentEList<EObject>(EObject.class, this, NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED1000_MANY);
		}
		return eReference_WithTypeEObject_Contained1000Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NodesPackage.NODE__EREFERENCE_CONTAINED0000_SINGLE:
				return basicSetEReference_Contained0000Single(null, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED0001_SINGLE:
				return basicSetEReference_Contained0001Single(null, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED0010_SINGLE:
				return basicSetEReference_Contained0010Single(null, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED0011_SINGLE:
				return basicSetEReference_Contained0011Single(null, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED0100_SINGLE:
				return basicSetEReference_Contained0100Single(null, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED0101_SINGLE:
				return basicSetEReference_Contained0101Single(null, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED0110_SINGLE:
				return basicSetEReference_Contained0110Single(null, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED0111_SINGLE:
				return basicSetEReference_Contained0111Single(null, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED1000_SINGLE:
				return basicSetEReference_Contained1000Single(null, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED1001_SINGLE:
				return basicSetEReference_Contained1001Single(null, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED1010_SINGLE:
				return basicSetEReference_Contained1010Single(null, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED1011_SINGLE:
				return basicSetEReference_Contained1011Single(null, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED1100_SINGLE:
				return basicSetEReference_Contained1100Single(null, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED1101_SINGLE:
				return basicSetEReference_Contained1101Single(null, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED1110_SINGLE:
				return basicSetEReference_Contained1110Single(null, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED1111_SINGLE:
				return basicSetEReference_Contained1111Single(null, msgs);
			case NodesPackage.NODE__EREFERENCE_EMPTY_ANNOTATION_SINGLE:
				return basicSetEReference_EmptyAnnotationSingle(null, msgs);
			case NodesPackage.NODE__EREFERENCE_NO_ANNOTATION_SINGLE:
				return basicSetEReference_NoAnnotationSingle(null, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED0000_MANY:
				return ((InternalEList<?>)getEReference_Contained0000Many()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED0001_MANY:
				return ((InternalEList<?>)getEReference_Contained0001Many()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED0010_MANY:
				return ((InternalEList<?>)getEReference_Contained0010Many()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED0011_MANY:
				return ((InternalEList<?>)getEReference_Contained0011Many()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED0100_MANY:
				return ((InternalEList<?>)getEReference_Contained0100Many()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED0101_MANY:
				return ((InternalEList<?>)getEReference_Contained0101Many()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED0110_MANY:
				return ((InternalEList<?>)getEReference_Contained0110Many()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED0111_MANY:
				return ((InternalEList<?>)getEReference_Contained0111Many()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED1000_MANY:
				return ((InternalEList<?>)getEReference_Contained1000Many()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED1001_MANY:
				return ((InternalEList<?>)getEReference_Contained1001Many()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED1010_MANY:
				return ((InternalEList<?>)getEReference_Contained1010Many()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED1011_MANY:
				return ((InternalEList<?>)getEReference_Contained1011Many()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED1100_MANY:
				return ((InternalEList<?>)getEReference_Contained1100Many()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED1101_MANY:
				return ((InternalEList<?>)getEReference_Contained1101Many()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED1110_MANY:
				return ((InternalEList<?>)getEReference_Contained1110Many()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED1111_MANY:
				return ((InternalEList<?>)getEReference_Contained1111Many()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__EREFERENCE_EMPTY_ANNOTATION_MANY:
				return ((InternalEList<?>)getEReference_EmptyAnnotationMany()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__EREFERENCE_NO_ANNOTATION_MANY:
				return ((InternalEList<?>)getEReference_NoAnnotationMany()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0001_MANY:
				return ((InternalEList<?>)getEReference_WithTypeEObject_Contained0001Many()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0010_MANY:
				return ((InternalEList<?>)getEReference_WithTypeEObject_Contained0010Many()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0100_MANY:
				return ((InternalEList<?>)getEReference_WithTypeEObject_Contained0100Many()).basicRemove(otherEnd, msgs);
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED1000_MANY:
				return ((InternalEList<?>)getEReference_WithTypeEObject_Contained1000Many()).basicRemove(otherEnd, msgs);
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
			case NodesPackage.NODE__EREFERENCE_CONTAINED0000_SINGLE:
				return getEReference_Contained0000Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0001_SINGLE:
				return getEReference_Contained0001Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0010_SINGLE:
				return getEReference_Contained0010Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0011_SINGLE:
				return getEReference_Contained0011Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0100_SINGLE:
				return getEReference_Contained0100Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0101_SINGLE:
				return getEReference_Contained0101Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0110_SINGLE:
				return getEReference_Contained0110Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0111_SINGLE:
				return getEReference_Contained0111Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1000_SINGLE:
				return getEReference_Contained1000Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1001_SINGLE:
				return getEReference_Contained1001Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1010_SINGLE:
				return getEReference_Contained1010Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1011_SINGLE:
				return getEReference_Contained1011Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1100_SINGLE:
				return getEReference_Contained1100Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1101_SINGLE:
				return getEReference_Contained1101Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1110_SINGLE:
				return getEReference_Contained1110Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1111_SINGLE:
				return getEReference_Contained1111Single();
			case NodesPackage.NODE__EREFERENCE_EMPTY_ANNOTATION_SINGLE:
				return getEReference_EmptyAnnotationSingle();
			case NodesPackage.NODE__EREFERENCE_NO_ANNOTATION_SINGLE:
				return getEReference_NoAnnotationSingle();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0000_MANY:
				return getEReference_Contained0000Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0001_MANY:
				return getEReference_Contained0001Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0010_MANY:
				return getEReference_Contained0010Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0011_MANY:
				return getEReference_Contained0011Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0100_MANY:
				return getEReference_Contained0100Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0101_MANY:
				return getEReference_Contained0101Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0110_MANY:
				return getEReference_Contained0110Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0111_MANY:
				return getEReference_Contained0111Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1000_MANY:
				return getEReference_Contained1000Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1001_MANY:
				return getEReference_Contained1001Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1010_MANY:
				return getEReference_Contained1010Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1011_MANY:
				return getEReference_Contained1011Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1100_MANY:
				return getEReference_Contained1100Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1101_MANY:
				return getEReference_Contained1101Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1110_MANY:
				return getEReference_Contained1110Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1111_MANY:
				return getEReference_Contained1111Many();
			case NodesPackage.NODE__EREFERENCE_EMPTY_ANNOTATION_MANY:
				return getEReference_EmptyAnnotationMany();
			case NodesPackage.NODE__EREFERENCE_NO_ANNOTATION_MANY:
				return getEReference_NoAnnotationMany();
			case NodesPackage.NODE__NAME:
				return getName();
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0001_MANY:
				return getEReference_WithTypeEObject_Contained0001Many();
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0010_MANY:
				return getEReference_WithTypeEObject_Contained0010Many();
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0100_MANY:
				return getEReference_WithTypeEObject_Contained0100Many();
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED1000_MANY:
				return getEReference_WithTypeEObject_Contained1000Many();
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
			case NodesPackage.NODE__EREFERENCE_CONTAINED0000_SINGLE:
				setEReference_Contained0000Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0001_SINGLE:
				setEReference_Contained0001Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0010_SINGLE:
				setEReference_Contained0010Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0011_SINGLE:
				setEReference_Contained0011Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0100_SINGLE:
				setEReference_Contained0100Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0101_SINGLE:
				setEReference_Contained0101Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0110_SINGLE:
				setEReference_Contained0110Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0111_SINGLE:
				setEReference_Contained0111Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1000_SINGLE:
				setEReference_Contained1000Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1001_SINGLE:
				setEReference_Contained1001Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1010_SINGLE:
				setEReference_Contained1010Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1011_SINGLE:
				setEReference_Contained1011Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1100_SINGLE:
				setEReference_Contained1100Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1101_SINGLE:
				setEReference_Contained1101Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1110_SINGLE:
				setEReference_Contained1110Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1111_SINGLE:
				setEReference_Contained1111Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_EMPTY_ANNOTATION_SINGLE:
				setEReference_EmptyAnnotationSingle((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_NO_ANNOTATION_SINGLE:
				setEReference_NoAnnotationSingle((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0000_MANY:
				getEReference_Contained0000Many().clear();
				getEReference_Contained0000Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0001_MANY:
				getEReference_Contained0001Many().clear();
				getEReference_Contained0001Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0010_MANY:
				getEReference_Contained0010Many().clear();
				getEReference_Contained0010Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0011_MANY:
				getEReference_Contained0011Many().clear();
				getEReference_Contained0011Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0100_MANY:
				getEReference_Contained0100Many().clear();
				getEReference_Contained0100Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0101_MANY:
				getEReference_Contained0101Many().clear();
				getEReference_Contained0101Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0110_MANY:
				getEReference_Contained0110Many().clear();
				getEReference_Contained0110Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0111_MANY:
				getEReference_Contained0111Many().clear();
				getEReference_Contained0111Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1000_MANY:
				getEReference_Contained1000Many().clear();
				getEReference_Contained1000Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1001_MANY:
				getEReference_Contained1001Many().clear();
				getEReference_Contained1001Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1010_MANY:
				getEReference_Contained1010Many().clear();
				getEReference_Contained1010Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1011_MANY:
				getEReference_Contained1011Many().clear();
				getEReference_Contained1011Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1100_MANY:
				getEReference_Contained1100Many().clear();
				getEReference_Contained1100Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1101_MANY:
				getEReference_Contained1101Many().clear();
				getEReference_Contained1101Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1110_MANY:
				getEReference_Contained1110Many().clear();
				getEReference_Contained1110Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1111_MANY:
				getEReference_Contained1111Many().clear();
				getEReference_Contained1111Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_EMPTY_ANNOTATION_MANY:
				getEReference_EmptyAnnotationMany().clear();
				getEReference_EmptyAnnotationMany().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_NO_ANNOTATION_MANY:
				getEReference_NoAnnotationMany().clear();
				getEReference_NoAnnotationMany().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0001_MANY:
				getEReference_WithTypeEObject_Contained0001Many().clear();
				getEReference_WithTypeEObject_Contained0001Many().addAll((Collection<? extends EObject>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0010_MANY:
				getEReference_WithTypeEObject_Contained0010Many().clear();
				getEReference_WithTypeEObject_Contained0010Many().addAll((Collection<? extends EObject>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0100_MANY:
				getEReference_WithTypeEObject_Contained0100Many().clear();
				getEReference_WithTypeEObject_Contained0100Many().addAll((Collection<? extends EObject>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED1000_MANY:
				getEReference_WithTypeEObject_Contained1000Many().clear();
				getEReference_WithTypeEObject_Contained1000Many().addAll((Collection<? extends EObject>)newValue);
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
			case NodesPackage.NODE__EREFERENCE_CONTAINED0000_SINGLE:
				setEReference_Contained0000Single((Node)null);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0001_SINGLE:
				setEReference_Contained0001Single((Node)null);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0010_SINGLE:
				setEReference_Contained0010Single((Node)null);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0011_SINGLE:
				setEReference_Contained0011Single((Node)null);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0100_SINGLE:
				setEReference_Contained0100Single((Node)null);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0101_SINGLE:
				setEReference_Contained0101Single((Node)null);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0110_SINGLE:
				setEReference_Contained0110Single((Node)null);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0111_SINGLE:
				setEReference_Contained0111Single((Node)null);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1000_SINGLE:
				setEReference_Contained1000Single((Node)null);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1001_SINGLE:
				setEReference_Contained1001Single((Node)null);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1010_SINGLE:
				setEReference_Contained1010Single((Node)null);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1011_SINGLE:
				setEReference_Contained1011Single((Node)null);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1100_SINGLE:
				setEReference_Contained1100Single((Node)null);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1101_SINGLE:
				setEReference_Contained1101Single((Node)null);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1110_SINGLE:
				setEReference_Contained1110Single((Node)null);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1111_SINGLE:
				setEReference_Contained1111Single((Node)null);
				return;
			case NodesPackage.NODE__EREFERENCE_EMPTY_ANNOTATION_SINGLE:
				setEReference_EmptyAnnotationSingle((Node)null);
				return;
			case NodesPackage.NODE__EREFERENCE_NO_ANNOTATION_SINGLE:
				setEReference_NoAnnotationSingle((Node)null);
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0000_MANY:
				getEReference_Contained0000Many().clear();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0001_MANY:
				getEReference_Contained0001Many().clear();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0010_MANY:
				getEReference_Contained0010Many().clear();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0011_MANY:
				getEReference_Contained0011Many().clear();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0100_MANY:
				getEReference_Contained0100Many().clear();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0101_MANY:
				getEReference_Contained0101Many().clear();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0110_MANY:
				getEReference_Contained0110Many().clear();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0111_MANY:
				getEReference_Contained0111Many().clear();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1000_MANY:
				getEReference_Contained1000Many().clear();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1001_MANY:
				getEReference_Contained1001Many().clear();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1010_MANY:
				getEReference_Contained1010Many().clear();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1011_MANY:
				getEReference_Contained1011Many().clear();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1100_MANY:
				getEReference_Contained1100Many().clear();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1101_MANY:
				getEReference_Contained1101Many().clear();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1110_MANY:
				getEReference_Contained1110Many().clear();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1111_MANY:
				getEReference_Contained1111Many().clear();
				return;
			case NodesPackage.NODE__EREFERENCE_EMPTY_ANNOTATION_MANY:
				getEReference_EmptyAnnotationMany().clear();
				return;
			case NodesPackage.NODE__EREFERENCE_NO_ANNOTATION_MANY:
				getEReference_NoAnnotationMany().clear();
				return;
			case NodesPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0001_MANY:
				getEReference_WithTypeEObject_Contained0001Many().clear();
				return;
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0010_MANY:
				getEReference_WithTypeEObject_Contained0010Many().clear();
				return;
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0100_MANY:
				getEReference_WithTypeEObject_Contained0100Many().clear();
				return;
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED1000_MANY:
				getEReference_WithTypeEObject_Contained1000Many().clear();
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
			case NodesPackage.NODE__EREFERENCE_CONTAINED0000_SINGLE:
				return eReference_Contained0000Single != null;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0001_SINGLE:
				return eReference_Contained0001Single != null;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0010_SINGLE:
				return eReference_Contained0010Single != null;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0011_SINGLE:
				return eReference_Contained0011Single != null;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0100_SINGLE:
				return eReference_Contained0100Single != null;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0101_SINGLE:
				return eReference_Contained0101Single != null;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0110_SINGLE:
				return eReference_Contained0110Single != null;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0111_SINGLE:
				return eReference_Contained0111Single != null;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1000_SINGLE:
				return eReference_Contained1000Single != null;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1001_SINGLE:
				return eReference_Contained1001Single != null;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1010_SINGLE:
				return eReference_Contained1010Single != null;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1011_SINGLE:
				return eReference_Contained1011Single != null;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1100_SINGLE:
				return eReference_Contained1100Single != null;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1101_SINGLE:
				return eReference_Contained1101Single != null;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1110_SINGLE:
				return eReference_Contained1110Single != null;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1111_SINGLE:
				return eReference_Contained1111Single != null;
			case NodesPackage.NODE__EREFERENCE_EMPTY_ANNOTATION_SINGLE:
				return eReference_EmptyAnnotationSingle != null;
			case NodesPackage.NODE__EREFERENCE_NO_ANNOTATION_SINGLE:
				return eReference_NoAnnotationSingle != null;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0000_MANY:
				return eReference_Contained0000Many != null && !eReference_Contained0000Many.isEmpty();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0001_MANY:
				return eReference_Contained0001Many != null && !eReference_Contained0001Many.isEmpty();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0010_MANY:
				return eReference_Contained0010Many != null && !eReference_Contained0010Many.isEmpty();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0011_MANY:
				return eReference_Contained0011Many != null && !eReference_Contained0011Many.isEmpty();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0100_MANY:
				return eReference_Contained0100Many != null && !eReference_Contained0100Many.isEmpty();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0101_MANY:
				return eReference_Contained0101Many != null && !eReference_Contained0101Many.isEmpty();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0110_MANY:
				return eReference_Contained0110Many != null && !eReference_Contained0110Many.isEmpty();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0111_MANY:
				return eReference_Contained0111Many != null && !eReference_Contained0111Many.isEmpty();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1000_MANY:
				return eReference_Contained1000Many != null && !eReference_Contained1000Many.isEmpty();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1001_MANY:
				return eReference_Contained1001Many != null && !eReference_Contained1001Many.isEmpty();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1010_MANY:
				return eReference_Contained1010Many != null && !eReference_Contained1010Many.isEmpty();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1011_MANY:
				return eReference_Contained1011Many != null && !eReference_Contained1011Many.isEmpty();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1100_MANY:
				return eReference_Contained1100Many != null && !eReference_Contained1100Many.isEmpty();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1101_MANY:
				return eReference_Contained1101Many != null && !eReference_Contained1101Many.isEmpty();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1110_MANY:
				return eReference_Contained1110Many != null && !eReference_Contained1110Many.isEmpty();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1111_MANY:
				return eReference_Contained1111Many != null && !eReference_Contained1111Many.isEmpty();
			case NodesPackage.NODE__EREFERENCE_EMPTY_ANNOTATION_MANY:
				return eReference_EmptyAnnotationMany != null && !eReference_EmptyAnnotationMany.isEmpty();
			case NodesPackage.NODE__EREFERENCE_NO_ANNOTATION_MANY:
				return eReference_NoAnnotationMany != null && !eReference_NoAnnotationMany.isEmpty();
			case NodesPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0001_MANY:
				return eReference_WithTypeEObject_Contained0001Many != null && !eReference_WithTypeEObject_Contained0001Many.isEmpty();
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0010_MANY:
				return eReference_WithTypeEObject_Contained0010Many != null && !eReference_WithTypeEObject_Contained0010Many.isEmpty();
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0100_MANY:
				return eReference_WithTypeEObject_Contained0100Many != null && !eReference_WithTypeEObject_Contained0100Many.isEmpty();
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED1000_MANY:
				return eReference_WithTypeEObject_Contained1000Many != null && !eReference_WithTypeEObject_Contained1000Many.isEmpty();
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
