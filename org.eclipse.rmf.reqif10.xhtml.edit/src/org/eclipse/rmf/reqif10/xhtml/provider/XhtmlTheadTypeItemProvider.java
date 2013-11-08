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
import org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType;

/**
 * This is the item provider adapter for a {@link org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class XhtmlTheadTypeItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public XhtmlTheadTypeItemProvider(AdapterFactory adapterFactory) {
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

			addAlignPropertyDescriptor(object);
			addCharPropertyDescriptor(object);
			addCharoffPropertyDescriptor(object);
			addClassPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addLangPropertyDescriptor(object);
			addSpacePropertyDescriptor(object);
			addStylePropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addValignPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Align feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addAlignPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_XhtmlTheadType_align_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTheadType_align_feature", "_UI_XhtmlTheadType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				XhtmlPackage.eINSTANCE.getXhtmlTheadType_Align(), true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Char feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCharPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_XhtmlTheadType_char_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTheadType_char_feature", "_UI_XhtmlTheadType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				XhtmlPackage.eINSTANCE.getXhtmlTheadType_Char(), true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Charoff feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addCharoffPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_XhtmlTheadType_charoff_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTheadType_charoff_feature", "_UI_XhtmlTheadType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				XhtmlPackage.eINSTANCE.getXhtmlTheadType_Charoff(), true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Class feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_XhtmlTheadType_class_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTheadType_class_feature", "_UI_XhtmlTheadType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				XhtmlPackage.eINSTANCE.getXhtmlTheadType_Class(), true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Id feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_XhtmlTheadType_id_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTheadType_id_feature", "_UI_XhtmlTheadType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				XhtmlPackage.eINSTANCE.getXhtmlTheadType_Id(), true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Lang feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLangPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_XhtmlTheadType_lang_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTheadType_lang_feature", "_UI_XhtmlTheadType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				XhtmlPackage.eINSTANCE.getXhtmlTheadType_Lang(), true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Space feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addSpacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_XhtmlTheadType_space_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTheadType_space_feature", "_UI_XhtmlTheadType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				XhtmlPackage.eINSTANCE.getXhtmlTheadType_Space(), true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Style feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_XhtmlTheadType_style_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTheadType_style_feature", "_UI_XhtmlTheadType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				XhtmlPackage.eINSTANCE.getXhtmlTheadType_Style(), true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Title feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_XhtmlTheadType_title_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTheadType_title_feature", "_UI_XhtmlTheadType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				XhtmlPackage.eINSTANCE.getXhtmlTheadType_Title(), true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Valign feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addValignPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_XhtmlTheadType_valign_feature"), //$NON-NLS-1$
				getString("_UI_PropertyDescriptor_description", "_UI_XhtmlTheadType_valign_feature", "_UI_XhtmlTheadType_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
				XhtmlPackage.eINSTANCE.getXhtmlTheadType_Valign(), true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(XhtmlPackage.eINSTANCE.getXhtmlTheadType_Tr());
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
	 * This returns XhtmlTheadType.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XhtmlTheadType")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((XhtmlTheadType) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_XhtmlTheadType_type") : //$NON-NLS-1$
				getString("_UI_XhtmlTheadType_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
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

		switch (notification.getFeatureID(XhtmlTheadType.class)) {
		case XhtmlPackage.XHTML_THEAD_TYPE__ALIGN:
		case XhtmlPackage.XHTML_THEAD_TYPE__CHAR:
		case XhtmlPackage.XHTML_THEAD_TYPE__CHAROFF:
		case XhtmlPackage.XHTML_THEAD_TYPE__CLASS:
		case XhtmlPackage.XHTML_THEAD_TYPE__ID:
		case XhtmlPackage.XHTML_THEAD_TYPE__LANG:
		case XhtmlPackage.XHTML_THEAD_TYPE__SPACE:
		case XhtmlPackage.XHTML_THEAD_TYPE__STYLE:
		case XhtmlPackage.XHTML_THEAD_TYPE__TITLE:
		case XhtmlPackage.XHTML_THEAD_TYPE__VALIGN:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case XhtmlPackage.XHTML_THEAD_TYPE__TR:
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

		newChildDescriptors.add(createChildParameter(XhtmlPackage.eINSTANCE.getXhtmlTheadType_Tr(), XhtmlFactory.eINSTANCE.createXhtmlTrType()));
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
