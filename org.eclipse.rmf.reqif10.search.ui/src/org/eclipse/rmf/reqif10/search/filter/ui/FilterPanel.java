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

import java.util.Date;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * The {@link FilterPanel} initially only offers the selection of Attributes.
 * Upon selecting one, the fitting criteria are offered.
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
		if (getChildren().length == 3) {
			getChildren()[2].dispose();
		}
		
		switch (selectionIndex) {
		case 0:
			StringPanel sp = new StringPanel(this);
			sp.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
			break;

		default:
			Label label = new Label(this, SWT.NONE);
			label.setText(new Date().toString());
			break;
		}

		layout();
		getParent().pack();
	}
	
}
