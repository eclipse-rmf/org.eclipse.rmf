/*******************************************************************************
 * Copyright (c) 2014 Formal Mind GmbH.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ingo Weigelt - initial API and implementation
 *     Michael Jastram - Label Support, ReqifFilter inheritance
 ******************************************************************************/
package org.eclipse.rmf.reqif10.search.filter;

import java.util.ResourceBundle;

import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.pror.filter.ReqifFilter;

import com.google.common.collect.ImmutableSet;

public interface IFilter extends ReqifFilter {

	/**
	 * Subclasses should implement a static immutable field that allows clients
	 * to retrieve the list of supported operations.
	 * 
	 * public static final ImmutableSet<Operator> SUPPORTED_OPERATORS = ...;
	 */
	
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
		CONTAINS_ANY("operator_contains_any"),
		IS_SET("operator_is_set"),
		IS_NOT_SET("operator_is_not_set");
		
		private String label;
		private Operator(String label) {
			this.label = label;
		}
		@Override
		public String toString() {
			return label;
		}
		
		public String toLocaleString(){
			return ResourceBundle.getBundle("plugin").getString(label);
		}
	}
	
	public boolean match(SpecElementWithAttributes element); 
	
	/**
	 * Returns the Attribute for this filter.
	 */
	public Object getAttribute();
	
	public Operator getOperator();
	
	public Object getFilterValue1();
	
	public Object getFilterValue2();
	
	public ImmutableSet<Operator> getSupportedOperators();

	
	
	
	
}
