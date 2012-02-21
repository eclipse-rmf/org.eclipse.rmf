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
import org.eclipse.rmf.rif12.DataTypes.XhtmlContent;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeDefinitionComplex;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeValueEmbeddedDocument;
import org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Value Embedded Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.AttributeValueEmbeddedDocumentImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.AttributeValueEmbeddedDocumentImpl#getXhtmlContent <em>Xhtml Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeValueEmbeddedDocumentImpl extends AttributeValueComplexImpl implements AttributeValueEmbeddedDocument {
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
	 * The cached value of the '{@link #getXhtmlContent() <em>Xhtml Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXhtmlContent()
	 * @generated
	 * @ordered
	 */
	protected XhtmlContent xhtmlContent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueEmbeddedDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExchangeFilePackage.Literals.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DEFINITION, oldDefinition, definition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlContent getXhtmlContent() {
		return xhtmlContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXhtmlContent(XhtmlContent newXhtmlContent, NotificationChain msgs) {
		XhtmlContent oldXhtmlContent = xhtmlContent;
		xhtmlContent = newXhtmlContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__XHTML_CONTENT, oldXhtmlContent, newXhtmlContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXhtmlContent(XhtmlContent newXhtmlContent) {
		if (newXhtmlContent != xhtmlContent) {
			NotificationChain msgs = null;
			if (xhtmlContent != null)
				msgs = ((InternalEObject)xhtmlContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__XHTML_CONTENT, null, msgs);
			if (newXhtmlContent != null)
				msgs = ((InternalEObject)newXhtmlContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__XHTML_CONTENT, null, msgs);
			msgs = basicSetXhtmlContent(newXhtmlContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__XHTML_CONTENT, newXhtmlContent, newXhtmlContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__XHTML_CONTENT:
				return basicSetXhtmlContent(null, msgs);
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
			case ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__XHTML_CONTENT:
				return getXhtmlContent();
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
			case ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DEFINITION:
				setDefinition((AttributeDefinitionComplex)newValue);
				return;
			case ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__XHTML_CONTENT:
				setXhtmlContent((XhtmlContent)newValue);
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
			case ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DEFINITION:
				setDefinition((AttributeDefinitionComplex)null);
				return;
			case ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__XHTML_CONTENT:
				setXhtmlContent((XhtmlContent)null);
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
			case ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__DEFINITION:
				return definition != null;
			case ExchangeFilePackage.ATTRIBUTE_VALUE_EMBEDDED_DOCUMENT__XHTML_CONTENT:
				return xhtmlContent != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeValueEmbeddedDocumentImpl
