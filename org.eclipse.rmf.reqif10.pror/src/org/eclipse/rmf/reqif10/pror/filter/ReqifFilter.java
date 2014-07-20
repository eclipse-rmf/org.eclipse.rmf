package org.eclipse.rmf.reqif10.pror.filter;

import org.eclipse.rmf.reqif10.SpecElementWithAttributes;

public interface ReqifFilter {
	
	/**
	 * Returns true if the SpecElement matches the filter criteria.
	 */
	public boolean match(SpecElementWithAttributes specElement);

}
