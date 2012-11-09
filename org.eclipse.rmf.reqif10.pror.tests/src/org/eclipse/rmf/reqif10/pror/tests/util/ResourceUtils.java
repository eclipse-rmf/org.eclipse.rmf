/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.tests.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ResourceUtils {

	public static String inputStreamToString(InputStream in) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(in));
		StringBuilder stringBuilder = new StringBuilder();
		String line = null;

		while ((line = bufferedReader.readLine()) != null) {
			stringBuilder.append(line + "\n");
		}

		bufferedReader.close();
		return stringBuilder.toString();
	}

}
