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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced0000Single <em>EReference Referenced0000 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced0001Single <em>EReference Referenced0001 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced0010Single <em>EReference Referenced0010 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced0011Single <em>EReference Referenced0011 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced0100Single <em>EReference Referenced0100 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced0101Single <em>EReference Referenced0101 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced0110Single <em>EReference Referenced0110 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced0111Single <em>EReference Referenced0111 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced1000Single <em>EReference Referenced1000 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced1001Single <em>EReference Referenced1001 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced1010Single <em>EReference Referenced1010 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced1011Single <em>EReference Referenced1011 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced1100Single <em>EReference Referenced1100 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced1101Single <em>EReference Referenced1101 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced1110Single <em>EReference Referenced1110 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced1111Single <em>EReference Referenced1111 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced0000Many <em>EReference Referenced0000 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced0001Many <em>EReference Referenced0001 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced0010Many <em>EReference Referenced0010 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced0011Many <em>EReference Referenced0011 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced0100Many <em>EReference Referenced0100 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced0101Many <em>EReference Referenced0101 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced0110Many <em>EReference Referenced0110 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced0111Many <em>EReference Referenced0111 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced1000Many <em>EReference Referenced1000 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced1001Many <em>EReference Referenced1001 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced1010Many <em>EReference Referenced1010 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced1011Many <em>EReference Referenced1011 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced1100Many <em>EReference Referenced1100 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced1101Many <em>EReference Referenced1101 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced1110Many <em>EReference Referenced1110 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEReference_Referenced1111Many <em>EReference Referenced1111 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute0000Single <em>EAttribute Attribute0000 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute0001Single <em>EAttribute Attribute0001 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute0010Single <em>EAttribute Attribute0010 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute0011Single <em>EAttribute Attribute0011 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute0100Single <em>EAttribute Attribute0100 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute0101Single <em>EAttribute Attribute0101 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute0110Single <em>EAttribute Attribute0110 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute0111Single <em>EAttribute Attribute0111 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute1000Single <em>EAttribute Attribute1000 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute1001Single <em>EAttribute Attribute1001 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute1010Single <em>EAttribute Attribute1010 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute1011Single <em>EAttribute Attribute1011 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute1100Single <em>EAttribute Attribute1100 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute1101Single <em>EAttribute Attribute1101 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute1110Single <em>EAttribute Attribute1110 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute1111Single <em>EAttribute Attribute1111 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute0000Many <em>EAttribute Attribute0000 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute0001Many <em>EAttribute Attribute0001 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute0010Many <em>EAttribute Attribute0010 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute0011Many <em>EAttribute Attribute0011 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute0100Many <em>EAttribute Attribute0100 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute0101Many <em>EAttribute Attribute0101 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute0110Many <em>EAttribute Attribute0110 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute0111Many <em>EAttribute Attribute0111 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute1000Many <em>EAttribute Attribute1000 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute1001Many <em>EAttribute Attribute1001 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute1010Many <em>EAttribute Attribute1010 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute1011Many <em>EAttribute Attribute1011 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute1100Many <em>EAttribute Attribute1100 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute1101Many <em>EAttribute Attribute1101 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute1110Many <em>EAttribute Attribute1110 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getEAttribute_Attribute1111Many <em>EAttribute Attribute1111 Many</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getReqif_eReference_Referenced0101Single <em>Reqif eReference Referenced0101 Single</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.model.nodes.impl.NodeImpl#getReqif_eReference_Referenced1001Many <em>Reqif eReference Referenced1001 Many</em>}</li>
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
	 * This is true if the EReference Contained0000 Single containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Contained0000SingleESet;

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
	 * This is true if the EReference Contained0001 Single containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Contained0001SingleESet;

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
	 * This is true if the EReference Contained0010 Single containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Contained0010SingleESet;

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
	 * This is true if the EReference Contained0011 Single containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Contained0011SingleESet;

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
	 * This is true if the EReference Contained0100 Single containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Contained0100SingleESet;

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
	 * This is true if the EReference Contained0101 Single containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Contained0101SingleESet;

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
	 * This is true if the EReference Contained0110 Single containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Contained0110SingleESet;

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
	 * This is true if the EReference Contained0111 Single containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Contained0111SingleESet;

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
	 * This is true if the EReference Contained1000 Single containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Contained1000SingleESet;

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
	 * This is true if the EReference Contained1001 Single containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Contained1001SingleESet;

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
	 * This is true if the EReference Contained1010 Single containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Contained1010SingleESet;

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
	 * This is true if the EReference Contained1011 Single containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Contained1011SingleESet;

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
	 * This is true if the EReference Contained1100 Single containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Contained1100SingleESet;

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
	 * This is true if the EReference Contained1101 Single containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Contained1101SingleESet;

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
	 * This is true if the EReference Contained1110 Single containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Contained1110SingleESet;

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
	 * This is true if the EReference Contained1111 Single containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Contained1111SingleESet;

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
	 * This is true if the EReference Empty Annotation Single containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_EmptyAnnotationSingleESet;

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
	 * This is true if the EReference No Annotation Single containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_NoAnnotationSingleESet;

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
	 * This is true if the Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nameESet;

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
	 * The cached value of the '{@link #getEReference_Referenced0000Single() <em>EReference Referenced0000 Single</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced0000Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Referenced0000Single;

	/**
	 * This is true if the EReference Referenced0000 Single reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Referenced0000SingleESet;

	/**
	 * The cached value of the '{@link #getEReference_Referenced0001Single() <em>EReference Referenced0001 Single</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced0001Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Referenced0001Single;

	/**
	 * This is true if the EReference Referenced0001 Single reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Referenced0001SingleESet;

	/**
	 * The cached value of the '{@link #getEReference_Referenced0010Single() <em>EReference Referenced0010 Single</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced0010Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Referenced0010Single;

	/**
	 * This is true if the EReference Referenced0010 Single reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Referenced0010SingleESet;

	/**
	 * The cached value of the '{@link #getEReference_Referenced0011Single() <em>EReference Referenced0011 Single</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced0011Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Referenced0011Single;

	/**
	 * This is true if the EReference Referenced0011 Single reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Referenced0011SingleESet;

	/**
	 * The cached value of the '{@link #getEReference_Referenced0100Single() <em>EReference Referenced0100 Single</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced0100Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Referenced0100Single;

	/**
	 * This is true if the EReference Referenced0100 Single reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Referenced0100SingleESet;

	/**
	 * The cached value of the '{@link #getEReference_Referenced0101Single() <em>EReference Referenced0101 Single</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced0101Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Referenced0101Single;

	/**
	 * This is true if the EReference Referenced0101 Single reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Referenced0101SingleESet;

	/**
	 * The cached value of the '{@link #getEReference_Referenced0110Single() <em>EReference Referenced0110 Single</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced0110Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Referenced0110Single;

	/**
	 * This is true if the EReference Referenced0110 Single reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Referenced0110SingleESet;

	/**
	 * The cached value of the '{@link #getEReference_Referenced0111Single() <em>EReference Referenced0111 Single</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced0111Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Referenced0111Single;

	/**
	 * This is true if the EReference Referenced0111 Single reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Referenced0111SingleESet;

	/**
	 * The cached value of the '{@link #getEReference_Referenced1000Single() <em>EReference Referenced1000 Single</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced1000Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Referenced1000Single;

	/**
	 * This is true if the EReference Referenced1000 Single reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Referenced1000SingleESet;

	/**
	 * The cached value of the '{@link #getEReference_Referenced1001Single() <em>EReference Referenced1001 Single</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced1001Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Referenced1001Single;

	/**
	 * This is true if the EReference Referenced1001 Single reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Referenced1001SingleESet;

	/**
	 * The cached value of the '{@link #getEReference_Referenced1010Single() <em>EReference Referenced1010 Single</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced1010Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Referenced1010Single;

	/**
	 * This is true if the EReference Referenced1010 Single reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Referenced1010SingleESet;

	/**
	 * The cached value of the '{@link #getEReference_Referenced1011Single() <em>EReference Referenced1011 Single</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced1011Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Referenced1011Single;

	/**
	 * This is true if the EReference Referenced1011 Single reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Referenced1011SingleESet;

	/**
	 * The cached value of the '{@link #getEReference_Referenced1100Single() <em>EReference Referenced1100 Single</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced1100Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Referenced1100Single;

	/**
	 * This is true if the EReference Referenced1100 Single reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Referenced1100SingleESet;

	/**
	 * The cached value of the '{@link #getEReference_Referenced1101Single() <em>EReference Referenced1101 Single</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced1101Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Referenced1101Single;

	/**
	 * This is true if the EReference Referenced1101 Single reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Referenced1101SingleESet;

	/**
	 * The cached value of the '{@link #getEReference_Referenced1110Single() <em>EReference Referenced1110 Single</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced1110Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Referenced1110Single;

	/**
	 * This is true if the EReference Referenced1110 Single reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Referenced1110SingleESet;

	/**
	 * The cached value of the '{@link #getEReference_Referenced1111Single() <em>EReference Referenced1111 Single</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced1111Single()
	 * @generated
	 * @ordered
	 */
	protected Node eReference_Referenced1111Single;

	/**
	 * This is true if the EReference Referenced1111 Single reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eReference_Referenced1111SingleESet;

	/**
	 * The cached value of the '{@link #getEReference_Referenced0000Many() <em>EReference Referenced0000 Many</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced0000Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Referenced0000Many;

	/**
	 * The cached value of the '{@link #getEReference_Referenced0001Many() <em>EReference Referenced0001 Many</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced0001Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Referenced0001Many;

	/**
	 * The cached value of the '{@link #getEReference_Referenced0010Many() <em>EReference Referenced0010 Many</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced0010Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Referenced0010Many;

	/**
	 * The cached value of the '{@link #getEReference_Referenced0011Many() <em>EReference Referenced0011 Many</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced0011Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Referenced0011Many;

	/**
	 * The cached value of the '{@link #getEReference_Referenced0100Many() <em>EReference Referenced0100 Many</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced0100Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Referenced0100Many;

	/**
	 * The cached value of the '{@link #getEReference_Referenced0101Many() <em>EReference Referenced0101 Many</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced0101Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Referenced0101Many;

	/**
	 * The cached value of the '{@link #getEReference_Referenced0110Many() <em>EReference Referenced0110 Many</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced0110Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Referenced0110Many;

	/**
	 * The cached value of the '{@link #getEReference_Referenced0111Many() <em>EReference Referenced0111 Many</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced0111Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Referenced0111Many;

	/**
	 * The cached value of the '{@link #getEReference_Referenced1000Many() <em>EReference Referenced1000 Many</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced1000Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Referenced1000Many;

	/**
	 * The cached value of the '{@link #getEReference_Referenced1001Many() <em>EReference Referenced1001 Many</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced1001Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Referenced1001Many;

	/**
	 * The cached value of the '{@link #getEReference_Referenced1010Many() <em>EReference Referenced1010 Many</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced1010Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Referenced1010Many;

	/**
	 * The cached value of the '{@link #getEReference_Referenced1011Many() <em>EReference Referenced1011 Many</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced1011Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Referenced1011Many;

	/**
	 * The cached value of the '{@link #getEReference_Referenced1100Many() <em>EReference Referenced1100 Many</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced1100Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Referenced1100Many;

	/**
	 * The cached value of the '{@link #getEReference_Referenced1101Many() <em>EReference Referenced1101 Many</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced1101Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Referenced1101Many;

	/**
	 * The cached value of the '{@link #getEReference_Referenced1110Many() <em>EReference Referenced1110 Many</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced1110Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Referenced1110Many;

	/**
	 * The cached value of the '{@link #getEReference_Referenced1111Many() <em>EReference Referenced1111 Many</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference_Referenced1111Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> eReference_Referenced1111Many;

	/**
	 * The default value of the '{@link #getEAttribute_Attribute0000Single() <em>EAttribute Attribute0000 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute0000Single()
	 * @generated
	 * @ordered
	 */
	protected static final String EATTRIBUTE_ATTRIBUTE0000_SINGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute0000Single() <em>EAttribute Attribute0000 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute0000Single()
	 * @generated
	 * @ordered
	 */
	protected String eAttribute_Attribute0000Single = EATTRIBUTE_ATTRIBUTE0000_SINGLE_EDEFAULT;

	/**
	 * This is true if the EAttribute Attribute0000 Single attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eAttribute_Attribute0000SingleESet;

	/**
	 * The default value of the '{@link #getEAttribute_Attribute0001Single() <em>EAttribute Attribute0001 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute0001Single()
	 * @generated
	 * @ordered
	 */
	protected static final String EATTRIBUTE_ATTRIBUTE0001_SINGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute0001Single() <em>EAttribute Attribute0001 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute0001Single()
	 * @generated
	 * @ordered
	 */
	protected String eAttribute_Attribute0001Single = EATTRIBUTE_ATTRIBUTE0001_SINGLE_EDEFAULT;

	/**
	 * This is true if the EAttribute Attribute0001 Single attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eAttribute_Attribute0001SingleESet;

	/**
	 * The default value of the '{@link #getEAttribute_Attribute0010Single() <em>EAttribute Attribute0010 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute0010Single()
	 * @generated
	 * @ordered
	 */
	protected static final String EATTRIBUTE_ATTRIBUTE0010_SINGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute0010Single() <em>EAttribute Attribute0010 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute0010Single()
	 * @generated
	 * @ordered
	 */
	protected String eAttribute_Attribute0010Single = EATTRIBUTE_ATTRIBUTE0010_SINGLE_EDEFAULT;

	/**
	 * This is true if the EAttribute Attribute0010 Single attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eAttribute_Attribute0010SingleESet;

	/**
	 * The default value of the '{@link #getEAttribute_Attribute0011Single() <em>EAttribute Attribute0011 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute0011Single()
	 * @generated
	 * @ordered
	 */
	protected static final String EATTRIBUTE_ATTRIBUTE0011_SINGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute0011Single() <em>EAttribute Attribute0011 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute0011Single()
	 * @generated
	 * @ordered
	 */
	protected String eAttribute_Attribute0011Single = EATTRIBUTE_ATTRIBUTE0011_SINGLE_EDEFAULT;

	/**
	 * This is true if the EAttribute Attribute0011 Single attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eAttribute_Attribute0011SingleESet;

	/**
	 * The default value of the '{@link #getEAttribute_Attribute0100Single() <em>EAttribute Attribute0100 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute0100Single()
	 * @generated
	 * @ordered
	 */
	protected static final String EATTRIBUTE_ATTRIBUTE0100_SINGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute0100Single() <em>EAttribute Attribute0100 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute0100Single()
	 * @generated
	 * @ordered
	 */
	protected String eAttribute_Attribute0100Single = EATTRIBUTE_ATTRIBUTE0100_SINGLE_EDEFAULT;

	/**
	 * This is true if the EAttribute Attribute0100 Single attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eAttribute_Attribute0100SingleESet;

	/**
	 * The default value of the '{@link #getEAttribute_Attribute0101Single() <em>EAttribute Attribute0101 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute0101Single()
	 * @generated
	 * @ordered
	 */
	protected static final String EATTRIBUTE_ATTRIBUTE0101_SINGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute0101Single() <em>EAttribute Attribute0101 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute0101Single()
	 * @generated
	 * @ordered
	 */
	protected String eAttribute_Attribute0101Single = EATTRIBUTE_ATTRIBUTE0101_SINGLE_EDEFAULT;

	/**
	 * This is true if the EAttribute Attribute0101 Single attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eAttribute_Attribute0101SingleESet;

	/**
	 * The default value of the '{@link #getEAttribute_Attribute0110Single() <em>EAttribute Attribute0110 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute0110Single()
	 * @generated
	 * @ordered
	 */
	protected static final String EATTRIBUTE_ATTRIBUTE0110_SINGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute0110Single() <em>EAttribute Attribute0110 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute0110Single()
	 * @generated
	 * @ordered
	 */
	protected String eAttribute_Attribute0110Single = EATTRIBUTE_ATTRIBUTE0110_SINGLE_EDEFAULT;

	/**
	 * This is true if the EAttribute Attribute0110 Single attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eAttribute_Attribute0110SingleESet;

	/**
	 * The default value of the '{@link #getEAttribute_Attribute0111Single() <em>EAttribute Attribute0111 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute0111Single()
	 * @generated
	 * @ordered
	 */
	protected static final String EATTRIBUTE_ATTRIBUTE0111_SINGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute0111Single() <em>EAttribute Attribute0111 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute0111Single()
	 * @generated
	 * @ordered
	 */
	protected String eAttribute_Attribute0111Single = EATTRIBUTE_ATTRIBUTE0111_SINGLE_EDEFAULT;

	/**
	 * This is true if the EAttribute Attribute0111 Single attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eAttribute_Attribute0111SingleESet;

	/**
	 * The default value of the '{@link #getEAttribute_Attribute1000Single() <em>EAttribute Attribute1000 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute1000Single()
	 * @generated
	 * @ordered
	 */
	protected static final String EATTRIBUTE_ATTRIBUTE1000_SINGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute1000Single() <em>EAttribute Attribute1000 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute1000Single()
	 * @generated
	 * @ordered
	 */
	protected String eAttribute_Attribute1000Single = EATTRIBUTE_ATTRIBUTE1000_SINGLE_EDEFAULT;

	/**
	 * This is true if the EAttribute Attribute1000 Single attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eAttribute_Attribute1000SingleESet;

	/**
	 * The default value of the '{@link #getEAttribute_Attribute1001Single() <em>EAttribute Attribute1001 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute1001Single()
	 * @generated
	 * @ordered
	 */
	protected static final String EATTRIBUTE_ATTRIBUTE1001_SINGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute1001Single() <em>EAttribute Attribute1001 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute1001Single()
	 * @generated
	 * @ordered
	 */
	protected String eAttribute_Attribute1001Single = EATTRIBUTE_ATTRIBUTE1001_SINGLE_EDEFAULT;

	/**
	 * This is true if the EAttribute Attribute1001 Single attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eAttribute_Attribute1001SingleESet;

	/**
	 * The default value of the '{@link #getEAttribute_Attribute1010Single() <em>EAttribute Attribute1010 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute1010Single()
	 * @generated
	 * @ordered
	 */
	protected static final String EATTRIBUTE_ATTRIBUTE1010_SINGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute1010Single() <em>EAttribute Attribute1010 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute1010Single()
	 * @generated
	 * @ordered
	 */
	protected String eAttribute_Attribute1010Single = EATTRIBUTE_ATTRIBUTE1010_SINGLE_EDEFAULT;

	/**
	 * This is true if the EAttribute Attribute1010 Single attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eAttribute_Attribute1010SingleESet;

	/**
	 * The default value of the '{@link #getEAttribute_Attribute1011Single() <em>EAttribute Attribute1011 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute1011Single()
	 * @generated
	 * @ordered
	 */
	protected static final String EATTRIBUTE_ATTRIBUTE1011_SINGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute1011Single() <em>EAttribute Attribute1011 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute1011Single()
	 * @generated
	 * @ordered
	 */
	protected String eAttribute_Attribute1011Single = EATTRIBUTE_ATTRIBUTE1011_SINGLE_EDEFAULT;

	/**
	 * This is true if the EAttribute Attribute1011 Single attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eAttribute_Attribute1011SingleESet;

	/**
	 * The default value of the '{@link #getEAttribute_Attribute1100Single() <em>EAttribute Attribute1100 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute1100Single()
	 * @generated
	 * @ordered
	 */
	protected static final String EATTRIBUTE_ATTRIBUTE1100_SINGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute1100Single() <em>EAttribute Attribute1100 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute1100Single()
	 * @generated
	 * @ordered
	 */
	protected String eAttribute_Attribute1100Single = EATTRIBUTE_ATTRIBUTE1100_SINGLE_EDEFAULT;

	/**
	 * This is true if the EAttribute Attribute1100 Single attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eAttribute_Attribute1100SingleESet;

	/**
	 * The default value of the '{@link #getEAttribute_Attribute1101Single() <em>EAttribute Attribute1101 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute1101Single()
	 * @generated
	 * @ordered
	 */
	protected static final String EATTRIBUTE_ATTRIBUTE1101_SINGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute1101Single() <em>EAttribute Attribute1101 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute1101Single()
	 * @generated
	 * @ordered
	 */
	protected String eAttribute_Attribute1101Single = EATTRIBUTE_ATTRIBUTE1101_SINGLE_EDEFAULT;

	/**
	 * This is true if the EAttribute Attribute1101 Single attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eAttribute_Attribute1101SingleESet;

	/**
	 * The default value of the '{@link #getEAttribute_Attribute1110Single() <em>EAttribute Attribute1110 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute1110Single()
	 * @generated
	 * @ordered
	 */
	protected static final String EATTRIBUTE_ATTRIBUTE1110_SINGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute1110Single() <em>EAttribute Attribute1110 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute1110Single()
	 * @generated
	 * @ordered
	 */
	protected String eAttribute_Attribute1110Single = EATTRIBUTE_ATTRIBUTE1110_SINGLE_EDEFAULT;

	/**
	 * This is true if the EAttribute Attribute1110 Single attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eAttribute_Attribute1110SingleESet;

	/**
	 * The default value of the '{@link #getEAttribute_Attribute1111Single() <em>EAttribute Attribute1111 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute1111Single()
	 * @generated
	 * @ordered
	 */
	protected static final String EATTRIBUTE_ATTRIBUTE1111_SINGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute1111Single() <em>EAttribute Attribute1111 Single</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute1111Single()
	 * @generated
	 * @ordered
	 */
	protected String eAttribute_Attribute1111Single = EATTRIBUTE_ATTRIBUTE1111_SINGLE_EDEFAULT;

	/**
	 * This is true if the EAttribute Attribute1111 Single attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eAttribute_Attribute1111SingleESet;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute0000Many() <em>EAttribute Attribute0000 Many</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute0000Many()
	 * @generated
	 * @ordered
	 */
	protected EList<String> eAttribute_Attribute0000Many;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute0001Many() <em>EAttribute Attribute0001 Many</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute0001Many()
	 * @generated
	 * @ordered
	 */
	protected EList<String> eAttribute_Attribute0001Many;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute0010Many() <em>EAttribute Attribute0010 Many</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute0010Many()
	 * @generated
	 * @ordered
	 */
	protected EList<String> eAttribute_Attribute0010Many;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute0011Many() <em>EAttribute Attribute0011 Many</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute0011Many()
	 * @generated
	 * @ordered
	 */
	protected EList<String> eAttribute_Attribute0011Many;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute0100Many() <em>EAttribute Attribute0100 Many</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute0100Many()
	 * @generated
	 * @ordered
	 */
	protected EList<String> eAttribute_Attribute0100Many;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute0101Many() <em>EAttribute Attribute0101 Many</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute0101Many()
	 * @generated
	 * @ordered
	 */
	protected EList<String> eAttribute_Attribute0101Many;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute0110Many() <em>EAttribute Attribute0110 Many</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute0110Many()
	 * @generated
	 * @ordered
	 */
	protected EList<String> eAttribute_Attribute0110Many;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute0111Many() <em>EAttribute Attribute0111 Many</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute0111Many()
	 * @generated
	 * @ordered
	 */
	protected EList<String> eAttribute_Attribute0111Many;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute1000Many() <em>EAttribute Attribute1000 Many</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute1000Many()
	 * @generated
	 * @ordered
	 */
	protected EList<String> eAttribute_Attribute1000Many;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute1001Many() <em>EAttribute Attribute1001 Many</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute1001Many()
	 * @generated
	 * @ordered
	 */
	protected EList<String> eAttribute_Attribute1001Many;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute1010Many() <em>EAttribute Attribute1010 Many</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute1010Many()
	 * @generated
	 * @ordered
	 */
	protected EList<String> eAttribute_Attribute1010Many;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute1011Many() <em>EAttribute Attribute1011 Many</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute1011Many()
	 * @generated
	 * @ordered
	 */
	protected EList<String> eAttribute_Attribute1011Many;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute1100Many() <em>EAttribute Attribute1100 Many</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute1100Many()
	 * @generated
	 * @ordered
	 */
	protected EList<String> eAttribute_Attribute1100Many;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute1101Many() <em>EAttribute Attribute1101 Many</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute1101Many()
	 * @generated
	 * @ordered
	 */
	protected EList<String> eAttribute_Attribute1101Many;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute1110Many() <em>EAttribute Attribute1110 Many</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute1110Many()
	 * @generated
	 * @ordered
	 */
	protected EList<String> eAttribute_Attribute1110Many;

	/**
	 * The cached value of the '{@link #getEAttribute_Attribute1111Many() <em>EAttribute Attribute1111 Many</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute_Attribute1111Many()
	 * @generated
	 * @ordered
	 */
	protected EList<String> eAttribute_Attribute1111Many;

	/**
	 * The cached value of the '{@link #getReqif_eReference_Referenced0101Single() <em>Reqif eReference Referenced0101 Single</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqif_eReference_Referenced0101Single()
	 * @generated
	 * @ordered
	 */
	protected Node reqif_eReference_Referenced0101Single;

	/**
	 * This is true if the Reqif eReference Referenced0101 Single reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean reqif_eReference_Referenced0101SingleESet;

	/**
	 * The cached value of the '{@link #getReqif_eReference_Referenced1001Many() <em>Reqif eReference Referenced1001 Many</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqif_eReference_Referenced1001Many()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> reqif_eReference_Referenced1001Many;

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
		boolean oldEReference_Contained0000SingleESet = eReference_Contained0000SingleESet;
		eReference_Contained0000SingleESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0000_SINGLE, oldEReference_Contained0000Single, newEReference_Contained0000Single, !oldEReference_Contained0000SingleESet);
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
		else {
			boolean oldEReference_Contained0000SingleESet = eReference_Contained0000SingleESet;
			eReference_Contained0000SingleESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0000_SINGLE, newEReference_Contained0000Single, newEReference_Contained0000Single, !oldEReference_Contained0000SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEReference_Contained0000Single(NotificationChain msgs) {
		Node oldEReference_Contained0000Single = eReference_Contained0000Single;
		eReference_Contained0000Single = null;
		boolean oldEReference_Contained0000SingleESet = eReference_Contained0000SingleESet;
		eReference_Contained0000SingleESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED0000_SINGLE, oldEReference_Contained0000Single, null, oldEReference_Contained0000SingleESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained0000Single() {
		if (eReference_Contained0000Single != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)eReference_Contained0000Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED0000_SINGLE, null, msgs);
			msgs = basicUnsetEReference_Contained0000Single(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEReference_Contained0000SingleESet = eReference_Contained0000SingleESet;
			eReference_Contained0000SingleESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED0000_SINGLE, null, null, oldEReference_Contained0000SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained0000Single() {
		return eReference_Contained0000SingleESet;
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
		boolean oldEReference_Contained0001SingleESet = eReference_Contained0001SingleESet;
		eReference_Contained0001SingleESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0001_SINGLE, oldEReference_Contained0001Single, newEReference_Contained0001Single, !oldEReference_Contained0001SingleESet);
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
		else {
			boolean oldEReference_Contained0001SingleESet = eReference_Contained0001SingleESet;
			eReference_Contained0001SingleESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0001_SINGLE, newEReference_Contained0001Single, newEReference_Contained0001Single, !oldEReference_Contained0001SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEReference_Contained0001Single(NotificationChain msgs) {
		Node oldEReference_Contained0001Single = eReference_Contained0001Single;
		eReference_Contained0001Single = null;
		boolean oldEReference_Contained0001SingleESet = eReference_Contained0001SingleESet;
		eReference_Contained0001SingleESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED0001_SINGLE, oldEReference_Contained0001Single, null, oldEReference_Contained0001SingleESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained0001Single() {
		if (eReference_Contained0001Single != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)eReference_Contained0001Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED0001_SINGLE, null, msgs);
			msgs = basicUnsetEReference_Contained0001Single(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEReference_Contained0001SingleESet = eReference_Contained0001SingleESet;
			eReference_Contained0001SingleESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED0001_SINGLE, null, null, oldEReference_Contained0001SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained0001Single() {
		return eReference_Contained0001SingleESet;
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
		boolean oldEReference_Contained0010SingleESet = eReference_Contained0010SingleESet;
		eReference_Contained0010SingleESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0010_SINGLE, oldEReference_Contained0010Single, newEReference_Contained0010Single, !oldEReference_Contained0010SingleESet);
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
		else {
			boolean oldEReference_Contained0010SingleESet = eReference_Contained0010SingleESet;
			eReference_Contained0010SingleESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0010_SINGLE, newEReference_Contained0010Single, newEReference_Contained0010Single, !oldEReference_Contained0010SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEReference_Contained0010Single(NotificationChain msgs) {
		Node oldEReference_Contained0010Single = eReference_Contained0010Single;
		eReference_Contained0010Single = null;
		boolean oldEReference_Contained0010SingleESet = eReference_Contained0010SingleESet;
		eReference_Contained0010SingleESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED0010_SINGLE, oldEReference_Contained0010Single, null, oldEReference_Contained0010SingleESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained0010Single() {
		if (eReference_Contained0010Single != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)eReference_Contained0010Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED0010_SINGLE, null, msgs);
			msgs = basicUnsetEReference_Contained0010Single(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEReference_Contained0010SingleESet = eReference_Contained0010SingleESet;
			eReference_Contained0010SingleESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED0010_SINGLE, null, null, oldEReference_Contained0010SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained0010Single() {
		return eReference_Contained0010SingleESet;
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
		boolean oldEReference_Contained0011SingleESet = eReference_Contained0011SingleESet;
		eReference_Contained0011SingleESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0011_SINGLE, oldEReference_Contained0011Single, newEReference_Contained0011Single, !oldEReference_Contained0011SingleESet);
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
		else {
			boolean oldEReference_Contained0011SingleESet = eReference_Contained0011SingleESet;
			eReference_Contained0011SingleESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0011_SINGLE, newEReference_Contained0011Single, newEReference_Contained0011Single, !oldEReference_Contained0011SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEReference_Contained0011Single(NotificationChain msgs) {
		Node oldEReference_Contained0011Single = eReference_Contained0011Single;
		eReference_Contained0011Single = null;
		boolean oldEReference_Contained0011SingleESet = eReference_Contained0011SingleESet;
		eReference_Contained0011SingleESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED0011_SINGLE, oldEReference_Contained0011Single, null, oldEReference_Contained0011SingleESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained0011Single() {
		if (eReference_Contained0011Single != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)eReference_Contained0011Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED0011_SINGLE, null, msgs);
			msgs = basicUnsetEReference_Contained0011Single(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEReference_Contained0011SingleESet = eReference_Contained0011SingleESet;
			eReference_Contained0011SingleESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED0011_SINGLE, null, null, oldEReference_Contained0011SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained0011Single() {
		return eReference_Contained0011SingleESet;
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
		boolean oldEReference_Contained0100SingleESet = eReference_Contained0100SingleESet;
		eReference_Contained0100SingleESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0100_SINGLE, oldEReference_Contained0100Single, newEReference_Contained0100Single, !oldEReference_Contained0100SingleESet);
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
		else {
			boolean oldEReference_Contained0100SingleESet = eReference_Contained0100SingleESet;
			eReference_Contained0100SingleESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0100_SINGLE, newEReference_Contained0100Single, newEReference_Contained0100Single, !oldEReference_Contained0100SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEReference_Contained0100Single(NotificationChain msgs) {
		Node oldEReference_Contained0100Single = eReference_Contained0100Single;
		eReference_Contained0100Single = null;
		boolean oldEReference_Contained0100SingleESet = eReference_Contained0100SingleESet;
		eReference_Contained0100SingleESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED0100_SINGLE, oldEReference_Contained0100Single, null, oldEReference_Contained0100SingleESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained0100Single() {
		if (eReference_Contained0100Single != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)eReference_Contained0100Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED0100_SINGLE, null, msgs);
			msgs = basicUnsetEReference_Contained0100Single(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEReference_Contained0100SingleESet = eReference_Contained0100SingleESet;
			eReference_Contained0100SingleESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED0100_SINGLE, null, null, oldEReference_Contained0100SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained0100Single() {
		return eReference_Contained0100SingleESet;
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
		boolean oldEReference_Contained0101SingleESet = eReference_Contained0101SingleESet;
		eReference_Contained0101SingleESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0101_SINGLE, oldEReference_Contained0101Single, newEReference_Contained0101Single, !oldEReference_Contained0101SingleESet);
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
		else {
			boolean oldEReference_Contained0101SingleESet = eReference_Contained0101SingleESet;
			eReference_Contained0101SingleESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0101_SINGLE, newEReference_Contained0101Single, newEReference_Contained0101Single, !oldEReference_Contained0101SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEReference_Contained0101Single(NotificationChain msgs) {
		Node oldEReference_Contained0101Single = eReference_Contained0101Single;
		eReference_Contained0101Single = null;
		boolean oldEReference_Contained0101SingleESet = eReference_Contained0101SingleESet;
		eReference_Contained0101SingleESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED0101_SINGLE, oldEReference_Contained0101Single, null, oldEReference_Contained0101SingleESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained0101Single() {
		if (eReference_Contained0101Single != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)eReference_Contained0101Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED0101_SINGLE, null, msgs);
			msgs = basicUnsetEReference_Contained0101Single(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEReference_Contained0101SingleESet = eReference_Contained0101SingleESet;
			eReference_Contained0101SingleESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED0101_SINGLE, null, null, oldEReference_Contained0101SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained0101Single() {
		return eReference_Contained0101SingleESet;
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
		boolean oldEReference_Contained0110SingleESet = eReference_Contained0110SingleESet;
		eReference_Contained0110SingleESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0110_SINGLE, oldEReference_Contained0110Single, newEReference_Contained0110Single, !oldEReference_Contained0110SingleESet);
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
		else {
			boolean oldEReference_Contained0110SingleESet = eReference_Contained0110SingleESet;
			eReference_Contained0110SingleESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0110_SINGLE, newEReference_Contained0110Single, newEReference_Contained0110Single, !oldEReference_Contained0110SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEReference_Contained0110Single(NotificationChain msgs) {
		Node oldEReference_Contained0110Single = eReference_Contained0110Single;
		eReference_Contained0110Single = null;
		boolean oldEReference_Contained0110SingleESet = eReference_Contained0110SingleESet;
		eReference_Contained0110SingleESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED0110_SINGLE, oldEReference_Contained0110Single, null, oldEReference_Contained0110SingleESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained0110Single() {
		if (eReference_Contained0110Single != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)eReference_Contained0110Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED0110_SINGLE, null, msgs);
			msgs = basicUnsetEReference_Contained0110Single(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEReference_Contained0110SingleESet = eReference_Contained0110SingleESet;
			eReference_Contained0110SingleESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED0110_SINGLE, null, null, oldEReference_Contained0110SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained0110Single() {
		return eReference_Contained0110SingleESet;
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
		boolean oldEReference_Contained0111SingleESet = eReference_Contained0111SingleESet;
		eReference_Contained0111SingleESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0111_SINGLE, oldEReference_Contained0111Single, newEReference_Contained0111Single, !oldEReference_Contained0111SingleESet);
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
		else {
			boolean oldEReference_Contained0111SingleESet = eReference_Contained0111SingleESet;
			eReference_Contained0111SingleESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED0111_SINGLE, newEReference_Contained0111Single, newEReference_Contained0111Single, !oldEReference_Contained0111SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEReference_Contained0111Single(NotificationChain msgs) {
		Node oldEReference_Contained0111Single = eReference_Contained0111Single;
		eReference_Contained0111Single = null;
		boolean oldEReference_Contained0111SingleESet = eReference_Contained0111SingleESet;
		eReference_Contained0111SingleESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED0111_SINGLE, oldEReference_Contained0111Single, null, oldEReference_Contained0111SingleESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained0111Single() {
		if (eReference_Contained0111Single != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)eReference_Contained0111Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED0111_SINGLE, null, msgs);
			msgs = basicUnsetEReference_Contained0111Single(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEReference_Contained0111SingleESet = eReference_Contained0111SingleESet;
			eReference_Contained0111SingleESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED0111_SINGLE, null, null, oldEReference_Contained0111SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained0111Single() {
		return eReference_Contained0111SingleESet;
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
		boolean oldEReference_Contained1000SingleESet = eReference_Contained1000SingleESet;
		eReference_Contained1000SingleESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1000_SINGLE, oldEReference_Contained1000Single, newEReference_Contained1000Single, !oldEReference_Contained1000SingleESet);
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
		else {
			boolean oldEReference_Contained1000SingleESet = eReference_Contained1000SingleESet;
			eReference_Contained1000SingleESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1000_SINGLE, newEReference_Contained1000Single, newEReference_Contained1000Single, !oldEReference_Contained1000SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEReference_Contained1000Single(NotificationChain msgs) {
		Node oldEReference_Contained1000Single = eReference_Contained1000Single;
		eReference_Contained1000Single = null;
		boolean oldEReference_Contained1000SingleESet = eReference_Contained1000SingleESet;
		eReference_Contained1000SingleESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED1000_SINGLE, oldEReference_Contained1000Single, null, oldEReference_Contained1000SingleESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained1000Single() {
		if (eReference_Contained1000Single != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)eReference_Contained1000Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED1000_SINGLE, null, msgs);
			msgs = basicUnsetEReference_Contained1000Single(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEReference_Contained1000SingleESet = eReference_Contained1000SingleESet;
			eReference_Contained1000SingleESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED1000_SINGLE, null, null, oldEReference_Contained1000SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained1000Single() {
		return eReference_Contained1000SingleESet;
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
		boolean oldEReference_Contained1001SingleESet = eReference_Contained1001SingleESet;
		eReference_Contained1001SingleESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1001_SINGLE, oldEReference_Contained1001Single, newEReference_Contained1001Single, !oldEReference_Contained1001SingleESet);
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
		else {
			boolean oldEReference_Contained1001SingleESet = eReference_Contained1001SingleESet;
			eReference_Contained1001SingleESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1001_SINGLE, newEReference_Contained1001Single, newEReference_Contained1001Single, !oldEReference_Contained1001SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEReference_Contained1001Single(NotificationChain msgs) {
		Node oldEReference_Contained1001Single = eReference_Contained1001Single;
		eReference_Contained1001Single = null;
		boolean oldEReference_Contained1001SingleESet = eReference_Contained1001SingleESet;
		eReference_Contained1001SingleESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED1001_SINGLE, oldEReference_Contained1001Single, null, oldEReference_Contained1001SingleESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained1001Single() {
		if (eReference_Contained1001Single != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)eReference_Contained1001Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED1001_SINGLE, null, msgs);
			msgs = basicUnsetEReference_Contained1001Single(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEReference_Contained1001SingleESet = eReference_Contained1001SingleESet;
			eReference_Contained1001SingleESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED1001_SINGLE, null, null, oldEReference_Contained1001SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained1001Single() {
		return eReference_Contained1001SingleESet;
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
		boolean oldEReference_Contained1010SingleESet = eReference_Contained1010SingleESet;
		eReference_Contained1010SingleESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1010_SINGLE, oldEReference_Contained1010Single, newEReference_Contained1010Single, !oldEReference_Contained1010SingleESet);
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
		else {
			boolean oldEReference_Contained1010SingleESet = eReference_Contained1010SingleESet;
			eReference_Contained1010SingleESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1010_SINGLE, newEReference_Contained1010Single, newEReference_Contained1010Single, !oldEReference_Contained1010SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEReference_Contained1010Single(NotificationChain msgs) {
		Node oldEReference_Contained1010Single = eReference_Contained1010Single;
		eReference_Contained1010Single = null;
		boolean oldEReference_Contained1010SingleESet = eReference_Contained1010SingleESet;
		eReference_Contained1010SingleESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED1010_SINGLE, oldEReference_Contained1010Single, null, oldEReference_Contained1010SingleESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained1010Single() {
		if (eReference_Contained1010Single != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)eReference_Contained1010Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED1010_SINGLE, null, msgs);
			msgs = basicUnsetEReference_Contained1010Single(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEReference_Contained1010SingleESet = eReference_Contained1010SingleESet;
			eReference_Contained1010SingleESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED1010_SINGLE, null, null, oldEReference_Contained1010SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained1010Single() {
		return eReference_Contained1010SingleESet;
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
		boolean oldEReference_Contained1011SingleESet = eReference_Contained1011SingleESet;
		eReference_Contained1011SingleESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1011_SINGLE, oldEReference_Contained1011Single, newEReference_Contained1011Single, !oldEReference_Contained1011SingleESet);
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
		else {
			boolean oldEReference_Contained1011SingleESet = eReference_Contained1011SingleESet;
			eReference_Contained1011SingleESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1011_SINGLE, newEReference_Contained1011Single, newEReference_Contained1011Single, !oldEReference_Contained1011SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEReference_Contained1011Single(NotificationChain msgs) {
		Node oldEReference_Contained1011Single = eReference_Contained1011Single;
		eReference_Contained1011Single = null;
		boolean oldEReference_Contained1011SingleESet = eReference_Contained1011SingleESet;
		eReference_Contained1011SingleESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED1011_SINGLE, oldEReference_Contained1011Single, null, oldEReference_Contained1011SingleESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained1011Single() {
		if (eReference_Contained1011Single != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)eReference_Contained1011Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED1011_SINGLE, null, msgs);
			msgs = basicUnsetEReference_Contained1011Single(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEReference_Contained1011SingleESet = eReference_Contained1011SingleESet;
			eReference_Contained1011SingleESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED1011_SINGLE, null, null, oldEReference_Contained1011SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained1011Single() {
		return eReference_Contained1011SingleESet;
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
		boolean oldEReference_Contained1100SingleESet = eReference_Contained1100SingleESet;
		eReference_Contained1100SingleESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1100_SINGLE, oldEReference_Contained1100Single, newEReference_Contained1100Single, !oldEReference_Contained1100SingleESet);
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
		else {
			boolean oldEReference_Contained1100SingleESet = eReference_Contained1100SingleESet;
			eReference_Contained1100SingleESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1100_SINGLE, newEReference_Contained1100Single, newEReference_Contained1100Single, !oldEReference_Contained1100SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEReference_Contained1100Single(NotificationChain msgs) {
		Node oldEReference_Contained1100Single = eReference_Contained1100Single;
		eReference_Contained1100Single = null;
		boolean oldEReference_Contained1100SingleESet = eReference_Contained1100SingleESet;
		eReference_Contained1100SingleESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED1100_SINGLE, oldEReference_Contained1100Single, null, oldEReference_Contained1100SingleESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained1100Single() {
		if (eReference_Contained1100Single != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)eReference_Contained1100Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED1100_SINGLE, null, msgs);
			msgs = basicUnsetEReference_Contained1100Single(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEReference_Contained1100SingleESet = eReference_Contained1100SingleESet;
			eReference_Contained1100SingleESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED1100_SINGLE, null, null, oldEReference_Contained1100SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained1100Single() {
		return eReference_Contained1100SingleESet;
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
		boolean oldEReference_Contained1101SingleESet = eReference_Contained1101SingleESet;
		eReference_Contained1101SingleESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1101_SINGLE, oldEReference_Contained1101Single, newEReference_Contained1101Single, !oldEReference_Contained1101SingleESet);
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
		else {
			boolean oldEReference_Contained1101SingleESet = eReference_Contained1101SingleESet;
			eReference_Contained1101SingleESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1101_SINGLE, newEReference_Contained1101Single, newEReference_Contained1101Single, !oldEReference_Contained1101SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEReference_Contained1101Single(NotificationChain msgs) {
		Node oldEReference_Contained1101Single = eReference_Contained1101Single;
		eReference_Contained1101Single = null;
		boolean oldEReference_Contained1101SingleESet = eReference_Contained1101SingleESet;
		eReference_Contained1101SingleESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED1101_SINGLE, oldEReference_Contained1101Single, null, oldEReference_Contained1101SingleESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained1101Single() {
		if (eReference_Contained1101Single != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)eReference_Contained1101Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED1101_SINGLE, null, msgs);
			msgs = basicUnsetEReference_Contained1101Single(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEReference_Contained1101SingleESet = eReference_Contained1101SingleESet;
			eReference_Contained1101SingleESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED1101_SINGLE, null, null, oldEReference_Contained1101SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained1101Single() {
		return eReference_Contained1101SingleESet;
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
		boolean oldEReference_Contained1110SingleESet = eReference_Contained1110SingleESet;
		eReference_Contained1110SingleESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1110_SINGLE, oldEReference_Contained1110Single, newEReference_Contained1110Single, !oldEReference_Contained1110SingleESet);
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
		else {
			boolean oldEReference_Contained1110SingleESet = eReference_Contained1110SingleESet;
			eReference_Contained1110SingleESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1110_SINGLE, newEReference_Contained1110Single, newEReference_Contained1110Single, !oldEReference_Contained1110SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEReference_Contained1110Single(NotificationChain msgs) {
		Node oldEReference_Contained1110Single = eReference_Contained1110Single;
		eReference_Contained1110Single = null;
		boolean oldEReference_Contained1110SingleESet = eReference_Contained1110SingleESet;
		eReference_Contained1110SingleESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED1110_SINGLE, oldEReference_Contained1110Single, null, oldEReference_Contained1110SingleESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained1110Single() {
		if (eReference_Contained1110Single != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)eReference_Contained1110Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED1110_SINGLE, null, msgs);
			msgs = basicUnsetEReference_Contained1110Single(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEReference_Contained1110SingleESet = eReference_Contained1110SingleESet;
			eReference_Contained1110SingleESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED1110_SINGLE, null, null, oldEReference_Contained1110SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained1110Single() {
		return eReference_Contained1110SingleESet;
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
		boolean oldEReference_Contained1111SingleESet = eReference_Contained1111SingleESet;
		eReference_Contained1111SingleESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1111_SINGLE, oldEReference_Contained1111Single, newEReference_Contained1111Single, !oldEReference_Contained1111SingleESet);
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
		else {
			boolean oldEReference_Contained1111SingleESet = eReference_Contained1111SingleESet;
			eReference_Contained1111SingleESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_CONTAINED1111_SINGLE, newEReference_Contained1111Single, newEReference_Contained1111Single, !oldEReference_Contained1111SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEReference_Contained1111Single(NotificationChain msgs) {
		Node oldEReference_Contained1111Single = eReference_Contained1111Single;
		eReference_Contained1111Single = null;
		boolean oldEReference_Contained1111SingleESet = eReference_Contained1111SingleESet;
		eReference_Contained1111SingleESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED1111_SINGLE, oldEReference_Contained1111Single, null, oldEReference_Contained1111SingleESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained1111Single() {
		if (eReference_Contained1111Single != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)eReference_Contained1111Single).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_CONTAINED1111_SINGLE, null, msgs);
			msgs = basicUnsetEReference_Contained1111Single(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEReference_Contained1111SingleESet = eReference_Contained1111SingleESet;
			eReference_Contained1111SingleESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_CONTAINED1111_SINGLE, null, null, oldEReference_Contained1111SingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained1111Single() {
		return eReference_Contained1111SingleESet;
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
		boolean oldEReference_EmptyAnnotationSingleESet = eReference_EmptyAnnotationSingleESet;
		eReference_EmptyAnnotationSingleESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_EMPTY_ANNOTATION_SINGLE, oldEReference_EmptyAnnotationSingle, newEReference_EmptyAnnotationSingle, !oldEReference_EmptyAnnotationSingleESet);
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
		else {
			boolean oldEReference_EmptyAnnotationSingleESet = eReference_EmptyAnnotationSingleESet;
			eReference_EmptyAnnotationSingleESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_EMPTY_ANNOTATION_SINGLE, newEReference_EmptyAnnotationSingle, newEReference_EmptyAnnotationSingle, !oldEReference_EmptyAnnotationSingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEReference_EmptyAnnotationSingle(NotificationChain msgs) {
		Node oldEReference_EmptyAnnotationSingle = eReference_EmptyAnnotationSingle;
		eReference_EmptyAnnotationSingle = null;
		boolean oldEReference_EmptyAnnotationSingleESet = eReference_EmptyAnnotationSingleESet;
		eReference_EmptyAnnotationSingleESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_EMPTY_ANNOTATION_SINGLE, oldEReference_EmptyAnnotationSingle, null, oldEReference_EmptyAnnotationSingleESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_EmptyAnnotationSingle() {
		if (eReference_EmptyAnnotationSingle != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)eReference_EmptyAnnotationSingle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_EMPTY_ANNOTATION_SINGLE, null, msgs);
			msgs = basicUnsetEReference_EmptyAnnotationSingle(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEReference_EmptyAnnotationSingleESet = eReference_EmptyAnnotationSingleESet;
			eReference_EmptyAnnotationSingleESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_EMPTY_ANNOTATION_SINGLE, null, null, oldEReference_EmptyAnnotationSingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_EmptyAnnotationSingle() {
		return eReference_EmptyAnnotationSingleESet;
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
		boolean oldEReference_NoAnnotationSingleESet = eReference_NoAnnotationSingleESet;
		eReference_NoAnnotationSingleESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_NO_ANNOTATION_SINGLE, oldEReference_NoAnnotationSingle, newEReference_NoAnnotationSingle, !oldEReference_NoAnnotationSingleESet);
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
		else {
			boolean oldEReference_NoAnnotationSingleESet = eReference_NoAnnotationSingleESet;
			eReference_NoAnnotationSingleESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_NO_ANNOTATION_SINGLE, newEReference_NoAnnotationSingle, newEReference_NoAnnotationSingle, !oldEReference_NoAnnotationSingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetEReference_NoAnnotationSingle(NotificationChain msgs) {
		Node oldEReference_NoAnnotationSingle = eReference_NoAnnotationSingle;
		eReference_NoAnnotationSingle = null;
		boolean oldEReference_NoAnnotationSingleESet = eReference_NoAnnotationSingleESet;
		eReference_NoAnnotationSingleESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_NO_ANNOTATION_SINGLE, oldEReference_NoAnnotationSingle, null, oldEReference_NoAnnotationSingleESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_NoAnnotationSingle() {
		if (eReference_NoAnnotationSingle != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)eReference_NoAnnotationSingle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NodesPackage.NODE__EREFERENCE_NO_ANNOTATION_SINGLE, null, msgs);
			msgs = basicUnsetEReference_NoAnnotationSingle(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldEReference_NoAnnotationSingleESet = eReference_NoAnnotationSingleESet;
			eReference_NoAnnotationSingleESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_NO_ANNOTATION_SINGLE, null, null, oldEReference_NoAnnotationSingleESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_NoAnnotationSingle() {
		return eReference_NoAnnotationSingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained0000Many() {
		if (eReference_Contained0000Many == null) {
			eReference_Contained0000Many = new EObjectContainmentEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED0000_MANY);
		}
		return eReference_Contained0000Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained0000Many() {
		if (eReference_Contained0000Many != null) ((InternalEList.Unsettable<?>)eReference_Contained0000Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained0000Many() {
		return eReference_Contained0000Many != null && ((InternalEList.Unsettable<?>)eReference_Contained0000Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained0001Many() {
		if (eReference_Contained0001Many == null) {
			eReference_Contained0001Many = new EObjectContainmentEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED0001_MANY);
		}
		return eReference_Contained0001Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained0001Many() {
		if (eReference_Contained0001Many != null) ((InternalEList.Unsettable<?>)eReference_Contained0001Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained0001Many() {
		return eReference_Contained0001Many != null && ((InternalEList.Unsettable<?>)eReference_Contained0001Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained0010Many() {
		if (eReference_Contained0010Many == null) {
			eReference_Contained0010Many = new EObjectContainmentEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED0010_MANY);
		}
		return eReference_Contained0010Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained0010Many() {
		if (eReference_Contained0010Many != null) ((InternalEList.Unsettable<?>)eReference_Contained0010Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained0010Many() {
		return eReference_Contained0010Many != null && ((InternalEList.Unsettable<?>)eReference_Contained0010Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained0011Many() {
		if (eReference_Contained0011Many == null) {
			eReference_Contained0011Many = new EObjectContainmentEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED0011_MANY);
		}
		return eReference_Contained0011Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained0011Many() {
		if (eReference_Contained0011Many != null) ((InternalEList.Unsettable<?>)eReference_Contained0011Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained0011Many() {
		return eReference_Contained0011Many != null && ((InternalEList.Unsettable<?>)eReference_Contained0011Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained0100Many() {
		if (eReference_Contained0100Many == null) {
			eReference_Contained0100Many = new EObjectContainmentEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED0100_MANY);
		}
		return eReference_Contained0100Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained0100Many() {
		if (eReference_Contained0100Many != null) ((InternalEList.Unsettable<?>)eReference_Contained0100Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained0100Many() {
		return eReference_Contained0100Many != null && ((InternalEList.Unsettable<?>)eReference_Contained0100Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained0101Many() {
		if (eReference_Contained0101Many == null) {
			eReference_Contained0101Many = new EObjectContainmentEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED0101_MANY);
		}
		return eReference_Contained0101Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained0101Many() {
		if (eReference_Contained0101Many != null) ((InternalEList.Unsettable<?>)eReference_Contained0101Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained0101Many() {
		return eReference_Contained0101Many != null && ((InternalEList.Unsettable<?>)eReference_Contained0101Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained0110Many() {
		if (eReference_Contained0110Many == null) {
			eReference_Contained0110Many = new EObjectContainmentEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED0110_MANY);
		}
		return eReference_Contained0110Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained0110Many() {
		if (eReference_Contained0110Many != null) ((InternalEList.Unsettable<?>)eReference_Contained0110Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained0110Many() {
		return eReference_Contained0110Many != null && ((InternalEList.Unsettable<?>)eReference_Contained0110Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained0111Many() {
		if (eReference_Contained0111Many == null) {
			eReference_Contained0111Many = new EObjectContainmentEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED0111_MANY);
		}
		return eReference_Contained0111Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained0111Many() {
		if (eReference_Contained0111Many != null) ((InternalEList.Unsettable<?>)eReference_Contained0111Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained0111Many() {
		return eReference_Contained0111Many != null && ((InternalEList.Unsettable<?>)eReference_Contained0111Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained1000Many() {
		if (eReference_Contained1000Many == null) {
			eReference_Contained1000Many = new EObjectContainmentEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED1000_MANY);
		}
		return eReference_Contained1000Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained1000Many() {
		if (eReference_Contained1000Many != null) ((InternalEList.Unsettable<?>)eReference_Contained1000Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained1000Many() {
		return eReference_Contained1000Many != null && ((InternalEList.Unsettable<?>)eReference_Contained1000Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained1001Many() {
		if (eReference_Contained1001Many == null) {
			eReference_Contained1001Many = new EObjectContainmentEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED1001_MANY);
		}
		return eReference_Contained1001Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained1001Many() {
		if (eReference_Contained1001Many != null) ((InternalEList.Unsettable<?>)eReference_Contained1001Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained1001Many() {
		return eReference_Contained1001Many != null && ((InternalEList.Unsettable<?>)eReference_Contained1001Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained1010Many() {
		if (eReference_Contained1010Many == null) {
			eReference_Contained1010Many = new EObjectContainmentEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED1010_MANY);
		}
		return eReference_Contained1010Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained1010Many() {
		if (eReference_Contained1010Many != null) ((InternalEList.Unsettable<?>)eReference_Contained1010Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained1010Many() {
		return eReference_Contained1010Many != null && ((InternalEList.Unsettable<?>)eReference_Contained1010Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained1011Many() {
		if (eReference_Contained1011Many == null) {
			eReference_Contained1011Many = new EObjectContainmentEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED1011_MANY);
		}
		return eReference_Contained1011Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained1011Many() {
		if (eReference_Contained1011Many != null) ((InternalEList.Unsettable<?>)eReference_Contained1011Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained1011Many() {
		return eReference_Contained1011Many != null && ((InternalEList.Unsettable<?>)eReference_Contained1011Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained1100Many() {
		if (eReference_Contained1100Many == null) {
			eReference_Contained1100Many = new EObjectContainmentEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED1100_MANY);
		}
		return eReference_Contained1100Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained1100Many() {
		if (eReference_Contained1100Many != null) ((InternalEList.Unsettable<?>)eReference_Contained1100Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained1100Many() {
		return eReference_Contained1100Many != null && ((InternalEList.Unsettable<?>)eReference_Contained1100Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained1101Many() {
		if (eReference_Contained1101Many == null) {
			eReference_Contained1101Many = new EObjectContainmentEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED1101_MANY);
		}
		return eReference_Contained1101Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained1101Many() {
		if (eReference_Contained1101Many != null) ((InternalEList.Unsettable<?>)eReference_Contained1101Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained1101Many() {
		return eReference_Contained1101Many != null && ((InternalEList.Unsettable<?>)eReference_Contained1101Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained1110Many() {
		if (eReference_Contained1110Many == null) {
			eReference_Contained1110Many = new EObjectContainmentEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED1110_MANY);
		}
		return eReference_Contained1110Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained1110Many() {
		if (eReference_Contained1110Many != null) ((InternalEList.Unsettable<?>)eReference_Contained1110Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained1110Many() {
		return eReference_Contained1110Many != null && ((InternalEList.Unsettable<?>)eReference_Contained1110Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Contained1111Many() {
		if (eReference_Contained1111Many == null) {
			eReference_Contained1111Many = new EObjectContainmentEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_CONTAINED1111_MANY);
		}
		return eReference_Contained1111Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Contained1111Many() {
		if (eReference_Contained1111Many != null) ((InternalEList.Unsettable<?>)eReference_Contained1111Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Contained1111Many() {
		return eReference_Contained1111Many != null && ((InternalEList.Unsettable<?>)eReference_Contained1111Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_EmptyAnnotationMany() {
		if (eReference_EmptyAnnotationMany == null) {
			eReference_EmptyAnnotationMany = new EObjectContainmentEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_EMPTY_ANNOTATION_MANY);
		}
		return eReference_EmptyAnnotationMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_EmptyAnnotationMany() {
		if (eReference_EmptyAnnotationMany != null) ((InternalEList.Unsettable<?>)eReference_EmptyAnnotationMany).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_EmptyAnnotationMany() {
		return eReference_EmptyAnnotationMany != null && ((InternalEList.Unsettable<?>)eReference_EmptyAnnotationMany).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_NoAnnotationMany() {
		if (eReference_NoAnnotationMany == null) {
			eReference_NoAnnotationMany = new EObjectContainmentEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_NO_ANNOTATION_MANY);
		}
		return eReference_NoAnnotationMany;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_NoAnnotationMany() {
		if (eReference_NoAnnotationMany != null) ((InternalEList.Unsettable<?>)eReference_NoAnnotationMany).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_NoAnnotationMany() {
		return eReference_NoAnnotationMany != null && ((InternalEList.Unsettable<?>)eReference_NoAnnotationMany).isSet();
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
		boolean oldNameESet = nameESet;
		nameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__NAME, oldName, name, !oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetName() {
		String oldName = name;
		boolean oldNameESet = nameESet;
		name = NAME_EDEFAULT;
		nameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__NAME, oldName, NAME_EDEFAULT, oldNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetName() {
		return nameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getEReference_WithTypeEObject_Contained0001Many() {
		if (eReference_WithTypeEObject_Contained0001Many == null) {
			eReference_WithTypeEObject_Contained0001Many = new EObjectContainmentEList.Unsettable<EObject>(EObject.class, this, NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0001_MANY);
		}
		return eReference_WithTypeEObject_Contained0001Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_WithTypeEObject_Contained0001Many() {
		if (eReference_WithTypeEObject_Contained0001Many != null) ((InternalEList.Unsettable<?>)eReference_WithTypeEObject_Contained0001Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_WithTypeEObject_Contained0001Many() {
		return eReference_WithTypeEObject_Contained0001Many != null && ((InternalEList.Unsettable<?>)eReference_WithTypeEObject_Contained0001Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getEReference_WithTypeEObject_Contained0010Many() {
		if (eReference_WithTypeEObject_Contained0010Many == null) {
			eReference_WithTypeEObject_Contained0010Many = new EObjectContainmentEList.Unsettable<EObject>(EObject.class, this, NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0010_MANY);
		}
		return eReference_WithTypeEObject_Contained0010Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_WithTypeEObject_Contained0010Many() {
		if (eReference_WithTypeEObject_Contained0010Many != null) ((InternalEList.Unsettable<?>)eReference_WithTypeEObject_Contained0010Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_WithTypeEObject_Contained0010Many() {
		return eReference_WithTypeEObject_Contained0010Many != null && ((InternalEList.Unsettable<?>)eReference_WithTypeEObject_Contained0010Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getEReference_WithTypeEObject_Contained0100Many() {
		if (eReference_WithTypeEObject_Contained0100Many == null) {
			eReference_WithTypeEObject_Contained0100Many = new EObjectContainmentEList.Unsettable<EObject>(EObject.class, this, NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0100_MANY);
		}
		return eReference_WithTypeEObject_Contained0100Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_WithTypeEObject_Contained0100Many() {
		if (eReference_WithTypeEObject_Contained0100Many != null) ((InternalEList.Unsettable<?>)eReference_WithTypeEObject_Contained0100Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_WithTypeEObject_Contained0100Many() {
		return eReference_WithTypeEObject_Contained0100Many != null && ((InternalEList.Unsettable<?>)eReference_WithTypeEObject_Contained0100Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getEReference_WithTypeEObject_Contained1000Many() {
		if (eReference_WithTypeEObject_Contained1000Many == null) {
			eReference_WithTypeEObject_Contained1000Many = new EObjectContainmentEList.Unsettable<EObject>(EObject.class, this, NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED1000_MANY);
		}
		return eReference_WithTypeEObject_Contained1000Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_WithTypeEObject_Contained1000Many() {
		if (eReference_WithTypeEObject_Contained1000Many != null) ((InternalEList.Unsettable<?>)eReference_WithTypeEObject_Contained1000Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_WithTypeEObject_Contained1000Many() {
		return eReference_WithTypeEObject_Contained1000Many != null && ((InternalEList.Unsettable<?>)eReference_WithTypeEObject_Contained1000Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Referenced0000Single() {
		if (eReference_Referenced0000Single != null && eReference_Referenced0000Single.eIsProxy()) {
			InternalEObject oldEReference_Referenced0000Single = (InternalEObject)eReference_Referenced0000Single;
			eReference_Referenced0000Single = (Node)eResolveProxy(oldEReference_Referenced0000Single);
			if (eReference_Referenced0000Single != oldEReference_Referenced0000Single) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodesPackage.NODE__EREFERENCE_REFERENCED0000_SINGLE, oldEReference_Referenced0000Single, eReference_Referenced0000Single));
			}
		}
		return eReference_Referenced0000Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetEReference_Referenced0000Single() {
		return eReference_Referenced0000Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Referenced0000Single(Node newEReference_Referenced0000Single) {
		Node oldEReference_Referenced0000Single = eReference_Referenced0000Single;
		eReference_Referenced0000Single = newEReference_Referenced0000Single;
		boolean oldEReference_Referenced0000SingleESet = eReference_Referenced0000SingleESet;
		eReference_Referenced0000SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_REFERENCED0000_SINGLE, oldEReference_Referenced0000Single, eReference_Referenced0000Single, !oldEReference_Referenced0000SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced0000Single() {
		Node oldEReference_Referenced0000Single = eReference_Referenced0000Single;
		boolean oldEReference_Referenced0000SingleESet = eReference_Referenced0000SingleESet;
		eReference_Referenced0000Single = null;
		eReference_Referenced0000SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_REFERENCED0000_SINGLE, oldEReference_Referenced0000Single, null, oldEReference_Referenced0000SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced0000Single() {
		return eReference_Referenced0000SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Referenced0001Single() {
		if (eReference_Referenced0001Single != null && eReference_Referenced0001Single.eIsProxy()) {
			InternalEObject oldEReference_Referenced0001Single = (InternalEObject)eReference_Referenced0001Single;
			eReference_Referenced0001Single = (Node)eResolveProxy(oldEReference_Referenced0001Single);
			if (eReference_Referenced0001Single != oldEReference_Referenced0001Single) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodesPackage.NODE__EREFERENCE_REFERENCED0001_SINGLE, oldEReference_Referenced0001Single, eReference_Referenced0001Single));
			}
		}
		return eReference_Referenced0001Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetEReference_Referenced0001Single() {
		return eReference_Referenced0001Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Referenced0001Single(Node newEReference_Referenced0001Single) {
		Node oldEReference_Referenced0001Single = eReference_Referenced0001Single;
		eReference_Referenced0001Single = newEReference_Referenced0001Single;
		boolean oldEReference_Referenced0001SingleESet = eReference_Referenced0001SingleESet;
		eReference_Referenced0001SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_REFERENCED0001_SINGLE, oldEReference_Referenced0001Single, eReference_Referenced0001Single, !oldEReference_Referenced0001SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced0001Single() {
		Node oldEReference_Referenced0001Single = eReference_Referenced0001Single;
		boolean oldEReference_Referenced0001SingleESet = eReference_Referenced0001SingleESet;
		eReference_Referenced0001Single = null;
		eReference_Referenced0001SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_REFERENCED0001_SINGLE, oldEReference_Referenced0001Single, null, oldEReference_Referenced0001SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced0001Single() {
		return eReference_Referenced0001SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Referenced0010Single() {
		if (eReference_Referenced0010Single != null && eReference_Referenced0010Single.eIsProxy()) {
			InternalEObject oldEReference_Referenced0010Single = (InternalEObject)eReference_Referenced0010Single;
			eReference_Referenced0010Single = (Node)eResolveProxy(oldEReference_Referenced0010Single);
			if (eReference_Referenced0010Single != oldEReference_Referenced0010Single) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodesPackage.NODE__EREFERENCE_REFERENCED0010_SINGLE, oldEReference_Referenced0010Single, eReference_Referenced0010Single));
			}
		}
		return eReference_Referenced0010Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetEReference_Referenced0010Single() {
		return eReference_Referenced0010Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Referenced0010Single(Node newEReference_Referenced0010Single) {
		Node oldEReference_Referenced0010Single = eReference_Referenced0010Single;
		eReference_Referenced0010Single = newEReference_Referenced0010Single;
		boolean oldEReference_Referenced0010SingleESet = eReference_Referenced0010SingleESet;
		eReference_Referenced0010SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_REFERENCED0010_SINGLE, oldEReference_Referenced0010Single, eReference_Referenced0010Single, !oldEReference_Referenced0010SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced0010Single() {
		Node oldEReference_Referenced0010Single = eReference_Referenced0010Single;
		boolean oldEReference_Referenced0010SingleESet = eReference_Referenced0010SingleESet;
		eReference_Referenced0010Single = null;
		eReference_Referenced0010SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_REFERENCED0010_SINGLE, oldEReference_Referenced0010Single, null, oldEReference_Referenced0010SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced0010Single() {
		return eReference_Referenced0010SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Referenced0011Single() {
		if (eReference_Referenced0011Single != null && eReference_Referenced0011Single.eIsProxy()) {
			InternalEObject oldEReference_Referenced0011Single = (InternalEObject)eReference_Referenced0011Single;
			eReference_Referenced0011Single = (Node)eResolveProxy(oldEReference_Referenced0011Single);
			if (eReference_Referenced0011Single != oldEReference_Referenced0011Single) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodesPackage.NODE__EREFERENCE_REFERENCED0011_SINGLE, oldEReference_Referenced0011Single, eReference_Referenced0011Single));
			}
		}
		return eReference_Referenced0011Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetEReference_Referenced0011Single() {
		return eReference_Referenced0011Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Referenced0011Single(Node newEReference_Referenced0011Single) {
		Node oldEReference_Referenced0011Single = eReference_Referenced0011Single;
		eReference_Referenced0011Single = newEReference_Referenced0011Single;
		boolean oldEReference_Referenced0011SingleESet = eReference_Referenced0011SingleESet;
		eReference_Referenced0011SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_REFERENCED0011_SINGLE, oldEReference_Referenced0011Single, eReference_Referenced0011Single, !oldEReference_Referenced0011SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced0011Single() {
		Node oldEReference_Referenced0011Single = eReference_Referenced0011Single;
		boolean oldEReference_Referenced0011SingleESet = eReference_Referenced0011SingleESet;
		eReference_Referenced0011Single = null;
		eReference_Referenced0011SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_REFERENCED0011_SINGLE, oldEReference_Referenced0011Single, null, oldEReference_Referenced0011SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced0011Single() {
		return eReference_Referenced0011SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Referenced0100Single() {
		if (eReference_Referenced0100Single != null && eReference_Referenced0100Single.eIsProxy()) {
			InternalEObject oldEReference_Referenced0100Single = (InternalEObject)eReference_Referenced0100Single;
			eReference_Referenced0100Single = (Node)eResolveProxy(oldEReference_Referenced0100Single);
			if (eReference_Referenced0100Single != oldEReference_Referenced0100Single) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodesPackage.NODE__EREFERENCE_REFERENCED0100_SINGLE, oldEReference_Referenced0100Single, eReference_Referenced0100Single));
			}
		}
		return eReference_Referenced0100Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetEReference_Referenced0100Single() {
		return eReference_Referenced0100Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Referenced0100Single(Node newEReference_Referenced0100Single) {
		Node oldEReference_Referenced0100Single = eReference_Referenced0100Single;
		eReference_Referenced0100Single = newEReference_Referenced0100Single;
		boolean oldEReference_Referenced0100SingleESet = eReference_Referenced0100SingleESet;
		eReference_Referenced0100SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_REFERENCED0100_SINGLE, oldEReference_Referenced0100Single, eReference_Referenced0100Single, !oldEReference_Referenced0100SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced0100Single() {
		Node oldEReference_Referenced0100Single = eReference_Referenced0100Single;
		boolean oldEReference_Referenced0100SingleESet = eReference_Referenced0100SingleESet;
		eReference_Referenced0100Single = null;
		eReference_Referenced0100SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_REFERENCED0100_SINGLE, oldEReference_Referenced0100Single, null, oldEReference_Referenced0100SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced0100Single() {
		return eReference_Referenced0100SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Referenced0101Single() {
		if (eReference_Referenced0101Single != null && eReference_Referenced0101Single.eIsProxy()) {
			InternalEObject oldEReference_Referenced0101Single = (InternalEObject)eReference_Referenced0101Single;
			eReference_Referenced0101Single = (Node)eResolveProxy(oldEReference_Referenced0101Single);
			if (eReference_Referenced0101Single != oldEReference_Referenced0101Single) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodesPackage.NODE__EREFERENCE_REFERENCED0101_SINGLE, oldEReference_Referenced0101Single, eReference_Referenced0101Single));
			}
		}
		return eReference_Referenced0101Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetEReference_Referenced0101Single() {
		return eReference_Referenced0101Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Referenced0101Single(Node newEReference_Referenced0101Single) {
		Node oldEReference_Referenced0101Single = eReference_Referenced0101Single;
		eReference_Referenced0101Single = newEReference_Referenced0101Single;
		boolean oldEReference_Referenced0101SingleESet = eReference_Referenced0101SingleESet;
		eReference_Referenced0101SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_REFERENCED0101_SINGLE, oldEReference_Referenced0101Single, eReference_Referenced0101Single, !oldEReference_Referenced0101SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced0101Single() {
		Node oldEReference_Referenced0101Single = eReference_Referenced0101Single;
		boolean oldEReference_Referenced0101SingleESet = eReference_Referenced0101SingleESet;
		eReference_Referenced0101Single = null;
		eReference_Referenced0101SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_REFERENCED0101_SINGLE, oldEReference_Referenced0101Single, null, oldEReference_Referenced0101SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced0101Single() {
		return eReference_Referenced0101SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Referenced0110Single() {
		if (eReference_Referenced0110Single != null && eReference_Referenced0110Single.eIsProxy()) {
			InternalEObject oldEReference_Referenced0110Single = (InternalEObject)eReference_Referenced0110Single;
			eReference_Referenced0110Single = (Node)eResolveProxy(oldEReference_Referenced0110Single);
			if (eReference_Referenced0110Single != oldEReference_Referenced0110Single) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodesPackage.NODE__EREFERENCE_REFERENCED0110_SINGLE, oldEReference_Referenced0110Single, eReference_Referenced0110Single));
			}
		}
		return eReference_Referenced0110Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetEReference_Referenced0110Single() {
		return eReference_Referenced0110Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Referenced0110Single(Node newEReference_Referenced0110Single) {
		Node oldEReference_Referenced0110Single = eReference_Referenced0110Single;
		eReference_Referenced0110Single = newEReference_Referenced0110Single;
		boolean oldEReference_Referenced0110SingleESet = eReference_Referenced0110SingleESet;
		eReference_Referenced0110SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_REFERENCED0110_SINGLE, oldEReference_Referenced0110Single, eReference_Referenced0110Single, !oldEReference_Referenced0110SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced0110Single() {
		Node oldEReference_Referenced0110Single = eReference_Referenced0110Single;
		boolean oldEReference_Referenced0110SingleESet = eReference_Referenced0110SingleESet;
		eReference_Referenced0110Single = null;
		eReference_Referenced0110SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_REFERENCED0110_SINGLE, oldEReference_Referenced0110Single, null, oldEReference_Referenced0110SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced0110Single() {
		return eReference_Referenced0110SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Referenced0111Single() {
		if (eReference_Referenced0111Single != null && eReference_Referenced0111Single.eIsProxy()) {
			InternalEObject oldEReference_Referenced0111Single = (InternalEObject)eReference_Referenced0111Single;
			eReference_Referenced0111Single = (Node)eResolveProxy(oldEReference_Referenced0111Single);
			if (eReference_Referenced0111Single != oldEReference_Referenced0111Single) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodesPackage.NODE__EREFERENCE_REFERENCED0111_SINGLE, oldEReference_Referenced0111Single, eReference_Referenced0111Single));
			}
		}
		return eReference_Referenced0111Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetEReference_Referenced0111Single() {
		return eReference_Referenced0111Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Referenced0111Single(Node newEReference_Referenced0111Single) {
		Node oldEReference_Referenced0111Single = eReference_Referenced0111Single;
		eReference_Referenced0111Single = newEReference_Referenced0111Single;
		boolean oldEReference_Referenced0111SingleESet = eReference_Referenced0111SingleESet;
		eReference_Referenced0111SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_REFERENCED0111_SINGLE, oldEReference_Referenced0111Single, eReference_Referenced0111Single, !oldEReference_Referenced0111SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced0111Single() {
		Node oldEReference_Referenced0111Single = eReference_Referenced0111Single;
		boolean oldEReference_Referenced0111SingleESet = eReference_Referenced0111SingleESet;
		eReference_Referenced0111Single = null;
		eReference_Referenced0111SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_REFERENCED0111_SINGLE, oldEReference_Referenced0111Single, null, oldEReference_Referenced0111SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced0111Single() {
		return eReference_Referenced0111SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Referenced1000Single() {
		if (eReference_Referenced1000Single != null && eReference_Referenced1000Single.eIsProxy()) {
			InternalEObject oldEReference_Referenced1000Single = (InternalEObject)eReference_Referenced1000Single;
			eReference_Referenced1000Single = (Node)eResolveProxy(oldEReference_Referenced1000Single);
			if (eReference_Referenced1000Single != oldEReference_Referenced1000Single) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodesPackage.NODE__EREFERENCE_REFERENCED1000_SINGLE, oldEReference_Referenced1000Single, eReference_Referenced1000Single));
			}
		}
		return eReference_Referenced1000Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetEReference_Referenced1000Single() {
		return eReference_Referenced1000Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Referenced1000Single(Node newEReference_Referenced1000Single) {
		Node oldEReference_Referenced1000Single = eReference_Referenced1000Single;
		eReference_Referenced1000Single = newEReference_Referenced1000Single;
		boolean oldEReference_Referenced1000SingleESet = eReference_Referenced1000SingleESet;
		eReference_Referenced1000SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_REFERENCED1000_SINGLE, oldEReference_Referenced1000Single, eReference_Referenced1000Single, !oldEReference_Referenced1000SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced1000Single() {
		Node oldEReference_Referenced1000Single = eReference_Referenced1000Single;
		boolean oldEReference_Referenced1000SingleESet = eReference_Referenced1000SingleESet;
		eReference_Referenced1000Single = null;
		eReference_Referenced1000SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_REFERENCED1000_SINGLE, oldEReference_Referenced1000Single, null, oldEReference_Referenced1000SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced1000Single() {
		return eReference_Referenced1000SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Referenced1001Single() {
		if (eReference_Referenced1001Single != null && eReference_Referenced1001Single.eIsProxy()) {
			InternalEObject oldEReference_Referenced1001Single = (InternalEObject)eReference_Referenced1001Single;
			eReference_Referenced1001Single = (Node)eResolveProxy(oldEReference_Referenced1001Single);
			if (eReference_Referenced1001Single != oldEReference_Referenced1001Single) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodesPackage.NODE__EREFERENCE_REFERENCED1001_SINGLE, oldEReference_Referenced1001Single, eReference_Referenced1001Single));
			}
		}
		return eReference_Referenced1001Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetEReference_Referenced1001Single() {
		return eReference_Referenced1001Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Referenced1001Single(Node newEReference_Referenced1001Single) {
		Node oldEReference_Referenced1001Single = eReference_Referenced1001Single;
		eReference_Referenced1001Single = newEReference_Referenced1001Single;
		boolean oldEReference_Referenced1001SingleESet = eReference_Referenced1001SingleESet;
		eReference_Referenced1001SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_REFERENCED1001_SINGLE, oldEReference_Referenced1001Single, eReference_Referenced1001Single, !oldEReference_Referenced1001SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced1001Single() {
		Node oldEReference_Referenced1001Single = eReference_Referenced1001Single;
		boolean oldEReference_Referenced1001SingleESet = eReference_Referenced1001SingleESet;
		eReference_Referenced1001Single = null;
		eReference_Referenced1001SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_REFERENCED1001_SINGLE, oldEReference_Referenced1001Single, null, oldEReference_Referenced1001SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced1001Single() {
		return eReference_Referenced1001SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Referenced1010Single() {
		if (eReference_Referenced1010Single != null && eReference_Referenced1010Single.eIsProxy()) {
			InternalEObject oldEReference_Referenced1010Single = (InternalEObject)eReference_Referenced1010Single;
			eReference_Referenced1010Single = (Node)eResolveProxy(oldEReference_Referenced1010Single);
			if (eReference_Referenced1010Single != oldEReference_Referenced1010Single) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodesPackage.NODE__EREFERENCE_REFERENCED1010_SINGLE, oldEReference_Referenced1010Single, eReference_Referenced1010Single));
			}
		}
		return eReference_Referenced1010Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetEReference_Referenced1010Single() {
		return eReference_Referenced1010Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Referenced1010Single(Node newEReference_Referenced1010Single) {
		Node oldEReference_Referenced1010Single = eReference_Referenced1010Single;
		eReference_Referenced1010Single = newEReference_Referenced1010Single;
		boolean oldEReference_Referenced1010SingleESet = eReference_Referenced1010SingleESet;
		eReference_Referenced1010SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_REFERENCED1010_SINGLE, oldEReference_Referenced1010Single, eReference_Referenced1010Single, !oldEReference_Referenced1010SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced1010Single() {
		Node oldEReference_Referenced1010Single = eReference_Referenced1010Single;
		boolean oldEReference_Referenced1010SingleESet = eReference_Referenced1010SingleESet;
		eReference_Referenced1010Single = null;
		eReference_Referenced1010SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_REFERENCED1010_SINGLE, oldEReference_Referenced1010Single, null, oldEReference_Referenced1010SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced1010Single() {
		return eReference_Referenced1010SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Referenced1011Single() {
		if (eReference_Referenced1011Single != null && eReference_Referenced1011Single.eIsProxy()) {
			InternalEObject oldEReference_Referenced1011Single = (InternalEObject)eReference_Referenced1011Single;
			eReference_Referenced1011Single = (Node)eResolveProxy(oldEReference_Referenced1011Single);
			if (eReference_Referenced1011Single != oldEReference_Referenced1011Single) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodesPackage.NODE__EREFERENCE_REFERENCED1011_SINGLE, oldEReference_Referenced1011Single, eReference_Referenced1011Single));
			}
		}
		return eReference_Referenced1011Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetEReference_Referenced1011Single() {
		return eReference_Referenced1011Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Referenced1011Single(Node newEReference_Referenced1011Single) {
		Node oldEReference_Referenced1011Single = eReference_Referenced1011Single;
		eReference_Referenced1011Single = newEReference_Referenced1011Single;
		boolean oldEReference_Referenced1011SingleESet = eReference_Referenced1011SingleESet;
		eReference_Referenced1011SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_REFERENCED1011_SINGLE, oldEReference_Referenced1011Single, eReference_Referenced1011Single, !oldEReference_Referenced1011SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced1011Single() {
		Node oldEReference_Referenced1011Single = eReference_Referenced1011Single;
		boolean oldEReference_Referenced1011SingleESet = eReference_Referenced1011SingleESet;
		eReference_Referenced1011Single = null;
		eReference_Referenced1011SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_REFERENCED1011_SINGLE, oldEReference_Referenced1011Single, null, oldEReference_Referenced1011SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced1011Single() {
		return eReference_Referenced1011SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Referenced1100Single() {
		if (eReference_Referenced1100Single != null && eReference_Referenced1100Single.eIsProxy()) {
			InternalEObject oldEReference_Referenced1100Single = (InternalEObject)eReference_Referenced1100Single;
			eReference_Referenced1100Single = (Node)eResolveProxy(oldEReference_Referenced1100Single);
			if (eReference_Referenced1100Single != oldEReference_Referenced1100Single) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodesPackage.NODE__EREFERENCE_REFERENCED1100_SINGLE, oldEReference_Referenced1100Single, eReference_Referenced1100Single));
			}
		}
		return eReference_Referenced1100Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetEReference_Referenced1100Single() {
		return eReference_Referenced1100Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Referenced1100Single(Node newEReference_Referenced1100Single) {
		Node oldEReference_Referenced1100Single = eReference_Referenced1100Single;
		eReference_Referenced1100Single = newEReference_Referenced1100Single;
		boolean oldEReference_Referenced1100SingleESet = eReference_Referenced1100SingleESet;
		eReference_Referenced1100SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_REFERENCED1100_SINGLE, oldEReference_Referenced1100Single, eReference_Referenced1100Single, !oldEReference_Referenced1100SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced1100Single() {
		Node oldEReference_Referenced1100Single = eReference_Referenced1100Single;
		boolean oldEReference_Referenced1100SingleESet = eReference_Referenced1100SingleESet;
		eReference_Referenced1100Single = null;
		eReference_Referenced1100SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_REFERENCED1100_SINGLE, oldEReference_Referenced1100Single, null, oldEReference_Referenced1100SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced1100Single() {
		return eReference_Referenced1100SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Referenced1101Single() {
		if (eReference_Referenced1101Single != null && eReference_Referenced1101Single.eIsProxy()) {
			InternalEObject oldEReference_Referenced1101Single = (InternalEObject)eReference_Referenced1101Single;
			eReference_Referenced1101Single = (Node)eResolveProxy(oldEReference_Referenced1101Single);
			if (eReference_Referenced1101Single != oldEReference_Referenced1101Single) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodesPackage.NODE__EREFERENCE_REFERENCED1101_SINGLE, oldEReference_Referenced1101Single, eReference_Referenced1101Single));
			}
		}
		return eReference_Referenced1101Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetEReference_Referenced1101Single() {
		return eReference_Referenced1101Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Referenced1101Single(Node newEReference_Referenced1101Single) {
		Node oldEReference_Referenced1101Single = eReference_Referenced1101Single;
		eReference_Referenced1101Single = newEReference_Referenced1101Single;
		boolean oldEReference_Referenced1101SingleESet = eReference_Referenced1101SingleESet;
		eReference_Referenced1101SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_REFERENCED1101_SINGLE, oldEReference_Referenced1101Single, eReference_Referenced1101Single, !oldEReference_Referenced1101SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced1101Single() {
		Node oldEReference_Referenced1101Single = eReference_Referenced1101Single;
		boolean oldEReference_Referenced1101SingleESet = eReference_Referenced1101SingleESet;
		eReference_Referenced1101Single = null;
		eReference_Referenced1101SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_REFERENCED1101_SINGLE, oldEReference_Referenced1101Single, null, oldEReference_Referenced1101SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced1101Single() {
		return eReference_Referenced1101SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Referenced1110Single() {
		if (eReference_Referenced1110Single != null && eReference_Referenced1110Single.eIsProxy()) {
			InternalEObject oldEReference_Referenced1110Single = (InternalEObject)eReference_Referenced1110Single;
			eReference_Referenced1110Single = (Node)eResolveProxy(oldEReference_Referenced1110Single);
			if (eReference_Referenced1110Single != oldEReference_Referenced1110Single) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodesPackage.NODE__EREFERENCE_REFERENCED1110_SINGLE, oldEReference_Referenced1110Single, eReference_Referenced1110Single));
			}
		}
		return eReference_Referenced1110Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetEReference_Referenced1110Single() {
		return eReference_Referenced1110Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Referenced1110Single(Node newEReference_Referenced1110Single) {
		Node oldEReference_Referenced1110Single = eReference_Referenced1110Single;
		eReference_Referenced1110Single = newEReference_Referenced1110Single;
		boolean oldEReference_Referenced1110SingleESet = eReference_Referenced1110SingleESet;
		eReference_Referenced1110SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_REFERENCED1110_SINGLE, oldEReference_Referenced1110Single, eReference_Referenced1110Single, !oldEReference_Referenced1110SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced1110Single() {
		Node oldEReference_Referenced1110Single = eReference_Referenced1110Single;
		boolean oldEReference_Referenced1110SingleESet = eReference_Referenced1110SingleESet;
		eReference_Referenced1110Single = null;
		eReference_Referenced1110SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_REFERENCED1110_SINGLE, oldEReference_Referenced1110Single, null, oldEReference_Referenced1110SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced1110Single() {
		return eReference_Referenced1110SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getEReference_Referenced1111Single() {
		if (eReference_Referenced1111Single != null && eReference_Referenced1111Single.eIsProxy()) {
			InternalEObject oldEReference_Referenced1111Single = (InternalEObject)eReference_Referenced1111Single;
			eReference_Referenced1111Single = (Node)eResolveProxy(oldEReference_Referenced1111Single);
			if (eReference_Referenced1111Single != oldEReference_Referenced1111Single) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodesPackage.NODE__EREFERENCE_REFERENCED1111_SINGLE, oldEReference_Referenced1111Single, eReference_Referenced1111Single));
			}
		}
		return eReference_Referenced1111Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetEReference_Referenced1111Single() {
		return eReference_Referenced1111Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference_Referenced1111Single(Node newEReference_Referenced1111Single) {
		Node oldEReference_Referenced1111Single = eReference_Referenced1111Single;
		eReference_Referenced1111Single = newEReference_Referenced1111Single;
		boolean oldEReference_Referenced1111SingleESet = eReference_Referenced1111SingleESet;
		eReference_Referenced1111SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EREFERENCE_REFERENCED1111_SINGLE, oldEReference_Referenced1111Single, eReference_Referenced1111Single, !oldEReference_Referenced1111SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced1111Single() {
		Node oldEReference_Referenced1111Single = eReference_Referenced1111Single;
		boolean oldEReference_Referenced1111SingleESet = eReference_Referenced1111SingleESet;
		eReference_Referenced1111Single = null;
		eReference_Referenced1111SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EREFERENCE_REFERENCED1111_SINGLE, oldEReference_Referenced1111Single, null, oldEReference_Referenced1111SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced1111Single() {
		return eReference_Referenced1111SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Referenced0000Many() {
		if (eReference_Referenced0000Many == null) {
			eReference_Referenced0000Many = new EObjectResolvingEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_REFERENCED0000_MANY);
		}
		return eReference_Referenced0000Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced0000Many() {
		if (eReference_Referenced0000Many != null) ((InternalEList.Unsettable<?>)eReference_Referenced0000Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced0000Many() {
		return eReference_Referenced0000Many != null && ((InternalEList.Unsettable<?>)eReference_Referenced0000Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Referenced0001Many() {
		if (eReference_Referenced0001Many == null) {
			eReference_Referenced0001Many = new EObjectResolvingEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_REFERENCED0001_MANY);
		}
		return eReference_Referenced0001Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced0001Many() {
		if (eReference_Referenced0001Many != null) ((InternalEList.Unsettable<?>)eReference_Referenced0001Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced0001Many() {
		return eReference_Referenced0001Many != null && ((InternalEList.Unsettable<?>)eReference_Referenced0001Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Referenced0010Many() {
		if (eReference_Referenced0010Many == null) {
			eReference_Referenced0010Many = new EObjectResolvingEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_REFERENCED0010_MANY);
		}
		return eReference_Referenced0010Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced0010Many() {
		if (eReference_Referenced0010Many != null) ((InternalEList.Unsettable<?>)eReference_Referenced0010Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced0010Many() {
		return eReference_Referenced0010Many != null && ((InternalEList.Unsettable<?>)eReference_Referenced0010Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Referenced0011Many() {
		if (eReference_Referenced0011Many == null) {
			eReference_Referenced0011Many = new EObjectResolvingEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_REFERENCED0011_MANY);
		}
		return eReference_Referenced0011Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced0011Many() {
		if (eReference_Referenced0011Many != null) ((InternalEList.Unsettable<?>)eReference_Referenced0011Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced0011Many() {
		return eReference_Referenced0011Many != null && ((InternalEList.Unsettable<?>)eReference_Referenced0011Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Referenced0100Many() {
		if (eReference_Referenced0100Many == null) {
			eReference_Referenced0100Many = new EObjectResolvingEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_REFERENCED0100_MANY);
		}
		return eReference_Referenced0100Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced0100Many() {
		if (eReference_Referenced0100Many != null) ((InternalEList.Unsettable<?>)eReference_Referenced0100Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced0100Many() {
		return eReference_Referenced0100Many != null && ((InternalEList.Unsettable<?>)eReference_Referenced0100Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Referenced0101Many() {
		if (eReference_Referenced0101Many == null) {
			eReference_Referenced0101Many = new EObjectResolvingEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_REFERENCED0101_MANY);
		}
		return eReference_Referenced0101Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced0101Many() {
		if (eReference_Referenced0101Many != null) ((InternalEList.Unsettable<?>)eReference_Referenced0101Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced0101Many() {
		return eReference_Referenced0101Many != null && ((InternalEList.Unsettable<?>)eReference_Referenced0101Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Referenced0110Many() {
		if (eReference_Referenced0110Many == null) {
			eReference_Referenced0110Many = new EObjectResolvingEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_REFERENCED0110_MANY);
		}
		return eReference_Referenced0110Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced0110Many() {
		if (eReference_Referenced0110Many != null) ((InternalEList.Unsettable<?>)eReference_Referenced0110Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced0110Many() {
		return eReference_Referenced0110Many != null && ((InternalEList.Unsettable<?>)eReference_Referenced0110Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Referenced0111Many() {
		if (eReference_Referenced0111Many == null) {
			eReference_Referenced0111Many = new EObjectResolvingEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_REFERENCED0111_MANY);
		}
		return eReference_Referenced0111Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced0111Many() {
		if (eReference_Referenced0111Many != null) ((InternalEList.Unsettable<?>)eReference_Referenced0111Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced0111Many() {
		return eReference_Referenced0111Many != null && ((InternalEList.Unsettable<?>)eReference_Referenced0111Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Referenced1000Many() {
		if (eReference_Referenced1000Many == null) {
			eReference_Referenced1000Many = new EObjectResolvingEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_REFERENCED1000_MANY);
		}
		return eReference_Referenced1000Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced1000Many() {
		if (eReference_Referenced1000Many != null) ((InternalEList.Unsettable<?>)eReference_Referenced1000Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced1000Many() {
		return eReference_Referenced1000Many != null && ((InternalEList.Unsettable<?>)eReference_Referenced1000Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Referenced1001Many() {
		if (eReference_Referenced1001Many == null) {
			eReference_Referenced1001Many = new EObjectResolvingEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_REFERENCED1001_MANY);
		}
		return eReference_Referenced1001Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced1001Many() {
		if (eReference_Referenced1001Many != null) ((InternalEList.Unsettable<?>)eReference_Referenced1001Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced1001Many() {
		return eReference_Referenced1001Many != null && ((InternalEList.Unsettable<?>)eReference_Referenced1001Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Referenced1010Many() {
		if (eReference_Referenced1010Many == null) {
			eReference_Referenced1010Many = new EObjectResolvingEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_REFERENCED1010_MANY);
		}
		return eReference_Referenced1010Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced1010Many() {
		if (eReference_Referenced1010Many != null) ((InternalEList.Unsettable<?>)eReference_Referenced1010Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced1010Many() {
		return eReference_Referenced1010Many != null && ((InternalEList.Unsettable<?>)eReference_Referenced1010Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Referenced1011Many() {
		if (eReference_Referenced1011Many == null) {
			eReference_Referenced1011Many = new EObjectResolvingEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_REFERENCED1011_MANY);
		}
		return eReference_Referenced1011Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced1011Many() {
		if (eReference_Referenced1011Many != null) ((InternalEList.Unsettable<?>)eReference_Referenced1011Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced1011Many() {
		return eReference_Referenced1011Many != null && ((InternalEList.Unsettable<?>)eReference_Referenced1011Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Referenced1100Many() {
		if (eReference_Referenced1100Many == null) {
			eReference_Referenced1100Many = new EObjectResolvingEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_REFERENCED1100_MANY);
		}
		return eReference_Referenced1100Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced1100Many() {
		if (eReference_Referenced1100Many != null) ((InternalEList.Unsettable<?>)eReference_Referenced1100Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced1100Many() {
		return eReference_Referenced1100Many != null && ((InternalEList.Unsettable<?>)eReference_Referenced1100Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Referenced1101Many() {
		if (eReference_Referenced1101Many == null) {
			eReference_Referenced1101Many = new EObjectResolvingEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_REFERENCED1101_MANY);
		}
		return eReference_Referenced1101Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced1101Many() {
		if (eReference_Referenced1101Many != null) ((InternalEList.Unsettable<?>)eReference_Referenced1101Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced1101Many() {
		return eReference_Referenced1101Many != null && ((InternalEList.Unsettable<?>)eReference_Referenced1101Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Referenced1110Many() {
		if (eReference_Referenced1110Many == null) {
			eReference_Referenced1110Many = new EObjectResolvingEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_REFERENCED1110_MANY);
		}
		return eReference_Referenced1110Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced1110Many() {
		if (eReference_Referenced1110Many != null) ((InternalEList.Unsettable<?>)eReference_Referenced1110Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced1110Many() {
		return eReference_Referenced1110Many != null && ((InternalEList.Unsettable<?>)eReference_Referenced1110Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getEReference_Referenced1111Many() {
		if (eReference_Referenced1111Many == null) {
			eReference_Referenced1111Many = new EObjectResolvingEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__EREFERENCE_REFERENCED1111_MANY);
		}
		return eReference_Referenced1111Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEReference_Referenced1111Many() {
		if (eReference_Referenced1111Many != null) ((InternalEList.Unsettable<?>)eReference_Referenced1111Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEReference_Referenced1111Many() {
		return eReference_Referenced1111Many != null && ((InternalEList.Unsettable<?>)eReference_Referenced1111Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEAttribute_Attribute0000Single() {
		return eAttribute_Attribute0000Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEAttribute_Attribute0000Single(String newEAttribute_Attribute0000Single) {
		String oldEAttribute_Attribute0000Single = eAttribute_Attribute0000Single;
		eAttribute_Attribute0000Single = newEAttribute_Attribute0000Single;
		boolean oldEAttribute_Attribute0000SingleESet = eAttribute_Attribute0000SingleESet;
		eAttribute_Attribute0000SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0000_SINGLE, oldEAttribute_Attribute0000Single, eAttribute_Attribute0000Single, !oldEAttribute_Attribute0000SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute0000Single() {
		String oldEAttribute_Attribute0000Single = eAttribute_Attribute0000Single;
		boolean oldEAttribute_Attribute0000SingleESet = eAttribute_Attribute0000SingleESet;
		eAttribute_Attribute0000Single = EATTRIBUTE_ATTRIBUTE0000_SINGLE_EDEFAULT;
		eAttribute_Attribute0000SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0000_SINGLE, oldEAttribute_Attribute0000Single, EATTRIBUTE_ATTRIBUTE0000_SINGLE_EDEFAULT, oldEAttribute_Attribute0000SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute0000Single() {
		return eAttribute_Attribute0000SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEAttribute_Attribute0001Single() {
		return eAttribute_Attribute0001Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEAttribute_Attribute0001Single(String newEAttribute_Attribute0001Single) {
		String oldEAttribute_Attribute0001Single = eAttribute_Attribute0001Single;
		eAttribute_Attribute0001Single = newEAttribute_Attribute0001Single;
		boolean oldEAttribute_Attribute0001SingleESet = eAttribute_Attribute0001SingleESet;
		eAttribute_Attribute0001SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0001_SINGLE, oldEAttribute_Attribute0001Single, eAttribute_Attribute0001Single, !oldEAttribute_Attribute0001SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute0001Single() {
		String oldEAttribute_Attribute0001Single = eAttribute_Attribute0001Single;
		boolean oldEAttribute_Attribute0001SingleESet = eAttribute_Attribute0001SingleESet;
		eAttribute_Attribute0001Single = EATTRIBUTE_ATTRIBUTE0001_SINGLE_EDEFAULT;
		eAttribute_Attribute0001SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0001_SINGLE, oldEAttribute_Attribute0001Single, EATTRIBUTE_ATTRIBUTE0001_SINGLE_EDEFAULT, oldEAttribute_Attribute0001SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute0001Single() {
		return eAttribute_Attribute0001SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEAttribute_Attribute0010Single() {
		return eAttribute_Attribute0010Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEAttribute_Attribute0010Single(String newEAttribute_Attribute0010Single) {
		String oldEAttribute_Attribute0010Single = eAttribute_Attribute0010Single;
		eAttribute_Attribute0010Single = newEAttribute_Attribute0010Single;
		boolean oldEAttribute_Attribute0010SingleESet = eAttribute_Attribute0010SingleESet;
		eAttribute_Attribute0010SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0010_SINGLE, oldEAttribute_Attribute0010Single, eAttribute_Attribute0010Single, !oldEAttribute_Attribute0010SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute0010Single() {
		String oldEAttribute_Attribute0010Single = eAttribute_Attribute0010Single;
		boolean oldEAttribute_Attribute0010SingleESet = eAttribute_Attribute0010SingleESet;
		eAttribute_Attribute0010Single = EATTRIBUTE_ATTRIBUTE0010_SINGLE_EDEFAULT;
		eAttribute_Attribute0010SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0010_SINGLE, oldEAttribute_Attribute0010Single, EATTRIBUTE_ATTRIBUTE0010_SINGLE_EDEFAULT, oldEAttribute_Attribute0010SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute0010Single() {
		return eAttribute_Attribute0010SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEAttribute_Attribute0011Single() {
		return eAttribute_Attribute0011Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEAttribute_Attribute0011Single(String newEAttribute_Attribute0011Single) {
		String oldEAttribute_Attribute0011Single = eAttribute_Attribute0011Single;
		eAttribute_Attribute0011Single = newEAttribute_Attribute0011Single;
		boolean oldEAttribute_Attribute0011SingleESet = eAttribute_Attribute0011SingleESet;
		eAttribute_Attribute0011SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0011_SINGLE, oldEAttribute_Attribute0011Single, eAttribute_Attribute0011Single, !oldEAttribute_Attribute0011SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute0011Single() {
		String oldEAttribute_Attribute0011Single = eAttribute_Attribute0011Single;
		boolean oldEAttribute_Attribute0011SingleESet = eAttribute_Attribute0011SingleESet;
		eAttribute_Attribute0011Single = EATTRIBUTE_ATTRIBUTE0011_SINGLE_EDEFAULT;
		eAttribute_Attribute0011SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0011_SINGLE, oldEAttribute_Attribute0011Single, EATTRIBUTE_ATTRIBUTE0011_SINGLE_EDEFAULT, oldEAttribute_Attribute0011SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute0011Single() {
		return eAttribute_Attribute0011SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEAttribute_Attribute0100Single() {
		return eAttribute_Attribute0100Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEAttribute_Attribute0100Single(String newEAttribute_Attribute0100Single) {
		String oldEAttribute_Attribute0100Single = eAttribute_Attribute0100Single;
		eAttribute_Attribute0100Single = newEAttribute_Attribute0100Single;
		boolean oldEAttribute_Attribute0100SingleESet = eAttribute_Attribute0100SingleESet;
		eAttribute_Attribute0100SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0100_SINGLE, oldEAttribute_Attribute0100Single, eAttribute_Attribute0100Single, !oldEAttribute_Attribute0100SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute0100Single() {
		String oldEAttribute_Attribute0100Single = eAttribute_Attribute0100Single;
		boolean oldEAttribute_Attribute0100SingleESet = eAttribute_Attribute0100SingleESet;
		eAttribute_Attribute0100Single = EATTRIBUTE_ATTRIBUTE0100_SINGLE_EDEFAULT;
		eAttribute_Attribute0100SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0100_SINGLE, oldEAttribute_Attribute0100Single, EATTRIBUTE_ATTRIBUTE0100_SINGLE_EDEFAULT, oldEAttribute_Attribute0100SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute0100Single() {
		return eAttribute_Attribute0100SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEAttribute_Attribute0101Single() {
		return eAttribute_Attribute0101Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEAttribute_Attribute0101Single(String newEAttribute_Attribute0101Single) {
		String oldEAttribute_Attribute0101Single = eAttribute_Attribute0101Single;
		eAttribute_Attribute0101Single = newEAttribute_Attribute0101Single;
		boolean oldEAttribute_Attribute0101SingleESet = eAttribute_Attribute0101SingleESet;
		eAttribute_Attribute0101SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0101_SINGLE, oldEAttribute_Attribute0101Single, eAttribute_Attribute0101Single, !oldEAttribute_Attribute0101SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute0101Single() {
		String oldEAttribute_Attribute0101Single = eAttribute_Attribute0101Single;
		boolean oldEAttribute_Attribute0101SingleESet = eAttribute_Attribute0101SingleESet;
		eAttribute_Attribute0101Single = EATTRIBUTE_ATTRIBUTE0101_SINGLE_EDEFAULT;
		eAttribute_Attribute0101SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0101_SINGLE, oldEAttribute_Attribute0101Single, EATTRIBUTE_ATTRIBUTE0101_SINGLE_EDEFAULT, oldEAttribute_Attribute0101SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute0101Single() {
		return eAttribute_Attribute0101SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEAttribute_Attribute0110Single() {
		return eAttribute_Attribute0110Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEAttribute_Attribute0110Single(String newEAttribute_Attribute0110Single) {
		String oldEAttribute_Attribute0110Single = eAttribute_Attribute0110Single;
		eAttribute_Attribute0110Single = newEAttribute_Attribute0110Single;
		boolean oldEAttribute_Attribute0110SingleESet = eAttribute_Attribute0110SingleESet;
		eAttribute_Attribute0110SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0110_SINGLE, oldEAttribute_Attribute0110Single, eAttribute_Attribute0110Single, !oldEAttribute_Attribute0110SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute0110Single() {
		String oldEAttribute_Attribute0110Single = eAttribute_Attribute0110Single;
		boolean oldEAttribute_Attribute0110SingleESet = eAttribute_Attribute0110SingleESet;
		eAttribute_Attribute0110Single = EATTRIBUTE_ATTRIBUTE0110_SINGLE_EDEFAULT;
		eAttribute_Attribute0110SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0110_SINGLE, oldEAttribute_Attribute0110Single, EATTRIBUTE_ATTRIBUTE0110_SINGLE_EDEFAULT, oldEAttribute_Attribute0110SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute0110Single() {
		return eAttribute_Attribute0110SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEAttribute_Attribute0111Single() {
		return eAttribute_Attribute0111Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEAttribute_Attribute0111Single(String newEAttribute_Attribute0111Single) {
		String oldEAttribute_Attribute0111Single = eAttribute_Attribute0111Single;
		eAttribute_Attribute0111Single = newEAttribute_Attribute0111Single;
		boolean oldEAttribute_Attribute0111SingleESet = eAttribute_Attribute0111SingleESet;
		eAttribute_Attribute0111SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0111_SINGLE, oldEAttribute_Attribute0111Single, eAttribute_Attribute0111Single, !oldEAttribute_Attribute0111SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute0111Single() {
		String oldEAttribute_Attribute0111Single = eAttribute_Attribute0111Single;
		boolean oldEAttribute_Attribute0111SingleESet = eAttribute_Attribute0111SingleESet;
		eAttribute_Attribute0111Single = EATTRIBUTE_ATTRIBUTE0111_SINGLE_EDEFAULT;
		eAttribute_Attribute0111SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0111_SINGLE, oldEAttribute_Attribute0111Single, EATTRIBUTE_ATTRIBUTE0111_SINGLE_EDEFAULT, oldEAttribute_Attribute0111SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute0111Single() {
		return eAttribute_Attribute0111SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEAttribute_Attribute1000Single() {
		return eAttribute_Attribute1000Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEAttribute_Attribute1000Single(String newEAttribute_Attribute1000Single) {
		String oldEAttribute_Attribute1000Single = eAttribute_Attribute1000Single;
		eAttribute_Attribute1000Single = newEAttribute_Attribute1000Single;
		boolean oldEAttribute_Attribute1000SingleESet = eAttribute_Attribute1000SingleESet;
		eAttribute_Attribute1000SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1000_SINGLE, oldEAttribute_Attribute1000Single, eAttribute_Attribute1000Single, !oldEAttribute_Attribute1000SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute1000Single() {
		String oldEAttribute_Attribute1000Single = eAttribute_Attribute1000Single;
		boolean oldEAttribute_Attribute1000SingleESet = eAttribute_Attribute1000SingleESet;
		eAttribute_Attribute1000Single = EATTRIBUTE_ATTRIBUTE1000_SINGLE_EDEFAULT;
		eAttribute_Attribute1000SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1000_SINGLE, oldEAttribute_Attribute1000Single, EATTRIBUTE_ATTRIBUTE1000_SINGLE_EDEFAULT, oldEAttribute_Attribute1000SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute1000Single() {
		return eAttribute_Attribute1000SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEAttribute_Attribute1001Single() {
		return eAttribute_Attribute1001Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEAttribute_Attribute1001Single(String newEAttribute_Attribute1001Single) {
		String oldEAttribute_Attribute1001Single = eAttribute_Attribute1001Single;
		eAttribute_Attribute1001Single = newEAttribute_Attribute1001Single;
		boolean oldEAttribute_Attribute1001SingleESet = eAttribute_Attribute1001SingleESet;
		eAttribute_Attribute1001SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1001_SINGLE, oldEAttribute_Attribute1001Single, eAttribute_Attribute1001Single, !oldEAttribute_Attribute1001SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute1001Single() {
		String oldEAttribute_Attribute1001Single = eAttribute_Attribute1001Single;
		boolean oldEAttribute_Attribute1001SingleESet = eAttribute_Attribute1001SingleESet;
		eAttribute_Attribute1001Single = EATTRIBUTE_ATTRIBUTE1001_SINGLE_EDEFAULT;
		eAttribute_Attribute1001SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1001_SINGLE, oldEAttribute_Attribute1001Single, EATTRIBUTE_ATTRIBUTE1001_SINGLE_EDEFAULT, oldEAttribute_Attribute1001SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute1001Single() {
		return eAttribute_Attribute1001SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEAttribute_Attribute1010Single() {
		return eAttribute_Attribute1010Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEAttribute_Attribute1010Single(String newEAttribute_Attribute1010Single) {
		String oldEAttribute_Attribute1010Single = eAttribute_Attribute1010Single;
		eAttribute_Attribute1010Single = newEAttribute_Attribute1010Single;
		boolean oldEAttribute_Attribute1010SingleESet = eAttribute_Attribute1010SingleESet;
		eAttribute_Attribute1010SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1010_SINGLE, oldEAttribute_Attribute1010Single, eAttribute_Attribute1010Single, !oldEAttribute_Attribute1010SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute1010Single() {
		String oldEAttribute_Attribute1010Single = eAttribute_Attribute1010Single;
		boolean oldEAttribute_Attribute1010SingleESet = eAttribute_Attribute1010SingleESet;
		eAttribute_Attribute1010Single = EATTRIBUTE_ATTRIBUTE1010_SINGLE_EDEFAULT;
		eAttribute_Attribute1010SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1010_SINGLE, oldEAttribute_Attribute1010Single, EATTRIBUTE_ATTRIBUTE1010_SINGLE_EDEFAULT, oldEAttribute_Attribute1010SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute1010Single() {
		return eAttribute_Attribute1010SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEAttribute_Attribute1011Single() {
		return eAttribute_Attribute1011Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEAttribute_Attribute1011Single(String newEAttribute_Attribute1011Single) {
		String oldEAttribute_Attribute1011Single = eAttribute_Attribute1011Single;
		eAttribute_Attribute1011Single = newEAttribute_Attribute1011Single;
		boolean oldEAttribute_Attribute1011SingleESet = eAttribute_Attribute1011SingleESet;
		eAttribute_Attribute1011SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1011_SINGLE, oldEAttribute_Attribute1011Single, eAttribute_Attribute1011Single, !oldEAttribute_Attribute1011SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute1011Single() {
		String oldEAttribute_Attribute1011Single = eAttribute_Attribute1011Single;
		boolean oldEAttribute_Attribute1011SingleESet = eAttribute_Attribute1011SingleESet;
		eAttribute_Attribute1011Single = EATTRIBUTE_ATTRIBUTE1011_SINGLE_EDEFAULT;
		eAttribute_Attribute1011SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1011_SINGLE, oldEAttribute_Attribute1011Single, EATTRIBUTE_ATTRIBUTE1011_SINGLE_EDEFAULT, oldEAttribute_Attribute1011SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute1011Single() {
		return eAttribute_Attribute1011SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEAttribute_Attribute1100Single() {
		return eAttribute_Attribute1100Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEAttribute_Attribute1100Single(String newEAttribute_Attribute1100Single) {
		String oldEAttribute_Attribute1100Single = eAttribute_Attribute1100Single;
		eAttribute_Attribute1100Single = newEAttribute_Attribute1100Single;
		boolean oldEAttribute_Attribute1100SingleESet = eAttribute_Attribute1100SingleESet;
		eAttribute_Attribute1100SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1100_SINGLE, oldEAttribute_Attribute1100Single, eAttribute_Attribute1100Single, !oldEAttribute_Attribute1100SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute1100Single() {
		String oldEAttribute_Attribute1100Single = eAttribute_Attribute1100Single;
		boolean oldEAttribute_Attribute1100SingleESet = eAttribute_Attribute1100SingleESet;
		eAttribute_Attribute1100Single = EATTRIBUTE_ATTRIBUTE1100_SINGLE_EDEFAULT;
		eAttribute_Attribute1100SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1100_SINGLE, oldEAttribute_Attribute1100Single, EATTRIBUTE_ATTRIBUTE1100_SINGLE_EDEFAULT, oldEAttribute_Attribute1100SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute1100Single() {
		return eAttribute_Attribute1100SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEAttribute_Attribute1101Single() {
		return eAttribute_Attribute1101Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEAttribute_Attribute1101Single(String newEAttribute_Attribute1101Single) {
		String oldEAttribute_Attribute1101Single = eAttribute_Attribute1101Single;
		eAttribute_Attribute1101Single = newEAttribute_Attribute1101Single;
		boolean oldEAttribute_Attribute1101SingleESet = eAttribute_Attribute1101SingleESet;
		eAttribute_Attribute1101SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1101_SINGLE, oldEAttribute_Attribute1101Single, eAttribute_Attribute1101Single, !oldEAttribute_Attribute1101SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute1101Single() {
		String oldEAttribute_Attribute1101Single = eAttribute_Attribute1101Single;
		boolean oldEAttribute_Attribute1101SingleESet = eAttribute_Attribute1101SingleESet;
		eAttribute_Attribute1101Single = EATTRIBUTE_ATTRIBUTE1101_SINGLE_EDEFAULT;
		eAttribute_Attribute1101SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1101_SINGLE, oldEAttribute_Attribute1101Single, EATTRIBUTE_ATTRIBUTE1101_SINGLE_EDEFAULT, oldEAttribute_Attribute1101SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute1101Single() {
		return eAttribute_Attribute1101SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEAttribute_Attribute1110Single() {
		return eAttribute_Attribute1110Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEAttribute_Attribute1110Single(String newEAttribute_Attribute1110Single) {
		String oldEAttribute_Attribute1110Single = eAttribute_Attribute1110Single;
		eAttribute_Attribute1110Single = newEAttribute_Attribute1110Single;
		boolean oldEAttribute_Attribute1110SingleESet = eAttribute_Attribute1110SingleESet;
		eAttribute_Attribute1110SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1110_SINGLE, oldEAttribute_Attribute1110Single, eAttribute_Attribute1110Single, !oldEAttribute_Attribute1110SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute1110Single() {
		String oldEAttribute_Attribute1110Single = eAttribute_Attribute1110Single;
		boolean oldEAttribute_Attribute1110SingleESet = eAttribute_Attribute1110SingleESet;
		eAttribute_Attribute1110Single = EATTRIBUTE_ATTRIBUTE1110_SINGLE_EDEFAULT;
		eAttribute_Attribute1110SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1110_SINGLE, oldEAttribute_Attribute1110Single, EATTRIBUTE_ATTRIBUTE1110_SINGLE_EDEFAULT, oldEAttribute_Attribute1110SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute1110Single() {
		return eAttribute_Attribute1110SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEAttribute_Attribute1111Single() {
		return eAttribute_Attribute1111Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEAttribute_Attribute1111Single(String newEAttribute_Attribute1111Single) {
		String oldEAttribute_Attribute1111Single = eAttribute_Attribute1111Single;
		eAttribute_Attribute1111Single = newEAttribute_Attribute1111Single;
		boolean oldEAttribute_Attribute1111SingleESet = eAttribute_Attribute1111SingleESet;
		eAttribute_Attribute1111SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1111_SINGLE, oldEAttribute_Attribute1111Single, eAttribute_Attribute1111Single, !oldEAttribute_Attribute1111SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute1111Single() {
		String oldEAttribute_Attribute1111Single = eAttribute_Attribute1111Single;
		boolean oldEAttribute_Attribute1111SingleESet = eAttribute_Attribute1111SingleESet;
		eAttribute_Attribute1111Single = EATTRIBUTE_ATTRIBUTE1111_SINGLE_EDEFAULT;
		eAttribute_Attribute1111SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1111_SINGLE, oldEAttribute_Attribute1111Single, EATTRIBUTE_ATTRIBUTE1111_SINGLE_EDEFAULT, oldEAttribute_Attribute1111SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute1111Single() {
		return eAttribute_Attribute1111SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEAttribute_Attribute0000Many() {
		if (eAttribute_Attribute0000Many == null) {
			eAttribute_Attribute0000Many = new EDataTypeUniqueEList.Unsettable<String>(String.class, this, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0000_MANY);
		}
		return eAttribute_Attribute0000Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute0000Many() {
		if (eAttribute_Attribute0000Many != null) ((InternalEList.Unsettable<?>)eAttribute_Attribute0000Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute0000Many() {
		return eAttribute_Attribute0000Many != null && ((InternalEList.Unsettable<?>)eAttribute_Attribute0000Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEAttribute_Attribute0001Many() {
		if (eAttribute_Attribute0001Many == null) {
			eAttribute_Attribute0001Many = new EDataTypeUniqueEList.Unsettable<String>(String.class, this, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0001_MANY);
		}
		return eAttribute_Attribute0001Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute0001Many() {
		if (eAttribute_Attribute0001Many != null) ((InternalEList.Unsettable<?>)eAttribute_Attribute0001Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute0001Many() {
		return eAttribute_Attribute0001Many != null && ((InternalEList.Unsettable<?>)eAttribute_Attribute0001Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEAttribute_Attribute0010Many() {
		if (eAttribute_Attribute0010Many == null) {
			eAttribute_Attribute0010Many = new EDataTypeUniqueEList.Unsettable<String>(String.class, this, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0010_MANY);
		}
		return eAttribute_Attribute0010Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute0010Many() {
		if (eAttribute_Attribute0010Many != null) ((InternalEList.Unsettable<?>)eAttribute_Attribute0010Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute0010Many() {
		return eAttribute_Attribute0010Many != null && ((InternalEList.Unsettable<?>)eAttribute_Attribute0010Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEAttribute_Attribute0011Many() {
		if (eAttribute_Attribute0011Many == null) {
			eAttribute_Attribute0011Many = new EDataTypeUniqueEList.Unsettable<String>(String.class, this, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0011_MANY);
		}
		return eAttribute_Attribute0011Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute0011Many() {
		if (eAttribute_Attribute0011Many != null) ((InternalEList.Unsettable<?>)eAttribute_Attribute0011Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute0011Many() {
		return eAttribute_Attribute0011Many != null && ((InternalEList.Unsettable<?>)eAttribute_Attribute0011Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEAttribute_Attribute0100Many() {
		if (eAttribute_Attribute0100Many == null) {
			eAttribute_Attribute0100Many = new EDataTypeUniqueEList.Unsettable<String>(String.class, this, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0100_MANY);
		}
		return eAttribute_Attribute0100Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute0100Many() {
		if (eAttribute_Attribute0100Many != null) ((InternalEList.Unsettable<?>)eAttribute_Attribute0100Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute0100Many() {
		return eAttribute_Attribute0100Many != null && ((InternalEList.Unsettable<?>)eAttribute_Attribute0100Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEAttribute_Attribute0101Many() {
		if (eAttribute_Attribute0101Many == null) {
			eAttribute_Attribute0101Many = new EDataTypeUniqueEList.Unsettable<String>(String.class, this, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0101_MANY);
		}
		return eAttribute_Attribute0101Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute0101Many() {
		if (eAttribute_Attribute0101Many != null) ((InternalEList.Unsettable<?>)eAttribute_Attribute0101Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute0101Many() {
		return eAttribute_Attribute0101Many != null && ((InternalEList.Unsettable<?>)eAttribute_Attribute0101Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEAttribute_Attribute0110Many() {
		if (eAttribute_Attribute0110Many == null) {
			eAttribute_Attribute0110Many = new EDataTypeUniqueEList.Unsettable<String>(String.class, this, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0110_MANY);
		}
		return eAttribute_Attribute0110Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute0110Many() {
		if (eAttribute_Attribute0110Many != null) ((InternalEList.Unsettable<?>)eAttribute_Attribute0110Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute0110Many() {
		return eAttribute_Attribute0110Many != null && ((InternalEList.Unsettable<?>)eAttribute_Attribute0110Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEAttribute_Attribute0111Many() {
		if (eAttribute_Attribute0111Many == null) {
			eAttribute_Attribute0111Many = new EDataTypeUniqueEList.Unsettable<String>(String.class, this, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0111_MANY);
		}
		return eAttribute_Attribute0111Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute0111Many() {
		if (eAttribute_Attribute0111Many != null) ((InternalEList.Unsettable<?>)eAttribute_Attribute0111Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute0111Many() {
		return eAttribute_Attribute0111Many != null && ((InternalEList.Unsettable<?>)eAttribute_Attribute0111Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEAttribute_Attribute1000Many() {
		if (eAttribute_Attribute1000Many == null) {
			eAttribute_Attribute1000Many = new EDataTypeUniqueEList.Unsettable<String>(String.class, this, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1000_MANY);
		}
		return eAttribute_Attribute1000Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute1000Many() {
		if (eAttribute_Attribute1000Many != null) ((InternalEList.Unsettable<?>)eAttribute_Attribute1000Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute1000Many() {
		return eAttribute_Attribute1000Many != null && ((InternalEList.Unsettable<?>)eAttribute_Attribute1000Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEAttribute_Attribute1001Many() {
		if (eAttribute_Attribute1001Many == null) {
			eAttribute_Attribute1001Many = new EDataTypeUniqueEList.Unsettable<String>(String.class, this, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1001_MANY);
		}
		return eAttribute_Attribute1001Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute1001Many() {
		if (eAttribute_Attribute1001Many != null) ((InternalEList.Unsettable<?>)eAttribute_Attribute1001Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute1001Many() {
		return eAttribute_Attribute1001Many != null && ((InternalEList.Unsettable<?>)eAttribute_Attribute1001Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEAttribute_Attribute1010Many() {
		if (eAttribute_Attribute1010Many == null) {
			eAttribute_Attribute1010Many = new EDataTypeUniqueEList.Unsettable<String>(String.class, this, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1010_MANY);
		}
		return eAttribute_Attribute1010Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute1010Many() {
		if (eAttribute_Attribute1010Many != null) ((InternalEList.Unsettable<?>)eAttribute_Attribute1010Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute1010Many() {
		return eAttribute_Attribute1010Many != null && ((InternalEList.Unsettable<?>)eAttribute_Attribute1010Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEAttribute_Attribute1011Many() {
		if (eAttribute_Attribute1011Many == null) {
			eAttribute_Attribute1011Many = new EDataTypeUniqueEList.Unsettable<String>(String.class, this, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1011_MANY);
		}
		return eAttribute_Attribute1011Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute1011Many() {
		if (eAttribute_Attribute1011Many != null) ((InternalEList.Unsettable<?>)eAttribute_Attribute1011Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute1011Many() {
		return eAttribute_Attribute1011Many != null && ((InternalEList.Unsettable<?>)eAttribute_Attribute1011Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEAttribute_Attribute1100Many() {
		if (eAttribute_Attribute1100Many == null) {
			eAttribute_Attribute1100Many = new EDataTypeUniqueEList.Unsettable<String>(String.class, this, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1100_MANY);
		}
		return eAttribute_Attribute1100Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute1100Many() {
		if (eAttribute_Attribute1100Many != null) ((InternalEList.Unsettable<?>)eAttribute_Attribute1100Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute1100Many() {
		return eAttribute_Attribute1100Many != null && ((InternalEList.Unsettable<?>)eAttribute_Attribute1100Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEAttribute_Attribute1101Many() {
		if (eAttribute_Attribute1101Many == null) {
			eAttribute_Attribute1101Many = new EDataTypeUniqueEList.Unsettable<String>(String.class, this, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1101_MANY);
		}
		return eAttribute_Attribute1101Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute1101Many() {
		if (eAttribute_Attribute1101Many != null) ((InternalEList.Unsettable<?>)eAttribute_Attribute1101Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute1101Many() {
		return eAttribute_Attribute1101Many != null && ((InternalEList.Unsettable<?>)eAttribute_Attribute1101Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEAttribute_Attribute1110Many() {
		if (eAttribute_Attribute1110Many == null) {
			eAttribute_Attribute1110Many = new EDataTypeUniqueEList.Unsettable<String>(String.class, this, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1110_MANY);
		}
		return eAttribute_Attribute1110Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute1110Many() {
		if (eAttribute_Attribute1110Many != null) ((InternalEList.Unsettable<?>)eAttribute_Attribute1110Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute1110Many() {
		return eAttribute_Attribute1110Many != null && ((InternalEList.Unsettable<?>)eAttribute_Attribute1110Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEAttribute_Attribute1111Many() {
		if (eAttribute_Attribute1111Many == null) {
			eAttribute_Attribute1111Many = new EDataTypeUniqueEList.Unsettable<String>(String.class, this, NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1111_MANY);
		}
		return eAttribute_Attribute1111Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEAttribute_Attribute1111Many() {
		if (eAttribute_Attribute1111Many != null) ((InternalEList.Unsettable<?>)eAttribute_Attribute1111Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEAttribute_Attribute1111Many() {
		return eAttribute_Attribute1111Many != null && ((InternalEList.Unsettable<?>)eAttribute_Attribute1111Many).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getReqif_eReference_Referenced0101Single() {
		if (reqif_eReference_Referenced0101Single != null && reqif_eReference_Referenced0101Single.eIsProxy()) {
			InternalEObject oldReqif_eReference_Referenced0101Single = (InternalEObject)reqif_eReference_Referenced0101Single;
			reqif_eReference_Referenced0101Single = (Node)eResolveProxy(oldReqif_eReference_Referenced0101Single);
			if (reqif_eReference_Referenced0101Single != oldReqif_eReference_Referenced0101Single) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NodesPackage.NODE__REQIF_EREFERENCE_REFERENCED0101_SINGLE, oldReqif_eReference_Referenced0101Single, reqif_eReference_Referenced0101Single));
			}
		}
		return reqif_eReference_Referenced0101Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetReqif_eReference_Referenced0101Single() {
		return reqif_eReference_Referenced0101Single;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReqif_eReference_Referenced0101Single(Node newReqif_eReference_Referenced0101Single) {
		Node oldReqif_eReference_Referenced0101Single = reqif_eReference_Referenced0101Single;
		reqif_eReference_Referenced0101Single = newReqif_eReference_Referenced0101Single;
		boolean oldReqif_eReference_Referenced0101SingleESet = reqif_eReference_Referenced0101SingleESet;
		reqif_eReference_Referenced0101SingleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NodesPackage.NODE__REQIF_EREFERENCE_REFERENCED0101_SINGLE, oldReqif_eReference_Referenced0101Single, reqif_eReference_Referenced0101Single, !oldReqif_eReference_Referenced0101SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReqif_eReference_Referenced0101Single() {
		Node oldReqif_eReference_Referenced0101Single = reqif_eReference_Referenced0101Single;
		boolean oldReqif_eReference_Referenced0101SingleESet = reqif_eReference_Referenced0101SingleESet;
		reqif_eReference_Referenced0101Single = null;
		reqif_eReference_Referenced0101SingleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NodesPackage.NODE__REQIF_EREFERENCE_REFERENCED0101_SINGLE, oldReqif_eReference_Referenced0101Single, null, oldReqif_eReference_Referenced0101SingleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReqif_eReference_Referenced0101Single() {
		return reqif_eReference_Referenced0101SingleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getReqif_eReference_Referenced1001Many() {
		if (reqif_eReference_Referenced1001Many == null) {
			reqif_eReference_Referenced1001Many = new EObjectResolvingEList.Unsettable<Node>(Node.class, this, NodesPackage.NODE__REQIF_EREFERENCE_REFERENCED1001_MANY);
		}
		return reqif_eReference_Referenced1001Many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReqif_eReference_Referenced1001Many() {
		if (reqif_eReference_Referenced1001Many != null) ((InternalEList.Unsettable<?>)reqif_eReference_Referenced1001Many).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReqif_eReference_Referenced1001Many() {
		return reqif_eReference_Referenced1001Many != null && ((InternalEList.Unsettable<?>)reqif_eReference_Referenced1001Many).isSet();
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
				return basicUnsetEReference_Contained0000Single(msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED0001_SINGLE:
				return basicUnsetEReference_Contained0001Single(msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED0010_SINGLE:
				return basicUnsetEReference_Contained0010Single(msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED0011_SINGLE:
				return basicUnsetEReference_Contained0011Single(msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED0100_SINGLE:
				return basicUnsetEReference_Contained0100Single(msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED0101_SINGLE:
				return basicUnsetEReference_Contained0101Single(msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED0110_SINGLE:
				return basicUnsetEReference_Contained0110Single(msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED0111_SINGLE:
				return basicUnsetEReference_Contained0111Single(msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED1000_SINGLE:
				return basicUnsetEReference_Contained1000Single(msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED1001_SINGLE:
				return basicUnsetEReference_Contained1001Single(msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED1010_SINGLE:
				return basicUnsetEReference_Contained1010Single(msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED1011_SINGLE:
				return basicUnsetEReference_Contained1011Single(msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED1100_SINGLE:
				return basicUnsetEReference_Contained1100Single(msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED1101_SINGLE:
				return basicUnsetEReference_Contained1101Single(msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED1110_SINGLE:
				return basicUnsetEReference_Contained1110Single(msgs);
			case NodesPackage.NODE__EREFERENCE_CONTAINED1111_SINGLE:
				return basicUnsetEReference_Contained1111Single(msgs);
			case NodesPackage.NODE__EREFERENCE_EMPTY_ANNOTATION_SINGLE:
				return basicUnsetEReference_EmptyAnnotationSingle(msgs);
			case NodesPackage.NODE__EREFERENCE_NO_ANNOTATION_SINGLE:
				return basicUnsetEReference_NoAnnotationSingle(msgs);
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
			case NodesPackage.NODE__EREFERENCE_REFERENCED0000_SINGLE:
				if (resolve) return getEReference_Referenced0000Single();
				return basicGetEReference_Referenced0000Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0001_SINGLE:
				if (resolve) return getEReference_Referenced0001Single();
				return basicGetEReference_Referenced0001Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0010_SINGLE:
				if (resolve) return getEReference_Referenced0010Single();
				return basicGetEReference_Referenced0010Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0011_SINGLE:
				if (resolve) return getEReference_Referenced0011Single();
				return basicGetEReference_Referenced0011Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0100_SINGLE:
				if (resolve) return getEReference_Referenced0100Single();
				return basicGetEReference_Referenced0100Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0101_SINGLE:
				if (resolve) return getEReference_Referenced0101Single();
				return basicGetEReference_Referenced0101Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0110_SINGLE:
				if (resolve) return getEReference_Referenced0110Single();
				return basicGetEReference_Referenced0110Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0111_SINGLE:
				if (resolve) return getEReference_Referenced0111Single();
				return basicGetEReference_Referenced0111Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1000_SINGLE:
				if (resolve) return getEReference_Referenced1000Single();
				return basicGetEReference_Referenced1000Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1001_SINGLE:
				if (resolve) return getEReference_Referenced1001Single();
				return basicGetEReference_Referenced1001Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1010_SINGLE:
				if (resolve) return getEReference_Referenced1010Single();
				return basicGetEReference_Referenced1010Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1011_SINGLE:
				if (resolve) return getEReference_Referenced1011Single();
				return basicGetEReference_Referenced1011Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1100_SINGLE:
				if (resolve) return getEReference_Referenced1100Single();
				return basicGetEReference_Referenced1100Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1101_SINGLE:
				if (resolve) return getEReference_Referenced1101Single();
				return basicGetEReference_Referenced1101Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1110_SINGLE:
				if (resolve) return getEReference_Referenced1110Single();
				return basicGetEReference_Referenced1110Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1111_SINGLE:
				if (resolve) return getEReference_Referenced1111Single();
				return basicGetEReference_Referenced1111Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0000_MANY:
				return getEReference_Referenced0000Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0001_MANY:
				return getEReference_Referenced0001Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0010_MANY:
				return getEReference_Referenced0010Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0011_MANY:
				return getEReference_Referenced0011Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0100_MANY:
				return getEReference_Referenced0100Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0101_MANY:
				return getEReference_Referenced0101Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0110_MANY:
				return getEReference_Referenced0110Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0111_MANY:
				return getEReference_Referenced0111Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1000_MANY:
				return getEReference_Referenced1000Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1001_MANY:
				return getEReference_Referenced1001Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1010_MANY:
				return getEReference_Referenced1010Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1011_MANY:
				return getEReference_Referenced1011Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1100_MANY:
				return getEReference_Referenced1100Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1101_MANY:
				return getEReference_Referenced1101Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1110_MANY:
				return getEReference_Referenced1110Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1111_MANY:
				return getEReference_Referenced1111Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0000_SINGLE:
				return getEAttribute_Attribute0000Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0001_SINGLE:
				return getEAttribute_Attribute0001Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0010_SINGLE:
				return getEAttribute_Attribute0010Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0011_SINGLE:
				return getEAttribute_Attribute0011Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0100_SINGLE:
				return getEAttribute_Attribute0100Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0101_SINGLE:
				return getEAttribute_Attribute0101Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0110_SINGLE:
				return getEAttribute_Attribute0110Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0111_SINGLE:
				return getEAttribute_Attribute0111Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1000_SINGLE:
				return getEAttribute_Attribute1000Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1001_SINGLE:
				return getEAttribute_Attribute1001Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1010_SINGLE:
				return getEAttribute_Attribute1010Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1011_SINGLE:
				return getEAttribute_Attribute1011Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1100_SINGLE:
				return getEAttribute_Attribute1100Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1101_SINGLE:
				return getEAttribute_Attribute1101Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1110_SINGLE:
				return getEAttribute_Attribute1110Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1111_SINGLE:
				return getEAttribute_Attribute1111Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0000_MANY:
				return getEAttribute_Attribute0000Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0001_MANY:
				return getEAttribute_Attribute0001Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0010_MANY:
				return getEAttribute_Attribute0010Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0011_MANY:
				return getEAttribute_Attribute0011Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0100_MANY:
				return getEAttribute_Attribute0100Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0101_MANY:
				return getEAttribute_Attribute0101Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0110_MANY:
				return getEAttribute_Attribute0110Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0111_MANY:
				return getEAttribute_Attribute0111Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1000_MANY:
				return getEAttribute_Attribute1000Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1001_MANY:
				return getEAttribute_Attribute1001Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1010_MANY:
				return getEAttribute_Attribute1010Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1011_MANY:
				return getEAttribute_Attribute1011Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1100_MANY:
				return getEAttribute_Attribute1100Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1101_MANY:
				return getEAttribute_Attribute1101Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1110_MANY:
				return getEAttribute_Attribute1110Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1111_MANY:
				return getEAttribute_Attribute1111Many();
			case NodesPackage.NODE__REQIF_EREFERENCE_REFERENCED0101_SINGLE:
				if (resolve) return getReqif_eReference_Referenced0101Single();
				return basicGetReqif_eReference_Referenced0101Single();
			case NodesPackage.NODE__REQIF_EREFERENCE_REFERENCED1001_MANY:
				return getReqif_eReference_Referenced1001Many();
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
			case NodesPackage.NODE__EREFERENCE_REFERENCED0000_SINGLE:
				setEReference_Referenced0000Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0001_SINGLE:
				setEReference_Referenced0001Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0010_SINGLE:
				setEReference_Referenced0010Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0011_SINGLE:
				setEReference_Referenced0011Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0100_SINGLE:
				setEReference_Referenced0100Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0101_SINGLE:
				setEReference_Referenced0101Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0110_SINGLE:
				setEReference_Referenced0110Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0111_SINGLE:
				setEReference_Referenced0111Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1000_SINGLE:
				setEReference_Referenced1000Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1001_SINGLE:
				setEReference_Referenced1001Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1010_SINGLE:
				setEReference_Referenced1010Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1011_SINGLE:
				setEReference_Referenced1011Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1100_SINGLE:
				setEReference_Referenced1100Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1101_SINGLE:
				setEReference_Referenced1101Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1110_SINGLE:
				setEReference_Referenced1110Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1111_SINGLE:
				setEReference_Referenced1111Single((Node)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0000_MANY:
				getEReference_Referenced0000Many().clear();
				getEReference_Referenced0000Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0001_MANY:
				getEReference_Referenced0001Many().clear();
				getEReference_Referenced0001Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0010_MANY:
				getEReference_Referenced0010Many().clear();
				getEReference_Referenced0010Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0011_MANY:
				getEReference_Referenced0011Many().clear();
				getEReference_Referenced0011Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0100_MANY:
				getEReference_Referenced0100Many().clear();
				getEReference_Referenced0100Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0101_MANY:
				getEReference_Referenced0101Many().clear();
				getEReference_Referenced0101Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0110_MANY:
				getEReference_Referenced0110Many().clear();
				getEReference_Referenced0110Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0111_MANY:
				getEReference_Referenced0111Many().clear();
				getEReference_Referenced0111Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1000_MANY:
				getEReference_Referenced1000Many().clear();
				getEReference_Referenced1000Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1001_MANY:
				getEReference_Referenced1001Many().clear();
				getEReference_Referenced1001Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1010_MANY:
				getEReference_Referenced1010Many().clear();
				getEReference_Referenced1010Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1011_MANY:
				getEReference_Referenced1011Many().clear();
				getEReference_Referenced1011Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1100_MANY:
				getEReference_Referenced1100Many().clear();
				getEReference_Referenced1100Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1101_MANY:
				getEReference_Referenced1101Many().clear();
				getEReference_Referenced1101Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1110_MANY:
				getEReference_Referenced1110Many().clear();
				getEReference_Referenced1110Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1111_MANY:
				getEReference_Referenced1111Many().clear();
				getEReference_Referenced1111Many().addAll((Collection<? extends Node>)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0000_SINGLE:
				setEAttribute_Attribute0000Single((String)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0001_SINGLE:
				setEAttribute_Attribute0001Single((String)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0010_SINGLE:
				setEAttribute_Attribute0010Single((String)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0011_SINGLE:
				setEAttribute_Attribute0011Single((String)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0100_SINGLE:
				setEAttribute_Attribute0100Single((String)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0101_SINGLE:
				setEAttribute_Attribute0101Single((String)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0110_SINGLE:
				setEAttribute_Attribute0110Single((String)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0111_SINGLE:
				setEAttribute_Attribute0111Single((String)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1000_SINGLE:
				setEAttribute_Attribute1000Single((String)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1001_SINGLE:
				setEAttribute_Attribute1001Single((String)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1010_SINGLE:
				setEAttribute_Attribute1010Single((String)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1011_SINGLE:
				setEAttribute_Attribute1011Single((String)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1100_SINGLE:
				setEAttribute_Attribute1100Single((String)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1101_SINGLE:
				setEAttribute_Attribute1101Single((String)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1110_SINGLE:
				setEAttribute_Attribute1110Single((String)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1111_SINGLE:
				setEAttribute_Attribute1111Single((String)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0000_MANY:
				getEAttribute_Attribute0000Many().clear();
				getEAttribute_Attribute0000Many().addAll((Collection<? extends String>)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0001_MANY:
				getEAttribute_Attribute0001Many().clear();
				getEAttribute_Attribute0001Many().addAll((Collection<? extends String>)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0010_MANY:
				getEAttribute_Attribute0010Many().clear();
				getEAttribute_Attribute0010Many().addAll((Collection<? extends String>)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0011_MANY:
				getEAttribute_Attribute0011Many().clear();
				getEAttribute_Attribute0011Many().addAll((Collection<? extends String>)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0100_MANY:
				getEAttribute_Attribute0100Many().clear();
				getEAttribute_Attribute0100Many().addAll((Collection<? extends String>)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0101_MANY:
				getEAttribute_Attribute0101Many().clear();
				getEAttribute_Attribute0101Many().addAll((Collection<? extends String>)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0110_MANY:
				getEAttribute_Attribute0110Many().clear();
				getEAttribute_Attribute0110Many().addAll((Collection<? extends String>)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0111_MANY:
				getEAttribute_Attribute0111Many().clear();
				getEAttribute_Attribute0111Many().addAll((Collection<? extends String>)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1000_MANY:
				getEAttribute_Attribute1000Many().clear();
				getEAttribute_Attribute1000Many().addAll((Collection<? extends String>)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1001_MANY:
				getEAttribute_Attribute1001Many().clear();
				getEAttribute_Attribute1001Many().addAll((Collection<? extends String>)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1010_MANY:
				getEAttribute_Attribute1010Many().clear();
				getEAttribute_Attribute1010Many().addAll((Collection<? extends String>)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1011_MANY:
				getEAttribute_Attribute1011Many().clear();
				getEAttribute_Attribute1011Many().addAll((Collection<? extends String>)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1100_MANY:
				getEAttribute_Attribute1100Many().clear();
				getEAttribute_Attribute1100Many().addAll((Collection<? extends String>)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1101_MANY:
				getEAttribute_Attribute1101Many().clear();
				getEAttribute_Attribute1101Many().addAll((Collection<? extends String>)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1110_MANY:
				getEAttribute_Attribute1110Many().clear();
				getEAttribute_Attribute1110Many().addAll((Collection<? extends String>)newValue);
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1111_MANY:
				getEAttribute_Attribute1111Many().clear();
				getEAttribute_Attribute1111Many().addAll((Collection<? extends String>)newValue);
				return;
			case NodesPackage.NODE__REQIF_EREFERENCE_REFERENCED0101_SINGLE:
				setReqif_eReference_Referenced0101Single((Node)newValue);
				return;
			case NodesPackage.NODE__REQIF_EREFERENCE_REFERENCED1001_MANY:
				getReqif_eReference_Referenced1001Many().clear();
				getReqif_eReference_Referenced1001Many().addAll((Collection<? extends Node>)newValue);
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
				unsetEReference_Contained0000Single();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0001_SINGLE:
				unsetEReference_Contained0001Single();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0010_SINGLE:
				unsetEReference_Contained0010Single();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0011_SINGLE:
				unsetEReference_Contained0011Single();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0100_SINGLE:
				unsetEReference_Contained0100Single();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0101_SINGLE:
				unsetEReference_Contained0101Single();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0110_SINGLE:
				unsetEReference_Contained0110Single();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0111_SINGLE:
				unsetEReference_Contained0111Single();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1000_SINGLE:
				unsetEReference_Contained1000Single();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1001_SINGLE:
				unsetEReference_Contained1001Single();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1010_SINGLE:
				unsetEReference_Contained1010Single();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1011_SINGLE:
				unsetEReference_Contained1011Single();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1100_SINGLE:
				unsetEReference_Contained1100Single();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1101_SINGLE:
				unsetEReference_Contained1101Single();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1110_SINGLE:
				unsetEReference_Contained1110Single();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1111_SINGLE:
				unsetEReference_Contained1111Single();
				return;
			case NodesPackage.NODE__EREFERENCE_EMPTY_ANNOTATION_SINGLE:
				unsetEReference_EmptyAnnotationSingle();
				return;
			case NodesPackage.NODE__EREFERENCE_NO_ANNOTATION_SINGLE:
				unsetEReference_NoAnnotationSingle();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0000_MANY:
				unsetEReference_Contained0000Many();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0001_MANY:
				unsetEReference_Contained0001Many();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0010_MANY:
				unsetEReference_Contained0010Many();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0011_MANY:
				unsetEReference_Contained0011Many();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0100_MANY:
				unsetEReference_Contained0100Many();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0101_MANY:
				unsetEReference_Contained0101Many();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0110_MANY:
				unsetEReference_Contained0110Many();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED0111_MANY:
				unsetEReference_Contained0111Many();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1000_MANY:
				unsetEReference_Contained1000Many();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1001_MANY:
				unsetEReference_Contained1001Many();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1010_MANY:
				unsetEReference_Contained1010Many();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1011_MANY:
				unsetEReference_Contained1011Many();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1100_MANY:
				unsetEReference_Contained1100Many();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1101_MANY:
				unsetEReference_Contained1101Many();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1110_MANY:
				unsetEReference_Contained1110Many();
				return;
			case NodesPackage.NODE__EREFERENCE_CONTAINED1111_MANY:
				unsetEReference_Contained1111Many();
				return;
			case NodesPackage.NODE__EREFERENCE_EMPTY_ANNOTATION_MANY:
				unsetEReference_EmptyAnnotationMany();
				return;
			case NodesPackage.NODE__EREFERENCE_NO_ANNOTATION_MANY:
				unsetEReference_NoAnnotationMany();
				return;
			case NodesPackage.NODE__NAME:
				unsetName();
				return;
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0001_MANY:
				unsetEReference_WithTypeEObject_Contained0001Many();
				return;
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0010_MANY:
				unsetEReference_WithTypeEObject_Contained0010Many();
				return;
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0100_MANY:
				unsetEReference_WithTypeEObject_Contained0100Many();
				return;
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED1000_MANY:
				unsetEReference_WithTypeEObject_Contained1000Many();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0000_SINGLE:
				unsetEReference_Referenced0000Single();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0001_SINGLE:
				unsetEReference_Referenced0001Single();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0010_SINGLE:
				unsetEReference_Referenced0010Single();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0011_SINGLE:
				unsetEReference_Referenced0011Single();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0100_SINGLE:
				unsetEReference_Referenced0100Single();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0101_SINGLE:
				unsetEReference_Referenced0101Single();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0110_SINGLE:
				unsetEReference_Referenced0110Single();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0111_SINGLE:
				unsetEReference_Referenced0111Single();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1000_SINGLE:
				unsetEReference_Referenced1000Single();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1001_SINGLE:
				unsetEReference_Referenced1001Single();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1010_SINGLE:
				unsetEReference_Referenced1010Single();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1011_SINGLE:
				unsetEReference_Referenced1011Single();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1100_SINGLE:
				unsetEReference_Referenced1100Single();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1101_SINGLE:
				unsetEReference_Referenced1101Single();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1110_SINGLE:
				unsetEReference_Referenced1110Single();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1111_SINGLE:
				unsetEReference_Referenced1111Single();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0000_MANY:
				unsetEReference_Referenced0000Many();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0001_MANY:
				unsetEReference_Referenced0001Many();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0010_MANY:
				unsetEReference_Referenced0010Many();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0011_MANY:
				unsetEReference_Referenced0011Many();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0100_MANY:
				unsetEReference_Referenced0100Many();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0101_MANY:
				unsetEReference_Referenced0101Many();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0110_MANY:
				unsetEReference_Referenced0110Many();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED0111_MANY:
				unsetEReference_Referenced0111Many();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1000_MANY:
				unsetEReference_Referenced1000Many();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1001_MANY:
				unsetEReference_Referenced1001Many();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1010_MANY:
				unsetEReference_Referenced1010Many();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1011_MANY:
				unsetEReference_Referenced1011Many();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1100_MANY:
				unsetEReference_Referenced1100Many();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1101_MANY:
				unsetEReference_Referenced1101Many();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1110_MANY:
				unsetEReference_Referenced1110Many();
				return;
			case NodesPackage.NODE__EREFERENCE_REFERENCED1111_MANY:
				unsetEReference_Referenced1111Many();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0000_SINGLE:
				unsetEAttribute_Attribute0000Single();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0001_SINGLE:
				unsetEAttribute_Attribute0001Single();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0010_SINGLE:
				unsetEAttribute_Attribute0010Single();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0011_SINGLE:
				unsetEAttribute_Attribute0011Single();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0100_SINGLE:
				unsetEAttribute_Attribute0100Single();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0101_SINGLE:
				unsetEAttribute_Attribute0101Single();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0110_SINGLE:
				unsetEAttribute_Attribute0110Single();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0111_SINGLE:
				unsetEAttribute_Attribute0111Single();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1000_SINGLE:
				unsetEAttribute_Attribute1000Single();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1001_SINGLE:
				unsetEAttribute_Attribute1001Single();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1010_SINGLE:
				unsetEAttribute_Attribute1010Single();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1011_SINGLE:
				unsetEAttribute_Attribute1011Single();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1100_SINGLE:
				unsetEAttribute_Attribute1100Single();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1101_SINGLE:
				unsetEAttribute_Attribute1101Single();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1110_SINGLE:
				unsetEAttribute_Attribute1110Single();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1111_SINGLE:
				unsetEAttribute_Attribute1111Single();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0000_MANY:
				unsetEAttribute_Attribute0000Many();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0001_MANY:
				unsetEAttribute_Attribute0001Many();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0010_MANY:
				unsetEAttribute_Attribute0010Many();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0011_MANY:
				unsetEAttribute_Attribute0011Many();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0100_MANY:
				unsetEAttribute_Attribute0100Many();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0101_MANY:
				unsetEAttribute_Attribute0101Many();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0110_MANY:
				unsetEAttribute_Attribute0110Many();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0111_MANY:
				unsetEAttribute_Attribute0111Many();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1000_MANY:
				unsetEAttribute_Attribute1000Many();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1001_MANY:
				unsetEAttribute_Attribute1001Many();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1010_MANY:
				unsetEAttribute_Attribute1010Many();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1011_MANY:
				unsetEAttribute_Attribute1011Many();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1100_MANY:
				unsetEAttribute_Attribute1100Many();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1101_MANY:
				unsetEAttribute_Attribute1101Many();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1110_MANY:
				unsetEAttribute_Attribute1110Many();
				return;
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1111_MANY:
				unsetEAttribute_Attribute1111Many();
				return;
			case NodesPackage.NODE__REQIF_EREFERENCE_REFERENCED0101_SINGLE:
				unsetReqif_eReference_Referenced0101Single();
				return;
			case NodesPackage.NODE__REQIF_EREFERENCE_REFERENCED1001_MANY:
				unsetReqif_eReference_Referenced1001Many();
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
				return isSetEReference_Contained0000Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0001_SINGLE:
				return isSetEReference_Contained0001Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0010_SINGLE:
				return isSetEReference_Contained0010Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0011_SINGLE:
				return isSetEReference_Contained0011Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0100_SINGLE:
				return isSetEReference_Contained0100Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0101_SINGLE:
				return isSetEReference_Contained0101Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0110_SINGLE:
				return isSetEReference_Contained0110Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0111_SINGLE:
				return isSetEReference_Contained0111Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1000_SINGLE:
				return isSetEReference_Contained1000Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1001_SINGLE:
				return isSetEReference_Contained1001Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1010_SINGLE:
				return isSetEReference_Contained1010Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1011_SINGLE:
				return isSetEReference_Contained1011Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1100_SINGLE:
				return isSetEReference_Contained1100Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1101_SINGLE:
				return isSetEReference_Contained1101Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1110_SINGLE:
				return isSetEReference_Contained1110Single();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1111_SINGLE:
				return isSetEReference_Contained1111Single();
			case NodesPackage.NODE__EREFERENCE_EMPTY_ANNOTATION_SINGLE:
				return isSetEReference_EmptyAnnotationSingle();
			case NodesPackage.NODE__EREFERENCE_NO_ANNOTATION_SINGLE:
				return isSetEReference_NoAnnotationSingle();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0000_MANY:
				return isSetEReference_Contained0000Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0001_MANY:
				return isSetEReference_Contained0001Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0010_MANY:
				return isSetEReference_Contained0010Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0011_MANY:
				return isSetEReference_Contained0011Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0100_MANY:
				return isSetEReference_Contained0100Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0101_MANY:
				return isSetEReference_Contained0101Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0110_MANY:
				return isSetEReference_Contained0110Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED0111_MANY:
				return isSetEReference_Contained0111Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1000_MANY:
				return isSetEReference_Contained1000Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1001_MANY:
				return isSetEReference_Contained1001Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1010_MANY:
				return isSetEReference_Contained1010Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1011_MANY:
				return isSetEReference_Contained1011Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1100_MANY:
				return isSetEReference_Contained1100Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1101_MANY:
				return isSetEReference_Contained1101Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1110_MANY:
				return isSetEReference_Contained1110Many();
			case NodesPackage.NODE__EREFERENCE_CONTAINED1111_MANY:
				return isSetEReference_Contained1111Many();
			case NodesPackage.NODE__EREFERENCE_EMPTY_ANNOTATION_MANY:
				return isSetEReference_EmptyAnnotationMany();
			case NodesPackage.NODE__EREFERENCE_NO_ANNOTATION_MANY:
				return isSetEReference_NoAnnotationMany();
			case NodesPackage.NODE__NAME:
				return isSetName();
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0001_MANY:
				return isSetEReference_WithTypeEObject_Contained0001Many();
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0010_MANY:
				return isSetEReference_WithTypeEObject_Contained0010Many();
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED0100_MANY:
				return isSetEReference_WithTypeEObject_Contained0100Many();
			case NodesPackage.NODE__EREFERENCE_WITH_TYPE_EOBJECT_CONTAINED1000_MANY:
				return isSetEReference_WithTypeEObject_Contained1000Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0000_SINGLE:
				return isSetEReference_Referenced0000Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0001_SINGLE:
				return isSetEReference_Referenced0001Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0010_SINGLE:
				return isSetEReference_Referenced0010Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0011_SINGLE:
				return isSetEReference_Referenced0011Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0100_SINGLE:
				return isSetEReference_Referenced0100Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0101_SINGLE:
				return isSetEReference_Referenced0101Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0110_SINGLE:
				return isSetEReference_Referenced0110Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0111_SINGLE:
				return isSetEReference_Referenced0111Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1000_SINGLE:
				return isSetEReference_Referenced1000Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1001_SINGLE:
				return isSetEReference_Referenced1001Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1010_SINGLE:
				return isSetEReference_Referenced1010Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1011_SINGLE:
				return isSetEReference_Referenced1011Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1100_SINGLE:
				return isSetEReference_Referenced1100Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1101_SINGLE:
				return isSetEReference_Referenced1101Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1110_SINGLE:
				return isSetEReference_Referenced1110Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1111_SINGLE:
				return isSetEReference_Referenced1111Single();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0000_MANY:
				return isSetEReference_Referenced0000Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0001_MANY:
				return isSetEReference_Referenced0001Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0010_MANY:
				return isSetEReference_Referenced0010Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0011_MANY:
				return isSetEReference_Referenced0011Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0100_MANY:
				return isSetEReference_Referenced0100Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0101_MANY:
				return isSetEReference_Referenced0101Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0110_MANY:
				return isSetEReference_Referenced0110Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED0111_MANY:
				return isSetEReference_Referenced0111Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1000_MANY:
				return isSetEReference_Referenced1000Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1001_MANY:
				return isSetEReference_Referenced1001Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1010_MANY:
				return isSetEReference_Referenced1010Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1011_MANY:
				return isSetEReference_Referenced1011Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1100_MANY:
				return isSetEReference_Referenced1100Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1101_MANY:
				return isSetEReference_Referenced1101Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1110_MANY:
				return isSetEReference_Referenced1110Many();
			case NodesPackage.NODE__EREFERENCE_REFERENCED1111_MANY:
				return isSetEReference_Referenced1111Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0000_SINGLE:
				return isSetEAttribute_Attribute0000Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0001_SINGLE:
				return isSetEAttribute_Attribute0001Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0010_SINGLE:
				return isSetEAttribute_Attribute0010Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0011_SINGLE:
				return isSetEAttribute_Attribute0011Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0100_SINGLE:
				return isSetEAttribute_Attribute0100Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0101_SINGLE:
				return isSetEAttribute_Attribute0101Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0110_SINGLE:
				return isSetEAttribute_Attribute0110Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0111_SINGLE:
				return isSetEAttribute_Attribute0111Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1000_SINGLE:
				return isSetEAttribute_Attribute1000Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1001_SINGLE:
				return isSetEAttribute_Attribute1001Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1010_SINGLE:
				return isSetEAttribute_Attribute1010Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1011_SINGLE:
				return isSetEAttribute_Attribute1011Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1100_SINGLE:
				return isSetEAttribute_Attribute1100Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1101_SINGLE:
				return isSetEAttribute_Attribute1101Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1110_SINGLE:
				return isSetEAttribute_Attribute1110Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1111_SINGLE:
				return isSetEAttribute_Attribute1111Single();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0000_MANY:
				return isSetEAttribute_Attribute0000Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0001_MANY:
				return isSetEAttribute_Attribute0001Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0010_MANY:
				return isSetEAttribute_Attribute0010Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0011_MANY:
				return isSetEAttribute_Attribute0011Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0100_MANY:
				return isSetEAttribute_Attribute0100Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0101_MANY:
				return isSetEAttribute_Attribute0101Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0110_MANY:
				return isSetEAttribute_Attribute0110Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE0111_MANY:
				return isSetEAttribute_Attribute0111Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1000_MANY:
				return isSetEAttribute_Attribute1000Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1001_MANY:
				return isSetEAttribute_Attribute1001Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1010_MANY:
				return isSetEAttribute_Attribute1010Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1011_MANY:
				return isSetEAttribute_Attribute1011Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1100_MANY:
				return isSetEAttribute_Attribute1100Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1101_MANY:
				return isSetEAttribute_Attribute1101Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1110_MANY:
				return isSetEAttribute_Attribute1110Many();
			case NodesPackage.NODE__EATTRIBUTE_ATTRIBUTE1111_MANY:
				return isSetEAttribute_Attribute1111Many();
			case NodesPackage.NODE__REQIF_EREFERENCE_REFERENCED0101_SINGLE:
				return isSetReqif_eReference_Referenced0101Single();
			case NodesPackage.NODE__REQIF_EREFERENCE_REFERENCED1001_MANY:
				return isSetReqif_eReference_Referenced1001Many();
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
		if (nameESet) result.append(name); else result.append("<unset>");
		result.append(", eAttribute_Attribute0000Single: ");
		if (eAttribute_Attribute0000SingleESet) result.append(eAttribute_Attribute0000Single); else result.append("<unset>");
		result.append(", eAttribute_Attribute0001Single: ");
		if (eAttribute_Attribute0001SingleESet) result.append(eAttribute_Attribute0001Single); else result.append("<unset>");
		result.append(", eAttribute_Attribute0010Single: ");
		if (eAttribute_Attribute0010SingleESet) result.append(eAttribute_Attribute0010Single); else result.append("<unset>");
		result.append(", eAttribute_Attribute0011Single: ");
		if (eAttribute_Attribute0011SingleESet) result.append(eAttribute_Attribute0011Single); else result.append("<unset>");
		result.append(", eAttribute_Attribute0100Single: ");
		if (eAttribute_Attribute0100SingleESet) result.append(eAttribute_Attribute0100Single); else result.append("<unset>");
		result.append(", eAttribute_Attribute0101Single: ");
		if (eAttribute_Attribute0101SingleESet) result.append(eAttribute_Attribute0101Single); else result.append("<unset>");
		result.append(", eAttribute_Attribute0110Single: ");
		if (eAttribute_Attribute0110SingleESet) result.append(eAttribute_Attribute0110Single); else result.append("<unset>");
		result.append(", eAttribute_Attribute0111Single: ");
		if (eAttribute_Attribute0111SingleESet) result.append(eAttribute_Attribute0111Single); else result.append("<unset>");
		result.append(", eAttribute_Attribute1000Single: ");
		if (eAttribute_Attribute1000SingleESet) result.append(eAttribute_Attribute1000Single); else result.append("<unset>");
		result.append(", eAttribute_Attribute1001Single: ");
		if (eAttribute_Attribute1001SingleESet) result.append(eAttribute_Attribute1001Single); else result.append("<unset>");
		result.append(", eAttribute_Attribute1010Single: ");
		if (eAttribute_Attribute1010SingleESet) result.append(eAttribute_Attribute1010Single); else result.append("<unset>");
		result.append(", eAttribute_Attribute1011Single: ");
		if (eAttribute_Attribute1011SingleESet) result.append(eAttribute_Attribute1011Single); else result.append("<unset>");
		result.append(", eAttribute_Attribute1100Single: ");
		if (eAttribute_Attribute1100SingleESet) result.append(eAttribute_Attribute1100Single); else result.append("<unset>");
		result.append(", eAttribute_Attribute1101Single: ");
		if (eAttribute_Attribute1101SingleESet) result.append(eAttribute_Attribute1101Single); else result.append("<unset>");
		result.append(", eAttribute_Attribute1110Single: ");
		if (eAttribute_Attribute1110SingleESet) result.append(eAttribute_Attribute1110Single); else result.append("<unset>");
		result.append(", eAttribute_Attribute1111Single: ");
		if (eAttribute_Attribute1111SingleESet) result.append(eAttribute_Attribute1111Single); else result.append("<unset>");
		result.append(", eAttribute_Attribute0000Many: ");
		result.append(eAttribute_Attribute0000Many);
		result.append(", eAttribute_Attribute0001Many: ");
		result.append(eAttribute_Attribute0001Many);
		result.append(", eAttribute_Attribute0010Many: ");
		result.append(eAttribute_Attribute0010Many);
		result.append(", eAttribute_Attribute0011Many: ");
		result.append(eAttribute_Attribute0011Many);
		result.append(", eAttribute_Attribute0100Many: ");
		result.append(eAttribute_Attribute0100Many);
		result.append(", eAttribute_Attribute0101Many: ");
		result.append(eAttribute_Attribute0101Many);
		result.append(", eAttribute_Attribute0110Many: ");
		result.append(eAttribute_Attribute0110Many);
		result.append(", eAttribute_Attribute0111Many: ");
		result.append(eAttribute_Attribute0111Many);
		result.append(", eAttribute_Attribute1000Many: ");
		result.append(eAttribute_Attribute1000Many);
		result.append(", eAttribute_Attribute1001Many: ");
		result.append(eAttribute_Attribute1001Many);
		result.append(", eAttribute_Attribute1010Many: ");
		result.append(eAttribute_Attribute1010Many);
		result.append(", eAttribute_Attribute1011Many: ");
		result.append(eAttribute_Attribute1011Many);
		result.append(", eAttribute_Attribute1100Many: ");
		result.append(eAttribute_Attribute1100Many);
		result.append(", eAttribute_Attribute1101Many: ");
		result.append(eAttribute_Attribute1101Many);
		result.append(", eAttribute_Attribute1110Many: ");
		result.append(eAttribute_Attribute1110Many);
		result.append(", eAttribute_Attribute1111Many: ");
		result.append(eAttribute_Attribute1111Many);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
