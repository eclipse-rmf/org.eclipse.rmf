/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */

package org.eclipse.rmf.reqif10.pror.provider;



import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.XhtmlContent;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationFactory;

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
public class XhtmlContentItemProvider
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
	public XhtmlContentItemProvider(AdapterFactory adapterFactory) {
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

			addXhtmlSourcePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Xhtml Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXhtmlSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XhtmlContent_xhtmlSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XhtmlContent_xhtmlSource_feature", "_UI_XhtmlContent_type"),
				 ReqIF10Package.Literals.XHTML_CONTENT__XHTML_SOURCE,
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
			childrenFeatures.add(ReqIF10Package.Literals.XHTML_CONTENT__XHTML);
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

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((XhtmlContent)object).getXhtmlSource();
		return label == null || label.length() == 0 ?
			getString("_UI_XhtmlContent_type") :
			getString("_UI_XhtmlContent_type") + " " + label;
	}

	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/XhtmlContent.png"));
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc -->Ensure
	 * that the parent is notified on change to update the UI<!-- end-user-doc
	 * -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		// Find the specElement
		InternalEObject parent = (InternalEObject) ((EObject) notification
				.getNotifier()).eContainer();
		if (parent != null) {
			parent.eNotify(new ENotificationImpl(
					parent,
					ENotificationImpl.SET,
					ReqIF10Package.Literals.SPEC_ELEMENT_WITH_ATTRIBUTES__VALUES,
					notification.getNotifier(), notification.getNotifier()));
		}

		switch (notification.getFeatureID(XhtmlContent.class)) {
			case ReqIF10Package.XHTML_CONTENT__XHTML:
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
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createAttributeValueXHTML()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createAttributeDefinitionXHTML()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createReqIFContent()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createReqIF()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createReqIFHeader()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createReqIFToolExtension()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createSpecObject()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createSpecObjectType()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createSpecification()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createSpecificationType()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createSpecHierarchy()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createSpecRelation()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createSpecRelationType()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createRelationGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createRelationGroupType()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createDatatypeDefinitionXHTML()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createAlternativeID()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createAttributeDefinitionBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createDatatypeDefinitionBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createAttributeValueBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createAttributeDefinitionDate()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createDatatypeDefinitionDate()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createAttributeValueDate()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createAttributeDefinitionEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createDatatypeDefinitionEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createEnumValue()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createEmbeddedValue()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createAttributeValueEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createAttributeDefinitionInteger()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createDatatypeDefinitionInteger()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createAttributeValueInteger()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createAttributeDefinitionReal()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createDatatypeDefinitionReal()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createAttributeValueReal()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createAttributeDefinitionString()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createDatatypeDefinitionString()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createAttributeValueString()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ReqIF10Factory.eINSTANCE.createXhtmlContent()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ConfigurationFactory.eINSTANCE.createProrToolExtension()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ConfigurationFactory.eINSTANCE.createProrSpecViewConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ConfigurationFactory.eINSTANCE.createColumn()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ConfigurationFactory.eINSTANCE.createProrPresentationConfigurations()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ConfigurationFactory.eINSTANCE.createProrGeneralConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 ConfigurationFactory.eINSTANCE.createLabelConfiguration()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.XHTML_CONTENT__XHTML,
				 XMLTypeFactory.eINSTANCE.createAnyType()));
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
