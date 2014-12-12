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

import java.util.ArrayList;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.editors.PopupCellEditor;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.pror.editor.presentation.EnumSelector;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

public class ProrEnumerationMultiValueCellEditor extends PopupCellEditor {
	private final DatatypeDefinitionEnumeration dde;

	/**
	 * The current contents.
	 */
	private AttributeValueEnumeration attributeValue;
	private final EditingDomain editingDomain;
	private Object parent;
	private Object affectedObject;
	private EnumSelector selector;

	public ProrEnumerationMultiValueCellEditor(AgileGrid agileGrid,
			DatatypeDefinitionEnumeration dde,
			Object parent, Object affectedObject, EditingDomain editingDomain,
			AdapterFactory adapterFactory) {
		super(agileGrid);
		this.dde = dde;
		this.editingDomain = editingDomain;
		this.parent = parent;
		this.affectedObject = affectedObject;
	}

	@Override
	protected Control createContents(Composite parent) {
		selector = new EnumSelector(dde.getSpecifiedValues(), attributeValue.getValues(), parent, SWT.BORDER_SOLID);
		return selector;
	}

	@Override
	protected Object doGetValue() {

		CompoundCommand cmd = new CompoundCommand("Set Enumeration") {
			public java.util.Collection<?> getAffectedObjects() {
				ArrayList<? super Object> list = new ArrayList<Object>();
				list.add(affectedObject);
				return list;
			};
		};

		if (attributeValue.eContainer() == null) {
			cmd.append(AddCommand
					.create(editingDomain,
							parent,
							ReqIF10Package.Literals.SPEC_ELEMENT_WITH_ATTRIBUTES__VALUES,
							attributeValue));
		}

		cmd.append(SetCommand
				.create(editingDomain,
						attributeValue,
						ReqIF10Package.Literals.ATTRIBUTE_VALUE_ENUMERATION__VALUES,
						selector.getItems()));

		editingDomain.getCommandStack().execute(cmd);
		return attributeValue;
	}

	@Override
	protected void doSetValue(Object value) {
		if (value instanceof AttributeValueEnumeration) {
			this.attributeValue = (AttributeValueEnumeration) value;
		}
		super.doSetValue(value);
	}

	@Override
	protected void fireCancelEditor() {
		super.fireCancelEditor();
	}
	/**
	 * This method is overridden to add a read-and-dispatch loop after opening
	 * the popup. Otherwise, the panel will disappear immediately on Linux.
	 */
	@Override
	protected void openPopupBox(Control parent) {
		super.openPopupBox(parent);
		int result = selector.showEnumSelector(Display.getCurrent().getActiveShell());
		if (result == SWT.CANCEL) {
			fireCancelEditor();
		} else {
			fireApplyEditorValue();
		}
	}
	
	@Override
	protected void updateLabel(Object value) {
		super.updateLabel("Select below.");
	}
	
}
