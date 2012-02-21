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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeDefinitionSimple;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeValueSimple;
import org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Value Simple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.AttributeValueSimpleImpl#getTheValue <em>The Value</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.AttributeValueSimpleImpl#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeValueSimpleImpl extends AttributeValueImpl implements AttributeValueSimple {
	/**
	 * The default value of the '{@link #getTheValue() <em>The Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheValue()
	 * @generated
	 * @ordered
	 */
	protected static final String THE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTheValue() <em>The Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheValue()
	 * @generated
	 * @ordered
	 */
	protected String theValue = THE_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected AttributeDefinitionSimple definition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueSimpleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExchangeFilePackage.Literals.ATTRIBUTE_VALUE_SIMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTheValue() {
		return theValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheValue(String newTheValue) {
		String oldTheValue = theValue;
		theValue = newTheValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.ATTRIBUTE_VALUE_SIMPLE__THE_VALUE, oldTheValue, theValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionSimple getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (AttributeDefinitionSimple)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExchangeFilePackage.ATTRIBUTE_VALUE_SIMPLE__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionSimple basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(AttributeDefinitionSimple newDefinition) {
		AttributeDefinitionSimple oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.ATTRIBUTE_VALUE_SIMPLE__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExchangeFilePackage.ATTRIBUTE_VALUE_SIMPLE__THE_VALUE:
				return getTheValue();
			case ExchangeFilePackage.ATTRIBUTE_VALUE_SIMPLE__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
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
			case ExchangeFilePackage.ATTRIBUTE_VALUE_SIMPLE__THE_VALUE:
				setTheValue((String)newValue);
				return;
			case ExchangeFilePackage.ATTRIBUTE_VALUE_SIMPLE__DEFINITION:
				setDefinition((AttributeDefinitionSimple)newValue);
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
			case ExchangeFilePackage.ATTRIBUTE_VALUE_SIMPLE__THE_VALUE:
				setTheValue(THE_VALUE_EDEFAULT);
				return;
			case ExchangeFilePackage.ATTRIBUTE_VALUE_SIMPLE__DEFINITION:
				setDefinition((AttributeDefinitionSimple)null);
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
			case ExchangeFilePackage.ATTRIBUTE_VALUE_SIMPLE__THE_VALUE:
				return THE_VALUE_EDEFAULT == null ? theValue != null : !THE_VALUE_EDEFAULT.equals(theValue);
			case ExchangeFilePackage.ATTRIBUTE_VALUE_SIMPLE__DEFINITION:
				return definition != null;
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
		result.append(" (theValue: ");
		result.append(theValue);
		result.append(')');
		return result.toString();
	}

} //AttributeValueSimpleImpl
