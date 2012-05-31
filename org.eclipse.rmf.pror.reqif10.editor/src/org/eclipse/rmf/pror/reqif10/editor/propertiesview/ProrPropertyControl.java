package org.eclipse.rmf.pror.reqif10.editor.propertiesview;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.SWTX;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public class ProrPropertyControl extends AgileGrid {

	private ProrPropertyContentProvider contentProvider;

	public ProrPropertyControl(Composite parent, EditingDomain editingDomain,
			AdapterFactory adapterFactory, boolean showAllProps) {
		super(parent, SWT.V_SCROLL | SWT.H_SCROLL | SWTX.FILL_WITH_DUMMYCOL
				| SWT.FLAT);
		setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
		this.contentProvider = new ProrPropertyContentProvider(editingDomain, showAllProps);
		setContentProvider(this.contentProvider);
		setCellRendererProvider(new ProrPropertyCellRendererProvider(this,
				adapterFactory, editingDomain));
		setLayoutAdvisor(new ProrPropertyLayoutAdvisor(this));
		setCellEditorProvider(new ProrPropertyCellEditorProvider(this,
				adapterFactory, editingDomain));
		setRowResizeCursor(new Cursor(this.getDisplay(), SWT.CURSOR_ARROW));
	}
	
	void setSelection(ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection sel = (IStructuredSelection) selection;
			if (sel.size() == 1) {
				Object obj = sel.getFirstElement();
				if (obj instanceof Identifiable) {
					contentProvider.setContent((Identifiable) obj);
					redraw();
					return;
				}
			}
		}
		contentProvider.setContent(null);
		redraw();
	}

}
