/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.reqif10.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.RelationGroup;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.Specification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Req IF Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIFContentImpl#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIFContentImpl#getSpecTypes <em>Spec Types</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIFContentImpl#getSpecObjects <em>Spec Objects</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIFContentImpl#getSpecRelations <em>Spec Relations</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIFContentImpl#getSpecifications <em>Specifications</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIFContentImpl#getSpecRelationGroups <em>Spec Relation Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReqIFContentImpl extends EObjectImpl implements ReqIFContent {
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
	 * The cached value of the '{@link #getSpecTypes() <em>Spec Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecType> specTypes;

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
	 * The cached value of the '{@link #getSpecRelations() <em>Spec Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecRelation> specRelations;

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
	 * The cached value of the '{@link #getSpecRelationGroups() <em>Spec Relation Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecRelationGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationGroup> specRelationGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReqIFContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqIF10Package.Literals.REQ_IF_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeDefinition> getDatatypes() {
		if (datatypes == null) {
			datatypes = new EObjectContainmentEList.Unsettable<DatatypeDefinition>(DatatypeDefinition.class, this, ReqIF10Package.REQ_IF_CONTENT__DATATYPES);
		}
		return datatypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDatatypes() {
		if (datatypes != null) ((InternalEList.Unsettable<?>)datatypes).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDatatypes() {
		return datatypes != null && ((InternalEList.Unsettable<?>)datatypes).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecType> getSpecTypes() {
		if (specTypes == null) {
			specTypes = new EObjectContainmentEList.Unsettable<SpecType>(SpecType.class, this, ReqIF10Package.REQ_IF_CONTENT__SPEC_TYPES);
		}
		return specTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecTypes() {
		if (specTypes != null) ((InternalEList.Unsettable<?>)specTypes).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecTypes() {
		return specTypes != null && ((InternalEList.Unsettable<?>)specTypes).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecObject> getSpecObjects() {
		if (specObjects == null) {
			specObjects = new EObjectContainmentEList.Unsettable<SpecObject>(SpecObject.class, this, ReqIF10Package.REQ_IF_CONTENT__SPEC_OBJECTS);
		}
		return specObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecObjects() {
		if (specObjects != null) ((InternalEList.Unsettable<?>)specObjects).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecObjects() {
		return specObjects != null && ((InternalEList.Unsettable<?>)specObjects).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecRelation> getSpecRelations() {
		if (specRelations == null) {
			specRelations = new EObjectContainmentEList.Unsettable<SpecRelation>(SpecRelation.class, this, ReqIF10Package.REQ_IF_CONTENT__SPEC_RELATIONS);
		}
		return specRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecRelations() {
		if (specRelations != null) ((InternalEList.Unsettable<?>)specRelations).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecRelations() {
		return specRelations != null && ((InternalEList.Unsettable<?>)specRelations).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Specification> getSpecifications() {
		if (specifications == null) {
			specifications = new EObjectContainmentEList.Unsettable<Specification>(Specification.class, this, ReqIF10Package.REQ_IF_CONTENT__SPECIFICATIONS);
		}
		return specifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecifications() {
		if (specifications != null) ((InternalEList.Unsettable<?>)specifications).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecifications() {
		return specifications != null && ((InternalEList.Unsettable<?>)specifications).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationGroup> getSpecRelationGroups() {
		if (specRelationGroups == null) {
			specRelationGroups = new EObjectContainmentEList.Unsettable<RelationGroup>(RelationGroup.class, this, ReqIF10Package.REQ_IF_CONTENT__SPEC_RELATION_GROUPS);
		}
		return specRelationGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecRelationGroups() {
		if (specRelationGroups != null) ((InternalEList.Unsettable<?>)specRelationGroups).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecRelationGroups() {
		return specRelationGroups != null && ((InternalEList.Unsettable<?>)specRelationGroups).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReqIF10Package.REQ_IF_CONTENT__DATATYPES:
				return ((InternalEList<?>)getDatatypes()).basicRemove(otherEnd, msgs);
			case ReqIF10Package.REQ_IF_CONTENT__SPEC_TYPES:
				return ((InternalEList<?>)getSpecTypes()).basicRemove(otherEnd, msgs);
			case ReqIF10Package.REQ_IF_CONTENT__SPEC_OBJECTS:
				return ((InternalEList<?>)getSpecObjects()).basicRemove(otherEnd, msgs);
			case ReqIF10Package.REQ_IF_CONTENT__SPEC_RELATIONS:
				return ((InternalEList<?>)getSpecRelations()).basicRemove(otherEnd, msgs);
			case ReqIF10Package.REQ_IF_CONTENT__SPECIFICATIONS:
				return ((InternalEList<?>)getSpecifications()).basicRemove(otherEnd, msgs);
			case ReqIF10Package.REQ_IF_CONTENT__SPEC_RELATION_GROUPS:
				return ((InternalEList<?>)getSpecRelationGroups()).basicRemove(otherEnd, msgs);
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
			case ReqIF10Package.REQ_IF_CONTENT__DATATYPES:
				return getDatatypes();
			case ReqIF10Package.REQ_IF_CONTENT__SPEC_TYPES:
				return getSpecTypes();
			case ReqIF10Package.REQ_IF_CONTENT__SPEC_OBJECTS:
				return getSpecObjects();
			case ReqIF10Package.REQ_IF_CONTENT__SPEC_RELATIONS:
				return getSpecRelations();
			case ReqIF10Package.REQ_IF_CONTENT__SPECIFICATIONS:
				return getSpecifications();
			case ReqIF10Package.REQ_IF_CONTENT__SPEC_RELATION_GROUPS:
				return getSpecRelationGroups();
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
			case ReqIF10Package.REQ_IF_CONTENT__DATATYPES:
				getDatatypes().clear();
				getDatatypes().addAll((Collection<? extends DatatypeDefinition>)newValue);
				return;
			case ReqIF10Package.REQ_IF_CONTENT__SPEC_TYPES:
				getSpecTypes().clear();
				getSpecTypes().addAll((Collection<? extends SpecType>)newValue);
				return;
			case ReqIF10Package.REQ_IF_CONTENT__SPEC_OBJECTS:
				getSpecObjects().clear();
				getSpecObjects().addAll((Collection<? extends SpecObject>)newValue);
				return;
			case ReqIF10Package.REQ_IF_CONTENT__SPEC_RELATIONS:
				getSpecRelations().clear();
				getSpecRelations().addAll((Collection<? extends SpecRelation>)newValue);
				return;
			case ReqIF10Package.REQ_IF_CONTENT__SPECIFICATIONS:
				getSpecifications().clear();
				getSpecifications().addAll((Collection<? extends Specification>)newValue);
				return;
			case ReqIF10Package.REQ_IF_CONTENT__SPEC_RELATION_GROUPS:
				getSpecRelationGroups().clear();
				getSpecRelationGroups().addAll((Collection<? extends RelationGroup>)newValue);
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
			case ReqIF10Package.REQ_IF_CONTENT__DATATYPES:
				unsetDatatypes();
				return;
			case ReqIF10Package.REQ_IF_CONTENT__SPEC_TYPES:
				unsetSpecTypes();
				return;
			case ReqIF10Package.REQ_IF_CONTENT__SPEC_OBJECTS:
				unsetSpecObjects();
				return;
			case ReqIF10Package.REQ_IF_CONTENT__SPEC_RELATIONS:
				unsetSpecRelations();
				return;
			case ReqIF10Package.REQ_IF_CONTENT__SPECIFICATIONS:
				unsetSpecifications();
				return;
			case ReqIF10Package.REQ_IF_CONTENT__SPEC_RELATION_GROUPS:
				unsetSpecRelationGroups();
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
			case ReqIF10Package.REQ_IF_CONTENT__DATATYPES:
				return isSetDatatypes();
			case ReqIF10Package.REQ_IF_CONTENT__SPEC_TYPES:
				return isSetSpecTypes();
			case ReqIF10Package.REQ_IF_CONTENT__SPEC_OBJECTS:
				return isSetSpecObjects();
			case ReqIF10Package.REQ_IF_CONTENT__SPEC_RELATIONS:
				return isSetSpecRelations();
			case ReqIF10Package.REQ_IF_CONTENT__SPECIFICATIONS:
				return isSetSpecifications();
			case ReqIF10Package.REQ_IF_CONTENT__SPEC_RELATION_GROUPS:
				return isSetSpecRelationGroups();
		}
		return super.eIsSet(featureID);
	}

} //ReqIFContentImpl
