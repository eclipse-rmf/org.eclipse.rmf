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

import org.eclipse.rmf.reqif10.AttributeDefinitionXhtml;
import org.eclipse.rmf.reqif10.AttributeValueXhtml;
import org.eclipse.rmf.reqif10.Reqif10Package;
import org.eclipse.rmf.reqif10.datatypes.DatatypesPackage;
import org.eclipse.rmf.reqif10.datatypes.XhtmlContent;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Value Xhtml</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.AttributeValueXhtmlImpl#getIsSimplified <em>Is Simplified</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.AttributeValueXhtmlImpl#getOwningDefinition <em>Owning Definition</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.AttributeValueXhtmlImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.AttributeValueXhtmlImpl#getTheOriginalValue <em>The Original Value</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.AttributeValueXhtmlImpl#getTheValue <em>The Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeValueXhtmlImpl extends AttributeValueImpl implements AttributeValueXhtml {
	/**
	 * The default value of the '{@link #getIsSimplified() <em>Is Simplified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSimplified()
	 * @generated
	 * @ordered
	 */
	protected static final Object IS_SIMPLIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsSimplified() <em>Is Simplified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSimplified()
	 * @generated
	 * @ordered
	 */
	protected Object isSimplified = IS_SIMPLIFIED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected AttributeDefinitionXhtml definition;

	/**
	 * The cached value of the '{@link #getTheValue() <em>The Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheValue()
	 * @generated
	 * @ordered
	 */
	protected XhtmlContent theValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueXhtmlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Reqif10Package.Literals.ATTRIBUTE_VALUE_XHTML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getIsSimplified() {
		return isSimplified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSimplified(Object newIsSimplified) {
		Object oldIsSimplified = isSimplified;
		isSimplified = newIsSimplified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.ATTRIBUTE_VALUE_XHTML__IS_SIMPLIFIED, oldIsSimplified, isSimplified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionXhtml getOwningDefinition() {
		if (eContainerFeatureID() != Reqif10Package.ATTRIBUTE_VALUE_XHTML__OWNING_DEFINITION) return null;
		return (AttributeDefinitionXhtml)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningDefinition(AttributeDefinitionXhtml newOwningDefinition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningDefinition, Reqif10Package.ATTRIBUTE_VALUE_XHTML__OWNING_DEFINITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningDefinition(AttributeDefinitionXhtml newOwningDefinition) {
		if (newOwningDefinition != eInternalContainer() || (eContainerFeatureID() != Reqif10Package.ATTRIBUTE_VALUE_XHTML__OWNING_DEFINITION && newOwningDefinition != null)) {
			if (EcoreUtil.isAncestor(this, newOwningDefinition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningDefinition != null)
				msgs = ((InternalEObject)newOwningDefinition).eInverseAdd(this, Reqif10Package.ATTRIBUTE_DEFINITION_XHTML__DEFAULT_VALUE, AttributeDefinitionXhtml.class, msgs);
			msgs = basicSetOwningDefinition(newOwningDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.ATTRIBUTE_VALUE_XHTML__OWNING_DEFINITION, newOwningDefinition, newOwningDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionXhtml getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (AttributeDefinitionXhtml)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Reqif10Package.ATTRIBUTE_VALUE_XHTML__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionXhtml basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(AttributeDefinitionXhtml newDefinition) {
		AttributeDefinitionXhtml oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.ATTRIBUTE_VALUE_XHTML__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * TODO: Some patch-up that allows us to inspect ReqIF
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public XhtmlContent getTheOriginalValue() {
		// TODO: implement this method to return the 'The Original Value' containment reference
		// Ensure that you remove @generated or mark it @generated NOT
		return theValue;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheOriginalValue(XhtmlContent newTheOriginalValue, NotificationChain msgs) {
		// TODO: implement this method to set the contained 'The Original Value' containment reference
		// -> this method is automatically invoked to keep the containment relationship in synch
		// -> do not modify other features
		// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheOriginalValue(XhtmlContent newTheOriginalValue) {
		// TODO: implement this method to set the 'The Original Value' containment reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlContent getTheValue() {
		return theValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheValue(XhtmlContent newTheValue, NotificationChain msgs) {
		XhtmlContent oldTheValue = theValue;
		theValue = newTheValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Reqif10Package.ATTRIBUTE_VALUE_XHTML__THE_VALUE, oldTheValue, newTheValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheValue(XhtmlContent newTheValue) {
		if (newTheValue != theValue) {
			NotificationChain msgs = null;
			if (theValue != null)
				msgs = ((InternalEObject)theValue).eInverseRemove(this, DatatypesPackage.XHTML_CONTENT__ATTRIBUTE_VALUE, XhtmlContent.class, msgs);
			if (newTheValue != null)
				msgs = ((InternalEObject)newTheValue).eInverseAdd(this, DatatypesPackage.XHTML_CONTENT__ATTRIBUTE_VALUE, XhtmlContent.class, msgs);
			msgs = basicSetTheValue(newTheValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.ATTRIBUTE_VALUE_XHTML__THE_VALUE, newTheValue, newTheValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML__OWNING_DEFINITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningDefinition((AttributeDefinitionXhtml)otherEnd, msgs);
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML__THE_VALUE:
				if (theValue != null)
					msgs = ((InternalEObject)theValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Reqif10Package.ATTRIBUTE_VALUE_XHTML__THE_VALUE, null, msgs);
				return basicSetTheValue((XhtmlContent)otherEnd, msgs);
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
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML__OWNING_DEFINITION:
				return basicSetOwningDefinition(null, msgs);
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML__THE_ORIGINAL_VALUE:
				return basicSetTheOriginalValue(null, msgs);
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML__THE_VALUE:
				return basicSetTheValue(null, msgs);
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
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML__OWNING_DEFINITION:
				return eInternalContainer().eInverseRemove(this, Reqif10Package.ATTRIBUTE_DEFINITION_XHTML__DEFAULT_VALUE, AttributeDefinitionXhtml.class, msgs);
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
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML__IS_SIMPLIFIED:
				return getIsSimplified();
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML__OWNING_DEFINITION:
				return getOwningDefinition();
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML__THE_ORIGINAL_VALUE:
				return getTheOriginalValue();
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML__THE_VALUE:
				return getTheValue();
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
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML__IS_SIMPLIFIED:
				setIsSimplified(newValue);
				return;
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML__OWNING_DEFINITION:
				setOwningDefinition((AttributeDefinitionXhtml)newValue);
				return;
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML__DEFINITION:
				setDefinition((AttributeDefinitionXhtml)newValue);
				return;
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML__THE_ORIGINAL_VALUE:
				setTheOriginalValue((XhtmlContent)newValue);
				return;
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML__THE_VALUE:
				setTheValue((XhtmlContent)newValue);
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
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML__IS_SIMPLIFIED:
				setIsSimplified(IS_SIMPLIFIED_EDEFAULT);
				return;
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML__OWNING_DEFINITION:
				setOwningDefinition((AttributeDefinitionXhtml)null);
				return;
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML__DEFINITION:
				setDefinition((AttributeDefinitionXhtml)null);
				return;
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML__THE_ORIGINAL_VALUE:
				setTheOriginalValue((XhtmlContent)null);
				return;
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML__THE_VALUE:
				setTheValue((XhtmlContent)null);
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
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML__IS_SIMPLIFIED:
				return IS_SIMPLIFIED_EDEFAULT == null ? isSimplified != null : !IS_SIMPLIFIED_EDEFAULT.equals(isSimplified);
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML__OWNING_DEFINITION:
				return getOwningDefinition() != null;
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML__DEFINITION:
				return definition != null;
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML__THE_ORIGINAL_VALUE:
				return getTheOriginalValue() != null;
			case Reqif10Package.ATTRIBUTE_VALUE_XHTML__THE_VALUE:
				return theValue != null;
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
		result.append(" (isSimplified: ");
		result.append(isSimplified);
		result.append(')');
		return result.toString();
	}

} //AttributeValueXhtmlImpl
