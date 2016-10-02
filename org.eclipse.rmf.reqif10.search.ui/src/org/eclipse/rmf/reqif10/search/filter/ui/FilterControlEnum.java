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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.pror.editor.presentation.EnumSelector;
import org.eclipse.rmf.reqif10.search.filter.EnumFilter;
import org.eclipse.rmf.reqif10.search.filter.ReqIFFullFilter;
import org.eclipse.rmf.reqif10.search.filter.ReqIFFullFilter.Operator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

/**
 * Used for plain text and XHTML
 * 
 * @author jastram
 */
public class FilterControlEnum extends FilterControl {
	
	private Button valueControl;
	private Collection<EnumValue> items;

	public FilterControlEnum(FilterPanel parent,
			AttributeDefinitionEnumeration attribute) {
		super(parent, attribute);
	}

	public FilterControlEnum(FilterPanel parent, EnumFilter template) {
		super(parent, template);
	}

	@Override
	protected List<Operator> getOperators() {
		return EnumFilter.SUPPORTED_OPERATORS.asList();
	}

	@Override
	protected void updateValueControls(boolean initialize) {
		if (getOperator() == Operator.IS_SET
				|| getOperator() == Operator.IS_NOT_SET) {
			showControl(false);
		} else {
			showControl(true);
		}
		if (initialize) {
			if (valueControl != null) {
				updateItems(((EnumFilter)templateFilter).getFilterValue1());
			}
		}
	}

	private void showControl(boolean show) {
		if (show && valueControl == null) {
			if (items == null) items = new ArrayList<EnumValue>();

			valueControl = new Button(this, SWT.PUSH | SWT.FLAT | SWT.WRAP);
			GridData layoutData = new GridData(SWT.FILL, SWT.CENTER, true, false);
			layoutData.widthHint = 200;
			valueControl.setLayoutData(layoutData);
			valueControl.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					popupSelector(valueControl);
				}
			});
		}
		if (!show && valueControl != null) {
			valueControl.dispose();
			valueControl = null;
			items = null;
		}
	}

	protected void popupSelector(Control control) {
		EList<EnumValue> specifiedValues = ((AttributeDefinitionEnumeration) attribute)
				.getType().getSpecifiedValues();
		Shell shell = EnumSelector.createShell(control);
		EnumSelector selector = new EnumSelector(specifiedValues, items, shell,
				SWT.BORDER);
		int status = selector.showEnumSelector(shell);
		if (status == SWT.OK) {
			updateItems(selector.getItems());
		}
	}

	private void updateItems(Collection<EnumValue> items) {
		EList<EnumValue> specifiedValues = ((AttributeDefinitionEnumeration) attribute)
				.getType().getSpecifiedValues();
		this.items = items;
		StringBuilder sb = new StringBuilder();
		for (Iterator<EnumValue> i = items.iterator(); i.hasNext();) {
			EnumValue value = i.next();

			// In case items have been removed
			if (! specifiedValues.contains(value)) continue;

			String label = value.getLongName() != null ? value.getLongName() : value.getIdentifier(); 
			sb.append(label);
			if (i.hasNext()) sb.append(", ");
		}
		valueControl.setText(sb.toString());
		layout();
		getParent().layout();
		getParent().getParent().layout();
	}

	public ReqIFFullFilter getFilter() {
		return new EnumFilter(getOperator(), items,
				(AttributeDefinitionEnumeration) attribute);
	}

}
