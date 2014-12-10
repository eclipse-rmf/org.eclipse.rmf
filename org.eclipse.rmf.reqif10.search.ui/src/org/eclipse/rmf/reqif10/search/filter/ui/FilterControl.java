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
package org.eclipse.rmf.reqif10.search.filter.ui;

import java.util.ResourceBundle;

import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionDate;
import org.eclipse.rmf.reqif10.AttributeDefinitionInteger;
import org.eclipse.rmf.reqif10.AttributeDefinitionReal;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.search.filter.AbstractTextFilter;
import org.eclipse.rmf.reqif10.search.filter.DateFilter;
import org.eclipse.rmf.reqif10.search.filter.IFilter;
import org.eclipse.rmf.reqif10.search.filter.NumberFilter;
import org.eclipse.rmf.reqif10.search.filter.StringFilter;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * Represents the actual {@link Control} that holds the settings for the contained filter.
 * Also provides factory methods for building {@link FilterControl} instances.
 * 
 * @author jastram
 */
public abstract class FilterControl extends Composite {

	public FilterControl(Composite parent, int style) {
		super(parent, style);
	}

	/**
	 * Constructs a Filter object from the current configuration of the Control.
	 * @return the {@link IFilter} object.
	 */
	abstract public IFilter getFilter();
	
	/**
	 * This factory instantiates the correct FilterControl for a given filter.
	 */
	public static FilterControl createFilterControl(FilterPanel parent, IFilter filter) {
		if (filter instanceof StringFilter) return new FilterControlString(parent, (StringFilter)filter);
		if (filter instanceof DateFilter) return new FilterControlDate(parent, (DateFilter)filter);
		if (filter instanceof NumberFilter) return new FilterControlNumber(parent, (NumberFilter)filter);

		throw new IllegalArgumentException("Don't know how to create: " + filter);		
	}

	/**
	 * This factory instantiates the correct FilterControl for a given filter.
	 */
	public static FilterControl createFilterControl(FilterPanel parent,
			AbstractTextFilter.InternalAttribute internalTextAttribute) {
		return new FilterControlString(parent, internalTextAttribute);
	}

	public static FilterControl createFilterControl(FilterPanel parent,
			DateFilter.InternalAttribute internalDateAttribute) {
		return new FilterControlDate(parent, internalDateAttribute);
	}

	public static FilterControl createFilterControl(FilterPanel parent,
			AttributeDefinition attribute) {
		if (attribute instanceof AttributeDefinitionString) {
			return new FilterControlString(parent,
					(AttributeDefinitionString) attribute);
		} else if (attribute instanceof AttributeDefinitionInteger
				|| attribute instanceof AttributeDefinitionReal) {
			return new FilterControlNumber(parent, attribute);
		} else if (attribute instanceof AttributeDefinitionDate) {
			return new FilterControlDate(parent,
					(AttributeDefinitionDate) attribute);
		}
		throw new IllegalArgumentException("Don't know how to create (yet): " + attribute); 
	}
	
	/**
	 * This method retrieves a value from the Plugin.
	 */
	public static String getString(String key) {
		// Note that ResourceBundle has nothing to do with Eclipse.  But it's a convenient
		// means of accessing plugin.properties, which we need anyway.
		return ResourceBundle.getBundle("plugin").getString(key);
	}

}
