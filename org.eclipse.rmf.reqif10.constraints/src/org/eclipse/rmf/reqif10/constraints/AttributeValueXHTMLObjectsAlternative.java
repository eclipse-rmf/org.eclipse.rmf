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

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.common.util.ReqIF10XhtmlUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class AttributeValueXHTMLObjectsAlternative extends ReqIFModelConstraint {

	@Override
	public IStatus doValidate(IValidationContext ctx) {
		Object target = ctx.getTarget();
		if (target == null) {
			return Status.OK_STATUS;
		}

		if (target instanceof AttributeValueXHTML) {

			List<Element> objectsWithoutAlternatives = new LinkedList<Element>();

			AttributeValueXHTML xhtmlVal = (AttributeValueXHTML) target;

			if (xhtmlVal.getTheValue() == null) {
				return ConstraintStatus.createStatus(ctx, null, IStatus.ERROR, Integer.MAX_VALUE,
						"Can not validate AttributeValueXHTML because the Value is null.");
			}

			Document xhtmlDom = ReqIF10XhtmlUtil.getXhtmlDom(xhtmlVal.getTheValue());

			NodeList objectTags1 = xhtmlDom.getElementsByTagName("xhtml:object"); //$NON-NLS-1$
			NodeList objectTags2 = xhtmlDom.getElementsByTagName("reqif-xhtml:object"); //$NON-NLS-1$

			List<Element> items = new LinkedList<Element>();

			for (int i = 0; i < objectTags1.getLength(); i++) {
				Element item = (Element) objectTags1.item(i);
				items.add(item);
			}
			for (int i = 0; i < objectTags2.getLength(); i++) {
				Element item = (Element) objectTags2.item(i);
				items.add(item);
			}

			for (Element item : items) {
				String type = item.getAttribute("type");
				if (!type.equals("image/png")) {
					if (!hasAlternatives(item)) {
						objectsWithoutAlternatives.add(item);
					}
				}
			}

			if (objectsWithoutAlternatives.size() > 0) {
				return ctx.createFailureStatus();
				// //
				// int count = objectsWithoutAlternatives.size();
				// StringBuilder sb = new StringBuilder();
				// for (int i = 0; i < objectsWithoutAlternatives.size(); i++) {
				// if (i > 0) {
				// sb.append(", ");
				// }
				// sb.append(objectsWithoutAlternatives.get(i));
				// }
				// //return ctx.createFailureStatus(count == 1 ? "an object" : count + " objects", sb.toString());
			}

		}

		return Status.OK_STATUS;

	}

	/**
	 *
	 * @param item - an object that is not a image/png
	 * @return false if item does not contain an item of type image/png or alternative does not contain a text
	 */
	protected boolean hasAlternatives(Element item) {
		NodeList objectTags1 = item.getElementsByTagName("xhtml:object"); //$NON-NLS-1$
		NodeList objectTags2 = item.getElementsByTagName("reqif-xhtml:object"); //$NON-NLS-1$

		if (objectTags1.getLength() == 0 && objectTags2.getLength() == 0) {
			return false;
		}

		for (int i = 0; i < objectTags1.getLength(); i++) {
			Element subItem = (Element) objectTags1.item(i);
			String type = subItem.getAttribute("type"); //$NON-NLS-1$
			if (type.equals("image/png") && hasText(subItem)) { //$NON-NLS-1$
				return true;
			}
		}

		return false;
	}

	private boolean hasText(Element item) {
		NodeList childNodes = item.getChildNodes();
		for (int c = 0; c < childNodes.getLength(); c++) {
			Node childItem = childNodes.item(c);
			if (childItem.getNodeType() == Node.TEXT_NODE && childItem.getTextContent().length() > 0) {
				return true;
			}
		}
		return false;
	}

}
