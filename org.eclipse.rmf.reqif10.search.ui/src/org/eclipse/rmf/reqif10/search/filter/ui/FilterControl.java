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

import java.util.List;
import java.util.ResourceBundle;

import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionBoolean;
import org.eclipse.rmf.reqif10.AttributeDefinitionDate;
import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeDefinitionInteger;
import org.eclipse.rmf.reqif10.AttributeDefinitionReal;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeDefinitionXHTML;
import org.eclipse.rmf.reqif10.search.filter.AbstractTextFilter;
import org.eclipse.rmf.reqif10.search.filter.BoolFilter;
import org.eclipse.rmf.reqif10.search.filter.DateFilter;
import org.eclipse.rmf.reqif10.search.filter.DateFilter.InternalAttribute;
import org.eclipse.rmf.reqif10.search.filter.EnumFilter;
import org.eclipse.rmf.reqif10.search.filter.ReqIFFullFilter;
import org.eclipse.rmf.reqif10.search.filter.NumberFilter;
import org.eclipse.rmf.reqif10.search.filter.ReqIFFullFilter.Operator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * Represents the actual {@link Control} that holds the settings for the
 * contained filter. The infrastructure manages the operator.
 * 
 * Also provides factory methods for building {@link FilterControl} instances.
 * 
 * @author jastram
 */
public abstract class FilterControl extends Composite {

	protected ReqIFFullFilter templateFilter;
	protected Object attribute;

	private Combo operatorControl;

	/**
	 * New {@link FilterControl} for the given {@link #attribute}, which can be
	 * an internal attribute or an {@link AttributeDefinition}.
	 */
	public FilterControl(FilterPanel parent, AttributeDefinition attribute) {
		super(parent, SWT.FLAT);
		this.attribute = attribute;
		init();
	}

	public FilterControl(FilterPanel parent, InternalAttribute attribute) {
		super(parent, SWT.FLAT);
		this.attribute = attribute;
		init();
	}

	public FilterControl(
			FilterPanel parent,
			org.eclipse.rmf.reqif10.search.filter.AbstractTextFilter.InternalAttribute attribute) {
		super(parent, SWT.FLAT);
		this.attribute = attribute;
		init();
	}

	/**
	 * New {@link FilterControl} for the given template {@link ReqIFFullFilter}.
	 */
	public FilterControl(FilterPanel parent, ReqIFFullFilter template) {
		super(parent, SWT.FLAT);
		this.templateFilter = template;
		this.attribute = template.getAttribute();
		init();
	}



	/**
	 * Returns the operator selected in the GUI, never null.
	 * 
	 * @return
	 */
	protected final Operator getOperator() {
		return getOperators().get(operatorControl.getSelectionIndex());
	}

	/**
	 * Typical implementation:
	 * 
	 * <pre>
	 * return ABCFilter.SUPPORTED_OPERATORS.asList();
	 * </pre>
	 */
	protected abstract List<Operator> getOperators();

	/**
	 * Called when the operator changes. As different operators require
	 * different numbers of values, the GUI may need to be adapted accordingly.
	 * 
	 * If initialize is true, the controls should be initialized from the
	 * template.
	 */
	protected abstract void updateValueControls(boolean initialize);

	/**
	 * Constructs a Filter object from the current configuration of the Control.
	 * 
	 * @return the {@link ReqIFFullFilter} object.
	 */
	abstract public ReqIFFullFilter getFilter();

	private void init() {
		if (attribute == null) throw new NullPointerException();
		setLayout(new GridLayout(3, false));
		createOperators();
		updateValueControls(templateFilter != null);
	}

	private void createOperators() {
		operatorControl = new Combo(this, SWT.DROP_DOWN | SWT.BORDER
				| SWT.READ_ONLY);
		GridData layoutData = new GridData(SWT.LEFT, SWT.CENTER, false, false);
		operatorControl.setLayoutData(layoutData);
		for (Operator operator : getOperators()) {
			operatorControl.add(operator.toLocaleString());
		}
		operatorControl.select(0);
		if (templateFilter != null) {
			operatorControl.select(getOperators().indexOf(
					templateFilter.getOperator()));
		}

		operatorControl.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateValueControls(false);
				layout(true);
			}
		});
	}

	// //////////////////////////////////////////////////////////////////////////

	/**
	 * This factory instantiates the correct FilterControl for a given filter.
	 */
	public static FilterControl createFilterControl(FilterPanel parent,
			ReqIFFullFilter filter) {
		if (filter instanceof AbstractTextFilter)
			return new FilterControlString(parent, (AbstractTextFilter) filter);
		if (filter instanceof DateFilter)
			return new FilterControlDate(parent, (DateFilter) filter);
		if (filter instanceof NumberFilter)
			return new FilterControlNumber(parent, (NumberFilter) filter);
		if (filter instanceof BoolFilter)
			return new FilterControlBoolean(parent, (BoolFilter) filter);
		if (filter instanceof EnumFilter)
			return new FilterControlEnum(parent, (EnumFilter) filter);

		throw new IllegalArgumentException("Don't know how to create: "
				+ filter);
	}

	/**
	 * This factory instantiates the correct FilterControl for a given filter.
	 */
	public static FilterControl createFilterControl(FilterPanel parent,
			AbstractTextFilter.InternalAttribute internalTextAttribute) {
		return new FilterControlString(parent, internalTextAttribute);
	}

	/**
	 * This factory instantiates the correct FilterControl for a given filter.
	 */
	public static FilterControl createFilterControl(FilterPanel parent,
			DateFilter.InternalAttribute internalDateAttribute) {
		return new FilterControlDate(parent, internalDateAttribute);
	}

	/**
	 * This factory instantiates the correct FilterControl for a given filter.
	 */
	public static FilterControl createFilterControl(FilterPanel parent,
			AttributeDefinition attribute) {
		if (attribute instanceof AttributeDefinitionString
				|| attribute instanceof AttributeDefinitionXHTML) {
			return new FilterControlString(parent, attribute);
		} else if (attribute instanceof AttributeDefinitionInteger
				|| attribute instanceof AttributeDefinitionReal) {
			return new FilterControlNumber(parent, attribute);
		} else if (attribute instanceof AttributeDefinitionDate) {
			return new FilterControlDate(parent,
					(AttributeDefinitionDate) attribute);
		} else if (attribute instanceof AttributeDefinitionBoolean) {
			return new FilterControlBoolean(parent,
					(AttributeDefinitionBoolean) attribute);
		} else if (attribute instanceof AttributeDefinitionEnumeration) {
			return new FilterControlEnum(parent,
					(AttributeDefinitionEnumeration) attribute);
		}
		throw new IllegalArgumentException("Don't know how to create (yet): "
				+ attribute);
	}

	/**
	 * This method retrieves a value from the Plugin.
	 */
	public static String getString(String key) {
		// Note that ResourceBundle has nothing to do with Eclipse. But it's a
		// convenient
		// means of accessing plugin.properties, which we need anyway.
		return ResourceBundle.getBundle("plugin").getString(key);
	}

}
