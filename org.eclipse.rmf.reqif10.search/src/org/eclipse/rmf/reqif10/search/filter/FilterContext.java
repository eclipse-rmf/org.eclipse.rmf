/*******************************************************************************
 * Copyright (c) 2016 Formal Mind GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - created
 ******************************************************************************/
package org.eclipse.rmf.reqif10.search.filter;

import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.ReqIF;

/**
 * Sadly, this class is a hack. For restoring {@link ReqIFFullFilter}s that 
 * have been persisted, the AttributeDefinition ID must be used to create an
 * {@link AttributeDefinition} instance. To do this, we need the ReqIF it
 * belongs to. This is stored in the FilterContext.
 * 
 * @author jastram
 *
 */
public class FilterContext {
	
	/**
	 * The ReqIF that should be used to resolve the reconstruction of a Filter.
	 * To be on the safe side, code should reset it to null after use.
	 */
	public static ReqIF REQIF;
}
