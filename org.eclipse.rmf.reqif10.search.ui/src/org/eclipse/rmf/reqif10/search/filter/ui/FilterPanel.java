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
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;

/**
 * The {@link FilterPanel} initially only offers the selection of Attributes.
 * Upon selecting one, the fitting criteria are offered by instantiating the
 * correct {@link FilterControl}.
 * 
 * @author jastram
 */
public class FilterPanel extends Composite {

	public FilterPanel(final Composite parent) {
		super(parent, SWT.BORDER);
		setLayout(new GridLayout(3, false));

		Label close = new Label(this, SWT.FLAT);
		close.setText("\u274C");
		close.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				dispose();
				parent.pack();
			}
		});
		
		final Combo attr = new Combo(this, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
		GridData layoutData = new GridData(SWT.LEFT, SWT.CENTER, false, false);
		layoutData.widthHint = 180;
		attr.setLayoutData(layoutData);
		attr.add("identifier");
		attr.add("lastChange");
		attr.add("desc");
		attr.add("longName");
		attr.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				attributeChanged(attr.getSelectionIndex());
			}			
		});
	}

	protected void attributeChanged(int selectionIndex) {
		if (getFilterControl() != null) getFilterControl().dispose();
		
		switch (selectionIndex) {
		case 0:
			FilterControlString sp = new FilterControlString(this);
			sp.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
			break;

		default:
			// TODO
			break;
		}

		layout();
		getParent().pack();
	}

	/**
	 * @return the current FilterControl, or null of not set.
	 */
	private FilterControl getFilterControl() {
		if (getChildren().length != 3) return null;
		Control control = getChildren()[2];
		if (! (control instanceof FilterControl)) return null;
		return (FilterControl) control;
	}

	/**
	 * @return the {@link IFilter} representing the state of the
	 * {@link FilterPanel}, or null if not set or incorrectly configured.
	 */
	public IFilter getFilter() {
		return getFilterControl() == null ? null : getFilterControl().getFilter();
	}
	
}
