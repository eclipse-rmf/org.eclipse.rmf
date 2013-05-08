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
package org.eclipse.rmf.reqif10.pror.presentation.ui;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.CellEditor;
import org.agilemore.agilegrid.editors.TextCellEditor;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;

/**
 * A better {@link CellEditor} for plain text.
 * 
 * @author jastram
 */
public class LinewrapCellEditor extends TextCellEditor {

	private final EditingDomain editingDomain;
	private AttributeValueString attributeValue;
	private Object affectedObject;
	private SpecElementWithAttributes parent;

	public LinewrapCellEditor(AgileGrid agileGrid, EditingDomain editingDomain,
			SpecElementWithAttributes parent, Object affectedObject) {
		super(agileGrid, SWT.WRAP);
		this.editingDomain = editingDomain;
		this.affectedObject = affectedObject;
		this.parent = parent;
	}

	/**
	 * Registers a listener that updates the editor size when text overflows
	 * into the next line, providing more space to edit.
	 */
	@Override
	protected Control createControl(final AgileGrid agileGrid) {
		final Text text = (Text) super.createControl(agileGrid);
		text.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				if (text == null || text.isDisposed())
					return;
				int width = text.getSize().x;
				int height = text.computeSize(width, SWT.DEFAULT).y;
				if (height > text.getSize().y) {
					if (cell != null) {
						text.setSize(width, height);
					}
				}
			}
		});
		return text;
	}

	/**
	 * We override this to do nothing. While in the Cell Editor, we want the
	 * arrow keys to work normally, and upon reaching the end of the text we do
	 * not want to stop editing.
	 */
	@Override
	protected void onTraverse(TraverseEvent e) {
	}

	@Override
	protected Object doGetValue() {
		String newText = (String) super.doGetValue();

		// Only submit a change if something has changed.
		if (newText.equals(attributeValue.getTheValue())) {
			return attributeValue;
		}

		ProrUtil.setTheValue(attributeValue, text.getText(), parent,
				affectedObject, editingDomain);

		return attributeValue;
	}

	@Override
	protected void doSetValue(Object value) {
		attributeValue = (AttributeValueString) value;
		super.doSetValue(attributeValue.getTheValue());
	}
}
