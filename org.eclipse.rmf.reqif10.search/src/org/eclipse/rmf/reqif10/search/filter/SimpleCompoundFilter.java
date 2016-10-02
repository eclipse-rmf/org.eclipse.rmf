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
 ******************************************************************************/
package org.eclipse.rmf.reqif10.search.filter;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.rmf.reqif10.SpecElementWithAttributes;

import com.google.common.collect.ImmutableSet;


/**
 * A filter that is composed of other Filters. 
 * 
 * The match method is an AND or OR composition of other filters. 
 *
 */

public class SimpleCompoundFilter implements ReqIFFullFilter {
	
	private static final long serialVersionUID = -5620986630086303913L;
	private boolean orFilter;
	private final LinkedList<ReqIFFullFilter> filters;	
	
	/**
	 * 
	 * @param filters
	 *            the list of filters to apply to the SpecObject
	 * 
	 * @param orFilter
	 *            if true the match method will return true if any of the
	 *            filters returns true.
	 *            if false the match method will return true if ALL of the
	 *            filters return true.
	 * 
	 */
	public SimpleCompoundFilter(List<ReqIFFullFilter> filters, boolean orFilter) {
		this.orFilter = orFilter ;
		this.filters = new LinkedList<ReqIFFullFilter>(filters);
	}
	
	public boolean isOrFilter() {
		return orFilter;
	}
	
	public List<ReqIFFullFilter> getFilters() {
		return Collections.unmodifiableList(filters);
	}
	
	
	@Override
	public boolean match(SpecElementWithAttributes element) {
		for (ReqIFFullFilter filter : filters) {
			boolean match = filter.match(element);
			if (orFilter) {
				if (match) return true;
			} else {
				if (! match) return false;
			}
		}

		// If we don't know by now:
		return ! orFilter;
	}

	@Override
	public Object getAttribute() {
		return null;
	}

	@Override
	public Operator getOperator() {
		return null;
	}


	@Override
	public Object getFilterValue1() {
		return null;
	}

	@Override
	public Object getFilterValue2() {
		return null;
	}

	@Override
	public ImmutableSet<Operator> getSupportedOperators() {
		return null;
	}

	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		String op = orFilter ? " OR " : " AND ";
		for (Iterator<ReqIFFullFilter> iterator = filters.iterator(); iterator.hasNext();) {
			ReqIFFullFilter filter = (ReqIFFullFilter) iterator.next();
			
			sb.append(filter.toString());
			if (iterator.hasNext()){
				sb.append(op + System.getProperty("line.separator"));
			}
		}
		return sb.toString();
	}
}
