/*******************************************************************************
 * Copyright (c) 2013 Formal Mind GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor.presentation;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.edit.presentation.service.PresentationInterface;
import org.eclipse.rmf.reqif10.pror.editor.preferences.PreferenceConstants;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.PresentationEditorInterface;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.PresentationServiceManager;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.eclipse.ui.IStartup;

/**
 * This class is triggered on startup and updates the default presentations,
 * according to {@link PresentationEditorInterface#suggestAsDefault()}.
 * 
 * @author jastram
 * 
 */
public class CheckDefaultPresentations implements IStartup {

	public void earlyStartup() {
		AdapterFactory adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		for (PresentationInterface presentation : PresentationServiceManager
				.getPresentationInterfaceMap().values()) {
			ProrPresentationConfiguration config = presentation
					.getConfigurationInstance();
			ItemProviderAdapter ip = ProrUtil.getItemProvider(adapterFactory,
					config);
			if (ip instanceof PresentationEditorInterface) {
				PresentationEditorInterface editorInterface = (PresentationEditorInterface) ip;
				Class<? extends DatatypeDefinition> dd = editorInterface
						.suggestAsDefault();
				if (dd != null) {
					checkDefault(dd, config.getClass());
				}
			}
		}

	}

	/**
	 * We have a candidate for the given {@link DatatypeDefinition} (which is
	 * not null).
	 * 
	 * If no default is set, set it. If a default is set, ask whether it should
	 * be replaced.
	 */
	private void checkDefault(final Class<? extends DatatypeDefinition> dd,
			final Class<? extends ProrPresentationConfiguration> config) {
		IPreferenceStore store = Reqif10EditorPlugin.getPlugin()
				.getPreferenceStore();
		final String defaultPresentation = store.getString(dd.getSimpleName());
		System.out.println("Retrieving for: " + dd.getSimpleName());
		System.out.println("Constant: "
				+ PreferenceConstants.P_DEFAULT_PRESENTATION_STRING);

		if (defaultPresentation
				.equals(PreferenceConstants.P_DEFAULT_PRESENTATION_BUILD_IN)) {
			System.out.println("Not setting default presentation for "
					+ dd.getSimpleName() + ", as the user forced the default.");
		} else if (defaultPresentation == null
				|| defaultPresentation.equals("")) {
			// Install, no questions asked.
			store.setValue(dd.getSimpleName(), config.getCanonicalName());
			System.out.println("Installed as default for " + dd.getSimpleName()
					+ ": " + config.getSimpleName());
		} else {
			// There is already a default configuration, which we leave alone.
			// If we had time, we could get fancy and allow the user to replace
			// one with the other.
			System.out
					.println("Not replacing default for " + dd.getSimpleName()
							+ " with " + config.getSimpleName()
							+ ", as there is already a default: "
							+ defaultPresentation);
		}
	}

}
