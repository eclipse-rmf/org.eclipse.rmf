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

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class StringPanel extends Composite {

	public StringPanel(Composite parent) {
		super(parent, SWT.FLAT);
		setLayout(new GridLayout(2, false));
		createOperators();
		createText();
	}

	private void createText() {
		final Text text = new Text(this, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		GridData layoutData = new GridData(SWT.FILL, SWT.CENTER, true, false);
		text.setLayoutData(layoutData);
	}

	private void createOperators() {
		final Combo attr = new Combo(this, SWT.DROP_DOWN | SWT.BORDER | SWT.READ_ONLY);
		GridData layoutData = new GridData(SWT.LEFT, SWT.CENTER, false, false);
		attr.setLayoutData(layoutData);
		attr.add("equal");
		attr.add("not equal");
		attr.add("contains");
		attr.add("not contains");
		attr.add("regexp");
	}

}
