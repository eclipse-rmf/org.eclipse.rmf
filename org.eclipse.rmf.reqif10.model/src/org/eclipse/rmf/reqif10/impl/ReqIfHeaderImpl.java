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

import org.eclipse.rmf.reqif10.ReqIf;
import org.eclipse.rmf.reqif10.Reqif10Package;
import org.eclipse.rmf.reqif10.ReqIfHeader;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIfHeaderImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIfHeaderImpl#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIfHeaderImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIfHeaderImpl#getRepositoryId <em>Repository Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIfHeaderImpl#getReqIfToolId <em>Req If Tool Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIfHeaderImpl#getReqIfVersion <em>Req If Version</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIfHeaderImpl#getSourceToolId <em>Source Tool Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIfHeaderImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIfHeaderImpl#getDocumentRoot <em>Document Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReqIfHeaderImpl extends EObjectImpl implements ReqIfHeader {
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationTime() <em>Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationTime() <em>Creation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar creationTime = CREATION_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepositoryId() <em>Repository Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryId()
	 * @generated
	 * @ordered
	 */
	protected static final String REPOSITORY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepositoryId() <em>Repository Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryId()
	 * @generated
	 * @ordered
	 */
	protected String repositoryId = REPOSITORY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReqIfToolId() <em>Req If Tool Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqIfToolId()
	 * @generated
	 * @ordered
	 */
	protected static final String REQ_IF_TOOL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReqIfToolId() <em>Req If Tool Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqIfToolId()
	 * @generated
	 * @ordered
	 */
	protected String reqIfToolId = REQ_IF_TOOL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReqIfVersion() <em>Req If Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqIfVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String REQ_IF_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReqIfVersion() <em>Req If Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqIfVersion()
	 * @generated
	 * @ordered
	 */
	protected String reqIfVersion = REQ_IF_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceToolId() <em>Source Tool Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceToolId()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_TOOL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceToolId() <em>Source Tool Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceToolId()
	 * @generated
	 * @ordered
	 */
	protected String sourceToolId = SOURCE_TOOL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReqIfHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Reqif10Package.Literals.REQ_IF_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.REQ_IF_HEADER__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCreationTime() {
		return creationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationTime(XMLGregorianCalendar newCreationTime) {
		XMLGregorianCalendar oldCreationTime = creationTime;
		creationTime = newCreationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.REQ_IF_HEADER__CREATION_TIME, oldCreationTime, creationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.REQ_IF_HEADER__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepositoryId() {
		return repositoryId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepositoryId(String newRepositoryId) {
		String oldRepositoryId = repositoryId;
		repositoryId = newRepositoryId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.REQ_IF_HEADER__REPOSITORY_ID, oldRepositoryId, repositoryId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReqIfToolId() {
		return reqIfToolId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReqIfToolId(String newReqIfToolId) {
		String oldReqIfToolId = reqIfToolId;
		reqIfToolId = newReqIfToolId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.REQ_IF_HEADER__REQ_IF_TOOL_ID, oldReqIfToolId, reqIfToolId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReqIfVersion() {
		return reqIfVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReqIfVersion(String newReqIfVersion) {
		String oldReqIfVersion = reqIfVersion;
		reqIfVersion = newReqIfVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.REQ_IF_HEADER__REQ_IF_VERSION, oldReqIfVersion, reqIfVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceToolId() {
		return sourceToolId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceToolId(String newSourceToolId) {
		String oldSourceToolId = sourceToolId;
		sourceToolId = newSourceToolId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.REQ_IF_HEADER__SOURCE_TOOL_ID, oldSourceToolId, sourceToolId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.REQ_IF_HEADER__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqIf getDocumentRoot() {
		if (eContainerFeatureID() != Reqif10Package.REQ_IF_HEADER__DOCUMENT_ROOT) return null;
		return (ReqIf)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentRoot(ReqIf newDocumentRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDocumentRoot, Reqif10Package.REQ_IF_HEADER__DOCUMENT_ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentRoot(ReqIf newDocumentRoot) {
		if (newDocumentRoot != eInternalContainer() || (eContainerFeatureID() != Reqif10Package.REQ_IF_HEADER__DOCUMENT_ROOT && newDocumentRoot != null)) {
			if (EcoreUtil.isAncestor(this, newDocumentRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDocumentRoot != null)
				msgs = ((InternalEObject)newDocumentRoot).eInverseAdd(this, Reqif10Package.REQ_IF__THE_HEADER, ReqIf.class, msgs);
			msgs = basicSetDocumentRoot(newDocumentRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.REQ_IF_HEADER__DOCUMENT_ROOT, newDocumentRoot, newDocumentRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Reqif10Package.REQ_IF_HEADER__DOCUMENT_ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDocumentRoot((ReqIf)otherEnd, msgs);
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
			case Reqif10Package.REQ_IF_HEADER__DOCUMENT_ROOT:
				return basicSetDocumentRoot(null, msgs);
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
			case Reqif10Package.REQ_IF_HEADER__DOCUMENT_ROOT:
				return eInternalContainer().eInverseRemove(this, Reqif10Package.REQ_IF__THE_HEADER, ReqIf.class, msgs);
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
			case Reqif10Package.REQ_IF_HEADER__COMMENT:
				return getComment();
			case Reqif10Package.REQ_IF_HEADER__CREATION_TIME:
				return getCreationTime();
			case Reqif10Package.REQ_IF_HEADER__IDENTIFIER:
				return getIdentifier();
			case Reqif10Package.REQ_IF_HEADER__REPOSITORY_ID:
				return getRepositoryId();
			case Reqif10Package.REQ_IF_HEADER__REQ_IF_TOOL_ID:
				return getReqIfToolId();
			case Reqif10Package.REQ_IF_HEADER__REQ_IF_VERSION:
				return getReqIfVersion();
			case Reqif10Package.REQ_IF_HEADER__SOURCE_TOOL_ID:
				return getSourceToolId();
			case Reqif10Package.REQ_IF_HEADER__TITLE:
				return getTitle();
			case Reqif10Package.REQ_IF_HEADER__DOCUMENT_ROOT:
				return getDocumentRoot();
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
			case Reqif10Package.REQ_IF_HEADER__COMMENT:
				setComment((String)newValue);
				return;
			case Reqif10Package.REQ_IF_HEADER__CREATION_TIME:
				setCreationTime((XMLGregorianCalendar)newValue);
				return;
			case Reqif10Package.REQ_IF_HEADER__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case Reqif10Package.REQ_IF_HEADER__REPOSITORY_ID:
				setRepositoryId((String)newValue);
				return;
			case Reqif10Package.REQ_IF_HEADER__REQ_IF_TOOL_ID:
				setReqIfToolId((String)newValue);
				return;
			case Reqif10Package.REQ_IF_HEADER__REQ_IF_VERSION:
				setReqIfVersion((String)newValue);
				return;
			case Reqif10Package.REQ_IF_HEADER__SOURCE_TOOL_ID:
				setSourceToolId((String)newValue);
				return;
			case Reqif10Package.REQ_IF_HEADER__TITLE:
				setTitle((String)newValue);
				return;
			case Reqif10Package.REQ_IF_HEADER__DOCUMENT_ROOT:
				setDocumentRoot((ReqIf)newValue);
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
			case Reqif10Package.REQ_IF_HEADER__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case Reqif10Package.REQ_IF_HEADER__CREATION_TIME:
				setCreationTime(CREATION_TIME_EDEFAULT);
				return;
			case Reqif10Package.REQ_IF_HEADER__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case Reqif10Package.REQ_IF_HEADER__REPOSITORY_ID:
				setRepositoryId(REPOSITORY_ID_EDEFAULT);
				return;
			case Reqif10Package.REQ_IF_HEADER__REQ_IF_TOOL_ID:
				setReqIfToolId(REQ_IF_TOOL_ID_EDEFAULT);
				return;
			case Reqif10Package.REQ_IF_HEADER__REQ_IF_VERSION:
				setReqIfVersion(REQ_IF_VERSION_EDEFAULT);
				return;
			case Reqif10Package.REQ_IF_HEADER__SOURCE_TOOL_ID:
				setSourceToolId(SOURCE_TOOL_ID_EDEFAULT);
				return;
			case Reqif10Package.REQ_IF_HEADER__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case Reqif10Package.REQ_IF_HEADER__DOCUMENT_ROOT:
				setDocumentRoot((ReqIf)null);
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
			case Reqif10Package.REQ_IF_HEADER__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case Reqif10Package.REQ_IF_HEADER__CREATION_TIME:
				return CREATION_TIME_EDEFAULT == null ? creationTime != null : !CREATION_TIME_EDEFAULT.equals(creationTime);
			case Reqif10Package.REQ_IF_HEADER__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case Reqif10Package.REQ_IF_HEADER__REPOSITORY_ID:
				return REPOSITORY_ID_EDEFAULT == null ? repositoryId != null : !REPOSITORY_ID_EDEFAULT.equals(repositoryId);
			case Reqif10Package.REQ_IF_HEADER__REQ_IF_TOOL_ID:
				return REQ_IF_TOOL_ID_EDEFAULT == null ? reqIfToolId != null : !REQ_IF_TOOL_ID_EDEFAULT.equals(reqIfToolId);
			case Reqif10Package.REQ_IF_HEADER__REQ_IF_VERSION:
				return REQ_IF_VERSION_EDEFAULT == null ? reqIfVersion != null : !REQ_IF_VERSION_EDEFAULT.equals(reqIfVersion);
			case Reqif10Package.REQ_IF_HEADER__SOURCE_TOOL_ID:
				return SOURCE_TOOL_ID_EDEFAULT == null ? sourceToolId != null : !SOURCE_TOOL_ID_EDEFAULT.equals(sourceToolId);
			case Reqif10Package.REQ_IF_HEADER__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case Reqif10Package.REQ_IF_HEADER__DOCUMENT_ROOT:
				return getDocumentRoot() != null;
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", creationTime: ");
		result.append(creationTime);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", repositoryId: ");
		result.append(repositoryId);
		result.append(", reqIfToolId: ");
		result.append(reqIfToolId);
		result.append(", reqIfVersion: ");
		result.append(reqIfVersion);
		result.append(", sourceToolId: ");
		result.append(sourceToolId);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //ReqIfHeaderImpl
