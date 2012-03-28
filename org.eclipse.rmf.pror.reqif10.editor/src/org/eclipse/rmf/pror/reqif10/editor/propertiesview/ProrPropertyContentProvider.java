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
import java.util.Collections;
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
import org.eclipse.rmf.reqif10.util.ReqIF10Util;

/**
 * 
 * The agile grid content provider for the properties view.
 * 
 * @author Lukas Ladenberger
 * 
 */
public class ProrPropertyContentProvider extends AbstractContentProvider {

	private AdapterFactoryEditingDomain editingDomain;

	// The current selected specification element
	private Identifiable identifiable;

	// This is only a help HashMap for storing temporarily the item categories
	private HashMap<String, ItemCategory> customCategories;

	public static String SPEC_HIERARCHY_NAME = "Spec Hierarchy";
	public static String SPEC_OBJECT_NAME = "Spec Object";
	public static String SPEC_RELATION_NAME = "Spec Relation";
		
	private ItemCategory specHierarchyItemCategory = new ItemCategory(
			SPEC_HIERARCHY_NAME);
	private ItemCategory specObjectItemCategory = new ItemCategory(
			SPEC_OBJECT_NAME);
	private ItemCategory specRelationItemCategory = new ItemCategory(
			SPEC_RELATION_NAME);
	
	// HashMap for storing the row with the corresponding object
	private HashMap<Integer, Object> rows;

	public static String DEFAULT_CATEGORY_NAME = "Misc";
		
	public ProrPropertyContentProvider(EditingDomain editingDomain) {
		this.editingDomain = (AdapterFactoryEditingDomain) editingDomain;
		this.customCategories = new HashMap<String, ItemCategory>();
		this.rows = new HashMap<Integer, Object>();
	}
	
