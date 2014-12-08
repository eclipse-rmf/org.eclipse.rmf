/*******************************************************************************
 * Copyright (c) 2011, 2013 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor.agilegrid;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.editors.PopupCellEditor;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.AttributeValueDate;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class ProrDateCellEditor extends PopupCellEditor {

	private DateTime date;
	private DateTime time;
	private AttributeValueDate attributeValue;
	private EditingDomain editingDomain;
	private Object affectedObject;
	private Object parent;

	public ProrDateCellEditor(AgileGrid agileGrid, EditingDomain editingDomain,
			Object parent,
			Object affectedObject) {
		super(agileGrid);
		this.editingDomain = editingDomain;
		this.affectedObject = affectedObject;
		this.parent = parent;
	}
	
	@Override
	protected Object doGetValue() {
			GregorianCalendar value = new GregorianCalendar(date.getYear(),
					date.getMonth(), date.getDay(), time.getHours(),
					time.getMinutes(), time.getSeconds());
			ProrUtil.setTheValue(attributeValue, value, parent, affectedObject,
					editingDomain);
		return attributeValue;
	}

	@Override
	protected void doSetValue(Object value) {
		if (value instanceof AttributeValueDate) {
			this.attributeValue = (AttributeValueDate) value;
		}
		super.doSetValue(value);
	}

	@Override
	protected void updateLabel(Object value) {
		if (value instanceof AttributeValueDate) {
			AttributeValueDate av = (AttributeValueDate) value;
			if (av.getTheValue() != null) {
				Date date = av.getTheValue().getTime();
				super.updateLabel(DateFormat.getDateTimeInstance().format(date));
				return;
			}
		}
		super.updateLabel(value);
	}
	
	@Override
	protected Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.BORDER_SOLID);
		GridLayout layout = new GridLayout();
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		layout.horizontalSpacing = 0;
		layout.verticalSpacing = 5;
		composite.setLayout(layout);
		
		date = new DateTime(composite, SWT.CALENDAR | SWT.MEDIUM);
		
		time = new DateTime(composite, SWT.TIME);
		GridData gd = new GridData(SWT.FILL, SWT.FILL, true, false);
		time.setLayoutData(gd);

		Object cal = ReqIF10Util.getTheValue(attributeValue);
		if (cal instanceof GregorianCalendar) {
			GregorianCalendar calendar = ((GregorianCalendar) cal);
			date.setDate(calendar.get(Calendar.YEAR),
					calendar.get(Calendar.DAY_OF_MONTH), Calendar.DAY_OF_MONTH);
			time.setTime(calendar.get(Calendar.HOUR),
					calendar.get(Calendar.MINUTE), Calendar.SECOND);
		}

		return composite;
	}
	
	/**
	 * This method is overridden to add a read-and-dispatch loop after opening
	 * the popup. Otherwise, the panel will disappear immediately on Linux.
	 */
	@Override
	protected void openPopupBox(Control parent) {
		super.openPopupBox(parent);

		// Workaround to prevent shell from closing right after opening on Linux.
		Display display = Display.getCurrent();
		Shell shell = display.getActiveShell();
		shell.pack();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
