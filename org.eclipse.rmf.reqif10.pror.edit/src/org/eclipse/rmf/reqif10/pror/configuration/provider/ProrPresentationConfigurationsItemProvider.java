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

package org.eclipse.rmf.reqif10.pror.configuration.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfigurations;
import org.eclipse.rmf.reqif10.pror.provider.Reqif10EditPlugin;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;


/**
 * This is the item provider adapter for a {@link org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfigurations} object.
 * <!-- begin-user-doc -->
 * <p>
 * This adapter is stateful, as it keeps track of an associated
 * {@link EditingDomain}. This is necessary, as presentations may need to react
 * to model changes by modifying the model. <!-- end-user-doc -->
 * @generated
 */
public class ProrPresentationConfigurationsItemProvider
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
	public ProrPresentationConfigurationsItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ConfigurationPackage.Literals.PROR_PRESENTATION_CONFIGURATIONS__PRESENTATION_CONFIGURATIONS);
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

	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Missing.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ProrPresentationConfigurations_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> Handles
	 * calls to PresentationServiceManager <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ProrPresentationConfigurations.class)) {
		case ConfigurationPackage.PROR_PRESENTATION_CONFIGURATIONS__PRESENTATION_CONFIGURATIONS:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
			handlePresentationRegistration(notification);
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

	private EditingDomain editingDomain;

	/**
	 * Allows setting the editing domain, as it is required for
	 * {@link ProrPresentationConfiguration} to modify the model. This method
	 * must be called only once.
	 * <p>
	 * This {@link ItemProvider} is stateful, therefore it is possible to have
	 * multiple models open with multiple {@link EditingDomain}s.
	 */
	public void setEditingDomain(EditingDomain editingDomain) {
		if (editingDomain == null) {
			throw new NullPointerException();
		} else if (this.editingDomain != null) {
			throw new IllegalStateException("EditingDomain is already set: "
					+ this.editingDomain);
		}
		this.editingDomain = editingDomain;
	}

	private void handlePresentationRegistration(Notification notification) {
		if (editingDomain == null) {
			throw new NullPointerException(
					"Presentation registration, but editingDomain not yet set!");
		}
		if (notification.getEventType() == Notification.ADD) {
			ProrPresentationConfiguration config = (ProrPresentationConfiguration) notification
					.getNewValue();
			System.out.println("Registering: " + config);
			ProrUtil.getConfigItemProvider(config, getRootAdapterFactory())
					.registerPresentationConfiguration(config, editingDomain);
		} else if (notification.getEventType() == Notification.REMOVE) {
			ProrPresentationConfiguration config = (ProrPresentationConfiguration) notification
					.getOldValue();
			System.out.println("Unregistering: " + config);
			ProrUtil.getConfigItemProvider(config, getRootAdapterFactory())
					.unregisterPresentationConfiguration(config);
		}
	}

}
