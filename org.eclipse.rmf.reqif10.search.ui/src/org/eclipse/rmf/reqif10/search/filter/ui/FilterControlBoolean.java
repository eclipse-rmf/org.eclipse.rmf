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

import org.eclipse.rmf.reqif10.AttributeDefinitionBoolean;
import org.eclipse.rmf.reqif10.search.filter.BoolFilter;
import org.eclipse.rmf.reqif10.search.filter.ReqIFFullFilter;
import org.eclipse.rmf.reqif10.search.filter.ReqIFFullFilter.Operator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;

/**
 * Used for Boolean
 * 
 * @author jastram
 */
public class FilterControlBoolean extends FilterControl {
	
	private Combo valueControl;

	public FilterControlBoolean(FilterPanel parent,
			AttributeDefinitionBoolean attribute) {
		super(parent, attribute);
	}

	public FilterControlBoolean(FilterPanel parent, BoolFilter template) {
		super(parent, template);
	}

	protected void updateValueControls(boolean initialize) {
		if (getOperator() == Operator.IS_SET || getOperator() == Operator.IS_NOT_SET) {
			showValueControl(false);			
		} else {
			showValueControl(true);
			if (initialize) {
				Boolean defaultValue = (Boolean) templateFilter.getFilterValue1();
				valueControl.select(Boolean.TRUE.equals(defaultValue) ? 1 : 0);
			}
		}		
		layout();
	}

	private void showValueControl(boolean show) {
		if (show && valueControl == null) {
			valueControl = new Combo(this, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
			valueControl.add("FALSE"); // index: 0
			valueControl.add("TRUE");  // index: 1
			valueControl.select(0);
			GridData layoutData = new GridData(SWT.FILL, SWT.CENTER, true, false);
			valueControl.setLayoutData(layoutData);			
		} else if (!show && valueControl != null) {
			valueControl.dispose();
			valueControl = null;
		}
	}

	public ReqIFFullFilter getFilter() {
		Boolean value = valueControl == null ? null : new Boolean(valueControl.getSelectionIndex() == 1);
		return new BoolFilter(getOperator(), value, (AttributeDefinitionBoolean) attribute);
	}

	@Override
	protected List<Operator> getOperators() {
		return BoolFilter.SUPPORTED_OPERATORS.asList();
	}

}
