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

public class AttributeValueXHTMLObjectsExist extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {
		Object target = ctx.getTarget();
		if (target == null) {
			return Status.OK_STATUS;
		}

		if (target instanceof AttributeValueXHTML) {

			String basePath = ((AttributeValueXHTML) target).eResource().getURI().trimSegments(1).toFileString();
			List<String> dataObjects = new LinkedList<String>();
			List<String> missingObjects = new LinkedList<String>();

			AttributeValueXHTML xhtmlVal = (AttributeValueXHTML) target;

			Document xhtmlDom = ReqIF10XhtmlUtil.getXhtmlDom(xhtmlVal.getTheValue());

			NodeList objectTags1 = xhtmlDom.getElementsByTagName("xhtml:object"); //$NON-NLS-1$
			NodeList objectTags2 = xhtmlDom.getElementsByTagName("reqif-xhtml:object"); //$NON-NLS-1$

			for (int i = 0; i < objectTags1.getLength(); i++) {
				Element item = (Element) objectTags1.item(i);
				if (!dataObjects.contains(item.getAttribute("data"))) {
					dataObjects.add(item.getAttribute("data")); //$NON-NLS-1$
				}
			}
			for (int i = 0; i < objectTags2.getLength(); i++) {
				Element item = (Element) objectTags2.item(i);
				if (!dataObjects.contains(item.getAttribute("data"))) {
					dataObjects.add(item.getAttribute("data")); //$NON-NLS-1$
				}
			}

			for (String objectPath : dataObjects) {
				String dataObjectUri = basePath + "/" + objectPath;
				if (!new File(dataObjectUri).exists()) {
					missingObjects.add(objectPath);
				}

			}

			if (missingObjects.size() > 0) {
				// AttributeValueXHTML references {0} that can not be found: {1}
				int count = missingObjects.size();
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < missingObjects.size(); i++) {
					if (i > 0) {
						sb.append(", ");
					}
					sb.append(missingObjects.get(i));
				}
				return ctx.createFailureStatus(count == 1 ? "a file" : count + " files", sb.toString());
			}

		}

		return Status.OK_STATUS;

	}

	protected boolean fileExists(String basePath, String objectPath) {
		String dataObjectUri = basePath + "/" + objectPath;
		return new File(dataObjectUri).exists();
	}
}
