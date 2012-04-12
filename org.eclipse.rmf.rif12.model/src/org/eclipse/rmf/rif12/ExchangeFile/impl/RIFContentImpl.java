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

package org.eclipse.rmf.rif12.ExchangeFile.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.rmf.rif12.ExchangeFile.AccessPolicy;
import org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinition;
import org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage;
import org.eclipse.rmf.rif12.ExchangeFile.RIFContent;
import org.eclipse.rmf.rif12.ExchangeFile.SpecGroup;
import org.eclipse.rmf.rif12.ExchangeFile.SpecGroupHierarchyRoot;
import org.eclipse.rmf.rif12.ExchangeFile.SpecHierarchyRoot;
import org.eclipse.rmf.rif12.ExchangeFile.SpecObject;
import org.eclipse.rmf.rif12.ExchangeFile.SpecRelation;
import org.eclipse.rmf.rif12.ExchangeFile.SpecType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RIF Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.RIFContentImpl#getAccessPolicies <em>Access Policies</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.RIFContentImpl#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.RIFContentImpl#getSpecHierarchyRoots <em>Spec Hierarchy Roots</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.RIFContentImpl#getSpecObjects <em>Spec Objects</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.RIFContentImpl#getSpecGroups <em>Spec Groups</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.RIFContentImpl#getSpecGroupHierarchyRoots <em>Spec Group Hierarchy Roots</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.RIFContentImpl#getSpecTypes <em>Spec Types</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.RIFContentImpl#getSpecRelations <em>Spec Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RIFContentImpl extends EObjectImpl implements RIFContent {
	/**
	 * The cached value of the '{@link #getAccessPolicies() <em>Access Policies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<AccessPolicy> accessPolicies;

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
	 * The cached value of the '{@link #getSpecHierarchyRoots() <em>Spec Hierarchy Roots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecHierarchyRoots()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecHierarchyRoot> specHierarchyRoots;

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
	 * The cached value of the '{@link #getSpecGroups() <em>Spec Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecGroup> specGroups;

	/**
	 * The cached value of the '{@link #getSpecGroupHierarchyRoots() <em>Spec Group Hierarchy Roots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecGroupHierarchyRoots()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecGroupHierarchyRoot> specGroupHierarchyRoots;

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
	 * The cached value of the '{@link #getSpecRelations() <em>Spec Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecRelation> specRelations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RIFContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExchangeFilePackage.Literals.RIF_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AccessPolicy> getAccessPolicies() {
		if (accessPolicies == null) {
			accessPolicies = new EObjectContainmentEList<AccessPolicy>(AccessPolicy.class, this, ExchangeFilePackage.RIF_CONTENT__ACCESS_POLICIES);
		}
		return accessPolicies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeDefinition> getDatatypes() {
		if (datatypes == null) {
			datatypes = new EObjectContainmentEList<DatatypeDefinition>(DatatypeDefinition.class, this, ExchangeFilePackage.RIF_CONTENT__DATATYPES);
		}
		return datatypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecHierarchyRoot> getSpecHierarchyRoots() {
		if (specHierarchyRoots == null) {
			specHierarchyRoots = new EObjectContainmentEList<SpecHierarchyRoot>(SpecHierarchyRoot.class, this, ExchangeFilePackage.RIF_CONTENT__SPEC_HIERARCHY_ROOTS);
		}
		return specHierarchyRoots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecObject> getSpecObjects() {
		if (specObjects == null) {
			specObjects = new EObjectContainmentEList<SpecObject>(SpecObject.class, this, ExchangeFilePackage.RIF_CONTENT__SPEC_OBJECTS);
		}
		return specObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecGroup> getSpecGroups() {
		if (specGroups == null) {
			specGroups = new EObjectContainmentEList<SpecGroup>(SpecGroup.class, this, ExchangeFilePackage.RIF_CONTENT__SPEC_GROUPS);
		}
		return specGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecGroupHierarchyRoot> getSpecGroupHierarchyRoots() {
		if (specGroupHierarchyRoots == null) {
			specGroupHierarchyRoots = new EObjectContainmentEList<SpecGroupHierarchyRoot>(SpecGroupHierarchyRoot.class, this, ExchangeFilePackage.RIF_CONTENT__SPEC_GROUP_HIERARCHY_ROOTS);
		}
		return specGroupHierarchyRoots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecType> getSpecTypes() {
		if (specTypes == null) {
			specTypes = new EObjectContainmentEList<SpecType>(SpecType.class, this, ExchangeFilePackage.RIF_CONTENT__SPEC_TYPES);
		}
		return specTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecRelation> getSpecRelations() {
		if (specRelations == null) {
			specRelations = new EObjectContainmentEList<SpecRelation>(SpecRelation.class, this, ExchangeFilePackage.RIF_CONTENT__SPEC_RELATIONS);
		}
		return specRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExchangeFilePackage.RIF_CONTENT__ACCESS_POLICIES:
				return ((InternalEList<?>)getAccessPolicies()).basicRemove(otherEnd, msgs);
			case ExchangeFilePackage.RIF_CONTENT__DATATYPES:
				return ((InternalEList<?>)getDatatypes()).basicRemove(otherEnd, msgs);
			case ExchangeFilePackage.RIF_CONTENT__SPEC_HIERARCHY_ROOTS:
				return ((InternalEList<?>)getSpecHierarchyRoots()).basicRemove(otherEnd, msgs);
			case ExchangeFilePackage.RIF_CONTENT__SPEC_OBJECTS:
				return ((InternalEList<?>)getSpecObjects()).basicRemove(otherEnd, msgs);
			case ExchangeFilePackage.RIF_CONTENT__SPEC_GROUPS:
				return ((InternalEList<?>)getSpecGroups()).basicRemove(otherEnd, msgs);
			case ExchangeFilePackage.RIF_CONTENT__SPEC_GROUP_HIERARCHY_ROOTS:
				return ((InternalEList<?>)getSpecGroupHierarchyRoots()).basicRemove(otherEnd, msgs);
			case ExchangeFilePackage.RIF_CONTENT__SPEC_TYPES:
				return ((InternalEList<?>)getSpecTypes()).basicRemove(otherEnd, msgs);
			case ExchangeFilePackage.RIF_CONTENT__SPEC_RELATIONS:
				return ((InternalEList<?>)getSpecRelations()).basicRemove(otherEnd, msgs);
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
			case ExchangeFilePackage.RIF_CONTENT__ACCESS_POLICIES:
				return getAccessPolicies();
			case ExchangeFilePackage.RIF_CONTENT__DATATYPES:
				return getDatatypes();
			case ExchangeFilePackage.RIF_CONTENT__SPEC_HIERARCHY_ROOTS:
				return getSpecHierarchyRoots();
			case ExchangeFilePackage.RIF_CONTENT__SPEC_OBJECTS:
				return getSpecObjects();
			case ExchangeFilePackage.RIF_CONTENT__SPEC_GROUPS:
				return getSpecGroups();
			case ExchangeFilePackage.RIF_CONTENT__SPEC_GROUP_HIERARCHY_ROOTS:
				return getSpecGroupHierarchyRoots();
			case ExchangeFilePackage.RIF_CONTENT__SPEC_TYPES:
				return getSpecTypes();
			case ExchangeFilePackage.RIF_CONTENT__SPEC_RELATIONS:
				return getSpecRelations();
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
			case ExchangeFilePackage.RIF_CONTENT__ACCESS_POLICIES:
				getAccessPolicies().clear();
				getAccessPolicies().addAll((Collection<? extends AccessPolicy>)newValue);
				return;
			case ExchangeFilePackage.RIF_CONTENT__DATATYPES:
				getDatatypes().clear();
				getDatatypes().addAll((Collection<? extends DatatypeDefinition>)newValue);
				return;
			case ExchangeFilePackage.RIF_CONTENT__SPEC_HIERARCHY_ROOTS:
				getSpecHierarchyRoots().clear();
				getSpecHierarchyRoots().addAll((Collection<? extends SpecHierarchyRoot>)newValue);
				return;
			case ExchangeFilePackage.RIF_CONTENT__SPEC_OBJECTS:
				getSpecObjects().clear();
				getSpecObjects().addAll((Collection<? extends SpecObject>)newValue);
				return;
			case ExchangeFilePackage.RIF_CONTENT__SPEC_GROUPS:
				getSpecGroups().clear();
				getSpecGroups().addAll((Collection<? extends SpecGroup>)newValue);
				return;
			case ExchangeFilePackage.RIF_CONTENT__SPEC_GROUP_HIERARCHY_ROOTS:
				getSpecGroupHierarchyRoots().clear();
				getSpecGroupHierarchyRoots().addAll((Collection<? extends SpecGroupHierarchyRoot>)newValue);
				return;
			case ExchangeFilePackage.RIF_CONTENT__SPEC_TYPES:
				getSpecTypes().clear();
				getSpecTypes().addAll((Collection<? extends SpecType>)newValue);
				return;
			case ExchangeFilePackage.RIF_CONTENT__SPEC_RELATIONS:
				getSpecRelations().clear();
				getSpecRelations().addAll((Collection<? extends SpecRelation>)newValue);
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
			case ExchangeFilePackage.RIF_CONTENT__ACCESS_POLICIES:
				getAccessPolicies().clear();
				return;
			case ExchangeFilePackage.RIF_CONTENT__DATATYPES:
				getDatatypes().clear();
				return;
			case ExchangeFilePackage.RIF_CONTENT__SPEC_HIERARCHY_ROOTS:
				getSpecHierarchyRoots().clear();
				return;
			case ExchangeFilePackage.RIF_CONTENT__SPEC_OBJECTS:
				getSpecObjects().clear();
				return;
			case ExchangeFilePackage.RIF_CONTENT__SPEC_GROUPS:
				getSpecGroups().clear();
				return;
			case ExchangeFilePackage.RIF_CONTENT__SPEC_GROUP_HIERARCHY_ROOTS:
				getSpecGroupHierarchyRoots().clear();
				return;
			case ExchangeFilePackage.RIF_CONTENT__SPEC_TYPES:
				getSpecTypes().clear();
				return;
			case ExchangeFilePackage.RIF_CONTENT__SPEC_RELATIONS:
				getSpecRelations().clear();
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
			case ExchangeFilePackage.RIF_CONTENT__ACCESS_POLICIES:
				return accessPolicies != null && !accessPolicies.isEmpty();
			case ExchangeFilePackage.RIF_CONTENT__DATATYPES:
				return datatypes != null && !datatypes.isEmpty();
			case ExchangeFilePackage.RIF_CONTENT__SPEC_HIERARCHY_ROOTS:
				return specHierarchyRoots != null && !specHierarchyRoots.isEmpty();
			case ExchangeFilePackage.RIF_CONTENT__SPEC_OBJECTS:
				return specObjects != null && !specObjects.isEmpty();
			case ExchangeFilePackage.RIF_CONTENT__SPEC_GROUPS:
				return specGroups != null && !specGroups.isEmpty();
			case ExchangeFilePackage.RIF_CONTENT__SPEC_GROUP_HIERARCHY_ROOTS:
				return specGroupHierarchyRoots != null && !specGroupHierarchyRoots.isEmpty();
			case ExchangeFilePackage.RIF_CONTENT__SPEC_TYPES:
				return specTypes != null && !specTypes.isEmpty();
			case ExchangeFilePackage.RIF_CONTENT__SPEC_RELATIONS:
				return specRelations != null && !specRelations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RIFContentImpl
