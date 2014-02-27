/**
 * Copyright (c) 2014 Formal Mind GmbH.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 * 
 */
package org.eclipse.rmf.tests.reqif10.serialization.uc004;

/**
 * We have an enum for each tool for which a test file shall be generated.
 */
public enum ReqifTool {
	ALL_TOOLS(0), IBM_DOORS(1), IBM_DOORS_NEXT(2), PTCINTEGRITY(3), REXDOORS(4), REQIFSERV(5), ATEGO(6), REQEDIT(7), PROR(8);

	private final String foreignId;

	ReqifTool(int foreignId) {
		this.foreignId = foreignId + ""; //$NON-NLS-1$
	}

	public String getForeignId() {
		return foreignId;
	}
}
