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

public class ReqIFSearchPage extends DialogPage implements ISearchPage {

	private Composite pane;
	private ScrolledComposite sc;

	public ReqIFSearchPage() {
	}

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
		
		createAddRadioButton(toolbar);
		createClearRadioButton(toolbar);

		sc = new ScrolledComposite(parent, SWT.V_SCROLL | SWT.NONE);
		sc.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
	    pane = new Composite(sc, SWT.NONE);
	    pane.setLayout(new GridLayout());
	    sc.setContent(pane);
	    sc.setExpandHorizontal(true);
		
		setControl(parent);
	}

	private void createClearRadioButton(Composite toolbar) {
		Button clear = new Button(toolbar, SWT.PUSH);
		clear.setText("Clear");
		clear.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
	}

	private void createAddRadioButton(Composite toolbar) {
		Button add = new Button(toolbar, SWT.PUSH);
		add.setText("Add new");
		add.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, true, false));
		add.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FilterPanel filterPanel = new FilterPanel(pane);
				filterPanel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
				pane.pack(true);
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
