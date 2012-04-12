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

package org.eclipse.rmf.rif11.ExchangeFile.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.AccessPolicyAccessModeEnum;
import org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinition;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeValue;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinition;
import org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage;
import org.eclipse.rmf.rif11.ExchangeFile.RelationGroup;
import org.eclipse.rmf.rif11.ExchangeFile.SpecGroup;
import org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchy;
import org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchyRoot;
import org.eclipse.rmf.rif11.ExchangeFile.SpecObject;
import org.eclipse.rmf.rif11.ExchangeFile.SpecRelation;
import org.eclipse.rmf.rif11.ExchangeFile.SpecType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AccessPolicyImpl#getAccessMode <em>Access Mode</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AccessPolicyImpl#getSpecGroups <em>Spec Groups</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AccessPolicyImpl#getAttributeDefinitions <em>Attribute Definitions</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AccessPolicyImpl#getRelationGroups <em>Relation Groups</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AccessPolicyImpl#getDatatypeDefinitions <em>Datatype Definitions</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AccessPolicyImpl#getSpecRelations <em>Spec Relations</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AccessPolicyImpl#getAttributeValues <em>Attribute Values</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AccessPolicyImpl#getSpecTypes <em>Spec Types</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AccessPolicyImpl#getSpecHierarchies <em>Spec Hierarchies</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AccessPolicyImpl#getSpecObjects <em>Spec Objects</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AccessPolicyImpl#getSpecHierarchyRoots <em>Spec Hierarchy Roots</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccessPolicyImpl extends IdentifiableImpl implements AccessPolicy {
	/**
	 * The default value of the '{@link #getAccessMode() <em>Access Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessMode()
	 * @generated
	 * @ordered
	 */
	protected static final AccessPolicyAccessModeEnum ACCESS_MODE_EDEFAULT = AccessPolicyAccessModeEnum.EDIT;

	/**
	 * The cached value of the '{@link #getAccessMode() <em>Access Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessMode()
	 * @generated
	 * @ordered
	 */
	protected AccessPolicyAccessModeEnum accessMode = ACCESS_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecGroups() <em>Spec Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecGroup> specGroups;

	/**
	 * The cached value of the '{@link #getAttributeDefinitions() <em>Attribute Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeDefinition> attributeDefinitions;

	/**
	 * The cached value of the '{@link #getRelationGroups() <em>Relation Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationGroup> relationGroups;

	/**
	 * The cached value of the '{@link #getDatatypeDefinitions() <em>Datatype Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatypeDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<DatatypeDefinition> datatypeDefinitions;

	/**
	 * The cached value of the '{@link #getSpecRelations() <em>Spec Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecRelation> specRelations;

	/**
	 * The cached value of the '{@link #getAttributeValues() <em>Attribute Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeValues()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeValue> attributeValues;

	/**
	 * The cached value of the '{@link #getSpecTypes() <em>Spec Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecType> specTypes;

	/**
	 * The cached value of the '{@link #getSpecHierarchies() <em>Spec Hierarchies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecHierarchies()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecHierarchy> specHierarchies;

	/**
	 * The cached value of the '{@link #getSpecObjects() <em>Spec Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecObject> specObjects;

	/**
	 * The cached value of the '{@link #getSpecHierarchyRoots() <em>Spec Hierarchy Roots</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecHierarchyRoots()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecHierarchyRoot> specHierarchyRoots;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExchangeFilePackage.Literals.ACCESS_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessPolicyAccessModeEnum getAccessMode() {
		return accessMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessMode(AccessPolicyAccessModeEnum newAccessMode) {
		AccessPolicyAccessModeEnum oldAccessMode = accessMode;
		accessMode = newAccessMode == null ? ACCESS_MODE_EDEFAULT : newAccessMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.ACCESS_POLICY__ACCESS_MODE, oldAccessMode, accessMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecGroup> getSpecGroups() {
		if (specGroups == null) {
			specGroups = new EObjectResolvingEList<SpecGroup>(SpecGroup.class, this, ExchangeFilePackage.ACCESS_POLICY__SPEC_GROUPS);
		}
		return specGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeDefinition> getAttributeDefinitions() {
		if (attributeDefinitions == null) {
			attributeDefinitions = new EObjectResolvingEList<AttributeDefinition>(AttributeDefinition.class, this, ExchangeFilePackage.ACCESS_POLICY__ATTRIBUTE_DEFINITIONS);
		}
		return attributeDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationGroup> getRelationGroups() {
		if (relationGroups == null) {
			relationGroups = new EObjectResolvingEList<RelationGroup>(RelationGroup.class, this, ExchangeFilePackage.ACCESS_POLICY__RELATION_GROUPS);
		}
		return relationGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeDefinition> getDatatypeDefinitions() {
		if (datatypeDefinitions == null) {
			datatypeDefinitions = new EObjectResolvingEList<DatatypeDefinition>(DatatypeDefinition.class, this, ExchangeFilePackage.ACCESS_POLICY__DATATYPE_DEFINITIONS);
		}
		return datatypeDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecRelation> getSpecRelations() {
		if (specRelations == null) {
			specRelations = new EObjectResolvingEList<SpecRelation>(SpecRelation.class, this, ExchangeFilePackage.ACCESS_POLICY__SPEC_RELATIONS);
		}
		return specRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeValue> getAttributeValues() {
		if (attributeValues == null) {
			attributeValues = new EObjectResolvingEList<AttributeValue>(AttributeValue.class, this, ExchangeFilePackage.ACCESS_POLICY__ATTRIBUTE_VALUES);
		}
		return attributeValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecType> getSpecTypes() {
		if (specTypes == null) {
			specTypes = new EObjectResolvingEList<SpecType>(SpecType.class, this, ExchangeFilePackage.ACCESS_POLICY__SPEC_TYPES);
		}
		return specTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecHierarchy> getSpecHierarchies() {
		if (specHierarchies == null) {
			specHierarchies = new EObjectResolvingEList<SpecHierarchy>(SpecHierarchy.class, this, ExchangeFilePackage.ACCESS_POLICY__SPEC_HIERARCHIES);
		}
		return specHierarchies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecObject> getSpecObjects() {
		if (specObjects == null) {
			specObjects = new EObjectResolvingEList<SpecObject>(SpecObject.class, this, ExchangeFilePackage.ACCESS_POLICY__SPEC_OBJECTS);
		}
		return specObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecHierarchyRoot> getSpecHierarchyRoots() {
		if (specHierarchyRoots == null) {
			specHierarchyRoots = new EObjectResolvingEList<SpecHierarchyRoot>(SpecHierarchyRoot.class, this, ExchangeFilePackage.ACCESS_POLICY__SPEC_HIERARCHY_ROOTS);
		}
		return specHierarchyRoots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExchangeFilePackage.ACCESS_POLICY__ACCESS_MODE:
				return getAccessMode();
			case ExchangeFilePackage.ACCESS_POLICY__SPEC_GROUPS:
				return getSpecGroups();
			case ExchangeFilePackage.ACCESS_POLICY__ATTRIBUTE_DEFINITIONS:
				return getAttributeDefinitions();
			case ExchangeFilePackage.ACCESS_POLICY__RELATION_GROUPS:
				return getRelationGroups();
			case ExchangeFilePackage.ACCESS_POLICY__DATATYPE_DEFINITIONS:
				return getDatatypeDefinitions();
			case ExchangeFilePackage.ACCESS_POLICY__SPEC_RELATIONS:
				return getSpecRelations();
			case ExchangeFilePackage.ACCESS_POLICY__ATTRIBUTE_VALUES:
				return getAttributeValues();
			case ExchangeFilePackage.ACCESS_POLICY__SPEC_TYPES:
				return getSpecTypes();
			case ExchangeFilePackage.ACCESS_POLICY__SPEC_HIERARCHIES:
				return getSpecHierarchies();
			case ExchangeFilePackage.ACCESS_POLICY__SPEC_OBJECTS:
				return getSpecObjects();
			case ExchangeFilePackage.ACCESS_POLICY__SPEC_HIERARCHY_ROOTS:
				return getSpecHierarchyRoots();
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
			case ExchangeFilePackage.ACCESS_POLICY__ACCESS_MODE:
				setAccessMode((AccessPolicyAccessModeEnum)newValue);
				return;
			case ExchangeFilePackage.ACCESS_POLICY__SPEC_GROUPS:
				getSpecGroups().clear();
				getSpecGroups().addAll((Collection<? extends SpecGroup>)newValue);
				return;
			case ExchangeFilePackage.ACCESS_POLICY__ATTRIBUTE_DEFINITIONS:
				getAttributeDefinitions().clear();
				getAttributeDefinitions().addAll((Collection<? extends AttributeDefinition>)newValue);
				return;
			case ExchangeFilePackage.ACCESS_POLICY__RELATION_GROUPS:
				getRelationGroups().clear();
				getRelationGroups().addAll((Collection<? extends RelationGroup>)newValue);
				return;
			case ExchangeFilePackage.ACCESS_POLICY__DATATYPE_DEFINITIONS:
				getDatatypeDefinitions().clear();
				getDatatypeDefinitions().addAll((Collection<? extends DatatypeDefinition>)newValue);
				return;
			case ExchangeFilePackage.ACCESS_POLICY__SPEC_RELATIONS:
				getSpecRelations().clear();
				getSpecRelations().addAll((Collection<? extends SpecRelation>)newValue);
				return;
			case ExchangeFilePackage.ACCESS_POLICY__ATTRIBUTE_VALUES:
				getAttributeValues().clear();
				getAttributeValues().addAll((Collection<? extends AttributeValue>)newValue);
				return;
			case ExchangeFilePackage.ACCESS_POLICY__SPEC_TYPES:
				getSpecTypes().clear();
				getSpecTypes().addAll((Collection<? extends SpecType>)newValue);
				return;
			case ExchangeFilePackage.ACCESS_POLICY__SPEC_HIERARCHIES:
				getSpecHierarchies().clear();
				getSpecHierarchies().addAll((Collection<? extends SpecHierarchy>)newValue);
				return;
			case ExchangeFilePackage.ACCESS_POLICY__SPEC_OBJECTS:
				getSpecObjects().clear();
				getSpecObjects().addAll((Collection<? extends SpecObject>)newValue);
				return;
			case ExchangeFilePackage.ACCESS_POLICY__SPEC_HIERARCHY_ROOTS:
				getSpecHierarchyRoots().clear();
				getSpecHierarchyRoots().addAll((Collection<? extends SpecHierarchyRoot>)newValue);
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
			case ExchangeFilePackage.ACCESS_POLICY__ACCESS_MODE:
				setAccessMode(ACCESS_MODE_EDEFAULT);
				return;
			case ExchangeFilePackage.ACCESS_POLICY__SPEC_GROUPS:
				getSpecGroups().clear();
				return;
			case ExchangeFilePackage.ACCESS_POLICY__ATTRIBUTE_DEFINITIONS:
				getAttributeDefinitions().clear();
				return;
			case ExchangeFilePackage.ACCESS_POLICY__RELATION_GROUPS:
				getRelationGroups().clear();
				return;
			case ExchangeFilePackage.ACCESS_POLICY__DATATYPE_DEFINITIONS:
				getDatatypeDefinitions().clear();
				return;
			case ExchangeFilePackage.ACCESS_POLICY__SPEC_RELATIONS:
				getSpecRelations().clear();
				return;
			case ExchangeFilePackage.ACCESS_POLICY__ATTRIBUTE_VALUES:
				getAttributeValues().clear();
				return;
			case ExchangeFilePackage.ACCESS_POLICY__SPEC_TYPES:
				getSpecTypes().clear();
				return;
			case ExchangeFilePackage.ACCESS_POLICY__SPEC_HIERARCHIES:
				getSpecHierarchies().clear();
				return;
			case ExchangeFilePackage.ACCESS_POLICY__SPEC_OBJECTS:
				getSpecObjects().clear();
				return;
			case ExchangeFilePackage.ACCESS_POLICY__SPEC_HIERARCHY_ROOTS:
				getSpecHierarchyRoots().clear();
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
			case ExchangeFilePackage.ACCESS_POLICY__ACCESS_MODE:
				return accessMode != ACCESS_MODE_EDEFAULT;
			case ExchangeFilePackage.ACCESS_POLICY__SPEC_GROUPS:
				return specGroups != null && !specGroups.isEmpty();
			case ExchangeFilePackage.ACCESS_POLICY__ATTRIBUTE_DEFINITIONS:
				return attributeDefinitions != null && !attributeDefinitions.isEmpty();
			case ExchangeFilePackage.ACCESS_POLICY__RELATION_GROUPS:
				return relationGroups != null && !relationGroups.isEmpty();
			case ExchangeFilePackage.ACCESS_POLICY__DATATYPE_DEFINITIONS:
				return datatypeDefinitions != null && !datatypeDefinitions.isEmpty();
			case ExchangeFilePackage.ACCESS_POLICY__SPEC_RELATIONS:
				return specRelations != null && !specRelations.isEmpty();
			case ExchangeFilePackage.ACCESS_POLICY__ATTRIBUTE_VALUES:
				return attributeValues != null && !attributeValues.isEmpty();
			case ExchangeFilePackage.ACCESS_POLICY__SPEC_TYPES:
				return specTypes != null && !specTypes.isEmpty();
			case ExchangeFilePackage.ACCESS_POLICY__SPEC_HIERARCHIES:
				return specHierarchies != null && !specHierarchies.isEmpty();
			case ExchangeFilePackage.ACCESS_POLICY__SPEC_OBJECTS:
				return specObjects != null && !specObjects.isEmpty();
			case ExchangeFilePackage.ACCESS_POLICY__SPEC_HIERARCHY_ROOTS:
				return specHierarchyRoots != null && !specHierarchyRoots.isEmpty();
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
		result.append(" (accessMode: ");
		result.append(accessMode);
		result.append(')');
		return result.toString();
	}

} //AccessPolicyImpl
