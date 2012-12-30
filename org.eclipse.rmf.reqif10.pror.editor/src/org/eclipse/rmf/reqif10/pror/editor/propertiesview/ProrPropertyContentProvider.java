/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 *     Lukas Ladenberger - ProR GUI     
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor.propertiesview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.agilemore.agilegrid.AbstractContentProvider;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor.PropertyValueWrapper;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

/**
 * 
 * The agile grid content provider for the properties view.
 * 
 * @author Lukas Ladenberger
 * @author Michael Jastram
 * 
 */
public class ProrPropertyContentProvider extends AbstractContentProvider {

	private AdapterFactoryEditingDomain editingDomain;

	// The current selected specification element
	private Object object;

	// This is only a help HashMap for storing temporarily the item categories
	private HashMap<String, ItemCategory> customCategories;

	public static String SPEC_HIERARCHY_NAME = "Spec Hierarchy";
	public static String SPEC_OBJECT_NAME = "Spec Object";
	public static String SPEC_RELATION_NAME = "Spec Relation";

	private static HashSet<AdvancedProp> ADVANCED_PROPS;

	private ItemCategory specHierarchyItemCategory = new ItemCategory(
			SPEC_HIERARCHY_NAME);
	private ItemCategory specObjectItemCategory = new ItemCategory(
			SPEC_OBJECT_NAME);
	private ItemCategory specRelationItemCategory = new ItemCategory(
			SPEC_RELATION_NAME);

	// HashMap for storing the row with the corresponding object
	private HashMap<Integer, Object> rows;

	private boolean showAllProps;

	public static String DEFAULT_CATEGORY_NAME = "Misc";

	static {
		ADVANCED_PROPS = new HashSet<ProrPropertyContentProvider.AdvancedProp>();
		ADVANCED_PROPS.add(new AdvancedProp("Specification", "identifier"));
		ADVANCED_PROPS.add(new AdvancedProp("Spec Object", "identifier"));
		ADVANCED_PROPS.add(new AdvancedProp("Spec Hierarchy", "identifier"));
		ADVANCED_PROPS.add(new AdvancedProp("Spec Relation", "identifier"));
		ADVANCED_PROPS.add(new AdvancedProp("Specification", "longName"));
		ADVANCED_PROPS.add(new AdvancedProp("Spec Object", "longName"));
		ADVANCED_PROPS.add(new AdvancedProp("Spec Hierarchy", "longName"));
		ADVANCED_PROPS.add(new AdvancedProp("Relation", "longName"));
		ADVANCED_PROPS.add(new AdvancedProp("Specification", "lastChange"));
		ADVANCED_PROPS.add(new AdvancedProp("Spec Object", "lastChange"));
		ADVANCED_PROPS.add(new AdvancedProp("Spec Hierarchy", "lastChange"));
		ADVANCED_PROPS.add(new AdvancedProp("Spec Relation", "lastChange"));
		ADVANCED_PROPS.add(new AdvancedProp("Specification", "desc"));
		ADVANCED_PROPS.add(new AdvancedProp("Spec Object", "desc"));
		ADVANCED_PROPS.add(new AdvancedProp("Spec Hierarchy", "desc"));
		ADVANCED_PROPS.add(new AdvancedProp("Spec Relation", "desc"));
		ADVANCED_PROPS.add(new AdvancedProp("Spec Hierarchy", "tableInternal"));
		ADVANCED_PROPS.add(new AdvancedProp("Spec Hierarchy", "object"));
		ADVANCED_PROPS.add(new AdvancedProp("Spec Hierarchy", "editableAtts"));
		ADVANCED_PROPS.add(new AdvancedProp("Spec Hierarchy", "editable"));

		ADVANCED_PROPS.add(new AdvancedProp(null, "desc"));
		ADVANCED_PROPS.add(new AdvancedProp(null, "identifier"));
		ADVANCED_PROPS.add(new AdvancedProp(null, "lastChange"));
		ADVANCED_PROPS.add(new AdvancedProp(null, "editable"));
	}

	public ProrPropertyContentProvider(EditingDomain editingDomain,
			boolean showAllProps) {
		this.editingDomain = (AdapterFactoryEditingDomain) editingDomain;
		this.customCategories = new HashMap<String, ItemCategory>();
		this.rows = new HashMap<Integer, Object>();
		this.showAllProps = showAllProps;
	}

