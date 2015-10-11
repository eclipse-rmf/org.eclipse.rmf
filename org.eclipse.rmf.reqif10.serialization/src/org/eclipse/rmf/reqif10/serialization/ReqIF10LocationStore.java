/*******************************************************************************
 * Copyright (c) 2015 Formal Mind GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ingo Weigelt (Formal Mind GmbH)
 *******************************************************************************/
package org.eclipse.rmf.reqif10.serialization;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.xmi.XMLResource;

public class ReqIF10LocationStore {

	private static ReqIF10LocationStore INSTANCE = null;

	Map<XMLResource, Map<String, Integer>> idToPosition = new HashMap<XMLResource, Map<String, Integer>>();

	private ReqIF10LocationStore() {
	}

	public static ReqIF10LocationStore getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ReqIF10LocationStore();
		}
		return INSTANCE;
	}

	public Integer getPosition(XMLResource resource, String id) {
		Map<String, Integer> map = idToPosition.get(resource);
		if (map != null) {
			return map.get(id);
		}
		return null;
	}

	public void savePosition(XMLResource resource, String id, Integer lineNumber) {
		Map<String, Integer> map = idToPosition.get(resource);
		if (map == null) {
			map = new HashMap<String, Integer>();
			idToPosition.put(resource, map);
		}

		map.put(id, lineNumber);
	}
}
