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
import org.eclipse.rmf.reqif10.xhtml.XhtmlTableType;

/**
 * This is the item provider adapter for a {@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class XhtmlTableTypeItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public XhtmlTableTypeItemProvider(AdapterFactory adapterFactory) {
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

			addBorderPropertyDescriptor(object);
			addCellpaddingPropertyDescriptor(object);
			addCellspacingPropertyDescriptor(object);
			addClassPropertyDescriptor(object);
			addFramePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addLangPropertyDescriptor(object);
			addRulesPropertyDescriptor(object);
			addSpacePropertyDescriptor(object);
			addStylePropertyDescriptor(object);
			addSummaryPropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addWidthPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Border feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addBorderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_XhtmlTableType_border_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTableType_border_feature", "_UI_XhtmlTableType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				XhtmlPackage.eINSTANCE.getXhtmlTableType_Border(), true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cellpadding feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCellpaddingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_XhtmlTableType_cellpadding_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTableType_cellpadding_feature", "_UI_XhtmlTableType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				XhtmlPackage.eINSTANCE.getXhtmlTableType_Cellpadding(), true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cellspacing feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCellspacingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_XhtmlTableType_cellspacing_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTableType_cellspacing_feature", "_UI_XhtmlTableType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				XhtmlPackage.eINSTANCE.getXhtmlTableType_Cellspacing(), true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Class feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_XhtmlTableType_class_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTableType_class_feature", "_UI_XhtmlTableType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				XhtmlPackage.eINSTANCE.getXhtmlTableType_Class(), true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Frame feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addFramePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_XhtmlTableType_frame_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTableType_frame_feature", "_UI_XhtmlTableType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				XhtmlPackage.eINSTANCE.getXhtmlTableType_Frame(), true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Id feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_XhtmlTableType_id_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTableType_id_feature", "_UI_XhtmlTableType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				XhtmlPackage.eINSTANCE.getXhtmlTableType_Id(), true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lang feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLangPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_XhtmlTableType_lang_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTableType_lang_feature", "_UI_XhtmlTableType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				XhtmlPackage.eINSTANCE.getXhtmlTableType_Lang(), true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Rules feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addRulesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_XhtmlTableType_rules_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTableType_rules_feature", "_UI_XhtmlTableType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				XhtmlPackage.eINSTANCE.getXhtmlTableType_Rules(), true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Space feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSpacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_XhtmlTableType_space_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTableType_space_feature", "_UI_XhtmlTableType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				XhtmlPackage.eINSTANCE.getXhtmlTableType_Space(), true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Style feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_XhtmlTableType_style_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTableType_style_feature", "_UI_XhtmlTableType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				XhtmlPackage.eINSTANCE.getXhtmlTableType_Style(), true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Summary feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSummaryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_XhtmlTableType_summary_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTableType_summary_feature", "_UI_XhtmlTableType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				XhtmlPackage.eINSTANCE.getXhtmlTableType_Summary(), true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Title feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_XhtmlTableType_title_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTableType_title_feature", "_UI_XhtmlTableType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				XhtmlPackage.eINSTANCE.getXhtmlTableType_Title(), true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Width feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_XhtmlTableType_width_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTableType_width_feature", "_UI_XhtmlTableType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				XhtmlPackage.eINSTANCE.getXhtmlTableType_Width(), true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(XhtmlPackage.eINSTANCE.getXhtmlTableType_Caption());
			childrenFeatures.add(XhtmlPackage.eINSTANCE.getXhtmlTableType_Col());
			childrenFeatures.add(XhtmlPackage.eINSTANCE.getXhtmlTableType_Colgroup());
			childrenFeatures.add(XhtmlPackage.eINSTANCE.getXhtmlTableType_Thead());
			childrenFeatures.add(XhtmlPackage.eINSTANCE.getXhtmlTableType_Tfoot());
			childrenFeatures.add(XhtmlPackage.eINSTANCE.getXhtmlTableType_Tbody());
			childrenFeatures.add(XhtmlPackage.eINSTANCE.getXhtmlTableType_Tr());
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
	 * This returns XhtmlTableType.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XhtmlTableType")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((XhtmlTableType) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_XhtmlTableType_type") : //$NON-NLS-1$
				getString("_UI_XhtmlTableType_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(XhtmlTableType.class)) {
		case XhtmlPackage.XHTML_TABLE_TYPE__BORDER:
		case XhtmlPackage.XHTML_TABLE_TYPE__CELLPADDING:
		case XhtmlPackage.XHTML_TABLE_TYPE__CELLSPACING:
		case XhtmlPackage.XHTML_TABLE_TYPE__CLASS:
		case XhtmlPackage.XHTML_TABLE_TYPE__FRAME:
		case XhtmlPackage.XHTML_TABLE_TYPE__ID:
		case XhtmlPackage.XHTML_TABLE_TYPE__LANG:
		case XhtmlPackage.XHTML_TABLE_TYPE__RULES:
		case XhtmlPackage.XHTML_TABLE_TYPE__SPACE:
		case XhtmlPackage.XHTML_TABLE_TYPE__STYLE:
		case XhtmlPackage.XHTML_TABLE_TYPE__SUMMARY:
		case XhtmlPackage.XHTML_TABLE_TYPE__TITLE:
		case XhtmlPackage.XHTML_TABLE_TYPE__WIDTH:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case XhtmlPackage.XHTML_TABLE_TYPE__CAPTION:
		case XhtmlPackage.XHTML_TABLE_TYPE__COL:
		case XhtmlPackage.XHTML_TABLE_TYPE__COLGROUP:
		case XhtmlPackage.XHTML_TABLE_TYPE__THEAD:
		case XhtmlPackage.XHTML_TABLE_TYPE__TFOOT:
		case XhtmlPackage.XHTML_TABLE_TYPE__TBODY:
		case XhtmlPackage.XHTML_TABLE_TYPE__TR:
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

		newChildDescriptors.add(createChildParameter(XhtmlPackage.eINSTANCE.getXhtmlTableType_Caption(),
				XhtmlFactory.eINSTANCE.createXhtmlCaptionType()));

		newChildDescriptors.add(createChildParameter(XhtmlPackage.eINSTANCE.getXhtmlTableType_Col(), XhtmlFactory.eINSTANCE.createXhtmlColType()));

		newChildDescriptors.add(createChildParameter(XhtmlPackage.eINSTANCE.getXhtmlTableType_Colgroup(),
				XhtmlFactory.eINSTANCE.createXhtmlColgroupType()));

		newChildDescriptors
				.add(createChildParameter(XhtmlPackage.eINSTANCE.getXhtmlTableType_Thead(), XhtmlFactory.eINSTANCE.createXhtmlTheadType()));

		newChildDescriptors
				.add(createChildParameter(XhtmlPackage.eINSTANCE.getXhtmlTableType_Tfoot(), XhtmlFactory.eINSTANCE.createXhtmlTfootType()));

		newChildDescriptors
				.add(createChildParameter(XhtmlPackage.eINSTANCE.getXhtmlTableType_Tbody(), XhtmlFactory.eINSTANCE.createXhtmlTbodyType()));

		newChildDescriptors.add(createChildParameter(XhtmlPackage.eINSTANCE.getXhtmlTableType_Tr(), XhtmlFactory.eINSTANCE.createXhtmlTrType()));
	}

	/**
	 * Return the resource locator for this item provider's resources. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return XhtmlEditPlugin.INSTANCE;
	}

}
