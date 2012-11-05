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


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;

/**
 * This is the item provider adapter for a {@link org.eclipse.rmf.reqif10.SpecRelation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecRelationItemProvider
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
	public SpecRelationItemProvider(AdapterFactory adapterFactory) {
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
		super.getPropertyDescriptors(object, "Spec Relation");
		addTargetPropertyDescriptor(object);
		addSourcePropertyDescriptor(object);
		addTypePropertyDescriptor(object);
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpecRelation_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpecRelation_target_feature", "_UI_SpecRelation_type"),
				 ReqIF10Package.Literals.SPEC_RELATION__TARGET,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_SpecRelationPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SpecRelation_source_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpecRelation_source_feature", "_UI_SpecRelation_type"),
				 ReqIF10Package.Literals.SPEC_RELATION__SOURCE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_SpecRelationPropertyCategory"),
				 null));
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
				 getString("_UI_SpecRelation_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SpecRelation_type_feature", "_UI_SpecRelation_type"),
				 ReqIF10Package.Literals.SPEC_RELATION__TYPE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_SpecRelationPropertyCategory"),
				 null));
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
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SpecRelation.png"));
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

		switch (notification.getFeatureID(SpecRelation.class)) {
		case ReqIF10Package.SPEC_RELATION__TYPE:
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
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}
	
	@Override
	protected EStructuralFeature getSpecTypeFeature() {
		return ReqIF10Package.Literals.SPEC_RELATION__TYPE;
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
				.getVirtualSpecRelations(content) : null;
	}

}
