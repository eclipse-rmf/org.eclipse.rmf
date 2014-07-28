/**
 * Copyright (c) 2013 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   itemis AG - initial API and implementation
 */
package org.eclipse.rmf.reqif10.serialization;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPackage;
import org.eclipse.rmf.serialization.XMLPersistenceMappingResourceImpl;

public class ReqIF10ResourceImpl extends XMLPersistenceMappingResourceImpl {

	public ReqIF10ResourceImpl() {
		super();
	}

	public ReqIF10ResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	public void initDefaultOptions() {
		super.initDefaultOptions();
		// ========= create options map===================
		final XMLResource.XMLMap optionsMap = new XMLMapImpl();
		optionsMap
				.setIDAttributeName(ReqIF10Package.Literals.IDENTIFIABLE__IDENTIFIER
						.getName());

		// ========= default save options ===================
		Map<Object, Object> saveOptions = getDefaultSaveOptions();
		Map<String, String> namespaceToPrefixMap = new HashMap<String, String>();
		namespaceToPrefixMap.put(ReqIF10Package.eNS_URI, ""); //$NON-NLS-1$ 
		namespaceToPrefixMap.put(XhtmlPackage.eNS_URI, "xhtml"); //$NON-NLS-1$ 
		saveOptions.put(OPTION_NAMEPSACE_TO_PREFIX_MAP, namespaceToPrefixMap);
		saveOptions.put(XMLResource.OPTION_XML_MAP, optionsMap);

		// ========= default load options ===================
		Map<Object, Object> loadOptions = getDefaultLoadOptions();
		loadOptions.put(XMLResource.OPTION_XML_MAP, optionsMap);

	}

}
