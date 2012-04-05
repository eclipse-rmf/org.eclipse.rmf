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
package org.eclipse.rmf.pror.reqif10.presentation.ui;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.pror.reqif10.configuration.ConfigurationPackage;
import org.eclipse.rmf.pror.reqif10.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.pror.reqif10.configuration.ProrPresentationConfigurations;
import org.eclipse.rmf.pror.reqif10.configuration.ProrToolExtension;
import org.eclipse.rmf.pror.reqif10.editor.presentation.service.AbstractPresentationService;
import org.eclipse.rmf.pror.reqif10.editor.presentation.service.IProrCellRenderer;
import org.eclipse.rmf.pror.reqif10.editor.presentation.service.PresentationService;
import org.eclipse.rmf.pror.reqif10.presentation.id.IdConfiguration;
import org.eclipse.rmf.pror.reqif10.presentation.id.IdFactory;
import org.eclipse.rmf.pror.reqif10.util.ConfigurationUtil;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.util.ReqIF10Util;

public class IDPresentationService extends AbstractPresentationService implements PresentationService {

	private final IProrCellRenderer idLabelCellRenderer;
	private final HashMap<IdConfiguration, EContentAdapter> adapters = new HashMap<IdConfiguration, EContentAdapter>();

	public IDPresentationService() {
		idLabelCellRenderer = new IdLabelCellRenderer();
	}
	/**
	 * Upon opening, attaches a Listener that sets the ID if the Datatype
	 * matches.
	 */
	@Override
	public void openReqif(final ReqIF reqif, final EditingDomain domain) {

		ensureAllConfigsHaveAdapters(reqif, domain);

		// Make sure that IdConfig additions and removals are handled
		
		ProrPresentationConfigurations presentationConfigurations = getPresentationConfigurations(reqif, domain);
		if (presentationConfigurations == null) return;
		
		presentationConfigurations.eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				ensureAllConfigsHaveAdapters(reqif, domain);
			}
		});
	}

	private void ensureAllConfigsHaveAdapters(final ReqIF reqif, EditingDomain domain) {
		Set<IdConfiguration> configs = getConfigurationElements(reqif, domain);
		if (configs == null) return;

		// Process all existing IdConfigurations
		for (final IdConfiguration config : configs) {
			if (!adapters.containsKey(config)) {
				EContentAdapter adapter = buildAdapter(config);
				reqif.eAdapters().add(adapter);
				adapters.put(config, adapter);
			}
		}
	}

	private EContentAdapter buildAdapter(final IdConfiguration config) {
		config.eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				if (ConfigurationPackage.Literals.PROR_PRESENTATION_CONFIGURATION__DATATYPE
						.equals(msg.getFeature())) {
					EContentAdapter adapter = adapters.get(config);
					if (adapter != null) {
						ReqIF reqif = ReqIF10Util.getReqIF(config);
						reqif.eAdapters().remove(adapter);
						adapter = buildAdapter(config);
						reqif.eAdapters().add(adapter);
						adapters.put(config, adapter);
					}
				}
			}
		});

		EContentAdapter adapter = new EContentAdapter() {
			@Override
			public void setTarget(Notifier target) {
				super.setTarget(target);
				if (target instanceof AttributeValueString) {
					AttributeValueString value = (AttributeValueString) target;
					if (value.getDefinition() != null
							&& value.getDefinition().getType() != null
							&& value.getDefinition().getType()
									.equals(config.getDatatype())) {
						if (value.getTheValue() == null
								|| value.getTheValue().length() == 0) {
							int newCount = config.getCount() + 1;
							value.setTheValue(config.getPrefix() + newCount);
							config.setCount(newCount);
						}
					}
				}
			}
		};
		return adapter;
	}

	/**
	 * Get the {@link IdConfiguration}s for the given ReqIF
	 */
	private Set<IdConfiguration> getConfigurationElements(ReqIF reqif, EditingDomain domain) {
		HashSet<IdConfiguration> idConfigs = new HashSet<IdConfiguration>();
		ProrPresentationConfigurations configsElement = getPresentationConfigurations(reqif, domain);
		if (configsElement == null) return null;
		EList<ProrPresentationConfiguration> configs = configsElement.getPresentationConfigurations();
		for (ProrPresentationConfiguration config : configs) {
			if (config instanceof IdConfiguration)
				idConfigs.add((IdConfiguration) config);
		}
		return idConfigs;
	}

	private ProrPresentationConfigurations getPresentationConfigurations(ReqIF reqif, EditingDomain domain) {
		ProrToolExtension uiExtension = ConfigurationUtil.getProrToolExtension(reqif, domain);
		ProrPresentationConfigurations configs = uiExtension
				.getPresentationConfigurations();
		return configs;
	}

	@Override
	public ProrPresentationConfiguration getConfigurationInstance() {
		return IdFactory.eINSTANCE.createIdConfiguration();
	}

	@Override
	public IProrCellRenderer getCellRenderer(AttributeValue av) {
		return idLabelCellRenderer;
	}

}
