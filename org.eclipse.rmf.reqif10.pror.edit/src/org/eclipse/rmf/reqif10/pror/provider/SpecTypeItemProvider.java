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

package org.eclipse.rmf.reqif10.pror.provider;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.eclipse.rmf.reqif10.util.ReqIF10Switch;

/**
 * This is the item provider adapter for a {@link org.eclipse.rmf.reqif10.SpecType} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class SpecTypeItemProvider extends IdentifiableItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public SpecTypeItemProvider(AdapterFactory adapterFactory) {
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
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ReqIF10Package.Literals.SPEC_TYPE__SPEC_ATTRIBUTES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SpecType.png"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String typeName = ProrUtil.substractPrefixPostfix(object, "", "TypeImpl");
		String label = ((SpecType)object).getLongName();
		label = label == null || label.length() == 0 ?
			getString("_UI_Unnamed_Element") :
			label;
		return label + " (" + typeName + ")";
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * On any change do we also notifiy all {@link SpecElementWithAttributes} that use this type.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SpecType.class)) {
		case ReqIF10Package.SPEC_TYPE__SPEC_ATTRIBUTES:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
			// no return here on purpose!
		case ReqIF10Package.SPEC_TYPE__LONG_NAME:
			notifyAllSpecElementWithAttributesTypeChange(
					(SpecType) notification.getNotifier(), adapterFactory);
			// no return here on purpose!
		}
		super.notifyChanged(notification);
	}

	/**
	 * Notifies all SpecElements when any aspect of the associated SpecType changes.
	 */
	private void notifyAllSpecElementWithAttributesTypeChange(
			final SpecType specType, AdapterFactory adapterFactory) {
		ReqIF reqif = ReqIF10Util.getReqIF(specType);
		if (reqif != null) {
			ReqIF10Switch<SpecElementWithAttributes> visitor = new ReqIF10Switch<SpecElementWithAttributes>() {

				@Override
				public SpecElementWithAttributes caseSpecObject(
						SpecObject object) {
					object.eNotify(new ENotificationImpl(
							(InternalEObject) object, Notification.SET,
							ReqIF10Package.Literals.SPEC_OBJECT__TYPE,
							specType, specType));
					return object;
				}

				@Override
				public SpecElementWithAttributes caseSpecification(
						Specification object) {
					object.eNotify(new ENotificationImpl(
							(InternalEObject) object, Notification.SET,
							ReqIF10Package.Literals.SPECIFICATION__TYPE,
							specType, specType));
					return object;
				}

				@Override
				public SpecElementWithAttributes caseSpecRelation(
						SpecRelation object) {
					object.eNotify(new ENotificationImpl(
							(InternalEObject) object, Notification.SET,
							ReqIF10Package.Literals.SPEC_RELATION__TYPE,
							specType, specType));
					return object;
				}
			};

			ProrUtil.visitAllSpecElementsWithAttributes(reqif, visitor);
		}
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

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.SPEC_TYPE__SPEC_ATTRIBUTES,
				 ReqIF10Factory.eINSTANCE.createAttributeDefinitionXHTML()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.SPEC_TYPE__SPEC_ATTRIBUTES,
				 ReqIF10Factory.eINSTANCE.createAttributeDefinitionBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.SPEC_TYPE__SPEC_ATTRIBUTES,
				 ReqIF10Factory.eINSTANCE.createAttributeDefinitionDate()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.SPEC_TYPE__SPEC_ATTRIBUTES,
				 ReqIF10Factory.eINSTANCE.createAttributeDefinitionEnumeration()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.SPEC_TYPE__SPEC_ATTRIBUTES,
				 ReqIF10Factory.eINSTANCE.createAttributeDefinitionInteger()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.SPEC_TYPE__SPEC_ATTRIBUTES,
				 ReqIF10Factory.eINSTANCE.createAttributeDefinitionReal()));

		newChildDescriptors.add
			(createChildParameter
				(ReqIF10Package.Literals.SPEC_TYPE__SPEC_ATTRIBUTES,
				 ReqIF10Factory.eINSTANCE.createAttributeDefinitionString()));
	}

	/**
	 * If we add an AttributeDefinition, we also have to update all
	 * {@link SpecElementWithAttributes} that use it. We do this by re-setting
	 * the type on those specElements.
	 */
	@Override
	protected Command createAddCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection, int index) {
		if (feature == ReqIF10Package.Literals.SPEC_TYPE__SPEC_ATTRIBUTES) {
			SpecType specType = (SpecType) owner;
			Set<Object> attrs = new HashSet<Object>(
					specType.getSpecAttributes());
			attrs.addAll(collection);
			CompoundCommand cmd = adjustValuesForSpecAttributesVisitor(domain,
					specType, attrs);
			cmd.append(super.createAddCommand(domain, owner, feature,
					collection, index));
			return cmd;
		}
		return super
				.createAddCommand(domain, owner, feature, collection, index);
	}

	/**
	 * If we add an AttributeDefinition, we also have to update all
	 * {@link SpecElementWithAttributes} that use it. We do this by re-setting
	 * the type on those specElements.
	 */
	@Override
	protected Command createRemoveCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection) {
		if (feature == ReqIF10Package.Literals.SPEC_TYPE__SPEC_ATTRIBUTES) {
			SpecType specType = (SpecType) owner;
			Set<Object> attrs = new HashSet<Object>(
					specType.getSpecAttributes());
			attrs.removeAll(collection);
			CompoundCommand cmd = adjustValuesForSpecAttributesVisitor(domain,
					specType, attrs);
			cmd.append(super.createRemoveCommand(domain, owner, feature,
					collection));
			return cmd;
		}
		return super.createRemoveCommand(domain, owner, feature, collection);
	}
	
	/**
	 * Builds a command that adjusts values to SpecElements that have the given
	 * type.
	 */
	private CompoundCommand adjustValuesForSpecAttributesVisitor(
			final EditingDomain domain, final SpecType specType,
			final Collection<?> newAttributeDefinitions) {
		final CompoundCommand cmd = new CompoundCommand();
		ReqIF reqif = ReqIF10Util.getReqIF(specType);
		if (reqif == null) {
			return cmd;
		}

		ReqIF10Switch<?> visitor = new ReqIF10Switch<SpecElementWithAttributes>() {
			@SuppressWarnings("unchecked")
			@Override
			public SpecElementWithAttributes caseSpecElementWithAttributes(
					SpecElementWithAttributes object) {
				SpecType type = ReqIF10Util.getSpecType(object);
				if (specType.equals(type)) {
					CompoundCommand adjustValuesCommand = ProrUtil
							.createValueAdjustCommand(
									domain,
									object,
									(Collection<AttributeDefinition>) newAttributeDefinitions);
					if (!adjustValuesCommand.isEmpty()) {
						cmd.append(adjustValuesCommand);
					}
				}
				return object;
			}
		};
		ProrUtil.visitAllSpecElementsWithAttributes(reqif, visitor);
		return cmd;
	}

	/**
	 * Use the virtual intermediate provider as the parent, rather than
	 * {@link ReqIFContentItemProvider}.
	 */
	@Override
	public Object getParent(Object object) {
		ReqIFContent content = ((ReqIFContent) super.getParent(object));
		if (content == null)
			return null;
		ReqIFContentItemProvider reqifProvider = (ReqIFContentItemProvider) ProrUtil
				.getItemProvider(adapterFactory, content);
		return reqifProvider != null ? reqifProvider
				.getVirtualSpecTypes(content) : null;
	}

}
