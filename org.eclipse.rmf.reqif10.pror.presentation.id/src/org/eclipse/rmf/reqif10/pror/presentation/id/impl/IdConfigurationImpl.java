/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 *     Kay Münch       - vertical alignment of the spec objects id
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
	 * @generated
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
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 0;

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
	 * The default value of the '{@link #getVerticalAlign() <em>Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlign()
	 * @generated
	 * @ordered
	 */
	protected static final IdVerticalAlign VERTICAL_ALIGN_EDEFAULT = IdVerticalAlign.TOP;

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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdPackage.ID_CONFIGURATION__PREFIX, oldPrefix, prefix));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdPackage.ID_CONFIGURATION__COUNT, oldCount, count));
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
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IdPackage.ID_CONFIGURATION__VERTICAL_ALIGN, oldVerticalAlign, verticalAlign));
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
				setPrefix(PREFIX_EDEFAULT);
				return;
			case IdPackage.ID_CONFIGURATION__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case IdPackage.ID_CONFIGURATION__VERTICAL_ALIGN:
				setVerticalAlign(VERTICAL_ALIGN_EDEFAULT);
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
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case IdPackage.ID_CONFIGURATION__COUNT:
				return count != COUNT_EDEFAULT;
			case IdPackage.ID_CONFIGURATION__VERTICAL_ALIGN:
				return verticalAlign != VERTICAL_ALIGN_EDEFAULT;
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
		result.append(prefix);
		result.append(", count: ");
		result.append(count);
		result.append(", verticalAlign: ");
		result.append(verticalAlign);
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

	// private EContentAdapter buildAdapter(final IdConfiguration config) {
	// config.eAdapters().add(new AdapterImpl() {
	// @Override
	// public void notifyChanged(Notification msg) {
	// if
	// (ConfigurationPackage.Literals.PROR_PRESENTATION_CONFIGURATION__DATATYPE
	// .equals(msg.getFeature())) {
	// EContentAdapter adapter = adapters.get(config);
	// if (adapter != null) {
	// ReqIF reqif = ReqIF10Util.getReqIF(config);
	// reqif.eAdapters().remove(adapter);
	// adapter = buildAdapter(config);
	// reqif.eAdapters().add(adapter);
	// adapters.put(config, adapter);
	// }
	// }
	// }
	// });
	// }

} //IdConfigurationImpl
