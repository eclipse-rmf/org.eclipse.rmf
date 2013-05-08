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
import static org.eclipse.rmf.reqif10.ReqIF10Package.Literals.SPECIFICATION__CHILDREN;
import static org.eclipse.rmf.reqif10.ReqIF10Package.Literals.SPECIFICATION__TYPE;
import static org.eclipse.rmf.reqif10.ReqIF10Package.Literals.SPEC_HIERARCHY__OBJECT;
import static org.eclipse.rmf.reqif10.ReqIF10Package.Literals.SPEC_OBJECT__TYPE;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;

/**
 * This is the item provider adapter for a {@link org.eclipse.rmf.reqif10.Specification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecificationItemProvider
	extends SpecElementWithAttributesItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * Always call super.getPropertyDescriptors(object) to prevent caching of properties.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		super.getPropertyDescriptors(object, "Specification");
		addTypePropertyDescriptor(object);
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Specification_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Specification_type_feature", "_UI_Specification_type"),
				 ReqIF10Package.Literals.SPECIFICATION__TYPE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_SpecificationPropertyCategory"),
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ReqIF10Package.Literals.SPECIFICATION__CHILDREN);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Specification.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * Generalized label handling in {@link SpecElementWithAttributesItemProvider}
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return super.getText(object);
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * React to changes in the type
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Specification.class)) {
		case ReqIF10Package.SPECIFICATION__CHILDREN:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
			return;
		case ReqIF10Package.SPECIFICATION__TYPE:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * We also allow the creation of SpecHierarchies with an attach SpecObject.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(SPECIFICATION__CHILDREN,
				ReqIF10Factory.eINSTANCE.createSpecHierarchy()));

		// Allow creation of new untyped SpecObjects
		newChildDescriptors.add(createChildParameter(SPECIFICATION__CHILDREN,
				ReqIF10Factory.eINSTANCE.createSpecObject()));

		// Allow creation of typed SpecObjects
		ProrUtil.collectNewChildDescriptorsForTypeCreators(newChildDescriptors,
				object, SPECIFICATION__CHILDREN, SpecObjectType.class);

	}


	@Override
	protected EStructuralFeature getSpecTypeFeature() {
		return SPECIFICATION__TYPE;
	}

	/**
	 * Note that this is almost the same as
	 * {@link SpecHierarchyItemProvider#createCreateChildCommand(EditingDomain, EObject, EStructuralFeature, Object, int, Collection)}
	 * .
	 */
	@Override
	protected Command createCreateChildCommand(EditingDomain domain,
			EObject owner, EStructuralFeature feature, Object value, int index,
			Collection<?> collection) {
		if (value instanceof SpecType) {
			ReqIFContent content = ReqIF10Util.getReqIF(owner).getCoreContent();
			SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
			SpecHierarchy specHierarchy = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
			
			CompoundCommand cmd = ProrUtil.createAddTypedElementCommand(
					content, REQ_IF_CONTENT__SPEC_OBJECTS, specObject,
					SPEC_OBJECT__TYPE, (SpecType) value, -1, 3, domain,
					adapterFactory);
			cmd.append(AddCommand.create(domain, owner,
					SPECIFICATION__CHILDREN, specHierarchy, index));
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
					SPECIFICATION__CHILDREN, specHierarchy, index));
			cmd.append(AddCommand.create(domain, ReqIF10Util.getReqIF(owner)
					.getCoreContent(), REQ_IF_CONTENT__SPEC_OBJECTS, value));
			cmd.append(SetCommand.create(domain, specHierarchy,
					SPEC_HIERARCHY__OBJECT, value));
			return cmd;
		}
		
		return super.createCreateChildCommand(domain, owner, feature, value, index,
				collection);
	}
	
	/**
	 * Use the virtual intermediate provider as the parent, rather than
	 * {@link ReqIFContentItemProvider}.
	 */
	@Override
	public Object getParent(Object object) {
		ReqIFContent content = ((ReqIFContent) super.getParent(object));
		if (content == null)
			return null;
		ReqIFContentItemProvider reqifProvider = (ReqIFContentItemProvider) ProrUtil
				.getItemProvider(adapterFactory, content);
		return reqifProvider != null ? reqifProvider
				.getVirtualSpecifications(content) : null;
	}
	
	/**
	 * Ensures that added items have a unique ID
	 */
	@Override
	protected Command createAddCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection, int index) {
		
		// Ensure that the ID is unique if it's a copy operation.
		for (Object object : collection) {
			if (object instanceof Identifiable)
				ReqIF10Util.ensureIdIsUnique(owner.eResource(),
						(Identifiable) object);
		}

		return super.createAddCommand(domain, owner, feature, collection, index);
	}

}
