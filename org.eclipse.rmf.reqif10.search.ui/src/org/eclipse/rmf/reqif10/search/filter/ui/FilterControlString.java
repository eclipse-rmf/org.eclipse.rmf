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

import org.eclipse.rmf.reqif10.search.filter.IFilter;
import org.eclipse.rmf.reqif10.search.filter.IFilter.Operator;
import org.eclipse.rmf.reqif10.search.filter.StringFilter;
import org.eclipse.rmf.reqif10.search.filter.StringFilter.InternalAttribute;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Text;

public class FilterControlString extends FilterControl {
	
	private Text text;
	private Combo attr;
	private Button caseSensitive;

	public FilterControlString(FilterPanel parent) {
		super(parent, SWT.FLAT);
		setLayout(new GridLayout(3, false));
		createOperators();
		createCaseSensitive();
		createText();
	}

	private void createText() {
		text = new Text(this, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		GridData layoutData = new GridData(SWT.FILL, SWT.CENTER, true, false);
		text.setLayoutData(layoutData);
	}

	private void createCaseSensitive() {
		caseSensitive = new Button(this, SWT.CHECK);
		caseSensitive.setText("Aa");
		caseSensitive.setToolTipText("Case Sensitive");
		GridData layoutData = new GridData(SWT.LEFT, SWT.CENTER, false, false);
		caseSensitive.setLayoutData(layoutData);
	}

	private void createOperators() {
		attr = new Combo(this, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
		GridData layoutData = new GridData(SWT.LEFT, SWT.CENTER, false, false);
		attr.setLayoutData(layoutData);
		for (Operator operator : StringFilter.SUPPORTED_OPERATORS) {
			attr.add(operator.toString());			
		}
	}
	
	public IFilter getFilter() {
		Operator operator = StringFilter.SUPPORTED_OPERATORS.asList().get(attr.getSelectionIndex());
		String value = text.getText();
		InternalAttribute internalFeature = InternalAttribute.IDENTIFIER;
		return new StringFilter(operator, value, internalFeature, caseSensitive.getSelection());
	}

}
