/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 *
 */
package org.eclipse.rmf.internal.serialization;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

public class ReqIFXMLHelperImpl extends XMLHelperImpl implements XMLHelper {

	public ReqIFXMLHelperImpl(XMLResource resource) {
		super(resource);
	}

	// TODO: how to avoid writing xsi namespace

	/**
	 * TODO: how to always make use of IDREF references?
	 */

	@Override
	public String getHREF(EObject obj) {
		if (obj.eIsProxy()) {
			URI uri = ((InternalEObject) obj).eProxyURI();
			return uri.fragment();
		} else {
			return getIDREF(obj);
		}

	}

	@Override
	public String convertToString(EFactory factory, EDataType dataType, Object value) {
		if (value instanceof XMLGregorianCalendar) {
			return XMLTypeFactory.eINSTANCE.convertDateTime((XMLGregorianCalendar) value);
		} else {
			return super.convertToString(factory, dataType, value);
		}
	}

	@Override
	public String getQName(EStructuralFeature feature) {
		// TODO Auto-generated method stub
		return super.getQName(feature);
	}

	@Override
	public String getQName(EClass c) {
		// TODO Auto-generated method stub
		return super.getQName(c);
	}

	@Override
	public String getQName(EDataType c) {
		// TODO Auto-generated method stub
		return super.getQName(c);
	}

}
