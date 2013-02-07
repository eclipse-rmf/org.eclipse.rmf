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
package org.eclipse.rmf.reqif10.pror.editor.presentation.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.CellEditor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean;
import org.eclipse.rmf.reqif10.DatatypeDefinitionDate;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.DatatypeDefinitionInteger;
import org.eclipse.rmf.reqif10.DatatypeDefinitionReal;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.DatatypeDefinitionXHTML;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.SpecElementWithAttributes;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfigurations;
import org.eclipse.rmf.reqif10.pror.configuration.provider.ProrPresentationConfigurationItemProvider;
import org.eclipse.rmf.reqif10.pror.configuration.provider.ProrPresentationConfigurationsItemProvider;
import org.eclipse.rmf.reqif10.pror.edit.presentation.service.PresentationInterface;
import org.eclipse.rmf.reqif10.pror.edit.presentation.service.PresentationManager;
import org.eclipse.rmf.reqif10.pror.editor.preferences.PreferenceConstants;
import org.eclipse.rmf.reqif10.pror.editor.presentation.Reqif10EditorPlugin;
import org.eclipse.rmf.reqif10.pror.util.ConfigurationUtil;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;

/**
 * This class manages installed Presentations (and is therefore independent of
 * open ReqIF Files). It is not meant to be instantiated and consists
 * exclusively of static methods.
 * <p>
 * 
 * 
 */
public class PresentationServiceManager {

	public static final String PRESENTATION_EXTENSION_POINT_NAME = "org.eclipse.rmf.reqif10.pror.editor.presentation";

	private static Map<Class<? extends ProrPresentationConfiguration>, PresentationInterface> presentationServiceRegistry;

	/*
	 * Private default constructor, to ensure that this class is never
	 * instantiated.
	 */
	private PresentationServiceManager() {
		throw new InstantiationError(
				"This class is not designed to be instantiated.");
	}

	// // There is one entry per Plugin
	// private static Set<PresentationData> presentationTypeRegistry;

	/**
	 * Returns the cached {@link PresentationInterface} representing all installed
	 * Presentation Extensions.
	 * 
	 * We use this method to initialize the presentation service map in the item
	 * provider plugin.
	 * 
	 * @return A an unmodifyable map of {@link ProrPresentationConfiguration}
	 *         classes and {@link PresentationInterface}s.
	 */
	public static Map<Class<? extends ProrPresentationConfiguration>, PresentationInterface> getPresentationInterfaceMap() {
		if (presentationServiceRegistry == null) {

			HashMap<Class<? extends ProrPresentationConfiguration>, PresentationInterface> tmpRegistry = new HashMap<Class<? extends ProrPresentationConfiguration>, PresentationInterface>();

			IExtensionRegistry registry = Platform.getExtensionRegistry();
			IExtensionPoint extensionPoint = registry
					.getExtensionPoint(PRESENTATION_EXTENSION_POINT_NAME);
			IExtension[] extensions = extensionPoint.getExtensions();
			for (IExtension extension : extensions) {
				IConfigurationElement[] configElements = extension
						.getConfigurationElements();
				for (IConfigurationElement configElement : configElements) {
					try {
						PresentationInterface service = (PresentationInterface) configElement
								.createExecutableExtension("service");
						tmpRegistry.put(service.getConfigurationInterface(),
								service);
						PresentationManager.addService(
								service.getConfigurationInterface(), service);
					} catch (CoreException e) {
						MessageDialog
								.openError(
										null,
										"Plugin Configuration Error",
										"When initializing the installed plugins, something went wrong.  "
												+ "You can continue working, but Presentations may not be activated:"
												+ e.getMessage());
						e.printStackTrace();
					}
				}
			}
			presentationServiceRegistry = Collections
					.unmodifiableMap(tmpRegistry);
		}
		return presentationServiceRegistry;
	}

	/**
	 * Returns the {@link PresentationInterface} for the given
	 * {@link ProrPresentationConfiguration} instance, or null if none found.
	 */
	public static PresentationInterface getPresentationService(
			ProrPresentationConfiguration configuration) {
		for (Class<? extends ProrPresentationConfiguration> clazz : getPresentationInterfaceMap()
				.keySet()) {
			if (clazz.isInstance(configuration)) {
				return getPresentationInterfaceMap().get(clazz);
			}
		}
		return null;
	}

	/**
	 * Upon opening a ReqIF File, this method notifies each
	 * {@link ProrPresentationConfigurationItemProvider#registerPresentationConfiguration(ReqIF, EditingDomain)}
	 */
	public static void notifiyOpenReqif(ReqIF reqif,
			AdapterFactory adapterFactory, EditingDomain editingDomain) {

		ProrPresentationConfigurations configs = ConfigurationUtil
				.getPresentationConfigurations(reqif);
		if (configs == null)
			return;

		((ProrPresentationConfigurationsItemProvider) ProrUtil.getItemProvider(
				adapterFactory, configs)).setEditingDomain(editingDomain);

		for (ProrPresentationConfiguration config : configs
				.getPresentationConfigurations()) {
			System.out.println("Registering: " + config);
			ProrUtil.getConfigItemProvider(config, adapterFactory)
					.registerPresentationConfiguration(config, editingDomain);
		}
	}

