/*******************************************************************************
 * Copyright (c) 2014 Formal Mind GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.search.filter.ui;

import org.eclipse.rmf.reqif10.search.filter.IFilter;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * Represents the actual {@link Control} that holds the settings for the contained filter.
 * @author jastram
 */
public abstract class FilterControl extends Composite {

	public FilterControl(Composite parent, int style) {
		super(parent, style);
	}

	/**
	 * Constructs a Filter object from the current configuration of the Control.
	 * @return the {@link IFilter} object.
	 */
	abstract public IFilter getFilter();

}
