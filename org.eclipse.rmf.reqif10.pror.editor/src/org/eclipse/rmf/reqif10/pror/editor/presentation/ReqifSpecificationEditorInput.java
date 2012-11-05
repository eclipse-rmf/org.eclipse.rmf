/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor.presentation;

import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPersistableElement;

/**
 * @author jastram
 *
 */
public class ReqifSpecificationEditorInput implements IEditorInput {


	private final Specification spec;
	private final Reqif10Editor rifEditor;

	public ReqifSpecificationEditorInput(Reqif10Editor rifEditor,
			Specification spec) {
		this.rifEditor = rifEditor;
		this.spec = spec;
	}

	public Reqif10Editor getReqifEditor() {
		return rifEditor;
	}

	public Specification getSpec() {
		return spec;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class adapter) {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IEditorInput#exists()
	 */
	public boolean exists() {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IEditorInput#getImageDescriptor()
	 */
	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IEditorInput#getName()
	 */
	public String getName() {
		ItemProviderAdapter ip = ProrUtil.getItemProvider(rifEditor.getAdapterFactory(), spec);
		return ip.getText(spec);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IEditorInput#getPersistable()
	 */
	public IPersistableElement getPersistable() {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IEditorInput#getToolTipText()
	 */
	public String getToolTipText() {
		if (spec != null && spec.eResource() != null) {
			return spec.eResource().getURI() + "";			
		}
		return null;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ReqifSpecificationEditorInput) {
			ReqifSpecificationEditorInput that = (ReqifSpecificationEditorInput) obj;
			return spec.equals(that.spec);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return spec.hashCode();
	}

}

