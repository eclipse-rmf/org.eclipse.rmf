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
import org.eclipse.rmf.serialization.XMLPersistenceMappingResourceImpl;
import org.eclipse.rmf.tests.serialization.model.nodes.NodesPackage;

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
		// ========= default save options ===================
		Map<Object, Object> saveOptions = getDefaultSaveOptions();
		Map<String, String> namespaceToPrefixMap = new HashMap<String, String>();
		namespaceToPrefixMap.put(NodesPackage.eNS_URI, ""); //$NON-NLS-1$
		saveOptions.put(OPTION_NAMEPSACE_TO_PREFIX_MAP, namespaceToPrefixMap);
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

}
