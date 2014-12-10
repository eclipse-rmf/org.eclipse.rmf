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

import org.eclipse.rmf.reqif10.AttributeDefinitionBoolean;
import org.eclipse.rmf.reqif10.search.filter.BoolFilter;
import org.eclipse.rmf.reqif10.search.filter.IFilter;
import org.eclipse.rmf.reqif10.search.filter.IFilter.Operator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;

/**
 * Used for plain text and XHTML
 * 
 * @author jastram
 */
public class FilterControlBoolean extends FilterControl {
	
	private Combo valueControl;
	private Combo attr;
	private AttributeDefinitionBoolean attribute;
	private BoolFilter templateFilter;

	public FilterControlBoolean(FilterPanel parent,
			AttributeDefinitionBoolean attribute) {
		super(parent, SWT.FLAT);
		this.attribute = attribute;
		init();
	}

	public FilterControlBoolean(FilterPanel parent, BoolFilter template) {
		super(parent, SWT.FLAT);
		this.attribute = (AttributeDefinitionBoolean) template.getAttribute();
		this.templateFilter = template;			
		init();		
	}

	private void init() {
		if (!(attribute instanceof AttributeDefinitionBoolean)) {
			throw new IllegalArgumentException("Not allowed: " + attribute);
		}
		setLayout(new GridLayout(2, false));
		createOperators();
		createValueControl();
	}

	private void createValueControl() {
		valueControl = new Combo(this, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
		valueControl.add("FALSE"); // index: 0
		valueControl.add("TRUE");  // index: 1
		valueControl.select(0);
		GridData layoutData = new GridData(SWT.FILL, SWT.CENTER, true, false);
		valueControl.setLayoutData(layoutData);
		if (templateFilter != null) {
			boolean value = (Boolean)templateFilter.getFilterValue1();
			valueControl.select(value ? 1 : 0);
		}
	}

	private void createOperators() {
		attr = new Combo(this, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
		GridData layoutData = new GridData(SWT.LEFT, SWT.CENTER, false, false);
		attr.setLayoutData(layoutData);
		for (Operator operator : BoolFilter.SUPPORTED_OPERATORS) {
			attr.add(getString(operator.toString()));			
		}
		attr.select(0);
		if (templateFilter != null)
			attr.select(BoolFilter.SUPPORTED_OPERATORS.asList().indexOf(
					templateFilter.getOperator()));
	}
	
	public IFilter getFilter() {
		Operator operator = BoolFilter.SUPPORTED_OPERATORS.asList().get(attr.getSelectionIndex());
		Boolean value = new Boolean(valueControl.getSelectionIndex() == 1);
		return new BoolFilter(operator, value, attribute);
	}
}
