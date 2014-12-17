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

import java.math.BigInteger;

import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionReal;
import org.eclipse.rmf.reqif10.search.filter.IFilter;
import org.eclipse.rmf.reqif10.search.filter.IFilter.Operator;
import org.eclipse.rmf.reqif10.search.filter.NumberFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;

import com.google.common.collect.ImmutableList;

/**
 * This control handles Integers and Reals.

 * @author jastram
 */
public class FilterControlNumber extends FilterControl {
	
	private NumberControl num[] = new NumberControl[2];
	private Combo attr;
	private AttributeDefinition attribute;
	private NumberFilter templateFilter;
	
	public FilterControlNumber(FilterPanel parent,
			AttributeDefinition attribute) {
		super(parent, SWT.FLAT);
		this.attribute = attribute;
		init();
	}

	public FilterControlNumber(FilterPanel parent, NumberFilter template) {
		super(parent, SWT.FLAT);
		this.attribute = template.getAttribute();
		this.templateFilter = template;			
		init();
	}

	private void init() {
		setLayout(new GridLayout(3, false));
		createOperators();
		showNum(1, true);
		updateValueControls();
		
		if (templateFilter != null) {
			if (templateFilter.getFilterValue1() != null) {
				num[0].setValue(templateFilter.getFilterValue1());
			}
			if (templateFilter.getFilterValue2() != null) {
				num[1].setValue(templateFilter.getFilterValue2());
			}
		}
	}

	private void createOperators() {
		attr = new Combo(this, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
		GridData layoutData = new GridData(SWT.LEFT, SWT.CENTER, false, false);
		attr.setLayoutData(layoutData);
		for (Operator operator : NumberFilter.SUPPORTED_OPERATORS) {
			attr.add(operator.toLocaleString());			
		}
		attr.select(0);
		if (templateFilter != null)
			attr.select(NumberFilter.SUPPORTED_OPERATORS.asList().indexOf(
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
		ImmutableList<Operator> operatorList = NumberFilter.SUPPORTED_OPERATORS.asList();

		if (operatorList.indexOf(Operator.IS_SET) == attr.getSelectionIndex()
				|| NumberFilter.SUPPORTED_OPERATORS.asList().indexOf(
						Operator.IS_NOT_SET) == attr.getSelectionIndex()) {
			showNum(0, false);
			showNum(1, false);
		}
		else if (NumberFilter.SUPPORTED_OPERATORS.asList().indexOf(Operator.BETWEEN) == attr.getSelectionIndex()) {
			showNum(0, true);
			showNum(1, true);
		} else {
			showNum(0, true);
			showNum(1, false);
		}
		layout();
	}

	private void showNum(int controlId, boolean show) {
		if (show && num[controlId] == null) {
			num[controlId] = new NumberControl(this, attribute instanceof AttributeDefinitionReal);
			GridData layoutData = new GridData(SWT.FILL, SWT.CENTER, true, false);
			num[controlId].getControl().setLayoutData(layoutData);
		} 
		if (! show && num[controlId] != null) {
			num[controlId].getControl().dispose();
			num[controlId] = null;
		}
	}

	public IFilter getFilter() {
		Operator operator = NumberFilter.SUPPORTED_OPERATORS.asList().get(attr.getSelectionIndex());
		Number value1 = num[0] == null ? null : num[0].getNumber();
		Number value2 = num[1] == null ? null : num[1].getNumber();

		return new NumberFilter(operator, value1,
				value2, attribute);
	}
}

/**
 * We need to build our own control, rather than using {@link Spinner}, because
 * Spinner is a total hack with far too many limitations :-(
 * 
 * @author jastram
 */
class NumberControl {

	private boolean isReal;
	private Text text;

	public NumberControl(Composite parent, boolean isReal) {
		text = new Text(parent, SWT.BORDER | SWT.FILL);
		this.isReal = isReal;
		text.setText("0");
		addValidator();
	}
	
	public Text getControl() {
		return text;
	}

	private void addValidator() {
		text.addVerifyListener(new VerifyListener() {
			@Override
			public void verifyText(VerifyEvent e) {
				final String oldS = text.getText();
				final String newS = oldS.substring(0, e.start) + e.text
						+ oldS.substring(e.end);
				
				// We allow an empty String
				if (newS.length() == 0) return;

				try {
					if (isReal) {
						new Double(newS);
					} else {
						new BigInteger(newS);
					}
				} catch (final NumberFormatException numberFormatException) {
					// value is not decimal
					e.doit = false;
				}
			}
		});
	}

	public Number getNumber() {
		if (text.getText().length() == 0 ) text.setText("0");
		return isReal ? new Double(text.getText()) : new BigInteger(text.getText());		
	}

	public void setValue(Number value) {
		text.setText(value.toString());
	}
	
}
