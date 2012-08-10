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
package org.eclipse.rmf.pror.presentation.headline.ui;

import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.rmf.pror.presentation.headline.HeadlineConfiguration;
import org.eclipse.rmf.pror.presentation.headline.HeadlineFactory;
import org.eclipse.rmf.pror.presentation.headline.HeadlinePackage;
import org.eclipse.rmf.pror.reqif10.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.pror.reqif10.editor.presentation.service.AbstractPresentationService;
import org.eclipse.rmf.pror.reqif10.editor.presentation.service.IProrCellRenderer;
import org.eclipse.rmf.pror.reqif10.util.ConfigurationUtil;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.util.ReqIF10Switch;

public class HeadlinePresentationService extends AbstractPresentationService {

	private HeadlineCellRenderer headlineCellRenderer;

	private HashMap<HeadlineConfiguration, HeadlineCellRenderer> renderers = new HashMap<HeadlineConfiguration, HeadlineCellRenderer>();

	@Override
	public ProrPresentationConfiguration getConfigurationInstance() {
		return HeadlineFactory.eINSTANCE.createHeadlineConfiguration();
	}

	/**
	 * Lazily creates the renderer and tracks them on a per-configuration basis.
	 */
	@Override
	public IProrCellRenderer getCellRenderer(final AttributeValue av) {

		HeadlineConfiguration config = (HeadlineConfiguration) ConfigurationUtil
				.getPresentationConfiguration(av);

		HeadlineCellRenderer renderer = renderers.get(config);
		if (renderer == null) {
			renderer = createRenderer(config);
			renderers.put(config, renderer);
		}
		return renderer;
	}


	private HeadlineCellRenderer createRenderer(
			final HeadlineConfiguration config) {
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

	@Override
	public boolean canEdit() {
		return true;
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

}
