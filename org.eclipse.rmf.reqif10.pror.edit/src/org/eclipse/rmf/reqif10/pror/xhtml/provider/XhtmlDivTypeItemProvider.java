/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.eclipse.rmf.reqif10.pror.xhtml.provider;



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
import org.eclipse.rmf.reqif10.pror.provider.Reqif10EditPlugin;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDivType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlFactory;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPackage;

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
public class XhtmlDivTypeItemProvider
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
	public XhtmlDivTypeItemProvider(AdapterFactory adapterFactory) {
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

			addClassPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addLangPropertyDescriptor(object);
			addSpacePropertyDescriptor(object);
			addStylePropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_XhtmlDivType_class_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlDivType_class_feature", "_UI_XhtmlDivType_type"),
				 XhtmlPackage.eINSTANCE.getXhtmlDivType_Class(),
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
				 getString("_UI_XhtmlDivType_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlDivType_id_feature", "_UI_XhtmlDivType_type"),
				 XhtmlPackage.eINSTANCE.getXhtmlDivType_Id(),
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
				 getString("_UI_XhtmlDivType_lang_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlDivType_lang_feature", "_UI_XhtmlDivType_type"),
				 XhtmlPackage.eINSTANCE.getXhtmlDivType_Lang(),
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
				 getString("_UI_XhtmlDivType_space_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlDivType_space_feature", "_UI_XhtmlDivType_type"),
				 XhtmlPackage.eINSTANCE.getXhtmlDivType_Space(),
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
				 getString("_UI_XhtmlDivType_style_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlDivType_style_feature", "_UI_XhtmlDivType_type"),
				 XhtmlPackage.eINSTANCE.getXhtmlDivType_Style(),
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
				 getString("_UI_XhtmlDivType_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlDivType_title_feature", "_UI_XhtmlDivType_type"),
				 XhtmlPackage.eINSTANCE.getXhtmlDivType_Title(),
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
			childrenFeatures.add(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed());
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
	 * This returns XhtmlDivType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XhtmlDivType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((XhtmlDivType)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_XhtmlDivType_type") :
			getString("_UI_XhtmlDivType_type") + " " + label;
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

		switch (notification.getFeatureID(XhtmlDivType.class)) {
			case XhtmlPackage.XHTML_DIV_TYPE__CLASS:
			case XhtmlPackage.XHTML_DIV_TYPE__ID:
			case XhtmlPackage.XHTML_DIV_TYPE__LANG:
			case XhtmlPackage.XHTML_DIV_TYPE__SPACE:
			case XhtmlPackage.XHTML_DIV_TYPE__STYLE:
			case XhtmlPackage.XHTML_DIV_TYPE__TITLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case XhtmlPackage.XHTML_DIV_TYPE__MIXED:
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
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__COMMENT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__TEXT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION,
					 XMLTypeFactory.eINSTANCE.createProcessingInstruction())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XMLTypePackage.Literals.XML_TYPE_DOCUMENT_ROOT__CDATA,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_H1(),
					 XhtmlFactory.eINSTANCE.createXhtmlH1Type())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_H2(),
					 XhtmlFactory.eINSTANCE.createXhtmlH2Type())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_H3(),
					 XhtmlFactory.eINSTANCE.createXhtmlH3Type())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_H4(),
					 XhtmlFactory.eINSTANCE.createXhtmlH4Type())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_H5(),
					 XhtmlFactory.eINSTANCE.createXhtmlH5Type())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_H6(),
					 XhtmlFactory.eINSTANCE.createXhtmlH6Type())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Ul(),
					 XhtmlFactory.eINSTANCE.createXhtmlUlType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Ol(),
					 XhtmlFactory.eINSTANCE.createXhtmlOlType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Dl(),
					 XhtmlFactory.eINSTANCE.createXhtmlDlType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_P(),
					 XhtmlFactory.eINSTANCE.createXhtmlPType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Div(),
					 XhtmlFactory.eINSTANCE.createXhtmlDivType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Pre(),
					 XhtmlFactory.eINSTANCE.createXhtmlPreType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Blockquote(),
					 XhtmlFactory.eINSTANCE.createXhtmlBlockquoteType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Address(),
					 XhtmlFactory.eINSTANCE.createXhtmlAddressType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Hr(),
					 XhtmlFactory.eINSTANCE.createXhtmlHrType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Table(),
					 XhtmlFactory.eINSTANCE.createXhtmlTableType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Br(),
					 XhtmlFactory.eINSTANCE.createXhtmlBrType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Span(),
					 XhtmlFactory.eINSTANCE.createXhtmlSpanType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Em(),
					 XhtmlFactory.eINSTANCE.createXhtmlEmType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Strong(),
					 XhtmlFactory.eINSTANCE.createXhtmlStrongType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Dfn(),
					 XhtmlFactory.eINSTANCE.createXhtmlDfnType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Code(),
					 XhtmlFactory.eINSTANCE.createXhtmlCodeType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Samp(),
					 XhtmlFactory.eINSTANCE.createXhtmlSampType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Kbd(),
					 XhtmlFactory.eINSTANCE.createXhtmlKbdType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Var(),
					 XhtmlFactory.eINSTANCE.createXhtmlVarType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Cite(),
					 XhtmlFactory.eINSTANCE.createXhtmlCiteType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Abbr(),
					 XhtmlFactory.eINSTANCE.createXhtmlAbbrType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Acronym(),
					 XhtmlFactory.eINSTANCE.createXhtmlAcronymType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Q(),
					 XhtmlFactory.eINSTANCE.createXhtmlQType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Tt(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_I(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_B(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Big(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Small(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Sub(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Sup(),
					 XhtmlFactory.eINSTANCE.createXhtmlInlPresType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_A(),
					 XhtmlFactory.eINSTANCE.createXhtmlAType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Object(),
					 XhtmlFactory.eINSTANCE.createXhtmlObjectType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Ins(),
					 XhtmlFactory.eINSTANCE.createXhtmlEditType())));

		newChildDescriptors.add
			(createChildParameter
				(XhtmlPackage.eINSTANCE.getXhtmlDivType_Mixed(),
				 FeatureMapUtil.createEntry
					(XhtmlPackage.eINSTANCE.getXhtmlDivType_Del(),
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
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlDivType_Tt() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlDivType_I() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlDivType_B() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlDivType_Big() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlDivType_Small() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlDivType_Sub() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlDivType_Sup() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlDivType_Ins() ||
			childFeature == XhtmlPackage.eINSTANCE.getXhtmlDivType_Del();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
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
		return Reqif10EditPlugin.INSTANCE;
	}

}
