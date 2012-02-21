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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.rmf.rif12.DataTypes.BinaryContent;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeDefinitionComplex;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeValueEmbeddedFile;
import org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Value Embedded File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.AttributeValueEmbeddedFileImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.AttributeValueEmbeddedFileImpl#getBinaryContent <em>Binary Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeValueEmbeddedFileImpl extends AttributeValueComplexImpl implements AttributeValueEmbeddedFile {
	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected AttributeDefinitionComplex definition;

	/**
	 * The cached value of the '{@link #getBinaryContent() <em>Binary Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaryContent()
	 * @generated
	 * @ordered
	 */
	protected BinaryContent binaryContent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueEmbeddedFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExchangeFilePackage.Literals.ATTRIBUTE_VALUE_EMBEDDED_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionComplex getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (AttributeDefinitionComplex)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionComplex basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(AttributeDefinitionComplex newDefinition) {
		AttributeDefinitionComplex oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryContent getBinaryContent() {
		return binaryContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaryContent(BinaryContent newBinaryContent, NotificationChain msgs) {
		BinaryContent oldBinaryContent = binaryContent;
		binaryContent = newBinaryContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__BINARY_CONTENT, oldBinaryContent, newBinaryContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinaryContent(BinaryContent newBinaryContent) {
		if (newBinaryContent != binaryContent) {
			NotificationChain msgs = null;
			if (binaryContent != null)
				msgs = ((InternalEObject)binaryContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__BINARY_CONTENT, null, msgs);
			if (newBinaryContent != null)
				msgs = ((InternalEObject)newBinaryContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__BINARY_CONTENT, null, msgs);
			msgs = basicSetBinaryContent(newBinaryContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__BINARY_CONTENT, newBinaryContent, newBinaryContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__BINARY_CONTENT:
				return basicSetBinaryContent(null, msgs);
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
			case ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__BINARY_CONTENT:
				return getBinaryContent();
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
			case ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__DEFINITION:
				setDefinition((AttributeDefinitionComplex)newValue);
				return;
			case ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__BINARY_CONTENT:
				setBinaryContent((BinaryContent)newValue);
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
			case ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__DEFINITION:
				setDefinition((AttributeDefinitionComplex)null);
				return;
			case ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__BINARY_CONTENT:
				setBinaryContent((BinaryContent)null);
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
			case ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__DEFINITION:
				return definition != null;
			case ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_FILE__BINARY_CONTENT:
				return binaryContent != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeValueEmbeddedFileImpl
