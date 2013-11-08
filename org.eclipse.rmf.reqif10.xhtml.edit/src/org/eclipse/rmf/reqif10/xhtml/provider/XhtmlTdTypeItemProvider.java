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
import org.eclipse.rmf.reqif10.xhtml.XhtmlPackage;
import org.eclipse.rmf.reqif10.xhtml.XhtmlTdType;

/**
 * This is the item provider adapter for a {@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XhtmlTdTypeItemProvider
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
	public XhtmlTdTypeItemProvider(AdapterFactory adapterFactory) {
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

			addAbbr1PropertyDescriptor(object);
			addAlignPropertyDescriptor(object);
			addAxisPropertyDescriptor(object);
			addCharPropertyDescriptor(object);
			addCharoffPropertyDescriptor(object);
			addClassPropertyDescriptor(object);
			addColspanPropertyDescriptor(object);
			addHeadersPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addLangPropertyDescriptor(object);
			addRowspanPropertyDescriptor(object);
			addScopePropertyDescriptor(object);
			addSpacePropertyDescriptor(object);
			addStylePropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addValignPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Abbr1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbbr1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlTdType_abbr1_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTdType_abbr1_feature", "_UI_XhtmlTdType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlTdType_Abbr1(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Align feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAlignPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlTdType_align_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTdType_align_feature", "_UI_XhtmlTdType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlTdType_Align(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Axis feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAxisPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlTdType_axis_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTdType_axis_feature", "_UI_XhtmlTdType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlTdType_Axis(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Char feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCharPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlTdType_char_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTdType_char_feature", "_UI_XhtmlTdType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlTdType_Char(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Charoff feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCharoffPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlTdType_charoff_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTdType_charoff_feature", "_UI_XhtmlTdType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlTdType_Charoff(),
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
				 getString("_UI_XhtmlTdType_class_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTdType_class_feature", "_UI_XhtmlTdType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlTdType_Class(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Colspan feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColspanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlTdType_colspan_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTdType_colspan_feature", "_UI_XhtmlTdType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlTdType_Colspan(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Headers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeadersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlTdType_headers_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTdType_headers_feature", "_UI_XhtmlTdType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlTdType_Headers(),
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
				 getString("_UI_XhtmlTdType_id_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTdType_id_feature", "_UI_XhtmlTdType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlTdType_Id(),
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
				 getString("_UI_XhtmlTdType_lang_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTdType_lang_feature", "_UI_XhtmlTdType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlTdType_Lang(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Rowspan feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRowspanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlTdType_rowspan_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTdType_rowspan_feature", "_UI_XhtmlTdType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlTdType_Rowspan(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scope feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScopePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlTdType_scope_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTdType_scope_feature", "_UI_XhtmlTdType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlTdType_Scope(),
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
				 getString("_UI_XhtmlTdType_space_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTdType_space_feature", "_UI_XhtmlTdType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlTdType_Space(),
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
				 getString("_UI_XhtmlTdType_style_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTdType_style_feature", "_UI_XhtmlTdType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlTdType_Style(),
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
				 getString("_UI_XhtmlTdType_title_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTdType_title_feature", "_UI_XhtmlTdType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlTdType_Title(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Valign feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValignPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlTdType_valign_feature"), //$NON-NLS-1$
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTdType_valign_feature", "_UI_XhtmlTdType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				 XhtmlPackage.eINSTANCE.getXhtmlTdType_Valign(),
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
			childrenFeatures.add(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed());
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
	 * This returns XhtmlTdType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XhtmlTdType")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((XhtmlTdType)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_XhtmlTdType_type") : //$NON-NLS-1$
			getString("_UI_XhtmlTdType_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(XhtmlTdType.class)) {
			case XhtmlPackage.XHTML_TD_TYPE__ABBR1:
			case XhtmlPackage.XHTML_TD_TYPE__ALIGN:
			case XhtmlPackage.XHTML_TD_TYPE__AXIS:
			case XhtmlPackage.XHTML_TD_TYPE__CHAR:
			case XhtmlPackage.XHTML_TD_TYPE__CHAROFF:
			case XhtmlPackage.XHTML_TD_TYPE__CLASS:
			case XhtmlPackage.XHTML_TD_TYPE__COLSPAN:
			case XhtmlPackage.XHTML_TD_TYPE__HEADERS:
			case XhtmlPackage.XHTML_TD_TYPE__ID:
			case XhtmlPackage.XHTML_TD_TYPE__LANG:
			case XhtmlPackage.XHTML_TD_TYPE__ROWSPAN:
			case XhtmlPackage.XHTML_TD_TYPE__SCOPE:
			case XhtmlPackage.XHTML_TD_TYPE__SPACE:
			case XhtmlPackage.XHTML_TD_TYPE__STYLE:
			case XhtmlPackage.XHTML_TD_TYPE__TITLE:
			case XhtmlPackage.XHTML_TD_TYPE__VALIGN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case XhtmlPackage.XHTML_TD_TYPE__MIXED:
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
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__COMMENT,
					 ""))); //$NON-NLS-1$

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT,
					 ""))); //$NON-NLS-1$

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION,
					 XMLTypeFactory.eINSTANCE.createProcessingInstruction())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__CDATA,
					 ""))); //$NON-NLS-1$

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_H1(),
					 XhtmlFactory.eINSTANCE.createXhtmlH1Type())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_H2(),
					 XhtmlFactory.eINSTANCE.createXhtmlH2Type())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_H3(),
					 XhtmlFactory.eINSTANCE.createXhtmlH3Type())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_H4(),
					 XhtmlFactory.eINSTANCE.createXhtmlH4Type())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_H5(),
					 XhtmlFactory.eINSTANCE.createXhtmlH5Type())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_H6(),
					 XhtmlFactory.eINSTANCE.createXhtmlH6Type())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Ul(),
					 XhtmlFactory.eINSTANCE.createXhtmlUlType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Ol(),
					 XhtmlFactory.eINSTANCE.createXhtmlOlType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Dl(),
					 XhtmlFactory.eINSTANCE.createXhtmlDlType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_P(),
					 XhtmlFactory.eINSTANCE.createXhtmlPType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Div(),
					 XhtmlFactory.eINSTANCE.createXhtmlDivType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Pre(),
					 XhtmlFactory.eINSTANCE.createXhtmlPreType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Blockquote(),
					 XhtmlFactory.eINSTANCE.createXhtmlBlockquoteType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Address(),
					 XhtmlFactory.eINSTANCE.createXhtmlAddressType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Hr(),
					 XhtmlFactory.eINSTANCE.createXhtmlHrType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Table(),
					 XhtmlFactory.eINSTANCE.createXhtmlTableType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Br(),
					 XhtmlFactory.eINSTANCE.createXhtmlBrType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Span(),
					 XhtmlFactory.eINSTANCE.createXhtmlSpanType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Em(),
					 XhtmlFactory.eINSTANCE.createXhtmlEmType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Strong(),
					 XhtmlFactory.eINSTANCE.createXhtmlStrongType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Dfn(),
					 XhtmlFactory.eINSTANCE.createXhtmlDfnType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Code(),
					 XhtmlFactory.eINSTANCE.createXhtmlCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Samp(),
					 XhtmlFactory.eINSTANCE.createXhtmlSampType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Kbd(),
					 XhtmlFactory.eINSTANCE.createXhtmlKbdType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Var(),
					 XhtmlFactory.eINSTANCE.createXhtmlVarType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Cite(),
					 XhtmlFactory.eINSTANCE.createXhtmlCiteType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Abbr(),
					 XhtmlFactory.eINSTANCE.createXhtmlAbbrType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Acronym(),
					 XhtmlFactory.eINSTANCE.createXhtmlAcronymType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Q(),
					 XhtmlFactory.eINSTANCE.createXhtmlQType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Tt(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_I(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_B(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Big(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Small(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Sub(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Sup(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_A(),
					 XhtmlFactory.eINSTANCE.createXhtmlAType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Object(),
					 XhtmlFactory.eINSTANCE.createXhtmlObjectType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Ins(),
					 XhtmlFactory.eINSTANCE.createXhtmlEditType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlTdType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlTdType_Del(),
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
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlTdType_Tt() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlTdType_I() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlTdType_B() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlTdType_Big() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlTdType_Small() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlTdType_Sub() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlTdType_Sup() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlTdType_Ins() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlTdType_Del();

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
