/*******************************************************************************
 * Copyright (c) 2014 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Mark Broerkens (itemis AG) - initial API and implementation
 *******************************************************************************/
package org.eclipse.rmf.tests.serialization.model.nodes.serialization;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;
import org.eclipse.rmf.tests.serialization.model.nodes.NodesPackage;
import org.eclipse.sphinx.emf.serialization.XMLPersistenceMappingResourceImpl;

public class NodesResourceImpl extends XMLPersistenceMappingResourceImpl {

	public NodesResourceImpl() {
		super();
	}

	public NodesResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	public void initDefaultOptions() {
		super.initDefaultOptions();
		// ========= create options map===================
		final XMLResource.XMLMap optionsMap = new XMLMapImpl();
		optionsMap.setIDAttributeName(NodesPackage.Literals.NODE__NAME.getName());
		// ========= default save options ===================
		Map<Object, Object> saveOptions = getDefaultSaveOptions();
		Map<String, String> namespaceToPrefixMap = new HashMap<String, String>();
		namespaceToPrefixMap.put(NodesPackage.eNS_URI, ""); //$NON-NLS-1$
		saveOptions.put(OPTION_NAMEPSACE_TO_PREFIX_MAP, namespaceToPrefixMap);
		saveOptions.put(XMLResource.OPTION_XML_MAP, optionsMap);

		// ========= default load options ===================
		Map<Object, Object> loadOptions = getDefaultLoadOptions();
		loadOptions.put(XMLResource.OPTION_XML_MAP, optionsMap);
	}

	/**
	 * Return <code>true</code>.
	 *
	 * @return <code>true</code>.
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl#useUUIDs()
	 */
	@Override
	protected boolean useUUIDs() {
		return true;
	}

	/**
	 * Return <code>true</code>.
	 *
	 * @return <code>true</code>.
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl#assignIDsWhileLoading()
	 */
	@Override
	protected boolean assignIDsWhileLoading() {
		return true;
	}

	/**
	 * Sets the ID of the object. The default implementation will update the {@link #eObjectToIDMap}. This behavior is
	 * override to set the ID in a object's specific attribute to set the id in the
	 * {@link Identifiable#setIdentifier(String)} and call the super method.
	 *
	 * @param eObject
	 *            : The object where the Id must be set.
	 * @param id
	 *            : The object's Id.
	 * @see org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl#setID(org.eclipse.emf.ecore.EObject, java.lang.String)
	 */
	@Override
	public void setID(final EObject eObject, final String id) {
		final EAttribute idAttribute = eObject.eClass().getEIDAttribute();
		if (idAttribute != null && id != null) {
			eObject.eSet(idAttribute, id);
		}
		super.setID(eObject, id);
	}

}
