/**
 * Copyright (c) 2012 Formal Mind GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 * 
 */

package org.eclipse.rmf.reqif10.tests.uc001.tc1250.testdata;

import java.io.InputStream;

public class TC1250Testdata {

	/**
	 * Provides easy access to Testdata by returning a Stream from a file name.
	 */
	public static InputStream getInputStream(String filename) {
		return TC1250Testdata.class.getResourceAsStream(filename);
	}

}
