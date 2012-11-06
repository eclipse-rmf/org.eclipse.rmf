/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor.presentation;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertySource;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;

/**
 * This ContentProvider is used for the Properties and provides the correct
 * Editors for the various types that we have.
 * 
 * @author jastram
 * 
 */
public class ProrAdapterFactoryContentProvider extends
		AdapterFactoryContentProvider {

	public ProrAdapterFactoryContentProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	protected IPropertySource createPropertySource(Object object,
			IItemPropertySource itemPropertySource) {

		return new PropertySource(object, itemPropertySource) {
			@Override
			protected IPropertyDescriptor createPropertyDescriptor(
					IItemPropertyDescriptor itemPropertyDescriptor) {

				return new PropertyDescriptor(object, itemPropertyDescriptor) {
					@Override
					public CellEditor createPropertyEditor(Composite composite) {
						Object feature = itemPropertyDescriptor
								.getFeature(object);

						CellEditor editor = ProrAdapterFactoryContentProvider.this
								.createPropertyEditor(feature, composite);
						return editor != null ? editor : super
								.createPropertyEditor(composite);
					}

				};
			}
		};
	}

	private CellEditor createPropertyEditor(Object object, Composite composite) {
		return null;
	}
}
