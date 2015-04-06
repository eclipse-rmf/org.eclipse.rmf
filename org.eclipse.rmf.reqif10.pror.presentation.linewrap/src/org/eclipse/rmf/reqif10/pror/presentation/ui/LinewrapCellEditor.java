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
package org.eclipse.rmf.reqif10.pror.presentation.ui;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.CellEditor;
import org.agilemore.agilegrid.EditorActivationEvent;
import org.agilemore.agilegrid.editors.TextCellEditor;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
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
	
	/**
	 * Changes the TextCellEditor behavior to capture the first character when
	 * starting to edit. I.e. if one activates the edit mode by pressing a
	 * character key, the current text is replaced by that character.
	 */
	@Override
	public void activate(EditorActivationEvent activationEvent) {
		if (activationEvent.sourceEvent instanceof KeyEvent) {
			KeyEvent keyEvent = (KeyEvent) activationEvent.sourceEvent;
			if (isValidCellEditorCharacter(keyEvent) && keyEvent.character != SWT.DEL) {
				text.setText("" + keyEvent.character);
				//this.fireApplyEditorValue();
				super.activate(activationEvent);
				text.setSelection(1, 1);
				return;
			}
			if (keyEvent.character != SWT.DEL){
				super.activate(activationEvent);
			}
		}else{
			super.activate(activationEvent);
		}
		
	}
	
	
	/**
	 * Helper function to determine if a keypress that already triggered editor
	 * activation is a valid character that can be displayed in the text field.
	 * 
	 * @param keyEvent
	 * @return
	 */
	protected boolean isValidCellEditorCharacter(KeyEvent keyEvent) {
		switch (keyEvent.character) {
		case ' ':
		case '\r':
		case SWT.DEL:
		case SWT.BS:
			return false;
		}

		if ((Character.isLetterOrDigit(keyEvent.character) || keyEvent.keyCode > 32
				&& keyEvent.keyCode < 254 && keyEvent.keyCode != 127)
				&& keyEvent.keyCode != SWT.CTRL
				&& keyEvent.keyCode != SWT.ALT
				&& (keyEvent.stateMask & SWT.CONTROL) == 0
				&& (keyEvent.stateMask & SWT.ALT) == 0) {
			return true;
		}

		return false;
	}
	
}
