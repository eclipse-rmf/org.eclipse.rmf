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

package org.eclipse.rmf.pror.reqif10.provider;

import static org.eclipse.rmf.reqif10.Reqif10Package.Literals.REQ_IF_CONTENT__SPEC_OBJECTS;
import static org.eclipse.rmf.reqif10.Reqif10Package.Literals.SPEC_HIERARCHY__CHILDREN;
import static org.eclipse.rmf.reqif10.Reqif10Package.Literals.SPEC_HIERARCHY__OBJECT;
import static org.eclipse.rmf.reqif10.Reqif10Package.Literals.SPEC_OBJECT__TYPE;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DragAndDropFeedback;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptorDecorator;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.rmf.pror.reqif10.util.ConfigurationUtil;
import org.eclipse.rmf.pror.reqif10.util.ProrUtil;
import org.eclipse.rmf.reqif10.ReqIfContent;
import org.eclipse.rmf.reqif10.Reqif10Factory;
import org.eclipse.rmf.reqif10.Reqif10Package;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.util.Reqif10Util;

/**
 * This is the item provider adapter for a
 * {@link org.eclipse.rmf.reqif10.SpecHierarchy} object. <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class SpecHierarchyItemProvider extends
		AccessControlledElementItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SpecHierarchyItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> Adding the properties from the {@link SpecObject}
	 * <p>
	 * 
	 * NOTE: In order for this to work, the properties must not be cached. We
	 * achieve this by setting itemPropertyDescriptors to null in the subclasses
	 * in {@link #getPropertyDescriptors(Object)}
	 * <p>
	 * 
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(
			Object specHierarchy) {
		itemPropertyDescriptors = null;
		super.getPropertyDescriptors(specHierarchy);

		// We need to separate the SpecHierarchy's properties from the
		// SpecObject's properties. Therefore, we rename the
		// Category.
		ArrayList<IItemPropertyDescriptor> newDescriptors = new ArrayList<IItemPropertyDescriptor>();
		for (IItemPropertyDescriptor descriptor : itemPropertyDescriptors) {
			newDescriptors.add(new ItemPropertyDescriptorDecorator(
					specHierarchy, descriptor) {
				public String getCategory(Object thisObject) {
					return getString("_UI_SpecHierarchyPropertyCategory");
				}
			});
		}
		itemPropertyDescriptors = newDescriptors;

		SpecObject specObject = ((SpecHierarchy) specHierarchy).getObject();
		if (specObject != null) {
			ItemProviderAdapter specObjectItemProvider = ProrUtil
					.getItemProvider(adapterFactory, specObject);
			itemPropertyDescriptors.addAll(specObjectItemProvider
					.getPropertyDescriptors(specObject));
		}
		addIsTableInternalPropertyDescriptor(specHierarchy);
		addObjectPropertyDescriptor(specHierarchy);
		addEditableAttsPropertyDescriptor(specHierarchy);
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Is Table Internal feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addIsTableInternalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_SpecHierarchy_isTableInternal_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SpecHierarchy_isTableInternal_feature",
						"_UI_SpecHierarchy_type"),
				Reqif10Package.Literals.SPEC_HIERARCHY__IS_TABLE_INTERNAL,
				true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				getString("_UI_SpecHierarchyPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Object feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addObjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_SpecHierarchy_object_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SpecHierarchy_object_feature",
						"_UI_SpecHierarchy_type"),
				Reqif10Package.Literals.SPEC_HIERARCHY__OBJECT, true, false,
				true, null, getString("_UI_SpecHierarchyPropertyCategory"),
				null));
	}

	/**
	 * This adds a property descriptor for the Editable Atts feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addEditableAttsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_SpecHierarchy_editableAtts_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_SpecHierarchy_editableAtts_feature",
						"_UI_SpecHierarchy_type"),
				Reqif10Package.Literals.SPEC_HIERARCHY__EDITABLE_ATTS, true,
				false, true, null,
				getString("_UI_SpecHierarchyPropertyCategory"), null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to
	 * deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand},
	 * {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in
	 * {@link #createCommand}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(Reqif10Package.Literals.SPEC_HIERARCHY__CHILDREN);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper
		// feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	@Override
	public Object getImage(Object object) {
		if (((SpecHierarchy) object).getObject() == null) {
			return overlayImage(
					object,
					getResourceLocator().getImage(
							"full/obj16/SpecHierarchy.png"));
		}
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/SpecObject.png"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		SpecObject specObject = ((SpecHierarchy) object).getObject();
		if (specObject != null) {
			return ConfigurationUtil.getSpecElementLabel(specObject);
		}
		return getString("_UI_SpecHierarchy_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> Also
	 * fire a notification upon change of the Object <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SpecHierarchy.class)) {
		case Reqif10Package.SPEC_HIERARCHY__IS_TABLE_INTERNAL:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case Reqif10Package.SPEC_HIERARCHY__CHILDREN:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
			return;
		case Reqif10Package.SPEC_HIERARCHY__OBJECT:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> Adding ChildDescriptors for SpecHierarchies with
	 * attached specObjects. <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(SPEC_HIERARCHY__CHILDREN,
				Reqif10Factory.eINSTANCE.createSpecHierarchy()));

		// Allow creation of new untyped SpecObjects
		newChildDescriptors.add(createChildParameter(SPEC_HIERARCHY__CHILDREN,
				Reqif10Factory.eINSTANCE.createSpecObject()));

		// Allow creation of typed SpecObjects
		ProrUtil.collectNewChildDescriptorsForTypeCreators(newChildDescriptors,
				object, SPEC_HIERARCHY__CHILDREN, SpecObjectType.class);

	}

	/**
	 * <p>
	 * In addition to the regular functionality (creating a SpecHierarchy child
	 * object), this method allows a SpecObject or a SpecType as an argument:
	 * </p>
	 * 
	 * Note that this is almost the same as
	 * {@link SpecificationItemProvider#createCreateChildCommand(EditingDomain, EObject, EStructuralFeature, Object, int, Collection)}
	 * .
	 * 
	 * @param value
	 *            instanceof {@link SpecType}: A new SpecObject with the given
	 *            SpecType is created, and a SpecHierarchy is added that is
	 *            associated with the newly created SpecObject.
	 * 
	 * @param value
	 *            instanceof {@link SpecObject}: The SpecObject is added to a
	 *            new SpecHierarchy, which is then added.
	 */
	@Override
	protected Command createCreateChildCommand(EditingDomain domain,
			EObject owner, EStructuralFeature feature, Object value, int index,
			Collection<?> collection) {
		if (value instanceof SpecType) {
			ReqIfContent content = Reqif10Util.getReqIf(owner).getCoreContent();
			SpecObject specObject = Reqif10Factory.eINSTANCE.createSpecObject();
			SpecHierarchy specHierarchy = Reqif10Factory.eINSTANCE
					.createSpecHierarchy();

			CompoundCommand cmd = ProrUtil.createAddTypedElementCommand(
					content, REQ_IF_CONTENT__SPEC_OBJECTS, specObject,
					SPEC_OBJECT__TYPE, (SpecType) value, -1, 3, domain,
					adapterFactory);
			cmd.append(AddCommand.create(domain, owner,
					SPEC_HIERARCHY__CHILDREN, specHierarchy, index));
			cmd.append(SetCommand.create(domain, specHierarchy,
					SPEC_HIERARCHY__OBJECT, specObject));
			return cmd;
		}
		if (value instanceof SpecObject) {
			Object icon = ProrUtil.getItemProvider(adapterFactory, value)
					.getImage(value);
			CompoundCommand cmd = ProrUtil.createCompoundCommandWithAddIcon(
					icon, 0);
			cmd.setLabel("Adding SpecObject");
			cmd.setDescription("Adding SpecObject");
			SpecHierarchy specHierarchy = Reqif10Factory.eINSTANCE
					.createSpecHierarchy();
			cmd.append(AddCommand.create(domain, owner,
					SPEC_HIERARCHY__CHILDREN, specHierarchy, index));
			cmd.append(AddCommand.create(domain, Reqif10Util.getReqIf(owner)
					.getCoreContent(), REQ_IF_CONTENT__SPEC_OBJECTS, value));
			cmd.append(SetCommand.create(domain, specHierarchy,
					SPEC_HIERARCHY__OBJECT, value));
			return cmd;
		}

		return super.createCreateChildCommand(domain, owner, feature, value,
				index, collection);
	}

	/**
	 * Handles link-operations by creating SpecRelations.
	 */
	@Override
	protected Command createDragAndDropCommand(EditingDomain domain,
			Object owner, float location, int operations, int operation,
			Collection<?> collection) {

		for (Object obj : collection) {
			if (obj instanceof SpecHierarchy) {
				SpecHierarchy specHierarchy = (SpecHierarchy) obj;
				
				if (!ProrUtil.isValidDrop(specHierarchy, owner)){
					return UnexecutableCommand.INSTANCE;
				}
								
			}
		}
		
		
		Command cmd = ProrUtil.getPresentationHandleDragAndDropCommand(domain, owner, location,
				operations, operation, collection);
		if (cmd != null)
			return cmd;

		// Create a SpecRelation on Linking
		if (operation == DragAndDropFeedback.DROP_LINK) {
			return ProrUtil.createCreateSpecRelationsCommand(domain,
					collection, owner);
		}

		// Otherwise default behavior
		return super.createDragAndDropCommand(domain, owner, location,
				operations, operation, collection);
	}

}