	/**
	 * Upon closing a ReqIF File, this method notifies each
	 * {@link ProrPresentationConfigurationItemProvider#unregisterReqIF(ReqIF, EditingDomain)}
	 */
	public static void notifiyCloseReqif(ReqIF reqif,
			AdapterFactory adapterFactory, EditingDomain editingDomain) {
		ProrPresentationConfigurations configs = ConfigurationUtil
				.getPresentationConfigurations(reqif);
		if (configs == null)
			return;

		for (ProrPresentationConfiguration config : configs
				.getPresentationConfigurations()) {
			System.out.println("Unregistering: " + config);
			ProrUtil.getConfigItemProvider(config, adapterFactory)
					.unregisterPresentationConfiguration(config);
		}
	}

	public static PresentationInterface getPresentationService(
			AttributeValue value, EditingDomain editingDomain) {
		PresentationInterface service = null;
		ProrPresentationConfiguration config = ConfigurationUtil
				.getPresentationConfig(value);
		if (config != null) {
			service = PresentationServiceManager.getPresentationService(config);
		}
		return service;

	}

	/**
	 * This map caches the Default-Renderers. If a Datattype does not have a
	 * default, there is still an entry in the map to null. This way we know
	 * whether we already looked up a default. This map may be flushed, which is
	 * done when the user changes preference settings.
	 */
	private final static Map<DatatypeDefinition, PresentationEditorInterface> defaultRenderers = new HashMap<DatatypeDefinition, PresentationEditorInterface>();

	/**
	 * Clears the cache of default renderers. The cache will be rebuild on
	 * demand.
	 */
	public static void clearDefaultRenderers() {
		defaultRenderers.clear();
	}

	/**
	 * Returns a default renderer for the AttributeValue's Datatype, if there is
	 * one, otherwise null.
	 * 
	 * @param adapterFactory
	 */
	public static IProrCellRenderer getDefaultCellRenderer(
			AttributeValue attrValue, AdapterFactory adapterFactory) {
		DatatypeDefinition dd = ReqIF10Util.getDatatypeDefinition(attrValue);
		if (dd == null)
			return null;

		// We do this to prevent repeated lookups if a dd has no default
		// renderer.
		ensureDefaultEntry(dd, adapterFactory);
		PresentationEditorInterface presentationEditor = defaultRenderers
				.get(dd);
		return presentationEditor == null ? null : presentationEditor
				.getCellRenderer(attrValue);
	}

	public static CellEditor getDefaultCellEditor(AgileGrid agileGrid,
			EditingDomain editingDomain, AdapterFactory adapterFactory,
			AttributeValue attrValue, SpecElementWithAttributes specElement,
			Object affectedObject) {
		DatatypeDefinition dd = ReqIF10Util.getDatatypeDefinition(attrValue);
		if (dd == null)
			return null;

		// We do this to prevent repeated lookups if a dd has no default
		// renderer.
		ensureDefaultEntry(dd, adapterFactory);
		PresentationEditorInterface presentationEditor = defaultRenderers
				.get(dd);
		return presentationEditor == null ? null : presentationEditor
				.getCellEditor(agileGrid, editingDomain, attrValue,
						specElement, affectedObject);
	}

	/**
	 * Ensures that there is an entry for the given {@link DatatypeDefinition}
	 * in the cache of default Handlers.
	 */
	private static void ensureDefaultEntry(DatatypeDefinition dd,
			AdapterFactory adapterFactory) {
		if (defaultRenderers.containsKey(dd)) {
			return;
		}

		String className = getPresentationClassName(dd);
			Map<Class<? extends ProrPresentationConfiguration>, PresentationInterface> presentationMap = PresentationServiceManager
					.getPresentationInterfaceMap();
			for (@SuppressWarnings("rawtypes")
			Class key : presentationMap.keySet()) {
				if (className.equals(key.getCanonicalName())) {
					PresentationInterface p = presentationMap.get(key);
					ProrPresentationConfiguration config = p
							.getConfigurationInstance();
					config.setDatatype(dd);
					ItemProviderAdapter provider = ProrUtil.getItemProvider(
							adapterFactory, config);
					if (provider instanceof PresentationEditorInterface) {
						defaultRenderers.put(dd,
								(PresentationEditorInterface) provider);
					} else {
						defaultRenderers.put(dd, null);
					}
				}
		}
	}

	private static String getPresentationClassName(
			org.eclipse.rmf.reqif10.DatatypeDefinition dd) {
		IPreferenceStore store = Reqif10EditorPlugin.getPlugin()
				.getPreferenceStore();
		if (dd instanceof DatatypeDefinitionString)
			return store
					.getString(PreferenceConstants.P_DEFAULT_PRESENTATION_STRING);
		else if (dd instanceof DatatypeDefinitionXHTML)
			return store
					.getString(PreferenceConstants.P_DEFAULT_PRESENTATION_XHTML);
		else if (dd instanceof DatatypeDefinitionBoolean)
			return store
					.getString(PreferenceConstants.P_DEFAULT_PRESENTATION_BOOLEAN);
		else if (dd instanceof DatatypeDefinitionDate)
			return store
					.getString(PreferenceConstants.P_DEFAULT_PRESENTATION_DATE);
		else if (dd instanceof DatatypeDefinitionEnumeration)
			return store
					.getString(PreferenceConstants.P_DEFAULT_PRESENTATION_ENUMERATION);
		else if (dd instanceof DatatypeDefinitionInteger)
			return store
					.getString(PreferenceConstants.P_DEFAULT_PRESENTATION_INTEGER);
		else if (dd instanceof DatatypeDefinitionReal)
			return store
					.getString(PreferenceConstants.P_DEFAULT_PRESENTATION_REAL);
		else
			throw new IllegalArgumentException("Not yet covered: " + dd);
	}
}
