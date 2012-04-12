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

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinition;
import org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage;
import org.eclipse.rmf.rif11.ExchangeFile.RIF;
import org.eclipse.rmf.rif11.ExchangeFile.SpecGroup;
import org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchyRoot;
import org.eclipse.rmf.rif11.ExchangeFile.SpecObject;
import org.eclipse.rmf.rif11.ExchangeFile.SpecRelation;
import org.eclipse.rmf.rif11.ExchangeFile.SpecType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RIF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.RIFImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.RIFImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.RIFImpl#getCountryCode <em>Country Code</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.RIFImpl#getCreationTime <em>Creation Time</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.RIFImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.RIFImpl#getSourceToolId <em>Source Tool Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.RIFImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.RIFImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.RIFImpl#getAccessPolicies <em>Access Policies</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.RIFImpl#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.RIFImpl#getSpecHierarchyRoots <em>Spec Hierarchy Roots</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.RIFImpl#getSpecObjects <em>Spec Objects</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.RIFImpl#getSpecGroups <em>Spec Groups</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.RIFImpl#getSpecTypes <em>Spec Types</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.RIFImpl#getSpecRelations <em>Spec Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RIFImpl extends EObjectImpl implements RIF {
	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

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
	 * The default value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCode()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCode()
	 * @generated
	 * @ordered
	 */
	protected String countryCode = COUNTRY_CODE_EDEFAULT;

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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccessPolicies() <em>Access Policies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<AccessPolicy> accessPolicies;

	/**
	 * The cached value of the '{@link #getDatatypes() <em>Datatypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DatatypeDefinition> datatypes;

	/**
	 * The cached value of the '{@link #getSpecHierarchyRoots() <em>Spec Hierarchy Roots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecHierarchyRoots()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecHierarchyRoot> specHierarchyRoots;

	/**
	 * The cached value of the '{@link #getSpecObjects() <em>Spec Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecObject> specObjects;

	/**
	 * The cached value of the '{@link #getSpecGroups() <em>Spec Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecGroup> specGroups;

	/**
	 * The cached value of the '{@link #getSpecTypes() <em>Spec Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecType> specTypes;

	/**
	 * The cached value of the '{@link #getSpecRelations() <em>Spec Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecRelation> specRelations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RIFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExchangeFilePackage.Literals.RIF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.RIF__AUTHOR, oldAuthor, author));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.RIF__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountryCode(String newCountryCode) {
		String oldCountryCode = countryCode;
		countryCode = newCountryCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.RIF__COUNTRY_CODE, oldCountryCode, countryCode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.RIF__CREATION_TIME, oldCreationTime, creationTime));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.RIF__IDENTIFIER, oldIdentifier, identifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.RIF__SOURCE_TOOL_ID, oldSourceToolId, sourceToolId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.RIF__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.RIF__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AccessPolicy> getAccessPolicies() {
		if (accessPolicies == null) {
			accessPolicies = new EObjectContainmentEList<AccessPolicy>(AccessPolicy.class, this, ExchangeFilePackage.RIF__ACCESS_POLICIES);
		}
		return accessPolicies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeDefinition> getDatatypes() {
		if (datatypes == null) {
			datatypes = new EObjectContainmentEList<DatatypeDefinition>(DatatypeDefinition.class, this, ExchangeFilePackage.RIF__DATATYPES);
		}
		return datatypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecHierarchyRoot> getSpecHierarchyRoots() {
		if (specHierarchyRoots == null) {
			specHierarchyRoots = new EObjectContainmentEList<SpecHierarchyRoot>(SpecHierarchyRoot.class, this, ExchangeFilePackage.RIF__SPEC_HIERARCHY_ROOTS);
		}
		return specHierarchyRoots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecObject> getSpecObjects() {
		if (specObjects == null) {
			specObjects = new EObjectContainmentEList<SpecObject>(SpecObject.class, this, ExchangeFilePackage.RIF__SPEC_OBJECTS);
		}
		return specObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecGroup> getSpecGroups() {
		if (specGroups == null) {
			specGroups = new EObjectContainmentEList<SpecGroup>(SpecGroup.class, this, ExchangeFilePackage.RIF__SPEC_GROUPS);
		}
		return specGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecType> getSpecTypes() {
		if (specTypes == null) {
			specTypes = new EObjectContainmentEList<SpecType>(SpecType.class, this, ExchangeFilePackage.RIF__SPEC_TYPES);
		}
		return specTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecRelation> getSpecRelations() {
		if (specRelations == null) {
			specRelations = new EObjectContainmentEList<SpecRelation>(SpecRelation.class, this, ExchangeFilePackage.RIF__SPEC_RELATIONS);
		}
		return specRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExchangeFilePackage.RIF__ACCESS_POLICIES:
				return ((InternalEList<?>)getAccessPolicies()).basicRemove(otherEnd, msgs);
			case ExchangeFilePackage.RIF__DATATYPES:
				return ((InternalEList<?>)getDatatypes()).basicRemove(otherEnd, msgs);
			case ExchangeFilePackage.RIF__SPEC_HIERARCHY_ROOTS:
				return ((InternalEList<?>)getSpecHierarchyRoots()).basicRemove(otherEnd, msgs);
			case ExchangeFilePackage.RIF__SPEC_OBJECTS:
				return ((InternalEList<?>)getSpecObjects()).basicRemove(otherEnd, msgs);
			case ExchangeFilePackage.RIF__SPEC_GROUPS:
				return ((InternalEList<?>)getSpecGroups()).basicRemove(otherEnd, msgs);
			case ExchangeFilePackage.RIF__SPEC_TYPES:
				return ((InternalEList<?>)getSpecTypes()).basicRemove(otherEnd, msgs);
			case ExchangeFilePackage.RIF__SPEC_RELATIONS:
				return ((InternalEList<?>)getSpecRelations()).basicRemove(otherEnd, msgs);
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
			case ExchangeFilePackage.RIF__AUTHOR:
				return getAuthor();
			case ExchangeFilePackage.RIF__COMMENT:
				return getComment();
			case ExchangeFilePackage.RIF__COUNTRY_CODE:
				return getCountryCode();
			case ExchangeFilePackage.RIF__CREATION_TIME:
				return getCreationTime();
			case ExchangeFilePackage.RIF__IDENTIFIER:
				return getIdentifier();
			case ExchangeFilePackage.RIF__SOURCE_TOOL_ID:
				return getSourceToolId();
			case ExchangeFilePackage.RIF__TITLE:
				return getTitle();
			case ExchangeFilePackage.RIF__VERSION:
				return getVersion();
			case ExchangeFilePackage.RIF__ACCESS_POLICIES:
				return getAccessPolicies();
			case ExchangeFilePackage.RIF__DATATYPES:
				return getDatatypes();
			case ExchangeFilePackage.RIF__SPEC_HIERARCHY_ROOTS:
				return getSpecHierarchyRoots();
			case ExchangeFilePackage.RIF__SPEC_OBJECTS:
				return getSpecObjects();
			case ExchangeFilePackage.RIF__SPEC_GROUPS:
				return getSpecGroups();
			case ExchangeFilePackage.RIF__SPEC_TYPES:
				return getSpecTypes();
			case ExchangeFilePackage.RIF__SPEC_RELATIONS:
				return getSpecRelations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExchangeFilePackage.RIF__AUTHOR:
				setAuthor((String)newValue);
				return;
			case ExchangeFilePackage.RIF__COMMENT:
				setComment((String)newValue);
				return;
			case ExchangeFilePackage.RIF__COUNTRY_CODE:
				setCountryCode((String)newValue);
				return;
			case ExchangeFilePackage.RIF__CREATION_TIME:
				setCreationTime((XMLGregorianCalendar)newValue);
				return;
			case ExchangeFilePackage.RIF__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case ExchangeFilePackage.RIF__SOURCE_TOOL_ID:
				setSourceToolId((String)newValue);
				return;
			case ExchangeFilePackage.RIF__TITLE:
				setTitle((String)newValue);
				return;
			case ExchangeFilePackage.RIF__VERSION:
				setVersion((String)newValue);
				return;
			case ExchangeFilePackage.RIF__ACCESS_POLICIES:
				getAccessPolicies().clear();
				getAccessPolicies().addAll((Collection<? extends AccessPolicy>)newValue);
				return;
			case ExchangeFilePackage.RIF__DATATYPES:
				getDatatypes().clear();
				getDatatypes().addAll((Collection<? extends DatatypeDefinition>)newValue);
				return;
			case ExchangeFilePackage.RIF__SPEC_HIERARCHY_ROOTS:
				getSpecHierarchyRoots().clear();
				getSpecHierarchyRoots().addAll((Collection<? extends SpecHierarchyRoot>)newValue);
				return;
			case ExchangeFilePackage.RIF__SPEC_OBJECTS:
				getSpecObjects().clear();
				getSpecObjects().addAll((Collection<? extends SpecObject>)newValue);
				return;
			case ExchangeFilePackage.RIF__SPEC_GROUPS:
				getSpecGroups().clear();
				getSpecGroups().addAll((Collection<? extends SpecGroup>)newValue);
				return;
			case ExchangeFilePackage.RIF__SPEC_TYPES:
				getSpecTypes().clear();
				getSpecTypes().addAll((Collection<? extends SpecType>)newValue);
				return;
			case ExchangeFilePackage.RIF__SPEC_RELATIONS:
				getSpecRelations().clear();
				getSpecRelations().addAll((Collection<? extends SpecRelation>)newValue);
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
			case ExchangeFilePackage.RIF__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case ExchangeFilePackage.RIF__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case ExchangeFilePackage.RIF__COUNTRY_CODE:
				setCountryCode(COUNTRY_CODE_EDEFAULT);
				return;
			case ExchangeFilePackage.RIF__CREATION_TIME:
				setCreationTime(CREATION_TIME_EDEFAULT);
				return;
			case ExchangeFilePackage.RIF__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case ExchangeFilePackage.RIF__SOURCE_TOOL_ID:
				setSourceToolId(SOURCE_TOOL_ID_EDEFAULT);
				return;
			case ExchangeFilePackage.RIF__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ExchangeFilePackage.RIF__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case ExchangeFilePackage.RIF__ACCESS_POLICIES:
				getAccessPolicies().clear();
				return;
			case ExchangeFilePackage.RIF__DATATYPES:
				getDatatypes().clear();
				return;
			case ExchangeFilePackage.RIF__SPEC_HIERARCHY_ROOTS:
				getSpecHierarchyRoots().clear();
				return;
			case ExchangeFilePackage.RIF__SPEC_OBJECTS:
				getSpecObjects().clear();
				return;
			case ExchangeFilePackage.RIF__SPEC_GROUPS:
				getSpecGroups().clear();
				return;
			case ExchangeFilePackage.RIF__SPEC_TYPES:
				getSpecTypes().clear();
				return;
			case ExchangeFilePackage.RIF__SPEC_RELATIONS:
				getSpecRelations().clear();
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
			case ExchangeFilePackage.RIF__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case ExchangeFilePackage.RIF__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case ExchangeFilePackage.RIF__COUNTRY_CODE:
				return COUNTRY_CODE_EDEFAULT == null ? countryCode != null : !COUNTRY_CODE_EDEFAULT.equals(countryCode);
			case ExchangeFilePackage.RIF__CREATION_TIME:
				return CREATION_TIME_EDEFAULT == null ? creationTime != null : !CREATION_TIME_EDEFAULT.equals(creationTime);
			case ExchangeFilePackage.RIF__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case ExchangeFilePackage.RIF__SOURCE_TOOL_ID:
				return SOURCE_TOOL_ID_EDEFAULT == null ? sourceToolId != null : !SOURCE_TOOL_ID_EDEFAULT.equals(sourceToolId);
			case ExchangeFilePackage.RIF__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ExchangeFilePackage.RIF__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case ExchangeFilePackage.RIF__ACCESS_POLICIES:
				return accessPolicies != null && !accessPolicies.isEmpty();
			case ExchangeFilePackage.RIF__DATATYPES:
				return datatypes != null && !datatypes.isEmpty();
			case ExchangeFilePackage.RIF__SPEC_HIERARCHY_ROOTS:
				return specHierarchyRoots != null && !specHierarchyRoots.isEmpty();
			case ExchangeFilePackage.RIF__SPEC_OBJECTS:
				return specObjects != null && !specObjects.isEmpty();
			case ExchangeFilePackage.RIF__SPEC_GROUPS:
				return specGroups != null && !specGroups.isEmpty();
			case ExchangeFilePackage.RIF__SPEC_TYPES:
				return specTypes != null && !specTypes.isEmpty();
			case ExchangeFilePackage.RIF__SPEC_RELATIONS:
				return specRelations != null && !specRelations.isEmpty();
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
		result.append(" (author: ");
		result.append(author);
		result.append(", comment: ");
		result.append(comment);
		result.append(", countryCode: ");
		result.append(countryCode);
		result.append(", creationTime: ");
		result.append(creationTime);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", sourceToolId: ");
		result.append(sourceToolId);
		result.append(", title: ");
		result.append(title);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //RIFImpl
