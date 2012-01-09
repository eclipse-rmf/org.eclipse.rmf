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
import org.eclipse.rmf.pror.reqif10.util.ProrUtil;
import org.eclipse.rmf.reqif10.RelationGroup;
import org.eclipse.rmf.reqif10.ReqIfContent;
import org.eclipse.rmf.reqif10.Reqif10Package;

/**
 * This is the item provider adapter for a {@link org.eclipse.rmf.pror.reqif10.RelationGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationGroupItemProvider
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
	public RelationGroupItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * Adjusting Category.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object, "Relation Group");

			addSpecRelationsPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addSourceSpecificationPropertyDescriptor(object);
			addTargetSpecificationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Spec Relations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecRelationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RelationGroup_specRelations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RelationGroup_specRelations_feature", "_UI_RelationGroup_type"),
				 Reqif10Package.Literals.RELATION_GROUP__SPEC_RELATIONS,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_RelationGroupPropertyCategory"),
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
				 getString("_UI_RelationGroup_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RelationGroup_type_feature", "_UI_RelationGroup_type"),
				 Reqif10Package.Literals.RELATION_GROUP__TYPE,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_RelationGroupPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Source Specification feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourceSpecificationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RelationGroup_sourceSpecification_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RelationGroup_sourceSpecification_feature", "_UI_RelationGroup_type"),
				 Reqif10Package.Literals.RELATION_GROUP__SOURCE_SPECIFICATION,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_RelationGroupPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Specification feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetSpecificationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RelationGroup_targetSpecification_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RelationGroup_targetSpecification_feature", "_UI_RelationGroup_type"),
				 Reqif10Package.Literals.RELATION_GROUP__TARGET_SPECIFICATION,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_RelationGroupPropertyCategory"),
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
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RelationGroup.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RelationGroup)object).getLongName();
		return label == null || label.length() == 0 ?
			getString("_UI_RelationGroup_type") :
			getString("_UI_RelationGroup_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
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
		return Reqif10Package.Literals.RELATION_GROUP__TYPE;
	}
	
	/**
	 * Use the virtual intermediate provider as the parent, rather than
	 * {@link ReqIfContentItemProvider}.
	 */
	@Override
	public Object getParent(Object object) {
		ReqIfContent content = ((ReqIfContent) super.getParent(object));
		if (content == null)
			return null;
		ReqIfContentItemProvider reqifProvider = (ReqIfContentItemProvider) ProrUtil
				.getItemProvider(adapterFactory, content);
		return reqifProvider != null ? reqifProvider
				.getVirtualSpecRelationGroups(content) : null;
	}


}
