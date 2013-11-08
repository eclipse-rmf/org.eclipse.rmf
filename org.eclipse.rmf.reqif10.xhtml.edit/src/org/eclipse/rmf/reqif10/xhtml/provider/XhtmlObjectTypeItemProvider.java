/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.reqif10.xhtml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.rmf.reqif10.xhtml.XhtmlFactory;
import org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XhtmlObjectTypeItemProvider
	extends ItemProviderAdapter
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
	public XhtmlObjectTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addArchivePropertyDescriptor(object);
			addClassPropertyDescriptor(object);
			addClassidPropertyDescriptor(object);
			addCodebasePropertyDescriptor(object);
			addCodetypePropertyDescriptor(object);
			addDataPropertyDescriptor(object);
			addDeclarePropertyDescriptor(object);
			addHeightPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addLangPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addSpacePropertyDescriptor(object);
			addStandbyPropertyDescriptor(object);
			addStylePropertyDescriptor(object);
			addTabindexPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addWidthPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Archive feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArchivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlObjectType_archive_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlObjectType_archive_feature", "_UI_XhtmlObjectType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlObjectType_Archive(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlObjectType_class_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlObjectType_class_feature", "_UI_XhtmlObjectType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlObjectType_Class(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Classid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlObjectType_classid_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlObjectType_classid_feature", "_UI_XhtmlObjectType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlObjectType_Classid(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Codebase feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodebasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlObjectType_codebase_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlObjectType_codebase_feature", "_UI_XhtmlObjectType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlObjectType_Codebase(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Codetype feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCodetypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlObjectType_codetype_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlObjectType_codetype_feature", "_UI_XhtmlObjectType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlObjectType_Codetype(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlObjectType_data_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlObjectType_data_feature", "_UI_XhtmlObjectType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlObjectType_Data(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Declare feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeclarePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlObjectType_declare_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlObjectType_declare_feature", "_UI_XhtmlObjectType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlObjectType_Declare(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlObjectType_height_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlObjectType_height_feature", "_UI_XhtmlObjectType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlObjectType_Height(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlObjectType_id_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlObjectType_id_feature", "_UI_XhtmlObjectType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlObjectType_Id(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lang feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLangPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlObjectType_lang_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlObjectType_lang_feature", "_UI_XhtmlObjectType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlObjectType_Lang(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlObjectType_name_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlObjectType_name_feature", "_UI_XhtmlObjectType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlObjectType_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Space feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlObjectType_space_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlObjectType_space_feature", "_UI_XhtmlObjectType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlObjectType_Space(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Standby feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStandbyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlObjectType_standby_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlObjectType_standby_feature", "_UI_XhtmlObjectType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlObjectType_Standby(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlObjectType_style_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlObjectType_style_feature", "_UI_XhtmlObjectType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlObjectType_Style(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tabindex feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTabindexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlObjectType_tabindex_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlObjectType_tabindex_feature", "_UI_XhtmlObjectType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlObjectType_Tabindex(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlObjectType_title_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlObjectType_title_feature", "_UI_XhtmlObjectType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlObjectType_Title(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
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
				 getString("_UI_XhtmlObjectType_type_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlObjectType_type_feature", "_UI_XhtmlObjectType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlObjectType_Type(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlObjectType_width_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlObjectType_width_feature", "_UI_XhtmlObjectType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlObjectType_Width(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
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
			childrenFeatures.add(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed());
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
	 * This returns XhtmlObjectType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XhtmlObjectType")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((XhtmlObjectType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_XhtmlObjectType_type") : //$NON-NLS-1$
			getString("_UI_XhtmlObjectType_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(XhtmlObjectType.class)) {
			case XhtmlPackage.XHTML_OBJECT_TYPE__ARCHIVE:
			case XhtmlPackage.XHTML_OBJECT_TYPE__CLASS:
			case XhtmlPackage.XHTML_OBJECT_TYPE__CLASSID:
			case XhtmlPackage.XHTML_OBJECT_TYPE__CODEBASE:
			case XhtmlPackage.XHTML_OBJECT_TYPE__CODETYPE:
			case XhtmlPackage.XHTML_OBJECT_TYPE__DATA:
			case XhtmlPackage.XHTML_OBJECT_TYPE__DECLARE:
			case XhtmlPackage.XHTML_OBJECT_TYPE__HEIGHT:
			case XhtmlPackage.XHTML_OBJECT_TYPE__ID:
			case XhtmlPackage.XHTML_OBJECT_TYPE__LANG:
			case XhtmlPackage.XHTML_OBJECT_TYPE__NAME:
			case XhtmlPackage.XHTML_OBJECT_TYPE__SPACE:
			case XhtmlPackage.XHTML_OBJECT_TYPE__STANDBY:
			case XhtmlPackage.XHTML_OBJECT_TYPE__STYLE:
			case XhtmlPackage.XHTML_OBJECT_TYPE__TABINDEX:
			case XhtmlPackage.XHTML_OBJECT_TYPE__TITLE:
			case XhtmlPackage.XHTML_OBJECT_TYPE__TYPE:
			case XhtmlPackage.XHTML_OBJECT_TYPE__WIDTH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case XhtmlPackage.XHTML_OBJECT_TYPE__MIXED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__COMMENT,
					 ""))); //$NON-NLS-1$

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT,
					 ""))); //$NON-NLS-1$

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION,
					 XMLTypeFactory.eINSTANCE.createProcessingInstruction())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__CDATA,
					 ""))); //$NON-NLS-1$

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Param(),
					 XhtmlFactory.eINSTANCE.createXhtmlParamType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_H1(),
					 XhtmlFactory.eINSTANCE.createXhtmlH1Type())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_H2(),
					 XhtmlFactory.eINSTANCE.createXhtmlH2Type())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_H3(),
					 XhtmlFactory.eINSTANCE.createXhtmlH3Type())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_H4(),
					 XhtmlFactory.eINSTANCE.createXhtmlH4Type())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_H5(),
					 XhtmlFactory.eINSTANCE.createXhtmlH5Type())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_H6(),
					 XhtmlFactory.eINSTANCE.createXhtmlH6Type())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Ul(),
					 XhtmlFactory.eINSTANCE.createXhtmlUlType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Ol(),
					 XhtmlFactory.eINSTANCE.createXhtmlOlType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Dl(),
					 XhtmlFactory.eINSTANCE.createXhtmlDlType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_P(),
					 XhtmlFactory.eINSTANCE.createXhtmlPType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Div(),
					 XhtmlFactory.eINSTANCE.createXhtmlDivType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Pre(),
					 XhtmlFactory.eINSTANCE.createXhtmlPreType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Blockquote(),
					 XhtmlFactory.eINSTANCE.createXhtmlBlockquoteType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Address(),
					 XhtmlFactory.eINSTANCE.createXhtmlAddressType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Hr(),
					 XhtmlFactory.eINSTANCE.createXhtmlHrType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Table(),
					 XhtmlFactory.eINSTANCE.createXhtmlTableType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Br(),
					 XhtmlFactory.eINSTANCE.createXhtmlBrType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Span(),
					 XhtmlFactory.eINSTANCE.createXhtmlSpanType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Em(),
					 XhtmlFactory.eINSTANCE.createXhtmlEmType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Strong(),
					 XhtmlFactory.eINSTANCE.createXhtmlStrongType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Dfn(),
					 XhtmlFactory.eINSTANCE.createXhtmlDfnType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Code(),
					 XhtmlFactory.eINSTANCE.createXhtmlCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Samp(),
					 XhtmlFactory.eINSTANCE.createXhtmlSampType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Kbd(),
					 XhtmlFactory.eINSTANCE.createXhtmlKbdType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Var(),
					 XhtmlFactory.eINSTANCE.createXhtmlVarType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Cite(),
					 XhtmlFactory.eINSTANCE.createXhtmlCiteType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Abbr(),
					 XhtmlFactory.eINSTANCE.createXhtmlAbbrType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Acronym(),
					 XhtmlFactory.eINSTANCE.createXhtmlAcronymType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Q(),
					 XhtmlFactory.eINSTANCE.createXhtmlQType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Tt(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_I(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_B(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Big(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Small(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Sub(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Sup(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_A(),
					 XhtmlFactory.eINSTANCE.createXhtmlAType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Object(),
					 XhtmlFactory.eINSTANCE.createXhtmlObjectType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Ins(),
					 XhtmlFactory.eINSTANCE.createXhtmlEditType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlObjectType_Del(),
					 XhtmlFactory.eINSTANCE.createXhtmlEditType())));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlObjectType_Tt() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlObjectType_I() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlObjectType_B() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlObjectType_Big() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlObjectType_Small() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlObjectType_Sub() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlObjectType_Sup() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlObjectType_Ins() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlObjectType_Del();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2", //$NON-NLS-1$
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return XhtmlEditPlugin.INSTANCE;
	}

}
