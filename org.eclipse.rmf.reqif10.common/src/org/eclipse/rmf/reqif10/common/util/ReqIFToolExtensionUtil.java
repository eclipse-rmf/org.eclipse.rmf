/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 *     Lukas Ladenberger - ProR GUI     
 ******************************************************************************/
package org.eclipse.rmf.reqif10.common.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIFToolExtension;

public class ReqIFToolExtensionUtil {
	public static List<ReqIFToolExtension> getReqIFToolExtensions(ReqIF reqIF) {
		final List<ReqIFToolExtension> reqIFToolExtensions;
		if (null != reqIF) {
			reqIFToolExtensions = reqIF.getToolExtensions();
		} else {
			reqIFToolExtensions = new ArrayList<ReqIFToolExtension>();
		}
		return reqIFToolExtensions;
	}

	public static List<EObject> getToolExtensionsByNsURI(ReqIF reqIF, String nsURI) {
		final List<ReqIFToolExtension> reqIFToolExtensions = getReqIFToolExtensions(reqIF);
		List<EObject> toolExtensions = new ArrayList<EObject>();
		for (ReqIFToolExtension reqIFToolExtension : reqIFToolExtensions) {
			FeatureMap featureMap = reqIFToolExtension.getAny();
			Iterator<Object> iterator = featureMap.valueListIterator();
			while (iterator.hasNext()) {
				Object value = iterator.next();
				if (null != value && value instanceof EObject) {
					EObject eObject = (EObject) value;
					if (eObject.eClass().getEPackage().getNsURI().equals(nsURI)) {
						toolExtensions.add(eObject);
					}
				}
			}
		}
		return toolExtensions;
	}

	@SuppressWarnings("unchecked")
	public static <T> List<T> getToolExtensionsByType(ReqIF reqIF, EClassifier type) {
		final List<ReqIFToolExtension> reqIFToolExtensions = getReqIFToolExtensions(reqIF);
		List<T> toolExtensions = new ArrayList<T>();
		for (ReqIFToolExtension reqIFToolExtension : reqIFToolExtensions) {
			FeatureMap featureMap = reqIFToolExtension.getAny();
			Iterator<Object> iterator = featureMap.valueListIterator();
			while (iterator.hasNext()) {
				Object value = iterator.next();
				if (null != value && type.isInstance(value)) {
					toolExtensions.add((T) value);
				}
			}
		}
		return toolExtensions;
	}

	// TODO: add exception in case the anchor is not part of an ReqIF model
	public static void addToolExtension(ReqIF reqIF, EObject toolExtension) {
		if (null != reqIF && null != toolExtension) {
			ReqIFToolExtension reqIFToolExtension = ReqIF10Factory.eINSTANCE.createReqIFToolExtension();
			reqIF.getToolExtensions().add(reqIFToolExtension);

			// add as any wildcard
			ExtendedMetaData extendedMetaData = new BasicExtendedMetaData();
			EStructuralFeature toolExtensionFeature = extendedMetaData.demandFeature(toolExtension.eClass().getEPackage().getNsURI(), "root", true, //$NON-NLS-1$
					true);
			reqIFToolExtension.eSet(toolExtensionFeature, toolExtension);
		}
	}

	public static Command getAddToolExtensionCommand(final ReqIF reqIF, final EObject toolExtension) {
		Command command = new AbstractCommand() {
			ReqIFToolExtension reqIFToolExtension;
			EStructuralFeature toolExtensionFeature;

			public void execute() {
				reqIFToolExtension = ReqIF10Factory.eINSTANCE.createReqIFToolExtension();
				reqIF.getToolExtensions().add(reqIFToolExtension);
				reqIFToolExtension.eSet(toolExtensionFeature, toolExtension);
			}

			public void redo() {
				reqIF.getToolExtensions().add(reqIFToolExtension);
				reqIFToolExtension.eSet(toolExtensionFeature, toolExtension);
			}

			@Override
			public void undo() {
				reqIF.getToolExtensions().remove(reqIFToolExtension);
			}

			@Override
			public Collection<?> getAffectedObjects() {
				return Arrays.asList(reqIFToolExtension, toolExtension);
			}

			@Override
			protected boolean prepare() {
				final boolean prepare;
				if (null != reqIF && null != toolExtension) {
					ExtendedMetaData extendedMetaData = new BasicExtendedMetaData();
					toolExtensionFeature = extendedMetaData.demandFeature(toolExtension.eClass().getEPackage().getNsURI(), "root", true, true); //$NON-NLS-1$
					prepare = true;
				} else {
					prepare = false;
				}
				return prepare;
			}

		};

		return command;
	}
}
