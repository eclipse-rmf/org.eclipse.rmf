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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.sphinx.emf.serialization.XMLPersistenceMappingResourceFactoryImpl;

public class NodesResourceFactoryImpl extends XMLPersistenceMappingResourceFactoryImpl {
	@Override
	public Resource createResource(URI uri) {
		return new NodesResourceImpl(uri);
	}
}
