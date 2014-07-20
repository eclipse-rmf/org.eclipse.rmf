/*******************************************************************************
 * Copyright (c) 2014 Formal Mind GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.filter;

import org.eclipse.rmf.reqif10.SpecElementWithAttributes;

/**
 * An interface for ReqIF Attribute filtering.  Works on any {@link SpecElementWithAttributes}.
 * @author jastram
 *
 */
public interface ReqifFilter {
	
	/**
	 * Returns true if the SpecElement matches the filter criteria.
	 */
	public boolean match(SpecElementWithAttributes specElement);
}
