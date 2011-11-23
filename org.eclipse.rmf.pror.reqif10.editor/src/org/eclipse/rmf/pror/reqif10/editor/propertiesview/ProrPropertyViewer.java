/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.pror.reqif10.editor.propertiesview;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.SWTX;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

public class ProrPropertyViewer extends Viewer {

	private final AgileGrid agileGrid;
	
	private Identifiable specElement;
	
	private final ProrPropertyContentProvider contentProvider;

	public ProrPropertyViewer(Composite parent, EditingDomain editingDomain, AdapterFactory adapterFactory) {
		// Create Agile Grid
		agileGrid = new AgileGrid(parent, SWTX.AUTO_SCROLL
				| SWTX.FILL_WITH_DUMMYCOL | SWT.FLAT);
		agileGrid.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WHITE));
		this.contentProvider = new ProrPropertyContentProvider(editingDomain);
		agileGrid.setContentProvider(this.contentProvider);
		agileGrid.setCellRendererProvider(new ProrPropertyCellRendererProvider(
				agileGrid, adapterFactory, editingDomain));
		agileGrid.setLayoutAdvisor(new ProrPropertyLayoutAdvisor(agileGrid));
		agileGrid.setCellEditorProvider(new ProrPropertyCellEditorProvider(
				agileGrid, adapterFactory, editingDomain));
		agileGrid.setRowResizeCursor(new Cursor(agileGrid.getDisplay(),
				SWT.CURSOR_ARROW));
	}
	
	@Override
	public Control getControl() {
		return agileGrid;
	}

	@Override
	public Object getInput() {
		return specElement;
	}

	@Override
	public ISelection getSelection() {
		return null;
	}

	@Override
	public void refresh() {
		agileGrid.redraw();
	}

	@Override
	public void setInput(Object specElement) {
		// Set the input to the content provider of the agile grid
		if (specElement instanceof Identifiable) {
			this.specElement = (Identifiable) specElement;
		} else {
			this.specElement = null;
		}
		this.contentProvider.setSpecElement(this.specElement);
		refresh();
	}
	
    @Override
    public void setSelection(ISelection selection, boolean reveal) {
        //Do nothing by default
    }

}
