/**
 * Copyright (c) 2013 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.reqif10.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.ReqIFContent;

/**
 * This is the item provider adapter for a {@link org.eclipse.rmf.reqif10.ReqIFContent} object. <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class ReqIFContentItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ReqIFContentItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ReqIF10Package.Literals.REQ_IF_CONTENT__DATATYPES);
			childrenFeatures.add(ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_TYPES);
			childrenFeatures.add(ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_OBJECTS);
			childrenFeatures.add(ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_RELATIONS);
			childrenFeatures.add(ReqIF10Package.Literals.REQ_IF_CONTENT__SPECIFICATIONS);
			childrenFeatures.add(ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_RELATION_GROUPS);
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
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ReqIFContent.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ReqIFContent")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ReqIFContent_type"); //$NON-NLS-1$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating
	 * a viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ReqIFContent.class)) {
		case ReqIF10Package.REQ_IF_CONTENT__DATATYPES:
		case ReqIF10Package.REQ_IF_CONTENT__SPEC_TYPES:
		case ReqIF10Package.REQ_IF_CONTENT__SPEC_OBJECTS:
		case ReqIF10Package.REQ_IF_CONTENT__SPEC_RELATIONS:
		case ReqIF10Package.REQ_IF_CONTENT__SPECIFICATIONS:
		case ReqIF10Package.REQ_IF_CONTENT__SPEC_RELATION_GROUPS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that can be created
	 * under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(ReqIF10Package.Literals.REQ_IF_CONTENT__DATATYPES,
				ReqIF10Factory.eINSTANCE.createDatatypeDefinitionXHTML()));

		newChildDescriptors.add(createChildParameter(ReqIF10Package.Literals.REQ_IF_CONTENT__DATATYPES,
				ReqIF10Factory.eINSTANCE.createDatatypeDefinitionBoolean()));

		newChildDescriptors.add(createChildParameter(ReqIF10Package.Literals.REQ_IF_CONTENT__DATATYPES,
				ReqIF10Factory.eINSTANCE.createDatatypeDefinitionDate()));

		newChildDescriptors.add(createChildParameter(ReqIF10Package.Literals.REQ_IF_CONTENT__DATATYPES,
				ReqIF10Factory.eINSTANCE.createDatatypeDefinitionEnumeration()));

		newChildDescriptors.add(createChildParameter(ReqIF10Package.Literals.REQ_IF_CONTENT__DATATYPES,
				ReqIF10Factory.eINSTANCE.createDatatypeDefinitionInteger()));

		newChildDescriptors.add(createChildParameter(ReqIF10Package.Literals.REQ_IF_CONTENT__DATATYPES,
				ReqIF10Factory.eINSTANCE.createDatatypeDefinitionReal()));

		newChildDescriptors.add(createChildParameter(ReqIF10Package.Literals.REQ_IF_CONTENT__DATATYPES,
				ReqIF10Factory.eINSTANCE.createDatatypeDefinitionString()));

		newChildDescriptors.add(createChildParameter(ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_TYPES,
				ReqIF10Factory.eINSTANCE.createSpecObjectType()));

		newChildDescriptors.add(createChildParameter(ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_TYPES,
				ReqIF10Factory.eINSTANCE.createSpecificationType()));

		newChildDescriptors.add(createChildParameter(ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_TYPES,
				ReqIF10Factory.eINSTANCE.createSpecRelationType()));

		newChildDescriptors.add(createChildParameter(ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_TYPES,
				ReqIF10Factory.eINSTANCE.createRelationGroupType()));

		newChildDescriptors.add(createChildParameter(ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_OBJECTS,
				ReqIF10Factory.eINSTANCE.createSpecObject()));

		newChildDescriptors.add(createChildParameter(ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_RELATIONS,
				ReqIF10Factory.eINSTANCE.createSpecRelation()));

		newChildDescriptors.add(createChildParameter(ReqIF10Package.Literals.REQ_IF_CONTENT__SPECIFICATIONS,
				ReqIF10Factory.eINSTANCE.createSpecification()));

		newChildDescriptors.add(createChildParameter(ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_RELATION_GROUPS,
				ReqIF10Factory.eINSTANCE.createRelationGroup()));
	}

	/**
	 * Return the resource locator for this item provider's resources. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Reqif10EditPlugin.INSTANCE;
	}

}
