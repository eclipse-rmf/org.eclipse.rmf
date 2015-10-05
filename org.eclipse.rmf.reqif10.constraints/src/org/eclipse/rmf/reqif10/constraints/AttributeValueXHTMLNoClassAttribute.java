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
import org.w3c.dom.NodeList;

public class AttributeValueXHTMLNoClassAttribute extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {
		Object target = ctx.getTarget();
		if (target == null) {
			return Status.OK_STATUS;
		}

		if (target instanceof AttributeValueXHTML) {
			AttributeValueXHTML xhtmlVal = (AttributeValueXHTML) target;

			Document xhtmlDom = ReqIF10XhtmlUtil.getXhtmlDom(xhtmlVal.getTheValue());

			NodeList objectTags1 = xhtmlDom.getElementsByTagName("*");

			List<Element> elementsWithClassAttribute = new LinkedList<Element>();

			for (int i = 0; i < objectTags1.getLength(); i++) {
				Element item = (Element) objectTags1.item(i);

				String classAttribute = item.getAttribute("class");
				if (classAttribute != null && classAttribute != "") { //$NON-NLS-1$
					elementsWithClassAttribute.add(item);
				}
			}

			if (elementsWithClassAttribute.size() > 0) {
				// AttributeValueXHTML references {0} that can not be found: {1}
				int count = elementsWithClassAttribute.size();
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < elementsWithClassAttribute.size(); i++) {
					if (i > 0) {
						sb.append(", ");
					}
					sb.append(elementsWithClassAttribute.get(i).getNodeName());
				}
				return ctx.createFailureStatus(count == 1 ? "an element" : count + " elements", sb.toString());
			}

		}

		return Status.OK_STATUS;

	}

	protected boolean fileExists(String basePath, String objectPath) {
		String dataObjectUri = basePath + "/" + objectPath;
		return new File(dataObjectUri).exists();
	}
}
