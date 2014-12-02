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

import org.eclipse.jface.dialogs.DialogPage;
import org.eclipse.search.ui.ISearchPage;
import org.eclipse.search.ui.ISearchPageContainer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * The actual search page, which allows the creation of filter criteria.  These
 * are realized as {@link FilterPanel}s.
 * 
 * @author jastram
 */
public class ReqIFSearchPage extends DialogPage implements ISearchPage {

	private Composite pane;

	@Override
	public void createControl(Composite parent) {
		parent.setLayout(new GridLayout());
		
		Composite toolbar = new Composite(parent, SWT.NONE);
		toolbar.setLayout(new GridLayout(4, false));
		toolbar.setLayoutData(new GridData(GridData.FILL, SWT.CENTER,
				true, false));

		Button and = new Button(toolbar, SWT.RADIO);
		and.setText("Match all");
		and.setSelection(true);
		
		Button or = new Button(toolbar, SWT.RADIO);
		or.setText("Match any");
		
		createAddButton(toolbar);
		createClearButton(toolbar);

		ScrolledComposite sc = new ScrolledComposite(parent, SWT.V_SCROLL | SWT.NONE);
		sc.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
	    pane = new Composite(sc, SWT.NONE);
	    pane.setLayout(new GridLayout());
	    sc.setContent(pane);
	    sc.setExpandHorizontal(true);
		
		setControl(parent);
	}

	private void createClearButton(Composite toolbar) {
		Button clear = new Button(toolbar, SWT.PUSH);
		clear.setText("Clear");
		clear.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
		clear.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				for (Control control : pane.getChildren()) {
					control.dispose();
				}
				pane.pack();
			}
		});
	}

	private void createAddButton(Composite toolbar) {
		Button add = new Button(toolbar, SWT.PUSH);
		add.setText("Add new");
		add.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, true, false));
		add.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FilterPanel filterPanel = new FilterPanel(pane);
				filterPanel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
				pane.pack();
			}
		});
	}

	@Override
	public boolean performAction() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setContainer(ISearchPageContainer container) {
	}

}
