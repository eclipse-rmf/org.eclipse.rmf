package org.eclipse.rmf.reqif10.constraints;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.common.util.ReqIF10XhtmlUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class AttributeValueXHTMLObjectsIsNotFile extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {
		Object target = ctx.getTarget();
		if (target == null) {
			return Status.OK_STATUS;
		}

		if (target instanceof AttributeValueXHTML) {

			// String basePath = ((AttributeValueXHTML) target).eResource().getURI().trimSegments(1).toFileString();
			List<String> dataObjects = new LinkedList<String>();

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

				if (!resolvedUri.isFile()) {
					nonFileReferences.add(objectPath);
				}

			}

			if (nonFileReferences.size() > 0) {
				int count = nonFileReferences.size();
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < nonFileReferences.size(); i++) {
					if (i > 0) {
						sb.append(", ");
					}
					sb.append(nonFileReferences.get(i));
				}
				return ctx.createFailureStatus(sb.toString());
			}

		}

		return Status.OK_STATUS;

	}
}
