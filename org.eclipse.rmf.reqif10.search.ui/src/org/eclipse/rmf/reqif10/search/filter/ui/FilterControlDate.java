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

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.eclipse.rmf.reqif10.AttributeDefinitionDate;
import org.eclipse.rmf.reqif10.search.filter.DateFilter;
import org.eclipse.rmf.reqif10.search.filter.DateFilter.InternalAttribute;
import org.eclipse.rmf.reqif10.search.filter.IFilter;
import org.eclipse.rmf.reqif10.search.filter.IFilter.Operator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.DateTime;

public class FilterControlDate extends FilterControl {
	
	private DateTime date1;
	private DateTime date2;
	private Combo attr;
	private Object attribute;
	private DateFilter templateFilter;

	public FilterControlDate(FilterPanel parent, DateFilter.InternalAttribute attribute) {
		this(parent, (DateFilter)null);
		this.attribute = attribute;
	}

	public FilterControlDate(FilterPanel parent,
			AttributeDefinitionDate attribute) {
		this(parent, (DateFilter)null);
		this.attribute = attribute;
	}

	public FilterControlDate(FilterPanel parent, DateFilter template) {
		super(parent, SWT.FLAT);
		if (template != null) {
			this.attribute = template.getAttribute();
			this.templateFilter = template;			
		}
		setLayout(new GridLayout(3, false));
		createOperators();
		createValueControls();		
	}

	private void createValueControls() {
		date1 = new DateTime(this, SWT.DATE | SWT.DROP_DOWN | SWT.BORDER);
		GridData layoutData = new GridData(SWT.FILL, SWT.CENTER, true, false);
		date1.setLayoutData(layoutData);
		updateValueControls();
		
		if (templateFilter != null) {
			GregorianCalendar cal1 = templateFilter.getFilterValue1();
			date1.setDate(cal1.get(Calendar.YEAR), cal1.get(Calendar.MONTH), cal1.get(Calendar.DAY_OF_MONTH));
			GregorianCalendar cal2 = templateFilter.getFilterValue2();
			if (cal2 != null) {
				date2.setDate(cal2.get(Calendar.YEAR), cal2.get(Calendar.MONTH), cal2.get(Calendar.DAY_OF_MONTH));				
			}
		}
	}

	private void createOperators() {
		attr = new Combo(this, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
		GridData layoutData = new GridData(SWT.LEFT, SWT.CENTER, false, false);
		attr.setLayoutData(layoutData);
		for (Operator operator : DateFilter.SUPPORTED_OPERATORS) {
			attr.add(getString(operator.toString()));			
		}
		attr.select(0);
		if (templateFilter != null)
			attr.select(DateFilter.SUPPORTED_OPERATORS.asList().indexOf(
					templateFilter.getOperator()));
		
		attr.addSelectionListener(new SelectionAdapter() {			
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateValueControls();
				layout(true);
			}
		});
	}
	
	protected void updateValueControls() {
		if (DateFilter.SUPPORTED_OPERATORS.asList().indexOf(Operator.BETWEEN) == attr.getSelectionIndex()) {
			if (date2 == null) {
				date2 = new DateTime(this, SWT.DATE | SWT.DROP_DOWN | SWT.BORDER);
				GridData layoutData = new GridData(SWT.FILL, SWT.CENTER, true, false);
				date2.setLayoutData(layoutData);
			} 
		} else {
			if (date2 != null) {
				date2.dispose();
				date2 = null;
			}
		}
		layout();
	}

	public IFilter getFilter() {
		Operator operator = DateFilter.SUPPORTED_OPERATORS.asList().get(attr.getSelectionIndex());
		GregorianCalendar value1 = new GregorianCalendar(date1.getYear(), date1.getMonth(), date1.getDay());
		GregorianCalendar value2 = date2 == null ? null : new GregorianCalendar(date2.getYear(), date2.getMonth(), date2.getDay());
		if (attribute instanceof InternalAttribute) {
			return new DateFilter(operator, value1, value2, (InternalAttribute)attribute);
		} else {
			return new DateFilter(operator, value1, value2, (AttributeDefinitionDate)attribute);
		}
	}
}