	/**
	 * This method is responsible for displaying the right content at the given
	 * row and col.
	 */
	@Override
	public Object doGetContentAt(int row, int col) {

		if (object != null) {

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
								.getDisplayName(object);
					}
				}
			case 1:
				if (element instanceof SortedItemPropertyDescriptor) {
					// If we have a ReqIF attribute value return it
					AttributeValue atrValue = getReqIfAttributeValue((SortedItemPropertyDescriptor) element);
					if (atrValue != null) {
						return atrValue;
					} else {
						// else if we have a specific EMF attribute return the
						// EMF attribute value
						PropertyValueWrapper wrapper = (PropertyValueWrapper) getItemPropertyValue(row);
						if (wrapper != null)
							return wrapper.getEditableValue(object);
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
	
	public void setContentAt(int row, int col, Object newValue) {
		super.setContentAt(row, col, newValue);
		
		// Fix of 378041:
		// needed to inform ProrPropertyControl of property change.
		// firePropertyChange is never called from AbstractContentProvider.setContentAt(..)
		// because oldValue is equal to newValue (value already updated somewhere else?)
		super.firePropertyChange("", null, null);
	}

	/**
	 * Sets the current selected specification element and fetches the
	 * corresponding {@link IItemPropertyDescriptor} and builds up the structure
	 * to be displayed.
	 * 
	 * @param object
	 *            the selected specification element
	 */
	protected void setContent(Object obj) {

		this.object = obj;

		this.customCategories.clear();
		this.specHierarchyItemCategory.getDescriptors().clear();
		this.specObjectItemCategory.getDescriptors().clear();
		this.specRelationItemCategory.getDescriptors().clear();
		this.rows.clear();

		if (object != null) {

			// Get the item property source
			IItemPropertySource itemPropertySource = (IItemPropertySource) this.editingDomain
					.getAdapterFactory().adapt(object,
							IItemPropertySource.class);

			// Get the list of item property descriptors
			List<IItemPropertyDescriptor> descriptorList = itemPropertySource
					.getPropertyDescriptors(object);

			// Iterate over the item property descriptors and collect the needed
			// data
			for (IItemPropertyDescriptor descriptor : descriptorList) {

				if (!showAllProps && !isStandard(descriptor))
					continue;

				String categoryName = descriptor.getCategory(object);

				if (categoryName == null)
					categoryName = DEFAULT_CATEGORY_NAME;

				ItemCategory customCategory;

				if (categoryName.equals(SPEC_HIERARCHY_NAME)) {
					specHierarchyItemCategory.addDescriptor(descriptor, object);
				} else if (categoryName.equals(SPEC_OBJECT_NAME)) {
					specObjectItemCategory.addDescriptor(descriptor, object);
				} else if (categoryName.equals(SPEC_RELATION_NAME)) {
					specRelationItemCategory.addDescriptor(descriptor, object);
				} else {
					if (!this.customCategories.containsKey(categoryName)) {
						customCategory = new ItemCategory(categoryName);
						customCategory.addDescriptor(descriptor, object);
						this.customCategories.put(categoryName, customCategory);
					} else {
						customCategory = this.customCategories
								.get(categoryName);
						customCategory.addDescriptor(descriptor, object);
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

	/**
	 * If {@link #showAllProps} is false, only standard descriptors are
	 * considered.
	 */
	private boolean isStandard(IItemPropertyDescriptor descriptor) {
		return !ADVANCED_PROPS.contains(new AdvancedProp(descriptor
				.getCategory(object), descriptor.getId(object)));
	}

	private void addItemCategory(ItemCategory cat) {
		if (cat.getDescriptors().size() == 0)
			return;
		int size = this.rows.size();
		this.rows.put(size, cat);
		size = size + 1;
		Collections.sort(cat.getDescriptors());
		for (SortedItemPropertyDescriptor des : cat.getDescriptors()) {
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
	public Object getElement() {
		return this.object;
	}

	/**
	 * Returns the {@link SortedItemPropertyDescriptor} of the row's object.
	 * 
	 * @param row
	 * @return an instance of {@link SortedItemPropertyDescriptor}
	 */
	public SortedItemPropertyDescriptor getItemPropertyDescriptor(int row) {
		if (this.object != null) {
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
			return itemPropertyDescriptor.getLabelProvider(this.object);
		return null;
	}

	/**
	 * Returns the property value (EMF specific) of the row's object.
	 * 
	 * @param row
	 * @return the property value
	 */
	public Object getItemPropertyValue(int row) {
		return getItemPropertyDescriptor(row).getItemPropertyDescriptor()
				.getPropertyValue(this.object);
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
	public AttributeValue getReqIfAttributeValue(int row) {
		Object obj = this.rows.get(row);
		if (obj instanceof SortedItemPropertyDescriptor) {
			return getReqIfAttributeValue((SortedItemPropertyDescriptor) obj);
		}
		return null;
	}

	private AttributeValue getReqIfAttributeValue(
			SortedItemPropertyDescriptor descriptor) {
		SpecElementWithAttributes sepcAtr = null;
		if (this.object instanceof SpecElementWithAttributes) {
			sepcAtr = (SpecElementWithAttributes) this.object;
		} else if (this.object instanceof SpecHierarchy) {
			sepcAtr = ((SpecHierarchy) this.object).getObject();
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

		public void addDescriptor(IItemPropertyDescriptor descriptor,
				Object specElement) {
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
		private Object specElement;

		public SortedItemPropertyDescriptor(
				IItemPropertyDescriptor itemPropertyDescriptor, Object element) {
			this.itemPropertyDescriptor = itemPropertyDescriptor;
			this.specElement = element;
		}

		public int compareTo(SortedItemPropertyDescriptor o) {
			return itemPropertyDescriptor.getDisplayName(specElement).compareTo(
					o.itemPropertyDescriptor.getDisplayName(o.specElement));
		}

		public IItemPropertyDescriptor getItemPropertyDescriptor() {
			return itemPropertyDescriptor;
		}

		public Object getSpecElement() {
			return this.specElement;
		}

	}

	private static class AdvancedProp {
		private String category;
		private String name;

		AdvancedProp(String category, String name) {
			if (category == null)
				category = DEFAULT_CATEGORY_NAME;
			if (name == null)
				throw new NullPointerException();
			this.category = category;
			this.name = name;
		}

		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof AdvancedProp))
				return false;
			AdvancedProp that = (AdvancedProp) obj;
			return category.equals(that.category) && name.equals(that.name);
		}

		@Override
		public int hashCode() {
			return category.hashCode() + name.hashCode();
		}
	}

}
