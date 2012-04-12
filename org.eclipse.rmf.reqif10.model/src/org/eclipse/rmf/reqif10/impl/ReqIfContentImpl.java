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

package org.eclipse.rmf.reqif10.impl;

import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.RelationGroup;
import org.eclipse.rmf.reqif10.ReqIf;
import org.eclipse.rmf.reqif10.Reqif10Package;
import org.eclipse.rmf.reqif10.ReqIfContent;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.Specification;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIfContentImpl#getDocumentRoot <em>Document Root</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIfContentImpl#getSpecObjects <em>Spec Objects</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIfContentImpl#getSpecifications <em>Specifications</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIfContentImpl#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIfContentImpl#getSpecRelations <em>Spec Relations</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIfContentImpl#getSpecRelationGroups <em>Spec Relation Groups</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIfContentImpl#getSpecTypes <em>Spec Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReqIfContentImpl extends EObjectImpl implements ReqIfContent {
	/**
	 * The cached value of the '{@link #getSpecObjects() <em>Spec Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecObject> specObjects;

	/**
	 * The cached value of the '{@link #getSpecifications() <em>Specifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Specification> specifications;

	/**
	 * The cached value of the '{@link #getDatatypes() <em>Datatypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DatatypeDefinition> datatypes;

	/**
	 * The cached value of the '{@link #getSpecRelations() <em>Spec Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecRelation> specRelations;

	/**
	 * The cached value of the '{@link #getSpecRelationGroups() <em>Spec Relation Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecRelationGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationGroup> specRelationGroups;

	/**
	 * The cached value of the '{@link #getSpecTypes() <em>Spec Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecType> specTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReqIfContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Reqif10Package.Literals.REQ_IF_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqIf getDocumentRoot() {
		if (eContainerFeatureID() != Reqif10Package.REQ_IF_CONTENT__DOCUMENT_ROOT) return null;
		return (ReqIf)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentRoot(ReqIf newDocumentRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDocumentRoot, Reqif10Package.REQ_IF_CONTENT__DOCUMENT_ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentRoot(ReqIf newDocumentRoot) {
		if (newDocumentRoot != eInternalContainer() || (eContainerFeatureID() != Reqif10Package.REQ_IF_CONTENT__DOCUMENT_ROOT && newDocumentRoot != null)) {
			if (EcoreUtil.isAncestor(this, newDocumentRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDocumentRoot != null)
				msgs = ((InternalEObject)newDocumentRoot).eInverseAdd(this, Reqif10Package.REQ_IF__CORE_CONTENT, ReqIf.class, msgs);
			msgs = basicSetDocumentRoot(newDocumentRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.REQ_IF_CONTENT__DOCUMENT_ROOT, newDocumentRoot, newDocumentRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecObject> getSpecObjects() {
		if (specObjects == null) {
			specObjects = new EObjectContainmentWithInverseEList<SpecObject>(SpecObject.class, this, Reqif10Package.REQ_IF_CONTENT__SPEC_OBJECTS, Reqif10Package.SPEC_OBJECT__CORE_CONTENT);
		}
		return specObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specification> getSpecifications() {
		if (specifications == null) {
			specifications = new EObjectContainmentWithInverseEList<Specification>(Specification.class, this, Reqif10Package.REQ_IF_CONTENT__SPECIFICATIONS, Reqif10Package.SPECIFICATION__CORE_CONTENT);
		}
		return specifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeDefinition> getDatatypes() {
		if (datatypes == null) {
			datatypes = new EObjectContainmentWithInverseEList<DatatypeDefinition>(DatatypeDefinition.class, this, Reqif10Package.REQ_IF_CONTENT__DATATYPES, Reqif10Package.DATATYPE_DEFINITION__CORE_CONTENT);
		}
		return datatypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecRelation> getSpecRelations() {
		if (specRelations == null) {
			specRelations = new EObjectContainmentWithInverseEList<SpecRelation>(SpecRelation.class, this, Reqif10Package.REQ_IF_CONTENT__SPEC_RELATIONS, Reqif10Package.SPEC_RELATION__CORE_CONTENT);
		}
		return specRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationGroup> getSpecRelationGroups() {
		if (specRelationGroups == null) {
			specRelationGroups = new EObjectContainmentWithInverseEList<RelationGroup>(RelationGroup.class, this, Reqif10Package.REQ_IF_CONTENT__SPEC_RELATION_GROUPS, Reqif10Package.RELATION_GROUP__CORE_CONTENT);
		}
		return specRelationGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecType> getSpecTypes() {
		if (specTypes == null) {
			specTypes = new EObjectContainmentWithInverseEList<SpecType>(SpecType.class, this, Reqif10Package.REQ_IF_CONTENT__SPEC_TYPES, Reqif10Package.SPEC_TYPE__CORE_CONTENT);
		}
		return specTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Reqif10Package.REQ_IF_CONTENT__DOCUMENT_ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDocumentRoot((ReqIf)otherEnd, msgs);
			case Reqif10Package.REQ_IF_CONTENT__SPEC_OBJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecObjects()).basicAdd(otherEnd, msgs);
			case Reqif10Package.REQ_IF_CONTENT__SPECIFICATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecifications()).basicAdd(otherEnd, msgs);
			case Reqif10Package.REQ_IF_CONTENT__DATATYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDatatypes()).basicAdd(otherEnd, msgs);
			case Reqif10Package.REQ_IF_CONTENT__SPEC_RELATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecRelations()).basicAdd(otherEnd, msgs);
			case Reqif10Package.REQ_IF_CONTENT__SPEC_RELATION_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecRelationGroups()).basicAdd(otherEnd, msgs);
			case Reqif10Package.REQ_IF_CONTENT__SPEC_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecTypes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Reqif10Package.REQ_IF_CONTENT__DOCUMENT_ROOT:
				return basicSetDocumentRoot(null, msgs);
			case Reqif10Package.REQ_IF_CONTENT__SPEC_OBJECTS:
				return ((InternalEList<?>)getSpecObjects()).basicRemove(otherEnd, msgs);
			case Reqif10Package.REQ_IF_CONTENT__SPECIFICATIONS:
				return ((InternalEList<?>)getSpecifications()).basicRemove(otherEnd, msgs);
			case Reqif10Package.REQ_IF_CONTENT__DATATYPES:
				return ((InternalEList<?>)getDatatypes()).basicRemove(otherEnd, msgs);
			case Reqif10Package.REQ_IF_CONTENT__SPEC_RELATIONS:
				return ((InternalEList<?>)getSpecRelations()).basicRemove(otherEnd, msgs);
			case Reqif10Package.REQ_IF_CONTENT__SPEC_RELATION_GROUPS:
				return ((InternalEList<?>)getSpecRelationGroups()).basicRemove(otherEnd, msgs);
			case Reqif10Package.REQ_IF_CONTENT__SPEC_TYPES:
				return ((InternalEList<?>)getSpecTypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Reqif10Package.REQ_IF_CONTENT__DOCUMENT_ROOT:
				return eInternalContainer().eInverseRemove(this, Reqif10Package.REQ_IF__CORE_CONTENT, ReqIf.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Reqif10Package.REQ_IF_CONTENT__DOCUMENT_ROOT:
				return getDocumentRoot();
			case Reqif10Package.REQ_IF_CONTENT__SPEC_OBJECTS:
				return getSpecObjects();
			case Reqif10Package.REQ_IF_CONTENT__SPECIFICATIONS:
				return getSpecifications();
			case Reqif10Package.REQ_IF_CONTENT__DATATYPES:
				return getDatatypes();
			case Reqif10Package.REQ_IF_CONTENT__SPEC_RELATIONS:
				return getSpecRelations();
			case Reqif10Package.REQ_IF_CONTENT__SPEC_RELATION_GROUPS:
				return getSpecRelationGroups();
			case Reqif10Package.REQ_IF_CONTENT__SPEC_TYPES:
				return getSpecTypes();
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
			case Reqif10Package.REQ_IF_CONTENT__DOCUMENT_ROOT:
				setDocumentRoot((ReqIf)newValue);
				return;
			case Reqif10Package.REQ_IF_CONTENT__SPEC_OBJECTS:
				getSpecObjects().clear();
				getSpecObjects().addAll((Collection<? extends SpecObject>)newValue);
				return;
			case Reqif10Package.REQ_IF_CONTENT__SPECIFICATIONS:
				getSpecifications().clear();
				getSpecifications().addAll((Collection<? extends Specification>)newValue);
				return;
			case Reqif10Package.REQ_IF_CONTENT__DATATYPES:
				getDatatypes().clear();
				getDatatypes().addAll((Collection<? extends DatatypeDefinition>)newValue);
				return;
			case Reqif10Package.REQ_IF_CONTENT__SPEC_RELATIONS:
				getSpecRelations().clear();
				getSpecRelations().addAll((Collection<? extends SpecRelation>)newValue);
				return;
			case Reqif10Package.REQ_IF_CONTENT__SPEC_RELATION_GROUPS:
				getSpecRelationGroups().clear();
				getSpecRelationGroups().addAll((Collection<? extends RelationGroup>)newValue);
				return;
			case Reqif10Package.REQ_IF_CONTENT__SPEC_TYPES:
				getSpecTypes().clear();
				getSpecTypes().addAll((Collection<? extends SpecType>)newValue);
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
			case Reqif10Package.REQ_IF_CONTENT__DOCUMENT_ROOT:
				setDocumentRoot((ReqIf)null);
				return;
			case Reqif10Package.REQ_IF_CONTENT__SPEC_OBJECTS:
				getSpecObjects().clear();
				return;
			case Reqif10Package.REQ_IF_CONTENT__SPECIFICATIONS:
				getSpecifications().clear();
				return;
			case Reqif10Package.REQ_IF_CONTENT__DATATYPES:
				getDatatypes().clear();
				return;
			case Reqif10Package.REQ_IF_CONTENT__SPEC_RELATIONS:
				getSpecRelations().clear();
				return;
			case Reqif10Package.REQ_IF_CONTENT__SPEC_RELATION_GROUPS:
				getSpecRelationGroups().clear();
				return;
			case Reqif10Package.REQ_IF_CONTENT__SPEC_TYPES:
				getSpecTypes().clear();
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
			case Reqif10Package.REQ_IF_CONTENT__DOCUMENT_ROOT:
				return getDocumentRoot() != null;
			case Reqif10Package.REQ_IF_CONTENT__SPEC_OBJECTS:
				return specObjects != null && !specObjects.isEmpty();
			case Reqif10Package.REQ_IF_CONTENT__SPECIFICATIONS:
				return specifications != null && !specifications.isEmpty();
			case Reqif10Package.REQ_IF_CONTENT__DATATYPES:
				return datatypes != null && !datatypes.isEmpty();
			case Reqif10Package.REQ_IF_CONTENT__SPEC_RELATIONS:
				return specRelations != null && !specRelations.isEmpty();
			case Reqif10Package.REQ_IF_CONTENT__SPEC_RELATION_GROUPS:
				return specRelationGroups != null && !specRelationGroups.isEmpty();
			case Reqif10Package.REQ_IF_CONTENT__SPEC_TYPES:
				return specTypes != null && !specTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReqIfContentImpl
