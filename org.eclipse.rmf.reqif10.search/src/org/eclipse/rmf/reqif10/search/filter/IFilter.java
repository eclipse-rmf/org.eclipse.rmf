/*******************************************************************************
 * Copyright (c) 2014 Ingo Weigelt
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ingo Weigelt - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.search.filter;

import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.pror.filter.ReqifFilter;

import com.google.common.collect.ImmutableSet;

public interface IFilter extends ReqifFilter {

	public enum Operator{
		EQUALS,
		IS,
		IS_NOT,
		NOT_EQUALS,
		CONTAINS,
		NOT_CONTAINS,
		REGEXP,
		REGEXP_PLAIN,
		BETWEEN,
		GREATER,
		SMALLER,
		BEFORE,
		AFTER,
		CONTAINS_ALL,
		CONTAINS_ANY
	}

	/**
	 * @return The given Operations supported by a concrete {@link IFilter} implementation.
	 */
	public ImmutableSet<Operator> getSupportedOperations();
	
	public boolean match(SpecElementWithAttributes element); 
	
}
