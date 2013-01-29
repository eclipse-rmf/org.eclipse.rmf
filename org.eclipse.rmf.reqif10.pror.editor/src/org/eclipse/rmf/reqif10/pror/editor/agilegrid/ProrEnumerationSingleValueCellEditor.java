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
import java.util.List;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.CellEditor;
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
import org.eclipse.swt.widgets.Control;

public class ProrEnumerationSingleValueCellEditor extends CellEditor {

	private final AdapterFactory adapterFactory;
	private ArrayList<EnumValue> itemList;
	private final EditingDomain editingDomain;
	private AttributeValueEnumeration attributeValue;
	private SpecElementWithAttributes parent;

	public ProrEnumerationSingleValueCellEditor(AgileGrid agileGrid,
			DatatypeDefinitionEnumeration dde,
			SpecElementWithAttributes parent, EditingDomain editingDomain,
			AdapterFactory adapterFactory) {
		super(agileGrid);
		this.editingDomain = editingDomain;
		this.adapterFactory = adapterFactory;
		this.parent = parent;

		Combo combo = (Combo) getControl();
		String[] items = populateItemList(dde);
		combo.setItems(items);
	}


	@Override
	public Control createControl(AgileGrid agileGrid) {
		return new Combo(agileGrid, SWT.DROP_DOWN | SWT.READ_ONLY);
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
		int selectedIndex = ((Combo) getControl()).getSelectionIndex();
		CompoundCommand cmd = new CompoundCommand("Set Enumeration") {
			public java.util.Collection<?> getAffectedObjects() {
				List<? super Object> list = new ArrayList<Object>();
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

		cmd.append(RemoveCommand
				.create(
				editingDomain,
				attributeValue,
				ReqIF10Package.Literals.ATTRIBUTE_VALUE_ENUMERATION__VALUES,
				attributeValue.getValues()));

		if (selectedIndex != -1) {
			cmd.append(AddCommand
					.create(
					editingDomain,
					attributeValue,
					ReqIF10Package.Literals.ATTRIBUTE_VALUE_ENUMERATION__VALUES,
					itemList.get(selectedIndex)));
		}

		editingDomain.getCommandStack().execute(cmd);
		return attributeValue;
	}

	@Override
	protected void doSetValue(Object value) {
		if (value instanceof AttributeValueEnumeration) {
			this.attributeValue = (AttributeValueEnumeration) value;

			List<EnumValue> list = ((AttributeValueEnumeration) value)
					.getValues();
			if (list.size() > 0) {
				int index = itemList.indexOf(list.get(0));
				((Combo) getControl()).select(index);
			}
		}
	}

}
