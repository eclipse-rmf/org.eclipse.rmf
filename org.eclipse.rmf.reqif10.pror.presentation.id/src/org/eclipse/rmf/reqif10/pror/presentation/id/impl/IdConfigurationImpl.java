/*******************************************************************************
 * Copyright (c) 2011, 2013 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 *     Kay M??nch       - vertical alignment of the spec objects id
 ******************************************************************************/

package org.eclipse.rmf.reqif10.pror.presentation.id.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.configuration.impl.ProrPresentationConfigurationImpl;
import org.eclipse.rmf.reqif10.pror.presentation.id.IdConfiguration;
import org.eclipse.rmf.reqif10.pror.presentation.id.IdPackage;
import org.eclipse.rmf.reqif10.pror.presentation.id.IdVerticalAlign;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.presentation.id.impl.IdConfigurationImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.presentation.id.impl.IdConfigurationImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.presentation.id.impl.IdConfigurationImpl#getVerticalAlign <em>Vertical Align</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdConfigurationImpl extends ProrPresentationConfigurationImpl implements IdConfiguration {
	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated NOT
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = "REQ-";

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * This is true if the Prefix attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prefixESet;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Made public, so that other classes can find the default value.
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated NOT
	 * @ordered
	 */
	public static final int COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected int count = COUNT_EDEFAULT;

	/**
	 * This is true if the Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean countESet;

	/**
	 * The default value of the '{@link #getVerticalAlign() <em>Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlign()
	 * @generated
	 * @ordered
	 */
	protected static final IdVerticalAlign VERTICAL_ALIGN_EDEFAULT = IdVerticalAlign.CENTER;

	/**
	 * The cached value of the '{@link #getVerticalAlign() <em>Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlign()
	 * @generated
	 * @ordered
	 */
	protected IdVerticalAlign verticalAlign = VERTICAL_ALIGN_EDEFAULT;

	/**
	 * This is true if the Vertical Align attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verticalAlignESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdPackage.Literals.ID_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		boolean oldPrefixESet = prefixESet;
		prefixESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdPackage.ID_CONFIGURATION__PREFIX, oldPrefix, prefix, !oldPrefixESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrefix() {
		String oldPrefix = prefix;
		boolean oldPrefixESet = prefixESet;
		prefix = PREFIX_EDEFAULT;
		prefixESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IdPackage.ID_CONFIGURATION__PREFIX, oldPrefix, PREFIX_EDEFAULT, oldPrefixESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrefix() {
		return prefixESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(int newCount) {
		int oldCount = count;
		count = newCount;
		boolean oldCountESet = countESet;
		countESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdPackage.ID_CONFIGURATION__COUNT, oldCount, count, !oldCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCount() {
		int oldCount = count;
		boolean oldCountESet = countESet;
		count = COUNT_EDEFAULT;
		countESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IdPackage.ID_CONFIGURATION__COUNT, oldCount, COUNT_EDEFAULT, oldCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCount() {
		return countESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdVerticalAlign getVerticalAlign() {
		return verticalAlign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalAlign(IdVerticalAlign newVerticalAlign) {
		IdVerticalAlign oldVerticalAlign = verticalAlign;
		verticalAlign = newVerticalAlign == null ? VERTICAL_ALIGN_EDEFAULT : newVerticalAlign;
		boolean oldVerticalAlignESet = verticalAlignESet;
		verticalAlignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdPackage.ID_CONFIGURATION__VERTICAL_ALIGN, oldVerticalAlign, verticalAlign, !oldVerticalAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVerticalAlign() {
		IdVerticalAlign oldVerticalAlign = verticalAlign;
		boolean oldVerticalAlignESet = verticalAlignESet;
		verticalAlign = VERTICAL_ALIGN_EDEFAULT;
		verticalAlignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, IdPackage.ID_CONFIGURATION__VERTICAL_ALIGN, oldVerticalAlign, VERTICAL_ALIGN_EDEFAULT, oldVerticalAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVerticalAlign() {
		return verticalAlignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IdPackage.ID_CONFIGURATION__PREFIX:
				return getPrefix();
			case IdPackage.ID_CONFIGURATION__COUNT:
				return getCount();
			case IdPackage.ID_CONFIGURATION__VERTICAL_ALIGN:
				return getVerticalAlign();
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
			case IdPackage.ID_CONFIGURATION__PREFIX:
				setPrefix((String)newValue);
				return;
			case IdPackage.ID_CONFIGURATION__COUNT:
				setCount((Integer)newValue);
				return;
			case IdPackage.ID_CONFIGURATION__VERTICAL_ALIGN:
				setVerticalAlign((IdVerticalAlign)newValue);
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
			case IdPackage.ID_CONFIGURATION__PREFIX:
				unsetPrefix();
				return;
			case IdPackage.ID_CONFIGURATION__COUNT:
				unsetCount();
				return;
			case IdPackage.ID_CONFIGURATION__VERTICAL_ALIGN:
				unsetVerticalAlign();
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
			case IdPackage.ID_CONFIGURATION__PREFIX:
				return isSetPrefix();
			case IdPackage.ID_CONFIGURATION__COUNT:
				return isSetCount();
			case IdPackage.ID_CONFIGURATION__VERTICAL_ALIGN:
				return isSetVerticalAlign();
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
		result.append(" (prefix: ");
		if (prefixESet) result.append(prefix); else result.append("<unset>");
		result.append(", count: ");
		if (countESet) result.append(count); else result.append("<unset>");
		result.append(", verticalAlign: ");
		if (verticalAlignESet) result.append(verticalAlign); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

	private EContentAdapter reqifAdapter;

	/**
	 * Two listeners must be registered:
	 * <ul>
	 * <li>An adapter on the {@link ReqIF}, reacting to relevant SpecObject
	 * changes that require the creation of new IDs
	 * <li>An adapter to the {@link IdConfiguration}, reacting to changes of its
	 * attributes.
	 * </ul>
	 */
	public void registerReqIF() {
		reqifAdapter = buildReqifListener();
		ReqIF10Util.getReqIF(this).getCoreContent().eAdapters()
				.add(reqifAdapter);
	}

	public void unregisterReqIF() {
		if (reqifAdapter != null) {
			ReqIF10Util.getReqIF(this).getCoreContent().eAdapters()
					.remove(reqifAdapter);
		}
	}

	private EContentAdapter buildReqifListener() {
		EContentAdapter adapter = new EContentAdapter() {
			@Override
			public void setTarget(Notifier target) {
				super.setTarget(target);
				if (target instanceof AttributeValueString) {
					AttributeValueString value = (AttributeValueString) target;
					if (value.getDefinition() != null
							&& value.getDefinition().getType() != null
							&& value.getDefinition().getType()
									.equals(getDatatype())) {
						if (value.getTheValue() == null
								|| value.getTheValue().length() == 0) {
							int newCount = getCount() + 1;
							value.setTheValue(getPrefix() + newCount);
							setCount(newCount);
						}
					}
				}
			}
		};
		return adapter;
	}

} //IdConfigurationImpl
