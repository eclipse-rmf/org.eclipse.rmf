/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.pror.configuration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.pror.configuration.Column;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage;
import org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pror Spec View Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.configuration.impl.ProrSpecViewConfigurationImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.configuration.impl.ProrSpecViewConfigurationImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.configuration.impl.ProrSpecViewConfigurationImpl#getLeftHeaderColumn <em>Left Header Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProrSpecViewConfigurationImpl extends EObjectImpl implements ProrSpecViewConfiguration {
	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected Specification specification;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> columns;

	/**
	 * The cached value of the '{@link #getLeftHeaderColumn() <em>Left Header Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftHeaderColumn()
	 * @generated
	 * @ordered
	 */
	protected Column leftHeaderColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProrSpecViewConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.PROR_SPEC_VIEW_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification getSpecification() {
		if (specification != null && specification.eIsProxy()) {
			InternalEObject oldSpecification = (InternalEObject)specification;
			specification = (Specification)eResolveProxy(oldSpecification);
			if (specification != oldSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigurationPackage.PROR_SPEC_VIEW_CONFIGURATION__SPECIFICATION, oldSpecification, specification));
			}
		}
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification basicGetSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(Specification newSpecification) {
		Specification oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.PROR_SPEC_VIEW_CONFIGURATION__SPECIFICATION, oldSpecification, specification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<Column>(Column.class, this, ConfigurationPackage.PROR_SPEC_VIEW_CONFIGURATION__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getLeftHeaderColumn() {
		return leftHeaderColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftHeaderColumn(Column newLeftHeaderColumn, NotificationChain msgs) {
		Column oldLeftHeaderColumn = leftHeaderColumn;
		leftHeaderColumn = newLeftHeaderColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.PROR_SPEC_VIEW_CONFIGURATION__LEFT_HEADER_COLUMN, oldLeftHeaderColumn, newLeftHeaderColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftHeaderColumn(Column newLeftHeaderColumn) {
		if (newLeftHeaderColumn != leftHeaderColumn) {
			NotificationChain msgs = null;
			if (leftHeaderColumn != null)
				msgs = ((InternalEObject)leftHeaderColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.PROR_SPEC_VIEW_CONFIGURATION__LEFT_HEADER_COLUMN, null, msgs);
			if (newLeftHeaderColumn != null)
				msgs = ((InternalEObject)newLeftHeaderColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.PROR_SPEC_VIEW_CONFIGURATION__LEFT_HEADER_COLUMN, null, msgs);
			msgs = basicSetLeftHeaderColumn(newLeftHeaderColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.PROR_SPEC_VIEW_CONFIGURATION__LEFT_HEADER_COLUMN, newLeftHeaderColumn, newLeftHeaderColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.PROR_SPEC_VIEW_CONFIGURATION__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.PROR_SPEC_VIEW_CONFIGURATION__LEFT_HEADER_COLUMN:
				return basicSetLeftHeaderColumn(null, msgs);
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
			case ConfigurationPackage.PROR_SPEC_VIEW_CONFIGURATION__SPECIFICATION:
				if (resolve) return getSpecification();
				return basicGetSpecification();
			case ConfigurationPackage.PROR_SPEC_VIEW_CONFIGURATION__COLUMNS:
				return getColumns();
			case ConfigurationPackage.PROR_SPEC_VIEW_CONFIGURATION__LEFT_HEADER_COLUMN:
				return getLeftHeaderColumn();
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
			case ConfigurationPackage.PROR_SPEC_VIEW_CONFIGURATION__SPECIFICATION:
				setSpecification((Specification)newValue);
				return;
			case ConfigurationPackage.PROR_SPEC_VIEW_CONFIGURATION__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case ConfigurationPackage.PROR_SPEC_VIEW_CONFIGURATION__LEFT_HEADER_COLUMN:
				setLeftHeaderColumn((Column)newValue);
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
			case ConfigurationPackage.PROR_SPEC_VIEW_CONFIGURATION__SPECIFICATION:
				setSpecification((Specification)null);
				return;
			case ConfigurationPackage.PROR_SPEC_VIEW_CONFIGURATION__COLUMNS:
				getColumns().clear();
				return;
			case ConfigurationPackage.PROR_SPEC_VIEW_CONFIGURATION__LEFT_HEADER_COLUMN:
				setLeftHeaderColumn((Column)null);
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
			case ConfigurationPackage.PROR_SPEC_VIEW_CONFIGURATION__SPECIFICATION:
				return specification != null;
			case ConfigurationPackage.PROR_SPEC_VIEW_CONFIGURATION__COLUMNS:
				return columns != null && !columns.isEmpty();
			case ConfigurationPackage.PROR_SPEC_VIEW_CONFIGURATION__LEFT_HEADER_COLUMN:
				return leftHeaderColumn != null;
		}
		return super.eIsSet(featureID);
	}

} //ProrSpecViewConfigurationImpl
