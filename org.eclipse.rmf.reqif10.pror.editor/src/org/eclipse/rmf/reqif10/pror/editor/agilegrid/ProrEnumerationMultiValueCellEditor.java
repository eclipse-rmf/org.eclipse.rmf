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
package org.eclipse.rmf.reqif10.pror.editor.agilegrid;

import java.util.ArrayList;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.editors.PopupCellEditor;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;

public class ProrEnumerationMultiValueCellEditor extends PopupCellEditor {

	private final AdapterFactory adapterFactory;
	private ArrayList<EnumValue> itemList;
	private final DatatypeDefinitionEnumeration dde;
	private List list;

	/**
	 * The shell which contains the controls used to edit the value of cell.
	 */
	private Shell shell;

	/**
	 * The current contents.
	 */
	private AttributeValueEnumeration attributeValue;
	private final EditingDomain editingDomain;
	private SpecElementWithAttributes parent;

	public ProrEnumerationMultiValueCellEditor(AgileGrid agileGrid,
			DatatypeDefinitionEnumeration dde,
			SpecElementWithAttributes parent, EditingDomain editingDomain,
			AdapterFactory adapterFactory) {
		super(agileGrid);
		this.dde = dde;
		this.editingDomain = editingDomain;
		this.adapterFactory = adapterFactory;
		this.parent = parent;
		populateItemList(dde);
	}

	@Override
	protected Control createContents(Composite parent) {
		list = new List(parent, SWT.MULTI);
		String[] items = populateItemList(dde);
		for (String item : items) {
			list.add(item);
		}

		// Set the collection

		for (EnumValue value : attributeValue.getValues()) {
			int index = itemList.indexOf(value);
				if (index != -1) {
					list.select(index);
				}
			}

		return list;
	}

	/**
	 * Populates the list of items. This allows us later to find the correct
	 * item for the given index in the {@link Combo}. In addition, we return the
	 * text representation as a String array, which can be used to populate the
	 * {@link Combo}.
	 * 
	 */
	private String[] populateItemList(DatatypeDefinitionEnumeration dde) {
		itemList = new ArrayList<EnumValue>();
		String[] list = new String[dde.getSpecifiedValues().size()];

		for (int i = 0; i < dde.getSpecifiedValues().size(); i++) {
			EnumValue enumValue = dde.getSpecifiedValues().get(i);
			itemList.add(enumValue);
				IItemLabelProvider itemProvider = (IItemLabelProvider) adapterFactory
					.adapt(enumValue, IItemLabelProvider.class);
			list[i] = itemProvider.getText(enumValue);
			}
		return list;
	}

	@Override
	protected Object doGetValue() {
		ArrayList<EnumValue> current = new ArrayList<EnumValue>(
				attributeValue.getValues());
		CompoundCommand cmd = new CompoundCommand("Set Enumeration") {
			public java.util.Collection<?> getAffectedObjects() {
				ArrayList<? super Object> list = new ArrayList<Object>();
				list.add(parent);
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

		for (int index : list.getSelectionIndices()) {
			EnumValue item = itemList.get(index);
			if (current.contains(item)) {
				current.remove(item);
			} else {
				cmd.append(AddCommand
						.create(editingDomain,
								attributeValue,
								ReqIF10Package.Literals.ATTRIBUTE_VALUE_ENUMERATION__VALUES,
								item));
			}
		}

		for (EnumValue item : current) {
			cmd.append(RemoveCommand
					.create(editingDomain,
							attributeValue,
							ReqIF10Package.Literals.ATTRIBUTE_VALUE_ENUMERATION__VALUES,
							item));
		}
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.agilemore.agilegrid.CellEditor#deactivate()
	 */
	@Override
	public void deactivate() {
		if (shell != null && !shell.isDisposed()) {
			shell.dispose();
		}
		super.deactivate();
	}

}
