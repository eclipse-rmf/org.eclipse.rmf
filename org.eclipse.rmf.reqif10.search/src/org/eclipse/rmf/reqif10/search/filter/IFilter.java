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
		EQUALS("operator_equals"),
		IS("operator_is"),
		IS_NOT("operator_is_not"),
		NOT_EQUALS("operator_not_equals"),
		CONTAINS("operator_contains"),
		NOT_CONTAINS("operator_not_contains"),
		REGEXP("operator_regexp"),
		REGEXP_PLAIN("operator_regexp_plain"),
		BETWEEN("operator_between"),
		GREATER("operator_greater"),
		SMALLER("operator_smaller"),
		BEFORE("operator_before"),
		AFTER("operator_after"),
		CONTAINS_ALL("operator_contains_all"),
		CONTAINS_ANY("operator_contains_any");
		
		private String label;
		private Operator(String label) {
			this.label = label;
		}
		@Override
		public String toString() {
			// TODO NS-Lookup
			return label;
		}
	}
	
	/**
	 * @return The given Operations supported by a concrete {@link IFilter} implementation.
	 */
	public ImmutableSet<Operator> getSupportedOperations();
	
	public boolean match(SpecElementWithAttributes element); 
	
}
