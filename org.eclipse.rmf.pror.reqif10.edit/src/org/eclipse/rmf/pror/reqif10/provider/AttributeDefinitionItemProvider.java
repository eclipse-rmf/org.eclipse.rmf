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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.rmf.pror.reqif10.util.ProrUtil;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.Reqif10Package;

/**
 * This is the item provider adapter for a
 * {@link org.eclipse.rmf.reqif10.AttributeDefinition} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated NOT
 */
public class AttributeDefinitionItemProvider extends
		AccessControlledElementItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AttributeDefinitionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
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
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AttributeDefinition.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String typeName = ProrUtil.substractPrefixPostfix(object, "AttributeDefinition", "Impl");
		String label = ((AttributeDefinition)object).getLongName();
		label = label == null || label.length() == 0 ?
			getString("_UI_Unnamed_Element") :
			label;
		return label + " (" + typeName + ")";
	}
	
	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> A change
	 * in the AttributeDefinition must trigger a notification in the SpecType's
	 * ItemProvider. <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AttributeDefinition.class)) {
		case Reqif10Package.ATTRIBUTE_DEFINITION__ALTERNATIVE_ID:
		case Reqif10Package.ATTRIBUTE_DEFINITION__DESC:
		case Reqif10Package.ATTRIBUTE_DEFINITION__IDENTIFIER:
		case Reqif10Package.ATTRIBUTE_DEFINITION__IS_EDITABLE:
		case Reqif10Package.ATTRIBUTE_DEFINITION__LAST_CHANGE:
		case Reqif10Package.ATTRIBUTE_DEFINITION__LONG_NAME:
		case Reqif10Package.ATTRIBUTE_DEFINITION__SPEC_TYPE:

			// Find the specType
			InternalEObject specType = (InternalEObject) ((EObject) notification
					.getNotifier()).eContainer();
			if (specType != null) {
				specType.eNotify(new ENotificationImpl(
						specType, ENotificationImpl.SET,
						Reqif10Package.Literals.SPEC_TYPE__SPEC_ATTRIBUTES,
						notification.getNotifier(), notification.getNotifier()));
			}

			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
