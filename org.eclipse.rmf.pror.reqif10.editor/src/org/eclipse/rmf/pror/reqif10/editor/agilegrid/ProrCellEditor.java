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
package org.eclipse.rmf.pror.reqif10.editor.agilegrid;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.editors.TextCellEditor;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.util.Reqif10Util;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.PlatformUI;

/**
 * A Cell Editor that propagates errors from the Validator to the UI.
 * 
 * @author jastram
 * 
 */
public abstract class ProrCellEditor extends TextCellEditor {

	protected AttributeValue attributeValue;
	protected final EditingDomain editingDomain;

	public ProrCellEditor(AgileGrid agileGrid, EditingDomain editingDomain) {
		super(agileGrid);
		this.editingDomain = editingDomain;
	}

	/**
	 * In addition to the default behavior, updates status bar and cell font
	 * color.
	 */
	@Override
	protected boolean isCorrect(Object value) {
		boolean result = super.isCorrect(value);
		setStatusBar(getErrorMessage());
		setErrorColor(result);
		return result;
	}

	/**
	 * Updates the error message in the status line, if the status line can be
	 * found (otherwise does nothing). If message is null, the error message is
	 * reset.
	 */
	protected void setStatusBar(String message) {
		IWorkbenchPartSite site = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage().getActivePart()
				.getSite();
		IStatusLineManager mgr = null;
		if (site instanceof IEditorSite) {
			mgr = ((IEditorSite) site).getActionBars().getStatusLineManager();
		} else if (site instanceof IViewSite) {
			mgr = ((IViewSite) site).getActionBars().getStatusLineManager();
		}
		if (mgr != null) {
			mgr.setErrorMessage(message);
		}
	}

	/**
	 * Sets the foreground color, depending on the value of isCorrect. Default
	 * is {@link SWT#COLOR_RED} for errors and {@link SWT#COLOR_BLACK} by
	 * default.
	 */
	protected void setErrorColor(boolean isCorrect) {
		int colorCode = isCorrect ? SWT.COLOR_BLACK : SWT.COLOR_RED;
		Color color = Display.getDefault().getSystemColor(colorCode);
		getControl().setForeground(color);
	}

	@Override
	protected void doSetValue(Object value) {
		this.attributeValue = null;
		if (value instanceof AttributeValue) {
			attributeValue = (AttributeValue) value;
			value = Reqif10Util.getTheValue(attributeValue);
		}
		super.doSetValue(value);
	}

	/**
	 * Returns the current {@link SpecHierarchy} to which the edited cell belongs.
	 */
	protected SpecHierarchy getSpecHierarchy() {
		ProrAgileGridContentProvider provider = (ProrAgileGridContentProvider) getAgileGrid().getContentProvider();
		SpecHierarchy specHierarchy = provider.getProrRow(cell.row).getSpecHierarchy();
		return specHierarchy;
	}

	/**
	 * This method "translates" from the editor value (which is a String) to the
	 * Model (which is an AttributeValue). As a side effect (and not very
	 * intuitive, but the best option), the method also sets the new value via a
	 * command. Note that the command should also set the corresponding
	 * {@link SpecHierarchy} as the affected element (use
	 * {@link #getSpecHierarchy()}).
	 * <p>
	 * The actual String in the cell can be accessed via
	 * {@link TextCellEditor#text}.
	 * 
	 * @return the correct value of type {@link AttributeValue}.
	 */
	@Override
	abstract protected Object doGetValue();
}
