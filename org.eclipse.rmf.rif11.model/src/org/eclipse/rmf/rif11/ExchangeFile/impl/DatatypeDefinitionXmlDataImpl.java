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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionXmlData;
import org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype Definition Xml Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionXmlDataImpl#getNameSpaceURI <em>Name Space URI</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionXmlDataImpl#getSchemaLocation <em>Schema Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatatypeDefinitionXmlDataImpl extends DatatypeDefinitionComplexImpl implements DatatypeDefinitionXmlData {
	/**
	 * The default value of the '{@link #getNameSpaceURI() <em>Name Space URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSpaceURI()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_SPACE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameSpaceURI() <em>Name Space URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameSpaceURI()
	 * @generated
	 * @ordered
	 */
	protected String nameSpaceURI = NAME_SPACE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemaLocation() <em>Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEMA_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchemaLocation() <em>Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected String schemaLocation = SCHEMA_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatatypeDefinitionXmlDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExchangeFilePackage.Literals.DATATYPE_DEFINITION_XML_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameSpaceURI() {
		return nameSpaceURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameSpaceURI(String newNameSpaceURI) {
		String oldNameSpaceURI = nameSpaceURI;
		nameSpaceURI = newNameSpaceURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.DATATYPE_DEFINITION_XML_DATA__NAME_SPACE_URI, oldNameSpaceURI, nameSpaceURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchemaLocation() {
		return schemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaLocation(String newSchemaLocation) {
		String oldSchemaLocation = schemaLocation;
		schemaLocation = newSchemaLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.DATATYPE_DEFINITION_XML_DATA__SCHEMA_LOCATION, oldSchemaLocation, schemaLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExchangeFilePackage.DATATYPE_DEFINITION_XML_DATA__NAME_SPACE_URI:
				return getNameSpaceURI();
			case ExchangeFilePackage.DATATYPE_DEFINITION_XML_DATA__SCHEMA_LOCATION:
				return getSchemaLocation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExchangeFilePackage.DATATYPE_DEFINITION_XML_DATA__NAME_SPACE_URI:
				setNameSpaceURI((String)newValue);
				return;
			case ExchangeFilePackage.DATATYPE_DEFINITION_XML_DATA__SCHEMA_LOCATION:
				setSchemaLocation((String)newValue);
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
			case ExchangeFilePackage.DATATYPE_DEFINITION_XML_DATA__NAME_SPACE_URI:
				setNameSpaceURI(NAME_SPACE_URI_EDEFAULT);
				return;
			case ExchangeFilePackage.DATATYPE_DEFINITION_XML_DATA__SCHEMA_LOCATION:
				setSchemaLocation(SCHEMA_LOCATION_EDEFAULT);
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
			case ExchangeFilePackage.DATATYPE_DEFINITION_XML_DATA__NAME_SPACE_URI:
				return NAME_SPACE_URI_EDEFAULT == null ? nameSpaceURI != null : !NAME_SPACE_URI_EDEFAULT.equals(nameSpaceURI);
			case ExchangeFilePackage.DATATYPE_DEFINITION_XML_DATA__SCHEMA_LOCATION:
				return SCHEMA_LOCATION_EDEFAULT == null ? schemaLocation != null : !SCHEMA_LOCATION_EDEFAULT.equals(schemaLocation);
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
		result.append(" (nameSpaceURI: ");
		result.append(nameSpaceURI);
		result.append(", schemaLocation: ");
		result.append(schemaLocation);
		result.append(')');
		return result.toString();
	}

} //DatatypeDefinitionXmlDataImpl
