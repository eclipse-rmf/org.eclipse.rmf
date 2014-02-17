/*******************************************************************************
 * Copyright (c) 2013 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     itemis AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.common.util;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.rmf.reqif10.util.ReqIF10AdapterFactory;

public class ReqIF10XHtmlContentAdapterFactory extends ReqIF10AdapterFactory {

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ReqIF10XHtmlContentAdapterFactory() {
		supportedTypes.add(ReqIF10XHtmlContentAdapter.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.rmf.reqif10.XhtmlContent} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 */
	protected ReqIF10XHtmlContentAdapter xhtmlContentAdapter;

	/**
	 * This creates an adapter for a {@link org.eclipse.rmf.reqif10.XhtmlContent}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 */
	@Override
	public Adapter createXhtmlContentAdapter() {
		return new ReqIF10XHtmlContentAdapter();
	}

	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

}
