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

package org.eclipse.rmf.reqif10.pror.presentation.headline.provider;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.CellEditor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.provider.ProrPresentationConfigurationItemProvider;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.IProrCellRenderer;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.PresentationEditorInterface;
import org.eclipse.rmf.reqif10.pror.presentation.headline.HeadlineConfiguration;
import org.eclipse.rmf.reqif10.pror.presentation.headline.HeadlinePackage;
import org.eclipse.rmf.reqif10.pror.presentation.headline.ui.HeadlineCellRenderer;
import org.eclipse.rmf.reqif10.util.ReqIF10Switch;

/**
 * This is the item provider adapter for a {@link org.eclipse.rmf.reqif10.pror.presentation.headline.HeadlineConfiguration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class HeadlineConfigurationItemProvider
	extends ProrPresentationConfigurationItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		PresentationEditorInterface {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeadlineConfigurationItemProvider(AdapterFactory adapterFactory) {
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

			addSizePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_HeadlineConfiguration_size_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_HeadlineConfiguration_size_feature", "_UI_HeadlineConfiguration_type"),
				 HeadlinePackage.Literals.HEADLINE_CONFIGURATION__SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns HeadlineConfiguration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return super.getImage(object);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		HeadlineConfiguration headlineConfiguration = (HeadlineConfiguration)object;
		String[] subst = new String[2];
		subst[0] = headlineConfiguration.getDatatype() == null ? "(PLEASE SET TYPE)"
				: headlineConfiguration.getDatatype().getLongName();
		subst[1] = headlineConfiguration.getSize() + "";
		return getString("_UI_HeadlineConfiguration_type", subst);
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

		switch (notification.getFeatureID(HeadlineConfiguration.class)) {
			case HeadlinePackage.HEADLINE_CONFIGURATION__SIZE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
		return HeadlineEditPlugin.INSTANCE;
	}

	public void registerPresentationConfiguration(ProrPresentationConfiguration config,
			EditingDomain editingDomain) {
		// No action required.
	}

	public void unregisterPresentationConfiguration(ProrPresentationConfiguration config) {
		// No action required.
	}

	public Command handleDragAndDrop(Collection<?> source, Object target,
			EditingDomain editingDomain, int operation) {
		// No dnd support
		return null;
	}

	public String getLabel(AttributeValue av) {
		// no custom label
		return null;
	}

	/**
	 * Allow editing
	 */
	public boolean canEdit() {
		return true;
	}

	private HeadlineCellRenderer headlineCellRenderer;

	/**
	 * Lazily creates the renderer and tracks them on a per-configuration basis.
	 */
	public IProrCellRenderer getCellRenderer(final AttributeValue av) {
		if (headlineCellRenderer == null) {
			headlineCellRenderer = createRenderer();
		}
		return headlineCellRenderer;
	}

	private HeadlineCellRenderer createRenderer() {
		// Only works if this itemProvider is stateful (via model generator)
		final HeadlineConfiguration config = (HeadlineConfiguration) getTarget();
		DatatypeDefinition dd = config.getDatatype();


		headlineCellRenderer = new HeadlineCellRenderer(dd.getIdentifier());
		headlineCellRenderer.setFontSize(config.getSize());

		// Register for notifications
		config.eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				// React to size changes
				switch (msg.getFeatureID(HeadlineConfiguration.class)) {
				case HeadlinePackage.HEADLINE_CONFIGURATION__SIZE:
					headlineCellRenderer.setFontSize(msg.getNewIntValue());
					refreshUi(config.getDatatype());
					break;
				case HeadlinePackage.HEADLINE_CONFIGURATION__DATATYPE:
					if (msg.getNewValue() != null)
						headlineCellRenderer
								.setDatatypeId(((DatatypeDefinition) msg
										.getNewValue()).getIdentifier());
					refreshUi(config.getDatatype());
				default:
					break;
				}
			}
		});

		return headlineCellRenderer;
	}

	public CellEditor getCellEditor(AgileGrid agileGrid,
			EditingDomain editingDomain, AttributeValue av,
			SpecElementWithAttributes parent,
			Object affectedObject) {
		// No custom cell editor
		return null;
	}

	/**
	 * Called when the font size or {@link DatatypeDefinition} change.
	 */
	@SuppressWarnings("rawtypes")
	private void refreshUi(DatatypeDefinition dd) {
		if (dd == null)
			return;
		ReqIF10Switch visitor = new ReqIF10Switch() {
			@Override
			public Object caseSpecHierarchy(SpecHierarchy object) {
				Notification n = new NotificationImpl(Notification.SET,
						object.getObject(), object.getObject());
				object.eNotify(new ViewerNotification(n));
				return super.caseSpecHierarchy(object);
			}
		};
		EList<Specification> roots = ReqIF10Util.getReqIF(dd).getCoreContent()
				.getSpecifications();
		for (Iterator i = EcoreUtil.getAllProperContents(roots, true); i
				.hasNext();) {
			visitor.doSwitch((EObject) i.next());
		}
	}

	/**
	 * Does not make sense as default.
	 */
	public Class<? extends DatatypeDefinition> suggestAsDefault() {
		return null;
	}

}
