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
import org.eclipse.rmf.pror.reqif10.presentation.service.AbstractPresentationService;
import org.eclipse.rmf.pror.reqif10.presentation.service.IProrCellRenderer;
import org.eclipse.rmf.pror.reqif10.presentation.service.PresentationService;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.util.ConfigurationUtil;
import org.eclipse.rmf.reqif10.util.Reqif10Switch;
import org.eclipse.rmf.reqif10.util.Reqif10Util;

public class HeadlinePresentationService extends AbstractPresentationService
		implements PresentationService {

	private HeadlineCellRenderer headlineCellRenderer;

	@Override
	public ProrPresentationConfiguration getConfigurationInstance() {
		return HeadlineFactory.eINSTANCE.createHeadlineConfiguration();
	}

	/**
	 * TODO the bulk of this should go into the constructor of
	 * {@link HeadlineCellRenderer}
	 */
	@Override
	public IProrCellRenderer getCellRenderer(AttributeValue av) {
		final AttributeValue attributeValue = av;
		if (headlineCellRenderer == null) {
			if (Reqif10Util.getDatatypeDefinition(attributeValue) == null)
				return null;
			headlineCellRenderer = new HeadlineCellRenderer(Reqif10Util
					.getDatatypeDefinition(av).getIdentifier());
			HeadlineConfiguration headlineConfiguration = (HeadlineConfiguration) ConfigurationUtil
					.getPresentationConfig(av, null);
			headlineCellRenderer.setFontSize(headlineConfiguration.getSize());

			// Register for notifications
			headlineConfiguration.eAdapters().add(new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					// React to size changes
					switch (msg.getFeatureID(HeadlineConfiguration.class)) {
					case HeadlinePackage.HEADLINE_CONFIGURATION__SIZE:
						headlineCellRenderer.setFontSize(msg.getNewIntValue());
						refreshUi(attributeValue);
						break;
					case HeadlinePackage.HEADLINE_CONFIGURATION__DATATYPE:
						if (msg.getNewValue() != null)
							headlineCellRenderer
									.setDatatypeId(((DatatypeDefinition) msg
											.getNewValue()).getIdentifier());
						refreshUi(attributeValue);
					default:
						break;
					}
				}
			});
		}
		return headlineCellRenderer;
	}

	@Override
	public boolean canEdit() {
		return true;
	}

	/**
	 * Called when the font size or {@link DatatypeDefinition} change.
	 * 
	 * @param av
	 */
	@SuppressWarnings("rawtypes")
	private void refreshUi(AttributeValue av) {
		if (Reqif10Util.getDatatypeDefinition(av) == null)
			return;
		Reqif10Switch visitor = new Reqif10Switch() {
			@Override
			public Object caseSpecHierarchy(SpecHierarchy object) {
				Notification n = new NotificationImpl(Notification.SET,
						object.getObject(), object.getObject());
				object.eNotify(new ViewerNotification(n));
				return super.caseSpecHierarchy(object);
			}
		};
		EList<Specification> roots = Reqif10Util
				.getReqIf(Reqif10Util.getDatatypeDefinition(av)).getCoreContent()
				.getSpecifications();
		for (Iterator i = EcoreUtil.getAllProperContents(roots, true); i
				.hasNext();) {
			visitor.doSwitch((EObject) i.next());
		}
	}

}
