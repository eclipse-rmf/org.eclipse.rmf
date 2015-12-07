/*******************************************************************************
 * Copyright (c) 2015 Formal Mind GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ingo Weigelt (Formal Mind GmbH)
 *******************************************************************************/
package org.eclipse.rmf.reqif10.constraints;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.common.util.ReqIF10XhtmlUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class AttributeValueXHTMLObjectsExist extends ReqIFModelConstraint {

	@Override
	public IStatus doValidate(IValidationContext ctx) {
		Object target = ctx.getTarget();
		if (target == null) {
			return Status.OK_STATUS;
		}

		if (target instanceof AttributeValueXHTML) {

			List<String> dataObjects = new LinkedList<String>();
			List<String> missingObjects = new LinkedList<String>();

			List<String> nonFileReferences = new LinkedList<String>();

			AttributeValueXHTML xhtmlVal = (AttributeValueXHTML) target;

			if (xhtmlVal.getTheValue() == null) {
				return ConstraintStatus.createStatus(ctx, null, IStatus.ERROR, Integer.MAX_VALUE,
						"Can not validate AttributeValueXHTML because the Value is null.");
			}

			Document xhtmlDom = ReqIF10XhtmlUtil.getXhtmlDom(xhtmlVal.getTheValue());

			NodeList objectTags1 = xhtmlDom.getElementsByTagName("xhtml:object"); //$NON-NLS-1$
			NodeList objectTags2 = xhtmlDom.getElementsByTagName("reqif-xhtml:object"); //$NON-NLS-1$

			for (int i = 0; i < objectTags1.getLength(); i++) {
				Element item = (Element) objectTags1.item(i);
				if (!dataObjects.contains(item.getAttribute("data"))) { //$NON-NLS-1$
					dataObjects.add(item.getAttribute("data")); //$NON-NLS-1$
				}
			}
			for (int i = 0; i < objectTags2.getLength(); i++) {
				Element item = (Element) objectTags2.item(i);
				if (!dataObjects.contains(item.getAttribute("data"))) { //$NON-NLS-1$
					dataObjects.add(item.getAttribute("data")); //$NON-NLS-1$
				}
			}

			URI baseUri = ((AttributeValueXHTML) target).eResource().getURI();

			for (String objectPath : dataObjects) {
				URI objectUri = URI.createURI(objectPath);
				URI resolvedUri = objectUri.resolve(baseUri);

				if (resolvedUri.isFile()) {
					if (!new File(resolvedUri.toFileString()).exists()) {
						missingObjects.add(objectPath);
					}
				} else if (resolvedUri.isPlatform()) {
					if (!URIConverter.INSTANCE.exists(resolvedUri, null)) {
						missingObjects.add(objectPath);
					}
				} else {
					nonFileReferences.add(objectPath);
				}
			}

			String nonFileURIWarning = null;
			if (nonFileReferences.size() > 0) {
				StringBuilder sb = new StringBuilder();
				sb.append("WARNING the following Non-File-URIs were not evaluated: ");
				for (int i = 0; i < nonFileReferences.size(); i++) {
					if (i > 0) {
						sb.append(", "); //$NON-NLS-1$
					}
					sb.append(nonFileReferences.get(i));
				}
				nonFileURIWarning = sb.toString();
			}

			if (missingObjects.size() > 0) {
				// AttributeValueXHTML references {0} that can not be found: {1}
				int count = missingObjects.size();
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < missingObjects.size(); i++) {
					if (i > 0) {
						sb.append(", "); //$NON-NLS-1$
					}
					sb.append(missingObjects.get(i));
				}
				return ctx.createFailureStatus(count == 1 ? "a file" : count + " files", sb.toString()
						+ (nonFileURIWarning != null ? "; " + nonFileURIWarning : ""));
			}

			if (nonFileURIWarning != null) {
				String id = ctx.getCurrentConstraintId().replace("org.eclipse.rmf.reqif10.constraints.", ""); //$NON-NLS-1$
				nonFileURIWarning = "[" + id + "] " + nonFileURIWarning;
				return ConstraintStatus.createStatus(ctx, null, IStatus.WARNING, 406, nonFileURIWarning, ctx.getTarget());
			}

		}

		return Status.OK_STATUS;

	}
}
