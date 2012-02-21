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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.agilemore.agilegrid.AbstractContentProvider;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.util.Reqif10Util;

public class ProrPropertyContentProvider extends AbstractContentProvider {

	private AdapterFactoryEditingDomain editingDomain;

	// The current selected specification element
	private Identifiable identifiable;

	// This is only a help HashMap for storing temporarily the item categories
	private HashMap<String, ItemCategory> categories;

	// HashMap for storing the row with the corresponding object
	private HashMap<Integer, Object> rows;

	public static String DEFAULT_CATEGORY_NAME = "Misc";
		
	public ProrPropertyContentProvider(EditingDomain editingDomain) {
		this.editingDomain = (AdapterFactoryEditingDomain) editingDomain;
		this.categories = new HashMap<String, ItemCategory>();
		this.rows = new HashMap<Integer, Object>();
	}
	
	@Override
	public Object doGetContentAt(int row, int col) {
		if (identifiable != null) {
			
			int size = this.rows.size();

			if (row > size - 1 || col > 1)
				return null;

			Object element = this.rows.get(row);

			switch (col) {
			case 0:
				if (element instanceof String) { // Category
					return element;
				} else { // Attribute
					return ((IItemPropertyDescriptor) element)
							.getDisplayName(this.identifiable);
				}
			case 1:
				AttributeValue atrValue = getAttributeValue((IItemPropertyDescriptor) element);
				if (atrValue != null) {
					return atrValue;
				} else {
					return getItemLabelProvider(row).getText(
							getItemPropertyValue(row));
				}
			default:
				break;
			}

		}
		
		return null;
		
	}

	@Override
	public void doSetContentAt(int row, int col, Object newValue) {
		// We don't need this method, cause an automatic refresh of the agile
		// grid after editing a cell
	}

	/**
	 * Sets the current selected specification element and fetches the
	 * corresponding {@link IItemPropertyDescriptor}.
	 * 
	 * @param identifiable
	 *            the selected specification element
	 */
	protected void setIdentifiable(Identifiable identifiable) {

		this.identifiable = identifiable;
		
		this.categories.clear();
		this.rows.clear();

		if (identifiable != null) {
			
			// Get the item property source
			IItemPropertySource itemPropertySource = (IItemPropertySource) this.editingDomain
					.getAdapterFactory().adapt(this.identifiable,
							IItemPropertySource.class);

			// Get the list of item property descriptors
			List<IItemPropertyDescriptor> descriptorList = itemPropertySource
					.getPropertyDescriptors(this.identifiable);

			// Iterate over the item property descriptors and collect the needed
			// data
			for (IItemPropertyDescriptor descriptor : descriptorList) {

				String categoryName = descriptor.getCategory(this.identifiable);

				if (categoryName == null)
					categoryName = DEFAULT_CATEGORY_NAME;

				ItemCategory category;

				if (!this.categories.containsKey(categoryName)) {
					category = new ItemCategory(categoryName, this.identifiable);
					category.addDescriptor(descriptor);
					this.categories.put(categoryName, category);
				} else {
					category = this.categories.get(categoryName);
					category.addDescriptor(descriptor);
				}

			}

			int i = 0;
			for (ItemCategory cat : this.categories.values()) {
				String catName = cat.getCategoryName();
				this.rows.put(i, catName);
				i = i + 1;
				for (IItemPropertyDescriptor des : cat.getDescriptors()) {
					this.rows.put(i, des);
					i = i + 1;
				}
			}

		}

	}

	/**
	 * Returns the current selected specification element. This could be i.e. an
	 * instance of {@link SpecObject}, {@link SpecRelation} or
	 * {@link SpecHierarchyRoot}.
	 * 
	 * @return an instance of the current selected specification element.
	 */
	public Identifiable getIdentifiable() {
		return this.identifiable;
	}

	/**
	 * Returns the {@link IItemPropertyDescriptor} of the row's object.
	 * 
	 * @param row
	 * @return an instance of {@link IItemPropertyDescriptor}
	 */
	public IItemPropertyDescriptor getItemPropertyDescriptor(int row) {
		if (this.identifiable != null) {
			Object obj = this.rows.get(row);
			if (obj instanceof IItemPropertyDescriptor) {
				return (IItemPropertyDescriptor) obj;
			}
		}
		return null;
	}

	/**
	 * Returns the {@link IItemLabelProvider} of the row's object.
	 * 
	 * @param row
	 * @return an instance of {@link IItemLabelProvider}
	 */
	public IItemLabelProvider getItemLabelProvider(int row) {
		return getItemPropertyDescriptor(row)
				.getLabelProvider(this.identifiable);
	}

	/**
	 * Returns the property value of the row's object.
	 * 
	 * @param row
	 * @return the property value
	 */
	public Object getItemPropertyValue(int row) {
		return getItemPropertyDescriptor(row)
				.getPropertyValue(this.identifiable);
	}

	public Object getRowContent(int row) {
		return this.rows.get(row);
	}

	/**
	 * Returns the {@link AttributeValue} of the row's object or null if no
	 * {@link AttributeValue} exists.
	 * 
	 * @param row
	 * @return an instance of {@link AttributeValue} or null
	 */
	public AttributeValue getAttributeValue(int row) {
		Object obj = this.rows.get(row);
		if (obj instanceof IItemPropertyDescriptor) {
			return getAttributeValue((IItemPropertyDescriptor) obj);
		}
		return null;
	}
	
	public AttributeValue getAttributeValue(IItemPropertyDescriptor descriptor) {
		SpecElementWithAttributes sepcAtr = null;
		if (this.identifiable instanceof SpecElementWithAttributes) {
			sepcAtr = (SpecElementWithAttributes) this.identifiable;
		} else if (this.identifiable instanceof SpecHierarchy) {
			sepcAtr = ((SpecHierarchy) this.identifiable).getObject();
		}
		if (sepcAtr != null)
			return Reqif10Util.getAttributeValueForLabel(sepcAtr,
					descriptor.getDisplayName(sepcAtr));
		return null;
	}

	public int getRowCount() {
		return this.rows.size();
	}

	/**
	 * Helper class for storing category with corresponding
	 * {@link IItemPropertyDescriptor}'s.
	 */
	class ItemCategory {

		private String categoryName;
		private ArrayList<IItemPropertyDescriptor> descriptors;

		private Identifiable specElement;

		public ItemCategory(String categoryName, Identifiable specElement) {
			this.categoryName = categoryName;
			this.descriptors = new ArrayList<IItemPropertyDescriptor>();
			this.specElement = specElement;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public String getCategoryName() {
			return categoryName;
		}
		
		public ArrayList<IItemPropertyDescriptor> getDescriptors() {
			return descriptors;
		}

		public void addDescriptor(IItemPropertyDescriptor descriptor) {
			this.descriptors.add(descriptor);
		}
		
		@Override
		public String toString() {

			StringBuffer sb = new StringBuffer();
			sb.append("Category name: " + categoryName + "\n");
			for (IItemPropertyDescriptor descriptor : this.descriptors) {
				sb.append("	--> " + descriptor.getDisplayName(this.specElement)
						+ "\n");
			}
			return sb.toString();

		}

	}

}