	/**
	 * This method is responsible for displaying the right content at the given
	 * row and col.
	 */
	@Override
	public Object doGetContentAt(int row, int col) {

		if (identifiable != null) {
			
			int size = this.rows.size();

			if (row > size - 1 || col > 1)
				return null;

			Object element = this.rows.get(row);

			switch (col) {
			case 0:
				if (element instanceof ItemCategory) { // Category Name
					return ((ItemCategory) element).getCategoryName();
				} else if (element instanceof SortedItemPropertyDescriptor) { // Attribute
					SortedItemPropertyDescriptor descriptor = (SortedItemPropertyDescriptor) element;
					if (descriptor.getItemPropertyDescriptor() != null) {
						return descriptor.getItemPropertyDescriptor()
								.getDisplayName(identifiable);
					}
				}
			case 1:
				if (element instanceof SortedItemPropertyDescriptor) {
					AttributeValue atrValue = getAttributeValue((SortedItemPropertyDescriptor) element);
					if (atrValue != null) {
						return atrValue;
					} else {
						return getItemLabelProvider(row).getText(
								getItemPropertyValue(row));
					}
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
	 * corresponding {@link IItemPropertyDescriptor} and builds up the structure
	 * to be displayed.
	 * 
	 * @param identifiable
	 *            the selected specification element
	 */
	protected void setContent(Identifiable identifiable) {

		this.identifiable = identifiable;
		
		this.customCategories.clear();
		this.specHierarchyItemCategory.getDescriptors().clear();
		this.specObjectItemCategory.getDescriptors().clear();
		this.specRelationItemCategory.getDescriptors().clear();
		this.rows.clear();

		if (identifiable != null) {
			
			// Get the item property source
			IItemPropertySource itemPropertySource = (IItemPropertySource) this.editingDomain
					.getAdapterFactory().adapt(identifiable,
							IItemPropertySource.class);

			// Get the list of item property descriptors
			List<IItemPropertyDescriptor> descriptorList = itemPropertySource
					.getPropertyDescriptors(identifiable);

			// Iterate over the item property descriptors and collect the needed
			// data
			for (IItemPropertyDescriptor descriptor : descriptorList) {

				String categoryName = descriptor.getCategory(identifiable);

				if (categoryName == null)
					categoryName = DEFAULT_CATEGORY_NAME;

				ItemCategory customCategory;


				if (categoryName.equals(SPEC_HIERARCHY_NAME)) {
					specHierarchyItemCategory.addDescriptor(descriptor,
							identifiable);
				} else if (categoryName.equals(SPEC_OBJECT_NAME)) {
					specObjectItemCategory.addDescriptor(descriptor,
							identifiable);
				} else if (categoryName.equals(SPEC_RELATION_NAME)) {
					specRelationItemCategory.addDescriptor(descriptor,
							identifiable);
				} else {
					if (!this.customCategories.containsKey(categoryName)) {
						customCategory = new ItemCategory(categoryName);
						customCategory.addDescriptor(descriptor, identifiable);
						this.customCategories.put(categoryName, customCategory);
					} else {
						customCategory = this.customCategories.get(categoryName);
						customCategory.addDescriptor(descriptor, identifiable);
					}
				}


			}

			for (ItemCategory cat : customCategories.values())
				addItemCategory(cat);
			addItemCategory(specObjectItemCategory);
			addItemCategory(specHierarchyItemCategory);
			addItemCategory(specRelationItemCategory);

		}

	}

	private void addItemCategory(ItemCategory cat) {
		if (cat.getDescriptors().size() == 0)
			return;
		int size = this.rows.size();
		this.rows.put(size, cat);
		size = size + 1;
		Collections.sort(cat.getDescriptors());
		for (SortedItemPropertyDescriptor des : cat
				.getDescriptors()) {
			this.rows.put(size, des);
			size = size + 1;
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
	 * Returns the {@link SortedItemPropertyDescriptor} of the row's object.
	 * 
	 * @param row
	 * @return an instance of {@link SortedItemPropertyDescriptor}
	 */
	public SortedItemPropertyDescriptor getItemPropertyDescriptor(int row) {
		if (this.identifiable != null) {
			Object obj = this.rows.get(row);
			if (obj instanceof SortedItemPropertyDescriptor) {
				return (SortedItemPropertyDescriptor) obj;
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
		IItemPropertyDescriptor itemPropertyDescriptor = getItemPropertyDescriptor(
				row).getItemPropertyDescriptor();
		if (itemPropertyDescriptor != null)
			return itemPropertyDescriptor
				.getLabelProvider(this.identifiable);
		return null;
	}

	/**
	 * Returns the property value of the row's object.
	 * 
	 * @param row
	 * @return the property value
	 */
	public Object getItemPropertyValue(int row) {
		return getItemPropertyDescriptor(row).getItemPropertyDescriptor()
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
		if (obj instanceof SortedItemPropertyDescriptor) {
			return getAttributeValue((SortedItemPropertyDescriptor) obj);
		}
		return null;
	}
	
	private AttributeValue getAttributeValue(
			SortedItemPropertyDescriptor descriptor) {
		SpecElementWithAttributes sepcAtr = null;
		if (this.identifiable instanceof SpecElementWithAttributes) {
			sepcAtr = (SpecElementWithAttributes) this.identifiable;
		} else if (this.identifiable instanceof SpecHierarchy) {
			sepcAtr = ((SpecHierarchy) this.identifiable).getObject();
		}
		if (sepcAtr != null && descriptor.getItemPropertyDescriptor() != null) {
			return ReqIF10Util.getAttributeValueForLabel(sepcAtr, descriptor
					.getItemPropertyDescriptor().getDisplayName(sepcAtr));
		}
		return null;
	}

	public int getRowCount() {
		return this.rows.size();
	}

	/**
	 * Helper class for storing category with corresponding
	 * {@link SortedItemPropertyDescriptor}'s.
	 */
	class ItemCategory {

		private String categoryName;
		private ArrayList<SortedItemPropertyDescriptor> descriptors;

		public ItemCategory(String categoryName) {
			this.categoryName = categoryName;
			this.descriptors = new ArrayList<SortedItemPropertyDescriptor>();
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public String getCategoryName() {
			return categoryName;
		}
		
		public ArrayList<SortedItemPropertyDescriptor> getDescriptors() {
			return descriptors;
		}

		public void addDescriptor(IItemPropertyDescriptor descriptor, Identifiable specElement) {
			this.descriptors.add(new SortedItemPropertyDescriptor(descriptor,
					specElement));
		}
		
	}

	/**
	 * HelpercClass for sorting the {@link IItemPropertyDescriptor}s in the
	 * categories.
	 */
	class SortedItemPropertyDescriptor implements
			Comparable<SortedItemPropertyDescriptor> {

		private IItemPropertyDescriptor itemPropertyDescriptor;
		private Identifiable specElement;

		public SortedItemPropertyDescriptor(
				IItemPropertyDescriptor itemPropertyDescriptor,
				Identifiable specElement) {
			this.itemPropertyDescriptor = itemPropertyDescriptor;
			this.specElement = specElement;
		}

		public int compareTo(SortedItemPropertyDescriptor o) {
			return itemPropertyDescriptor.getDisplayName(specElement)
					.compareTo(
							o.itemPropertyDescriptor
									.getDisplayName(o.specElement));
		}

		public IItemPropertyDescriptor getItemPropertyDescriptor() {
			return itemPropertyDescriptor;
		}

	}

}
