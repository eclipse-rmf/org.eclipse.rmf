/*******************************************************************************
 * Copyright (c) 2011 itemis GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nirmal Sasidharan - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.rif12.xsd.util;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl;
import org.w3c.dom.Attr;
import org.w3c.dom.Element;

public class RifXMLSave extends XMLSaveImpl {

	public RifXMLSave(XMLHelper helper) {
		super(helper);
	}

	@Override
	protected void saveEObjectSingle(EObject o, EStructuralFeature f) {
		StringBuffer buffer = new StringBuffer();

		EObject value = (EObject) helper.getValue(o, f);
		if (value != null) {
			String id = helper.getHREF(value);
			if (id != null) {
				id = convertURI(id);
				buffer.setLength(0);
				// if (!id.startsWith("#"))
				// {
				if (!o.eClass().getEPackage().getNsURI()
						.equals(f.getEType().getEPackage().getNsURI())) {

					EClass eClass = value.eClass();
					EClass expectedType = (EClass) f.getEType();
					if (saveTypeInfo ? xmlTypeInfo.shouldSaveType(eClass,
							expectedType, f)
							: eClass != expectedType
									&& (expectedType.isAbstract() || f
											.getEGenericType()
											.getETypeParameter() != null)) {
						buffer.append(helper.getQName(eClass));
						buffer.append(' ');
					}
				}
				// }
				buffer.append(id);
				if (!toDOM) {
					String name = helper.getQName(f);
					doc.startAttribute(name);
					doc.addAttributeContent(buffer.toString());
					doc.endAttribute();
				} else {
					helper.populateNameInfo(nameInfo, f);
					Attr attr = document.createAttributeNS(
							nameInfo.getNamespaceURI(),
							nameInfo.getQualifiedName());
					attr.setNodeValue(buffer.toString());
					((Element) currentNode).setAttributeNodeNS(attr);
					handler.recordValues(attr, o, f, value);
				}
			}
		}
	}

}
