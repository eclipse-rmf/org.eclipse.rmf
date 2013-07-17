/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 *     François Rey - default value editable and posing as definition attribute
 ******************************************************************************/

package org.eclipse.rmf.reqif10.pror.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptorDecorator;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionSimple;
import org.eclipse.rmf.reqif10.AttributeValueSimple;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

/**
 * This is the item provider adapter for a {@link org.eclipse.rmf.reqif10.AttributeDefinitionSimple} object.
 * <!-- begin-user-doc -->
 * Stateful Item Provider:
 * In order to simplify the UI for editing a {@link AttributeDefinitionSimple},
 * the {@link AttributeValueSimple} containing the default value is kept hidden
 * and the default value is shown as a direct property of
 * {@link AttributeDefinitionSimple}. This is initially set up in
 * {@link #addCustomDefaultValuePropertyDescriptor(Object)} where the
 * {@link AttributeValueSimple} object containing the default value
 * is cached.
 * The other part of implementing this UI simplification is done in the
 * {@link #createSetCommand} function which also handles the need to update
 * the relation between the value object and the definition object.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeDefinitionSimpleItemProvider
	extends AttributeDefinitionItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {

	protected AttributeValueSimple defaultAttributeValueSimple = null;

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionSimpleItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IItemPropertyDescriptor> getPropertyDescriptorsGen(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * Adds the a property descriptor for the Default Value feature.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		itemPropertyDescriptors = getPropertyDescriptorsGen(object);
		addCustomDefaultValuePropertyDescriptor(object);
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

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
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

	/**
	 * Adds a property descriptor for the Default Value feature.
	 * The default value feature is defined in derived classes, so such
	 * logic would normally belong there. However this method uses reflection
	 * to avoid copying the same custom code in derived classes.
	 */
	protected void addCustomDefaultValuePropertyDescriptor(Object object) {
		// Retrieve current defaultAttributeValueSimple, creating it if null
		AttributeDefinitionSimple attributeDefinitionSimple =
				(AttributeDefinitionSimple)object;
		EStructuralFeature defaultValueFeature =
				ReqIF10Util.getDefaultValueFeature(attributeDefinitionSimple);
		defaultAttributeValueSimple =
			(AttributeValueSimple) attributeDefinitionSimple.eGet(defaultValueFeature);
		if (defaultAttributeValueSimple==null) {
			defaultAttributeValueSimple = (AttributeValueSimple)
					ReqIF10Util.createAttributeValue(attributeDefinitionSimple);
		}
		// Retrieve the property descriptor for the default value
		AttributeValueSimpleItemProvider attributeValueSimpleItemProvider = (AttributeValueSimpleItemProvider)
				adapterFactory.adapt(defaultAttributeValueSimple, AttributeValueSimpleItemProvider.class);
		EStructuralFeature theValueFeature =
				ReqIF10Util.getTheValueFeature(defaultAttributeValueSimple);
		IItemPropertyDescriptor theValueDescriptor =
				attributeValueSimpleItemProvider.getPropertyDescriptor(
						defaultAttributeValueSimple,
						theValueFeature);
		// Decorate the existing descriptor to make it look like a definition attribute
		final String attributeDefinitionClassName =
				attributeDefinitionSimple.eClass().getName();
		IItemPropertyDescriptor theValueDescriptorDecorator = new ItemPropertyDescriptorDecorator(
				defaultAttributeValueSimple, theValueDescriptor) {
			public String getDescription(Object thisObject) {
				return getString("_UI_PropertyDescriptor_description",
							"_UI_" + attributeDefinitionClassName + "_defaultValue_feature",
							"_UI_" + attributeDefinitionClassName + "_type");
			}
			public String getDisplayName(Object thisObject) {
				return getString("_UI_" + attributeDefinitionClassName + "_defaultValue_feature");
			}
		};
		// Add descriptor
		itemPropertyDescriptors.add(theValueDescriptorDecorator);
	}

	/**
	 * Creates a {@link org.eclipse.emf.edit.command.SetCommand} that properly
	 * handles the default value that is shown as a direct property of
	 * {@link AttributeDefinitionSimple}. In particular, if the default value
	 * is being set, the {@link AttributeValueSimple} object must be the target
	 * object of the command instead of the {@link AttributeDefinitionSimple},
	 * and the linking between both may need to be set or unset in the same
	 * compound command.
	 */
	@Override
	protected Command createSetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value, int index) {
		CompoundCommand compoundCommand = new CompoundCommand();
		if (AttributeValueSimple.class.isAssignableFrom(feature.getContainerClass())) {
			AttributeDefinition attributeDefinition = (AttributeDefinition)owner;
			// We're setting the default value
			EStructuralFeature defaultValueFeature =
					ReqIF10Util.getDefaultValueFeature(attributeDefinition);
			if (value==null || value.toString().length()==0)
				value = SetCommand.UNSET_VALUE;
			// Create the command for setting the value on the value object
			compoundCommand.append(
				super.createSetCommand(domain, defaultAttributeValueSimple,
						feature, value, CommandParameter.NO_INDEX));
			// Check linking between default value and definition object
			// Earlier version of ProR did not set the link back to the definition
			// Set it now because the user no longer has a way to do it in the GUI
			EStructuralFeature definitionFeature =
					ReqIF10Util.getDefinitionFeature(defaultAttributeValueSimple);
			if (!attributeDefinition.equals(defaultAttributeValueSimple.eGet(definitionFeature))) {
				Command setDefinitionCommand = super.createSetCommand(domain,
						defaultAttributeValueSimple, definitionFeature,
						attributeDefinition, CommandParameter.NO_INDEX);
				compoundCommand.append(setDefinitionCommand);
			}
			// Check linking between definition object and default value
			if (EcoreUtil.isAncestor(owner, defaultAttributeValueSimple)) {
				// The value object is already a child of the attribute definition
				if (SetCommand.UNSET_VALUE.equals(value)) {
					// Detach value object using another SetCommand
					Command setChildCommand = super.createSetCommand(domain, owner,
							defaultValueFeature, SetCommand.UNSET_VALUE,
							CommandParameter.NO_INDEX);
					compoundCommand.append(setChildCommand);
				}
			} else {
				// The value object is not a child of the attribute definition
				if (!SetCommand.UNSET_VALUE.equals(value)) {
					// Attach value object using another SetCommand
					Command setChildCommand = super.createSetCommand(domain, owner,
							defaultValueFeature, defaultAttributeValueSimple,
							CommandParameter.NO_INDEX);
					compoundCommand.append(setChildCommand);
				}
			}
		} else // We're setting another feature
			compoundCommand.append(super.createSetCommand(domain, owner, feature, value, index));
		Command result = compoundCommand.unwrap();
		return result;
	}
}
