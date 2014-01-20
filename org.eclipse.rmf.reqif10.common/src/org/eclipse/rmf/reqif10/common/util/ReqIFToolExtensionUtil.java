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
import java.util.List;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIFToolExtension;

/**
 * {@link ReqIFToolExtension} in ReqIF models are special, as tools may insert their own models. This class contains a
 * number of static helper methods that helps dealing with them.
 */
public class ReqIFToolExtensionUtil {

	public static List<EObject> getToolExtensionsByNsURI(ReqIF reqIF, String nsURI) {
		final List<ReqIFToolExtension> reqIFToolExtensions = reqIF.getToolExtensions();
		List<EObject> toolExtensions = new ArrayList<EObject>();
		for (ReqIFToolExtension reqIFToolExtension : reqIFToolExtensions) {
			for (EObject extension : reqIFToolExtension.getExtensions()) {
				if (extension.eClass().getEPackage().getNsURI().equals(nsURI)) {
					toolExtensions.add(extension);
				}
			}
		}
		return toolExtensions;
	}

	@SuppressWarnings("unchecked")
	public static <T> List<T> getToolExtensionsByType(ReqIF reqIF, EClassifier type) {
		final List<ReqIFToolExtension> reqIFToolExtensions = reqIF.getToolExtensions();
		List<T> toolExtensions = new ArrayList<T>();
		for (ReqIFToolExtension reqIFToolExtension : reqIFToolExtensions) {
			for (EObject extension : reqIFToolExtension.getExtensions()) {
				if (type.isInstance(extension)) {
					toolExtensions.add((T) extension);
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
			reqIFToolExtension.getExtensions().add(toolExtension);
		}
	}

	public static Command getAddToolExtensionCommand(final ReqIF reqIF, final EObject toolExtension) {
		Command command = new AbstractCommand() {
			ReqIFToolExtension reqIFToolExtension;

			public void execute() {
				reqIFToolExtension = ReqIF10Factory.eINSTANCE.createReqIFToolExtension();
				reqIF.getToolExtensions().add(reqIFToolExtension);
				reqIFToolExtension.getExtensions().add(toolExtension);
			}

			public void redo() {
				reqIF.getToolExtensions().add(reqIFToolExtension);
				reqIFToolExtension.getExtensions().add(toolExtension);
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
				return true;
			}

		};

		return command;
	}
}
