/**
 * Copyright (c) 2013 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   itemis AG - initial API and implementation
 */
package org.eclipse.rmf.reqif10.serialization;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPackage;
import org.eclipse.rmf.serialization.IdAdapter;
import org.eclipse.rmf.serialization.XMLPersistenceMappingResourceImpl;

public class ReqIF10ResourceImpl extends XMLPersistenceMappingResourceImpl {

	public ReqIF10ResourceImpl() {
		super();
		initDefaultOptions();
	}

	public ReqIF10ResourceImpl(URI uri) {
		super(uri);
		initDefaultOptions();
	}

	@Override
	protected void init() {
		super.init();
		// enable id creation and maintenance
		idToEObjectMap = new HashMap<String, EObject>();
		eObjectToIDMap = new HashMap<EObject, String>();
		Collection<EPackage> createIdForPackageSet = new HashSet<EPackage>();
		createIdForPackageSet.add(ReqIF10Package.eINSTANCE);
		eAdapters().add(new IdAdapter(idToEObjectMap, eObjectToIDMap, createIdForPackageSet));
	}

	@Override
	public void initDefaultOptions() {
		super.initDefaultOptions();
		// ========= default save options ===================
		Map<Object, Object> saveOptions = getDefaultSaveOptions();
		Map<String, String> namespaceToPrefixMap = new HashMap<String, String>();
		namespaceToPrefixMap.put(ReqIF10Package.eNS_URI, ""); //$NON-NLS-1$ 
		namespaceToPrefixMap.put(XhtmlPackage.eNS_URI, "xhtml"); //$NON-NLS-1$ 
		saveOptions.put(OPTION_NAMEPSACE_TO_PREFIX_MAP, namespaceToPrefixMap);
		
		// ========= default load options ===================
		Map<Object, Object> loadOptions = getDefaultLoadOptions();

	}

}
