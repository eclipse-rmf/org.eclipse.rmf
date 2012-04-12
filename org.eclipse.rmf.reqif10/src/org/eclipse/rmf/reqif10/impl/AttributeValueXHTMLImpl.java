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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.rmf.reqif10.AttributeDefinitionXHTML;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.XhtmlContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Value XHTML</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.AttributeValueXHTMLImpl#isSimplified <em>Simplified</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.AttributeValueXHTMLImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.AttributeValueXHTMLImpl#getTheOriginalValue <em>The Original Value</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.AttributeValueXHTMLImpl#getTheValue <em>The Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeValueXHTMLImpl extends AttributeValueImpl implements AttributeValueXHTML {
	/**
	 * The default value of the '{@link #isSimplified() <em>Simplified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSimplified()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SIMPLIFIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSimplified() <em>Simplified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSimplified()
	 * @generated
	 * @ordered
	 */
	protected boolean simplified = SIMPLIFIED_EDEFAULT;

	/**
	 * This is true if the Simplified attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean simplifiedESet;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected AttributeDefinitionXHTML definition;

	/**
	 * This is true if the Definition reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean definitionESet;

	/**
	 * The cached value of the '{@link #getTheOriginalValue() <em>The Original Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheOriginalValue()
	 * @generated
	 * @ordered
	 */
	protected XhtmlContent theOriginalValue;

	/**
	 * This is true if the The Original Value containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean theOriginalValueESet;

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
	 * This is true if the The Value containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean theValueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueXHTMLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqIF10Package.Literals.ATTRIBUTE_VALUE_XHTML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSimplified() {
		return simplified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimplified(boolean newSimplified) {
		boolean oldSimplified = simplified;
		simplified = newSimplified;
		boolean oldSimplifiedESet = simplifiedESet;
		simplifiedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqIF10Package.ATTRIBUTE_VALUE_XHTML__SIMPLIFIED, oldSimplified, simplified, !oldSimplifiedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSimplified() {
		boolean oldSimplified = simplified;
		boolean oldSimplifiedESet = simplifiedESet;
		simplified = SIMPLIFIED_EDEFAULT;
		simplifiedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ReqIF10Package.ATTRIBUTE_VALUE_XHTML__SIMPLIFIED, oldSimplified, SIMPLIFIED_EDEFAULT, oldSimplifiedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSimplified() {
		return simplifiedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionXHTML getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (AttributeDefinitionXHTML)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReqIF10Package.ATTRIBUTE_VALUE_XHTML__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionXHTML basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(AttributeDefinitionXHTML newDefinition) {
		AttributeDefinitionXHTML oldDefinition = definition;
		definition = newDefinition;
		boolean oldDefinitionESet = definitionESet;
		definitionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqIF10Package.ATTRIBUTE_VALUE_XHTML__DEFINITION, oldDefinition, definition, !oldDefinitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDefinition() {
		AttributeDefinitionXHTML oldDefinition = definition;
		boolean oldDefinitionESet = definitionESet;
		definition = null;
		definitionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ReqIF10Package.ATTRIBUTE_VALUE_XHTML__DEFINITION, oldDefinition, null, oldDefinitionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefinition() {
		return definitionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlContent getTheOriginalValue() {
		return theOriginalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheOriginalValue(XhtmlContent newTheOriginalValue, NotificationChain msgs) {
		XhtmlContent oldTheOriginalValue = theOriginalValue;
		theOriginalValue = newTheOriginalValue;
		boolean oldTheOriginalValueESet = theOriginalValueESet;
		theOriginalValueESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqIF10Package.ATTRIBUTE_VALUE_XHTML__THE_ORIGINAL_VALUE, oldTheOriginalValue, newTheOriginalValue, !oldTheOriginalValueESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheOriginalValue(XhtmlContent newTheOriginalValue) {
		if (newTheOriginalValue != theOriginalValue) {
			NotificationChain msgs = null;
			if (theOriginalValue != null)
				msgs = ((InternalEObject)theOriginalValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqIF10Package.ATTRIBUTE_VALUE_XHTML__THE_ORIGINAL_VALUE, null, msgs);
			if (newTheOriginalValue != null)
				msgs = ((InternalEObject)newTheOriginalValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqIF10Package.ATTRIBUTE_VALUE_XHTML__THE_ORIGINAL_VALUE, null, msgs);
			msgs = basicSetTheOriginalValue(newTheOriginalValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTheOriginalValueESet = theOriginalValueESet;
			theOriginalValueESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, ReqIF10Package.ATTRIBUTE_VALUE_XHTML__THE_ORIGINAL_VALUE, newTheOriginalValue, newTheOriginalValue, !oldTheOriginalValueESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetTheOriginalValue(NotificationChain msgs) {
		XhtmlContent oldTheOriginalValue = theOriginalValue;
		theOriginalValue = null;
		boolean oldTheOriginalValueESet = theOriginalValueESet;
		theOriginalValueESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, ReqIF10Package.ATTRIBUTE_VALUE_XHTML__THE_ORIGINAL_VALUE, oldTheOriginalValue, null, oldTheOriginalValueESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTheOriginalValue() {
		if (theOriginalValue != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)theOriginalValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqIF10Package.ATTRIBUTE_VALUE_XHTML__THE_ORIGINAL_VALUE, null, msgs);
			msgs = basicUnsetTheOriginalValue(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTheOriginalValueESet = theOriginalValueESet;
			theOriginalValueESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, ReqIF10Package.ATTRIBUTE_VALUE_XHTML__THE_ORIGINAL_VALUE, null, null, oldTheOriginalValueESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTheOriginalValue() {
		return theOriginalValueESet;
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
		boolean oldTheValueESet = theValueESet;
		theValueESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqIF10Package.ATTRIBUTE_VALUE_XHTML__THE_VALUE, oldTheValue, newTheValue, !oldTheValueESet);
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
				msgs = ((InternalEObject)theValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqIF10Package.ATTRIBUTE_VALUE_XHTML__THE_VALUE, null, msgs);
			if (newTheValue != null)
				msgs = ((InternalEObject)newTheValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqIF10Package.ATTRIBUTE_VALUE_XHTML__THE_VALUE, null, msgs);
			msgs = basicSetTheValue(newTheValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTheValueESet = theValueESet;
			theValueESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, ReqIF10Package.ATTRIBUTE_VALUE_XHTML__THE_VALUE, newTheValue, newTheValue, !oldTheValueESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetTheValue(NotificationChain msgs) {
		XhtmlContent oldTheValue = theValue;
		theValue = null;
		boolean oldTheValueESet = theValueESet;
		theValueESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, ReqIF10Package.ATTRIBUTE_VALUE_XHTML__THE_VALUE, oldTheValue, null, oldTheValueESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTheValue() {
		if (theValue != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)theValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqIF10Package.ATTRIBUTE_VALUE_XHTML__THE_VALUE, null, msgs);
			msgs = basicUnsetTheValue(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTheValueESet = theValueESet;
			theValueESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, ReqIF10Package.ATTRIBUTE_VALUE_XHTML__THE_VALUE, null, null, oldTheValueESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTheValue() {
		return theValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReqIF10Package.ATTRIBUTE_VALUE_XHTML__THE_ORIGINAL_VALUE:
				return basicUnsetTheOriginalValue(msgs);
			case ReqIF10Package.ATTRIBUTE_VALUE_XHTML__THE_VALUE:
				return basicUnsetTheValue(msgs);
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
			case ReqIF10Package.ATTRIBUTE_VALUE_XHTML__SIMPLIFIED:
				return isSimplified();
			case ReqIF10Package.ATTRIBUTE_VALUE_XHTML__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case ReqIF10Package.ATTRIBUTE_VALUE_XHTML__THE_ORIGINAL_VALUE:
				return getTheOriginalValue();
			case ReqIF10Package.ATTRIBUTE_VALUE_XHTML__THE_VALUE:
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
			case ReqIF10Package.ATTRIBUTE_VALUE_XHTML__SIMPLIFIED:
				setSimplified((Boolean)newValue);
				return;
			case ReqIF10Package.ATTRIBUTE_VALUE_XHTML__DEFINITION:
				setDefinition((AttributeDefinitionXHTML)newValue);
				return;
			case ReqIF10Package.ATTRIBUTE_VALUE_XHTML__THE_ORIGINAL_VALUE:
				setTheOriginalValue((XhtmlContent)newValue);
				return;
			case ReqIF10Package.ATTRIBUTE_VALUE_XHTML__THE_VALUE:
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
			case ReqIF10Package.ATTRIBUTE_VALUE_XHTML__SIMPLIFIED:
				unsetSimplified();
				return;
			case ReqIF10Package.ATTRIBUTE_VALUE_XHTML__DEFINITION:
				unsetDefinition();
				return;
			case ReqIF10Package.ATTRIBUTE_VALUE_XHTML__THE_ORIGINAL_VALUE:
				unsetTheOriginalValue();
				return;
			case ReqIF10Package.ATTRIBUTE_VALUE_XHTML__THE_VALUE:
				unsetTheValue();
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
			case ReqIF10Package.ATTRIBUTE_VALUE_XHTML__SIMPLIFIED:
				return isSetSimplified();
			case ReqIF10Package.ATTRIBUTE_VALUE_XHTML__DEFINITION:
				return isSetDefinition();
			case ReqIF10Package.ATTRIBUTE_VALUE_XHTML__THE_ORIGINAL_VALUE:
				return isSetTheOriginalValue();
			case ReqIF10Package.ATTRIBUTE_VALUE_XHTML__THE_VALUE:
				return isSetTheValue();
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
		result.append(" (simplified: ");
		if (simplifiedESet) result.append(simplified); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AttributeValueXHTMLImpl
