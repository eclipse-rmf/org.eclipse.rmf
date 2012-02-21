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
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBinaryFile;
import org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype Definition Binary File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionBinaryFileImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionBinaryFileImpl#getFilenameSuffix <em>Filename Suffix</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionBinaryFileImpl#getFormatName <em>Format Name</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.DatatypeDefinitionBinaryFileImpl#getMimeType <em>Mime Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatatypeDefinitionBinaryFileImpl extends DatatypeDefinitionComplexImpl implements DatatypeDefinitionBinaryFile {
	/**
	 * The default value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected String application = APPLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilenameSuffix() <em>Filename Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilenameSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String FILENAME_SUFFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilenameSuffix() <em>Filename Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilenameSuffix()
	 * @generated
	 * @ordered
	 */
	protected String filenameSuffix = FILENAME_SUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormatName() <em>Format Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatName()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormatName() <em>Format Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatName()
	 * @generated
	 * @ordered
	 */
	protected String formatName = FORMAT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected static final String MIME_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMimeType() <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeType()
	 * @generated
	 * @ordered
	 */
	protected String mimeType = MIME_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatatypeDefinitionBinaryFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExchangeFilePackage.Literals.DATATYPE_DEFINITION_BINARY_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(String newApplication) {
		String oldApplication = application;
		application = newApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.DATATYPE_DEFINITION_BINARY_FILE__APPLICATION, oldApplication, application));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilenameSuffix() {
		return filenameSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilenameSuffix(String newFilenameSuffix) {
		String oldFilenameSuffix = filenameSuffix;
		filenameSuffix = newFilenameSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.DATATYPE_DEFINITION_BINARY_FILE__FILENAME_SUFFIX, oldFilenameSuffix, filenameSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormatName() {
		return formatName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatName(String newFormatName) {
		String oldFormatName = formatName;
		formatName = newFormatName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.DATATYPE_DEFINITION_BINARY_FILE__FORMAT_NAME, oldFormatName, formatName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMimeType() {
		return mimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMimeType(String newMimeType) {
		String oldMimeType = mimeType;
		mimeType = newMimeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.DATATYPE_DEFINITION_BINARY_FILE__MIME_TYPE, oldMimeType, mimeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExchangeFilePackage.DATATYPE_DEFINITION_BINARY_FILE__APPLICATION:
				return getApplication();
			case ExchangeFilePackage.DATATYPE_DEFINITION_BINARY_FILE__FILENAME_SUFFIX:
				return getFilenameSuffix();
			case ExchangeFilePackage.DATATYPE_DEFINITION_BINARY_FILE__FORMAT_NAME:
				return getFormatName();
			case ExchangeFilePackage.DATATYPE_DEFINITION_BINARY_FILE__MIME_TYPE:
				return getMimeType();
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
			case ExchangeFilePackage.DATATYPE_DEFINITION_BINARY_FILE__APPLICATION:
				setApplication((String)newValue);
				return;
			case ExchangeFilePackage.DATATYPE_DEFINITION_BINARY_FILE__FILENAME_SUFFIX:
				setFilenameSuffix((String)newValue);
				return;
			case ExchangeFilePackage.DATATYPE_DEFINITION_BINARY_FILE__FORMAT_NAME:
				setFormatName((String)newValue);
				return;
			case ExchangeFilePackage.DATATYPE_DEFINITION_BINARY_FILE__MIME_TYPE:
				setMimeType((String)newValue);
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
			case ExchangeFilePackage.DATATYPE_DEFINITION_BINARY_FILE__APPLICATION:
				setApplication(APPLICATION_EDEFAULT);
				return;
			case ExchangeFilePackage.DATATYPE_DEFINITION_BINARY_FILE__FILENAME_SUFFIX:
				setFilenameSuffix(FILENAME_SUFFIX_EDEFAULT);
				return;
			case ExchangeFilePackage.DATATYPE_DEFINITION_BINARY_FILE__FORMAT_NAME:
				setFormatName(FORMAT_NAME_EDEFAULT);
				return;
			case ExchangeFilePackage.DATATYPE_DEFINITION_BINARY_FILE__MIME_TYPE:
				setMimeType(MIME_TYPE_EDEFAULT);
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
			case ExchangeFilePackage.DATATYPE_DEFINITION_BINARY_FILE__APPLICATION:
				return APPLICATION_EDEFAULT == null ? application != null : !APPLICATION_EDEFAULT.equals(application);
			case ExchangeFilePackage.DATATYPE_DEFINITION_BINARY_FILE__FILENAME_SUFFIX:
				return FILENAME_SUFFIX_EDEFAULT == null ? filenameSuffix != null : !FILENAME_SUFFIX_EDEFAULT.equals(filenameSuffix);
			case ExchangeFilePackage.DATATYPE_DEFINITION_BINARY_FILE__FORMAT_NAME:
				return FORMAT_NAME_EDEFAULT == null ? formatName != null : !FORMAT_NAME_EDEFAULT.equals(formatName);
			case ExchangeFilePackage.DATATYPE_DEFINITION_BINARY_FILE__MIME_TYPE:
				return MIME_TYPE_EDEFAULT == null ? mimeType != null : !MIME_TYPE_EDEFAULT.equals(mimeType);
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
		result.append(" (application: ");
		result.append(application);
		result.append(", filenameSuffix: ");
		result.append(filenameSuffix);
		result.append(", formatName: ");
		result.append(formatName);
		result.append(", mimeType: ");
		result.append(mimeType);
		result.append(')');
		return result.toString();
	}

} //DatatypeDefinitionBinaryFileImpl
