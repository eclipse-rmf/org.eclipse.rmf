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
import org.eclipse.rmf.pror.reqif10.configuration.ConfigPackage;
import org.eclipse.rmf.pror.reqif10.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.pror.reqif10.configuration.ProrPresentationConfigurations;
import org.eclipse.rmf.pror.reqif10.configuration.ProrToolExtension;
import org.eclipse.rmf.pror.reqif10.presentation.id.IdConfiguration;
import org.eclipse.rmf.pror.reqif10.presentation.id.IdFactory;
import org.eclipse.rmf.pror.reqif10.presentation.service.AbstractPresentationService;
import org.eclipse.rmf.pror.reqif10.presentation.service.IProrCellRenderer;
import org.eclipse.rmf.pror.reqif10.presentation.service.PresentationService;
import org.eclipse.rmf.pror.reqif10.util.ConfigurationUtil;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.ReqIf;
import org.eclipse.rmf.reqif10.util.Reqif10Util;

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
	public void openReqif(final ReqIf rif) {

		ensureAllConfigsHaveAdapters(rif);

		// Make sure that IdConfig additions and removals are handled
		
		ProrPresentationConfigurations presentationConfigurations = getPresentationConfigurations(rif);
		if (presentationConfigurations == null) return;
		
		presentationConfigurations.eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				ensureAllConfigsHaveAdapters(rif);
			}
		});
	}

	private void ensureAllConfigsHaveAdapters(final ReqIf rif) {
		Set<IdConfiguration> configs = getConfigurationElements(rif);
		if (configs == null) return;

		// Process all existing IdConfigurations
		for (final IdConfiguration config : configs) {
			if (!adapters.containsKey(config)) {
				EContentAdapter adapter = buildAdapter(config);
				rif.eAdapters().add(adapter);
				adapters.put(config, adapter);
			}
		}
	}

	private EContentAdapter buildAdapter(final IdConfiguration config) {
		config.eAdapters().add(new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				if (ConfigPackage.Literals.PROR_PRESENTATION_CONFIGURATION__DATATYPE
						.equals(msg.getFeature())) {
					EContentAdapter adapter = adapters.get(config);
					if (adapter != null) {
						ReqIf rif = Reqif10Util.getReqIf(config);
						rif.eAdapters().remove(adapter);
						adapter = buildAdapter(config);
						rif.eAdapters().add(adapter);
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
	private Set<IdConfiguration> getConfigurationElements(ReqIf rif) {
		HashSet<IdConfiguration> idConfigs = new HashSet<IdConfiguration>();
		ProrPresentationConfigurations configsElement = getPresentationConfigurations(rif);
		if (configsElement == null) return null;
		EList<ProrPresentationConfiguration> configs = configsElement.getPresentationConfigurations();
		for (ProrPresentationConfiguration config : configs) {
			if (config instanceof IdConfiguration)
				idConfigs.add((IdConfiguration) config);
		}
		return idConfigs;
	}

	private ProrPresentationConfigurations getPresentationConfigurations(ReqIf rif) {
		ProrToolExtension uiExtension = ConfigurationUtil.getProrToolExtension(rif);
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
