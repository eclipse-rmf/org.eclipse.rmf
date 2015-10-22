package org.eclipse.rmf.reqif10.constraints;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.common.util.ReqIF10XhtmlUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class AttributeValueXHTMLObjectOnlyAllowedAttributes extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {
		Object target = ctx.getTarget();
		if (target == null) {
			return Status.OK_STATUS;
		}

		if (target instanceof AttributeValueXHTML) {
			AttributeValueXHTML xhtmlVal = (AttributeValueXHTML) target;

			Document xhtmlDom = ReqIF10XhtmlUtil.getXhtmlDom(xhtmlVal.getTheValue());

			NodeList objectTags1 = xhtmlDom.getElementsByTagName("xhtml:object"); //$NON-NLS-1$
			NodeList objectTags2 = xhtmlDom.getElementsByTagName("reqif-xhtml:object"); //$NON-NLS-1$

			List<Element> items = new LinkedList<Element>();

			for (int i = 0; i < objectTags1.getLength(); i++) {
				items.add((Element) objectTags1.item(i));
			}
			for (int i = 0; i < objectTags2.getLength(); i++) {
				items.add((Element) objectTags2.item(i));
			}

			List<String> messages = new LinkedList<String>();

			for (Element item : items) {
				NamedNodeMap attributes = item.getAttributes();
				List<String> forbiddenAttributes = new LinkedList<String>();
				for (int c = 0; c < attributes.getLength(); c++) {
					Node node = attributes.item(c);
					String attributeName = node.getNodeName();
					if (!("data".equals(attributeName) //$NON-NLS-1$
							|| "type".equals(attributeName) //$NON-NLS-1$
							|| "width".equals(attributeName) //$NON-NLS-1$
					|| "height".equals(attributeName))) { //$NON-NLS-1$
						forbiddenAttributes.add(attributeName);
					}
				}
				if (forbiddenAttributes.size() > 0) {
					String message = item.getNodeName() + " has attribute(s): ";
					for (int a = 0; a < forbiddenAttributes.size(); a++) {
						if (a > 0) {
							message += ", ";
						}
						message += forbiddenAttributes.get(a);
					}
					messages.add(message);
				}
			}

			if (messages.size() > 0) {
				int count = messages.size();
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < messages.size(); i++) {
					if (i > 0) {
						sb.append("; ");
					}
					sb.append(messages.get(i));
				}
				// AttributeValueXHTML contains {0} with illegal attributes: {1}
				return ctx.createFailureStatus(count == 1 ? "an object" : count + " objects", sb.toString());
			}

		}

		return Status.OK_STATUS;

	}

	protected boolean fileExists(String basePath, String objectPath) {
		String dataObjectUri = basePath + "/" + objectPath;
		return new File(dataObjectUri).exists();
	}
}
