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

package org.eclipse.rmf.reqif10.pror.provider;

import static org.eclipse.rmf.reqif10.ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_OBJECTS;
import static org.eclipse.rmf.reqif10.ReqIF10Package.Literals.SPEC_HIERARCHY__CHILDREN;
import static org.eclipse.rmf.reqif10.ReqIF10Package.Literals.SPEC_HIERARCHY__OBJECT;
import static org.eclipse.rmf.reqif10.ReqIF10Package.Literals.SPEC_OBJECT__TYPE;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DragAndDropCommand;
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
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.util.ConfigurationUtil;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;

/**
 * This is the item provider adapter for a {@link org.eclipse.rmf.reqif10.SpecHierarchy} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
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
		addTableInternalPropertyDescriptor(specHierarchy);
		addObjectPropertyDescriptor(specHierarchy);
		addEditableAttsPropertyDescriptor(specHierarchy);
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Table Internal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTableInternalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpecHierarchy_tableInternal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpecHierarchy_tableInternal_feature", "_UI_SpecHierarchy_type"),
				 ReqIF10Package.Literals.SPEC_HIERARCHY__TABLE_INTERNAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_SpecHierarchyPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Object feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addObjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpecHierarchy_object_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpecHierarchy_object_feature", "_UI_SpecHierarchy_type"),
				 ReqIF10Package.Literals.SPEC_HIERARCHY__OBJECT,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_SpecHierarchyPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Editable Atts feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addEditableAttsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpecHierarchy_editableAtts_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpecHierarchy_editableAtts_feature", "_UI_SpecHierarchy_type"),
				 ReqIF10Package.Literals.SPEC_HIERARCHY__EDITABLE_ATTS,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_SpecHierarchyPropertyCategory"),
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ReqIF10Package.Literals.SPEC_HIERARCHY__CHILDREN);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
			return ConfigurationUtil.getSpecElementLabel(specObject,
					adapterFactory);
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
		case ReqIF10Package.SPEC_HIERARCHY__TABLE_INTERNAL:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case ReqIF10Package.SPEC_HIERARCHY__CHILDREN:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
			return;
		case ReqIF10Package.SPEC_HIERARCHY__OBJECT:
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
				ReqIF10Factory.eINSTANCE.createSpecHierarchy()));

		// Allow creation of new untyped SpecObjects
		newChildDescriptors.add(createChildParameter(SPEC_HIERARCHY__CHILDREN,
				ReqIF10Factory.eINSTANCE.createSpecObject()));

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
			ReqIFContent content = ReqIF10Util.getReqIF(owner).getCoreContent();
			SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
			SpecHierarchy specHierarchy = ReqIF10Factory.eINSTANCE
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
			SpecHierarchy specHierarchy = ReqIF10Factory.eINSTANCE
					.createSpecHierarchy();
			cmd.append(AddCommand.create(domain, owner,
					SPEC_HIERARCHY__CHILDREN, specHierarchy, index));
			cmd.append(AddCommand.create(domain, ReqIF10Util.getReqIF(owner)
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
//
//		// Ensure that the ID is unique if it's a copy operation.
//		if (owner instanceof EObject
//				&& operation == DragAndDropFeedback.DROP_COPY) {
//			// We must create a copy, as the collection is not detached from the model yet.
//			collection = EcoreUtil.copyAll(collection);
//			
//			for (Object object : collection) {
//				if (object instanceof Identifiable)
//					System.out.println("Updating collection: " + object);
//					ReqIF10Util.ensureIdIsUnique(((EObject) owner).eResource(),
//							(Identifiable) object);
//			}
//		}

		for (Object obj : collection) {
			if (obj instanceof SpecHierarchy) {
				SpecHierarchy specHierarchy = (SpecHierarchy) obj;

				boolean validDrop = ProrUtil.isValidDrop(specHierarchy, owner);
				if (!validDrop) {
					return UnexecutableCommand.INSTANCE;
				}

			}
		}

		Command cmd = ProrUtil.getPresentationHandleDragAndDropCommand(domain,
				owner, location, operations, operation, collection,
				getRootAdapterFactory());
		if (cmd != null)
			return cmd;

		// This is a bugfix for Bug 375519: We have to override the
		// prepareDropLinOn method of the DragAndDropCommand, since we do
		// not add SpecRelations as child of the owner. Instead we use the
		// specific feature for SpecRelations.
		DragAndDropCommand dragAndDropCommand = new DragAndDropCommand(domain,
				owner, location, operations, operation, collection) {

			@Override
			protected boolean prepareDropLinkOn() {
				dropCommand = ProrUtil.createCreateSpecRelationsCommand(domain,
						collection, owner);
				boolean result = dropCommand.canExecute();
				return result;
			}

		};

		return dragAndDropCommand;
	}
	
	/**
	 * Ensures that added items have a unique ID
	 */
	@Override
	protected Command createAddCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection, int index) {
		
		// Ensure that the ID is unique if it's a copy operation.
		collection = ReqIF10Util.ensureIdIsUnique(owner.eResource(), collection);
		return super.createAddCommand(domain, owner, feature, collection, index);
	}
	
	/**
	 * We extended the command in order to append an additional command for
	 * setting the lastChanged attribute of the {@link SpecHierarchy} whenever
	 * it is moved (the order is changed).
	 */
	@Override
	protected Command createMoveCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value, int index) {

		List<Command> commandList = new ArrayList<Command>();
		commandList.add(super.createMoveCommand(domain, owner, feature, value,
				index));

		XMLGregorianCalendar lastChange = ReqIF10Util.getReqIFLastChange();
		if (value instanceof SpecHierarchy) {
			SetCommand sc = new SetCommand(domain, (SpecHierarchy) value,
					ReqIF10Package.eINSTANCE.getIdentifiable_LastChange(),
					lastChange);
			commandList.add(sc);
		}

		CompoundCommand cc = new CompoundCommand(commandList);

		return cc;

	}

}
