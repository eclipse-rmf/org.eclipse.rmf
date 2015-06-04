/**
 * <copyright>
 *
 * Copyright (c) 2008-2013 See4sys, itemis and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     See4sys - Initial API and implementation
 *     itemis - [406194] Enable title and descriptions of model project and file creation wizards to be calculated automatically
 *
 * </copyright>
 */
package org.eclipse.rmf.reqif.ide.metamodel;

import org.eclipse.core.runtime.Assert;
import org.eclipse.sphinx.emf.metamodel.AbstractMetaModelDescriptor;
import org.eclipse.sphinx.emf.metamodel.MetaModelVersionData;

/**
 * Version-independent descriptor for all ReqIF metamodels and base type of all version-specific ReqIF
 * metamodel descriptors.
 */
public class ReqIFMMDescriptor extends AbstractMetaModelDescriptor implements Comparable<ReqIFMMDescriptor> {

	/**
	 * The base name of all ReqIF metamodel versions.
	 */
	public static final String BASE_NAME = "ReqIF"; //$NON-NLS-1$

	/**
	 * The base namespace of all ReqIF metamodel versions.
	 */
	public static final String BASE_NAMESPACE = "http://www.omg.org/spec/ReqIF/20110401/reqif.xsd"; //$NON-NLS-1$

	/**
	 * The id of the base content type for all version-specific ReqIF XML file content types.
	 */
	public static final String XML_BASE_CONTENT_TYPE_ID = "org.eclipse.rmf.reqif.ide.reqIFXMLFile"; //$NON-NLS-1$

	/**
	 * Singleton instance.
	 */
	public static final ReqIFMMDescriptor INSTANCE = new ReqIFMMDescriptor();

	private static final String ID = "org.eclipse.rmf.reqif"; //$NON-NLS-1$

	/**
	 * Private default constructor for singleton pattern.
	 */
	private ReqIFMMDescriptor() {
		super(ID, BASE_NAMESPACE, BASE_NAME);
	}
	
	
	protected ReqIFMMDescriptor(String identifier, String namespace, String name) {
		super(identifier, namespace, name);
	}


	/*
	 * @see org.eclipse.sphinx.emf.metamodel.AbstractMetaModelDescriptor#getDefaultContentTypeId()
	 */
	@Override
	public String getDefaultContentTypeId() {
		return XML_BASE_CONTENT_TYPE_ID;
	}

	/*
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(ReqIFMMDescriptor otherMMDescriptor) {
		Assert.isNotNull(otherMMDescriptor);
		// TODO: replace by algorithm that fits to RMF
		int result = 0;
		int revision = parseInt(getNsPostfix());
		int otherRevision = parseInt(otherMMDescriptor.getNsPostfix());
		result = revision < otherRevision ? -1 : revision > otherRevision ? +1 : 0;
		return result;
	}

	protected int parseInt(String nsPostfix) {
		Assert.isNotNull(nsPostfix);
		int result = 0;
		String[] split = nsPostfix.split("\\."); //$NON-NLS-1$
		StringBuffer buffer = new StringBuffer();
		for (String element : split) {
			buffer.append(element);
		}
		try {
			result = Integer.parseInt(buffer.toString());
		} catch (NumberFormatException nfe) {
			// Fail silent
		}
		return result;
	}
}
